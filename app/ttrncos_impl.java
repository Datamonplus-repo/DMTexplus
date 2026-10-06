package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrncos_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
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
         gxload_11( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COSTES TRANSPORTISTA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTrnCod_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      A11062Trn_Ultl = (short)(GXutil.lval( httpContext.GetPar( "Trn_Ultl"))) ;
      n11062Trn_Ultl = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public ttrncos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrncos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrncos_impl.class ));
   }

   public ttrncos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTRNCOS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Dia Factura", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtTrn_Diaf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrn_Diaf_Internalname, localUtil.format(A11061Trn_Diaf, "99/99/99"), localUtil.format( A11061Trn_Diaf, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrn_Diaf_Jsonclick, 0, "", "", "", "", "", 1, edtTrn_Diaf_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRNCOS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtTrn_Diaf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTrn_Diaf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTRNCOS.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrn_Ultl_Internalname, GXutil.ltrim( localUtil.ntoc( A11062Trn_Ultl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrn_Ultl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11062Trn_Ultl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11062Trn_Ultl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrn_Ultl_Jsonclick, 0, "", "", "", "", "", 1, edtTrn_Ultl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTRNCOS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1476 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1476 = (short)(1) ;
            scanStart1AL1476( ) ;
            while ( RcdFound1476 != 0 )
            {
               init_level_properties1476( ) ;
               getByPrimaryKey1AL1476( ) ;
               addRow1AL1476( ) ;
               scanNext1AL1476( ) ;
            }
            scanEnd1AL1476( ) ;
            nBlankRcdCount1476 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11062Trn_Ultl = A11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         standaloneNotModal1AL1476( ) ;
         standaloneModal1AL1476( ) ;
         sMode1476 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1AL1476( ) ;
            edtavnRcdDeleted_1476_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1476_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1476_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1476_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTrn_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRN_LIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrn_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTrn_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRN_KGS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrn_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Kgs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTrn_val_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRN_VAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTrn_val_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_val_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1476 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AL1476( ) ;
            }
            sendRow1AL1476( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11062Trn_Ultl = B11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1476 = (short)(5) ;
         nRcdExists_1476 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AL1476( ) ;
            while ( RcdFound1476 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501476( ) ;
               init_level_properties1476( ) ;
               standaloneNotModal1AL1476( ) ;
               getByPrimaryKey1AL1476( ) ;
               standaloneModal1AL1476( ) ;
               addRow1AL1476( ) ;
               scanNext1AL1476( ) ;
            }
            scanEnd1AL1476( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1476 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501476( ) ;
      initAll1AL1476( ) ;
      init_level_properties1476( ) ;
      B11062Trn_Ultl = A11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      nRcdExists_1476 = (short)(0) ;
      nIsMod_1476 = (short)(0) ;
      nRcdDeleted_1476 = (short)(0) ;
      nBlankRcdCount1476 = (short)(nBlankRcdUsr1476+nBlankRcdCount1476) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1476 > 0 )
      {
         standaloneNotModal1AL1476( ) ;
         standaloneModal1AL1476( ) ;
         addRow1AL1476( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTrn_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1476 = (short)(nBlankRcdCount1476-1) ;
      }
      Gx_mode = sMode1476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11062Trn_Ultl = B11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTRNCOS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTRNCOS.htm");
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
      e111AL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11061Trn_Diaf = localUtil.ctod( httpContext.cgiGet( "Z11061Trn_Diaf"), 0) ;
            Z11062Trn_Ultl = (short)(localUtil.ctol( httpContext.cgiGet( "Z11062Trn_Ultl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11062Trn_Ultl = (short)(localUtil.ctol( httpContext.cgiGet( "O11062Trn_Ultl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            if ( localUtil.vcdate( httpContext.cgiGet( edtTrn_Diaf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TRN_DIAF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrn_Diaf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11061Trn_Diaf = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
            }
            else
            {
               A11061Trn_Diaf = localUtil.ctod( httpContext.cgiGet( edtTrn_Diaf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
            }
            A11062Trn_Ultl = (short)(localUtil.ctol( httpContext.cgiGet( edtTrn_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11062Trn_Ultl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
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
               A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A11061Trn_Diaf = localUtil.parseDateParm( httpContext.GetPar( "Trn_Diaf")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
               getEqualNoModal( ) ;
               if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11061Trn_Diaf)) && ( Gx_BScreen == 0 ) )
               {
                  A11061Trn_Diaf = GXutil.today( ) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
               }
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
                        e111AL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'INFORME'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Informe' */
                        e121AL2 ();
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
            initAll1AL1475( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1476_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1476_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1AL1475( ) ;
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

   public void confirm_1AL0( )
   {
      beforeValidate1AL1475( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AL1475( ) ;
         }
         else
         {
            checkExtendedTable1AL1475( ) ;
            if ( AnyError == 0 )
            {
               zm1AL1475( 8) ;
               zm1AL1475( 9) ;
            }
            closeExtendedTableCursors1AL1475( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1475 = Gx_mode ;
         confirm_1AL1476( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1475 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AL0( ) ;
      }
   }

   public void confirm_1AL1476( )
   {
      s11062Trn_Ultl = O11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1AL1476( ) ;
         if ( ( nRcdExists_1476 != 0 ) || ( nIsMod_1476 != 0 ) )
         {
            getKey1AL1476( ) ;
            if ( ( nRcdExists_1476 == 0 ) && ( nRcdDeleted_1476 == 0 ) )
            {
               if ( RcdFound1476 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AL1476( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AL1476( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1AL1476( 11) ;
                     }
                     closeExtendedTableCursors1AL1476( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11062Trn_Ultl = A11062Trn_Ultl ;
                     n11062Trn_Ultl = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "TRN_LIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrn_Lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1476 != 0 )
               {
                  if ( nRcdDeleted_1476 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AL1476( ) ;
                     load1AL1476( ) ;
                     beforeValidate1AL1476( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AL1476( ) ;
                        O11062Trn_Ultl = A11062Trn_Ultl ;
                        n11062Trn_Ultl = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1476 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AL1476( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AL1476( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1AL1476( 11) ;
                           }
                           closeExtendedTableCursors1AL1476( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11062Trn_Ultl = A11062Trn_Ultl ;
                           n11062Trn_Ultl = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1476 == 0 )
                  {
                     GXCCtl = "TRN_LIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTrn_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1476_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTrn_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A11063Trn_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtTrn_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A11064Trn_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTrn_val_Internalname, GXutil.ltrim( localUtil.ntoc( A11065Trn_val, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11063Trn_Lin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11063Trn_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11064Trn_Kgs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11064Trn_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11065Trn_val_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11065Trn_val, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1476_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1476_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1476_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1476 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1476_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1476_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRN_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRN_KGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRN_VAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_val_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11062Trn_Ultl = s11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AL0( )
   {
   }

   public void e111AL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrncos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttrncos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrncos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrncos_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrncos_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrncos_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121AL2( )
   {
      /* 'Informe' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A840TrnCod ;
      GXv_date6[0] = A11061Trn_Diaf ;
      new app.rtrncos(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_date6) ;
      ttrncos_impl.this.A396EmprCod = GXv_char4[0] ;
      ttrncos_impl.this.A840TrnCod = GXv_int5[0] ;
      ttrncos_impl.this.A11061Trn_Diaf = GXv_date6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
      /*  Sending Event outputs  */
   }

   public void zm1AL1475( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11062Trn_Ultl = T01AL6_A11062Trn_Ultl[0] ;
         }
         else
         {
            Z11062Trn_Ultl = A11062Trn_Ultl ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z11061Trn_Diaf = A11061Trn_Diaf ;
         Z11062Trn_Ultl = A11062Trn_Ultl ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z407EmprNom = A407EmprNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTrn_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Ultl_Enabled), 5, 0), true);
      AV33Pgmname = "TTRNCOS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtTrn_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Ultl_Enabled), 5, 0), true);
      /* Using cursor T01AL7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AL7_A407EmprNom[0] ;
      n407EmprNom = T01AL7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11061Trn_Diaf)) && ( Gx_BScreen == 0 ) )
      {
         A11061Trn_Diaf = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
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

   public void load1AL1475( )
   {
      /* Using cursor T01AL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1475 = (short)(1) ;
         A407EmprNom = T01AL9_A407EmprNom[0] ;
         n407EmprNom = T01AL9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A841TrnNom = T01AL9_A841TrnNom[0] ;
         n841TrnNom = T01AL9_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A11062Trn_Ultl = T01AL9_A11062Trn_Ultl[0] ;
         n11062Trn_Ultl = T01AL9_n11062Trn_Ultl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         zm1AL1475( -7) ;
      }
      pr_default.close(7);
      onLoadActions1AL1475( ) ;
   }

   public void onLoadActions1AL1475( )
   {
   }

   public void checkExtendedTable1AL1475( )
   {
      nIsDirty_1475 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01AL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01AL8_A841TrnNom[0] ;
      n841TrnNom = T01AL8_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(6);
      if ( ( A840TrnCod == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Transportista sin Valor", ""), 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AL1475( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         short A840TrnCod )
   {
      /* Using cursor T01AL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01AL10_A841TrnNom[0] ;
      n841TrnNom = T01AL10_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1AL1475( )
   {
      /* Using cursor T01AL11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1475 = (short)(1) ;
      }
      else
      {
         RcdFound1475 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AL6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01AL6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AL1475( 7) ;
         RcdFound1475 = (short)(1) ;
         A11061Trn_Diaf = T01AL6_A11061Trn_Diaf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
         A11062Trn_Ultl = T01AL6_A11062Trn_Ultl[0] ;
         n11062Trn_Ultl = T01AL6_n11062Trn_Ultl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         A840TrnCod = T01AL6_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         O11062Trn_Ultl = A11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z11061Trn_Diaf = A11061Trn_Diaf ;
         sMode1475 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AL1475( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1475 = (short)(0) ;
            initializeNonKey1AL1475( ) ;
         }
         Gx_mode = sMode1475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1475 = (short)(0) ;
         initializeNonKey1AL1475( ) ;
         sMode1475 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1AL1475( ) ;
      if ( RcdFound1475 == 0 )
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
      RcdFound1475 = (short)(0) ;
      /* Using cursor T01AL12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A840TrnCod), Short.valueOf(A840TrnCod), A11061Trn_Diaf, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01AL12_A840TrnCod[0] < A840TrnCod ) || ( T01AL12_A840TrnCod[0] == A840TrnCod ) && GXutil.resetTime(T01AL12_A11061Trn_Diaf[0]).before( GXutil.resetTime( A11061Trn_Diaf )) ) && ( GXutil.strcmp(T01AL12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01AL12_A840TrnCod[0] > A840TrnCod ) || ( T01AL12_A840TrnCod[0] == A840TrnCod ) && GXutil.resetTime(T01AL12_A11061Trn_Diaf[0]).after( GXutil.resetTime( A11061Trn_Diaf )) ) && ( GXutil.strcmp(T01AL12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A840TrnCod = T01AL12_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A11061Trn_Diaf = T01AL12_A11061Trn_Diaf[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
            RcdFound1475 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1475 = (short)(0) ;
      /* Using cursor T01AL13 */
      pr_default.execute(11, new Object[] {Short.valueOf(A840TrnCod), Short.valueOf(A840TrnCod), A11061Trn_Diaf, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01AL13_A840TrnCod[0] > A840TrnCod ) || ( T01AL13_A840TrnCod[0] == A840TrnCod ) && GXutil.resetTime(T01AL13_A11061Trn_Diaf[0]).after( GXutil.resetTime( A11061Trn_Diaf )) ) && ( GXutil.strcmp(T01AL13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01AL13_A840TrnCod[0] < A840TrnCod ) || ( T01AL13_A840TrnCod[0] == A840TrnCod ) && GXutil.resetTime(T01AL13_A11061Trn_Diaf[0]).before( GXutil.resetTime( A11061Trn_Diaf )) ) && ( GXutil.strcmp(T01AL13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A840TrnCod = T01AL13_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A11061Trn_Diaf = T01AL13_A11061Trn_Diaf[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
            RcdFound1475 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AL1475( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11062Trn_Ultl = O11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AL1475( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1475 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11061Trn_Diaf), GXutil.resetTime(Z11061Trn_Diaf)) ) )
            {
               A840TrnCod = Z840TrnCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
               A11061Trn_Diaf = Z11061Trn_Diaf ;
               httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11062Trn_Ultl = O11062Trn_Ultl ;
               n11062Trn_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11062Trn_Ultl = O11062Trn_Ultl ;
               n11062Trn_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
               update1AL1475( ) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11061Trn_Diaf), GXutil.resetTime(Z11061Trn_Diaf)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11062Trn_Ultl = O11062Trn_Ultl ;
               n11062Trn_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AL1475( ) ;
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
                  A11062Trn_Ultl = O11062Trn_Ultl ;
                  n11062Trn_Ultl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AL1475( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11061Trn_Diaf), GXutil.resetTime(Z11061Trn_Diaf)) ) )
      {
         A840TrnCod = Z840TrnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A11061Trn_Diaf = Z11061Trn_Diaf ;
         httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11062Trn_Ultl = O11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTrnCod_Internalname ;
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
      getKey1AL1475( ) ;
      if ( RcdFound1475 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11061Trn_Diaf), GXutil.resetTime(Z11061Trn_Diaf)) ) )
         {
            A840TrnCod = Z840TrnCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A11061Trn_Diaf = Z11061Trn_Diaf ;
            httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A840TrnCod != Z840TrnCod ) || !( GXutil.dateCompare(GXutil.resetTime(A11061Trn_Diaf), GXutil.resetTime(Z11061Trn_Diaf)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrncos");
   }

   public void insert_check( )
   {
      confirm_1AL0( ) ;
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
      if ( RcdFound1475 == 0 )
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
      scanStart1AL1475( ) ;
      if ( RcdFound1475 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AL1475( ) ;
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
      if ( RcdFound1475 == 0 )
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
      if ( RcdFound1475 == 0 )
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
      scanStart1AL1475( ) ;
      if ( RcdFound1475 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1475 != 0 )
         {
            scanNext1AL1475( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AL1475( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AL1475( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AL5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRNCOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z11062Trn_Ultl != T01AL5_A11062Trn_Ultl[0] ) )
         {
            if ( Z11062Trn_Ultl != T01AL5_A11062Trn_Ultl[0] )
            {
               GXutil.writeLogln("ttrncos:[seudo value changed for attri]"+"Trn_Ultl");
               GXutil.writeLogRaw("Old: ",Z11062Trn_Ultl);
               GXutil.writeLogRaw("Current: ",T01AL5_A11062Trn_Ultl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRNCOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AL1475( )
   {
      beforeValidate1AL1475( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AL1475( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AL1475( 0) ;
         checkOptimisticConcurrency1AL1475( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AL1475( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AL1475( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AL14 */
                  pr_default.execute(12, new Object[] {A11061Trn_Diaf, Boolean.valueOf(n11062Trn_Ultl), Short.valueOf(A11062Trn_Ultl), A396EmprCod, Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCOS");
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
                        processLevel1AL1475( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AL0( ) ;
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
            load1AL1475( ) ;
         }
         endLevel1AL1475( ) ;
      }
      closeExtendedTableCursors1AL1475( ) ;
   }

   public void update1AL1475( )
   {
      beforeValidate1AL1475( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AL1475( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AL1475( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AL1475( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AL1475( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AL15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n11062Trn_Ultl), Short.valueOf(A11062Trn_Ultl), A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCOS");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRNCOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AL1475( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AL1475( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AL0( ) ;
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
         endLevel1AL1475( ) ;
      }
      closeExtendedTableCursors1AL1475( ) ;
   }

   public void deferredUpdate1AL1475( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AL1475( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AL1475( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AL1475( ) ;
         afterConfirm1AL1475( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AL1475( ) ;
            if ( AnyError == 0 )
            {
               A11062Trn_Ultl = O11062Trn_Ultl ;
               n11062Trn_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
               scanStart1AL1476( ) ;
               while ( RcdFound1476 != 0 )
               {
                  getByPrimaryKey1AL1476( ) ;
                  delete1AL1476( ) ;
                  scanNext1AL1476( ) ;
                  O11062Trn_Ultl = A11062Trn_Ultl ;
                  n11062Trn_Ultl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
               }
               scanEnd1AL1476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AL16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCOS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1475 == 0 )
                        {
                           initAll1AL1475( ) ;
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
                        resetCaption1AL0( ) ;
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
      sMode1475 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AL1475( ) ;
      Gx_mode = sMode1475 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AL1475( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AL17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01AL17_A841TrnNom[0] ;
         n841TrnNom = T01AL17_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(15);
      }
   }

   public void processNestedLevel1AL1476( )
   {
      s11062Trn_Ultl = O11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1AL1476( ) ;
         if ( ( nRcdExists_1476 != 0 ) || ( nIsMod_1476 != 0 ) )
         {
            standaloneNotModal1AL1476( ) ;
            getKey1AL1476( ) ;
            if ( ( nRcdExists_1476 == 0 ) && ( nRcdDeleted_1476 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AL1476( ) ;
            }
            else
            {
               if ( RcdFound1476 != 0 )
               {
                  if ( ( nRcdDeleted_1476 != 0 ) && ( nRcdExists_1476 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AL1476( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1476 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AL1476( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1476 == 0 )
                  {
                     GXCCtl = "TRN_LIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTrn_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11062Trn_Ultl = A11062Trn_Ultl ;
            n11062Trn_Ultl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1476_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTrn_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A11063Trn_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliNom_Internalname, GXutil.rtrim( A279CliNom)) ;
         httpContext.changePostValue( edtTrn_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A11064Trn_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTrn_val_Internalname, GXutil.ltrim( localUtil.ntoc( A11065Trn_val, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11063Trn_Lin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11063Trn_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11064Trn_Kgs_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11064Trn_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11065Trn_val_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11065Trn_val, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1476_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1476_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1476_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1476 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1476_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1476_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRN_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINOM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRN_KGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRN_VAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_val_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AL1476( ) ;
      if ( AnyError != 0 )
      {
         O11062Trn_Ultl = s11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      }
      nRcdExists_1476 = (short)(0) ;
      nIsMod_1476 = (short)(0) ;
      nRcdDeleted_1476 = (short)(0) ;
   }

   public void processLevel1AL1475( )
   {
      /* Save parent mode. */
      sMode1475 = Gx_mode ;
      processNestedLevel1AL1476( ) ;
      if ( AnyError != 0 )
      {
         O11062Trn_Ultl = s11062Trn_Ultl ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1475 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01AL18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n11062Trn_Ultl), Short.valueOf(A11062Trn_Ultl), A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCOS");
   }

   public void endLevel1AL1475( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete1AL1475( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrncos");
         if ( AnyError == 0 )
         {
            confirmValues1AL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrncos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AL1475( )
   {
      /* Scan By routine */
      /* Using cursor T01AL19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound1475 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1475 = (short)(1) ;
         A840TrnCod = T01AL19_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A11061Trn_Diaf = T01AL19_A11061Trn_Diaf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AL1475( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1475 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1475 = (short)(1) ;
         A840TrnCod = T01AL19_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A11061Trn_Diaf = T01AL19_A11061Trn_Diaf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
      }
   }

   public void scanEnd1AL1475( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1AL1475( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AL1475( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AL1475( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AL1475( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AL1475( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AL1475( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AL1475( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtTrn_Diaf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Diaf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Diaf_Enabled), 5, 0), true);
      edtTrn_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Ultl_Enabled), 5, 0), true);
   }

   public void zm1AL1476( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11064Trn_Kgs = T01AL3_A11064Trn_Kgs[0] ;
            Z11065Trn_val = T01AL3_A11065Trn_val[0] ;
            Z252CliCod = T01AL3_A252CliCod[0] ;
         }
         else
         {
            Z11064Trn_Kgs = A11064Trn_Kgs ;
            Z11065Trn_val = A11065Trn_val ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z840TrnCod = A840TrnCod ;
         Z11061Trn_Diaf = A11061Trn_Diaf ;
         Z11063Trn_Lin = A11063Trn_Lin ;
         Z11064Trn_Kgs = A11064Trn_Kgs ;
         Z11065Trn_val = A11065Trn_val ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal1AL1476( )
   {
      edtTrn_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Ultl_Enabled), 5, 0), true);
      edtTrn_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Ultl_Enabled), 5, 0), true);
   }

   public void standaloneModal1AL1476( )
   {
      if ( isIns( )  )
      {
         A11062Trn_Ultl = (short)(O11062Trn_Ultl+1) ;
         n11062Trn_Ultl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11063Trn_Lin = A11062Trn_Ultl ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTrn_Lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrn_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtTrn_Lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrn_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1AL1476( )
   {
      /* Using cursor T01AL20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1476 = (short)(1) ;
         A279CliNom = T01AL20_A279CliNom[0] ;
         A11064Trn_Kgs = T01AL20_A11064Trn_Kgs[0] ;
         n11064Trn_Kgs = T01AL20_n11064Trn_Kgs[0] ;
         A11065Trn_val = T01AL20_A11065Trn_val[0] ;
         n11065Trn_val = T01AL20_n11065Trn_val[0] ;
         A252CliCod = T01AL20_A252CliCod[0] ;
         n252CliCod = T01AL20_n252CliCod[0] ;
         zm1AL1476( -10) ;
      }
      pr_default.close(18);
      onLoadActions1AL1476( ) ;
   }

   public void onLoadActions1AL1476( )
   {
   }

   public void checkExtendedTable1AL1476( )
   {
      nIsDirty_1476 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1AL1476( ) ;
      /* Using cursor T01AL4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AL4_A279CliNom[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1AL1476( )
   {
      pr_default.close(2);
   }

   public void enableDisable1AL1476( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01AL21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AL21_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1AL1476( )
   {
      /* Using cursor T01AL22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1476 = (short)(1) ;
      }
      else
      {
         RcdFound1476 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1AL1476( )
   {
      /* Using cursor T01AL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01AL3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AL1476( 10) ;
         RcdFound1476 = (short)(1) ;
         initializeNonKey1AL1476( ) ;
         A11063Trn_Lin = T01AL3_A11063Trn_Lin[0] ;
         A11064Trn_Kgs = T01AL3_A11064Trn_Kgs[0] ;
         n11064Trn_Kgs = T01AL3_n11064Trn_Kgs[0] ;
         A11065Trn_val = T01AL3_A11065Trn_val[0] ;
         n11065Trn_val = T01AL3_n11065Trn_val[0] ;
         A252CliCod = T01AL3_A252CliCod[0] ;
         n252CliCod = T01AL3_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z11061Trn_Diaf = A11061Trn_Diaf ;
         Z11063Trn_Lin = A11063Trn_Lin ;
         sMode1476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AL1476( ) ;
         load1AL1476( ) ;
         Gx_mode = sMode1476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1476 = (short)(0) ;
         initializeNonKey1AL1476( ) ;
         sMode1476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AL1476( ) ;
         Gx_mode = sMode1476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AL1476( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AL1476( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRNCO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11064Trn_Kgs, T01AL2_A11064Trn_Kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z11065Trn_val, T01AL2_A11065Trn_val[0]) != 0 ) || ( Z252CliCod != T01AL2_A252CliCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11064Trn_Kgs, T01AL2_A11064Trn_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("ttrncos:[seudo value changed for attri]"+"Trn_Kgs");
               GXutil.writeLogRaw("Old: ",Z11064Trn_Kgs);
               GXutil.writeLogRaw("Current: ",T01AL2_A11064Trn_Kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z11065Trn_val, T01AL2_A11065Trn_val[0]) != 0 )
            {
               GXutil.writeLogln("ttrncos:[seudo value changed for attri]"+"Trn_val");
               GXutil.writeLogRaw("Old: ",Z11065Trn_val);
               GXutil.writeLogRaw("Current: ",T01AL2_A11065Trn_val[0]);
            }
            if ( Z252CliCod != T01AL2_A252CliCod[0] )
            {
               GXutil.writeLogln("ttrncos:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01AL2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRNCO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AL1476( )
   {
      beforeValidate1AL1476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AL1476( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AL1476( 0) ;
         checkOptimisticConcurrency1AL1476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AL1476( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AL1476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AL23 */
                  pr_default.execute(21, new Object[] {Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin), Boolean.valueOf(n11064Trn_Kgs), A11064Trn_Kgs, Boolean.valueOf(n11065Trn_val), A11065Trn_val, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCO1");
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
            load1AL1476( ) ;
         }
         endLevel1AL1476( ) ;
      }
      closeExtendedTableCursors1AL1476( ) ;
   }

   public void update1AL1476( )
   {
      beforeValidate1AL1476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AL1476( ) ;
      }
      if ( ( nIsMod_1476 != 0 ) || ( nIsDirty_1476 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AL1476( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AL1476( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AL1476( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AL24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n11064Trn_Kgs), A11064Trn_Kgs, Boolean.valueOf(n11065Trn_val), A11065Trn_val, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCO1");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRNCO1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AL1476( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AL1476( ) ;
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
            endLevel1AL1476( ) ;
         }
      }
      closeExtendedTableCursors1AL1476( ) ;
   }

   public void deferredUpdate1AL1476( )
   {
   }

   public void delete1AL1476( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AL1476( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AL1476( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AL1476( ) ;
         afterConfirm1AL1476( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AL1476( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AL25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf, Short.valueOf(A11063Trn_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRNCO1");
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
      sMode1476 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AL1476( ) ;
      Gx_mode = sMode1476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AL1476( )
   {
      standaloneModal1AL1476( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AL26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01AL26_A279CliNom[0] ;
         pr_default.close(24);
      }
   }

   public void endLevel1AL1476( )
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

   public void scanStart1AL1476( )
   {
      /* Scan By routine */
      /* Using cursor T01AL27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod), A11061Trn_Diaf});
      RcdFound1476 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1476 = (short)(1) ;
         A11063Trn_Lin = T01AL27_A11063Trn_Lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AL1476( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1476 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1476 = (short)(1) ;
         A11063Trn_Lin = T01AL27_A11063Trn_Lin[0] ;
      }
   }

   public void scanEnd1AL1476( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1AL1476( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AL1476( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AL1476( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AL1476( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AL1476( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AL1476( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AL1476( )
   {
      edtTrn_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTrn_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Kgs_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTrn_val_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_val_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_val_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1AL1476( )
   {
   }

   public void send_integrity_lvl_hashes1AL1475( )
   {
   }

   public void subsflControlProps_501476( )
   {
      edtavnRcdDeleted_1476_Internalname = "vNRCDDELETED_1476_"+sGXsfl_50_idx ;
      edtTrn_Lin_Internalname = "TRN_LIN_"+sGXsfl_50_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_50_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_50_idx ;
      edtTrn_Kgs_Internalname = "TRN_KGS_"+sGXsfl_50_idx ;
      edtTrn_val_Internalname = "TRN_VAL_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501476( )
   {
      edtavnRcdDeleted_1476_Internalname = "vNRCDDELETED_1476_"+sGXsfl_50_fel_idx ;
      edtTrn_Lin_Internalname = "TRN_LIN_"+sGXsfl_50_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_50_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_50_fel_idx ;
      edtTrn_Kgs_Internalname = "TRN_KGS_"+sGXsfl_50_fel_idx ;
      edtTrn_val_Internalname = "TRN_VAL_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1AL1476( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501476( ) ;
      sendRow1AL1476( ) ;
   }

   public void sendRow1AL1476( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1476_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1476_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1476_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1476), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1476), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1476_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1476_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1476_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrn_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A11063Trn_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11063Trn_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrn_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTrn_Lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1476_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1476_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrn_Kgs_Internalname,GXutil.ltrim( localUtil.ntoc( A11064Trn_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTrn_Kgs_Enabled!=0) ? localUtil.format( A11064Trn_Kgs, "ZZZZZ9.99") : localUtil.format( A11064Trn_Kgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrn_Kgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTrn_Kgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1476_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrn_val_Internalname,GXutil.ltrim( localUtil.ntoc( A11065Trn_val, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTrn_val_Enabled!=0) ? localUtil.format( A11065Trn_val, "ZZZZZZZZ9.999") : localUtil.format( A11065Trn_val, "ZZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrn_val_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTrn_val_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AL1476( ) ;
      GXCCtl = "Z11063Trn_Lin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11063Trn_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11064Trn_Kgs_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11064Trn_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11065Trn_val_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11065Trn_val, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z252CliCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1476_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1476_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1476_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1476_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1476_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRN_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRN_KGS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRN_VAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_val_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AL1476( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501476( ) ;
      edtavnRcdDeleted_1476_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1476_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTrn_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRN_LIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINOM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTrn_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRN_KGS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTrn_val_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRN_VAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1476_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1476_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1476");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1476_Internalname ;
         wbErr = true ;
         nRcdDeleted_1476 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1476 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1476_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrn_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrn_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TRN_LIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrn_Lin_Internalname ;
         wbErr = true ;
         A11063Trn_Lin = (short)(0) ;
      }
      else
      {
         A11063Trn_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtTrn_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CLICOD_" + sGXsfl_50_idx ;
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
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTrn_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTrn_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "TRN_KGS_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrn_Kgs_Internalname ;
         wbErr = true ;
         A11064Trn_Kgs = DecimalUtil.ZERO ;
         n11064Trn_Kgs = false ;
      }
      else
      {
         A11064Trn_Kgs = localUtil.ctond( httpContext.cgiGet( edtTrn_Kgs_Internalname)) ;
         n11064Trn_Kgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTrn_val_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTrn_val_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "TRN_VAL_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrn_val_Internalname ;
         wbErr = true ;
         A11065Trn_val = DecimalUtil.ZERO ;
         n11065Trn_val = false ;
      }
      else
      {
         A11065Trn_val = localUtil.ctond( httpContext.cgiGet( edtTrn_val_Internalname)) ;
         n11065Trn_val = false ;
      }
      GXCCtl = "Z11063Trn_Lin_" + sGXsfl_50_idx ;
      Z11063Trn_Lin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11064Trn_Kgs_" + sGXsfl_50_idx ;
      Z11064Trn_Kgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11065Trn_val_" + sGXsfl_50_idx ;
      Z11065Trn_val = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z252CliCod_" + sGXsfl_50_idx ;
      Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1476_" + sGXsfl_50_idx ;
      nRcdDeleted_1476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1476_" + sGXsfl_50_idx ;
      nRcdExists_1476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1476_" + sGXsfl_50_idx ;
      nIsMod_1476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTrn_Lin_Enabled = edtTrn_Lin_Enabled ;
   }

   public void confirmValues1AL0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501476( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501476( ) ;
         httpContext.changePostValue( "Z11063Trn_Lin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11063Trn_Lin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11063Trn_Lin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11064Trn_Kgs_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11064Trn_Kgs_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11064Trn_Kgs_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11065Trn_val_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11065Trn_val_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11065Trn_val_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z252CliCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z252CliCod_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrncos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11061Trn_Diaf", localUtil.dtoc( Z11061Trn_Diaf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11062Trn_Ultl", GXutil.ltrim( localUtil.ntoc( Z11062Trn_Ultl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11062Trn_Ultl", GXutil.ltrim( localUtil.ntoc( O11062Trn_Ultl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrncos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTRNCOS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COSTES TRANSPORTISTA", "") ;
   }

   public void initializeNonKey1AL1475( )
   {
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A11062Trn_Ultl = (short)(0) ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      O11062Trn_Ultl = A11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
      Z11062Trn_Ultl = (short)(0) ;
   }

   public void initAll1AL1475( )
   {
      A840TrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A11061Trn_Diaf = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11061Trn_Diaf", localUtil.format(A11061Trn_Diaf, "99/99/99"));
      initializeNonKey1AL1475( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AL1476( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      A279CliNom = "" ;
      A11064Trn_Kgs = DecimalUtil.ZERO ;
      n11064Trn_Kgs = false ;
      A11065Trn_val = DecimalUtil.ZERO ;
      n11065Trn_val = false ;
      Z11064Trn_Kgs = DecimalUtil.ZERO ;
      Z11065Trn_val = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
   }

   public void initAll1AL1476( )
   {
      A11063Trn_Lin = (short)(0) ;
      initializeNonKey1AL1476( ) ;
   }

   public void standaloneModalInsert1AL1476( )
   {
      A11062Trn_Ultl = i11062Trn_Ultl ;
      n11062Trn_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11062Trn_Ultl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241561740", true, true);
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
      httpContext.AddJavascriptSource("ttrncos.js", "?20268241561740", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1476( )
   {
      edtTrn_Lin_Enabled = defedtTrn_Lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrn_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrn_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1476, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1476_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11063Trn_Lin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11064Trn_Kgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11065Trn_val, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTrn_val_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTrn_Diaf_Internalname = "TRN_DIAF" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTrn_Ultl_Internalname = "TRN_ULTL" ;
      edtavnRcdDeleted_1476_Internalname = "vNRCDDELETED_1476" ;
      edtTrn_Lin_Internalname = "TRN_LIN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtTrn_Kgs_Internalname = "TRN_KGS" ;
      edtTrn_val_Internalname = "TRN_VAL" ;
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
      Form.setCaption( httpContext.getMessage( "COSTES TRANSPORTISTA", "") );
      edtTrn_val_Jsonclick = "" ;
      edtTrn_Kgs_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtTrn_Lin_Jsonclick = "" ;
      edtavnRcdDeleted_1476_Jsonclick = "" ;
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
      edtTrn_val_Enabled = 1 ;
      edtTrn_Kgs_Enabled = 1 ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Enabled = 1 ;
      edtTrn_Lin_Enabled = 1 ;
      edtavnRcdDeleted_1476_Enabled = 1 ;
      edtTrn_Ultl_Jsonclick = "" ;
      edtTrn_Ultl_Backcolor = (int)(0xFFFFFF) ;
      edtTrn_Ultl_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTrn_Diaf_Jsonclick = "" ;
      edtTrn_Diaf_Backcolor = (int)(0xFFFFFF) ;
      edtTrn_Diaf_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
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
      subsflControlProps_501476( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AL1476( ) ;
         standaloneModal1AL1476( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AL1476( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501476( ) ;
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
      /* Using cursor T01AL28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AL28_A407EmprNom[0] ;
      n407EmprNom = T01AL28_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T01AL17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01AL17_A841TrnNom[0] ;
      n841TrnNom = T01AL17_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(15);
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

   public void valid_Trncod( )
   {
      n841TrnNom = false ;
      /* Using cursor T01AL17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
      }
      A841TrnNom = T01AL17_A841TrnNom[0] ;
      n841TrnNom = T01AL17_n841TrnNom[0] ;
      pr_default.close(15);
      if ( ( A840TrnCod == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Transportista sin Valor", ""), 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTrnCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Trn_diaf( )
   {
      n11062Trn_Ultl = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11062Trn_Ultl", GXutil.ltrim( localUtil.ntoc( A11062Trn_Ultl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11061Trn_Diaf", localUtil.format(Z11061Trn_Diaf, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11062Trn_Ultl", GXutil.ltrim( localUtil.ntoc( Z11062Trn_Ultl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "O11062Trn_Ultl", GXutil.ltrim( localUtil.ntoc( O11062Trn_Ultl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01AL26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01AL26_A279CliNom[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("'INFORME'","{handler:'e121AL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A11061Trn_Diaf',fld:'TRN_DIAF',pic:''}]");
      setEventMetadata("'INFORME'",",oparms:[{av:'A11061Trn_Diaf',fld:'TRN_DIAF',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_TRN_DIAF","{handler:'valid_Trn_diaf',iparms:[{av:'A11062Trn_Ultl',fld:'TRN_ULTL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A11061Trn_Diaf',fld:'TRN_DIAF',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TRN_DIAF",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11062Trn_Ultl',fld:'TRN_ULTL',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z840TrnCod'},{av:'Z11061Trn_Diaf'},{av:'Z407EmprNom'},{av:'Z11062Trn_Ultl'},{av:'Z841TrnNom'},{av:'O11062Trn_Ultl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TRN_ULTL","{handler:'valid_Trn_ultl',iparms:[]");
      setEventMetadata("VALID_TRN_ULTL",",oparms:[]}");
      setEventMetadata("VALID_TRN_LIN","{handler:'valid_Trn_lin',iparms:[]");
      setEventMetadata("VALID_TRN_LIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Trn_val',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(26);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11061Trn_Diaf = GXutil.nullDate() ;
      Z11064Trn_Kgs = DecimalUtil.ZERO ;
      Z11065Trn_val = DecimalUtil.ZERO ;
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
      lblTextblock4_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A11061Trn_Diaf = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1476 = "" ;
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
      sMode1475 = "" ;
      GXCCtl = "" ;
      A279CliNom = "" ;
      A11064Trn_Kgs = DecimalUtil.ZERO ;
      A11065Trn_val = DecimalUtil.ZERO ;
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
      GXv_int5 = new short[1] ;
      GXv_date6 = new java.util.Date[1] ;
      Z407EmprNom = "" ;
      Z841TrnNom = "" ;
      T01AL7_A407EmprNom = new String[] {""} ;
      T01AL7_n407EmprNom = new boolean[] {false} ;
      T01AL9_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL9_A407EmprNom = new String[] {""} ;
      T01AL9_n407EmprNom = new boolean[] {false} ;
      T01AL9_A841TrnNom = new String[] {""} ;
      T01AL9_n841TrnNom = new boolean[] {false} ;
      T01AL9_A11062Trn_Ultl = new short[1] ;
      T01AL9_n11062Trn_Ultl = new boolean[] {false} ;
      T01AL9_A396EmprCod = new String[] {""} ;
      T01AL9_A840TrnCod = new short[1] ;
      T01AL8_A841TrnNom = new String[] {""} ;
      T01AL8_n841TrnNom = new boolean[] {false} ;
      T01AL10_A841TrnNom = new String[] {""} ;
      T01AL10_n841TrnNom = new boolean[] {false} ;
      T01AL11_A396EmprCod = new String[] {""} ;
      T01AL11_A840TrnCod = new short[1] ;
      T01AL11_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL6_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL6_A11062Trn_Ultl = new short[1] ;
      T01AL6_n11062Trn_Ultl = new boolean[] {false} ;
      T01AL6_A396EmprCod = new String[] {""} ;
      T01AL6_A840TrnCod = new short[1] ;
      T01AL12_A396EmprCod = new String[] {""} ;
      T01AL12_A840TrnCod = new short[1] ;
      T01AL12_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL13_A396EmprCod = new String[] {""} ;
      T01AL13_A840TrnCod = new short[1] ;
      T01AL13_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL5_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL5_A11062Trn_Ultl = new short[1] ;
      T01AL5_n11062Trn_Ultl = new boolean[] {false} ;
      T01AL5_A396EmprCod = new String[] {""} ;
      T01AL5_A840TrnCod = new short[1] ;
      T01AL17_A841TrnNom = new String[] {""} ;
      T01AL17_n841TrnNom = new boolean[] {false} ;
      T01AL19_A396EmprCod = new String[] {""} ;
      T01AL19_A840TrnCod = new short[1] ;
      T01AL19_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      Z279CliNom = "" ;
      T01AL20_A840TrnCod = new short[1] ;
      T01AL20_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL20_A11063Trn_Lin = new short[1] ;
      T01AL20_A279CliNom = new String[] {""} ;
      T01AL20_A11064Trn_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AL20_n11064Trn_Kgs = new boolean[] {false} ;
      T01AL20_A11065Trn_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AL20_n11065Trn_val = new boolean[] {false} ;
      T01AL20_A396EmprCod = new String[] {""} ;
      T01AL20_A252CliCod = new int[1] ;
      T01AL20_n252CliCod = new boolean[] {false} ;
      T01AL4_A279CliNom = new String[] {""} ;
      T01AL21_A279CliNom = new String[] {""} ;
      T01AL22_A396EmprCod = new String[] {""} ;
      T01AL22_A840TrnCod = new short[1] ;
      T01AL22_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL22_A11063Trn_Lin = new short[1] ;
      T01AL3_A840TrnCod = new short[1] ;
      T01AL3_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL3_A11063Trn_Lin = new short[1] ;
      T01AL3_A11064Trn_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AL3_n11064Trn_Kgs = new boolean[] {false} ;
      T01AL3_A11065Trn_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AL3_n11065Trn_val = new boolean[] {false} ;
      T01AL3_A396EmprCod = new String[] {""} ;
      T01AL3_A252CliCod = new int[1] ;
      T01AL3_n252CliCod = new boolean[] {false} ;
      T01AL2_A840TrnCod = new short[1] ;
      T01AL2_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL2_A11063Trn_Lin = new short[1] ;
      T01AL2_A11064Trn_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AL2_n11064Trn_Kgs = new boolean[] {false} ;
      T01AL2_A11065Trn_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AL2_n11065Trn_val = new boolean[] {false} ;
      T01AL2_A396EmprCod = new String[] {""} ;
      T01AL2_A252CliCod = new int[1] ;
      T01AL2_n252CliCod = new boolean[] {false} ;
      T01AL26_A279CliNom = new String[] {""} ;
      T01AL27_A396EmprCod = new String[] {""} ;
      T01AL27_A840TrnCod = new short[1] ;
      T01AL27_A11061Trn_Diaf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AL27_A11063Trn_Lin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AL28_A407EmprNom = new String[] {""} ;
      T01AL28_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11061Trn_Diaf = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ841TrnNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrncos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrncos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrncos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrncos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrncos__default(),
         new Object[] {
             new Object[] {
            T01AL2_A840TrnCod, T01AL2_A11061Trn_Diaf, T01AL2_A11063Trn_Lin, T01AL2_A11064Trn_Kgs, T01AL2_n11064Trn_Kgs, T01AL2_A11065Trn_val, T01AL2_n11065Trn_val, T01AL2_A396EmprCod, T01AL2_A252CliCod, T01AL2_n252CliCod
            }
            , new Object[] {
            T01AL3_A840TrnCod, T01AL3_A11061Trn_Diaf, T01AL3_A11063Trn_Lin, T01AL3_A11064Trn_Kgs, T01AL3_n11064Trn_Kgs, T01AL3_A11065Trn_val, T01AL3_n11065Trn_val, T01AL3_A396EmprCod, T01AL3_A252CliCod, T01AL3_n252CliCod
            }
            , new Object[] {
            T01AL4_A279CliNom
            }
            , new Object[] {
            T01AL5_A11061Trn_Diaf, T01AL5_A11062Trn_Ultl, T01AL5_n11062Trn_Ultl, T01AL5_A396EmprCod, T01AL5_A840TrnCod
            }
            , new Object[] {
            T01AL6_A11061Trn_Diaf, T01AL6_A11062Trn_Ultl, T01AL6_n11062Trn_Ultl, T01AL6_A396EmprCod, T01AL6_A840TrnCod
            }
            , new Object[] {
            T01AL7_A407EmprNom, T01AL7_n407EmprNom
            }
            , new Object[] {
            T01AL8_A841TrnNom, T01AL8_n841TrnNom
            }
            , new Object[] {
            T01AL9_A11061Trn_Diaf, T01AL9_A407EmprNom, T01AL9_n407EmprNom, T01AL9_A841TrnNom, T01AL9_n841TrnNom, T01AL9_A11062Trn_Ultl, T01AL9_n11062Trn_Ultl, T01AL9_A396EmprCod, T01AL9_A840TrnCod
            }
            , new Object[] {
            T01AL10_A841TrnNom, T01AL10_n841TrnNom
            }
            , new Object[] {
            T01AL11_A396EmprCod, T01AL11_A840TrnCod, T01AL11_A11061Trn_Diaf
            }
            , new Object[] {
            T01AL12_A396EmprCod, T01AL12_A840TrnCod, T01AL12_A11061Trn_Diaf
            }
            , new Object[] {
            T01AL13_A396EmprCod, T01AL13_A840TrnCod, T01AL13_A11061Trn_Diaf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AL17_A841TrnNom, T01AL17_n841TrnNom
            }
            , new Object[] {
            }
            , new Object[] {
            T01AL19_A396EmprCod, T01AL19_A840TrnCod, T01AL19_A11061Trn_Diaf
            }
            , new Object[] {
            T01AL20_A840TrnCod, T01AL20_A11061Trn_Diaf, T01AL20_A11063Trn_Lin, T01AL20_A279CliNom, T01AL20_A11064Trn_Kgs, T01AL20_n11064Trn_Kgs, T01AL20_A11065Trn_val, T01AL20_n11065Trn_val, T01AL20_A396EmprCod, T01AL20_A252CliCod,
            T01AL20_n252CliCod
            }
            , new Object[] {
            T01AL21_A279CliNom
            }
            , new Object[] {
            T01AL22_A396EmprCod, T01AL22_A840TrnCod, T01AL22_A11061Trn_Diaf, T01AL22_A11063Trn_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AL26_A279CliNom
            }
            , new Object[] {
            T01AL27_A396EmprCod, T01AL27_A840TrnCod, T01AL27_A11061Trn_Diaf, T01AL27_A11063Trn_Lin
            }
            , new Object[] {
            T01AL28_A407EmprNom, T01AL28_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTRNCOS" ;
      Z11061Trn_Diaf = GXutil.today( ) ;
      A11061Trn_Diaf = GXutil.today( ) ;
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
   private short Z840TrnCod ;
   private short Z11062Trn_Ultl ;
   private short O11062Trn_Ultl ;
   private short Z11063Trn_Lin ;
   private short nRcdDeleted_1476 ;
   private short nRcdExists_1476 ;
   private short nIsMod_1476 ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11062Trn_Ultl ;
   private short nBlankRcdCount1476 ;
   private short RcdFound1476 ;
   private short B11062Trn_Ultl ;
   private short nBlankRcdUsr1476 ;
   private short s11062Trn_Ultl ;
   private short A11063Trn_Lin ;
   private short GXv_int5[] ;
   private short RcdFound1475 ;
   private short nIsDirty_1475 ;
   private short nIsDirty_1476 ;
   private short i11062Trn_Ultl ;
   private short ZZ840TrnCod ;
   private short ZZ11062Trn_Ultl ;
   private short ZO11062Trn_Ultl ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
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
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtTrn_Diaf_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTrn_Ultl_Enabled ;
   private int edtavnRcdDeleted_1476_Enabled ;
   private int edtTrn_Lin_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtTrn_Kgs_Enabled ;
   private int edtTrn_val_Enabled ;
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
   private int defedtTrn_Lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTrn_Ultl_Backcolor ;
   private int edtTrn_Diaf_Backcolor ;
   private int edtTrnNom_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11064Trn_Kgs ;
   private java.math.BigDecimal Z11065Trn_val ;
   private java.math.BigDecimal A11064Trn_Kgs ;
   private java.math.BigDecimal A11065Trn_val ;
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
   private String edtTrnCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTrn_Diaf_Internalname ;
   private String edtTrn_Diaf_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtTrn_Ultl_Internalname ;
   private String edtTrn_Ultl_Jsonclick ;
   private String sMode1476 ;
   private String edtavnRcdDeleted_1476_Internalname ;
   private String edtTrn_Lin_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtTrn_Kgs_Internalname ;
   private String edtTrn_val_Internalname ;
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
   private String sMode1475 ;
   private String GXCCtl ;
   private String A279CliNom ;
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
   private String Z841TrnNom ;
   private String Z279CliNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1476_Jsonclick ;
   private String edtTrn_Lin_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtTrn_Kgs_Jsonclick ;
   private String edtTrn_val_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ841TrnNom ;
   private java.util.Date Z11061Trn_Diaf ;
   private java.util.Date A11061Trn_Diaf ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date ZZ11061Trn_Diaf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n11062Trn_Ultl ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean n11064Trn_Kgs ;
   private boolean n11065Trn_val ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01AL7_A407EmprNom ;
   private boolean[] T01AL7_n407EmprNom ;
   private java.util.Date[] T01AL9_A11061Trn_Diaf ;
   private String[] T01AL9_A407EmprNom ;
   private boolean[] T01AL9_n407EmprNom ;
   private String[] T01AL9_A841TrnNom ;
   private boolean[] T01AL9_n841TrnNom ;
   private short[] T01AL9_A11062Trn_Ultl ;
   private boolean[] T01AL9_n11062Trn_Ultl ;
   private String[] T01AL9_A396EmprCod ;
   private short[] T01AL9_A840TrnCod ;
   private String[] T01AL8_A841TrnNom ;
   private boolean[] T01AL8_n841TrnNom ;
   private String[] T01AL10_A841TrnNom ;
   private boolean[] T01AL10_n841TrnNom ;
   private String[] T01AL11_A396EmprCod ;
   private short[] T01AL11_A840TrnCod ;
   private java.util.Date[] T01AL11_A11061Trn_Diaf ;
   private java.util.Date[] T01AL6_A11061Trn_Diaf ;
   private short[] T01AL6_A11062Trn_Ultl ;
   private boolean[] T01AL6_n11062Trn_Ultl ;
   private String[] T01AL6_A396EmprCod ;
   private short[] T01AL6_A840TrnCod ;
   private String[] T01AL12_A396EmprCod ;
   private short[] T01AL12_A840TrnCod ;
   private java.util.Date[] T01AL12_A11061Trn_Diaf ;
   private String[] T01AL13_A396EmprCod ;
   private short[] T01AL13_A840TrnCod ;
   private java.util.Date[] T01AL13_A11061Trn_Diaf ;
   private java.util.Date[] T01AL5_A11061Trn_Diaf ;
   private short[] T01AL5_A11062Trn_Ultl ;
   private boolean[] T01AL5_n11062Trn_Ultl ;
   private String[] T01AL5_A396EmprCod ;
   private short[] T01AL5_A840TrnCod ;
   private String[] T01AL17_A841TrnNom ;
   private boolean[] T01AL17_n841TrnNom ;
   private String[] T01AL19_A396EmprCod ;
   private short[] T01AL19_A840TrnCod ;
   private java.util.Date[] T01AL19_A11061Trn_Diaf ;
   private short[] T01AL20_A840TrnCod ;
   private java.util.Date[] T01AL20_A11061Trn_Diaf ;
   private short[] T01AL20_A11063Trn_Lin ;
   private String[] T01AL20_A279CliNom ;
   private java.math.BigDecimal[] T01AL20_A11064Trn_Kgs ;
   private boolean[] T01AL20_n11064Trn_Kgs ;
   private java.math.BigDecimal[] T01AL20_A11065Trn_val ;
   private boolean[] T01AL20_n11065Trn_val ;
   private String[] T01AL20_A396EmprCod ;
   private int[] T01AL20_A252CliCod ;
   private boolean[] T01AL20_n252CliCod ;
   private String[] T01AL4_A279CliNom ;
   private String[] T01AL21_A279CliNom ;
   private String[] T01AL22_A396EmprCod ;
   private short[] T01AL22_A840TrnCod ;
   private java.util.Date[] T01AL22_A11061Trn_Diaf ;
   private short[] T01AL22_A11063Trn_Lin ;
   private short[] T01AL3_A840TrnCod ;
   private java.util.Date[] T01AL3_A11061Trn_Diaf ;
   private short[] T01AL3_A11063Trn_Lin ;
   private java.math.BigDecimal[] T01AL3_A11064Trn_Kgs ;
   private boolean[] T01AL3_n11064Trn_Kgs ;
   private java.math.BigDecimal[] T01AL3_A11065Trn_val ;
   private boolean[] T01AL3_n11065Trn_val ;
   private String[] T01AL3_A396EmprCod ;
   private int[] T01AL3_A252CliCod ;
   private boolean[] T01AL3_n252CliCod ;
   private short[] T01AL2_A840TrnCod ;
   private java.util.Date[] T01AL2_A11061Trn_Diaf ;
   private short[] T01AL2_A11063Trn_Lin ;
   private java.math.BigDecimal[] T01AL2_A11064Trn_Kgs ;
   private boolean[] T01AL2_n11064Trn_Kgs ;
   private java.math.BigDecimal[] T01AL2_A11065Trn_val ;
   private boolean[] T01AL2_n11065Trn_val ;
   private String[] T01AL2_A396EmprCod ;
   private int[] T01AL2_A252CliCod ;
   private boolean[] T01AL2_n252CliCod ;
   private String[] T01AL26_A279CliNom ;
   private String[] T01AL27_A396EmprCod ;
   private short[] T01AL27_A840TrnCod ;
   private java.util.Date[] T01AL27_A11061Trn_Diaf ;
   private short[] T01AL27_A11063Trn_Lin ;
   private String[] T01AL28_A407EmprNom ;
   private boolean[] T01AL28_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrncos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrncos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrncos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrncos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrncos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AL2", "SELECT TrnCod, Trn_Diaf, Trn_Lin, Trn_Kgs, Trn_val, EmprCod, CliCod FROM TXPTRNCO1 WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? AND Trn_Lin = ?  FOR UPDATE OF Trn_Kgs, Trn_val, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL3", "SELECT TrnCod, Trn_Diaf, Trn_Lin, Trn_Kgs, Trn_val, EmprCod, CliCod FROM TXPTRNCO1 WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? AND Trn_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL4", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL5", "SELECT Trn_Diaf, Trn_Ultl, EmprCod, TrnCod FROM TXPTRNCOS WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ?  FOR UPDATE OF Trn_Ultl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL6", "SELECT Trn_Diaf, Trn_Ultl, EmprCod, TrnCod FROM TXPTRNCOS WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL8", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL9", "SELECT /*+ FIRST_ROWS(100) */ TM1.Trn_Diaf, T2.EmprNom, T3.TrnNom, TM1.Trn_Ultl, TM1.EmprCod, TM1.TrnCod FROM ((TXPTRNCOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTRANSP T3 ON T3.EmprCod = TM1.EmprCod AND T3.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.TrnCod = ? and TM1.Trn_Diaf = ? ORDER BY TM1.EmprCod, TM1.TrnCod, TM1.Trn_Diaf ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL10", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TrnCod, Trn_Diaf FROM TXPTRNCOS WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TrnCod, Trn_Diaf FROM TXPTRNCOS WHERE ( TrnCod > ? or TrnCod = ? and Trn_Diaf > ?) and EmprCod = ? ORDER BY EmprCod, TrnCod, Trn_Diaf) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AL13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TrnCod, Trn_Diaf FROM TXPTRNCOS WHERE ( TrnCod < ? or TrnCod = ? and Trn_Diaf < ?) and EmprCod = ? ORDER BY EmprCod DESC, TrnCod DESC, Trn_Diaf DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AL14", "INSERT INTO TXPTRNCOS(Trn_Diaf, Trn_Ultl, EmprCod, TrnCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPTRNCOS")
         ,new UpdateCursor("T01AL15", "UPDATE TXPTRNCOS SET Trn_Ultl=?  WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ?", GX_NOMASK, "TXPTRNCOS")
         ,new UpdateCursor("T01AL16", "DELETE FROM TXPTRNCOS  WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ?", GX_NOMASK, "TXPTRNCOS")
         ,new ForEachCursor("T01AL17", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AL18", "UPDATE TXPTRNCOS SET Trn_Ultl=?  WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ?", GX_NOMASK, "TXPTRNCOS")
         ,new ForEachCursor("T01AL19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TrnCod, Trn_Diaf FROM TXPTRNCOS WHERE EmprCod = ? ORDER BY EmprCod, TrnCod, Trn_Diaf ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL20", "SELECT T1.TrnCod, T1.Trn_Diaf, T1.Trn_Lin, T2.CliNom, T1.Trn_Kgs, T1.Trn_val, T1.EmprCod, T1.CliCod FROM (TXPTRNCO1 T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.TrnCod = ? and T1.Trn_Diaf = ? and T1.Trn_Lin = ? ORDER BY T1.EmprCod, T1.TrnCod, T1.Trn_Diaf, T1.Trn_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL21", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL22", "SELECT EmprCod, TrnCod, Trn_Diaf, Trn_Lin FROM TXPTRNCO1 WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? AND Trn_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AL23", "INSERT INTO TXPTRNCO1(TrnCod, Trn_Diaf, Trn_Lin, Trn_Kgs, Trn_val, EmprCod, CliCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTRNCO1")
         ,new UpdateCursor("T01AL24", "UPDATE TXPTRNCO1 SET Trn_Kgs=?, Trn_val=?, CliCod=?  WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? AND Trn_Lin = ?", GX_NOMASK, "TXPTRNCO1")
         ,new UpdateCursor("T01AL25", "DELETE FROM TXPTRNCO1  WHERE EmprCod = ? AND TrnCod = ? AND Trn_Diaf = ? AND Trn_Lin = ?", GX_NOMASK, "TXPTRNCO1")
         ,new ForEachCursor("T01AL26", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL27", "SELECT EmprCod, TrnCod, Trn_Diaf, Trn_Lin FROM TXPTRNCO1 WHERE EmprCod = ? and TrnCod = ? and Trn_Diaf = ? ORDER BY EmprCod, TrnCod, Trn_Diaf, Trn_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AL28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 3);
               }
               stmt.setString(6, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[8]);
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

