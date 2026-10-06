package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thispzs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A602MaqCod, A558HisProFec) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PIEZAS EN LHIPRO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqCod_Internalname ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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

   public thispzs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thispzs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thispzs_impl.class ));
   }

   public thispzs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISPZS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFec_Internalname, localUtil.format(A558HisProFec, "99/99/99"), localUtil.format( A558HisProFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFec_Jsonclick, 0, "", "", "", "", "", 1, edtHisProFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISPZS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISPZS.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Linea Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProLin_Jsonclick, 0, "", "", "", "", "", 1, edtHisProLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1369 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1369 = (short)(1) ;
            scanStart16Z1369( ) ;
            while ( RcdFound1369 != 0 )
            {
               init_level_properties1369( ) ;
               getByPrimaryKey16Z1369( ) ;
               addRow16Z1369( ) ;
               scanNext16Z1369( ) ;
            }
            scanEnd16Z1369( ) ;
            nBlankRcdCount1369 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal16Z1369( ) ;
         standaloneModal16Z1369( ) ;
         sMode1369 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow16Z1369( ) ;
            edtavnRcdDeleted_1369_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1369_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1369_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1369_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROCP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProNR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProNR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNR_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProKP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROKP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProKP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProMP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProA1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROA1_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProA1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProA1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProA2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROA2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProA2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProA2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProPg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROPG_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProPg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProPg_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProKA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROKA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProKA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKA_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtHisProMA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHisProMA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMA_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1369 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16Z1369( ) ;
            }
            sendRow16Z1369( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1369 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1369 = (short)(5) ;
         nRcdExists_1369 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16Z1369( ) ;
            while ( RcdFound1369 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451369( ) ;
               init_level_properties1369( ) ;
               standaloneNotModal16Z1369( ) ;
               getByPrimaryKey16Z1369( ) ;
               standaloneModal16Z1369( ) ;
               addRow16Z1369( ) ;
               scanNext16Z1369( ) ;
            }
            scanEnd16Z1369( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1369 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451369( ) ;
      initAll16Z1369( ) ;
      init_level_properties1369( ) ;
      nRcdExists_1369 = (short)(0) ;
      nIsMod_1369 = (short)(0) ;
      nRcdDeleted_1369 = (short)(0) ;
      nBlankRcdCount1369 = (short)(nBlankRcdUsr1369+nBlankRcdCount1369) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1369 > 0 )
      {
         standaloneNotModal16Z1369( ) ;
         standaloneModal16Z1369( ) ;
         addRow16Z1369( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHisProCP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1369 = (short)(nBlankRcdCount1369-1) ;
      }
      Gx_mode = sMode1369 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISPZS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISPZS.htm");
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
      e1116Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z558HisProFec = localUtil.ctod( httpContext.cgiGet( "Z558HisProFec"), 0) ;
            Z561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z561HisProLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            if ( localUtil.vcdate( httpContext.cgiGet( edtHisProFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISPROFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHisProFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A558HisProFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            }
            else
            {
               A558HisProFec = localUtil.ctod( httpContext.cgiGet( edtHisProFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHisProLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A561HisProLin = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            }
            else
            {
               A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
               A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
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
                        e1116Z2 ();
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
            initAll16Z59( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1369_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1369_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes16Z59( ) ;
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

   public void confirm_16Z0( )
   {
      beforeValidate16Z59( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16Z59( ) ;
         }
         else
         {
            checkExtendedTable16Z59( ) ;
            if ( AnyError == 0 )
            {
               zm16Z59( 2) ;
               zm16Z59( 3) ;
            }
            closeExtendedTableCursors16Z59( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode59 = Gx_mode ;
         confirm_16Z1369( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode59 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues16Z0( ) ;
      }
   }

   public void confirm_16Z1369( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow16Z1369( ) ;
         if ( ( nRcdExists_1369 != 0 ) || ( nIsMod_1369 != 0 ) )
         {
            getKey16Z1369( ) ;
            if ( ( nRcdExists_1369 == 0 ) && ( nRcdDeleted_1369 == 0 ) )
            {
               if ( RcdFound1369 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16Z1369( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16Z1369( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors16Z1369( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HISPROCP_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHisProCP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1369 != 0 )
               {
                  if ( nRcdDeleted_1369 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16Z1369( ) ;
                     load16Z1369( ) ;
                     beforeValidate16Z1369( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16Z1369( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1369 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16Z1369( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16Z1369( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors16Z1369( ) ;
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
                  if ( nRcdDeleted_1369 == 0 )
                  {
                     GXCCtl = "HISPROCP_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHisProCP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1369_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProCP_Internalname, GXutil.rtrim( A10090HisProCP)) ;
         httpContext.changePostValue( edtHisProNR_Internalname, GXutil.ltrim( localUtil.ntoc( A10091HisProNR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProKP_Internalname, GXutil.ltrim( localUtil.ntoc( A10092HisProKP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMP_Internalname, GXutil.ltrim( localUtil.ntoc( A10093HisProMP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProA1_Internalname, GXutil.ltrim( localUtil.ntoc( A10094HisProA1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProA2_Internalname, GXutil.ltrim( localUtil.ntoc( A10095HisProA2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProPg_Internalname, GXutil.ltrim( localUtil.ntoc( A10096HisProPg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProKA_Internalname, GXutil.ltrim( localUtil.ntoc( A10097HisProKA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMA_Internalname, GXutil.ltrim( localUtil.ntoc( A10098HisProMA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10090HisProCP_"+sGXsfl_45_idx, GXutil.rtrim( Z10090HisProCP)) ;
         httpContext.changePostValue( "ZT_"+"Z10091HisProNR_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10091HisProNR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10092HisProKP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10092HisProKP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10093HisProMP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10093HisProMP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10094HisProA1_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10094HisProA1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10095HisProA2_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10095HisProA2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10096HisProPg_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10096HisProPg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10097HisProKA_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10097HisProKA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10098HisProMA_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10098HisProMA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1369_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1369_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1369_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1369 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1369_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1369_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROCP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRONR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROKP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROA1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROA2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROPG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProPg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROKA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16Z0( )
   {
   }

   public void e1116Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thispzs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thispzs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thispzs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thispzs_impl.this.A396EmprCod = GXv_char2[0] ;
      thispzs_impl.this.AV11EmprNom = GXv_char3[0] ;
      thispzs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm16Z59( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z561HisProLin = A561HisProLin ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THISPZS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T016Z6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016Z6_A407EmprNom[0] ;
      n407EmprNom = T016Z6_n407EmprNom[0] ;
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

   public void load16Z59( )
   {
      /* Using cursor T016Z8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A407EmprNom = T016Z8_A407EmprNom[0] ;
         n407EmprNom = T016Z8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm16Z59( -1) ;
      }
      pr_default.close(6);
      onLoadActions16Z59( ) ;
   }

   public void onLoadActions16Z59( )
   {
   }

   public void checkExtendedTable16Z59( )
   {
      nIsDirty_59 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T016Z7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors16Z59( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         String A602MaqCod ,
                         java.util.Date A558HisProFec )
   {
      /* Using cursor T016Z9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey16Z59( )
   {
      /* Using cursor T016Z10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound59 = (short)(1) ;
      }
      else
      {
         RcdFound59 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016Z5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T016Z5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16Z59( 1) ;
         RcdFound59 = (short)(1) ;
         A561HisProLin = T016Z5_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         A602MaqCod = T016Z5_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T016Z5_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16Z59( ) ;
         if ( AnyError == 1 )
         {
            RcdFound59 = (short)(0) ;
            initializeNonKey16Z59( ) ;
         }
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound59 = (short)(0) ;
         initializeNonKey16Z59( ) ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey16Z59( ) ;
      if ( RcdFound59 == 0 )
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
      RcdFound59 = (short)(0) ;
      /* Using cursor T016Z11 */
      pr_default.execute(9, new Object[] {A602MaqCod, A602MaqCod, A558HisProFec, A558HisProFec, A602MaqCod, Integer.valueOf(A561HisProLin), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T016Z11_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T016Z11_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.resetTime(T016Z11_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) || GXutil.dateCompare(GXutil.resetTime(T016Z11_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( GXutil.strcmp(T016Z11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T016Z11_A561HisProLin[0] < A561HisProLin ) ) && ( GXutil.strcmp(T016Z11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T016Z11_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T016Z11_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.resetTime(T016Z11_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) || GXutil.dateCompare(GXutil.resetTime(T016Z11_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( GXutil.strcmp(T016Z11_A602MaqCod[0], A602MaqCod) == 0 ) && ( T016Z11_A561HisProLin[0] > A561HisProLin ) ) && ( GXutil.strcmp(T016Z11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T016Z11_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T016Z11_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            A561HisProLin = T016Z11_A561HisProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound59 = (short)(0) ;
      /* Using cursor T016Z12 */
      pr_default.execute(10, new Object[] {A602MaqCod, A602MaqCod, A558HisProFec, A558HisProFec, A602MaqCod, Integer.valueOf(A561HisProLin), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T016Z12_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T016Z12_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.resetTime(T016Z12_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) || GXutil.dateCompare(GXutil.resetTime(T016Z12_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( GXutil.strcmp(T016Z12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T016Z12_A561HisProLin[0] > A561HisProLin ) ) && ( GXutil.strcmp(T016Z12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T016Z12_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T016Z12_A602MaqCod[0], A602MaqCod) == 0 ) && GXutil.resetTime(T016Z12_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) || GXutil.dateCompare(GXutil.resetTime(T016Z12_A558HisProFec[0]), GXutil.resetTime(A558HisProFec)) && ( GXutil.strcmp(T016Z12_A602MaqCod[0], A602MaqCod) == 0 ) && ( T016Z12_A561HisProLin[0] < A561HisProLin ) ) && ( GXutil.strcmp(T016Z12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T016Z12_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T016Z12_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            A561HisProLin = T016Z12_A561HisProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16Z59( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16Z59( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound59 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
            {
               A602MaqCod = Z602MaqCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A558HisProFec = Z558HisProFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
               A561HisProLin = Z561HisProLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update16Z59( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16Z59( ) ;
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
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16Z59( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
      {
         A602MaqCod = Z602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = Z558HisProFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = Z561HisProLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqCod_Internalname ;
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
      getKey16Z59( ) ;
      if ( RcdFound59 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
         {
            A602MaqCod = Z602MaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = Z558HisProFec ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            A561HisProLin = Z561HisProLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thispzs");
   }

   public void insert_check( )
   {
      confirm_16Z0( ) ;
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
      if ( RcdFound59 == 0 )
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
      scanStart16Z59( ) ;
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16Z59( ) ;
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
      if ( RcdFound59 == 0 )
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
      if ( RcdFound59 == 0 )
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
      scanStart16Z59( ) ;
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound59 != 0 )
         {
            scanNext16Z59( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd16Z59( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16Z59( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016Z4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLHIPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16Z59( )
   {
      beforeValidate16Z59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Z59( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16Z59( 0) ;
         checkOptimisticConcurrency16Z59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16Z59( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16Z59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016Z13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A561HisProLin), A396EmprCod, A602MaqCod, A558HisProFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
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
                        processLevel16Z59( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16Z0( ) ;
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
            load16Z59( ) ;
         }
         endLevel16Z59( ) ;
      }
      closeExtendedTableCursors16Z59( ) ;
   }

   public void update16Z59( )
   {
      beforeValidate16Z59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Z59( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16Z59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16Z59( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16Z59( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPLHIPRO */
                  deferredUpdate16Z59( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16Z59( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16Z0( ) ;
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
         endLevel16Z59( ) ;
      }
      closeExtendedTableCursors16Z59( ) ;
   }

   public void deferredUpdate16Z59( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16Z59( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16Z59( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16Z59( ) ;
         afterConfirm16Z59( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16Z59( ) ;
            if ( AnyError == 0 )
            {
               scanStart16Z1369( ) ;
               while ( RcdFound1369 != 0 )
               {
                  getByPrimaryKey16Z1369( ) ;
                  delete16Z1369( ) ;
                  scanNext16Z1369( ) ;
               }
               scanEnd16Z1369( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016Z14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound59 == 0 )
                        {
                           initAll16Z59( ) ;
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
                        resetCaption16Z0( ) ;
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
      sMode59 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16Z59( ) ;
      Gx_mode = sMode59 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16Z59( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T016Z15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURAR PARAMETROS PERCHAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T016Z16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS EMPAQUETAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T016Z17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS CALANDRAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T016Z18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA DATOS ABRIR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T016Z19 */
         pr_default.execute(17, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Histórico de parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel16Z1369( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow16Z1369( ) ;
         if ( ( nRcdExists_1369 != 0 ) || ( nIsMod_1369 != 0 ) )
         {
            standaloneNotModal16Z1369( ) ;
            getKey16Z1369( ) ;
            if ( ( nRcdExists_1369 == 0 ) && ( nRcdDeleted_1369 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16Z1369( ) ;
            }
            else
            {
               if ( RcdFound1369 != 0 )
               {
                  if ( ( nRcdDeleted_1369 != 0 ) && ( nRcdExists_1369 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16Z1369( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1369 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16Z1369( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1369 == 0 )
                  {
                     GXCCtl = "HISPROCP_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHisProCP_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1369_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProCP_Internalname, GXutil.rtrim( A10090HisProCP)) ;
         httpContext.changePostValue( edtHisProNR_Internalname, GXutil.ltrim( localUtil.ntoc( A10091HisProNR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProKP_Internalname, GXutil.ltrim( localUtil.ntoc( A10092HisProKP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMP_Internalname, GXutil.ltrim( localUtil.ntoc( A10093HisProMP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProA1_Internalname, GXutil.ltrim( localUtil.ntoc( A10094HisProA1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProA2_Internalname, GXutil.ltrim( localUtil.ntoc( A10095HisProA2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProPg_Internalname, GXutil.ltrim( localUtil.ntoc( A10096HisProPg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProKA_Internalname, GXutil.ltrim( localUtil.ntoc( A10097HisProKA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHisProMA_Internalname, GXutil.ltrim( localUtil.ntoc( A10098HisProMA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10090HisProCP_"+sGXsfl_45_idx, GXutil.rtrim( Z10090HisProCP)) ;
         httpContext.changePostValue( "ZT_"+"Z10091HisProNR_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10091HisProNR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10092HisProKP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10092HisProKP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10093HisProMP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10093HisProMP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10094HisProA1_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10094HisProA1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10095HisProA2_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10095HisProA2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10096HisProPg_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10096HisProPg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10097HisProKA_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10097HisProKA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10098HisProMA_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10098HisProMA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1369_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1369_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1369_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1369 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1369_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1369_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROCP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPRONR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROKP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROA1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROA2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROPG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProPg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROKA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HISPROMA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16Z1369( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1369 = (short)(0) ;
      nIsMod_1369 = (short)(0) ;
      nRcdDeleted_1369 = (short)(0) ;
   }

   public void processLevel16Z59( )
   {
      /* Save parent mode. */
      sMode59 = Gx_mode ;
      processNestedLevel16Z1369( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode59 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16Z59( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16Z59( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thispzs");
         if ( AnyError == 0 )
         {
            confirmValues16Z0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thispzs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16Z59( )
   {
      /* Scan By routine */
      /* Using cursor T016Z20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A602MaqCod = T016Z20_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T016Z20_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = T016Z20_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16Z59( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A602MaqCod = T016Z20_A602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T016Z20_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = T016Z20_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      }
   }

   public void scanEnd16Z59( )
   {
      pr_default.close(18);
   }

   public void afterConfirm16Z59( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16Z59( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16Z59( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16Z59( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16Z59( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16Z59( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16Z59( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtHisProFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHisProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), true);
   }

   public void zm16Z1369( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10091HisProNR = T016Z3_A10091HisProNR[0] ;
            Z10092HisProKP = T016Z3_A10092HisProKP[0] ;
            Z10093HisProMP = T016Z3_A10093HisProMP[0] ;
            Z10094HisProA1 = T016Z3_A10094HisProA1[0] ;
            Z10095HisProA2 = T016Z3_A10095HisProA2[0] ;
            Z10096HisProPg = T016Z3_A10096HisProPg[0] ;
            Z10097HisProKA = T016Z3_A10097HisProKA[0] ;
            Z10098HisProMA = T016Z3_A10098HisProMA[0] ;
         }
         else
         {
            Z10091HisProNR = A10091HisProNR ;
            Z10092HisProKP = A10092HisProKP ;
            Z10093HisProMP = A10093HisProMP ;
            Z10094HisProA1 = A10094HisProA1 ;
            Z10095HisProA2 = A10095HisProA2 ;
            Z10096HisProPg = A10096HisProPg ;
            Z10097HisProKA = A10097HisProKA ;
            Z10098HisProMA = A10098HisProMA ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         Z10090HisProCP = A10090HisProCP ;
         Z10091HisProNR = A10091HisProNR ;
         Z10092HisProKP = A10092HisProKP ;
         Z10093HisProMP = A10093HisProMP ;
         Z10094HisProA1 = A10094HisProA1 ;
         Z10095HisProA2 = A10095HisProA2 ;
         Z10096HisProPg = A10096HisProPg ;
         Z10097HisProKA = A10097HisProKA ;
         Z10098HisProMA = A10098HisProMA ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal16Z1369( )
   {
   }

   public void standaloneModal16Z1369( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHisProCP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHisProCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtHisProCP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHisProCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load16Z1369( )
   {
      /* Using cursor T016Z21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1369 = (short)(1) ;
         A10091HisProNR = T016Z21_A10091HisProNR[0] ;
         n10091HisProNR = T016Z21_n10091HisProNR[0] ;
         A10092HisProKP = T016Z21_A10092HisProKP[0] ;
         n10092HisProKP = T016Z21_n10092HisProKP[0] ;
         A10093HisProMP = T016Z21_A10093HisProMP[0] ;
         n10093HisProMP = T016Z21_n10093HisProMP[0] ;
         A10094HisProA1 = T016Z21_A10094HisProA1[0] ;
         n10094HisProA1 = T016Z21_n10094HisProA1[0] ;
         A10095HisProA2 = T016Z21_A10095HisProA2[0] ;
         n10095HisProA2 = T016Z21_n10095HisProA2[0] ;
         A10096HisProPg = T016Z21_A10096HisProPg[0] ;
         n10096HisProPg = T016Z21_n10096HisProPg[0] ;
         A10097HisProKA = T016Z21_A10097HisProKA[0] ;
         n10097HisProKA = T016Z21_n10097HisProKA[0] ;
         A10098HisProMA = T016Z21_A10098HisProMA[0] ;
         n10098HisProMA = T016Z21_n10098HisProMA[0] ;
         zm16Z1369( -4) ;
      }
      pr_default.close(19);
      onLoadActions16Z1369( ) ;
   }

   public void onLoadActions16Z1369( )
   {
   }

   public void checkExtendedTable16Z1369( )
   {
      nIsDirty_1369 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16Z1369( ) ;
   }

   public void closeExtendedTableCursors16Z1369( )
   {
   }

   public void enableDisable16Z1369( )
   {
   }

   public void getKey16Z1369( )
   {
      /* Using cursor T016Z22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1369 = (short)(1) ;
      }
      else
      {
         RcdFound1369 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey16Z1369( )
   {
      /* Using cursor T016Z3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016Z3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16Z1369( 4) ;
         RcdFound1369 = (short)(1) ;
         initializeNonKey16Z1369( ) ;
         A10090HisProCP = T016Z3_A10090HisProCP[0] ;
         A10091HisProNR = T016Z3_A10091HisProNR[0] ;
         n10091HisProNR = T016Z3_n10091HisProNR[0] ;
         A10092HisProKP = T016Z3_A10092HisProKP[0] ;
         n10092HisProKP = T016Z3_n10092HisProKP[0] ;
         A10093HisProMP = T016Z3_A10093HisProMP[0] ;
         n10093HisProMP = T016Z3_n10093HisProMP[0] ;
         A10094HisProA1 = T016Z3_A10094HisProA1[0] ;
         n10094HisProA1 = T016Z3_n10094HisProA1[0] ;
         A10095HisProA2 = T016Z3_A10095HisProA2[0] ;
         n10095HisProA2 = T016Z3_n10095HisProA2[0] ;
         A10096HisProPg = T016Z3_A10096HisProPg[0] ;
         n10096HisProPg = T016Z3_n10096HisProPg[0] ;
         A10097HisProKA = T016Z3_A10097HisProKA[0] ;
         n10097HisProKA = T016Z3_n10097HisProKA[0] ;
         A10098HisProMA = T016Z3_A10098HisProMA[0] ;
         n10098HisProMA = T016Z3_n10098HisProMA[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         Z10090HisProCP = A10090HisProCP ;
         sMode1369 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16Z1369( ) ;
         load16Z1369( ) ;
         Gx_mode = sMode1369 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1369 = (short)(0) ;
         initializeNonKey16Z1369( ) ;
         sMode1369 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16Z1369( ) ;
         Gx_mode = sMode1369 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16Z1369( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16Z1369( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016Z2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISPZS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z10091HisProNR != T016Z2_A10091HisProNR[0] ) || ( DecimalUtil.compareTo(Z10092HisProKP, T016Z2_A10092HisProKP[0]) != 0 ) || ( DecimalUtil.compareTo(Z10093HisProMP, T016Z2_A10093HisProMP[0]) != 0 ) || ( Z10094HisProA1 != T016Z2_A10094HisProA1[0] ) || ( Z10095HisProA2 != T016Z2_A10095HisProA2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10096HisProPg, T016Z2_A10096HisProPg[0]) != 0 ) || ( DecimalUtil.compareTo(Z10097HisProKA, T016Z2_A10097HisProKA[0]) != 0 ) || ( DecimalUtil.compareTo(Z10098HisProMA, T016Z2_A10098HisProMA[0]) != 0 ) )
         {
            if ( Z10091HisProNR != T016Z2_A10091HisProNR[0] )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProNR");
               GXutil.writeLogRaw("Old: ",Z10091HisProNR);
               GXutil.writeLogRaw("Current: ",T016Z2_A10091HisProNR[0]);
            }
            if ( DecimalUtil.compareTo(Z10092HisProKP, T016Z2_A10092HisProKP[0]) != 0 )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProKP");
               GXutil.writeLogRaw("Old: ",Z10092HisProKP);
               GXutil.writeLogRaw("Current: ",T016Z2_A10092HisProKP[0]);
            }
            if ( DecimalUtil.compareTo(Z10093HisProMP, T016Z2_A10093HisProMP[0]) != 0 )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProMP");
               GXutil.writeLogRaw("Old: ",Z10093HisProMP);
               GXutil.writeLogRaw("Current: ",T016Z2_A10093HisProMP[0]);
            }
            if ( Z10094HisProA1 != T016Z2_A10094HisProA1[0] )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProA1");
               GXutil.writeLogRaw("Old: ",Z10094HisProA1);
               GXutil.writeLogRaw("Current: ",T016Z2_A10094HisProA1[0]);
            }
            if ( Z10095HisProA2 != T016Z2_A10095HisProA2[0] )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProA2");
               GXutil.writeLogRaw("Old: ",Z10095HisProA2);
               GXutil.writeLogRaw("Current: ",T016Z2_A10095HisProA2[0]);
            }
            if ( DecimalUtil.compareTo(Z10096HisProPg, T016Z2_A10096HisProPg[0]) != 0 )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProPg");
               GXutil.writeLogRaw("Old: ",Z10096HisProPg);
               GXutil.writeLogRaw("Current: ",T016Z2_A10096HisProPg[0]);
            }
            if ( DecimalUtil.compareTo(Z10097HisProKA, T016Z2_A10097HisProKA[0]) != 0 )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProKA");
               GXutil.writeLogRaw("Old: ",Z10097HisProKA);
               GXutil.writeLogRaw("Current: ",T016Z2_A10097HisProKA[0]);
            }
            if ( DecimalUtil.compareTo(Z10098HisProMA, T016Z2_A10098HisProMA[0]) != 0 )
            {
               GXutil.writeLogln("thispzs:[seudo value changed for attri]"+"HisProMA");
               GXutil.writeLogRaw("Old: ",Z10098HisProMA);
               GXutil.writeLogRaw("Current: ",T016Z2_A10098HisProMA[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISPZS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16Z1369( )
   {
      beforeValidate16Z1369( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Z1369( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16Z1369( 0) ;
         checkOptimisticConcurrency16Z1369( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16Z1369( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16Z1369( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016Z23 */
                  pr_default.execute(21, new Object[] {A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP, Boolean.valueOf(n10091HisProNR), Integer.valueOf(A10091HisProNR), Boolean.valueOf(n10092HisProKP), A10092HisProKP, Boolean.valueOf(n10093HisProMP), A10093HisProMP, Boolean.valueOf(n10094HisProA1), Short.valueOf(A10094HisProA1), Boolean.valueOf(n10095HisProA2), Short.valueOf(A10095HisProA2), Boolean.valueOf(n10096HisProPg), A10096HisProPg, Boolean.valueOf(n10097HisProKA), A10097HisProKA, Boolean.valueOf(n10098HisProMA), A10098HisProMA, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISPZS");
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
            load16Z1369( ) ;
         }
         endLevel16Z1369( ) ;
      }
      closeExtendedTableCursors16Z1369( ) ;
   }

   public void update16Z1369( )
   {
      beforeValidate16Z1369( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16Z1369( ) ;
      }
      if ( ( nIsMod_1369 != 0 ) || ( nIsDirty_1369 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16Z1369( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16Z1369( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16Z1369( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016Z24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n10091HisProNR), Integer.valueOf(A10091HisProNR), Boolean.valueOf(n10092HisProKP), A10092HisProKP, Boolean.valueOf(n10093HisProMP), A10093HisProMP, Boolean.valueOf(n10094HisProA1), Short.valueOf(A10094HisProA1), Boolean.valueOf(n10095HisProA2), Short.valueOf(A10095HisProA2), Boolean.valueOf(n10096HisProPg), A10096HisProPg, Boolean.valueOf(n10097HisProKA), A10097HisProKA, Boolean.valueOf(n10098HisProMA), A10098HisProMA, A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISPZS");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISPZS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16Z1369( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16Z1369( ) ;
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
            endLevel16Z1369( ) ;
         }
      }
      closeExtendedTableCursors16Z1369( ) ;
   }

   public void deferredUpdate16Z1369( )
   {
   }

   public void delete16Z1369( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16Z1369( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16Z1369( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16Z1369( ) ;
         afterConfirm16Z1369( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16Z1369( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016Z25 */
               pr_default.execute(23, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin), A10090HisProCP});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISPZS");
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
      sMode1369 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16Z1369( ) ;
      Gx_mode = sMode1369 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16Z1369( )
   {
      standaloneModal16Z1369( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel16Z1369( )
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

   public void scanStart16Z1369( )
   {
      /* Scan By routine */
      /* Using cursor T016Z26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      RcdFound1369 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1369 = (short)(1) ;
         A10090HisProCP = T016Z26_A10090HisProCP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16Z1369( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1369 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1369 = (short)(1) ;
         A10090HisProCP = T016Z26_A10090HisProCP[0] ;
      }
   }

   public void scanEnd16Z1369( )
   {
      pr_default.close(24);
   }

   public void afterConfirm16Z1369( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16Z1369( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16Z1369( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16Z1369( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16Z1369( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16Z1369( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16Z1369( )
   {
      edtHisProCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProNR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProNR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNR_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProKP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProA1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProA1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProA1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProA2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProA2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProA2_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProPg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProPg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProPg_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProKA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKA_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtHisProMA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMA_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes16Z1369( )
   {
   }

   public void send_integrity_lvl_hashes16Z59( )
   {
   }

   public void subsflControlProps_451369( )
   {
      edtavnRcdDeleted_1369_Internalname = "vNRCDDELETED_1369_"+sGXsfl_45_idx ;
      edtHisProCP_Internalname = "HISPROCP_"+sGXsfl_45_idx ;
      edtHisProNR_Internalname = "HISPRONR_"+sGXsfl_45_idx ;
      edtHisProKP_Internalname = "HISPROKP_"+sGXsfl_45_idx ;
      edtHisProMP_Internalname = "HISPROMP_"+sGXsfl_45_idx ;
      edtHisProA1_Internalname = "HISPROA1_"+sGXsfl_45_idx ;
      edtHisProA2_Internalname = "HISPROA2_"+sGXsfl_45_idx ;
      edtHisProPg_Internalname = "HISPROPG_"+sGXsfl_45_idx ;
      edtHisProKA_Internalname = "HISPROKA_"+sGXsfl_45_idx ;
      edtHisProMA_Internalname = "HISPROMA_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451369( )
   {
      edtavnRcdDeleted_1369_Internalname = "vNRCDDELETED_1369_"+sGXsfl_45_fel_idx ;
      edtHisProCP_Internalname = "HISPROCP_"+sGXsfl_45_fel_idx ;
      edtHisProNR_Internalname = "HISPRONR_"+sGXsfl_45_fel_idx ;
      edtHisProKP_Internalname = "HISPROKP_"+sGXsfl_45_fel_idx ;
      edtHisProMP_Internalname = "HISPROMP_"+sGXsfl_45_fel_idx ;
      edtHisProA1_Internalname = "HISPROA1_"+sGXsfl_45_fel_idx ;
      edtHisProA2_Internalname = "HISPROA2_"+sGXsfl_45_fel_idx ;
      edtHisProPg_Internalname = "HISPROPG_"+sGXsfl_45_fel_idx ;
      edtHisProKA_Internalname = "HISPROKA_"+sGXsfl_45_fel_idx ;
      edtHisProMA_Internalname = "HISPROMA_"+sGXsfl_45_fel_idx ;
   }

   public void addRow16Z1369( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451369( ) ;
      sendRow16Z1369( ) ;
   }

   public void sendRow16Z1369( )
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
         if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1369_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1369_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1369), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1369), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1369_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1369_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProCP_Internalname,GXutil.rtrim( A10090HisProCP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProCP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProCP_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNR_Internalname,GXutil.ltrim( localUtil.ntoc( A10091HisProNR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProNR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10091HisProNR), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10091HisProNR), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProNR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProNR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKP_Internalname,GXutil.ltrim( localUtil.ntoc( A10092HisProKP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProKP_Enabled!=0) ? localUtil.format( A10092HisProKP, "ZZZZZ9.99") : localUtil.format( A10092HisProKP, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProKP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProKP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMP_Internalname,GXutil.ltrim( localUtil.ntoc( A10093HisProMP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProMP_Enabled!=0) ? localUtil.format( A10093HisProMP, "ZZZZZ9.99") : localUtil.format( A10093HisProMP, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProMP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProA1_Internalname,GXutil.ltrim( localUtil.ntoc( A10094HisProA1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProA1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10094HisProA1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10094HisProA1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProA1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProA1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProA2_Internalname,GXutil.ltrim( localUtil.ntoc( A10095HisProA2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProA2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10095HisProA2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10095HisProA2), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProA2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProA2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProPg_Internalname,GXutil.ltrim( localUtil.ntoc( A10096HisProPg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProPg_Enabled!=0) ? localUtil.format( A10096HisProPg, "ZZ9.99") : localUtil.format( A10096HisProPg, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProPg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProPg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKA_Internalname,GXutil.ltrim( localUtil.ntoc( A10097HisProKA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProKA_Enabled!=0) ? localUtil.format( A10097HisProKA, "ZZZZZ9.99") : localUtil.format( A10097HisProKA, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProKA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProKA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1369_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMA_Internalname,GXutil.ltrim( localUtil.ntoc( A10098HisProMA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHisProMA_Enabled!=0) ? localUtil.format( A10098HisProMA, "ZZZZZ9.99") : localUtil.format( A10098HisProMA, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHisProMA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16Z1369( ) ;
      GXCCtl = "Z10090HisProCP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10090HisProCP));
      GXCCtl = "Z10091HisProNR_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10091HisProNR, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10092HisProKP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10092HisProKP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10093HisProMP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10093HisProMP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10094HisProA1_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10094HisProA1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10095HisProA2_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10095HisProA2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10096HisProPg_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10096HisProPg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10097HisProKA_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10097HisProKA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10098HisProMA_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10098HisProMA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1369_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1369_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1369_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1369, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1369_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1369_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROCP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROKP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROA1_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROA2_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROPG_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProPg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROKA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMA_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16Z1369( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451369( ) ;
      edtavnRcdDeleted_1369_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1369_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProCP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROCP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProNR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProKP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROKP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProMP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProA1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROA1_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProA2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROA2_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProPg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROPG_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProKA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROKA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHisProMA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROMA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1369_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1369_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1369");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1369_Internalname ;
         wbErr = true ;
         nRcdDeleted_1369 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1369 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1369_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10090HisProCP = httpContext.cgiGet( edtHisProCP_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "HISPRONR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProNR_Internalname ;
         wbErr = true ;
         A10091HisProNR = 0 ;
         n10091HisProNR = false ;
      }
      else
      {
         A10091HisProNR = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProNR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10091HisProNR = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProKP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProKP_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROKP_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProKP_Internalname ;
         wbErr = true ;
         A10092HisProKP = DecimalUtil.ZERO ;
         n10092HisProKP = false ;
      }
      else
      {
         A10092HisProKP = localUtil.ctond( httpContext.cgiGet( edtHisProKP_Internalname)) ;
         n10092HisProKP = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProMP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProMP_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROMP_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMP_Internalname ;
         wbErr = true ;
         A10093HisProMP = DecimalUtil.ZERO ;
         n10093HisProMP = false ;
      }
      else
      {
         A10093HisProMP = localUtil.ctond( httpContext.cgiGet( edtHisProMP_Internalname)) ;
         n10093HisProMP = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HISPROA1_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProA1_Internalname ;
         wbErr = true ;
         A10094HisProA1 = (short)(0) ;
         n10094HisProA1 = false ;
      }
      else
      {
         A10094HisProA1 = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProA1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10094HisProA1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HISPROA2_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProA2_Internalname ;
         wbErr = true ;
         A10095HisProA2 = (short)(0) ;
         n10095HisProA2 = false ;
      }
      else
      {
         A10095HisProA2 = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProA2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10095HisProA2 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProPg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProPg_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROPG_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProPg_Internalname ;
         wbErr = true ;
         A10096HisProPg = DecimalUtil.ZERO ;
         n10096HisProPg = false ;
      }
      else
      {
         A10096HisProPg = localUtil.ctond( httpContext.cgiGet( edtHisProPg_Internalname)) ;
         n10096HisProPg = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProKA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProKA_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROKA_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProKA_Internalname ;
         wbErr = true ;
         A10097HisProKA = DecimalUtil.ZERO ;
         n10097HisProKA = false ;
      }
      else
      {
         A10097HisProKA = localUtil.ctond( httpContext.cgiGet( edtHisProKA_Internalname)) ;
         n10097HisProKA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProMA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProMA_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HISPROMA_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMA_Internalname ;
         wbErr = true ;
         A10098HisProMA = DecimalUtil.ZERO ;
         n10098HisProMA = false ;
      }
      else
      {
         A10098HisProMA = localUtil.ctond( httpContext.cgiGet( edtHisProMA_Internalname)) ;
         n10098HisProMA = false ;
      }
      GXCCtl = "Z10090HisProCP_" + sGXsfl_45_idx ;
      Z10090HisProCP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10091HisProNR_" + sGXsfl_45_idx ;
      Z10091HisProNR = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10092HisProKP_" + sGXsfl_45_idx ;
      Z10092HisProKP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10093HisProMP_" + sGXsfl_45_idx ;
      Z10093HisProMP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10094HisProA1_" + sGXsfl_45_idx ;
      Z10094HisProA1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10095HisProA2_" + sGXsfl_45_idx ;
      Z10095HisProA2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10096HisProPg_" + sGXsfl_45_idx ;
      Z10096HisProPg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10097HisProKA_" + sGXsfl_45_idx ;
      Z10097HisProKA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10098HisProMA_" + sGXsfl_45_idx ;
      Z10098HisProMA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1369_" + sGXsfl_45_idx ;
      nRcdDeleted_1369 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1369_" + sGXsfl_45_idx ;
      nRcdExists_1369 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1369_" + sGXsfl_45_idx ;
      nIsMod_1369 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHisProCP_Enabled = edtHisProCP_Enabled ;
   }

   public void confirmValues16Z0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451369( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451369( ) ;
         httpContext.changePostValue( "Z10090HisProCP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10090HisProCP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10090HisProCP_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10091HisProNR_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10091HisProNR_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10091HisProNR_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10092HisProKP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10092HisProKP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10092HisProKP_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10093HisProMP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10093HisProMP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10093HisProMP_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10094HisProA1_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10094HisProA1_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10094HisProA1_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10095HisProA2_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10095HisProA2_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10095HisProA2_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10096HisProPg_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10096HisProPg_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10096HisProPg_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10097HisProKA_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10097HisProKA_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10097HisProKA_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10098HisProMA_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10098HisProMA_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10098HisProMA_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thispzs", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.dtoc( Z558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thispzs", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISPZS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PIEZAS EN LHIPRO", "") ;
   }

   public void initializeNonKey16Z59( )
   {
   }

   public void initAll16Z59( )
   {
      A602MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A558HisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      A561HisProLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      initializeNonKey16Z59( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16Z1369( )
   {
      A10091HisProNR = 0 ;
      n10091HisProNR = false ;
      A10092HisProKP = DecimalUtil.ZERO ;
      n10092HisProKP = false ;
      A10093HisProMP = DecimalUtil.ZERO ;
      n10093HisProMP = false ;
      A10094HisProA1 = (short)(0) ;
      n10094HisProA1 = false ;
      A10095HisProA2 = (short)(0) ;
      n10095HisProA2 = false ;
      A10096HisProPg = DecimalUtil.ZERO ;
      n10096HisProPg = false ;
      A10097HisProKA = DecimalUtil.ZERO ;
      n10097HisProKA = false ;
      A10098HisProMA = DecimalUtil.ZERO ;
      n10098HisProMA = false ;
      Z10091HisProNR = 0 ;
      Z10092HisProKP = DecimalUtil.ZERO ;
      Z10093HisProMP = DecimalUtil.ZERO ;
      Z10094HisProA1 = (short)(0) ;
      Z10095HisProA2 = (short)(0) ;
      Z10096HisProPg = DecimalUtil.ZERO ;
      Z10097HisProKA = DecimalUtil.ZERO ;
      Z10098HisProMA = DecimalUtil.ZERO ;
   }

   public void initAll16Z1369( )
   {
      A10090HisProCP = "" ;
      initializeNonKey16Z1369( ) ;
   }

   public void standaloneModalInsert16Z1369( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155344", true, true);
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
      httpContext.AddJavascriptSource("thispzs.js", "?2026824155344", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1369( )
   {
      edtHisProCP_Enabled = defedtHisProCP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1369, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1369_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10090HisProCP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProCP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10091HisProNR, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProNR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10092HisProKP, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10093HisProMP, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10094HisProA1, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10095HisProA2, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProA2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10096HisProPg, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProPg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10097HisProKA, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProKA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10098HisProMA, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHisProMA_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHisProFec_Internalname = "HISPROFEC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1369_Internalname = "vNRCDDELETED_1369" ;
      edtHisProCP_Internalname = "HISPROCP" ;
      edtHisProNR_Internalname = "HISPRONR" ;
      edtHisProKP_Internalname = "HISPROKP" ;
      edtHisProMP_Internalname = "HISPROMP" ;
      edtHisProA1_Internalname = "HISPROA1" ;
      edtHisProA2_Internalname = "HISPROA2" ;
      edtHisProPg_Internalname = "HISPROPG" ;
      edtHisProKA_Internalname = "HISPROKA" ;
      edtHisProMA_Internalname = "HISPROMA" ;
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
      Form.setCaption( httpContext.getMessage( "PIEZAS EN LHIPRO", "") );
      edtHisProMA_Jsonclick = "" ;
      edtHisProKA_Jsonclick = "" ;
      edtHisProPg_Jsonclick = "" ;
      edtHisProA2_Jsonclick = "" ;
      edtHisProA1_Jsonclick = "" ;
      edtHisProMP_Jsonclick = "" ;
      edtHisProKP_Jsonclick = "" ;
      edtHisProNR_Jsonclick = "" ;
      edtHisProCP_Jsonclick = "" ;
      edtavnRcdDeleted_1369_Jsonclick = "" ;
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
      edtHisProMA_Enabled = 1 ;
      edtHisProKA_Enabled = 1 ;
      edtHisProPg_Enabled = 1 ;
      edtHisProA2_Enabled = 1 ;
      edtHisProA1_Enabled = 1 ;
      edtHisProMP_Enabled = 1 ;
      edtHisProKP_Enabled = 1 ;
      edtHisProNR_Enabled = 1 ;
      edtHisProCP_Enabled = 1 ;
      edtavnRcdDeleted_1369_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProLin_Backcolor = (int)(0xFFFFFF) ;
      edtHisProLin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtHisProFec_Jsonclick = "" ;
      edtHisProFec_Backcolor = (int)(0xFFFFFF) ;
      edtHisProFec_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      subsflControlProps_451369( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16Z1369( ) ;
         standaloneModal16Z1369( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16Z1369( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451369( ) ;
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
      /* Using cursor T016Z27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016Z27_A407EmprNom[0] ;
      n407EmprNom = T016Z27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T016Z28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(26);
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

   public void valid_Hisprofec( )
   {
      /* Using cursor T016Z28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hisprolin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.format(Z558HisProFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_HISPROFEC","{handler:'valid_Hisprofec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''}]");
      setEventMetadata("VALID_HISPROFEC",",oparms:[]}");
      setEventMetadata("VALID_HISPROLIN","{handler:'valid_Hisprolin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HISPROLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z558HisProFec'},{av:'Z561HisProLin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HISPROCP","{handler:'valid_Hisprocp',iparms:[]");
      setEventMetadata("VALID_HISPROCP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hisproma',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z558HisProFec = GXutil.nullDate() ;
      Z10090HisProCP = "" ;
      Z10092HisProKP = DecimalUtil.ZERO ;
      Z10093HisProMP = DecimalUtil.ZERO ;
      Z10096HisProPg = DecimalUtil.ZERO ;
      Z10097HisProKA = DecimalUtil.ZERO ;
      Z10098HisProMA = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
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
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1369 = "" ;
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
      sMode59 = "" ;
      GXCCtl = "" ;
      A10090HisProCP = "" ;
      A10092HisProKP = DecimalUtil.ZERO ;
      A10093HisProMP = DecimalUtil.ZERO ;
      A10096HisProPg = DecimalUtil.ZERO ;
      A10097HisProKA = DecimalUtil.ZERO ;
      A10098HisProMA = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T016Z6_A407EmprNom = new String[] {""} ;
      T016Z6_n407EmprNom = new boolean[] {false} ;
      T016Z8_A561HisProLin = new int[1] ;
      T016Z8_A407EmprNom = new String[] {""} ;
      T016Z8_n407EmprNom = new boolean[] {false} ;
      T016Z8_A396EmprCod = new String[] {""} ;
      T016Z8_A602MaqCod = new String[] {""} ;
      T016Z8_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z7_A396EmprCod = new String[] {""} ;
      T016Z9_A396EmprCod = new String[] {""} ;
      T016Z10_A396EmprCod = new String[] {""} ;
      T016Z10_A602MaqCod = new String[] {""} ;
      T016Z10_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z10_A561HisProLin = new int[1] ;
      T016Z5_A561HisProLin = new int[1] ;
      T016Z5_A396EmprCod = new String[] {""} ;
      T016Z5_A602MaqCod = new String[] {""} ;
      T016Z5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z11_A396EmprCod = new String[] {""} ;
      T016Z11_A602MaqCod = new String[] {""} ;
      T016Z11_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z11_A561HisProLin = new int[1] ;
      T016Z12_A396EmprCod = new String[] {""} ;
      T016Z12_A602MaqCod = new String[] {""} ;
      T016Z12_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z12_A561HisProLin = new int[1] ;
      T016Z4_A561HisProLin = new int[1] ;
      T016Z4_A396EmprCod = new String[] {""} ;
      T016Z4_A602MaqCod = new String[] {""} ;
      T016Z4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z15_A396EmprCod = new String[] {""} ;
      T016Z15_A602MaqCod = new String[] {""} ;
      T016Z15_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z15_A561HisProLin = new int[1] ;
      T016Z15_A10501Peh_cod = new String[] {""} ;
      T016Z16_A396EmprCod = new String[] {""} ;
      T016Z16_A602MaqCod = new String[] {""} ;
      T016Z16_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z16_A561HisProLin = new int[1] ;
      T016Z16_A10495Emh_cod = new String[] {""} ;
      T016Z17_A396EmprCod = new String[] {""} ;
      T016Z17_A602MaqCod = new String[] {""} ;
      T016Z17_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z17_A561HisProLin = new int[1] ;
      T016Z17_A10487Cah_cod = new String[] {""} ;
      T016Z18_A396EmprCod = new String[] {""} ;
      T016Z18_A602MaqCod = new String[] {""} ;
      T016Z18_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z18_A561HisProLin = new int[1] ;
      T016Z18_A10486Abh_cod = new String[] {""} ;
      T016Z19_A396EmprCod = new String[] {""} ;
      T016Z19_A602MaqCod = new String[] {""} ;
      T016Z19_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z19_A561HisProLin = new int[1] ;
      T016Z19_A3047LOParId = new String[] {""} ;
      T016Z20_A396EmprCod = new String[] {""} ;
      T016Z20_A602MaqCod = new String[] {""} ;
      T016Z20_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z20_A561HisProLin = new int[1] ;
      T016Z21_A602MaqCod = new String[] {""} ;
      T016Z21_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z21_A561HisProLin = new int[1] ;
      T016Z21_A10090HisProCP = new String[] {""} ;
      T016Z21_A10091HisProNR = new int[1] ;
      T016Z21_n10091HisProNR = new boolean[] {false} ;
      T016Z21_A10092HisProKP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z21_n10092HisProKP = new boolean[] {false} ;
      T016Z21_A10093HisProMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z21_n10093HisProMP = new boolean[] {false} ;
      T016Z21_A10094HisProA1 = new short[1] ;
      T016Z21_n10094HisProA1 = new boolean[] {false} ;
      T016Z21_A10095HisProA2 = new short[1] ;
      T016Z21_n10095HisProA2 = new boolean[] {false} ;
      T016Z21_A10096HisProPg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z21_n10096HisProPg = new boolean[] {false} ;
      T016Z21_A10097HisProKA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z21_n10097HisProKA = new boolean[] {false} ;
      T016Z21_A10098HisProMA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z21_n10098HisProMA = new boolean[] {false} ;
      T016Z21_A396EmprCod = new String[] {""} ;
      T016Z22_A396EmprCod = new String[] {""} ;
      T016Z22_A602MaqCod = new String[] {""} ;
      T016Z22_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z22_A561HisProLin = new int[1] ;
      T016Z22_A10090HisProCP = new String[] {""} ;
      T016Z3_A602MaqCod = new String[] {""} ;
      T016Z3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z3_A561HisProLin = new int[1] ;
      T016Z3_A10090HisProCP = new String[] {""} ;
      T016Z3_A10091HisProNR = new int[1] ;
      T016Z3_n10091HisProNR = new boolean[] {false} ;
      T016Z3_A10092HisProKP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z3_n10092HisProKP = new boolean[] {false} ;
      T016Z3_A10093HisProMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z3_n10093HisProMP = new boolean[] {false} ;
      T016Z3_A10094HisProA1 = new short[1] ;
      T016Z3_n10094HisProA1 = new boolean[] {false} ;
      T016Z3_A10095HisProA2 = new short[1] ;
      T016Z3_n10095HisProA2 = new boolean[] {false} ;
      T016Z3_A10096HisProPg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z3_n10096HisProPg = new boolean[] {false} ;
      T016Z3_A10097HisProKA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z3_n10097HisProKA = new boolean[] {false} ;
      T016Z3_A10098HisProMA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z3_n10098HisProMA = new boolean[] {false} ;
      T016Z3_A396EmprCod = new String[] {""} ;
      T016Z2_A602MaqCod = new String[] {""} ;
      T016Z2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z2_A561HisProLin = new int[1] ;
      T016Z2_A10090HisProCP = new String[] {""} ;
      T016Z2_A10091HisProNR = new int[1] ;
      T016Z2_n10091HisProNR = new boolean[] {false} ;
      T016Z2_A10092HisProKP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z2_n10092HisProKP = new boolean[] {false} ;
      T016Z2_A10093HisProMP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z2_n10093HisProMP = new boolean[] {false} ;
      T016Z2_A10094HisProA1 = new short[1] ;
      T016Z2_n10094HisProA1 = new boolean[] {false} ;
      T016Z2_A10095HisProA2 = new short[1] ;
      T016Z2_n10095HisProA2 = new boolean[] {false} ;
      T016Z2_A10096HisProPg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z2_n10096HisProPg = new boolean[] {false} ;
      T016Z2_A10097HisProKA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z2_n10097HisProKA = new boolean[] {false} ;
      T016Z2_A10098HisProMA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016Z2_n10098HisProMA = new boolean[] {false} ;
      T016Z2_A396EmprCod = new String[] {""} ;
      T016Z26_A396EmprCod = new String[] {""} ;
      T016Z26_A602MaqCod = new String[] {""} ;
      T016Z26_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016Z26_A561HisProLin = new int[1] ;
      T016Z26_A10090HisProCP = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016Z27_A407EmprNom = new String[] {""} ;
      T016Z27_n407EmprNom = new boolean[] {false} ;
      T016Z28_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ558HisProFec = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thispzs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thispzs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thispzs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thispzs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thispzs__default(),
         new Object[] {
             new Object[] {
            T016Z2_A602MaqCod, T016Z2_A558HisProFec, T016Z2_A561HisProLin, T016Z2_A10090HisProCP, T016Z2_A10091HisProNR, T016Z2_n10091HisProNR, T016Z2_A10092HisProKP, T016Z2_n10092HisProKP, T016Z2_A10093HisProMP, T016Z2_n10093HisProMP,
            T016Z2_A10094HisProA1, T016Z2_n10094HisProA1, T016Z2_A10095HisProA2, T016Z2_n10095HisProA2, T016Z2_A10096HisProPg, T016Z2_n10096HisProPg, T016Z2_A10097HisProKA, T016Z2_n10097HisProKA, T016Z2_A10098HisProMA, T016Z2_n10098HisProMA,
            T016Z2_A396EmprCod
            }
            , new Object[] {
            T016Z3_A602MaqCod, T016Z3_A558HisProFec, T016Z3_A561HisProLin, T016Z3_A10090HisProCP, T016Z3_A10091HisProNR, T016Z3_n10091HisProNR, T016Z3_A10092HisProKP, T016Z3_n10092HisProKP, T016Z3_A10093HisProMP, T016Z3_n10093HisProMP,
            T016Z3_A10094HisProA1, T016Z3_n10094HisProA1, T016Z3_A10095HisProA2, T016Z3_n10095HisProA2, T016Z3_A10096HisProPg, T016Z3_n10096HisProPg, T016Z3_A10097HisProKA, T016Z3_n10097HisProKA, T016Z3_A10098HisProMA, T016Z3_n10098HisProMA,
            T016Z3_A396EmprCod
            }
            , new Object[] {
            T016Z4_A561HisProLin, T016Z4_A396EmprCod, T016Z4_A602MaqCod, T016Z4_A558HisProFec
            }
            , new Object[] {
            T016Z5_A561HisProLin, T016Z5_A396EmprCod, T016Z5_A602MaqCod, T016Z5_A558HisProFec
            }
            , new Object[] {
            T016Z6_A407EmprNom, T016Z6_n407EmprNom
            }
            , new Object[] {
            T016Z7_A396EmprCod
            }
            , new Object[] {
            T016Z8_A561HisProLin, T016Z8_A407EmprNom, T016Z8_n407EmprNom, T016Z8_A396EmprCod, T016Z8_A602MaqCod, T016Z8_A558HisProFec
            }
            , new Object[] {
            T016Z9_A396EmprCod
            }
            , new Object[] {
            T016Z10_A396EmprCod, T016Z10_A602MaqCod, T016Z10_A558HisProFec, T016Z10_A561HisProLin
            }
            , new Object[] {
            T016Z11_A396EmprCod, T016Z11_A602MaqCod, T016Z11_A558HisProFec, T016Z11_A561HisProLin
            }
            , new Object[] {
            T016Z12_A396EmprCod, T016Z12_A602MaqCod, T016Z12_A558HisProFec, T016Z12_A561HisProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016Z15_A396EmprCod, T016Z15_A602MaqCod, T016Z15_A558HisProFec, T016Z15_A561HisProLin, T016Z15_A10501Peh_cod
            }
            , new Object[] {
            T016Z16_A396EmprCod, T016Z16_A602MaqCod, T016Z16_A558HisProFec, T016Z16_A561HisProLin, T016Z16_A10495Emh_cod
            }
            , new Object[] {
            T016Z17_A396EmprCod, T016Z17_A602MaqCod, T016Z17_A558HisProFec, T016Z17_A561HisProLin, T016Z17_A10487Cah_cod
            }
            , new Object[] {
            T016Z18_A396EmprCod, T016Z18_A602MaqCod, T016Z18_A558HisProFec, T016Z18_A561HisProLin, T016Z18_A10486Abh_cod
            }
            , new Object[] {
            T016Z19_A396EmprCod, T016Z19_A602MaqCod, T016Z19_A558HisProFec, T016Z19_A561HisProLin, T016Z19_A3047LOParId
            }
            , new Object[] {
            T016Z20_A396EmprCod, T016Z20_A602MaqCod, T016Z20_A558HisProFec, T016Z20_A561HisProLin
            }
            , new Object[] {
            T016Z21_A602MaqCod, T016Z21_A558HisProFec, T016Z21_A561HisProLin, T016Z21_A10090HisProCP, T016Z21_A10091HisProNR, T016Z21_n10091HisProNR, T016Z21_A10092HisProKP, T016Z21_n10092HisProKP, T016Z21_A10093HisProMP, T016Z21_n10093HisProMP,
            T016Z21_A10094HisProA1, T016Z21_n10094HisProA1, T016Z21_A10095HisProA2, T016Z21_n10095HisProA2, T016Z21_A10096HisProPg, T016Z21_n10096HisProPg, T016Z21_A10097HisProKA, T016Z21_n10097HisProKA, T016Z21_A10098HisProMA, T016Z21_n10098HisProMA,
            T016Z21_A396EmprCod
            }
            , new Object[] {
            T016Z22_A396EmprCod, T016Z22_A602MaqCod, T016Z22_A558HisProFec, T016Z22_A561HisProLin, T016Z22_A10090HisProCP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016Z26_A396EmprCod, T016Z26_A602MaqCod, T016Z26_A558HisProFec, T016Z26_A561HisProLin, T016Z26_A10090HisProCP
            }
            , new Object[] {
            T016Z27_A407EmprNom, T016Z27_n407EmprNom
            }
            , new Object[] {
            T016Z28_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THISPZS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z10094HisProA1 ;
   private short Z10095HisProA2 ;
   private short nRcdDeleted_1369 ;
   private short nRcdExists_1369 ;
   private short nIsMod_1369 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1369 ;
   private short RcdFound1369 ;
   private short nBlankRcdUsr1369 ;
   private short A10094HisProA1 ;
   private short A10095HisProA2 ;
   private short RcdFound59 ;
   private short nIsDirty_59 ;
   private short nIsDirty_1369 ;
   private int Z561HisProLin ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z10091HisProNR ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtHisProFec_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A561HisProLin ;
   private int edtHisProLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1369_Enabled ;
   private int edtHisProCP_Enabled ;
   private int edtHisProNR_Enabled ;
   private int edtHisProKP_Enabled ;
   private int edtHisProMP_Enabled ;
   private int edtHisProA1_Enabled ;
   private int edtHisProA2_Enabled ;
   private int edtHisProPg_Enabled ;
   private int edtHisProKA_Enabled ;
   private int edtHisProMA_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10091HisProNR ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHisProCP_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHisProLin_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHisProFec_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ561HisProLin ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10092HisProKP ;
   private java.math.BigDecimal Z10093HisProMP ;
   private java.math.BigDecimal Z10096HisProPg ;
   private java.math.BigDecimal Z10097HisProKA ;
   private java.math.BigDecimal Z10098HisProMA ;
   private java.math.BigDecimal A10092HisProKP ;
   private java.math.BigDecimal A10093HisProMP ;
   private java.math.BigDecimal A10096HisProPg ;
   private java.math.BigDecimal A10097HisProKA ;
   private java.math.BigDecimal A10098HisProMA ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z10090HisProCP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtMaqCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHisProFec_Internalname ;
   private String edtHisProFec_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHisProLin_Internalname ;
   private String edtHisProLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1369 ;
   private String edtavnRcdDeleted_1369_Internalname ;
   private String edtHisProCP_Internalname ;
   private String edtHisProNR_Internalname ;
   private String edtHisProKP_Internalname ;
   private String edtHisProMP_Internalname ;
   private String edtHisProA1_Internalname ;
   private String edtHisProA2_Internalname ;
   private String edtHisProPg_Internalname ;
   private String edtHisProKA_Internalname ;
   private String edtHisProMA_Internalname ;
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
   private String sMode59 ;
   private String GXCCtl ;
   private String A10090HisProCP ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1369_Jsonclick ;
   private String edtHisProCP_Jsonclick ;
   private String edtHisProNR_Jsonclick ;
   private String edtHisProKP_Jsonclick ;
   private String edtHisProMP_Jsonclick ;
   private String edtHisProA1_Jsonclick ;
   private String edtHisProA2_Jsonclick ;
   private String edtHisProPg_Jsonclick ;
   private String edtHisProKA_Jsonclick ;
   private String edtHisProMA_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z558HisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date ZZ558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10091HisProNR ;
   private boolean n10092HisProKP ;
   private boolean n10093HisProMP ;
   private boolean n10094HisProA1 ;
   private boolean n10095HisProA2 ;
   private boolean n10096HisProPg ;
   private boolean n10097HisProKA ;
   private boolean n10098HisProMA ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T016Z6_A407EmprNom ;
   private boolean[] T016Z6_n407EmprNom ;
   private int[] T016Z8_A561HisProLin ;
   private String[] T016Z8_A407EmprNom ;
   private boolean[] T016Z8_n407EmprNom ;
   private String[] T016Z8_A396EmprCod ;
   private String[] T016Z8_A602MaqCod ;
   private java.util.Date[] T016Z8_A558HisProFec ;
   private String[] T016Z7_A396EmprCod ;
   private String[] T016Z9_A396EmprCod ;
   private String[] T016Z10_A396EmprCod ;
   private String[] T016Z10_A602MaqCod ;
   private java.util.Date[] T016Z10_A558HisProFec ;
   private int[] T016Z10_A561HisProLin ;
   private int[] T016Z5_A561HisProLin ;
   private String[] T016Z5_A396EmprCod ;
   private String[] T016Z5_A602MaqCod ;
   private java.util.Date[] T016Z5_A558HisProFec ;
   private String[] T016Z11_A396EmprCod ;
   private String[] T016Z11_A602MaqCod ;
   private java.util.Date[] T016Z11_A558HisProFec ;
   private int[] T016Z11_A561HisProLin ;
   private String[] T016Z12_A396EmprCod ;
   private String[] T016Z12_A602MaqCod ;
   private java.util.Date[] T016Z12_A558HisProFec ;
   private int[] T016Z12_A561HisProLin ;
   private int[] T016Z4_A561HisProLin ;
   private String[] T016Z4_A396EmprCod ;
   private String[] T016Z4_A602MaqCod ;
   private java.util.Date[] T016Z4_A558HisProFec ;
   private String[] T016Z15_A396EmprCod ;
   private String[] T016Z15_A602MaqCod ;
   private java.util.Date[] T016Z15_A558HisProFec ;
   private int[] T016Z15_A561HisProLin ;
   private String[] T016Z15_A10501Peh_cod ;
   private String[] T016Z16_A396EmprCod ;
   private String[] T016Z16_A602MaqCod ;
   private java.util.Date[] T016Z16_A558HisProFec ;
   private int[] T016Z16_A561HisProLin ;
   private String[] T016Z16_A10495Emh_cod ;
   private String[] T016Z17_A396EmprCod ;
   private String[] T016Z17_A602MaqCod ;
   private java.util.Date[] T016Z17_A558HisProFec ;
   private int[] T016Z17_A561HisProLin ;
   private String[] T016Z17_A10487Cah_cod ;
   private String[] T016Z18_A396EmprCod ;
   private String[] T016Z18_A602MaqCod ;
   private java.util.Date[] T016Z18_A558HisProFec ;
   private int[] T016Z18_A561HisProLin ;
   private String[] T016Z18_A10486Abh_cod ;
   private String[] T016Z19_A396EmprCod ;
   private String[] T016Z19_A602MaqCod ;
   private java.util.Date[] T016Z19_A558HisProFec ;
   private int[] T016Z19_A561HisProLin ;
   private String[] T016Z19_A3047LOParId ;
   private String[] T016Z20_A396EmprCod ;
   private String[] T016Z20_A602MaqCod ;
   private java.util.Date[] T016Z20_A558HisProFec ;
   private int[] T016Z20_A561HisProLin ;
   private String[] T016Z21_A602MaqCod ;
   private java.util.Date[] T016Z21_A558HisProFec ;
   private int[] T016Z21_A561HisProLin ;
   private String[] T016Z21_A10090HisProCP ;
   private int[] T016Z21_A10091HisProNR ;
   private boolean[] T016Z21_n10091HisProNR ;
   private java.math.BigDecimal[] T016Z21_A10092HisProKP ;
   private boolean[] T016Z21_n10092HisProKP ;
   private java.math.BigDecimal[] T016Z21_A10093HisProMP ;
   private boolean[] T016Z21_n10093HisProMP ;
   private short[] T016Z21_A10094HisProA1 ;
   private boolean[] T016Z21_n10094HisProA1 ;
   private short[] T016Z21_A10095HisProA2 ;
   private boolean[] T016Z21_n10095HisProA2 ;
   private java.math.BigDecimal[] T016Z21_A10096HisProPg ;
   private boolean[] T016Z21_n10096HisProPg ;
   private java.math.BigDecimal[] T016Z21_A10097HisProKA ;
   private boolean[] T016Z21_n10097HisProKA ;
   private java.math.BigDecimal[] T016Z21_A10098HisProMA ;
   private boolean[] T016Z21_n10098HisProMA ;
   private String[] T016Z21_A396EmprCod ;
   private String[] T016Z22_A396EmprCod ;
   private String[] T016Z22_A602MaqCod ;
   private java.util.Date[] T016Z22_A558HisProFec ;
   private int[] T016Z22_A561HisProLin ;
   private String[] T016Z22_A10090HisProCP ;
   private String[] T016Z3_A602MaqCod ;
   private java.util.Date[] T016Z3_A558HisProFec ;
   private int[] T016Z3_A561HisProLin ;
   private String[] T016Z3_A10090HisProCP ;
   private int[] T016Z3_A10091HisProNR ;
   private boolean[] T016Z3_n10091HisProNR ;
   private java.math.BigDecimal[] T016Z3_A10092HisProKP ;
   private boolean[] T016Z3_n10092HisProKP ;
   private java.math.BigDecimal[] T016Z3_A10093HisProMP ;
   private boolean[] T016Z3_n10093HisProMP ;
   private short[] T016Z3_A10094HisProA1 ;
   private boolean[] T016Z3_n10094HisProA1 ;
   private short[] T016Z3_A10095HisProA2 ;
   private boolean[] T016Z3_n10095HisProA2 ;
   private java.math.BigDecimal[] T016Z3_A10096HisProPg ;
   private boolean[] T016Z3_n10096HisProPg ;
   private java.math.BigDecimal[] T016Z3_A10097HisProKA ;
   private boolean[] T016Z3_n10097HisProKA ;
   private java.math.BigDecimal[] T016Z3_A10098HisProMA ;
   private boolean[] T016Z3_n10098HisProMA ;
   private String[] T016Z3_A396EmprCod ;
   private String[] T016Z2_A602MaqCod ;
   private java.util.Date[] T016Z2_A558HisProFec ;
   private int[] T016Z2_A561HisProLin ;
   private String[] T016Z2_A10090HisProCP ;
   private int[] T016Z2_A10091HisProNR ;
   private boolean[] T016Z2_n10091HisProNR ;
   private java.math.BigDecimal[] T016Z2_A10092HisProKP ;
   private boolean[] T016Z2_n10092HisProKP ;
   private java.math.BigDecimal[] T016Z2_A10093HisProMP ;
   private boolean[] T016Z2_n10093HisProMP ;
   private short[] T016Z2_A10094HisProA1 ;
   private boolean[] T016Z2_n10094HisProA1 ;
   private short[] T016Z2_A10095HisProA2 ;
   private boolean[] T016Z2_n10095HisProA2 ;
   private java.math.BigDecimal[] T016Z2_A10096HisProPg ;
   private boolean[] T016Z2_n10096HisProPg ;
   private java.math.BigDecimal[] T016Z2_A10097HisProKA ;
   private boolean[] T016Z2_n10097HisProKA ;
   private java.math.BigDecimal[] T016Z2_A10098HisProMA ;
   private boolean[] T016Z2_n10098HisProMA ;
   private String[] T016Z2_A396EmprCod ;
   private String[] T016Z26_A396EmprCod ;
   private String[] T016Z26_A602MaqCod ;
   private java.util.Date[] T016Z26_A558HisProFec ;
   private int[] T016Z26_A561HisProLin ;
   private String[] T016Z26_A10090HisProCP ;
   private String[] T016Z27_A407EmprNom ;
   private boolean[] T016Z27_n407EmprNom ;
   private String[] T016Z28_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thispzs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thispzs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thispzs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thispzs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thispzs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016Z2", "SELECT MaqCod, HisProFec, HisProLin, HisProCP, HisProNR, HisProKP, HisProMP, HisProA1, HisProA2, HisProPg, HisProKA, HisProMA, EmprCod FROM TXPHISPZS WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND HisProCP = ?  FOR UPDATE OF HisProNR, HisProKP, HisProMP, HisProA1, HisProA2, HisProPg, HisProKA, HisProMA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z3", "SELECT MaqCod, HisProFec, HisProLin, HisProCP, HisProNR, HisProKP, HisProMP, HisProA1, HisProA2, HisProPg, HisProKA, HisProMA, EmprCod FROM TXPHISPZS WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND HisProCP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z4", "SELECT HisProLin, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?  FOR UPDATE OF HisProLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z5", "SELECT HisProLin, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z7", "SELECT EmprCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z8", "SELECT /*+ FIRST_ROWS(100) */ TM1.HisProLin, T2.EmprNom, TM1.EmprCod, TM1.MaqCod, TM1.HisProFec FROM (TXPLHIPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.HisProFec = ? and TM1.HisProLin = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.HisProFec, TM1.HisProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z9", "SELECT EmprCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE ( MaqCod > ? or MaqCod = ? and HisProFec > ? or HisProFec = ? and MaqCod = ? and HisProLin > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Z12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE ( MaqCod < ? or MaqCod = ? and HisProFec < ? or HisProFec = ? and MaqCod = ? and HisProLin < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC, HisProFec DESC, HisProLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016Z13", "INSERT INTO TXPLHIPRO(HisProLin, EmprCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, GruOpeCod, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, ParCod, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProDTI, HisProDTF, HisProNPar, HisProNpzs, HisProBan, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T016Z14", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new ForEachCursor("T016Z15", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Peh_cod FROM TXPCAPE00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Z16", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod FROM TXPCAEM00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Z17", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Cah_cod FROM TXPCALA00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Z18", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Z19", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, LOParId FROM TXPLOHisP WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016Z20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z21", "SELECT MaqCod, HisProFec, HisProLin, HisProCP, HisProNR, HisProKP, HisProMP, HisProA1, HisProA2, HisProPg, HisProKA, HisProMA, EmprCod FROM TXPHISPZS WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? and HisProCP = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, HisProCP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z22", "SELECT EmprCod, MaqCod, HisProFec, HisProLin, HisProCP FROM TXPHISPZS WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND HisProCP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016Z23", "INSERT INTO TXPHISPZS(MaqCod, HisProFec, HisProLin, HisProCP, HisProNR, HisProKP, HisProMP, HisProA1, HisProA2, HisProPg, HisProKA, HisProMA, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISPZS")
         ,new UpdateCursor("T016Z24", "UPDATE TXPHISPZS SET HisProNR=?, HisProKP=?, HisProMP=?, HisProA1=?, HisProA2=?, HisProPg=?, HisProKA=?, HisProMA=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND HisProCP = ?", GX_NOMASK, "TXPHISPZS")
         ,new UpdateCursor("T016Z25", "DELETE FROM TXPHISPZS  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? AND HisProCP = ?", GX_NOMASK, "TXPHISPZS")
         ,new ForEachCursor("T016Z26", "SELECT EmprCod, MaqCod, HisProFec, HisProLin, HisProCP FROM TXPHISPZS WHERE EmprCod = ? and MaqCod = ? and HisProFec = ? and HisProLin = ? ORDER BY EmprCod, MaqCod, HisProFec, HisProLin, HisProCP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016Z28", "SELECT EmprCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               stmt.setString(13, (String)parms[20], 3);
               return;
            case 22 :
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setString(10, (String)parms[17], 6);
               stmt.setDate(11, (java.util.Date)parms[18]);
               stmt.setInt(12, ((Number) parms[19]).intValue());
               stmt.setString(13, (String)parms[20], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

