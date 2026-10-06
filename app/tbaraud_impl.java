package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbaraud_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A252CliCod) ;
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
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV49BarAudTur = (byte)(GXutil.lval( httpContext.GetPar( "BarAudTur"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49BarAudTur", GXutil.str( AV49BarAudTur, 1, 0));
            AV50BarAudOpe = (int)(GXutil.lval( httpContext.GetPar( "BarAudOpe"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50BarAudOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50BarAudOpe), 6, 0));
            AV52BarAudOpeN = httpContext.GetPar( "BarAudOpeN") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52BarAudOpeN", AV52BarAudOpeN);
            AV51BarAudSup = (int)(GXutil.lval( httpContext.GetPar( "BarAudSup"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51BarAudSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarAudSup), 6, 0));
            AV53BarAudSupN = httpContext.GetPar( "BarAudSupN") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53BarAudSupN", AV53BarAudSupN);
            AV54BarAudFec = localUtil.parseDateParm( httpContext.GetPar( "BarAudFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54BarAudFec", localUtil.format(AV54BarAudFec, "99/99/99"));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "AUDITORIA RECEP.MATERIA HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarDisNum_Internalname ;
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
      nRC_GXsfl_210 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_210"))) ;
      nGXsfl_210_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_210_idx"))) ;
      sGXsfl_210_idx = httpContext.GetPar( "sGXsfl_210_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      n396EmprCod = false ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      n129BarCod = false ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      n132BarCodReo = false ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      n130BarCodPar = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tbaraud_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbaraud_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbaraud_impl.class ));
   }

   public tbaraud_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkBarTin = UIFactory.getCheckbox(this);
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
      A4016BarTin = ((GXutil.strcmp(GXutil.rtrim( A4016BarTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", A4016BarTin);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARAUD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Disposicion Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecCli_Internalname, localUtil.format(A155BarFecCli, "99/99/99"), localUtil.format( A155BarFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBARAUD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripción Serie", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Dibujo Cliente en Hoja Ruta", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDibCli_Internalname, GXutil.rtrim( A1798BarDibCli), GXutil.rtrim( localUtil.format( A1798BarDibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Dibujo Interno en Hoja Ruta", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtBarDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Situacion", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Piezas Dispos. sin desglose", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieNDes_Internalname, GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieNDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A898BarPieNDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieNDes_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieNDes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "", "", "", "", "", 1, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Tintar ?", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkBarTin.getInternalname(), A4016BarTin, "", "", 1, chkBarTin.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(116, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,116);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Tipod Disposicion,C,M,etc", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDis_Internalname, GXutil.rtrim( A2010BarTipDis), GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDis_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Fecha Auditoria Hdr", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarAudFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudFec_Internalname, localUtil.format(A4832BarAudFec, "99/99/99"), localUtil.format( A4832BarAudFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudFec_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarAudFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarAudFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TBARAUD.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Turno Revisor Auditoria Hdr", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudTur_Internalname, GXutil.ltrim( localUtil.ntoc( A4833BarAudTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudTur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4833BarAudTur), "9") : localUtil.format( DecimalUtil.doubleToDec(A4833BarAudTur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudTur_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudTur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Operario Auditor por Hdr", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudOpe_Internalname, GXutil.ltrim( localUtil.ntoc( A4834BarAudOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudOpe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4834BarAudOpe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4834BarAudOpe), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudOpe_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudOpe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Nombre Oper.Auditor Hdr", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudOpeN_Internalname, GXutil.rtrim( A4835BarAudOpeN), GXutil.rtrim( localUtil.format( A4835BarAudOpeN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudOpeN_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudOpeN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Operacion Supervisor Auditoria", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudSup_Internalname, GXutil.ltrim( localUtil.ntoc( A4836BarAudSup, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudSup_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4836BarAudSup), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4836BarAudSup), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudSup_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudSup_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Nombre Oper.Super.Auditor", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudSupN_Internalname, GXutil.rtrim( A4837BarAudSupN), GXutil.rtrim( localUtil.format( A4837BarAudSupN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudSupN_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudSupN_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Rollos o Pzas Auditoria Hdr", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudNPz_Internalname, GXutil.ltrim( localUtil.ntoc( A4838BarAudNPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudNPz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4838BarAudNPz), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4838BarAudNPz), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudNPz_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudNPz_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Mts.Tabular Auditoria Hdr", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudMTab_Internalname, GXutil.ltrim( localUtil.ntoc( A4839BarAudMTab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudMTab_Enabled!=0) ? localUtil.format( A4839BarAudMTab, "ZZZZZ9.99") : localUtil.format( A4839BarAudMTab, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudMTab_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudMTab_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Mts.Digital Auditoria", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudMDig_Internalname, GXutil.ltrim( localUtil.ntoc( A4840BarAudMDig, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudMDig_Enabled!=0) ? localUtil.format( A4840BarAudMDig, "ZZZZZ9.99") : localUtil.format( A4840BarAudMDig, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudMDig_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudMDig_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Mts.Cuenta Mts. Auditoria Hdr", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudMCue_Internalname, GXutil.ltrim( localUtil.ntoc( A4841BarAudMCue, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudMCue_Enabled!=0) ? localUtil.format( A4841BarAudMCue, "ZZZZZ9.99") : localUtil.format( A4841BarAudMCue, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudMCue_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudMCue_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Diferencia Mts.Digital Auditor", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudMDD_Internalname, GXutil.ltrim( localUtil.ntoc( A4842BarAudMDD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudMDD_Enabled!=0) ? localUtil.format( A4842BarAudMDD, "ZZZZZ9.99") : localUtil.format( A4842BarAudMDD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudMDD_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudMDD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Difer.Mts.Cuenta Mts.Audit.", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudMDC_Internalname, GXutil.ltrim( localUtil.ntoc( A4843BarAudMDC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudMDC_Enabled!=0) ? localUtil.format( A4843BarAudMDC, "ZZZZZ9.99") : localUtil.format( A4843BarAudMDC, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudMDC_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudMDC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Ult.Linea Piezas Auditoria", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAudULin_Internalname, GXutil.ltrim( localUtil.ntoc( A4844BarAudULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAudULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4844BarAudULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4844BarAudULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAudULin_Jsonclick, 0, "", "", "", "", "", 1, edtBarAudULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Observ.Auditoria Hdr.", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtBarAudObs_Internalname, A4845BarAudObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", (short)(0), 1, edtBarAudObs_Enabled, 0, 80, "chr", 5, "row", (byte)(0), StyleString, ClassString, "", "", "400", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtr_Enabled!=0) ? localUtil.format( A184BarMtr, "ZZZZZ9.99") : localUtil.format( A184BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtr_Jsonclick, 0, "", "", "", "", "", 1, edtBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie_Jsonclick, 0, "", "", "", "", "", 1, edtBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARAUD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol210( ) ;
      nGXsfl_210_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1567 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1567 = (short)(1) ;
            scanStart1FE1567( ) ;
            while ( RcdFound1567 != 0 )
            {
               init_level_properties1567( ) ;
               getByPrimaryKey1FE1567( ) ;
               addRow1FE1567( ) ;
               scanNext1FE1567( ) ;
            }
            scanEnd1FE1567( ) ;
            nBlankRcdCount1567 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4839BarAudMTab = A4839BarAudMTab ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         standaloneNotModal1FE1567( ) ;
         standaloneModal1FE1567( ) ;
         sMode1567 = Gx_mode ;
         while ( nGXsfl_210_idx < nRC_GXsfl_210 )
         {
            bGXsfl_210_Refreshing = true ;
            readRow1FE1567( ) ;
            edtavnRcdDeleted_1567_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1567_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1567_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1567_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDLIN_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLin_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPIE_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudPie_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDMTS_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMts_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudCar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDCAR_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudCar_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPAR_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudPar_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudEmpV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDEMPV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudEmpV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudEmpV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudBarV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDBARV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudBarV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudBarV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudReoV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDREOV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudReoV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudReoV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudParV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPARV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudParV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudParV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudLinV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDLINV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLinV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDCANT_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudCant_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            edtBarAudPant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPANT_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAudPant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudPant_Enabled), 5, 0), !bGXsfl_210_Refreshing);
            if ( ( nRcdExists_1567 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FE1567( ) ;
            }
            sendRow1FE1567( ) ;
            bGXsfl_210_Refreshing = false ;
         }
         Gx_mode = sMode1567 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4839BarAudMTab = B4839BarAudMTab ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1567 = (short)(5) ;
         nRcdExists_1567 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FE1567( ) ;
            while ( RcdFound1567 != 0 )
            {
               sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2101567( ) ;
               init_level_properties1567( ) ;
               standaloneNotModal1FE1567( ) ;
               getByPrimaryKey1FE1567( ) ;
               standaloneModal1FE1567( ) ;
               addRow1FE1567( ) ;
               scanNext1FE1567( ) ;
            }
            scanEnd1FE1567( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1567 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_2101567( ) ;
      initAll1FE1567( ) ;
      init_level_properties1567( ) ;
      B4839BarAudMTab = A4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      nRcdExists_1567 = (short)(0) ;
      nIsMod_1567 = (short)(0) ;
      nRcdDeleted_1567 = (short)(0) ;
      nBlankRcdCount1567 = (short)(nBlankRcdUsr1567+nBlankRcdCount1567) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1567 > 0 )
      {
         standaloneNotModal1FE1567( ) ;
         standaloneModal1FE1567( ) ;
         addRow1FE1567( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarAudLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1567 = (short)(nBlankRcdCount1567-1) ;
      }
      Gx_mode = sMode1567 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4839BarAudMTab = B4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARAUD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARAUD.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         Z143BarDisNum = httpContext.cgiGet( "Z143BarDisNum") ;
         Z155BarFecCli = localUtil.ctod( httpContext.cgiGet( "Z155BarFecCli"), 0) ;
         Z212BarSer = httpContext.cgiGet( "Z212BarSer") ;
         Z1652BarSerDsc = httpContext.cgiGet( "Z1652BarSerDsc") ;
         Z1798BarDibCli = httpContext.cgiGet( "Z1798BarDibCli") ;
         Z1799BarDibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1799BarDibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z135BarColNom = httpContext.cgiGet( "Z135BarColNom") ;
         Z136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z136BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z218BarTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z213BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z120BarAgrEst = httpContext.cgiGet( "Z120BarAgrEst") ;
         Z4016BarTin = httpContext.cgiGet( "Z4016BarTin") ;
         Z2010BarTipDis = httpContext.cgiGet( "Z2010BarTipDis") ;
         Z4832BarAudFec = localUtil.ctod( httpContext.cgiGet( "Z4832BarAudFec"), 0) ;
         Z4833BarAudTur = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4833BarAudTur"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4834BarAudOpe = (int)(localUtil.ctol( httpContext.cgiGet( "Z4834BarAudOpe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4835BarAudOpeN = httpContext.cgiGet( "Z4835BarAudOpeN") ;
         Z4836BarAudSup = (int)(localUtil.ctol( httpContext.cgiGet( "Z4836BarAudSup"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4837BarAudSupN = httpContext.cgiGet( "Z4837BarAudSupN") ;
         Z4838BarAudNPz = (short)(localUtil.ctol( httpContext.cgiGet( "Z4838BarAudNPz"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4840BarAudMDig = localUtil.ctond( httpContext.cgiGet( "Z4840BarAudMDig")) ;
         Z4841BarAudMCue = localUtil.ctond( httpContext.cgiGet( "Z4841BarAudMCue")) ;
         Z4844BarAudULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4844BarAudULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4845BarAudObs = httpContext.cgiGet( "Z4845BarAudObs") ;
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         O4839BarAudMTab = localUtil.ctond( httpContext.cgiGet( "O4839BarAudMTab")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_210 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_210"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
         A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
         A365DisDes = httpContext.cgiGet( "DISDES") ;
         A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarFecCli_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARFECCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A155BarFecCli = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
         }
         else
         {
            A155BarFecCli = localUtil.ctod( httpContext.cgiGet( edtBarFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
         }
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARDIBINT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarDibInt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1799BarDibInt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
         }
         else
         {
            A1799BarDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtBarDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
         }
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A136BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         }
         else
         {
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A218BarTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         }
         else
         {
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A361DisCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         else
         {
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARSIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarSit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A213BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         }
         else
         {
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         }
         A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieNDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A4016BarTin = ((GXutil.strcmp(httpContext.cgiGet( chkBarTin.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", A4016BarTin);
         A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( localUtil.vcdate( httpContext.cgiGet( edtBarAudFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BARAUDFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4832BarAudFec = GXutil.nullDate() ;
            n4832BarAudFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4832BarAudFec", localUtil.format(A4832BarAudFec, "99/99/99"));
         }
         else
         {
            A4832BarAudFec = localUtil.ctod( httpContext.cgiGet( edtBarAudFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n4832BarAudFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4832BarAudFec", localUtil.format(A4832BarAudFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDTUR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudTur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4833BarAudTur = (byte)(0) ;
            n4833BarAudTur = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4833BarAudTur", GXutil.str( A4833BarAudTur, 1, 0));
         }
         else
         {
            A4833BarAudTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAudTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4833BarAudTur = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4833BarAudTur", GXutil.str( A4833BarAudTur, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDOPE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudOpe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4834BarAudOpe = 0 ;
            n4834BarAudOpe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4834BarAudOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4834BarAudOpe), 6, 0));
         }
         else
         {
            A4834BarAudOpe = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAudOpe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4834BarAudOpe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4834BarAudOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4834BarAudOpe), 6, 0));
         }
         A4835BarAudOpeN = httpContext.cgiGet( edtBarAudOpeN_Internalname) ;
         n4835BarAudOpeN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4835BarAudOpeN", A4835BarAudOpeN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudSup_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudSup_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDSUP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudSup_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4836BarAudSup = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4836BarAudSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4836BarAudSup), 6, 0));
         }
         else
         {
            A4836BarAudSup = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAudSup_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4836BarAudSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4836BarAudSup), 6, 0));
         }
         A4837BarAudSupN = httpContext.cgiGet( edtBarAudSupN_Internalname) ;
         n4837BarAudSupN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4837BarAudSupN", A4837BarAudSupN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDNPZ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudNPz_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4838BarAudNPz = (short)(0) ;
            n4838BarAudNPz = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4838BarAudNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4838BarAudNPz), 4, 0));
         }
         else
         {
            A4838BarAudNPz = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAudNPz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4838BarAudNPz = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4838BarAudNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4838BarAudNPz), 4, 0));
         }
         A4839BarAudMTab = localUtil.ctond( httpContext.cgiGet( edtBarAudMTab_Internalname)) ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAudMDig_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAudMDig_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDMDIG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudMDig_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4840BarAudMDig = DecimalUtil.ZERO ;
            n4840BarAudMDig = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4840BarAudMDig", GXutil.ltrimstr( A4840BarAudMDig, 9, 2));
         }
         else
         {
            A4840BarAudMDig = localUtil.ctond( httpContext.cgiGet( edtBarAudMDig_Internalname)) ;
            n4840BarAudMDig = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4840BarAudMDig", GXutil.ltrimstr( A4840BarAudMDig, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAudMCue_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAudMCue_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDMCUE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudMCue_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4841BarAudMCue = DecimalUtil.ZERO ;
            n4841BarAudMCue = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4841BarAudMCue", GXutil.ltrimstr( A4841BarAudMCue, 9, 2));
         }
         else
         {
            A4841BarAudMCue = localUtil.ctond( httpContext.cgiGet( edtBarAudMCue_Internalname)) ;
            n4841BarAudMCue = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4841BarAudMCue", GXutil.ltrimstr( A4841BarAudMCue, 9, 2));
         }
         A4842BarAudMDD = localUtil.ctond( httpContext.cgiGet( edtBarAudMDD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
         A4843BarAudMDC = localUtil.ctond( httpContext.cgiGet( edtBarAudMDC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAUDULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAudULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4844BarAudULin = (short)(0) ;
            n4844BarAudULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
         }
         else
         {
            A4844BarAudULin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAudULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4844BarAudULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
         }
         A4845BarAudObs = httpContext.cgiGet( edtBarAudObs_Internalname) ;
         n4845BarAudObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4845BarAudObs", A4845BarAudObs);
         A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TBARAUD");
         forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
         forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tbaraud:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1FE12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1567_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1567_Enabled), 5, 0), !bGXsfl_210_Refreshing);
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
      disableAttributes1FE12( ) ;
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

   public void confirm_1FE0( )
   {
      beforeValidate1FE12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FE12( ) ;
         }
         else
         {
            checkExtendedTable1FE12( ) ;
            if ( AnyError == 0 )
            {
               zm1FE12( 15) ;
               zm1FE12( 16) ;
               zm1FE12( 17) ;
               zm1FE12( 18) ;
               zm1FE12( 19) ;
            }
            closeExtendedTableCursors1FE12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1FE1567( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FE0( ) ;
      }
   }

   public void confirm_1FE1567( )
   {
      s4839BarAudMTab = O4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      s4842BarAudMDD = O4842BarAudMDD ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
      s4843BarAudMDC = O4843BarAudMDC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      nGXsfl_210_idx = 0 ;
      while ( nGXsfl_210_idx < nRC_GXsfl_210 )
      {
         readRow1FE1567( ) ;
         if ( ( nRcdExists_1567 != 0 ) || ( nIsMod_1567 != 0 ) )
         {
            getKey1FE1567( ) ;
            if ( ( nRcdExists_1567 == 0 ) && ( nRcdDeleted_1567 == 0 ) )
            {
               if ( RcdFound1567 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FE1567( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FE1567( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1FE1567( 21) ;
                        zm1FE1567( 22) ;
                     }
                     closeExtendedTableCursors1FE1567( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4839BarAudMTab = A4839BarAudMTab ;
                     n4839BarAudMTab = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
                     O4842BarAudMDD = A4842BarAudMDD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
                     O4843BarAudMDC = A4843BarAudMDC ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "BARAUDLIN_" + sGXsfl_210_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarAudLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1567 != 0 )
               {
                  if ( nRcdDeleted_1567 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FE1567( ) ;
                     load1FE1567( ) ;
                     beforeValidate1FE1567( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FE1567( ) ;
                        O4839BarAudMTab = A4839BarAudMTab ;
                        n4839BarAudMTab = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
                        O4842BarAudMDD = A4842BarAudMDD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
                        O4843BarAudMDC = A4843BarAudMDC ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1567 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FE1567( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FE1567( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1FE1567( 21) ;
                              zm1FE1567( 22) ;
                           }
                           closeExtendedTableCursors1FE1567( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4839BarAudMTab = A4839BarAudMTab ;
                           n4839BarAudMTab = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
                           O4842BarAudMDD = A4842BarAudMDD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
                           O4843BarAudMDC = A4843BarAudMDC ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1567 == 0 )
                  {
                     GXCCtl = "BARAUDLIN_" + sGXsfl_210_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAudLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1567_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4846BarAudLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudPie_Internalname, GXutil.rtrim( A4847BarAudPie)) ;
         httpContext.changePostValue( edtBarAudMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudCar_Internalname, GXutil.rtrim( A4849BarAudCar)) ;
         httpContext.changePostValue( edtBarAudPar_Internalname, GXutil.rtrim( A5000BarAudPar)) ;
         httpContext.changePostValue( edtBarAudEmpV_Internalname, GXutil.rtrim( A5001BarAudEmpV)) ;
         httpContext.changePostValue( edtBarAudBarV_Internalname, GXutil.ltrim( localUtil.ntoc( A5002BarAudBarV, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudReoV_Internalname, GXutil.ltrim( localUtil.ntoc( A5003BarAudReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudParV_Internalname, GXutil.rtrim( A5004BarAudParV)) ;
         httpContext.changePostValue( edtBarAudLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A5005BarAudLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudCant_Internalname, GXutil.rtrim( A5006BarAudCant)) ;
         httpContext.changePostValue( edtBarAudPant_Internalname, GXutil.rtrim( A5007BarAudPant)) ;
         httpContext.changePostValue( "ZT_"+"Z4846BarAudLin_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( Z4846BarAudLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4847BarAudPie_"+sGXsfl_210_idx, GXutil.rtrim( Z4847BarAudPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4848BarAudMts_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( Z4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4849BarAudCar_"+sGXsfl_210_idx, GXutil.rtrim( Z4849BarAudCar)) ;
         httpContext.changePostValue( "ZT_"+"Z5000BarAudPar_"+sGXsfl_210_idx, GXutil.rtrim( Z5000BarAudPar)) ;
         httpContext.changePostValue( "T4848BarAudMts_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( O4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1567_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1567_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1567_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1567 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1567_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1567_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDLIN_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPIE_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDMTS_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDCAR_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPAR_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDEMPV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudEmpV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDBARV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudBarV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDREOV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudReoV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPARV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudParV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDLINV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLinV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDCANT_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPANT_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4839BarAudMTab = s4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      O4842BarAudMDD = s4842BarAudMDD ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
      O4843BarAudMDC = s4843BarAudMDC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FE0( )
   {
   }

   public void zm1FE12( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2759BarMaqGru = T01FE11_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01FE11_A180BarMaqCod[0] ;
            Z143BarDisNum = T01FE11_A143BarDisNum[0] ;
            Z155BarFecCli = T01FE11_A155BarFecCli[0] ;
            Z212BarSer = T01FE11_A212BarSer[0] ;
            Z1652BarSerDsc = T01FE11_A1652BarSerDsc[0] ;
            Z1798BarDibCli = T01FE11_A1798BarDibCli[0] ;
            Z1799BarDibInt = T01FE11_A1799BarDibInt[0] ;
            Z135BarColNom = T01FE11_A135BarColNom[0] ;
            Z136BarColNum = T01FE11_A136BarColNum[0] ;
            Z218BarTipCol = T01FE11_A218BarTipCol[0] ;
            Z213BarSit = T01FE11_A213BarSit[0] ;
            Z120BarAgrEst = T01FE11_A120BarAgrEst[0] ;
            Z4016BarTin = T01FE11_A4016BarTin[0] ;
            Z2010BarTipDis = T01FE11_A2010BarTipDis[0] ;
            Z4832BarAudFec = T01FE11_A4832BarAudFec[0] ;
            Z4833BarAudTur = T01FE11_A4833BarAudTur[0] ;
            Z4834BarAudOpe = T01FE11_A4834BarAudOpe[0] ;
            Z4835BarAudOpeN = T01FE11_A4835BarAudOpeN[0] ;
            Z4836BarAudSup = T01FE11_A4836BarAudSup[0] ;
            Z4837BarAudSupN = T01FE11_A4837BarAudSupN[0] ;
            Z4838BarAudNPz = T01FE11_A4838BarAudNPz[0] ;
            Z4840BarAudMDig = T01FE11_A4840BarAudMDig[0] ;
            Z4841BarAudMCue = T01FE11_A4841BarAudMCue[0] ;
            Z4844BarAudULin = T01FE11_A4844BarAudULin[0] ;
            Z4845BarAudObs = T01FE11_A4845BarAudObs[0] ;
            Z361DisCod = T01FE11_A361DisCod[0] ;
         }
         else
         {
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z143BarDisNum = A143BarDisNum ;
            Z155BarFecCli = A155BarFecCli ;
            Z212BarSer = A212BarSer ;
            Z1652BarSerDsc = A1652BarSerDsc ;
            Z1798BarDibCli = A1798BarDibCli ;
            Z1799BarDibInt = A1799BarDibInt ;
            Z135BarColNom = A135BarColNom ;
            Z136BarColNum = A136BarColNum ;
            Z218BarTipCol = A218BarTipCol ;
            Z213BarSit = A213BarSit ;
            Z120BarAgrEst = A120BarAgrEst ;
            Z4016BarTin = A4016BarTin ;
            Z2010BarTipDis = A2010BarTipDis ;
            Z4832BarAudFec = A4832BarAudFec ;
            Z4833BarAudTur = A4833BarAudTur ;
            Z4834BarAudOpe = A4834BarAudOpe ;
            Z4835BarAudOpeN = A4835BarAudOpeN ;
            Z4836BarAudSup = A4836BarAudSup ;
            Z4837BarAudSupN = A4837BarAudSupN ;
            Z4838BarAudNPz = A4838BarAudNPz ;
            Z4840BarAudMDig = A4840BarAudMDig ;
            Z4841BarAudMCue = A4841BarAudMCue ;
            Z4844BarAudULin = A4844BarAudULin ;
            Z4845BarAudObs = A4845BarAudObs ;
            Z361DisCod = A361DisCod ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z143BarDisNum = A143BarDisNum ;
         Z155BarFecCli = A155BarFecCli ;
         Z252CliCod = A252CliCod ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z1798BarDibCli = A1798BarDibCli ;
         Z1799BarDibInt = A1799BarDibInt ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z213BarSit = A213BarSit ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z4016BarTin = A4016BarTin ;
         Z2010BarTipDis = A2010BarTipDis ;
         Z4832BarAudFec = A4832BarAudFec ;
         Z4833BarAudTur = A4833BarAudTur ;
         Z4834BarAudOpe = A4834BarAudOpe ;
         Z4835BarAudOpeN = A4835BarAudOpeN ;
         Z4836BarAudSup = A4836BarAudSup ;
         Z4837BarAudSupN = A4837BarAudSupN ;
         Z4838BarAudNPz = A4838BarAudNPz ;
         Z4840BarAudMDig = A4840BarAudMDig ;
         Z4841BarAudMCue = A4841BarAudMCue ;
         Z4844BarAudULin = A4844BarAudULin ;
         Z4845BarAudObs = A4845BarAudObs ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z407EmprNom = A407EmprNom ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z184BarMtr = A184BarMtr ;
         Z199BarPie1 = A199BarPie1 ;
         Z4839BarAudMTab = A4839BarAudMTab ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01FE12 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FE12_A407EmprNom[0] ;
      n407EmprNom = T01FE12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01FE16 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A898BarPieNDes = T01FE16_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = T01FE16_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T01FE16_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(9);
      /* Using cursor T01FE18 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A4839BarAudMTab = T01FE18_A4839BarAudMTab[0] ;
         n4839BarAudMTab = T01FE18_n4839BarAudMTab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      else
      {
         A4839BarAudMTab = DecimalUtil.doubleToDec(0) ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      O4839BarAudMTab = A4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      pr_default.close(10);
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
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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

   public void load1FE12( )
   {
      /* Using cursor T01FE21 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A2759BarMaqGru = T01FE21_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01FE21_A180BarMaqCod[0] ;
         A143BarDisNum = T01FE21_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A155BarFecCli = T01FE21_A155BarFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
         A252CliCod = T01FE21_A252CliCod[0] ;
         n252CliCod = T01FE21_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01FE21_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A212BarSer = T01FE21_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01FE21_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A1798BarDibCli = T01FE21_A1798BarDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
         A1799BarDibInt = T01FE21_A1799BarDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
         A135BarColNom = T01FE21_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01FE21_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01FE21_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A213BarSit = T01FE21_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T01FE21_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A4016BarTin = T01FE21_A4016BarTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", A4016BarTin);
         A2010BarTipDis = T01FE21_A2010BarTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A407EmprNom = T01FE21_A407EmprNom[0] ;
         n407EmprNom = T01FE21_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4832BarAudFec = T01FE21_A4832BarAudFec[0] ;
         n4832BarAudFec = T01FE21_n4832BarAudFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4832BarAudFec", localUtil.format(A4832BarAudFec, "99/99/99"));
         A4833BarAudTur = T01FE21_A4833BarAudTur[0] ;
         n4833BarAudTur = T01FE21_n4833BarAudTur[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4833BarAudTur", GXutil.str( A4833BarAudTur, 1, 0));
         A4834BarAudOpe = T01FE21_A4834BarAudOpe[0] ;
         n4834BarAudOpe = T01FE21_n4834BarAudOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4834BarAudOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4834BarAudOpe), 6, 0));
         A4835BarAudOpeN = T01FE21_A4835BarAudOpeN[0] ;
         n4835BarAudOpeN = T01FE21_n4835BarAudOpeN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4835BarAudOpeN", A4835BarAudOpeN);
         A4836BarAudSup = T01FE21_A4836BarAudSup[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4836BarAudSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4836BarAudSup), 6, 0));
         A4837BarAudSupN = T01FE21_A4837BarAudSupN[0] ;
         n4837BarAudSupN = T01FE21_n4837BarAudSupN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4837BarAudSupN", A4837BarAudSupN);
         A4838BarAudNPz = T01FE21_A4838BarAudNPz[0] ;
         n4838BarAudNPz = T01FE21_n4838BarAudNPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4838BarAudNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4838BarAudNPz), 4, 0));
         A4840BarAudMDig = T01FE21_A4840BarAudMDig[0] ;
         n4840BarAudMDig = T01FE21_n4840BarAudMDig[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4840BarAudMDig", GXutil.ltrimstr( A4840BarAudMDig, 9, 2));
         A4841BarAudMCue = T01FE21_A4841BarAudMCue[0] ;
         n4841BarAudMCue = T01FE21_n4841BarAudMCue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4841BarAudMCue", GXutil.ltrimstr( A4841BarAudMCue, 9, 2));
         A4844BarAudULin = T01FE21_A4844BarAudULin[0] ;
         n4844BarAudULin = T01FE21_n4844BarAudULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
         A4845BarAudObs = T01FE21_A4845BarAudObs[0] ;
         n4845BarAudObs = T01FE21_n4845BarAudObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4845BarAudObs", A4845BarAudObs);
         A365DisDes = T01FE21_A365DisDes[0] ;
         A361DisCod = T01FE21_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A898BarPieNDes = T01FE21_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A4839BarAudMTab = T01FE21_A4839BarAudMTab[0] ;
         n4839BarAudMTab = T01FE21_n4839BarAudMTab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         A184BarMtr = T01FE21_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T01FE21_A199BarPie1[0] ;
         zm1FE12( -14) ;
      }
      pr_default.close(11);
      onLoadActions1FE12( ) ;
   }

   public void onLoadActions1FE12( )
   {
      O4839BarAudMTab = A4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      /* Using cursor T01FE13 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      A252CliCod = T01FE13_A252CliCod[0] ;
      n252CliCod = T01FE13_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T01FE13_A365DisDes[0] ;
      pr_default.close(7);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      A4843BarAudMDC = A4839BarAudMTab.subtract(A4841BarAudMCue) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      A4842BarAudMDD = A4839BarAudMTab.subtract(A4840BarAudMDig) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
   }

   public void checkExtendedTable1FE12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01FE13 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01FE13_A252CliCod[0] ;
      n252CliCod = T01FE13_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T01FE13_A365DisDes[0] ;
      pr_default.close(7);
      /* Using cursor T01FE14 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FE14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(8);
      if ( ! ( ( GXutil.strcmp(A4016BarTin, "S") == 0 ) || ( GXutil.strcmp(A4016BarTin, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tinte ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = chkBarTin.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_12 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         nIsDirty_12 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      nIsDirty_12 = (short)(1) ;
      A4843BarAudMDC = A4839BarAudMTab.subtract(A4841BarAudMCue) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      nIsDirty_12 = (short)(1) ;
      A4842BarAudMDD = A4839BarAudMTab.subtract(A4840BarAudMDig) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
   }

   public void closeExtendedTableCursors1FE12( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01FE22 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01FE22_A252CliCod[0] ;
      n252CliCod = T01FE22_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = T01FE22_A365DisDes[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_17( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01FE23 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FE23_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1FE12( )
   {
      /* Using cursor T01FE24 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FE11 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) && ( T01FE11_A129BarCod[0] == A129BarCod ) && ( T01FE11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01FE11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01FE11_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FE12( 14) ;
         RcdFound12 = (short)(1) ;
         A2759BarMaqGru = T01FE11_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01FE11_A180BarMaqCod[0] ;
         A143BarDisNum = T01FE11_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A155BarFecCli = T01FE11_A155BarFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
         A212BarSer = T01FE11_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01FE11_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A1798BarDibCli = T01FE11_A1798BarDibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
         A1799BarDibInt = T01FE11_A1799BarDibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
         A135BarColNom = T01FE11_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01FE11_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01FE11_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A213BarSit = T01FE11_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A120BarAgrEst = T01FE11_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A4016BarTin = T01FE11_A4016BarTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", A4016BarTin);
         A2010BarTipDis = T01FE11_A2010BarTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A4832BarAudFec = T01FE11_A4832BarAudFec[0] ;
         n4832BarAudFec = T01FE11_n4832BarAudFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4832BarAudFec", localUtil.format(A4832BarAudFec, "99/99/99"));
         A4833BarAudTur = T01FE11_A4833BarAudTur[0] ;
         n4833BarAudTur = T01FE11_n4833BarAudTur[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4833BarAudTur", GXutil.str( A4833BarAudTur, 1, 0));
         A4834BarAudOpe = T01FE11_A4834BarAudOpe[0] ;
         n4834BarAudOpe = T01FE11_n4834BarAudOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4834BarAudOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4834BarAudOpe), 6, 0));
         A4835BarAudOpeN = T01FE11_A4835BarAudOpeN[0] ;
         n4835BarAudOpeN = T01FE11_n4835BarAudOpeN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4835BarAudOpeN", A4835BarAudOpeN);
         A4836BarAudSup = T01FE11_A4836BarAudSup[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4836BarAudSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4836BarAudSup), 6, 0));
         A4837BarAudSupN = T01FE11_A4837BarAudSupN[0] ;
         n4837BarAudSupN = T01FE11_n4837BarAudSupN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4837BarAudSupN", A4837BarAudSupN);
         A4838BarAudNPz = T01FE11_A4838BarAudNPz[0] ;
         n4838BarAudNPz = T01FE11_n4838BarAudNPz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4838BarAudNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4838BarAudNPz), 4, 0));
         A4840BarAudMDig = T01FE11_A4840BarAudMDig[0] ;
         n4840BarAudMDig = T01FE11_n4840BarAudMDig[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4840BarAudMDig", GXutil.ltrimstr( A4840BarAudMDig, 9, 2));
         A4841BarAudMCue = T01FE11_A4841BarAudMCue[0] ;
         n4841BarAudMCue = T01FE11_n4841BarAudMCue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4841BarAudMCue", GXutil.ltrimstr( A4841BarAudMCue, 9, 2));
         A4844BarAudULin = T01FE11_A4844BarAudULin[0] ;
         n4844BarAudULin = T01FE11_n4844BarAudULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
         A4845BarAudObs = T01FE11_A4845BarAudObs[0] ;
         n4845BarAudObs = T01FE11_n4845BarAudObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4845BarAudObs", A4845BarAudObs);
         A361DisCod = T01FE11_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FE12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1FE12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1FE12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1FE12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T01FE25 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01FE25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FE25_A129BarCod[0] == A129BarCod ) && ( T01FE25_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01FE25_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T01FE25_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FE25_A129BarCod[0] == A129BarCod ) && ( T01FE25_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01FE25_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01FE26 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T01FE26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FE26_A129BarCod[0] == A129BarCod ) && ( T01FE26_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01FE26_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T01FE26_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FE26_A129BarCod[0] == A129BarCod ) && ( T01FE26_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01FE26_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FE12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4839BarAudMTab = O4839BarAudMTab ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         A4842BarAudMDD = O4842BarAudMDD ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
         A4843BarAudMDC = O4843BarAudMDC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
         GX_FocusControl = edtBarDisNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FE12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4839BarAudMTab = O4839BarAudMTab ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
               A4842BarAudMDD = O4842BarAudMDD ;
               httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
               A4843BarAudMDC = O4843BarAudMDC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarDisNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4839BarAudMTab = O4839BarAudMTab ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
               A4842BarAudMDD = O4842BarAudMDD ;
               httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
               A4843BarAudMDC = O4843BarAudMDC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
               update1FE12( ) ;
               GX_FocusControl = edtBarDisNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4839BarAudMTab = O4839BarAudMTab ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
               A4842BarAudMDD = O4842BarAudMDD ;
               httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
               A4843BarAudMDC = O4843BarAudMDC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
               GX_FocusControl = edtBarDisNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FE12( ) ;
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
                  A4839BarAudMTab = O4839BarAudMTab ;
                  n4839BarAudMTab = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
                  A4842BarAudMDD = O4842BarAudMDD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
                  A4843BarAudMDC = O4843BarAudMDC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
                  GX_FocusControl = edtBarDisNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FE12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4839BarAudMTab = O4839BarAudMTab ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         A4842BarAudMDD = O4842BarAudMDD ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
         A4843BarAudMDC = O4843BarAudMDC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarDisNum_Internalname ;
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
      getKey1FE12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbaraud");
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FE0( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FE12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FE12( ) ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
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
      scanStart1FE12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1FE12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarDisNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FE12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FE12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FE10 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z2759BarMaqGru, T01FE10_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01FE10_A180BarMaqCod[0]) != 0 ) || ( GXutil.strcmp(Z143BarDisNum, T01FE10_A143BarDisNum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z155BarFecCli), GXutil.resetTime(T01FE10_A155BarFecCli[0])) ) || ( GXutil.strcmp(Z212BarSer, T01FE10_A212BarSer[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1652BarSerDsc, T01FE10_A1652BarSerDsc[0]) != 0 ) || ( GXutil.strcmp(Z1798BarDibCli, T01FE10_A1798BarDibCli[0]) != 0 ) || ( Z1799BarDibInt != T01FE10_A1799BarDibInt[0] ) || ( GXutil.strcmp(Z135BarColNom, T01FE10_A135BarColNom[0]) != 0 ) || ( Z136BarColNum != T01FE10_A136BarColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z218BarTipCol != T01FE10_A218BarTipCol[0] ) || ( Z213BarSit != T01FE10_A213BarSit[0] ) || ( GXutil.strcmp(Z120BarAgrEst, T01FE10_A120BarAgrEst[0]) != 0 ) || ( GXutil.strcmp(Z4016BarTin, T01FE10_A4016BarTin[0]) != 0 ) || ( GXutil.strcmp(Z2010BarTipDis, T01FE10_A2010BarTipDis[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4832BarAudFec), GXutil.resetTime(T01FE10_A4832BarAudFec[0])) ) || ( Z4833BarAudTur != T01FE10_A4833BarAudTur[0] ) || ( Z4834BarAudOpe != T01FE10_A4834BarAudOpe[0] ) || ( GXutil.strcmp(Z4835BarAudOpeN, T01FE10_A4835BarAudOpeN[0]) != 0 ) || ( Z4836BarAudSup != T01FE10_A4836BarAudSup[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4837BarAudSupN, T01FE10_A4837BarAudSupN[0]) != 0 ) || ( Z4838BarAudNPz != T01FE10_A4838BarAudNPz[0] ) || ( DecimalUtil.compareTo(Z4840BarAudMDig, T01FE10_A4840BarAudMDig[0]) != 0 ) || ( DecimalUtil.compareTo(Z4841BarAudMCue, T01FE10_A4841BarAudMCue[0]) != 0 ) || ( Z4844BarAudULin != T01FE10_A4844BarAudULin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4845BarAudObs, T01FE10_A4845BarAudObs[0]) != 0 ) || ( Z361DisCod != T01FE10_A361DisCod[0] ) )
         {
            if ( GXutil.strcmp(Z2759BarMaqGru, T01FE10_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01FE10_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01FE10_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01FE10_A180BarMaqCod[0]);
            }
            if ( GXutil.strcmp(Z143BarDisNum, T01FE10_A143BarDisNum[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarDisNum");
               GXutil.writeLogRaw("Old: ",Z143BarDisNum);
               GXutil.writeLogRaw("Current: ",T01FE10_A143BarDisNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z155BarFecCli), GXutil.resetTime(T01FE10_A155BarFecCli[0])) ) )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarFecCli");
               GXutil.writeLogRaw("Old: ",Z155BarFecCli);
               GXutil.writeLogRaw("Current: ",T01FE10_A155BarFecCli[0]);
            }
            if ( GXutil.strcmp(Z212BarSer, T01FE10_A212BarSer[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarSer");
               GXutil.writeLogRaw("Old: ",Z212BarSer);
               GXutil.writeLogRaw("Current: ",T01FE10_A212BarSer[0]);
            }
            if ( GXutil.strcmp(Z1652BarSerDsc, T01FE10_A1652BarSerDsc[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarSerDsc");
               GXutil.writeLogRaw("Old: ",Z1652BarSerDsc);
               GXutil.writeLogRaw("Current: ",T01FE10_A1652BarSerDsc[0]);
            }
            if ( GXutil.strcmp(Z1798BarDibCli, T01FE10_A1798BarDibCli[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarDibCli");
               GXutil.writeLogRaw("Old: ",Z1798BarDibCli);
               GXutil.writeLogRaw("Current: ",T01FE10_A1798BarDibCli[0]);
            }
            if ( Z1799BarDibInt != T01FE10_A1799BarDibInt[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarDibInt");
               GXutil.writeLogRaw("Old: ",Z1799BarDibInt);
               GXutil.writeLogRaw("Current: ",T01FE10_A1799BarDibInt[0]);
            }
            if ( GXutil.strcmp(Z135BarColNom, T01FE10_A135BarColNom[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarColNom");
               GXutil.writeLogRaw("Old: ",Z135BarColNom);
               GXutil.writeLogRaw("Current: ",T01FE10_A135BarColNom[0]);
            }
            if ( Z136BarColNum != T01FE10_A136BarColNum[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarColNum");
               GXutil.writeLogRaw("Old: ",Z136BarColNum);
               GXutil.writeLogRaw("Current: ",T01FE10_A136BarColNum[0]);
            }
            if ( Z218BarTipCol != T01FE10_A218BarTipCol[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarTipCol");
               GXutil.writeLogRaw("Old: ",Z218BarTipCol);
               GXutil.writeLogRaw("Current: ",T01FE10_A218BarTipCol[0]);
            }
            if ( Z213BarSit != T01FE10_A213BarSit[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarSit");
               GXutil.writeLogRaw("Old: ",Z213BarSit);
               GXutil.writeLogRaw("Current: ",T01FE10_A213BarSit[0]);
            }
            if ( GXutil.strcmp(Z120BarAgrEst, T01FE10_A120BarAgrEst[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAgrEst");
               GXutil.writeLogRaw("Old: ",Z120BarAgrEst);
               GXutil.writeLogRaw("Current: ",T01FE10_A120BarAgrEst[0]);
            }
            if ( GXutil.strcmp(Z4016BarTin, T01FE10_A4016BarTin[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarTin");
               GXutil.writeLogRaw("Old: ",Z4016BarTin);
               GXutil.writeLogRaw("Current: ",T01FE10_A4016BarTin[0]);
            }
            if ( GXutil.strcmp(Z2010BarTipDis, T01FE10_A2010BarTipDis[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarTipDis");
               GXutil.writeLogRaw("Old: ",Z2010BarTipDis);
               GXutil.writeLogRaw("Current: ",T01FE10_A2010BarTipDis[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4832BarAudFec), GXutil.resetTime(T01FE10_A4832BarAudFec[0])) ) )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudFec");
               GXutil.writeLogRaw("Old: ",Z4832BarAudFec);
               GXutil.writeLogRaw("Current: ",T01FE10_A4832BarAudFec[0]);
            }
            if ( Z4833BarAudTur != T01FE10_A4833BarAudTur[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudTur");
               GXutil.writeLogRaw("Old: ",Z4833BarAudTur);
               GXutil.writeLogRaw("Current: ",T01FE10_A4833BarAudTur[0]);
            }
            if ( Z4834BarAudOpe != T01FE10_A4834BarAudOpe[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudOpe");
               GXutil.writeLogRaw("Old: ",Z4834BarAudOpe);
               GXutil.writeLogRaw("Current: ",T01FE10_A4834BarAudOpe[0]);
            }
            if ( GXutil.strcmp(Z4835BarAudOpeN, T01FE10_A4835BarAudOpeN[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudOpeN");
               GXutil.writeLogRaw("Old: ",Z4835BarAudOpeN);
               GXutil.writeLogRaw("Current: ",T01FE10_A4835BarAudOpeN[0]);
            }
            if ( Z4836BarAudSup != T01FE10_A4836BarAudSup[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudSup");
               GXutil.writeLogRaw("Old: ",Z4836BarAudSup);
               GXutil.writeLogRaw("Current: ",T01FE10_A4836BarAudSup[0]);
            }
            if ( GXutil.strcmp(Z4837BarAudSupN, T01FE10_A4837BarAudSupN[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudSupN");
               GXutil.writeLogRaw("Old: ",Z4837BarAudSupN);
               GXutil.writeLogRaw("Current: ",T01FE10_A4837BarAudSupN[0]);
            }
            if ( Z4838BarAudNPz != T01FE10_A4838BarAudNPz[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudNPz");
               GXutil.writeLogRaw("Old: ",Z4838BarAudNPz);
               GXutil.writeLogRaw("Current: ",T01FE10_A4838BarAudNPz[0]);
            }
            if ( DecimalUtil.compareTo(Z4840BarAudMDig, T01FE10_A4840BarAudMDig[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudMDig");
               GXutil.writeLogRaw("Old: ",Z4840BarAudMDig);
               GXutil.writeLogRaw("Current: ",T01FE10_A4840BarAudMDig[0]);
            }
            if ( DecimalUtil.compareTo(Z4841BarAudMCue, T01FE10_A4841BarAudMCue[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudMCue");
               GXutil.writeLogRaw("Old: ",Z4841BarAudMCue);
               GXutil.writeLogRaw("Current: ",T01FE10_A4841BarAudMCue[0]);
            }
            if ( Z4844BarAudULin != T01FE10_A4844BarAudULin[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudULin");
               GXutil.writeLogRaw("Old: ",Z4844BarAudULin);
               GXutil.writeLogRaw("Current: ",T01FE10_A4844BarAudULin[0]);
            }
            if ( GXutil.strcmp(Z4845BarAudObs, T01FE10_A4845BarAudObs[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudObs");
               GXutil.writeLogRaw("Old: ",Z4845BarAudObs);
               GXutil.writeLogRaw("Current: ",T01FE10_A4845BarAudObs[0]);
            }
            if ( Z361DisCod != T01FE10_A361DisCod[0] )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01FE10_A361DisCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FE12( )
   {
      beforeValidate1FE12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FE12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FE12( 0) ;
         checkOptimisticConcurrency1FE12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FE12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FE12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FE27 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, A143BarDisNum, A155BarFecCli, A212BarSer, A1652BarSerDsc, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Byte.valueOf(A213BarSit), A120BarAgrEst, A4016BarTin, A2010BarTipDis, Boolean.valueOf(n4832BarAudFec), A4832BarAudFec, Boolean.valueOf(n4833BarAudTur), Byte.valueOf(A4833BarAudTur), Boolean.valueOf(n4834BarAudOpe), Integer.valueOf(A4834BarAudOpe), Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Integer.valueOf(A4836BarAudSup), Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, Boolean.valueOf(n4838BarAudNPz), Short.valueOf(A4838BarAudNPz), Boolean.valueOf(n4840BarAudMDig), A4840BarAudMDig, Boolean.valueOf(n4841BarAudMCue), A4841BarAudMCue, Boolean.valueOf(n4844BarAudULin), Short.valueOf(A4844BarAudULin), Boolean.valueOf(n4845BarAudObs), A4845BarAudObs, Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11FE12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FE12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FE0( ) ;
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
            load1FE12( ) ;
         }
         endLevel1FE12( ) ;
      }
      closeExtendedTableCursors1FE12( ) ;
   }

   public void update1FE12( )
   {
      beforeValidate1FE12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FE12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FE12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FE12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FE12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FE28 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes, A2759BarMaqGru, A180BarMaqCod, A143BarDisNum, A155BarFecCli, A212BarSer, A1652BarSerDsc, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), Byte.valueOf(A213BarSit), A120BarAgrEst, A4016BarTin, A2010BarTipDis, Boolean.valueOf(n4832BarAudFec), A4832BarAudFec, Boolean.valueOf(n4833BarAudTur), Byte.valueOf(A4833BarAudTur), Boolean.valueOf(n4834BarAudOpe), Integer.valueOf(A4834BarAudOpe), Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Integer.valueOf(A4836BarAudSup), Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, Boolean.valueOf(n4838BarAudNPz), Short.valueOf(A4838BarAudNPz), Boolean.valueOf(n4840BarAudMDig), A4840BarAudMDig, Boolean.valueOf(n4841BarAudMCue), A4841BarAudMCue, Boolean.valueOf(n4844BarAudULin), Short.valueOf(A4844BarAudULin), Boolean.valueOf(n4845BarAudObs), A4845BarAudObs, Integer.valueOf(A361DisCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FE12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A129BarCod ;
                     GXv_int3[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
                     tbaraud_impl.this.A396EmprCod = GXv_char1[0] ;
                     tbaraud_impl.this.A129BarCod = GXv_int2[0] ;
                     tbaraud_impl.this.A132BarCodReo = GXv_int3[0] ;
                     tbaraud_impl.this.A130BarCodPar = GXv_char4[0] ;
                     updateTablesN11FE12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FE12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FE0( ) ;
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
         endLevel1FE12( ) ;
      }
      closeExtendedTableCursors1FE12( ) ;
   }

   public void deferredUpdate1FE12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FE12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FE12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FE12( ) ;
         afterConfirm1FE12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FE12( ) ;
            if ( AnyError == 0 )
            {
               A4839BarAudMTab = O4839BarAudMTab ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
               A4842BarAudMDD = O4842BarAudMDD ;
               httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
               A4843BarAudMDC = O4843BarAudMDC ;
               httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
               scanStart1FE1567( ) ;
               while ( RcdFound1567 != 0 )
               {
                  getByPrimaryKey1FE1567( ) ;
                  delete1FE1567( ) ;
                  scanNext1FE1567( ) ;
                  O4839BarAudMTab = A4839BarAudMTab ;
                  n4839BarAudMTab = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
                  O4842BarAudMDD = A4842BarAudMDD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
                  O4843BarAudMDC = A4843BarAudMDC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
               }
               scanEnd1FE1567( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FE29 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11FE12( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1FE12( ) ;
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
                        resetCaption1FE0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FE12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FE12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01FE30 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = T01FE30_A252CliCod[0] ;
         n252CliCod = T01FE30_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A365DisDes = T01FE30_A365DisDes[0] ;
         pr_default.close(20);
         /* Using cursor T01FE31 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01FE31_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(21);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         A4843BarAudMDC = A4839BarAudMTab.subtract(A4841BarAudMCue) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
         A4842BarAudMDD = A4839BarAudMTab.subtract(A4840BarAudMDig) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01FE32 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01FE33 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01FE34 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01FE35 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01FE36 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01FE37 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01FE38 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01FE39 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01FE40 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01FE41 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01FE42 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01FE43 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01FE44 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01FE45 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01FE46 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01FE47 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01FE48 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01FE49 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01FE50 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01FE51 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01FE52 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01FE53 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01FE54 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01FE55 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01FE56 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01FE57 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01FE58 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01FE59 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01FE60 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01FE61 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01FE62 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01FE63 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01FE64 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01FE65 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01FE66 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01FE67 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01FE68 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01FE69 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01FE70 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01FE71 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01FE72 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01FE73 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01FE74 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01FE75 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01FE76 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01FE77 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01FE78 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01FE79 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01FE80 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01FE81 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01FE82 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01FE83 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01FE84 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01FE85 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01FE86 */
         pr_default.execute(76, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01FE87 */
         pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01FE88 */
         pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01FE89 */
         pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01FE90 */
         pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01FE91 */
         pr_default.execute(81, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01FE92 */
         pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01FE93 */
         pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
      }
   }

   public void processNestedLevel1FE1567( )
   {
      s4839BarAudMTab = O4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      s4842BarAudMDD = O4842BarAudMDD ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
      s4843BarAudMDC = O4843BarAudMDC ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      nGXsfl_210_idx = 0 ;
      while ( nGXsfl_210_idx < nRC_GXsfl_210 )
      {
         readRow1FE1567( ) ;
         if ( ( nRcdExists_1567 != 0 ) || ( nIsMod_1567 != 0 ) )
         {
            standaloneNotModal1FE1567( ) ;
            getKey1FE1567( ) ;
            if ( ( nRcdExists_1567 == 0 ) && ( nRcdDeleted_1567 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FE1567( ) ;
            }
            else
            {
               if ( RcdFound1567 != 0 )
               {
                  if ( ( nRcdDeleted_1567 != 0 ) && ( nRcdExists_1567 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FE1567( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1567 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FE1567( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1567 == 0 )
                  {
                     GXCCtl = "BARAUDLIN_" + sGXsfl_210_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAudLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4839BarAudMTab = A4839BarAudMTab ;
            n4839BarAudMTab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
            O4842BarAudMDD = A4842BarAudMDD ;
            httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
            O4843BarAudMDC = A4843BarAudMDC ;
            httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1567_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4846BarAudLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudPie_Internalname, GXutil.rtrim( A4847BarAudPie)) ;
         httpContext.changePostValue( edtBarAudMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudCar_Internalname, GXutil.rtrim( A4849BarAudCar)) ;
         httpContext.changePostValue( edtBarAudPar_Internalname, GXutil.rtrim( A5000BarAudPar)) ;
         httpContext.changePostValue( edtBarAudEmpV_Internalname, GXutil.rtrim( A5001BarAudEmpV)) ;
         httpContext.changePostValue( edtBarAudBarV_Internalname, GXutil.ltrim( localUtil.ntoc( A5002BarAudBarV, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudReoV_Internalname, GXutil.ltrim( localUtil.ntoc( A5003BarAudReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudParV_Internalname, GXutil.rtrim( A5004BarAudParV)) ;
         httpContext.changePostValue( edtBarAudLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A5005BarAudLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAudCant_Internalname, GXutil.rtrim( A5006BarAudCant)) ;
         httpContext.changePostValue( edtBarAudPant_Internalname, GXutil.rtrim( A5007BarAudPant)) ;
         httpContext.changePostValue( "ZT_"+"Z4846BarAudLin_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( Z4846BarAudLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4847BarAudPie_"+sGXsfl_210_idx, GXutil.rtrim( Z4847BarAudPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4848BarAudMts_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( Z4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4849BarAudCar_"+sGXsfl_210_idx, GXutil.rtrim( Z4849BarAudCar)) ;
         httpContext.changePostValue( "ZT_"+"Z5000BarAudPar_"+sGXsfl_210_idx, GXutil.rtrim( Z5000BarAudPar)) ;
         httpContext.changePostValue( "T4848BarAudMts_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( O4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1567_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1567_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1567_"+sGXsfl_210_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1567 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1567_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1567_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDLIN_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPIE_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDMTS_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDCAR_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPAR_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDEMPV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudEmpV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDBARV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudBarV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDREOV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudReoV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPARV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudParV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDLINV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLinV_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDCANT_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARAUDPANT_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FE1567( ) ;
      if ( AnyError != 0 )
      {
         O4839BarAudMTab = s4839BarAudMTab ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         O4842BarAudMDD = s4842BarAudMDD ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
         O4843BarAudMDC = s4843BarAudMDC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      }
      nRcdExists_1567 = (short)(0) ;
      nIsMod_1567 = (short)(0) ;
      nRcdDeleted_1567 = (short)(0) ;
   }

   public void processLevel1FE12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1FE1567( ) ;
      if ( AnyError != 0 )
      {
         O4839BarAudMTab = s4839BarAudMTab ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         O4842BarAudMDD = s4842BarAudMDD ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
         O4843BarAudMDC = s4843BarAudMDC ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11FE12( )
   {
      /* Using cursor T01FE94 */
      pr_default.execute(84, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1FE12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FE12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbaraud");
         if ( AnyError == 0 )
         {
            confirmValues1FE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbaraud");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FE12( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A129BarCod = A129BarCod ;
      this.A132BarCodReo = A132BarCodReo ;
      this.A130BarCodPar = A130BarCodPar ;
      /* Scan By routine */
      /* Using cursor T01FE95 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FE12( )
   {
      /* Scan next routine */
      pr_default.readNext(85);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEnd1FE12( )
   {
      pr_default.close(85);
   }

   public void afterConfirm1FE12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FE12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FE12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FE12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FE12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FE12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FE12( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtBarFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Enabled), 5, 0), true);
      edtBarDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibInt_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarPieNDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieNDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieNDes_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      chkBarTin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTin.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTin.getEnabled(), 5, 0), true);
      edtBarTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarAudFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudFec_Enabled), 5, 0), true);
      edtBarAudTur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudTur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudTur_Enabled), 5, 0), true);
      edtBarAudOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudOpe_Enabled), 5, 0), true);
      edtBarAudOpeN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudOpeN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudOpeN_Enabled), 5, 0), true);
      edtBarAudSup_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudSup_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudSup_Enabled), 5, 0), true);
      edtBarAudSupN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudSupN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudSupN_Enabled), 5, 0), true);
      edtBarAudNPz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudNPz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudNPz_Enabled), 5, 0), true);
      edtBarAudMTab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudMTab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMTab_Enabled), 5, 0), true);
      edtBarAudMDig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudMDig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMDig_Enabled), 5, 0), true);
      edtBarAudMCue_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudMCue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMCue_Enabled), 5, 0), true);
      edtBarAudMDD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudMDD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMDD_Enabled), 5, 0), true);
      edtBarAudMDC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudMDC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMDC_Enabled), 5, 0), true);
      edtBarAudULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudULin_Enabled), 5, 0), true);
      edtBarAudObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudObs_Enabled), 5, 0), true);
      edtBarMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Enabled), 5, 0), true);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), true);
   }

   public void zm1FE1567( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4847BarAudPie = T01FE3_A4847BarAudPie[0] ;
            Z4848BarAudMts = T01FE3_A4848BarAudMts[0] ;
            Z4849BarAudCar = T01FE3_A4849BarAudCar[0] ;
            Z5000BarAudPar = T01FE3_A5000BarAudPar[0] ;
         }
         else
         {
            Z4847BarAudPie = A4847BarAudPie ;
            Z4848BarAudMts = A4848BarAudMts ;
            Z4849BarAudCar = A4849BarAudCar ;
            Z5000BarAudPar = A5000BarAudPar ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z4846BarAudLin = A4846BarAudLin ;
         Z4847BarAudPie = A4847BarAudPie ;
         Z4848BarAudMts = A4848BarAudMts ;
         Z4849BarAudCar = A4849BarAudCar ;
         Z5000BarAudPar = A5000BarAudPar ;
         Z396EmprCod = A396EmprCod ;
         Z5006BarAudCant = A5006BarAudCant ;
         Z5007BarAudPant = A5007BarAudPant ;
      }
   }

   public void standaloneNotModal1FE1567( )
   {
      /* Using cursor T01FE6 */
      pr_default.execute(2, new Object[] {Short.valueOf(A5005BarAudLinV), A5001BarAudEmpV, Integer.valueOf(A5002BarAudBarV), Byte.valueOf(A5003BarAudReoV), A5004BarAudParV});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A5006BarAudCant = T01FE6_A5006BarAudCant[0] ;
         n5006BarAudCant = T01FE6_n5006BarAudCant[0] ;
      }
      else
      {
         A5006BarAudCant = "    " ;
         n5006BarAudCant = false ;
      }
      pr_default.close(2);
      /* Using cursor T01FE9 */
      pr_default.execute(3, new Object[] {Short.valueOf(A5005BarAudLinV), A5001BarAudEmpV, Integer.valueOf(A5002BarAudBarV), Byte.valueOf(A5003BarAudReoV), A5004BarAudParV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A5007BarAudPant = T01FE9_A5007BarAudPant[0] ;
         n5007BarAudPant = T01FE9_n5007BarAudPant[0] ;
      }
      else
      {
         A5007BarAudPant = " " ;
         n5007BarAudPant = false ;
      }
      pr_default.close(3);
      A5001BarAudEmpV = A396EmprCod ;
      A5002BarAudBarV = A129BarCod ;
      A5003BarAudReoV = A132BarCodReo ;
      A5004BarAudParV = A130BarCodPar ;
   }

   public void standaloneModal1FE1567( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarAudLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAudLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLin_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      }
      else
      {
         edtBarAudLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAudLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLin_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      }
   }

   public void load1FE1567( )
   {
      /* Using cursor T01FE100 */
      pr_default.execute(86, new Object[] {Short.valueOf(A5005BarAudLinV), A5001BarAudEmpV, Integer.valueOf(A5002BarAudBarV), Byte.valueOf(A5003BarAudReoV), A5004BarAudParV, Short.valueOf(A5005BarAudLinV), A5001BarAudEmpV, Integer.valueOf(A5002BarAudBarV), Byte.valueOf(A5003BarAudReoV), A5004BarAudParV, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin)});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1567 = (short)(1) ;
         A4847BarAudPie = T01FE100_A4847BarAudPie[0] ;
         n4847BarAudPie = T01FE100_n4847BarAudPie[0] ;
         A4848BarAudMts = T01FE100_A4848BarAudMts[0] ;
         n4848BarAudMts = T01FE100_n4848BarAudMts[0] ;
         A4849BarAudCar = T01FE100_A4849BarAudCar[0] ;
         n4849BarAudCar = T01FE100_n4849BarAudCar[0] ;
         A5000BarAudPar = T01FE100_A5000BarAudPar[0] ;
         n5000BarAudPar = T01FE100_n5000BarAudPar[0] ;
         A5006BarAudCant = T01FE100_A5006BarAudCant[0] ;
         n5006BarAudCant = T01FE100_n5006BarAudCant[0] ;
         A5007BarAudPant = T01FE100_A5007BarAudPant[0] ;
         n5007BarAudPant = T01FE100_n5007BarAudPant[0] ;
         zm1FE1567( -20) ;
      }
      pr_default.close(86);
      onLoadActions1FE1567( ) ;
   }

   public void onLoadActions1FE1567( )
   {
      A5005BarAudLinV = A4846BarAudLin ;
      if ( isIns( )  )
      {
         A4839BarAudMTab = O4839BarAudMTab.add(A4848BarAudMts) ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A4839BarAudMTab = O4839BarAudMTab.add(A4848BarAudMts).subtract(O4848BarAudMts) ;
            n4839BarAudMTab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A4839BarAudMTab = O4839BarAudMTab.subtract(O4848BarAudMts) ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
            }
         }
      }
      A4843BarAudMDC = A4839BarAudMTab.subtract(A4841BarAudMCue) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      A4842BarAudMDD = A4839BarAudMTab.subtract(A4840BarAudMDig) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
   }

   public void checkExtendedTable1FE1567( )
   {
      nIsDirty_1567 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FE1567( ) ;
      nIsDirty_1567 = (short)(1) ;
      A5005BarAudLinV = A4846BarAudLin ;
      if ( isIns( )  )
      {
         nIsDirty_1567 = (short)(1) ;
         A4839BarAudMTab = O4839BarAudMTab.add(A4848BarAudMts) ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1567 = (short)(1) ;
            A4839BarAudMTab = O4839BarAudMTab.add(A4848BarAudMts).subtract(O4848BarAudMts) ;
            n4839BarAudMTab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1567 = (short)(1) ;
               A4839BarAudMTab = O4839BarAudMTab.subtract(O4848BarAudMts) ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
            }
         }
      }
      nIsDirty_1567 = (short)(1) ;
      A4843BarAudMDC = A4839BarAudMTab.subtract(A4841BarAudMCue) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      nIsDirty_1567 = (short)(1) ;
      A4842BarAudMDD = A4839BarAudMTab.subtract(A4840BarAudMDig) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
   }

   public void closeExtendedTableCursors1FE1567( )
   {
   }

   public void enableDisable1FE1567( )
   {
   }

   public void getKey1FE1567( )
   {
      /* Using cursor T01FE101 */
      pr_default.execute(87, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin)});
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound1567 = (short)(1) ;
      }
      else
      {
         RcdFound1567 = (short)(0) ;
      }
      pr_default.close(87);
   }

   public void getByPrimaryKey1FE1567( )
   {
      /* Using cursor T01FE3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01FE3_A129BarCod[0] == A129BarCod ) && ( T01FE3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01FE3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01FE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FE1567( 20) ;
         RcdFound1567 = (short)(1) ;
         initializeNonKey1FE1567( ) ;
         A4846BarAudLin = T01FE3_A4846BarAudLin[0] ;
         A4847BarAudPie = T01FE3_A4847BarAudPie[0] ;
         n4847BarAudPie = T01FE3_n4847BarAudPie[0] ;
         A4848BarAudMts = T01FE3_A4848BarAudMts[0] ;
         n4848BarAudMts = T01FE3_n4848BarAudMts[0] ;
         A4849BarAudCar = T01FE3_A4849BarAudCar[0] ;
         n4849BarAudCar = T01FE3_n4849BarAudCar[0] ;
         A5000BarAudPar = T01FE3_A5000BarAudPar[0] ;
         n5000BarAudPar = T01FE3_n5000BarAudPar[0] ;
         O4848BarAudMts = A4848BarAudMts ;
         n4848BarAudMts = false ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z4846BarAudLin = A4846BarAudLin ;
         sMode1567 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FE1567( ) ;
         load1FE1567( ) ;
         Gx_mode = sMode1567 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1567 = (short)(0) ;
         initializeNonKey1FE1567( ) ;
         sMode1567 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FE1567( ) ;
         Gx_mode = sMode1567 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FE1567( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FE1567( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FE2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAUD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4847BarAudPie, T01FE2_A4847BarAudPie[0]) != 0 ) || ( DecimalUtil.compareTo(Z4848BarAudMts, T01FE2_A4848BarAudMts[0]) != 0 ) || ( GXutil.strcmp(Z4849BarAudCar, T01FE2_A4849BarAudCar[0]) != 0 ) || ( GXutil.strcmp(Z5000BarAudPar, T01FE2_A5000BarAudPar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4847BarAudPie, T01FE2_A4847BarAudPie[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudPie");
               GXutil.writeLogRaw("Old: ",Z4847BarAudPie);
               GXutil.writeLogRaw("Current: ",T01FE2_A4847BarAudPie[0]);
            }
            if ( DecimalUtil.compareTo(Z4848BarAudMts, T01FE2_A4848BarAudMts[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudMts");
               GXutil.writeLogRaw("Old: ",Z4848BarAudMts);
               GXutil.writeLogRaw("Current: ",T01FE2_A4848BarAudMts[0]);
            }
            if ( GXutil.strcmp(Z4849BarAudCar, T01FE2_A4849BarAudCar[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudCar");
               GXutil.writeLogRaw("Old: ",Z4849BarAudCar);
               GXutil.writeLogRaw("Current: ",T01FE2_A4849BarAudCar[0]);
            }
            if ( GXutil.strcmp(Z5000BarAudPar, T01FE2_A5000BarAudPar[0]) != 0 )
            {
               GXutil.writeLogln("tbaraud:[seudo value changed for attri]"+"BarAudPar");
               GXutil.writeLogRaw("Old: ",Z5000BarAudPar);
               GXutil.writeLogRaw("Current: ",T01FE2_A5000BarAudPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARAUD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FE1567( )
   {
      beforeValidate1FE1567( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FE1567( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FE1567( 0) ;
         checkOptimisticConcurrency1FE1567( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FE1567( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FE1567( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FE102 */
                  pr_default.execute(88, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin), Boolean.valueOf(n4847BarAudPie), A4847BarAudPie, Boolean.valueOf(n4848BarAudMts), A4848BarAudMts, Boolean.valueOf(n4849BarAudCar), A4849BarAudCar, Boolean.valueOf(n5000BarAudPar), A5000BarAudPar, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAUD");
                  if ( (pr_default.getStatus(88) == 1) )
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
            load1FE1567( ) ;
         }
         endLevel1FE1567( ) ;
      }
      closeExtendedTableCursors1FE1567( ) ;
   }

   public void update1FE1567( )
   {
      beforeValidate1FE1567( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FE1567( ) ;
      }
      if ( ( nIsMod_1567 != 0 ) || ( nIsDirty_1567 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FE1567( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FE1567( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FE1567( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FE103 */
                     pr_default.execute(89, new Object[] {Boolean.valueOf(n4847BarAudPie), A4847BarAudPie, Boolean.valueOf(n4848BarAudMts), A4848BarAudMts, Boolean.valueOf(n4849BarAudCar), A4849BarAudCar, Boolean.valueOf(n5000BarAudPar), A5000BarAudPar, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAUD");
                     if ( (pr_default.getStatus(89) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAUD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FE1567( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int3[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1) ;
                        tbaraud_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbaraud_impl.this.A129BarCod = GXv_int2[0] ;
                        tbaraud_impl.this.A132BarCodReo = GXv_int3[0] ;
                        tbaraud_impl.this.A130BarCodPar = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FE1567( ) ;
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
            endLevel1FE1567( ) ;
         }
      }
      closeExtendedTableCursors1FE1567( ) ;
   }

   public void deferredUpdate1FE1567( )
   {
   }

   public void delete1FE1567( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FE1567( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FE1567( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FE1567( ) ;
         afterConfirm1FE1567( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FE1567( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FE104 */
               pr_default.execute(90, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A4846BarAudLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAUD");
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
      sMode1567 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FE1567( ) ;
      Gx_mode = sMode1567 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FE1567( )
   {
      standaloneModal1FE1567( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A5005BarAudLinV = A4846BarAudLin ;
         if ( isIns( )  )
         {
            A4839BarAudMTab = O4839BarAudMTab.add(A4848BarAudMts) ;
            n4839BarAudMTab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A4839BarAudMTab = O4839BarAudMTab.add(A4848BarAudMts).subtract(O4848BarAudMts) ;
               n4839BarAudMTab = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A4839BarAudMTab = O4839BarAudMTab.subtract(O4848BarAudMts) ;
                  n4839BarAudMTab = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
               }
            }
         }
         A4843BarAudMDC = A4839BarAudMTab.subtract(A4841BarAudMCue) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
         A4842BarAudMDD = A4839BarAudMTab.subtract(A4840BarAudMDig) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
      }
   }

   public void endLevel1FE1567( )
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

   public void scanStart1FE1567( )
   {
      /* Scan By routine */
      /* Using cursor T01FE105 */
      pr_default.execute(91, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound1567 = (short)(0) ;
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound1567 = (short)(1) ;
         A4846BarAudLin = T01FE105_A4846BarAudLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FE1567( )
   {
      /* Scan next routine */
      pr_default.readNext(91);
      RcdFound1567 = (short)(0) ;
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound1567 = (short)(1) ;
         A4846BarAudLin = T01FE105_A4846BarAudLin[0] ;
      }
   }

   public void scanEnd1FE1567( )
   {
      pr_default.close(91);
   }

   public void afterConfirm1FE1567( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FE1567( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FE1567( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FE1567( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FE1567( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FE1567( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FE1567( )
   {
      edtBarAudLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLin_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudPie_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudMts_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudCar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudCar_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudPar_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudEmpV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudEmpV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudEmpV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudBarV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudBarV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudBarV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudReoV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudReoV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudReoV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudParV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudParV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudParV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudLinV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLinV_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudCant_Enabled), 5, 0), !bGXsfl_210_Refreshing);
      edtBarAudPant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudPant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudPant_Enabled), 5, 0), !bGXsfl_210_Refreshing);
   }

   public void send_integrity_lvl_hashes1FE1567( )
   {
   }

   public void send_integrity_lvl_hashes1FE12( )
   {
   }

   public void subsflControlProps_2101567( )
   {
      edtavnRcdDeleted_1567_Internalname = "vNRCDDELETED_1567_"+sGXsfl_210_idx ;
      edtBarAudLin_Internalname = "BARAUDLIN_"+sGXsfl_210_idx ;
      edtBarAudPie_Internalname = "BARAUDPIE_"+sGXsfl_210_idx ;
      edtBarAudMts_Internalname = "BARAUDMTS_"+sGXsfl_210_idx ;
      edtBarAudCar_Internalname = "BARAUDCAR_"+sGXsfl_210_idx ;
      edtBarAudPar_Internalname = "BARAUDPAR_"+sGXsfl_210_idx ;
      edtBarAudEmpV_Internalname = "BARAUDEMPV_"+sGXsfl_210_idx ;
      edtBarAudBarV_Internalname = "BARAUDBARV_"+sGXsfl_210_idx ;
      edtBarAudReoV_Internalname = "BARAUDREOV_"+sGXsfl_210_idx ;
      edtBarAudParV_Internalname = "BARAUDPARV_"+sGXsfl_210_idx ;
      edtBarAudLinV_Internalname = "BARAUDLINV_"+sGXsfl_210_idx ;
      edtBarAudCant_Internalname = "BARAUDCANT_"+sGXsfl_210_idx ;
      edtBarAudPant_Internalname = "BARAUDPANT_"+sGXsfl_210_idx ;
   }

   public void subsflControlProps_fel_2101567( )
   {
      edtavnRcdDeleted_1567_Internalname = "vNRCDDELETED_1567_"+sGXsfl_210_fel_idx ;
      edtBarAudLin_Internalname = "BARAUDLIN_"+sGXsfl_210_fel_idx ;
      edtBarAudPie_Internalname = "BARAUDPIE_"+sGXsfl_210_fel_idx ;
      edtBarAudMts_Internalname = "BARAUDMTS_"+sGXsfl_210_fel_idx ;
      edtBarAudCar_Internalname = "BARAUDCAR_"+sGXsfl_210_fel_idx ;
      edtBarAudPar_Internalname = "BARAUDPAR_"+sGXsfl_210_fel_idx ;
      edtBarAudEmpV_Internalname = "BARAUDEMPV_"+sGXsfl_210_fel_idx ;
      edtBarAudBarV_Internalname = "BARAUDBARV_"+sGXsfl_210_fel_idx ;
      edtBarAudReoV_Internalname = "BARAUDREOV_"+sGXsfl_210_fel_idx ;
      edtBarAudParV_Internalname = "BARAUDPARV_"+sGXsfl_210_fel_idx ;
      edtBarAudLinV_Internalname = "BARAUDLINV_"+sGXsfl_210_fel_idx ;
      edtBarAudCant_Internalname = "BARAUDCANT_"+sGXsfl_210_fel_idx ;
      edtBarAudPant_Internalname = "BARAUDPANT_"+sGXsfl_210_fel_idx ;
   }

   public void addRow1FE1567( )
   {
      nGXsfl_210_idx = (int)(nGXsfl_210_idx+1) ;
      sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2101567( ) ;
      sendRow1FE1567( ) ;
   }

   public void sendRow1FE1567( )
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
         if ( ((int)((nGXsfl_210_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1567_" + sGXsfl_210_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_210_idx + "',210)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1567_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1567_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1567), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1567), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1567_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1567_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1567_" + sGXsfl_210_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 212,'',false,'" + sGXsfl_210_idx + "',210)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4846BarAudLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4846BarAudLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,212);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1567_" + sGXsfl_210_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_210_idx + "',210)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudPie_Internalname,GXutil.rtrim( A4847BarAudPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,213);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudPie_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1567_" + sGXsfl_210_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_210_idx + "',210)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudMts_Internalname,GXutil.ltrim( localUtil.ntoc( A4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAudMts_Enabled!=0) ? localUtil.format( A4848BarAudMts, "ZZZZZ9.99") : localUtil.format( A4848BarAudMts, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,214);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1567_" + sGXsfl_210_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_210_idx + "',210)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudCar_Internalname,GXutil.rtrim( A4849BarAudCar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,215);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudCar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudCar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1567_" + sGXsfl_210_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_210_idx + "',210)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudPar_Internalname,GXutil.rtrim( A5000BarAudPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudEmpV_Internalname,GXutil.rtrim( A5001BarAudEmpV),GXutil.rtrim( localUtil.format( A5001BarAudEmpV, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudEmpV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudEmpV_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudBarV_Internalname,GXutil.ltrim( localUtil.ntoc( A5002BarAudBarV, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAudBarV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5002BarAudBarV), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5002BarAudBarV), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudBarV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudBarV_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudReoV_Internalname,GXutil.ltrim( localUtil.ntoc( A5003BarAudReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAudReoV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5003BarAudReoV), "9") : localUtil.format( DecimalUtil.doubleToDec(A5003BarAudReoV), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudReoV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudReoV_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudParV_Internalname,GXutil.rtrim( A5004BarAudParV),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudParV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudParV_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudLinV_Internalname,GXutil.ltrim( localUtil.ntoc( A5005BarAudLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAudLinV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5005BarAudLinV), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5005BarAudLinV), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudLinV_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudLinV_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudCant_Internalname,GXutil.rtrim( A5006BarAudCant),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAudPant_Internalname,GXutil.rtrim( A5007BarAudPant),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAudPant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarAudPant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(210),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FE1567( ) ;
      GXCCtl = "Z4846BarAudLin_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4846BarAudLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4847BarAudPie_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4847BarAudPie));
      GXCCtl = "Z4848BarAudMts_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4849BarAudCar_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4849BarAudCar));
      GXCCtl = "Z5000BarAudPar_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5000BarAudPar));
      GXCCtl = "O4848BarAudMts_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4848BarAudMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1567_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1567_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1567_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1567, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARAUDTUR_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV49BarAudTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARAUDOPE_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV50BarAudOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARAUDOPEN_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV52BarAudOpeN));
      GXCCtl = "vBARAUDSUP_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV51BarAudSup, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARAUDSUPN_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV53BarAudSupN));
      GXCCtl = "vBARAUDFEC_" + sGXsfl_210_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( AV54BarAudFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1567_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1567_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDLIN_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDPIE_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDMTS_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDCAR_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDPAR_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDEMPV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudEmpV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDBARV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudBarV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDREOV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudReoV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDPARV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudParV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDLINV_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLinV_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDCANT_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAUDPANT_"+sGXsfl_210_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPant_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FE1567( )
   {
      nGXsfl_210_idx = (int)(nGXsfl_210_idx+1) ;
      sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2101567( ) ;
      edtavnRcdDeleted_1567_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1567_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDLIN_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPIE_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDMTS_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudCar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDCAR_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPAR_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudEmpV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDEMPV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudBarV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDBARV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudReoV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDREOV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudParV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPARV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudLinV_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDLINV_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDCANT_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAudPant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARAUDPANT_"+sGXsfl_210_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1567_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1567_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1567");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1567_Internalname ;
         wbErr = true ;
         nRcdDeleted_1567 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1567 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1567_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAudLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARAUDLIN_" + sGXsfl_210_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAudLin_Internalname ;
         wbErr = true ;
         A4846BarAudLin = (short)(0) ;
      }
      else
      {
         A4846BarAudLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAudLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4847BarAudPie = httpContext.cgiGet( edtBarAudPie_Internalname) ;
      n4847BarAudPie = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAudMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAudMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARAUDMTS_" + sGXsfl_210_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAudMts_Internalname ;
         wbErr = true ;
         A4848BarAudMts = DecimalUtil.ZERO ;
         n4848BarAudMts = false ;
      }
      else
      {
         A4848BarAudMts = localUtil.ctond( httpContext.cgiGet( edtBarAudMts_Internalname)) ;
         n4848BarAudMts = false ;
      }
      A4849BarAudCar = httpContext.cgiGet( edtBarAudCar_Internalname) ;
      n4849BarAudCar = false ;
      A5000BarAudPar = httpContext.cgiGet( edtBarAudPar_Internalname) ;
      n5000BarAudPar = false ;
      A5001BarAudEmpV = GXutil.upper( httpContext.cgiGet( edtBarAudEmpV_Internalname)) ;
      A5002BarAudBarV = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAudBarV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5003BarAudReoV = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAudReoV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5004BarAudParV = httpContext.cgiGet( edtBarAudParV_Internalname) ;
      A5005BarAudLinV = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAudLinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5006BarAudCant = httpContext.cgiGet( edtBarAudCant_Internalname) ;
      n5006BarAudCant = false ;
      A5007BarAudPant = httpContext.cgiGet( edtBarAudPant_Internalname) ;
      n5007BarAudPant = false ;
      GXCCtl = "Z4846BarAudLin_" + sGXsfl_210_idx ;
      Z4846BarAudLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4847BarAudPie_" + sGXsfl_210_idx ;
      Z4847BarAudPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4848BarAudMts_" + sGXsfl_210_idx ;
      Z4848BarAudMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4849BarAudCar_" + sGXsfl_210_idx ;
      Z4849BarAudCar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5000BarAudPar_" + sGXsfl_210_idx ;
      Z5000BarAudPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O4848BarAudMts_" + sGXsfl_210_idx ;
      O4848BarAudMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1567_" + sGXsfl_210_idx ;
      nRcdDeleted_1567 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1567_" + sGXsfl_210_idx ;
      nRcdExists_1567 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1567_" + sGXsfl_210_idx ;
      nIsMod_1567 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarAudLin_Enabled = edtBarAudLin_Enabled ;
   }

   public void confirmValues1FE0( )
   {
      nGXsfl_210_idx = 0 ;
      sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2101567( ) ;
      while ( nGXsfl_210_idx < nRC_GXsfl_210 )
      {
         nGXsfl_210_idx = (int)(nGXsfl_210_idx+1) ;
         sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2101567( ) ;
         httpContext.changePostValue( "Z4846BarAudLin_"+sGXsfl_210_idx, httpContext.cgiGet( "ZT_"+"Z4846BarAudLin_"+sGXsfl_210_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4846BarAudLin_"+sGXsfl_210_idx) ;
         httpContext.changePostValue( "Z4847BarAudPie_"+sGXsfl_210_idx, httpContext.cgiGet( "ZT_"+"Z4847BarAudPie_"+sGXsfl_210_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4847BarAudPie_"+sGXsfl_210_idx) ;
         httpContext.changePostValue( "Z4848BarAudMts_"+sGXsfl_210_idx, httpContext.cgiGet( "ZT_"+"Z4848BarAudMts_"+sGXsfl_210_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4848BarAudMts_"+sGXsfl_210_idx) ;
         httpContext.changePostValue( "Z4849BarAudCar_"+sGXsfl_210_idx, httpContext.cgiGet( "ZT_"+"Z4849BarAudCar_"+sGXsfl_210_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4849BarAudCar_"+sGXsfl_210_idx) ;
         httpContext.changePostValue( "Z5000BarAudPar_"+sGXsfl_210_idx, httpContext.cgiGet( "ZT_"+"Z5000BarAudPar_"+sGXsfl_210_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5000BarAudPar_"+sGXsfl_210_idx) ;
      }
      httpContext.changePostValue( "O4848BarAudMts", httpContext.cgiGet( "T4848BarAudMts")) ;
      httpContext.deletePostValue( "T4848BarAudMts") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbaraud", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarAudTur,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarAudOpe,6,0)),GXutil.URLEncode(GXutil.rtrim(AV52BarAudOpeN)),GXutil.URLEncode(GXutil.ltrimstr(AV51BarAudSup,6,0)),GXutil.URLEncode(GXutil.rtrim(AV53BarAudSupN)),GXutil.URLEncode(GXutil.formatDateParm(AV54BarAudFec))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAudTur","BarAudOpe","BarAudOpeN","BarAudSup","BarAudSupN","BarAudFec"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARAUD");
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbaraud:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z155BarFecCli", localUtil.dtoc( Z155BarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1798BarDibCli", GXutil.rtrim( Z1798BarDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1799BarDibInt", GXutil.ltrim( localUtil.ntoc( Z1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4016BarTin", GXutil.rtrim( Z4016BarTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2010BarTipDis", GXutil.rtrim( Z2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4832BarAudFec", localUtil.dtoc( Z4832BarAudFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4833BarAudTur", GXutil.ltrim( localUtil.ntoc( Z4833BarAudTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4834BarAudOpe", GXutil.ltrim( localUtil.ntoc( Z4834BarAudOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4835BarAudOpeN", GXutil.rtrim( Z4835BarAudOpeN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4836BarAudSup", GXutil.ltrim( localUtil.ntoc( Z4836BarAudSup, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4837BarAudSupN", GXutil.rtrim( Z4837BarAudSupN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4838BarAudNPz", GXutil.ltrim( localUtil.ntoc( Z4838BarAudNPz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4840BarAudMDig", GXutil.ltrim( localUtil.ntoc( Z4840BarAudMDig, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4841BarAudMCue", GXutil.ltrim( localUtil.ntoc( Z4841BarAudMCue, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4844BarAudULin", GXutil.ltrim( localUtil.ntoc( Z4844BarAudULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4845BarAudObs", Z4845BarAudObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4839BarAudMTab", GXutil.ltrim( localUtil.ntoc( O4839BarAudMTab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_210", GXutil.ltrim( localUtil.ntoc( nGXsfl_210_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAUDTUR", GXutil.ltrim( localUtil.ntoc( AV49BarAudTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAUDOPE", GXutil.ltrim( localUtil.ntoc( AV50BarAudOpe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAUDOPEN", GXutil.rtrim( AV52BarAudOpeN));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAUDSUP", GXutil.ltrim( localUtil.ntoc( AV51BarAudSup, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAUDSUPN", GXutil.rtrim( AV53BarAudSupN));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAUDFEC", localUtil.dtoc( AV54BarAudFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tbaraud", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarAudTur,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarAudOpe,6,0)),GXutil.URLEncode(GXutil.rtrim(AV52BarAudOpeN)),GXutil.URLEncode(GXutil.ltrimstr(AV51BarAudSup,6,0)),GXutil.URLEncode(GXutil.rtrim(AV53BarAudSupN)),GXutil.URLEncode(GXutil.formatDateParm(AV54BarAudFec))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAudTur","BarAudOpe","BarAudOpeN","BarAudSup","BarAudSupN","BarAudFec"})  ;
   }

   public String getPgmname( )
   {
      return "TBARAUD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "AUDITORIA RECEP.MATERIA HDR", "") ;
   }

   public void initializeNonKey1FE12( )
   {
      A4842BarAudMDD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrimstr( A4842BarAudMDD, 9, 2));
      A4843BarAudMDC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrimstr( A4843BarAudMDC, 9, 2));
      A198BarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A155BarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A1798BarDibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", A1798BarDibCli);
      A1799BarDibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1799BarDibInt), 8, 0));
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A4016BarTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", A4016BarTin);
      A2010BarTipDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A4832BarAudFec = GXutil.nullDate() ;
      n4832BarAudFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4832BarAudFec", localUtil.format(A4832BarAudFec, "99/99/99"));
      A4833BarAudTur = (byte)(0) ;
      n4833BarAudTur = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4833BarAudTur", GXutil.str( A4833BarAudTur, 1, 0));
      A4834BarAudOpe = 0 ;
      n4834BarAudOpe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4834BarAudOpe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4834BarAudOpe), 6, 0));
      A4835BarAudOpeN = "" ;
      n4835BarAudOpeN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4835BarAudOpeN", A4835BarAudOpeN);
      A4836BarAudSup = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4836BarAudSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4836BarAudSup), 6, 0));
      A4837BarAudSupN = "" ;
      n4837BarAudSupN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4837BarAudSupN", A4837BarAudSupN);
      A4838BarAudNPz = (short)(0) ;
      n4838BarAudNPz = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4838BarAudNPz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4838BarAudNPz), 4, 0));
      A4840BarAudMDig = DecimalUtil.ZERO ;
      n4840BarAudMDig = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4840BarAudMDig", GXutil.ltrimstr( A4840BarAudMDig, 9, 2));
      A4841BarAudMCue = DecimalUtil.ZERO ;
      n4841BarAudMCue = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4841BarAudMCue", GXutil.ltrimstr( A4841BarAudMCue, 9, 2));
      A4844BarAudULin = (short)(0) ;
      n4844BarAudULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4844BarAudULin), 4, 0));
      A4845BarAudObs = "" ;
      n4845BarAudObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4845BarAudObs", A4845BarAudObs);
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      O4839BarAudMTab = A4839BarAudMTab ;
      n4839BarAudMTab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z143BarDisNum = "" ;
      Z155BarFecCli = GXutil.nullDate() ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z1798BarDibCli = "" ;
      Z1799BarDibInt = 0 ;
      Z135BarColNom = "" ;
      Z136BarColNum = 0 ;
      Z218BarTipCol = (byte)(0) ;
      Z213BarSit = (byte)(0) ;
      Z120BarAgrEst = "" ;
      Z4016BarTin = "" ;
      Z2010BarTipDis = "" ;
      Z4832BarAudFec = GXutil.nullDate() ;
      Z4833BarAudTur = (byte)(0) ;
      Z4834BarAudOpe = 0 ;
      Z4835BarAudOpeN = "" ;
      Z4836BarAudSup = 0 ;
      Z4837BarAudSupN = "" ;
      Z4838BarAudNPz = (short)(0) ;
      Z4840BarAudMDig = DecimalUtil.ZERO ;
      Z4841BarAudMCue = DecimalUtil.ZERO ;
      Z4844BarAudULin = (short)(0) ;
      Z4845BarAudObs = "" ;
      Z361DisCod = 0 ;
   }

   public void initAll1FE12( )
   {
      initializeNonKey1FE12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FE1567( )
   {
      A5005BarAudLinV = (short)(0) ;
      A4847BarAudPie = "" ;
      n4847BarAudPie = false ;
      A4848BarAudMts = DecimalUtil.ZERO ;
      n4848BarAudMts = false ;
      A4849BarAudCar = "" ;
      n4849BarAudCar = false ;
      A5000BarAudPar = "" ;
      n5000BarAudPar = false ;
      O4848BarAudMts = A4848BarAudMts ;
      n4848BarAudMts = false ;
      Z4847BarAudPie = "" ;
      Z4848BarAudMts = DecimalUtil.ZERO ;
      Z4849BarAudCar = "" ;
      Z5000BarAudPar = "" ;
   }

   public void initAll1FE1567( )
   {
      A4846BarAudLin = (short)(0) ;
      initializeNonKey1FE1567( ) ;
   }

   public void standaloneModalInsert1FE1567( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581420", true, true);
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
      httpContext.AddJavascriptSource("tbaraud.js", "?20268241581421", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1567( )
   {
      edtBarAudLin_Enabled = defedtBarAudLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAudLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAudLin_Enabled), 5, 0), !bGXsfl_210_Refreshing);
   }

   public void startgridcontrol210( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1567, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1567_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4846BarAudLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4847BarAudPie));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4848BarAudMts, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4849BarAudCar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5000BarAudPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5001BarAudEmpV));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudEmpV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5002BarAudBarV, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudBarV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5003BarAudReoV, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudReoV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5004BarAudParV));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudParV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5005BarAudLinV, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudLinV_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5006BarAudCant));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5007BarAudPant));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAudPant_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarFecCli_Internalname = "BARFECCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarDibCli_Internalname = "BARDIBCLI" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarDibInt_Internalname = "BARDIBINT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDisCod_Internalname = "DISCOD" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarSit_Internalname = "BARSIT" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarPieNDes_Internalname = "BARPIENDES" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      chkBarTin.setInternalname( "BARTIN" );
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtBarAudFec_Internalname = "BARAUDFEC" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtBarAudTur_Internalname = "BARAUDTUR" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtBarAudOpe_Internalname = "BARAUDOPE" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtBarAudOpeN_Internalname = "BARAUDOPEN" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtBarAudSup_Internalname = "BARAUDSUP" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtBarAudSupN_Internalname = "BARAUDSUPN" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtBarAudNPz_Internalname = "BARAUDNPZ" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtBarAudMTab_Internalname = "BARAUDMTAB" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtBarAudMDig_Internalname = "BARAUDMDIG" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtBarAudMCue_Internalname = "BARAUDMCUE" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtBarAudMDD_Internalname = "BARAUDMDD" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtBarAudMDC_Internalname = "BARAUDMDC" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtBarAudULin_Internalname = "BARAUDULIN" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtBarAudObs_Internalname = "BARAUDOBS" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtBarMtr_Internalname = "BARMTR" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtavnRcdDeleted_1567_Internalname = "vNRCDDELETED_1567" ;
      edtBarAudLin_Internalname = "BARAUDLIN" ;
      edtBarAudPie_Internalname = "BARAUDPIE" ;
      edtBarAudMts_Internalname = "BARAUDMTS" ;
      edtBarAudCar_Internalname = "BARAUDCAR" ;
      edtBarAudPar_Internalname = "BARAUDPAR" ;
      edtBarAudEmpV_Internalname = "BARAUDEMPV" ;
      edtBarAudBarV_Internalname = "BARAUDBARV" ;
      edtBarAudReoV_Internalname = "BARAUDREOV" ;
      edtBarAudParV_Internalname = "BARAUDPARV" ;
      edtBarAudLinV_Internalname = "BARAUDLINV" ;
      edtBarAudCant_Internalname = "BARAUDCANT" ;
      edtBarAudPant_Internalname = "BARAUDPANT" ;
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
      Form.setCaption( httpContext.getMessage( "AUDITORIA RECEP.MATERIA HDR", "") );
      edtBarAudPant_Jsonclick = "" ;
      edtBarAudCant_Jsonclick = "" ;
      edtBarAudLinV_Jsonclick = "" ;
      edtBarAudParV_Jsonclick = "" ;
      edtBarAudReoV_Jsonclick = "" ;
      edtBarAudBarV_Jsonclick = "" ;
      edtBarAudEmpV_Jsonclick = "" ;
      edtBarAudPar_Jsonclick = "" ;
      edtBarAudCar_Jsonclick = "" ;
      edtBarAudMts_Jsonclick = "" ;
      edtBarAudPie_Jsonclick = "" ;
      edtBarAudLin_Jsonclick = "" ;
      edtavnRcdDeleted_1567_Jsonclick = "" ;
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
      edtBarAudPant_Enabled = 0 ;
      edtBarAudCant_Enabled = 0 ;
      edtBarAudLinV_Enabled = 0 ;
      edtBarAudParV_Enabled = 0 ;
      edtBarAudReoV_Enabled = 0 ;
      edtBarAudBarV_Enabled = 0 ;
      edtBarAudEmpV_Enabled = 0 ;
      edtBarAudPar_Enabled = 1 ;
      edtBarAudCar_Enabled = 1 ;
      edtBarAudMts_Enabled = 1 ;
      edtBarAudPie_Enabled = 1 ;
      edtBarAudLin_Enabled = 1 ;
      edtavnRcdDeleted_1567_Enabled = 1 ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Backcolor = (int)(0xFFFFFF) ;
      edtBarPie_Enabled = 0 ;
      edtBarMtr_Jsonclick = "" ;
      edtBarMtr_Backcolor = (int)(0xFFFFFF) ;
      edtBarMtr_Enabled = 0 ;
      edtBarAudObs_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudObs_Enabled = 1 ;
      edtBarAudULin_Jsonclick = "" ;
      edtBarAudULin_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudULin_Enabled = 1 ;
      edtBarAudMDC_Jsonclick = "" ;
      edtBarAudMDC_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudMDC_Enabled = 0 ;
      edtBarAudMDD_Jsonclick = "" ;
      edtBarAudMDD_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudMDD_Enabled = 0 ;
      edtBarAudMCue_Jsonclick = "" ;
      edtBarAudMCue_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudMCue_Enabled = 1 ;
      edtBarAudMDig_Jsonclick = "" ;
      edtBarAudMDig_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudMDig_Enabled = 1 ;
      edtBarAudMTab_Jsonclick = "" ;
      edtBarAudMTab_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudMTab_Enabled = 0 ;
      edtBarAudNPz_Jsonclick = "" ;
      edtBarAudNPz_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudNPz_Enabled = 1 ;
      edtBarAudSupN_Jsonclick = "" ;
      edtBarAudSupN_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudSupN_Enabled = 1 ;
      edtBarAudSup_Jsonclick = "" ;
      edtBarAudSup_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudSup_Enabled = 1 ;
      edtBarAudOpeN_Jsonclick = "" ;
      edtBarAudOpeN_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudOpeN_Enabled = 1 ;
      edtBarAudOpe_Jsonclick = "" ;
      edtBarAudOpe_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudOpe_Enabled = 1 ;
      edtBarAudTur_Jsonclick = "" ;
      edtBarAudTur_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudTur_Enabled = 1 ;
      edtBarAudFec_Jsonclick = "" ;
      edtBarAudFec_Backcolor = (int)(0xFFFFFF) ;
      edtBarAudFec_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarTipDis_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipDis_Enabled = 1 ;
      chkBarTin.setIBackground( (int)(0xFFFFFF) );
      chkBarTin.setEnabled( 1 );
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Backcolor = (int)(0xFFFFFF) ;
      edtBarAgrEst_Enabled = 1 ;
      edtBarPieNDes_Jsonclick = "" ;
      edtBarPieNDes_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieNDes_Enabled = 0 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Backcolor = (int)(0xFFFFFF) ;
      edtBarSit_Enabled = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 1 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 1 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 1 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 1 ;
      edtBarDibInt_Jsonclick = "" ;
      edtBarDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtBarDibInt_Enabled = 1 ;
      edtBarDibCli_Jsonclick = "" ;
      edtBarDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarDibCli_Enabled = 1 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtBarSerDsc_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarFecCli_Enabled = 1 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarDisNum_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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
      subsflControlProps_2101567( ) ;
      while ( nGXsfl_210_idx <= nRC_GXsfl_210 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FE1567( ) ;
         standaloneModal1FE1567( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FE1567( ) ;
         nGXsfl_210_idx = (int)(nGXsfl_210_idx+1) ;
         sGXsfl_210_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_210_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2101567( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkBarTin.setName( "BARTIN" );
      chkBarTin.setWebtags( "" );
      chkBarTin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTin.getInternalname(), "TitleCaption", chkBarTin.getCaption(), true);
      chkBarTin.setCheckedValue( "N" );
      A4016BarTin = ((GXutil.strcmp(GXutil.rtrim( A4016BarTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", A4016BarTin);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01FE106 */
      pr_default.execute(92, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(92) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FE106_A407EmprNom[0] ;
      n407EmprNom = T01FE106_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(92);
      /* Using cursor T01FE108 */
      pr_default.execute(93, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(93) != 101) )
      {
         A898BarPieNDes = T01FE108_A898BarPieNDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = T01FE108_A184BarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = T01FE108_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A184BarMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(93);
      /* Using cursor T01FE110 */
      pr_default.execute(94, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(94) != 101) )
      {
         A4839BarAudMTab = T01FE110_A4839BarAudMTab[0] ;
         n4839BarAudMTab = T01FE110_n4839BarAudMTab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      else
      {
         A4839BarAudMTab = DecimalUtil.doubleToDec(0) ;
         n4839BarAudMTab = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrimstr( A4839BarAudMTab, 9, 2));
      }
      pr_default.close(94);
      GX_FocusControl = edtBarDisNum_Internalname ;
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

   public void valid_Barcodpar( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A4016BarTin = ((GXutil.strcmp(GXutil.rtrim( A4016BarTin), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A155BarFecCli", localUtil.format(A155BarFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", GXutil.rtrim( A1798BarDibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A4016BarTin", GXutil.rtrim( A4016BarTin));
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", GXutil.rtrim( A2010BarTipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4832BarAudFec", localUtil.format(A4832BarAudFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4833BarAudTur", GXutil.ltrim( localUtil.ntoc( A4833BarAudTur, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4834BarAudOpe", GXutil.ltrim( localUtil.ntoc( A4834BarAudOpe, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4835BarAudOpeN", GXutil.rtrim( A4835BarAudOpeN));
      httpContext.ajax_rsp_assign_attri("", false, "A4836BarAudSup", GXutil.ltrim( localUtil.ntoc( A4836BarAudSup, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4837BarAudSupN", GXutil.rtrim( A4837BarAudSupN));
      httpContext.ajax_rsp_assign_attri("", false, "A4838BarAudNPz", GXutil.ltrim( localUtil.ntoc( A4838BarAudNPz, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4839BarAudMTab", GXutil.ltrim( localUtil.ntoc( A4839BarAudMTab, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4840BarAudMDig", GXutil.ltrim( localUtil.ntoc( A4840BarAudMDig, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4841BarAudMCue", GXutil.ltrim( localUtil.ntoc( A4841BarAudMCue, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4844BarAudULin", GXutil.ltrim( localUtil.ntoc( A4844BarAudULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4845BarAudObs", A4845BarAudObs);
      httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4843BarAudMDC", GXutil.ltrim( localUtil.ntoc( A4843BarAudMDC, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4842BarAudMDD", GXutil.ltrim( localUtil.ntoc( A4842BarAudMDD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z155BarFecCli", localUtil.format(Z155BarFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1798BarDibCli", GXutil.rtrim( Z1798BarDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1799BarDibInt", GXutil.ltrim( localUtil.ntoc( Z1799BarDibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z898BarPieNDes", GXutil.ltrim( localUtil.ntoc( Z898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z120BarAgrEst", GXutil.rtrim( Z120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4016BarTin", GXutil.rtrim( Z4016BarTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2010BarTipDis", GXutil.rtrim( Z2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4832BarAudFec", localUtil.format(Z4832BarAudFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4833BarAudTur", GXutil.ltrim( localUtil.ntoc( Z4833BarAudTur, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4834BarAudOpe", GXutil.ltrim( localUtil.ntoc( Z4834BarAudOpe, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4835BarAudOpeN", GXutil.rtrim( Z4835BarAudOpeN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4836BarAudSup", GXutil.ltrim( localUtil.ntoc( Z4836BarAudSup, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4837BarAudSupN", GXutil.rtrim( Z4837BarAudSupN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4838BarAudNPz", GXutil.ltrim( localUtil.ntoc( Z4838BarAudNPz, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4839BarAudMTab", GXutil.ltrim( localUtil.ntoc( Z4839BarAudMTab, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4840BarAudMDig", GXutil.ltrim( localUtil.ntoc( Z4840BarAudMDig, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4841BarAudMCue", GXutil.ltrim( localUtil.ntoc( Z4841BarAudMCue, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4844BarAudULin", GXutil.ltrim( localUtil.ntoc( Z4844BarAudULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4845BarAudObs", Z4845BarAudObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z184BarMtr", GXutil.ltrim( localUtil.ntoc( Z184BarMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z199BarPie1", GXutil.ltrim( localUtil.ntoc( Z199BarPie1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z198BarPie", GXutil.ltrim( localUtil.ntoc( Z198BarPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4843BarAudMDC", GXutil.ltrim( localUtil.ntoc( Z4843BarAudMDC, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4842BarAudMDD", GXutil.ltrim( localUtil.ntoc( Z4842BarAudMDD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4839BarAudMTab", GXutil.ltrim( localUtil.ntoc( O4839BarAudMTab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n396EmprCod = false ;
      n252CliCod = false ;
      /* Using cursor T01FE31 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FE31_A279CliNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Discod( )
   {
      n396EmprCod = false ;
      n252CliCod = false ;
      /* Using cursor T01FE30 */
      pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
      }
      A252CliCod = T01FE30_A252CliCod[0] ;
      n252CliCod = T01FE30_n252CliCod[0] ;
      A365DisDes = T01FE30_A365DisDes[0] ;
      pr_default.close(20);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV49BarAudTur',fld:'vBARAUDTUR',pic:'9'},{av:'AV50BarAudOpe',fld:'vBARAUDOPE',pic:'ZZZZZ9'},{av:'AV52BarAudOpeN',fld:'vBARAUDOPEN',pic:''},{av:'AV51BarAudSup',fld:'vBARAUDSUP',pic:'ZZZZZ9'},{av:'AV53BarAudSupN',fld:'vBARAUDSUPN',pic:''},{av:'AV54BarAudFec',fld:'vBARAUDFEC',pic:''},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4832BarAudFec',fld:'BARAUDFEC',pic:''},{av:'A4833BarAudTur',fld:'BARAUDTUR',pic:'9'},{av:'A4834BarAudOpe',fld:'BARAUDOPE',pic:'ZZZZZ9'},{av:'A4835BarAudOpeN',fld:'BARAUDOPEN',pic:''},{av:'A4836BarAudSup',fld:'BARAUDSUP',pic:'ZZZZZ9'},{av:'A4837BarAudSupN',fld:'BARAUDSUPN',pic:''},{av:'A4838BarAudNPz',fld:'BARAUDNPZ',pic:'ZZZ9'},{av:'A4839BarAudMTab',fld:'BARAUDMTAB',pic:'ZZZZZ9.99'},{av:'A4840BarAudMDig',fld:'BARAUDMDIG',pic:'ZZZZZ9.99'},{av:'A4841BarAudMCue',fld:'BARAUDMCUE',pic:'ZZZZZ9.99'},{av:'A4844BarAudULin',fld:'BARAUDULIN',pic:'ZZZ9'},{av:'A4845BarAudObs',fld:'BARAUDOBS',pic:''},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A4843BarAudMDC',fld:'BARAUDMDC',pic:'ZZZZZ9.99'},{av:'A4842BarAudMDD',fld:'BARAUDMDD',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z143BarDisNum'},{av:'Z155BarFecCli'},{av:'Z212BarSer'},{av:'Z1652BarSerDsc'},{av:'Z1798BarDibCli'},{av:'Z1799BarDibInt'},{av:'Z135BarColNom'},{av:'Z136BarColNum'},{av:'Z218BarTipCol'},{av:'Z361DisCod'},{av:'Z213BarSit'},{av:'Z898BarPieNDes'},{av:'Z120BarAgrEst'},{av:'Z4016BarTin'},{av:'Z2010BarTipDis'},{av:'Z407EmprNom'},{av:'Z4832BarAudFec'},{av:'Z4833BarAudTur'},{av:'Z4834BarAudOpe'},{av:'Z4835BarAudOpeN'},{av:'Z4836BarAudSup'},{av:'Z4837BarAudSupN'},{av:'Z4838BarAudNPz'},{av:'Z4839BarAudMTab'},{av:'Z4840BarAudMDig'},{av:'Z4841BarAudMCue'},{av:'Z4844BarAudULin'},{av:'Z4845BarAudObs'},{av:'Z184BarMtr'},{av:'Z199BarPie1'},{av:'Z252CliCod'},{av:'Z365DisDes'},{av:'Z279CliNom'},{av:'Z198BarPie'},{av:'Z4843BarAudMDC'},{av:'Z4842BarAudMDD'},{av:'O4839BarAudMTab'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARPIENDES","{handler:'valid_Barpiendes',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARPIENDES",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARTIN","{handler:'valid_Bartin',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARTIN",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARAUDMTAB","{handler:'valid_Baraudmtab',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARAUDMTAB",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARAUDMDIG","{handler:'valid_Baraudmdig',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARAUDMDIG",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARAUDMCUE","{handler:'valid_Baraudmcue',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARAUDMCUE",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARAUDLIN","{handler:'valid_Baraudlin',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARAUDLIN",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("VALID_BARAUDMTS","{handler:'valid_Baraudmts',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("VALID_BARAUDMTS",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Baraudpant',iparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A4016BarTin',fld:'BARTIN',pic:'@!'}]}");
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
      pr_default.close(92);
      pr_default.close(20);
      pr_default.close(21);
      pr_default.close(93);
      pr_default.close(94);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOAV52BarAudOpeN = "" ;
      wcpOAV53BarAudSupN = "" ;
      wcpOAV54BarAudFec = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z143BarDisNum = "" ;
      Z155BarFecCli = GXutil.nullDate() ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z1798BarDibCli = "" ;
      Z135BarColNom = "" ;
      Z120BarAgrEst = "" ;
      Z4016BarTin = "" ;
      Z2010BarTipDis = "" ;
      Z4832BarAudFec = GXutil.nullDate() ;
      Z4835BarAudOpeN = "" ;
      Z4837BarAudSupN = "" ;
      Z4840BarAudMDig = DecimalUtil.ZERO ;
      Z4841BarAudMCue = DecimalUtil.ZERO ;
      Z4845BarAudObs = "" ;
      O4839BarAudMTab = DecimalUtil.ZERO ;
      Z4847BarAudPie = "" ;
      Z4848BarAudMts = DecimalUtil.ZERO ;
      Z4849BarAudCar = "" ;
      Z5000BarAudPar = "" ;
      O4848BarAudMts = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV52BarAudOpeN = "" ;
      AV53BarAudSupN = "" ;
      AV54BarAudFec = GXutil.nullDate() ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A4016BarTin = "" ;
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
      A143BarDisNum = "" ;
      lblTextblock6_Jsonclick = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1652BarSerDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A1798BarDibCli = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A120BarAgrEst = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A2010BarTipDis = "" ;
      lblTextblock22_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock23_Jsonclick = "" ;
      A4832BarAudFec = GXutil.nullDate() ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A4835BarAudOpeN = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      A4837BarAudSupN = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      A4839BarAudMTab = DecimalUtil.ZERO ;
      lblTextblock31_Jsonclick = "" ;
      A4840BarAudMDig = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A4841BarAudMCue = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      A4842BarAudMDD = DecimalUtil.ZERO ;
      lblTextblock34_Jsonclick = "" ;
      A4843BarAudMDC = DecimalUtil.ZERO ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      A4845BarAudObs = "" ;
      lblTextblock37_Jsonclick = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      lblTextblock38_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B4839BarAudMTab = DecimalUtil.ZERO ;
      sMode1567 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      s4839BarAudMTab = DecimalUtil.ZERO ;
      s4842BarAudMDD = DecimalUtil.ZERO ;
      O4842BarAudMDD = DecimalUtil.ZERO ;
      s4843BarAudMDC = DecimalUtil.ZERO ;
      O4843BarAudMDC = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A4847BarAudPie = "" ;
      A4848BarAudMts = DecimalUtil.ZERO ;
      A4849BarAudCar = "" ;
      A5000BarAudPar = "" ;
      A5001BarAudEmpV = "" ;
      A5004BarAudParV = "" ;
      A5006BarAudCant = "" ;
      A5007BarAudPant = "" ;
      T4848BarAudMts = DecimalUtil.ZERO ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      Z184BarMtr = DecimalUtil.ZERO ;
      Z4839BarAudMTab = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      T01FE12_A407EmprNom = new String[] {""} ;
      T01FE12_n407EmprNom = new boolean[] {false} ;
      T01FE16_A898BarPieNDes = new int[1] ;
      T01FE16_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE16_A199BarPie1 = new short[1] ;
      T01FE18_A4839BarAudMTab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE18_n4839BarAudMTab = new boolean[] {false} ;
      T01FE21_A2759BarMaqGru = new String[] {""} ;
      T01FE21_A129BarCod = new int[1] ;
      T01FE21_n129BarCod = new boolean[] {false} ;
      T01FE21_A132BarCodReo = new byte[1] ;
      T01FE21_n132BarCodReo = new boolean[] {false} ;
      T01FE21_A130BarCodPar = new String[] {""} ;
      T01FE21_n130BarCodPar = new boolean[] {false} ;
      T01FE21_A180BarMaqCod = new String[] {""} ;
      T01FE21_A143BarDisNum = new String[] {""} ;
      T01FE21_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE21_A252CliCod = new int[1] ;
      T01FE21_n252CliCod = new boolean[] {false} ;
      T01FE21_A279CliNom = new String[] {""} ;
      T01FE21_A212BarSer = new String[] {""} ;
      T01FE21_A1652BarSerDsc = new String[] {""} ;
      T01FE21_A1798BarDibCli = new String[] {""} ;
      T01FE21_A1799BarDibInt = new int[1] ;
      T01FE21_A135BarColNom = new String[] {""} ;
      T01FE21_A136BarColNum = new int[1] ;
      T01FE21_A218BarTipCol = new byte[1] ;
      T01FE21_A213BarSit = new byte[1] ;
      T01FE21_A120BarAgrEst = new String[] {""} ;
      T01FE21_A4016BarTin = new String[] {""} ;
      T01FE21_A2010BarTipDis = new String[] {""} ;
      T01FE21_A407EmprNom = new String[] {""} ;
      T01FE21_n407EmprNom = new boolean[] {false} ;
      T01FE21_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE21_n4832BarAudFec = new boolean[] {false} ;
      T01FE21_A4833BarAudTur = new byte[1] ;
      T01FE21_n4833BarAudTur = new boolean[] {false} ;
      T01FE21_A4834BarAudOpe = new int[1] ;
      T01FE21_n4834BarAudOpe = new boolean[] {false} ;
      T01FE21_A4835BarAudOpeN = new String[] {""} ;
      T01FE21_n4835BarAudOpeN = new boolean[] {false} ;
      T01FE21_A4836BarAudSup = new int[1] ;
      T01FE21_A4837BarAudSupN = new String[] {""} ;
      T01FE21_n4837BarAudSupN = new boolean[] {false} ;
      T01FE21_A4838BarAudNPz = new short[1] ;
      T01FE21_n4838BarAudNPz = new boolean[] {false} ;
      T01FE21_A4840BarAudMDig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE21_n4840BarAudMDig = new boolean[] {false} ;
      T01FE21_A4841BarAudMCue = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE21_n4841BarAudMCue = new boolean[] {false} ;
      T01FE21_A4844BarAudULin = new short[1] ;
      T01FE21_n4844BarAudULin = new boolean[] {false} ;
      T01FE21_A4845BarAudObs = new String[] {""} ;
      T01FE21_n4845BarAudObs = new boolean[] {false} ;
      T01FE21_A365DisDes = new String[] {""} ;
      T01FE21_A396EmprCod = new String[] {""} ;
      T01FE21_n396EmprCod = new boolean[] {false} ;
      T01FE21_A361DisCod = new int[1] ;
      T01FE21_A898BarPieNDes = new int[1] ;
      T01FE21_A4839BarAudMTab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE21_n4839BarAudMTab = new boolean[] {false} ;
      T01FE21_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE21_A199BarPie1 = new short[1] ;
      T01FE13_A252CliCod = new int[1] ;
      T01FE13_n252CliCod = new boolean[] {false} ;
      T01FE13_A365DisDes = new String[] {""} ;
      T01FE14_A279CliNom = new String[] {""} ;
      T01FE22_A252CliCod = new int[1] ;
      T01FE22_n252CliCod = new boolean[] {false} ;
      T01FE22_A365DisDes = new String[] {""} ;
      T01FE23_A279CliNom = new String[] {""} ;
      T01FE24_A396EmprCod = new String[] {""} ;
      T01FE24_n396EmprCod = new boolean[] {false} ;
      T01FE24_A129BarCod = new int[1] ;
      T01FE24_n129BarCod = new boolean[] {false} ;
      T01FE24_A132BarCodReo = new byte[1] ;
      T01FE24_n132BarCodReo = new boolean[] {false} ;
      T01FE24_A130BarCodPar = new String[] {""} ;
      T01FE24_n130BarCodPar = new boolean[] {false} ;
      T01FE11_A2759BarMaqGru = new String[] {""} ;
      T01FE11_A129BarCod = new int[1] ;
      T01FE11_n129BarCod = new boolean[] {false} ;
      T01FE11_A132BarCodReo = new byte[1] ;
      T01FE11_n132BarCodReo = new boolean[] {false} ;
      T01FE11_A130BarCodPar = new String[] {""} ;
      T01FE11_n130BarCodPar = new boolean[] {false} ;
      T01FE11_A180BarMaqCod = new String[] {""} ;
      T01FE11_A143BarDisNum = new String[] {""} ;
      T01FE11_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE11_A212BarSer = new String[] {""} ;
      T01FE11_A1652BarSerDsc = new String[] {""} ;
      T01FE11_A1798BarDibCli = new String[] {""} ;
      T01FE11_A1799BarDibInt = new int[1] ;
      T01FE11_A135BarColNom = new String[] {""} ;
      T01FE11_A136BarColNum = new int[1] ;
      T01FE11_A218BarTipCol = new byte[1] ;
      T01FE11_A213BarSit = new byte[1] ;
      T01FE11_A120BarAgrEst = new String[] {""} ;
      T01FE11_A4016BarTin = new String[] {""} ;
      T01FE11_A2010BarTipDis = new String[] {""} ;
      T01FE11_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE11_n4832BarAudFec = new boolean[] {false} ;
      T01FE11_A4833BarAudTur = new byte[1] ;
      T01FE11_n4833BarAudTur = new boolean[] {false} ;
      T01FE11_A4834BarAudOpe = new int[1] ;
      T01FE11_n4834BarAudOpe = new boolean[] {false} ;
      T01FE11_A4835BarAudOpeN = new String[] {""} ;
      T01FE11_n4835BarAudOpeN = new boolean[] {false} ;
      T01FE11_A4836BarAudSup = new int[1] ;
      T01FE11_A4837BarAudSupN = new String[] {""} ;
      T01FE11_n4837BarAudSupN = new boolean[] {false} ;
      T01FE11_A4838BarAudNPz = new short[1] ;
      T01FE11_n4838BarAudNPz = new boolean[] {false} ;
      T01FE11_A4840BarAudMDig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE11_n4840BarAudMDig = new boolean[] {false} ;
      T01FE11_A4841BarAudMCue = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE11_n4841BarAudMCue = new boolean[] {false} ;
      T01FE11_A4844BarAudULin = new short[1] ;
      T01FE11_n4844BarAudULin = new boolean[] {false} ;
      T01FE11_A4845BarAudObs = new String[] {""} ;
      T01FE11_n4845BarAudObs = new boolean[] {false} ;
      T01FE11_A396EmprCod = new String[] {""} ;
      T01FE11_n396EmprCod = new boolean[] {false} ;
      T01FE11_A361DisCod = new int[1] ;
      T01FE11_A252CliCod = new int[1] ;
      T01FE11_n252CliCod = new boolean[] {false} ;
      T01FE11_A365DisDes = new String[] {""} ;
      T01FE25_A396EmprCod = new String[] {""} ;
      T01FE25_n396EmprCod = new boolean[] {false} ;
      T01FE25_A129BarCod = new int[1] ;
      T01FE25_n129BarCod = new boolean[] {false} ;
      T01FE25_A132BarCodReo = new byte[1] ;
      T01FE25_n132BarCodReo = new boolean[] {false} ;
      T01FE25_A130BarCodPar = new String[] {""} ;
      T01FE25_n130BarCodPar = new boolean[] {false} ;
      T01FE26_A396EmprCod = new String[] {""} ;
      T01FE26_n396EmprCod = new boolean[] {false} ;
      T01FE26_A129BarCod = new int[1] ;
      T01FE26_n129BarCod = new boolean[] {false} ;
      T01FE26_A132BarCodReo = new byte[1] ;
      T01FE26_n132BarCodReo = new boolean[] {false} ;
      T01FE26_A130BarCodPar = new String[] {""} ;
      T01FE26_n130BarCodPar = new boolean[] {false} ;
      T01FE10_A2759BarMaqGru = new String[] {""} ;
      T01FE10_A129BarCod = new int[1] ;
      T01FE10_n129BarCod = new boolean[] {false} ;
      T01FE10_A132BarCodReo = new byte[1] ;
      T01FE10_n132BarCodReo = new boolean[] {false} ;
      T01FE10_A130BarCodPar = new String[] {""} ;
      T01FE10_n130BarCodPar = new boolean[] {false} ;
      T01FE10_A180BarMaqCod = new String[] {""} ;
      T01FE10_A143BarDisNum = new String[] {""} ;
      T01FE10_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE10_A212BarSer = new String[] {""} ;
      T01FE10_A1652BarSerDsc = new String[] {""} ;
      T01FE10_A1798BarDibCli = new String[] {""} ;
      T01FE10_A1799BarDibInt = new int[1] ;
      T01FE10_A135BarColNom = new String[] {""} ;
      T01FE10_A136BarColNum = new int[1] ;
      T01FE10_A218BarTipCol = new byte[1] ;
      T01FE10_A213BarSit = new byte[1] ;
      T01FE10_A120BarAgrEst = new String[] {""} ;
      T01FE10_A4016BarTin = new String[] {""} ;
      T01FE10_A2010BarTipDis = new String[] {""} ;
      T01FE10_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE10_n4832BarAudFec = new boolean[] {false} ;
      T01FE10_A4833BarAudTur = new byte[1] ;
      T01FE10_n4833BarAudTur = new boolean[] {false} ;
      T01FE10_A4834BarAudOpe = new int[1] ;
      T01FE10_n4834BarAudOpe = new boolean[] {false} ;
      T01FE10_A4835BarAudOpeN = new String[] {""} ;
      T01FE10_n4835BarAudOpeN = new boolean[] {false} ;
      T01FE10_A4836BarAudSup = new int[1] ;
      T01FE10_A4837BarAudSupN = new String[] {""} ;
      T01FE10_n4837BarAudSupN = new boolean[] {false} ;
      T01FE10_A4838BarAudNPz = new short[1] ;
      T01FE10_n4838BarAudNPz = new boolean[] {false} ;
      T01FE10_A4840BarAudMDig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE10_n4840BarAudMDig = new boolean[] {false} ;
      T01FE10_A4841BarAudMCue = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE10_n4841BarAudMCue = new boolean[] {false} ;
      T01FE10_A4844BarAudULin = new short[1] ;
      T01FE10_n4844BarAudULin = new boolean[] {false} ;
      T01FE10_A4845BarAudObs = new String[] {""} ;
      T01FE10_n4845BarAudObs = new boolean[] {false} ;
      T01FE10_A396EmprCod = new String[] {""} ;
      T01FE10_n396EmprCod = new boolean[] {false} ;
      T01FE10_A361DisCod = new int[1] ;
      T01FE10_A252CliCod = new int[1] ;
      T01FE10_n252CliCod = new boolean[] {false} ;
      T01FE10_A365DisDes = new String[] {""} ;
      T01FE30_A252CliCod = new int[1] ;
      T01FE30_n252CliCod = new boolean[] {false} ;
      T01FE30_A365DisDes = new String[] {""} ;
      T01FE31_A279CliNom = new String[] {""} ;
      T01FE32_A14681MRPrId = new long[1] ;
      T01FE33_A5921XCjaDis = new String[] {""} ;
      T01FE33_A5922XCjaCod = new long[1] ;
      T01FE34_A396EmprCod = new String[] {""} ;
      T01FE34_n396EmprCod = new boolean[] {false} ;
      T01FE34_A129BarCod = new int[1] ;
      T01FE34_n129BarCod = new boolean[] {false} ;
      T01FE34_A132BarCodReo = new byte[1] ;
      T01FE34_n132BarCodReo = new boolean[] {false} ;
      T01FE34_A130BarCodPar = new String[] {""} ;
      T01FE34_n130BarCodPar = new boolean[] {false} ;
      T01FE34_A14152MEnvOrd = new short[1] ;
      T01FE35_A396EmprCod = new String[] {""} ;
      T01FE35_n396EmprCod = new boolean[] {false} ;
      T01FE35_A129BarCod = new int[1] ;
      T01FE35_n129BarCod = new boolean[] {false} ;
      T01FE35_A132BarCodReo = new byte[1] ;
      T01FE35_n132BarCodReo = new boolean[] {false} ;
      T01FE35_A130BarCodPar = new String[] {""} ;
      T01FE35_n130BarCodPar = new boolean[] {false} ;
      T01FE35_A13905BarTraID = new String[] {""} ;
      T01FE36_A396EmprCod = new String[] {""} ;
      T01FE36_n396EmprCod = new boolean[] {false} ;
      T01FE36_A129BarCod = new int[1] ;
      T01FE36_n129BarCod = new boolean[] {false} ;
      T01FE36_A132BarCodReo = new byte[1] ;
      T01FE36_n132BarCodReo = new boolean[] {false} ;
      T01FE36_A130BarCodPar = new String[] {""} ;
      T01FE36_n130BarCodPar = new boolean[] {false} ;
      T01FE36_A13093BarDGLin = new byte[1] ;
      T01FE36_A13094BarDGDibCl = new String[] {""} ;
      T01FE36_A13095BarDGDibIn = new int[1] ;
      T01FE36_A13096BarDGComb = new String[] {""} ;
      T01FE36_A13097BarDGFOndo = new String[] {""} ;
      T01FE37_A396EmprCod = new String[] {""} ;
      T01FE37_n396EmprCod = new boolean[] {false} ;
      T01FE37_A11917Ebd_numero = new int[1] ;
      T01FE38_A396EmprCod = new String[] {""} ;
      T01FE38_n396EmprCod = new boolean[] {false} ;
      T01FE38_A11898Prd_numero = new int[1] ;
      T01FE39_A396EmprCod = new String[] {""} ;
      T01FE39_n396EmprCod = new boolean[] {false} ;
      T01FE39_A11849Cte_numero = new int[1] ;
      T01FE40_A396EmprCod = new String[] {""} ;
      T01FE40_n396EmprCod = new boolean[] {false} ;
      T01FE40_A11791Ap_numero = new int[1] ;
      T01FE41_A396EmprCod = new String[] {""} ;
      T01FE41_n396EmprCod = new boolean[] {false} ;
      T01FE41_A3985CalBarCod = new int[1] ;
      T01FE41_A3986CalBarCodR = new byte[1] ;
      T01FE41_A3987CalBarCodP = new String[] {""} ;
      T01FE42_A396EmprCod = new String[] {""} ;
      T01FE42_n396EmprCod = new boolean[] {false} ;
      T01FE42_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE42_A652OpeCod = new int[1] ;
      T01FE43_A396EmprCod = new String[] {""} ;
      T01FE43_n396EmprCod = new boolean[] {false} ;
      T01FE43_A129BarCod = new int[1] ;
      T01FE43_n129BarCod = new boolean[] {false} ;
      T01FE43_A132BarCodReo = new byte[1] ;
      T01FE43_n132BarCodReo = new boolean[] {false} ;
      T01FE43_A130BarCodPar = new String[] {""} ;
      T01FE43_n130BarCodPar = new boolean[] {false} ;
      T01FE43_A4118tinagrcod = new int[1] ;
      T01FE43_A4119tinagrreo = new byte[1] ;
      T01FE43_A4120tinagrpar = new String[] {""} ;
      T01FE44_A396EmprCod = new String[] {""} ;
      T01FE44_n396EmprCod = new boolean[] {false} ;
      T01FE44_A129BarCod = new int[1] ;
      T01FE44_n129BarCod = new boolean[] {false} ;
      T01FE44_A132BarCodReo = new byte[1] ;
      T01FE44_n132BarCodReo = new boolean[] {false} ;
      T01FE44_A130BarCodPar = new String[] {""} ;
      T01FE44_n130BarCodPar = new boolean[] {false} ;
      T01FE44_A4080estagrcod = new int[1] ;
      T01FE44_A4081estagrreo = new byte[1] ;
      T01FE44_A4082estagrpar = new String[] {""} ;
      T01FE45_A396EmprCod = new String[] {""} ;
      T01FE45_n396EmprCod = new boolean[] {false} ;
      T01FE45_A129BarCod = new int[1] ;
      T01FE45_n129BarCod = new boolean[] {false} ;
      T01FE45_A132BarCodReo = new byte[1] ;
      T01FE45_n132BarCodReo = new boolean[] {false} ;
      T01FE45_A130BarCodPar = new String[] {""} ;
      T01FE45_n130BarCodPar = new boolean[] {false} ;
      T01FE45_A4075recestncol = new byte[1] ;
      T01FE45_A4076recestnpro = new byte[1] ;
      T01FE46_A396EmprCod = new String[] {""} ;
      T01FE46_n396EmprCod = new boolean[] {false} ;
      T01FE46_A602MaqCod = new String[] {""} ;
      T01FE46_A1142MaqFCod = new String[] {""} ;
      T01FE46_A3068PlaEtaOrd = new short[1] ;
      T01FE46_A3069PlaEtaOrdA = new byte[1] ;
      T01FE46_A129BarCod = new int[1] ;
      T01FE46_n129BarCod = new boolean[] {false} ;
      T01FE46_A132BarCodReo = new byte[1] ;
      T01FE46_n132BarCodReo = new boolean[] {false} ;
      T01FE46_A130BarCodPar = new String[] {""} ;
      T01FE46_n130BarCodPar = new boolean[] {false} ;
      T01FE47_A396EmprCod = new String[] {""} ;
      T01FE47_n396EmprCod = new boolean[] {false} ;
      T01FE47_A129BarCod = new int[1] ;
      T01FE47_n129BarCod = new boolean[] {false} ;
      T01FE47_A132BarCodReo = new byte[1] ;
      T01FE47_n132BarCodReo = new boolean[] {false} ;
      T01FE47_A130BarCodPar = new String[] {""} ;
      T01FE47_n130BarCodPar = new boolean[] {false} ;
      T01FE47_A3940BarEnsLin = new short[1] ;
      T01FE48_A396EmprCod = new String[] {""} ;
      T01FE48_n396EmprCod = new boolean[] {false} ;
      T01FE48_A129BarCod = new int[1] ;
      T01FE48_n129BarCod = new boolean[] {false} ;
      T01FE48_A132BarCodReo = new byte[1] ;
      T01FE48_n132BarCodReo = new boolean[] {false} ;
      T01FE48_A130BarCodPar = new String[] {""} ;
      T01FE48_n130BarCodPar = new boolean[] {false} ;
      T01FE48_A3384RefBarCod = new int[1] ;
      T01FE48_A3385RefBarReo = new byte[1] ;
      T01FE48_A3386RefBarPar = new String[] {""} ;
      T01FE49_A396EmprCod = new String[] {""} ;
      T01FE49_n396EmprCod = new boolean[] {false} ;
      T01FE49_A10914SolSalCod = new int[1] ;
      T01FE50_A396EmprCod = new String[] {""} ;
      T01FE50_n396EmprCod = new boolean[] {false} ;
      T01FE50_A10364Ph_numero = new int[1] ;
      T01FE51_A396EmprCod = new String[] {""} ;
      T01FE51_n396EmprCod = new boolean[] {false} ;
      T01FE51_A129BarCod = new int[1] ;
      T01FE51_n129BarCod = new boolean[] {false} ;
      T01FE51_A132BarCodReo = new byte[1] ;
      T01FE51_n132BarCodReo = new boolean[] {false} ;
      T01FE51_A130BarCodPar = new String[] {""} ;
      T01FE51_n130BarCodPar = new boolean[] {false} ;
      T01FE51_A10197ProEspCod = new String[] {""} ;
      T01FE52_A396EmprCod = new String[] {""} ;
      T01FE52_n396EmprCod = new boolean[] {false} ;
      T01FE52_A129BarCod = new int[1] ;
      T01FE52_n129BarCod = new boolean[] {false} ;
      T01FE52_A132BarCodReo = new byte[1] ;
      T01FE52_n132BarCodReo = new boolean[] {false} ;
      T01FE52_A130BarCodPar = new String[] {""} ;
      T01FE52_n130BarCodPar = new boolean[] {false} ;
      T01FE52_A5322Dp_Nrecep = new int[1] ;
      T01FE53_A396EmprCod = new String[] {""} ;
      T01FE53_n396EmprCod = new boolean[] {false} ;
      T01FE53_A129BarCod = new int[1] ;
      T01FE53_n129BarCod = new boolean[] {false} ;
      T01FE53_A132BarCodReo = new byte[1] ;
      T01FE53_n132BarCodReo = new boolean[] {false} ;
      T01FE53_A130BarCodPar = new String[] {""} ;
      T01FE53_n130BarCodPar = new boolean[] {false} ;
      T01FE53_A8569EntSecLn = new int[1] ;
      T01FE54_A396EmprCod = new String[] {""} ;
      T01FE54_n396EmprCod = new boolean[] {false} ;
      T01FE54_A7434PLLNro = new int[1] ;
      T01FE54_A7443LPLNro = new short[1] ;
      T01FE54_A7459CPLCom = new short[1] ;
      T01FE54_A129BarCod = new int[1] ;
      T01FE54_n129BarCod = new boolean[] {false} ;
      T01FE54_A132BarCodReo = new byte[1] ;
      T01FE54_n132BarCodReo = new boolean[] {false} ;
      T01FE54_A130BarCodPar = new String[] {""} ;
      T01FE54_n130BarCodPar = new boolean[] {false} ;
      T01FE55_A396EmprCod = new String[] {""} ;
      T01FE55_n396EmprCod = new boolean[] {false} ;
      T01FE55_A7145OSSCod = new int[1] ;
      T01FE56_A396EmprCod = new String[] {""} ;
      T01FE56_n396EmprCod = new boolean[] {false} ;
      T01FE56_A7049OGSCod = new int[1] ;
      T01FE57_A396EmprCod = new String[] {""} ;
      T01FE57_n396EmprCod = new boolean[] {false} ;
      T01FE57_A129BarCod = new int[1] ;
      T01FE57_n129BarCod = new boolean[] {false} ;
      T01FE57_A132BarCodReo = new byte[1] ;
      T01FE57_n132BarCodReo = new boolean[] {false} ;
      T01FE57_A130BarCodPar = new String[] {""} ;
      T01FE57_n130BarCodPar = new boolean[] {false} ;
      T01FE57_A6031Ac_Barcod = new int[1] ;
      T01FE57_A6032Ac_BarReo = new byte[1] ;
      T01FE57_A6033Ac_BarPar = new String[] {""} ;
      T01FE58_A396EmprCod = new String[] {""} ;
      T01FE58_n396EmprCod = new boolean[] {false} ;
      T01FE58_A129BarCod = new int[1] ;
      T01FE58_n129BarCod = new boolean[] {false} ;
      T01FE58_A132BarCodReo = new byte[1] ;
      T01FE58_n132BarCodReo = new boolean[] {false} ;
      T01FE58_A130BarCodPar = new String[] {""} ;
      T01FE58_n130BarCodPar = new boolean[] {false} ;
      T01FE58_A5908PartPal = new int[1] ;
      T01FE59_A396EmprCod = new String[] {""} ;
      T01FE59_n396EmprCod = new boolean[] {false} ;
      T01FE59_A129BarCod = new int[1] ;
      T01FE59_n129BarCod = new boolean[] {false} ;
      T01FE59_A132BarCodReo = new byte[1] ;
      T01FE59_n132BarCodReo = new boolean[] {false} ;
      T01FE59_A130BarCodPar = new String[] {""} ;
      T01FE59_n130BarCodPar = new boolean[] {false} ;
      T01FE59_A2524DisComLin = new byte[1] ;
      T01FE59_A1056DisComCod = new String[] {""} ;
      T01FE59_A1032FonCod = new String[] {""} ;
      T01FE60_A396EmprCod = new String[] {""} ;
      T01FE60_n396EmprCod = new boolean[] {false} ;
      T01FE60_A1736AlbExtCod = new long[1] ;
      T01FE60_A129BarCod = new int[1] ;
      T01FE60_n129BarCod = new boolean[] {false} ;
      T01FE60_A132BarCodReo = new byte[1] ;
      T01FE60_n132BarCodReo = new boolean[] {false} ;
      T01FE60_A130BarCodPar = new String[] {""} ;
      T01FE60_n130BarCodPar = new boolean[] {false} ;
      T01FE61_A396EmprCod = new String[] {""} ;
      T01FE61_n396EmprCod = new boolean[] {false} ;
      T01FE61_A129BarCod = new int[1] ;
      T01FE61_n129BarCod = new boolean[] {false} ;
      T01FE61_A132BarCodReo = new byte[1] ;
      T01FE61_n132BarCodReo = new boolean[] {false} ;
      T01FE61_A130BarCodPar = new String[] {""} ;
      T01FE61_n130BarCodPar = new boolean[] {false} ;
      T01FE61_A3753BarFoaCod = new int[1] ;
      T01FE61_A3754BarFoaReo = new byte[1] ;
      T01FE61_A3755BarFoaPar = new String[] {""} ;
      T01FE62_A396EmprCod = new String[] {""} ;
      T01FE62_n396EmprCod = new boolean[] {false} ;
      T01FE62_A129BarCod = new int[1] ;
      T01FE62_n129BarCod = new boolean[] {false} ;
      T01FE62_A132BarCodReo = new byte[1] ;
      T01FE62_n132BarCodReo = new boolean[] {false} ;
      T01FE62_A130BarCodPar = new String[] {""} ;
      T01FE62_n130BarCodPar = new boolean[] {false} ;
      T01FE62_A3747BarPegCod = new int[1] ;
      T01FE62_A3748BarPegReo = new byte[1] ;
      T01FE62_A3749BarPegPar = new String[] {""} ;
      T01FE63_A396EmprCod = new String[] {""} ;
      T01FE63_n396EmprCod = new boolean[] {false} ;
      T01FE63_A3253SolTraCod = new int[1] ;
      T01FE64_A396EmprCod = new String[] {""} ;
      T01FE64_n396EmprCod = new boolean[] {false} ;
      T01FE64_A3235SolSubCod = new int[1] ;
      T01FE65_A396EmprCod = new String[] {""} ;
      T01FE65_n396EmprCod = new boolean[] {false} ;
      T01FE65_A3218SolLuzCod = new int[1] ;
      T01FE66_A396EmprCod = new String[] {""} ;
      T01FE66_n396EmprCod = new boolean[] {false} ;
      T01FE66_A3196SolFriCod = new int[1] ;
      T01FE67_A396EmprCod = new String[] {""} ;
      T01FE67_n396EmprCod = new boolean[] {false} ;
      T01FE67_A3165SolPilCod = new int[1] ;
      T01FE68_A396EmprCod = new String[] {""} ;
      T01FE68_n396EmprCod = new boolean[] {false} ;
      T01FE68_A129BarCod = new int[1] ;
      T01FE68_n129BarCod = new boolean[] {false} ;
      T01FE68_A132BarCodReo = new byte[1] ;
      T01FE68_n132BarCodReo = new boolean[] {false} ;
      T01FE68_A130BarCodPar = new String[] {""} ;
      T01FE68_n130BarCodPar = new boolean[] {false} ;
      T01FE68_A2872HAnRLinMaq = new short[1] ;
      T01FE68_A2873HAnRLinPro = new byte[1] ;
      T01FE68_A2874HAnRLin = new short[1] ;
      T01FE68_A2875HAnNumAny = new byte[1] ;
      T01FE69_A396EmprCod = new String[] {""} ;
      T01FE69_n396EmprCod = new boolean[] {false} ;
      T01FE69_A2817PlaTer = new String[] {""} ;
      T01FE69_A2818PlaOrd = new short[1] ;
      T01FE70_A396EmprCod = new String[] {""} ;
      T01FE70_n396EmprCod = new boolean[] {false} ;
      T01FE70_A2809MetTerCod = new String[] {""} ;
      T01FE70_A129BarCod = new int[1] ;
      T01FE70_n129BarCod = new boolean[] {false} ;
      T01FE70_A132BarCodReo = new byte[1] ;
      T01FE70_n132BarCodReo = new boolean[] {false} ;
      T01FE70_A130BarCodPar = new String[] {""} ;
      T01FE70_n130BarCodPar = new boolean[] {false} ;
      T01FE71_A396EmprCod = new String[] {""} ;
      T01FE71_n396EmprCod = new boolean[] {false} ;
      T01FE71_A129BarCod = new int[1] ;
      T01FE71_n129BarCod = new boolean[] {false} ;
      T01FE71_A132BarCodReo = new byte[1] ;
      T01FE71_n132BarCodReo = new boolean[] {false} ;
      T01FE71_A130BarCodPar = new String[] {""} ;
      T01FE71_n130BarCodPar = new boolean[] {false} ;
      T01FE71_A2808RecLinMAL = new short[1] ;
      T01FE71_A1377RecNumAny = new byte[1] ;
      T01FE71_A719PrdNum = new String[] {""} ;
      T01FE72_A396EmprCod = new String[] {""} ;
      T01FE72_n396EmprCod = new boolean[] {false} ;
      T01FE72_A129BarCod = new int[1] ;
      T01FE72_n129BarCod = new boolean[] {false} ;
      T01FE72_A132BarCodReo = new byte[1] ;
      T01FE72_n132BarCodReo = new boolean[] {false} ;
      T01FE72_A130BarCodPar = new String[] {""} ;
      T01FE72_n130BarCodPar = new boolean[] {false} ;
      T01FE72_A2804RecLinMaq = new short[1] ;
      T01FE73_A396EmprCod = new String[] {""} ;
      T01FE73_n396EmprCod = new boolean[] {false} ;
      T01FE73_A2792TermiCod = new String[] {""} ;
      T01FE73_A129BarCod = new int[1] ;
      T01FE73_n129BarCod = new boolean[] {false} ;
      T01FE73_A132BarCodReo = new byte[1] ;
      T01FE73_n132BarCodReo = new boolean[] {false} ;
      T01FE73_A130BarCodPar = new String[] {""} ;
      T01FE73_n130BarCodPar = new boolean[] {false} ;
      T01FE74_A396EmprCod = new String[] {""} ;
      T01FE74_n396EmprCod = new boolean[] {false} ;
      T01FE74_A2248ManCod = new short[1] ;
      T01FE74_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE74_A2713RpExHdLi = new short[1] ;
      T01FE75_A396EmprCod = new String[] {""} ;
      T01FE75_n396EmprCod = new boolean[] {false} ;
      T01FE75_A2248ManCod = new short[1] ;
      T01FE75_A2689ExHdrFas = new String[] {""} ;
      T01FE75_A2692ExHdrLin = new int[1] ;
      T01FE76_A396EmprCod = new String[] {""} ;
      T01FE76_n396EmprCod = new boolean[] {false} ;
      T01FE76_A129BarCod = new int[1] ;
      T01FE76_n129BarCod = new boolean[] {false} ;
      T01FE76_A132BarCodReo = new byte[1] ;
      T01FE76_n132BarCodReo = new boolean[] {false} ;
      T01FE76_A130BarCodPar = new String[] {""} ;
      T01FE76_n130BarCodPar = new boolean[] {false} ;
      T01FE76_A2494BarDosPro = new String[] {""} ;
      T01FE76_A719PrdNum = new String[] {""} ;
      T01FE77_A396EmprCod = new String[] {""} ;
      T01FE77_n396EmprCod = new boolean[] {false} ;
      T01FE77_A602MaqCod = new String[] {""} ;
      T01FE77_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE77_A129BarCod = new int[1] ;
      T01FE77_n129BarCod = new boolean[] {false} ;
      T01FE77_A132BarCodReo = new byte[1] ;
      T01FE77_n132BarCodReo = new boolean[] {false} ;
      T01FE77_A130BarCodPar = new String[] {""} ;
      T01FE77_n130BarCodPar = new boolean[] {false} ;
      T01FE78_A396EmprCod = new String[] {""} ;
      T01FE78_n396EmprCod = new boolean[] {false} ;
      T01FE78_A129BarCod = new int[1] ;
      T01FE78_n129BarCod = new boolean[] {false} ;
      T01FE78_A132BarCodReo = new byte[1] ;
      T01FE78_n132BarCodReo = new boolean[] {false} ;
      T01FE78_A130BarCodPar = new String[] {""} ;
      T01FE78_n130BarCodPar = new boolean[] {false} ;
      T01FE78_A2457BarObLin = new short[1] ;
      T01FE79_A396EmprCod = new String[] {""} ;
      T01FE79_n396EmprCod = new boolean[] {false} ;
      T01FE79_A129BarCod = new int[1] ;
      T01FE79_n129BarCod = new boolean[] {false} ;
      T01FE79_A132BarCodReo = new byte[1] ;
      T01FE79_n132BarCodReo = new boolean[] {false} ;
      T01FE79_A130BarCodPar = new String[] {""} ;
      T01FE79_n130BarCodPar = new boolean[] {false} ;
      T01FE79_A2444BarEnLin = new short[1] ;
      T01FE80_A396EmprCod = new String[] {""} ;
      T01FE80_n396EmprCod = new boolean[] {false} ;
      T01FE80_A2406ExhAlbCod = new int[1] ;
      T01FE80_A129BarCod = new int[1] ;
      T01FE80_n129BarCod = new boolean[] {false} ;
      T01FE80_A132BarCodReo = new byte[1] ;
      T01FE80_n132BarCodReo = new boolean[] {false} ;
      T01FE80_A130BarCodPar = new String[] {""} ;
      T01FE80_n130BarCodPar = new boolean[] {false} ;
      T01FE81_A396EmprCod = new String[] {""} ;
      T01FE81_n396EmprCod = new boolean[] {false} ;
      T01FE81_A2253SalExtAlb = new int[1] ;
      T01FE81_A129BarCod = new int[1] ;
      T01FE81_n129BarCod = new boolean[] {false} ;
      T01FE81_A132BarCodReo = new byte[1] ;
      T01FE81_n132BarCodReo = new boolean[] {false} ;
      T01FE81_A130BarCodPar = new String[] {""} ;
      T01FE81_n130BarCodPar = new boolean[] {false} ;
      T01FE82_A396EmprCod = new String[] {""} ;
      T01FE82_n396EmprCod = new boolean[] {false} ;
      T01FE82_A30AlbProCod = new long[1] ;
      T01FE82_A129BarCod = new int[1] ;
      T01FE82_n129BarCod = new boolean[] {false} ;
      T01FE82_A132BarCodReo = new byte[1] ;
      T01FE82_n132BarCodReo = new boolean[] {false} ;
      T01FE82_A130BarCodPar = new String[] {""} ;
      T01FE82_n130BarCodPar = new boolean[] {false} ;
      T01FE83_A396EmprCod = new String[] {""} ;
      T01FE83_n396EmprCod = new boolean[] {false} ;
      T01FE83_A1348SolColCod = new int[1] ;
      T01FE84_A396EmprCod = new String[] {""} ;
      T01FE84_n396EmprCod = new boolean[] {false} ;
      T01FE84_A1333EstDimCod = new int[1] ;
      T01FE85_A396EmprCod = new String[] {""} ;
      T01FE85_n396EmprCod = new boolean[] {false} ;
      T01FE85_A1314EnsLabCod = new int[1] ;
      T01FE86_A396EmprCod = new String[] {""} ;
      T01FE86_n396EmprCod = new boolean[] {false} ;
      T01FE86_A129BarCod = new int[1] ;
      T01FE86_n129BarCod = new boolean[] {false} ;
      T01FE86_A132BarCodReo = new byte[1] ;
      T01FE86_n132BarCodReo = new boolean[] {false} ;
      T01FE86_A130BarCodPar = new String[] {""} ;
      T01FE86_n130BarCodPar = new boolean[] {false} ;
      T01FE86_A906ObsReoLin = new byte[1] ;
      T01FE87_A396EmprCod = new String[] {""} ;
      T01FE87_n396EmprCod = new boolean[] {false} ;
      T01FE87_A859CumCodCont = new int[1] ;
      T01FE88_A396EmprCod = new String[] {""} ;
      T01FE88_n396EmprCod = new boolean[] {false} ;
      T01FE88_A602MaqCod = new String[] {""} ;
      T01FE88_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01FE88_A561HisProLin = new int[1] ;
      T01FE89_A396EmprCod = new String[] {""} ;
      T01FE89_n396EmprCod = new boolean[] {false} ;
      T01FE89_A252CliCod = new int[1] ;
      T01FE89_n252CliCod = new boolean[] {false} ;
      T01FE89_A494ForSer = new String[] {""} ;
      T01FE89_A482ForColNom = new String[] {""} ;
      T01FE89_A483ForColNum = new int[1] ;
      T01FE89_A831TipColCod = new byte[1] ;
      T01FE90_A396EmprCod = new String[] {""} ;
      T01FE90_n396EmprCod = new boolean[] {false} ;
      T01FE90_A129BarCod = new int[1] ;
      T01FE90_n129BarCod = new boolean[] {false} ;
      T01FE90_A132BarCodReo = new byte[1] ;
      T01FE90_n132BarCodReo = new boolean[] {false} ;
      T01FE90_A130BarCodPar = new String[] {""} ;
      T01FE90_n130BarCodPar = new boolean[] {false} ;
      T01FE90_A200BarPieCod = new String[] {""} ;
      T01FE91_A396EmprCod = new String[] {""} ;
      T01FE91_n396EmprCod = new boolean[] {false} ;
      T01FE91_A129BarCod = new int[1] ;
      T01FE91_n129BarCod = new boolean[] {false} ;
      T01FE91_A132BarCodReo = new byte[1] ;
      T01FE91_n132BarCodReo = new boolean[] {false} ;
      T01FE91_A130BarCodPar = new String[] {""} ;
      T01FE91_n130BarCodPar = new boolean[] {false} ;
      T01FE91_A188BarNotLin = new byte[1] ;
      T01FE92_A396EmprCod = new String[] {""} ;
      T01FE92_n396EmprCod = new boolean[] {false} ;
      T01FE92_A129BarCod = new int[1] ;
      T01FE92_n129BarCod = new boolean[] {false} ;
      T01FE92_A132BarCodReo = new byte[1] ;
      T01FE92_n132BarCodReo = new boolean[] {false} ;
      T01FE92_A130BarCodPar = new String[] {""} ;
      T01FE92_n130BarCodPar = new boolean[] {false} ;
      T01FE92_A758ProCod = new String[] {""} ;
      T01FE93_A396EmprCod = new String[] {""} ;
      T01FE93_n396EmprCod = new boolean[] {false} ;
      T01FE93_A129BarCod = new int[1] ;
      T01FE93_n129BarCod = new boolean[] {false} ;
      T01FE93_A132BarCodReo = new byte[1] ;
      T01FE93_n132BarCodReo = new boolean[] {false} ;
      T01FE93_A130BarCodPar = new String[] {""} ;
      T01FE93_n130BarCodPar = new boolean[] {false} ;
      T01FE93_A119BarAgrCod = new int[1] ;
      T01FE93_A124BarAgrReo = new byte[1] ;
      T01FE93_A122BarAgrPar = new String[] {""} ;
      T01FE95_A396EmprCod = new String[] {""} ;
      T01FE95_n396EmprCod = new boolean[] {false} ;
      T01FE95_A129BarCod = new int[1] ;
      T01FE95_n129BarCod = new boolean[] {false} ;
      T01FE95_A132BarCodReo = new byte[1] ;
      T01FE95_n132BarCodReo = new boolean[] {false} ;
      T01FE95_A130BarCodPar = new String[] {""} ;
      T01FE95_n130BarCodPar = new boolean[] {false} ;
      Z5006BarAudCant = "" ;
      Z5007BarAudPant = "" ;
      T01FE6_A5006BarAudCant = new String[] {""} ;
      T01FE6_n5006BarAudCant = new boolean[] {false} ;
      T01FE9_A5007BarAudPant = new String[] {""} ;
      T01FE9_n5007BarAudPant = new boolean[] {false} ;
      T01FE100_A129BarCod = new int[1] ;
      T01FE100_n129BarCod = new boolean[] {false} ;
      T01FE100_A132BarCodReo = new byte[1] ;
      T01FE100_n132BarCodReo = new boolean[] {false} ;
      T01FE100_A130BarCodPar = new String[] {""} ;
      T01FE100_n130BarCodPar = new boolean[] {false} ;
      T01FE100_A4846BarAudLin = new short[1] ;
      T01FE100_A4847BarAudPie = new String[] {""} ;
      T01FE100_n4847BarAudPie = new boolean[] {false} ;
      T01FE100_A4848BarAudMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE100_n4848BarAudMts = new boolean[] {false} ;
      T01FE100_A4849BarAudCar = new String[] {""} ;
      T01FE100_n4849BarAudCar = new boolean[] {false} ;
      T01FE100_A5000BarAudPar = new String[] {""} ;
      T01FE100_n5000BarAudPar = new boolean[] {false} ;
      T01FE100_A396EmprCod = new String[] {""} ;
      T01FE100_n396EmprCod = new boolean[] {false} ;
      T01FE100_A5006BarAudCant = new String[] {""} ;
      T01FE100_n5006BarAudCant = new boolean[] {false} ;
      T01FE100_A5007BarAudPant = new String[] {""} ;
      T01FE100_n5007BarAudPant = new boolean[] {false} ;
      T01FE101_A396EmprCod = new String[] {""} ;
      T01FE101_n396EmprCod = new boolean[] {false} ;
      T01FE101_A129BarCod = new int[1] ;
      T01FE101_n129BarCod = new boolean[] {false} ;
      T01FE101_A132BarCodReo = new byte[1] ;
      T01FE101_n132BarCodReo = new boolean[] {false} ;
      T01FE101_A130BarCodPar = new String[] {""} ;
      T01FE101_n130BarCodPar = new boolean[] {false} ;
      T01FE101_A4846BarAudLin = new short[1] ;
      T01FE3_A129BarCod = new int[1] ;
      T01FE3_n129BarCod = new boolean[] {false} ;
      T01FE3_A132BarCodReo = new byte[1] ;
      T01FE3_n132BarCodReo = new boolean[] {false} ;
      T01FE3_A130BarCodPar = new String[] {""} ;
      T01FE3_n130BarCodPar = new boolean[] {false} ;
      T01FE3_A4846BarAudLin = new short[1] ;
      T01FE3_A4847BarAudPie = new String[] {""} ;
      T01FE3_n4847BarAudPie = new boolean[] {false} ;
      T01FE3_A4848BarAudMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE3_n4848BarAudMts = new boolean[] {false} ;
      T01FE3_A4849BarAudCar = new String[] {""} ;
      T01FE3_n4849BarAudCar = new boolean[] {false} ;
      T01FE3_A5000BarAudPar = new String[] {""} ;
      T01FE3_n5000BarAudPar = new boolean[] {false} ;
      T01FE3_A396EmprCod = new String[] {""} ;
      T01FE3_n396EmprCod = new boolean[] {false} ;
      T01FE2_A129BarCod = new int[1] ;
      T01FE2_n129BarCod = new boolean[] {false} ;
      T01FE2_A132BarCodReo = new byte[1] ;
      T01FE2_n132BarCodReo = new boolean[] {false} ;
      T01FE2_A130BarCodPar = new String[] {""} ;
      T01FE2_n130BarCodPar = new boolean[] {false} ;
      T01FE2_A4846BarAudLin = new short[1] ;
      T01FE2_A4847BarAudPie = new String[] {""} ;
      T01FE2_n4847BarAudPie = new boolean[] {false} ;
      T01FE2_A4848BarAudMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE2_n4848BarAudMts = new boolean[] {false} ;
      T01FE2_A4849BarAudCar = new String[] {""} ;
      T01FE2_n4849BarAudCar = new boolean[] {false} ;
      T01FE2_A5000BarAudPar = new String[] {""} ;
      T01FE2_n5000BarAudPar = new boolean[] {false} ;
      T01FE2_A396EmprCod = new String[] {""} ;
      T01FE2_n396EmprCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      T01FE105_A396EmprCod = new String[] {""} ;
      T01FE105_n396EmprCod = new boolean[] {false} ;
      T01FE105_A129BarCod = new int[1] ;
      T01FE105_n129BarCod = new boolean[] {false} ;
      T01FE105_A132BarCodReo = new byte[1] ;
      T01FE105_n132BarCodReo = new boolean[] {false} ;
      T01FE105_A130BarCodPar = new String[] {""} ;
      T01FE105_n130BarCodPar = new boolean[] {false} ;
      T01FE105_A4846BarAudLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FE106_A407EmprNom = new String[] {""} ;
      T01FE106_n407EmprNom = new boolean[] {false} ;
      T01FE108_A898BarPieNDes = new int[1] ;
      T01FE108_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE108_A199BarPie1 = new short[1] ;
      T01FE110_A4839BarAudMTab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FE110_n4839BarAudMTab = new boolean[] {false} ;
      Z4843BarAudMDC = DecimalUtil.ZERO ;
      Z4842BarAudMDD = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ143BarDisNum = "" ;
      ZZ155BarFecCli = GXutil.nullDate() ;
      ZZ212BarSer = "" ;
      ZZ1652BarSerDsc = "" ;
      ZZ1798BarDibCli = "" ;
      ZZ135BarColNom = "" ;
      ZZ120BarAgrEst = "" ;
      ZZ4016BarTin = "" ;
      ZZ2010BarTipDis = "" ;
      ZZ407EmprNom = "" ;
      ZZ4832BarAudFec = GXutil.nullDate() ;
      ZZ4835BarAudOpeN = "" ;
      ZZ4837BarAudSupN = "" ;
      ZZ4839BarAudMTab = DecimalUtil.ZERO ;
      ZZ4840BarAudMDig = DecimalUtil.ZERO ;
      ZZ4841BarAudMCue = DecimalUtil.ZERO ;
      ZZ4845BarAudObs = "" ;
      ZZ184BarMtr = DecimalUtil.ZERO ;
      ZZ365DisDes = "" ;
      ZZ279CliNom = "" ;
      ZZ4843BarAudMDC = DecimalUtil.ZERO ;
      ZZ4842BarAudMDD = DecimalUtil.ZERO ;
      ZO4839BarAudMTab = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbaraud__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbaraud__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbaraud__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbaraud__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbaraud__default(),
         new Object[] {
             new Object[] {
            T01FE2_A129BarCod, T01FE2_A132BarCodReo, T01FE2_A130BarCodPar, T01FE2_A4846BarAudLin, T01FE2_A4847BarAudPie, T01FE2_n4847BarAudPie, T01FE2_A4848BarAudMts, T01FE2_n4848BarAudMts, T01FE2_A4849BarAudCar, T01FE2_n4849BarAudCar,
            T01FE2_A5000BarAudPar, T01FE2_n5000BarAudPar, T01FE2_A396EmprCod
            }
            , new Object[] {
            T01FE3_A129BarCod, T01FE3_A132BarCodReo, T01FE3_A130BarCodPar, T01FE3_A4846BarAudLin, T01FE3_A4847BarAudPie, T01FE3_n4847BarAudPie, T01FE3_A4848BarAudMts, T01FE3_n4848BarAudMts, T01FE3_A4849BarAudCar, T01FE3_n4849BarAudCar,
            T01FE3_A5000BarAudPar, T01FE3_n5000BarAudPar, T01FE3_A396EmprCod
            }
            , new Object[] {
            T01FE6_A5006BarAudCant, T01FE6_n5006BarAudCant
            }
            , new Object[] {
            T01FE9_A5007BarAudPant, T01FE9_n5007BarAudPant
            }
            , new Object[] {
            T01FE10_A2759BarMaqGru, T01FE10_A129BarCod, T01FE10_A132BarCodReo, T01FE10_A130BarCodPar, T01FE10_A180BarMaqCod, T01FE10_A143BarDisNum, T01FE10_A155BarFecCli, T01FE10_A212BarSer, T01FE10_A1652BarSerDsc, T01FE10_A1798BarDibCli,
            T01FE10_A1799BarDibInt, T01FE10_A135BarColNom, T01FE10_A136BarColNum, T01FE10_A218BarTipCol, T01FE10_A213BarSit, T01FE10_A120BarAgrEst, T01FE10_A4016BarTin, T01FE10_A2010BarTipDis, T01FE10_A4832BarAudFec, T01FE10_n4832BarAudFec,
            T01FE10_A4833BarAudTur, T01FE10_n4833BarAudTur, T01FE10_A4834BarAudOpe, T01FE10_n4834BarAudOpe, T01FE10_A4835BarAudOpeN, T01FE10_n4835BarAudOpeN, T01FE10_A4836BarAudSup, T01FE10_A4837BarAudSupN, T01FE10_n4837BarAudSupN, T01FE10_A4838BarAudNPz,
            T01FE10_n4838BarAudNPz, T01FE10_A4840BarAudMDig, T01FE10_n4840BarAudMDig, T01FE10_A4841BarAudMCue, T01FE10_n4841BarAudMCue, T01FE10_A4844BarAudULin, T01FE10_n4844BarAudULin, T01FE10_A4845BarAudObs, T01FE10_n4845BarAudObs, T01FE10_A396EmprCod,
            T01FE10_A361DisCod, T01FE10_A252CliCod, T01FE10_n252CliCod, T01FE10_A365DisDes
            }
            , new Object[] {
            T01FE11_A2759BarMaqGru, T01FE11_A129BarCod, T01FE11_A132BarCodReo, T01FE11_A130BarCodPar, T01FE11_A180BarMaqCod, T01FE11_A143BarDisNum, T01FE11_A155BarFecCli, T01FE11_A212BarSer, T01FE11_A1652BarSerDsc, T01FE11_A1798BarDibCli,
            T01FE11_A1799BarDibInt, T01FE11_A135BarColNom, T01FE11_A136BarColNum, T01FE11_A218BarTipCol, T01FE11_A213BarSit, T01FE11_A120BarAgrEst, T01FE11_A4016BarTin, T01FE11_A2010BarTipDis, T01FE11_A4832BarAudFec, T01FE11_n4832BarAudFec,
            T01FE11_A4833BarAudTur, T01FE11_n4833BarAudTur, T01FE11_A4834BarAudOpe, T01FE11_n4834BarAudOpe, T01FE11_A4835BarAudOpeN, T01FE11_n4835BarAudOpeN, T01FE11_A4836BarAudSup, T01FE11_A4837BarAudSupN, T01FE11_n4837BarAudSupN, T01FE11_A4838BarAudNPz,
            T01FE11_n4838BarAudNPz, T01FE11_A4840BarAudMDig, T01FE11_n4840BarAudMDig, T01FE11_A4841BarAudMCue, T01FE11_n4841BarAudMCue, T01FE11_A4844BarAudULin, T01FE11_n4844BarAudULin, T01FE11_A4845BarAudObs, T01FE11_n4845BarAudObs, T01FE11_A396EmprCod,
            T01FE11_A361DisCod, T01FE11_A252CliCod, T01FE11_n252CliCod, T01FE11_A365DisDes
            }
            , new Object[] {
            T01FE12_A407EmprNom, T01FE12_n407EmprNom
            }
            , new Object[] {
            T01FE13_A252CliCod, T01FE13_A365DisDes
            }
            , new Object[] {
            T01FE14_A279CliNom
            }
            , new Object[] {
            T01FE16_A898BarPieNDes, T01FE16_A184BarMtr, T01FE16_A199BarPie1
            }
            , new Object[] {
            T01FE18_A4839BarAudMTab, T01FE18_n4839BarAudMTab
            }
            , new Object[] {
            T01FE21_A2759BarMaqGru, T01FE21_A129BarCod, T01FE21_A132BarCodReo, T01FE21_A130BarCodPar, T01FE21_A180BarMaqCod, T01FE21_A143BarDisNum, T01FE21_A155BarFecCli, T01FE21_A252CliCod, T01FE21_n252CliCod, T01FE21_A279CliNom,
            T01FE21_A212BarSer, T01FE21_A1652BarSerDsc, T01FE21_A1798BarDibCli, T01FE21_A1799BarDibInt, T01FE21_A135BarColNom, T01FE21_A136BarColNum, T01FE21_A218BarTipCol, T01FE21_A213BarSit, T01FE21_A120BarAgrEst, T01FE21_A4016BarTin,
            T01FE21_A2010BarTipDis, T01FE21_A407EmprNom, T01FE21_n407EmprNom, T01FE21_A4832BarAudFec, T01FE21_n4832BarAudFec, T01FE21_A4833BarAudTur, T01FE21_n4833BarAudTur, T01FE21_A4834BarAudOpe, T01FE21_n4834BarAudOpe, T01FE21_A4835BarAudOpeN,
            T01FE21_n4835BarAudOpeN, T01FE21_A4836BarAudSup, T01FE21_A4837BarAudSupN, T01FE21_n4837BarAudSupN, T01FE21_A4838BarAudNPz, T01FE21_n4838BarAudNPz, T01FE21_A4840BarAudMDig, T01FE21_n4840BarAudMDig, T01FE21_A4841BarAudMCue, T01FE21_n4841BarAudMCue,
            T01FE21_A4844BarAudULin, T01FE21_n4844BarAudULin, T01FE21_A4845BarAudObs, T01FE21_n4845BarAudObs, T01FE21_A365DisDes, T01FE21_A396EmprCod, T01FE21_A361DisCod, T01FE21_A898BarPieNDes, T01FE21_A4839BarAudMTab, T01FE21_n4839BarAudMTab,
            T01FE21_A184BarMtr, T01FE21_A199BarPie1
            }
            , new Object[] {
            T01FE22_A252CliCod, T01FE22_A365DisDes
            }
            , new Object[] {
            T01FE23_A279CliNom
            }
            , new Object[] {
            T01FE24_A396EmprCod, T01FE24_A129BarCod, T01FE24_A132BarCodReo, T01FE24_A130BarCodPar
            }
            , new Object[] {
            T01FE25_A396EmprCod, T01FE25_A129BarCod, T01FE25_A132BarCodReo, T01FE25_A130BarCodPar
            }
            , new Object[] {
            T01FE26_A396EmprCod, T01FE26_A129BarCod, T01FE26_A132BarCodReo, T01FE26_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FE30_A252CliCod, T01FE30_A365DisDes
            }
            , new Object[] {
            T01FE31_A279CliNom
            }
            , new Object[] {
            T01FE32_A14681MRPrId
            }
            , new Object[] {
            T01FE33_A5921XCjaDis, T01FE33_A5922XCjaCod
            }
            , new Object[] {
            T01FE34_A396EmprCod, T01FE34_A129BarCod, T01FE34_A132BarCodReo, T01FE34_A130BarCodPar, T01FE34_A14152MEnvOrd
            }
            , new Object[] {
            T01FE35_A396EmprCod, T01FE35_A129BarCod, T01FE35_A132BarCodReo, T01FE35_A130BarCodPar, T01FE35_A13905BarTraID
            }
            , new Object[] {
            T01FE36_A396EmprCod, T01FE36_A129BarCod, T01FE36_A132BarCodReo, T01FE36_A130BarCodPar, T01FE36_A13093BarDGLin, T01FE36_A13094BarDGDibCl, T01FE36_A13095BarDGDibIn, T01FE36_A13096BarDGComb, T01FE36_A13097BarDGFOndo
            }
            , new Object[] {
            T01FE37_A396EmprCod, T01FE37_A11917Ebd_numero
            }
            , new Object[] {
            T01FE38_A396EmprCod, T01FE38_A11898Prd_numero
            }
            , new Object[] {
            T01FE39_A396EmprCod, T01FE39_A11849Cte_numero
            }
            , new Object[] {
            T01FE40_A396EmprCod, T01FE40_A11791Ap_numero
            }
            , new Object[] {
            T01FE41_A396EmprCod, T01FE41_A3985CalBarCod, T01FE41_A3986CalBarCodR, T01FE41_A3987CalBarCodP
            }
            , new Object[] {
            T01FE42_A396EmprCod, T01FE42_A5294InPTime, T01FE42_A652OpeCod
            }
            , new Object[] {
            T01FE43_A396EmprCod, T01FE43_A129BarCod, T01FE43_A132BarCodReo, T01FE43_A130BarCodPar, T01FE43_A4118tinagrcod, T01FE43_A4119tinagrreo, T01FE43_A4120tinagrpar
            }
            , new Object[] {
            T01FE44_A396EmprCod, T01FE44_A129BarCod, T01FE44_A132BarCodReo, T01FE44_A130BarCodPar, T01FE44_A4080estagrcod, T01FE44_A4081estagrreo, T01FE44_A4082estagrpar
            }
            , new Object[] {
            T01FE45_A396EmprCod, T01FE45_A129BarCod, T01FE45_A132BarCodReo, T01FE45_A130BarCodPar, T01FE45_A4075recestncol, T01FE45_A4076recestnpro
            }
            , new Object[] {
            T01FE46_A396EmprCod, T01FE46_A602MaqCod, T01FE46_A1142MaqFCod, T01FE46_A3068PlaEtaOrd, T01FE46_A3069PlaEtaOrdA, T01FE46_A129BarCod, T01FE46_A132BarCodReo, T01FE46_A130BarCodPar
            }
            , new Object[] {
            T01FE47_A396EmprCod, T01FE47_A129BarCod, T01FE47_A132BarCodReo, T01FE47_A130BarCodPar, T01FE47_A3940BarEnsLin
            }
            , new Object[] {
            T01FE48_A396EmprCod, T01FE48_A129BarCod, T01FE48_A132BarCodReo, T01FE48_A130BarCodPar, T01FE48_A3384RefBarCod, T01FE48_A3385RefBarReo, T01FE48_A3386RefBarPar
            }
            , new Object[] {
            T01FE49_A396EmprCod, T01FE49_A10914SolSalCod
            }
            , new Object[] {
            T01FE50_A396EmprCod, T01FE50_A10364Ph_numero
            }
            , new Object[] {
            T01FE51_A396EmprCod, T01FE51_A129BarCod, T01FE51_A132BarCodReo, T01FE51_A130BarCodPar, T01FE51_A10197ProEspCod
            }
            , new Object[] {
            T01FE52_A396EmprCod, T01FE52_A129BarCod, T01FE52_A132BarCodReo, T01FE52_A130BarCodPar, T01FE52_A5322Dp_Nrecep
            }
            , new Object[] {
            T01FE53_A396EmprCod, T01FE53_A129BarCod, T01FE53_A132BarCodReo, T01FE53_A130BarCodPar, T01FE53_A8569EntSecLn
            }
            , new Object[] {
            T01FE54_A396EmprCod, T01FE54_A7434PLLNro, T01FE54_A7443LPLNro, T01FE54_A7459CPLCom, T01FE54_A129BarCod, T01FE54_A132BarCodReo, T01FE54_A130BarCodPar
            }
            , new Object[] {
            T01FE55_A396EmprCod, T01FE55_A7145OSSCod
            }
            , new Object[] {
            T01FE56_A396EmprCod, T01FE56_A7049OGSCod
            }
            , new Object[] {
            T01FE57_A396EmprCod, T01FE57_A129BarCod, T01FE57_A132BarCodReo, T01FE57_A130BarCodPar, T01FE57_A6031Ac_Barcod, T01FE57_A6032Ac_BarReo, T01FE57_A6033Ac_BarPar
            }
            , new Object[] {
            T01FE58_A396EmprCod, T01FE58_A129BarCod, T01FE58_A132BarCodReo, T01FE58_A130BarCodPar, T01FE58_A5908PartPal
            }
            , new Object[] {
            T01FE59_A396EmprCod, T01FE59_A129BarCod, T01FE59_A132BarCodReo, T01FE59_A130BarCodPar, T01FE59_A2524DisComLin, T01FE59_A1056DisComCod, T01FE59_A1032FonCod
            }
            , new Object[] {
            T01FE60_A396EmprCod, T01FE60_A1736AlbExtCod, T01FE60_A129BarCod, T01FE60_A132BarCodReo, T01FE60_A130BarCodPar
            }
            , new Object[] {
            T01FE61_A396EmprCod, T01FE61_A129BarCod, T01FE61_A132BarCodReo, T01FE61_A130BarCodPar, T01FE61_A3753BarFoaCod, T01FE61_A3754BarFoaReo, T01FE61_A3755BarFoaPar
            }
            , new Object[] {
            T01FE62_A396EmprCod, T01FE62_A129BarCod, T01FE62_A132BarCodReo, T01FE62_A130BarCodPar, T01FE62_A3747BarPegCod, T01FE62_A3748BarPegReo, T01FE62_A3749BarPegPar
            }
            , new Object[] {
            T01FE63_A396EmprCod, T01FE63_A3253SolTraCod
            }
            , new Object[] {
            T01FE64_A396EmprCod, T01FE64_A3235SolSubCod
            }
            , new Object[] {
            T01FE65_A396EmprCod, T01FE65_A3218SolLuzCod
            }
            , new Object[] {
            T01FE66_A396EmprCod, T01FE66_A3196SolFriCod
            }
            , new Object[] {
            T01FE67_A396EmprCod, T01FE67_A3165SolPilCod
            }
            , new Object[] {
            T01FE68_A396EmprCod, T01FE68_A129BarCod, T01FE68_A132BarCodReo, T01FE68_A130BarCodPar, T01FE68_A2872HAnRLinMaq, T01FE68_A2873HAnRLinPro, T01FE68_A2874HAnRLin, T01FE68_A2875HAnNumAny
            }
            , new Object[] {
            T01FE69_A396EmprCod, T01FE69_A2817PlaTer, T01FE69_A2818PlaOrd
            }
            , new Object[] {
            T01FE70_A396EmprCod, T01FE70_A2809MetTerCod, T01FE70_A129BarCod, T01FE70_A132BarCodReo, T01FE70_A130BarCodPar
            }
            , new Object[] {
            T01FE71_A396EmprCod, T01FE71_A129BarCod, T01FE71_A132BarCodReo, T01FE71_A130BarCodPar, T01FE71_A2808RecLinMAL, T01FE71_A1377RecNumAny, T01FE71_A719PrdNum
            }
            , new Object[] {
            T01FE72_A396EmprCod, T01FE72_A129BarCod, T01FE72_A132BarCodReo, T01FE72_A130BarCodPar, T01FE72_A2804RecLinMaq
            }
            , new Object[] {
            T01FE73_A396EmprCod, T01FE73_A2792TermiCod, T01FE73_A129BarCod, T01FE73_A132BarCodReo, T01FE73_A130BarCodPar
            }
            , new Object[] {
            T01FE74_A396EmprCod, T01FE74_A2248ManCod, T01FE74_A2711RpExHdFe, T01FE74_A2713RpExHdLi
            }
            , new Object[] {
            T01FE75_A396EmprCod, T01FE75_A2248ManCod, T01FE75_A2689ExHdrFas, T01FE75_A2692ExHdrLin
            }
            , new Object[] {
            T01FE76_A396EmprCod, T01FE76_A129BarCod, T01FE76_A132BarCodReo, T01FE76_A130BarCodPar, T01FE76_A2494BarDosPro, T01FE76_A719PrdNum
            }
            , new Object[] {
            T01FE77_A396EmprCod, T01FE77_A602MaqCod, T01FE77_A2461PlaFecTin, T01FE77_A129BarCod, T01FE77_A132BarCodReo, T01FE77_A130BarCodPar
            }
            , new Object[] {
            T01FE78_A396EmprCod, T01FE78_A129BarCod, T01FE78_A132BarCodReo, T01FE78_A130BarCodPar, T01FE78_A2457BarObLin
            }
            , new Object[] {
            T01FE79_A396EmprCod, T01FE79_A129BarCod, T01FE79_A132BarCodReo, T01FE79_A130BarCodPar, T01FE79_A2444BarEnLin
            }
            , new Object[] {
            T01FE80_A396EmprCod, T01FE80_A2406ExhAlbCod, T01FE80_A129BarCod, T01FE80_A132BarCodReo, T01FE80_A130BarCodPar
            }
            , new Object[] {
            T01FE81_A396EmprCod, T01FE81_A2253SalExtAlb, T01FE81_A129BarCod, T01FE81_A132BarCodReo, T01FE81_A130BarCodPar
            }
            , new Object[] {
            T01FE82_A396EmprCod, T01FE82_A30AlbProCod, T01FE82_A129BarCod, T01FE82_A132BarCodReo, T01FE82_A130BarCodPar
            }
            , new Object[] {
            T01FE83_A396EmprCod, T01FE83_A1348SolColCod
            }
            , new Object[] {
            T01FE84_A396EmprCod, T01FE84_A1333EstDimCod
            }
            , new Object[] {
            T01FE85_A396EmprCod, T01FE85_A1314EnsLabCod
            }
            , new Object[] {
            T01FE86_A396EmprCod, T01FE86_A129BarCod, T01FE86_A132BarCodReo, T01FE86_A130BarCodPar, T01FE86_A906ObsReoLin
            }
            , new Object[] {
            T01FE87_A396EmprCod, T01FE87_A859CumCodCont
            }
            , new Object[] {
            T01FE88_A396EmprCod, T01FE88_A602MaqCod, T01FE88_A558HisProFec, T01FE88_A561HisProLin
            }
            , new Object[] {
            T01FE89_A396EmprCod, T01FE89_A252CliCod, T01FE89_A494ForSer, T01FE89_A482ForColNom, T01FE89_A483ForColNum, T01FE89_A831TipColCod
            }
            , new Object[] {
            T01FE90_A396EmprCod, T01FE90_A129BarCod, T01FE90_A132BarCodReo, T01FE90_A130BarCodPar, T01FE90_A200BarPieCod
            }
            , new Object[] {
            T01FE91_A396EmprCod, T01FE91_A129BarCod, T01FE91_A132BarCodReo, T01FE91_A130BarCodPar, T01FE91_A188BarNotLin
            }
            , new Object[] {
            T01FE92_A396EmprCod, T01FE92_A129BarCod, T01FE92_A132BarCodReo, T01FE92_A130BarCodPar, T01FE92_A758ProCod
            }
            , new Object[] {
            T01FE93_A396EmprCod, T01FE93_A129BarCod, T01FE93_A132BarCodReo, T01FE93_A130BarCodPar, T01FE93_A119BarAgrCod, T01FE93_A124BarAgrReo, T01FE93_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01FE95_A396EmprCod, T01FE95_A129BarCod, T01FE95_A132BarCodReo, T01FE95_A130BarCodPar
            }
            , new Object[] {
            T01FE100_A129BarCod, T01FE100_A132BarCodReo, T01FE100_A130BarCodPar, T01FE100_A4846BarAudLin, T01FE100_A4847BarAudPie, T01FE100_n4847BarAudPie, T01FE100_A4848BarAudMts, T01FE100_n4848BarAudMts, T01FE100_A4849BarAudCar, T01FE100_n4849BarAudCar,
            T01FE100_A5000BarAudPar, T01FE100_n5000BarAudPar, T01FE100_A396EmprCod, T01FE100_A5006BarAudCant, T01FE100_n5006BarAudCant, T01FE100_A5007BarAudPant, T01FE100_n5007BarAudPant
            }
            , new Object[] {
            T01FE101_A396EmprCod, T01FE101_A129BarCod, T01FE101_A132BarCodReo, T01FE101_A130BarCodPar, T01FE101_A4846BarAudLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FE105_A396EmprCod, T01FE105_A129BarCod, T01FE105_A132BarCodReo, T01FE105_A130BarCodPar, T01FE105_A4846BarAudLin
            }
            , new Object[] {
            T01FE106_A407EmprNom, T01FE106_n407EmprNom
            }
            , new Object[] {
            T01FE108_A898BarPieNDes, T01FE108_A184BarMtr, T01FE108_A199BarPie1
            }
            , new Object[] {
            T01FE110_A4839BarAudMTab, T01FE110_n4839BarAudMTab
            }
         }
      );
      Z130BarCodPar = "" ;
      n130BarCodPar = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      Z132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      Z129BarCod = 0 ;
      n129BarCod = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
   }

   private byte wcpOA132BarCodReo ;
   private byte wcpOAV49BarAudTur ;
   private byte Z132BarCodReo ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Z4833BarAudTur ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV49BarAudTur ;
   private byte nKeyPressed ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A4833BarAudTur ;
   private byte A5003BarAudReoV ;
   private byte Gx_BScreen ;
   private byte GXv_int3[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ218BarTipCol ;
   private byte ZZ213BarSit ;
   private byte ZZ4833BarAudTur ;
   private short Z4838BarAudNPz ;
   private short Z4844BarAudULin ;
   private short Z4846BarAudLin ;
   private short nRcdDeleted_1567 ;
   private short nRcdExists_1567 ;
   private short nIsMod_1567 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4838BarAudNPz ;
   private short A4844BarAudULin ;
   private short nBlankRcdCount1567 ;
   private short RcdFound1567 ;
   private short nBlankRcdUsr1567 ;
   private short A199BarPie1 ;
   private short A4846BarAudLin ;
   private short A5005BarAudLinV ;
   private short Z199BarPie1 ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_1567 ;
   private short ZZ4838BarAudNPz ;
   private short ZZ4844BarAudULin ;
   private short ZZ199BarPie1 ;
   private int wcpOA129BarCod ;
   private int wcpOAV50BarAudOpe ;
   private int wcpOAV51BarAudSup ;
   private int Z129BarCod ;
   private int Z1799BarDibInt ;
   private int Z136BarColNum ;
   private int Z4834BarAudOpe ;
   private int Z4836BarAudSup ;
   private int Z361DisCod ;
   private int nRC_GXsfl_210 ;
   private int nGXsfl_210_idx=1 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV50BarAudOpe ;
   private int AV51BarAudSup ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtBarFecCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarDibCli_Enabled ;
   private int A1799BarDibInt ;
   private int edtBarDibInt_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtDisCod_Enabled ;
   private int edtBarSit_Enabled ;
   private int A898BarPieNDes ;
   private int edtBarPieNDes_Enabled ;
   private int edtBarAgrEst_Enabled ;
   private int edtBarTipDis_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarAudFec_Enabled ;
   private int edtBarAudTur_Enabled ;
   private int A4834BarAudOpe ;
   private int edtBarAudOpe_Enabled ;
   private int edtBarAudOpeN_Enabled ;
   private int A4836BarAudSup ;
   private int edtBarAudSup_Enabled ;
   private int edtBarAudSupN_Enabled ;
   private int edtBarAudNPz_Enabled ;
   private int edtBarAudMTab_Enabled ;
   private int edtBarAudMDig_Enabled ;
   private int edtBarAudMCue_Enabled ;
   private int edtBarAudMDD_Enabled ;
   private int edtBarAudMDC_Enabled ;
   private int edtBarAudULin_Enabled ;
   private int edtBarAudObs_Enabled ;
   private int edtBarMtr_Enabled ;
   private int A198BarPie ;
   private int edtBarPie_Enabled ;
   private int edtavnRcdDeleted_1567_Enabled ;
   private int edtBarAudLin_Enabled ;
   private int edtBarAudPie_Enabled ;
   private int edtBarAudMts_Enabled ;
   private int edtBarAudCar_Enabled ;
   private int edtBarAudPar_Enabled ;
   private int edtBarAudEmpV_Enabled ;
   private int edtBarAudBarV_Enabled ;
   private int edtBarAudReoV_Enabled ;
   private int edtBarAudParV_Enabled ;
   private int edtBarAudLinV_Enabled ;
   private int edtBarAudCant_Enabled ;
   private int edtBarAudPant_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A5002BarAudBarV ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarAudLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarPie_Backcolor ;
   private int edtBarMtr_Backcolor ;
   private int edtBarAudObs_Backcolor ;
   private int edtBarAudULin_Backcolor ;
   private int edtBarAudMDC_Backcolor ;
   private int edtBarAudMDD_Backcolor ;
   private int edtBarAudMCue_Backcolor ;
   private int edtBarAudMDig_Backcolor ;
   private int edtBarAudMTab_Backcolor ;
   private int edtBarAudNPz_Backcolor ;
   private int edtBarAudSupN_Backcolor ;
   private int edtBarAudSup_Backcolor ;
   private int edtBarAudOpeN_Backcolor ;
   private int edtBarAudOpe_Backcolor ;
   private int edtBarAudTur_Backcolor ;
   private int edtBarAudFec_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarTipDis_Backcolor ;
   private int edtBarAgrEst_Backcolor ;
   private int edtBarPieNDes_Backcolor ;
   private int edtBarSit_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarDibInt_Backcolor ;
   private int edtBarDibCli_Backcolor ;
   private int edtBarSerDsc_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtBarFecCli_Backcolor ;
   private int edtBarDisNum_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z198BarPie ;
   private int ZZ129BarCod ;
   private int ZZ1799BarDibInt ;
   private int ZZ136BarColNum ;
   private int ZZ361DisCod ;
   private int ZZ898BarPieNDes ;
   private int ZZ4834BarAudOpe ;
   private int ZZ4836BarAudSup ;
   private int ZZ252CliCod ;
   private int ZZ198BarPie ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4840BarAudMDig ;
   private java.math.BigDecimal Z4841BarAudMCue ;
   private java.math.BigDecimal O4839BarAudMTab ;
   private java.math.BigDecimal Z4848BarAudMts ;
   private java.math.BigDecimal O4848BarAudMts ;
   private java.math.BigDecimal A4839BarAudMTab ;
   private java.math.BigDecimal A4840BarAudMDig ;
   private java.math.BigDecimal A4841BarAudMCue ;
   private java.math.BigDecimal A4842BarAudMDD ;
   private java.math.BigDecimal A4843BarAudMDC ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal B4839BarAudMTab ;
   private java.math.BigDecimal s4839BarAudMTab ;
   private java.math.BigDecimal s4842BarAudMDD ;
   private java.math.BigDecimal O4842BarAudMDD ;
   private java.math.BigDecimal s4843BarAudMDC ;
   private java.math.BigDecimal O4843BarAudMDC ;
   private java.math.BigDecimal A4848BarAudMts ;
   private java.math.BigDecimal T4848BarAudMts ;
   private java.math.BigDecimal Z184BarMtr ;
   private java.math.BigDecimal Z4839BarAudMTab ;
   private java.math.BigDecimal Z4843BarAudMDC ;
   private java.math.BigDecimal Z4842BarAudMDD ;
   private java.math.BigDecimal ZZ4839BarAudMTab ;
   private java.math.BigDecimal ZZ4840BarAudMDig ;
   private java.math.BigDecimal ZZ4841BarAudMCue ;
   private java.math.BigDecimal ZZ184BarMtr ;
   private java.math.BigDecimal ZZ4843BarAudMDC ;
   private java.math.BigDecimal ZZ4842BarAudMDD ;
   private java.math.BigDecimal ZO4839BarAudMTab ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOAV52BarAudOpeN ;
   private String wcpOAV53BarAudSupN ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z143BarDisNum ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z1798BarDibCli ;
   private String Z135BarColNom ;
   private String Z120BarAgrEst ;
   private String Z4016BarTin ;
   private String Z2010BarTipDis ;
   private String Z4835BarAudOpeN ;
   private String Z4837BarAudSupN ;
   private String Z4847BarAudPie ;
   private String Z4849BarAudCar ;
   private String Z5000BarAudPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV52BarAudOpeN ;
   private String AV53BarAudSupN ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarDisNum_Internalname ;
   private String sGXsfl_210_idx="0001" ;
   private String Gx_mode ;
   private String A4016BarTin ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecCli_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarDibCli_Internalname ;
   private String A1798BarDibCli ;
   private String edtBarDibCli_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarDibInt_Internalname ;
   private String edtBarDibInt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarPieNDes_Internalname ;
   private String edtBarPieNDes_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtBarTipDis_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtBarAudFec_Internalname ;
   private String edtBarAudFec_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtBarAudTur_Internalname ;
   private String edtBarAudTur_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtBarAudOpe_Internalname ;
   private String edtBarAudOpe_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtBarAudOpeN_Internalname ;
   private String A4835BarAudOpeN ;
   private String edtBarAudOpeN_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtBarAudSup_Internalname ;
   private String edtBarAudSup_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtBarAudSupN_Internalname ;
   private String A4837BarAudSupN ;
   private String edtBarAudSupN_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtBarAudNPz_Internalname ;
   private String edtBarAudNPz_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtBarAudMTab_Internalname ;
   private String edtBarAudMTab_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtBarAudMDig_Internalname ;
   private String edtBarAudMDig_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtBarAudMCue_Internalname ;
   private String edtBarAudMCue_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtBarAudMDD_Internalname ;
   private String edtBarAudMDD_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtBarAudMDC_Internalname ;
   private String edtBarAudMDC_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtBarAudULin_Internalname ;
   private String edtBarAudULin_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtBarAudObs_Internalname ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtBarMtr_Internalname ;
   private String edtBarMtr_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtBarPie_Internalname ;
   private String edtBarPie_Jsonclick ;
   private String sMode1567 ;
   private String edtavnRcdDeleted_1567_Internalname ;
   private String edtBarAudLin_Internalname ;
   private String edtBarAudPie_Internalname ;
   private String edtBarAudMts_Internalname ;
   private String edtBarAudCar_Internalname ;
   private String edtBarAudPar_Internalname ;
   private String edtBarAudEmpV_Internalname ;
   private String edtBarAudBarV_Internalname ;
   private String edtBarAudReoV_Internalname ;
   private String edtBarAudParV_Internalname ;
   private String edtBarAudLinV_Internalname ;
   private String edtBarAudCant_Internalname ;
   private String edtBarAudPant_Internalname ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A4847BarAudPie ;
   private String A4849BarAudCar ;
   private String A5000BarAudPar ;
   private String A5001BarAudEmpV ;
   private String A5004BarAudParV ;
   private String A5006BarAudCant ;
   private String A5007BarAudPant ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z5006BarAudCant ;
   private String Z5007BarAudPant ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String sGXsfl_210_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1567_Jsonclick ;
   private String edtBarAudLin_Jsonclick ;
   private String edtBarAudPie_Jsonclick ;
   private String edtBarAudMts_Jsonclick ;
   private String edtBarAudCar_Jsonclick ;
   private String edtBarAudPar_Jsonclick ;
   private String edtBarAudEmpV_Jsonclick ;
   private String edtBarAudBarV_Jsonclick ;
   private String edtBarAudReoV_Jsonclick ;
   private String edtBarAudParV_Jsonclick ;
   private String edtBarAudLinV_Jsonclick ;
   private String edtBarAudCant_Jsonclick ;
   private String edtBarAudPant_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ143BarDisNum ;
   private String ZZ212BarSer ;
   private String ZZ1652BarSerDsc ;
   private String ZZ1798BarDibCli ;
   private String ZZ135BarColNom ;
   private String ZZ120BarAgrEst ;
   private String ZZ4016BarTin ;
   private String ZZ2010BarTipDis ;
   private String ZZ407EmprNom ;
   private String ZZ4835BarAudOpeN ;
   private String ZZ4837BarAudSupN ;
   private String ZZ365DisDes ;
   private String ZZ279CliNom ;
   private java.util.Date wcpOAV54BarAudFec ;
   private java.util.Date Z155BarFecCli ;
   private java.util.Date Z4832BarAudFec ;
   private java.util.Date AV54BarAudFec ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A4832BarAudFec ;
   private java.util.Date ZZ155BarFecCli ;
   private java.util.Date ZZ4832BarAudFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n252CliCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean n4839BarAudMTab ;
   private boolean bGXsfl_210_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4832BarAudFec ;
   private boolean n4833BarAudTur ;
   private boolean n4834BarAudOpe ;
   private boolean n4835BarAudOpeN ;
   private boolean n4837BarAudSupN ;
   private boolean n4838BarAudNPz ;
   private boolean n4840BarAudMDig ;
   private boolean n4841BarAudMCue ;
   private boolean n4844BarAudULin ;
   private boolean n4845BarAudObs ;
   private boolean Gx_longc ;
   private boolean n5006BarAudCant ;
   private boolean n5007BarAudPant ;
   private boolean n4847BarAudPie ;
   private boolean n4848BarAudMts ;
   private boolean n4849BarAudCar ;
   private boolean n5000BarAudPar ;
   private String Z4845BarAudObs ;
   private String A4845BarAudObs ;
   private String ZZ4845BarAudObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkBarTin ;
   private IDataStoreProvider pr_default ;
   private String[] T01FE12_A407EmprNom ;
   private boolean[] T01FE12_n407EmprNom ;
   private int[] T01FE16_A898BarPieNDes ;
   private java.math.BigDecimal[] T01FE16_A184BarMtr ;
   private short[] T01FE16_A199BarPie1 ;
   private java.math.BigDecimal[] T01FE18_A4839BarAudMTab ;
   private boolean[] T01FE18_n4839BarAudMTab ;
   private String[] T01FE21_A2759BarMaqGru ;
   private int[] T01FE21_A129BarCod ;
   private boolean[] T01FE21_n129BarCod ;
   private byte[] T01FE21_A132BarCodReo ;
   private boolean[] T01FE21_n132BarCodReo ;
   private String[] T01FE21_A130BarCodPar ;
   private boolean[] T01FE21_n130BarCodPar ;
   private String[] T01FE21_A180BarMaqCod ;
   private String[] T01FE21_A143BarDisNum ;
   private java.util.Date[] T01FE21_A155BarFecCli ;
   private int[] T01FE21_A252CliCod ;
   private boolean[] T01FE21_n252CliCod ;
   private String[] T01FE21_A279CliNom ;
   private String[] T01FE21_A212BarSer ;
   private String[] T01FE21_A1652BarSerDsc ;
   private String[] T01FE21_A1798BarDibCli ;
   private int[] T01FE21_A1799BarDibInt ;
   private String[] T01FE21_A135BarColNom ;
   private int[] T01FE21_A136BarColNum ;
   private byte[] T01FE21_A218BarTipCol ;
   private byte[] T01FE21_A213BarSit ;
   private String[] T01FE21_A120BarAgrEst ;
   private String[] T01FE21_A4016BarTin ;
   private String[] T01FE21_A2010BarTipDis ;
   private String[] T01FE21_A407EmprNom ;
   private boolean[] T01FE21_n407EmprNom ;
   private java.util.Date[] T01FE21_A4832BarAudFec ;
   private boolean[] T01FE21_n4832BarAudFec ;
   private byte[] T01FE21_A4833BarAudTur ;
   private boolean[] T01FE21_n4833BarAudTur ;
   private int[] T01FE21_A4834BarAudOpe ;
   private boolean[] T01FE21_n4834BarAudOpe ;
   private String[] T01FE21_A4835BarAudOpeN ;
   private boolean[] T01FE21_n4835BarAudOpeN ;
   private int[] T01FE21_A4836BarAudSup ;
   private String[] T01FE21_A4837BarAudSupN ;
   private boolean[] T01FE21_n4837BarAudSupN ;
   private short[] T01FE21_A4838BarAudNPz ;
   private boolean[] T01FE21_n4838BarAudNPz ;
   private java.math.BigDecimal[] T01FE21_A4840BarAudMDig ;
   private boolean[] T01FE21_n4840BarAudMDig ;
   private java.math.BigDecimal[] T01FE21_A4841BarAudMCue ;
   private boolean[] T01FE21_n4841BarAudMCue ;
   private short[] T01FE21_A4844BarAudULin ;
   private boolean[] T01FE21_n4844BarAudULin ;
   private String[] T01FE21_A4845BarAudObs ;
   private boolean[] T01FE21_n4845BarAudObs ;
   private String[] T01FE21_A365DisDes ;
   private String[] T01FE21_A396EmprCod ;
   private boolean[] T01FE21_n396EmprCod ;
   private int[] T01FE21_A361DisCod ;
   private int[] T01FE21_A898BarPieNDes ;
   private java.math.BigDecimal[] T01FE21_A4839BarAudMTab ;
   private boolean[] T01FE21_n4839BarAudMTab ;
   private java.math.BigDecimal[] T01FE21_A184BarMtr ;
   private short[] T01FE21_A199BarPie1 ;
   private int[] T01FE13_A252CliCod ;
   private boolean[] T01FE13_n252CliCod ;
   private String[] T01FE13_A365DisDes ;
   private String[] T01FE14_A279CliNom ;
   private int[] T01FE22_A252CliCod ;
   private boolean[] T01FE22_n252CliCod ;
   private String[] T01FE22_A365DisDes ;
   private String[] T01FE23_A279CliNom ;
   private String[] T01FE24_A396EmprCod ;
   private boolean[] T01FE24_n396EmprCod ;
   private int[] T01FE24_A129BarCod ;
   private boolean[] T01FE24_n129BarCod ;
   private byte[] T01FE24_A132BarCodReo ;
   private boolean[] T01FE24_n132BarCodReo ;
   private String[] T01FE24_A130BarCodPar ;
   private boolean[] T01FE24_n130BarCodPar ;
   private String[] T01FE11_A2759BarMaqGru ;
   private int[] T01FE11_A129BarCod ;
   private boolean[] T01FE11_n129BarCod ;
   private byte[] T01FE11_A132BarCodReo ;
   private boolean[] T01FE11_n132BarCodReo ;
   private String[] T01FE11_A130BarCodPar ;
   private boolean[] T01FE11_n130BarCodPar ;
   private String[] T01FE11_A180BarMaqCod ;
   private String[] T01FE11_A143BarDisNum ;
   private java.util.Date[] T01FE11_A155BarFecCli ;
   private String[] T01FE11_A212BarSer ;
   private String[] T01FE11_A1652BarSerDsc ;
   private String[] T01FE11_A1798BarDibCli ;
   private int[] T01FE11_A1799BarDibInt ;
   private String[] T01FE11_A135BarColNom ;
   private int[] T01FE11_A136BarColNum ;
   private byte[] T01FE11_A218BarTipCol ;
   private byte[] T01FE11_A213BarSit ;
   private String[] T01FE11_A120BarAgrEst ;
   private String[] T01FE11_A4016BarTin ;
   private String[] T01FE11_A2010BarTipDis ;
   private java.util.Date[] T01FE11_A4832BarAudFec ;
   private boolean[] T01FE11_n4832BarAudFec ;
   private byte[] T01FE11_A4833BarAudTur ;
   private boolean[] T01FE11_n4833BarAudTur ;
   private int[] T01FE11_A4834BarAudOpe ;
   private boolean[] T01FE11_n4834BarAudOpe ;
   private String[] T01FE11_A4835BarAudOpeN ;
   private boolean[] T01FE11_n4835BarAudOpeN ;
   private int[] T01FE11_A4836BarAudSup ;
   private String[] T01FE11_A4837BarAudSupN ;
   private boolean[] T01FE11_n4837BarAudSupN ;
   private short[] T01FE11_A4838BarAudNPz ;
   private boolean[] T01FE11_n4838BarAudNPz ;
   private java.math.BigDecimal[] T01FE11_A4840BarAudMDig ;
   private boolean[] T01FE11_n4840BarAudMDig ;
   private java.math.BigDecimal[] T01FE11_A4841BarAudMCue ;
   private boolean[] T01FE11_n4841BarAudMCue ;
   private short[] T01FE11_A4844BarAudULin ;
   private boolean[] T01FE11_n4844BarAudULin ;
   private String[] T01FE11_A4845BarAudObs ;
   private boolean[] T01FE11_n4845BarAudObs ;
   private String[] T01FE11_A396EmprCod ;
   private boolean[] T01FE11_n396EmprCod ;
   private int[] T01FE11_A361DisCod ;
   private int[] T01FE11_A252CliCod ;
   private boolean[] T01FE11_n252CliCod ;
   private String[] T01FE11_A365DisDes ;
   private String[] T01FE25_A396EmprCod ;
   private boolean[] T01FE25_n396EmprCod ;
   private int[] T01FE25_A129BarCod ;
   private boolean[] T01FE25_n129BarCod ;
   private byte[] T01FE25_A132BarCodReo ;
   private boolean[] T01FE25_n132BarCodReo ;
   private String[] T01FE25_A130BarCodPar ;
   private boolean[] T01FE25_n130BarCodPar ;
   private String[] T01FE26_A396EmprCod ;
   private boolean[] T01FE26_n396EmprCod ;
   private int[] T01FE26_A129BarCod ;
   private boolean[] T01FE26_n129BarCod ;
   private byte[] T01FE26_A132BarCodReo ;
   private boolean[] T01FE26_n132BarCodReo ;
   private String[] T01FE26_A130BarCodPar ;
   private boolean[] T01FE26_n130BarCodPar ;
   private String[] T01FE10_A2759BarMaqGru ;
   private int[] T01FE10_A129BarCod ;
   private boolean[] T01FE10_n129BarCod ;
   private byte[] T01FE10_A132BarCodReo ;
   private boolean[] T01FE10_n132BarCodReo ;
   private String[] T01FE10_A130BarCodPar ;
   private boolean[] T01FE10_n130BarCodPar ;
   private String[] T01FE10_A180BarMaqCod ;
   private String[] T01FE10_A143BarDisNum ;
   private java.util.Date[] T01FE10_A155BarFecCli ;
   private String[] T01FE10_A212BarSer ;
   private String[] T01FE10_A1652BarSerDsc ;
   private String[] T01FE10_A1798BarDibCli ;
   private int[] T01FE10_A1799BarDibInt ;
   private String[] T01FE10_A135BarColNom ;
   private int[] T01FE10_A136BarColNum ;
   private byte[] T01FE10_A218BarTipCol ;
   private byte[] T01FE10_A213BarSit ;
   private String[] T01FE10_A120BarAgrEst ;
   private String[] T01FE10_A4016BarTin ;
   private String[] T01FE10_A2010BarTipDis ;
   private java.util.Date[] T01FE10_A4832BarAudFec ;
   private boolean[] T01FE10_n4832BarAudFec ;
   private byte[] T01FE10_A4833BarAudTur ;
   private boolean[] T01FE10_n4833BarAudTur ;
   private int[] T01FE10_A4834BarAudOpe ;
   private boolean[] T01FE10_n4834BarAudOpe ;
   private String[] T01FE10_A4835BarAudOpeN ;
   private boolean[] T01FE10_n4835BarAudOpeN ;
   private int[] T01FE10_A4836BarAudSup ;
   private String[] T01FE10_A4837BarAudSupN ;
   private boolean[] T01FE10_n4837BarAudSupN ;
   private short[] T01FE10_A4838BarAudNPz ;
   private boolean[] T01FE10_n4838BarAudNPz ;
   private java.math.BigDecimal[] T01FE10_A4840BarAudMDig ;
   private boolean[] T01FE10_n4840BarAudMDig ;
   private java.math.BigDecimal[] T01FE10_A4841BarAudMCue ;
   private boolean[] T01FE10_n4841BarAudMCue ;
   private short[] T01FE10_A4844BarAudULin ;
   private boolean[] T01FE10_n4844BarAudULin ;
   private String[] T01FE10_A4845BarAudObs ;
   private boolean[] T01FE10_n4845BarAudObs ;
   private String[] T01FE10_A396EmprCod ;
   private boolean[] T01FE10_n396EmprCod ;
   private int[] T01FE10_A361DisCod ;
   private int[] T01FE10_A252CliCod ;
   private boolean[] T01FE10_n252CliCod ;
   private String[] T01FE10_A365DisDes ;
   private int[] T01FE30_A252CliCod ;
   private boolean[] T01FE30_n252CliCod ;
   private String[] T01FE30_A365DisDes ;
   private String[] T01FE31_A279CliNom ;
   private long[] T01FE32_A14681MRPrId ;
   private String[] T01FE33_A5921XCjaDis ;
   private long[] T01FE33_A5922XCjaCod ;
   private String[] T01FE34_A396EmprCod ;
   private boolean[] T01FE34_n396EmprCod ;
   private int[] T01FE34_A129BarCod ;
   private boolean[] T01FE34_n129BarCod ;
   private byte[] T01FE34_A132BarCodReo ;
   private boolean[] T01FE34_n132BarCodReo ;
   private String[] T01FE34_A130BarCodPar ;
   private boolean[] T01FE34_n130BarCodPar ;
   private short[] T01FE34_A14152MEnvOrd ;
   private String[] T01FE35_A396EmprCod ;
   private boolean[] T01FE35_n396EmprCod ;
   private int[] T01FE35_A129BarCod ;
   private boolean[] T01FE35_n129BarCod ;
   private byte[] T01FE35_A132BarCodReo ;
   private boolean[] T01FE35_n132BarCodReo ;
   private String[] T01FE35_A130BarCodPar ;
   private boolean[] T01FE35_n130BarCodPar ;
   private String[] T01FE35_A13905BarTraID ;
   private String[] T01FE36_A396EmprCod ;
   private boolean[] T01FE36_n396EmprCod ;
   private int[] T01FE36_A129BarCod ;
   private boolean[] T01FE36_n129BarCod ;
   private byte[] T01FE36_A132BarCodReo ;
   private boolean[] T01FE36_n132BarCodReo ;
   private String[] T01FE36_A130BarCodPar ;
   private boolean[] T01FE36_n130BarCodPar ;
   private byte[] T01FE36_A13093BarDGLin ;
   private String[] T01FE36_A13094BarDGDibCl ;
   private int[] T01FE36_A13095BarDGDibIn ;
   private String[] T01FE36_A13096BarDGComb ;
   private String[] T01FE36_A13097BarDGFOndo ;
   private String[] T01FE37_A396EmprCod ;
   private boolean[] T01FE37_n396EmprCod ;
   private int[] T01FE37_A11917Ebd_numero ;
   private String[] T01FE38_A396EmprCod ;
   private boolean[] T01FE38_n396EmprCod ;
   private int[] T01FE38_A11898Prd_numero ;
   private String[] T01FE39_A396EmprCod ;
   private boolean[] T01FE39_n396EmprCod ;
   private int[] T01FE39_A11849Cte_numero ;
   private String[] T01FE40_A396EmprCod ;
   private boolean[] T01FE40_n396EmprCod ;
   private int[] T01FE40_A11791Ap_numero ;
   private String[] T01FE41_A396EmprCod ;
   private boolean[] T01FE41_n396EmprCod ;
   private int[] T01FE41_A3985CalBarCod ;
   private byte[] T01FE41_A3986CalBarCodR ;
   private String[] T01FE41_A3987CalBarCodP ;
   private String[] T01FE42_A396EmprCod ;
   private boolean[] T01FE42_n396EmprCod ;
   private java.util.Date[] T01FE42_A5294InPTime ;
   private int[] T01FE42_A652OpeCod ;
   private String[] T01FE43_A396EmprCod ;
   private boolean[] T01FE43_n396EmprCod ;
   private int[] T01FE43_A129BarCod ;
   private boolean[] T01FE43_n129BarCod ;
   private byte[] T01FE43_A132BarCodReo ;
   private boolean[] T01FE43_n132BarCodReo ;
   private String[] T01FE43_A130BarCodPar ;
   private boolean[] T01FE43_n130BarCodPar ;
   private int[] T01FE43_A4118tinagrcod ;
   private byte[] T01FE43_A4119tinagrreo ;
   private String[] T01FE43_A4120tinagrpar ;
   private String[] T01FE44_A396EmprCod ;
   private boolean[] T01FE44_n396EmprCod ;
   private int[] T01FE44_A129BarCod ;
   private boolean[] T01FE44_n129BarCod ;
   private byte[] T01FE44_A132BarCodReo ;
   private boolean[] T01FE44_n132BarCodReo ;
   private String[] T01FE44_A130BarCodPar ;
   private boolean[] T01FE44_n130BarCodPar ;
   private int[] T01FE44_A4080estagrcod ;
   private byte[] T01FE44_A4081estagrreo ;
   private String[] T01FE44_A4082estagrpar ;
   private String[] T01FE45_A396EmprCod ;
   private boolean[] T01FE45_n396EmprCod ;
   private int[] T01FE45_A129BarCod ;
   private boolean[] T01FE45_n129BarCod ;
   private byte[] T01FE45_A132BarCodReo ;
   private boolean[] T01FE45_n132BarCodReo ;
   private String[] T01FE45_A130BarCodPar ;
   private boolean[] T01FE45_n130BarCodPar ;
   private byte[] T01FE45_A4075recestncol ;
   private byte[] T01FE45_A4076recestnpro ;
   private String[] T01FE46_A396EmprCod ;
   private boolean[] T01FE46_n396EmprCod ;
   private String[] T01FE46_A602MaqCod ;
   private String[] T01FE46_A1142MaqFCod ;
   private short[] T01FE46_A3068PlaEtaOrd ;
   private byte[] T01FE46_A3069PlaEtaOrdA ;
   private int[] T01FE46_A129BarCod ;
   private boolean[] T01FE46_n129BarCod ;
   private byte[] T01FE46_A132BarCodReo ;
   private boolean[] T01FE46_n132BarCodReo ;
   private String[] T01FE46_A130BarCodPar ;
   private boolean[] T01FE46_n130BarCodPar ;
   private String[] T01FE47_A396EmprCod ;
   private boolean[] T01FE47_n396EmprCod ;
   private int[] T01FE47_A129BarCod ;
   private boolean[] T01FE47_n129BarCod ;
   private byte[] T01FE47_A132BarCodReo ;
   private boolean[] T01FE47_n132BarCodReo ;
   private String[] T01FE47_A130BarCodPar ;
   private boolean[] T01FE47_n130BarCodPar ;
   private short[] T01FE47_A3940BarEnsLin ;
   private String[] T01FE48_A396EmprCod ;
   private boolean[] T01FE48_n396EmprCod ;
   private int[] T01FE48_A129BarCod ;
   private boolean[] T01FE48_n129BarCod ;
   private byte[] T01FE48_A132BarCodReo ;
   private boolean[] T01FE48_n132BarCodReo ;
   private String[] T01FE48_A130BarCodPar ;
   private boolean[] T01FE48_n130BarCodPar ;
   private int[] T01FE48_A3384RefBarCod ;
   private byte[] T01FE48_A3385RefBarReo ;
   private String[] T01FE48_A3386RefBarPar ;
   private String[] T01FE49_A396EmprCod ;
   private boolean[] T01FE49_n396EmprCod ;
   private int[] T01FE49_A10914SolSalCod ;
   private String[] T01FE50_A396EmprCod ;
   private boolean[] T01FE50_n396EmprCod ;
   private int[] T01FE50_A10364Ph_numero ;
   private String[] T01FE51_A396EmprCod ;
   private boolean[] T01FE51_n396EmprCod ;
   private int[] T01FE51_A129BarCod ;
   private boolean[] T01FE51_n129BarCod ;
   private byte[] T01FE51_A132BarCodReo ;
   private boolean[] T01FE51_n132BarCodReo ;
   private String[] T01FE51_A130BarCodPar ;
   private boolean[] T01FE51_n130BarCodPar ;
   private String[] T01FE51_A10197ProEspCod ;
   private String[] T01FE52_A396EmprCod ;
   private boolean[] T01FE52_n396EmprCod ;
   private int[] T01FE52_A129BarCod ;
   private boolean[] T01FE52_n129BarCod ;
   private byte[] T01FE52_A132BarCodReo ;
   private boolean[] T01FE52_n132BarCodReo ;
   private String[] T01FE52_A130BarCodPar ;
   private boolean[] T01FE52_n130BarCodPar ;
   private int[] T01FE52_A5322Dp_Nrecep ;
   private String[] T01FE53_A396EmprCod ;
   private boolean[] T01FE53_n396EmprCod ;
   private int[] T01FE53_A129BarCod ;
   private boolean[] T01FE53_n129BarCod ;
   private byte[] T01FE53_A132BarCodReo ;
   private boolean[] T01FE53_n132BarCodReo ;
   private String[] T01FE53_A130BarCodPar ;
   private boolean[] T01FE53_n130BarCodPar ;
   private int[] T01FE53_A8569EntSecLn ;
   private String[] T01FE54_A396EmprCod ;
   private boolean[] T01FE54_n396EmprCod ;
   private int[] T01FE54_A7434PLLNro ;
   private short[] T01FE54_A7443LPLNro ;
   private short[] T01FE54_A7459CPLCom ;
   private int[] T01FE54_A129BarCod ;
   private boolean[] T01FE54_n129BarCod ;
   private byte[] T01FE54_A132BarCodReo ;
   private boolean[] T01FE54_n132BarCodReo ;
   private String[] T01FE54_A130BarCodPar ;
   private boolean[] T01FE54_n130BarCodPar ;
   private String[] T01FE55_A396EmprCod ;
   private boolean[] T01FE55_n396EmprCod ;
   private int[] T01FE55_A7145OSSCod ;
   private String[] T01FE56_A396EmprCod ;
   private boolean[] T01FE56_n396EmprCod ;
   private int[] T01FE56_A7049OGSCod ;
   private String[] T01FE57_A396EmprCod ;
   private boolean[] T01FE57_n396EmprCod ;
   private int[] T01FE57_A129BarCod ;
   private boolean[] T01FE57_n129BarCod ;
   private byte[] T01FE57_A132BarCodReo ;
   private boolean[] T01FE57_n132BarCodReo ;
   private String[] T01FE57_A130BarCodPar ;
   private boolean[] T01FE57_n130BarCodPar ;
   private int[] T01FE57_A6031Ac_Barcod ;
   private byte[] T01FE57_A6032Ac_BarReo ;
   private String[] T01FE57_A6033Ac_BarPar ;
   private String[] T01FE58_A396EmprCod ;
   private boolean[] T01FE58_n396EmprCod ;
   private int[] T01FE58_A129BarCod ;
   private boolean[] T01FE58_n129BarCod ;
   private byte[] T01FE58_A132BarCodReo ;
   private boolean[] T01FE58_n132BarCodReo ;
   private String[] T01FE58_A130BarCodPar ;
   private boolean[] T01FE58_n130BarCodPar ;
   private int[] T01FE58_A5908PartPal ;
   private String[] T01FE59_A396EmprCod ;
   private boolean[] T01FE59_n396EmprCod ;
   private int[] T01FE59_A129BarCod ;
   private boolean[] T01FE59_n129BarCod ;
   private byte[] T01FE59_A132BarCodReo ;
   private boolean[] T01FE59_n132BarCodReo ;
   private String[] T01FE59_A130BarCodPar ;
   private boolean[] T01FE59_n130BarCodPar ;
   private byte[] T01FE59_A2524DisComLin ;
   private String[] T01FE59_A1056DisComCod ;
   private String[] T01FE59_A1032FonCod ;
   private String[] T01FE60_A396EmprCod ;
   private boolean[] T01FE60_n396EmprCod ;
   private long[] T01FE60_A1736AlbExtCod ;
   private int[] T01FE60_A129BarCod ;
   private boolean[] T01FE60_n129BarCod ;
   private byte[] T01FE60_A132BarCodReo ;
   private boolean[] T01FE60_n132BarCodReo ;
   private String[] T01FE60_A130BarCodPar ;
   private boolean[] T01FE60_n130BarCodPar ;
   private String[] T01FE61_A396EmprCod ;
   private boolean[] T01FE61_n396EmprCod ;
   private int[] T01FE61_A129BarCod ;
   private boolean[] T01FE61_n129BarCod ;
   private byte[] T01FE61_A132BarCodReo ;
   private boolean[] T01FE61_n132BarCodReo ;
   private String[] T01FE61_A130BarCodPar ;
   private boolean[] T01FE61_n130BarCodPar ;
   private int[] T01FE61_A3753BarFoaCod ;
   private byte[] T01FE61_A3754BarFoaReo ;
   private String[] T01FE61_A3755BarFoaPar ;
   private String[] T01FE62_A396EmprCod ;
   private boolean[] T01FE62_n396EmprCod ;
   private int[] T01FE62_A129BarCod ;
   private boolean[] T01FE62_n129BarCod ;
   private byte[] T01FE62_A132BarCodReo ;
   private boolean[] T01FE62_n132BarCodReo ;
   private String[] T01FE62_A130BarCodPar ;
   private boolean[] T01FE62_n130BarCodPar ;
   private int[] T01FE62_A3747BarPegCod ;
   private byte[] T01FE62_A3748BarPegReo ;
   private String[] T01FE62_A3749BarPegPar ;
   private String[] T01FE63_A396EmprCod ;
   private boolean[] T01FE63_n396EmprCod ;
   private int[] T01FE63_A3253SolTraCod ;
   private String[] T01FE64_A396EmprCod ;
   private boolean[] T01FE64_n396EmprCod ;
   private int[] T01FE64_A3235SolSubCod ;
   private String[] T01FE65_A396EmprCod ;
   private boolean[] T01FE65_n396EmprCod ;
   private int[] T01FE65_A3218SolLuzCod ;
   private String[] T01FE66_A396EmprCod ;
   private boolean[] T01FE66_n396EmprCod ;
   private int[] T01FE66_A3196SolFriCod ;
   private String[] T01FE67_A396EmprCod ;
   private boolean[] T01FE67_n396EmprCod ;
   private int[] T01FE67_A3165SolPilCod ;
   private String[] T01FE68_A396EmprCod ;
   private boolean[] T01FE68_n396EmprCod ;
   private int[] T01FE68_A129BarCod ;
   private boolean[] T01FE68_n129BarCod ;
   private byte[] T01FE68_A132BarCodReo ;
   private boolean[] T01FE68_n132BarCodReo ;
   private String[] T01FE68_A130BarCodPar ;
   private boolean[] T01FE68_n130BarCodPar ;
   private short[] T01FE68_A2872HAnRLinMaq ;
   private byte[] T01FE68_A2873HAnRLinPro ;
   private short[] T01FE68_A2874HAnRLin ;
   private byte[] T01FE68_A2875HAnNumAny ;
   private String[] T01FE69_A396EmprCod ;
   private boolean[] T01FE69_n396EmprCod ;
   private String[] T01FE69_A2817PlaTer ;
   private short[] T01FE69_A2818PlaOrd ;
   private String[] T01FE70_A396EmprCod ;
   private boolean[] T01FE70_n396EmprCod ;
   private String[] T01FE70_A2809MetTerCod ;
   private int[] T01FE70_A129BarCod ;
   private boolean[] T01FE70_n129BarCod ;
   private byte[] T01FE70_A132BarCodReo ;
   private boolean[] T01FE70_n132BarCodReo ;
   private String[] T01FE70_A130BarCodPar ;
   private boolean[] T01FE70_n130BarCodPar ;
   private String[] T01FE71_A396EmprCod ;
   private boolean[] T01FE71_n396EmprCod ;
   private int[] T01FE71_A129BarCod ;
   private boolean[] T01FE71_n129BarCod ;
   private byte[] T01FE71_A132BarCodReo ;
   private boolean[] T01FE71_n132BarCodReo ;
   private String[] T01FE71_A130BarCodPar ;
   private boolean[] T01FE71_n130BarCodPar ;
   private short[] T01FE71_A2808RecLinMAL ;
   private byte[] T01FE71_A1377RecNumAny ;
   private String[] T01FE71_A719PrdNum ;
   private String[] T01FE72_A396EmprCod ;
   private boolean[] T01FE72_n396EmprCod ;
   private int[] T01FE72_A129BarCod ;
   private boolean[] T01FE72_n129BarCod ;
   private byte[] T01FE72_A132BarCodReo ;
   private boolean[] T01FE72_n132BarCodReo ;
   private String[] T01FE72_A130BarCodPar ;
   private boolean[] T01FE72_n130BarCodPar ;
   private short[] T01FE72_A2804RecLinMaq ;
   private String[] T01FE73_A396EmprCod ;
   private boolean[] T01FE73_n396EmprCod ;
   private String[] T01FE73_A2792TermiCod ;
   private int[] T01FE73_A129BarCod ;
   private boolean[] T01FE73_n129BarCod ;
   private byte[] T01FE73_A132BarCodReo ;
   private boolean[] T01FE73_n132BarCodReo ;
   private String[] T01FE73_A130BarCodPar ;
   private boolean[] T01FE73_n130BarCodPar ;
   private String[] T01FE74_A396EmprCod ;
   private boolean[] T01FE74_n396EmprCod ;
   private short[] T01FE74_A2248ManCod ;
   private java.util.Date[] T01FE74_A2711RpExHdFe ;
   private short[] T01FE74_A2713RpExHdLi ;
   private String[] T01FE75_A396EmprCod ;
   private boolean[] T01FE75_n396EmprCod ;
   private short[] T01FE75_A2248ManCod ;
   private String[] T01FE75_A2689ExHdrFas ;
   private int[] T01FE75_A2692ExHdrLin ;
   private String[] T01FE76_A396EmprCod ;
   private boolean[] T01FE76_n396EmprCod ;
   private int[] T01FE76_A129BarCod ;
   private boolean[] T01FE76_n129BarCod ;
   private byte[] T01FE76_A132BarCodReo ;
   private boolean[] T01FE76_n132BarCodReo ;
   private String[] T01FE76_A130BarCodPar ;
   private boolean[] T01FE76_n130BarCodPar ;
   private String[] T01FE76_A2494BarDosPro ;
   private String[] T01FE76_A719PrdNum ;
   private String[] T01FE77_A396EmprCod ;
   private boolean[] T01FE77_n396EmprCod ;
   private String[] T01FE77_A602MaqCod ;
   private java.util.Date[] T01FE77_A2461PlaFecTin ;
   private int[] T01FE77_A129BarCod ;
   private boolean[] T01FE77_n129BarCod ;
   private byte[] T01FE77_A132BarCodReo ;
   private boolean[] T01FE77_n132BarCodReo ;
   private String[] T01FE77_A130BarCodPar ;
   private boolean[] T01FE77_n130BarCodPar ;
   private String[] T01FE78_A396EmprCod ;
   private boolean[] T01FE78_n396EmprCod ;
   private int[] T01FE78_A129BarCod ;
   private boolean[] T01FE78_n129BarCod ;
   private byte[] T01FE78_A132BarCodReo ;
   private boolean[] T01FE78_n132BarCodReo ;
   private String[] T01FE78_A130BarCodPar ;
   private boolean[] T01FE78_n130BarCodPar ;
   private short[] T01FE78_A2457BarObLin ;
   private String[] T01FE79_A396EmprCod ;
   private boolean[] T01FE79_n396EmprCod ;
   private int[] T01FE79_A129BarCod ;
   private boolean[] T01FE79_n129BarCod ;
   private byte[] T01FE79_A132BarCodReo ;
   private boolean[] T01FE79_n132BarCodReo ;
   private String[] T01FE79_A130BarCodPar ;
   private boolean[] T01FE79_n130BarCodPar ;
   private short[] T01FE79_A2444BarEnLin ;
   private String[] T01FE80_A396EmprCod ;
   private boolean[] T01FE80_n396EmprCod ;
   private int[] T01FE80_A2406ExhAlbCod ;
   private int[] T01FE80_A129BarCod ;
   private boolean[] T01FE80_n129BarCod ;
   private byte[] T01FE80_A132BarCodReo ;
   private boolean[] T01FE80_n132BarCodReo ;
   private String[] T01FE80_A130BarCodPar ;
   private boolean[] T01FE80_n130BarCodPar ;
   private String[] T01FE81_A396EmprCod ;
   private boolean[] T01FE81_n396EmprCod ;
   private int[] T01FE81_A2253SalExtAlb ;
   private int[] T01FE81_A129BarCod ;
   private boolean[] T01FE81_n129BarCod ;
   private byte[] T01FE81_A132BarCodReo ;
   private boolean[] T01FE81_n132BarCodReo ;
   private String[] T01FE81_A130BarCodPar ;
   private boolean[] T01FE81_n130BarCodPar ;
   private String[] T01FE82_A396EmprCod ;
   private boolean[] T01FE82_n396EmprCod ;
   private long[] T01FE82_A30AlbProCod ;
   private int[] T01FE82_A129BarCod ;
   private boolean[] T01FE82_n129BarCod ;
   private byte[] T01FE82_A132BarCodReo ;
   private boolean[] T01FE82_n132BarCodReo ;
   private String[] T01FE82_A130BarCodPar ;
   private boolean[] T01FE82_n130BarCodPar ;
   private String[] T01FE83_A396EmprCod ;
   private boolean[] T01FE83_n396EmprCod ;
   private int[] T01FE83_A1348SolColCod ;
   private String[] T01FE84_A396EmprCod ;
   private boolean[] T01FE84_n396EmprCod ;
   private int[] T01FE84_A1333EstDimCod ;
   private String[] T01FE85_A396EmprCod ;
   private boolean[] T01FE85_n396EmprCod ;
   private int[] T01FE85_A1314EnsLabCod ;
   private String[] T01FE86_A396EmprCod ;
   private boolean[] T01FE86_n396EmprCod ;
   private int[] T01FE86_A129BarCod ;
   private boolean[] T01FE86_n129BarCod ;
   private byte[] T01FE86_A132BarCodReo ;
   private boolean[] T01FE86_n132BarCodReo ;
   private String[] T01FE86_A130BarCodPar ;
   private boolean[] T01FE86_n130BarCodPar ;
   private byte[] T01FE86_A906ObsReoLin ;
   private String[] T01FE87_A396EmprCod ;
   private boolean[] T01FE87_n396EmprCod ;
   private int[] T01FE87_A859CumCodCont ;
   private String[] T01FE88_A396EmprCod ;
   private boolean[] T01FE88_n396EmprCod ;
   private String[] T01FE88_A602MaqCod ;
   private java.util.Date[] T01FE88_A558HisProFec ;
   private int[] T01FE88_A561HisProLin ;
   private String[] T01FE89_A396EmprCod ;
   private boolean[] T01FE89_n396EmprCod ;
   private int[] T01FE89_A252CliCod ;
   private boolean[] T01FE89_n252CliCod ;
   private String[] T01FE89_A494ForSer ;
   private String[] T01FE89_A482ForColNom ;
   private int[] T01FE89_A483ForColNum ;
   private byte[] T01FE89_A831TipColCod ;
   private String[] T01FE90_A396EmprCod ;
   private boolean[] T01FE90_n396EmprCod ;
   private int[] T01FE90_A129BarCod ;
   private boolean[] T01FE90_n129BarCod ;
   private byte[] T01FE90_A132BarCodReo ;
   private boolean[] T01FE90_n132BarCodReo ;
   private String[] T01FE90_A130BarCodPar ;
   private boolean[] T01FE90_n130BarCodPar ;
   private String[] T01FE90_A200BarPieCod ;
   private String[] T01FE91_A396EmprCod ;
   private boolean[] T01FE91_n396EmprCod ;
   private int[] T01FE91_A129BarCod ;
   private boolean[] T01FE91_n129BarCod ;
   private byte[] T01FE91_A132BarCodReo ;
   private boolean[] T01FE91_n132BarCodReo ;
   private String[] T01FE91_A130BarCodPar ;
   private boolean[] T01FE91_n130BarCodPar ;
   private byte[] T01FE91_A188BarNotLin ;
   private String[] T01FE92_A396EmprCod ;
   private boolean[] T01FE92_n396EmprCod ;
   private int[] T01FE92_A129BarCod ;
   private boolean[] T01FE92_n129BarCod ;
   private byte[] T01FE92_A132BarCodReo ;
   private boolean[] T01FE92_n132BarCodReo ;
   private String[] T01FE92_A130BarCodPar ;
   private boolean[] T01FE92_n130BarCodPar ;
   private String[] T01FE92_A758ProCod ;
   private String[] T01FE93_A396EmprCod ;
   private boolean[] T01FE93_n396EmprCod ;
   private int[] T01FE93_A129BarCod ;
   private boolean[] T01FE93_n129BarCod ;
   private byte[] T01FE93_A132BarCodReo ;
   private boolean[] T01FE93_n132BarCodReo ;
   private String[] T01FE93_A130BarCodPar ;
   private boolean[] T01FE93_n130BarCodPar ;
   private int[] T01FE93_A119BarAgrCod ;
   private byte[] T01FE93_A124BarAgrReo ;
   private String[] T01FE93_A122BarAgrPar ;
   private String[] T01FE95_A396EmprCod ;
   private boolean[] T01FE95_n396EmprCod ;
   private int[] T01FE95_A129BarCod ;
   private boolean[] T01FE95_n129BarCod ;
   private byte[] T01FE95_A132BarCodReo ;
   private boolean[] T01FE95_n132BarCodReo ;
   private String[] T01FE95_A130BarCodPar ;
   private boolean[] T01FE95_n130BarCodPar ;
   private String[] T01FE6_A5006BarAudCant ;
   private boolean[] T01FE6_n5006BarAudCant ;
   private String[] T01FE9_A5007BarAudPant ;
   private boolean[] T01FE9_n5007BarAudPant ;
   private int[] T01FE100_A129BarCod ;
   private boolean[] T01FE100_n129BarCod ;
   private byte[] T01FE100_A132BarCodReo ;
   private boolean[] T01FE100_n132BarCodReo ;
   private String[] T01FE100_A130BarCodPar ;
   private boolean[] T01FE100_n130BarCodPar ;
   private short[] T01FE100_A4846BarAudLin ;
   private String[] T01FE100_A4847BarAudPie ;
   private boolean[] T01FE100_n4847BarAudPie ;
   private java.math.BigDecimal[] T01FE100_A4848BarAudMts ;
   private boolean[] T01FE100_n4848BarAudMts ;
   private String[] T01FE100_A4849BarAudCar ;
   private boolean[] T01FE100_n4849BarAudCar ;
   private String[] T01FE100_A5000BarAudPar ;
   private boolean[] T01FE100_n5000BarAudPar ;
   private String[] T01FE100_A396EmprCod ;
   private boolean[] T01FE100_n396EmprCod ;
   private String[] T01FE100_A5006BarAudCant ;
   private boolean[] T01FE100_n5006BarAudCant ;
   private String[] T01FE100_A5007BarAudPant ;
   private boolean[] T01FE100_n5007BarAudPant ;
   private String[] T01FE101_A396EmprCod ;
   private boolean[] T01FE101_n396EmprCod ;
   private int[] T01FE101_A129BarCod ;
   private boolean[] T01FE101_n129BarCod ;
   private byte[] T01FE101_A132BarCodReo ;
   private boolean[] T01FE101_n132BarCodReo ;
   private String[] T01FE101_A130BarCodPar ;
   private boolean[] T01FE101_n130BarCodPar ;
   private short[] T01FE101_A4846BarAudLin ;
   private int[] T01FE3_A129BarCod ;
   private boolean[] T01FE3_n129BarCod ;
   private byte[] T01FE3_A132BarCodReo ;
   private boolean[] T01FE3_n132BarCodReo ;
   private String[] T01FE3_A130BarCodPar ;
   private boolean[] T01FE3_n130BarCodPar ;
   private short[] T01FE3_A4846BarAudLin ;
   private String[] T01FE3_A4847BarAudPie ;
   private boolean[] T01FE3_n4847BarAudPie ;
   private java.math.BigDecimal[] T01FE3_A4848BarAudMts ;
   private boolean[] T01FE3_n4848BarAudMts ;
   private String[] T01FE3_A4849BarAudCar ;
   private boolean[] T01FE3_n4849BarAudCar ;
   private String[] T01FE3_A5000BarAudPar ;
   private boolean[] T01FE3_n5000BarAudPar ;
   private String[] T01FE3_A396EmprCod ;
   private boolean[] T01FE3_n396EmprCod ;
   private int[] T01FE2_A129BarCod ;
   private boolean[] T01FE2_n129BarCod ;
   private byte[] T01FE2_A132BarCodReo ;
   private boolean[] T01FE2_n132BarCodReo ;
   private String[] T01FE2_A130BarCodPar ;
   private boolean[] T01FE2_n130BarCodPar ;
   private short[] T01FE2_A4846BarAudLin ;
   private String[] T01FE2_A4847BarAudPie ;
   private boolean[] T01FE2_n4847BarAudPie ;
   private java.math.BigDecimal[] T01FE2_A4848BarAudMts ;
   private boolean[] T01FE2_n4848BarAudMts ;
   private String[] T01FE2_A4849BarAudCar ;
   private boolean[] T01FE2_n4849BarAudCar ;
   private String[] T01FE2_A5000BarAudPar ;
   private boolean[] T01FE2_n5000BarAudPar ;
   private String[] T01FE2_A396EmprCod ;
   private boolean[] T01FE2_n396EmprCod ;
   private String[] T01FE105_A396EmprCod ;
   private boolean[] T01FE105_n396EmprCod ;
   private int[] T01FE105_A129BarCod ;
   private boolean[] T01FE105_n129BarCod ;
   private byte[] T01FE105_A132BarCodReo ;
   private boolean[] T01FE105_n132BarCodReo ;
   private String[] T01FE105_A130BarCodPar ;
   private boolean[] T01FE105_n130BarCodPar ;
   private short[] T01FE105_A4846BarAudLin ;
   private String[] T01FE106_A407EmprNom ;
   private boolean[] T01FE106_n407EmprNom ;
   private int[] T01FE108_A898BarPieNDes ;
   private java.math.BigDecimal[] T01FE108_A184BarMtr ;
   private short[] T01FE108_A199BarPie1 ;
   private java.math.BigDecimal[] T01FE110_A4839BarAudMTab ;
   private boolean[] T01FE110_n4839BarAudMTab ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbaraud__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaraud__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaraud__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaraud__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbaraud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FE2", "SELECT BarCod, BarCodReo, BarCodPar, BarAudLin, BarAudPie, BarAudMts, BarAudCar, BarAudPar, EmprCod FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAudLin = ?  FOR UPDATE OF BarAudPie, BarAudMts, BarAudCar, BarAudPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FE3", "SELECT BarCod, BarCodReo, BarCodPar, BarAudLin, BarAudPie, BarAudMts, BarAudCar, BarAudPar, EmprCod FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAudLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FE6", "SELECT COALESCE( T1.BarAudCant, '    ') AS BarAudCant FROM (SELECT MIN(T2.BarAudCar) AS BarAudCant FROM TXPBARAUD T2,  (SELECT MAX(BarAudLin) AS GXC1 FROM TXPBARAUD WHERE (BarAudLin >= 0) AND (BarAudLin < ?) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T3 WHERE T2.BarAudLin = T3.GXC1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE9", "SELECT COALESCE( T1.BarAudPant, ' ') AS BarAudPant FROM (SELECT MIN(T2.BarAudPar) AS BarAudPant FROM TXPBARAUD T2,  (SELECT MAX(BarAudLin) AS GXC2 FROM TXPBARAUD WHERE (BarAudLin >= 0) AND (BarAudLin < ?) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T3 WHERE T2.BarAudLin = T3.GXC2 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE10", "SELECT BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDisNum, BarFecCli, BarSer, BarSerDsc, BarDibCli, BarDibInt, BarColNom, BarColNum, BarTipCol, BarSit, BarAgrEst, BarTin, BarTipDis, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSup, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarAudObs, EmprCod, DisCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarMaqGru, BarMaqCod, BarDisNum, BarFecCli, BarSer, BarSerDsc, BarDibCli, BarDibInt, BarColNom, BarColNum, BarTipCol, BarSit, BarAgrEst, BarTin, BarTipDis, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSup, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarAudObs, DisCod, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE11", "SELECT BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDisNum, BarFecCli, BarSer, BarSerDsc, BarDibCli, BarDibInt, BarColNom, BarColNum, BarTipCol, BarSit, BarAgrEst, BarTin, BarTipDis, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSup, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarAudObs, EmprCod, DisCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE13", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE16", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE18", "SELECT COALESCE( T1.BarAudMTab, 0) AS BarAudMTab FROM (SELECT SUM(BarAudMts) AS BarAudMTab, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAUD GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE21", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, TM1.BarDisNum, TM1.BarFecCli, TM1.CliCod, T5.CliNom, TM1.BarSer, TM1.BarSerDsc, TM1.BarDibCli, TM1.BarDibInt, TM1.BarColNom, TM1.BarColNum, TM1.BarTipCol, TM1.BarSit, TM1.BarAgrEst, TM1.BarTin, TM1.BarTipDis, T2.EmprNom, TM1.BarAudFec, TM1.BarAudTur, TM1.BarAudOpe, TM1.BarAudOpeN, TM1.BarAudSup, TM1.BarAudSupN, TM1.BarAudNPz, TM1.BarAudMDig, TM1.BarAudMCue, TM1.BarAudULin, TM1.BarAudObs, TM1.DisDes, TM1.EmprCod, TM1.DisCod, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, COALESCE( T4.BarAudMTab, 0) AS BarAudMTab, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1 FROM ((((TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT SUM(BarAudMts) AS BarAudMTab, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAUD GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE22", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE23", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE24", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FE27", "INSERT INTO TXPBARCAD(CliCod, DisDes, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, BarDisNum, BarFecCli, BarSer, BarSerDsc, BarDibCli, BarDibInt, BarColNom, BarColNum, BarTipCol, BarSit, BarAgrEst, BarTin, BarTipDis, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSup, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarAudObs, EmprCod, DisCod, BarVolMaq, BarTipArt, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarLisInd, BarNumTen, BarCodTN, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarComULin, BarEnv, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01FE28", "UPDATE TXPBARCAD SET CliCod=?, DisDes=?, BarMaqGru=?, BarMaqCod=?, BarDisNum=?, BarFecCli=?, BarSer=?, BarSerDsc=?, BarDibCli=?, BarDibInt=?, BarColNom=?, BarColNum=?, BarTipCol=?, BarSit=?, BarAgrEst=?, BarTin=?, BarTipDis=?, BarAudFec=?, BarAudTur=?, BarAudOpe=?, BarAudOpeN=?, BarAudSup=?, BarAudSupN=?, BarAudNPz=?, BarAudMDig=?, BarAudMCue=?, BarAudULin=?, BarAudObs=?, DisCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01FE29", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01FE30", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE31", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE32", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE33", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE37", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE38", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE39", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE40", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE41", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE42", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE44", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE46", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE49", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE50", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE51", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE52", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE53", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE54", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE55", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE56", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE57", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE58", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE59", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE60", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE61", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE63", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE64", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE65", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE66", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE67", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE68", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE69", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE70", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE71", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE73", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE74", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE75", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE77", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE78", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE79", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE80", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE81", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE82", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE83", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE84", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE85", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE86", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE87", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE88", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE89", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE90", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE91", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE92", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE93", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FE94", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01FE95", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FE100", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAudLin, T1.BarAudPie, T1.BarAudMts, T1.BarAudCar, T1.BarAudPar, T1.EmprCod, COALESCE( T2.BarAudCant, '    ') AS BarAudCant, COALESCE( T3.BarAudPant, ' ') AS BarAudPant FROM TXPBARAUD T1,  (SELECT MIN(T4.BarAudCar) AS BarAudCant FROM TXPBARAUD T4,  (SELECT MAX(BarAudLin) AS GXC1 FROM TXPBARAUD WHERE (BarAudLin >= 0) AND (BarAudLin < ?) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T5 WHERE T4.BarAudLin = T5.GXC1 ) T2,  (SELECT MIN(T4.BarAudPar) AS BarAudPant FROM TXPBARAUD T4,  (SELECT MAX(BarAudLin) AS GXC2 FROM TXPBARAUD WHERE (BarAudLin >= 0) AND (BarAudLin < ?) AND (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T5 WHERE T4.BarAudLin = T5.GXC2 ) T3 WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarAudLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAudLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FE101", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAudLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FE102", "INSERT INTO TXPBARAUD(BarCod, BarCodReo, BarCodPar, BarAudLin, BarAudPie, BarAudMts, BarAudCar, BarAudPar, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARAUD")
         ,new UpdateCursor("T01FE103", "UPDATE TXPBARAUD SET BarAudPie=?, BarAudMts=?, BarAudCar=?, BarAudPar=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAudLin = ?", GX_NOMASK, "TXPBARAUD")
         ,new UpdateCursor("T01FE104", "DELETE FROM TXPBARAUD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAudLin = ?", GX_NOMASK, "TXPBARAUD")
         ,new ForEachCursor("T01FE105", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FE106", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FE108", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FE110", "SELECT COALESCE( T1.BarAudMTab, 0) AS BarAudMTab FROM (SELECT SUM(BarAudMts) AS BarAudMTab, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAUD GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(28);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(30, 3);
               ((int[]) buf[40])[0] = rslt.getInt(31);
               ((int[]) buf[41])[0] = rslt.getInt(32);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(33, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(28);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(30, 3);
               ((int[]) buf[40])[0] = rslt.getInt(31);
               ((int[]) buf[41])[0] = rslt.getInt(32);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(33, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(26);
               ((String[]) buf[32])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(28);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(31);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(32);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(33, 1);
               ((String[]) buf[45])[0] = rslt.getString(34, 3);
               ((int[]) buf[46])[0] = rslt.getInt(35);
               ((int[]) buf[47])[0] = rslt.getInt(36);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 86 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((String[]) buf[13])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 93 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 94 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 1);
               }
               stmt.setString(7, (String)parms[10], 6);
               stmt.setString(8, (String)parms[11], 8);
               stmt.setDate(9, (java.util.Date)parms[12]);
               stmt.setString(10, (String)parms[13], 16);
               stmt.setString(11, (String)parms[14], 26);
               stmt.setString(12, (String)parms[15], 16);
               stmt.setInt(13, ((Number) parms[16]).intValue());
               stmt.setString(14, (String)parms[17], 13);
               stmt.setInt(15, ((Number) parms[18]).intValue());
               stmt.setByte(16, ((Number) parms[19]).byteValue());
               stmt.setByte(17, ((Number) parms[20]).byteValue());
               stmt.setString(18, (String)parms[21], 1);
               stmt.setString(19, (String)parms[22], 1);
               stmt.setString(20, (String)parms[23], 1);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[25]);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[31], 30);
               }
               stmt.setInt(25, ((Number) parms[32]).intValue());
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[44], 400);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[46], 3);
               }
               stmt.setInt(33, ((Number) parms[47]).intValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setString(3, (String)parms[3], 4);
               stmt.setString(4, (String)parms[4], 6);
               stmt.setString(5, (String)parms[5], 8);
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setString(7, (String)parms[7], 16);
               stmt.setString(8, (String)parms[8], 26);
               stmt.setString(9, (String)parms[9], 16);
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setString(11, (String)parms[11], 13);
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setString(15, (String)parms[15], 1);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setString(17, (String)parms[17], 1);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[19]);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[23]).intValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[25], 30);
               }
               stmt.setInt(22, ((Number) parms[26]).intValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[28], 30);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[38], 400);
               }
               stmt.setInt(29, ((Number) parms[39]).intValue());
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[41], 3);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[47], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 81 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 84 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
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
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 86 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 1);
               }
               stmt.setShort(15, ((Number) parms[18]).shortValue());
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 88 :
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setShort(4, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 9);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 4);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 3);
               }
               return;
            case 89 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 9);
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
                  stmt.setString(3, (String)parms[5], 4);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               stmt.setShort(9, ((Number) parms[16]).shortValue());
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setShort(5, ((Number) parms[8]).shortValue());
               return;
            case 91 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 92 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 93 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 94 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
      }
   }

}

