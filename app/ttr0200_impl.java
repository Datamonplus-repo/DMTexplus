package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0200_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO PRECIOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtHp_dia_Internalname ;
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

   public ttr0200_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0200_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0200_impl.class ));
   }

   public ttr0200_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0200.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProC_Internalname, GXutil.rtrim( A9766ForProC), GXutil.rtrim( localUtil.format( A9766ForProC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProC_Jsonclick, 0, "", "", "", "", "", 1, edtForProC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Dia Modificacion Precio", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHp_dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHp_dia_Internalname, localUtil.format(A10288Hp_dia, "99/99/99"), localUtil.format( A10288Hp_dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHp_dia_Jsonclick, 0, "", "", "", "", "", 1, edtHp_dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0200.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHp_dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHp_dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0200.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Ultima linea", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0200.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHp_ult_Internalname, GXutil.ltrim( localUtil.ntoc( A10289Hp_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHp_ult_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10289Hp_ult), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10289Hp_ult), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHp_ult_Jsonclick, 0, "", "", "", "", "", 1, edtHp_ult_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0200.htm");
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
         nBlankRcdCount1398 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1398 = (short)(1) ;
            scanStart17S1398( ) ;
            while ( RcdFound1398 != 0 )
            {
               init_level_properties1398( ) ;
               getByPrimaryKey17S1398( ) ;
               addRow17S1398( ) ;
               scanNext17S1398( ) ;
            }
            scanEnd17S1398( ) ;
            nBlankRcdCount1398 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal17S1398( ) ;
         standaloneModal17S1398( ) ;
         sMode1398 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow17S1398( ) ;
            edtavnRcdDeleted_1398_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1398_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1398_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1398_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_LIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_pk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PK_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pk_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_pm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_Term_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_TERM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Term_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_USU_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_usu_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_ddhh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_DDHH_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_ddhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_ddhh_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1398 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17S1398( ) ;
            }
            sendRow17S1398( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1398 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1398 = (short)(5) ;
         nRcdExists_1398 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17S1398( ) ;
            while ( RcdFound1398 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701398( ) ;
               init_level_properties1398( ) ;
               standaloneNotModal17S1398( ) ;
               getByPrimaryKey17S1398( ) ;
               standaloneModal17S1398( ) ;
               addRow17S1398( ) ;
               scanNext17S1398( ) ;
            }
            scanEnd17S1398( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1398 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701398( ) ;
      initAll17S1398( ) ;
      init_level_properties1398( ) ;
      nRcdExists_1398 = (short)(0) ;
      nIsMod_1398 = (short)(0) ;
      nRcdDeleted_1398 = (short)(0) ;
      nBlankRcdCount1398 = (short)(nBlankRcdUsr1398+nBlankRcdCount1398) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1398 > 0 )
      {
         standaloneNotModal17S1398( ) ;
         standaloneModal17S1398( ) ;
         addRow17S1398( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHp_lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1398 = (short)(nBlankRcdCount1398-1) ;
      }
      Gx_mode = sMode1398 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0200.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0200.htm");
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
      e1117S2 ();
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
            Z10288Hp_dia = localUtil.ctod( httpContext.cgiGet( "Z10288Hp_dia"), 0) ;
            Z10289Hp_ult = (int)(localUtil.ctol( httpContext.cgiGet( "Z10289Hp_ult"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A9766ForProC = httpContext.cgiGet( edtForProC_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9766ForProC", A9766ForProC);
            if ( localUtil.vcdate( httpContext.cgiGet( edtHp_dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HP_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHp_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10288Hp_dia = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            }
            else
            {
               A10288Hp_dia = localUtil.ctod( httpContext.cgiGet( edtHp_dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHp_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHp_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HP_ULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHp_ult_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10289Hp_ult = 0 ;
               n10289Hp_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10289Hp_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10289Hp_ult), 6, 0));
            }
            else
            {
               A10289Hp_ult = (int)(localUtil.ctol( httpContext.cgiGet( edtHp_ult_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10289Hp_ult = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10289Hp_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10289Hp_ult), 6, 0));
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
               A10288Hp_dia = localUtil.parseDateParm( httpContext.GetPar( "Hp_dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
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
                        e1117S2 ();
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
            initAll17S1397( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1398_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1398_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributes17S1397( ) ;
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

   public void confirm_17S0( )
   {
      beforeValidate17S1397( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17S1397( ) ;
         }
         else
         {
            checkExtendedTable17S1397( ) ;
            if ( AnyError == 0 )
            {
               zm17S1397( 2) ;
               zm17S1397( 3) ;
            }
            closeExtendedTableCursors17S1397( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1397 = Gx_mode ;
         confirm_17S1398( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1397 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1397 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17S0( ) ;
      }
   }

   public void confirm_17S1398( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow17S1398( ) ;
         if ( ( nRcdExists_1398 != 0 ) || ( nIsMod_1398 != 0 ) )
         {
            getKey17S1398( ) ;
            if ( ( nRcdExists_1398 == 0 ) && ( nRcdDeleted_1398 == 0 ) )
            {
               if ( RcdFound1398 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17S1398( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17S1398( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors17S1398( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HP_LIN_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHp_lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1398 != 0 )
               {
                  if ( nRcdDeleted_1398 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17S1398( ) ;
                     load17S1398( ) ;
                     beforeValidate17S1398( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17S1398( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1398 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17S1398( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17S1398( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors17S1398( ) ;
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
                  if ( nRcdDeleted_1398 == 0 )
                  {
                     GXCCtl = "HP_LIN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHp_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1398_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10291Hp_pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10292Hp_pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Term_Internalname, GXutil.rtrim( A10293Hp_Term)) ;
         httpContext.changePostValue( edtHp_usu_Internalname, GXutil.rtrim( A10294Hp_usu)) ;
         httpContext.changePostValue( edtHp_ddhh_Internalname, localUtil.ttoc( A10295Hp_ddhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10290Hp_lin_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10291Hp_pk_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10291Hp_pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10292Hp_pm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10292Hp_pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10293Hp_Term_"+sGXsfl_70_idx, GXutil.rtrim( Z10293Hp_Term)) ;
         httpContext.changePostValue( "ZT_"+"Z10294Hp_usu_"+sGXsfl_70_idx, GXutil.rtrim( Z10294Hp_usu)) ;
         httpContext.changePostValue( "ZT_"+"Z10295Hp_ddhh_"+sGXsfl_70_idx, localUtil.ttoc( Z10295Hp_ddhh, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1398_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1398_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1398_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1398 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1398_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1398_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_TERM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Term_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_USU_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_DDHH_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17S0( )
   {
   }

   public void e1117S2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0200_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttr0200_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0200_impl.this.GXt_char1 = GXv_char2[0] ;
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
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr0200_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0200_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0200_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17S1397( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10289Hp_ult = T017S5_A10289Hp_ult[0] ;
         }
         else
         {
            Z10289Hp_ult = A10289Hp_ult ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10288Hp_dia = A10288Hp_dia ;
         Z10289Hp_ult = A10289Hp_ult ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z9766ForProC = A9766ForProC ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TTR0200" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T017S6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017S6_A407EmprNom[0] ;
      n407EmprNom = T017S6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T017S7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLARPDCL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPROC");
         AnyError = (short)(1) ;
      }
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

   public void load17S1397( )
   {
      /* Using cursor T017S8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1397 = (short)(1) ;
         A407EmprNom = T017S8_A407EmprNom[0] ;
         n407EmprNom = T017S8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10289Hp_ult = T017S8_A10289Hp_ult[0] ;
         n10289Hp_ult = T017S8_n10289Hp_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10289Hp_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10289Hp_ult), 6, 0));
         zm17S1397( -1) ;
      }
      pr_default.close(6);
      onLoadActions17S1397( ) ;
   }

   public void onLoadActions17S1397( )
   {
   }

   public void checkExtendedTable17S1397( )
   {
      nIsDirty_1397 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors17S1397( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey17S1397( )
   {
      /* Using cursor T017S9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1397 = (short)(1) ;
      }
      else
      {
         RcdFound1397 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017S5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T017S5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017S5_A252CliCod[0] == A252CliCod ) && ( T017S5_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017S5_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017S5_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017S5_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T017S5_A9766ForProC[0], A9766ForProC) == 0 ) )
      {
         zm17S1397( 1) ;
         RcdFound1397 = (short)(1) ;
         A10288Hp_dia = T017S5_A10288Hp_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
         A10289Hp_ult = T017S5_A10289Hp_ult[0] ;
         n10289Hp_ult = T017S5_n10289Hp_ult[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10289Hp_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10289Hp_ult), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         sMode1397 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17S1397( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1397 = (short)(0) ;
            initializeNonKey17S1397( ) ;
         }
         Gx_mode = sMode1397 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1397 = (short)(0) ;
         initializeNonKey17S1397( ) ;
         sMode1397 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1397 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey17S1397( ) ;
      if ( RcdFound1397 == 0 )
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
      RcdFound1397 = (short)(0) ;
      /* Using cursor T017S10 */
      pr_default.execute(8, new Object[] {A10288Hp_dia, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.resetTime(T017S10_A10288Hp_dia[0]).before( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T017S10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017S10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017S10_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017S10_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017S10_A483ForColNum[0] == A483ForColNum ) && ( T017S10_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017S10_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.resetTime(T017S10_A10288Hp_dia[0]).after( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T017S10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017S10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017S10_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017S10_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017S10_A483ForColNum[0] == A483ForColNum ) && ( T017S10_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017S10_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            A10288Hp_dia = T017S10_A10288Hp_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            RcdFound1397 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1397 = (short)(0) ;
      /* Using cursor T017S11 */
      pr_default.execute(9, new Object[] {A10288Hp_dia, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T017S11_A10288Hp_dia[0]).after( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T017S11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017S11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017S11_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017S11_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017S11_A483ForColNum[0] == A483ForColNum ) && ( T017S11_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017S11_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T017S11_A10288Hp_dia[0]).before( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T017S11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017S11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T017S11_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017S11_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017S11_A483ForColNum[0] == A483ForColNum ) && ( T017S11_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017S11_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            A10288Hp_dia = T017S11_A10288Hp_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            RcdFound1397 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17S1397( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHp_dia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17S1397( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1397 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) )
            {
               A10288Hp_dia = Z10288Hp_dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtHp_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17S1397( ) ;
               GX_FocusControl = edtHp_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHp_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17S1397( ) ;
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
                  GX_FocusControl = edtHp_dia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17S1397( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) )
      {
         A10288Hp_dia = Z10288Hp_dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtHp_dia_Internalname ;
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
      getKey17S1397( ) ;
      if ( RcdFound1397 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) )
         {
            A10288Hp_dia = Z10288Hp_dia ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( GXutil.strcmp(A9766ForProC, Z9766ForProC) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10288Hp_dia), GXutil.resetTime(Z10288Hp_dia)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0200");
      GX_FocusControl = edtHp_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_17S0( ) ;
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
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHp_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart17S1397( ) ;
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHp_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17S1397( ) ;
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
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHp_ult_Internalname ;
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
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHp_ult_Internalname ;
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
      scanStart17S1397( ) ;
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1397 != 0 )
         {
            scanNext17S1397( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHp_ult_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd17S1397( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17S1397( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017S4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0200"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10289Hp_ult != T017S4_A10289Hp_ult[0] ) )
         {
            if ( Z10289Hp_ult != T017S4_A10289Hp_ult[0] )
            {
               GXutil.writeLogln("ttr0200:[seudo value changed for attri]"+"Hp_ult");
               GXutil.writeLogRaw("Old: ",Z10289Hp_ult);
               GXutil.writeLogRaw("Current: ",T017S4_A10289Hp_ult[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0200"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17S1397( )
   {
      beforeValidate17S1397( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17S1397( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17S1397( 0) ;
         checkOptimisticConcurrency17S1397( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17S1397( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17S1397( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017S12 */
                  pr_default.execute(10, new Object[] {A10288Hp_dia, Boolean.valueOf(n10289Hp_ult), Integer.valueOf(A10289Hp_ult), A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), A9766ForProC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0200");
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
                        processLevel17S1397( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17S0( ) ;
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
            load17S1397( ) ;
         }
         endLevel17S1397( ) ;
      }
      closeExtendedTableCursors17S1397( ) ;
   }

   public void update17S1397( )
   {
      beforeValidate17S1397( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17S1397( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17S1397( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17S1397( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17S1397( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017S13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n10289Hp_ult), Integer.valueOf(A10289Hp_ult), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0200");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0200"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate17S1397( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17S1397( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17S0( ) ;
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
         endLevel17S1397( ) ;
      }
      closeExtendedTableCursors17S1397( ) ;
   }

   public void deferredUpdate17S1397( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17S1397( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17S1397( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17S1397( ) ;
         afterConfirm17S1397( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17S1397( ) ;
            if ( AnyError == 0 )
            {
               scanStart17S1398( ) ;
               while ( RcdFound1398 != 0 )
               {
                  getByPrimaryKey17S1398( ) ;
                  delete17S1398( ) ;
                  scanNext17S1398( ) ;
               }
               scanEnd17S1398( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017S14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0200");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1397 == 0 )
                        {
                           initAll17S1397( ) ;
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
                        resetCaption17S0( ) ;
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
      sMode1397 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17S1397( ) ;
      Gx_mode = sMode1397 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17S1397( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017S15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0203", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T017S16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0202", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel17S1398( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow17S1398( ) ;
         if ( ( nRcdExists_1398 != 0 ) || ( nIsMod_1398 != 0 ) )
         {
            standaloneNotModal17S1398( ) ;
            getKey17S1398( ) ;
            if ( ( nRcdExists_1398 == 0 ) && ( nRcdDeleted_1398 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17S1398( ) ;
            }
            else
            {
               if ( RcdFound1398 != 0 )
               {
                  if ( ( nRcdDeleted_1398 != 0 ) && ( nRcdExists_1398 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17S1398( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1398 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17S1398( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1398 == 0 )
                  {
                     GXCCtl = "HP_LIN_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHp_lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1398_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_lin_Internalname, GXutil.ltrim( localUtil.ntoc( A10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_pk_Internalname, GXutil.ltrim( localUtil.ntoc( A10291Hp_pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_pm_Internalname, GXutil.ltrim( localUtil.ntoc( A10292Hp_pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Term_Internalname, GXutil.rtrim( A10293Hp_Term)) ;
         httpContext.changePostValue( edtHp_usu_Internalname, GXutil.rtrim( A10294Hp_usu)) ;
         httpContext.changePostValue( edtHp_ddhh_Internalname, localUtil.ttoc( A10295Hp_ddhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10290Hp_lin_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10291Hp_pk_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10291Hp_pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10292Hp_pm_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10292Hp_pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10293Hp_Term_"+sGXsfl_70_idx, GXutil.rtrim( Z10293Hp_Term)) ;
         httpContext.changePostValue( "ZT_"+"Z10294Hp_usu_"+sGXsfl_70_idx, GXutil.rtrim( Z10294Hp_usu)) ;
         httpContext.changePostValue( "ZT_"+"Z10295Hp_ddhh_"+sGXsfl_70_idx, localUtil.ttoc( Z10295Hp_ddhh, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1398_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1398_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1398_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1398 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1398_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1398_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_PM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_TERM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Term_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_USU_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_DDHH_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17S1398( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1398 = (short)(0) ;
      nIsMod_1398 = (short)(0) ;
      nRcdDeleted_1398 = (short)(0) ;
   }

   public void processLevel17S1397( )
   {
      /* Save parent mode. */
      sMode1397 = Gx_mode ;
      processNestedLevel17S1398( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1397 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17S1397( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17S1397( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0200");
         if ( AnyError == 0 )
         {
            confirmValues17S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0200");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17S1397( )
   {
      /* Scan By routine */
      /* Using cursor T017S17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1397 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1397 = (short)(1) ;
         A10288Hp_dia = T017S17_A10288Hp_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17S1397( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1397 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1397 = (short)(1) ;
         A10288Hp_dia = T017S17_A10288Hp_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
      }
   }

   public void scanEnd17S1397( )
   {
      pr_default.close(15);
   }

   public void afterConfirm17S1397( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17S1397( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17S1397( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17S1397( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17S1397( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17S1397( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17S1397( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
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
      edtForProC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForProC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForProC_Enabled), 5, 0), true);
      edtHp_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_dia_Enabled), 5, 0), true);
      edtHp_ult_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_ult_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_ult_Enabled), 5, 0), true);
   }

   public void zm17S1398( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10291Hp_pk = T017S3_A10291Hp_pk[0] ;
            Z10292Hp_pm = T017S3_A10292Hp_pm[0] ;
            Z10293Hp_Term = T017S3_A10293Hp_Term[0] ;
            Z10294Hp_usu = T017S3_A10294Hp_usu[0] ;
            Z10295Hp_ddhh = T017S3_A10295Hp_ddhh[0] ;
         }
         else
         {
            Z10291Hp_pk = A10291Hp_pk ;
            Z10292Hp_pm = A10292Hp_pm ;
            Z10293Hp_Term = A10293Hp_Term ;
            Z10294Hp_usu = A10294Hp_usu ;
            Z10295Hp_ddhh = A10295Hp_ddhh ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z10290Hp_lin = A10290Hp_lin ;
         Z10291Hp_pk = A10291Hp_pk ;
         Z10292Hp_pm = A10292Hp_pm ;
         Z10293Hp_Term = A10293Hp_Term ;
         Z10294Hp_usu = A10294Hp_usu ;
         Z10295Hp_ddhh = A10295Hp_ddhh ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal17S1398( )
   {
   }

   public void standaloneModal17S1398( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHp_lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHp_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtHp_lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHp_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load17S1398( )
   {
      /* Using cursor T017S18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1398 = (short)(1) ;
         A10291Hp_pk = T017S18_A10291Hp_pk[0] ;
         n10291Hp_pk = T017S18_n10291Hp_pk[0] ;
         A10292Hp_pm = T017S18_A10292Hp_pm[0] ;
         n10292Hp_pm = T017S18_n10292Hp_pm[0] ;
         A10293Hp_Term = T017S18_A10293Hp_Term[0] ;
         n10293Hp_Term = T017S18_n10293Hp_Term[0] ;
         A10294Hp_usu = T017S18_A10294Hp_usu[0] ;
         n10294Hp_usu = T017S18_n10294Hp_usu[0] ;
         A10295Hp_ddhh = T017S18_A10295Hp_ddhh[0] ;
         n10295Hp_ddhh = T017S18_n10295Hp_ddhh[0] ;
         zm17S1398( -4) ;
      }
      pr_default.close(16);
      onLoadActions17S1398( ) ;
   }

   public void onLoadActions17S1398( )
   {
   }

   public void checkExtendedTable17S1398( )
   {
      nIsDirty_1398 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal17S1398( ) ;
   }

   public void closeExtendedTableCursors17S1398( )
   {
   }

   public void enableDisable17S1398( )
   {
   }

   public void getKey17S1398( )
   {
      /* Using cursor T017S19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1398 = (short)(1) ;
      }
      else
      {
         RcdFound1398 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey17S1398( )
   {
      /* Using cursor T017S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017S3_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T017S3_A482ForColNom[0], A482ForColNom) == 0 ) && ( T017S3_A483ForColNum[0] == A483ForColNum ) && ( T017S3_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T017S3_A9766ForProC[0], A9766ForProC) == 0 ) && ( GXutil.strcmp(T017S3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017S3_A252CliCod[0] == A252CliCod ) )
      {
         zm17S1398( 4) ;
         RcdFound1398 = (short)(1) ;
         initializeNonKey17S1398( ) ;
         A10290Hp_lin = T017S3_A10290Hp_lin[0] ;
         A10291Hp_pk = T017S3_A10291Hp_pk[0] ;
         n10291Hp_pk = T017S3_n10291Hp_pk[0] ;
         A10292Hp_pm = T017S3_A10292Hp_pm[0] ;
         n10292Hp_pm = T017S3_n10292Hp_pm[0] ;
         A10293Hp_Term = T017S3_A10293Hp_Term[0] ;
         n10293Hp_Term = T017S3_n10293Hp_Term[0] ;
         A10294Hp_usu = T017S3_A10294Hp_usu[0] ;
         n10294Hp_usu = T017S3_n10294Hp_usu[0] ;
         A10295Hp_ddhh = T017S3_A10295Hp_ddhh[0] ;
         n10295Hp_ddhh = T017S3_n10295Hp_ddhh[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z10290Hp_lin = A10290Hp_lin ;
         sMode1398 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17S1398( ) ;
         load17S1398( ) ;
         Gx_mode = sMode1398 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1398 = (short)(0) ;
         initializeNonKey17S1398( ) ;
         sMode1398 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17S1398( ) ;
         Gx_mode = sMode1398 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17S1398( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17S1398( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017S2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0201"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10291Hp_pk, T017S2_A10291Hp_pk[0]) != 0 ) || ( DecimalUtil.compareTo(Z10292Hp_pm, T017S2_A10292Hp_pm[0]) != 0 ) || ( GXutil.strcmp(Z10293Hp_Term, T017S2_A10293Hp_Term[0]) != 0 ) || ( GXutil.strcmp(Z10294Hp_usu, T017S2_A10294Hp_usu[0]) != 0 ) || !( GXutil.dateCompare(Z10295Hp_ddhh, T017S2_A10295Hp_ddhh[0]) ) )
         {
            if ( DecimalUtil.compareTo(Z10291Hp_pk, T017S2_A10291Hp_pk[0]) != 0 )
            {
               GXutil.writeLogln("ttr0200:[seudo value changed for attri]"+"Hp_pk");
               GXutil.writeLogRaw("Old: ",Z10291Hp_pk);
               GXutil.writeLogRaw("Current: ",T017S2_A10291Hp_pk[0]);
            }
            if ( DecimalUtil.compareTo(Z10292Hp_pm, T017S2_A10292Hp_pm[0]) != 0 )
            {
               GXutil.writeLogln("ttr0200:[seudo value changed for attri]"+"Hp_pm");
               GXutil.writeLogRaw("Old: ",Z10292Hp_pm);
               GXutil.writeLogRaw("Current: ",T017S2_A10292Hp_pm[0]);
            }
            if ( GXutil.strcmp(Z10293Hp_Term, T017S2_A10293Hp_Term[0]) != 0 )
            {
               GXutil.writeLogln("ttr0200:[seudo value changed for attri]"+"Hp_Term");
               GXutil.writeLogRaw("Old: ",Z10293Hp_Term);
               GXutil.writeLogRaw("Current: ",T017S2_A10293Hp_Term[0]);
            }
            if ( GXutil.strcmp(Z10294Hp_usu, T017S2_A10294Hp_usu[0]) != 0 )
            {
               GXutil.writeLogln("ttr0200:[seudo value changed for attri]"+"Hp_usu");
               GXutil.writeLogRaw("Old: ",Z10294Hp_usu);
               GXutil.writeLogRaw("Current: ",T017S2_A10294Hp_usu[0]);
            }
            if ( !( GXutil.dateCompare(Z10295Hp_ddhh, T017S2_A10295Hp_ddhh[0]) ) )
            {
               GXutil.writeLogln("ttr0200:[seudo value changed for attri]"+"Hp_ddhh");
               GXutil.writeLogRaw("Old: ",Z10295Hp_ddhh);
               GXutil.writeLogRaw("Current: ",T017S2_A10295Hp_ddhh[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0201"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17S1398( )
   {
      beforeValidate17S1398( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17S1398( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17S1398( 0) ;
         checkOptimisticConcurrency17S1398( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17S1398( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17S1398( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017S20 */
                  pr_default.execute(18, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin), Boolean.valueOf(n10291Hp_pk), A10291Hp_pk, Boolean.valueOf(n10292Hp_pm), A10292Hp_pm, Boolean.valueOf(n10293Hp_Term), A10293Hp_Term, Boolean.valueOf(n10294Hp_usu), A10294Hp_usu, Boolean.valueOf(n10295Hp_ddhh), A10295Hp_ddhh, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0201");
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
            load17S1398( ) ;
         }
         endLevel17S1398( ) ;
      }
      closeExtendedTableCursors17S1398( ) ;
   }

   public void update17S1398( )
   {
      beforeValidate17S1398( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17S1398( ) ;
      }
      if ( ( nIsMod_1398 != 0 ) || ( nIsDirty_1398 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17S1398( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17S1398( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17S1398( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017S21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n10291Hp_pk), A10291Hp_pk, Boolean.valueOf(n10292Hp_pm), A10292Hp_pm, Boolean.valueOf(n10293Hp_Term), A10293Hp_Term, Boolean.valueOf(n10294Hp_usu), A10294Hp_usu, Boolean.valueOf(n10295Hp_ddhh), A10295Hp_ddhh, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0201");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0201"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17S1398( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17S1398( ) ;
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
            endLevel17S1398( ) ;
         }
      }
      closeExtendedTableCursors17S1398( ) ;
   }

   public void deferredUpdate17S1398( )
   {
   }

   public void delete17S1398( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17S1398( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17S1398( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17S1398( ) ;
         afterConfirm17S1398( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17S1398( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017S22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0201");
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
      sMode1398 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17S1398( ) ;
      Gx_mode = sMode1398 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17S1398( )
   {
      standaloneModal17S1398( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017S23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10290Hp_lin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0202", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel17S1398( )
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

   public void scanStart17S1398( )
   {
      /* Scan By routine */
      /* Using cursor T017S24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      RcdFound1398 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1398 = (short)(1) ;
         A10290Hp_lin = T017S24_A10290Hp_lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17S1398( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1398 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1398 = (short)(1) ;
         A10290Hp_lin = T017S24_A10290Hp_lin[0] ;
      }
   }

   public void scanEnd17S1398( )
   {
      pr_default.close(22);
   }

   public void afterConfirm17S1398( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17S1398( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17S1398( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17S1398( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17S1398( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17S1398( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17S1398( )
   {
      edtHp_lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_pk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_pk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pk_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_pm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_pm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_pm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_Term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Term_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_usu_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_ddhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_ddhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_ddhh_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes17S1398( )
   {
   }

   public void send_integrity_lvl_hashes17S1397( )
   {
   }

   public void subsflControlProps_701398( )
   {
      edtavnRcdDeleted_1398_Internalname = "vNRCDDELETED_1398_"+sGXsfl_70_idx ;
      edtHp_lin_Internalname = "HP_LIN_"+sGXsfl_70_idx ;
      edtHp_pk_Internalname = "HP_PK_"+sGXsfl_70_idx ;
      edtHp_pm_Internalname = "HP_PM_"+sGXsfl_70_idx ;
      edtHp_Term_Internalname = "HP_TERM_"+sGXsfl_70_idx ;
      edtHp_usu_Internalname = "HP_USU_"+sGXsfl_70_idx ;
      edtHp_ddhh_Internalname = "HP_DDHH_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701398( )
   {
      edtavnRcdDeleted_1398_Internalname = "vNRCDDELETED_1398_"+sGXsfl_70_fel_idx ;
      edtHp_lin_Internalname = "HP_LIN_"+sGXsfl_70_fel_idx ;
      edtHp_pk_Internalname = "HP_PK_"+sGXsfl_70_fel_idx ;
      edtHp_pm_Internalname = "HP_PM_"+sGXsfl_70_fel_idx ;
      edtHp_Term_Internalname = "HP_TERM_"+sGXsfl_70_fel_idx ;
      edtHp_usu_Internalname = "HP_USU_"+sGXsfl_70_fel_idx ;
      edtHp_ddhh_Internalname = "HP_DDHH_"+sGXsfl_70_fel_idx ;
   }

   public void addRow17S1398( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701398( ) ;
      sendRow17S1398( ) ;
   }

   public void sendRow17S1398( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1398_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1398_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1398), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1398), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1398_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1398_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_lin_Internalname,GXutil.ltrim( localUtil.ntoc( A10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10290Hp_lin), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_pk_Internalname,GXutil.ltrim( localUtil.ntoc( A10291Hp_pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHp_pk_Enabled!=0) ? localUtil.format( A10291Hp_pk, "ZZZZZ9.99999") : localUtil.format( A10291Hp_pk, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_pk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_pk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_pm_Internalname,GXutil.ltrim( localUtil.ntoc( A10292Hp_pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHp_pm_Enabled!=0) ? localUtil.format( A10292Hp_pm, "ZZZZZ9.99999") : localUtil.format( A10292Hp_pm, "ZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_pm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_pm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_Term_Internalname,GXutil.rtrim( A10293Hp_Term),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_Term_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_Term_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_usu_Internalname,GXutil.rtrim( A10294Hp_usu),GXutil.rtrim( localUtil.format( A10294Hp_usu, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_usu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_usu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1398_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_ddhh_Internalname,localUtil.ttoc( A10295Hp_ddhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10295Hp_ddhh, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_ddhh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_ddhh_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17S1398( ) ;
      GXCCtl = "Z10290Hp_lin_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10290Hp_lin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10291Hp_pk_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10291Hp_pk, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10292Hp_pm_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10292Hp_pm, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10293Hp_Term_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10293Hp_Term));
      GXCCtl = "Z10294Hp_usu_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10294Hp_usu));
      GXCCtl = "Z10295Hp_ddhh_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10295Hp_ddhh, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1398_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1398_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1398_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1398, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1398_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1398_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_LIN_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_PK_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pk_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_PM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_TERM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Term_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_USU_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_DDHH_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhh_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17S1398( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701398( ) ;
      edtavnRcdDeleted_1398_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1398_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_LIN_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_pk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PK_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_pm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_PM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_Term_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_TERM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_USU_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_ddhh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_DDHH_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1398_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1398_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1398");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1398_Internalname ;
         wbErr = true ;
         nRcdDeleted_1398 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1398 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1398_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHp_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHp_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HP_LIN_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_lin_Internalname ;
         wbErr = true ;
         A10290Hp_lin = 0 ;
      }
      else
      {
         A10290Hp_lin = (int)(localUtil.ctol( httpContext.cgiGet( edtHp_lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHp_pk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHp_pk_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "HP_PK_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_pk_Internalname ;
         wbErr = true ;
         A10291Hp_pk = DecimalUtil.ZERO ;
         n10291Hp_pk = false ;
      }
      else
      {
         A10291Hp_pk = localUtil.ctond( httpContext.cgiGet( edtHp_pk_Internalname)) ;
         n10291Hp_pk = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHp_pm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHp_pm_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
      {
         GXCCtl = "HP_PM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_pm_Internalname ;
         wbErr = true ;
         A10292Hp_pm = DecimalUtil.ZERO ;
         n10292Hp_pm = false ;
      }
      else
      {
         A10292Hp_pm = localUtil.ctond( httpContext.cgiGet( edtHp_pm_Internalname)) ;
         n10292Hp_pm = false ;
      }
      A10293Hp_Term = httpContext.cgiGet( edtHp_Term_Internalname) ;
      n10293Hp_Term = false ;
      A10294Hp_usu = GXutil.upper( httpContext.cgiGet( edtHp_usu_Internalname)) ;
      n10294Hp_usu = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHp_ddhh_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HP_DDHH_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_ddhh_Internalname ;
         wbErr = true ;
         A10295Hp_ddhh = GXutil.resetTime( GXutil.nullDate() );
         n10295Hp_ddhh = false ;
      }
      else
      {
         A10295Hp_ddhh = localUtil.ctot( httpContext.cgiGet( edtHp_ddhh_Internalname)) ;
         n10295Hp_ddhh = false ;
      }
      GXCCtl = "Z10290Hp_lin_" + sGXsfl_70_idx ;
      Z10290Hp_lin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10291Hp_pk_" + sGXsfl_70_idx ;
      Z10291Hp_pk = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10292Hp_pm_" + sGXsfl_70_idx ;
      Z10292Hp_pm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10293Hp_Term_" + sGXsfl_70_idx ;
      Z10293Hp_Term = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10294Hp_usu_" + sGXsfl_70_idx ;
      Z10294Hp_usu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10295Hp_ddhh_" + sGXsfl_70_idx ;
      Z10295Hp_ddhh = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_1398_" + sGXsfl_70_idx ;
      nRcdDeleted_1398 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1398_" + sGXsfl_70_idx ;
      nRcdExists_1398 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1398_" + sGXsfl_70_idx ;
      nIsMod_1398 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHp_lin_Enabled = edtHp_lin_Enabled ;
   }

   public void confirmValues17S0( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701398( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701398( ) ;
         httpContext.changePostValue( "Z10290Hp_lin_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10290Hp_lin_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10290Hp_lin_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10291Hp_pk_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10291Hp_pk_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10291Hp_pk_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10292Hp_pm_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10292Hp_pm_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10292Hp_pm_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10293Hp_Term_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10293Hp_Term_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10293Hp_Term_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10294Hp_usu_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10294Hp_usu_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10294Hp_usu_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10295Hp_ddhh_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10295Hp_ddhh_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10295Hp_ddhh_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0200", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10288Hp_dia", localUtil.dtoc( Z10288Hp_dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10289Hp_ult", GXutil.ltrim( localUtil.ntoc( Z10289Hp_ult, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nGXsfl_70_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.ttr0200", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"})  ;
   }

   public String getPgmname( )
   {
      return "TTR0200" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO PRECIOS", "") ;
   }

   public void initializeNonKey17S1397( )
   {
      A10289Hp_ult = 0 ;
      n10289Hp_ult = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10289Hp_ult", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10289Hp_ult), 6, 0));
      Z10289Hp_ult = 0 ;
   }

   public void initAll17S1397( )
   {
      A10288Hp_dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
      initializeNonKey17S1397( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17S1398( )
   {
      A10291Hp_pk = DecimalUtil.ZERO ;
      n10291Hp_pk = false ;
      A10292Hp_pm = DecimalUtil.ZERO ;
      n10292Hp_pm = false ;
      A10293Hp_Term = "" ;
      n10293Hp_Term = false ;
      A10294Hp_usu = "" ;
      n10294Hp_usu = false ;
      A10295Hp_ddhh = GXutil.resetTime( GXutil.nullDate() );
      n10295Hp_ddhh = false ;
      Z10291Hp_pk = DecimalUtil.ZERO ;
      Z10292Hp_pm = DecimalUtil.ZERO ;
      Z10293Hp_Term = "" ;
      Z10294Hp_usu = "" ;
      Z10295Hp_ddhh = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll17S1398( )
   {
      A10290Hp_lin = 0 ;
      initializeNonKey17S1398( ) ;
   }

   public void standaloneModalInsert17S1398( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155279", true, true);
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
      httpContext.AddJavascriptSource("ttr0200.js", "?2026824155279", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1398( )
   {
      edtHp_lin_Enabled = defedtHp_lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_lin_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1398, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1398_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10290Hp_lin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10291Hp_pk, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pk_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10292Hp_pm, (byte)(12), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_pm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10293Hp_Term));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Term_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10294Hp_usu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10295Hp_ddhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhh_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtForSer_Internalname = "FORSER" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtForProC_Internalname = "FORPROC" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtHp_dia_Internalname = "HP_DIA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHp_ult_Internalname = "HP_ULT" ;
      edtavnRcdDeleted_1398_Internalname = "vNRCDDELETED_1398" ;
      edtHp_lin_Internalname = "HP_LIN" ;
      edtHp_pk_Internalname = "HP_PK" ;
      edtHp_pm_Internalname = "HP_PM" ;
      edtHp_Term_Internalname = "HP_TERM" ;
      edtHp_usu_Internalname = "HP_USU" ;
      edtHp_ddhh_Internalname = "HP_DDHH" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO PRECIOS", "") );
      edtHp_ddhh_Jsonclick = "" ;
      edtHp_usu_Jsonclick = "" ;
      edtHp_Term_Jsonclick = "" ;
      edtHp_pm_Jsonclick = "" ;
      edtHp_pk_Jsonclick = "" ;
      edtHp_lin_Jsonclick = "" ;
      edtavnRcdDeleted_1398_Jsonclick = "" ;
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
      edtHp_ddhh_Enabled = 1 ;
      edtHp_usu_Enabled = 1 ;
      edtHp_Term_Enabled = 1 ;
      edtHp_pm_Enabled = 1 ;
      edtHp_pk_Enabled = 1 ;
      edtHp_lin_Enabled = 1 ;
      edtavnRcdDeleted_1398_Enabled = 1 ;
      edtHp_ult_Jsonclick = "" ;
      edtHp_ult_Backcolor = (int)(0xFFFFFF) ;
      edtHp_ult_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHp_dia_Jsonclick = "" ;
      edtHp_dia_Backcolor = (int)(0xFFFFFF) ;
      edtHp_dia_Enabled = 1 ;
      edtForProC_Jsonclick = "" ;
      edtForProC_Backcolor = (int)(0xFFFFFF) ;
      edtForProC_Enabled = 0 ;
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
      subsflControlProps_701398( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17S1398( ) ;
         standaloneModal17S1398( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17S1398( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701398( ) ;
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
      /* Using cursor T017S25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017S25_A407EmprNom[0] ;
      n407EmprNom = T017S25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T017S26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLARPDCL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPROC");
         AnyError = (short)(1) ;
      }
      pr_default.close(24);
      GX_FocusControl = edtHp_ult_Internalname ;
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

   public void valid_Hp_dia( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10289Hp_ult", GXutil.ltrim( localUtil.ntoc( A10289Hp_ult, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9766ForProC", GXutil.rtrim( Z9766ForProC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10288Hp_dia", localUtil.format(Z10288Hp_dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10289Hp_ult", GXutil.ltrim( localUtil.ntoc( Z10289Hp_ult, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_FORPROC","{handler:'valid_Forproc',iparms:[]");
      setEventMetadata("VALID_FORPROC",",oparms:[]}");
      setEventMetadata("VALID_HP_DIA","{handler:'valid_Hp_dia',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A9766ForProC',fld:'FORPROC',pic:''},{av:'A10288Hp_dia',fld:'HP_DIA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HP_DIA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10289Hp_ult',fld:'HP_ULT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z9766ForProC'},{av:'Z10288Hp_dia'},{av:'Z407EmprNom'},{av:'Z10289Hp_ult'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HP_LIN","{handler:'valid_Hp_lin',iparms:[]");
      setEventMetadata("VALID_HP_LIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hp_ddhh',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(24);
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
      Z10288Hp_dia = GXutil.nullDate() ;
      Z10291Hp_pk = DecimalUtil.ZERO ;
      Z10292Hp_pm = DecimalUtil.ZERO ;
      Z10293Hp_Term = "" ;
      Z10294Hp_usu = "" ;
      Z10295Hp_ddhh = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A9766ForProC = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A10288Hp_dia = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1398 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1397 = "" ;
      GXCCtl = "" ;
      A10291Hp_pk = DecimalUtil.ZERO ;
      A10292Hp_pm = DecimalUtil.ZERO ;
      A10293Hp_Term = "" ;
      A10294Hp_usu = "" ;
      A10295Hp_ddhh = GXutil.resetTime( GXutil.nullDate() );
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
      T017S6_A407EmprNom = new String[] {""} ;
      T017S6_n407EmprNom = new boolean[] {false} ;
      T017S7_A396EmprCod = new String[] {""} ;
      T017S8_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S8_A407EmprNom = new String[] {""} ;
      T017S8_n407EmprNom = new boolean[] {false} ;
      T017S8_A10289Hp_ult = new int[1] ;
      T017S8_n10289Hp_ult = new boolean[] {false} ;
      T017S8_A396EmprCod = new String[] {""} ;
      T017S8_A252CliCod = new int[1] ;
      T017S8_A831TipColCod = new byte[1] ;
      T017S8_A494ForSer = new String[] {""} ;
      T017S8_A482ForColNom = new String[] {""} ;
      T017S8_A483ForColNum = new int[1] ;
      T017S8_A9766ForProC = new String[] {""} ;
      T017S9_A396EmprCod = new String[] {""} ;
      T017S9_A252CliCod = new int[1] ;
      T017S9_A494ForSer = new String[] {""} ;
      T017S9_A482ForColNom = new String[] {""} ;
      T017S9_A483ForColNum = new int[1] ;
      T017S9_A831TipColCod = new byte[1] ;
      T017S9_A9766ForProC = new String[] {""} ;
      T017S9_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S5_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S5_A10289Hp_ult = new int[1] ;
      T017S5_n10289Hp_ult = new boolean[] {false} ;
      T017S5_A396EmprCod = new String[] {""} ;
      T017S5_A252CliCod = new int[1] ;
      T017S5_A831TipColCod = new byte[1] ;
      T017S5_A494ForSer = new String[] {""} ;
      T017S5_A482ForColNom = new String[] {""} ;
      T017S5_A483ForColNum = new int[1] ;
      T017S5_A9766ForProC = new String[] {""} ;
      T017S10_A396EmprCod = new String[] {""} ;
      T017S10_A252CliCod = new int[1] ;
      T017S10_A494ForSer = new String[] {""} ;
      T017S10_A482ForColNom = new String[] {""} ;
      T017S10_A483ForColNum = new int[1] ;
      T017S10_A831TipColCod = new byte[1] ;
      T017S10_A9766ForProC = new String[] {""} ;
      T017S10_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S11_A396EmprCod = new String[] {""} ;
      T017S11_A252CliCod = new int[1] ;
      T017S11_A494ForSer = new String[] {""} ;
      T017S11_A482ForColNom = new String[] {""} ;
      T017S11_A483ForColNum = new int[1] ;
      T017S11_A831TipColCod = new byte[1] ;
      T017S11_A9766ForProC = new String[] {""} ;
      T017S11_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S4_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S4_A10289Hp_ult = new int[1] ;
      T017S4_n10289Hp_ult = new boolean[] {false} ;
      T017S4_A396EmprCod = new String[] {""} ;
      T017S4_A252CliCod = new int[1] ;
      T017S4_A831TipColCod = new byte[1] ;
      T017S4_A494ForSer = new String[] {""} ;
      T017S4_A482ForColNom = new String[] {""} ;
      T017S4_A483ForColNum = new int[1] ;
      T017S4_A9766ForProC = new String[] {""} ;
      T017S15_A396EmprCod = new String[] {""} ;
      T017S15_A252CliCod = new int[1] ;
      T017S15_A494ForSer = new String[] {""} ;
      T017S15_A482ForColNom = new String[] {""} ;
      T017S15_A483ForColNum = new int[1] ;
      T017S15_A831TipColCod = new byte[1] ;
      T017S15_A9766ForProC = new String[] {""} ;
      T017S15_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S15_A10393Hp_LinM = new int[1] ;
      T017S16_A396EmprCod = new String[] {""} ;
      T017S16_A252CliCod = new int[1] ;
      T017S16_A494ForSer = new String[] {""} ;
      T017S16_A482ForColNom = new String[] {""} ;
      T017S16_A483ForColNum = new int[1] ;
      T017S16_A831TipColCod = new byte[1] ;
      T017S16_A9766ForProC = new String[] {""} ;
      T017S16_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S16_A10290Hp_lin = new int[1] ;
      T017S16_A10296Hp_Ld = new short[1] ;
      T017S17_A396EmprCod = new String[] {""} ;
      T017S17_A252CliCod = new int[1] ;
      T017S17_A494ForSer = new String[] {""} ;
      T017S17_A482ForColNom = new String[] {""} ;
      T017S17_A483ForColNum = new int[1] ;
      T017S17_A831TipColCod = new byte[1] ;
      T017S17_A9766ForProC = new String[] {""} ;
      T017S17_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S18_A494ForSer = new String[] {""} ;
      T017S18_A482ForColNom = new String[] {""} ;
      T017S18_A483ForColNum = new int[1] ;
      T017S18_A831TipColCod = new byte[1] ;
      T017S18_A9766ForProC = new String[] {""} ;
      T017S18_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S18_A10290Hp_lin = new int[1] ;
      T017S18_A10291Hp_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017S18_n10291Hp_pk = new boolean[] {false} ;
      T017S18_A10292Hp_pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017S18_n10292Hp_pm = new boolean[] {false} ;
      T017S18_A10293Hp_Term = new String[] {""} ;
      T017S18_n10293Hp_Term = new boolean[] {false} ;
      T017S18_A10294Hp_usu = new String[] {""} ;
      T017S18_n10294Hp_usu = new boolean[] {false} ;
      T017S18_A10295Hp_ddhh = new java.util.Date[] {GXutil.nullDate()} ;
      T017S18_n10295Hp_ddhh = new boolean[] {false} ;
      T017S18_A396EmprCod = new String[] {""} ;
      T017S18_A252CliCod = new int[1] ;
      T017S19_A396EmprCod = new String[] {""} ;
      T017S19_A252CliCod = new int[1] ;
      T017S19_A494ForSer = new String[] {""} ;
      T017S19_A482ForColNom = new String[] {""} ;
      T017S19_A483ForColNum = new int[1] ;
      T017S19_A831TipColCod = new byte[1] ;
      T017S19_A9766ForProC = new String[] {""} ;
      T017S19_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S19_A10290Hp_lin = new int[1] ;
      T017S3_A494ForSer = new String[] {""} ;
      T017S3_A482ForColNom = new String[] {""} ;
      T017S3_A483ForColNum = new int[1] ;
      T017S3_A831TipColCod = new byte[1] ;
      T017S3_A9766ForProC = new String[] {""} ;
      T017S3_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S3_A10290Hp_lin = new int[1] ;
      T017S3_A10291Hp_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017S3_n10291Hp_pk = new boolean[] {false} ;
      T017S3_A10292Hp_pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017S3_n10292Hp_pm = new boolean[] {false} ;
      T017S3_A10293Hp_Term = new String[] {""} ;
      T017S3_n10293Hp_Term = new boolean[] {false} ;
      T017S3_A10294Hp_usu = new String[] {""} ;
      T017S3_n10294Hp_usu = new boolean[] {false} ;
      T017S3_A10295Hp_ddhh = new java.util.Date[] {GXutil.nullDate()} ;
      T017S3_n10295Hp_ddhh = new boolean[] {false} ;
      T017S3_A396EmprCod = new String[] {""} ;
      T017S3_A252CliCod = new int[1] ;
      T017S2_A494ForSer = new String[] {""} ;
      T017S2_A482ForColNom = new String[] {""} ;
      T017S2_A483ForColNum = new int[1] ;
      T017S2_A831TipColCod = new byte[1] ;
      T017S2_A9766ForProC = new String[] {""} ;
      T017S2_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S2_A10290Hp_lin = new int[1] ;
      T017S2_A10291Hp_pk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017S2_n10291Hp_pk = new boolean[] {false} ;
      T017S2_A10292Hp_pm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017S2_n10292Hp_pm = new boolean[] {false} ;
      T017S2_A10293Hp_Term = new String[] {""} ;
      T017S2_n10293Hp_Term = new boolean[] {false} ;
      T017S2_A10294Hp_usu = new String[] {""} ;
      T017S2_n10294Hp_usu = new boolean[] {false} ;
      T017S2_A10295Hp_ddhh = new java.util.Date[] {GXutil.nullDate()} ;
      T017S2_n10295Hp_ddhh = new boolean[] {false} ;
      T017S2_A396EmprCod = new String[] {""} ;
      T017S2_A252CliCod = new int[1] ;
      T017S23_A396EmprCod = new String[] {""} ;
      T017S23_A252CliCod = new int[1] ;
      T017S23_A494ForSer = new String[] {""} ;
      T017S23_A482ForColNom = new String[] {""} ;
      T017S23_A483ForColNum = new int[1] ;
      T017S23_A831TipColCod = new byte[1] ;
      T017S23_A9766ForProC = new String[] {""} ;
      T017S23_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S23_A10290Hp_lin = new int[1] ;
      T017S23_A10296Hp_Ld = new short[1] ;
      T017S24_A396EmprCod = new String[] {""} ;
      T017S24_A252CliCod = new int[1] ;
      T017S24_A494ForSer = new String[] {""} ;
      T017S24_A482ForColNom = new String[] {""} ;
      T017S24_A483ForColNum = new int[1] ;
      T017S24_A831TipColCod = new byte[1] ;
      T017S24_A9766ForProC = new String[] {""} ;
      T017S24_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017S24_A10290Hp_lin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017S25_A407EmprNom = new String[] {""} ;
      T017S25_n407EmprNom = new boolean[] {false} ;
      T017S26_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ9766ForProC = "" ;
      ZZ10288Hp_dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0200__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0200__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0200__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0200__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0200__default(),
         new Object[] {
             new Object[] {
            T017S2_A494ForSer, T017S2_A482ForColNom, T017S2_A483ForColNum, T017S2_A831TipColCod, T017S2_A9766ForProC, T017S2_A10288Hp_dia, T017S2_A10290Hp_lin, T017S2_A10291Hp_pk, T017S2_n10291Hp_pk, T017S2_A10292Hp_pm,
            T017S2_n10292Hp_pm, T017S2_A10293Hp_Term, T017S2_n10293Hp_Term, T017S2_A10294Hp_usu, T017S2_n10294Hp_usu, T017S2_A10295Hp_ddhh, T017S2_n10295Hp_ddhh, T017S2_A396EmprCod, T017S2_A252CliCod
            }
            , new Object[] {
            T017S3_A494ForSer, T017S3_A482ForColNom, T017S3_A483ForColNum, T017S3_A831TipColCod, T017S3_A9766ForProC, T017S3_A10288Hp_dia, T017S3_A10290Hp_lin, T017S3_A10291Hp_pk, T017S3_n10291Hp_pk, T017S3_A10292Hp_pm,
            T017S3_n10292Hp_pm, T017S3_A10293Hp_Term, T017S3_n10293Hp_Term, T017S3_A10294Hp_usu, T017S3_n10294Hp_usu, T017S3_A10295Hp_ddhh, T017S3_n10295Hp_ddhh, T017S3_A396EmprCod, T017S3_A252CliCod
            }
            , new Object[] {
            T017S4_A10288Hp_dia, T017S4_A10289Hp_ult, T017S4_n10289Hp_ult, T017S4_A396EmprCod, T017S4_A252CliCod, T017S4_A831TipColCod, T017S4_A494ForSer, T017S4_A482ForColNom, T017S4_A483ForColNum, T017S4_A9766ForProC
            }
            , new Object[] {
            T017S5_A10288Hp_dia, T017S5_A10289Hp_ult, T017S5_n10289Hp_ult, T017S5_A396EmprCod, T017S5_A252CliCod, T017S5_A831TipColCod, T017S5_A494ForSer, T017S5_A482ForColNom, T017S5_A483ForColNum, T017S5_A9766ForProC
            }
            , new Object[] {
            T017S6_A407EmprNom, T017S6_n407EmprNom
            }
            , new Object[] {
            T017S7_A396EmprCod
            }
            , new Object[] {
            T017S8_A10288Hp_dia, T017S8_A407EmprNom, T017S8_n407EmprNom, T017S8_A10289Hp_ult, T017S8_n10289Hp_ult, T017S8_A396EmprCod, T017S8_A252CliCod, T017S8_A831TipColCod, T017S8_A494ForSer, T017S8_A482ForColNom,
            T017S8_A483ForColNum, T017S8_A9766ForProC
            }
            , new Object[] {
            T017S9_A396EmprCod, T017S9_A252CliCod, T017S9_A494ForSer, T017S9_A482ForColNom, T017S9_A483ForColNum, T017S9_A831TipColCod, T017S9_A9766ForProC, T017S9_A10288Hp_dia
            }
            , new Object[] {
            T017S10_A396EmprCod, T017S10_A252CliCod, T017S10_A494ForSer, T017S10_A482ForColNom, T017S10_A483ForColNum, T017S10_A831TipColCod, T017S10_A9766ForProC, T017S10_A10288Hp_dia
            }
            , new Object[] {
            T017S11_A396EmprCod, T017S11_A252CliCod, T017S11_A494ForSer, T017S11_A482ForColNom, T017S11_A483ForColNum, T017S11_A831TipColCod, T017S11_A9766ForProC, T017S11_A10288Hp_dia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017S15_A396EmprCod, T017S15_A252CliCod, T017S15_A494ForSer, T017S15_A482ForColNom, T017S15_A483ForColNum, T017S15_A831TipColCod, T017S15_A9766ForProC, T017S15_A10288Hp_dia, T017S15_A10393Hp_LinM
            }
            , new Object[] {
            T017S16_A396EmprCod, T017S16_A252CliCod, T017S16_A494ForSer, T017S16_A482ForColNom, T017S16_A483ForColNum, T017S16_A831TipColCod, T017S16_A9766ForProC, T017S16_A10288Hp_dia, T017S16_A10290Hp_lin, T017S16_A10296Hp_Ld
            }
            , new Object[] {
            T017S17_A396EmprCod, T017S17_A252CliCod, T017S17_A494ForSer, T017S17_A482ForColNom, T017S17_A483ForColNum, T017S17_A831TipColCod, T017S17_A9766ForProC, T017S17_A10288Hp_dia
            }
            , new Object[] {
            T017S18_A494ForSer, T017S18_A482ForColNom, T017S18_A483ForColNum, T017S18_A831TipColCod, T017S18_A9766ForProC, T017S18_A10288Hp_dia, T017S18_A10290Hp_lin, T017S18_A10291Hp_pk, T017S18_n10291Hp_pk, T017S18_A10292Hp_pm,
            T017S18_n10292Hp_pm, T017S18_A10293Hp_Term, T017S18_n10293Hp_Term, T017S18_A10294Hp_usu, T017S18_n10294Hp_usu, T017S18_A10295Hp_ddhh, T017S18_n10295Hp_ddhh, T017S18_A396EmprCod, T017S18_A252CliCod
            }
            , new Object[] {
            T017S19_A396EmprCod, T017S19_A252CliCod, T017S19_A494ForSer, T017S19_A482ForColNom, T017S19_A483ForColNum, T017S19_A831TipColCod, T017S19_A9766ForProC, T017S19_A10288Hp_dia, T017S19_A10290Hp_lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017S23_A396EmprCod, T017S23_A252CliCod, T017S23_A494ForSer, T017S23_A482ForColNom, T017S23_A483ForColNum, T017S23_A831TipColCod, T017S23_A9766ForProC, T017S23_A10288Hp_dia, T017S23_A10290Hp_lin, T017S23_A10296Hp_Ld
            }
            , new Object[] {
            T017S24_A396EmprCod, T017S24_A252CliCod, T017S24_A494ForSer, T017S24_A482ForColNom, T017S24_A483ForColNum, T017S24_A831TipColCod, T017S24_A9766ForProC, T017S24_A10288Hp_dia, T017S24_A10290Hp_lin
            }
            , new Object[] {
            T017S25_A407EmprNom, T017S25_n407EmprNom
            }
            , new Object[] {
            T017S26_A396EmprCod
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
      AV33Pgmname = "TTR0200" ;
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
   private short nRcdDeleted_1398 ;
   private short nRcdExists_1398 ;
   private short nIsMod_1398 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1398 ;
   private short RcdFound1398 ;
   private short nBlankRcdUsr1398 ;
   private short RcdFound1397 ;
   private short nIsDirty_1397 ;
   private short nIsDirty_1398 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z10289Hp_ult ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int Z10290Hp_lin ;
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
   private int edtForSer_Enabled ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Enabled ;
   private int edtForProC_Enabled ;
   private int edtHp_dia_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A10289Hp_ult ;
   private int edtHp_ult_Enabled ;
   private int edtavnRcdDeleted_1398_Enabled ;
   private int edtHp_lin_Enabled ;
   private int edtHp_pk_Enabled ;
   private int edtHp_pm_Enabled ;
   private int edtHp_Term_Enabled ;
   private int edtHp_usu_Enabled ;
   private int edtHp_ddhh_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10290Hp_lin ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHp_lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHp_ult_Backcolor ;
   private int edtHp_dia_Backcolor ;
   private int edtForProC_Backcolor ;
   private int edtTipColCod_Backcolor ;
   private int edtForColNum_Backcolor ;
   private int edtForColNom_Backcolor ;
   private int edtForSer_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ483ForColNum ;
   private int ZZ10289Hp_ult ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10291Hp_pk ;
   private java.math.BigDecimal Z10292Hp_pm ;
   private java.math.BigDecimal A10291Hp_pk ;
   private java.math.BigDecimal A10292Hp_pm ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOA9766ForProC ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z9766ForProC ;
   private String Z10293Hp_Term ;
   private String Z10294Hp_usu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A9766ForProC ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHp_dia_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtForProC_Internalname ;
   private String edtForProC_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtHp_dia_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHp_ult_Internalname ;
   private String edtHp_ult_Jsonclick ;
   private String sMode1398 ;
   private String edtavnRcdDeleted_1398_Internalname ;
   private String edtHp_lin_Internalname ;
   private String edtHp_pk_Internalname ;
   private String edtHp_pm_Internalname ;
   private String edtHp_Term_Internalname ;
   private String edtHp_usu_Internalname ;
   private String edtHp_ddhh_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1397 ;
   private String GXCCtl ;
   private String A10293Hp_Term ;
   private String A10294Hp_usu ;
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
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1398_Jsonclick ;
   private String edtHp_lin_Jsonclick ;
   private String edtHp_pk_Jsonclick ;
   private String edtHp_pm_Jsonclick ;
   private String edtHp_Term_Jsonclick ;
   private String edtHp_usu_Jsonclick ;
   private String edtHp_ddhh_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ9766ForProC ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10295Hp_ddhh ;
   private java.util.Date A10295Hp_ddhh ;
   private java.util.Date Z10288Hp_dia ;
   private java.util.Date A10288Hp_dia ;
   private java.util.Date ZZ10288Hp_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10289Hp_ult ;
   private boolean returnInSub ;
   private boolean n10291Hp_pk ;
   private boolean n10292Hp_pm ;
   private boolean n10293Hp_Term ;
   private boolean n10294Hp_usu ;
   private boolean n10295Hp_ddhh ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017S6_A407EmprNom ;
   private boolean[] T017S6_n407EmprNom ;
   private String[] T017S7_A396EmprCod ;
   private java.util.Date[] T017S8_A10288Hp_dia ;
   private String[] T017S8_A407EmprNom ;
   private boolean[] T017S8_n407EmprNom ;
   private int[] T017S8_A10289Hp_ult ;
   private boolean[] T017S8_n10289Hp_ult ;
   private String[] T017S8_A396EmprCod ;
   private int[] T017S8_A252CliCod ;
   private byte[] T017S8_A831TipColCod ;
   private String[] T017S8_A494ForSer ;
   private String[] T017S8_A482ForColNom ;
   private int[] T017S8_A483ForColNum ;
   private String[] T017S8_A9766ForProC ;
   private String[] T017S9_A396EmprCod ;
   private int[] T017S9_A252CliCod ;
   private String[] T017S9_A494ForSer ;
   private String[] T017S9_A482ForColNom ;
   private int[] T017S9_A483ForColNum ;
   private byte[] T017S9_A831TipColCod ;
   private String[] T017S9_A9766ForProC ;
   private java.util.Date[] T017S9_A10288Hp_dia ;
   private java.util.Date[] T017S5_A10288Hp_dia ;
   private int[] T017S5_A10289Hp_ult ;
   private boolean[] T017S5_n10289Hp_ult ;
   private String[] T017S5_A396EmprCod ;
   private int[] T017S5_A252CliCod ;
   private byte[] T017S5_A831TipColCod ;
   private String[] T017S5_A494ForSer ;
   private String[] T017S5_A482ForColNom ;
   private int[] T017S5_A483ForColNum ;
   private String[] T017S5_A9766ForProC ;
   private String[] T017S10_A396EmprCod ;
   private int[] T017S10_A252CliCod ;
   private String[] T017S10_A494ForSer ;
   private String[] T017S10_A482ForColNom ;
   private int[] T017S10_A483ForColNum ;
   private byte[] T017S10_A831TipColCod ;
   private String[] T017S10_A9766ForProC ;
   private java.util.Date[] T017S10_A10288Hp_dia ;
   private String[] T017S11_A396EmprCod ;
   private int[] T017S11_A252CliCod ;
   private String[] T017S11_A494ForSer ;
   private String[] T017S11_A482ForColNom ;
   private int[] T017S11_A483ForColNum ;
   private byte[] T017S11_A831TipColCod ;
   private String[] T017S11_A9766ForProC ;
   private java.util.Date[] T017S11_A10288Hp_dia ;
   private java.util.Date[] T017S4_A10288Hp_dia ;
   private int[] T017S4_A10289Hp_ult ;
   private boolean[] T017S4_n10289Hp_ult ;
   private String[] T017S4_A396EmprCod ;
   private int[] T017S4_A252CliCod ;
   private byte[] T017S4_A831TipColCod ;
   private String[] T017S4_A494ForSer ;
   private String[] T017S4_A482ForColNom ;
   private int[] T017S4_A483ForColNum ;
   private String[] T017S4_A9766ForProC ;
   private String[] T017S15_A396EmprCod ;
   private int[] T017S15_A252CliCod ;
   private String[] T017S15_A494ForSer ;
   private String[] T017S15_A482ForColNom ;
   private int[] T017S15_A483ForColNum ;
   private byte[] T017S15_A831TipColCod ;
   private String[] T017S15_A9766ForProC ;
   private java.util.Date[] T017S15_A10288Hp_dia ;
   private int[] T017S15_A10393Hp_LinM ;
   private String[] T017S16_A396EmprCod ;
   private int[] T017S16_A252CliCod ;
   private String[] T017S16_A494ForSer ;
   private String[] T017S16_A482ForColNom ;
   private int[] T017S16_A483ForColNum ;
   private byte[] T017S16_A831TipColCod ;
   private String[] T017S16_A9766ForProC ;
   private java.util.Date[] T017S16_A10288Hp_dia ;
   private int[] T017S16_A10290Hp_lin ;
   private short[] T017S16_A10296Hp_Ld ;
   private String[] T017S17_A396EmprCod ;
   private int[] T017S17_A252CliCod ;
   private String[] T017S17_A494ForSer ;
   private String[] T017S17_A482ForColNom ;
   private int[] T017S17_A483ForColNum ;
   private byte[] T017S17_A831TipColCod ;
   private String[] T017S17_A9766ForProC ;
   private java.util.Date[] T017S17_A10288Hp_dia ;
   private String[] T017S18_A494ForSer ;
   private String[] T017S18_A482ForColNom ;
   private int[] T017S18_A483ForColNum ;
   private byte[] T017S18_A831TipColCod ;
   private String[] T017S18_A9766ForProC ;
   private java.util.Date[] T017S18_A10288Hp_dia ;
   private int[] T017S18_A10290Hp_lin ;
   private java.math.BigDecimal[] T017S18_A10291Hp_pk ;
   private boolean[] T017S18_n10291Hp_pk ;
   private java.math.BigDecimal[] T017S18_A10292Hp_pm ;
   private boolean[] T017S18_n10292Hp_pm ;
   private String[] T017S18_A10293Hp_Term ;
   private boolean[] T017S18_n10293Hp_Term ;
   private String[] T017S18_A10294Hp_usu ;
   private boolean[] T017S18_n10294Hp_usu ;
   private java.util.Date[] T017S18_A10295Hp_ddhh ;
   private boolean[] T017S18_n10295Hp_ddhh ;
   private String[] T017S18_A396EmprCod ;
   private int[] T017S18_A252CliCod ;
   private String[] T017S19_A396EmprCod ;
   private int[] T017S19_A252CliCod ;
   private String[] T017S19_A494ForSer ;
   private String[] T017S19_A482ForColNom ;
   private int[] T017S19_A483ForColNum ;
   private byte[] T017S19_A831TipColCod ;
   private String[] T017S19_A9766ForProC ;
   private java.util.Date[] T017S19_A10288Hp_dia ;
   private int[] T017S19_A10290Hp_lin ;
   private String[] T017S3_A494ForSer ;
   private String[] T017S3_A482ForColNom ;
   private int[] T017S3_A483ForColNum ;
   private byte[] T017S3_A831TipColCod ;
   private String[] T017S3_A9766ForProC ;
   private java.util.Date[] T017S3_A10288Hp_dia ;
   private int[] T017S3_A10290Hp_lin ;
   private java.math.BigDecimal[] T017S3_A10291Hp_pk ;
   private boolean[] T017S3_n10291Hp_pk ;
   private java.math.BigDecimal[] T017S3_A10292Hp_pm ;
   private boolean[] T017S3_n10292Hp_pm ;
   private String[] T017S3_A10293Hp_Term ;
   private boolean[] T017S3_n10293Hp_Term ;
   private String[] T017S3_A10294Hp_usu ;
   private boolean[] T017S3_n10294Hp_usu ;
   private java.util.Date[] T017S3_A10295Hp_ddhh ;
   private boolean[] T017S3_n10295Hp_ddhh ;
   private String[] T017S3_A396EmprCod ;
   private int[] T017S3_A252CliCod ;
   private String[] T017S2_A494ForSer ;
   private String[] T017S2_A482ForColNom ;
   private int[] T017S2_A483ForColNum ;
   private byte[] T017S2_A831TipColCod ;
   private String[] T017S2_A9766ForProC ;
   private java.util.Date[] T017S2_A10288Hp_dia ;
   private int[] T017S2_A10290Hp_lin ;
   private java.math.BigDecimal[] T017S2_A10291Hp_pk ;
   private boolean[] T017S2_n10291Hp_pk ;
   private java.math.BigDecimal[] T017S2_A10292Hp_pm ;
   private boolean[] T017S2_n10292Hp_pm ;
   private String[] T017S2_A10293Hp_Term ;
   private boolean[] T017S2_n10293Hp_Term ;
   private String[] T017S2_A10294Hp_usu ;
   private boolean[] T017S2_n10294Hp_usu ;
   private java.util.Date[] T017S2_A10295Hp_ddhh ;
   private boolean[] T017S2_n10295Hp_ddhh ;
   private String[] T017S2_A396EmprCod ;
   private int[] T017S2_A252CliCod ;
   private String[] T017S23_A396EmprCod ;
   private int[] T017S23_A252CliCod ;
   private String[] T017S23_A494ForSer ;
   private String[] T017S23_A482ForColNom ;
   private int[] T017S23_A483ForColNum ;
   private byte[] T017S23_A831TipColCod ;
   private String[] T017S23_A9766ForProC ;
   private java.util.Date[] T017S23_A10288Hp_dia ;
   private int[] T017S23_A10290Hp_lin ;
   private short[] T017S23_A10296Hp_Ld ;
   private String[] T017S24_A396EmprCod ;
   private int[] T017S24_A252CliCod ;
   private String[] T017S24_A494ForSer ;
   private String[] T017S24_A482ForColNom ;
   private int[] T017S24_A483ForColNum ;
   private byte[] T017S24_A831TipColCod ;
   private String[] T017S24_A9766ForProC ;
   private java.util.Date[] T017S24_A10288Hp_dia ;
   private int[] T017S24_A10290Hp_lin ;
   private String[] T017S25_A407EmprNom ;
   private boolean[] T017S25_n407EmprNom ;
   private String[] T017S26_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0200__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0200__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0200__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0200__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0200__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017S2", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_pk, Hp_pm, Hp_Term, Hp_usu, Hp_ddhh, EmprCod, CliCod FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ?  FOR UPDATE OF Hp_pk, Hp_pm, Hp_Term, Hp_usu, Hp_ddhh NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S3", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_pk, Hp_pm, Hp_Term, Hp_usu, Hp_ddhh, EmprCod, CliCod FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S4", "SELECT Hp_dia, Hp_ult, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?  FOR UPDATE OF Hp_ult NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S5", "SELECT Hp_dia, Hp_ult, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S7", "SELECT EmprCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Hp_dia, T2.EmprNom, TM1.Hp_ult, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.ForProC FROM (TXPTR0200 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.ForProC = ? and TM1.Hp_dia = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.ForProC, TM1.Hp_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE ( Hp_dia > ?) and EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017S11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE ( Hp_dia < ?) and EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ForProC DESC, Hp_dia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017S12", "INSERT INTO TXPTR0200(Hp_dia, Hp_ult, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC, Hp_UltM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPTR0200")
         ,new UpdateCursor("T017S13", "UPDATE TXPTR0200 SET Hp_ult=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?", GX_NOMASK, "TXPTR0200")
         ,new UpdateCursor("T017S14", "DELETE FROM TXPTR0200  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?", GX_NOMASK, "TXPTR0200")
         ,new ForEachCursor("T017S15", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM FROM TXPTR0203 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017S16", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld FROM TXPTR0202 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017S17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S18", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_pk, Hp_pm, Hp_Term, Hp_usu, Hp_ddhh, EmprCod, CliCod FROM TXPTR0201 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_lin = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S19", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017S20", "INSERT INTO TXPTR0201(ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_pk, Hp_pm, Hp_Term, Hp_usu, Hp_ddhh, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0201")
         ,new UpdateCursor("T017S21", "UPDATE TXPTR0201 SET Hp_pk=?, Hp_pm=?, Hp_Term=?, Hp_usu=?, Hp_ddhh=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ?", GX_NOMASK, "TXPTR0201")
         ,new UpdateCursor("T017S22", "DELETE FROM TXPTR0201  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ?", GX_NOMASK, "TXPTR0201")
         ,new ForEachCursor("T017S23", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin, Hp_Ld FROM TXPTR0202 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_lin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017S24", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017S26", "SELECT EmprCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               ((int[]) buf[18])[0] = rslt.getInt(14);
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
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 8);
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 8);
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 16);
               stmt.setString(7, (String)parms[7], 13);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setString(9, (String)parms[9], 8);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 8);
               stmt.setDate(9, (java.util.Date)parms[9]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
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
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 8);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[16], false);
               }
               stmt.setString(13, (String)parms[17], 3);
               stmt.setInt(14, ((Number) parms[18]).intValue());
               return;
            case 19 :
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setString(8, (String)parms[12], 16);
               stmt.setString(9, (String)parms[13], 13);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setByte(11, ((Number) parms[15]).byteValue());
               stmt.setString(12, (String)parms[16], 8);
               stmt.setDate(13, (java.util.Date)parms[17]);
               stmt.setInt(14, ((Number) parms[18]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
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

