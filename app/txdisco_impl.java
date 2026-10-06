package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txdisco_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"DISDIBNUM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asadisdibnum14O34( A396EmprCod, A1013DibCli, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel36"+"_"+"DISPIEKGM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = httpContext.GetPar( "DisDes") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx36asadispiekgm14O34( A396EmprCod, A361DisCod, A365DisDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel37"+"_"+"DISPIEMTR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = httpContext.GetPar( "DisDes") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx37asadispiemtr14O34( A396EmprCod, A361DisCod, A365DisDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_62") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1031EmpesCod = httpContext.GetPar( "EmpesCod") ;
         n1031EmpesCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_62( A396EmprCod, A1031EmpesCod, A252CliCod, A1032FonCod) ;
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
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COMBINACIONES II", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbDisEst.getInternalname() ;
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
      nRC_GXsfl_250 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_250"))) ;
      nGXsfl_250_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_250_idx"))) ;
      sGXsfl_250_idx = httpContext.GetPar( "sGXsfl_250_idx") ;
      A2525DisComULin = (byte)(GXutil.lval( httpContext.GetPar( "DisComULin"))) ;
      n2525DisComULin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A334DisArtAnh = (short)(GXutil.lval( httpContext.GetPar( "DisArtAnh"))) ;
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

   public txdisco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txdisco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txdisco_impl.class ));
   }

   public txdisco_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPriCod = UIFactory.getCheckbox(this);
      cmbDisEst = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
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
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TxDISCO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Prioridad", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPriCod.getInternalname(), A757PriCod, "", "", 1, chkPriCod.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Disposicion Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Disposicion Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDisFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecCli_Internalname, localUtil.format(A370DisFecCli, "99/99/99"), localUtil.format( A370DisFecCli, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtDisFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TxDISCO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Articulo Disposicion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Disposicion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TxDISCO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDisFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecEnt_Internalname, localUtil.format(A371DisFecEnt, "99/99/99"), localUtil.format( A371DisFecEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TxDISCO.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Material", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtMat_Internalname, GXutil.rtrim( A340DisArtMat), GXutil.rtrim( localUtil.format( A340DisArtMat, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtMat_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Largo", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtLar_Internalname, GXutil.rtrim( A339DisArtLar), GXutil.rtrim( localUtil.format( A339DisArtLar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtLar_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtLar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTip_Internalname, GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTip_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Operacion Especial", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtOpe_Internalname, GXutil.rtrim( A341DisArtOpe), GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtOpe_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtOpe_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Trama1", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr1_Internalname, GXutil.rtrim( A353DisArtTr1), GXutil.rtrim( localUtil.format( A353DisArtTr1, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Porcentaje Trama1", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt1_Internalname, GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPt1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Trama2", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr2_Internalname, GXutil.rtrim( A354DisArtTr2), GXutil.rtrim( localUtil.format( A354DisArtTr2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Porcentaje Trama2", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt2_Internalname, GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPt2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Trama3", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr3_Internalname, GXutil.rtrim( A355DisArtTr3), GXutil.rtrim( localUtil.format( A355DisArtTr3, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr3_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Porcentaje Trama3", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt3_Internalname, GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt3_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPt3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Ancho Acabado Mínimo", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAcb_Internalname, GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAcb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAcb_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAcb_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAnh_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAnh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Total piezas dispuestas", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPiePie_Jsonclick, 0, "", "", "", "", "", 1, edtDisPiePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Metros Dispuestos / Dispos.", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieMtr_Enabled!=0) ? localUtil.format( A385DisPieMtr, "ZZZZZ9.99") : localUtil.format( A385DisPieMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Kilos Dispuestos Dispos.", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieKgm_Enabled!=0) ? localUtil.format( A381DisPieKgm, "ZZZZZ9.99") : localUtil.format( A381DisPieKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieKgm_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Estado Disposicion", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisEst, cmbDisEst.getInternalname(), GXutil.trim( GXutil.str( A367DisEst, 1, 0)), 1, cmbDisEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbDisEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "", true, (byte)(0), "HLP_TxDISCO.htm");
      cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Desglose", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", "", 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(161, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,161);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Numero Piezas", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumUni_Enabled!=0) ? localUtil.format( A375DisNumUni, "ZZZZZ9.99") : localUtil.format( A375DisNumUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumUni_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Código Empesa", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpesCod_Internalname, GXutil.rtrim( A1031EmpesCod), GXutil.rtrim( localUtil.format( A1031EmpesCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpesCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmpesCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Numero de Moldes/Cilindros", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCil_Internalname, GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCil_Jsonclick, 0, "", "", "", "", "", 1, edtDibMolCil_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDibNum_Internalname, GXutil.ltrim( localUtil.ntoc( A1053DisDibNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDibNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1053DisDibNum), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1053DisDibNum), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDibNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisDibNum_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Número de Colores", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A1051DisNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1051DisNumCol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1051DisNumCol), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumCol_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObs_Internalname, GXutil.rtrim( A1052DisObs), GXutil.rtrim( localUtil.format( A1052DisObs, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObs_Jsonclick, 0, "", "", "", "", "", 1, edtDisObs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "TotNPie", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotNPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1054TotNPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotNPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1054TotNPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1054TotNPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotNPie_Jsonclick, 0, "", "", "", "", "", 1, edtTotNPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Total Metros Combinaciones", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotNUni_Internalname, GXutil.ltrim( localUtil.ntoc( A1055TotNUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotNUni_Enabled!=0) ? localUtil.format( A1055TotNUni, "ZZZZZ9.99") : localUtil.format( A1055TotNUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotNUni_Jsonclick, 0, "", "", "", "", "", 1, edtTotNUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Ultima linea Combinacion", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisComULin_Internalname, GXutil.ltrim( localUtil.ntoc( A2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisComULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2525DisComULin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2525DisComULin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisComULin_Jsonclick, 0, "", "", "", "", "", 1, edtDisComULin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Tipo Maquina", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMqnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3911TipMqnCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipMqnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3911TipMqnCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3911TipMqnCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMqnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipMqnCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMqnDsc_Internalname, GXutil.rtrim( A3912TipMqnDsc), GXutil.rtrim( localUtil.format( A3912TipMqnDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMqnDsc_Jsonclick, 0, "", "", "", "", "", 1, edtTipMqnDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Metros Realizados", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMetRea_Internalname, GXutil.ltrim( localUtil.ntoc( A1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMetRea_Enabled!=0) ? localUtil.format( A1018DibMetRea, "ZZZZZ9.99") : localUtil.format( A1018DibMetRea, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMetRea_Jsonclick, 0, "", "", "", "", "", 1, edtDibMetRea_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TxDISCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol250( ) ;
      nGXsfl_250_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount551 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_551 = (short)(1) ;
            scanStart14O551( ) ;
            while ( RcdFound551 != 0 )
            {
               init_level_properties551( ) ;
               getByPrimaryKey14O551( ) ;
               addRow14O551( ) ;
               scanNext14O551( ) ;
            }
            scanEnd14O551( ) ;
            nBlankRcdCount551 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1018DibMetRea = A1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         B2525DisComULin = A2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         B1054TotNPie = A1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         B1055TotNUni = A1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         standaloneNotModal14O551( ) ;
         standaloneModal14O551( ) ;
         sMode551 = Gx_mode ;
         while ( nGXsfl_250_idx < nRC_GXsfl_250 )
         {
            bGXsfl_250_Refreshing = true ;
            readRow14O551( ) ;
            edtavnRcdDeleted_551_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_551_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_551_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_551_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtDisComAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMANH_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComAnh_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtDisComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTR_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMtr_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtDisComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMPIE_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComPie_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtEmpesPDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPESPDIS_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmpesPDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesPDis_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtEmpesUDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPESUDIS_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEmpesUDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesUDis_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            edtDisComObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMOBS_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComObs_Enabled), 5, 0), !bGXsfl_250_Refreshing);
            if ( ( nRcdExists_551 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal14O551( ) ;
            }
            sendRow14O551( ) ;
            bGXsfl_250_Refreshing = false ;
         }
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1018DibMetRea = B1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A2525DisComULin = B2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A1054TotNPie = B1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = B1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount551 = (short)(5) ;
         nRcdExists_551 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart14O551( ) ;
            while ( RcdFound551 != 0 )
            {
               sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_250551( ) ;
               init_level_properties551( ) ;
               standaloneNotModal14O551( ) ;
               getByPrimaryKey14O551( ) ;
               standaloneModal14O551( ) ;
               addRow14O551( ) ;
               scanNext14O551( ) ;
            }
            scanEnd14O551( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode551 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_250551( ) ;
      initAll14O551( ) ;
      init_level_properties551( ) ;
      B1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      B2525DisComULin = A2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      B1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      B1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      nRcdExists_551 = (short)(0) ;
      nIsMod_551 = (short)(0) ;
      nRcdDeleted_551 = (short)(0) ;
      nBlankRcdCount551 = (short)(nBlankRcdUsr551+nBlankRcdCount551) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount551 > 0 )
      {
         standaloneNotModal14O551( ) ;
         standaloneModal14O551( ) ;
         addRow14O551( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisComLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount551 = (short)(nBlankRcdCount551-1) ;
      }
      Gx_mode = sMode551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1018DibMetRea = B1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      A2525DisComULin = B2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A1054TotNPie = B1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      A1055TotNUni = B1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 263,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 265,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TxDISCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 267,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TxDISCO.htm");
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
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z757PriCod = httpContext.cgiGet( "Z757PriCod") ;
         Z360DisCliNum = httpContext.cgiGet( "Z360DisCliNum") ;
         Z370DisFecCli = localUtil.ctod( httpContext.cgiGet( "Z370DisFecCli"), 0) ;
         Z335DisArtCod = httpContext.cgiGet( "Z335DisArtCod") ;
         Z369DisFec = localUtil.ctod( httpContext.cgiGet( "Z369DisFec"), 0) ;
         Z371DisFecEnt = localUtil.ctod( httpContext.cgiGet( "Z371DisFecEnt"), 0) ;
         Z340DisArtMat = httpContext.cgiGet( "Z340DisArtMat") ;
         Z337DisArtDsc = httpContext.cgiGet( "Z337DisArtDsc") ;
         Z339DisArtLar = httpContext.cgiGet( "Z339DisArtLar") ;
         Z352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z352DisArtTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z341DisArtOpe = httpContext.cgiGet( "Z341DisArtOpe") ;
         Z353DisArtTr1 = httpContext.cgiGet( "Z353DisArtTr1") ;
         Z344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z344DisArtPt1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z354DisArtTr2 = httpContext.cgiGet( "Z354DisArtTr2") ;
         Z345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z345DisArtPt2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z355DisArtTr3 = httpContext.cgiGet( "Z355DisArtTr3") ;
         Z346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z346DisArtPt3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( "Z1232DisArtAcb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( "Z334DisArtAnh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z367DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z367DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z365DisDes = httpContext.cgiGet( "Z365DisDes") ;
         Z374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z374DisNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z375DisNumUni = localUtil.ctond( httpContext.cgiGet( "Z375DisNumUni")) ;
         Z392DisUniMed = httpContext.cgiGet( "Z392DisUniMed") ;
         Z1031EmpesCod = httpContext.cgiGet( "Z1031EmpesCod") ;
         Z1051DisNumCol = (short)(localUtil.ctol( httpContext.cgiGet( "Z1051DisNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1052DisObs = httpContext.cgiGet( "Z1052DisObs") ;
         Z2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2525DisComULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z362DisColNom = httpContext.cgiGet( "Z362DisColNom") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
         Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1019DibMolCil = (short)(localUtil.ctol( httpContext.cgiGet( "Z1019DibMolCil"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1018DibMetRea = localUtil.ctond( httpContext.cgiGet( "Z1018DibMetRea")) ;
         Z3911TipMqnCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3911TipMqnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O1018DibMetRea = localUtil.ctond( httpContext.cgiGet( "O1018DibMetRea")) ;
         O2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( "O2525DisComULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O1054TotNPie = (short)(localUtil.ctol( httpContext.cgiGet( "O1054TotNPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O1055TotNUni = localUtil.ctond( httpContext.cgiGet( "O1055TotNUni")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_250 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_250"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV63UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV18EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV19DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1036EmpesUEnt = localUtil.ctond( httpContext.cgiGet( "EMPESUENT")) ;
         A1038EmpesUUti = localUtil.ctond( httpContext.cgiGet( "EMPESUUTI")) ;
         A1035EmpesPEnt = (int)(localUtil.ctol( httpContext.cgiGet( "EMPESPENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1037EmpesPUti = (int)(localUtil.ctol( httpContext.cgiGet( "EMPESPUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21OldPie = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV22OldMtr = localUtil.ctond( httpContext.cgiGet( "vOLDMTR")) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = localUtil.ctod( httpContext.cgiGet( edtDisFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A339DisArtLar = httpContext.cgiGet( edtDisArtLar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A341DisArtOpe = GXutil.upper( httpContext.cgiGet( edtDisArtOpe_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         cmbDisEst.setName( cmbDisEst.getInternalname() );
         cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
         A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A1031EmpesCod = httpContext.cgiGet( edtEmpesCod_Internalname) ;
         n1031EmpesCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
         A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A1019DibMolCil = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1019DibMolCil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A1053DisDibNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisDibNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1053DisDibNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1053DisDibNum), 8, 0));
         A1051DisNumCol = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1051DisNumCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
         A1052DisObs = httpContext.cgiGet( edtDisObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         A1054TotNPie = (short)(localUtil.ctol( httpContext.cgiGet( edtTotNPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = localUtil.ctond( httpContext.cgiGet( edtTotNUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         A2525DisComULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A3911TipMqnCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipMqnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3911TipMqnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3911TipMqnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3911TipMqnCod), 2, 0));
         A3912TipMqnDsc = httpContext.cgiGet( edtTipMqnDsc_Internalname) ;
         n3912TipMqnDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3912TipMqnDsc", A3912TipMqnDsc);
         A1018DibMetRea = localUtil.ctond( httpContext.cgiGet( edtDibMetRea_Internalname)) ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
         n362DisColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TxDISCO");
         A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         forbiddenHiddens.add("PriCod", GXutil.rtrim( localUtil.format( A757PriCod, "9")));
         A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         forbiddenHiddens.add("DisCliNum", GXutil.rtrim( localUtil.format( A360DisCliNum, "")));
         A370DisFecCli = localUtil.ctod( httpContext.cgiGet( edtDisFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         forbiddenHiddens.add("DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
         A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         forbiddenHiddens.add("DisArtCod", GXutil.rtrim( localUtil.format( A335DisArtCod, "")));
         A369DisFec = localUtil.ctod( httpContext.cgiGet( edtDisFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         forbiddenHiddens.add("DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = localUtil.ctod( httpContext.cgiGet( edtDisFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         forbiddenHiddens.add("DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         forbiddenHiddens.add("DisArtMat", GXutil.rtrim( localUtil.format( A340DisArtMat, "")));
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         forbiddenHiddens.add("DisArtDsc", GXutil.rtrim( localUtil.format( A337DisArtDsc, "")));
         A339DisArtLar = httpContext.cgiGet( edtDisArtLar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         forbiddenHiddens.add("DisArtLar", GXutil.rtrim( localUtil.format( A339DisArtLar, "")));
         A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         forbiddenHiddens.add("DisArtTip", localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"));
         A341DisArtOpe = httpContext.cgiGet( edtDisArtOpe_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         forbiddenHiddens.add("DisArtOpe", GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")));
         A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         forbiddenHiddens.add("DisArtTr1", GXutil.rtrim( localUtil.format( A353DisArtTr1, "")));
         A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         forbiddenHiddens.add("DisArtPt1", localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"));
         A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         forbiddenHiddens.add("DisArtTr2", GXutil.rtrim( localUtil.format( A354DisArtTr2, "")));
         A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         forbiddenHiddens.add("DisArtPt2", localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"));
         A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         forbiddenHiddens.add("DisArtTr3", GXutil.rtrim( localUtil.format( A355DisArtTr3, "")));
         A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         forbiddenHiddens.add("DisArtPt3", localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"));
         A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         forbiddenHiddens.add("DisArtAcb", localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"));
         A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         forbiddenHiddens.add("DisArtAnh", localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"));
         A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         forbiddenHiddens.add("DisNumPie", localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"));
         A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         forbiddenHiddens.add("DisNumUni", localUtil.format( A375DisNumUni, "ZZZZZ9.99"));
         A1031EmpesCod = httpContext.cgiGet( edtEmpesCod_Internalname) ;
         n1031EmpesCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
         forbiddenHiddens.add("EmpesCod", GXutil.rtrim( localUtil.format( A1031EmpesCod, "")));
         A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         forbiddenHiddens.add("DibCli", GXutil.rtrim( localUtil.format( A1013DibCli, "")));
         A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         forbiddenHiddens.add("DibInt", localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"));
         A1051DisNumCol = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1051DisNumCol = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
         forbiddenHiddens.add("DisNumCol", localUtil.format( DecimalUtil.doubleToDec(A1051DisNumCol), "ZZZ9"));
         A1052DisObs = httpContext.cgiGet( edtDisObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         forbiddenHiddens.add("DisObs", GXutil.rtrim( localUtil.format( A1052DisObs, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("txdisco:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
            initAll14O34( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_551_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_551_Enabled), 5, 0), !bGXsfl_250_Refreshing);
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
      disableAttributes14O34( ) ;
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

   public void confirm_14O0( )
   {
      beforeValidate14O34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls14O34( ) ;
         }
         else
         {
            checkExtendedTable14O34( ) ;
            if ( AnyError == 0 )
            {
               zm14O34( 55) ;
               zm14O34( 56) ;
               zm14O34( 57) ;
               zm14O34( 58) ;
               zm14O34( 59) ;
               zm14O34( 60) ;
            }
            closeExtendedTableCursors14O34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_14O551( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues14O0( ) ;
      }
   }

   public void confirm_14O551( )
   {
      s1018DibMetRea = O1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      s2525DisComULin = O2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      s1054TotNPie = O1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      s1055TotNUni = O1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      nGXsfl_250_idx = 0 ;
      while ( nGXsfl_250_idx < nRC_GXsfl_250 )
      {
         readRow14O551( ) ;
         if ( ( nRcdExists_551 != 0 ) || ( nIsMod_551 != 0 ) )
         {
            getKey14O551( ) ;
            if ( ( nRcdExists_551 == 0 ) && ( nRcdDeleted_551 == 0 ) )
            {
               if ( RcdFound551 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate14O551( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable14O551( ) ;
                     if ( AnyError == 0 )
                     {
                        zm14O551( 62) ;
                     }
                     closeExtendedTableCursors14O551( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1018DibMetRea = A1018DibMetRea ;
                     n1018DibMetRea = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                     O2525DisComULin = A2525DisComULin ;
                     n2525DisComULin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                     O1054TotNPie = A1054TotNPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                     O1055TotNUni = A1055TotNUni ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "DISCOMLIN_" + sGXsfl_250_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisComLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound551 != 0 )
               {
                  if ( nRcdDeleted_551 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey14O551( ) ;
                     load14O551( ) ;
                     beforeValidate14O551( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls14O551( ) ;
                        O1018DibMetRea = A1018DibMetRea ;
                        n1018DibMetRea = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                        O2525DisComULin = A2525DisComULin ;
                        n2525DisComULin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                        O1054TotNPie = A1054TotNPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                        O1055TotNUni = A1055TotNUni ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_551 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate14O551( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable14O551( ) ;
                           if ( AnyError == 0 )
                           {
                              zm14O551( 62) ;
                           }
                           closeExtendedTableCursors14O551( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1018DibMetRea = A1018DibMetRea ;
                           n1018DibMetRea = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                           O2525DisComULin = A2525DisComULin ;
                           n2525DisComULin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                           O1054TotNPie = A1054TotNPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                           O1055TotNUni = A1055TotNUni ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_551 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_250_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_551_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtDisComAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpesPDis_Internalname, GXutil.ltrim( localUtil.ntoc( A1039EmpesPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpesUDis_Internalname, GXutil.ltrim( localUtil.ntoc( A1040EmpesUDis, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComObs_Internalname, GXutil.rtrim( A7735DisComObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_250_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_250_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_250_idx, GXutil.rtrim( Z7735DisComObs)) ;
         httpContext.changePostValue( "T1058DisComMtr_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1059DisComPie_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( O1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_551_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_551_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_551_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_551 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_551_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMANH_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTR_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMPIE_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPESPDIS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesPDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPESUDIS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesUDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMOBS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1018DibMetRea = s1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      O2525DisComULin = s2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      O1054TotNPie = s1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      O1055TotNUni = s1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption14O0( )
   {
   }

   public void zm14O34( int GX_JID )
   {
      if ( ( GX_JID == 54 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z757PriCod = T014O7_A757PriCod[0] ;
            Z360DisCliNum = T014O7_A360DisCliNum[0] ;
            Z370DisFecCli = T014O7_A370DisFecCli[0] ;
            Z335DisArtCod = T014O7_A335DisArtCod[0] ;
            Z369DisFec = T014O7_A369DisFec[0] ;
            Z371DisFecEnt = T014O7_A371DisFecEnt[0] ;
            Z340DisArtMat = T014O7_A340DisArtMat[0] ;
            Z337DisArtDsc = T014O7_A337DisArtDsc[0] ;
            Z339DisArtLar = T014O7_A339DisArtLar[0] ;
            Z352DisArtTip = T014O7_A352DisArtTip[0] ;
            Z341DisArtOpe = T014O7_A341DisArtOpe[0] ;
            Z353DisArtTr1 = T014O7_A353DisArtTr1[0] ;
            Z344DisArtPt1 = T014O7_A344DisArtPt1[0] ;
            Z354DisArtTr2 = T014O7_A354DisArtTr2[0] ;
            Z345DisArtPt2 = T014O7_A345DisArtPt2[0] ;
            Z355DisArtTr3 = T014O7_A355DisArtTr3[0] ;
            Z346DisArtPt3 = T014O7_A346DisArtPt3[0] ;
            Z1232DisArtAcb = T014O7_A1232DisArtAcb[0] ;
            Z334DisArtAnh = T014O7_A334DisArtAnh[0] ;
            Z367DisEst = T014O7_A367DisEst[0] ;
            Z365DisDes = T014O7_A365DisDes[0] ;
            Z374DisNumPie = T014O7_A374DisNumPie[0] ;
            Z375DisNumUni = T014O7_A375DisNumUni[0] ;
            Z392DisUniMed = T014O7_A392DisUniMed[0] ;
            Z1031EmpesCod = T014O7_A1031EmpesCod[0] ;
            Z1051DisNumCol = T014O7_A1051DisNumCol[0] ;
            Z1052DisObs = T014O7_A1052DisObs[0] ;
            Z2525DisComULin = T014O7_A2525DisComULin[0] ;
            Z362DisColNom = T014O7_A362DisColNom[0] ;
            Z252CliCod = T014O7_A252CliCod[0] ;
            Z1013DibCli = T014O7_A1013DibCli[0] ;
            Z1014DibInt = T014O7_A1014DibInt[0] ;
         }
         else
         {
            Z757PriCod = A757PriCod ;
            Z360DisCliNum = A360DisCliNum ;
            Z370DisFecCli = A370DisFecCli ;
            Z335DisArtCod = A335DisArtCod ;
            Z369DisFec = A369DisFec ;
            Z371DisFecEnt = A371DisFecEnt ;
            Z340DisArtMat = A340DisArtMat ;
            Z337DisArtDsc = A337DisArtDsc ;
            Z339DisArtLar = A339DisArtLar ;
            Z352DisArtTip = A352DisArtTip ;
            Z341DisArtOpe = A341DisArtOpe ;
            Z353DisArtTr1 = A353DisArtTr1 ;
            Z344DisArtPt1 = A344DisArtPt1 ;
            Z354DisArtTr2 = A354DisArtTr2 ;
            Z345DisArtPt2 = A345DisArtPt2 ;
            Z355DisArtTr3 = A355DisArtTr3 ;
            Z346DisArtPt3 = A346DisArtPt3 ;
            Z1232DisArtAcb = A1232DisArtAcb ;
            Z334DisArtAnh = A334DisArtAnh ;
            Z367DisEst = A367DisEst ;
            Z365DisDes = A365DisDes ;
            Z374DisNumPie = A374DisNumPie ;
            Z375DisNumUni = A375DisNumUni ;
            Z392DisUniMed = A392DisUniMed ;
            Z1031EmpesCod = A1031EmpesCod ;
            Z1051DisNumCol = A1051DisNumCol ;
            Z1052DisObs = A1052DisObs ;
            Z2525DisComULin = A2525DisComULin ;
            Z362DisColNom = A362DisColNom ;
            Z252CliCod = A252CliCod ;
            Z1013DibCli = A1013DibCli ;
            Z1014DibInt = A1014DibInt ;
         }
      }
      if ( ( GX_JID == 57 ) || ( GX_JID == 0 ) )
      {
         Z1019DibMolCil = T014O11_A1019DibMolCil[0] ;
         Z1018DibMetRea = T014O11_A1018DibMetRea[0] ;
         Z3911TipMqnCod = T014O11_A3911TipMqnCod[0] ;
      }
      if ( GX_JID == -54 )
      {
         Z361DisCod = A361DisCod ;
         Z757PriCod = A757PriCod ;
         Z360DisCliNum = A360DisCliNum ;
         Z370DisFecCli = A370DisFecCli ;
         Z335DisArtCod = A335DisArtCod ;
         Z369DisFec = A369DisFec ;
         Z371DisFecEnt = A371DisFecEnt ;
         Z340DisArtMat = A340DisArtMat ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z339DisArtLar = A339DisArtLar ;
         Z352DisArtTip = A352DisArtTip ;
         Z341DisArtOpe = A341DisArtOpe ;
         Z353DisArtTr1 = A353DisArtTr1 ;
         Z344DisArtPt1 = A344DisArtPt1 ;
         Z354DisArtTr2 = A354DisArtTr2 ;
         Z345DisArtPt2 = A345DisArtPt2 ;
         Z355DisArtTr3 = A355DisArtTr3 ;
         Z346DisArtPt3 = A346DisArtPt3 ;
         Z1232DisArtAcb = A1232DisArtAcb ;
         Z334DisArtAnh = A334DisArtAnh ;
         Z367DisEst = A367DisEst ;
         Z365DisDes = A365DisDes ;
         Z374DisNumPie = A374DisNumPie ;
         Z375DisNumUni = A375DisNumUni ;
         Z392DisUniMed = A392DisUniMed ;
         Z1031EmpesCod = A1031EmpesCod ;
         Z1051DisNumCol = A1051DisNumCol ;
         Z1052DisObs = A1052DisObs ;
         Z2525DisComULin = A2525DisComULin ;
         Z362DisColNom = A362DisColNom ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z1019DibMolCil = A1019DibMolCil ;
         Z1018DibMetRea = A1018DibMetRea ;
         Z3911TipMqnCod = A3911TipMqnCod ;
         Z3912TipMqnDsc = A3912TipMqnDsc ;
         Z387DisPiePie = A387DisPiePie ;
         Z1054TotNPie = A1054TotNPie ;
         Z1055TotNUni = A1055TotNUni ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV63UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63UsurCod", AV63UsurCod);
      }
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtLar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtLar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtLar_Enabled), 5, 0), true);
      edtDisArtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtMat_Enabled), 5, 0), true);
      edtDisArtTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTip_Enabled), 5, 0), true);
      edtDisArtTr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr1_Enabled), 5, 0), true);
      edtDisArtTr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr2_Enabled), 5, 0), true);
      edtDisArtTr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr3_Enabled), 5, 0), true);
      edtDisArtPt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt1_Enabled), 5, 0), true);
      edtDisArtPt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt2_Enabled), 5, 0), true);
      edtDisArtPt3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt3_Enabled), 5, 0), true);
      edtDisArtAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAnh_Enabled), 5, 0), true);
      edtDisArtAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAcb_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtDisArtOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtOpe_Enabled), 5, 0), true);
      edtEmpesCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesCod_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtDisNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDisNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCol_Enabled), 5, 0), true);
      edtDisObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObs_Enabled), 5, 0), true);
      edtDisCliNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Enabled), 5, 0), true);
      edtDisFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtDisFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecEnt_Enabled), 5, 0), true);
      chkPriCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "Enabled", GXutil.ltrimstr( chkPriCod.getEnabled(), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtLar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtLar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtLar_Enabled), 5, 0), true);
      edtDisArtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtMat_Enabled), 5, 0), true);
      edtDisArtTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTip_Enabled), 5, 0), true);
      edtDisArtTr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr1_Enabled), 5, 0), true);
      edtDisArtTr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr2_Enabled), 5, 0), true);
      edtDisArtTr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr3_Enabled), 5, 0), true);
      edtDisArtPt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt1_Enabled), 5, 0), true);
      edtDisArtPt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt2_Enabled), 5, 0), true);
      edtDisArtPt3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt3_Enabled), 5, 0), true);
      edtDisArtAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAnh_Enabled), 5, 0), true);
      edtDisArtAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAcb_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtDisArtOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtOpe_Enabled), 5, 0), true);
      edtEmpesCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesCod_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtDisNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDisNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCol_Enabled), 5, 0), true);
      edtDisObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObs_Enabled), 5, 0), true);
      edtDisCliNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Enabled), 5, 0), true);
      edtDisFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtDisFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecEnt_Enabled), 5, 0), true);
      chkPriCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "Enabled", GXutil.ltrimstr( chkPriCod.getEnabled(), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      /* Using cursor T014O8 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T014O8_A407EmprNom[0] ;
      n407EmprNom = T014O8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      AV18EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      /* Using cursor T014O14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A387DisPiePie = T014O14_A387DisPiePie[0] ;
         n387DisPiePie = T014O14_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(10);
      /* Using cursor T014O16 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A1054TotNPie = T014O16_A1054TotNPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = T014O16_A1055TotNUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         A1054TotNPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      O1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      O1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      pr_default.close(11);
      AV19DisCod = A361DisCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19DisCod), 8, 0));
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
      /* Using cursor T014O9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T014O9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      GXt_int1 = A1053DisDibNum ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A1013DibCli ;
      GXv_int4[0] = A252CliCod ;
      GXv_int5[0] = GXt_int1 ;
      new app.pdibint(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_int5) ;
      txdisco_impl.this.A396EmprCod = GXv_char2[0] ;
      txdisco_impl.this.A1013DibCli = GXv_char3[0] ;
      txdisco_impl.this.A252CliCod = GXv_int4[0] ;
      txdisco_impl.this.GXt_int1 = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1053DisDibNum = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1053DisDibNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1053DisDibNum), 8, 0));
      /* Using cursor T014O11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      zm14O34( 57) ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
         }
      }
      A1019DibMolCil = T014O11_A1019DibMolCil[0] ;
      n1019DibMolCil = T014O11_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A1018DibMetRea = T014O11_A1018DibMetRea[0] ;
      n1018DibMetRea = T014O11_n1018DibMetRea[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      A3911TipMqnCod = T014O11_A3911TipMqnCod[0] ;
      n3911TipMqnCod = T014O11_n3911TipMqnCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3911TipMqnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3911TipMqnCod), 2, 0));
      O1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      pr_default.close(7);
      /* Using cursor T014O12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n3911TipMqnCod), Byte.valueOf(A3911TipMqnCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A3911TipMqnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMQN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMQNCOD");
            AnyError = (short)(1) ;
         }
      }
      A3912TipMqnDsc = T014O12_A3912TipMqnDsc[0] ;
      n3912TipMqnDsc = T014O12_n3912TipMqnDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3912TipMqnDsc", A3912TipMqnDsc);
      pr_default.close(9);
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

   public void load14O34( )
   {
      /* Using cursor T014O19 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A757PriCod = T014O19_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A407EmprNom = T014O19_A407EmprNom[0] ;
         n407EmprNom = T014O19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A360DisCliNum = T014O19_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = T014O19_A370DisFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A279CliNom = T014O19_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T014O19_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = T014O19_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = T014O19_A371DisFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A340DisArtMat = T014O19_A340DisArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         A337DisArtDsc = T014O19_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A339DisArtLar = T014O19_A339DisArtLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         A352DisArtTip = T014O19_A352DisArtTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A341DisArtOpe = T014O19_A341DisArtOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         A353DisArtTr1 = T014O19_A353DisArtTr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = T014O19_A344DisArtPt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = T014O19_A354DisArtTr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = T014O19_A345DisArtPt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = T014O19_A355DisArtTr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = T014O19_A346DisArtPt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A1232DisArtAcb = T014O19_A1232DisArtAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A334DisArtAnh = T014O19_A334DisArtAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A367DisEst = T014O19_A367DisEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A365DisDes = T014O19_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = T014O19_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = T014O19_A375DisNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = T014O19_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A1031EmpesCod = T014O19_A1031EmpesCod[0] ;
         n1031EmpesCod = T014O19_n1031EmpesCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
         A1019DibMolCil = T014O19_A1019DibMolCil[0] ;
         n1019DibMolCil = T014O19_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A1051DisNumCol = T014O19_A1051DisNumCol[0] ;
         n1051DisNumCol = T014O19_n1051DisNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
         A1052DisObs = T014O19_A1052DisObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         A2525DisComULin = T014O19_A2525DisComULin[0] ;
         n2525DisComULin = T014O19_n2525DisComULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A3912TipMqnDsc = T014O19_A3912TipMqnDsc[0] ;
         n3912TipMqnDsc = T014O19_n3912TipMqnDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3912TipMqnDsc", A3912TipMqnDsc);
         A1018DibMetRea = T014O19_A1018DibMetRea[0] ;
         n1018DibMetRea = T014O19_n1018DibMetRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A362DisColNom = T014O19_A362DisColNom[0] ;
         n362DisColNom = T014O19_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A252CliCod = T014O19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T014O19_A1013DibCli[0] ;
         n1013DibCli = T014O19_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T014O19_A1014DibInt[0] ;
         n1014DibInt = T014O19_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A3911TipMqnCod = T014O19_A3911TipMqnCod[0] ;
         n3911TipMqnCod = T014O19_n3911TipMqnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3911TipMqnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3911TipMqnCod), 2, 0));
         A387DisPiePie = T014O19_A387DisPiePie[0] ;
         n387DisPiePie = T014O19_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         A1054TotNPie = T014O19_A1054TotNPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = T014O19_A1055TotNUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         zm14O34( -54) ;
      }
      pr_default.close(12);
      onLoadActions14O34( ) ;
   }

   public void onLoadActions14O34( )
   {
      O1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      O1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      O1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
   }

   public void checkExtendedTable14O34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            nIsDirty_34 = (short)(1) ;
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            nIsDirty_34 = (short)(1) ;
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            nIsDirty_34 = (short)(1) ;
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            nIsDirty_34 = (short)(1) ;
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISDES");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisDes.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors14O34( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey14O34( )
   {
      /* Using cursor T014O20 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T014O7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T014O7_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T014O7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm14O34( 54) ;
         RcdFound34 = (short)(1) ;
         A1031EmpesCod = T014O7_A1031EmpesCod[0] ;
         n1031EmpesCod = T014O7_n1031EmpesCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
         A252CliCod = T014O7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A757PriCod = T014O7_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A360DisCliNum = T014O7_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = T014O7_A370DisFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A335DisArtCod = T014O7_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = T014O7_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = T014O7_A371DisFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A340DisArtMat = T014O7_A340DisArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         A337DisArtDsc = T014O7_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A339DisArtLar = T014O7_A339DisArtLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         A352DisArtTip = T014O7_A352DisArtTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A341DisArtOpe = T014O7_A341DisArtOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         A353DisArtTr1 = T014O7_A353DisArtTr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = T014O7_A344DisArtPt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = T014O7_A354DisArtTr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = T014O7_A345DisArtPt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = T014O7_A355DisArtTr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = T014O7_A346DisArtPt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A1232DisArtAcb = T014O7_A1232DisArtAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A334DisArtAnh = T014O7_A334DisArtAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A367DisEst = T014O7_A367DisEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A365DisDes = T014O7_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = T014O7_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = T014O7_A375DisNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = T014O7_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A1051DisNumCol = T014O7_A1051DisNumCol[0] ;
         n1051DisNumCol = T014O7_n1051DisNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
         A1052DisObs = T014O7_A1052DisObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         A2525DisComULin = T014O7_A2525DisComULin[0] ;
         n2525DisComULin = T014O7_n2525DisComULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A362DisColNom = T014O7_A362DisColNom[0] ;
         n362DisColNom = T014O7_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A1013DibCli = T014O7_A1013DibCli[0] ;
         n1013DibCli = T014O7_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T014O7_A1014DibInt[0] ;
         n1014DibInt = T014O7_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         O2525DisComULin = A2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load14O34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey14O34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey14O34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey14O34( ) ;
      if ( RcdFound34 == 0 )
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
      RcdFound34 = (short)(0) ;
      /* Using cursor T014O21 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T014O21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T014O21_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( GXutil.strcmp(T014O21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T014O21_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T014O22 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T014O22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T014O22_A361DisCod[0] == A361DisCod ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T014O22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T014O22_A361DisCod[0] == A361DisCod ) )
         {
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey14O34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1018DibMetRea = O1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A2525DisComULin = O2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A1054TotNPie = O1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = O1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         GX_FocusControl = cmbDisEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert14O34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbDisEst.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               update14O34( ) ;
               GX_FocusControl = cmbDisEst.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               GX_FocusControl = cmbDisEst.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert14O34( ) ;
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
                  A1018DibMetRea = O1018DibMetRea ;
                  n1018DibMetRea = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                  A2525DisComULin = O2525DisComULin ;
                  n2525DisComULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                  A1054TotNPie = O1054TotNPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                  A1055TotNUni = O1055TotNUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
                  GX_FocusControl = cmbDisEst.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert14O34( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1018DibMetRea = O1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         A2525DisComULin = O2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         A1054TotNPie = O1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = O1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbDisEst.getInternalname() ;
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
      getKey14O34( ) ;
      if ( RcdFound34 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txdisco");
      GX_FocusControl = cmbDisEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_14O0( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = cmbDisEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart14O34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbDisEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd14O34( ) ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbDisEst.getInternalname() ;
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
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbDisEst.getInternalname() ;
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
      scanStart14O34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext14O34( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = cmbDisEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd14O34( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency14O34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T014O6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z757PriCod, T014O6_A757PriCod[0]) != 0 ) || ( GXutil.strcmp(Z360DisCliNum, T014O6_A360DisCliNum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(T014O6_A370DisFecCli[0])) ) || ( GXutil.strcmp(Z335DisArtCod, T014O6_A335DisArtCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(T014O6_A369DisFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(T014O6_A371DisFecEnt[0])) ) || ( GXutil.strcmp(Z340DisArtMat, T014O6_A340DisArtMat[0]) != 0 ) || ( GXutil.strcmp(Z337DisArtDsc, T014O6_A337DisArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z339DisArtLar, T014O6_A339DisArtLar[0]) != 0 ) || ( Z352DisArtTip != T014O6_A352DisArtTip[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z341DisArtOpe, T014O6_A341DisArtOpe[0]) != 0 ) || ( GXutil.strcmp(Z353DisArtTr1, T014O6_A353DisArtTr1[0]) != 0 ) || ( Z344DisArtPt1 != T014O6_A344DisArtPt1[0] ) || ( GXutil.strcmp(Z354DisArtTr2, T014O6_A354DisArtTr2[0]) != 0 ) || ( Z345DisArtPt2 != T014O6_A345DisArtPt2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z355DisArtTr3, T014O6_A355DisArtTr3[0]) != 0 ) || ( Z346DisArtPt3 != T014O6_A346DisArtPt3[0] ) || ( Z1232DisArtAcb != T014O6_A1232DisArtAcb[0] ) || ( Z334DisArtAnh != T014O6_A334DisArtAnh[0] ) || ( Z367DisEst != T014O6_A367DisEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z365DisDes, T014O6_A365DisDes[0]) != 0 ) || ( Z374DisNumPie != T014O6_A374DisNumPie[0] ) || ( DecimalUtil.compareTo(Z375DisNumUni, T014O6_A375DisNumUni[0]) != 0 ) || ( GXutil.strcmp(Z392DisUniMed, T014O6_A392DisUniMed[0]) != 0 ) || ( GXutil.strcmp(Z1031EmpesCod, T014O6_A1031EmpesCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1051DisNumCol != T014O6_A1051DisNumCol[0] ) || ( GXutil.strcmp(Z1052DisObs, T014O6_A1052DisObs[0]) != 0 ) || ( Z2525DisComULin != T014O6_A2525DisComULin[0] ) || ( GXutil.strcmp(Z362DisColNom, T014O6_A362DisColNom[0]) != 0 ) || ( Z252CliCod != T014O6_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1013DibCli, T014O6_A1013DibCli[0]) != 0 ) || ( Z1014DibInt != T014O6_A1014DibInt[0] ) )
         {
            if ( GXutil.strcmp(Z757PriCod, T014O6_A757PriCod[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"PriCod");
               GXutil.writeLogRaw("Old: ",Z757PriCod);
               GXutil.writeLogRaw("Current: ",T014O6_A757PriCod[0]);
            }
            if ( GXutil.strcmp(Z360DisCliNum, T014O6_A360DisCliNum[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisCliNum");
               GXutil.writeLogRaw("Old: ",Z360DisCliNum);
               GXutil.writeLogRaw("Current: ",T014O6_A360DisCliNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(T014O6_A370DisFecCli[0])) ) )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisFecCli");
               GXutil.writeLogRaw("Old: ",Z370DisFecCli);
               GXutil.writeLogRaw("Current: ",T014O6_A370DisFecCli[0]);
            }
            if ( GXutil.strcmp(Z335DisArtCod, T014O6_A335DisArtCod[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtCod");
               GXutil.writeLogRaw("Old: ",Z335DisArtCod);
               GXutil.writeLogRaw("Current: ",T014O6_A335DisArtCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(T014O6_A369DisFec[0])) ) )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisFec");
               GXutil.writeLogRaw("Old: ",Z369DisFec);
               GXutil.writeLogRaw("Current: ",T014O6_A369DisFec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(T014O6_A371DisFecEnt[0])) ) )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisFecEnt");
               GXutil.writeLogRaw("Old: ",Z371DisFecEnt);
               GXutil.writeLogRaw("Current: ",T014O6_A371DisFecEnt[0]);
            }
            if ( GXutil.strcmp(Z340DisArtMat, T014O6_A340DisArtMat[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtMat");
               GXutil.writeLogRaw("Old: ",Z340DisArtMat);
               GXutil.writeLogRaw("Current: ",T014O6_A340DisArtMat[0]);
            }
            if ( GXutil.strcmp(Z337DisArtDsc, T014O6_A337DisArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtDsc");
               GXutil.writeLogRaw("Old: ",Z337DisArtDsc);
               GXutil.writeLogRaw("Current: ",T014O6_A337DisArtDsc[0]);
            }
            if ( GXutil.strcmp(Z339DisArtLar, T014O6_A339DisArtLar[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtLar");
               GXutil.writeLogRaw("Old: ",Z339DisArtLar);
               GXutil.writeLogRaw("Current: ",T014O6_A339DisArtLar[0]);
            }
            if ( Z352DisArtTip != T014O6_A352DisArtTip[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtTip");
               GXutil.writeLogRaw("Old: ",Z352DisArtTip);
               GXutil.writeLogRaw("Current: ",T014O6_A352DisArtTip[0]);
            }
            if ( GXutil.strcmp(Z341DisArtOpe, T014O6_A341DisArtOpe[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtOpe");
               GXutil.writeLogRaw("Old: ",Z341DisArtOpe);
               GXutil.writeLogRaw("Current: ",T014O6_A341DisArtOpe[0]);
            }
            if ( GXutil.strcmp(Z353DisArtTr1, T014O6_A353DisArtTr1[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtTr1");
               GXutil.writeLogRaw("Old: ",Z353DisArtTr1);
               GXutil.writeLogRaw("Current: ",T014O6_A353DisArtTr1[0]);
            }
            if ( Z344DisArtPt1 != T014O6_A344DisArtPt1[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtPt1");
               GXutil.writeLogRaw("Old: ",Z344DisArtPt1);
               GXutil.writeLogRaw("Current: ",T014O6_A344DisArtPt1[0]);
            }
            if ( GXutil.strcmp(Z354DisArtTr2, T014O6_A354DisArtTr2[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtTr2");
               GXutil.writeLogRaw("Old: ",Z354DisArtTr2);
               GXutil.writeLogRaw("Current: ",T014O6_A354DisArtTr2[0]);
            }
            if ( Z345DisArtPt2 != T014O6_A345DisArtPt2[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtPt2");
               GXutil.writeLogRaw("Old: ",Z345DisArtPt2);
               GXutil.writeLogRaw("Current: ",T014O6_A345DisArtPt2[0]);
            }
            if ( GXutil.strcmp(Z355DisArtTr3, T014O6_A355DisArtTr3[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtTr3");
               GXutil.writeLogRaw("Old: ",Z355DisArtTr3);
               GXutil.writeLogRaw("Current: ",T014O6_A355DisArtTr3[0]);
            }
            if ( Z346DisArtPt3 != T014O6_A346DisArtPt3[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtPt3");
               GXutil.writeLogRaw("Old: ",Z346DisArtPt3);
               GXutil.writeLogRaw("Current: ",T014O6_A346DisArtPt3[0]);
            }
            if ( Z1232DisArtAcb != T014O6_A1232DisArtAcb[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtAcb");
               GXutil.writeLogRaw("Old: ",Z1232DisArtAcb);
               GXutil.writeLogRaw("Current: ",T014O6_A1232DisArtAcb[0]);
            }
            if ( Z334DisArtAnh != T014O6_A334DisArtAnh[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisArtAnh");
               GXutil.writeLogRaw("Old: ",Z334DisArtAnh);
               GXutil.writeLogRaw("Current: ",T014O6_A334DisArtAnh[0]);
            }
            if ( Z367DisEst != T014O6_A367DisEst[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisEst");
               GXutil.writeLogRaw("Old: ",Z367DisEst);
               GXutil.writeLogRaw("Current: ",T014O6_A367DisEst[0]);
            }
            if ( GXutil.strcmp(Z365DisDes, T014O6_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T014O6_A365DisDes[0]);
            }
            if ( Z374DisNumPie != T014O6_A374DisNumPie[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisNumPie");
               GXutil.writeLogRaw("Old: ",Z374DisNumPie);
               GXutil.writeLogRaw("Current: ",T014O6_A374DisNumPie[0]);
            }
            if ( DecimalUtil.compareTo(Z375DisNumUni, T014O6_A375DisNumUni[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisNumUni");
               GXutil.writeLogRaw("Old: ",Z375DisNumUni);
               GXutil.writeLogRaw("Current: ",T014O6_A375DisNumUni[0]);
            }
            if ( GXutil.strcmp(Z392DisUniMed, T014O6_A392DisUniMed[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisUniMed");
               GXutil.writeLogRaw("Old: ",Z392DisUniMed);
               GXutil.writeLogRaw("Current: ",T014O6_A392DisUniMed[0]);
            }
            if ( GXutil.strcmp(Z1031EmpesCod, T014O6_A1031EmpesCod[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"EmpesCod");
               GXutil.writeLogRaw("Old: ",Z1031EmpesCod);
               GXutil.writeLogRaw("Current: ",T014O6_A1031EmpesCod[0]);
            }
            if ( Z1051DisNumCol != T014O6_A1051DisNumCol[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisNumCol");
               GXutil.writeLogRaw("Old: ",Z1051DisNumCol);
               GXutil.writeLogRaw("Current: ",T014O6_A1051DisNumCol[0]);
            }
            if ( GXutil.strcmp(Z1052DisObs, T014O6_A1052DisObs[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisObs");
               GXutil.writeLogRaw("Old: ",Z1052DisObs);
               GXutil.writeLogRaw("Current: ",T014O6_A1052DisObs[0]);
            }
            if ( Z2525DisComULin != T014O6_A2525DisComULin[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisComULin");
               GXutil.writeLogRaw("Old: ",Z2525DisComULin);
               GXutil.writeLogRaw("Current: ",T014O6_A2525DisComULin[0]);
            }
            if ( GXutil.strcmp(Z362DisColNom, T014O6_A362DisColNom[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisColNom");
               GXutil.writeLogRaw("Old: ",Z362DisColNom);
               GXutil.writeLogRaw("Current: ",T014O6_A362DisColNom[0]);
            }
            if ( Z252CliCod != T014O6_A252CliCod[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T014O6_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z1013DibCli, T014O6_A1013DibCli[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DibCli");
               GXutil.writeLogRaw("Old: ",Z1013DibCli);
               GXutil.writeLogRaw("Current: ",T014O6_A1013DibCli[0]);
            }
            if ( Z1014DibInt != T014O6_A1014DibInt[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DibInt");
               GXutil.writeLogRaw("Old: ",Z1014DibInt);
               GXutil.writeLogRaw("Current: ",T014O6_A1014DibInt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T014O23 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(16) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDIBUJ"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( Z1019DibMolCil != T014O23_A1019DibMolCil[0] ) || ( DecimalUtil.compareTo(Z1018DibMetRea, T014O23_A1018DibMetRea[0]) != 0 ) || ( Z3911TipMqnCod != T014O23_A3911TipMqnCod[0] ) )
         {
            if ( Z1019DibMolCil != T014O23_A1019DibMolCil[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DibMolCil");
               GXutil.writeLogRaw("Old: ",Z1019DibMolCil);
               GXutil.writeLogRaw("Current: ",T014O23_A1019DibMolCil[0]);
            }
            if ( DecimalUtil.compareTo(Z1018DibMetRea, T014O23_A1018DibMetRea[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DibMetRea");
               GXutil.writeLogRaw("Old: ",Z1018DibMetRea);
               GXutil.writeLogRaw("Current: ",T014O23_A1018DibMetRea[0]);
            }
            if ( Z3911TipMqnCod != T014O23_A3911TipMqnCod[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"TipMqnCod");
               GXutil.writeLogRaw("Old: ",Z3911TipMqnCod);
               GXutil.writeLogRaw("Current: ",T014O23_A3911TipMqnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDIBUJ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert14O34( )
   {
      beforeValidate14O34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14O34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm14O34( 0) ;
         checkOptimisticConcurrency14O34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm14O34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert14O34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014O24 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A361DisCod), A757PriCod, A360DisCliNum, A370DisFecCli, A335DisArtCod, A369DisFec, A371DisFecEnt, A340DisArtMat, A337DisArtDsc, A339DisArtLar, Short.valueOf(A352DisArtTip), A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), Short.valueOf(A1232DisArtAcb), Short.valueOf(A334DisArtAnh), Byte.valueOf(A367DisEst), A365DisDes, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n1051DisNumCol), Short.valueOf(A1051DisNumCol), A1052DisObs, Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), Boolean.valueOf(n362DisColNom), A362DisColNom, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel14O34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption14O0( ) ;
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
            load14O34( ) ;
         }
         endLevel14O34( ) ;
      }
      closeExtendedTableCursors14O34( ) ;
   }

   public void update14O34( )
   {
      beforeValidate14O34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14O34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency14O34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm14O34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate14O34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014O25 */
                  pr_default.execute(18, new Object[] {A757PriCod, A360DisCliNum, A370DisFecCli, A335DisArtCod, A369DisFec, A371DisFecEnt, A340DisArtMat, A337DisArtDsc, A339DisArtLar, Short.valueOf(A352DisArtTip), A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), Short.valueOf(A1232DisArtAcb), Short.valueOf(A334DisArtAnh), Byte.valueOf(A367DisEst), A365DisDes, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n1051DisNumCol), Short.valueOf(A1051DisNumCol), A1052DisObs, Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), Boolean.valueOf(n362DisColNom), A362DisColNom, Integer.valueOf(A252CliCod), Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate14O34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int5[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int5) ;
                     txdisco_impl.this.A396EmprCod = GXv_char3[0] ;
                     txdisco_impl.this.A361DisCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel14O34( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption14O0( ) ;
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
         endLevel14O34( ) ;
      }
      closeExtendedTableCursors14O34( ) ;
   }

   public void deferredUpdate14O34( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate14O34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency14O34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls14O34( ) ;
         afterConfirm14O34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete14O34( ) ;
            if ( AnyError == 0 )
            {
               A1018DibMetRea = O1018DibMetRea ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
               A2525DisComULin = O2525DisComULin ;
               n2525DisComULin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
               A1054TotNPie = O1054TotNPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               A1055TotNUni = O1055TotNUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               scanStart14O551( ) ;
               while ( RcdFound551 != 0 )
               {
                  getByPrimaryKey14O551( ) ;
                  delete14O551( ) ;
                  scanNext14O551( ) ;
                  O1018DibMetRea = A1018DibMetRea ;
                  n1018DibMetRea = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
                  O2525DisComULin = A2525DisComULin ;
                  n2525DisComULin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
                  O1054TotNPie = A1054TotNPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
                  O1055TotNUni = A1055TotNUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               }
               scanEnd14O551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014O26 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound34 == 0 )
                        {
                           initAll14O34( ) ;
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
                        resetCaption14O0( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel14O34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls14O34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T014O27 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T014O28 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T014O29 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T014O30 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T014O31 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T014O32 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T014O33 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T014O34 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T014O35 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T014O36 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T014O37 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void processNestedLevel14O551( )
   {
      s1018DibMetRea = O1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      s2525DisComULin = O2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      s1054TotNPie = O1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      s1055TotNUni = O1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      nGXsfl_250_idx = 0 ;
      while ( nGXsfl_250_idx < nRC_GXsfl_250 )
      {
         readRow14O551( ) ;
         if ( ( nRcdExists_551 != 0 ) || ( nIsMod_551 != 0 ) )
         {
            standaloneNotModal14O551( ) ;
            getKey14O551( ) ;
            if ( ( nRcdExists_551 == 0 ) && ( nRcdDeleted_551 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert14O551( ) ;
            }
            else
            {
               if ( RcdFound551 != 0 )
               {
                  if ( ( nRcdDeleted_551 != 0 ) && ( nRcdExists_551 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete14O551( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_551 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update14O551( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_551 == 0 )
                  {
                     GXCCtl = "DISCOMLIN_" + sGXsfl_250_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1018DibMetRea = A1018DibMetRea ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
            O2525DisComULin = A2525DisComULin ;
            n2525DisComULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
            O1054TotNPie = A1054TotNPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            O1055TotNUni = A1055TotNUni ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_551_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtDisComAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpesPDis_Internalname, GXutil.ltrim( localUtil.ntoc( A1039EmpesPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEmpesUDis_Internalname, GXutil.ltrim( localUtil.ntoc( A1040EmpesUDis, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComObs_Internalname, GXutil.rtrim( A7735DisComObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_250_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_250_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_250_idx, GXutil.rtrim( Z7735DisComObs)) ;
         httpContext.changePostValue( "T1058DisComMtr_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1059DisComPie_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( O1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_551_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_551_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_551_"+sGXsfl_250_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_551 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_551_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMANH_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMMTR_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMPIE_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPESPDIS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesPDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "EMPESUDIS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesUDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMOBS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll14O551( ) ;
      if ( AnyError != 0 )
      {
         O1018DibMetRea = s1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         O2525DisComULin = s2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         O1054TotNPie = s1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         O1055TotNUni = s1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      nRcdExists_551 = (short)(0) ;
      nIsMod_551 = (short)(0) ;
      nRcdDeleted_551 = (short)(0) ;
   }

   public void processLevel14O34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel14O551( ) ;
      if ( AnyError != 0 )
      {
         O1018DibMetRea = s1018DibMetRea ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         O2525DisComULin = s2525DisComULin ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
         O1054TotNPie = s1054TotNPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         O1055TotNUni = s1055TotNUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T014O38 */
      pr_default.execute(31, new Object[] {Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* Using cursor T014O39 */
      pr_default.execute(32, new Object[] {Boolean.valueOf(n1018DibMetRea), A1018DibMetRea, A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
   }

   public void endLevel14O34( )
   {
      pr_default.close(3);
      pr_default.close(16);
      if ( AnyError == 0 )
      {
         beforeComplete14O34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txdisco");
         if ( AnyError == 0 )
         {
            confirmValues14O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txdisco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart14O34( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A361DisCod = A361DisCod ;
      /* Scan By routine */
      /* Using cursor T014O40 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext14O34( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
   }

   public void scanEnd14O34( )
   {
      pr_default.close(33);
   }

   public void afterConfirm14O34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert14O34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate14O34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete14O34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete14O34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate14O34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes14O34( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      chkPriCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "Enabled", GXutil.ltrimstr( chkPriCod.getEnabled(), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisCliNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Enabled), 5, 0), true);
      edtDisFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Enabled), 5, 0), true);
      edtDisFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecEnt_Enabled), 5, 0), true);
      edtDisArtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtMat_Enabled), 5, 0), true);
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtDisArtLar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtLar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtLar_Enabled), 5, 0), true);
      edtDisArtTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTip_Enabled), 5, 0), true);
      edtDisArtOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtOpe_Enabled), 5, 0), true);
      edtDisArtTr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr1_Enabled), 5, 0), true);
      edtDisArtPt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt1_Enabled), 5, 0), true);
      edtDisArtTr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr2_Enabled), 5, 0), true);
      edtDisArtPt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt2_Enabled), 5, 0), true);
      edtDisArtTr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr3_Enabled), 5, 0), true);
      edtDisArtPt3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt3_Enabled), 5, 0), true);
      edtDisArtAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAcb_Enabled), 5, 0), true);
      edtDisArtAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAnh_Enabled), 5, 0), true);
      edtDisPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPiePie_Enabled), 5, 0), true);
      edtDisPieMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMtr_Enabled), 5, 0), true);
      edtDisPieKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieKgm_Enabled), 5, 0), true);
      cmbDisEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisEst.getEnabled(), 5, 0), true);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtDisNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtEmpesCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesCod_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDibMolCil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCil_Enabled), 5, 0), true);
      edtDisDibNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDibNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDibNum_Enabled), 5, 0), true);
      edtDisNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCol_Enabled), 5, 0), true);
      edtDisObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObs_Enabled), 5, 0), true);
      edtTotNPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotNPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotNPie_Enabled), 5, 0), true);
      edtTotNUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotNUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotNUni_Enabled), 5, 0), true);
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtTipMqnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMqnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMqnCod_Enabled), 5, 0), true);
      edtTipMqnDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMqnDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMqnDsc_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
   }

   public void zm14O551( int GX_JID )
   {
      if ( ( GX_JID == 61 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1057DisComAnh = T014O3_A1057DisComAnh[0] ;
            Z1058DisComMtr = T014O3_A1058DisComMtr[0] ;
            Z1059DisComPie = T014O3_A1059DisComPie[0] ;
            Z7735DisComObs = T014O3_A7735DisComObs[0] ;
         }
         else
         {
            Z1057DisComAnh = A1057DisComAnh ;
            Z1058DisComMtr = A1058DisComMtr ;
            Z1059DisComPie = A1059DisComPie ;
            Z7735DisComObs = A7735DisComObs ;
         }
      }
      if ( GX_JID == -61 )
      {
         Z361DisCod = A361DisCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1057DisComAnh = A1057DisComAnh ;
         Z1058DisComMtr = A1058DisComMtr ;
         Z1059DisComPie = A1059DisComPie ;
         Z7735DisComObs = A7735DisComObs ;
         Z396EmprCod = A396EmprCod ;
         Z1032FonCod = A1032FonCod ;
         Z1036EmpesUEnt = A1036EmpesUEnt ;
         Z1038EmpesUUti = A1038EmpesUUti ;
         Z1035EmpesPEnt = A1035EmpesPEnt ;
         Z1037EmpesPUti = A1037EmpesPUti ;
      }
   }

   public void standaloneNotModal14O551( )
   {
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
      edtDisComULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComULin_Enabled), 5, 0), true);
      edtDibMetRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMetRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMetRea_Enabled), 5, 0), true);
   }

   public void standaloneModal14O551( )
   {
      if ( isIns( )  )
      {
         A2525DisComULin = (byte)(O2525DisComULin+1) ;
         n2525DisComULin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2524DisComLin = A2525DisComULin ;
      }
      if ( isIns( )  && (0==A1057DisComAnh) && ( Gx_BScreen == 0 ) )
      {
         A1057DisComAnh = A334DisArtAnh ;
         n1057DisComAnh = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      }
      else
      {
         edtDisComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      }
      else
      {
         edtDisComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFonCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      }
      else
      {
         edtFonCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      }
   }

   public void load14O551( )
   {
      /* Using cursor T014O42 */
      pr_default.execute(34, new Object[] {Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A1057DisComAnh = T014O42_A1057DisComAnh[0] ;
         n1057DisComAnh = T014O42_n1057DisComAnh[0] ;
         A1058DisComMtr = T014O42_A1058DisComMtr[0] ;
         n1058DisComMtr = T014O42_n1058DisComMtr[0] ;
         A1059DisComPie = T014O42_A1059DisComPie[0] ;
         n1059DisComPie = T014O42_n1059DisComPie[0] ;
         A7735DisComObs = T014O42_A7735DisComObs[0] ;
         n7735DisComObs = T014O42_n7735DisComObs[0] ;
         A1036EmpesUEnt = T014O42_A1036EmpesUEnt[0] ;
         A1038EmpesUUti = T014O42_A1038EmpesUUti[0] ;
         A1035EmpesPEnt = T014O42_A1035EmpesPEnt[0] ;
         A1037EmpesPUti = T014O42_A1037EmpesPUti[0] ;
         zm14O551( -61) ;
      }
      pr_default.close(34);
      onLoadActions14O551( ) ;
   }

   public void onLoadActions14O551( )
   {
      A1040EmpesUDis = A1036EmpesUEnt.subtract(A1038EmpesUUti) ;
      A1039EmpesPDis = (int)(A1035EmpesPEnt-A1037EmpesPUti) ;
      if ( isIns( )  )
      {
         A1055TotNUni = O1055TotNUni.add(A1058DisComMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1055TotNUni = O1055TotNUni.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1055TotNUni = O1055TotNUni.subtract(O1058DisComMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            }
         }
      }
      AV22OldMtr = O1058DisComMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldMtr", GXutil.ltrimstr( AV22OldMtr, 9, 2));
      if ( isDlt( )  )
      {
         A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         }
      }
      if ( isIns( )  )
      {
         A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie-O1059DisComPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A1054TotNPie = (short)(O1054TotNPie-O1059DisComPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            }
         }
      }
      AV21OldPie = O1059DisComPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OldPie), 4, 0));
   }

   public void checkExtendedTable14O551( )
   {
      nIsDirty_551 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal14O551( ) ;
      if ( ( GXutil.strcmp(A1056DisComCod, " ") == 0 ) && true /* After */ )
      {
         GXCCtl = "DISCOMCOD_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Combinacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T014O5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1036EmpesUEnt = T014O5_A1036EmpesUEnt[0] ;
         A1038EmpesUUti = T014O5_A1038EmpesUUti[0] ;
         A1035EmpesPEnt = T014O5_A1035EmpesPEnt[0] ;
         A1037EmpesPUti = T014O5_A1037EmpesPUti[0] ;
      }
      else
      {
         nIsDirty_551 = (short)(1) ;
         A1036EmpesUEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1036EmpesUEnt", GXutil.ltrimstr( A1036EmpesUEnt, 10, 2));
         nIsDirty_551 = (short)(1) ;
         A1038EmpesUUti = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1038EmpesUUti", GXutil.ltrimstr( A1038EmpesUUti, 11, 2));
         nIsDirty_551 = (short)(1) ;
         A1035EmpesPEnt = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1035EmpesPEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1035EmpesPEnt), 6, 0));
         nIsDirty_551 = (short)(1) ;
         A1037EmpesPUti = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1037EmpesPUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1037EmpesPUti), 6, 0));
      }
      pr_default.close(2);
      nIsDirty_551 = (short)(1) ;
      A1040EmpesUDis = A1036EmpesUEnt.subtract(A1038EmpesUUti) ;
      nIsDirty_551 = (short)(1) ;
      A1039EmpesPDis = (int)(A1035EmpesPEnt-A1037EmpesPUti) ;
      if ( isIns( )  )
      {
         nIsDirty_551 = (short)(1) ;
         A1055TotNUni = O1055TotNUni.add(A1058DisComMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_551 = (short)(1) ;
            A1055TotNUni = O1055TotNUni.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_551 = (short)(1) ;
               A1055TotNUni = O1055TotNUni.subtract(O1058DisComMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            }
         }
      }
      AV22OldMtr = O1058DisComMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldMtr", GXutil.ltrimstr( AV22OldMtr, 9, 2));
      if ( isDlt( )  )
      {
         nIsDirty_551 = (short)(1) ;
         A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
         n1018DibMetRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_551 = (short)(1) ;
            A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1058DisComMtr)==0) )
      {
         GXCCtl = "DISCOMMTR_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de metros nulo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComMtr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_551 = (short)(1) ;
         A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_551 = (short)(1) ;
            A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie-O1059DisComPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_551 = (short)(1) ;
               A1054TotNPie = (short)(O1054TotNPie-O1059DisComPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            }
         }
      }
      AV21OldPie = O1059DisComPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OldPie), 4, 0));
      if ( (0==A1059DisComPie) )
      {
         GXCCtl = "DISCOMPIE_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de piezas nulo", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors14O551( )
   {
      pr_default.close(2);
   }

   public void enableDisable14O551( )
   {
   }

   public void gxload_62( String A396EmprCod ,
                          String A1031EmpesCod ,
                          int A252CliCod ,
                          String A1032FonCod )
   {
      /* Using cursor T014O44 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
      if ( (pr_default.getStatus(35) != 101) )
      {
         A1036EmpesUEnt = T014O44_A1036EmpesUEnt[0] ;
         A1038EmpesUUti = T014O44_A1038EmpesUUti[0] ;
         A1035EmpesPEnt = T014O44_A1035EmpesPEnt[0] ;
         A1037EmpesPUti = T014O44_A1037EmpesPUti[0] ;
      }
      else
      {
         A1036EmpesUEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1036EmpesUEnt", GXutil.ltrimstr( A1036EmpesUEnt, 10, 2));
         A1038EmpesUUti = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1038EmpesUUti", GXutil.ltrimstr( A1038EmpesUUti, 11, 2));
         A1035EmpesPEnt = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1035EmpesPEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1035EmpesPEnt), 6, 0));
         A1037EmpesPUti = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1037EmpesPUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1037EmpesPUti), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1036EmpesUEnt, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1038EmpesUUti, (byte)(11), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1035EmpesPEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1037EmpesPUti, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(35) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(35);
   }

   public void getKey14O551( )
   {
      /* Using cursor T014O45 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound551 = (short)(1) ;
      }
      else
      {
         RcdFound551 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey14O551( )
   {
      /* Using cursor T014O3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(1) != 101) && ( T014O3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T014O3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm14O551( 61) ;
         RcdFound551 = (short)(1) ;
         initializeNonKey14O551( ) ;
         A2524DisComLin = T014O3_A2524DisComLin[0] ;
         A1056DisComCod = T014O3_A1056DisComCod[0] ;
         A1057DisComAnh = T014O3_A1057DisComAnh[0] ;
         n1057DisComAnh = T014O3_n1057DisComAnh[0] ;
         A1058DisComMtr = T014O3_A1058DisComMtr[0] ;
         n1058DisComMtr = T014O3_n1058DisComMtr[0] ;
         A1059DisComPie = T014O3_A1059DisComPie[0] ;
         n1059DisComPie = T014O3_n1059DisComPie[0] ;
         A7735DisComObs = T014O3_A7735DisComObs[0] ;
         n7735DisComObs = T014O3_n7735DisComObs[0] ;
         A1032FonCod = T014O3_A1032FonCod[0] ;
         O1058DisComMtr = A1058DisComMtr ;
         n1058DisComMtr = false ;
         O1059DisComPie = A1059DisComPie ;
         n1059DisComPie = false ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         sMode551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal14O551( ) ;
         load14O551( ) ;
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound551 = (short)(0) ;
         initializeNonKey14O551( ) ;
         sMode551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal14O551( ) ;
         Gx_mode = sMode551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes14O551( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency14O551( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T014O2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z1057DisComAnh != T014O2_A1057DisComAnh[0] ) || ( DecimalUtil.compareTo(Z1058DisComMtr, T014O2_A1058DisComMtr[0]) != 0 ) || ( Z1059DisComPie != T014O2_A1059DisComPie[0] ) || ( GXutil.strcmp(Z7735DisComObs, T014O2_A7735DisComObs[0]) != 0 ) )
         {
            if ( Z1057DisComAnh != T014O2_A1057DisComAnh[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisComAnh");
               GXutil.writeLogRaw("Old: ",Z1057DisComAnh);
               GXutil.writeLogRaw("Current: ",T014O2_A1057DisComAnh[0]);
            }
            if ( DecimalUtil.compareTo(Z1058DisComMtr, T014O2_A1058DisComMtr[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisComMtr");
               GXutil.writeLogRaw("Old: ",Z1058DisComMtr);
               GXutil.writeLogRaw("Current: ",T014O2_A1058DisComMtr[0]);
            }
            if ( Z1059DisComPie != T014O2_A1059DisComPie[0] )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisComPie");
               GXutil.writeLogRaw("Old: ",Z1059DisComPie);
               GXutil.writeLogRaw("Current: ",T014O2_A1059DisComPie[0]);
            }
            if ( GXutil.strcmp(Z7735DisComObs, T014O2_A7735DisComObs[0]) != 0 )
            {
               GXutil.writeLogln("txdisco:[seudo value changed for attri]"+"DisComObs");
               GXutil.writeLogRaw("Old: ",Z7735DisComObs);
               GXutil.writeLogRaw("Current: ",T014O2_A7735DisComObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert14O551( )
   {
      beforeValidate14O551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14O551( ) ;
      }
      if ( AnyError == 0 )
      {
         zm14O551( 0) ;
         checkOptimisticConcurrency14O551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm14O551( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert14O551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T014O46 */
                  pr_default.execute(37, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n7735DisComObs), A7735DisComObs, A396EmprCod, A1032FonCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
                  if ( (pr_default.getStatus(37) == 1) )
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
            load14O551( ) ;
         }
         endLevel14O551( ) ;
      }
      closeExtendedTableCursors14O551( ) ;
   }

   public void update14O551( )
   {
      beforeValidate14O551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable14O551( ) ;
      }
      if ( ( nIsMod_551 != 0 ) || ( nIsDirty_551 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency14O551( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm14O551( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate14O551( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T014O47 */
                     pr_default.execute(38, new Object[] {Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie), Boolean.valueOf(n7735DisComObs), A7735DisComObs, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate14O551( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int5[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int5) ;
                        txdisco_impl.this.A396EmprCod = GXv_char3[0] ;
                        txdisco_impl.this.A361DisCod = GXv_int5[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey14O551( ) ;
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
            endLevel14O551( ) ;
         }
      }
      closeExtendedTableCursors14O551( ) ;
   }

   public void deferredUpdate14O551( )
   {
   }

   public void delete14O551( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate14O551( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency14O551( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls14O551( ) ;
         afterConfirm14O551( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete14O551( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T014O48 */
               pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
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
      sMode551 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel14O551( ) ;
      Gx_mode = sMode551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls14O551( )
   {
      standaloneModal14O551( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T014O50 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            A1036EmpesUEnt = T014O50_A1036EmpesUEnt[0] ;
            A1038EmpesUUti = T014O50_A1038EmpesUUti[0] ;
            A1035EmpesPEnt = T014O50_A1035EmpesPEnt[0] ;
            A1037EmpesPUti = T014O50_A1037EmpesPUti[0] ;
         }
         else
         {
            A1036EmpesUEnt = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1036EmpesUEnt", GXutil.ltrimstr( A1036EmpesUEnt, 10, 2));
            A1038EmpesUUti = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1038EmpesUUti", GXutil.ltrimstr( A1038EmpesUUti, 11, 2));
            A1035EmpesPEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1035EmpesPEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1035EmpesPEnt), 6, 0));
            A1037EmpesPUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1037EmpesPUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1037EmpesPUti), 6, 0));
         }
         pr_default.close(40);
         A1040EmpesUDis = A1036EmpesUEnt.subtract(A1038EmpesUUti) ;
         A1039EmpesPDis = (int)(A1035EmpesPEnt-A1037EmpesPUti) ;
         if ( isIns( )  )
         {
            A1055TotNUni = O1055TotNUni.add(A1058DisComMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1055TotNUni = O1055TotNUni.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1055TotNUni = O1055TotNUni.subtract(O1058DisComMtr) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
               }
            }
         }
         AV22OldMtr = O1058DisComMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22OldMtr", GXutil.ltrimstr( AV22OldMtr, 9, 2));
         if ( isDlt( )  )
         {
            A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
               n1018DibMetRea = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
            }
         }
         if ( isIns( )  )
         {
            A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A1054TotNPie = (short)(O1054TotNPie+A1059DisComPie-O1059DisComPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1054TotNPie = (short)(O1054TotNPie-O1059DisComPie) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
               }
            }
         }
         AV21OldPie = O1059DisComPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21OldPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OldPie), 4, 0));
      }
   }

   public void endLevel14O551( )
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

   public void scanStart14O551( )
   {
      /* Scan By routine */
      /* Using cursor T014O51 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound551 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A2524DisComLin = T014O51_A2524DisComLin[0] ;
         A1056DisComCod = T014O51_A1056DisComCod[0] ;
         A1032FonCod = T014O51_A1032FonCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext14O551( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound551 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound551 = (short)(1) ;
         A2524DisComLin = T014O51_A2524DisComLin[0] ;
         A1056DisComCod = T014O51_A1056DisComCod[0] ;
         A1032FonCod = T014O51_A1032FonCod[0] ;
      }
   }

   public void scanEnd14O551( )
   {
      pr_default.close(41);
   }

   public void afterConfirm14O551( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A1056DisComCod, " ") == 0 ) && true /* After */ )
      {
         GXCCtl = "DISCOMCOD_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Combinacion", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert14O551( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate14O551( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete14O551( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete14O551( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate14O551( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes14O551( )
   {
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComAnh_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComMtr_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComPie_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtEmpesPDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesPDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesPDis_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtEmpesUDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpesUDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpesUDis_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComObs_Enabled), 5, 0), !bGXsfl_250_Refreshing);
   }

   public void send_integrity_lvl_hashes14O551( )
   {
   }

   public void send_integrity_lvl_hashes14O34( )
   {
   }

   public void subsflControlProps_250551( )
   {
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551_"+sGXsfl_250_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_250_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_250_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_250_idx ;
      edtDisComAnh_Internalname = "DISCOMANH_"+sGXsfl_250_idx ;
      edtDisComMtr_Internalname = "DISCOMMTR_"+sGXsfl_250_idx ;
      edtDisComPie_Internalname = "DISCOMPIE_"+sGXsfl_250_idx ;
      edtEmpesPDis_Internalname = "EMPESPDIS_"+sGXsfl_250_idx ;
      edtEmpesUDis_Internalname = "EMPESUDIS_"+sGXsfl_250_idx ;
      edtDisComObs_Internalname = "DISCOMOBS_"+sGXsfl_250_idx ;
   }

   public void subsflControlProps_fel_250551( )
   {
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551_"+sGXsfl_250_fel_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_250_fel_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_250_fel_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_250_fel_idx ;
      edtDisComAnh_Internalname = "DISCOMANH_"+sGXsfl_250_fel_idx ;
      edtDisComMtr_Internalname = "DISCOMMTR_"+sGXsfl_250_fel_idx ;
      edtDisComPie_Internalname = "DISCOMPIE_"+sGXsfl_250_fel_idx ;
      edtEmpesPDis_Internalname = "EMPESPDIS_"+sGXsfl_250_fel_idx ;
      edtEmpesUDis_Internalname = "EMPESUDIS_"+sGXsfl_250_fel_idx ;
      edtDisComObs_Internalname = "DISCOMOBS_"+sGXsfl_250_fel_idx ;
   }

   public void addRow14O551( )
   {
      nGXsfl_250_idx = (int)(nGXsfl_250_idx+1) ;
      sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_250551( ) ;
      sendRow14O551( ) ;
   }

   public void sendRow14O551( )
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
         if ( ((int)((nGXsfl_250_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 251,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_551_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_551_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_551), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_551), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,251);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_551_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_551_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 252,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,252);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 253,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComCod_Internalname,GXutil.rtrim( A1056DisComCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,253);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 254,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFonCod_Internalname,GXutil.rtrim( A1032FonCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,254);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFonCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFonCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 255,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1057DisComAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1057DisComAnh), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,255);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 256,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComMtr_Enabled!=0) ? localUtil.format( A1058DisComMtr, "ZZZZZ9.99") : localUtil.format( A1058DisComMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,256);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 257,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisComPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1059DisComPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1059DisComPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,257);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpesPDis_Internalname,GXutil.ltrim( localUtil.ntoc( A1039EmpesPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEmpesPDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1039EmpesPDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1039EmpesPDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpesPDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmpesPDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmpesUDis_Internalname,GXutil.ltrim( localUtil.ntoc( A1040EmpesUDis, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEmpesUDis_Enabled!=0) ? localUtil.format( A1040EmpesUDis, "ZZZZZZZ9.99") : localUtil.format( A1040EmpesUDis, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmpesUDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEmpesUDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_551_" + sGXsfl_250_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 260,'',false,'" + sGXsfl_250_idx + "',250)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComObs_Internalname,GXutil.rtrim( A7735DisComObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,260);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(250),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes14O551( ) ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1056DisComCod_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1056DisComCod));
      GXCCtl = "Z1032FonCod_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1032FonCod));
      GXCCtl = "Z1057DisComAnh_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1057DisComAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1058DisComMtr_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1059DisComPie_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7735DisComObs_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7735DisComObs));
      GXCCtl = "O1058DisComMtr_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1058DisComMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1059DisComPie_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1059DisComPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_551_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_551_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_551_" + sGXsfl_250_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_551, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_551_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMANH_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMMTR_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMPIE_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPESPDIS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesPDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPESUDIS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesUDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMOBS_"+sGXsfl_250_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow14O551( )
   {
      nGXsfl_250_idx = (int)(nGXsfl_250_idx+1) ;
      sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_250551( ) ;
      edtavnRcdDeleted_551_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_551_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMANH_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMMTR_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMPIE_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmpesPDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPESPDIS_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEmpesUDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "EMPESUDIS_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMOBS_"+sGXsfl_250_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_551_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_551_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_551");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_551_Internalname ;
         wbErr = true ;
         nRcdDeleted_551 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_551 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_551_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DISCOMLIN_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComLin_Internalname ;
         wbErr = true ;
         A2524DisComLin = (byte)(0) ;
      }
      else
      {
         A2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1056DisComCod = httpContext.cgiGet( edtDisComCod_Internalname) ;
      A1032FonCod = httpContext.cgiGet( edtFonCod_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMANH_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComAnh_Internalname ;
         wbErr = true ;
         A1057DisComAnh = (short)(0) ;
         n1057DisComAnh = false ;
      }
      else
      {
         A1057DisComAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1057DisComAnh = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DISCOMMTR_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComMtr_Internalname ;
         wbErr = true ;
         A1058DisComMtr = DecimalUtil.ZERO ;
         n1058DisComMtr = false ;
      }
      else
      {
         A1058DisComMtr = localUtil.ctond( httpContext.cgiGet( edtDisComMtr_Internalname)) ;
         n1058DisComMtr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISCOMPIE_" + sGXsfl_250_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComPie_Internalname ;
         wbErr = true ;
         A1059DisComPie = (short)(0) ;
         n1059DisComPie = false ;
      }
      else
      {
         A1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisComPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1059DisComPie = false ;
      }
      A1039EmpesPDis = (int)(localUtil.ctol( httpContext.cgiGet( edtEmpesPDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1040EmpesUDis = localUtil.ctond( httpContext.cgiGet( edtEmpesUDis_Internalname)) ;
      A7735DisComObs = httpContext.cgiGet( edtDisComObs_Internalname) ;
      n7735DisComObs = false ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_250_idx ;
      Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1056DisComCod_" + sGXsfl_250_idx ;
      Z1056DisComCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1032FonCod_" + sGXsfl_250_idx ;
      Z1032FonCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1057DisComAnh_" + sGXsfl_250_idx ;
      Z1057DisComAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1058DisComMtr_" + sGXsfl_250_idx ;
      Z1058DisComMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1059DisComPie_" + sGXsfl_250_idx ;
      Z1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7735DisComObs_" + sGXsfl_250_idx ;
      Z7735DisComObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1058DisComMtr_" + sGXsfl_250_idx ;
      O1058DisComMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1059DisComPie_" + sGXsfl_250_idx ;
      O1059DisComPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_551_" + sGXsfl_250_idx ;
      nRcdDeleted_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_551_" + sGXsfl_250_idx ;
      nRcdExists_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_551_" + sGXsfl_250_idx ;
      nIsMod_551 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFonCod_Enabled = edtFonCod_Enabled ;
      defedtDisComCod_Enabled = edtDisComCod_Enabled ;
      defedtDisComLin_Enabled = edtDisComLin_Enabled ;
   }

   public void confirmValues14O0( )
   {
      nGXsfl_250_idx = 0 ;
      sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_250551( ) ;
      while ( nGXsfl_250_idx < nRC_GXsfl_250 )
      {
         nGXsfl_250_idx = (int)(nGXsfl_250_idx+1) ;
         sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_250551( ) ;
         httpContext.changePostValue( "Z2524DisComLin_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z2524DisComLin_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_250_idx) ;
         httpContext.changePostValue( "Z1056DisComCod_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z1056DisComCod_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_250_idx) ;
         httpContext.changePostValue( "Z1032FonCod_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z1032FonCod_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_250_idx) ;
         httpContext.changePostValue( "Z1057DisComAnh_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z1057DisComAnh_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1057DisComAnh_"+sGXsfl_250_idx) ;
         httpContext.changePostValue( "Z1058DisComMtr_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z1058DisComMtr_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1058DisComMtr_"+sGXsfl_250_idx) ;
         httpContext.changePostValue( "Z1059DisComPie_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z1059DisComPie_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1059DisComPie_"+sGXsfl_250_idx) ;
         httpContext.changePostValue( "Z7735DisComObs_"+sGXsfl_250_idx, httpContext.cgiGet( "ZT_"+"Z7735DisComObs_"+sGXsfl_250_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7735DisComObs_"+sGXsfl_250_idx) ;
      }
      httpContext.changePostValue( "O1058DisComMtr", httpContext.cgiGet( "T1058DisComMtr")) ;
      httpContext.deletePostValue( "T1058DisComMtr") ;
      httpContext.changePostValue( "O1059DisComPie", httpContext.cgiGet( "T1059DisComPie")) ;
      httpContext.deletePostValue( "T1059DisComPie") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txdisco", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TxDISCO");
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      forbiddenHiddens.add("PriCod", GXutil.rtrim( localUtil.format( A757PriCod, "9")));
      forbiddenHiddens.add("DisCliNum", GXutil.rtrim( localUtil.format( A360DisCliNum, "")));
      forbiddenHiddens.add("DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("DisArtCod", GXutil.rtrim( localUtil.format( A335DisArtCod, "")));
      forbiddenHiddens.add("DisFec", localUtil.format(A369DisFec, "99/99/99"));
      forbiddenHiddens.add("DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
      forbiddenHiddens.add("DisArtMat", GXutil.rtrim( localUtil.format( A340DisArtMat, "")));
      forbiddenHiddens.add("DisArtDsc", GXutil.rtrim( localUtil.format( A337DisArtDsc, "")));
      forbiddenHiddens.add("DisArtLar", GXutil.rtrim( localUtil.format( A339DisArtLar, "")));
      forbiddenHiddens.add("DisArtTip", localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"));
      forbiddenHiddens.add("DisArtOpe", GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")));
      forbiddenHiddens.add("DisArtTr1", GXutil.rtrim( localUtil.format( A353DisArtTr1, "")));
      forbiddenHiddens.add("DisArtPt1", localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"));
      forbiddenHiddens.add("DisArtTr2", GXutil.rtrim( localUtil.format( A354DisArtTr2, "")));
      forbiddenHiddens.add("DisArtPt2", localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"));
      forbiddenHiddens.add("DisArtTr3", GXutil.rtrim( localUtil.format( A355DisArtTr3, "")));
      forbiddenHiddens.add("DisArtPt3", localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"));
      forbiddenHiddens.add("DisArtAcb", localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"));
      forbiddenHiddens.add("DisArtAnh", localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"));
      forbiddenHiddens.add("DisNumPie", localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"));
      forbiddenHiddens.add("DisNumUni", localUtil.format( A375DisNumUni, "ZZZZZ9.99"));
      forbiddenHiddens.add("EmpesCod", GXutil.rtrim( localUtil.format( A1031EmpesCod, "")));
      forbiddenHiddens.add("DibCli", GXutil.rtrim( localUtil.format( A1013DibCli, "")));
      forbiddenHiddens.add("DibInt", localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"));
      forbiddenHiddens.add("DisNumCol", localUtil.format( DecimalUtil.doubleToDec(A1051DisNumCol), "ZZZ9"));
      forbiddenHiddens.add("DisObs", GXutil.rtrim( localUtil.format( A1052DisObs, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("txdisco:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z360DisCliNum", GXutil.rtrim( Z360DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z370DisFecCli", localUtil.dtoc( Z370DisFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z369DisFec", localUtil.dtoc( Z369DisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z371DisFecEnt", localUtil.dtoc( Z371DisFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z340DisArtMat", GXutil.rtrim( Z340DisArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z337DisArtDsc", GXutil.rtrim( Z337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z339DisArtLar", GXutil.rtrim( Z339DisArtLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z352DisArtTip", GXutil.ltrim( localUtil.ntoc( Z352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z341DisArtOpe", GXutil.rtrim( Z341DisArtOpe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z353DisArtTr1", GXutil.rtrim( Z353DisArtTr1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z344DisArtPt1", GXutil.ltrim( localUtil.ntoc( Z344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z354DisArtTr2", GXutil.rtrim( Z354DisArtTr2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z345DisArtPt2", GXutil.ltrim( localUtil.ntoc( Z345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z355DisArtTr3", GXutil.rtrim( Z355DisArtTr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z346DisArtPt3", GXutil.ltrim( localUtil.ntoc( Z346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1232DisArtAcb", GXutil.ltrim( localUtil.ntoc( Z1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z334DisArtAnh", GXutil.ltrim( localUtil.ntoc( Z334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z367DisEst", GXutil.ltrim( localUtil.ntoc( Z367DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z375DisNumUni", GXutil.ltrim( localUtil.ntoc( Z375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1031EmpesCod", GXutil.rtrim( Z1031EmpesCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1051DisNumCol", GXutil.ltrim( localUtil.ntoc( Z1051DisNumCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1052DisObs", GXutil.rtrim( Z1052DisObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2525DisComULin", GXutil.ltrim( localUtil.ntoc( Z2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1019DibMolCil", GXutil.ltrim( localUtil.ntoc( Z1019DibMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1018DibMetRea", GXutil.ltrim( localUtil.ntoc( Z1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3911TipMqnCod", GXutil.ltrim( localUtil.ntoc( Z3911TipMqnCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1018DibMetRea", GXutil.ltrim( localUtil.ntoc( O1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2525DisComULin", GXutil.ltrim( localUtil.ntoc( O2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1054TotNPie", GXutil.ltrim( localUtil.ntoc( O1054TotNPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1055TotNUni", GXutil.ltrim( localUtil.ntoc( O1055TotNUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_250", GXutil.ltrim( localUtil.ntoc( nGXsfl_250_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV63UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV19DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPESUENT", GXutil.ltrim( localUtil.ntoc( A1036EmpesUEnt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPESUUTI", GXutil.ltrim( localUtil.ntoc( A1038EmpesUUti, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPESPENT", GXutil.ltrim( localUtil.ntoc( A1035EmpesPEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPESPUTI", GXutil.ltrim( localUtil.ntoc( A1037EmpesPUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPIE", GXutil.ltrim( localUtil.ntoc( AV21OldPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDMTR", GXutil.ltrim( localUtil.ntoc( AV22OldMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.txdisco", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TxDISCO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COMBINACIONES II", "") ;
   }

   public void initializeNonKey14O34( )
   {
      A381DisPieKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      A385DisPieMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      A1053DisDibNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1053DisDibNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1053DisDibNum), 8, 0));
      A757PriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      A360DisCliNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
      A370DisFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A369DisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A371DisFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
      A340DisArtMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
      A337DisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A339DisArtLar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
      A352DisArtTip = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
      A341DisArtOpe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
      A353DisArtTr1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
      A344DisArtPt1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
      A354DisArtTr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
      A345DisArtPt2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
      A355DisArtTr3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
      A346DisArtPt3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
      A1232DisArtAcb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
      A334DisArtAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
      A367DisEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A374DisNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
      A375DisNumUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A1031EmpesCod = "" ;
      n1031EmpesCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", A1031EmpesCod);
      A1013DibCli = "" ;
      n1013DibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = 0 ;
      n1014DibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A1019DibMolCil = (short)(0) ;
      n1019DibMolCil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A1051DisNumCol = (short)(0) ;
      n1051DisNumCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1051DisNumCol), 4, 0));
      A1052DisObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
      A2525DisComULin = (byte)(0) ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A3911TipMqnCod = (byte)(0) ;
      n3911TipMqnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3911TipMqnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3911TipMqnCod), 2, 0));
      A3912TipMqnDsc = "" ;
      n3912TipMqnDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3912TipMqnDsc", A3912TipMqnDsc);
      A1018DibMetRea = DecimalUtil.ZERO ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      A362DisColNom = "" ;
      n362DisColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      O1018DibMetRea = A1018DibMetRea ;
      n1018DibMetRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrimstr( A1018DibMetRea, 9, 2));
      O2525DisComULin = A2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      O1054TotNPie = A1054TotNPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
      O1055TotNUni = A1055TotNUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      Z757PriCod = "" ;
      Z360DisCliNum = "" ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z340DisArtMat = "" ;
      Z337DisArtDsc = "" ;
      Z339DisArtLar = "" ;
      Z352DisArtTip = (short)(0) ;
      Z341DisArtOpe = "" ;
      Z353DisArtTr1 = "" ;
      Z344DisArtPt1 = (short)(0) ;
      Z354DisArtTr2 = "" ;
      Z345DisArtPt2 = (short)(0) ;
      Z355DisArtTr3 = "" ;
      Z346DisArtPt3 = (short)(0) ;
      Z1232DisArtAcb = (short)(0) ;
      Z334DisArtAnh = (short)(0) ;
      Z367DisEst = (byte)(0) ;
      Z365DisDes = "" ;
      Z374DisNumPie = (short)(0) ;
      Z375DisNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z1031EmpesCod = "" ;
      Z1051DisNumCol = (short)(0) ;
      Z1052DisObs = "" ;
      Z2525DisComULin = (byte)(0) ;
      Z362DisColNom = "" ;
      Z252CliCod = 0 ;
      Z1013DibCli = "" ;
      Z1014DibInt = 0 ;
      Z1019DibMolCil = (short)(0) ;
      Z1018DibMetRea = DecimalUtil.ZERO ;
      Z3911TipMqnCod = (byte)(0) ;
   }

   public void initAll14O34( )
   {
      initializeNonKey14O34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey14O551( )
   {
      AV21OldPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OldPie), 4, 0));
      AV22OldMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldMtr", GXutil.ltrimstr( AV22OldMtr, 9, 2));
      A1058DisComMtr = DecimalUtil.ZERO ;
      n1058DisComMtr = false ;
      A1059DisComPie = (short)(0) ;
      n1059DisComPie = false ;
      A1039EmpesPDis = 0 ;
      A1040EmpesUDis = DecimalUtil.ZERO ;
      A7735DisComObs = "" ;
      n7735DisComObs = false ;
      A1036EmpesUEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1036EmpesUEnt", GXutil.ltrimstr( A1036EmpesUEnt, 10, 2));
      A1038EmpesUUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1038EmpesUUti", GXutil.ltrimstr( A1038EmpesUUti, 11, 2));
      A1035EmpesPEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1035EmpesPEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1035EmpesPEnt), 6, 0));
      A1037EmpesPUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1037EmpesPUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1037EmpesPUti), 6, 0));
      A1057DisComAnh = A334DisArtAnh ;
      n1057DisComAnh = false ;
      O1058DisComMtr = A1058DisComMtr ;
      n1058DisComMtr = false ;
      O1059DisComPie = A1059DisComPie ;
      n1059DisComPie = false ;
      Z1057DisComAnh = (short)(0) ;
      Z1058DisComMtr = DecimalUtil.ZERO ;
      Z1059DisComPie = (short)(0) ;
      Z7735DisComObs = "" ;
   }

   public void initAll14O551( )
   {
      A2524DisComLin = (byte)(0) ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      initializeNonKey14O551( ) ;
   }

   public void standaloneModalInsert14O551( )
   {
      A2525DisComULin = i2525DisComULin ;
      n2525DisComULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2525DisComULin), 2, 0));
      A1057DisComAnh = i1057DisComAnh ;
      n1057DisComAnh = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241553693", true, true);
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
      httpContext.AddJavascriptSource("txdisco.js", "?20268241553693", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties551( )
   {
      edtFonCod_Enabled = defedtFonCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComCod_Enabled = defedtDisComCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_250_Refreshing);
      edtDisComLin_Enabled = defedtDisComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_250_Refreshing);
   }

   public void startgridcontrol250( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_551, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_551_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1056DisComCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1032FonCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1057DisComAnh, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1058DisComMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1059DisComPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1039EmpesPDis, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesPDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1040EmpesUDis, (byte)(11), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEmpesUDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7735DisComObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      chkPriCod.setInternalname( "PRICOD" );
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDisCliNum_Internalname = "DISCLINUM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtDisFecCli_Internalname = "DISFECCLI" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtDisFec_Internalname = "DISFEC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDisFecEnt_Internalname = "DISFECENT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDisArtMat_Internalname = "DISARTMAT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDisArtLar_Internalname = "DISARTLAR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDisArtTip_Internalname = "DISARTTIP" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDisArtOpe_Internalname = "DISARTOPE" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDisArtTr1_Internalname = "DISARTTR1" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDisArtPt1_Internalname = "DISARTPT1" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDisArtTr2_Internalname = "DISARTTR2" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtDisArtPt2_Internalname = "DISARTPT2" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtDisArtTr3_Internalname = "DISARTTR3" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDisArtPt3_Internalname = "DISARTPT3" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtDisArtAcb_Internalname = "DISARTACB" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtDisArtAnh_Internalname = "DISARTANH" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtDisPiePie_Internalname = "DISPIEPIE" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtDisPieMtr_Internalname = "DISPIEMTR" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtDisPieKgm_Internalname = "DISPIEKGM" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      cmbDisEst.setInternalname( "DISEST" );
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      chkDisDes.setInternalname( "DISDES" );
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtDisNumUni_Internalname = "DISNUMUNI" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtEmpesCod_Internalname = "EMPESCOD" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtDibMolCil_Internalname = "DIBMOLCIL" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtDisDibNum_Internalname = "DISDIBNUM" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtDisNumCol_Internalname = "DISNUMCOL" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtDisObs_Internalname = "DISOBS" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtTotNPie_Internalname = "TOTNPIE" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtTotNUni_Internalname = "TOTNUNI" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtDisComULin_Internalname = "DISCOMULIN" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtTipMqnCod_Internalname = "TIPMQNCOD" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtTipMqnDsc_Internalname = "TIPMQNDSC" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtDibMetRea_Internalname = "DIBMETREA" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      edtavnRcdDeleted_551_Internalname = "vNRCDDELETED_551" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      edtFonCod_Internalname = "FONCOD" ;
      edtDisComAnh_Internalname = "DISCOMANH" ;
      edtDisComMtr_Internalname = "DISCOMMTR" ;
      edtDisComPie_Internalname = "DISCOMPIE" ;
      edtEmpesPDis_Internalname = "EMPESPDIS" ;
      edtEmpesUDis_Internalname = "EMPESUDIS" ;
      edtDisComObs_Internalname = "DISCOMOBS" ;
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
      Form.setCaption( httpContext.getMessage( "COMBINACIONES II", "") );
      edtDisComObs_Jsonclick = "" ;
      edtEmpesUDis_Jsonclick = "" ;
      edtEmpesPDis_Jsonclick = "" ;
      edtDisComPie_Jsonclick = "" ;
      edtDisComMtr_Jsonclick = "" ;
      edtDisComAnh_Jsonclick = "" ;
      edtFonCod_Jsonclick = "" ;
      edtDisComCod_Jsonclick = "" ;
      edtDisComLin_Jsonclick = "" ;
      edtavnRcdDeleted_551_Jsonclick = "" ;
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
      edtDisComObs_Enabled = 1 ;
      edtEmpesUDis_Enabled = 0 ;
      edtEmpesPDis_Enabled = 0 ;
      edtDisComPie_Enabled = 1 ;
      edtDisComMtr_Enabled = 1 ;
      edtDisComAnh_Enabled = 1 ;
      edtFonCod_Enabled = 1 ;
      edtDisComCod_Enabled = 1 ;
      edtDisComLin_Enabled = 1 ;
      edtavnRcdDeleted_551_Enabled = 1 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNom_Enabled = 1 ;
      edtDibMetRea_Jsonclick = "" ;
      edtDibMetRea_Backcolor = (int)(0xFFFFFF) ;
      edtDibMetRea_Enabled = 0 ;
      edtTipMqnDsc_Jsonclick = "" ;
      edtTipMqnDsc_Backcolor = (int)(0xFFFFFF) ;
      edtTipMqnDsc_Enabled = 0 ;
      edtTipMqnCod_Jsonclick = "" ;
      edtTipMqnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipMqnCod_Enabled = 0 ;
      edtDisComULin_Jsonclick = "" ;
      edtDisComULin_Backcolor = (int)(0xFFFFFF) ;
      edtDisComULin_Enabled = 0 ;
      edtTotNUni_Jsonclick = "" ;
      edtTotNUni_Backcolor = (int)(0xFFFFFF) ;
      edtTotNUni_Enabled = 0 ;
      edtTotNPie_Jsonclick = "" ;
      edtTotNPie_Backcolor = (int)(0xFFFFFF) ;
      edtTotNPie_Enabled = 0 ;
      edtDisObs_Jsonclick = "" ;
      edtDisObs_Backcolor = (int)(0xFFFFFF) ;
      edtDisObs_Enabled = 0 ;
      edtDisNumCol_Jsonclick = "" ;
      edtDisNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumCol_Enabled = 0 ;
      edtDisDibNum_Jsonclick = "" ;
      edtDisDibNum_Backcolor = (int)(0xFFFFFF) ;
      edtDisDibNum_Enabled = 0 ;
      edtDibMolCil_Jsonclick = "" ;
      edtDibMolCil_Backcolor = (int)(0xFFFFFF) ;
      edtDibMolCil_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 0 ;
      edtEmpesCod_Jsonclick = "" ;
      edtEmpesCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmpesCod_Enabled = 0 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtDisUniMed_Enabled = 1 ;
      edtDisNumUni_Jsonclick = "" ;
      edtDisNumUni_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumUni_Enabled = 0 ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisNumPie_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumPie_Enabled = 0 ;
      chkDisDes.setIBackground( (int)(0xFFFFFF) );
      chkDisDes.setEnabled( 1 );
      cmbDisEst.setJsonclick( "" );
      cmbDisEst.setEnabled( 1 );
      cmbDisEst.setIBackground( (int)(0xFFFFFF) );
      edtDisPieKgm_Jsonclick = "" ;
      edtDisPieKgm_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieKgm_Enabled = 0 ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieMtr_Enabled = 0 ;
      edtDisPiePie_Jsonclick = "" ;
      edtDisPiePie_Backcolor = (int)(0xFFFFFF) ;
      edtDisPiePie_Enabled = 0 ;
      edtDisArtAnh_Jsonclick = "" ;
      edtDisArtAnh_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAnh_Enabled = 0 ;
      edtDisArtAcb_Jsonclick = "" ;
      edtDisArtAcb_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAcb_Enabled = 0 ;
      edtDisArtPt3_Jsonclick = "" ;
      edtDisArtPt3_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPt3_Enabled = 0 ;
      edtDisArtTr3_Jsonclick = "" ;
      edtDisArtTr3_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTr3_Enabled = 0 ;
      edtDisArtPt2_Jsonclick = "" ;
      edtDisArtPt2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPt2_Enabled = 0 ;
      edtDisArtTr2_Jsonclick = "" ;
      edtDisArtTr2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTr2_Enabled = 0 ;
      edtDisArtPt1_Jsonclick = "" ;
      edtDisArtPt1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPt1_Enabled = 0 ;
      edtDisArtTr1_Jsonclick = "" ;
      edtDisArtTr1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTr1_Enabled = 0 ;
      edtDisArtOpe_Jsonclick = "" ;
      edtDisArtOpe_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtOpe_Enabled = 0 ;
      edtDisArtTip_Jsonclick = "" ;
      edtDisArtTip_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTip_Enabled = 0 ;
      edtDisArtLar_Jsonclick = "" ;
      edtDisArtLar_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtLar_Enabled = 0 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtDsc_Enabled = 0 ;
      edtDisArtMat_Jsonclick = "" ;
      edtDisArtMat_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtMat_Enabled = 0 ;
      edtDisFecEnt_Jsonclick = "" ;
      edtDisFecEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDisFecEnt_Enabled = 0 ;
      edtDisFec_Jsonclick = "" ;
      edtDisFec_Backcolor = (int)(0xFFFFFF) ;
      edtDisFec_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtCod_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtDisFecCli_Jsonclick = "" ;
      edtDisFecCli_Backcolor = (int)(0xFFFFFF) ;
      edtDisFecCli_Enabled = 0 ;
      edtDisCliNum_Jsonclick = "" ;
      edtDisCliNum_Backcolor = (int)(0xFFFFFF) ;
      edtDisCliNum_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 0 ;
      chkPriCod.setIBackground( (int)(0xFFFFFF) );
      chkPriCod.setEnabled( 0 );
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

   public void gx2asadisdibnum14O34( String A396EmprCod ,
                                     String A1013DibCli ,
                                     int A252CliCod )
   {
      GXt_int1 = A1053DisDibNum ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A1013DibCli ;
      GXv_int5[0] = A252CliCod ;
      GXv_int4[0] = GXt_int1 ;
      new app.pdibint(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int5, GXv_int4) ;
      txdisco_impl.this.A396EmprCod = GXv_char3[0] ;
      txdisco_impl.this.A1013DibCli = GXv_char2[0] ;
      txdisco_impl.this.A252CliCod = GXv_int5[0] ;
      txdisco_impl.this.GXt_int1 = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1053DisDibNum = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1053DisDibNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1053DisDibNum), 8, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1053DisDibNum, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx36asadispiekgm14O34( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx37asadispiemtr14O34( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_250551( ) ;
      while ( nGXsfl_250_idx <= nRC_GXsfl_250 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal14O551( ) ;
         standaloneModal14O551( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow14O551( ) ;
         nGXsfl_250_idx = (int)(nGXsfl_250_idx+1) ;
         sGXsfl_250_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_250_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_250551( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      chkPriCod.setName( "PRICOD" );
      chkPriCod.setWebtags( "" );
      chkPriCod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), true);
      chkPriCod.setCheckedValue( "0" );
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      cmbDisEst.setName( "DISEST" );
      cmbDisEst.setWebtags( "" );
      cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      }
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T014O52 */
      pr_default.execute(42, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T014O52_A407EmprNom[0] ;
      n407EmprNom = T014O52_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(42);
      /* Using cursor T014O54 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(43) != 101) )
      {
         A387DisPiePie = T014O54_A387DisPiePie[0] ;
         n387DisPiePie = T014O54_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(43);
      /* Using cursor T014O56 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         A1054TotNPie = T014O56_A1054TotNPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = T014O56_A1055TotNUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      else
      {
         A1054TotNPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1054TotNPie), 4, 0));
         A1055TotNUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrimstr( A1055TotNUni, 9, 2));
      }
      pr_default.close(44);
      GX_FocusControl = cmbDisEst.getInternalname() ;
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

   public void valid_Discod( )
   {
      n1051DisNumCol = false ;
      n1031EmpesCod = false ;
      n2525DisComULin = false ;
      A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValue())) ;
      cmbDisEst.setValue( GXutil.str( A367DisEst, 1, 0) );
      n1013DibCli = false ;
      n1014DibInt = false ;
      n3911TipMqnCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         cmbDisEst.setValue( GXutil.str( A367DisEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1053DisDibNum", GXutil.ltrim( localUtil.ntoc( A1053DisDibNum, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", GXutil.rtrim( A757PriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", GXutil.rtrim( A360DisCliNum));
      httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", GXutil.rtrim( A340DisArtMat));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", GXutil.rtrim( A339DisArtLar));
      httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", GXutil.rtrim( A341DisArtOpe));
      httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", GXutil.rtrim( A353DisArtTr1));
      httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", GXutil.rtrim( A354DisArtTr2));
      httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", GXutil.rtrim( A355DisArtTr3));
      httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
      cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1031EmpesCod", GXutil.rtrim( A1031EmpesCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", GXutil.rtrim( A1013DibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1051DisNumCol", GXutil.ltrim( localUtil.ntoc( A1051DisNumCol, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", GXutil.rtrim( A1052DisObs));
      httpContext.ajax_rsp_assign_attri("", false, "A1054TotNPie", GXutil.ltrim( localUtil.ntoc( A1054TotNPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1055TotNUni", GXutil.ltrim( localUtil.ntoc( A1055TotNUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2525DisComULin", GXutil.ltrim( localUtil.ntoc( A2525DisComULin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3911TipMqnCod", GXutil.ltrim( localUtil.ntoc( A3911TipMqnCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3912TipMqnDsc", GXutil.rtrim( A3912TipMqnDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A1018DibMetRea", GXutil.ltrim( localUtil.ntoc( A1018DibMetRea, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", GXutil.rtrim( A362DisColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1053DisDibNum", GXutil.ltrim( localUtil.ntoc( Z1053DisDibNum, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z360DisCliNum", GXutil.rtrim( Z360DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z370DisFecCli", localUtil.format(Z370DisFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z369DisFec", localUtil.format(Z369DisFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z371DisFecEnt", localUtil.format(Z371DisFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z340DisArtMat", GXutil.rtrim( Z340DisArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z337DisArtDsc", GXutil.rtrim( Z337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z339DisArtLar", GXutil.rtrim( Z339DisArtLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z352DisArtTip", GXutil.ltrim( localUtil.ntoc( Z352DisArtTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z341DisArtOpe", GXutil.rtrim( Z341DisArtOpe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z353DisArtTr1", GXutil.rtrim( Z353DisArtTr1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z344DisArtPt1", GXutil.ltrim( localUtil.ntoc( Z344DisArtPt1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z354DisArtTr2", GXutil.rtrim( Z354DisArtTr2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z345DisArtPt2", GXutil.ltrim( localUtil.ntoc( Z345DisArtPt2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z355DisArtTr3", GXutil.rtrim( Z355DisArtTr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z346DisArtPt3", GXutil.ltrim( localUtil.ntoc( Z346DisArtPt3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1232DisArtAcb", GXutil.ltrim( localUtil.ntoc( Z1232DisArtAcb, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z334DisArtAnh", GXutil.ltrim( localUtil.ntoc( Z334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z387DisPiePie", GXutil.ltrim( localUtil.ntoc( Z387DisPiePie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z367DisEst", GXutil.ltrim( localUtil.ntoc( Z367DisEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z375DisNumUni", GXutil.ltrim( localUtil.ntoc( Z375DisNumUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1031EmpesCod", GXutil.rtrim( Z1031EmpesCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1019DibMolCil", GXutil.ltrim( localUtil.ntoc( Z1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1051DisNumCol", GXutil.ltrim( localUtil.ntoc( Z1051DisNumCol, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1052DisObs", GXutil.rtrim( Z1052DisObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1054TotNPie", GXutil.ltrim( localUtil.ntoc( Z1054TotNPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1055TotNUni", GXutil.ltrim( localUtil.ntoc( Z1055TotNUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2525DisComULin", GXutil.ltrim( localUtil.ntoc( Z2525DisComULin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3911TipMqnCod", GXutil.ltrim( localUtil.ntoc( Z3911TipMqnCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3912TipMqnDsc", GXutil.rtrim( Z3912TipMqnDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1018DibMetRea", GXutil.ltrim( localUtil.ntoc( Z1018DibMetRea, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z381DisPieKgm", GXutil.ltrim( localUtil.ntoc( Z381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z385DisPieMtr", GXutil.ltrim( localUtil.ntoc( Z385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1018DibMetRea", GXutil.ltrim( localUtil.ntoc( O1018DibMetRea, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2525DisComULin", GXutil.ltrim( localUtil.ntoc( O2525DisComULin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1054TotNPie", GXutil.ltrim( localUtil.ntoc( O1054TotNPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1055TotNUni", GXutil.ltrim( localUtil.ntoc( O1055TotNUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Disdes( )
   {
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISDES");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisDes.getInternalname() ;
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Foncod( )
   {
      n1031EmpesCod = false ;
      /* Using cursor T014O50 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
      if ( (pr_default.getStatus(40) != 101) )
      {
         A1036EmpesUEnt = T014O50_A1036EmpesUEnt[0] ;
         A1038EmpesUUti = T014O50_A1038EmpesUUti[0] ;
         A1035EmpesPEnt = T014O50_A1035EmpesPEnt[0] ;
         A1037EmpesPUti = T014O50_A1037EmpesPUti[0] ;
      }
      else
      {
         A1036EmpesUEnt = DecimalUtil.doubleToDec(0) ;
         A1038EmpesUUti = DecimalUtil.doubleToDec(0) ;
         A1035EmpesPEnt = 0 ;
         A1037EmpesPUti = 0 ;
      }
      pr_default.close(40);
      A1040EmpesUDis = A1036EmpesUEnt.subtract(A1038EmpesUUti) ;
      A1039EmpesPDis = (int)(A1035EmpesPEnt-A1037EmpesPUti) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1036EmpesUEnt", GXutil.ltrim( localUtil.ntoc( A1036EmpesUEnt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1038EmpesUUti", GXutil.ltrim( localUtil.ntoc( A1038EmpesUUti, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1035EmpesPEnt", GXutil.ltrim( localUtil.ntoc( A1035EmpesPEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1037EmpesPUti", GXutil.ltrim( localUtil.ntoc( A1037EmpesPUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1040EmpesUDis", GXutil.ltrim( localUtil.ntoc( A1040EmpesUDis, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1039EmpesPDis", GXutil.ltrim( localUtil.ntoc( A1039EmpesPDis, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Discommtr( )
   {
      n1058DisComMtr = false ;
      AV22OldMtr = O1058DisComMtr ;
      if ( isDlt( )  )
      {
         A1018DibMetRea = O1018DibMetRea.subtract(O1058DisComMtr) ;
         n1018DibMetRea = false ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A1018DibMetRea = O1018DibMetRea.add(A1058DisComMtr).subtract(O1058DisComMtr) ;
            n1018DibMetRea = false ;
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1058DisComMtr)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de metros nulo", ""), 1, "DISCOMMTR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComMtr_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV22OldMtr", GXutil.ltrim( localUtil.ntoc( AV22OldMtr, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Discompie( )
   {
      n1059DisComPie = false ;
      AV21OldPie = O1059DisComPie ;
      if ( (0==A1059DisComPie) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Numero de piezas nulo", ""), 0, "DISCOMPIE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV21OldPie", GXutil.ltrim( localUtil.ntoc( AV21OldPie, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'A370DisFecCli',fld:'DISFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A371DisFecEnt',fld:'DISFECENT',pic:''},{av:'A340DisArtMat',fld:'DISARTMAT',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A339DisArtLar',fld:'DISARTLAR',pic:''},{av:'A352DisArtTip',fld:'DISARTTIP',pic:'ZZZ9'},{av:'A341DisArtOpe',fld:'DISARTOPE',pic:'@!'},{av:'A353DisArtTr1',fld:'DISARTTR1',pic:''},{av:'A344DisArtPt1',fld:'DISARTPT1',pic:'ZZ9'},{av:'A354DisArtTr2',fld:'DISARTTR2',pic:''},{av:'A345DisArtPt2',fld:'DISARTPT2',pic:'ZZ9'},{av:'A355DisArtTr3',fld:'DISARTTR3',pic:''},{av:'A346DisArtPt3',fld:'DISARTPT3',pic:'ZZ9'},{av:'A1232DisArtAcb',fld:'DISARTACB',pic:'ZZ9'},{av:'A334DisArtAnh',fld:'DISARTANH',pic:'ZZ9'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A375DisNumUni',fld:'DISNUMUNI',pic:'ZZZZZ9.99'},{av:'A1031EmpesCod',fld:'EMPESCOD',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A1051DisNumCol',fld:'DISNUMCOL',pic:'ZZZ9'},{av:'A1052DisObs',fld:'DISOBS',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A1052DisObs',fld:'DISOBS',pic:''},{av:'A1051DisNumCol',fld:'DISNUMCOL',pic:'ZZZ9'},{av:'A1031EmpesCod',fld:'EMPESCOD',pic:''},{av:'A375DisNumUni',fld:'DISNUMUNI',pic:'ZZZZZ9.99'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A1232DisArtAcb',fld:'DISARTACB',pic:'ZZ9'},{av:'A346DisArtPt3',fld:'DISARTPT3',pic:'ZZ9'},{av:'A355DisArtTr3',fld:'DISARTTR3',pic:''},{av:'A345DisArtPt2',fld:'DISARTPT2',pic:'ZZ9'},{av:'A354DisArtTr2',fld:'DISARTTR2',pic:''},{av:'A344DisArtPt1',fld:'DISARTPT1',pic:'ZZ9'},{av:'A353DisArtTr1',fld:'DISARTTR1',pic:''},{av:'A341DisArtOpe',fld:'DISARTOPE',pic:'@!'},{av:'A352DisArtTip',fld:'DISARTTIP',pic:'ZZZ9'},{av:'A339DisArtLar',fld:'DISARTLAR',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A340DisArtMat',fld:'DISARTMAT',pic:''},{av:'A371DisFecEnt',fld:'DISFECENT',pic:''},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A370DisFecCli',fld:'DISFECCLI',pic:''},{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'A334DisArtAnh',fld:'DISARTANH',pic:'ZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A2525DisComULin',fld:'DISCOMULIN',pic:'Z9'},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A3911TipMqnCod',fld:'TIPMQNCOD',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV63UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A1053DisDibNum',fld:'DISDIBNUM',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'A370DisFecCli',fld:'DISFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A371DisFecEnt',fld:'DISFECENT',pic:''},{av:'A340DisArtMat',fld:'DISARTMAT',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A339DisArtLar',fld:'DISARTLAR',pic:''},{av:'A352DisArtTip',fld:'DISARTTIP',pic:'ZZZ9'},{av:'A341DisArtOpe',fld:'DISARTOPE',pic:'@!'},{av:'A353DisArtTr1',fld:'DISARTTR1',pic:''},{av:'A344DisArtPt1',fld:'DISARTPT1',pic:'ZZ9'},{av:'A354DisArtTr2',fld:'DISARTTR2',pic:''},{av:'A345DisArtPt2',fld:'DISARTPT2',pic:'ZZ9'},{av:'A355DisArtTr3',fld:'DISARTTR3',pic:''},{av:'A346DisArtPt3',fld:'DISARTPT3',pic:'ZZ9'},{av:'A1232DisArtAcb',fld:'DISARTACB',pic:'ZZ9'},{av:'A334DisArtAnh',fld:'DISARTANH',pic:'ZZ9'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A375DisNumUni',fld:'DISNUMUNI',pic:'ZZZZZ9.99'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1031EmpesCod',fld:'EMPESCOD',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A1051DisNumCol',fld:'DISNUMCOL',pic:'ZZZ9'},{av:'A1052DisObs',fld:'DISOBS',pic:''},{av:'A1054TotNPie',fld:'TOTNPIE',pic:'ZZZ9'},{av:'A1055TotNUni',fld:'TOTNUNI',pic:'ZZZZZ9.99'},{av:'A2525DisComULin',fld:'DISCOMULIN',pic:'Z9'},{av:'A3911TipMqnCod',fld:'TIPMQNCOD',pic:'Z9'},{av:'A3912TipMqnDsc',fld:'TIPMQNDSC',pic:''},{av:'A1018DibMetRea',fld:'DIBMETREA',pic:'ZZZZZ9.99'},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z1053DisDibNum'},{av:'Z757PriCod'},{av:'Z407EmprNom'},{av:'Z360DisCliNum'},{av:'Z370DisFecCli'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z335DisArtCod'},{av:'Z369DisFec'},{av:'Z371DisFecEnt'},{av:'Z340DisArtMat'},{av:'Z337DisArtDsc'},{av:'Z339DisArtLar'},{av:'Z352DisArtTip'},{av:'Z341DisArtOpe'},{av:'Z353DisArtTr1'},{av:'Z344DisArtPt1'},{av:'Z354DisArtTr2'},{av:'Z345DisArtPt2'},{av:'Z355DisArtTr3'},{av:'Z346DisArtPt3'},{av:'Z1232DisArtAcb'},{av:'Z334DisArtAnh'},{av:'Z387DisPiePie'},{av:'Z367DisEst'},{av:'Z365DisDes'},{av:'Z374DisNumPie'},{av:'Z375DisNumUni'},{av:'Z392DisUniMed'},{av:'Z1031EmpesCod'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z1019DibMolCil'},{av:'Z1051DisNumCol'},{av:'Z1052DisObs'},{av:'Z1054TotNPie'},{av:'Z1055TotNUni'},{av:'Z2525DisComULin'},{av:'Z3911TipMqnCod'},{av:'Z3912TipMqnDsc'},{av:'Z1018DibMetRea'},{av:'Z362DisColNom'},{av:'Z381DisPieKgm'},{av:'Z385DisPieMtr'},{av:'O1018DibMetRea'},{av:'O2525DisComULin'},{av:'O1054TotNPie'},{av:'O1055TotNUni'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTANH","{handler:'valid_Disartanh',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISARTANH",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISDES",",oparms:[{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_EMPESCOD","{handler:'valid_Empescod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPESCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DIBCLI",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DIBINT",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOMULIN","{handler:'valid_Discomulin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOMULIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_TIPMQNCOD","{handler:'valid_Tipmqncod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_TIPMQNCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1031EmpesCod',fld:'EMPESCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1032FonCod',fld:'FONCOD',pic:''},{av:'A1036EmpesUEnt',fld:'EMPESUENT',pic:'ZZZZZZ9.99'},{av:'A1038EmpesUUti',fld:'EMPESUUTI',pic:'ZZZZZZZ9.99'},{av:'A1035EmpesPEnt',fld:'EMPESPENT',pic:'ZZZZZ9'},{av:'A1037EmpesPUti',fld:'EMPESPUTI',pic:'ZZZZZ9'},{av:'A1040EmpesUDis',fld:'EMPESUDIS',pic:'ZZZZZZZ9.99'},{av:'A1039EmpesPDis',fld:'EMPESPDIS',pic:'ZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_FONCOD",",oparms:[{av:'A1036EmpesUEnt',fld:'EMPESUENT',pic:'ZZZZZZ9.99'},{av:'A1038EmpesUUti',fld:'EMPESUUTI',pic:'ZZZZZZZ9.99'},{av:'A1035EmpesPEnt',fld:'EMPESPENT',pic:'ZZZZZ9'},{av:'A1037EmpesPUti',fld:'EMPESPUTI',pic:'ZZZZZ9'},{av:'A1040EmpesUDis',fld:'EMPESUDIS',pic:'ZZZZZZZ9.99'},{av:'A1039EmpesPDis',fld:'EMPESPDIS',pic:'ZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOMMTR","{handler:'valid_Discommtr',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O1018DibMetRea'},{av:'O1058DisComMtr'},{av:'O1055TotNUni'},{av:'A1058DisComMtr',fld:'DISCOMMTR',pic:'ZZZZZ9.99'},{av:'AV22OldMtr',fld:'vOLDMTR',pic:'ZZZZZ9.99'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOMMTR",",oparms:[{av:'AV22OldMtr',fld:'vOLDMTR',pic:'ZZZZZ9.99'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOMPIE","{handler:'valid_Discompie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O1059DisComPie'},{av:'O1054TotNPie'},{av:'A1059DisComPie',fld:'DISCOMPIE',pic:'ZZZ9'},{av:'AV21OldPie',fld:'vOLDPIE',pic:'ZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOMPIE",",oparms:[{av:'AV21OldPie',fld:'vOLDPIE',pic:'ZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Discomobs',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
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
      pr_default.close(40);
      pr_default.close(42);
      pr_default.close(8);
      pr_default.close(43);
      pr_default.close(44);
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T014O57 */
      pr_default.execute(45, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(45) != 101) )
      {
         X631Metros = T014O57_A631Metros[0] ;
      }
      pr_default.close(45);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T014O58 */
      pr_default.execute(46, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(46) != 101) )
      {
         X384DisPieMet = T014O58_A384DisPieMet[0] ;
      }
      pr_default.close(46);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor T014O59 */
      pr_default.execute(47, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(47) != 101) )
      {
         X595Kilos = T014O59_A595Kilos[0] ;
      }
      pr_default.close(47);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor T014O60 */
      pr_default.execute(48, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         X382DisPieKil = T014O60_A382DisPieKil[0] ;
      }
      pr_default.close(48);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z757PriCod = "" ;
      Z360DisCliNum = "" ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z340DisArtMat = "" ;
      Z337DisArtDsc = "" ;
      Z339DisArtLar = "" ;
      Z341DisArtOpe = "" ;
      Z353DisArtTr1 = "" ;
      Z354DisArtTr2 = "" ;
      Z355DisArtTr3 = "" ;
      Z365DisDes = "" ;
      Z375DisNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z1031EmpesCod = "" ;
      Z1052DisObs = "" ;
      Z362DisColNom = "" ;
      Z1013DibCli = "" ;
      Z1018DibMetRea = DecimalUtil.ZERO ;
      O1018DibMetRea = DecimalUtil.ZERO ;
      O1055TotNUni = DecimalUtil.ZERO ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      Z1058DisComMtr = DecimalUtil.ZERO ;
      Z7735DisComObs = "" ;
      O1058DisComMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
      A365DisDes = "" ;
      A1031EmpesCod = "" ;
      A1032FonCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A757PriCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A360DisCliNum = "" ;
      lblTextblock6_Jsonclick = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A335DisArtCod = "" ;
      lblTextblock10_Jsonclick = "" ;
      A369DisFec = GXutil.nullDate() ;
      lblTextblock11_Jsonclick = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      lblTextblock12_Jsonclick = "" ;
      A340DisArtMat = "" ;
      lblTextblock13_Jsonclick = "" ;
      A337DisArtDsc = "" ;
      lblTextblock14_Jsonclick = "" ;
      A339DisArtLar = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A341DisArtOpe = "" ;
      lblTextblock17_Jsonclick = "" ;
      A353DisArtTr1 = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A354DisArtTr2 = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A355DisArtTr3 = "" ;
      lblTextblock22_Jsonclick = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      lblTextblock32_Jsonclick = "" ;
      A392DisUniMed = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      A1052DisObs = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      A1055TotNUni = DecimalUtil.ZERO ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      A3912TipMqnDsc = "" ;
      lblTextblock45_Jsonclick = "" ;
      A1018DibMetRea = DecimalUtil.ZERO ;
      lblTextblock46_Jsonclick = "" ;
      A362DisColNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B1018DibMetRea = DecimalUtil.ZERO ;
      B1055TotNUni = DecimalUtil.ZERO ;
      sMode551 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV63UsurCod = "" ;
      AV18EmprCod = "" ;
      A1036EmpesUEnt = DecimalUtil.ZERO ;
      A1038EmpesUUti = DecimalUtil.ZERO ;
      AV22OldMtr = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode34 = "" ;
      s1018DibMetRea = DecimalUtil.ZERO ;
      s1055TotNUni = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1056DisComCod = "" ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      A1040EmpesUDis = DecimalUtil.ZERO ;
      A7735DisComObs = "" ;
      T1058DisComMtr = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z3912TipMqnDsc = "" ;
      Z1055TotNUni = DecimalUtil.ZERO ;
      T014O8_A407EmprNom = new String[] {""} ;
      T014O8_n407EmprNom = new boolean[] {false} ;
      T014O14_A387DisPiePie = new short[1] ;
      T014O14_n387DisPiePie = new boolean[] {false} ;
      T014O16_A1054TotNPie = new short[1] ;
      T014O16_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O9_A279CliNom = new String[] {""} ;
      T014O11_A1019DibMolCil = new short[1] ;
      T014O11_n1019DibMolCil = new boolean[] {false} ;
      T014O11_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O11_n1018DibMetRea = new boolean[] {false} ;
      T014O11_A3911TipMqnCod = new byte[1] ;
      T014O11_n3911TipMqnCod = new boolean[] {false} ;
      T014O12_A3912TipMqnDsc = new String[] {""} ;
      T014O12_n3912TipMqnDsc = new boolean[] {false} ;
      T014O19_A361DisCod = new int[1] ;
      T014O19_A757PriCod = new String[] {""} ;
      T014O19_A407EmprNom = new String[] {""} ;
      T014O19_n407EmprNom = new boolean[] {false} ;
      T014O19_A360DisCliNum = new String[] {""} ;
      T014O19_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T014O19_A279CliNom = new String[] {""} ;
      T014O19_A335DisArtCod = new String[] {""} ;
      T014O19_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T014O19_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T014O19_A340DisArtMat = new String[] {""} ;
      T014O19_A337DisArtDsc = new String[] {""} ;
      T014O19_A339DisArtLar = new String[] {""} ;
      T014O19_A352DisArtTip = new short[1] ;
      T014O19_A341DisArtOpe = new String[] {""} ;
      T014O19_A353DisArtTr1 = new String[] {""} ;
      T014O19_A344DisArtPt1 = new short[1] ;
      T014O19_A354DisArtTr2 = new String[] {""} ;
      T014O19_A345DisArtPt2 = new short[1] ;
      T014O19_A355DisArtTr3 = new String[] {""} ;
      T014O19_A346DisArtPt3 = new short[1] ;
      T014O19_A1232DisArtAcb = new short[1] ;
      T014O19_A334DisArtAnh = new short[1] ;
      T014O19_A367DisEst = new byte[1] ;
      T014O19_A365DisDes = new String[] {""} ;
      T014O19_A374DisNumPie = new short[1] ;
      T014O19_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O19_A392DisUniMed = new String[] {""} ;
      T014O19_A1031EmpesCod = new String[] {""} ;
      T014O19_n1031EmpesCod = new boolean[] {false} ;
      T014O19_A1019DibMolCil = new short[1] ;
      T014O19_n1019DibMolCil = new boolean[] {false} ;
      T014O19_A1051DisNumCol = new short[1] ;
      T014O19_n1051DisNumCol = new boolean[] {false} ;
      T014O19_A1052DisObs = new String[] {""} ;
      T014O19_A2525DisComULin = new byte[1] ;
      T014O19_n2525DisComULin = new boolean[] {false} ;
      T014O19_A3912TipMqnDsc = new String[] {""} ;
      T014O19_n3912TipMqnDsc = new boolean[] {false} ;
      T014O19_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O19_n1018DibMetRea = new boolean[] {false} ;
      T014O19_A362DisColNom = new String[] {""} ;
      T014O19_n362DisColNom = new boolean[] {false} ;
      T014O19_A396EmprCod = new String[] {""} ;
      T014O19_A252CliCod = new int[1] ;
      T014O19_A1013DibCli = new String[] {""} ;
      T014O19_n1013DibCli = new boolean[] {false} ;
      T014O19_A1014DibInt = new int[1] ;
      T014O19_n1014DibInt = new boolean[] {false} ;
      T014O19_A3911TipMqnCod = new byte[1] ;
      T014O19_n3911TipMqnCod = new boolean[] {false} ;
      T014O19_A387DisPiePie = new short[1] ;
      T014O19_n387DisPiePie = new boolean[] {false} ;
      T014O19_A1054TotNPie = new short[1] ;
      T014O19_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O20_A396EmprCod = new String[] {""} ;
      T014O20_A361DisCod = new int[1] ;
      T014O7_A1031EmpesCod = new String[] {""} ;
      T014O7_n1031EmpesCod = new boolean[] {false} ;
      T014O7_A252CliCod = new int[1] ;
      T014O7_A361DisCod = new int[1] ;
      T014O7_A757PriCod = new String[] {""} ;
      T014O7_A360DisCliNum = new String[] {""} ;
      T014O7_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T014O7_A335DisArtCod = new String[] {""} ;
      T014O7_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T014O7_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T014O7_A340DisArtMat = new String[] {""} ;
      T014O7_A337DisArtDsc = new String[] {""} ;
      T014O7_A339DisArtLar = new String[] {""} ;
      T014O7_A352DisArtTip = new short[1] ;
      T014O7_A341DisArtOpe = new String[] {""} ;
      T014O7_A353DisArtTr1 = new String[] {""} ;
      T014O7_A344DisArtPt1 = new short[1] ;
      T014O7_A354DisArtTr2 = new String[] {""} ;
      T014O7_A345DisArtPt2 = new short[1] ;
      T014O7_A355DisArtTr3 = new String[] {""} ;
      T014O7_A346DisArtPt3 = new short[1] ;
      T014O7_A1232DisArtAcb = new short[1] ;
      T014O7_A334DisArtAnh = new short[1] ;
      T014O7_A367DisEst = new byte[1] ;
      T014O7_A365DisDes = new String[] {""} ;
      T014O7_A374DisNumPie = new short[1] ;
      T014O7_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O7_A392DisUniMed = new String[] {""} ;
      T014O7_A1051DisNumCol = new short[1] ;
      T014O7_n1051DisNumCol = new boolean[] {false} ;
      T014O7_A1052DisObs = new String[] {""} ;
      T014O7_A2525DisComULin = new byte[1] ;
      T014O7_n2525DisComULin = new boolean[] {false} ;
      T014O7_A362DisColNom = new String[] {""} ;
      T014O7_n362DisColNom = new boolean[] {false} ;
      T014O7_A396EmprCod = new String[] {""} ;
      T014O7_A1013DibCli = new String[] {""} ;
      T014O7_n1013DibCli = new boolean[] {false} ;
      T014O7_A1014DibInt = new int[1] ;
      T014O7_n1014DibInt = new boolean[] {false} ;
      T014O21_A396EmprCod = new String[] {""} ;
      T014O21_A361DisCod = new int[1] ;
      T014O22_A396EmprCod = new String[] {""} ;
      T014O22_A361DisCod = new int[1] ;
      T014O6_A1031EmpesCod = new String[] {""} ;
      T014O6_n1031EmpesCod = new boolean[] {false} ;
      T014O6_A252CliCod = new int[1] ;
      T014O6_A361DisCod = new int[1] ;
      T014O6_A757PriCod = new String[] {""} ;
      T014O6_A360DisCliNum = new String[] {""} ;
      T014O6_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T014O6_A335DisArtCod = new String[] {""} ;
      T014O6_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T014O6_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T014O6_A340DisArtMat = new String[] {""} ;
      T014O6_A337DisArtDsc = new String[] {""} ;
      T014O6_A339DisArtLar = new String[] {""} ;
      T014O6_A352DisArtTip = new short[1] ;
      T014O6_A341DisArtOpe = new String[] {""} ;
      T014O6_A353DisArtTr1 = new String[] {""} ;
      T014O6_A344DisArtPt1 = new short[1] ;
      T014O6_A354DisArtTr2 = new String[] {""} ;
      T014O6_A345DisArtPt2 = new short[1] ;
      T014O6_A355DisArtTr3 = new String[] {""} ;
      T014O6_A346DisArtPt3 = new short[1] ;
      T014O6_A1232DisArtAcb = new short[1] ;
      T014O6_A334DisArtAnh = new short[1] ;
      T014O6_A367DisEst = new byte[1] ;
      T014O6_A365DisDes = new String[] {""} ;
      T014O6_A374DisNumPie = new short[1] ;
      T014O6_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O6_A392DisUniMed = new String[] {""} ;
      T014O6_A1051DisNumCol = new short[1] ;
      T014O6_n1051DisNumCol = new boolean[] {false} ;
      T014O6_A1052DisObs = new String[] {""} ;
      T014O6_A2525DisComULin = new byte[1] ;
      T014O6_n2525DisComULin = new boolean[] {false} ;
      T014O6_A362DisColNom = new String[] {""} ;
      T014O6_n362DisColNom = new boolean[] {false} ;
      T014O6_A396EmprCod = new String[] {""} ;
      T014O6_A1013DibCli = new String[] {""} ;
      T014O6_n1013DibCli = new boolean[] {false} ;
      T014O6_A1014DibInt = new int[1] ;
      T014O6_n1014DibInt = new boolean[] {false} ;
      T014O23_A1019DibMolCil = new short[1] ;
      T014O23_n1019DibMolCil = new boolean[] {false} ;
      T014O23_A1018DibMetRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O23_n1018DibMetRea = new boolean[] {false} ;
      T014O23_A3911TipMqnCod = new byte[1] ;
      T014O23_n3911TipMqnCod = new boolean[] {false} ;
      T014O27_A396EmprCod = new String[] {""} ;
      T014O27_A361DisCod = new int[1] ;
      T014O27_A13376DisTraID = new String[] {""} ;
      T014O28_A396EmprCod = new String[] {""} ;
      T014O28_A361DisCod = new int[1] ;
      T014O28_A13213DisNormID = new String[] {""} ;
      T014O29_A396EmprCod = new String[] {""} ;
      T014O29_A361DisCod = new int[1] ;
      T014O29_A13081DisDGLin = new byte[1] ;
      T014O29_A13082DisDGDibCl = new String[] {""} ;
      T014O29_A13083DisDGDibIn = new int[1] ;
      T014O29_A13084DisDGComb = new String[] {""} ;
      T014O29_A13085DisDGFondo = new String[] {""} ;
      T014O30_A396EmprCod = new String[] {""} ;
      T014O30_A361DisCod = new int[1] ;
      T014O30_A7068DisNotLin = new byte[1] ;
      T014O31_A396EmprCod = new String[] {""} ;
      T014O31_A361DisCod = new int[1] ;
      T014O31_A10197ProEspCod = new String[] {""} ;
      T014O32_A396EmprCod = new String[] {""} ;
      T014O32_A361DisCod = new int[1] ;
      T014O32_A4594AccCod = new short[1] ;
      T014O33_A396EmprCod = new String[] {""} ;
      T014O33_A361DisCod = new int[1] ;
      T014O33_A3398DisRefBarC = new int[1] ;
      T014O33_A3399DisRefBCRe = new byte[1] ;
      T014O33_A3400DisRefBCPa = new String[] {""} ;
      T014O33_A3607DisRefBPie = new String[] {""} ;
      T014O34_A396EmprCod = new String[] {""} ;
      T014O34_A361DisCod = new int[1] ;
      T014O34_A376DisObsLin = new byte[1] ;
      T014O35_A396EmprCod = new String[] {""} ;
      T014O35_A361DisCod = new int[1] ;
      T014O35_A758ProCod = new String[] {""} ;
      T014O36_A396EmprCod = new String[] {""} ;
      T014O36_A361DisCod = new int[1] ;
      T014O36_A833TipDefCod = new short[1] ;
      T014O37_A396EmprCod = new String[] {""} ;
      T014O37_A361DisCod = new int[1] ;
      T014O37_A44AlbRecCod = new int[1] ;
      T014O40_A396EmprCod = new String[] {""} ;
      T014O40_A361DisCod = new int[1] ;
      Z1036EmpesUEnt = DecimalUtil.ZERO ;
      Z1038EmpesUUti = DecimalUtil.ZERO ;
      T014O42_A361DisCod = new int[1] ;
      T014O42_A2524DisComLin = new byte[1] ;
      T014O42_A1056DisComCod = new String[] {""} ;
      T014O42_A1057DisComAnh = new short[1] ;
      T014O42_n1057DisComAnh = new boolean[] {false} ;
      T014O42_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O42_n1058DisComMtr = new boolean[] {false} ;
      T014O42_A1059DisComPie = new short[1] ;
      T014O42_n1059DisComPie = new boolean[] {false} ;
      T014O42_A7735DisComObs = new String[] {""} ;
      T014O42_n7735DisComObs = new boolean[] {false} ;
      T014O42_A396EmprCod = new String[] {""} ;
      T014O42_A1032FonCod = new String[] {""} ;
      T014O42_A1036EmpesUEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O42_A1038EmpesUUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O42_A1035EmpesPEnt = new int[1] ;
      T014O42_A1037EmpesPUti = new int[1] ;
      T014O5_A1036EmpesUEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O5_A1038EmpesUUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O5_A1035EmpesPEnt = new int[1] ;
      T014O5_A1037EmpesPUti = new int[1] ;
      T014O44_A1036EmpesUEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O44_A1038EmpesUUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O44_A1035EmpesPEnt = new int[1] ;
      T014O44_A1037EmpesPUti = new int[1] ;
      T014O45_A396EmprCod = new String[] {""} ;
      T014O45_A361DisCod = new int[1] ;
      T014O45_A2524DisComLin = new byte[1] ;
      T014O45_A1056DisComCod = new String[] {""} ;
      T014O45_A1032FonCod = new String[] {""} ;
      T014O3_A361DisCod = new int[1] ;
      T014O3_A2524DisComLin = new byte[1] ;
      T014O3_A1056DisComCod = new String[] {""} ;
      T014O3_A1057DisComAnh = new short[1] ;
      T014O3_n1057DisComAnh = new boolean[] {false} ;
      T014O3_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O3_n1058DisComMtr = new boolean[] {false} ;
      T014O3_A1059DisComPie = new short[1] ;
      T014O3_n1059DisComPie = new boolean[] {false} ;
      T014O3_A7735DisComObs = new String[] {""} ;
      T014O3_n7735DisComObs = new boolean[] {false} ;
      T014O3_A396EmprCod = new String[] {""} ;
      T014O3_A1032FonCod = new String[] {""} ;
      T014O2_A361DisCod = new int[1] ;
      T014O2_A2524DisComLin = new byte[1] ;
      T014O2_A1056DisComCod = new String[] {""} ;
      T014O2_A1057DisComAnh = new short[1] ;
      T014O2_n1057DisComAnh = new boolean[] {false} ;
      T014O2_A1058DisComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O2_n1058DisComMtr = new boolean[] {false} ;
      T014O2_A1059DisComPie = new short[1] ;
      T014O2_n1059DisComPie = new boolean[] {false} ;
      T014O2_A7735DisComObs = new String[] {""} ;
      T014O2_n7735DisComObs = new boolean[] {false} ;
      T014O2_A396EmprCod = new String[] {""} ;
      T014O2_A1032FonCod = new String[] {""} ;
      T014O50_A1036EmpesUEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O50_A1038EmpesUUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T014O50_A1035EmpesPEnt = new int[1] ;
      T014O50_A1037EmpesPUti = new int[1] ;
      T014O51_A396EmprCod = new String[] {""} ;
      T014O51_A361DisCod = new int[1] ;
      T014O51_A2524DisComLin = new byte[1] ;
      T014O51_A1056DisComCod = new String[] {""} ;
      T014O51_A1032FonCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int4 = new int[1] ;
      T014O52_A407EmprNom = new String[] {""} ;
      T014O52_n407EmprNom = new boolean[] {false} ;
      T014O54_A387DisPiePie = new short[1] ;
      T014O54_n387DisPiePie = new boolean[] {false} ;
      T014O56_A1054TotNPie = new short[1] ;
      T014O56_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Z381DisPieKgm = DecimalUtil.ZERO ;
      Z385DisPieMtr = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ757PriCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ360DisCliNum = "" ;
      ZZ370DisFecCli = GXutil.nullDate() ;
      ZZ279CliNom = "" ;
      ZZ335DisArtCod = "" ;
      ZZ369DisFec = GXutil.nullDate() ;
      ZZ371DisFecEnt = GXutil.nullDate() ;
      ZZ340DisArtMat = "" ;
      ZZ337DisArtDsc = "" ;
      ZZ339DisArtLar = "" ;
      ZZ341DisArtOpe = "" ;
      ZZ353DisArtTr1 = "" ;
      ZZ354DisArtTr2 = "" ;
      ZZ355DisArtTr3 = "" ;
      ZZ365DisDes = "" ;
      ZZ375DisNumUni = DecimalUtil.ZERO ;
      ZZ392DisUniMed = "" ;
      ZZ1031EmpesCod = "" ;
      ZZ1013DibCli = "" ;
      ZZ1052DisObs = "" ;
      ZZ1055TotNUni = DecimalUtil.ZERO ;
      ZZ3912TipMqnDsc = "" ;
      ZZ1018DibMetRea = DecimalUtil.ZERO ;
      ZZ362DisColNom = "" ;
      ZZ381DisPieKgm = DecimalUtil.ZERO ;
      ZZ385DisPieMtr = DecimalUtil.ZERO ;
      ZO1018DibMetRea = DecimalUtil.ZERO ;
      ZO1055TotNUni = DecimalUtil.ZERO ;
      Z1040EmpesUDis = DecimalUtil.ZERO ;
      ZV22OldMtr = DecimalUtil.ZERO ;
      X631Metros = DecimalUtil.ZERO ;
      T014O57_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      T014O58_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      T014O59_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      T014O60_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.txdisco__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txdisco__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txdisco__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txdisco__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txdisco__default(),
         new Object[] {
             new Object[] {
            T014O2_A361DisCod, T014O2_A2524DisComLin, T014O2_A1056DisComCod, T014O2_A1057DisComAnh, T014O2_n1057DisComAnh, T014O2_A1058DisComMtr, T014O2_n1058DisComMtr, T014O2_A1059DisComPie, T014O2_n1059DisComPie, T014O2_A7735DisComObs,
            T014O2_n7735DisComObs, T014O2_A396EmprCod, T014O2_A1032FonCod
            }
            , new Object[] {
            T014O3_A361DisCod, T014O3_A2524DisComLin, T014O3_A1056DisComCod, T014O3_A1057DisComAnh, T014O3_n1057DisComAnh, T014O3_A1058DisComMtr, T014O3_n1058DisComMtr, T014O3_A1059DisComPie, T014O3_n1059DisComPie, T014O3_A7735DisComObs,
            T014O3_n7735DisComObs, T014O3_A396EmprCod, T014O3_A1032FonCod
            }
            , new Object[] {
            T014O5_A1036EmpesUEnt, T014O5_A1038EmpesUUti, T014O5_A1035EmpesPEnt, T014O5_A1037EmpesPUti
            }
            , new Object[] {
            T014O6_A1031EmpesCod, T014O6_n1031EmpesCod, T014O6_A252CliCod, T014O6_A361DisCod, T014O6_A757PriCod, T014O6_A360DisCliNum, T014O6_A370DisFecCli, T014O6_A335DisArtCod, T014O6_A369DisFec, T014O6_A371DisFecEnt,
            T014O6_A340DisArtMat, T014O6_A337DisArtDsc, T014O6_A339DisArtLar, T014O6_A352DisArtTip, T014O6_A341DisArtOpe, T014O6_A353DisArtTr1, T014O6_A344DisArtPt1, T014O6_A354DisArtTr2, T014O6_A345DisArtPt2, T014O6_A355DisArtTr3,
            T014O6_A346DisArtPt3, T014O6_A1232DisArtAcb, T014O6_A334DisArtAnh, T014O6_A367DisEst, T014O6_A365DisDes, T014O6_A374DisNumPie, T014O6_A375DisNumUni, T014O6_A392DisUniMed, T014O6_A1051DisNumCol, T014O6_n1051DisNumCol,
            T014O6_A1052DisObs, T014O6_A2525DisComULin, T014O6_n2525DisComULin, T014O6_A362DisColNom, T014O6_n362DisColNom, T014O6_A396EmprCod, T014O6_A1013DibCli, T014O6_n1013DibCli, T014O6_A1014DibInt, T014O6_n1014DibInt
            }
            , new Object[] {
            T014O7_A1031EmpesCod, T014O7_n1031EmpesCod, T014O7_A252CliCod, T014O7_A361DisCod, T014O7_A757PriCod, T014O7_A360DisCliNum, T014O7_A370DisFecCli, T014O7_A335DisArtCod, T014O7_A369DisFec, T014O7_A371DisFecEnt,
            T014O7_A340DisArtMat, T014O7_A337DisArtDsc, T014O7_A339DisArtLar, T014O7_A352DisArtTip, T014O7_A341DisArtOpe, T014O7_A353DisArtTr1, T014O7_A344DisArtPt1, T014O7_A354DisArtTr2, T014O7_A345DisArtPt2, T014O7_A355DisArtTr3,
            T014O7_A346DisArtPt3, T014O7_A1232DisArtAcb, T014O7_A334DisArtAnh, T014O7_A367DisEst, T014O7_A365DisDes, T014O7_A374DisNumPie, T014O7_A375DisNumUni, T014O7_A392DisUniMed, T014O7_A1051DisNumCol, T014O7_n1051DisNumCol,
            T014O7_A1052DisObs, T014O7_A2525DisComULin, T014O7_n2525DisComULin, T014O7_A362DisColNom, T014O7_n362DisColNom, T014O7_A396EmprCod, T014O7_A1013DibCli, T014O7_n1013DibCli, T014O7_A1014DibInt, T014O7_n1014DibInt
            }
            , new Object[] {
            T014O8_A407EmprNom, T014O8_n407EmprNom
            }
            , new Object[] {
            T014O9_A279CliNom
            }
            , new Object[] {
            T014O10_A1019DibMolCil, T014O10_n1019DibMolCil, T014O10_A1018DibMetRea, T014O10_n1018DibMetRea, T014O10_A3911TipMqnCod, T014O10_n3911TipMqnCod
            }
            , new Object[] {
            T014O11_A1019DibMolCil, T014O11_n1019DibMolCil, T014O11_A1018DibMetRea, T014O11_n1018DibMetRea, T014O11_A3911TipMqnCod, T014O11_n3911TipMqnCod
            }
            , new Object[] {
            T014O12_A3912TipMqnDsc, T014O12_n3912TipMqnDsc
            }
            , new Object[] {
            T014O14_A387DisPiePie, T014O14_n387DisPiePie
            }
            , new Object[] {
            T014O16_A1054TotNPie, T014O16_A1055TotNUni
            }
            , new Object[] {
            T014O19_A361DisCod, T014O19_A757PriCod, T014O19_A407EmprNom, T014O19_n407EmprNom, T014O19_A360DisCliNum, T014O19_A370DisFecCli, T014O19_A279CliNom, T014O19_A335DisArtCod, T014O19_A369DisFec, T014O19_A371DisFecEnt,
            T014O19_A340DisArtMat, T014O19_A337DisArtDsc, T014O19_A339DisArtLar, T014O19_A352DisArtTip, T014O19_A341DisArtOpe, T014O19_A353DisArtTr1, T014O19_A344DisArtPt1, T014O19_A354DisArtTr2, T014O19_A345DisArtPt2, T014O19_A355DisArtTr3,
            T014O19_A346DisArtPt3, T014O19_A1232DisArtAcb, T014O19_A334DisArtAnh, T014O19_A367DisEst, T014O19_A365DisDes, T014O19_A374DisNumPie, T014O19_A375DisNumUni, T014O19_A392DisUniMed, T014O19_A1031EmpesCod, T014O19_n1031EmpesCod,
            T014O19_A1019DibMolCil, T014O19_n1019DibMolCil, T014O19_A1051DisNumCol, T014O19_n1051DisNumCol, T014O19_A1052DisObs, T014O19_A2525DisComULin, T014O19_n2525DisComULin, T014O19_A3912TipMqnDsc, T014O19_n3912TipMqnDsc, T014O19_A1018DibMetRea,
            T014O19_n1018DibMetRea, T014O19_A362DisColNom, T014O19_n362DisColNom, T014O19_A396EmprCod, T014O19_A252CliCod, T014O19_A1013DibCli, T014O19_n1013DibCli, T014O19_A1014DibInt, T014O19_n1014DibInt, T014O19_A3911TipMqnCod,
            T014O19_n3911TipMqnCod, T014O19_A387DisPiePie, T014O19_n387DisPiePie, T014O19_A1054TotNPie, T014O19_A1055TotNUni
            }
            , new Object[] {
            T014O20_A396EmprCod, T014O20_A361DisCod
            }
            , new Object[] {
            T014O21_A396EmprCod, T014O21_A361DisCod
            }
            , new Object[] {
            T014O22_A396EmprCod, T014O22_A361DisCod
            }
            , new Object[] {
            T014O23_A1019DibMolCil, T014O23_n1019DibMolCil, T014O23_A1018DibMetRea, T014O23_n1018DibMetRea, T014O23_A3911TipMqnCod, T014O23_n3911TipMqnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014O27_A396EmprCod, T014O27_A361DisCod, T014O27_A13376DisTraID
            }
            , new Object[] {
            T014O28_A396EmprCod, T014O28_A361DisCod, T014O28_A13213DisNormID
            }
            , new Object[] {
            T014O29_A396EmprCod, T014O29_A361DisCod, T014O29_A13081DisDGLin, T014O29_A13082DisDGDibCl, T014O29_A13083DisDGDibIn, T014O29_A13084DisDGComb, T014O29_A13085DisDGFondo
            }
            , new Object[] {
            T014O30_A396EmprCod, T014O30_A361DisCod, T014O30_A7068DisNotLin
            }
            , new Object[] {
            T014O31_A396EmprCod, T014O31_A361DisCod, T014O31_A10197ProEspCod
            }
            , new Object[] {
            T014O32_A396EmprCod, T014O32_A361DisCod, T014O32_A4594AccCod
            }
            , new Object[] {
            T014O33_A396EmprCod, T014O33_A361DisCod, T014O33_A3398DisRefBarC, T014O33_A3399DisRefBCRe, T014O33_A3400DisRefBCPa, T014O33_A3607DisRefBPie
            }
            , new Object[] {
            T014O34_A396EmprCod, T014O34_A361DisCod, T014O34_A376DisObsLin
            }
            , new Object[] {
            T014O35_A396EmprCod, T014O35_A361DisCod, T014O35_A758ProCod
            }
            , new Object[] {
            T014O36_A396EmprCod, T014O36_A361DisCod, T014O36_A833TipDefCod
            }
            , new Object[] {
            T014O37_A396EmprCod, T014O37_A361DisCod, T014O37_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014O40_A396EmprCod, T014O40_A361DisCod
            }
            , new Object[] {
            T014O42_A361DisCod, T014O42_A2524DisComLin, T014O42_A1056DisComCod, T014O42_A1057DisComAnh, T014O42_n1057DisComAnh, T014O42_A1058DisComMtr, T014O42_n1058DisComMtr, T014O42_A1059DisComPie, T014O42_n1059DisComPie, T014O42_A7735DisComObs,
            T014O42_n7735DisComObs, T014O42_A396EmprCod, T014O42_A1032FonCod, T014O42_A1036EmpesUEnt, T014O42_A1038EmpesUUti, T014O42_A1035EmpesPEnt, T014O42_A1037EmpesPUti
            }
            , new Object[] {
            T014O44_A1036EmpesUEnt, T014O44_A1038EmpesUUti, T014O44_A1035EmpesPEnt, T014O44_A1037EmpesPUti
            }
            , new Object[] {
            T014O45_A396EmprCod, T014O45_A361DisCod, T014O45_A2524DisComLin, T014O45_A1056DisComCod, T014O45_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T014O50_A1036EmpesUEnt, T014O50_A1038EmpesUUti, T014O50_A1035EmpesPEnt, T014O50_A1037EmpesPUti
            }
            , new Object[] {
            T014O51_A396EmprCod, T014O51_A361DisCod, T014O51_A2524DisComLin, T014O51_A1056DisComCod, T014O51_A1032FonCod
            }
            , new Object[] {
            T014O52_A407EmprNom, T014O52_n407EmprNom
            }
            , new Object[] {
            T014O54_A387DisPiePie, T014O54_n387DisPiePie
            }
            , new Object[] {
            T014O56_A1054TotNPie, T014O56_A1055TotNUni
            }
            , new Object[] {
            T014O57_A631Metros
            }
            , new Object[] {
            T014O58_A384DisPieMet
            }
            , new Object[] {
            T014O59_A595Kilos
            }
            , new Object[] {
            T014O60_A382DisPieKil
            }
         }
      );
      Z361DisCod = 0 ;
      E361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      Z1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
      A1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
      i1057DisComAnh = (short)(0) ;
      n1057DisComAnh = false ;
   }

   private byte Z367DisEst ;
   private byte Z2525DisComULin ;
   private byte Z3911TipMqnCod ;
   private byte O2525DisComULin ;
   private byte Z2524DisComLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A2525DisComULin ;
   private byte Gx_BScreen ;
   private byte A367DisEst ;
   private byte A3911TipMqnCod ;
   private byte B2525DisComULin ;
   private byte s2525DisComULin ;
   private byte A2524DisComLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2525DisComULin ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ367DisEst ;
   private byte ZZ2525DisComULin ;
   private byte ZZ3911TipMqnCod ;
   private byte ZO2525DisComULin ;
   private short Z352DisArtTip ;
   private short Z344DisArtPt1 ;
   private short Z345DisArtPt2 ;
   private short Z346DisArtPt3 ;
   private short Z1232DisArtAcb ;
   private short Z334DisArtAnh ;
   private short Z374DisNumPie ;
   private short Z1051DisNumCol ;
   private short Z1019DibMolCil ;
   private short O1054TotNPie ;
   private short Z1057DisComAnh ;
   private short Z1059DisComPie ;
   private short O1059DisComPie ;
   private short nRcdDeleted_551 ;
   private short nRcdExists_551 ;
   private short nIsMod_551 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A334DisArtAnh ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A1232DisArtAcb ;
   private short A387DisPiePie ;
   private short A374DisNumPie ;
   private short A1019DibMolCil ;
   private short A1051DisNumCol ;
   private short A1054TotNPie ;
   private short nBlankRcdCount551 ;
   private short RcdFound551 ;
   private short B1054TotNPie ;
   private short nBlankRcdUsr551 ;
   private short AV21OldPie ;
   private short s1054TotNPie ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short T1059DisComPie ;
   private short Z387DisPiePie ;
   private short Z1054TotNPie ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_551 ;
   private short i1057DisComAnh ;
   private short ZZ352DisArtTip ;
   private short ZZ344DisArtPt1 ;
   private short ZZ345DisArtPt2 ;
   private short ZZ346DisArtPt3 ;
   private short ZZ1232DisArtAcb ;
   private short ZZ334DisArtAnh ;
   private short ZZ387DisPiePie ;
   private short ZZ374DisNumPie ;
   private short ZZ1019DibMolCil ;
   private short ZZ1051DisNumCol ;
   private short ZZ1054TotNPie ;
   private short ZO1054TotNPie ;
   private short ZV21OldPie ;
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_250 ;
   private int nGXsfl_250_idx=1 ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtDisCliNum_Enabled ;
   private int edtDisFecCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtDisFec_Enabled ;
   private int edtDisFecEnt_Enabled ;
   private int edtDisArtMat_Enabled ;
   private int edtDisArtDsc_Enabled ;
   private int edtDisArtLar_Enabled ;
   private int edtDisArtTip_Enabled ;
   private int edtDisArtOpe_Enabled ;
   private int edtDisArtTr1_Enabled ;
   private int edtDisArtPt1_Enabled ;
   private int edtDisArtTr2_Enabled ;
   private int edtDisArtPt2_Enabled ;
   private int edtDisArtTr3_Enabled ;
   private int edtDisArtPt3_Enabled ;
   private int edtDisArtAcb_Enabled ;
   private int edtDisArtAnh_Enabled ;
   private int edtDisPiePie_Enabled ;
   private int edtDisPieMtr_Enabled ;
   private int edtDisPieKgm_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisNumUni_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtEmpesCod_Enabled ;
   private int edtDibCli_Enabled ;
   private int A1014DibInt ;
   private int edtDibInt_Enabled ;
   private int edtDibMolCil_Enabled ;
   private int A1053DisDibNum ;
   private int edtDisDibNum_Enabled ;
   private int edtDisNumCol_Enabled ;
   private int edtDisObs_Enabled ;
   private int edtTotNPie_Enabled ;
   private int edtTotNUni_Enabled ;
   private int edtDisComULin_Enabled ;
   private int edtTipMqnCod_Enabled ;
   private int edtTipMqnDsc_Enabled ;
   private int edtDibMetRea_Enabled ;
   private int edtDisColNom_Enabled ;
   private int edtavnRcdDeleted_551_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int edtDisComAnh_Enabled ;
   private int edtDisComMtr_Enabled ;
   private int edtDisComPie_Enabled ;
   private int edtEmpesPDis_Enabled ;
   private int edtEmpesUDis_Enabled ;
   private int edtDisComObs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV19DisCod ;
   private int A1035EmpesPEnt ;
   private int A1037EmpesPUti ;
   private int A1039EmpesPDis ;
   private int GX_JID ;
   private int Z1035EmpesPEnt ;
   private int Z1037EmpesPUti ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtFonCod_Enabled ;
   private int defedtDisComCod_Enabled ;
   private int defedtDisComLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtDisColNom_Backcolor ;
   private int edtDibMetRea_Backcolor ;
   private int edtTipMqnDsc_Backcolor ;
   private int edtTipMqnCod_Backcolor ;
   private int edtDisComULin_Backcolor ;
   private int edtTotNUni_Backcolor ;
   private int edtTotNPie_Backcolor ;
   private int edtDisObs_Backcolor ;
   private int edtDisNumCol_Backcolor ;
   private int edtDisDibNum_Backcolor ;
   private int edtDibMolCil_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtEmpesCod_Backcolor ;
   private int edtDisUniMed_Backcolor ;
   private int edtDisNumUni_Backcolor ;
   private int edtDisNumPie_Backcolor ;
   private int edtDisPieKgm_Backcolor ;
   private int edtDisPieMtr_Backcolor ;
   private int edtDisPiePie_Backcolor ;
   private int edtDisArtAnh_Backcolor ;
   private int edtDisArtAcb_Backcolor ;
   private int edtDisArtPt3_Backcolor ;
   private int edtDisArtTr3_Backcolor ;
   private int edtDisArtPt2_Backcolor ;
   private int edtDisArtTr2_Backcolor ;
   private int edtDisArtPt1_Backcolor ;
   private int edtDisArtTr1_Backcolor ;
   private int edtDisArtOpe_Backcolor ;
   private int edtDisArtTip_Backcolor ;
   private int edtDisArtLar_Backcolor ;
   private int edtDisArtDsc_Backcolor ;
   private int edtDisArtMat_Backcolor ;
   private int edtDisFecEnt_Backcolor ;
   private int edtDisFec_Backcolor ;
   private int edtDisArtCod_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtDisFecCli_Backcolor ;
   private int edtDisCliNum_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXt_int1 ;
   private int GXv_int5[] ;
   private int GXv_int4[] ;
   private int Z1053DisDibNum ;
   private int ZZ361DisCod ;
   private int ZZ1053DisDibNum ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private int Z1039EmpesPDis ;
   private int E361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z375DisNumUni ;
   private java.math.BigDecimal Z1018DibMetRea ;
   private java.math.BigDecimal O1018DibMetRea ;
   private java.math.BigDecimal O1055TotNUni ;
   private java.math.BigDecimal Z1058DisComMtr ;
   private java.math.BigDecimal O1058DisComMtr ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A1055TotNUni ;
   private java.math.BigDecimal A1018DibMetRea ;
   private java.math.BigDecimal B1018DibMetRea ;
   private java.math.BigDecimal B1055TotNUni ;
   private java.math.BigDecimal A1036EmpesUEnt ;
   private java.math.BigDecimal A1038EmpesUUti ;
   private java.math.BigDecimal AV22OldMtr ;
   private java.math.BigDecimal s1018DibMetRea ;
   private java.math.BigDecimal s1055TotNUni ;
   private java.math.BigDecimal A1058DisComMtr ;
   private java.math.BigDecimal A1040EmpesUDis ;
   private java.math.BigDecimal T1058DisComMtr ;
   private java.math.BigDecimal Z1055TotNUni ;
   private java.math.BigDecimal Z1036EmpesUEnt ;
   private java.math.BigDecimal Z1038EmpesUUti ;
   private java.math.BigDecimal Z381DisPieKgm ;
   private java.math.BigDecimal Z385DisPieMtr ;
   private java.math.BigDecimal ZZ375DisNumUni ;
   private java.math.BigDecimal ZZ1055TotNUni ;
   private java.math.BigDecimal ZZ1018DibMetRea ;
   private java.math.BigDecimal ZZ381DisPieKgm ;
   private java.math.BigDecimal ZZ385DisPieMtr ;
   private java.math.BigDecimal ZO1018DibMetRea ;
   private java.math.BigDecimal ZO1055TotNUni ;
   private java.math.BigDecimal Z1040EmpesUDis ;
   private java.math.BigDecimal ZV22OldMtr ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z757PriCod ;
   private String Z360DisCliNum ;
   private String Z335DisArtCod ;
   private String Z340DisArtMat ;
   private String Z337DisArtDsc ;
   private String Z339DisArtLar ;
   private String Z341DisArtOpe ;
   private String Z353DisArtTr1 ;
   private String Z354DisArtTr2 ;
   private String Z355DisArtTr3 ;
   private String Z365DisDes ;
   private String Z392DisUniMed ;
   private String Z1031EmpesCod ;
   private String Z1052DisObs ;
   private String Z362DisColNom ;
   private String Z1013DibCli ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String Z7735DisComObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String A365DisDes ;
   private String A1031EmpesCod ;
   private String A1032FonCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_250_idx="0001" ;
   private String Gx_mode ;
   private String A757PriCod ;
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
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDisCliNum_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtDisFecCli_Internalname ;
   private String edtDisFecCli_Jsonclick ;
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
   private String edtDisArtCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtDisFec_Internalname ;
   private String edtDisFec_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDisFecEnt_Internalname ;
   private String edtDisFecEnt_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDisArtMat_Internalname ;
   private String A340DisArtMat ;
   private String edtDisArtMat_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDisArtLar_Internalname ;
   private String A339DisArtLar ;
   private String edtDisArtLar_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDisArtTip_Internalname ;
   private String edtDisArtTip_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDisArtOpe_Internalname ;
   private String A341DisArtOpe ;
   private String edtDisArtOpe_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDisArtTr1_Internalname ;
   private String A353DisArtTr1 ;
   private String edtDisArtTr1_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDisArtPt1_Internalname ;
   private String edtDisArtPt1_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDisArtTr2_Internalname ;
   private String A354DisArtTr2 ;
   private String edtDisArtTr2_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtDisArtPt2_Internalname ;
   private String edtDisArtPt2_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtDisArtTr3_Internalname ;
   private String A355DisArtTr3 ;
   private String edtDisArtTr3_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDisArtPt3_Internalname ;
   private String edtDisArtPt3_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtDisArtAcb_Internalname ;
   private String edtDisArtAcb_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtDisArtAnh_Internalname ;
   private String edtDisArtAnh_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtDisPiePie_Internalname ;
   private String edtDisPiePie_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieMtr_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtDisPieKgm_Internalname ;
   private String edtDisPieKgm_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumUni_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtEmpesCod_Internalname ;
   private String edtEmpesCod_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtDibMolCil_Internalname ;
   private String edtDibMolCil_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtDisDibNum_Internalname ;
   private String edtDisDibNum_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtDisNumCol_Internalname ;
   private String edtDisNumCol_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtDisObs_Internalname ;
   private String A1052DisObs ;
   private String edtDisObs_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtTotNPie_Internalname ;
   private String edtTotNPie_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtTotNUni_Internalname ;
   private String edtTotNUni_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtDisComULin_Internalname ;
   private String edtDisComULin_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtTipMqnCod_Internalname ;
   private String edtTipMqnCod_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtTipMqnDsc_Internalname ;
   private String A3912TipMqnDsc ;
   private String edtTipMqnDsc_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtDibMetRea_Internalname ;
   private String edtDibMetRea_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtDisColNom_Internalname ;
   private String A362DisColNom ;
   private String edtDisColNom_Jsonclick ;
   private String sMode551 ;
   private String edtavnRcdDeleted_551_Internalname ;
   private String edtDisComLin_Internalname ;
   private String edtDisComCod_Internalname ;
   private String edtFonCod_Internalname ;
   private String edtDisComAnh_Internalname ;
   private String edtDisComMtr_Internalname ;
   private String edtDisComPie_Internalname ;
   private String edtEmpesPDis_Internalname ;
   private String edtEmpesUDis_Internalname ;
   private String edtDisComObs_Internalname ;
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
   private String AV63UsurCod ;
   private String AV18EmprCod ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode34 ;
   private String GXCCtl ;
   private String A1056DisComCod ;
   private String A7735DisComObs ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z3912TipMqnDsc ;
   private String sGXsfl_250_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_551_Jsonclick ;
   private String edtDisComLin_Jsonclick ;
   private String edtDisComCod_Jsonclick ;
   private String edtFonCod_Jsonclick ;
   private String edtDisComAnh_Jsonclick ;
   private String edtDisComMtr_Jsonclick ;
   private String edtDisComPie_Jsonclick ;
   private String edtEmpesPDis_Jsonclick ;
   private String edtEmpesUDis_Jsonclick ;
   private String edtDisComObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ757PriCod ;
   private String ZZ407EmprNom ;
   private String ZZ360DisCliNum ;
   private String ZZ279CliNom ;
   private String ZZ335DisArtCod ;
   private String ZZ340DisArtMat ;
   private String ZZ337DisArtDsc ;
   private String ZZ339DisArtLar ;
   private String ZZ341DisArtOpe ;
   private String ZZ353DisArtTr1 ;
   private String ZZ354DisArtTr2 ;
   private String ZZ355DisArtTr3 ;
   private String ZZ365DisDes ;
   private String ZZ392DisUniMed ;
   private String ZZ1031EmpesCod ;
   private String ZZ1013DibCli ;
   private String ZZ1052DisObs ;
   private String ZZ3912TipMqnDsc ;
   private String ZZ362DisColNom ;
   private String E396EmprCod ;
   private java.util.Date Z370DisFecCli ;
   private java.util.Date Z369DisFec ;
   private java.util.Date Z371DisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date ZZ370DisFecCli ;
   private java.util.Date ZZ369DisFec ;
   private java.util.Date ZZ371DisFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1013DibCli ;
   private boolean n1031EmpesCod ;
   private boolean wbErr ;
   private boolean n2525DisComULin ;
   private boolean n1018DibMetRea ;
   private boolean bGXsfl_250_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n387DisPiePie ;
   private boolean n1014DibInt ;
   private boolean n1019DibMolCil ;
   private boolean n1051DisNumCol ;
   private boolean n3911TipMqnCod ;
   private boolean n3912TipMqnDsc ;
   private boolean n362DisColNom ;
   private boolean Gx_longc ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
   private boolean n7735DisComObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPriCod ;
   private HTMLChoice cmbDisEst ;
   private ICheckbox chkDisDes ;
   private IDataStoreProvider pr_default ;
   private String[] T014O8_A407EmprNom ;
   private boolean[] T014O8_n407EmprNom ;
   private short[] T014O14_A387DisPiePie ;
   private boolean[] T014O14_n387DisPiePie ;
   private short[] T014O16_A1054TotNPie ;
   private java.math.BigDecimal[] T014O16_A1055TotNUni ;
   private String[] T014O9_A279CliNom ;
   private short[] T014O11_A1019DibMolCil ;
   private boolean[] T014O11_n1019DibMolCil ;
   private java.math.BigDecimal[] T014O11_A1018DibMetRea ;
   private boolean[] T014O11_n1018DibMetRea ;
   private byte[] T014O11_A3911TipMqnCod ;
   private boolean[] T014O11_n3911TipMqnCod ;
   private String[] T014O12_A3912TipMqnDsc ;
   private boolean[] T014O12_n3912TipMqnDsc ;
   private int[] T014O19_A361DisCod ;
   private String[] T014O19_A757PriCod ;
   private String[] T014O19_A407EmprNom ;
   private boolean[] T014O19_n407EmprNom ;
   private String[] T014O19_A360DisCliNum ;
   private java.util.Date[] T014O19_A370DisFecCli ;
   private String[] T014O19_A279CliNom ;
   private String[] T014O19_A335DisArtCod ;
   private java.util.Date[] T014O19_A369DisFec ;
   private java.util.Date[] T014O19_A371DisFecEnt ;
   private String[] T014O19_A340DisArtMat ;
   private String[] T014O19_A337DisArtDsc ;
   private String[] T014O19_A339DisArtLar ;
   private short[] T014O19_A352DisArtTip ;
   private String[] T014O19_A341DisArtOpe ;
   private String[] T014O19_A353DisArtTr1 ;
   private short[] T014O19_A344DisArtPt1 ;
   private String[] T014O19_A354DisArtTr2 ;
   private short[] T014O19_A345DisArtPt2 ;
   private String[] T014O19_A355DisArtTr3 ;
   private short[] T014O19_A346DisArtPt3 ;
   private short[] T014O19_A1232DisArtAcb ;
   private short[] T014O19_A334DisArtAnh ;
   private byte[] T014O19_A367DisEst ;
   private String[] T014O19_A365DisDes ;
   private short[] T014O19_A374DisNumPie ;
   private java.math.BigDecimal[] T014O19_A375DisNumUni ;
   private String[] T014O19_A392DisUniMed ;
   private String[] T014O19_A1031EmpesCod ;
   private boolean[] T014O19_n1031EmpesCod ;
   private short[] T014O19_A1019DibMolCil ;
   private boolean[] T014O19_n1019DibMolCil ;
   private short[] T014O19_A1051DisNumCol ;
   private boolean[] T014O19_n1051DisNumCol ;
   private String[] T014O19_A1052DisObs ;
   private byte[] T014O19_A2525DisComULin ;
   private boolean[] T014O19_n2525DisComULin ;
   private String[] T014O19_A3912TipMqnDsc ;
   private boolean[] T014O19_n3912TipMqnDsc ;
   private java.math.BigDecimal[] T014O19_A1018DibMetRea ;
   private boolean[] T014O19_n1018DibMetRea ;
   private String[] T014O19_A362DisColNom ;
   private boolean[] T014O19_n362DisColNom ;
   private String[] T014O19_A396EmprCod ;
   private int[] T014O19_A252CliCod ;
   private String[] T014O19_A1013DibCli ;
   private boolean[] T014O19_n1013DibCli ;
   private int[] T014O19_A1014DibInt ;
   private boolean[] T014O19_n1014DibInt ;
   private byte[] T014O19_A3911TipMqnCod ;
   private boolean[] T014O19_n3911TipMqnCod ;
   private short[] T014O19_A387DisPiePie ;
   private boolean[] T014O19_n387DisPiePie ;
   private short[] T014O19_A1054TotNPie ;
   private java.math.BigDecimal[] T014O19_A1055TotNUni ;
   private String[] T014O20_A396EmprCod ;
   private int[] T014O20_A361DisCod ;
   private String[] T014O7_A1031EmpesCod ;
   private boolean[] T014O7_n1031EmpesCod ;
   private int[] T014O7_A252CliCod ;
   private int[] T014O7_A361DisCod ;
   private String[] T014O7_A757PriCod ;
   private String[] T014O7_A360DisCliNum ;
   private java.util.Date[] T014O7_A370DisFecCli ;
   private String[] T014O7_A335DisArtCod ;
   private java.util.Date[] T014O7_A369DisFec ;
   private java.util.Date[] T014O7_A371DisFecEnt ;
   private String[] T014O7_A340DisArtMat ;
   private String[] T014O7_A337DisArtDsc ;
   private String[] T014O7_A339DisArtLar ;
   private short[] T014O7_A352DisArtTip ;
   private String[] T014O7_A341DisArtOpe ;
   private String[] T014O7_A353DisArtTr1 ;
   private short[] T014O7_A344DisArtPt1 ;
   private String[] T014O7_A354DisArtTr2 ;
   private short[] T014O7_A345DisArtPt2 ;
   private String[] T014O7_A355DisArtTr3 ;
   private short[] T014O7_A346DisArtPt3 ;
   private short[] T014O7_A1232DisArtAcb ;
   private short[] T014O7_A334DisArtAnh ;
   private byte[] T014O7_A367DisEst ;
   private String[] T014O7_A365DisDes ;
   private short[] T014O7_A374DisNumPie ;
   private java.math.BigDecimal[] T014O7_A375DisNumUni ;
   private String[] T014O7_A392DisUniMed ;
   private short[] T014O7_A1051DisNumCol ;
   private boolean[] T014O7_n1051DisNumCol ;
   private String[] T014O7_A1052DisObs ;
   private byte[] T014O7_A2525DisComULin ;
   private boolean[] T014O7_n2525DisComULin ;
   private String[] T014O7_A362DisColNom ;
   private boolean[] T014O7_n362DisColNom ;
   private String[] T014O7_A396EmprCod ;
   private String[] T014O7_A1013DibCli ;
   private boolean[] T014O7_n1013DibCli ;
   private int[] T014O7_A1014DibInt ;
   private boolean[] T014O7_n1014DibInt ;
   private String[] T014O21_A396EmprCod ;
   private int[] T014O21_A361DisCod ;
   private String[] T014O22_A396EmprCod ;
   private int[] T014O22_A361DisCod ;
   private String[] T014O6_A1031EmpesCod ;
   private boolean[] T014O6_n1031EmpesCod ;
   private int[] T014O6_A252CliCod ;
   private int[] T014O6_A361DisCod ;
   private String[] T014O6_A757PriCod ;
   private String[] T014O6_A360DisCliNum ;
   private java.util.Date[] T014O6_A370DisFecCli ;
   private String[] T014O6_A335DisArtCod ;
   private java.util.Date[] T014O6_A369DisFec ;
   private java.util.Date[] T014O6_A371DisFecEnt ;
   private String[] T014O6_A340DisArtMat ;
   private String[] T014O6_A337DisArtDsc ;
   private String[] T014O6_A339DisArtLar ;
   private short[] T014O6_A352DisArtTip ;
   private String[] T014O6_A341DisArtOpe ;
   private String[] T014O6_A353DisArtTr1 ;
   private short[] T014O6_A344DisArtPt1 ;
   private String[] T014O6_A354DisArtTr2 ;
   private short[] T014O6_A345DisArtPt2 ;
   private String[] T014O6_A355DisArtTr3 ;
   private short[] T014O6_A346DisArtPt3 ;
   private short[] T014O6_A1232DisArtAcb ;
   private short[] T014O6_A334DisArtAnh ;
   private byte[] T014O6_A367DisEst ;
   private String[] T014O6_A365DisDes ;
   private short[] T014O6_A374DisNumPie ;
   private java.math.BigDecimal[] T014O6_A375DisNumUni ;
   private String[] T014O6_A392DisUniMed ;
   private short[] T014O6_A1051DisNumCol ;
   private boolean[] T014O6_n1051DisNumCol ;
   private String[] T014O6_A1052DisObs ;
   private byte[] T014O6_A2525DisComULin ;
   private boolean[] T014O6_n2525DisComULin ;
   private String[] T014O6_A362DisColNom ;
   private boolean[] T014O6_n362DisColNom ;
   private String[] T014O6_A396EmprCod ;
   private String[] T014O6_A1013DibCli ;
   private boolean[] T014O6_n1013DibCli ;
   private int[] T014O6_A1014DibInt ;
   private boolean[] T014O6_n1014DibInt ;
   private short[] T014O23_A1019DibMolCil ;
   private boolean[] T014O23_n1019DibMolCil ;
   private java.math.BigDecimal[] T014O23_A1018DibMetRea ;
   private boolean[] T014O23_n1018DibMetRea ;
   private byte[] T014O23_A3911TipMqnCod ;
   private boolean[] T014O23_n3911TipMqnCod ;
   private String[] T014O27_A396EmprCod ;
   private int[] T014O27_A361DisCod ;
   private String[] T014O27_A13376DisTraID ;
   private String[] T014O28_A396EmprCod ;
   private int[] T014O28_A361DisCod ;
   private String[] T014O28_A13213DisNormID ;
   private String[] T014O29_A396EmprCod ;
   private int[] T014O29_A361DisCod ;
   private byte[] T014O29_A13081DisDGLin ;
   private String[] T014O29_A13082DisDGDibCl ;
   private int[] T014O29_A13083DisDGDibIn ;
   private String[] T014O29_A13084DisDGComb ;
   private String[] T014O29_A13085DisDGFondo ;
   private String[] T014O30_A396EmprCod ;
   private int[] T014O30_A361DisCod ;
   private byte[] T014O30_A7068DisNotLin ;
   private String[] T014O31_A396EmprCod ;
   private int[] T014O31_A361DisCod ;
   private String[] T014O31_A10197ProEspCod ;
   private String[] T014O32_A396EmprCod ;
   private int[] T014O32_A361DisCod ;
   private short[] T014O32_A4594AccCod ;
   private String[] T014O33_A396EmprCod ;
   private int[] T014O33_A361DisCod ;
   private int[] T014O33_A3398DisRefBarC ;
   private byte[] T014O33_A3399DisRefBCRe ;
   private String[] T014O33_A3400DisRefBCPa ;
   private String[] T014O33_A3607DisRefBPie ;
   private String[] T014O34_A396EmprCod ;
   private int[] T014O34_A361DisCod ;
   private byte[] T014O34_A376DisObsLin ;
   private String[] T014O35_A396EmprCod ;
   private int[] T014O35_A361DisCod ;
   private String[] T014O35_A758ProCod ;
   private String[] T014O36_A396EmprCod ;
   private int[] T014O36_A361DisCod ;
   private short[] T014O36_A833TipDefCod ;
   private String[] T014O37_A396EmprCod ;
   private int[] T014O37_A361DisCod ;
   private int[] T014O37_A44AlbRecCod ;
   private String[] T014O40_A396EmprCod ;
   private int[] T014O40_A361DisCod ;
   private int[] T014O42_A361DisCod ;
   private byte[] T014O42_A2524DisComLin ;
   private String[] T014O42_A1056DisComCod ;
   private short[] T014O42_A1057DisComAnh ;
   private boolean[] T014O42_n1057DisComAnh ;
   private java.math.BigDecimal[] T014O42_A1058DisComMtr ;
   private boolean[] T014O42_n1058DisComMtr ;
   private short[] T014O42_A1059DisComPie ;
   private boolean[] T014O42_n1059DisComPie ;
   private String[] T014O42_A7735DisComObs ;
   private boolean[] T014O42_n7735DisComObs ;
   private String[] T014O42_A396EmprCod ;
   private String[] T014O42_A1032FonCod ;
   private java.math.BigDecimal[] T014O42_A1036EmpesUEnt ;
   private java.math.BigDecimal[] T014O42_A1038EmpesUUti ;
   private int[] T014O42_A1035EmpesPEnt ;
   private int[] T014O42_A1037EmpesPUti ;
   private java.math.BigDecimal[] T014O5_A1036EmpesUEnt ;
   private java.math.BigDecimal[] T014O5_A1038EmpesUUti ;
   private int[] T014O5_A1035EmpesPEnt ;
   private int[] T014O5_A1037EmpesPUti ;
   private java.math.BigDecimal[] T014O44_A1036EmpesUEnt ;
   private java.math.BigDecimal[] T014O44_A1038EmpesUUti ;
   private int[] T014O44_A1035EmpesPEnt ;
   private int[] T014O44_A1037EmpesPUti ;
   private String[] T014O45_A396EmprCod ;
   private int[] T014O45_A361DisCod ;
   private byte[] T014O45_A2524DisComLin ;
   private String[] T014O45_A1056DisComCod ;
   private String[] T014O45_A1032FonCod ;
   private int[] T014O3_A361DisCod ;
   private byte[] T014O3_A2524DisComLin ;
   private String[] T014O3_A1056DisComCod ;
   private short[] T014O3_A1057DisComAnh ;
   private boolean[] T014O3_n1057DisComAnh ;
   private java.math.BigDecimal[] T014O3_A1058DisComMtr ;
   private boolean[] T014O3_n1058DisComMtr ;
   private short[] T014O3_A1059DisComPie ;
   private boolean[] T014O3_n1059DisComPie ;
   private String[] T014O3_A7735DisComObs ;
   private boolean[] T014O3_n7735DisComObs ;
   private String[] T014O3_A396EmprCod ;
   private String[] T014O3_A1032FonCod ;
   private int[] T014O2_A361DisCod ;
   private byte[] T014O2_A2524DisComLin ;
   private String[] T014O2_A1056DisComCod ;
   private short[] T014O2_A1057DisComAnh ;
   private boolean[] T014O2_n1057DisComAnh ;
   private java.math.BigDecimal[] T014O2_A1058DisComMtr ;
   private boolean[] T014O2_n1058DisComMtr ;
   private short[] T014O2_A1059DisComPie ;
   private boolean[] T014O2_n1059DisComPie ;
   private String[] T014O2_A7735DisComObs ;
   private boolean[] T014O2_n7735DisComObs ;
   private String[] T014O2_A396EmprCod ;
   private String[] T014O2_A1032FonCod ;
   private java.math.BigDecimal[] T014O50_A1036EmpesUEnt ;
   private java.math.BigDecimal[] T014O50_A1038EmpesUUti ;
   private int[] T014O50_A1035EmpesPEnt ;
   private int[] T014O50_A1037EmpesPUti ;
   private String[] T014O51_A396EmprCod ;
   private int[] T014O51_A361DisCod ;
   private byte[] T014O51_A2524DisComLin ;
   private String[] T014O51_A1056DisComCod ;
   private String[] T014O51_A1032FonCod ;
   private String[] T014O52_A407EmprNom ;
   private boolean[] T014O52_n407EmprNom ;
   private short[] T014O54_A387DisPiePie ;
   private boolean[] T014O54_n387DisPiePie ;
   private short[] T014O56_A1054TotNPie ;
   private java.math.BigDecimal[] T014O56_A1055TotNUni ;
   private java.math.BigDecimal[] T014O57_A631Metros ;
   private java.math.BigDecimal[] T014O58_A384DisPieMet ;
   private java.math.BigDecimal[] T014O59_A595Kilos ;
   private java.math.BigDecimal[] T014O60_A382DisPieKil ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T014O10_A1019DibMolCil ;
   private java.math.BigDecimal[] T014O10_A1018DibMetRea ;
   private byte[] T014O10_A3911TipMqnCod ;
   private boolean[] T014O10_n1019DibMolCil ;
   private boolean[] T014O10_n1018DibMetRea ;
   private boolean[] T014O10_n3911TipMqnCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txdisco__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdisco__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdisco__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdisco__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txdisco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T014O2", "SELECT DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?  FOR UPDATE OF DisComAnh, DisComMtr, DisComPie, DisComObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O3", "SELECT DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O5", "SELECT COALESCE( T1.EmpesUEnt, 0) AS EmpesUEnt, COALESCE( T1.EmpesUUti, 0) AS EmpesUUti, COALESCE( T1.EmpesPEnt, 0) AS EmpesPEnt, COALESCE( T1.EmpesPUti, 0) AS EmpesPUti FROM (SELECT SUM(EmpesUEntL) AS EmpesUEnt, EmprCod, EmpesCod, CliCod, FonCod, SUM(EmpesUUtiL) AS EmpesUUti, SUM(EmpesPEntL) AS EmpesPEnt, SUM(EmpesPUtiL) AS EmpesPUti FROM TXPLEMPES GROUP BY EmprCod, EmpesCod, CliCod, FonCod ) T1 WHERE T1.EmprCod = ? AND T1.EmpesCod = ? AND T1.CliCod = ? AND T1.FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O6", "SELECT EmpesCod, CliCod, DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtMat, DisArtDsc, DisArtLar, DisArtTip, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtAcb, DisArtAnh, DisEst, DisDes, DisNumPie, DisNumUni, DisUniMed, DisNumCol, DisObs, DisComULin, DisColNom, EmprCod, DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtMat, DisArtDsc, DisArtLar, DisArtTip, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtAcb, DisArtAnh, DisEst, DisDes, DisNumPie, DisNumUni, DisUniMed, EmpesCod, DisNumCol, DisObs, DisComULin, DisColNom, CliCod, DibCli, DibInt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O7", "SELECT EmpesCod, CliCod, DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtMat, DisArtDsc, DisArtLar, DisArtTip, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtAcb, DisArtAnh, DisEst, DisDes, DisNumPie, DisNumUni, DisUniMed, DisNumCol, DisObs, DisComULin, DisColNom, EmprCod, DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O10", "SELECT DibMolCil, DibMetRea, TipMqnCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?  FOR UPDATE OF DibMetRea NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O11", "SELECT DibMolCil, DibMetRea, TipMqnCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O12", "SELECT TipMqnDsc FROM TXPTIPMQN WHERE EmprCod = ? AND TipMqnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O14", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O16", "SELECT COALESCE( T1.TotNPie, 0) AS TotNPie, COALESCE( T1.TotNUni, 0) AS TotNUni FROM (SELECT SUM(DisComPie) AS TotNPie, EmprCod, DisCod, SUM(DisComMtr) AS TotNUni FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O19", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.PriCod, T2.EmprNom, TM1.DisCliNum, TM1.DisFecCli, T3.CliNom, TM1.DisArtCod, TM1.DisFec, TM1.DisFecEnt, TM1.DisArtMat, TM1.DisArtDsc, TM1.DisArtLar, TM1.DisArtTip, TM1.DisArtOpe, TM1.DisArtTr1, TM1.DisArtPt1, TM1.DisArtTr2, TM1.DisArtPt2, TM1.DisArtTr3, TM1.DisArtPt3, TM1.DisArtAcb, TM1.DisArtAnh, TM1.DisEst, TM1.DisDes, TM1.DisNumPie, TM1.DisNumUni, TM1.DisUniMed, TM1.EmpesCod, T4.DibMolCil, TM1.DisNumCol, TM1.DisObs, TM1.DisComULin, T5.TipMqnDsc, T4.DibMetRea, TM1.DisColNom, TM1.EmprCod, TM1.CliCod, TM1.DibCli, TM1.DibInt, T4.TipMqnCod, COALESCE( T6.DisPiePie, 0) AS DisPiePie, COALESCE( T7.TotNPie, 0) AS TotNPie, COALESCE( T7.TotNUni, 0) AS TotNUni FROM ((((((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPCDIBUJ T4 ON T4.EmprCod = TM1.EmprCod AND T4.DibCli = TM1.DibCli AND T4.CliCod = TM1.CliCod AND T4.DibInt = TM1.DibInt) LEFT JOIN TXPTIPMQN T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipMqnCod = T4.TipMqnCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.DisCod = TM1.DisCod) LEFT JOIN (SELECT SUM(DisComPie) AS TotNPie, EmprCod, DisCod, SUM(DisComMtr) AS TotNUni FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T7 ON T7.EmprCod = TM1.EmprCod AND T7.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O20", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O23", "SELECT DibMolCil, DibMetRea, TipMqnCod FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?  FOR UPDATE OF DibMetRea NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T014O24", "INSERT INTO TXPDISPOS(DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtMat, DisArtDsc, DisArtLar, DisArtTip, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtAcb, DisArtAnh, DisEst, DisDes, DisNumPie, DisNumUni, DisUniMed, EmpesCod, DisNumCol, DisObs, DisComULin, DisColNom, EmprCod, CliCod, DibCli, DibInt, DisArtPes, DisColNum, DisTipCol, DisEnt, DisObsULin, DisArtSua, DisArtAca, DisArtPle, DisArtEnc, DisArtCor, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T014O25", "UPDATE TXPDISPOS SET PriCod=?, DisCliNum=?, DisFecCli=?, DisArtCod=?, DisFec=?, DisFecEnt=?, DisArtMat=?, DisArtDsc=?, DisArtLar=?, DisArtTip=?, DisArtOpe=?, DisArtTr1=?, DisArtPt1=?, DisArtTr2=?, DisArtPt2=?, DisArtTr3=?, DisArtPt3=?, DisArtAcb=?, DisArtAnh=?, DisEst=?, DisDes=?, DisNumPie=?, DisNumUni=?, DisUniMed=?, EmpesCod=?, DisNumCol=?, DisObs=?, DisComULin=?, DisColNom=?, CliCod=?, DibCli=?, DibInt=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T014O26", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T014O27", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O28", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O29", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O30", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O31", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O32", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O33", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O34", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O35", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O36", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O37", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T014O38", "UPDATE TXPDISPOS SET DisComULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T014O39", "UPDATE TXPCDIBUJ SET DibMetRea=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK, "TXPCDIBUJ")
         ,new ForEachCursor("T014O40", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T014O42", "SELECT T1.DisCod, T1.DisComLin, T1.DisComCod, T1.DisComAnh, T1.DisComMtr, T1.DisComPie, T1.DisComObs, T1.EmprCod, T1.FonCod, COALESCE( T2.EmpesUEnt, 0) AS EmpesUEnt, COALESCE( T2.EmpesUUti, 0) AS EmpesUUti, COALESCE( T2.EmpesPEnt, 0) AS EmpesPEnt, COALESCE( T2.EmpesPUti, 0) AS EmpesPUti FROM (TXPDISCOM T1 LEFT JOIN (SELECT SUM(EmpesUEntL) AS EmpesUEnt, EmprCod, EmpesCod, CliCod, FonCod, SUM(EmpesUUtiL) AS EmpesUUti, SUM(EmpesPEntL) AS EmpesPEnt, SUM(EmpesPUtiL) AS EmpesPUti FROM TXPLEMPES GROUP BY EmprCod, EmpesCod, CliCod, FonCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.EmpesCod = ? AND T2.CliCod = ? AND T2.FonCod = T1.FonCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.DisComLin = ? and T1.DisComCod = ? and T1.FonCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisComLin, T1.DisComCod, T1.FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O44", "SELECT COALESCE( T1.EmpesUEnt, 0) AS EmpesUEnt, COALESCE( T1.EmpesUUti, 0) AS EmpesUUti, COALESCE( T1.EmpesPEnt, 0) AS EmpesPEnt, COALESCE( T1.EmpesPUti, 0) AS EmpesPUti FROM (SELECT SUM(EmpesUEntL) AS EmpesUEnt, EmprCod, EmpesCod, CliCod, FonCod, SUM(EmpesUUtiL) AS EmpesUUti, SUM(EmpesPEntL) AS EmpesPEnt, SUM(EmpesPUtiL) AS EmpesPUti FROM TXPLEMPES GROUP BY EmprCod, EmpesCod, CliCod, FonCod ) T1 WHERE T1.EmprCod = ? AND T1.EmpesCod = ? AND T1.CliCod = ? AND T1.FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O45", "SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T014O46", "INSERT INTO TXPDISCOM(DisCod, DisComLin, DisComCod, DisComAnh, DisComMtr, DisComPie, DisComObs, EmprCod, FonCod, DisComDibC, DisComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK, "TXPDISCOM")
         ,new UpdateCursor("T014O47", "UPDATE TXPDISCOM SET DisComAnh=?, DisComMtr=?, DisComPie=?, DisComObs=?  WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPDISCOM")
         ,new UpdateCursor("T014O48", "DELETE FROM TXPDISCOM  WHERE EmprCod = ? AND DisCod = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPDISCOM")
         ,new ForEachCursor("T014O50", "SELECT COALESCE( T1.EmpesUEnt, 0) AS EmpesUEnt, COALESCE( T1.EmpesUUti, 0) AS EmpesUUti, COALESCE( T1.EmpesPEnt, 0) AS EmpesPEnt, COALESCE( T1.EmpesPUti, 0) AS EmpesPUti FROM (SELECT SUM(EmpesUEntL) AS EmpesUEnt, EmprCod, EmpesCod, CliCod, FonCod, SUM(EmpesUUtiL) AS EmpesUUti, SUM(EmpesPEntL) AS EmpesPEnt, SUM(EmpesPUtiL) AS EmpesPUti FROM TXPLEMPES GROUP BY EmprCod, EmpesCod, CliCod, FonCod ) T1 WHERE T1.EmprCod = ? AND T1.EmpesCod = ? AND T1.CliCod = ? AND T1.FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O51", "SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O52", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O54", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O56", "SELECT COALESCE( T1.TotNPie, 0) AS TotNPie, COALESCE( T1.TotNUni, 0) AS TotNUni FROM (SELECT SUM(DisComPie) AS TotNPie, EmprCod, DisCod, SUM(DisComMtr) AS TotNUni FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O57", "SELECT SUM(Metros) AS GXC5 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O58", "SELECT SUM(DisPieMet) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O59", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T014O60", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 70);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 70);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 12);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 2);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 4);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 4);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((short[]) buf[28])[0] = rslt.getShort(28);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(29, 30);
               ((byte[]) buf[31])[0] = rslt.getByte(30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(31, 13);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 3);
               ((String[]) buf[36])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(34);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 2);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 4);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 4);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((short[]) buf[28])[0] = rslt.getShort(28);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(29, 30);
               ((byte[]) buf[31])[0] = rslt.getByte(30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(31, 13);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 3);
               ((String[]) buf[36])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((int[]) buf[38])[0] = rslt.getInt(34);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 2);
               ((String[]) buf[15])[0] = rslt.getString(15, 4);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 4);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 4);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 1);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((String[]) buf[28])[0] = rslt.getString(28, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(31, 30);
               ((byte[]) buf[35])[0] = rslt.getByte(32);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(33, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(35, 13);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(36, 3);
               ((int[]) buf[44])[0] = rslt.getInt(37);
               ((String[]) buf[45])[0] = rslt.getString(38, 16);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(39);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(41);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(42);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(43,2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 70);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((String[]) buf[12])[0] = rslt.getString(9, 12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               return;
            case 35 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 40 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 43 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 45 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 46 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 47 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 48 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 2);
               stmt.setString(13, (String)parms[12], 4);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 4);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 4);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setString(22, (String)parms[21], 1);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setString(25, (String)parms[24], 1);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[26], 16);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[28]).shortValue());
               }
               stmt.setString(28, (String)parms[29], 30);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[33], 13);
               }
               stmt.setString(31, (String)parms[34], 3);
               stmt.setInt(32, ((Number) parms[35]).intValue());
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[37], 16);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[39]).intValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 26);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 2);
               stmt.setString(12, (String)parms[11], 4);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 4);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 4);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setString(21, (String)parms[20], 1);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setString(24, (String)parms[23], 1);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 16);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[27]).shortValue());
               }
               stmt.setString(27, (String)parms[28], 30);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[32], 13);
               }
               stmt.setInt(30, ((Number) parms[33]).intValue());
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[35], 16);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[37]).intValue());
               }
               stmt.setString(33, (String)parms[38], 3);
               stmt.setInt(34, ((Number) parms[39]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setInt(4, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 12);
               stmt.setString(7, (String)parms[7], 12);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 12);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 37 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 12);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 70);
               }
               stmt.setString(8, (String)parms[11], 3);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 38 :
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 70);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 12);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

