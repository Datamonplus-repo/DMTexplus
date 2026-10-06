package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr0203_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MOTIVOS BLOQUEOS PRECIOS", ""), (short)(0)) ;
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

   public ttr0203_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr0203_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0203_impl.class ));
   }

   public ttr0203_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR0203.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "", "", "", "", "", 1, edtForSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "", "", "", "", "", 1, edtForColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "", "", "", "", "", 1, edtForColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Código Tipo Colorante", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipColCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Proceso Produccion", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForProC_Internalname, GXutil.rtrim( A9766ForProC), GXutil.rtrim( localUtil.format( A9766ForProC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForProC_Jsonclick, 0, "", "", "", "", "", 1, edtForProC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Dia Modificacion Precio", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHp_dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHp_dia_Internalname, localUtil.format(A10288Hp_dia, "99/99/99"), localUtil.format( A10288Hp_dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHp_dia_Jsonclick, 0, "", "", "", "", "", 1, edtHp_dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0203.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHp_dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHp_dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTR0203.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Linea Ult marcado", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR0203.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHp_UltM_Internalname, GXutil.ltrim( localUtil.ntoc( A10392Hp_UltM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHp_UltM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10392Hp_UltM), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10392Hp_UltM), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHp_UltM_Jsonclick, 0, "", "", "", "", "", 1, edtHp_UltM_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR0203.htm");
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
         nBlankRcdCount1406 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1406 = (short)(1) ;
            scanStart1811406( ) ;
            while ( RcdFound1406 != 0 )
            {
               init_level_properties1406( ) ;
               getByPrimaryKey1811406( ) ;
               addRow1811406( ) ;
               scanNext1811406( ) ;
            }
            scanEnd1811406( ) ;
            nBlankRcdCount1406 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1811406( ) ;
         standaloneModal1811406( ) ;
         sMode1406 = Gx_mode ;
         while ( nGXsfl_70_idx < nRC_GXsfl_70 )
         {
            bGXsfl_70_Refreshing = true ;
            readRow1811406( ) ;
            edtavnRcdDeleted_1406_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1406_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1406_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1406_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_LinM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_LINM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_LinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_LinM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_Motivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_MOTIVO_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_Motivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Motivo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_TermM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_TERMM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_TermM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_TermM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_UsuM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_USUM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_UsuM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            edtHp_ddhhM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_DDHHM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHp_ddhhM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_ddhhM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
            if ( ( nRcdExists_1406 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1811406( ) ;
            }
            sendRow1811406( ) ;
            bGXsfl_70_Refreshing = false ;
         }
         Gx_mode = sMode1406 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1406 = (short)(5) ;
         nRcdExists_1406 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1811406( ) ;
            while ( RcdFound1406 != 0 )
            {
               sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_701406( ) ;
               init_level_properties1406( ) ;
               standaloneNotModal1811406( ) ;
               getByPrimaryKey1811406( ) ;
               standaloneModal1811406( ) ;
               addRow1811406( ) ;
               scanNext1811406( ) ;
            }
            scanEnd1811406( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1406 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_701406( ) ;
      initAll1811406( ) ;
      init_level_properties1406( ) ;
      nRcdExists_1406 = (short)(0) ;
      nIsMod_1406 = (short)(0) ;
      nRcdDeleted_1406 = (short)(0) ;
      nBlankRcdCount1406 = (short)(nBlankRcdUsr1406+nBlankRcdCount1406) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1406 > 0 )
      {
         standaloneNotModal1811406( ) ;
         standaloneModal1811406( ) ;
         addRow1811406( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHp_LinM_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1406 = (short)(nBlankRcdCount1406-1) ;
      }
      Gx_mode = sMode1406 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR0203.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR0203.htm");
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
      e111812 ();
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
            Z10392Hp_UltM = (int)(localUtil.ctol( httpContext.cgiGet( "Z10392Hp_UltM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHp_UltM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHp_UltM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HP_ULTM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHp_UltM_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10392Hp_UltM = 0 ;
               n10392Hp_UltM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10392Hp_UltM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10392Hp_UltM), 6, 0));
            }
            else
            {
               A10392Hp_UltM = (int)(localUtil.ctol( httpContext.cgiGet( edtHp_UltM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10392Hp_UltM = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10392Hp_UltM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10392Hp_UltM), 6, 0));
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
                        e111812 ();
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
            initAll1811397( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1406_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1406_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      disableAttributes1811397( ) ;
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

   public void confirm_1810( )
   {
      beforeValidate1811397( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1811397( ) ;
         }
         else
         {
            checkExtendedTable1811397( ) ;
            if ( AnyError == 0 )
            {
               zm1811397( 2) ;
               zm1811397( 3) ;
            }
            closeExtendedTableCursors1811397( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1397 = Gx_mode ;
         confirm_1811406( ) ;
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
         confirmValues1810( ) ;
      }
   }

   public void confirm_1811406( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1811406( ) ;
         if ( ( nRcdExists_1406 != 0 ) || ( nIsMod_1406 != 0 ) )
         {
            getKey1811406( ) ;
            if ( ( nRcdExists_1406 == 0 ) && ( nRcdDeleted_1406 == 0 ) )
            {
               if ( RcdFound1406 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1811406( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1811406( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1811406( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HP_LINM_" + sGXsfl_70_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHp_LinM_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1406 != 0 )
               {
                  if ( nRcdDeleted_1406 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1811406( ) ;
                     load1811406( ) ;
                     beforeValidate1811406( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1811406( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1406 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1811406( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1811406( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1811406( ) ;
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
                  if ( nRcdDeleted_1406 == 0 )
                  {
                     GXCCtl = "HP_LINM_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHp_LinM_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1406_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_LinM_Internalname, GXutil.ltrim( localUtil.ntoc( A10393Hp_LinM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Motivo_Internalname, A10394Hp_Motivo) ;
         httpContext.changePostValue( edtHp_TermM_Internalname, GXutil.rtrim( A10395Hp_TermM)) ;
         httpContext.changePostValue( edtHp_UsuM_Internalname, GXutil.rtrim( A10396Hp_UsuM)) ;
         httpContext.changePostValue( edtHp_ddhhM_Internalname, localUtil.ttoc( A10397Hp_ddhhM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10393Hp_LinM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10393Hp_LinM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10394Hp_Motivo_"+sGXsfl_70_idx, Z10394Hp_Motivo) ;
         httpContext.changePostValue( "ZT_"+"Z10395Hp_TermM_"+sGXsfl_70_idx, GXutil.rtrim( Z10395Hp_TermM)) ;
         httpContext.changePostValue( "ZT_"+"Z10396Hp_UsuM_"+sGXsfl_70_idx, GXutil.rtrim( Z10396Hp_UsuM)) ;
         httpContext.changePostValue( "ZT_"+"Z10397Hp_ddhhM_"+sGXsfl_70_idx, localUtil.ttoc( Z10397Hp_ddhhM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1406_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1406_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1406_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1406 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1406_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1406_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_LINM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_LinM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_MOTIVO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Motivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_TERMM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_TermM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_USUM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_UsuM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_DDHHM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhhM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1810( )
   {
   }

   public void e111812( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr0203_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttr0203_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr0203_impl.this.GXt_char1 = GXv_char2[0] ;
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
      ttr0203_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr0203_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr0203_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1811397( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10392Hp_UltM = T01815_A10392Hp_UltM[0] ;
         }
         else
         {
            Z10392Hp_UltM = A10392Hp_UltM ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10288Hp_dia = A10288Hp_dia ;
         Z10392Hp_UltM = A10392Hp_UltM ;
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
      AV33Pgmname = "TTR0203" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01816 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01816_A407EmprNom[0] ;
      n407EmprNom = T01816_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01817 */
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

   public void load1811397( )
   {
      /* Using cursor T01818 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1397 = (short)(1) ;
         A407EmprNom = T01818_A407EmprNom[0] ;
         n407EmprNom = T01818_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10392Hp_UltM = T01818_A10392Hp_UltM[0] ;
         n10392Hp_UltM = T01818_n10392Hp_UltM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10392Hp_UltM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10392Hp_UltM), 6, 0));
         zm1811397( -1) ;
      }
      pr_default.close(6);
      onLoadActions1811397( ) ;
   }

   public void onLoadActions1811397( )
   {
   }

   public void checkExtendedTable1811397( )
   {
      nIsDirty_1397 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1811397( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1811397( )
   {
      /* Using cursor T01819 */
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
      /* Using cursor T01815 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01815_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01815_A252CliCod[0] == A252CliCod ) && ( T01815_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01815_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01815_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01815_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01815_A9766ForProC[0], A9766ForProC) == 0 ) )
      {
         zm1811397( 1) ;
         RcdFound1397 = (short)(1) ;
         A10288Hp_dia = T01815_A10288Hp_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
         A10392Hp_UltM = T01815_A10392Hp_UltM[0] ;
         n10392Hp_UltM = T01815_n10392Hp_UltM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10392Hp_UltM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10392Hp_UltM), 6, 0));
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
         load1811397( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1397 = (short)(0) ;
            initializeNonKey1811397( ) ;
         }
         Gx_mode = sMode1397 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1397 = (short)(0) ;
         initializeNonKey1811397( ) ;
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
      getKey1811397( ) ;
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
      /* Using cursor T018110 */
      pr_default.execute(8, new Object[] {A10288Hp_dia, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.resetTime(T018110_A10288Hp_dia[0]).before( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T018110_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018110_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018110_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T018110_A482ForColNom[0], A482ForColNom) == 0 ) && ( T018110_A483ForColNum[0] == A483ForColNum ) && ( T018110_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T018110_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.resetTime(T018110_A10288Hp_dia[0]).after( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T018110_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018110_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018110_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T018110_A482ForColNom[0], A482ForColNom) == 0 ) && ( T018110_A483ForColNum[0] == A483ForColNum ) && ( T018110_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T018110_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            A10288Hp_dia = T018110_A10288Hp_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            RcdFound1397 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1397 = (short)(0) ;
      /* Using cursor T018111 */
      pr_default.execute(9, new Object[] {A10288Hp_dia, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T018111_A10288Hp_dia[0]).after( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T018111_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018111_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018111_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T018111_A482ForColNom[0], A482ForColNom) == 0 ) && ( T018111_A483ForColNum[0] == A483ForColNum ) && ( T018111_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T018111_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T018111_A10288Hp_dia[0]).before( GXutil.resetTime( A10288Hp_dia )) ) && ( GXutil.strcmp(T018111_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018111_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T018111_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T018111_A482ForColNom[0], A482ForColNom) == 0 ) && ( T018111_A483ForColNum[0] == A483ForColNum ) && ( T018111_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T018111_A9766ForProC[0], A9766ForProC) == 0 ) )
         {
            A10288Hp_dia = T018111_A10288Hp_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
            RcdFound1397 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1811397( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHp_dia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1811397( ) ;
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
               update1811397( ) ;
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
               insert1811397( ) ;
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
                  insert1811397( ) ;
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
      getKey1811397( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0203");
      GX_FocusControl = edtHp_UltM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1810( ) ;
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
      GX_FocusControl = edtHp_UltM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1811397( ) ;
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHp_UltM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1811397( ) ;
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
      GX_FocusControl = edtHp_UltM_Internalname ;
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
      GX_FocusControl = edtHp_UltM_Internalname ;
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
      scanStart1811397( ) ;
      if ( RcdFound1397 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1397 != 0 )
         {
            scanNext1811397( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHp_UltM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1811397( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1811397( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01814 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0200"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10392Hp_UltM != T01814_A10392Hp_UltM[0] ) )
         {
            if ( Z10392Hp_UltM != T01814_A10392Hp_UltM[0] )
            {
               GXutil.writeLogln("ttr0203:[seudo value changed for attri]"+"Hp_UltM");
               GXutil.writeLogRaw("Old: ",Z10392Hp_UltM);
               GXutil.writeLogRaw("Current: ",T01814_A10392Hp_UltM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0200"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1811397( )
   {
      beforeValidate1811397( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1811397( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1811397( 0) ;
         checkOptimisticConcurrency1811397( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1811397( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1811397( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018112 */
                  pr_default.execute(10, new Object[] {A10288Hp_dia, Boolean.valueOf(n10392Hp_UltM), Integer.valueOf(A10392Hp_UltM), A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), A9766ForProC});
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
                        processLevel1811397( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1810( ) ;
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
            load1811397( ) ;
         }
         endLevel1811397( ) ;
      }
      closeExtendedTableCursors1811397( ) ;
   }

   public void update1811397( )
   {
      beforeValidate1811397( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1811397( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1811397( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1811397( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1811397( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018113 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n10392Hp_UltM), Integer.valueOf(A10392Hp_UltM), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0200");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0200"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1811397( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1811397( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1810( ) ;
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
         endLevel1811397( ) ;
      }
      closeExtendedTableCursors1811397( ) ;
   }

   public void deferredUpdate1811397( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1811397( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1811397( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1811397( ) ;
         afterConfirm1811397( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1811397( ) ;
            if ( AnyError == 0 )
            {
               scanStart1811406( ) ;
               while ( RcdFound1406 != 0 )
               {
                  getByPrimaryKey1811406( ) ;
                  delete1811406( ) ;
                  scanNext1811406( ) ;
               }
               scanEnd1811406( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018114 */
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
                           initAll1811397( ) ;
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
                        resetCaption1810( ) ;
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
      endLevel1811397( ) ;
      Gx_mode = sMode1397 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1811397( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T018115 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0201", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1811406( )
   {
      nGXsfl_70_idx = 0 ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         readRow1811406( ) ;
         if ( ( nRcdExists_1406 != 0 ) || ( nIsMod_1406 != 0 ) )
         {
            standaloneNotModal1811406( ) ;
            getKey1811406( ) ;
            if ( ( nRcdExists_1406 == 0 ) && ( nRcdDeleted_1406 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1811406( ) ;
            }
            else
            {
               if ( RcdFound1406 != 0 )
               {
                  if ( ( nRcdDeleted_1406 != 0 ) && ( nRcdExists_1406 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1811406( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1406 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1811406( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1406 == 0 )
                  {
                     GXCCtl = "HP_LINM_" + sGXsfl_70_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHp_LinM_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1406_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_LinM_Internalname, GXutil.ltrim( localUtil.ntoc( A10393Hp_LinM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHp_Motivo_Internalname, A10394Hp_Motivo) ;
         httpContext.changePostValue( edtHp_TermM_Internalname, GXutil.rtrim( A10395Hp_TermM)) ;
         httpContext.changePostValue( edtHp_UsuM_Internalname, GXutil.rtrim( A10396Hp_UsuM)) ;
         httpContext.changePostValue( edtHp_ddhhM_Internalname, localUtil.ttoc( A10397Hp_ddhhM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10393Hp_LinM_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( Z10393Hp_LinM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10394Hp_Motivo_"+sGXsfl_70_idx, Z10394Hp_Motivo) ;
         httpContext.changePostValue( "ZT_"+"Z10395Hp_TermM_"+sGXsfl_70_idx, GXutil.rtrim( Z10395Hp_TermM)) ;
         httpContext.changePostValue( "ZT_"+"Z10396Hp_UsuM_"+sGXsfl_70_idx, GXutil.rtrim( Z10396Hp_UsuM)) ;
         httpContext.changePostValue( "ZT_"+"Z10397Hp_ddhhM_"+sGXsfl_70_idx, localUtil.ttoc( Z10397Hp_ddhhM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1406_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1406_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1406_"+sGXsfl_70_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1406 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1406_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1406_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_LINM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_LinM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_MOTIVO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Motivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_TERMM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_TermM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_USUM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_UsuM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HP_DDHHM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhhM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1811406( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1406 = (short)(0) ;
      nIsMod_1406 = (short)(0) ;
      nRcdDeleted_1406 = (short)(0) ;
   }

   public void processLevel1811397( )
   {
      /* Save parent mode. */
      sMode1397 = Gx_mode ;
      processNestedLevel1811406( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1397 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1811397( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1811397( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr0203");
         if ( AnyError == 0 )
         {
            confirmValues1810( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr0203");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1811397( )
   {
      /* Scan By routine */
      /* Using cursor T018116 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      RcdFound1397 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1397 = (short)(1) ;
         A10288Hp_dia = T018116_A10288Hp_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1811397( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1397 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1397 = (short)(1) ;
         A10288Hp_dia = T018116_A10288Hp_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
      }
   }

   public void scanEnd1811397( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1811397( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1811397( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1811397( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1811397( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1811397( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1811397( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1811397( )
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
      edtHp_UltM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_UltM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_UltM_Enabled), 5, 0), true);
   }

   public void zm1811406( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10394Hp_Motivo = T01813_A10394Hp_Motivo[0] ;
            Z10395Hp_TermM = T01813_A10395Hp_TermM[0] ;
            Z10396Hp_UsuM = T01813_A10396Hp_UsuM[0] ;
            Z10397Hp_ddhhM = T01813_A10397Hp_ddhhM[0] ;
         }
         else
         {
            Z10394Hp_Motivo = A10394Hp_Motivo ;
            Z10395Hp_TermM = A10395Hp_TermM ;
            Z10396Hp_UsuM = A10396Hp_UsuM ;
            Z10397Hp_ddhhM = A10397Hp_ddhhM ;
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
         Z10393Hp_LinM = A10393Hp_LinM ;
         Z10394Hp_Motivo = A10394Hp_Motivo ;
         Z10395Hp_TermM = A10395Hp_TermM ;
         Z10396Hp_UsuM = A10396Hp_UsuM ;
         Z10397Hp_ddhhM = A10397Hp_ddhhM ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
      }
   }

   public void standaloneNotModal1811406( )
   {
   }

   public void standaloneModal1811406( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHp_LinM_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHp_LinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_LinM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
      else
      {
         edtHp_LinM_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHp_LinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_LinM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      }
   }

   public void load1811406( )
   {
      /* Using cursor T018117 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1406 = (short)(1) ;
         A10394Hp_Motivo = T018117_A10394Hp_Motivo[0] ;
         n10394Hp_Motivo = T018117_n10394Hp_Motivo[0] ;
         A10395Hp_TermM = T018117_A10395Hp_TermM[0] ;
         n10395Hp_TermM = T018117_n10395Hp_TermM[0] ;
         A10396Hp_UsuM = T018117_A10396Hp_UsuM[0] ;
         n10396Hp_UsuM = T018117_n10396Hp_UsuM[0] ;
         A10397Hp_ddhhM = T018117_A10397Hp_ddhhM[0] ;
         n10397Hp_ddhhM = T018117_n10397Hp_ddhhM[0] ;
         zm1811406( -4) ;
      }
      pr_default.close(15);
      onLoadActions1811406( ) ;
   }

   public void onLoadActions1811406( )
   {
   }

   public void checkExtendedTable1811406( )
   {
      nIsDirty_1406 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1811406( ) ;
   }

   public void closeExtendedTableCursors1811406( )
   {
   }

   public void enableDisable1811406( )
   {
   }

   public void getKey1811406( )
   {
      /* Using cursor T018118 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1406 = (short)(1) ;
      }
      else
      {
         RcdFound1406 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1811406( )
   {
      /* Using cursor T01813 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01813_A494ForSer[0], A494ForSer) == 0 ) && ( GXutil.strcmp(T01813_A482ForColNom[0], A482ForColNom) == 0 ) && ( T01813_A483ForColNum[0] == A483ForColNum ) && ( T01813_A831TipColCod[0] == A831TipColCod ) && ( GXutil.strcmp(T01813_A9766ForProC[0], A9766ForProC) == 0 ) && ( GXutil.strcmp(T01813_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01813_A252CliCod[0] == A252CliCod ) )
      {
         zm1811406( 4) ;
         RcdFound1406 = (short)(1) ;
         initializeNonKey1811406( ) ;
         A10393Hp_LinM = T01813_A10393Hp_LinM[0] ;
         A10394Hp_Motivo = T01813_A10394Hp_Motivo[0] ;
         n10394Hp_Motivo = T01813_n10394Hp_Motivo[0] ;
         A10395Hp_TermM = T01813_A10395Hp_TermM[0] ;
         n10395Hp_TermM = T01813_n10395Hp_TermM[0] ;
         A10396Hp_UsuM = T01813_A10396Hp_UsuM[0] ;
         n10396Hp_UsuM = T01813_n10396Hp_UsuM[0] ;
         A10397Hp_ddhhM = T01813_A10397Hp_ddhhM[0] ;
         n10397Hp_ddhhM = T01813_n10397Hp_ddhhM[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z9766ForProC = A9766ForProC ;
         Z10288Hp_dia = A10288Hp_dia ;
         Z10393Hp_LinM = A10393Hp_LinM ;
         sMode1406 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1811406( ) ;
         load1811406( ) ;
         Gx_mode = sMode1406 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1406 = (short)(0) ;
         initializeNonKey1811406( ) ;
         sMode1406 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1811406( ) ;
         Gx_mode = sMode1406 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1811406( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1811406( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01812 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0203"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10394Hp_Motivo, T01812_A10394Hp_Motivo[0]) != 0 ) || ( GXutil.strcmp(Z10395Hp_TermM, T01812_A10395Hp_TermM[0]) != 0 ) || ( GXutil.strcmp(Z10396Hp_UsuM, T01812_A10396Hp_UsuM[0]) != 0 ) || !( GXutil.dateCompare(Z10397Hp_ddhhM, T01812_A10397Hp_ddhhM[0]) ) )
         {
            if ( GXutil.strcmp(Z10394Hp_Motivo, T01812_A10394Hp_Motivo[0]) != 0 )
            {
               GXutil.writeLogln("ttr0203:[seudo value changed for attri]"+"Hp_Motivo");
               GXutil.writeLogRaw("Old: ",Z10394Hp_Motivo);
               GXutil.writeLogRaw("Current: ",T01812_A10394Hp_Motivo[0]);
            }
            if ( GXutil.strcmp(Z10395Hp_TermM, T01812_A10395Hp_TermM[0]) != 0 )
            {
               GXutil.writeLogln("ttr0203:[seudo value changed for attri]"+"Hp_TermM");
               GXutil.writeLogRaw("Old: ",Z10395Hp_TermM);
               GXutil.writeLogRaw("Current: ",T01812_A10395Hp_TermM[0]);
            }
            if ( GXutil.strcmp(Z10396Hp_UsuM, T01812_A10396Hp_UsuM[0]) != 0 )
            {
               GXutil.writeLogln("ttr0203:[seudo value changed for attri]"+"Hp_UsuM");
               GXutil.writeLogRaw("Old: ",Z10396Hp_UsuM);
               GXutil.writeLogRaw("Current: ",T01812_A10396Hp_UsuM[0]);
            }
            if ( !( GXutil.dateCompare(Z10397Hp_ddhhM, T01812_A10397Hp_ddhhM[0]) ) )
            {
               GXutil.writeLogln("ttr0203:[seudo value changed for attri]"+"Hp_ddhhM");
               GXutil.writeLogRaw("Old: ",Z10397Hp_ddhhM);
               GXutil.writeLogRaw("Current: ",T01812_A10397Hp_ddhhM[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR0203"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1811406( )
   {
      beforeValidate1811406( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1811406( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1811406( 0) ;
         checkOptimisticConcurrency1811406( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1811406( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1811406( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018119 */
                  pr_default.execute(17, new Object[] {A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM), Boolean.valueOf(n10394Hp_Motivo), A10394Hp_Motivo, Boolean.valueOf(n10395Hp_TermM), A10395Hp_TermM, Boolean.valueOf(n10396Hp_UsuM), A10396Hp_UsuM, Boolean.valueOf(n10397Hp_ddhhM), A10397Hp_ddhhM, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0203");
                  if ( (pr_default.getStatus(17) == 1) )
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
            load1811406( ) ;
         }
         endLevel1811406( ) ;
      }
      closeExtendedTableCursors1811406( ) ;
   }

   public void update1811406( )
   {
      beforeValidate1811406( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1811406( ) ;
      }
      if ( ( nIsMod_1406 != 0 ) || ( nIsDirty_1406 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1811406( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1811406( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1811406( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018120 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n10394Hp_Motivo), A10394Hp_Motivo, Boolean.valueOf(n10395Hp_TermM), A10395Hp_TermM, Boolean.valueOf(n10396Hp_UsuM), A10396Hp_UsuM, Boolean.valueOf(n10397Hp_ddhhM), A10397Hp_ddhhM, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0203");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR0203"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1811406( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1811406( ) ;
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
            endLevel1811406( ) ;
         }
      }
      closeExtendedTableCursors1811406( ) ;
   }

   public void deferredUpdate1811406( )
   {
   }

   public void delete1811406( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1811406( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1811406( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1811406( ) ;
         afterConfirm1811406( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1811406( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018121 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia, Integer.valueOf(A10393Hp_LinM)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR0203");
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
      sMode1406 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1811406( ) ;
      Gx_mode = sMode1406 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1811406( )
   {
      standaloneModal1811406( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1811406( )
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

   public void scanStart1811406( )
   {
      /* Scan By routine */
      /* Using cursor T018122 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC, A10288Hp_dia});
      RcdFound1406 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1406 = (short)(1) ;
         A10393Hp_LinM = T018122_A10393Hp_LinM[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1811406( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1406 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1406 = (short)(1) ;
         A10393Hp_LinM = T018122_A10393Hp_LinM[0] ;
      }
   }

   public void scanEnd1811406( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1811406( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1811406( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1811406( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1811406( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1811406( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1811406( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1811406( )
   {
      edtHp_LinM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_LinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_LinM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_Motivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_Motivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_Motivo_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_TermM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_TermM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_TermM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_UsuM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_UsuM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_UsuM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtHp_ddhhM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_ddhhM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_ddhhM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void send_integrity_lvl_hashes1811406( )
   {
   }

   public void send_integrity_lvl_hashes1811397( )
   {
   }

   public void subsflControlProps_701406( )
   {
      edtavnRcdDeleted_1406_Internalname = "vNRCDDELETED_1406_"+sGXsfl_70_idx ;
      edtHp_LinM_Internalname = "HP_LINM_"+sGXsfl_70_idx ;
      edtHp_Motivo_Internalname = "HP_MOTIVO_"+sGXsfl_70_idx ;
      edtHp_TermM_Internalname = "HP_TERMM_"+sGXsfl_70_idx ;
      edtHp_UsuM_Internalname = "HP_USUM_"+sGXsfl_70_idx ;
      edtHp_ddhhM_Internalname = "HP_DDHHM_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_701406( )
   {
      edtavnRcdDeleted_1406_Internalname = "vNRCDDELETED_1406_"+sGXsfl_70_fel_idx ;
      edtHp_LinM_Internalname = "HP_LINM_"+sGXsfl_70_fel_idx ;
      edtHp_Motivo_Internalname = "HP_MOTIVO_"+sGXsfl_70_fel_idx ;
      edtHp_TermM_Internalname = "HP_TERMM_"+sGXsfl_70_fel_idx ;
      edtHp_UsuM_Internalname = "HP_USUM_"+sGXsfl_70_fel_idx ;
      edtHp_ddhhM_Internalname = "HP_DDHHM_"+sGXsfl_70_fel_idx ;
   }

   public void addRow1811406( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701406( ) ;
      sendRow1811406( ) ;
   }

   public void sendRow1811406( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1406_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1406_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1406_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1406), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1406), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1406_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1406_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1406_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_LinM_Internalname,GXutil.ltrim( localUtil.ntoc( A10393Hp_LinM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10393Hp_LinM), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_LinM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_LinM_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1406_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_Motivo_Internalname,A10394Hp_Motivo,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_Motivo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_Motivo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(800),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1406_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_TermM_Internalname,GXutil.rtrim( A10395Hp_TermM),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_TermM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_TermM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1406_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_UsuM_Internalname,GXutil.rtrim( A10396Hp_UsuM),GXutil.rtrim( localUtil.format( A10396Hp_UsuM, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_UsuM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_UsuM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1406_" + sGXsfl_70_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_70_idx + "',70)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHp_ddhhM_Internalname,localUtil.ttoc( A10397Hp_ddhhM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10397Hp_ddhhM, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHp_ddhhM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHp_ddhhM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1811406( ) ;
      GXCCtl = "Z10393Hp_LinM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10393Hp_LinM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10394Hp_Motivo_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10394Hp_Motivo);
      GXCCtl = "Z10395Hp_TermM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10395Hp_TermM));
      GXCCtl = "Z10396Hp_UsuM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10396Hp_UsuM));
      GXCCtl = "Z10397Hp_ddhhM_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10397Hp_ddhhM, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1406_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1406_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1406_" + sGXsfl_70_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1406, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1406_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1406_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_LINM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_LinM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_MOTIVO_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Motivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_TERMM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_TermM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_USUM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_UsuM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HP_DDHHM_"+sGXsfl_70_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhhM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1811406( )
   {
      nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701406( ) ;
      edtavnRcdDeleted_1406_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1406_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_LinM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_LINM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_Motivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_MOTIVO_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_TermM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_TERMM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_UsuM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_USUM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHp_ddhhM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HP_DDHHM_"+sGXsfl_70_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1406_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1406_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1406");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1406_Internalname ;
         wbErr = true ;
         nRcdDeleted_1406 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1406 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1406_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHp_LinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHp_LinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HP_LINM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_LinM_Internalname ;
         wbErr = true ;
         A10393Hp_LinM = 0 ;
      }
      else
      {
         A10393Hp_LinM = (int)(localUtil.ctol( httpContext.cgiGet( edtHp_LinM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10394Hp_Motivo = httpContext.cgiGet( edtHp_Motivo_Internalname) ;
      n10394Hp_Motivo = false ;
      A10395Hp_TermM = httpContext.cgiGet( edtHp_TermM_Internalname) ;
      n10395Hp_TermM = false ;
      A10396Hp_UsuM = GXutil.upper( httpContext.cgiGet( edtHp_UsuM_Internalname)) ;
      n10396Hp_UsuM = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHp_ddhhM_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HP_DDHHM_" + sGXsfl_70_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHp_ddhhM_Internalname ;
         wbErr = true ;
         A10397Hp_ddhhM = GXutil.resetTime( GXutil.nullDate() );
         n10397Hp_ddhhM = false ;
      }
      else
      {
         A10397Hp_ddhhM = localUtil.ctot( httpContext.cgiGet( edtHp_ddhhM_Internalname)) ;
         n10397Hp_ddhhM = false ;
      }
      GXCCtl = "Z10393Hp_LinM_" + sGXsfl_70_idx ;
      Z10393Hp_LinM = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10394Hp_Motivo_" + sGXsfl_70_idx ;
      Z10394Hp_Motivo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10395Hp_TermM_" + sGXsfl_70_idx ;
      Z10395Hp_TermM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10396Hp_UsuM_" + sGXsfl_70_idx ;
      Z10396Hp_UsuM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10397Hp_ddhhM_" + sGXsfl_70_idx ;
      Z10397Hp_ddhhM = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_1406_" + sGXsfl_70_idx ;
      nRcdDeleted_1406 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1406_" + sGXsfl_70_idx ;
      nRcdExists_1406 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1406_" + sGXsfl_70_idx ;
      nIsMod_1406 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHp_LinM_Enabled = edtHp_LinM_Enabled ;
   }

   public void confirmValues1810( )
   {
      nGXsfl_70_idx = 0 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_701406( ) ;
      while ( nGXsfl_70_idx < nRC_GXsfl_70 )
      {
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701406( ) ;
         httpContext.changePostValue( "Z10393Hp_LinM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10393Hp_LinM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10393Hp_LinM_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10394Hp_Motivo_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10394Hp_Motivo_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10394Hp_Motivo_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10395Hp_TermM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10395Hp_TermM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10395Hp_TermM_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10396Hp_UsuM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10396Hp_UsuM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10396Hp_UsuM_"+sGXsfl_70_idx) ;
         httpContext.changePostValue( "Z10397Hp_ddhhM_"+sGXsfl_70_idx, httpContext.cgiGet( "ZT_"+"Z10397Hp_ddhhM_"+sGXsfl_70_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10397Hp_ddhhM_"+sGXsfl_70_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr0203", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10392Hp_UltM", GXutil.ltrim( localUtil.ntoc( Z10392Hp_UltM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttr0203", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A9766ForProC))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForProC"})  ;
   }

   public String getPgmname( )
   {
      return "TTR0203" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MOTIVOS BLOQUEOS PRECIOS", "") ;
   }

   public void initializeNonKey1811397( )
   {
      A10392Hp_UltM = 0 ;
      n10392Hp_UltM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10392Hp_UltM", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10392Hp_UltM), 6, 0));
      Z10392Hp_UltM = 0 ;
   }

   public void initAll1811397( )
   {
      A10288Hp_dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10288Hp_dia", localUtil.format(A10288Hp_dia, "99/99/99"));
      initializeNonKey1811397( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1811406( )
   {
      A10394Hp_Motivo = "" ;
      n10394Hp_Motivo = false ;
      A10395Hp_TermM = "" ;
      n10395Hp_TermM = false ;
      A10396Hp_UsuM = "" ;
      n10396Hp_UsuM = false ;
      A10397Hp_ddhhM = GXutil.resetTime( GXutil.nullDate() );
      n10397Hp_ddhhM = false ;
      Z10394Hp_Motivo = "" ;
      Z10395Hp_TermM = "" ;
      Z10396Hp_UsuM = "" ;
      Z10397Hp_ddhhM = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1811406( )
   {
      A10393Hp_LinM = 0 ;
      initializeNonKey1811406( ) ;
   }

   public void standaloneModalInsert1811406( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241553171", true, true);
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
      httpContext.AddJavascriptSource("ttr0203.js", "?20268241553171", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1406( )
   {
      edtHp_LinM_Enabled = defedtHp_LinM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHp_LinM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHp_LinM_Enabled), 5, 0), !bGXsfl_70_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1406, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1406_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10393Hp_LinM, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_LinM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10394Hp_Motivo);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_Motivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10395Hp_TermM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_TermM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10396Hp_UsuM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_UsuM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10397Hp_ddhhM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHp_ddhhM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHp_UltM_Internalname = "HP_ULTM" ;
      edtavnRcdDeleted_1406_Internalname = "vNRCDDELETED_1406" ;
      edtHp_LinM_Internalname = "HP_LINM" ;
      edtHp_Motivo_Internalname = "HP_MOTIVO" ;
      edtHp_TermM_Internalname = "HP_TERMM" ;
      edtHp_UsuM_Internalname = "HP_USUM" ;
      edtHp_ddhhM_Internalname = "HP_DDHHM" ;
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
      Form.setCaption( httpContext.getMessage( "MOTIVOS BLOQUEOS PRECIOS", "") );
      edtHp_ddhhM_Jsonclick = "" ;
      edtHp_UsuM_Jsonclick = "" ;
      edtHp_TermM_Jsonclick = "" ;
      edtHp_Motivo_Jsonclick = "" ;
      edtHp_LinM_Jsonclick = "" ;
      edtavnRcdDeleted_1406_Jsonclick = "" ;
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
      edtHp_ddhhM_Enabled = 1 ;
      edtHp_UsuM_Enabled = 1 ;
      edtHp_TermM_Enabled = 1 ;
      edtHp_Motivo_Enabled = 1 ;
      edtHp_LinM_Enabled = 1 ;
      edtavnRcdDeleted_1406_Enabled = 1 ;
      edtHp_UltM_Jsonclick = "" ;
      edtHp_UltM_Backcolor = (int)(0xFFFFFF) ;
      edtHp_UltM_Enabled = 1 ;
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
      subsflControlProps_701406( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1811406( ) ;
         standaloneModal1811406( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1811406( ) ;
         nGXsfl_70_idx = (int)(nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_701406( ) ;
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
      /* Using cursor T018123 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018123_A407EmprNom[0] ;
      n407EmprNom = T018123_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T018124 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), A9766ForProC});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLARPDCL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPROC");
         AnyError = (short)(1) ;
      }
      pr_default.close(22);
      GX_FocusControl = edtHp_UltM_Internalname ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A10392Hp_UltM", GXutil.ltrim( localUtil.ntoc( A10392Hp_UltM, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10392Hp_UltM", GXutil.ltrim( localUtil.ntoc( Z10392Hp_UltM, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_HP_DIA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10392Hp_UltM',fld:'HP_ULTM',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z494ForSer'},{av:'Z482ForColNom'},{av:'Z483ForColNum'},{av:'Z831TipColCod'},{av:'Z9766ForProC'},{av:'Z10288Hp_dia'},{av:'Z407EmprNom'},{av:'Z10392Hp_UltM'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HP_LINM","{handler:'valid_Hp_linm',iparms:[]");
      setEventMetadata("VALID_HP_LINM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hp_ddhhm',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(22);
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
      Z10394Hp_Motivo = "" ;
      Z10395Hp_TermM = "" ;
      Z10396Hp_UsuM = "" ;
      Z10397Hp_ddhhM = GXutil.resetTime( GXutil.nullDate() );
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
      sMode1406 = "" ;
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
      A10394Hp_Motivo = "" ;
      A10395Hp_TermM = "" ;
      A10396Hp_UsuM = "" ;
      A10397Hp_ddhhM = GXutil.resetTime( GXutil.nullDate() );
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
      T01816_A407EmprNom = new String[] {""} ;
      T01816_n407EmprNom = new boolean[] {false} ;
      T01817_A396EmprCod = new String[] {""} ;
      T01818_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01818_A407EmprNom = new String[] {""} ;
      T01818_n407EmprNom = new boolean[] {false} ;
      T01818_A10392Hp_UltM = new int[1] ;
      T01818_n10392Hp_UltM = new boolean[] {false} ;
      T01818_A396EmprCod = new String[] {""} ;
      T01818_A252CliCod = new int[1] ;
      T01818_A831TipColCod = new byte[1] ;
      T01818_A494ForSer = new String[] {""} ;
      T01818_A482ForColNom = new String[] {""} ;
      T01818_A483ForColNum = new int[1] ;
      T01818_A9766ForProC = new String[] {""} ;
      T01819_A396EmprCod = new String[] {""} ;
      T01819_A252CliCod = new int[1] ;
      T01819_A494ForSer = new String[] {""} ;
      T01819_A482ForColNom = new String[] {""} ;
      T01819_A483ForColNum = new int[1] ;
      T01819_A831TipColCod = new byte[1] ;
      T01819_A9766ForProC = new String[] {""} ;
      T01819_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01815_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01815_A10392Hp_UltM = new int[1] ;
      T01815_n10392Hp_UltM = new boolean[] {false} ;
      T01815_A396EmprCod = new String[] {""} ;
      T01815_A252CliCod = new int[1] ;
      T01815_A831TipColCod = new byte[1] ;
      T01815_A494ForSer = new String[] {""} ;
      T01815_A482ForColNom = new String[] {""} ;
      T01815_A483ForColNum = new int[1] ;
      T01815_A9766ForProC = new String[] {""} ;
      T018110_A396EmprCod = new String[] {""} ;
      T018110_A252CliCod = new int[1] ;
      T018110_A494ForSer = new String[] {""} ;
      T018110_A482ForColNom = new String[] {""} ;
      T018110_A483ForColNum = new int[1] ;
      T018110_A831TipColCod = new byte[1] ;
      T018110_A9766ForProC = new String[] {""} ;
      T018110_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018111_A396EmprCod = new String[] {""} ;
      T018111_A252CliCod = new int[1] ;
      T018111_A494ForSer = new String[] {""} ;
      T018111_A482ForColNom = new String[] {""} ;
      T018111_A483ForColNum = new int[1] ;
      T018111_A831TipColCod = new byte[1] ;
      T018111_A9766ForProC = new String[] {""} ;
      T018111_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01814_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01814_A10392Hp_UltM = new int[1] ;
      T01814_n10392Hp_UltM = new boolean[] {false} ;
      T01814_A396EmprCod = new String[] {""} ;
      T01814_A252CliCod = new int[1] ;
      T01814_A831TipColCod = new byte[1] ;
      T01814_A494ForSer = new String[] {""} ;
      T01814_A482ForColNom = new String[] {""} ;
      T01814_A483ForColNum = new int[1] ;
      T01814_A9766ForProC = new String[] {""} ;
      T018115_A396EmprCod = new String[] {""} ;
      T018115_A252CliCod = new int[1] ;
      T018115_A494ForSer = new String[] {""} ;
      T018115_A482ForColNom = new String[] {""} ;
      T018115_A483ForColNum = new int[1] ;
      T018115_A831TipColCod = new byte[1] ;
      T018115_A9766ForProC = new String[] {""} ;
      T018115_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018115_A10290Hp_lin = new int[1] ;
      T018116_A396EmprCod = new String[] {""} ;
      T018116_A252CliCod = new int[1] ;
      T018116_A494ForSer = new String[] {""} ;
      T018116_A482ForColNom = new String[] {""} ;
      T018116_A483ForColNum = new int[1] ;
      T018116_A831TipColCod = new byte[1] ;
      T018116_A9766ForProC = new String[] {""} ;
      T018116_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018117_A494ForSer = new String[] {""} ;
      T018117_A482ForColNom = new String[] {""} ;
      T018117_A483ForColNum = new int[1] ;
      T018117_A831TipColCod = new byte[1] ;
      T018117_A9766ForProC = new String[] {""} ;
      T018117_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018117_A10393Hp_LinM = new int[1] ;
      T018117_A10394Hp_Motivo = new String[] {""} ;
      T018117_n10394Hp_Motivo = new boolean[] {false} ;
      T018117_A10395Hp_TermM = new String[] {""} ;
      T018117_n10395Hp_TermM = new boolean[] {false} ;
      T018117_A10396Hp_UsuM = new String[] {""} ;
      T018117_n10396Hp_UsuM = new boolean[] {false} ;
      T018117_A10397Hp_ddhhM = new java.util.Date[] {GXutil.nullDate()} ;
      T018117_n10397Hp_ddhhM = new boolean[] {false} ;
      T018117_A396EmprCod = new String[] {""} ;
      T018117_A252CliCod = new int[1] ;
      T018118_A396EmprCod = new String[] {""} ;
      T018118_A252CliCod = new int[1] ;
      T018118_A494ForSer = new String[] {""} ;
      T018118_A482ForColNom = new String[] {""} ;
      T018118_A483ForColNum = new int[1] ;
      T018118_A831TipColCod = new byte[1] ;
      T018118_A9766ForProC = new String[] {""} ;
      T018118_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018118_A10393Hp_LinM = new int[1] ;
      T01813_A494ForSer = new String[] {""} ;
      T01813_A482ForColNom = new String[] {""} ;
      T01813_A483ForColNum = new int[1] ;
      T01813_A831TipColCod = new byte[1] ;
      T01813_A9766ForProC = new String[] {""} ;
      T01813_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01813_A10393Hp_LinM = new int[1] ;
      T01813_A10394Hp_Motivo = new String[] {""} ;
      T01813_n10394Hp_Motivo = new boolean[] {false} ;
      T01813_A10395Hp_TermM = new String[] {""} ;
      T01813_n10395Hp_TermM = new boolean[] {false} ;
      T01813_A10396Hp_UsuM = new String[] {""} ;
      T01813_n10396Hp_UsuM = new boolean[] {false} ;
      T01813_A10397Hp_ddhhM = new java.util.Date[] {GXutil.nullDate()} ;
      T01813_n10397Hp_ddhhM = new boolean[] {false} ;
      T01813_A396EmprCod = new String[] {""} ;
      T01813_A252CliCod = new int[1] ;
      T01812_A494ForSer = new String[] {""} ;
      T01812_A482ForColNom = new String[] {""} ;
      T01812_A483ForColNum = new int[1] ;
      T01812_A831TipColCod = new byte[1] ;
      T01812_A9766ForProC = new String[] {""} ;
      T01812_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01812_A10393Hp_LinM = new int[1] ;
      T01812_A10394Hp_Motivo = new String[] {""} ;
      T01812_n10394Hp_Motivo = new boolean[] {false} ;
      T01812_A10395Hp_TermM = new String[] {""} ;
      T01812_n10395Hp_TermM = new boolean[] {false} ;
      T01812_A10396Hp_UsuM = new String[] {""} ;
      T01812_n10396Hp_UsuM = new boolean[] {false} ;
      T01812_A10397Hp_ddhhM = new java.util.Date[] {GXutil.nullDate()} ;
      T01812_n10397Hp_ddhhM = new boolean[] {false} ;
      T01812_A396EmprCod = new String[] {""} ;
      T01812_A252CliCod = new int[1] ;
      T018122_A396EmprCod = new String[] {""} ;
      T018122_A252CliCod = new int[1] ;
      T018122_A494ForSer = new String[] {""} ;
      T018122_A482ForColNom = new String[] {""} ;
      T018122_A483ForColNum = new int[1] ;
      T018122_A831TipColCod = new byte[1] ;
      T018122_A9766ForProC = new String[] {""} ;
      T018122_A10288Hp_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T018122_A10393Hp_LinM = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018123_A407EmprNom = new String[] {""} ;
      T018123_n407EmprNom = new boolean[] {false} ;
      T018124_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ494ForSer = "" ;
      ZZ482ForColNom = "" ;
      ZZ9766ForProC = "" ;
      ZZ10288Hp_dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr0203__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr0203__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr0203__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr0203__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr0203__default(),
         new Object[] {
             new Object[] {
            T01812_A494ForSer, T01812_A482ForColNom, T01812_A483ForColNum, T01812_A831TipColCod, T01812_A9766ForProC, T01812_A10288Hp_dia, T01812_A10393Hp_LinM, T01812_A10394Hp_Motivo, T01812_n10394Hp_Motivo, T01812_A10395Hp_TermM,
            T01812_n10395Hp_TermM, T01812_A10396Hp_UsuM, T01812_n10396Hp_UsuM, T01812_A10397Hp_ddhhM, T01812_n10397Hp_ddhhM, T01812_A396EmprCod, T01812_A252CliCod
            }
            , new Object[] {
            T01813_A494ForSer, T01813_A482ForColNom, T01813_A483ForColNum, T01813_A831TipColCod, T01813_A9766ForProC, T01813_A10288Hp_dia, T01813_A10393Hp_LinM, T01813_A10394Hp_Motivo, T01813_n10394Hp_Motivo, T01813_A10395Hp_TermM,
            T01813_n10395Hp_TermM, T01813_A10396Hp_UsuM, T01813_n10396Hp_UsuM, T01813_A10397Hp_ddhhM, T01813_n10397Hp_ddhhM, T01813_A396EmprCod, T01813_A252CliCod
            }
            , new Object[] {
            T01814_A10288Hp_dia, T01814_A10392Hp_UltM, T01814_n10392Hp_UltM, T01814_A396EmprCod, T01814_A252CliCod, T01814_A831TipColCod, T01814_A494ForSer, T01814_A482ForColNom, T01814_A483ForColNum, T01814_A9766ForProC
            }
            , new Object[] {
            T01815_A10288Hp_dia, T01815_A10392Hp_UltM, T01815_n10392Hp_UltM, T01815_A396EmprCod, T01815_A252CliCod, T01815_A831TipColCod, T01815_A494ForSer, T01815_A482ForColNom, T01815_A483ForColNum, T01815_A9766ForProC
            }
            , new Object[] {
            T01816_A407EmprNom, T01816_n407EmprNom
            }
            , new Object[] {
            T01817_A396EmprCod
            }
            , new Object[] {
            T01818_A10288Hp_dia, T01818_A407EmprNom, T01818_n407EmprNom, T01818_A10392Hp_UltM, T01818_n10392Hp_UltM, T01818_A396EmprCod, T01818_A252CliCod, T01818_A831TipColCod, T01818_A494ForSer, T01818_A482ForColNom,
            T01818_A483ForColNum, T01818_A9766ForProC
            }
            , new Object[] {
            T01819_A396EmprCod, T01819_A252CliCod, T01819_A494ForSer, T01819_A482ForColNom, T01819_A483ForColNum, T01819_A831TipColCod, T01819_A9766ForProC, T01819_A10288Hp_dia
            }
            , new Object[] {
            T018110_A396EmprCod, T018110_A252CliCod, T018110_A494ForSer, T018110_A482ForColNom, T018110_A483ForColNum, T018110_A831TipColCod, T018110_A9766ForProC, T018110_A10288Hp_dia
            }
            , new Object[] {
            T018111_A396EmprCod, T018111_A252CliCod, T018111_A494ForSer, T018111_A482ForColNom, T018111_A483ForColNum, T018111_A831TipColCod, T018111_A9766ForProC, T018111_A10288Hp_dia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018115_A396EmprCod, T018115_A252CliCod, T018115_A494ForSer, T018115_A482ForColNom, T018115_A483ForColNum, T018115_A831TipColCod, T018115_A9766ForProC, T018115_A10288Hp_dia, T018115_A10290Hp_lin
            }
            , new Object[] {
            T018116_A396EmprCod, T018116_A252CliCod, T018116_A494ForSer, T018116_A482ForColNom, T018116_A483ForColNum, T018116_A831TipColCod, T018116_A9766ForProC, T018116_A10288Hp_dia
            }
            , new Object[] {
            T018117_A494ForSer, T018117_A482ForColNom, T018117_A483ForColNum, T018117_A831TipColCod, T018117_A9766ForProC, T018117_A10288Hp_dia, T018117_A10393Hp_LinM, T018117_A10394Hp_Motivo, T018117_n10394Hp_Motivo, T018117_A10395Hp_TermM,
            T018117_n10395Hp_TermM, T018117_A10396Hp_UsuM, T018117_n10396Hp_UsuM, T018117_A10397Hp_ddhhM, T018117_n10397Hp_ddhhM, T018117_A396EmprCod, T018117_A252CliCod
            }
            , new Object[] {
            T018118_A396EmprCod, T018118_A252CliCod, T018118_A494ForSer, T018118_A482ForColNom, T018118_A483ForColNum, T018118_A831TipColCod, T018118_A9766ForProC, T018118_A10288Hp_dia, T018118_A10393Hp_LinM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018122_A396EmprCod, T018122_A252CliCod, T018122_A494ForSer, T018122_A482ForColNom, T018122_A483ForColNum, T018122_A831TipColCod, T018122_A9766ForProC, T018122_A10288Hp_dia, T018122_A10393Hp_LinM
            }
            , new Object[] {
            T018123_A407EmprNom, T018123_n407EmprNom
            }
            , new Object[] {
            T018124_A396EmprCod
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
      AV33Pgmname = "TTR0203" ;
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
   private short nRcdDeleted_1406 ;
   private short nRcdExists_1406 ;
   private short nIsMod_1406 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1406 ;
   private short RcdFound1406 ;
   private short nBlankRcdUsr1406 ;
   private short RcdFound1397 ;
   private short nIsDirty_1397 ;
   private short nIsDirty_1406 ;
   private int wcpOA252CliCod ;
   private int wcpOA483ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z10392Hp_UltM ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int Z10393Hp_LinM ;
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
   private int A10392Hp_UltM ;
   private int edtHp_UltM_Enabled ;
   private int edtavnRcdDeleted_1406_Enabled ;
   private int edtHp_LinM_Enabled ;
   private int edtHp_Motivo_Enabled ;
   private int edtHp_TermM_Enabled ;
   private int edtHp_UsuM_Enabled ;
   private int edtHp_ddhhM_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10393Hp_LinM ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHp_LinM_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHp_UltM_Backcolor ;
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
   private int ZZ10392Hp_UltM ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA494ForSer ;
   private String wcpOA482ForColNom ;
   private String wcpOA9766ForProC ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z9766ForProC ;
   private String Z10395Hp_TermM ;
   private String Z10396Hp_UsuM ;
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
   private String edtHp_UltM_Internalname ;
   private String edtHp_UltM_Jsonclick ;
   private String sMode1406 ;
   private String edtavnRcdDeleted_1406_Internalname ;
   private String edtHp_LinM_Internalname ;
   private String edtHp_Motivo_Internalname ;
   private String edtHp_TermM_Internalname ;
   private String edtHp_UsuM_Internalname ;
   private String edtHp_ddhhM_Internalname ;
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
   private String A10395Hp_TermM ;
   private String A10396Hp_UsuM ;
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
   private String edtavnRcdDeleted_1406_Jsonclick ;
   private String edtHp_LinM_Jsonclick ;
   private String edtHp_Motivo_Jsonclick ;
   private String edtHp_TermM_Jsonclick ;
   private String edtHp_UsuM_Jsonclick ;
   private String edtHp_ddhhM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ494ForSer ;
   private String ZZ482ForColNom ;
   private String ZZ9766ForProC ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10397Hp_ddhhM ;
   private java.util.Date A10397Hp_ddhhM ;
   private java.util.Date Z10288Hp_dia ;
   private java.util.Date A10288Hp_dia ;
   private java.util.Date ZZ10288Hp_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10392Hp_UltM ;
   private boolean returnInSub ;
   private boolean n10394Hp_Motivo ;
   private boolean n10395Hp_TermM ;
   private boolean n10396Hp_UsuM ;
   private boolean n10397Hp_ddhhM ;
   private String Z10394Hp_Motivo ;
   private String A10394Hp_Motivo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01816_A407EmprNom ;
   private boolean[] T01816_n407EmprNom ;
   private String[] T01817_A396EmprCod ;
   private java.util.Date[] T01818_A10288Hp_dia ;
   private String[] T01818_A407EmprNom ;
   private boolean[] T01818_n407EmprNom ;
   private int[] T01818_A10392Hp_UltM ;
   private boolean[] T01818_n10392Hp_UltM ;
   private String[] T01818_A396EmprCod ;
   private int[] T01818_A252CliCod ;
   private byte[] T01818_A831TipColCod ;
   private String[] T01818_A494ForSer ;
   private String[] T01818_A482ForColNom ;
   private int[] T01818_A483ForColNum ;
   private String[] T01818_A9766ForProC ;
   private String[] T01819_A396EmprCod ;
   private int[] T01819_A252CliCod ;
   private String[] T01819_A494ForSer ;
   private String[] T01819_A482ForColNom ;
   private int[] T01819_A483ForColNum ;
   private byte[] T01819_A831TipColCod ;
   private String[] T01819_A9766ForProC ;
   private java.util.Date[] T01819_A10288Hp_dia ;
   private java.util.Date[] T01815_A10288Hp_dia ;
   private int[] T01815_A10392Hp_UltM ;
   private boolean[] T01815_n10392Hp_UltM ;
   private String[] T01815_A396EmprCod ;
   private int[] T01815_A252CliCod ;
   private byte[] T01815_A831TipColCod ;
   private String[] T01815_A494ForSer ;
   private String[] T01815_A482ForColNom ;
   private int[] T01815_A483ForColNum ;
   private String[] T01815_A9766ForProC ;
   private String[] T018110_A396EmprCod ;
   private int[] T018110_A252CliCod ;
   private String[] T018110_A494ForSer ;
   private String[] T018110_A482ForColNom ;
   private int[] T018110_A483ForColNum ;
   private byte[] T018110_A831TipColCod ;
   private String[] T018110_A9766ForProC ;
   private java.util.Date[] T018110_A10288Hp_dia ;
   private String[] T018111_A396EmprCod ;
   private int[] T018111_A252CliCod ;
   private String[] T018111_A494ForSer ;
   private String[] T018111_A482ForColNom ;
   private int[] T018111_A483ForColNum ;
   private byte[] T018111_A831TipColCod ;
   private String[] T018111_A9766ForProC ;
   private java.util.Date[] T018111_A10288Hp_dia ;
   private java.util.Date[] T01814_A10288Hp_dia ;
   private int[] T01814_A10392Hp_UltM ;
   private boolean[] T01814_n10392Hp_UltM ;
   private String[] T01814_A396EmprCod ;
   private int[] T01814_A252CliCod ;
   private byte[] T01814_A831TipColCod ;
   private String[] T01814_A494ForSer ;
   private String[] T01814_A482ForColNom ;
   private int[] T01814_A483ForColNum ;
   private String[] T01814_A9766ForProC ;
   private String[] T018115_A396EmprCod ;
   private int[] T018115_A252CliCod ;
   private String[] T018115_A494ForSer ;
   private String[] T018115_A482ForColNom ;
   private int[] T018115_A483ForColNum ;
   private byte[] T018115_A831TipColCod ;
   private String[] T018115_A9766ForProC ;
   private java.util.Date[] T018115_A10288Hp_dia ;
   private int[] T018115_A10290Hp_lin ;
   private String[] T018116_A396EmprCod ;
   private int[] T018116_A252CliCod ;
   private String[] T018116_A494ForSer ;
   private String[] T018116_A482ForColNom ;
   private int[] T018116_A483ForColNum ;
   private byte[] T018116_A831TipColCod ;
   private String[] T018116_A9766ForProC ;
   private java.util.Date[] T018116_A10288Hp_dia ;
   private String[] T018117_A494ForSer ;
   private String[] T018117_A482ForColNom ;
   private int[] T018117_A483ForColNum ;
   private byte[] T018117_A831TipColCod ;
   private String[] T018117_A9766ForProC ;
   private java.util.Date[] T018117_A10288Hp_dia ;
   private int[] T018117_A10393Hp_LinM ;
   private String[] T018117_A10394Hp_Motivo ;
   private boolean[] T018117_n10394Hp_Motivo ;
   private String[] T018117_A10395Hp_TermM ;
   private boolean[] T018117_n10395Hp_TermM ;
   private String[] T018117_A10396Hp_UsuM ;
   private boolean[] T018117_n10396Hp_UsuM ;
   private java.util.Date[] T018117_A10397Hp_ddhhM ;
   private boolean[] T018117_n10397Hp_ddhhM ;
   private String[] T018117_A396EmprCod ;
   private int[] T018117_A252CliCod ;
   private String[] T018118_A396EmprCod ;
   private int[] T018118_A252CliCod ;
   private String[] T018118_A494ForSer ;
   private String[] T018118_A482ForColNom ;
   private int[] T018118_A483ForColNum ;
   private byte[] T018118_A831TipColCod ;
   private String[] T018118_A9766ForProC ;
   private java.util.Date[] T018118_A10288Hp_dia ;
   private int[] T018118_A10393Hp_LinM ;
   private String[] T01813_A494ForSer ;
   private String[] T01813_A482ForColNom ;
   private int[] T01813_A483ForColNum ;
   private byte[] T01813_A831TipColCod ;
   private String[] T01813_A9766ForProC ;
   private java.util.Date[] T01813_A10288Hp_dia ;
   private int[] T01813_A10393Hp_LinM ;
   private String[] T01813_A10394Hp_Motivo ;
   private boolean[] T01813_n10394Hp_Motivo ;
   private String[] T01813_A10395Hp_TermM ;
   private boolean[] T01813_n10395Hp_TermM ;
   private String[] T01813_A10396Hp_UsuM ;
   private boolean[] T01813_n10396Hp_UsuM ;
   private java.util.Date[] T01813_A10397Hp_ddhhM ;
   private boolean[] T01813_n10397Hp_ddhhM ;
   private String[] T01813_A396EmprCod ;
   private int[] T01813_A252CliCod ;
   private String[] T01812_A494ForSer ;
   private String[] T01812_A482ForColNom ;
   private int[] T01812_A483ForColNum ;
   private byte[] T01812_A831TipColCod ;
   private String[] T01812_A9766ForProC ;
   private java.util.Date[] T01812_A10288Hp_dia ;
   private int[] T01812_A10393Hp_LinM ;
   private String[] T01812_A10394Hp_Motivo ;
   private boolean[] T01812_n10394Hp_Motivo ;
   private String[] T01812_A10395Hp_TermM ;
   private boolean[] T01812_n10395Hp_TermM ;
   private String[] T01812_A10396Hp_UsuM ;
   private boolean[] T01812_n10396Hp_UsuM ;
   private java.util.Date[] T01812_A10397Hp_ddhhM ;
   private boolean[] T01812_n10397Hp_ddhhM ;
   private String[] T01812_A396EmprCod ;
   private int[] T01812_A252CliCod ;
   private String[] T018122_A396EmprCod ;
   private int[] T018122_A252CliCod ;
   private String[] T018122_A494ForSer ;
   private String[] T018122_A482ForColNom ;
   private int[] T018122_A483ForColNum ;
   private byte[] T018122_A831TipColCod ;
   private String[] T018122_A9766ForProC ;
   private java.util.Date[] T018122_A10288Hp_dia ;
   private int[] T018122_A10393Hp_LinM ;
   private String[] T018123_A407EmprNom ;
   private boolean[] T018123_n407EmprNom ;
   private String[] T018124_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr0203__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0203__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0203__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0203__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr0203__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01812", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM, Hp_Motivo, Hp_TermM, Hp_UsuM, Hp_ddhhM, EmprCod, CliCod FROM TXPTR0203 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_LinM = ?  FOR UPDATE OF Hp_Motivo, Hp_TermM, Hp_UsuM, Hp_ddhhM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01813", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM, Hp_Motivo, Hp_TermM, Hp_UsuM, Hp_ddhhM, EmprCod, CliCod FROM TXPTR0203 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_LinM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01814", "SELECT Hp_dia, Hp_UltM, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?  FOR UPDATE OF Hp_UltM NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01815", "SELECT Hp_dia, Hp_UltM, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01816", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01817", "SELECT EmprCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01818", "SELECT /*+ FIRST_ROWS(100) */ TM1.Hp_dia, T2.EmprNom, TM1.Hp_UltM, TM1.EmprCod, TM1.CliCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.ForProC FROM (TXPTR0200 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.ForProC = ? and TM1.Hp_dia = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.ForProC, TM1.Hp_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01819", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018110", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE ( Hp_dia > ?) and EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018111", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE ( Hp_dia < ?) and EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ForProC DESC, Hp_dia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018112", "INSERT INTO TXPTR0200(Hp_dia, Hp_UltM, EmprCod, CliCod, TipColCod, ForSer, ForColNom, ForColNum, ForProC, Hp_ult) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPTR0200")
         ,new UpdateCursor("T018113", "UPDATE TXPTR0200 SET Hp_UltM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?", GX_NOMASK, "TXPTR0200")
         ,new UpdateCursor("T018114", "DELETE FROM TXPTR0200  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?", GX_NOMASK, "TXPTR0200")
         ,new ForEachCursor("T018115", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_lin FROM TXPTR0201 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018116", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia FROM TXPTR0200 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018117", "SELECT ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM, Hp_Motivo, Hp_TermM, Hp_UsuM, Hp_ddhhM, EmprCod, CliCod FROM TXPTR0203 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? and Hp_LinM = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018118", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM FROM TXPTR0203 WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_LinM = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018119", "INSERT INTO TXPTR0203(ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM, Hp_Motivo, Hp_TermM, Hp_UsuM, Hp_ddhhM, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR0203")
         ,new UpdateCursor("T018120", "UPDATE TXPTR0203 SET Hp_Motivo=?, Hp_TermM=?, Hp_UsuM=?, Hp_ddhhM=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_LinM = ?", GX_NOMASK, "TXPTR0203")
         ,new UpdateCursor("T018121", "DELETE FROM TXPTR0203  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? AND Hp_dia = ? AND Hp_LinM = ?", GX_NOMASK, "TXPTR0203")
         ,new ForEachCursor("T018122", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM FROM TXPTR0203 WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? and Hp_dia = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC, Hp_dia, Hp_LinM ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018123", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018124", "SELECT EmprCod FROM TXPCLARPD WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ForProC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
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
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 16 :
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
            case 20 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
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
               return;
            case 15 :
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
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[8], 800);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[14], false);
               }
               stmt.setString(12, (String)parms[15], 3);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 800);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setString(8, (String)parms[11], 13);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setString(11, (String)parms[14], 8);
               stmt.setDate(12, (java.util.Date)parms[15]);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
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

