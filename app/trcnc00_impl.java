package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trcnc00_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
         n833TipDefCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A833TipDefCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "NOTAS CREDITO - RECLAMACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRcNcFec_Internalname ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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

   public trcnc00_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trcnc00_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trcnc00_impl.class ));
   }

   public trcnc00_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRCNC00.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha Mov", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRcNcFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcFec_Internalname, localUtil.format(A10715RcNcFec, "99/99/99"), localUtil.format( A10715RcNcFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcFec_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC00.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRcNcFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRcNcFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRCNC00.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A10716RcNcUlt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10716RcNcUlt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10716RcNcUlt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcUlt_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcUlt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1428 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1428 = (short)(1) ;
            scanStart18X1428( ) ;
            while ( RcdFound1428 != 0 )
            {
               init_level_properties1428( ) ;
               getByPrimaryKey18X1428( ) ;
               addRow18X1428( ) ;
               scanNext18X1428( ) ;
            }
            scanEnd18X1428( ) ;
            nBlankRcdCount1428 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal18X1428( ) ;
         standaloneModal18X1428( ) ;
         sMode1428 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow18X1428( ) ;
            edtavnRcdDeleted_1428_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1428_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1428_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1428_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCHD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcHd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcR_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcHdO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCHDO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcHdO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcHdO_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcRO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCRO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcRO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcRO_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcPO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcPO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcPO_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtTipDefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCREF_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcRef_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcN1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCN1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcN1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcN1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcN2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCN2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcN2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcN2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCDC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcDc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcGR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCGR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcGR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcGR_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcFo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCFO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcVI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCVI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcVI_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcV1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcV1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcV2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcV2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCOB_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcOb_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcCm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCCM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcCm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcCm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcV3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcV3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCE_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcE_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRcNcKgH_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCKGH_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcKgH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcKgH_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1428 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18X1428( ) ;
            }
            sendRow18X1428( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1428 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1428 = (short)(5) ;
         nRcdExists_1428 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18X1428( ) ;
            while ( RcdFound1428 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401428( ) ;
               init_level_properties1428( ) ;
               standaloneNotModal18X1428( ) ;
               getByPrimaryKey18X1428( ) ;
               standaloneModal18X1428( ) ;
               addRow18X1428( ) ;
               scanNext18X1428( ) ;
            }
            scanEnd18X1428( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1428 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401428( ) ;
      initAll18X1428( ) ;
      init_level_properties1428( ) ;
      nRcdExists_1428 = (short)(0) ;
      nIsMod_1428 = (short)(0) ;
      nRcdDeleted_1428 = (short)(0) ;
      nBlankRcdCount1428 = (short)(nBlankRcdUsr1428+nBlankRcdCount1428) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1428 > 0 )
      {
         standaloneNotModal18X1428( ) ;
         standaloneModal18X1428( ) ;
         addRow18X1428( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRcNcLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1428 = (short)(nBlankRcdCount1428-1) ;
      }
      Gx_mode = sMode1428 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRCNC00.htm");
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
      e1118X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10715RcNcFec = localUtil.ctod( httpContext.cgiGet( "Z10715RcNcFec"), 0) ;
            Z10716RcNcUlt = (int)(localUtil.ctol( httpContext.cgiGet( "Z10716RcNcUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtRcNcFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RCNCFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRcNcFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10715RcNcFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            }
            else
            {
               A10715RcNcFec = localUtil.ctod( httpContext.cgiGet( edtRcNcFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RCNCULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRcNcUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10716RcNcUlt = 0 ;
               n10716RcNcUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10716RcNcUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10716RcNcUlt), 6, 0));
            }
            else
            {
               A10716RcNcUlt = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10716RcNcUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10716RcNcUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10716RcNcUlt), 6, 0));
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
               A10715RcNcFec = localUtil.parseDateParm( httpContext.GetPar( "RcNcFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
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
                        e1118X2 ();
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
            initAll18X1427( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1428_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1428_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes18X1427( ) ;
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

   public void confirm_18X0( )
   {
      beforeValidate18X1427( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18X1427( ) ;
         }
         else
         {
            checkExtendedTable18X1427( ) ;
            if ( AnyError == 0 )
            {
               zm18X1427( 3) ;
            }
            closeExtendedTableCursors18X1427( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1427 = Gx_mode ;
         confirm_18X1428( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1427 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1427 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues18X0( ) ;
      }
   }

   public void confirm_18X1428( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow18X1428( ) ;
         if ( ( nRcdExists_1428 != 0 ) || ( nIsMod_1428 != 0 ) )
         {
            getKey18X1428( ) ;
            if ( ( nRcdExists_1428 == 0 ) && ( nRcdDeleted_1428 == 0 ) )
            {
               if ( RcdFound1428 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18X1428( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18X1428( ) ;
                     if ( AnyError == 0 )
                     {
                        zm18X1428( 5) ;
                        zm18X1428( 6) ;
                     }
                     closeExtendedTableCursors18X1428( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RCNCLIN_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRcNcLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1428 != 0 )
               {
                  if ( nRcdDeleted_1428 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18X1428( ) ;
                     load18X1428( ) ;
                     beforeValidate18X1428( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18X1428( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1428 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18X1428( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18X1428( ) ;
                           if ( AnyError == 0 )
                           {
                              zm18X1428( 5) ;
                              zm18X1428( 6) ;
                           }
                           closeExtendedTableCursors18X1428( ) ;
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
                  if ( nRcdDeleted_1428 == 0 )
                  {
                     GXCCtl = "RCNCLIN_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRcNcLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1428_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtRcNcHd_Internalname, GXutil.ltrim( localUtil.ntoc( A10718RcNcHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcR_Internalname, GXutil.ltrim( localUtil.ntoc( A10719RcNcR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcP_Internalname, GXutil.rtrim( A10720RcNcP)) ;
         httpContext.changePostValue( edtRcNcHdO_Internalname, GXutil.ltrim( localUtil.ntoc( A10721RcNcHdO, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcRO_Internalname, GXutil.ltrim( localUtil.ntoc( A10722RcNcRO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcPO_Internalname, GXutil.rtrim( A10723RcNcPO)) ;
         httpContext.changePostValue( edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc)) ;
         httpContext.changePostValue( edtRcNcRef_Internalname, GXutil.rtrim( A10724RcNcRef)) ;
         httpContext.changePostValue( edtRcNcN1_Internalname, GXutil.ltrim( localUtil.ntoc( A10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcN2_Internalname, GXutil.ltrim( localUtil.ntoc( A10726RcNcN2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcDc_Internalname, GXutil.rtrim( A10727RcNcDc)) ;
         httpContext.changePostValue( edtRcNcGR_Internalname, GXutil.ltrim( localUtil.ntoc( A10728RcNcGR, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcFo_Internalname, GXutil.rtrim( A10729RcNcFo)) ;
         httpContext.changePostValue( edtRcNcVI_Internalname, GXutil.ltrim( localUtil.ntoc( A10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcV1_Internalname, GXutil.ltrim( localUtil.ntoc( A10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcV2_Internalname, GXutil.ltrim( localUtil.ntoc( A10732RcNcV2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcOb_Internalname, A10733RcNcOb) ;
         httpContext.changePostValue( edtRcNcCm_Internalname, A10734RcNcCm) ;
         httpContext.changePostValue( edtRcNcV3_Internalname, GXutil.ltrim( localUtil.ntoc( A10735RcNcV3, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcE_Internalname, GXutil.ltrim( localUtil.ntoc( A10816RcNcE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcKgH_Internalname, GXutil.ltrim( localUtil.ntoc( A10847RcNcKgH, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10717RcNcLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10718RcNcHd_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10718RcNcHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10719RcNcR_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10719RcNcR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10720RcNcP_"+sGXsfl_40_idx, GXutil.rtrim( Z10720RcNcP)) ;
         httpContext.changePostValue( "ZT_"+"Z10721RcNcHdO_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10721RcNcHdO, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10722RcNcRO_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10722RcNcRO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10723RcNcPO_"+sGXsfl_40_idx, GXutil.rtrim( Z10723RcNcPO)) ;
         httpContext.changePostValue( "ZT_"+"Z10724RcNcRef_"+sGXsfl_40_idx, GXutil.rtrim( Z10724RcNcRef)) ;
         httpContext.changePostValue( "ZT_"+"Z10725RcNcN1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10726RcNcN2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10726RcNcN2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10727RcNcDc_"+sGXsfl_40_idx, GXutil.rtrim( Z10727RcNcDc)) ;
         httpContext.changePostValue( "ZT_"+"Z10728RcNcGR_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10728RcNcGR, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10729RcNcFo_"+sGXsfl_40_idx, GXutil.rtrim( Z10729RcNcFo)) ;
         httpContext.changePostValue( "ZT_"+"Z10730RcNcVI_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10731RcNcV1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10732RcNcV2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10732RcNcV2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10733RcNcOb_"+sGXsfl_40_idx, Z10733RcNcOb) ;
         httpContext.changePostValue( "ZT_"+"Z10734RcNcCm_"+sGXsfl_40_idx, Z10734RcNcCm) ;
         httpContext.changePostValue( "ZT_"+"Z10816RcNcE_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10816RcNcE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10847RcNcKgH_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10847RcNcKgH, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1428_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1428_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1428_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1428 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1428_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1428_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCHD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCHDO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHdO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCRO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcPO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCREF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCN1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCN2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCDC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCGR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcGR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCFO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCVI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcVI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCOB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCCM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcCm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCKGH_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcKgH_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18X0( )
   {
   }

   public void e1118X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trcnc00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      trcnc00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trcnc00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trcnc00_impl.this.A396EmprCod = GXv_char2[0] ;
      trcnc00_impl.this.AV11EmprNom = GXv_char3[0] ;
      trcnc00_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm18X1427( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10716RcNcUlt = T018X7_A10716RcNcUlt[0] ;
         }
         else
         {
            Z10716RcNcUlt = A10716RcNcUlt ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z10715RcNcFec = A10715RcNcFec ;
         Z10716RcNcUlt = A10716RcNcUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TRCNC00" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T018X8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018X8_A407EmprNom[0] ;
      n407EmprNom = T018X8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
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

   public void load18X1427( )
   {
      /* Using cursor T018X9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A10715RcNcFec});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1427 = (short)(1) ;
         A407EmprNom = T018X9_A407EmprNom[0] ;
         n407EmprNom = T018X9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10716RcNcUlt = T018X9_A10716RcNcUlt[0] ;
         n10716RcNcUlt = T018X9_n10716RcNcUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10716RcNcUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10716RcNcUlt), 6, 0));
         zm18X1427( -2) ;
      }
      pr_default.close(7);
      onLoadActions18X1427( ) ;
   }

   public void onLoadActions18X1427( )
   {
   }

   public void checkExtendedTable18X1427( )
   {
      nIsDirty_1427 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors18X1427( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey18X1427( )
   {
      /* Using cursor T018X10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A10715RcNcFec});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1427 = (short)(1) ;
      }
      else
      {
         RcdFound1427 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018X7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A10715RcNcFec});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T018X7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18X1427( 2) ;
         RcdFound1427 = (short)(1) ;
         A10715RcNcFec = T018X7_A10715RcNcFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10716RcNcUlt = T018X7_A10716RcNcUlt[0] ;
         n10716RcNcUlt = T018X7_n10716RcNcUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10716RcNcUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10716RcNcUlt), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         sMode1427 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18X1427( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1427 = (short)(0) ;
            initializeNonKey18X1427( ) ;
         }
         Gx_mode = sMode1427 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1427 = (short)(0) ;
         initializeNonKey18X1427( ) ;
         sMode1427 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1427 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey18X1427( ) ;
      if ( RcdFound1427 == 0 )
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
      RcdFound1427 = (short)(0) ;
      /* Using cursor T018X11 */
      pr_default.execute(9, new Object[] {A10715RcNcFec, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T018X11_A10715RcNcFec[0]).before( GXutil.resetTime( A10715RcNcFec )) ) && ( GXutil.strcmp(T018X11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T018X11_A10715RcNcFec[0]).after( GXutil.resetTime( A10715RcNcFec )) ) && ( GXutil.strcmp(T018X11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10715RcNcFec = T018X11_A10715RcNcFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            RcdFound1427 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1427 = (short)(0) ;
      /* Using cursor T018X12 */
      pr_default.execute(10, new Object[] {A10715RcNcFec, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.resetTime(T018X12_A10715RcNcFec[0]).after( GXutil.resetTime( A10715RcNcFec )) ) && ( GXutil.strcmp(T018X12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.resetTime(T018X12_A10715RcNcFec[0]).before( GXutil.resetTime( A10715RcNcFec )) ) && ( GXutil.strcmp(T018X12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10715RcNcFec = T018X12_A10715RcNcFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            RcdFound1427 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18X1427( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRcNcFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18X1427( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1427 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) )
            {
               A10715RcNcFec = Z10715RcNcFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRcNcFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update18X1427( ) ;
               GX_FocusControl = edtRcNcFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRcNcFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18X1427( ) ;
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
                  GX_FocusControl = edtRcNcFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18X1427( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) )
      {
         A10715RcNcFec = Z10715RcNcFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRcNcFec_Internalname ;
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
      getKey18X1427( ) ;
      if ( RcdFound1427 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) )
         {
            A10715RcNcFec = Z10715RcNcFec ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trcnc00");
      GX_FocusControl = edtRcNcUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_18X0( ) ;
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
      if ( RcdFound1427 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRcNcUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18X1427( ) ;
      if ( RcdFound1427 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18X1427( ) ;
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
      if ( RcdFound1427 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcUlt_Internalname ;
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
      if ( RcdFound1427 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcUlt_Internalname ;
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
      scanStart18X1427( ) ;
      if ( RcdFound1427 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1427 != 0 )
         {
            scanNext18X1427( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRcNcUlt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18X1427( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18X1427( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018X6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A10715RcNcFec});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z10716RcNcUlt != T018X6_A10716RcNcUlt[0] ) )
         {
            if ( Z10716RcNcUlt != T018X6_A10716RcNcUlt[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcUlt");
               GXutil.writeLogRaw("Old: ",Z10716RcNcUlt);
               GXutil.writeLogRaw("Current: ",T018X6_A10716RcNcUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRCNC00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18X1427( )
   {
      beforeValidate18X1427( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18X1427( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18X1427( 0) ;
         checkOptimisticConcurrency18X1427( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18X1427( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18X1427( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018X13 */
                  pr_default.execute(11, new Object[] {A10715RcNcFec, Boolean.valueOf(n10716RcNcUlt), Integer.valueOf(A10716RcNcUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC00");
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
                        processLevel18X1427( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18X0( ) ;
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
            load18X1427( ) ;
         }
         endLevel18X1427( ) ;
      }
      closeExtendedTableCursors18X1427( ) ;
   }

   public void update18X1427( )
   {
      beforeValidate18X1427( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18X1427( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18X1427( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18X1427( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18X1427( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018X14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n10716RcNcUlt), Integer.valueOf(A10716RcNcUlt), A396EmprCod, A10715RcNcFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC00");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC00"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate18X1427( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18X1427( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18X0( ) ;
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
         endLevel18X1427( ) ;
      }
      closeExtendedTableCursors18X1427( ) ;
   }

   public void deferredUpdate18X1427( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18X1427( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18X1427( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18X1427( ) ;
         afterConfirm18X1427( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18X1427( ) ;
            if ( AnyError == 0 )
            {
               scanStart18X1428( ) ;
               while ( RcdFound1428 != 0 )
               {
                  getByPrimaryKey18X1428( ) ;
                  delete18X1428( ) ;
                  scanNext18X1428( ) ;
               }
               scanEnd18X1428( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018X15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A10715RcNcFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC00");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1427 == 0 )
                        {
                           initAll18X1427( ) ;
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
                        resetCaption18X0( ) ;
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
      sMode1427 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18X1427( ) ;
      Gx_mode = sMode1427 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18X1427( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T018X16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A10715RcNcFec});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel18X1428( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow18X1428( ) ;
         if ( ( nRcdExists_1428 != 0 ) || ( nIsMod_1428 != 0 ) )
         {
            standaloneNotModal18X1428( ) ;
            getKey18X1428( ) ;
            if ( ( nRcdExists_1428 == 0 ) && ( nRcdDeleted_1428 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18X1428( ) ;
            }
            else
            {
               if ( RcdFound1428 != 0 )
               {
                  if ( ( nRcdDeleted_1428 != 0 ) && ( nRcdExists_1428 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18X1428( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1428 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18X1428( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1428 == 0 )
                  {
                     GXCCtl = "RCNCLIN_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRcNcLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1428_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtRcNcHd_Internalname, GXutil.ltrim( localUtil.ntoc( A10718RcNcHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcR_Internalname, GXutil.ltrim( localUtil.ntoc( A10719RcNcR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcP_Internalname, GXutil.rtrim( A10720RcNcP)) ;
         httpContext.changePostValue( edtRcNcHdO_Internalname, GXutil.ltrim( localUtil.ntoc( A10721RcNcHdO, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcRO_Internalname, GXutil.ltrim( localUtil.ntoc( A10722RcNcRO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcPO_Internalname, GXutil.rtrim( A10723RcNcPO)) ;
         httpContext.changePostValue( edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTipDefDsc_Internalname, GXutil.rtrim( A834TipDefDsc)) ;
         httpContext.changePostValue( edtRcNcRef_Internalname, GXutil.rtrim( A10724RcNcRef)) ;
         httpContext.changePostValue( edtRcNcN1_Internalname, GXutil.ltrim( localUtil.ntoc( A10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcN2_Internalname, GXutil.ltrim( localUtil.ntoc( A10726RcNcN2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcDc_Internalname, GXutil.rtrim( A10727RcNcDc)) ;
         httpContext.changePostValue( edtRcNcGR_Internalname, GXutil.ltrim( localUtil.ntoc( A10728RcNcGR, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcFo_Internalname, GXutil.rtrim( A10729RcNcFo)) ;
         httpContext.changePostValue( edtRcNcVI_Internalname, GXutil.ltrim( localUtil.ntoc( A10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcV1_Internalname, GXutil.ltrim( localUtil.ntoc( A10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcV2_Internalname, GXutil.ltrim( localUtil.ntoc( A10732RcNcV2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcOb_Internalname, A10733RcNcOb) ;
         httpContext.changePostValue( edtRcNcCm_Internalname, A10734RcNcCm) ;
         httpContext.changePostValue( edtRcNcV3_Internalname, GXutil.ltrim( localUtil.ntoc( A10735RcNcV3, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcE_Internalname, GXutil.ltrim( localUtil.ntoc( A10816RcNcE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcKgH_Internalname, GXutil.ltrim( localUtil.ntoc( A10847RcNcKgH, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10717RcNcLin_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10718RcNcHd_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10718RcNcHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10719RcNcR_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10719RcNcR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10720RcNcP_"+sGXsfl_40_idx, GXutil.rtrim( Z10720RcNcP)) ;
         httpContext.changePostValue( "ZT_"+"Z10721RcNcHdO_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10721RcNcHdO, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10722RcNcRO_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10722RcNcRO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10723RcNcPO_"+sGXsfl_40_idx, GXutil.rtrim( Z10723RcNcPO)) ;
         httpContext.changePostValue( "ZT_"+"Z10724RcNcRef_"+sGXsfl_40_idx, GXutil.rtrim( Z10724RcNcRef)) ;
         httpContext.changePostValue( "ZT_"+"Z10725RcNcN1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10726RcNcN2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10726RcNcN2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10727RcNcDc_"+sGXsfl_40_idx, GXutil.rtrim( Z10727RcNcDc)) ;
         httpContext.changePostValue( "ZT_"+"Z10728RcNcGR_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10728RcNcGR, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10729RcNcFo_"+sGXsfl_40_idx, GXutil.rtrim( Z10729RcNcFo)) ;
         httpContext.changePostValue( "ZT_"+"Z10730RcNcVI_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10731RcNcV1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10732RcNcV2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10732RcNcV2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10733RcNcOb_"+sGXsfl_40_idx, Z10733RcNcOb) ;
         httpContext.changePostValue( "ZT_"+"Z10734RcNcCm_"+sGXsfl_40_idx, Z10734RcNcCm) ;
         httpContext.changePostValue( "ZT_"+"Z10816RcNcE_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10816RcNcE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10847RcNcKgH_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10847RcNcKgH, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1428_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1428_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1428_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1428 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1428_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1428_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCHD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCHDO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHdO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCRO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcPO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCREF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCN1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCN2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCDC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcDc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCGR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcGR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCFO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCVI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcVI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCOB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcOb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCCM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcCm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCKGH_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcKgH_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18X1428( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1428 = (short)(0) ;
      nIsMod_1428 = (short)(0) ;
      nRcdDeleted_1428 = (short)(0) ;
   }

   public void processLevel18X1427( )
   {
      /* Save parent mode. */
      sMode1427 = Gx_mode ;
      processNestedLevel18X1428( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1427 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel18X1427( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18X1427( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trcnc00");
         if ( AnyError == 0 )
         {
            confirmValues18X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trcnc00");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18X1427( )
   {
      /* Scan By routine */
      /* Using cursor T018X17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound1427 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1427 = (short)(1) ;
         A10715RcNcFec = T018X17_A10715RcNcFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18X1427( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1427 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1427 = (short)(1) ;
         A10715RcNcFec = T018X17_A10715RcNcFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
      }
   }

   public void scanEnd18X1427( )
   {
      pr_default.close(15);
   }

   public void afterConfirm18X1427( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18X1427( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18X1427( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18X1427( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18X1427( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18X1427( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18X1427( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtRcNcFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFec_Enabled), 5, 0), true);
      edtRcNcUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcUlt_Enabled), 5, 0), true);
   }

   public void zm18X1428( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10718RcNcHd = T018X3_A10718RcNcHd[0] ;
            Z10719RcNcR = T018X3_A10719RcNcR[0] ;
            Z10720RcNcP = T018X3_A10720RcNcP[0] ;
            Z10721RcNcHdO = T018X3_A10721RcNcHdO[0] ;
            Z10722RcNcRO = T018X3_A10722RcNcRO[0] ;
            Z10723RcNcPO = T018X3_A10723RcNcPO[0] ;
            Z10724RcNcRef = T018X3_A10724RcNcRef[0] ;
            Z10725RcNcN1 = T018X3_A10725RcNcN1[0] ;
            Z10726RcNcN2 = T018X3_A10726RcNcN2[0] ;
            Z10727RcNcDc = T018X3_A10727RcNcDc[0] ;
            Z10728RcNcGR = T018X3_A10728RcNcGR[0] ;
            Z10729RcNcFo = T018X3_A10729RcNcFo[0] ;
            Z10730RcNcVI = T018X3_A10730RcNcVI[0] ;
            Z10731RcNcV1 = T018X3_A10731RcNcV1[0] ;
            Z10732RcNcV2 = T018X3_A10732RcNcV2[0] ;
            Z10733RcNcOb = T018X3_A10733RcNcOb[0] ;
            Z10734RcNcCm = T018X3_A10734RcNcCm[0] ;
            Z10816RcNcE = T018X3_A10816RcNcE[0] ;
            Z10847RcNcKgH = T018X3_A10847RcNcKgH[0] ;
            Z252CliCod = T018X3_A252CliCod[0] ;
            Z833TipDefCod = T018X3_A833TipDefCod[0] ;
         }
         else
         {
            Z10718RcNcHd = A10718RcNcHd ;
            Z10719RcNcR = A10719RcNcR ;
            Z10720RcNcP = A10720RcNcP ;
            Z10721RcNcHdO = A10721RcNcHdO ;
            Z10722RcNcRO = A10722RcNcRO ;
            Z10723RcNcPO = A10723RcNcPO ;
            Z10724RcNcRef = A10724RcNcRef ;
            Z10725RcNcN1 = A10725RcNcN1 ;
            Z10726RcNcN2 = A10726RcNcN2 ;
            Z10727RcNcDc = A10727RcNcDc ;
            Z10728RcNcGR = A10728RcNcGR ;
            Z10729RcNcFo = A10729RcNcFo ;
            Z10730RcNcVI = A10730RcNcVI ;
            Z10731RcNcV1 = A10731RcNcV1 ;
            Z10732RcNcV2 = A10732RcNcV2 ;
            Z10733RcNcOb = A10733RcNcOb ;
            Z10734RcNcCm = A10734RcNcCm ;
            Z10816RcNcE = A10816RcNcE ;
            Z10847RcNcKgH = A10847RcNcKgH ;
            Z252CliCod = A252CliCod ;
            Z833TipDefCod = A833TipDefCod ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         Z10718RcNcHd = A10718RcNcHd ;
         Z10719RcNcR = A10719RcNcR ;
         Z10720RcNcP = A10720RcNcP ;
         Z10721RcNcHdO = A10721RcNcHdO ;
         Z10722RcNcRO = A10722RcNcRO ;
         Z10723RcNcPO = A10723RcNcPO ;
         Z10724RcNcRef = A10724RcNcRef ;
         Z10725RcNcN1 = A10725RcNcN1 ;
         Z10726RcNcN2 = A10726RcNcN2 ;
         Z10727RcNcDc = A10727RcNcDc ;
         Z10728RcNcGR = A10728RcNcGR ;
         Z10729RcNcFo = A10729RcNcFo ;
         Z10730RcNcVI = A10730RcNcVI ;
         Z10731RcNcV1 = A10731RcNcV1 ;
         Z10732RcNcV2 = A10732RcNcV2 ;
         Z10733RcNcOb = A10733RcNcOb ;
         Z10734RcNcCm = A10734RcNcCm ;
         Z10816RcNcE = A10816RcNcE ;
         Z10847RcNcKgH = A10847RcNcKgH ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z833TipDefCod = A833TipDefCod ;
         Z279CliNom = A279CliNom ;
         Z834TipDefDsc = A834TipDefDsc ;
      }
   }

   public void standaloneNotModal18X1428( )
   {
   }

   public void standaloneModal18X1428( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRcNcLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtRcNcLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load18X1428( )
   {
      /* Using cursor T018X18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1428 = (short)(1) ;
         A279CliNom = T018X18_A279CliNom[0] ;
         A10718RcNcHd = T018X18_A10718RcNcHd[0] ;
         n10718RcNcHd = T018X18_n10718RcNcHd[0] ;
         A10719RcNcR = T018X18_A10719RcNcR[0] ;
         n10719RcNcR = T018X18_n10719RcNcR[0] ;
         A10720RcNcP = T018X18_A10720RcNcP[0] ;
         n10720RcNcP = T018X18_n10720RcNcP[0] ;
         A10721RcNcHdO = T018X18_A10721RcNcHdO[0] ;
         n10721RcNcHdO = T018X18_n10721RcNcHdO[0] ;
         A10722RcNcRO = T018X18_A10722RcNcRO[0] ;
         n10722RcNcRO = T018X18_n10722RcNcRO[0] ;
         A10723RcNcPO = T018X18_A10723RcNcPO[0] ;
         n10723RcNcPO = T018X18_n10723RcNcPO[0] ;
         A834TipDefDsc = T018X18_A834TipDefDsc[0] ;
         n834TipDefDsc = T018X18_n834TipDefDsc[0] ;
         A10724RcNcRef = T018X18_A10724RcNcRef[0] ;
         n10724RcNcRef = T018X18_n10724RcNcRef[0] ;
         A10725RcNcN1 = T018X18_A10725RcNcN1[0] ;
         n10725RcNcN1 = T018X18_n10725RcNcN1[0] ;
         A10726RcNcN2 = T018X18_A10726RcNcN2[0] ;
         n10726RcNcN2 = T018X18_n10726RcNcN2[0] ;
         A10727RcNcDc = T018X18_A10727RcNcDc[0] ;
         n10727RcNcDc = T018X18_n10727RcNcDc[0] ;
         A10728RcNcGR = T018X18_A10728RcNcGR[0] ;
         n10728RcNcGR = T018X18_n10728RcNcGR[0] ;
         A10729RcNcFo = T018X18_A10729RcNcFo[0] ;
         n10729RcNcFo = T018X18_n10729RcNcFo[0] ;
         A10730RcNcVI = T018X18_A10730RcNcVI[0] ;
         n10730RcNcVI = T018X18_n10730RcNcVI[0] ;
         A10731RcNcV1 = T018X18_A10731RcNcV1[0] ;
         n10731RcNcV1 = T018X18_n10731RcNcV1[0] ;
         A10732RcNcV2 = T018X18_A10732RcNcV2[0] ;
         n10732RcNcV2 = T018X18_n10732RcNcV2[0] ;
         A10733RcNcOb = T018X18_A10733RcNcOb[0] ;
         n10733RcNcOb = T018X18_n10733RcNcOb[0] ;
         A10734RcNcCm = T018X18_A10734RcNcCm[0] ;
         n10734RcNcCm = T018X18_n10734RcNcCm[0] ;
         A10816RcNcE = T018X18_A10816RcNcE[0] ;
         n10816RcNcE = T018X18_n10816RcNcE[0] ;
         A10847RcNcKgH = T018X18_A10847RcNcKgH[0] ;
         n10847RcNcKgH = T018X18_n10847RcNcKgH[0] ;
         A252CliCod = T018X18_A252CliCod[0] ;
         n252CliCod = T018X18_n252CliCod[0] ;
         A833TipDefCod = T018X18_A833TipDefCod[0] ;
         n833TipDefCod = T018X18_n833TipDefCod[0] ;
         zm18X1428( -4) ;
      }
      pr_default.close(16);
      onLoadActions18X1428( ) ;
   }

   public void onLoadActions18X1428( )
   {
      A10735RcNcV3 = (A10731RcNcV1.subtract(A10732RcNcV2).subtract(A10730RcNcVI)) ;
   }

   public void checkExtendedTable18X1428( )
   {
      nIsDirty_1428 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal18X1428( ) ;
      /* Using cursor T018X4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018X4_A279CliNom[0] ;
      pr_default.close(2);
      /* Using cursor T018X5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T018X5_A834TipDefDsc[0] ;
      n834TipDefDsc = T018X5_n834TipDefDsc[0] ;
      pr_default.close(3);
      nIsDirty_1428 = (short)(1) ;
      A10735RcNcV3 = (A10731RcNcV1.subtract(A10732RcNcV2).subtract(A10730RcNcVI)) ;
   }

   public void closeExtendedTableCursors18X1428( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable18X1428( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T018X19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T018X19_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_6( String A396EmprCod ,
                         short A833TipDefCod )
   {
      /* Using cursor T018X20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T018X20_A834TipDefDsc[0] ;
      n834TipDefDsc = T018X20_n834TipDefDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A834TipDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey18X1428( )
   {
      /* Using cursor T018X21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1428 = (short)(1) ;
      }
      else
      {
         RcdFound1428 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey18X1428( )
   {
      /* Using cursor T018X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T018X3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18X1428( 4) ;
         RcdFound1428 = (short)(1) ;
         initializeNonKey18X1428( ) ;
         A10717RcNcLin = T018X3_A10717RcNcLin[0] ;
         A10718RcNcHd = T018X3_A10718RcNcHd[0] ;
         n10718RcNcHd = T018X3_n10718RcNcHd[0] ;
         A10719RcNcR = T018X3_A10719RcNcR[0] ;
         n10719RcNcR = T018X3_n10719RcNcR[0] ;
         A10720RcNcP = T018X3_A10720RcNcP[0] ;
         n10720RcNcP = T018X3_n10720RcNcP[0] ;
         A10721RcNcHdO = T018X3_A10721RcNcHdO[0] ;
         n10721RcNcHdO = T018X3_n10721RcNcHdO[0] ;
         A10722RcNcRO = T018X3_A10722RcNcRO[0] ;
         n10722RcNcRO = T018X3_n10722RcNcRO[0] ;
         A10723RcNcPO = T018X3_A10723RcNcPO[0] ;
         n10723RcNcPO = T018X3_n10723RcNcPO[0] ;
         A10724RcNcRef = T018X3_A10724RcNcRef[0] ;
         n10724RcNcRef = T018X3_n10724RcNcRef[0] ;
         A10725RcNcN1 = T018X3_A10725RcNcN1[0] ;
         n10725RcNcN1 = T018X3_n10725RcNcN1[0] ;
         A10726RcNcN2 = T018X3_A10726RcNcN2[0] ;
         n10726RcNcN2 = T018X3_n10726RcNcN2[0] ;
         A10727RcNcDc = T018X3_A10727RcNcDc[0] ;
         n10727RcNcDc = T018X3_n10727RcNcDc[0] ;
         A10728RcNcGR = T018X3_A10728RcNcGR[0] ;
         n10728RcNcGR = T018X3_n10728RcNcGR[0] ;
         A10729RcNcFo = T018X3_A10729RcNcFo[0] ;
         n10729RcNcFo = T018X3_n10729RcNcFo[0] ;
         A10730RcNcVI = T018X3_A10730RcNcVI[0] ;
         n10730RcNcVI = T018X3_n10730RcNcVI[0] ;
         A10731RcNcV1 = T018X3_A10731RcNcV1[0] ;
         n10731RcNcV1 = T018X3_n10731RcNcV1[0] ;
         A10732RcNcV2 = T018X3_A10732RcNcV2[0] ;
         n10732RcNcV2 = T018X3_n10732RcNcV2[0] ;
         A10733RcNcOb = T018X3_A10733RcNcOb[0] ;
         n10733RcNcOb = T018X3_n10733RcNcOb[0] ;
         A10734RcNcCm = T018X3_A10734RcNcCm[0] ;
         n10734RcNcCm = T018X3_n10734RcNcCm[0] ;
         A10816RcNcE = T018X3_A10816RcNcE[0] ;
         n10816RcNcE = T018X3_n10816RcNcE[0] ;
         A10847RcNcKgH = T018X3_A10847RcNcKgH[0] ;
         n10847RcNcKgH = T018X3_n10847RcNcKgH[0] ;
         A252CliCod = T018X3_A252CliCod[0] ;
         n252CliCod = T018X3_n252CliCod[0] ;
         A833TipDefCod = T018X3_A833TipDefCod[0] ;
         n833TipDefCod = T018X3_n833TipDefCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         sMode1428 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18X1428( ) ;
         load18X1428( ) ;
         Gx_mode = sMode1428 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1428 = (short)(0) ;
         initializeNonKey18X1428( ) ;
         sMode1428 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18X1428( ) ;
         Gx_mode = sMode1428 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18X1428( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18X1428( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z10718RcNcHd != T018X2_A10718RcNcHd[0] ) || ( Z10719RcNcR != T018X2_A10719RcNcR[0] ) || ( GXutil.strcmp(Z10720RcNcP, T018X2_A10720RcNcP[0]) != 0 ) || ( Z10721RcNcHdO != T018X2_A10721RcNcHdO[0] ) || ( Z10722RcNcRO != T018X2_A10722RcNcRO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10723RcNcPO, T018X2_A10723RcNcPO[0]) != 0 ) || ( GXutil.strcmp(Z10724RcNcRef, T018X2_A10724RcNcRef[0]) != 0 ) || ( Z10725RcNcN1 != T018X2_A10725RcNcN1[0] ) || ( Z10726RcNcN2 != T018X2_A10726RcNcN2[0] ) || ( GXutil.strcmp(Z10727RcNcDc, T018X2_A10727RcNcDc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10728RcNcGR != T018X2_A10728RcNcGR[0] ) || ( GXutil.strcmp(Z10729RcNcFo, T018X2_A10729RcNcFo[0]) != 0 ) || ( DecimalUtil.compareTo(Z10730RcNcVI, T018X2_A10730RcNcVI[0]) != 0 ) || ( DecimalUtil.compareTo(Z10731RcNcV1, T018X2_A10731RcNcV1[0]) != 0 ) || ( DecimalUtil.compareTo(Z10732RcNcV2, T018X2_A10732RcNcV2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10733RcNcOb, T018X2_A10733RcNcOb[0]) != 0 ) || ( GXutil.strcmp(Z10734RcNcCm, T018X2_A10734RcNcCm[0]) != 0 ) || ( Z10816RcNcE != T018X2_A10816RcNcE[0] ) || ( DecimalUtil.compareTo(Z10847RcNcKgH, T018X2_A10847RcNcKgH[0]) != 0 ) || ( Z252CliCod != T018X2_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z833TipDefCod != T018X2_A833TipDefCod[0] ) )
         {
            if ( Z10718RcNcHd != T018X2_A10718RcNcHd[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcHd");
               GXutil.writeLogRaw("Old: ",Z10718RcNcHd);
               GXutil.writeLogRaw("Current: ",T018X2_A10718RcNcHd[0]);
            }
            if ( Z10719RcNcR != T018X2_A10719RcNcR[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcR");
               GXutil.writeLogRaw("Old: ",Z10719RcNcR);
               GXutil.writeLogRaw("Current: ",T018X2_A10719RcNcR[0]);
            }
            if ( GXutil.strcmp(Z10720RcNcP, T018X2_A10720RcNcP[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcP");
               GXutil.writeLogRaw("Old: ",Z10720RcNcP);
               GXutil.writeLogRaw("Current: ",T018X2_A10720RcNcP[0]);
            }
            if ( Z10721RcNcHdO != T018X2_A10721RcNcHdO[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcHdO");
               GXutil.writeLogRaw("Old: ",Z10721RcNcHdO);
               GXutil.writeLogRaw("Current: ",T018X2_A10721RcNcHdO[0]);
            }
            if ( Z10722RcNcRO != T018X2_A10722RcNcRO[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcRO");
               GXutil.writeLogRaw("Old: ",Z10722RcNcRO);
               GXutil.writeLogRaw("Current: ",T018X2_A10722RcNcRO[0]);
            }
            if ( GXutil.strcmp(Z10723RcNcPO, T018X2_A10723RcNcPO[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcPO");
               GXutil.writeLogRaw("Old: ",Z10723RcNcPO);
               GXutil.writeLogRaw("Current: ",T018X2_A10723RcNcPO[0]);
            }
            if ( GXutil.strcmp(Z10724RcNcRef, T018X2_A10724RcNcRef[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcRef");
               GXutil.writeLogRaw("Old: ",Z10724RcNcRef);
               GXutil.writeLogRaw("Current: ",T018X2_A10724RcNcRef[0]);
            }
            if ( Z10725RcNcN1 != T018X2_A10725RcNcN1[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcN1");
               GXutil.writeLogRaw("Old: ",Z10725RcNcN1);
               GXutil.writeLogRaw("Current: ",T018X2_A10725RcNcN1[0]);
            }
            if ( Z10726RcNcN2 != T018X2_A10726RcNcN2[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcN2");
               GXutil.writeLogRaw("Old: ",Z10726RcNcN2);
               GXutil.writeLogRaw("Current: ",T018X2_A10726RcNcN2[0]);
            }
            if ( GXutil.strcmp(Z10727RcNcDc, T018X2_A10727RcNcDc[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcDc");
               GXutil.writeLogRaw("Old: ",Z10727RcNcDc);
               GXutil.writeLogRaw("Current: ",T018X2_A10727RcNcDc[0]);
            }
            if ( Z10728RcNcGR != T018X2_A10728RcNcGR[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcGR");
               GXutil.writeLogRaw("Old: ",Z10728RcNcGR);
               GXutil.writeLogRaw("Current: ",T018X2_A10728RcNcGR[0]);
            }
            if ( GXutil.strcmp(Z10729RcNcFo, T018X2_A10729RcNcFo[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcFo");
               GXutil.writeLogRaw("Old: ",Z10729RcNcFo);
               GXutil.writeLogRaw("Current: ",T018X2_A10729RcNcFo[0]);
            }
            if ( DecimalUtil.compareTo(Z10730RcNcVI, T018X2_A10730RcNcVI[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcVI");
               GXutil.writeLogRaw("Old: ",Z10730RcNcVI);
               GXutil.writeLogRaw("Current: ",T018X2_A10730RcNcVI[0]);
            }
            if ( DecimalUtil.compareTo(Z10731RcNcV1, T018X2_A10731RcNcV1[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcV1");
               GXutil.writeLogRaw("Old: ",Z10731RcNcV1);
               GXutil.writeLogRaw("Current: ",T018X2_A10731RcNcV1[0]);
            }
            if ( DecimalUtil.compareTo(Z10732RcNcV2, T018X2_A10732RcNcV2[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcV2");
               GXutil.writeLogRaw("Old: ",Z10732RcNcV2);
               GXutil.writeLogRaw("Current: ",T018X2_A10732RcNcV2[0]);
            }
            if ( GXutil.strcmp(Z10733RcNcOb, T018X2_A10733RcNcOb[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcOb");
               GXutil.writeLogRaw("Old: ",Z10733RcNcOb);
               GXutil.writeLogRaw("Current: ",T018X2_A10733RcNcOb[0]);
            }
            if ( GXutil.strcmp(Z10734RcNcCm, T018X2_A10734RcNcCm[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcCm");
               GXutil.writeLogRaw("Old: ",Z10734RcNcCm);
               GXutil.writeLogRaw("Current: ",T018X2_A10734RcNcCm[0]);
            }
            if ( Z10816RcNcE != T018X2_A10816RcNcE[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcE");
               GXutil.writeLogRaw("Old: ",Z10816RcNcE);
               GXutil.writeLogRaw("Current: ",T018X2_A10816RcNcE[0]);
            }
            if ( DecimalUtil.compareTo(Z10847RcNcKgH, T018X2_A10847RcNcKgH[0]) != 0 )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"RcNcKgH");
               GXutil.writeLogRaw("Old: ",Z10847RcNcKgH);
               GXutil.writeLogRaw("Current: ",T018X2_A10847RcNcKgH[0]);
            }
            if ( Z252CliCod != T018X2_A252CliCod[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T018X2_A252CliCod[0]);
            }
            if ( Z833TipDefCod != T018X2_A833TipDefCod[0] )
            {
               GXutil.writeLogln("trcnc00:[seudo value changed for attri]"+"TipDefCod");
               GXutil.writeLogRaw("Old: ",Z833TipDefCod);
               GXutil.writeLogRaw("Current: ",T018X2_A833TipDefCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRCNC01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18X1428( )
   {
      beforeValidate18X1428( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18X1428( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18X1428( 0) ;
         checkOptimisticConcurrency18X1428( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18X1428( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18X1428( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018X22 */
                  pr_default.execute(20, new Object[] {A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Boolean.valueOf(n10718RcNcHd), Integer.valueOf(A10718RcNcHd), Boolean.valueOf(n10719RcNcR), Byte.valueOf(A10719RcNcR), Boolean.valueOf(n10720RcNcP), A10720RcNcP, Boolean.valueOf(n10721RcNcHdO), Integer.valueOf(A10721RcNcHdO), Boolean.valueOf(n10722RcNcRO), Byte.valueOf(A10722RcNcRO), Boolean.valueOf(n10723RcNcPO), A10723RcNcPO, Boolean.valueOf(n10724RcNcRef), A10724RcNcRef, Boolean.valueOf(n10725RcNcN1), Integer.valueOf(A10725RcNcN1), Boolean.valueOf(n10726RcNcN2), Integer.valueOf(A10726RcNcN2), Boolean.valueOf(n10727RcNcDc), A10727RcNcDc, Boolean.valueOf(n10728RcNcGR), Long.valueOf(A10728RcNcGR), Boolean.valueOf(n10729RcNcFo), A10729RcNcFo, Boolean.valueOf(n10730RcNcVI), A10730RcNcVI, Boolean.valueOf(n10731RcNcV1), A10731RcNcV1, Boolean.valueOf(n10732RcNcV2), A10732RcNcV2, Boolean.valueOf(n10733RcNcOb), A10733RcNcOb, Boolean.valueOf(n10734RcNcCm), A10734RcNcCm, Boolean.valueOf(n10816RcNcE), Byte.valueOf(A10816RcNcE), Boolean.valueOf(n10847RcNcKgH), A10847RcNcKgH, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load18X1428( ) ;
         }
         endLevel18X1428( ) ;
      }
      closeExtendedTableCursors18X1428( ) ;
   }

   public void update18X1428( )
   {
      beforeValidate18X1428( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18X1428( ) ;
      }
      if ( ( nIsMod_1428 != 0 ) || ( nIsDirty_1428 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18X1428( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18X1428( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18X1428( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018X23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n10718RcNcHd), Integer.valueOf(A10718RcNcHd), Boolean.valueOf(n10719RcNcR), Byte.valueOf(A10719RcNcR), Boolean.valueOf(n10720RcNcP), A10720RcNcP, Boolean.valueOf(n10721RcNcHdO), Integer.valueOf(A10721RcNcHdO), Boolean.valueOf(n10722RcNcRO), Byte.valueOf(A10722RcNcRO), Boolean.valueOf(n10723RcNcPO), A10723RcNcPO, Boolean.valueOf(n10724RcNcRef), A10724RcNcRef, Boolean.valueOf(n10725RcNcN1), Integer.valueOf(A10725RcNcN1), Boolean.valueOf(n10726RcNcN2), Integer.valueOf(A10726RcNcN2), Boolean.valueOf(n10727RcNcDc), A10727RcNcDc, Boolean.valueOf(n10728RcNcGR), Long.valueOf(A10728RcNcGR), Boolean.valueOf(n10729RcNcFo), A10729RcNcFo, Boolean.valueOf(n10730RcNcVI), A10730RcNcVI, Boolean.valueOf(n10731RcNcV1), A10731RcNcV1, Boolean.valueOf(n10732RcNcV2), A10732RcNcV2, Boolean.valueOf(n10733RcNcOb), A10733RcNcOb, Boolean.valueOf(n10734RcNcCm), A10734RcNcCm, Boolean.valueOf(n10816RcNcE), Byte.valueOf(A10816RcNcE), Boolean.valueOf(n10847RcNcKgH), A10847RcNcKgH, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18X1428( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18X1428( ) ;
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
            endLevel18X1428( ) ;
         }
      }
      closeExtendedTableCursors18X1428( ) ;
   }

   public void deferredUpdate18X1428( )
   {
   }

   public void delete18X1428( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18X1428( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18X1428( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18X1428( ) ;
         afterConfirm18X1428( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18X1428( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018X24 */
               pr_default.execute(22, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC01");
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
      sMode1428 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18X1428( ) ;
      Gx_mode = sMode1428 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18X1428( )
   {
      standaloneModal18X1428( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T018X25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T018X25_A279CliNom[0] ;
         pr_default.close(23);
         /* Using cursor T018X26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T018X26_A834TipDefDsc[0] ;
         n834TipDefDsc = T018X26_n834TipDefDsc[0] ;
         pr_default.close(24);
         A10735RcNcV3 = (A10731RcNcV1.subtract(A10732RcNcV2).subtract(A10730RcNcVI)) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T018X27 */
         pr_default.execute(25, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void endLevel18X1428( )
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

   public void scanStart18X1428( )
   {
      /* Scan By routine */
      /* Using cursor T018X28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A10715RcNcFec});
      RcdFound1428 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1428 = (short)(1) ;
         A10717RcNcLin = T018X28_A10717RcNcLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18X1428( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1428 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1428 = (short)(1) ;
         A10717RcNcLin = T018X28_A10717RcNcLin[0] ;
      }
   }

   public void scanEnd18X1428( )
   {
      pr_default.close(26);
   }

   public void afterConfirm18X1428( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18X1428( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18X1428( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18X1428( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18X1428( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18X1428( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18X1428( )
   {
      edtRcNcLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcHd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcR_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcHdO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcHdO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcHdO_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcRO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcRO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcRO_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcPO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcPO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcPO_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtTipDefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcRef_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcN1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcN1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcN1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcN2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcN2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcN2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcDc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcGR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcGR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcGR_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcVI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcVI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcVI_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcV1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcV1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcV2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcV2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcOb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcOb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcOb_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcCm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcCm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcCm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcV3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcV3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcE_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRcNcKgH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcKgH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcKgH_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes18X1428( )
   {
   }

   public void send_integrity_lvl_hashes18X1427( )
   {
   }

   public void subsflControlProps_401428( )
   {
      edtavnRcdDeleted_1428_Internalname = "vNRCDDELETED_1428_"+sGXsfl_40_idx ;
      edtRcNcLin_Internalname = "RCNCLIN_"+sGXsfl_40_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_40_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_40_idx ;
      edtRcNcHd_Internalname = "RCNCHD_"+sGXsfl_40_idx ;
      edtRcNcR_Internalname = "RCNCR_"+sGXsfl_40_idx ;
      edtRcNcP_Internalname = "RCNCP_"+sGXsfl_40_idx ;
      edtRcNcHdO_Internalname = "RCNCHDO_"+sGXsfl_40_idx ;
      edtRcNcRO_Internalname = "RCNCRO_"+sGXsfl_40_idx ;
      edtRcNcPO_Internalname = "RCNCPO_"+sGXsfl_40_idx ;
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_40_idx ;
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_40_idx ;
      edtRcNcRef_Internalname = "RCNCREF_"+sGXsfl_40_idx ;
      edtRcNcN1_Internalname = "RCNCN1_"+sGXsfl_40_idx ;
      edtRcNcN2_Internalname = "RCNCN2_"+sGXsfl_40_idx ;
      edtRcNcDc_Internalname = "RCNCDC_"+sGXsfl_40_idx ;
      edtRcNcGR_Internalname = "RCNCGR_"+sGXsfl_40_idx ;
      edtRcNcFo_Internalname = "RCNCFO_"+sGXsfl_40_idx ;
      edtRcNcVI_Internalname = "RCNCVI_"+sGXsfl_40_idx ;
      edtRcNcV1_Internalname = "RCNCV1_"+sGXsfl_40_idx ;
      edtRcNcV2_Internalname = "RCNCV2_"+sGXsfl_40_idx ;
      edtRcNcOb_Internalname = "RCNCOB_"+sGXsfl_40_idx ;
      edtRcNcCm_Internalname = "RCNCCM_"+sGXsfl_40_idx ;
      edtRcNcV3_Internalname = "RCNCV3_"+sGXsfl_40_idx ;
      edtRcNcE_Internalname = "RCNCE_"+sGXsfl_40_idx ;
      edtRcNcKgH_Internalname = "RCNCKGH_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401428( )
   {
      edtavnRcdDeleted_1428_Internalname = "vNRCDDELETED_1428_"+sGXsfl_40_fel_idx ;
      edtRcNcLin_Internalname = "RCNCLIN_"+sGXsfl_40_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_40_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_40_fel_idx ;
      edtRcNcHd_Internalname = "RCNCHD_"+sGXsfl_40_fel_idx ;
      edtRcNcR_Internalname = "RCNCR_"+sGXsfl_40_fel_idx ;
      edtRcNcP_Internalname = "RCNCP_"+sGXsfl_40_fel_idx ;
      edtRcNcHdO_Internalname = "RCNCHDO_"+sGXsfl_40_fel_idx ;
      edtRcNcRO_Internalname = "RCNCRO_"+sGXsfl_40_fel_idx ;
      edtRcNcPO_Internalname = "RCNCPO_"+sGXsfl_40_fel_idx ;
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_40_fel_idx ;
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_40_fel_idx ;
      edtRcNcRef_Internalname = "RCNCREF_"+sGXsfl_40_fel_idx ;
      edtRcNcN1_Internalname = "RCNCN1_"+sGXsfl_40_fel_idx ;
      edtRcNcN2_Internalname = "RCNCN2_"+sGXsfl_40_fel_idx ;
      edtRcNcDc_Internalname = "RCNCDC_"+sGXsfl_40_fel_idx ;
      edtRcNcGR_Internalname = "RCNCGR_"+sGXsfl_40_fel_idx ;
      edtRcNcFo_Internalname = "RCNCFO_"+sGXsfl_40_fel_idx ;
      edtRcNcVI_Internalname = "RCNCVI_"+sGXsfl_40_fel_idx ;
      edtRcNcV1_Internalname = "RCNCV1_"+sGXsfl_40_fel_idx ;
      edtRcNcV2_Internalname = "RCNCV2_"+sGXsfl_40_fel_idx ;
      edtRcNcOb_Internalname = "RCNCOB_"+sGXsfl_40_fel_idx ;
      edtRcNcCm_Internalname = "RCNCCM_"+sGXsfl_40_fel_idx ;
      edtRcNcV3_Internalname = "RCNCV3_"+sGXsfl_40_fel_idx ;
      edtRcNcE_Internalname = "RCNCE_"+sGXsfl_40_fel_idx ;
      edtRcNcKgH_Internalname = "RCNCKGH_"+sGXsfl_40_fel_idx ;
   }

   public void addRow18X1428( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401428( ) ;
      sendRow18X1428( ) ;
   }

   public void sendRow18X1428( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1428_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1428_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1428), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1428), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1428_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1428_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcLin_Internalname,GXutil.ltrim( localUtil.ntoc( A10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10717RcNcLin), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcHd_Internalname,GXutil.ltrim( localUtil.ntoc( A10718RcNcHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcHd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10718RcNcHd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10718RcNcHd), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcHd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcHd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcR_Internalname,GXutil.ltrim( localUtil.ntoc( A10719RcNcR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10719RcNcR), "9") : localUtil.format( DecimalUtil.doubleToDec(A10719RcNcR), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcP_Internalname,GXutil.rtrim( A10720RcNcP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcHdO_Internalname,GXutil.ltrim( localUtil.ntoc( A10721RcNcHdO, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcHdO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10721RcNcHdO), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10721RcNcHdO), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcHdO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcHdO_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcRO_Internalname,GXutil.ltrim( localUtil.ntoc( A10722RcNcRO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcRO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10722RcNcRO), "9") : localUtil.format( DecimalUtil.doubleToDec(A10722RcNcRO), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcRO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcRO_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcPO_Internalname,GXutil.rtrim( A10723RcNcPO),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcPO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcPO_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefCod_Internalname,GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTipDefCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipDefCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefDsc_Internalname,GXutil.rtrim( A834TipDefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipDefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcRef_Internalname,GXutil.rtrim( A10724RcNcRef),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcN1_Internalname,GXutil.ltrim( localUtil.ntoc( A10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcN1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10725RcNcN1), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10725RcNcN1), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcN1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcN1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcN2_Internalname,GXutil.ltrim( localUtil.ntoc( A10726RcNcN2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcN2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10726RcNcN2), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10726RcNcN2), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcN2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcN2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcDc_Internalname,GXutil.rtrim( A10727RcNcDc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcDc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcDc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcGR_Internalname,GXutil.ltrim( localUtil.ntoc( A10728RcNcGR, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcGR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10728RcNcGR), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10728RcNcGR), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcGR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcGR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcFo_Internalname,GXutil.rtrim( A10729RcNcFo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcFo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcFo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcVI_Internalname,GXutil.ltrim( localUtil.ntoc( A10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcVI_Enabled!=0) ? localUtil.format( A10730RcNcVI, "ZZZZZZZZZ9.99") : localUtil.format( A10730RcNcVI, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcVI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcVI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcV1_Internalname,GXutil.ltrim( localUtil.ntoc( A10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcV1_Enabled!=0) ? localUtil.format( A10731RcNcV1, "ZZZZZZZZZ9.99") : localUtil.format( A10731RcNcV1, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcV1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcV1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcV2_Internalname,GXutil.ltrim( localUtil.ntoc( A10732RcNcV2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcV2_Enabled!=0) ? localUtil.format( A10732RcNcV2, "ZZZZZZZZZ9.99") : localUtil.format( A10732RcNcV2, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcV2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcV2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcOb_Internalname,A10733RcNcOb,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcOb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcOb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcCm_Internalname,A10734RcNcCm,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcCm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcCm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcV3_Internalname,GXutil.ltrim( localUtil.ntoc( A10735RcNcV3, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcV3_Enabled!=0) ? localUtil.format( A10735RcNcV3, "ZZZZZZZZZ9.99") : localUtil.format( A10735RcNcV3, "ZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcV3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcV3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcE_Internalname,GXutil.ltrim( localUtil.ntoc( A10816RcNcE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10816RcNcE), "9") : localUtil.format( DecimalUtil.doubleToDec(A10816RcNcE), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcE_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1428_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcKgH_Internalname,GXutil.ltrim( localUtil.ntoc( A10847RcNcKgH, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcKgH_Enabled!=0) ? localUtil.format( A10847RcNcKgH, "ZZZZZ9.99") : localUtil.format( A10847RcNcKgH, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcKgH_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcKgH_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18X1428( ) ;
      GXCCtl = "Z10717RcNcLin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10718RcNcHd_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10718RcNcHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10719RcNcR_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10719RcNcR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10720RcNcP_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10720RcNcP));
      GXCCtl = "Z10721RcNcHdO_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10721RcNcHdO, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10722RcNcRO_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10722RcNcRO, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10723RcNcPO_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10723RcNcPO));
      GXCCtl = "Z10724RcNcRef_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10724RcNcRef));
      GXCCtl = "Z10725RcNcN1_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10725RcNcN1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10726RcNcN2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10726RcNcN2, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10727RcNcDc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10727RcNcDc));
      GXCCtl = "Z10728RcNcGR_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10728RcNcGR, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10729RcNcFo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10729RcNcFo));
      GXCCtl = "Z10730RcNcVI_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10730RcNcVI, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10731RcNcV1_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10731RcNcV1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10732RcNcV2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10732RcNcV2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10733RcNcOb_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10733RcNcOb);
      GXCCtl = "Z10734RcNcCm_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10734RcNcCm);
      GXCCtl = "Z10816RcNcE_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10816RcNcE, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10847RcNcKgH_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10847RcNcKgH, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z252CliCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z833TipDefCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1428_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1428_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1428_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1428, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1428_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1428_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCLIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCHD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCHDO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHdO_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCRO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRO_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcPO_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCREF_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCN1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCN2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCDC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCGR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcGR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCFO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCVI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcVI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCV1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCV2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCOB_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCCM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcCm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCV3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCE_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCKGH_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcKgH_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18X1428( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401428( ) ;
      edtavnRcdDeleted_1428_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1428_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCLIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCHD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcHdO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCHDO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcRO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCRO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcPO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipDefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCREF_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcN1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCN1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcN2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCN2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcDc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCDC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcGR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCGR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcFo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCFO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcVI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCVI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcV1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcV2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcOb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCOB_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcCm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCCM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcV3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCE_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcKgH_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCKGH_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1428_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1428_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1428");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1428_Internalname ;
         wbErr = true ;
         nRcdDeleted_1428 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1428 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1428_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "RCNCLIN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcLin_Internalname ;
         wbErr = true ;
         A10717RcNcLin = 0 ;
      }
      else
      {
         A10717RcNcLin = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         wbErr = true ;
         A252CliCod = 0 ;
         n252CliCod = false ;
      }
      else
      {
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
      }
      A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RCNCHD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcHd_Internalname ;
         wbErr = true ;
         A10718RcNcHd = 0 ;
         n10718RcNcHd = false ;
      }
      else
      {
         A10718RcNcHd = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10718RcNcHd = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "RCNCR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcR_Internalname ;
         wbErr = true ;
         A10719RcNcR = (byte)(0) ;
         n10719RcNcR = false ;
      }
      else
      {
         A10719RcNcR = (byte)(localUtil.ctol( httpContext.cgiGet( edtRcNcR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10719RcNcR = false ;
      }
      A10720RcNcP = httpContext.cgiGet( edtRcNcP_Internalname) ;
      n10720RcNcP = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcHdO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcHdO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RCNCHDO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcHdO_Internalname ;
         wbErr = true ;
         A10721RcNcHdO = 0 ;
         n10721RcNcHdO = false ;
      }
      else
      {
         A10721RcNcHdO = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcHdO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10721RcNcHdO = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcRO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcRO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "RCNCRO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcRO_Internalname ;
         wbErr = true ;
         A10722RcNcRO = (byte)(0) ;
         n10722RcNcRO = false ;
      }
      else
      {
         A10722RcNcRO = (byte)(localUtil.ctol( httpContext.cgiGet( edtRcNcRO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10722RcNcRO = false ;
      }
      A10723RcNcPO = httpContext.cgiGet( edtRcNcPO_Internalname) ;
      n10723RcNcPO = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         wbErr = true ;
         A833TipDefCod = (short)(0) ;
         n833TipDefCod = false ;
      }
      else
      {
         A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n833TipDefCod = false ;
      }
      A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
      n834TipDefDsc = false ;
      A10724RcNcRef = httpContext.cgiGet( edtRcNcRef_Internalname) ;
      n10724RcNcRef = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcN1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcN1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RCNCN1_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcN1_Internalname ;
         wbErr = true ;
         A10725RcNcN1 = 0 ;
         n10725RcNcN1 = false ;
      }
      else
      {
         A10725RcNcN1 = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcN1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10725RcNcN1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcN2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcN2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RCNCN2_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcN2_Internalname ;
         wbErr = true ;
         A10726RcNcN2 = 0 ;
         n10726RcNcN2 = false ;
      }
      else
      {
         A10726RcNcN2 = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcN2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10726RcNcN2 = false ;
      }
      A10727RcNcDc = httpContext.cgiGet( edtRcNcDc_Internalname) ;
      n10727RcNcDc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcGR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcGR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "RCNCGR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcGR_Internalname ;
         wbErr = true ;
         A10728RcNcGR = 0 ;
         n10728RcNcGR = false ;
      }
      else
      {
         A10728RcNcGR = localUtil.ctol( httpContext.cgiGet( edtRcNcGR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n10728RcNcGR = false ;
      }
      A10729RcNcFo = httpContext.cgiGet( edtRcNcFo_Internalname) ;
      n10729RcNcFo = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcVI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcVI_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "RCNCVI_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcVI_Internalname ;
         wbErr = true ;
         A10730RcNcVI = DecimalUtil.ZERO ;
         n10730RcNcVI = false ;
      }
      else
      {
         A10730RcNcVI = localUtil.ctond( httpContext.cgiGet( edtRcNcVI_Internalname)) ;
         n10730RcNcVI = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcV1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcV1_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "RCNCV1_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcV1_Internalname ;
         wbErr = true ;
         A10731RcNcV1 = DecimalUtil.ZERO ;
         n10731RcNcV1 = false ;
      }
      else
      {
         A10731RcNcV1 = localUtil.ctond( httpContext.cgiGet( edtRcNcV1_Internalname)) ;
         n10731RcNcV1 = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcV2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcV2_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "RCNCV2_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcV2_Internalname ;
         wbErr = true ;
         A10732RcNcV2 = DecimalUtil.ZERO ;
         n10732RcNcV2 = false ;
      }
      else
      {
         A10732RcNcV2 = localUtil.ctond( httpContext.cgiGet( edtRcNcV2_Internalname)) ;
         n10732RcNcV2 = false ;
      }
      A10733RcNcOb = httpContext.cgiGet( edtRcNcOb_Internalname) ;
      n10733RcNcOb = false ;
      A10734RcNcCm = httpContext.cgiGet( edtRcNcCm_Internalname) ;
      n10734RcNcCm = false ;
      A10735RcNcV3 = localUtil.ctond( httpContext.cgiGet( edtRcNcV3_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "RCNCE_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcE_Internalname ;
         wbErr = true ;
         A10816RcNcE = (byte)(0) ;
         n10816RcNcE = false ;
      }
      else
      {
         A10816RcNcE = (byte)(localUtil.ctol( httpContext.cgiGet( edtRcNcE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10816RcNcE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcKgH_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcKgH_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "RCNCKGH_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcKgH_Internalname ;
         wbErr = true ;
         A10847RcNcKgH = DecimalUtil.ZERO ;
         n10847RcNcKgH = false ;
      }
      else
      {
         A10847RcNcKgH = localUtil.ctond( httpContext.cgiGet( edtRcNcKgH_Internalname)) ;
         n10847RcNcKgH = false ;
      }
      GXCCtl = "Z10717RcNcLin_" + sGXsfl_40_idx ;
      Z10717RcNcLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10718RcNcHd_" + sGXsfl_40_idx ;
      Z10718RcNcHd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10719RcNcR_" + sGXsfl_40_idx ;
      Z10719RcNcR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10720RcNcP_" + sGXsfl_40_idx ;
      Z10720RcNcP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10721RcNcHdO_" + sGXsfl_40_idx ;
      Z10721RcNcHdO = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10722RcNcRO_" + sGXsfl_40_idx ;
      Z10722RcNcRO = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10723RcNcPO_" + sGXsfl_40_idx ;
      Z10723RcNcPO = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10724RcNcRef_" + sGXsfl_40_idx ;
      Z10724RcNcRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10725RcNcN1_" + sGXsfl_40_idx ;
      Z10725RcNcN1 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10726RcNcN2_" + sGXsfl_40_idx ;
      Z10726RcNcN2 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10727RcNcDc_" + sGXsfl_40_idx ;
      Z10727RcNcDc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10728RcNcGR_" + sGXsfl_40_idx ;
      Z10728RcNcGR = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z10729RcNcFo_" + sGXsfl_40_idx ;
      Z10729RcNcFo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10730RcNcVI_" + sGXsfl_40_idx ;
      Z10730RcNcVI = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10731RcNcV1_" + sGXsfl_40_idx ;
      Z10731RcNcV1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10732RcNcV2_" + sGXsfl_40_idx ;
      Z10732RcNcV2 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10733RcNcOb_" + sGXsfl_40_idx ;
      Z10733RcNcOb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10734RcNcCm_" + sGXsfl_40_idx ;
      Z10734RcNcCm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10816RcNcE_" + sGXsfl_40_idx ;
      Z10816RcNcE = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10847RcNcKgH_" + sGXsfl_40_idx ;
      Z10847RcNcKgH = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z252CliCod_" + sGXsfl_40_idx ;
      Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z833TipDefCod_" + sGXsfl_40_idx ;
      Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1428_" + sGXsfl_40_idx ;
      nRcdDeleted_1428 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1428_" + sGXsfl_40_idx ;
      nRcdExists_1428 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1428_" + sGXsfl_40_idx ;
      nIsMod_1428 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRcNcLin_Enabled = edtRcNcLin_Enabled ;
   }

   public void confirmValues18X0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401428( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401428( ) ;
         httpContext.changePostValue( "Z10717RcNcLin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10717RcNcLin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10717RcNcLin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10718RcNcHd_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10718RcNcHd_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10718RcNcHd_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10719RcNcR_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10719RcNcR_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10719RcNcR_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10720RcNcP_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10720RcNcP_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10720RcNcP_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10721RcNcHdO_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10721RcNcHdO_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10721RcNcHdO_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10722RcNcRO_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10722RcNcRO_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10722RcNcRO_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10723RcNcPO_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10723RcNcPO_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10723RcNcPO_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10724RcNcRef_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10724RcNcRef_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10724RcNcRef_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10725RcNcN1_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10725RcNcN1_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10725RcNcN1_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10726RcNcN2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10726RcNcN2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10726RcNcN2_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10727RcNcDc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10727RcNcDc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10727RcNcDc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10728RcNcGR_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10728RcNcGR_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10728RcNcGR_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10729RcNcFo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10729RcNcFo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10729RcNcFo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10730RcNcVI_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10730RcNcVI_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10730RcNcVI_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10731RcNcV1_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10731RcNcV1_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10731RcNcV1_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10732RcNcV2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10732RcNcV2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10732RcNcV2_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10733RcNcOb_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10733RcNcOb_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10733RcNcOb_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10734RcNcCm_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10734RcNcCm_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10734RcNcCm_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10816RcNcE_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10816RcNcE_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10816RcNcE_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10847RcNcKgH_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10847RcNcKgH_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10847RcNcKgH_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z252CliCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z833TipDefCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trcnc00", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10715RcNcFec", localUtil.dtoc( Z10715RcNcFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10716RcNcUlt", GXutil.ltrim( localUtil.ntoc( Z10716RcNcUlt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.trcnc00", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRCNC00" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "NOTAS CREDITO - RECLAMACIONES", "") ;
   }

   public void initializeNonKey18X1427( )
   {
      A10716RcNcUlt = 0 ;
      n10716RcNcUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10716RcNcUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10716RcNcUlt), 6, 0));
      Z10716RcNcUlt = 0 ;
   }

   public void initAll18X1427( )
   {
      A10715RcNcFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
      initializeNonKey18X1427( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18X1428( )
   {
      A10735RcNcV3 = DecimalUtil.ZERO ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A279CliNom = "" ;
      A10718RcNcHd = 0 ;
      n10718RcNcHd = false ;
      A10719RcNcR = (byte)(0) ;
      n10719RcNcR = false ;
      A10720RcNcP = "" ;
      n10720RcNcP = false ;
      A10721RcNcHdO = 0 ;
      n10721RcNcHdO = false ;
      A10722RcNcRO = (byte)(0) ;
      n10722RcNcRO = false ;
      A10723RcNcPO = "" ;
      n10723RcNcPO = false ;
      A833TipDefCod = (short)(0) ;
      n833TipDefCod = false ;
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      A10724RcNcRef = "" ;
      n10724RcNcRef = false ;
      A10725RcNcN1 = 0 ;
      n10725RcNcN1 = false ;
      A10726RcNcN2 = 0 ;
      n10726RcNcN2 = false ;
      A10727RcNcDc = "" ;
      n10727RcNcDc = false ;
      A10728RcNcGR = 0 ;
      n10728RcNcGR = false ;
      A10729RcNcFo = "" ;
      n10729RcNcFo = false ;
      A10730RcNcVI = DecimalUtil.ZERO ;
      n10730RcNcVI = false ;
      A10731RcNcV1 = DecimalUtil.ZERO ;
      n10731RcNcV1 = false ;
      A10732RcNcV2 = DecimalUtil.ZERO ;
      n10732RcNcV2 = false ;
      A10733RcNcOb = "" ;
      n10733RcNcOb = false ;
      A10734RcNcCm = "" ;
      n10734RcNcCm = false ;
      A10816RcNcE = (byte)(0) ;
      n10816RcNcE = false ;
      A10847RcNcKgH = DecimalUtil.ZERO ;
      n10847RcNcKgH = false ;
      Z10718RcNcHd = 0 ;
      Z10719RcNcR = (byte)(0) ;
      Z10720RcNcP = "" ;
      Z10721RcNcHdO = 0 ;
      Z10722RcNcRO = (byte)(0) ;
      Z10723RcNcPO = "" ;
      Z10724RcNcRef = "" ;
      Z10725RcNcN1 = 0 ;
      Z10726RcNcN2 = 0 ;
      Z10727RcNcDc = "" ;
      Z10728RcNcGR = 0 ;
      Z10729RcNcFo = "" ;
      Z10730RcNcVI = DecimalUtil.ZERO ;
      Z10731RcNcV1 = DecimalUtil.ZERO ;
      Z10732RcNcV2 = DecimalUtil.ZERO ;
      Z10733RcNcOb = "" ;
      Z10734RcNcCm = "" ;
      Z10816RcNcE = (byte)(0) ;
      Z10847RcNcKgH = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
      Z833TipDefCod = (short)(0) ;
   }

   public void initAll18X1428( )
   {
      A10717RcNcLin = 0 ;
      initializeNonKey18X1428( ) ;
   }

   public void standaloneModalInsert18X1428( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555777", true, true);
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
      httpContext.AddJavascriptSource("trcnc00.js", "?20268241555777", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1428( )
   {
      edtRcNcLin_Enabled = defedtRcNcLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1428, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1428_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10717RcNcLin, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10718RcNcHd, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10719RcNcR, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10720RcNcP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10721RcNcHdO, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcHdO_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10722RcNcRO, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRO_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10723RcNcPO));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcPO_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A834TipDefDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10724RcNcRef));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10725RcNcN1, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10726RcNcN2, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcN2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10727RcNcDc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcDc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10728RcNcGR, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcGR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10729RcNcFo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10730RcNcVI, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcVI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10731RcNcV1, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10732RcNcV2, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10733RcNcOb);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcOb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10734RcNcCm);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcCm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10735RcNcV3, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10816RcNcE, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10847RcNcKgH, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcKgH_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtRcNcFec_Internalname = "RCNCFEC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtRcNcUlt_Internalname = "RCNCULT" ;
      edtavnRcdDeleted_1428_Internalname = "vNRCDDELETED_1428" ;
      edtRcNcLin_Internalname = "RCNCLIN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtRcNcHd_Internalname = "RCNCHD" ;
      edtRcNcR_Internalname = "RCNCR" ;
      edtRcNcP_Internalname = "RCNCP" ;
      edtRcNcHdO_Internalname = "RCNCHDO" ;
      edtRcNcRO_Internalname = "RCNCRO" ;
      edtRcNcPO_Internalname = "RCNCPO" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
      edtRcNcRef_Internalname = "RCNCREF" ;
      edtRcNcN1_Internalname = "RCNCN1" ;
      edtRcNcN2_Internalname = "RCNCN2" ;
      edtRcNcDc_Internalname = "RCNCDC" ;
      edtRcNcGR_Internalname = "RCNCGR" ;
      edtRcNcFo_Internalname = "RCNCFO" ;
      edtRcNcVI_Internalname = "RCNCVI" ;
      edtRcNcV1_Internalname = "RCNCV1" ;
      edtRcNcV2_Internalname = "RCNCV2" ;
      edtRcNcOb_Internalname = "RCNCOB" ;
      edtRcNcCm_Internalname = "RCNCCM" ;
      edtRcNcV3_Internalname = "RCNCV3" ;
      edtRcNcE_Internalname = "RCNCE" ;
      edtRcNcKgH_Internalname = "RCNCKGH" ;
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
      Form.setCaption( httpContext.getMessage( "NOTAS CREDITO - RECLAMACIONES", "") );
      edtRcNcKgH_Jsonclick = "" ;
      edtRcNcE_Jsonclick = "" ;
      edtRcNcV3_Jsonclick = "" ;
      edtRcNcCm_Jsonclick = "" ;
      edtRcNcOb_Jsonclick = "" ;
      edtRcNcV2_Jsonclick = "" ;
      edtRcNcV1_Jsonclick = "" ;
      edtRcNcVI_Jsonclick = "" ;
      edtRcNcFo_Jsonclick = "" ;
      edtRcNcGR_Jsonclick = "" ;
      edtRcNcDc_Jsonclick = "" ;
      edtRcNcN2_Jsonclick = "" ;
      edtRcNcN1_Jsonclick = "" ;
      edtRcNcRef_Jsonclick = "" ;
      edtTipDefDsc_Jsonclick = "" ;
      edtTipDefCod_Jsonclick = "" ;
      edtRcNcPO_Jsonclick = "" ;
      edtRcNcRO_Jsonclick = "" ;
      edtRcNcHdO_Jsonclick = "" ;
      edtRcNcP_Jsonclick = "" ;
      edtRcNcR_Jsonclick = "" ;
      edtRcNcHd_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtRcNcLin_Jsonclick = "" ;
      edtavnRcdDeleted_1428_Jsonclick = "" ;
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
      edtRcNcKgH_Enabled = 1 ;
      edtRcNcE_Enabled = 1 ;
      edtRcNcV3_Enabled = 0 ;
      edtRcNcCm_Enabled = 1 ;
      edtRcNcOb_Enabled = 1 ;
      edtRcNcV2_Enabled = 1 ;
      edtRcNcV1_Enabled = 1 ;
      edtRcNcVI_Enabled = 1 ;
      edtRcNcFo_Enabled = 1 ;
      edtRcNcGR_Enabled = 1 ;
      edtRcNcDc_Enabled = 1 ;
      edtRcNcN2_Enabled = 1 ;
      edtRcNcN1_Enabled = 1 ;
      edtRcNcRef_Enabled = 1 ;
      edtTipDefDsc_Enabled = 0 ;
      edtTipDefCod_Enabled = 1 ;
      edtRcNcPO_Enabled = 1 ;
      edtRcNcRO_Enabled = 1 ;
      edtRcNcHdO_Enabled = 1 ;
      edtRcNcP_Enabled = 1 ;
      edtRcNcR_Enabled = 1 ;
      edtRcNcHd_Enabled = 1 ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Enabled = 1 ;
      edtRcNcLin_Enabled = 1 ;
      edtavnRcdDeleted_1428_Enabled = 1 ;
      edtRcNcUlt_Jsonclick = "" ;
      edtRcNcUlt_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcUlt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRcNcFec_Jsonclick = "" ;
      edtRcNcFec_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcFec_Enabled = 1 ;
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
      subsflControlProps_401428( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18X1428( ) ;
         standaloneModal18X1428( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18X1428( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401428( ) ;
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
      /* Using cursor T018X29 */
      pr_default.execute(27, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018X29_A407EmprNom[0] ;
      n407EmprNom = T018X29_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(27);
      GX_FocusControl = edtRcNcUlt_Internalname ;
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

   public void valid_Rcncfec( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10716RcNcUlt", GXutil.ltrim( localUtil.ntoc( A10716RcNcUlt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10715RcNcFec", localUtil.format(Z10715RcNcFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10716RcNcUlt", GXutil.ltrim( localUtil.ntoc( Z10716RcNcUlt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T018X25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T018X25_A279CliNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Tipdefcod( )
   {
      n833TipDefCod = false ;
      n834TipDefDsc = false ;
      /* Using cursor T018X26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
      }
      A834TipDefDsc = T018X26_A834TipDefDsc[0] ;
      n834TipDefDsc = T018X26_n834TipDefDsc[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
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
      setEventMetadata("VALID_RCNCFEC","{handler:'valid_Rcncfec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10715RcNcFec',fld:'RCNCFEC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RCNCFEC",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10716RcNcUlt',fld:'RCNCULT',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10715RcNcFec'},{av:'Z407EmprNom'},{av:'Z10716RcNcUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RCNCLIN","{handler:'valid_Rcnclin',iparms:[]");
      setEventMetadata("VALID_RCNCLIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''}]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''}]}");
      setEventMetadata("VALID_RCNCVI","{handler:'valid_Rcncvi',iparms:[]");
      setEventMetadata("VALID_RCNCVI",",oparms:[]}");
      setEventMetadata("VALID_RCNCV1","{handler:'valid_Rcncv1',iparms:[]");
      setEventMetadata("VALID_RCNCV1",",oparms:[]}");
      setEventMetadata("VALID_RCNCV2","{handler:'valid_Rcncv2',iparms:[]");
      setEventMetadata("VALID_RCNCV2",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Rcnckgh',iparms:[]");
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
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10715RcNcFec = GXutil.nullDate() ;
      Z10720RcNcP = "" ;
      Z10723RcNcPO = "" ;
      Z10724RcNcRef = "" ;
      Z10727RcNcDc = "" ;
      Z10729RcNcFo = "" ;
      Z10730RcNcVI = DecimalUtil.ZERO ;
      Z10731RcNcV1 = DecimalUtil.ZERO ;
      Z10732RcNcV2 = DecimalUtil.ZERO ;
      Z10733RcNcOb = "" ;
      Z10734RcNcCm = "" ;
      Z10847RcNcKgH = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A10715RcNcFec = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1428 = "" ;
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
      sMode1427 = "" ;
      GXCCtl = "" ;
      A279CliNom = "" ;
      A10720RcNcP = "" ;
      A10723RcNcPO = "" ;
      A834TipDefDsc = "" ;
      A10724RcNcRef = "" ;
      A10727RcNcDc = "" ;
      A10729RcNcFo = "" ;
      A10730RcNcVI = DecimalUtil.ZERO ;
      A10731RcNcV1 = DecimalUtil.ZERO ;
      A10732RcNcV2 = DecimalUtil.ZERO ;
      A10733RcNcOb = "" ;
      A10734RcNcCm = "" ;
      A10735RcNcV3 = DecimalUtil.ZERO ;
      A10847RcNcKgH = DecimalUtil.ZERO ;
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
      T018X8_A407EmprNom = new String[] {""} ;
      T018X8_n407EmprNom = new boolean[] {false} ;
      T018X9_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X9_A407EmprNom = new String[] {""} ;
      T018X9_n407EmprNom = new boolean[] {false} ;
      T018X9_A10716RcNcUlt = new int[1] ;
      T018X9_n10716RcNcUlt = new boolean[] {false} ;
      T018X9_A396EmprCod = new String[] {""} ;
      T018X10_A396EmprCod = new String[] {""} ;
      T018X10_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X7_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X7_A10716RcNcUlt = new int[1] ;
      T018X7_n10716RcNcUlt = new boolean[] {false} ;
      T018X7_A396EmprCod = new String[] {""} ;
      T018X11_A396EmprCod = new String[] {""} ;
      T018X11_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X12_A396EmprCod = new String[] {""} ;
      T018X12_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X6_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X6_A10716RcNcUlt = new int[1] ;
      T018X6_n10716RcNcUlt = new boolean[] {false} ;
      T018X6_A396EmprCod = new String[] {""} ;
      T018X16_A396EmprCod = new String[] {""} ;
      T018X16_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X16_A10717RcNcLin = new int[1] ;
      T018X16_A10813RcNcGrn = new long[1] ;
      T018X17_A396EmprCod = new String[] {""} ;
      T018X17_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      Z279CliNom = "" ;
      Z834TipDefDsc = "" ;
      T018X18_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X18_A10717RcNcLin = new int[1] ;
      T018X18_A279CliNom = new String[] {""} ;
      T018X18_A10718RcNcHd = new int[1] ;
      T018X18_n10718RcNcHd = new boolean[] {false} ;
      T018X18_A10719RcNcR = new byte[1] ;
      T018X18_n10719RcNcR = new boolean[] {false} ;
      T018X18_A10720RcNcP = new String[] {""} ;
      T018X18_n10720RcNcP = new boolean[] {false} ;
      T018X18_A10721RcNcHdO = new int[1] ;
      T018X18_n10721RcNcHdO = new boolean[] {false} ;
      T018X18_A10722RcNcRO = new byte[1] ;
      T018X18_n10722RcNcRO = new boolean[] {false} ;
      T018X18_A10723RcNcPO = new String[] {""} ;
      T018X18_n10723RcNcPO = new boolean[] {false} ;
      T018X18_A834TipDefDsc = new String[] {""} ;
      T018X18_n834TipDefDsc = new boolean[] {false} ;
      T018X18_A10724RcNcRef = new String[] {""} ;
      T018X18_n10724RcNcRef = new boolean[] {false} ;
      T018X18_A10725RcNcN1 = new int[1] ;
      T018X18_n10725RcNcN1 = new boolean[] {false} ;
      T018X18_A10726RcNcN2 = new int[1] ;
      T018X18_n10726RcNcN2 = new boolean[] {false} ;
      T018X18_A10727RcNcDc = new String[] {""} ;
      T018X18_n10727RcNcDc = new boolean[] {false} ;
      T018X18_A10728RcNcGR = new long[1] ;
      T018X18_n10728RcNcGR = new boolean[] {false} ;
      T018X18_A10729RcNcFo = new String[] {""} ;
      T018X18_n10729RcNcFo = new boolean[] {false} ;
      T018X18_A10730RcNcVI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X18_n10730RcNcVI = new boolean[] {false} ;
      T018X18_A10731RcNcV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X18_n10731RcNcV1 = new boolean[] {false} ;
      T018X18_A10732RcNcV2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X18_n10732RcNcV2 = new boolean[] {false} ;
      T018X18_A10733RcNcOb = new String[] {""} ;
      T018X18_n10733RcNcOb = new boolean[] {false} ;
      T018X18_A10734RcNcCm = new String[] {""} ;
      T018X18_n10734RcNcCm = new boolean[] {false} ;
      T018X18_A10816RcNcE = new byte[1] ;
      T018X18_n10816RcNcE = new boolean[] {false} ;
      T018X18_A10847RcNcKgH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X18_n10847RcNcKgH = new boolean[] {false} ;
      T018X18_A396EmprCod = new String[] {""} ;
      T018X18_A252CliCod = new int[1] ;
      T018X18_n252CliCod = new boolean[] {false} ;
      T018X18_A833TipDefCod = new short[1] ;
      T018X18_n833TipDefCod = new boolean[] {false} ;
      T018X4_A279CliNom = new String[] {""} ;
      T018X5_A834TipDefDsc = new String[] {""} ;
      T018X5_n834TipDefDsc = new boolean[] {false} ;
      T018X19_A279CliNom = new String[] {""} ;
      T018X20_A834TipDefDsc = new String[] {""} ;
      T018X20_n834TipDefDsc = new boolean[] {false} ;
      T018X21_A396EmprCod = new String[] {""} ;
      T018X21_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X21_A10717RcNcLin = new int[1] ;
      T018X3_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X3_A10717RcNcLin = new int[1] ;
      T018X3_A10718RcNcHd = new int[1] ;
      T018X3_n10718RcNcHd = new boolean[] {false} ;
      T018X3_A10719RcNcR = new byte[1] ;
      T018X3_n10719RcNcR = new boolean[] {false} ;
      T018X3_A10720RcNcP = new String[] {""} ;
      T018X3_n10720RcNcP = new boolean[] {false} ;
      T018X3_A10721RcNcHdO = new int[1] ;
      T018X3_n10721RcNcHdO = new boolean[] {false} ;
      T018X3_A10722RcNcRO = new byte[1] ;
      T018X3_n10722RcNcRO = new boolean[] {false} ;
      T018X3_A10723RcNcPO = new String[] {""} ;
      T018X3_n10723RcNcPO = new boolean[] {false} ;
      T018X3_A10724RcNcRef = new String[] {""} ;
      T018X3_n10724RcNcRef = new boolean[] {false} ;
      T018X3_A10725RcNcN1 = new int[1] ;
      T018X3_n10725RcNcN1 = new boolean[] {false} ;
      T018X3_A10726RcNcN2 = new int[1] ;
      T018X3_n10726RcNcN2 = new boolean[] {false} ;
      T018X3_A10727RcNcDc = new String[] {""} ;
      T018X3_n10727RcNcDc = new boolean[] {false} ;
      T018X3_A10728RcNcGR = new long[1] ;
      T018X3_n10728RcNcGR = new boolean[] {false} ;
      T018X3_A10729RcNcFo = new String[] {""} ;
      T018X3_n10729RcNcFo = new boolean[] {false} ;
      T018X3_A10730RcNcVI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X3_n10730RcNcVI = new boolean[] {false} ;
      T018X3_A10731RcNcV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X3_n10731RcNcV1 = new boolean[] {false} ;
      T018X3_A10732RcNcV2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X3_n10732RcNcV2 = new boolean[] {false} ;
      T018X3_A10733RcNcOb = new String[] {""} ;
      T018X3_n10733RcNcOb = new boolean[] {false} ;
      T018X3_A10734RcNcCm = new String[] {""} ;
      T018X3_n10734RcNcCm = new boolean[] {false} ;
      T018X3_A10816RcNcE = new byte[1] ;
      T018X3_n10816RcNcE = new boolean[] {false} ;
      T018X3_A10847RcNcKgH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X3_n10847RcNcKgH = new boolean[] {false} ;
      T018X3_A396EmprCod = new String[] {""} ;
      T018X3_A252CliCod = new int[1] ;
      T018X3_n252CliCod = new boolean[] {false} ;
      T018X3_A833TipDefCod = new short[1] ;
      T018X3_n833TipDefCod = new boolean[] {false} ;
      T018X2_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X2_A10717RcNcLin = new int[1] ;
      T018X2_A10718RcNcHd = new int[1] ;
      T018X2_n10718RcNcHd = new boolean[] {false} ;
      T018X2_A10719RcNcR = new byte[1] ;
      T018X2_n10719RcNcR = new boolean[] {false} ;
      T018X2_A10720RcNcP = new String[] {""} ;
      T018X2_n10720RcNcP = new boolean[] {false} ;
      T018X2_A10721RcNcHdO = new int[1] ;
      T018X2_n10721RcNcHdO = new boolean[] {false} ;
      T018X2_A10722RcNcRO = new byte[1] ;
      T018X2_n10722RcNcRO = new boolean[] {false} ;
      T018X2_A10723RcNcPO = new String[] {""} ;
      T018X2_n10723RcNcPO = new boolean[] {false} ;
      T018X2_A10724RcNcRef = new String[] {""} ;
      T018X2_n10724RcNcRef = new boolean[] {false} ;
      T018X2_A10725RcNcN1 = new int[1] ;
      T018X2_n10725RcNcN1 = new boolean[] {false} ;
      T018X2_A10726RcNcN2 = new int[1] ;
      T018X2_n10726RcNcN2 = new boolean[] {false} ;
      T018X2_A10727RcNcDc = new String[] {""} ;
      T018X2_n10727RcNcDc = new boolean[] {false} ;
      T018X2_A10728RcNcGR = new long[1] ;
      T018X2_n10728RcNcGR = new boolean[] {false} ;
      T018X2_A10729RcNcFo = new String[] {""} ;
      T018X2_n10729RcNcFo = new boolean[] {false} ;
      T018X2_A10730RcNcVI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X2_n10730RcNcVI = new boolean[] {false} ;
      T018X2_A10731RcNcV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X2_n10731RcNcV1 = new boolean[] {false} ;
      T018X2_A10732RcNcV2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X2_n10732RcNcV2 = new boolean[] {false} ;
      T018X2_A10733RcNcOb = new String[] {""} ;
      T018X2_n10733RcNcOb = new boolean[] {false} ;
      T018X2_A10734RcNcCm = new String[] {""} ;
      T018X2_n10734RcNcCm = new boolean[] {false} ;
      T018X2_A10816RcNcE = new byte[1] ;
      T018X2_n10816RcNcE = new boolean[] {false} ;
      T018X2_A10847RcNcKgH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018X2_n10847RcNcKgH = new boolean[] {false} ;
      T018X2_A396EmprCod = new String[] {""} ;
      T018X2_A252CliCod = new int[1] ;
      T018X2_n252CliCod = new boolean[] {false} ;
      T018X2_A833TipDefCod = new short[1] ;
      T018X2_n833TipDefCod = new boolean[] {false} ;
      T018X25_A279CliNom = new String[] {""} ;
      T018X26_A834TipDefDsc = new String[] {""} ;
      T018X26_n834TipDefDsc = new boolean[] {false} ;
      T018X27_A396EmprCod = new String[] {""} ;
      T018X27_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X27_A10717RcNcLin = new int[1] ;
      T018X27_A10813RcNcGrn = new long[1] ;
      T018X28_A396EmprCod = new String[] {""} ;
      T018X28_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T018X28_A10717RcNcLin = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018X29_A407EmprNom = new String[] {""} ;
      T018X29_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10715RcNcFec = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trcnc00__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trcnc00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trcnc00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trcnc00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trcnc00__default(),
         new Object[] {
             new Object[] {
            T018X2_A10715RcNcFec, T018X2_A10717RcNcLin, T018X2_A10718RcNcHd, T018X2_n10718RcNcHd, T018X2_A10719RcNcR, T018X2_n10719RcNcR, T018X2_A10720RcNcP, T018X2_n10720RcNcP, T018X2_A10721RcNcHdO, T018X2_n10721RcNcHdO,
            T018X2_A10722RcNcRO, T018X2_n10722RcNcRO, T018X2_A10723RcNcPO, T018X2_n10723RcNcPO, T018X2_A10724RcNcRef, T018X2_n10724RcNcRef, T018X2_A10725RcNcN1, T018X2_n10725RcNcN1, T018X2_A10726RcNcN2, T018X2_n10726RcNcN2,
            T018X2_A10727RcNcDc, T018X2_n10727RcNcDc, T018X2_A10728RcNcGR, T018X2_n10728RcNcGR, T018X2_A10729RcNcFo, T018X2_n10729RcNcFo, T018X2_A10730RcNcVI, T018X2_n10730RcNcVI, T018X2_A10731RcNcV1, T018X2_n10731RcNcV1,
            T018X2_A10732RcNcV2, T018X2_n10732RcNcV2, T018X2_A10733RcNcOb, T018X2_n10733RcNcOb, T018X2_A10734RcNcCm, T018X2_n10734RcNcCm, T018X2_A10816RcNcE, T018X2_n10816RcNcE, T018X2_A10847RcNcKgH, T018X2_n10847RcNcKgH,
            T018X2_A396EmprCod, T018X2_A252CliCod, T018X2_n252CliCod, T018X2_A833TipDefCod, T018X2_n833TipDefCod
            }
            , new Object[] {
            T018X3_A10715RcNcFec, T018X3_A10717RcNcLin, T018X3_A10718RcNcHd, T018X3_n10718RcNcHd, T018X3_A10719RcNcR, T018X3_n10719RcNcR, T018X3_A10720RcNcP, T018X3_n10720RcNcP, T018X3_A10721RcNcHdO, T018X3_n10721RcNcHdO,
            T018X3_A10722RcNcRO, T018X3_n10722RcNcRO, T018X3_A10723RcNcPO, T018X3_n10723RcNcPO, T018X3_A10724RcNcRef, T018X3_n10724RcNcRef, T018X3_A10725RcNcN1, T018X3_n10725RcNcN1, T018X3_A10726RcNcN2, T018X3_n10726RcNcN2,
            T018X3_A10727RcNcDc, T018X3_n10727RcNcDc, T018X3_A10728RcNcGR, T018X3_n10728RcNcGR, T018X3_A10729RcNcFo, T018X3_n10729RcNcFo, T018X3_A10730RcNcVI, T018X3_n10730RcNcVI, T018X3_A10731RcNcV1, T018X3_n10731RcNcV1,
            T018X3_A10732RcNcV2, T018X3_n10732RcNcV2, T018X3_A10733RcNcOb, T018X3_n10733RcNcOb, T018X3_A10734RcNcCm, T018X3_n10734RcNcCm, T018X3_A10816RcNcE, T018X3_n10816RcNcE, T018X3_A10847RcNcKgH, T018X3_n10847RcNcKgH,
            T018X3_A396EmprCod, T018X3_A252CliCod, T018X3_n252CliCod, T018X3_A833TipDefCod, T018X3_n833TipDefCod
            }
            , new Object[] {
            T018X4_A279CliNom
            }
            , new Object[] {
            T018X5_A834TipDefDsc, T018X5_n834TipDefDsc
            }
            , new Object[] {
            T018X6_A10715RcNcFec, T018X6_A10716RcNcUlt, T018X6_n10716RcNcUlt, T018X6_A396EmprCod
            }
            , new Object[] {
            T018X7_A10715RcNcFec, T018X7_A10716RcNcUlt, T018X7_n10716RcNcUlt, T018X7_A396EmprCod
            }
            , new Object[] {
            T018X8_A407EmprNom, T018X8_n407EmprNom
            }
            , new Object[] {
            T018X9_A10715RcNcFec, T018X9_A407EmprNom, T018X9_n407EmprNom, T018X9_A10716RcNcUlt, T018X9_n10716RcNcUlt, T018X9_A396EmprCod
            }
            , new Object[] {
            T018X10_A396EmprCod, T018X10_A10715RcNcFec
            }
            , new Object[] {
            T018X11_A396EmprCod, T018X11_A10715RcNcFec
            }
            , new Object[] {
            T018X12_A396EmprCod, T018X12_A10715RcNcFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018X16_A396EmprCod, T018X16_A10715RcNcFec, T018X16_A10717RcNcLin, T018X16_A10813RcNcGrn
            }
            , new Object[] {
            T018X17_A396EmprCod, T018X17_A10715RcNcFec
            }
            , new Object[] {
            T018X18_A10715RcNcFec, T018X18_A10717RcNcLin, T018X18_A279CliNom, T018X18_A10718RcNcHd, T018X18_n10718RcNcHd, T018X18_A10719RcNcR, T018X18_n10719RcNcR, T018X18_A10720RcNcP, T018X18_n10720RcNcP, T018X18_A10721RcNcHdO,
            T018X18_n10721RcNcHdO, T018X18_A10722RcNcRO, T018X18_n10722RcNcRO, T018X18_A10723RcNcPO, T018X18_n10723RcNcPO, T018X18_A834TipDefDsc, T018X18_n834TipDefDsc, T018X18_A10724RcNcRef, T018X18_n10724RcNcRef, T018X18_A10725RcNcN1,
            T018X18_n10725RcNcN1, T018X18_A10726RcNcN2, T018X18_n10726RcNcN2, T018X18_A10727RcNcDc, T018X18_n10727RcNcDc, T018X18_A10728RcNcGR, T018X18_n10728RcNcGR, T018X18_A10729RcNcFo, T018X18_n10729RcNcFo, T018X18_A10730RcNcVI,
            T018X18_n10730RcNcVI, T018X18_A10731RcNcV1, T018X18_n10731RcNcV1, T018X18_A10732RcNcV2, T018X18_n10732RcNcV2, T018X18_A10733RcNcOb, T018X18_n10733RcNcOb, T018X18_A10734RcNcCm, T018X18_n10734RcNcCm, T018X18_A10816RcNcE,
            T018X18_n10816RcNcE, T018X18_A10847RcNcKgH, T018X18_n10847RcNcKgH, T018X18_A396EmprCod, T018X18_A252CliCod, T018X18_n252CliCod, T018X18_A833TipDefCod, T018X18_n833TipDefCod
            }
            , new Object[] {
            T018X19_A279CliNom
            }
            , new Object[] {
            T018X20_A834TipDefDsc, T018X20_n834TipDefDsc
            }
            , new Object[] {
            T018X21_A396EmprCod, T018X21_A10715RcNcFec, T018X21_A10717RcNcLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018X25_A279CliNom
            }
            , new Object[] {
            T018X26_A834TipDefDsc, T018X26_n834TipDefDsc
            }
            , new Object[] {
            T018X27_A396EmprCod, T018X27_A10715RcNcFec, T018X27_A10717RcNcLin, T018X27_A10813RcNcGrn
            }
            , new Object[] {
            T018X28_A396EmprCod, T018X28_A10715RcNcFec, T018X28_A10717RcNcLin
            }
            , new Object[] {
            T018X29_A407EmprNom, T018X29_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TRCNC00" ;
   }

   private byte Z10719RcNcR ;
   private byte Z10722RcNcRO ;
   private byte Z10816RcNcE ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10719RcNcR ;
   private byte A10722RcNcRO ;
   private byte A10816RcNcE ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z833TipDefCod ;
   private short nRcdDeleted_1428 ;
   private short nRcdExists_1428 ;
   private short nIsMod_1428 ;
   private short A833TipDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1428 ;
   private short RcdFound1428 ;
   private short nBlankRcdUsr1428 ;
   private short RcdFound1427 ;
   private short nIsDirty_1427 ;
   private short nIsDirty_1428 ;
   private int Z10716RcNcUlt ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z10717RcNcLin ;
   private int Z10718RcNcHd ;
   private int Z10721RcNcHdO ;
   private int Z10725RcNcN1 ;
   private int Z10726RcNcN2 ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtRcNcFec_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A10716RcNcUlt ;
   private int edtRcNcUlt_Enabled ;
   private int edtavnRcdDeleted_1428_Enabled ;
   private int edtRcNcLin_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtRcNcHd_Enabled ;
   private int edtRcNcR_Enabled ;
   private int edtRcNcP_Enabled ;
   private int edtRcNcHdO_Enabled ;
   private int edtRcNcRO_Enabled ;
   private int edtRcNcPO_Enabled ;
   private int edtTipDefCod_Enabled ;
   private int edtTipDefDsc_Enabled ;
   private int edtRcNcRef_Enabled ;
   private int edtRcNcN1_Enabled ;
   private int edtRcNcN2_Enabled ;
   private int edtRcNcDc_Enabled ;
   private int edtRcNcGR_Enabled ;
   private int edtRcNcFo_Enabled ;
   private int edtRcNcVI_Enabled ;
   private int edtRcNcV1_Enabled ;
   private int edtRcNcV2_Enabled ;
   private int edtRcNcOb_Enabled ;
   private int edtRcNcCm_Enabled ;
   private int edtRcNcV3_Enabled ;
   private int edtRcNcE_Enabled ;
   private int edtRcNcKgH_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10717RcNcLin ;
   private int A10718RcNcHd ;
   private int A10721RcNcHdO ;
   private int A10725RcNcN1 ;
   private int A10726RcNcN2 ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtRcNcLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtRcNcUlt_Backcolor ;
   private int edtRcNcFec_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10716RcNcUlt ;
   private long Z10728RcNcGR ;
   private long GRID1_nFirstRecordOnPage ;
   private long A10728RcNcGR ;
   private java.math.BigDecimal Z10730RcNcVI ;
   private java.math.BigDecimal Z10731RcNcV1 ;
   private java.math.BigDecimal Z10732RcNcV2 ;
   private java.math.BigDecimal Z10847RcNcKgH ;
   private java.math.BigDecimal A10730RcNcVI ;
   private java.math.BigDecimal A10731RcNcV1 ;
   private java.math.BigDecimal A10732RcNcV2 ;
   private java.math.BigDecimal A10735RcNcV3 ;
   private java.math.BigDecimal A10847RcNcKgH ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10720RcNcP ;
   private String Z10723RcNcPO ;
   private String Z10724RcNcRef ;
   private String Z10727RcNcDc ;
   private String Z10729RcNcFo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRcNcFec_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtRcNcFec_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtRcNcUlt_Internalname ;
   private String edtRcNcUlt_Jsonclick ;
   private String sMode1428 ;
   private String edtavnRcdDeleted_1428_Internalname ;
   private String edtRcNcLin_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtRcNcHd_Internalname ;
   private String edtRcNcR_Internalname ;
   private String edtRcNcP_Internalname ;
   private String edtRcNcHdO_Internalname ;
   private String edtRcNcRO_Internalname ;
   private String edtRcNcPO_Internalname ;
   private String edtTipDefCod_Internalname ;
   private String edtTipDefDsc_Internalname ;
   private String edtRcNcRef_Internalname ;
   private String edtRcNcN1_Internalname ;
   private String edtRcNcN2_Internalname ;
   private String edtRcNcDc_Internalname ;
   private String edtRcNcGR_Internalname ;
   private String edtRcNcFo_Internalname ;
   private String edtRcNcVI_Internalname ;
   private String edtRcNcV1_Internalname ;
   private String edtRcNcV2_Internalname ;
   private String edtRcNcOb_Internalname ;
   private String edtRcNcCm_Internalname ;
   private String edtRcNcV3_Internalname ;
   private String edtRcNcE_Internalname ;
   private String edtRcNcKgH_Internalname ;
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
   private String sMode1427 ;
   private String GXCCtl ;
   private String A279CliNom ;
   private String A10720RcNcP ;
   private String A10723RcNcPO ;
   private String A834TipDefDsc ;
   private String A10724RcNcRef ;
   private String A10727RcNcDc ;
   private String A10729RcNcFo ;
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
   private String Z279CliNom ;
   private String Z834TipDefDsc ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1428_Jsonclick ;
   private String edtRcNcLin_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtRcNcHd_Jsonclick ;
   private String edtRcNcR_Jsonclick ;
   private String edtRcNcP_Jsonclick ;
   private String edtRcNcHdO_Jsonclick ;
   private String edtRcNcRO_Jsonclick ;
   private String edtRcNcPO_Jsonclick ;
   private String edtTipDefCod_Jsonclick ;
   private String edtTipDefDsc_Jsonclick ;
   private String edtRcNcRef_Jsonclick ;
   private String edtRcNcN1_Jsonclick ;
   private String edtRcNcN2_Jsonclick ;
   private String edtRcNcDc_Jsonclick ;
   private String edtRcNcGR_Jsonclick ;
   private String edtRcNcFo_Jsonclick ;
   private String edtRcNcVI_Jsonclick ;
   private String edtRcNcV1_Jsonclick ;
   private String edtRcNcV2_Jsonclick ;
   private String edtRcNcOb_Jsonclick ;
   private String edtRcNcCm_Jsonclick ;
   private String edtRcNcV3_Jsonclick ;
   private String edtRcNcE_Jsonclick ;
   private String edtRcNcKgH_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z10715RcNcFec ;
   private java.util.Date A10715RcNcFec ;
   private java.util.Date ZZ10715RcNcFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10716RcNcUlt ;
   private boolean returnInSub ;
   private boolean n10718RcNcHd ;
   private boolean n10719RcNcR ;
   private boolean n10720RcNcP ;
   private boolean n10721RcNcHdO ;
   private boolean n10722RcNcRO ;
   private boolean n10723RcNcPO ;
   private boolean n834TipDefDsc ;
   private boolean n10724RcNcRef ;
   private boolean n10725RcNcN1 ;
   private boolean n10726RcNcN2 ;
   private boolean n10727RcNcDc ;
   private boolean n10728RcNcGR ;
   private boolean n10729RcNcFo ;
   private boolean n10730RcNcVI ;
   private boolean n10731RcNcV1 ;
   private boolean n10732RcNcV2 ;
   private boolean n10733RcNcOb ;
   private boolean n10734RcNcCm ;
   private boolean n10816RcNcE ;
   private boolean n10847RcNcKgH ;
   private boolean Gx_longc ;
   private String Z10733RcNcOb ;
   private String Z10734RcNcCm ;
   private String A10733RcNcOb ;
   private String A10734RcNcCm ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018X8_A407EmprNom ;
   private boolean[] T018X8_n407EmprNom ;
   private java.util.Date[] T018X9_A10715RcNcFec ;
   private String[] T018X9_A407EmprNom ;
   private boolean[] T018X9_n407EmprNom ;
   private int[] T018X9_A10716RcNcUlt ;
   private boolean[] T018X9_n10716RcNcUlt ;
   private String[] T018X9_A396EmprCod ;
   private String[] T018X10_A396EmprCod ;
   private java.util.Date[] T018X10_A10715RcNcFec ;
   private java.util.Date[] T018X7_A10715RcNcFec ;
   private int[] T018X7_A10716RcNcUlt ;
   private boolean[] T018X7_n10716RcNcUlt ;
   private String[] T018X7_A396EmprCod ;
   private String[] T018X11_A396EmprCod ;
   private java.util.Date[] T018X11_A10715RcNcFec ;
   private String[] T018X12_A396EmprCod ;
   private java.util.Date[] T018X12_A10715RcNcFec ;
   private java.util.Date[] T018X6_A10715RcNcFec ;
   private int[] T018X6_A10716RcNcUlt ;
   private boolean[] T018X6_n10716RcNcUlt ;
   private String[] T018X6_A396EmprCod ;
   private String[] T018X16_A396EmprCod ;
   private java.util.Date[] T018X16_A10715RcNcFec ;
   private int[] T018X16_A10717RcNcLin ;
   private long[] T018X16_A10813RcNcGrn ;
   private String[] T018X17_A396EmprCod ;
   private java.util.Date[] T018X17_A10715RcNcFec ;
   private java.util.Date[] T018X18_A10715RcNcFec ;
   private int[] T018X18_A10717RcNcLin ;
   private String[] T018X18_A279CliNom ;
   private int[] T018X18_A10718RcNcHd ;
   private boolean[] T018X18_n10718RcNcHd ;
   private byte[] T018X18_A10719RcNcR ;
   private boolean[] T018X18_n10719RcNcR ;
   private String[] T018X18_A10720RcNcP ;
   private boolean[] T018X18_n10720RcNcP ;
   private int[] T018X18_A10721RcNcHdO ;
   private boolean[] T018X18_n10721RcNcHdO ;
   private byte[] T018X18_A10722RcNcRO ;
   private boolean[] T018X18_n10722RcNcRO ;
   private String[] T018X18_A10723RcNcPO ;
   private boolean[] T018X18_n10723RcNcPO ;
   private String[] T018X18_A834TipDefDsc ;
   private boolean[] T018X18_n834TipDefDsc ;
   private String[] T018X18_A10724RcNcRef ;
   private boolean[] T018X18_n10724RcNcRef ;
   private int[] T018X18_A10725RcNcN1 ;
   private boolean[] T018X18_n10725RcNcN1 ;
   private int[] T018X18_A10726RcNcN2 ;
   private boolean[] T018X18_n10726RcNcN2 ;
   private String[] T018X18_A10727RcNcDc ;
   private boolean[] T018X18_n10727RcNcDc ;
   private long[] T018X18_A10728RcNcGR ;
   private boolean[] T018X18_n10728RcNcGR ;
   private String[] T018X18_A10729RcNcFo ;
   private boolean[] T018X18_n10729RcNcFo ;
   private java.math.BigDecimal[] T018X18_A10730RcNcVI ;
   private boolean[] T018X18_n10730RcNcVI ;
   private java.math.BigDecimal[] T018X18_A10731RcNcV1 ;
   private boolean[] T018X18_n10731RcNcV1 ;
   private java.math.BigDecimal[] T018X18_A10732RcNcV2 ;
   private boolean[] T018X18_n10732RcNcV2 ;
   private String[] T018X18_A10733RcNcOb ;
   private boolean[] T018X18_n10733RcNcOb ;
   private String[] T018X18_A10734RcNcCm ;
   private boolean[] T018X18_n10734RcNcCm ;
   private byte[] T018X18_A10816RcNcE ;
   private boolean[] T018X18_n10816RcNcE ;
   private java.math.BigDecimal[] T018X18_A10847RcNcKgH ;
   private boolean[] T018X18_n10847RcNcKgH ;
   private String[] T018X18_A396EmprCod ;
   private int[] T018X18_A252CliCod ;
   private boolean[] T018X18_n252CliCod ;
   private short[] T018X18_A833TipDefCod ;
   private boolean[] T018X18_n833TipDefCod ;
   private String[] T018X4_A279CliNom ;
   private String[] T018X5_A834TipDefDsc ;
   private boolean[] T018X5_n834TipDefDsc ;
   private String[] T018X19_A279CliNom ;
   private String[] T018X20_A834TipDefDsc ;
   private boolean[] T018X20_n834TipDefDsc ;
   private String[] T018X21_A396EmprCod ;
   private java.util.Date[] T018X21_A10715RcNcFec ;
   private int[] T018X21_A10717RcNcLin ;
   private java.util.Date[] T018X3_A10715RcNcFec ;
   private int[] T018X3_A10717RcNcLin ;
   private int[] T018X3_A10718RcNcHd ;
   private boolean[] T018X3_n10718RcNcHd ;
   private byte[] T018X3_A10719RcNcR ;
   private boolean[] T018X3_n10719RcNcR ;
   private String[] T018X3_A10720RcNcP ;
   private boolean[] T018X3_n10720RcNcP ;
   private int[] T018X3_A10721RcNcHdO ;
   private boolean[] T018X3_n10721RcNcHdO ;
   private byte[] T018X3_A10722RcNcRO ;
   private boolean[] T018X3_n10722RcNcRO ;
   private String[] T018X3_A10723RcNcPO ;
   private boolean[] T018X3_n10723RcNcPO ;
   private String[] T018X3_A10724RcNcRef ;
   private boolean[] T018X3_n10724RcNcRef ;
   private int[] T018X3_A10725RcNcN1 ;
   private boolean[] T018X3_n10725RcNcN1 ;
   private int[] T018X3_A10726RcNcN2 ;
   private boolean[] T018X3_n10726RcNcN2 ;
   private String[] T018X3_A10727RcNcDc ;
   private boolean[] T018X3_n10727RcNcDc ;
   private long[] T018X3_A10728RcNcGR ;
   private boolean[] T018X3_n10728RcNcGR ;
   private String[] T018X3_A10729RcNcFo ;
   private boolean[] T018X3_n10729RcNcFo ;
   private java.math.BigDecimal[] T018X3_A10730RcNcVI ;
   private boolean[] T018X3_n10730RcNcVI ;
   private java.math.BigDecimal[] T018X3_A10731RcNcV1 ;
   private boolean[] T018X3_n10731RcNcV1 ;
   private java.math.BigDecimal[] T018X3_A10732RcNcV2 ;
   private boolean[] T018X3_n10732RcNcV2 ;
   private String[] T018X3_A10733RcNcOb ;
   private boolean[] T018X3_n10733RcNcOb ;
   private String[] T018X3_A10734RcNcCm ;
   private boolean[] T018X3_n10734RcNcCm ;
   private byte[] T018X3_A10816RcNcE ;
   private boolean[] T018X3_n10816RcNcE ;
   private java.math.BigDecimal[] T018X3_A10847RcNcKgH ;
   private boolean[] T018X3_n10847RcNcKgH ;
   private String[] T018X3_A396EmprCod ;
   private int[] T018X3_A252CliCod ;
   private boolean[] T018X3_n252CliCod ;
   private short[] T018X3_A833TipDefCod ;
   private boolean[] T018X3_n833TipDefCod ;
   private java.util.Date[] T018X2_A10715RcNcFec ;
   private int[] T018X2_A10717RcNcLin ;
   private int[] T018X2_A10718RcNcHd ;
   private boolean[] T018X2_n10718RcNcHd ;
   private byte[] T018X2_A10719RcNcR ;
   private boolean[] T018X2_n10719RcNcR ;
   private String[] T018X2_A10720RcNcP ;
   private boolean[] T018X2_n10720RcNcP ;
   private int[] T018X2_A10721RcNcHdO ;
   private boolean[] T018X2_n10721RcNcHdO ;
   private byte[] T018X2_A10722RcNcRO ;
   private boolean[] T018X2_n10722RcNcRO ;
   private String[] T018X2_A10723RcNcPO ;
   private boolean[] T018X2_n10723RcNcPO ;
   private String[] T018X2_A10724RcNcRef ;
   private boolean[] T018X2_n10724RcNcRef ;
   private int[] T018X2_A10725RcNcN1 ;
   private boolean[] T018X2_n10725RcNcN1 ;
   private int[] T018X2_A10726RcNcN2 ;
   private boolean[] T018X2_n10726RcNcN2 ;
   private String[] T018X2_A10727RcNcDc ;
   private boolean[] T018X2_n10727RcNcDc ;
   private long[] T018X2_A10728RcNcGR ;
   private boolean[] T018X2_n10728RcNcGR ;
   private String[] T018X2_A10729RcNcFo ;
   private boolean[] T018X2_n10729RcNcFo ;
   private java.math.BigDecimal[] T018X2_A10730RcNcVI ;
   private boolean[] T018X2_n10730RcNcVI ;
   private java.math.BigDecimal[] T018X2_A10731RcNcV1 ;
   private boolean[] T018X2_n10731RcNcV1 ;
   private java.math.BigDecimal[] T018X2_A10732RcNcV2 ;
   private boolean[] T018X2_n10732RcNcV2 ;
   private String[] T018X2_A10733RcNcOb ;
   private boolean[] T018X2_n10733RcNcOb ;
   private String[] T018X2_A10734RcNcCm ;
   private boolean[] T018X2_n10734RcNcCm ;
   private byte[] T018X2_A10816RcNcE ;
   private boolean[] T018X2_n10816RcNcE ;
   private java.math.BigDecimal[] T018X2_A10847RcNcKgH ;
   private boolean[] T018X2_n10847RcNcKgH ;
   private String[] T018X2_A396EmprCod ;
   private int[] T018X2_A252CliCod ;
   private boolean[] T018X2_n252CliCod ;
   private short[] T018X2_A833TipDefCod ;
   private boolean[] T018X2_n833TipDefCod ;
   private String[] T018X25_A279CliNom ;
   private String[] T018X26_A834TipDefDsc ;
   private boolean[] T018X26_n834TipDefDsc ;
   private String[] T018X27_A396EmprCod ;
   private java.util.Date[] T018X27_A10715RcNcFec ;
   private int[] T018X27_A10717RcNcLin ;
   private long[] T018X27_A10813RcNcGrn ;
   private String[] T018X28_A396EmprCod ;
   private java.util.Date[] T018X28_A10715RcNcFec ;
   private int[] T018X28_A10717RcNcLin ;
   private String[] T018X29_A407EmprNom ;
   private boolean[] T018X29_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trcnc00__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018X2", "SELECT RcNcFec, RcNcLin, RcNcHd, RcNcR, RcNcP, RcNcHdO, RcNcRO, RcNcPO, RcNcRef, RcNcN1, RcNcN2, RcNcDc, RcNcGR, RcNcFo, RcNcVI, RcNcV1, RcNcV2, RcNcOb, RcNcCm, RcNcE, RcNcKgH, EmprCod, CliCod, TipDefCod FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?  FOR UPDATE OF RcNcHd, RcNcR, RcNcP, RcNcHdO, RcNcRO, RcNcPO, RcNcRef, RcNcN1, RcNcN2, RcNcDc, RcNcGR, RcNcFo, RcNcVI, RcNcV1, RcNcV2, RcNcOb, RcNcCm, RcNcE, RcNcKgH, CliCod, TipDefCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X3", "SELECT RcNcFec, RcNcLin, RcNcHd, RcNcR, RcNcP, RcNcHdO, RcNcRO, RcNcPO, RcNcRef, RcNcN1, RcNcN2, RcNcDc, RcNcGR, RcNcFo, RcNcVI, RcNcV1, RcNcV2, RcNcOb, RcNcCm, RcNcE, RcNcKgH, EmprCod, CliCod, TipDefCod FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X4", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X5", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X6", "SELECT RcNcFec, RcNcUlt, EmprCod FROM TXPRCNC00 WHERE EmprCod = ? AND RcNcFec = ?  FOR UPDATE OF RcNcUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X7", "SELECT RcNcFec, RcNcUlt, EmprCod FROM TXPRCNC00 WHERE EmprCod = ? AND RcNcFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X9", "SELECT /*+ FIRST_ROWS(100) */ TM1.RcNcFec, T2.EmprNom, TM1.RcNcUlt, TM1.EmprCod FROM (TXPRCNC00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.RcNcFec = ? ORDER BY TM1.EmprCod, TM1.RcNcFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec FROM TXPRCNC00 WHERE EmprCod = ? AND RcNcFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec FROM TXPRCNC00 WHERE ( RcNcFec > ?) and EmprCod = ? ORDER BY EmprCod, RcNcFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018X12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec FROM TXPRCNC00 WHERE ( RcNcFec < ?) and EmprCod = ? ORDER BY EmprCod DESC, RcNcFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018X13", "INSERT INTO TXPRCNC00(RcNcFec, RcNcUlt, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPRCNC00")
         ,new UpdateCursor("T018X14", "UPDATE TXPRCNC00 SET RcNcUlt=?  WHERE EmprCod = ? AND RcNcFec = ?", GX_NOMASK, "TXPRCNC00")
         ,new UpdateCursor("T018X15", "DELETE FROM TXPRCNC00  WHERE EmprCod = ? AND RcNcFec = ?", GX_NOMASK, "TXPRCNC00")
         ,new ForEachCursor("T018X16", "SELECT * FROM (SELECT EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE EmprCod = ? AND RcNcFec = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018X17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, RcNcFec FROM TXPRCNC00 WHERE EmprCod = ? ORDER BY EmprCod, RcNcFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X18", "SELECT T1.RcNcFec, T1.RcNcLin, T2.CliNom, T1.RcNcHd, T1.RcNcR, T1.RcNcP, T1.RcNcHdO, T1.RcNcRO, T1.RcNcPO, T3.TipDefDsc, T1.RcNcRef, T1.RcNcN1, T1.RcNcN2, T1.RcNcDc, T1.RcNcGR, T1.RcNcFo, T1.RcNcVI, T1.RcNcV1, T1.RcNcV2, T1.RcNcOb, T1.RcNcCm, T1.RcNcE, T1.RcNcKgH, T1.EmprCod, T1.CliCod, T1.TipDefCod FROM ((TXPRCNC01 T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPDEF T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.RcNcFec = ? and T1.RcNcLin = ? ORDER BY T1.EmprCod, T1.RcNcFec, T1.RcNcLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X20", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X21", "SELECT EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018X22", "INSERT INTO TXPRCNC01(RcNcFec, RcNcLin, RcNcHd, RcNcR, RcNcP, RcNcHdO, RcNcRO, RcNcPO, RcNcRef, RcNcN1, RcNcN2, RcNcDc, RcNcGR, RcNcFo, RcNcVI, RcNcV1, RcNcV2, RcNcOb, RcNcCm, RcNcE, RcNcKgH, EmprCod, CliCod, TipDefCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRCNC01")
         ,new UpdateCursor("T018X23", "UPDATE TXPRCNC01 SET RcNcHd=?, RcNcR=?, RcNcP=?, RcNcHdO=?, RcNcRO=?, RcNcPO=?, RcNcRef=?, RcNcN1=?, RcNcN2=?, RcNcDc=?, RcNcGR=?, RcNcFo=?, RcNcVI=?, RcNcV1=?, RcNcV2=?, RcNcOb=?, RcNcCm=?, RcNcE=?, RcNcKgH=?, CliCod=?, TipDefCod=?  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?", GX_NOMASK, "TXPRCNC01")
         ,new UpdateCursor("T018X24", "DELETE FROM TXPRCNC01  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?", GX_NOMASK, "TXPRCNC01")
         ,new ForEachCursor("T018X25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X26", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X27", "SELECT * FROM (SELECT EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018X28", "SELECT EmprCod, RcNcFec, RcNcLin FROM TXPRCNC01 WHERE EmprCod = ? and RcNcFec = ? ORDER BY EmprCod, RcNcFec, RcNcLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018X29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 3);
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 3);
               ((int[]) buf[41])[0] = rslt.getInt(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 16 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 3);
               ((int[]) buf[44])[0] = rslt.getInt(25);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
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
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[23]).longValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 30);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[33], 200);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[35], 200);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[39], 2);
               }
               stmt.setString(22, (String)parms[40], 3);
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[44]).shortValue());
               }
               return;
            case 21 :
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(11, ((Number) parms[21]).longValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 30);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 200);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 200);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               stmt.setString(22, (String)parms[42], 3);
               stmt.setDate(23, (java.util.Date)parms[43]);
               stmt.setInt(24, ((Number) parms[44]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

