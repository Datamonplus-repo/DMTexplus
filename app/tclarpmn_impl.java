package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclarpmn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"FORPROD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9766ForProC = httpContext.GetPar( "ForProC") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaforprod1751280( A396EmprCod, A9766ForProC) ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.GetPar( "ForSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.GetPar( "ForColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A9766ForProC = httpContext.GetPar( "ForProC") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECARGOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtForKgsMn_Internalname ;
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
      nRC_GXsfl_95 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_95"))) ;
      nGXsfl_95_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_95_idx"))) ;
      sGXsfl_95_idx = httpContext.GetPar( "sGXsfl_95_idx") ;
      A1075ForUltLr = (short)(GXutil.lval( httpContext.GetPar( "ForUltLr"))) ;
      n1075ForUltLr = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tclarpmn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclarpmn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclarpmn_impl.class ));
   }

   public tclarpmn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLARPMn.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSerDsc_Internalname, GXutil.rtrim( A5742ForSerDsc), GXutil.rtrim( localUtil.format( A5742ForSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtForSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripción Tipo Colorante", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColDsc_Internalname, GXutil.rtrim( A832TipColDsc), GXutil.rtrim( localUtil.format( A832TipColDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipColDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProC_Internalname, GXutil.rtrim( A9766ForProC), GXutil.rtrim( localUtil.format( A9766ForProC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProC_Jsonclick, 0, "", "", "", "", "", 1, edtForProC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProD_Internalname, GXutil.rtrim( A9767ForProD), GXutil.rtrim( localUtil.format( A9767ForProD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProD_Jsonclick, 0, "", "", "", "", "", 1, edtForProD_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Ultima Linea Recargo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForUltLr_Internalname, GXutil.ltrim( localUtil.ntoc( A1075ForUltLr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForUltLr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1075ForUltLr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1075ForUltLr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForUltLr_Jsonclick, 0, "", "", "", "", "", 1, edtForUltLr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Kilos MINIMOS", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForKgsMn_Internalname, GXutil.ltrim( localUtil.ntoc( A10136ForKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForKgsMn_Enabled!=0) ? localUtil.format( A10136ForKgsMn, "ZZZZZ9.99") : localUtil.format( A10136ForKgsMn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForKgsMn_Jsonclick, 0, "", "", "", "", "", 1, edtForKgsMn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Control Minimos", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCtrlMn_Internalname, GXutil.ltrim( localUtil.ntoc( A10178CtrlMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCtrlMn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10178CtrlMn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10178CtrlMn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCtrlMn_Jsonclick, 0, "", "", "", "", "", 1, edtCtrlMn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLARPMn.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol95( ) ;
      nGXsfl_95_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1376 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1376 = (short)(1) ;
            scanStart1751376( ) ;
            while ( RcdFound1376 != 0 )
            {
               init_level_properties1376( ) ;
               getByPrimaryKey1751376( ) ;
               addRow1751376( ) ;
               scanNext1751376( ) ;
            }
            scanEnd1751376( ) ;
            nBlankRcdCount1376 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1075ForUltLr = A1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         B10178CtrlMn = A10178CtrlMn ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         standaloneNotModal1751376( ) ;
         standaloneModal1751376( ) ;
         sMode1376 = Gx_mode ;
         while ( nGXsfl_95_idx < nRC_GXsfl_95 )
         {
            bGXsfl_95_Refreshing = true ;
            readRow1751376( ) ;
            edtavnRcdDeleted_1376_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1376_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1376_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1376_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtForLinN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORLINN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForLinN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLinN_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtForVIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORVINI_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForVIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForVIni_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtForVFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORVFIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForVFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForVFin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtForPreRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPREREC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreRec_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtForPreRMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRERMT_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPreRMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreRMt_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            edtForPorRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPORREC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPorRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPorRec_Enabled), 5, 0), !bGXsfl_95_Refreshing);
            if ( ( nRcdExists_1376 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1751376( ) ;
            }
            sendRow1751376( ) ;
            bGXsfl_95_Refreshing = false ;
         }
         Gx_mode = sMode1376 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1075ForUltLr = B1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         A10178CtrlMn = B10178CtrlMn ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1376 = (short)(5) ;
         nRcdExists_1376 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1751376( ) ;
            while ( RcdFound1376 != 0 )
            {
               sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_951376( ) ;
               init_level_properties1376( ) ;
               standaloneNotModal1751376( ) ;
               getByPrimaryKey1751376( ) ;
               standaloneModal1751376( ) ;
               addRow1751376( ) ;
               scanNext1751376( ) ;
            }
            scanEnd1751376( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1376 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_951376( ) ;
      initAll1751376( ) ;
      init_level_properties1376( ) ;
      B1075ForUltLr = A1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      B10178CtrlMn = A10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      nRcdExists_1376 = (short)(0) ;
      nIsMod_1376 = (short)(0) ;
      nRcdDeleted_1376 = (short)(0) ;
      nBlankRcdCount1376 = (short)(nBlankRcdUsr1376+nBlankRcdCount1376) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1376 > 0 )
      {
         standaloneNotModal1751376( ) ;
         standaloneModal1751376( ) ;
         addRow1751376( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtForVIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1376 = (short)(nBlankRcdCount1376-1) ;
      }
      Gx_mode = sMode1376 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1075ForUltLr = B1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      A10178CtrlMn = B10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLARPMn.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLARPMn.htm");
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
      e111752 ();
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
            Z9766ForProC = httpContext.cgiGet( "Z9766ForProC") ;
            Z1075ForUltLr = (short)(localUtil.ctol( httpContext.cgiGet( "Z1075ForUltLr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10136ForKgsMn = localUtil.ctond( httpContext.cgiGet( "Z10136ForKgsMn")) ;
            O1075ForUltLr = (short)(localUtil.ctol( httpContext.cgiGet( "O1075ForUltLr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10178CtrlMn = (short)(localUtil.ctol( httpContext.cgiGet( "O10178CtrlMn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_95 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
            A9766ForProC = httpContext.cgiGet( edtForProC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
            A9767ForProD = httpContext.cgiGet( edtForProD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9767ForProD", A9767ForProD);
            A1075ForUltLr = (short)(localUtil.ctol( httpContext.cgiGet( edtForUltLr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1075ForUltLr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForKgsMn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForKgsMn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORKGSMN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForKgsMn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10136ForKgsMn = DecimalUtil.ZERO ;
               n10136ForKgsMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10136ForKgsMn", GXutil.ltrimstr( A10136ForKgsMn, 9, 2));
            }
            else
            {
               A10136ForKgsMn = localUtil.ctond( httpContext.cgiGet( edtForKgsMn_Internalname)) ;
               n10136ForKgsMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10136ForKgsMn", GXutil.ltrimstr( A10136ForKgsMn, 9, 2));
            }
            A10178CtrlMn = (short)(localUtil.ctol( httpContext.cgiGet( edtCtrlMn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10178CtrlMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
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
               A494ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A9766ForProC = httpContext.GetPar( "ForProC") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
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
                        e111752 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121752 ();
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
         /* Execute user event: After Trn */
         e121752 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1751280( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1376_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1376_Enabled), 5, 0), !bGXsfl_95_Refreshing);
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
      disableAttributes1751280( ) ;
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

   public void confirm_1750( )
   {
      beforeValidate1751280( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1751280( ) ;
         }
         else
         {
            checkExtendedTable1751280( ) ;
            if ( AnyError == 0 )
            {
               zm1751280( 12) ;
               zm1751280( 13) ;
               zm1751280( 14) ;
               zm1751280( 15) ;
               zm1751280( 16) ;
            }
            closeExtendedTableCursors1751280( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1280 = Gx_mode ;
         confirm_1751376( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1280 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1750( ) ;
      }
   }

   public void confirm_1751376( )
   {
      s1075ForUltLr = O1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      s10178CtrlMn = O10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1751376( ) ;
         if ( ( nRcdExists_1376 != 0 ) || ( nIsMod_1376 != 0 ) )
         {
            getKey1751376( ) ;
            if ( ( nRcdExists_1376 == 0 ) && ( nRcdDeleted_1376 == 0 ) )
            {
               if ( RcdFound1376 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1751376( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1751376( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1751376( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1075ForUltLr = A1075ForUltLr ;
                     n1075ForUltLr = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
                     O10178CtrlMn = A10178CtrlMn ;
                     n10178CtrlMn = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1376 != 0 )
               {
                  if ( nRcdDeleted_1376 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1751376( ) ;
                     load1751376( ) ;
                     beforeValidate1751376( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1751376( ) ;
                        O1075ForUltLr = A1075ForUltLr ;
                        n1075ForUltLr = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
                        O10178CtrlMn = A10178CtrlMn ;
                        n10178CtrlMn = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1376 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1751376( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1751376( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1751376( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1075ForUltLr = A1075ForUltLr ;
                           n1075ForUltLr = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
                           O10178CtrlMn = A10178CtrlMn ;
                           n10178CtrlMn = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1376 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1376_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForLinN_Internalname, GXutil.ltrim( localUtil.ntoc( A1067ForLinN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForVIni_Internalname, GXutil.ltrim( localUtil.ntoc( A1068ForVIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForVFin_Internalname, GXutil.ltrim( localUtil.ntoc( A1069ForVFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A1070ForPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPreRMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1073ForPreRMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPorRec_Internalname, GXutil.ltrim( localUtil.ntoc( A1071ForPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1067ForLinN_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1067ForLinN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1068ForVIni_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1068ForVIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1069ForVFin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1069ForVFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1070ForPreRec_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1070ForPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1073ForPreRMt_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1073ForPreRMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1071ForPorRec_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1071ForPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1376_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1376_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1376_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1376 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1376_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1376_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORLINN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForLinN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORVINI_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForVIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORVFIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForVFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPREREC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRERMT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPORREC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPorRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1075ForUltLr = s1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      O10178CtrlMn = s10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1750( )
   {
   }

   public void e111752( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tclarpmn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tclarpmn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tclarpmn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Articulo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Color", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV17Lit5 = httpContext.getMessage( "Tc", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV18Lit6 = httpContext.getMessage( "Kilos MINIMOS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclarpmn_impl.this.A396EmprCod = GXv_char2[0] ;
      tclarpmn_impl.this.AV11EmprNom = GXv_char3[0] ;
      tclarpmn_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121752( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( A10136ForKgsMn.doubleValue() == 0 ) && ( A10178CtrlMn > 0 ) )
      {
         GX_FocusControl = edtForKgsMn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void zm1751280( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1075ForUltLr = T01755_A1075ForUltLr[0] ;
            Z10136ForKgsMn = T01755_A10136ForKgsMn[0] ;
         }
         else
         {
            Z1075ForUltLr = A1075ForUltLr ;
            Z10136ForKgsMn = A10136ForKgsMn ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z9766ForProC = A9766ForProC ;
         Z1075ForUltLr = A1075ForUltLr ;
         Z10136ForKgsMn = A10136ForKgsMn ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z832TipColDsc = A832TipColDsc ;
         Z5742ForSerDsc = A5742ForSerDsc ;
         Z10178CtrlMn = A10178CtrlMn ;
      }
   }

   public void standaloneNotModal( )
   {
      edtForUltLr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLr_Enabled), 5, 0), true);
      AV35Pgmname = "TCLARPMn" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtForUltLr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLr_Enabled), 5, 0), true);
      /* Using cursor T01756 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01756_A407EmprNom[0] ;
      n407EmprNom = T01756_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01757 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01757_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01758 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T01758_A832TipColDsc[0] ;
      n832TipColDsc = T01758_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(6);
      /* Using cursor T01759 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A5742ForSerDsc = T01759_A5742ForSerDsc[0] ;
      n5742ForSerDsc = T01759_n5742ForSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      pr_default.close(7);
      /* Using cursor T017511 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A10178CtrlMn = T017511_A10178CtrlMn[0] ;
         n10178CtrlMn = T017511_n10178CtrlMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      else
      {
         A10178CtrlMn = (short)(0) ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      O10178CtrlMn = A10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      pr_default.close(8);
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclarpmn_impl.this.A396EmprCod = GXv_char4[0] ;
      tclarpmn_impl.this.A9766ForProC = GXv_char3[0] ;
      tclarpmn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
      A9767ForProD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9767ForProD", A9767ForProD);
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

   public void load1751280( )
   {
      /* Using cursor T017513 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1280 = (short)(1) ;
         A407EmprNom = T017513_A407EmprNom[0] ;
         n407EmprNom = T017513_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T017513_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5742ForSerDsc = T017513_A5742ForSerDsc[0] ;
         n5742ForSerDsc = T017513_n5742ForSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
         A832TipColDsc = T017513_A832TipColDsc[0] ;
         n832TipColDsc = T017513_n832TipColDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
         A1075ForUltLr = T017513_A1075ForUltLr[0] ;
         n1075ForUltLr = T017513_n1075ForUltLr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         A10136ForKgsMn = T017513_A10136ForKgsMn[0] ;
         n10136ForKgsMn = T017513_n10136ForKgsMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10136ForKgsMn", GXutil.ltrimstr( A10136ForKgsMn, 9, 2));
         A10178CtrlMn = T017513_A10178CtrlMn[0] ;
         n10178CtrlMn = T017513_n10178CtrlMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         zm1751280( -11) ;
      }
      pr_default.close(9);
      onLoadActions1751280( ) ;
   }

   public void onLoadActions1751280( )
   {
      O10178CtrlMn = A10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
   }

   public void checkExtendedTable1751280( )
   {
      nIsDirty_1280 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1751280( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1751280( )
   {
      /* Using cursor T017514 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
      else
      {
         RcdFound1280 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01755 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01755_A9766ForProC[0], A9766ForProC) == 0 ) && ( GXutil.strcmp(T01755_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01755_A252CliCod[0] == A252CliCod ) && ( T01755_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01755_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01755_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01755_A483ForColNum[0] == A483ForColNum ) )
      {
         zm1751280( 11) ;
         RcdFound1280 = (short)(1) ;
         A1075ForUltLr = T01755_A1075ForUltLr[0] ;
         n1075ForUltLr = T01755_n1075ForUltLr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         A10136ForKgsMn = T01755_A10136ForKgsMn[0] ;
         n10136ForKgsMn = T01755_n10136ForKgsMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10136ForKgsMn", GXutil.ltrimstr( A10136ForKgsMn, 9, 2));
         O1075ForUltLr = A1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1751280( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1280 = (short)(0) ;
            initializeNonKey1751280( ) ;
         }
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1280 = (short)(0) ;
         initializeNonKey1751280( ) ;
         sMode1280 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1280 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1751280( ) ;
      if ( RcdFound1280 == 0 )
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
      RcdFound1280 = (short)(0) ;
      /* Using cursor T017515 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T017515_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017515_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017515_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017515_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017515_A483ForColNum[0] == A483ForColNum ) && ( T017515_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017515_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T017515_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017515_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017515_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017515_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017515_A483ForColNum[0] == A483ForColNum ) && ( T017515_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017515_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            RcdFound1280 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1280 = (short)(0) ;
      /* Using cursor T017516 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T017516_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017516_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017516_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017516_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017516_A483ForColNum[0] == A483ForColNum ) && ( T017516_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017516_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T017516_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017516_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017516_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017516_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017516_A483ForColNum[0] == A483ForColNum ) && ( T017516_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017516_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            RcdFound1280 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1751280( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1075ForUltLr = O1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         A10178CtrlMn = O10178CtrlMn ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         GX_FocusControl = edtForKgsMn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1751280( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1280 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1075ForUltLr = O1075ForUltLr ;
               n1075ForUltLr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
               A10178CtrlMn = O10178CtrlMn ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtForKgsMn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1075ForUltLr = O1075ForUltLr ;
               n1075ForUltLr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
               A10178CtrlMn = O10178CtrlMn ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
               update1751280( ) ;
               GX_FocusControl = edtForKgsMn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1075ForUltLr = O1075ForUltLr ;
               n1075ForUltLr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
               A10178CtrlMn = O10178CtrlMn ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
               GX_FocusControl = edtForKgsMn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1751280( ) ;
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
                  A1075ForUltLr = O1075ForUltLr ;
                  n1075ForUltLr = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
                  A10178CtrlMn = O10178CtrlMn ;
                  n10178CtrlMn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
                  GX_FocusControl = edtForKgsMn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1751280( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1075ForUltLr = O1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         A10178CtrlMn = O10178CtrlMn ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtForKgsMn_Internalname ;
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
      getKey1751280( ) ;
      if ( RcdFound1280 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclarpmn");
      GX_FocusControl = edtForKgsMn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1750( ) ;
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
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtForKgsMn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1751280( ) ;
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForKgsMn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1751280( ) ;
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
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForKgsMn_Internalname ;
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
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForKgsMn_Internalname ;
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
      scanStart1751280( ) ;
      if ( RcdFound1280 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1280 != 0 )
         {
            scanNext1751280( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtForKgsMn_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1751280( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1751280( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01754 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z1075ForUltLr != T01754_A1075ForUltLr[0] ) || ( DecimalUtil.compareTo(Z10136ForKgsMn, T01754_A10136ForKgsMn[0]) != 0 ) )
         {
            if ( Z1075ForUltLr != T01754_A1075ForUltLr[0] )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForUltLr");
               GXutil.writeLogRaw("Old: ",Z1075ForUltLr);
               GXutil.writeLogRaw("Current: ",T01754_A1075ForUltLr[0]);
            }
            if ( DecimalUtil.compareTo(Z10136ForKgsMn, T01754_A10136ForKgsMn[0]) != 0 )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForKgsMn");
               GXutil.writeLogRaw("Old: ",Z10136ForKgsMn);
               GXutil.writeLogRaw("Current: ",T01754_A10136ForKgsMn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLARPD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1751280( )
   {
      beforeValidate1751280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1751280( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1751280( 0) ;
         checkOptimisticConcurrency1751280( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1751280( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1751280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017517 */
                  pr_default.execute(13, new Object[] {A9766ForProC, Boolean.valueOf(n1075ForUltLr), Short.valueOf(A1075ForUltLr), Boolean.valueOf(n10136ForKgsMn), A10136ForKgsMn, A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
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
                        processLevel1751280( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1750( ) ;
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
            load1751280( ) ;
         }
         endLevel1751280( ) ;
      }
      closeExtendedTableCursors1751280( ) ;
   }

   public void update1751280( )
   {
      beforeValidate1751280( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1751280( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1751280( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1751280( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1751280( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017518 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n1075ForUltLr), Short.valueOf(A1075ForUltLr), Boolean.valueOf(n10136ForKgsMn), A10136ForKgsMn, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1751280( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1751280( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1750( ) ;
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
         endLevel1751280( ) ;
      }
      closeExtendedTableCursors1751280( ) ;
   }

   public void deferredUpdate1751280( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1751280( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1751280( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1751280( ) ;
         afterConfirm1751280( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1751280( ) ;
            if ( AnyError == 0 )
            {
               A1075ForUltLr = O1075ForUltLr ;
               n1075ForUltLr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
               A10178CtrlMn = O10178CtrlMn ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
               scanStart1751376( ) ;
               while ( RcdFound1376 != 0 )
               {
                  getByPrimaryKey1751376( ) ;
                  delete1751376( ) ;
                  scanNext1751376( ) ;
                  O1075ForUltLr = A1075ForUltLr ;
                  n1075ForUltLr = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
                  O10178CtrlMn = A10178CtrlMn ;
                  n10178CtrlMn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
               }
               scanEnd1751376( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017519 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1280 == 0 )
                        {
                           initAll1751280( ) ;
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
                        resetCaption1750( ) ;
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
      sMode1280 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1751280( ) ;
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1751280( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017520 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T017521 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0200", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T017522 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FPCC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1751376( )
   {
      s1075ForUltLr = O1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      s10178CtrlMn = O10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      nGXsfl_95_idx = 0 ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         readRow1751376( ) ;
         if ( ( nRcdExists_1376 != 0 ) || ( nIsMod_1376 != 0 ) )
         {
            standaloneNotModal1751376( ) ;
            getKey1751376( ) ;
            if ( ( nRcdExists_1376 == 0 ) && ( nRcdDeleted_1376 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1751376( ) ;
            }
            else
            {
               if ( RcdFound1376 != 0 )
               {
                  if ( ( nRcdDeleted_1376 != 0 ) && ( nRcdExists_1376 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1751376( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1376 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1751376( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1376 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O1075ForUltLr = A1075ForUltLr ;
            n1075ForUltLr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
            O10178CtrlMn = A10178CtrlMn ;
            n10178CtrlMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1376_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForLinN_Internalname, GXutil.ltrim( localUtil.ntoc( A1067ForLinN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForVIni_Internalname, GXutil.ltrim( localUtil.ntoc( A1068ForVIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForVFin_Internalname, GXutil.ltrim( localUtil.ntoc( A1069ForVFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A1070ForPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPreRMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1073ForPreRMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPorRec_Internalname, GXutil.ltrim( localUtil.ntoc( A1071ForPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1067ForLinN_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1067ForLinN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1068ForVIni_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1068ForVIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1069ForVFin_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1069ForVFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1070ForPreRec_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1070ForPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1073ForPreRMt_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1073ForPreRMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1071ForPorRec_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( Z1071ForPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1376_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1376_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1376_"+sGXsfl_95_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1376 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1376_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1376_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORLINN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForLinN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORVINI_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForVIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORVFIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForVFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPREREC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRERMT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPORREC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPorRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1751376( ) ;
      if ( AnyError != 0 )
      {
         O1075ForUltLr = s1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         O10178CtrlMn = s10178CtrlMn ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      nRcdExists_1376 = (short)(0) ;
      nIsMod_1376 = (short)(0) ;
      nRcdDeleted_1376 = (short)(0) ;
   }

   public void processLevel1751280( )
   {
      /* Save parent mode. */
      sMode1280 = Gx_mode ;
      processNestedLevel1751376( ) ;
      if ( AnyError != 0 )
      {
         O1075ForUltLr = s1075ForUltLr ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
         O10178CtrlMn = s10178CtrlMn ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1280 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T017523 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n1075ForUltLr), Short.valueOf(A1075ForUltLr), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPD");
   }

   public void endLevel1751280( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1751280( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclarpmn");
         if ( AnyError == 0 )
         {
            confirmValues1750( ) ;
         }
         /* After transaction rules */
         if ( ( A10136ForKgsMn.doubleValue() == 0 ) && true /* After */ && ( A10178CtrlMn > 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos MINIMOS Obligatorio¡¡¡", ""), 1, "FORKGSMN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForKgsMn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            return  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclarpmn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1751280( )
   {
      /* Scan By routine */
      /* Using cursor T017524 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1751280( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1280 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1280 = (short)(1) ;
      }
   }

   public void scanEnd1751280( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1751280( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1751280( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1751280( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1751280( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1751280( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1751280( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1751280( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtTipColDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Enabled), 5, 0), true);
      edtForProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), true);
      edtForProD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProD_Enabled), 5, 0), true);
      edtForUltLr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLr_Enabled), 5, 0), true);
      edtForKgsMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForKgsMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForKgsMn_Enabled), 5, 0), true);
      edtCtrlMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCtrlMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCtrlMn_Enabled), 5, 0), true);
   }

   public void zm1751376( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1068ForVIni = T01753_A1068ForVIni[0] ;
            Z1069ForVFin = T01753_A1069ForVFin[0] ;
            Z1070ForPreRec = T01753_A1070ForPreRec[0] ;
            Z1073ForPreRMt = T01753_A1073ForPreRMt[0] ;
            Z1071ForPorRec = T01753_A1071ForPorRec[0] ;
         }
         else
         {
            Z1068ForVIni = A1068ForVIni ;
            Z1069ForVFin = A1069ForVFin ;
            Z1070ForPreRec = A1070ForPreRec ;
            Z1073ForPreRMt = A1073ForPreRMt ;
            Z1071ForPorRec = A1071ForPorRec ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z1067ForLinN = A1067ForLinN ;
         Z1068ForVIni = A1068ForVIni ;
         Z1069ForVFin = A1069ForVFin ;
         Z1070ForPreRec = A1070ForPreRec ;
         Z1073ForPreRMt = A1073ForPreRMt ;
         Z1071ForPorRec = A1071ForPorRec ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1751376( )
   {
      edtForLinN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForLinN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLinN_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtForUltLr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLr_Enabled), 5, 0), true);
      edtForUltLr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltLr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltLr_Enabled), 5, 0), true);
   }

   public void standaloneModal1751376( )
   {
      if ( isIns( )  )
      {
         A1075ForUltLr = (short)(O1075ForUltLr+1) ;
         n1075ForUltLr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1067ForLinN = A1075ForUltLr ;
      }
   }

   public void load1751376( )
   {
      /* Using cursor T017525 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1376 = (short)(1) ;
         A1068ForVIni = T017525_A1068ForVIni[0] ;
         n1068ForVIni = T017525_n1068ForVIni[0] ;
         A1069ForVFin = T017525_A1069ForVFin[0] ;
         n1069ForVFin = T017525_n1069ForVFin[0] ;
         A1070ForPreRec = T017525_A1070ForPreRec[0] ;
         n1070ForPreRec = T017525_n1070ForPreRec[0] ;
         A1073ForPreRMt = T017525_A1073ForPreRMt[0] ;
         n1073ForPreRMt = T017525_n1073ForPreRMt[0] ;
         A1071ForPorRec = T017525_A1071ForPorRec[0] ;
         n1071ForPorRec = T017525_n1071ForPorRec[0] ;
         zm1751376( -17) ;
      }
      pr_default.close(21);
      onLoadActions1751376( ) ;
   }

   public void onLoadActions1751376( )
   {
      if ( isIns( )  )
      {
         A10178CtrlMn = (short)(O10178CtrlMn+1) ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10178CtrlMn = O10178CtrlMn ;
            n10178CtrlMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10178CtrlMn = (short)(O10178CtrlMn-1) ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
            }
         }
      }
   }

   public void checkExtendedTable1751376( )
   {
      nIsDirty_1376 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1751376( ) ;
      if ( A1069ForVFin < A1068ForVIni )
      {
         GXCCtl = "FORVINI_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad Final inferior al inicial", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForVIni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_1376 = (short)(1) ;
         A10178CtrlMn = (short)(O10178CtrlMn+1) ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1376 = (short)(1) ;
            A10178CtrlMn = O10178CtrlMn ;
            n10178CtrlMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1376 = (short)(1) ;
               A10178CtrlMn = (short)(O10178CtrlMn-1) ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1751376( )
   {
   }

   public void enableDisable1751376( )
   {
   }

   public void getKey1751376( )
   {
      /* Using cursor T017526 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1376 = (short)(1) ;
      }
      else
      {
         RcdFound1376 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1751376( )
   {
      /* Using cursor T01753 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01753_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01753_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01753_A483ForColNum[0] == A483ForColNum ) && ( T01753_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01753_A9766ForProC[0], A9766ForProC) == 0 ) && ( GXutil.strcmp(T01753_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01753_A252CliCod[0] == A252CliCod ) )
      {
         zm1751376( 17) ;
         RcdFound1376 = (short)(1) ;
         initializeNonKey1751376( ) ;
         A1067ForLinN = T01753_A1067ForLinN[0] ;
         A1068ForVIni = T01753_A1068ForVIni[0] ;
         n1068ForVIni = T01753_n1068ForVIni[0] ;
         A1069ForVFin = T01753_A1069ForVFin[0] ;
         n1069ForVFin = T01753_n1069ForVFin[0] ;
         A1070ForPreRec = T01753_A1070ForPreRec[0] ;
         n1070ForPreRec = T01753_n1070ForPreRec[0] ;
         A1073ForPreRMt = T01753_A1073ForPreRMt[0] ;
         n1073ForPreRMt = T01753_n1073ForPreRMt[0] ;
         A1071ForPorRec = T01753_A1071ForPorRec[0] ;
         n1071ForPorRec = T01753_n1071ForPorRec[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z1067ForLinN = A1067ForLinN ;
         sMode1376 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1751376( ) ;
         load1751376( ) ;
         Gx_mode = sMode1376 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1376 = (short)(0) ;
         initializeNonKey1751376( ) ;
         sMode1376 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1751376( ) ;
         Gx_mode = sMode1376 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1751376( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1751376( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01752 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z1068ForVIni != T01752_A1068ForVIni[0] ) || ( Z1069ForVFin != T01752_A1069ForVFin[0] ) || ( DecimalUtil.compareTo(Z1070ForPreRec, T01752_A1070ForPreRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z1073ForPreRMt, T01752_A1073ForPreRMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1071ForPorRec, T01752_A1071ForPorRec[0]) != 0 ) )
         {
            if ( Z1068ForVIni != T01752_A1068ForVIni[0] )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForVIni");
               GXutil.writeLogRaw("Old: ",Z1068ForVIni);
               GXutil.writeLogRaw("Current: ",T01752_A1068ForVIni[0]);
            }
            if ( Z1069ForVFin != T01752_A1069ForVFin[0] )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForVFin");
               GXutil.writeLogRaw("Old: ",Z1069ForVFin);
               GXutil.writeLogRaw("Current: ",T01752_A1069ForVFin[0]);
            }
            if ( DecimalUtil.compareTo(Z1070ForPreRec, T01752_A1070ForPreRec[0]) != 0 )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForPreRec");
               GXutil.writeLogRaw("Old: ",Z1070ForPreRec);
               GXutil.writeLogRaw("Current: ",T01752_A1070ForPreRec[0]);
            }
            if ( DecimalUtil.compareTo(Z1073ForPreRMt, T01752_A1073ForPreRMt[0]) != 0 )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForPreRMt");
               GXutil.writeLogRaw("Old: ",Z1073ForPreRMt);
               GXutil.writeLogRaw("Current: ",T01752_A1073ForPreRMt[0]);
            }
            if ( DecimalUtil.compareTo(Z1071ForPorRec, T01752_A1071ForPorRec[0]) != 0 )
            {
               GXutil.writeLogln("tclarpmn:[seudo value changed for attri]"+"ForPorRec");
               GXutil.writeLogRaw("Old: ",Z1071ForPorRec);
               GXutil.writeLogRaw("Current: ",T01752_A1071ForPorRec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLARPM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1751376( )
   {
      beforeValidate1751376( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1751376( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1751376( 0) ;
         checkOptimisticConcurrency1751376( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1751376( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1751376( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017527 */
                  pr_default.execute(23, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN), Boolean.valueOf(n1068ForVIni), Integer.valueOf(A1068ForVIni), Boolean.valueOf(n1069ForVFin), Integer.valueOf(A1069ForVFin), Boolean.valueOf(n1070ForPreRec), A1070ForPreRec, Boolean.valueOf(n1073ForPreRMt), A1073ForPreRMt, Boolean.valueOf(n1071ForPorRec), A1071ForPorRec, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPM");
                  if ( (pr_default.getStatus(23) == 1) )
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
            load1751376( ) ;
         }
         endLevel1751376( ) ;
      }
      closeExtendedTableCursors1751376( ) ;
   }

   public void update1751376( )
   {
      beforeValidate1751376( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1751376( ) ;
      }
      if ( ( nIsMod_1376 != 0 ) || ( nIsDirty_1376 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1751376( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1751376( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1751376( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017528 */
                     pr_default.execute(24, new Object[] {Boolean.valueOf(n1068ForVIni), Integer.valueOf(A1068ForVIni), Boolean.valueOf(n1069ForVFin), Integer.valueOf(A1069ForVFin), Boolean.valueOf(n1070ForPreRec), A1070ForPreRec, Boolean.valueOf(n1073ForPreRMt), A1073ForPreRMt, Boolean.valueOf(n1071ForPorRec), A1071ForPorRec, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPM");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLARPM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1751376( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1751376( ) ;
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
            endLevel1751376( ) ;
         }
      }
      closeExtendedTableCursors1751376( ) ;
   }

   public void deferredUpdate1751376( )
   {
   }

   public void delete1751376( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1751376( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1751376( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1751376( ) ;
         afterConfirm1751376( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1751376( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017529 */
               pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, Short.valueOf(A1067ForLinN)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLARPM");
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
      sMode1376 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1751376( ) ;
      Gx_mode = sMode1376 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1751376( )
   {
      standaloneModal1751376( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A10178CtrlMn = (short)(O10178CtrlMn+1) ;
            n10178CtrlMn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10178CtrlMn = O10178CtrlMn ;
               n10178CtrlMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10178CtrlMn = (short)(O10178CtrlMn-1) ;
                  n10178CtrlMn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
               }
            }
         }
      }
   }

   public void endLevel1751376( )
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

   public void scanStart1751376( )
   {
      /* Scan By routine */
      /* Using cursor T017530 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1376 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1376 = (short)(1) ;
         A1067ForLinN = T017530_A1067ForLinN[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1751376( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1376 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1376 = (short)(1) ;
         A1067ForLinN = T017530_A1067ForLinN[0] ;
      }
   }

   public void scanEnd1751376( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1751376( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1751376( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1751376( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1751376( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1751376( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1751376( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1751376( )
   {
      edtForLinN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForLinN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLinN_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtForVIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForVIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForVIni_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtForVFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForVFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForVFin_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtForPreRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreRec_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtForPreRMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPreRMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPreRMt_Enabled), 5, 0), !bGXsfl_95_Refreshing);
      edtForPorRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPorRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPorRec_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void send_integrity_lvl_hashes1751376( )
   {
   }

   public void send_integrity_lvl_hashes1751280( )
   {
   }

   public void subsflControlProps_951376( )
   {
      edtavnRcdDeleted_1376_Internalname = "vNRCDDELETED_1376_"+sGXsfl_95_idx ;
      edtForLinN_Internalname = "FORLINN_"+sGXsfl_95_idx ;
      edtForVIni_Internalname = "FORVINI_"+sGXsfl_95_idx ;
      edtForVFin_Internalname = "FORVFIN_"+sGXsfl_95_idx ;
      edtForPreRec_Internalname = "FORPREREC_"+sGXsfl_95_idx ;
      edtForPreRMt_Internalname = "FORPRERMT_"+sGXsfl_95_idx ;
      edtForPorRec_Internalname = "FORPORREC_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_951376( )
   {
      edtavnRcdDeleted_1376_Internalname = "vNRCDDELETED_1376_"+sGXsfl_95_fel_idx ;
      edtForLinN_Internalname = "FORLINN_"+sGXsfl_95_fel_idx ;
      edtForVIni_Internalname = "FORVINI_"+sGXsfl_95_fel_idx ;
      edtForVFin_Internalname = "FORVFIN_"+sGXsfl_95_fel_idx ;
      edtForPreRec_Internalname = "FORPREREC_"+sGXsfl_95_fel_idx ;
      edtForPreRMt_Internalname = "FORPRERMT_"+sGXsfl_95_fel_idx ;
      edtForPorRec_Internalname = "FORPORREC_"+sGXsfl_95_fel_idx ;
   }

   public void addRow1751376( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951376( ) ;
      sendRow1751376( ) ;
   }

   public void sendRow1751376( )
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
         if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1376_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1376_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1376_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1376), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1376), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1376_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1376_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForLinN_Internalname,GXutil.ltrim( localUtil.ntoc( A1067ForLinN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForLinN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1067ForLinN), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1067ForLinN), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForLinN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForLinN_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1376_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForVIni_Internalname,GXutil.ltrim( localUtil.ntoc( A1068ForVIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForVIni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1068ForVIni), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1068ForVIni), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForVIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForVIni_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1376_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForVFin_Internalname,GXutil.ltrim( localUtil.ntoc( A1069ForVFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForVFin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1069ForVFin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1069ForVFin), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForVFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForVFin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1376_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPreRec_Internalname,GXutil.ltrim( localUtil.ntoc( A1070ForPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPreRec_Enabled!=0) ? localUtil.format( A1070ForPreRec, "ZZZZZZ9.999") : localUtil.format( A1070ForPreRec, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPreRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPreRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1376_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPreRMt_Internalname,GXutil.ltrim( localUtil.ntoc( A1073ForPreRMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPreRMt_Enabled!=0) ? localUtil.format( A1073ForPreRMt, "ZZZZZZ9.999") : localUtil.format( A1073ForPreRMt, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPreRMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPreRMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1376_" + sGXsfl_95_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_95_idx + "',95)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPorRec_Internalname,GXutil.ltrim( localUtil.ntoc( A1071ForPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPorRec_Enabled!=0) ? localUtil.format( A1071ForPorRec, "ZZ9.99") : localUtil.format( A1071ForPorRec, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPorRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPorRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(95),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1751376( ) ;
      GXCCtl = "Z1067ForLinN_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1067ForLinN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1068ForVIni_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1068ForVIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1069ForVFin_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1069ForVFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1070ForPreRec_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1070ForPreRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1073ForPreRMt_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1073ForPreRMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1071ForPorRec_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1071ForPorRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1376_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1376_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1376_" + sGXsfl_95_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1376, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1376_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1376_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORLINN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForLinN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORVINI_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForVIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORVFIN_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForVFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPREREC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRERMT_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPORREC_"+sGXsfl_95_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPorRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1751376( )
   {
      nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951376( ) ;
      edtavnRcdDeleted_1376_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1376_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForLinN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORLINN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForVIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORVINI_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForVFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORVFIN_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPreRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPREREC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPreRMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRERMT_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPorRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPORREC_"+sGXsfl_95_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1376_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1376_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1376");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1376_Internalname ;
         wbErr = true ;
         nRcdDeleted_1376 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1376 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1376_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1067ForLinN = (short)(localUtil.ctol( httpContext.cgiGet( edtForLinN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForVIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForVIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "FORVINI_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForVIni_Internalname ;
         wbErr = true ;
         A1068ForVIni = 0 ;
         n1068ForVIni = false ;
      }
      else
      {
         A1068ForVIni = (int)(localUtil.ctol( httpContext.cgiGet( edtForVIni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1068ForVIni = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForVFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForVFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "FORVFIN_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForVFin_Internalname ;
         wbErr = true ;
         A1069ForVFin = 0 ;
         n1069ForVFin = false ;
      }
      else
      {
         A1069ForVFin = (int)(localUtil.ctol( httpContext.cgiGet( edtForVFin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1069ForVFin = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPreRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPreRec_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPREREC_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPreRec_Internalname ;
         wbErr = true ;
         A1070ForPreRec = DecimalUtil.ZERO ;
         n1070ForPreRec = false ;
      }
      else
      {
         A1070ForPreRec = localUtil.ctond( httpContext.cgiGet( edtForPreRec_Internalname)) ;
         n1070ForPreRec = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPreRMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPreRMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPRERMT_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPreRMt_Internalname ;
         wbErr = true ;
         A1073ForPreRMt = DecimalUtil.ZERO ;
         n1073ForPreRMt = false ;
      }
      else
      {
         A1073ForPreRMt = localUtil.ctond( httpContext.cgiGet( edtForPreRMt_Internalname)) ;
         n1073ForPreRMt = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPorRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPorRec_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "FORPORREC_" + sGXsfl_95_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPorRec_Internalname ;
         wbErr = true ;
         A1071ForPorRec = DecimalUtil.ZERO ;
         n1071ForPorRec = false ;
      }
      else
      {
         A1071ForPorRec = localUtil.ctond( httpContext.cgiGet( edtForPorRec_Internalname)) ;
         n1071ForPorRec = false ;
      }
      GXCCtl = "Z1067ForLinN_" + sGXsfl_95_idx ;
      Z1067ForLinN = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1068ForVIni_" + sGXsfl_95_idx ;
      Z1068ForVIni = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1069ForVFin_" + sGXsfl_95_idx ;
      Z1069ForVFin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1070ForPreRec_" + sGXsfl_95_idx ;
      Z1070ForPreRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1073ForPreRMt_" + sGXsfl_95_idx ;
      Z1073ForPreRMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1071ForPorRec_" + sGXsfl_95_idx ;
      Z1071ForPorRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1376_" + sGXsfl_95_idx ;
      nRcdDeleted_1376 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1376_" + sGXsfl_95_idx ;
      nRcdExists_1376 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1376_" + sGXsfl_95_idx ;
      nIsMod_1376 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtForLinN_Enabled = edtForLinN_Enabled ;
   }

   public void confirmValues1750( )
   {
      nGXsfl_95_idx = 0 ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_951376( ) ;
      while ( nGXsfl_95_idx < nRC_GXsfl_95 )
      {
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951376( ) ;
         httpContext.changePostValue( "Z1067ForLinN_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1067ForLinN_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1067ForLinN_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1068ForVIni_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1068ForVIni_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1068ForVIni_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1069ForVFin_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1069ForVFin_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1069ForVFin_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1070ForPreRec_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1070ForPreRec_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1070ForPreRec_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1073ForPreRMt_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1073ForPreRMt_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1073ForPreRMt_"+sGXsfl_95_idx) ;
         httpContext.changePostValue( "Z1071ForPorRec_"+sGXsfl_95_idx, httpContext.cgiGet( "ZT_"+"Z1071ForPorRec_"+sGXsfl_95_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1071ForPorRec_"+sGXsfl_95_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclarpmn", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1075ForUltLr", GXutil.ltrim( localUtil.ntoc( Z1075ForUltLr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10136ForKgsMn", GXutil.ltrim( localUtil.ntoc( Z10136ForKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1075ForUltLr", GXutil.ltrim( localUtil.ntoc( O1075ForUltLr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10178CtrlMn", GXutil.ltrim( localUtil.ntoc( O10178CtrlMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nGXsfl_95_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
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
      return formatLink("app.tclarpmn", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"})  ;
   }

   public String getPgmname( )
   {
      return "TCLARPMn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECARGOS", "") ;
   }

   public void initializeNonKey1751280( )
   {
      A1075ForUltLr = (short)(0) ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      A10136ForKgsMn = DecimalUtil.ZERO ;
      n10136ForKgsMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10136ForKgsMn", GXutil.ltrimstr( A10136ForKgsMn, 9, 2));
      O1075ForUltLr = A1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
      O10178CtrlMn = A10178CtrlMn ;
      n10178CtrlMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      Z1075ForUltLr = (short)(0) ;
      Z10136ForKgsMn = DecimalUtil.ZERO ;
   }

   public void initAll1751280( )
   {
      initializeNonKey1751280( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1751376( )
   {
      A1068ForVIni = 0 ;
      n1068ForVIni = false ;
      A1069ForVFin = 0 ;
      n1069ForVFin = false ;
      A1070ForPreRec = DecimalUtil.ZERO ;
      n1070ForPreRec = false ;
      A1073ForPreRMt = DecimalUtil.ZERO ;
      n1073ForPreRMt = false ;
      A1071ForPorRec = DecimalUtil.ZERO ;
      n1071ForPorRec = false ;
      Z1068ForVIni = 0 ;
      Z1069ForVFin = 0 ;
      Z1070ForPreRec = DecimalUtil.ZERO ;
      Z1073ForPreRMt = DecimalUtil.ZERO ;
      Z1071ForPorRec = DecimalUtil.ZERO ;
   }

   public void initAll1751376( )
   {
      A1067ForLinN = (short)(0) ;
      initializeNonKey1751376( ) ;
   }

   public void standaloneModalInsert1751376( )
   {
      A1075ForUltLr = i1075ForUltLr ;
      n1075ForUltLr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1075ForUltLr), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241551597", true, true);
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
      httpContext.AddJavascriptSource("tclarpmn.js", "?20268241551597", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1376( )
   {
      edtForLinN_Enabled = defedtForLinN_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForLinN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForLinN_Enabled), 5, 0), !bGXsfl_95_Refreshing);
   }

   public void startgridcontrol95( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1376, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1376_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1067ForLinN, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForLinN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1068ForVIni, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForVIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1069ForVFin, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForVFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1070ForPreRec, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1073ForPreRMt, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPreRMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1071ForPorRec, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPorRec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForSer_Internalname = "FORSER" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtForProC_Internalname = "FORPROC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtForProD_Internalname = "FORPROD" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtForUltLr_Internalname = "FORULTLR" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtForKgsMn_Internalname = "FORKGSMN" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtCtrlMn_Internalname = "CTRLMN" ;
      edtavnRcdDeleted_1376_Internalname = "vNRCDDELETED_1376" ;
      edtForLinN_Internalname = "FORLINN" ;
      edtForVIni_Internalname = "FORVINI" ;
      edtForVFin_Internalname = "FORVFIN" ;
      edtForPreRec_Internalname = "FORPREREC" ;
      edtForPreRMt_Internalname = "FORPRERMT" ;
      edtForPorRec_Internalname = "FORPORREC" ;
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
      Form.setCaption( httpContext.getMessage( "RECARGOS", "") );
      edtForPorRec_Jsonclick = "" ;
      edtForPreRMt_Jsonclick = "" ;
      edtForPreRec_Jsonclick = "" ;
      edtForVFin_Jsonclick = "" ;
      edtForVIni_Jsonclick = "" ;
      edtForLinN_Jsonclick = "" ;
      edtavnRcdDeleted_1376_Jsonclick = "" ;
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
      edtForPorRec_Enabled = 1 ;
      edtForPreRMt_Enabled = 1 ;
      edtForPreRec_Enabled = 1 ;
      edtForVFin_Enabled = 1 ;
      edtForVIni_Enabled = 1 ;
      edtForLinN_Enabled = 0 ;
      edtavnRcdDeleted_1376_Enabled = 1 ;
      edtCtrlMn_Jsonclick = "" ;
      edtCtrlMn_Backcolor = (int)(0xFFFFFF) ;
      edtCtrlMn_Enabled = 0 ;
      edtForKgsMn_Jsonclick = "" ;
      edtForKgsMn_Backcolor = (int)(0xFFFFFF) ;
      edtForKgsMn_Enabled = 1 ;
      edtForUltLr_Jsonclick = "" ;
      edtForUltLr_Backcolor = (int)(0xFFFFFF) ;
      edtForUltLr_Enabled = 0 ;
      edtForProD_Jsonclick = "" ;
      edtForProD_Backcolor = (int)(0xFFFFFF) ;
      edtForProD_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtForProC_Jsonclick = "" ;
      edtForProC_Backcolor = (int)(0xFFFFFF) ;
      edtForProC_Enabled = 0 ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipColDsc_Enabled = 0 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipColCod_Enabled = 0 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Backcolor = (int)(0xFFFFFF) ;
      edtForColNum_Enabled = 0 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Backcolor = (int)(0xFFFFFF) ;
      edtForColNom_Enabled = 0 ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtForSerDsc_Enabled = 0 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Backcolor = (int)(0xFFFFFF) ;
      edtForSer_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
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

   public void gx1asaforprod1751280( String A396EmprCod ,
                                     String A9766ForProC )
   {
      GXt_char1 = A9767ForProD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A9766ForProC ;
      GXv_char2[0] = GXt_char1 ;
      new app.pdscprd2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tclarpmn_impl.this.A396EmprCod = GXv_char4[0] ;
      tclarpmn_impl.this.A9766ForProC = GXv_char3[0] ;
      tclarpmn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
      A9767ForProD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9767ForProD", A9767ForProD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9767ForProD))+"\"") ;
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
      subsflControlProps_951376( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1751376( ) ;
         standaloneModal1751376( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1751376( ) ;
         nGXsfl_95_idx = (int)(nGXsfl_95_idx+1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_95_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_951376( ) ;
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
      /* Using cursor T017531 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017531_A407EmprNom[0] ;
      n407EmprNom = T017531_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(27);
      /* Using cursor T017532 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T017532_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(28);
      /* Using cursor T017533 */
      pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPCOL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A832TipColDsc = T017533_A832TipColDsc[0] ;
      n832TipColDsc = T017533_n832TipColDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", A832TipColDsc);
      pr_default.close(29);
      /* Using cursor T017534 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
      }
      A5742ForSerDsc = T017534_A5742ForSerDsc[0] ;
      n5742ForSerDsc = T017534_n5742ForSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", A5742ForSerDsc);
      pr_default.close(30);
      /* Using cursor T017536 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(31) != 101) )
      {
         A10178CtrlMn = T017536_A10178CtrlMn[0] ;
         n10178CtrlMn = T017536_n10178CtrlMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      else
      {
         A10178CtrlMn = (short)(0) ;
         n10178CtrlMn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10178CtrlMn), 4, 0));
      }
      pr_default.close(31);
      GX_FocusControl = edtForKgsMn_Internalname ;
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

   public void valid_Forproc( )
   {
      n1075ForUltLr = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9767ForProD", GXutil.rtrim( A9767ForProD));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5742ForSerDsc", GXutil.rtrim( A5742ForSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A832TipColDsc", GXutil.rtrim( A832TipColDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1075ForUltLr", GXutil.ltrim( localUtil.ntoc( A1075ForUltLr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10136ForKgsMn", GXutil.ltrim( localUtil.ntoc( A10136ForKgsMn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10178CtrlMn", GXutil.ltrim( localUtil.ntoc( A10178CtrlMn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9767ForProD", GXutil.rtrim( Z9767ForProD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5742ForSerDsc", GXutil.rtrim( Z5742ForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z832TipColDsc", GXutil.rtrim( Z832TipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1075ForUltLr", GXutil.ltrim( localUtil.ntoc( Z1075ForUltLr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10136ForKgsMn", GXutil.ltrim( localUtil.ntoc( Z10136ForKgsMn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10178CtrlMn", GXutil.ltrim( localUtil.ntoc( Z10178CtrlMn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1075ForUltLr", GXutil.ltrim( localUtil.ntoc( O1075ForUltLr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10178CtrlMn", GXutil.ltrim( localUtil.ntoc( O10178CtrlMn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121752',iparms:[{av:'A10136ForKgsMn',fld:'FORKGSMN',pic:'ZZZZZ9.99'},{av:'A10178CtrlMn',fld:'CTRLMN',pic:'ZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
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
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_FORPROC","{handler:'valid_Forproc',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1075ForUltLr',fld:'FORULTLR',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FORPROC",",oparms:[{av:'A9767ForProD',fld:'FORPROD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A5742ForSerDsc',fld:'FORSERDSC',pic:''},{av:'A832TipColDsc',fld:'TIPCOLDSC',pic:''},{av:'A1075ForUltLr',fld:'FORULTLR',pic:'ZZZ9'},{av:'A10136ForKgsMn',fld:'FORKGSMN',pic:'ZZZZZ9.99'},{av:'A10178CtrlMn',fld:'CTRLMN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z9766ForProC'},{av:'Z9767ForProD'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z5742ForSerDsc'},{av:'Z832TipColDsc'},{av:'Z1075ForUltLr'},{av:'Z10136ForKgsMn'},{av:'Z10178CtrlMn'},{av:'O1075ForUltLr'},{av:'O10178CtrlMn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FORULTLR","{handler:'valid_Forultlr',iparms:[]");
      setEventMetadata("VALID_FORULTLR",",oparms:[]}");
      setEventMetadata("VALID_FORKGSMN","{handler:'valid_Forkgsmn',iparms:[]");
      setEventMetadata("VALID_FORKGSMN",",oparms:[]}");
      setEventMetadata("VALID_CTRLMN","{handler:'valid_Ctrlmn',iparms:[]");
      setEventMetadata("VALID_CTRLMN",",oparms:[]}");
      setEventMetadata("VALID_FORLINN","{handler:'valid_Forlinn',iparms:[]");
      setEventMetadata("VALID_FORLINN",",oparms:[]}");
      setEventMetadata("VALID_FORVINI","{handler:'valid_Forvini',iparms:[]");
      setEventMetadata("VALID_FORVINI",",oparms:[]}");
      setEventMetadata("VALID_FORVFIN","{handler:'valid_Forvfin',iparms:[]");
      setEventMetadata("VALID_FORVFIN",",oparms:[]}");
      setEventMetadata("VALID_FORPORREC","{handler:'valid_Forporrec',iparms:[]");
      setEventMetadata("VALID_FORPORREC",",oparms:[]}");
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
      pr_default.close(28);
      pr_default.close(27);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA494ForSer = "" ;
      wcpOA482ForColNom = "" ;
      wcpOA9766ForProC = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z9766ForProC = "" ;
      Z10136ForKgsMn = DecimalUtil.ZERO ;
      Z1070ForPreRec = DecimalUtil.ZERO ;
      Z1073ForPreRMt = DecimalUtil.ZERO ;
      Z1071ForPorRec = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A9766ForProC = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
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
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A5742ForSerDsc = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A832TipColDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A9767ForProD = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A10136ForKgsMn = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1376 = "" ;
      Gx_mode = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1280 = "" ;
      A1070ForPreRec = DecimalUtil.ZERO ;
      A1073ForPreRMt = DecimalUtil.ZERO ;
      A1071ForPorRec = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z832TipColDsc = "" ;
      Z5742ForSerDsc = "" ;
      T01756_A407EmprNom = new String[] {""} ;
      T01756_n407EmprNom = new boolean[] {false} ;
      T01757_A279CliNom = new String[] {""} ;
      T01758_A832TipColDsc = new String[] {""} ;
      T01758_n832TipColDsc = new boolean[] {false} ;
      T01759_A5742ForSerDsc = new String[] {""} ;
      T01759_n5742ForSerDsc = new boolean[] {false} ;
      T017511_A10178CtrlMn = new short[1] ;
      T017511_n10178CtrlMn = new boolean[] {false} ;
      T017513_A9766ForProC = new String[] {""} ;
      T017513_A407EmprNom = new String[] {""} ;
      T017513_n407EmprNom = new boolean[] {false} ;
      T017513_A279CliNom = new String[] {""} ;
      T017513_A5742ForSerDsc = new String[] {""} ;
      T017513_n5742ForSerDsc = new boolean[] {false} ;
      T017513_A832TipColDsc = new String[] {""} ;
      T017513_n832TipColDsc = new boolean[] {false} ;
      T017513_A1075ForUltLr = new short[1] ;
      T017513_n1075ForUltLr = new boolean[] {false} ;
      T017513_A10136ForKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017513_n10136ForKgsMn = new boolean[] {false} ;
      T017513_A396EmprCod = new String[] {""} ;
      T017513_A252CliCod = new int[1] ;
      T017513_A831TipColCod = new byte[1] ;
      T017513_A494ForSer = new String[] {""} ;
      T017513_A482ForColNom = new String[] {""} ;
      T017513_A483ForColNum = new int[1] ;
      T017513_A10178CtrlMn = new short[1] ;
      T017513_n10178CtrlMn = new boolean[] {false} ;
      T017514_A396EmprCod = new String[] {""} ;
      T017514_A252CliCod = new int[1] ;
      T017514_A494ForSer = new String[] {""} ;
      T017514_A482ForColNom = new String[] {""} ;
      T017514_A483ForColNum = new int[1] ;
      T017514_A831TipColCod = new byte[1] ;
      T017514_A9766ForProC = new String[] {""} ;
      T01755_A9766ForProC = new String[] {""} ;
      T01755_A1075ForUltLr = new short[1] ;
      T01755_n1075ForUltLr = new boolean[] {false} ;
      T01755_A10136ForKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01755_n10136ForKgsMn = new boolean[] {false} ;
      T01755_A396EmprCod = new String[] {""} ;
      T01755_A252CliCod = new int[1] ;
      T01755_A831TipColCod = new byte[1] ;
      T01755_A494ForSer = new String[] {""} ;
      T01755_A482ForColNom = new String[] {""} ;
      T01755_A483ForColNum = new int[1] ;
      T017515_A396EmprCod = new String[] {""} ;
      T017515_A252CliCod = new int[1] ;
      T017515_A494ForSer = new String[] {""} ;
      T017515_A482ForColNom = new String[] {""} ;
      T017515_A483ForColNum = new int[1] ;
      T017515_A831TipColCod = new byte[1] ;
      T017515_A9766ForProC = new String[] {""} ;
      T017516_A396EmprCod = new String[] {""} ;
      T017516_A252CliCod = new int[1] ;
      T017516_A494ForSer = new String[] {""} ;
      T017516_A482ForColNom = new String[] {""} ;
      T017516_A483ForColNum = new int[1] ;
      T017516_A831TipColCod = new byte[1] ;
      T017516_A9766ForProC = new String[] {""} ;
      T01754_A9766ForProC = new String[] {""} ;
      T01754_A1075ForUltLr = new short[1] ;
      T01754_n1075ForUltLr = new boolean[] {false} ;
      T01754_A10136ForKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01754_n10136ForKgsMn = new boolean[] {false} ;
      T01754_A396EmprCod = new String[] {""} ;
      T01754_A252CliCod = new int[1] ;
      T01754_A831TipColCod = new byte[1] ;
      T01754_A494ForSer = new String[] {""} ;
      T01754_A482ForColNom = new String[] {""} ;
      T01754_A483ForColNum = new int[1] ;
      T017520_A396EmprCod = new String[] {""} ;
      T017520_A252CliCod = new int[1] ;
      T017520_A494ForSer = new String[] {""} ;
      T017520_A482ForColNom = new String[] {""} ;
      T017520_A483ForColNum = new int[1] ;
      T017520_A831TipColCod = new byte[1] ;
      T017520_A9766ForProC = new String[] {""} ;
      T017520_A11282ForProLn = new short[1] ;
      T017521_A396EmprCod = new String[] {""} ;
      T017521_A252CliCod = new int[1] ;
      T017521_A494ForSer = new String[] {""} ;
      T017521_A482ForColNom = new String[] {""} ;
      T017521_A483ForColNum = new int[1] ;
      T017521_A831TipColCod = new byte[1] ;
      T017521_A9766ForProC = new String[] {""} ;
      T017521_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017522_A396EmprCod = new String[] {""} ;
      T017522_A252CliCod = new int[1] ;
      T017522_A494ForSer = new String[] {""} ;
      T017522_A482ForColNom = new String[] {""} ;
      T017522_A483ForColNum = new int[1] ;
      T017522_A831TipColCod = new byte[1] ;
      T017522_A9766ForProC = new String[] {""} ;
      T017522_A9847ForProL = new short[1] ;
      T017524_A396EmprCod = new String[] {""} ;
      T017524_A252CliCod = new int[1] ;
      T017524_A494ForSer = new String[] {""} ;
      T017524_A482ForColNom = new String[] {""} ;
      T017524_A483ForColNum = new int[1] ;
      T017524_A831TipColCod = new byte[1] ;
      T017524_A9766ForProC = new String[] {""} ;
      T017525_A494ForSer = new String[] {""} ;
      T017525_A482ForColNom = new String[] {""} ;
      T017525_A483ForColNum = new int[1] ;
      T017525_A831TipColCod = new byte[1] ;
      T017525_A9766ForProC = new String[] {""} ;
      T017525_A1067ForLinN = new short[1] ;
      T017525_A1068ForVIni = new int[1] ;
      T017525_n1068ForVIni = new boolean[] {false} ;
      T017525_A1069ForVFin = new int[1] ;
      T017525_n1069ForVFin = new boolean[] {false} ;
      T017525_A1070ForPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017525_n1070ForPreRec = new boolean[] {false} ;
      T017525_A1073ForPreRMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017525_n1073ForPreRMt = new boolean[] {false} ;
      T017525_A1071ForPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017525_n1071ForPorRec = new boolean[] {false} ;
      T017525_A396EmprCod = new String[] {""} ;
      T017525_A252CliCod = new int[1] ;
      GXCCtl = "" ;
      T017526_A396EmprCod = new String[] {""} ;
      T017526_A252CliCod = new int[1] ;
      T017526_A494ForSer = new String[] {""} ;
      T017526_A482ForColNom = new String[] {""} ;
      T017526_A483ForColNum = new int[1] ;
      T017526_A831TipColCod = new byte[1] ;
      T017526_A9766ForProC = new String[] {""} ;
      T017526_A1067ForLinN = new short[1] ;
      T01753_A494ForSer = new String[] {""} ;
      T01753_A482ForColNom = new String[] {""} ;
      T01753_A483ForColNum = new int[1] ;
      T01753_A831TipColCod = new byte[1] ;
      T01753_A9766ForProC = new String[] {""} ;
      T01753_A1067ForLinN = new short[1] ;
      T01753_A1068ForVIni = new int[1] ;
      T01753_n1068ForVIni = new boolean[] {false} ;
      T01753_A1069ForVFin = new int[1] ;
      T01753_n1069ForVFin = new boolean[] {false} ;
      T01753_A1070ForPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01753_n1070ForPreRec = new boolean[] {false} ;
      T01753_A1073ForPreRMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01753_n1073ForPreRMt = new boolean[] {false} ;
      T01753_A1071ForPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01753_n1071ForPorRec = new boolean[] {false} ;
      T01753_A396EmprCod = new String[] {""} ;
      T01753_A252CliCod = new int[1] ;
      T01752_A494ForSer = new String[] {""} ;
      T01752_A482ForColNom = new String[] {""} ;
      T01752_A483ForColNum = new int[1] ;
      T01752_A831TipColCod = new byte[1] ;
      T01752_A9766ForProC = new String[] {""} ;
      T01752_A1067ForLinN = new short[1] ;
      T01752_A1068ForVIni = new int[1] ;
      T01752_n1068ForVIni = new boolean[] {false} ;
      T01752_A1069ForVFin = new int[1] ;
      T01752_n1069ForVFin = new boolean[] {false} ;
      T01752_A1070ForPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01752_n1070ForPreRec = new boolean[] {false} ;
      T01752_A1073ForPreRMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01752_n1073ForPreRMt = new boolean[] {false} ;
      T01752_A1071ForPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01752_n1071ForPorRec = new boolean[] {false} ;
      T01752_A396EmprCod = new String[] {""} ;
      T01752_A252CliCod = new int[1] ;
      T017530_A396EmprCod = new String[] {""} ;
      T017530_A252CliCod = new int[1] ;
      T017530_A494ForSer = new String[] {""} ;
      T017530_A482ForColNom = new String[] {""} ;
      T017530_A483ForColNum = new int[1] ;
      T017530_A831TipColCod = new byte[1] ;
      T017530_A9766ForProC = new String[] {""} ;
      T017530_A1067ForLinN = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      T017531_A407EmprNom = new String[] {""} ;
      T017531_n407EmprNom = new boolean[] {false} ;
      T017532_A279CliNom = new String[] {""} ;
      T017533_A832TipColDsc = new String[] {""} ;
      T017533_n832TipColDsc = new boolean[] {false} ;
      T017534_A5742ForSerDsc = new String[] {""} ;
      T017534_n5742ForSerDsc = new boolean[] {false} ;
      T017536_A10178CtrlMn = new short[1] ;
      T017536_n10178CtrlMn = new boolean[] {false} ;
      Z9767ForProD = "" ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ9766ForProC = "" ;
      ZZ9767ForProD = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ5742ForSerDsc = "" ;
      ZZ832TipColDsc = "" ;
      ZZ10136ForKgsMn = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclarpmn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclarpmn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclarpmn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclarpmn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclarpmn__default(),
         new Object[] {
             new Object[] {
            T01752_A494ForSer, T01752_A482ForColNom, T01752_A483ForColNum, T01752_A831TipColCod, T01752_A9766ForProC, T01752_A1067ForLinN, T01752_A1068ForVIni, T01752_n1068ForVIni, T01752_A1069ForVFin, T01752_n1069ForVFin,
            T01752_A1070ForPreRec, T01752_n1070ForPreRec, T01752_A1073ForPreRMt, T01752_n1073ForPreRMt, T01752_A1071ForPorRec, T01752_n1071ForPorRec, T01752_A396EmprCod, T01752_A252CliCod
            }
            , new Object[] {
            T01753_A494ForSer, T01753_A482ForColNom, T01753_A483ForColNum, T01753_A831TipColCod, T01753_A9766ForProC, T01753_A1067ForLinN, T01753_A1068ForVIni, T01753_n1068ForVIni, T01753_A1069ForVFin, T01753_n1069ForVFin,
            T01753_A1070ForPreRec, T01753_n1070ForPreRec, T01753_A1073ForPreRMt, T01753_n1073ForPreRMt, T01753_A1071ForPorRec, T01753_n1071ForPorRec, T01753_A396EmprCod, T01753_A252CliCod
            }
            , new Object[] {
            T01754_A9766ForProC, T01754_A1075ForUltLr, T01754_n1075ForUltLr, T01754_A10136ForKgsMn, T01754_n10136ForKgsMn, T01754_A396EmprCod, T01754_A252CliCod, T01754_A831TipColCod, T01754_A494ForSer, T01754_A482ForColNom,
            T01754_A483ForColNum
            }
            , new Object[] {
            T01755_A9766ForProC, T01755_A1075ForUltLr, T01755_n1075ForUltLr, T01755_A10136ForKgsMn, T01755_n10136ForKgsMn, T01755_A396EmprCod, T01755_A252CliCod, T01755_A831TipColCod, T01755_A494ForSer, T01755_A482ForColNom,
            T01755_A483ForColNum
            }
            , new Object[] {
            T01756_A407EmprNom, T01756_n407EmprNom
            }
            , new Object[] {
            T01757_A279CliNom
            }
            , new Object[] {
            T01758_A832TipColDsc, T01758_n832TipColDsc
            }
            , new Object[] {
            T01759_A5742ForSerDsc, T01759_n5742ForSerDsc
            }
            , new Object[] {
            T017511_A10178CtrlMn, T017511_n10178CtrlMn
            }
            , new Object[] {
            T017513_A9766ForProC, T017513_A407EmprNom, T017513_n407EmprNom, T017513_A279CliNom, T017513_A5742ForSerDsc, T017513_n5742ForSerDsc, T017513_A832TipColDsc, T017513_n832TipColDsc, T017513_A1075ForUltLr, T017513_n1075ForUltLr,
            T017513_A10136ForKgsMn, T017513_n10136ForKgsMn, T017513_A396EmprCod, T017513_A252CliCod, T017513_A831TipColCod, T017513_A494ForSer, T017513_A482ForColNom, T017513_A483ForColNum, T017513_A10178CtrlMn, T017513_n10178CtrlMn
            }
            , new Object[] {
            T017514_A396EmprCod, T017514_A252CliCod, T017514_A494ForSer, T017514_A482ForColNom, T017514_A483ForColNum, T017514_A831TipColCod, T017514_A9766ForProC
            }
            , new Object[] {
            T017515_A396EmprCod, T017515_A252CliCod, T017515_A494ForSer, T017515_A482ForColNom, T017515_A483ForColNum, T017515_A831TipColCod, T017515_A9766ForProC
            }
            , new Object[] {
            T017516_A396EmprCod, T017516_A252CliCod, T017516_A494ForSer, T017516_A482ForColNom, T017516_A483ForColNum, T017516_A831TipColCod, T017516_A9766ForProC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017520_A396EmprCod, T017520_A252CliCod, T017520_A494ForSer, T017520_A482ForColNom, T017520_A483ForColNum, T017520_A831TipColCod, T017520_A9766ForProC, T017520_A11282ForProLn
            }
            , new Object[] {
            T017521_A396EmprCod, T017521_A252CliCod, T017521_A494ForSer, T017521_A482ForColNom, T017521_A483ForColNum, T017521_A831TipColCod, T017521_A9766ForProC, T017521_A10288Hp_dia
            }
            , new Object[] {
            T017522_A396EmprCod, T017522_A252CliCod, T017522_A494ForSer, T017522_A482ForColNom, T017522_A483ForColNum, T017522_A831TipColCod, T017522_A9766ForProC, T017522_A9847ForProL
            }
            , new Object[] {
            }
            , new Object[] {
            T017524_A396EmprCod, T017524_A252CliCod, T017524_A494ForSer, T017524_A482ForColNom, T017524_A483ForColNum, T017524_A831TipColCod, T017524_A9766ForProC
            }
            , new Object[] {
            T017525_A494ForSer, T017525_A482ForColNom, T017525_A483ForColNum, T017525_A831TipColCod, T017525_A9766ForProC, T017525_A1067ForLinN, T017525_A1068ForVIni, T017525_n1068ForVIni, T017525_A1069ForVFin, T017525_n1069ForVFin,
            T017525_A1070ForPreRec, T017525_n1070ForPreRec, T017525_A1073ForPreRMt, T017525_n1073ForPreRMt, T017525_A1071ForPorRec, T017525_n1071ForPorRec, T017525_A396EmprCod, T017525_A252CliCod
            }
            , new Object[] {
            T017526_A396EmprCod, T017526_A252CliCod, T017526_A494ForSer, T017526_A482ForColNom, T017526_A483ForColNum, T017526_A831TipColCod, T017526_A9766ForProC, T017526_A1067ForLinN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017530_A396EmprCod, T017530_A252CliCod, T017530_A494ForSer, T017530_A482ForColNom, T017530_A483ForColNum, T017530_A831TipColCod, T017530_A9766ForProC, T017530_A1067ForLinN
            }
            , new Object[] {
            T017531_A407EmprNom, T017531_n407EmprNom
            }
            , new Object[] {
            T017532_A279CliNom
            }
            , new Object[] {
            T017533_A832TipColDsc, T017533_n832TipColDsc
            }
            , new Object[] {
            T017534_A5742ForSerDsc, T017534_n5742ForSerDsc
            }
            , new Object[] {
            T017536_A10178CtrlMn, T017536_n10178CtrlMn
            }
         }
      );
      Z9766ForProC = "" ;
      A9766ForProC = "" ;
      Z831TipColCod = (byte)(0) ;
      A831TipColCod = (byte)(0) ;
      Z483ForColNum = 0 ;
      A483ForColNum = 0 ;
      Z482ForColNom = "" ;
      A482ForColNom = "" ;
      Z494ForSer = "" ;
      A494ForSer = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TCLARPMn" ;
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
   private short Z1075ForUltLr ;
   private short O1075ForUltLr ;
   private short O10178CtrlMn ;
   private short Z1067ForLinN ;
   private short nRcdDeleted_1376 ;
   private short nRcdExists_1376 ;
   private short nIsMod_1376 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1075ForUltLr ;
   private short A10178CtrlMn ;
   private short nBlankRcdCount1376 ;
   private short RcdFound1376 ;
   private short B1075ForUltLr ;
   private short B10178CtrlMn ;
   private short nBlankRcdUsr1376 ;
   private short s1075ForUltLr ;
   private short s10178CtrlMn ;
   private short A1067ForLinN ;
   private short Z10178CtrlMn ;
   private short RcdFound1280 ;
   private short nIsDirty_1280 ;
   private short nIsDirty_1376 ;
   private short i1075ForUltLr ;
   private short ZZ1075ForUltLr ;
   private short ZZ10178CtrlMn ;
   private short ZO1075ForUltLr ;
   private short ZO10178CtrlMn ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int nRC_GXsfl_95 ;
   private int nGXsfl_95_idx=1 ;
   private int Z1068ForVIni ;
   private int Z1069ForVFin ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtForSer_Enabled ;
   private int edtForSerDsc_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtTipColDsc_Enabled ;
   private int edtForProC_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtForProD_Enabled ;
   private int edtForUltLr_Enabled ;
   private int edtForKgsMn_Enabled ;
   private int edtCtrlMn_Enabled ;
   private int edtavnRcdDeleted_1376_Enabled ;
   private int edtForLinN_Enabled ;
   private int edtForVIni_Enabled ;
   private int edtForVFin_Enabled ;
   private int edtForPreRec_Enabled ;
   private int edtForPreRMt_Enabled ;
   private int edtForPorRec_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A1068ForVIni ;
   private int A1069ForVFin ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtForLinN_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCtrlMn_Backcolor ;
   private int edtForKgsMn_Backcolor ;
   private int edtForUltLr_Backcolor ;
   private int edtForProD_Backcolor ;
   private int edtForProC_Backcolor ;
   private int edtTipColDsc_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSerDsc_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10136ForKgsMn ;
   private java.math.BigDecimal Z1070ForPreRec ;
   private java.math.BigDecimal Z1073ForPreRMt ;
   private java.math.BigDecimal Z1071ForPorRec ;
   private java.math.BigDecimal A10136ForKgsMn ;
   private java.math.BigDecimal A1070ForPreRec ;
   private java.math.BigDecimal A1073ForPreRMt ;
   private java.math.BigDecimal A1071ForPorRec ;
   private java.math.BigDecimal ZZ10136ForKgsMn ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOA9766ForProC ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z9766ForProC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9766ForProC ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtForKgsMn_Internalname ;
   private String sGXsfl_95_idx="0001" ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtForSerDsc_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtTipColDsc_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtForProC_Internalname ;
   private String edtForProC_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtForProD_Internalname ;
   private String A9767ForProD ;
   private String edtForProD_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtForUltLr_Internalname ;
   private String edtForUltLr_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtForKgsMn_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtCtrlMn_Internalname ;
   private String edtCtrlMn_Jsonclick ;
   private String sMode1376 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1376_Internalname ;
   private String edtForLinN_Internalname ;
   private String edtForVIni_Internalname ;
   private String edtForVFin_Internalname ;
   private String edtForPreRec_Internalname ;
   private String edtForPreRMt_Internalname ;
   private String edtForPorRec_Internalname ;
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
   private String AV35Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1280 ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z832TipColDsc ;
   private String Z5742ForSerDsc ;
   private String GXCCtl ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1376_Jsonclick ;
   private String edtForLinN_Jsonclick ;
   private String edtForVIni_Jsonclick ;
   private String edtForVFin_Jsonclick ;
   private String edtForPreRec_Jsonclick ;
   private String edtForPreRMt_Jsonclick ;
   private String edtForPorRec_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z9767ForProD ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ9766ForProC ;
   private String ZZ9767ForProD ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ5742ForSerDsc ;
   private String ZZ832TipColDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1075ForUltLr ;
   private boolean n10178CtrlMn ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n5742ForSerDsc ;
   private boolean n832TipColDsc ;
   private boolean n10136ForKgsMn ;
   private boolean returnInSub ;
   private boolean n1068ForVIni ;
   private boolean n1069ForVFin ;
   private boolean n1070ForPreRec ;
   private boolean n1073ForPreRMt ;
   private boolean n1071ForPorRec ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01756_A407EmprNom ;
   private boolean[] T01756_n407EmprNom ;
   private String[] T01757_A279CliNom ;
   private String[] T01758_A832TipColDsc ;
   private boolean[] T01758_n832TipColDsc ;
   private String[] T01759_A5742ForSerDsc ;
   private boolean[] T01759_n5742ForSerDsc ;
   private short[] T017511_A10178CtrlMn ;
   private boolean[] T017511_n10178CtrlMn ;
   private String[] T017513_A9766ForProC ;
   private String[] T017513_A407EmprNom ;
   private boolean[] T017513_n407EmprNom ;
   private String[] T017513_A279CliNom ;
   private String[] T017513_A5742ForSerDsc ;
   private boolean[] T017513_n5742ForSerDsc ;
   private String[] T017513_A832TipColDsc ;
   private boolean[] T017513_n832TipColDsc ;
   private short[] T017513_A1075ForUltLr ;
   private boolean[] T017513_n1075ForUltLr ;
   private java.math.BigDecimal[] T017513_A10136ForKgsMn ;
   private boolean[] T017513_n10136ForKgsMn ;
   private String[] T017513_A396EmprCod ;
   private int[] T017513_A252CliCod ;
   private byte[] T017513_A831TipColCod ;
   private String[] T017513_A494ForSer ;
   private String[] T017513_A482ForColNom ;
   private int[] T017513_A483ForColNum ;
   private short[] T017513_A10178CtrlMn ;
   private boolean[] T017513_n10178CtrlMn ;
   private String[] T017514_A396EmprCod ;
   private int[] T017514_A252CliCod ;
   private String[] T017514_A494ForSer ;
   private String[] T017514_A482ForColNom ;
   private int[] T017514_A483ForColNum ;
   private byte[] T017514_A831TipColCod ;
   private String[] T017514_A9766ForProC ;
   private String[] T01755_A9766ForProC ;
   private short[] T01755_A1075ForUltLr ;
   private boolean[] T01755_n1075ForUltLr ;
   private java.math.BigDecimal[] T01755_A10136ForKgsMn ;
   private boolean[] T01755_n10136ForKgsMn ;
   private String[] T01755_A396EmprCod ;
   private int[] T01755_A252CliCod ;
   private byte[] T01755_A831TipColCod ;
   private String[] T01755_A494ForSer ;
   private String[] T01755_A482ForColNom ;
   private int[] T01755_A483ForColNum ;
   private String[] T017515_A396EmprCod ;
   private int[] T017515_A252CliCod ;
   private String[] T017515_A494ForSer ;
   private String[] T017515_A482ForColNom ;
   private int[] T017515_A483ForColNum ;
   private byte[] T017515_A831TipColCod ;
   private String[] T017515_A9766ForProC ;
   private String[] T017516_A396EmprCod ;
   private int[] T017516_A252CliCod ;
   private String[] T017516_A494ForSer ;
   private String[] T017516_A482ForColNom ;
   private int[] T017516_A483ForColNum ;
   private byte[] T017516_A831TipColCod ;
   private String[] T017516_A9766ForProC ;
   private String[] T01754_A9766ForProC ;
   private short[] T01754_A1075ForUltLr ;
   private boolean[] T01754_n1075ForUltLr ;
   private java.math.BigDecimal[] T01754_A10136ForKgsMn ;
   private boolean[] T01754_n10136ForKgsMn ;
   private String[] T01754_A396EmprCod ;
   private int[] T01754_A252CliCod ;
   private byte[] T01754_A831TipColCod ;
   private String[] T01754_A494ForSer ;
   private String[] T01754_A482ForColNom ;
   private int[] T01754_A483ForColNum ;
   private String[] T017520_A396EmprCod ;
   private int[] T017520_A252CliCod ;
   private String[] T017520_A494ForSer ;
   private String[] T017520_A482ForColNom ;
   private int[] T017520_A483ForColNum ;
   private byte[] T017520_A831TipColCod ;
   private String[] T017520_A9766ForProC ;
   private short[] T017520_A11282ForProLn ;
   private String[] T017521_A396EmprCod ;
   private int[] T017521_A252CliCod ;
   private String[] T017521_A494ForSer ;
   private String[] T017521_A482ForColNom ;
   private int[] T017521_A483ForColNum ;
   private byte[] T017521_A831TipColCod ;
   private String[] T017521_A9766ForProC ;
   private java.util.Date[] T017521_A10288Hp_dia ;
   private String[] T017522_A396EmprCod ;
   private int[] T017522_A252CliCod ;
   private String[] T017522_A494ForSer ;
   private String[] T017522_A482ForColNom ;
   private int[] T017522_A483ForColNum ;
   private byte[] T017522_A831TipColCod ;
   private String[] T017522_A9766ForProC ;
   private short[] T017522_A9847ForProL ;
   private String[] T017524_A396EmprCod ;
   private int[] T017524_A252CliCod ;
   private String[] T017524_A494ForSer ;
   private String[] T017524_A482ForColNom ;
   private int[] T017524_A483ForColNum ;
   private byte[] T017524_A831TipColCod ;
   private String[] T017524_A9766ForProC ;
   private String[] T017525_A494ForSer ;
   private String[] T017525_A482ForColNom ;
   private int[] T017525_A483ForColNum ;
   private byte[] T017525_A831TipColCod ;
   private String[] T017525_A9766ForProC ;
   private short[] T017525_A1067ForLinN ;
   private int[] T017525_A1068ForVIni ;
   private boolean[] T017525_n1068ForVIni ;
   private int[] T017525_A1069ForVFin ;
   private boolean[] T017525_n1069ForVFin ;
   private java.math.BigDecimal[] T017525_A1070ForPreRec ;
   private boolean[] T017525_n1070ForPreRec ;
   private java.math.BigDecimal[] T017525_A1073ForPreRMt ;
   private boolean[] T017525_n1073ForPreRMt ;
   private java.math.BigDecimal[] T017525_A1071ForPorRec ;
   private boolean[] T017525_n1071ForPorRec ;
   private String[] T017525_A396EmprCod ;
   private int[] T017525_A252CliCod ;
   private String[] T017526_A396EmprCod ;
   private int[] T017526_A252CliCod ;
   private String[] T017526_A494ForSer ;
   private String[] T017526_A482ForColNom ;
   private int[] T017526_A483ForColNum ;
   private byte[] T017526_A831TipColCod ;
   private String[] T017526_A9766ForProC ;
   private short[] T017526_A1067ForLinN ;
   private String[] T01753_A494ForSer ;
   private String[] T01753_A482ForColNom ;
   private int[] T01753_A483ForColNum ;
   private byte[] T01753_A831TipColCod ;
   private String[] T01753_A9766ForProC ;
   private short[] T01753_A1067ForLinN ;
   private int[] T01753_A1068ForVIni ;
   private boolean[] T01753_n1068ForVIni ;
   private int[] T01753_A1069ForVFin ;
   private boolean[] T01753_n1069ForVFin ;
   private java.math.BigDecimal[] T01753_A1070ForPreRec ;
   private boolean[] T01753_n1070ForPreRec ;
   private java.math.BigDecimal[] T01753_A1073ForPreRMt ;
   private boolean[] T01753_n1073ForPreRMt ;
   private java.math.BigDecimal[] T01753_A1071ForPorRec ;
   private boolean[] T01753_n1071ForPorRec ;
   private String[] T01753_A396EmprCod ;
   private int[] T01753_A252CliCod ;
   private String[] T01752_A494ForSer ;
   private String[] T01752_A482ForColNom ;
   private int[] T01752_A483ForColNum ;
   private byte[] T01752_A831TipColCod ;
   private String[] T01752_A9766ForProC ;
   private short[] T01752_A1067ForLinN ;
   private int[] T01752_A1068ForVIni ;
   private boolean[] T01752_n1068ForVIni ;
   private int[] T01752_A1069ForVFin ;
   private boolean[] T01752_n1069ForVFin ;
   private java.math.BigDecimal[] T01752_A1070ForPreRec ;
   private boolean[] T01752_n1070ForPreRec ;
   private java.math.BigDecimal[] T01752_A1073ForPreRMt ;
   private boolean[] T01752_n1073ForPreRMt ;
   private java.math.BigDecimal[] T01752_A1071ForPorRec ;
   private boolean[] T01752_n1071ForPorRec ;
   private String[] T01752_A396EmprCod ;
   private int[] T01752_A252CliCod ;
   private String[] T017530_A396EmprCod ;
   private int[] T017530_A252CliCod ;
   private String[] T017530_A494ForSer ;
   private String[] T017530_A482ForColNom ;
   private int[] T017530_A483ForColNum ;
   private byte[] T017530_A831TipColCod ;
   private String[] T017530_A9766ForProC ;
   private short[] T017530_A1067ForLinN ;
   private String[] T017531_A407EmprNom ;
   private boolean[] T017531_n407EmprNom ;
   private String[] T017532_A279CliNom ;
   private String[] T017533_A832TipColDsc ;
   private boolean[] T017533_n832TipColDsc ;
   private String[] T017534_A5742ForSerDsc ;
   private boolean[] T017534_n5742ForSerDsc ;
   private short[] T017536_A10178CtrlMn ;
   private boolean[] T017536_n10178CtrlMn ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclarpmn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpmn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpmn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpmn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclarpmn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01752", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN, ForVIni, ForVFin, ForPreRec, ForPreRMt, ForPorRec, EmprCod, CliCod FROM TXPCLARPM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForLinN = ?  FOR UPDATE OF ForVIni, ForVFin, ForPreRec, ForPreRMt, ForPorRec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01753", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN, ForVIni, ForVFin, ForPreRec, ForPreRMt, ForPorRec, EmprCod, CliCod FROM TXPCLARPM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForLinN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01754", "SELECT ForProC, ForUltLr, ForKgsMn, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?  FOR UPDATE OF ForUltLr, ForKgsMn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01755", "SELECT ForProC, ForUltLr, ForKgsMn, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01756", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01757", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01758", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01759", "SELECT ForSerDsc FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017511", "SELECT COALESCE( T1.CtrlMn, 0) AS CtrlMn FROM (SELECT COUNT(*) AS CtrlMn, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPM GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017513", "SELECT /*+ FIRST_ROWS(1) */ TM1.ForProC, T2.EmprNom, T3.CliNom, T5.ForSerDsc, T4.TipColDsc, TM1.ForUltLr, TM1.ForKgsMn, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, COALESCE( T6.CtrlMn, 0) AS CtrlMn FROM (((((TXPCLARPD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = TM1.EmprCod AND T4.TipColCod = TM1.TipColCod) INNER JOIN TXPCFORMU T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod AND T5.ForSer = TM1.ForSer AND T5.ForColNom = TM1.ForColNom AND T5.ForColNum = TM1.ForColNum AND T5.TipColCod = TM1.TipColCod) LEFT JOIN (SELECT COUNT(*) AS CtrlMn, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPM GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.CliCod = TM1.CliCod AND T6.ForSer = TM1.ForSer AND T6.ForColNom = TM1.ForColNom AND T6.ForColNum = TM1.ForColNum AND T6.TipColCod = TM1.TipColCod AND T6.ForProC = TM1.ForProC) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.ForProC = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.ForProC ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017514", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017515", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017516", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ForProC DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017517", "INSERT INTO TXPCLARPD(ForProC, ForUltLr, ForKgsMn, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProPK, ForProPM, ForProFe, FacLam, ForProMc, ForProUl, ForProKgs, FosCosFbk, ForcosCF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T017518", "UPDATE TXPCLARPD SET ForUltLr=?, ForKgsMn=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new UpdateCursor("T017519", "DELETE FROM TXPCLARPD  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new ForEachCursor("T017520", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProLn FROM TXPCOSCR0 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017521", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017522", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForProL FROM TXPFPCC WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017523", "UPDATE TXPCLARPD SET ForUltLr=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ?", GX_NOMASK, "TXPCLARPD")
         ,new ForEachCursor("T017524", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017525", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN, ForVIni, ForVFin, ForPreRec, ForPreRMt, ForPorRec, EmprCod, CliCod FROM TXPCLARPM WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and ForLinN = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017526", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN FROM TXPCLARPM WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForLinN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017527", "INSERT INTO TXPCLARPM(ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN, ForVIni, ForVFin, ForPreRec, ForPreRMt, ForPorRec, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLARPM")
         ,new UpdateCursor("T017528", "UPDATE TXPCLARPM SET ForVIni=?, ForVFin=?, ForPreRec=?, ForPreRMt=?, ForPorRec=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForLinN = ?", GX_NOMASK, "TXPCLARPM")
         ,new UpdateCursor("T017529", "DELETE FROM TXPCLARPM  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND ForLinN = ?", GX_NOMASK, "TXPCLARPM")
         ,new ForEachCursor("T017530", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN FROM TXPCLARPM WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, ForLinN ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017531", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017532", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017533", "SELECT TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017534", "SELECT ForSerDsc FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017536", "SELECT COALESCE( T1.CtrlMn, 0) AS CtrlMn FROM (SELECT COUNT(*) AS CtrlMn, EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC FROM TXPCLARPM GROUP BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.ForSer = ? AND T1.ForColNom = ? AND T1.ForColNum = ? AND T1.TipColCod = ? AND T1.ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
               ((String[]) buf[16])[0] = rslt.getString(12, 13);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               ((int[]) buf[17])[0] = rslt.getInt(13);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(4, (String)parms[5], 3);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 16);
               stmt.setString(8, (String)parms[9], 13);
               stmt.setInt(9, ((Number) parms[10]).intValue());
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 13);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 19 :
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
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(12, (String)parms[16], 3);
               stmt.setInt(13, ((Number) parms[17]).intValue());
               return;
            case 24 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setString(8, (String)parms[12], 16);
               stmt.setString(9, (String)parms[13], 13);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setByte(11, ((Number) parms[15]).byteValue());
               stmt.setString(12, (String)parms[16], 8);
               stmt.setShort(13, ((Number) parms[17]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
      }
   }

}

