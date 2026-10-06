package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trcnc04_impl extends GXDataArea
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
         A10715RcNcFec = localUtil.parseDateParm( httpContext.GetPar( "RcNcFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10717RcNcLin = (int)(GXutil.lval( httpContext.GetPar( "RcNcLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A10715RcNcFec, A10717RcNcLin) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "NOTAS CREDITO-RC (FACTURAS)", ""), (short)(0)) ;
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

   public trcnc04_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trcnc04_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trcnc04_impl.class ));
   }

   public trcnc04_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRCNC04.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha Mov", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRcNcFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcFec_Internalname, localUtil.format(A10715RcNcFec, "99/99/99"), localUtil.format( A10715RcNcFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcFec_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC04.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRcNcFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRcNcFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRCNC04.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcLin_Internalname, GXutil.ltrim( localUtil.ntoc( A10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10717RcNcLin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10717RcNcLin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcLin_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcLin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Guia", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRCNC04.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRcNcGrn_Internalname, GXutil.ltrim( localUtil.ntoc( A10813RcNcGrn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRcNcGrn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10813RcNcGrn), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10813RcNcGrn), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRcNcGrn_Jsonclick, 0, "", "", "", "", "", 1, edtRcNcGrn_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
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
         nBlankRcdCount1440 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1440 = (short)(1) ;
            scanStart19D1440( ) ;
            while ( RcdFound1440 != 0 )
            {
               init_level_properties1440( ) ;
               getByPrimaryKey19D1440( ) ;
               addRow19D1440( ) ;
               scanNext19D1440( ) ;
            }
            scanEnd19D1440( ) ;
            nBlankRcdCount1440 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal19D1440( ) ;
         standaloneModal19D1440( ) ;
         sMode1440 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow19D1440( ) ;
            edtavnRcdDeleted_1440_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1440_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1440_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1440_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtRcNcFrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCFRN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcFrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFrn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtRcNcV4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV4_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRcNcV4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV4_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1440 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal19D1440( ) ;
            }
            sendRow19D1440( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1440 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1440 = (short)(5) ;
         nRcdExists_1440 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart19D1440( ) ;
            while ( RcdFound1440 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451440( ) ;
               init_level_properties1440( ) ;
               standaloneNotModal19D1440( ) ;
               getByPrimaryKey19D1440( ) ;
               standaloneModal19D1440( ) ;
               addRow19D1440( ) ;
               scanNext19D1440( ) ;
            }
            scanEnd19D1440( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1440 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451440( ) ;
      initAll19D1440( ) ;
      init_level_properties1440( ) ;
      nRcdExists_1440 = (short)(0) ;
      nIsMod_1440 = (short)(0) ;
      nRcdDeleted_1440 = (short)(0) ;
      nBlankRcdCount1440 = (short)(nBlankRcdUsr1440+nBlankRcdCount1440) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1440 > 0 )
      {
         standaloneNotModal19D1440( ) ;
         standaloneModal19D1440( ) ;
         addRow19D1440( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRcNcFrn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1440 = (short)(nBlankRcdCount1440-1) ;
      }
      Gx_mode = sMode1440 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRCNC04.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRCNC04.htm");
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
      e1119D2 ();
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
            Z10717RcNcLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z10717RcNcLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10813RcNcGrn = localUtil.ctol( httpContext.cgiGet( "Z10813RcNcGrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RCNCLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRcNcLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10717RcNcLin = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
            }
            else
            {
               A10717RcNcLin = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcGrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcGrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RCNCGRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRcNcGrn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10813RcNcGrn = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
            }
            else
            {
               A10813RcNcGrn = localUtil.ctol( httpContext.cgiGet( edtRcNcGrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
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
               A10717RcNcLin = (int)(GXutil.lval( httpContext.GetPar( "RcNcLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
               A10813RcNcGrn = GXutil.lval( httpContext.GetPar( "RcNcGrn")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
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
                        e1119D2 ();
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
            initAll19D1439( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1440_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1440_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes19D1439( ) ;
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

   public void confirm_19D0( )
   {
      beforeValidate19D1439( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls19D1439( ) ;
         }
         else
         {
            checkExtendedTable19D1439( ) ;
            if ( AnyError == 0 )
            {
               zm19D1439( 2) ;
               zm19D1439( 3) ;
            }
            closeExtendedTableCursors19D1439( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1439 = Gx_mode ;
         confirm_19D1440( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1439 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1439 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues19D0( ) ;
      }
   }

   public void confirm_19D1440( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow19D1440( ) ;
         if ( ( nRcdExists_1440 != 0 ) || ( nIsMod_1440 != 0 ) )
         {
            getKey19D1440( ) ;
            if ( ( nRcdExists_1440 == 0 ) && ( nRcdDeleted_1440 == 0 ) )
            {
               if ( RcdFound1440 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate19D1440( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable19D1440( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors19D1440( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RCNCFRN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRcNcFrn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1440 != 0 )
               {
                  if ( nRcdDeleted_1440 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey19D1440( ) ;
                     load19D1440( ) ;
                     beforeValidate19D1440( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls19D1440( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1440 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate19D1440( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable19D1440( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors19D1440( ) ;
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
                  if ( nRcdDeleted_1440 == 0 )
                  {
                     GXCCtl = "RCNCFRN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRcNcFrn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1440_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcFrn_Internalname, GXutil.ltrim( localUtil.ntoc( A10814RcNcFrn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcV4_Internalname, GXutil.ltrim( localUtil.ntoc( A10815RcNcV4, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10814RcNcFrn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10814RcNcFrn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10815RcNcV4_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10815RcNcV4, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1440_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1440_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1440_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1440 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1440_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1440_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCFRN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV4_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption19D0( )
   {
   }

   public void e1119D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trcnc04_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      trcnc04_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trcnc04_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trcnc04_impl.this.A396EmprCod = GXv_char2[0] ;
      trcnc04_impl.this.AV11EmprNom = GXv_char3[0] ;
      trcnc04_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm19D1439( int GX_JID )
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
         Z10813RcNcGrn = A10813RcNcGrn ;
         Z396EmprCod = A396EmprCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TRCNC04" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T019D6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019D6_A407EmprNom[0] ;
      n407EmprNom = T019D6_n407EmprNom[0] ;
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

   public void load19D1439( )
   {
      /* Using cursor T019D8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1439 = (short)(1) ;
         A407EmprNom = T019D8_A407EmprNom[0] ;
         n407EmprNom = T019D8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm19D1439( -1) ;
      }
      pr_default.close(6);
      onLoadActions19D1439( ) ;
   }

   public void onLoadActions19D1439( )
   {
   }

   public void checkExtendedTable19D1439( )
   {
      nIsDirty_1439 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T019D7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Level1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RCNCLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors19D1439( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         java.util.Date A10715RcNcFec ,
                         int A10717RcNcLin )
   {
      /* Using cursor T019D9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Level1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RCNCLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcFec_Internalname ;
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

   public void getKey19D1439( )
   {
      /* Using cursor T019D10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1439 = (short)(1) ;
      }
      else
      {
         RcdFound1439 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T019D5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T019D5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19D1439( 1) ;
         RcdFound1439 = (short)(1) ;
         A10813RcNcGrn = T019D5_A10813RcNcGrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
         A10715RcNcFec = T019D5_A10715RcNcFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10717RcNcLin = T019D5_A10717RcNcLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         Z10813RcNcGrn = A10813RcNcGrn ;
         sMode1439 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load19D1439( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1439 = (short)(0) ;
            initializeNonKey19D1439( ) ;
         }
         Gx_mode = sMode1439 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1439 = (short)(0) ;
         initializeNonKey19D1439( ) ;
         sMode1439 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1439 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey19D1439( ) ;
      if ( RcdFound1439 == 0 )
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
      RcdFound1439 = (short)(0) ;
      /* Using cursor T019D11 */
      pr_default.execute(9, new Object[] {A10715RcNcFec, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Integer.valueOf(A10717RcNcLin), A10715RcNcFec, Long.valueOf(A10813RcNcGrn), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T019D11_A10715RcNcFec[0]).before( GXutil.resetTime( A10715RcNcFec )) || GXutil.dateCompare(GXutil.resetTime(T019D11_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D11_A10717RcNcLin[0] < A10717RcNcLin ) || ( T019D11_A10717RcNcLin[0] == A10717RcNcLin ) && GXutil.dateCompare(GXutil.resetTime(T019D11_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D11_A10813RcNcGrn[0] < A10813RcNcGrn ) ) && ( GXutil.strcmp(T019D11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.resetTime(T019D11_A10715RcNcFec[0]).after( GXutil.resetTime( A10715RcNcFec )) || GXutil.dateCompare(GXutil.resetTime(T019D11_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D11_A10717RcNcLin[0] > A10717RcNcLin ) || ( T019D11_A10717RcNcLin[0] == A10717RcNcLin ) && GXutil.dateCompare(GXutil.resetTime(T019D11_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D11_A10813RcNcGrn[0] > A10813RcNcGrn ) ) && ( GXutil.strcmp(T019D11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10715RcNcFec = T019D11_A10715RcNcFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            A10717RcNcLin = T019D11_A10717RcNcLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
            A10813RcNcGrn = T019D11_A10813RcNcGrn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
            RcdFound1439 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1439 = (short)(0) ;
      /* Using cursor T019D12 */
      pr_default.execute(10, new Object[] {A10715RcNcFec, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Integer.valueOf(A10717RcNcLin), A10715RcNcFec, Long.valueOf(A10813RcNcGrn), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.resetTime(T019D12_A10715RcNcFec[0]).after( GXutil.resetTime( A10715RcNcFec )) || GXutil.dateCompare(GXutil.resetTime(T019D12_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D12_A10717RcNcLin[0] > A10717RcNcLin ) || ( T019D12_A10717RcNcLin[0] == A10717RcNcLin ) && GXutil.dateCompare(GXutil.resetTime(T019D12_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D12_A10813RcNcGrn[0] > A10813RcNcGrn ) ) && ( GXutil.strcmp(T019D12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.resetTime(T019D12_A10715RcNcFec[0]).before( GXutil.resetTime( A10715RcNcFec )) || GXutil.dateCompare(GXutil.resetTime(T019D12_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D12_A10717RcNcLin[0] < A10717RcNcLin ) || ( T019D12_A10717RcNcLin[0] == A10717RcNcLin ) && GXutil.dateCompare(GXutil.resetTime(T019D12_A10715RcNcFec[0]), GXutil.resetTime(A10715RcNcFec)) && ( T019D12_A10813RcNcGrn[0] < A10813RcNcGrn ) ) && ( GXutil.strcmp(T019D12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10715RcNcFec = T019D12_A10715RcNcFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            A10717RcNcLin = T019D12_A10717RcNcLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
            A10813RcNcGrn = T019D12_A10813RcNcGrn[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
            RcdFound1439 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey19D1439( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRcNcFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert19D1439( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1439 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) || ( A10813RcNcGrn != Z10813RcNcGrn ) )
            {
               A10715RcNcFec = Z10715RcNcFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
               A10717RcNcLin = Z10717RcNcLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
               A10813RcNcGrn = Z10813RcNcGrn ;
               httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
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
               update19D1439( ) ;
               GX_FocusControl = edtRcNcFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) || ( A10813RcNcGrn != Z10813RcNcGrn ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRcNcFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert19D1439( ) ;
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
                  insert19D1439( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) || ( A10813RcNcGrn != Z10813RcNcGrn ) )
      {
         A10715RcNcFec = Z10715RcNcFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10717RcNcLin = Z10717RcNcLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
         A10813RcNcGrn = Z10813RcNcGrn ;
         httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
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
      getKey19D1439( ) ;
      if ( RcdFound1439 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) || ( A10813RcNcGrn != Z10813RcNcGrn ) )
         {
            A10715RcNcFec = Z10715RcNcFec ;
            httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
            A10717RcNcLin = Z10717RcNcLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
            A10813RcNcGrn = Z10813RcNcGrn ;
            httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A10715RcNcFec), GXutil.resetTime(Z10715RcNcFec)) ) || ( A10717RcNcLin != Z10717RcNcLin ) || ( A10813RcNcGrn != Z10813RcNcGrn ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trcnc04");
   }

   public void insert_check( )
   {
      confirm_19D0( ) ;
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
      if ( RcdFound1439 == 0 )
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
      scanStart19D1439( ) ;
      if ( RcdFound1439 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd19D1439( ) ;
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
      if ( RcdFound1439 == 0 )
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
      if ( RcdFound1439 == 0 )
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
      scanStart19D1439( ) ;
      if ( RcdFound1439 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1439 != 0 )
         {
            scanNext19D1439( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd19D1439( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency19D1439( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019D4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRCNC02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19D1439( )
   {
      beforeValidate19D1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19D1439( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19D1439( 0) ;
         checkOptimisticConcurrency19D1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19D1439( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19D1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019D13 */
                  pr_default.execute(11, new Object[] {Long.valueOf(A10813RcNcGrn), A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC02");
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
                        processLevel19D1439( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption19D0( ) ;
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
            load19D1439( ) ;
         }
         endLevel19D1439( ) ;
      }
      closeExtendedTableCursors19D1439( ) ;
   }

   public void update19D1439( )
   {
      beforeValidate19D1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19D1439( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19D1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19D1439( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate19D1439( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPRCNC02 */
                  deferredUpdate19D1439( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel19D1439( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption19D0( ) ;
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
         endLevel19D1439( ) ;
      }
      closeExtendedTableCursors19D1439( ) ;
   }

   public void deferredUpdate19D1439( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19D1439( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19D1439( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19D1439( ) ;
         afterConfirm19D1439( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19D1439( ) ;
            if ( AnyError == 0 )
            {
               scanStart19D1440( ) ;
               while ( RcdFound1440 != 0 )
               {
                  getByPrimaryKey19D1440( ) ;
                  delete19D1440( ) ;
                  scanNext19D1440( ) ;
               }
               scanEnd19D1440( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019D14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC02");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1439 == 0 )
                        {
                           initAll19D1439( ) ;
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
                        resetCaption19D0( ) ;
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
      sMode1439 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19D1439( ) ;
      Gx_mode = sMode1439 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19D1439( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel19D1440( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow19D1440( ) ;
         if ( ( nRcdExists_1440 != 0 ) || ( nIsMod_1440 != 0 ) )
         {
            standaloneNotModal19D1440( ) ;
            getKey19D1440( ) ;
            if ( ( nRcdExists_1440 == 0 ) && ( nRcdDeleted_1440 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert19D1440( ) ;
            }
            else
            {
               if ( RcdFound1440 != 0 )
               {
                  if ( ( nRcdDeleted_1440 != 0 ) && ( nRcdExists_1440 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete19D1440( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1440 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update19D1440( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1440 == 0 )
                  {
                     GXCCtl = "RCNCFRN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRcNcFrn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1440_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcFrn_Internalname, GXutil.ltrim( localUtil.ntoc( A10814RcNcFrn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRcNcV4_Internalname, GXutil.ltrim( localUtil.ntoc( A10815RcNcV4, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10814RcNcFrn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10814RcNcFrn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10815RcNcV4_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10815RcNcV4, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1440_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1440_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1440_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1440 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1440_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1440_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCFRN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RCNCV4_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll19D1440( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1440 = (short)(0) ;
      nIsMod_1440 = (short)(0) ;
      nRcdDeleted_1440 = (short)(0) ;
   }

   public void processLevel19D1439( )
   {
      /* Save parent mode. */
      sMode1439 = Gx_mode ;
      processNestedLevel19D1440( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1439 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel19D1439( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete19D1439( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trcnc04");
         if ( AnyError == 0 )
         {
            confirmValues19D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trcnc04");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart19D1439( )
   {
      /* Scan By routine */
      /* Using cursor T019D15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1439 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1439 = (short)(1) ;
         A10715RcNcFec = T019D15_A10715RcNcFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10717RcNcLin = T019D15_A10717RcNcLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
         A10813RcNcGrn = T019D15_A10813RcNcGrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19D1439( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1439 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1439 = (short)(1) ;
         A10715RcNcFec = T019D15_A10715RcNcFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
         A10717RcNcLin = T019D15_A10717RcNcLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
         A10813RcNcGrn = T019D15_A10813RcNcGrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
      }
   }

   public void scanEnd19D1439( )
   {
      pr_default.close(13);
   }

   public void afterConfirm19D1439( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19D1439( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19D1439( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19D1439( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19D1439( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19D1439( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19D1439( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtRcNcFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFec_Enabled), 5, 0), true);
      edtRcNcLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcLin_Enabled), 5, 0), true);
      edtRcNcGrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcGrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcGrn_Enabled), 5, 0), true);
   }

   public void zm19D1440( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10815RcNcV4 = T019D3_A10815RcNcV4[0] ;
         }
         else
         {
            Z10815RcNcV4 = A10815RcNcV4 ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         Z10813RcNcGrn = A10813RcNcGrn ;
         Z10814RcNcFrn = A10814RcNcFrn ;
         Z10815RcNcV4 = A10815RcNcV4 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal19D1440( )
   {
   }

   public void standaloneModal19D1440( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRcNcFrn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRcNcFrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFrn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtRcNcFrn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRcNcFrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFrn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load19D1440( )
   {
      /* Using cursor T019D16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1440 = (short)(1) ;
         A10815RcNcV4 = T019D16_A10815RcNcV4[0] ;
         n10815RcNcV4 = T019D16_n10815RcNcV4[0] ;
         zm19D1440( -4) ;
      }
      pr_default.close(14);
      onLoadActions19D1440( ) ;
   }

   public void onLoadActions19D1440( )
   {
   }

   public void checkExtendedTable19D1440( )
   {
      nIsDirty_1440 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal19D1440( ) ;
   }

   public void closeExtendedTableCursors19D1440( )
   {
   }

   public void enableDisable19D1440( )
   {
   }

   public void getKey19D1440( )
   {
      /* Using cursor T019D17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1440 = (short)(1) ;
      }
      else
      {
         RcdFound1440 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey19D1440( )
   {
      /* Using cursor T019D3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T019D3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm19D1440( 4) ;
         RcdFound1440 = (short)(1) ;
         initializeNonKey19D1440( ) ;
         A10814RcNcFrn = T019D3_A10814RcNcFrn[0] ;
         A10815RcNcV4 = T019D3_A10815RcNcV4[0] ;
         n10815RcNcV4 = T019D3_n10815RcNcV4[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10715RcNcFec = A10715RcNcFec ;
         Z10717RcNcLin = A10717RcNcLin ;
         Z10813RcNcGrn = A10813RcNcGrn ;
         Z10814RcNcFrn = A10814RcNcFrn ;
         sMode1440 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal19D1440( ) ;
         load19D1440( ) ;
         Gx_mode = sMode1440 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1440 = (short)(0) ;
         initializeNonKey19D1440( ) ;
         sMode1440 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal19D1440( ) ;
         Gx_mode = sMode1440 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes19D1440( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency19D1440( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T019D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC04"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10815RcNcV4, T019D2_A10815RcNcV4[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10815RcNcV4, T019D2_A10815RcNcV4[0]) != 0 )
            {
               GXutil.writeLogln("trcnc04:[seudo value changed for attri]"+"RcNcV4");
               GXutil.writeLogRaw("Old: ",Z10815RcNcV4);
               GXutil.writeLogRaw("Current: ",T019D2_A10815RcNcV4[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRCNC04"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert19D1440( )
   {
      beforeValidate19D1440( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19D1440( ) ;
      }
      if ( AnyError == 0 )
      {
         zm19D1440( 0) ;
         checkOptimisticConcurrency19D1440( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm19D1440( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert19D1440( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T019D18 */
                  pr_default.execute(16, new Object[] {A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn), Boolean.valueOf(n10815RcNcV4), A10815RcNcV4, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC04");
                  if ( (pr_default.getStatus(16) == 1) )
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
            load19D1440( ) ;
         }
         endLevel19D1440( ) ;
      }
      closeExtendedTableCursors19D1440( ) ;
   }

   public void update19D1440( )
   {
      beforeValidate19D1440( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable19D1440( ) ;
      }
      if ( ( nIsMod_1440 != 0 ) || ( nIsDirty_1440 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency19D1440( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm19D1440( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate19D1440( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T019D19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n10815RcNcV4), A10815RcNcV4, A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC04");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRCNC04"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate19D1440( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey19D1440( ) ;
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
            endLevel19D1440( ) ;
         }
      }
      closeExtendedTableCursors19D1440( ) ;
   }

   public void deferredUpdate19D1440( )
   {
   }

   public void delete19D1440( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate19D1440( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency19D1440( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls19D1440( ) ;
         afterConfirm19D1440( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete19D1440( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T019D20 */
               pr_default.execute(18, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn), Integer.valueOf(A10814RcNcFrn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRCNC04");
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
      sMode1440 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel19D1440( ) ;
      Gx_mode = sMode1440 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls19D1440( )
   {
      standaloneModal19D1440( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel19D1440( )
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

   public void scanStart19D1440( )
   {
      /* Scan By routine */
      /* Using cursor T019D21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin), Long.valueOf(A10813RcNcGrn)});
      RcdFound1440 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1440 = (short)(1) ;
         A10814RcNcFrn = T019D21_A10814RcNcFrn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext19D1440( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1440 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1440 = (short)(1) ;
         A10814RcNcFrn = T019D21_A10814RcNcFrn[0] ;
      }
   }

   public void scanEnd19D1440( )
   {
      pr_default.close(19);
   }

   public void afterConfirm19D1440( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert19D1440( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate19D1440( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete19D1440( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete19D1440( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate19D1440( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes19D1440( )
   {
      edtRcNcFrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFrn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtRcNcV4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcV4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcV4_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes19D1440( )
   {
   }

   public void send_integrity_lvl_hashes19D1439( )
   {
   }

   public void subsflControlProps_451440( )
   {
      edtavnRcdDeleted_1440_Internalname = "vNRCDDELETED_1440_"+sGXsfl_45_idx ;
      edtRcNcFrn_Internalname = "RCNCFRN_"+sGXsfl_45_idx ;
      edtRcNcV4_Internalname = "RCNCV4_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451440( )
   {
      edtavnRcdDeleted_1440_Internalname = "vNRCDDELETED_1440_"+sGXsfl_45_fel_idx ;
      edtRcNcFrn_Internalname = "RCNCFRN_"+sGXsfl_45_fel_idx ;
      edtRcNcV4_Internalname = "RCNCV4_"+sGXsfl_45_fel_idx ;
   }

   public void addRow19D1440( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451440( ) ;
      sendRow19D1440( ) ;
   }

   public void sendRow19D1440( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1440_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1440_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1440_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1440), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1440), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1440_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1440_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1440_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcFrn_Internalname,GXutil.ltrim( localUtil.ntoc( A10814RcNcFrn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10814RcNcFrn), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcFrn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcFrn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1440_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRcNcV4_Internalname,GXutil.ltrim( localUtil.ntoc( A10815RcNcV4, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRcNcV4_Enabled!=0) ? localUtil.format( A10815RcNcV4, "ZZZZZZZZZ9.99") : localUtil.format( A10815RcNcV4, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRcNcV4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRcNcV4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes19D1440( ) ;
      GXCCtl = "Z10814RcNcFrn_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10814RcNcFrn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10815RcNcV4_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10815RcNcV4, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1440_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1440_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1440_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1440, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1440_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1440_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCFRN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RCNCV4_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV4_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow19D1440( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451440( ) ;
      edtavnRcdDeleted_1440_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1440_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcFrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCFRN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRcNcV4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RCNCV4_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1440_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1440_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1440");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1440_Internalname ;
         wbErr = true ;
         nRcdDeleted_1440 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1440 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1440_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcFrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRcNcFrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "RCNCFRN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcFrn_Internalname ;
         wbErr = true ;
         A10814RcNcFrn = 0 ;
      }
      else
      {
         A10814RcNcFrn = (int)(localUtil.ctol( httpContext.cgiGet( edtRcNcFrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRcNcV4_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRcNcV4_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "RCNCV4_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcV4_Internalname ;
         wbErr = true ;
         A10815RcNcV4 = DecimalUtil.ZERO ;
         n10815RcNcV4 = false ;
      }
      else
      {
         A10815RcNcV4 = localUtil.ctond( httpContext.cgiGet( edtRcNcV4_Internalname)) ;
         n10815RcNcV4 = false ;
      }
      GXCCtl = "Z10814RcNcFrn_" + sGXsfl_45_idx ;
      Z10814RcNcFrn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10815RcNcV4_" + sGXsfl_45_idx ;
      Z10815RcNcV4 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1440_" + sGXsfl_45_idx ;
      nRcdDeleted_1440 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1440_" + sGXsfl_45_idx ;
      nRcdExists_1440 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1440_" + sGXsfl_45_idx ;
      nIsMod_1440 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRcNcFrn_Enabled = edtRcNcFrn_Enabled ;
   }

   public void confirmValues19D0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451440( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451440( ) ;
         httpContext.changePostValue( "Z10814RcNcFrn_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10814RcNcFrn_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10814RcNcFrn_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10815RcNcV4_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10815RcNcV4_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10815RcNcV4_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trcnc04", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10717RcNcLin", GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10813RcNcGrn", GXutil.ltrim( localUtil.ntoc( Z10813RcNcGrn, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.trcnc04", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRCNC04" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "NOTAS CREDITO-RC (FACTURAS)", "") ;
   }

   public void initializeNonKey19D1439( )
   {
   }

   public void initAll19D1439( )
   {
      A10715RcNcFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10715RcNcFec", localUtil.format(A10715RcNcFec, "99/99/99"));
      A10717RcNcLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10717RcNcLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10717RcNcLin), 6, 0));
      A10813RcNcGrn = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10813RcNcGrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10813RcNcGrn), 10, 0));
      initializeNonKey19D1439( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey19D1440( )
   {
      A10815RcNcV4 = DecimalUtil.ZERO ;
      n10815RcNcV4 = false ;
      Z10815RcNcV4 = DecimalUtil.ZERO ;
   }

   public void initAll19D1440( )
   {
      A10814RcNcFrn = 0 ;
      initializeNonKey19D1440( ) ;
   }

   public void standaloneModalInsert19D1440( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156297", true, true);
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
      httpContext.AddJavascriptSource("trcnc04.js", "?2026824156298", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1440( )
   {
      edtRcNcFrn_Enabled = defedtRcNcFrn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRcNcFrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRcNcFrn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1440, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1440_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10814RcNcFrn, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcFrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10815RcNcV4, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRcNcV4_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtRcNcLin_Internalname = "RCNCLIN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRcNcGrn_Internalname = "RCNCGRN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1440_Internalname = "vNRCDDELETED_1440" ;
      edtRcNcFrn_Internalname = "RCNCFRN" ;
      edtRcNcV4_Internalname = "RCNCV4" ;
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
      Form.setCaption( httpContext.getMessage( "NOTAS CREDITO-RC (FACTURAS)", "") );
      edtRcNcV4_Jsonclick = "" ;
      edtRcNcFrn_Jsonclick = "" ;
      edtavnRcdDeleted_1440_Jsonclick = "" ;
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
      edtRcNcV4_Enabled = 1 ;
      edtRcNcFrn_Enabled = 1 ;
      edtavnRcdDeleted_1440_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRcNcGrn_Jsonclick = "" ;
      edtRcNcGrn_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcGrn_Enabled = 1 ;
      edtRcNcLin_Jsonclick = "" ;
      edtRcNcLin_Backcolor = (int)(0xFFFFFF) ;
      edtRcNcLin_Enabled = 1 ;
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
      subsflControlProps_451440( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal19D1440( ) ;
         standaloneModal19D1440( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow19D1440( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451440( ) ;
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
      /* Using cursor T019D22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T019D22_A407EmprNom[0] ;
      n407EmprNom = T019D22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T019D23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Level1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RCNCLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(21);
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

   public void valid_Rcnclin( )
   {
      /* Using cursor T019D23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A10715RcNcFec, Integer.valueOf(A10717RcNcLin)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Level1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RCNCLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRcNcFec_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Rcncgrn( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10715RcNcFec", localUtil.format(Z10715RcNcFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10717RcNcLin", GXutil.ltrim( localUtil.ntoc( Z10717RcNcLin, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10813RcNcGrn", GXutil.ltrim( localUtil.ntoc( Z10813RcNcGrn, (byte)(10), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_RCNCFEC","{handler:'valid_Rcncfec',iparms:[]");
      setEventMetadata("VALID_RCNCFEC",",oparms:[]}");
      setEventMetadata("VALID_RCNCLIN","{handler:'valid_Rcnclin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10715RcNcFec',fld:'RCNCFEC',pic:''},{av:'A10717RcNcLin',fld:'RCNCLIN',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_RCNCLIN",",oparms:[]}");
      setEventMetadata("VALID_RCNCGRN","{handler:'valid_Rcncgrn',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10715RcNcFec',fld:'RCNCFEC',pic:''},{av:'A10717RcNcLin',fld:'RCNCLIN',pic:'ZZZZZ9'},{av:'A10813RcNcGrn',fld:'RCNCGRN',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RCNCGRN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10715RcNcFec'},{av:'Z10717RcNcLin'},{av:'Z10813RcNcGrn'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RCNCFRN","{handler:'valid_Rcncfrn',iparms:[]");
      setEventMetadata("VALID_RCNCFRN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Rcncv4',iparms:[]");
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
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10715RcNcFec = GXutil.nullDate() ;
      Z10815RcNcV4 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A10715RcNcFec = GXutil.nullDate() ;
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
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1440 = "" ;
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
      sMode1439 = "" ;
      GXCCtl = "" ;
      A10815RcNcV4 = DecimalUtil.ZERO ;
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
      T019D6_A407EmprNom = new String[] {""} ;
      T019D6_n407EmprNom = new boolean[] {false} ;
      T019D8_A10813RcNcGrn = new long[1] ;
      T019D8_A407EmprNom = new String[] {""} ;
      T019D8_n407EmprNom = new boolean[] {false} ;
      T019D8_A396EmprCod = new String[] {""} ;
      T019D8_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D8_A10717RcNcLin = new int[1] ;
      T019D7_A396EmprCod = new String[] {""} ;
      T019D9_A396EmprCod = new String[] {""} ;
      T019D10_A396EmprCod = new String[] {""} ;
      T019D10_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D10_A10717RcNcLin = new int[1] ;
      T019D10_A10813RcNcGrn = new long[1] ;
      T019D5_A10813RcNcGrn = new long[1] ;
      T019D5_A396EmprCod = new String[] {""} ;
      T019D5_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D5_A10717RcNcLin = new int[1] ;
      T019D11_A396EmprCod = new String[] {""} ;
      T019D11_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D11_A10717RcNcLin = new int[1] ;
      T019D11_A10813RcNcGrn = new long[1] ;
      T019D12_A396EmprCod = new String[] {""} ;
      T019D12_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D12_A10717RcNcLin = new int[1] ;
      T019D12_A10813RcNcGrn = new long[1] ;
      T019D4_A10813RcNcGrn = new long[1] ;
      T019D4_A396EmprCod = new String[] {""} ;
      T019D4_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D4_A10717RcNcLin = new int[1] ;
      T019D15_A396EmprCod = new String[] {""} ;
      T019D15_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D15_A10717RcNcLin = new int[1] ;
      T019D15_A10813RcNcGrn = new long[1] ;
      T019D16_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D16_A10717RcNcLin = new int[1] ;
      T019D16_A10813RcNcGrn = new long[1] ;
      T019D16_A10814RcNcFrn = new int[1] ;
      T019D16_A10815RcNcV4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019D16_n10815RcNcV4 = new boolean[] {false} ;
      T019D16_A396EmprCod = new String[] {""} ;
      T019D17_A396EmprCod = new String[] {""} ;
      T019D17_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D17_A10717RcNcLin = new int[1] ;
      T019D17_A10813RcNcGrn = new long[1] ;
      T019D17_A10814RcNcFrn = new int[1] ;
      T019D3_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D3_A10717RcNcLin = new int[1] ;
      T019D3_A10813RcNcGrn = new long[1] ;
      T019D3_A10814RcNcFrn = new int[1] ;
      T019D3_A10815RcNcV4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019D3_n10815RcNcV4 = new boolean[] {false} ;
      T019D3_A396EmprCod = new String[] {""} ;
      T019D2_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D2_A10717RcNcLin = new int[1] ;
      T019D2_A10813RcNcGrn = new long[1] ;
      T019D2_A10814RcNcFrn = new int[1] ;
      T019D2_A10815RcNcV4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T019D2_n10815RcNcV4 = new boolean[] {false} ;
      T019D2_A396EmprCod = new String[] {""} ;
      T019D21_A396EmprCod = new String[] {""} ;
      T019D21_A10715RcNcFec = new java.util.Date[] {GXutil.nullDate()} ;
      T019D21_A10717RcNcLin = new int[1] ;
      T019D21_A10813RcNcGrn = new long[1] ;
      T019D21_A10814RcNcFrn = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T019D22_A407EmprNom = new String[] {""} ;
      T019D22_n407EmprNom = new boolean[] {false} ;
      T019D23_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10715RcNcFec = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trcnc04__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trcnc04__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trcnc04__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trcnc04__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trcnc04__default(),
         new Object[] {
             new Object[] {
            T019D2_A10715RcNcFec, T019D2_A10717RcNcLin, T019D2_A10813RcNcGrn, T019D2_A10814RcNcFrn, T019D2_A10815RcNcV4, T019D2_n10815RcNcV4, T019D2_A396EmprCod
            }
            , new Object[] {
            T019D3_A10715RcNcFec, T019D3_A10717RcNcLin, T019D3_A10813RcNcGrn, T019D3_A10814RcNcFrn, T019D3_A10815RcNcV4, T019D3_n10815RcNcV4, T019D3_A396EmprCod
            }
            , new Object[] {
            T019D4_A10813RcNcGrn, T019D4_A396EmprCod, T019D4_A10715RcNcFec, T019D4_A10717RcNcLin
            }
            , new Object[] {
            T019D5_A10813RcNcGrn, T019D5_A396EmprCod, T019D5_A10715RcNcFec, T019D5_A10717RcNcLin
            }
            , new Object[] {
            T019D6_A407EmprNom, T019D6_n407EmprNom
            }
            , new Object[] {
            T019D7_A396EmprCod
            }
            , new Object[] {
            T019D8_A10813RcNcGrn, T019D8_A407EmprNom, T019D8_n407EmprNom, T019D8_A396EmprCod, T019D8_A10715RcNcFec, T019D8_A10717RcNcLin
            }
            , new Object[] {
            T019D9_A396EmprCod
            }
            , new Object[] {
            T019D10_A396EmprCod, T019D10_A10715RcNcFec, T019D10_A10717RcNcLin, T019D10_A10813RcNcGrn
            }
            , new Object[] {
            T019D11_A396EmprCod, T019D11_A10715RcNcFec, T019D11_A10717RcNcLin, T019D11_A10813RcNcGrn
            }
            , new Object[] {
            T019D12_A396EmprCod, T019D12_A10715RcNcFec, T019D12_A10717RcNcLin, T019D12_A10813RcNcGrn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019D15_A396EmprCod, T019D15_A10715RcNcFec, T019D15_A10717RcNcLin, T019D15_A10813RcNcGrn
            }
            , new Object[] {
            T019D16_A10715RcNcFec, T019D16_A10717RcNcLin, T019D16_A10813RcNcGrn, T019D16_A10814RcNcFrn, T019D16_A10815RcNcV4, T019D16_n10815RcNcV4, T019D16_A396EmprCod
            }
            , new Object[] {
            T019D17_A396EmprCod, T019D17_A10715RcNcFec, T019D17_A10717RcNcLin, T019D17_A10813RcNcGrn, T019D17_A10814RcNcFrn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T019D21_A396EmprCod, T019D21_A10715RcNcFec, T019D21_A10717RcNcLin, T019D21_A10813RcNcGrn, T019D21_A10814RcNcFrn
            }
            , new Object[] {
            T019D22_A407EmprNom, T019D22_n407EmprNom
            }
            , new Object[] {
            T019D23_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TRCNC04" ;
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
   private short nRcdDeleted_1440 ;
   private short nRcdExists_1440 ;
   private short nIsMod_1440 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1440 ;
   private short RcdFound1440 ;
   private short nBlankRcdUsr1440 ;
   private short RcdFound1439 ;
   private short nIsDirty_1439 ;
   private short nIsDirty_1440 ;
   private int Z10717RcNcLin ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z10814RcNcFrn ;
   private int A10717RcNcLin ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtRcNcFec_Enabled ;
   private int edtRcNcLin_Enabled ;
   private int edtRcNcGrn_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1440_Enabled ;
   private int edtRcNcFrn_Enabled ;
   private int edtRcNcV4_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10814RcNcFrn ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtRcNcFrn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtRcNcGrn_Backcolor ;
   private int edtRcNcLin_Backcolor ;
   private int edtRcNcFec_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10717RcNcLin ;
   private long Z10813RcNcGrn ;
   private long A10813RcNcGrn ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ10813RcNcGrn ;
   private java.math.BigDecimal Z10815RcNcV4 ;
   private java.math.BigDecimal A10815RcNcV4 ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRcNcFec_Internalname ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtRcNcFec_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtRcNcLin_Internalname ;
   private String edtRcNcLin_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRcNcGrn_Internalname ;
   private String edtRcNcGrn_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1440 ;
   private String edtavnRcdDeleted_1440_Internalname ;
   private String edtRcNcFrn_Internalname ;
   private String edtRcNcV4_Internalname ;
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
   private String sMode1439 ;
   private String GXCCtl ;
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
   private String edtavnRcdDeleted_1440_Jsonclick ;
   private String edtRcNcFrn_Jsonclick ;
   private String edtRcNcV4_Jsonclick ;
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
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10815RcNcV4 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T019D6_A407EmprNom ;
   private boolean[] T019D6_n407EmprNom ;
   private long[] T019D8_A10813RcNcGrn ;
   private String[] T019D8_A407EmprNom ;
   private boolean[] T019D8_n407EmprNom ;
   private String[] T019D8_A396EmprCod ;
   private java.util.Date[] T019D8_A10715RcNcFec ;
   private int[] T019D8_A10717RcNcLin ;
   private String[] T019D7_A396EmprCod ;
   private String[] T019D9_A396EmprCod ;
   private String[] T019D10_A396EmprCod ;
   private java.util.Date[] T019D10_A10715RcNcFec ;
   private int[] T019D10_A10717RcNcLin ;
   private long[] T019D10_A10813RcNcGrn ;
   private long[] T019D5_A10813RcNcGrn ;
   private String[] T019D5_A396EmprCod ;
   private java.util.Date[] T019D5_A10715RcNcFec ;
   private int[] T019D5_A10717RcNcLin ;
   private String[] T019D11_A396EmprCod ;
   private java.util.Date[] T019D11_A10715RcNcFec ;
   private int[] T019D11_A10717RcNcLin ;
   private long[] T019D11_A10813RcNcGrn ;
   private String[] T019D12_A396EmprCod ;
   private java.util.Date[] T019D12_A10715RcNcFec ;
   private int[] T019D12_A10717RcNcLin ;
   private long[] T019D12_A10813RcNcGrn ;
   private long[] T019D4_A10813RcNcGrn ;
   private String[] T019D4_A396EmprCod ;
   private java.util.Date[] T019D4_A10715RcNcFec ;
   private int[] T019D4_A10717RcNcLin ;
   private String[] T019D15_A396EmprCod ;
   private java.util.Date[] T019D15_A10715RcNcFec ;
   private int[] T019D15_A10717RcNcLin ;
   private long[] T019D15_A10813RcNcGrn ;
   private java.util.Date[] T019D16_A10715RcNcFec ;
   private int[] T019D16_A10717RcNcLin ;
   private long[] T019D16_A10813RcNcGrn ;
   private int[] T019D16_A10814RcNcFrn ;
   private java.math.BigDecimal[] T019D16_A10815RcNcV4 ;
   private boolean[] T019D16_n10815RcNcV4 ;
   private String[] T019D16_A396EmprCod ;
   private String[] T019D17_A396EmprCod ;
   private java.util.Date[] T019D17_A10715RcNcFec ;
   private int[] T019D17_A10717RcNcLin ;
   private long[] T019D17_A10813RcNcGrn ;
   private int[] T019D17_A10814RcNcFrn ;
   private java.util.Date[] T019D3_A10715RcNcFec ;
   private int[] T019D3_A10717RcNcLin ;
   private long[] T019D3_A10813RcNcGrn ;
   private int[] T019D3_A10814RcNcFrn ;
   private java.math.BigDecimal[] T019D3_A10815RcNcV4 ;
   private boolean[] T019D3_n10815RcNcV4 ;
   private String[] T019D3_A396EmprCod ;
   private java.util.Date[] T019D2_A10715RcNcFec ;
   private int[] T019D2_A10717RcNcLin ;
   private long[] T019D2_A10813RcNcGrn ;
   private int[] T019D2_A10814RcNcFrn ;
   private java.math.BigDecimal[] T019D2_A10815RcNcV4 ;
   private boolean[] T019D2_n10815RcNcV4 ;
   private String[] T019D2_A396EmprCod ;
   private String[] T019D21_A396EmprCod ;
   private java.util.Date[] T019D21_A10715RcNcFec ;
   private int[] T019D21_A10717RcNcLin ;
   private long[] T019D21_A10813RcNcGrn ;
   private int[] T019D21_A10814RcNcFrn ;
   private String[] T019D22_A407EmprNom ;
   private boolean[] T019D22_n407EmprNom ;
   private String[] T019D23_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trcnc04__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc04__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc04__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc04__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trcnc04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T019D2", "SELECT RcNcFec, RcNcLin, RcNcGrn, RcNcFrn, RcNcV4, EmprCod FROM TXPRCNC04 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? AND RcNcFrn = ?  FOR UPDATE OF RcNcV4 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D3", "SELECT RcNcFec, RcNcLin, RcNcGrn, RcNcFrn, RcNcV4, EmprCod FROM TXPRCNC04 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? AND RcNcFrn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D4", "SELECT RcNcGrn, EmprCod, RcNcFec, RcNcLin FROM TXPRCNC02 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ?  FOR UPDATE OF RcNcGrn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D5", "SELECT RcNcGrn, EmprCod, RcNcFec, RcNcLin FROM TXPRCNC02 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D7", "SELECT EmprCod FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D8", "SELECT /*+ FIRST_ROWS(100) */ TM1.RcNcGrn, T2.EmprNom, TM1.EmprCod, TM1.RcNcFec, TM1.RcNcLin FROM (TXPRCNC02 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.RcNcFec = ? and TM1.RcNcLin = ? and TM1.RcNcGrn = ? ORDER BY TM1.EmprCod, TM1.RcNcFec, TM1.RcNcLin, TM1.RcNcGrn ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D9", "SELECT EmprCod FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE ( RcNcFec > ? or RcNcFec = ? and RcNcLin > ? or RcNcLin = ? and RcNcFec = ? and RcNcGrn > ?) and EmprCod = ? ORDER BY EmprCod, RcNcFec, RcNcLin, RcNcGrn) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T019D12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE ( RcNcFec < ? or RcNcFec = ? and RcNcLin < ? or RcNcLin = ? and RcNcFec = ? and RcNcGrn < ?) and EmprCod = ? ORDER BY EmprCod DESC, RcNcFec DESC, RcNcLin DESC, RcNcGrn DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T019D13", "INSERT INTO TXPRCNC02(RcNcGrn, EmprCod, RcNcFec, RcNcLin, RcNcKgG) VALUES(?, ?, ?, ?, 0)", GX_NOMASK, "TXPRCNC02")
         ,new UpdateCursor("T019D14", "DELETE FROM TXPRCNC02  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ?", GX_NOMASK, "TXPRCNC02")
         ,new ForEachCursor("T019D15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, RcNcFec, RcNcLin, RcNcGrn FROM TXPRCNC02 WHERE EmprCod = ? ORDER BY EmprCod, RcNcFec, RcNcLin, RcNcGrn ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D16", "SELECT RcNcFec, RcNcLin, RcNcGrn, RcNcFrn, RcNcV4, EmprCod FROM TXPRCNC04 WHERE EmprCod = ? and RcNcFec = ? and RcNcLin = ? and RcNcGrn = ? and RcNcFrn = ? ORDER BY EmprCod, RcNcFec, RcNcLin, RcNcGrn, RcNcFrn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D17", "SELECT EmprCod, RcNcFec, RcNcLin, RcNcGrn, RcNcFrn FROM TXPRCNC04 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? AND RcNcFrn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T019D18", "INSERT INTO TXPRCNC04(RcNcFec, RcNcLin, RcNcGrn, RcNcFrn, RcNcV4, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRCNC04")
         ,new UpdateCursor("T019D19", "UPDATE TXPRCNC04 SET RcNcV4=?  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? AND RcNcFrn = ?", GX_NOMASK, "TXPRCNC04")
         ,new UpdateCursor("T019D20", "DELETE FROM TXPRCNC04  WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? AND RcNcGrn = ? AND RcNcFrn = ?", GX_NOMASK, "TXPRCNC04")
         ,new ForEachCursor("T019D21", "SELECT EmprCod, RcNcFec, RcNcLin, RcNcGrn, RcNcFrn FROM TXPRCNC04 WHERE EmprCod = ? and RcNcFec = ? and RcNcLin = ? and RcNcGrn = ? ORDER BY EmprCod, RcNcFec, RcNcLin, RcNcGrn, RcNcFrn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T019D23", "SELECT EmprCod FROM TXPRCNC01 WHERE EmprCod = ? AND RcNcFec = ? AND RcNcLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 14 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 16 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(6, (String)parms[6], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setLong(5, ((Number) parms[5]).longValue());
               stmt.setInt(6, ((Number) parms[6]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

