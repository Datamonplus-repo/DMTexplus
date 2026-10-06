package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tftpqs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         n764ProForCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A764ProForCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "F.T. PQUIMICOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public tftpqs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tftpqs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tftpqs_impl.class ));
   }

   public tftpqs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFTPQS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_procod_Internalname, GXutil.rtrim( A6380Ft_procod), GXutil.rtrim( localUtil.format( A6380Ft_procod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_procod_Jsonclick, 0, "", "", "", "", "", 1, edtFt_procod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ft ProDsc", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_ProDsc_Internalname, GXutil.rtrim( A6381Ft_ProDsc), GXutil.rtrim( localUtil.format( A6381Ft_ProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_ProDsc_Jsonclick, 0, "", "", "", "", "", 1, edtFt_ProDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TFTPQS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFt_ProULin_Internalname, GXutil.ltrim( localUtil.ntoc( A6382Ft_ProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFt_ProULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6382Ft_ProULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6382Ft_ProULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFt_ProULin_Jsonclick, 0, "", "", "", "", "", 1, edtFt_ProULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFTPQS.htm");
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
         nBlankRcdCount1552 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1552 = (short)(1) ;
            scanStart1EQ1552( ) ;
            while ( RcdFound1552 != 0 )
            {
               init_level_properties1552( ) ;
               getByPrimaryKey1EQ1552( ) ;
               addRow1EQ1552( ) ;
               scanNext1EQ1552( ) ;
            }
            scanEnd1EQ1552( ) ;
            nBlankRcdCount1552 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1EQ1552( ) ;
         standaloneModal1EQ1552( ) ;
         sMode1552 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1EQ1552( ) ;
            edtavnRcdDeleted_1552_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1552_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1552_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1552_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtFt_ProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PROLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFt_ProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1552 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EQ1552( ) ;
            }
            sendRow1EQ1552( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1552 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1552 = (short)(5) ;
         nRcdExists_1552 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EQ1552( ) ;
            while ( RcdFound1552 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451552( ) ;
               init_level_properties1552( ) ;
               standaloneNotModal1EQ1552( ) ;
               getByPrimaryKey1EQ1552( ) ;
               standaloneModal1EQ1552( ) ;
               addRow1EQ1552( ) ;
               scanNext1EQ1552( ) ;
            }
            scanEnd1EQ1552( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1552 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451552( ) ;
      initAll1EQ1552( ) ;
      init_level_properties1552( ) ;
      nRcdExists_1552 = (short)(0) ;
      nIsMod_1552 = (short)(0) ;
      nRcdDeleted_1552 = (short)(0) ;
      nBlankRcdCount1552 = (short)(nBlankRcdUsr1552+nBlankRcdCount1552) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1552 > 0 )
      {
         standaloneNotModal1EQ1552( ) ;
         standaloneModal1EQ1552( ) ;
         addRow1EQ1552( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFt_ProLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1552 = (short)(nBlankRcdCount1552-1) ;
      }
      Gx_mode = sMode1552 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFTPQS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TFTPQS.htm");
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
         Z6380Ft_procod = httpContext.cgiGet( "Z6380Ft_procod") ;
         Z6381Ft_ProDsc = httpContext.cgiGet( "Z6381Ft_ProDsc") ;
         Z6382Ft_ProULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z6382Ft_ProULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6380Ft_procod = httpContext.cgiGet( edtFt_procod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
         A6381Ft_ProDsc = httpContext.cgiGet( edtFt_ProDsc_Internalname) ;
         n6381Ft_ProDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFt_ProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFt_ProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FT_PROULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFt_ProULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6382Ft_ProULin = (short)(0) ;
            n6382Ft_ProULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6382Ft_ProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6382Ft_ProULin), 4, 0));
         }
         else
         {
            A6382Ft_ProULin = (short)(localUtil.ctol( httpContext.cgiGet( edtFt_ProULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6382Ft_ProULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6382Ft_ProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6382Ft_ProULin), 4, 0));
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
            A6380Ft_procod = httpContext.GetPar( "Ft_procod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
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
            initAll1EQ1551( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1552_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1552_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1EQ1551( ) ;
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

   public void confirm_1EQ0( )
   {
      beforeValidate1EQ1551( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EQ1551( ) ;
         }
         else
         {
            checkExtendedTable1EQ1551( ) ;
            if ( AnyError == 0 )
            {
               zm1EQ1551( 2) ;
            }
            closeExtendedTableCursors1EQ1551( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1551 = Gx_mode ;
         confirm_1EQ1552( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1551 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1EQ0( ) ;
      }
   }

   public void confirm_1EQ1552( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1EQ1552( ) ;
         if ( ( nRcdExists_1552 != 0 ) || ( nIsMod_1552 != 0 ) )
         {
            getKey1EQ1552( ) ;
            if ( ( nRcdExists_1552 == 0 ) && ( nRcdDeleted_1552 == 0 ) )
            {
               if ( RcdFound1552 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EQ1552( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EQ1552( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1EQ1552( 4) ;
                     }
                     closeExtendedTableCursors1EQ1552( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FT_PROLIN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFt_ProLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1552 != 0 )
               {
                  if ( nRcdDeleted_1552 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EQ1552( ) ;
                     load1EQ1552( ) ;
                     beforeValidate1EQ1552( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EQ1552( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1552 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EQ1552( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EQ1552( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1EQ1552( 4) ;
                           }
                           closeExtendedTableCursors1EQ1552( ) ;
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
                  if ( nRcdDeleted_1552 == 0 )
                  {
                     GXCCtl = "FT_PROLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFt_ProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1552_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_ProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6383Ft_ProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z6383Ft_ProLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6383Ft_ProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_45_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1552_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1552_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1552_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1552 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1552_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1552_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PROLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_ProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EQ0( )
   {
   }

   public void zm1EQ1551( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6381Ft_ProDsc = T01EQ6_A6381Ft_ProDsc[0] ;
            Z6382Ft_ProULin = T01EQ6_A6382Ft_ProULin[0] ;
         }
         else
         {
            Z6381Ft_ProDsc = A6381Ft_ProDsc ;
            Z6382Ft_ProULin = A6382Ft_ProULin ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z6380Ft_procod = A6380Ft_procod ;
         Z6381Ft_ProDsc = A6381Ft_ProDsc ;
         Z6382Ft_ProULin = A6382Ft_ProULin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load1EQ1551( )
   {
      /* Using cursor T01EQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1551 = (short)(1) ;
         A6381Ft_ProDsc = T01EQ8_A6381Ft_ProDsc[0] ;
         n6381Ft_ProDsc = T01EQ8_n6381Ft_ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
         A407EmprNom = T01EQ8_A407EmprNom[0] ;
         n407EmprNom = T01EQ8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A6382Ft_ProULin = T01EQ8_A6382Ft_ProULin[0] ;
         n6382Ft_ProULin = T01EQ8_n6382Ft_ProULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6382Ft_ProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6382Ft_ProULin), 4, 0));
         zm1EQ1551( -1) ;
      }
      pr_default.close(6);
      onLoadActions1EQ1551( ) ;
   }

   public void onLoadActions1EQ1551( )
   {
   }

   public void checkExtendedTable1EQ1551( )
   {
      nIsDirty_1551 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01EQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01EQ7_A407EmprNom[0] ;
      n407EmprNom = T01EQ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1EQ1551( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01EQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01EQ9_A407EmprNom[0] ;
      n407EmprNom = T01EQ9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1EQ1551( )
   {
      /* Using cursor T01EQ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1551 = (short)(1) ;
      }
      else
      {
         RcdFound1551 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1EQ1551( 1) ;
         RcdFound1551 = (short)(1) ;
         A6380Ft_procod = T01EQ6_A6380Ft_procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
         A6381Ft_ProDsc = T01EQ6_A6381Ft_ProDsc[0] ;
         n6381Ft_ProDsc = T01EQ6_n6381Ft_ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
         A6382Ft_ProULin = T01EQ6_A6382Ft_ProULin[0] ;
         n6382Ft_ProULin = T01EQ6_n6382Ft_ProULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6382Ft_ProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6382Ft_ProULin), 4, 0));
         A396EmprCod = T01EQ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z6380Ft_procod = A6380Ft_procod ;
         sMode1551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EQ1551( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1551 = (short)(0) ;
            initializeNonKey1EQ1551( ) ;
         }
         Gx_mode = sMode1551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1551 = (short)(0) ;
         initializeNonKey1EQ1551( ) ;
         sMode1551 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1551 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1EQ1551( ) ;
      if ( RcdFound1551 == 0 )
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
      RcdFound1551 = (short)(0) ;
      /* Using cursor T01EQ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01EQ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01EQ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EQ11_A6380Ft_procod[0], A6380Ft_procod) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01EQ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01EQ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EQ11_A6380Ft_procod[0], A6380Ft_procod) > 0 ) ) )
         {
            A396EmprCod = T01EQ11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6380Ft_procod = T01EQ11_A6380Ft_procod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
            RcdFound1551 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1551 = (short)(0) ;
      /* Using cursor T01EQ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A6380Ft_procod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01EQ12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01EQ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EQ12_A6380Ft_procod[0], A6380Ft_procod) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01EQ12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01EQ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EQ12_A6380Ft_procod[0], A6380Ft_procod) < 0 ) ) )
         {
            A396EmprCod = T01EQ12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6380Ft_procod = T01EQ12_A6380Ft_procod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
            RcdFound1551 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EQ1551( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1EQ1551( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1551 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A6380Ft_procod = Z6380Ft_procod ;
               httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1EQ1551( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1EQ1551( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1EQ1551( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6380Ft_procod = Z6380Ft_procod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1EQ1551( ) ;
      if ( RcdFound1551 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A6380Ft_procod = Z6380Ft_procod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A6380Ft_procod, Z6380Ft_procod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tftpqs");
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1EQ0( ) ;
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
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1EQ1551( ) ;
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EQ1551( ) ;
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
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
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
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
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
      scanStart1EQ1551( ) ;
      if ( RcdFound1551 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1551 != 0 )
         {
            scanNext1EQ1551( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFt_ProDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1EQ1551( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EQ1551( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A6380Ft_procod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z6381Ft_ProDsc, T01EQ5_A6381Ft_ProDsc[0]) != 0 ) || ( Z6382Ft_ProULin != T01EQ5_A6382Ft_ProULin[0] ) )
         {
            if ( GXutil.strcmp(Z6381Ft_ProDsc, T01EQ5_A6381Ft_ProDsc[0]) != 0 )
            {
               GXutil.writeLogln("tftpqs:[seudo value changed for attri]"+"Ft_ProDsc");
               GXutil.writeLogRaw("Old: ",Z6381Ft_ProDsc);
               GXutil.writeLogRaw("Current: ",T01EQ5_A6381Ft_ProDsc[0]);
            }
            if ( Z6382Ft_ProULin != T01EQ5_A6382Ft_ProULin[0] )
            {
               GXutil.writeLogln("tftpqs:[seudo value changed for attri]"+"Ft_ProULin");
               GXutil.writeLogRaw("Old: ",Z6382Ft_ProULin);
               GXutil.writeLogRaw("Current: ",T01EQ5_A6382Ft_ProULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFTPQS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EQ1551( )
   {
      beforeValidate1EQ1551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EQ1551( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EQ1551( 0) ;
         checkOptimisticConcurrency1EQ1551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EQ1551( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EQ1551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EQ13 */
                  pr_default.execute(11, new Object[] {A6380Ft_procod, Boolean.valueOf(n6381Ft_ProDsc), A6381Ft_ProDsc, Boolean.valueOf(n6382Ft_ProULin), Short.valueOf(A6382Ft_ProULin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS");
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
                        processLevel1EQ1551( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EQ0( ) ;
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
            load1EQ1551( ) ;
         }
         endLevel1EQ1551( ) ;
      }
      closeExtendedTableCursors1EQ1551( ) ;
   }

   public void update1EQ1551( )
   {
      beforeValidate1EQ1551( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EQ1551( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EQ1551( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EQ1551( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EQ1551( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EQ14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n6381Ft_ProDsc), A6381Ft_ProDsc, Boolean.valueOf(n6382Ft_ProULin), Short.valueOf(A6382Ft_ProULin), A396EmprCod, A6380Ft_procod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EQ1551( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EQ1551( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1EQ0( ) ;
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
         endLevel1EQ1551( ) ;
      }
      closeExtendedTableCursors1EQ1551( ) ;
   }

   public void deferredUpdate1EQ1551( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EQ1551( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EQ1551( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EQ1551( ) ;
         afterConfirm1EQ1551( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EQ1551( ) ;
            if ( AnyError == 0 )
            {
               scanStart1EQ1552( ) ;
               while ( RcdFound1552 != 0 )
               {
                  getByPrimaryKey1EQ1552( ) ;
                  delete1EQ1552( ) ;
                  scanNext1EQ1552( ) ;
               }
               scanEnd1EQ1552( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EQ15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A6380Ft_procod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1551 == 0 )
                        {
                           initAll1EQ1551( ) ;
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
                        resetCaption1EQ0( ) ;
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
      sMode1551 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EQ1551( ) ;
      Gx_mode = sMode1551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EQ1551( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EQ16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T01EQ16_A407EmprNom[0] ;
         n407EmprNom = T01EQ16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01EQ17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A6380Ft_procod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1EQ1552( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1EQ1552( ) ;
         if ( ( nRcdExists_1552 != 0 ) || ( nIsMod_1552 != 0 ) )
         {
            standaloneNotModal1EQ1552( ) ;
            getKey1EQ1552( ) ;
            if ( ( nRcdExists_1552 == 0 ) && ( nRcdDeleted_1552 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EQ1552( ) ;
            }
            else
            {
               if ( RcdFound1552 != 0 )
               {
                  if ( ( nRcdDeleted_1552 != 0 ) && ( nRcdExists_1552 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EQ1552( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1552 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EQ1552( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1552 == 0 )
                  {
                     GXCCtl = "FT_PROLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFt_ProLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1552_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFt_ProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A6383Ft_ProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z6383Ft_ProLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z6383Ft_ProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_45_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1552_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1552_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1552_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1552 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1552_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1552_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FT_PROLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_ProLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EQ1552( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1552 = (short)(0) ;
      nIsMod_1552 = (short)(0) ;
      nRcdDeleted_1552 = (short)(0) ;
   }

   public void processLevel1EQ1551( )
   {
      /* Save parent mode. */
      sMode1551 = Gx_mode ;
      processNestedLevel1EQ1552( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1551 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1EQ1551( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1EQ1551( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tftpqs");
         if ( AnyError == 0 )
         {
            confirmValues1EQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tftpqs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EQ1551( )
   {
      /* Using cursor T01EQ18 */
      pr_default.execute(16);
      RcdFound1551 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1551 = (short)(1) ;
         A396EmprCod = T01EQ18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6380Ft_procod = T01EQ18_A6380Ft_procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EQ1551( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1551 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1551 = (short)(1) ;
         A396EmprCod = T01EQ18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6380Ft_procod = T01EQ18_A6380Ft_procod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
      }
   }

   public void scanEnd1EQ1551( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1EQ1551( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EQ1551( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EQ1551( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EQ1551( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EQ1551( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EQ1551( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EQ1551( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtFt_procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_procod_Enabled), 5, 0), true);
      edtFt_ProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_ProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProDsc_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtFt_ProULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_ProULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProULin_Enabled), 5, 0), true);
   }

   public void zm1EQ1552( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z764ProForCod = T01EQ3_A764ProForCod[0] ;
         }
         else
         {
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z6380Ft_procod = A6380Ft_procod ;
         Z6383Ft_ProLin = A6383Ft_ProLin ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModal1EQ1552( )
   {
   }

   public void standaloneModal1EQ1552( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFt_ProLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFt_ProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtFt_ProLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFt_ProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1EQ1552( )
   {
      /* Using cursor T01EQ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A6380Ft_procod, Short.valueOf(A6383Ft_ProLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1552 = (short)(1) ;
         A766ProForDsc = T01EQ19_A766ProForDsc[0] ;
         A764ProForCod = T01EQ19_A764ProForCod[0] ;
         n764ProForCod = T01EQ19_n764ProForCod[0] ;
         zm1EQ1552( -3) ;
      }
      pr_default.close(17);
      onLoadActions1EQ1552( ) ;
   }

   public void onLoadActions1EQ1552( )
   {
   }

   public void checkExtendedTable1EQ1552( )
   {
      nIsDirty_1552 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1EQ1552( ) ;
      /* Using cursor T01EQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01EQ4_A766ProForDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1EQ1552( )
   {
      pr_default.close(2);
   }

   public void enableDisable1EQ1552( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A764ProForCod )
   {
      /* Using cursor T01EQ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01EQ20_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1EQ1552( )
   {
      /* Using cursor T01EQ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A6380Ft_procod, Short.valueOf(A6383Ft_ProLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1552 = (short)(1) ;
      }
      else
      {
         RcdFound1552 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1EQ1552( )
   {
      /* Using cursor T01EQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A6380Ft_procod, Short.valueOf(A6383Ft_ProLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1EQ1552( 3) ;
         RcdFound1552 = (short)(1) ;
         initializeNonKey1EQ1552( ) ;
         A6383Ft_ProLin = T01EQ3_A6383Ft_ProLin[0] ;
         A764ProForCod = T01EQ3_A764ProForCod[0] ;
         n764ProForCod = T01EQ3_n764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z6380Ft_procod = A6380Ft_procod ;
         Z6383Ft_ProLin = A6383Ft_ProLin ;
         sMode1552 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EQ1552( ) ;
         load1EQ1552( ) ;
         Gx_mode = sMode1552 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1552 = (short)(0) ;
         initializeNonKey1EQ1552( ) ;
         sMode1552 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EQ1552( ) ;
         Gx_mode = sMode1552 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EQ1552( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EQ1552( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A6380Ft_procod, Short.valueOf(A6383Ft_ProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQS1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z764ProForCod, T01EQ2_A764ProForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z764ProForCod, T01EQ2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("tftpqs:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01EQ2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFTPQS1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EQ1552( )
   {
      beforeValidate1EQ1552( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EQ1552( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EQ1552( 0) ;
         checkOptimisticConcurrency1EQ1552( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EQ1552( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EQ1552( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EQ22 */
                  pr_default.execute(20, new Object[] {A6380Ft_procod, Short.valueOf(A6383Ft_ProLin), A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS1");
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
            load1EQ1552( ) ;
         }
         endLevel1EQ1552( ) ;
      }
      closeExtendedTableCursors1EQ1552( ) ;
   }

   public void update1EQ1552( )
   {
      beforeValidate1EQ1552( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EQ1552( ) ;
      }
      if ( ( nIsMod_1552 != 0 ) || ( nIsDirty_1552 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EQ1552( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EQ1552( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EQ1552( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EQ23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A396EmprCod, A6380Ft_procod, Short.valueOf(A6383Ft_ProLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFTPQS1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EQ1552( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EQ1552( ) ;
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
            endLevel1EQ1552( ) ;
         }
      }
      closeExtendedTableCursors1EQ1552( ) ;
   }

   public void deferredUpdate1EQ1552( )
   {
   }

   public void delete1EQ1552( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EQ1552( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EQ1552( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EQ1552( ) ;
         afterConfirm1EQ1552( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EQ1552( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EQ24 */
               pr_default.execute(22, new Object[] {A396EmprCod, A6380Ft_procod, Short.valueOf(A6383Ft_ProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFTPQS1");
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
      sMode1552 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EQ1552( ) ;
      Gx_mode = sMode1552 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EQ1552( )
   {
      standaloneModal1EQ1552( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01EQ25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         A766ProForDsc = T01EQ25_A766ProForDsc[0] ;
         pr_default.close(23);
      }
   }

   public void endLevel1EQ1552( )
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

   public void scanStart1EQ1552( )
   {
      /* Scan By routine */
      /* Using cursor T01EQ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A6380Ft_procod});
      RcdFound1552 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1552 = (short)(1) ;
         A6383Ft_ProLin = T01EQ26_A6383Ft_ProLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EQ1552( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1552 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1552 = (short)(1) ;
         A6383Ft_ProLin = T01EQ26_A6383Ft_ProLin[0] ;
      }
   }

   public void scanEnd1EQ1552( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1EQ1552( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EQ1552( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EQ1552( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EQ1552( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EQ1552( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EQ1552( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EQ1552( )
   {
      edtFt_ProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_ProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1EQ1552( )
   {
   }

   public void send_integrity_lvl_hashes1EQ1551( )
   {
   }

   public void subsflControlProps_451552( )
   {
      edtavnRcdDeleted_1552_Internalname = "vNRCDDELETED_1552_"+sGXsfl_45_idx ;
      edtFt_ProLin_Internalname = "FT_PROLIN_"+sGXsfl_45_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_45_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451552( )
   {
      edtavnRcdDeleted_1552_Internalname = "vNRCDDELETED_1552_"+sGXsfl_45_fel_idx ;
      edtFt_ProLin_Internalname = "FT_PROLIN_"+sGXsfl_45_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_45_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1EQ1552( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451552( ) ;
      sendRow1EQ1552( ) ;
   }

   public void sendRow1EQ1552( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1552_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1552_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1552_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1552), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1552), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1552_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1552_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1552_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFt_ProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A6383Ft_ProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6383Ft_ProLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFt_ProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFt_ProLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1552_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1EQ1552( ) ;
      GXCCtl = "Z6383Ft_ProLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6383Ft_ProLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "nRcdDeleted_1552_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1552_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1552_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1552, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1552_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1552_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FT_PROLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_ProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1EQ1552( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451552( ) ;
      edtavnRcdDeleted_1552_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1552_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFt_ProLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FT_PROLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1552_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1552_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1552");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1552_Internalname ;
         wbErr = true ;
         nRcdDeleted_1552 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1552 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1552_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFt_ProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFt_ProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FT_PROLIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFt_ProLin_Internalname ;
         wbErr = true ;
         A6383Ft_ProLin = (short)(0) ;
      }
      else
      {
         A6383Ft_ProLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFt_ProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      n764ProForCod = false ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      GXCCtl = "Z6383Ft_ProLin_" + sGXsfl_45_idx ;
      Z6383Ft_ProLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_45_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1552_" + sGXsfl_45_idx ;
      nRcdDeleted_1552 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1552_" + sGXsfl_45_idx ;
      nRcdExists_1552 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1552_" + sGXsfl_45_idx ;
      nIsMod_1552 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFt_ProLin_Enabled = edtFt_ProLin_Enabled ;
   }

   public void confirmValues1EQ0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451552( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451552( ) ;
         httpContext.changePostValue( "Z6383Ft_ProLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6383Ft_ProLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6383Ft_ProLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tftpqs", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6380Ft_procod", GXutil.rtrim( Z6380Ft_procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6381Ft_ProDsc", GXutil.rtrim( Z6381Ft_ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6382Ft_ProULin", GXutil.ltrim( localUtil.ntoc( Z6382Ft_ProULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tftpqs", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFTPQS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "F.T. PQUIMICOS", "") ;
   }

   public void initializeNonKey1EQ1551( )
   {
      A6381Ft_ProDsc = "" ;
      n6381Ft_ProDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", A6381Ft_ProDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A6382Ft_ProULin = (short)(0) ;
      n6382Ft_ProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6382Ft_ProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6382Ft_ProULin), 4, 0));
      Z6381Ft_ProDsc = "" ;
      Z6382Ft_ProULin = (short)(0) ;
   }

   public void initAll1EQ1551( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6380Ft_procod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6380Ft_procod", A6380Ft_procod);
      initializeNonKey1EQ1551( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1EQ1552( )
   {
      A764ProForCod = "" ;
      n764ProForCod = false ;
      A766ProForDsc = "" ;
      Z764ProForCod = "" ;
   }

   public void initAll1EQ1552( )
   {
      A6383Ft_ProLin = (short)(0) ;
      initializeNonKey1EQ1552( ) ;
   }

   public void standaloneModalInsert1EQ1552( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241565782", true, true);
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
      httpContext.AddJavascriptSource("tftpqs.js", "?20268241565782", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1552( )
   {
      edtFt_ProLin_Enabled = defedtFt_ProLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFt_ProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFt_ProLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1552, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1552_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6383Ft_ProLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFt_ProLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFt_procod_Internalname = "FT_PROCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtFt_ProDsc_Internalname = "FT_PRODSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtFt_ProULin_Internalname = "FT_PROULIN" ;
      edtavnRcdDeleted_1552_Internalname = "vNRCDDELETED_1552" ;
      edtFt_ProLin_Internalname = "FT_PROLIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
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
      Form.setCaption( httpContext.getMessage( "F.T. PQUIMICOS", "") );
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtFt_ProLin_Jsonclick = "" ;
      edtavnRcdDeleted_1552_Jsonclick = "" ;
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
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtFt_ProLin_Enabled = 1 ;
      edtavnRcdDeleted_1552_Enabled = 1 ;
      edtFt_ProULin_Jsonclick = "" ;
      edtFt_ProULin_Backcolor = (int)(0xFFFFFF) ;
      edtFt_ProULin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtFt_ProDsc_Jsonclick = "" ;
      edtFt_ProDsc_Backcolor = (int)(0xFFFFFF) ;
      edtFt_ProDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtFt_procod_Jsonclick = "" ;
      edtFt_procod_Backcolor = (int)(0xFFFFFF) ;
      edtFt_procod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_451552( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EQ1552( ) ;
         standaloneModal1EQ1552( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EQ1552( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451552( ) ;
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
      /* Using cursor T01EQ16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01EQ16_A407EmprNom[0] ;
      n407EmprNom = T01EQ16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      GX_FocusControl = edtFt_ProDsc_Internalname ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01EQ16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01EQ16_A407EmprNom[0] ;
      n407EmprNom = T01EQ16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Ft_procod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6381Ft_ProDsc", GXutil.rtrim( A6381Ft_ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6382Ft_ProULin", GXutil.ltrim( localUtil.ntoc( A6382Ft_ProULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6380Ft_procod", GXutil.rtrim( Z6380Ft_procod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6381Ft_ProDsc", GXutil.rtrim( Z6381Ft_ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6382Ft_ProULin", GXutil.ltrim( localUtil.ntoc( Z6382Ft_ProULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      /* Using cursor T01EQ25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T01EQ25_A766ProForDsc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_FT_PROCOD","{handler:'valid_Ft_procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6380Ft_procod',fld:'FT_PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FT_PROCOD",",oparms:[{av:'A6381Ft_ProDsc',fld:'FT_PRODSC',pic:''},{av:'A6382Ft_ProULin',fld:'FT_PROULIN',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z6380Ft_procod'},{av:'Z6381Ft_ProDsc'},{av:'Z6382Ft_ProULin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FT_PROLIN","{handler:'valid_Ft_prolin',iparms:[]");
      setEventMetadata("VALID_FT_PROLIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Profordsc',iparms:[]");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z6380Ft_procod = "" ;
      Z6381Ft_ProDsc = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
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
      A6380Ft_procod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A6381Ft_ProDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1552 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1551 = "" ;
      GXCCtl = "" ;
      A766ProForDsc = "" ;
      Z407EmprNom = "" ;
      T01EQ8_A6380Ft_procod = new String[] {""} ;
      T01EQ8_A6381Ft_ProDsc = new String[] {""} ;
      T01EQ8_n6381Ft_ProDsc = new boolean[] {false} ;
      T01EQ8_A407EmprNom = new String[] {""} ;
      T01EQ8_n407EmprNom = new boolean[] {false} ;
      T01EQ8_A6382Ft_ProULin = new short[1] ;
      T01EQ8_n6382Ft_ProULin = new boolean[] {false} ;
      T01EQ8_A396EmprCod = new String[] {""} ;
      T01EQ7_A407EmprNom = new String[] {""} ;
      T01EQ7_n407EmprNom = new boolean[] {false} ;
      T01EQ9_A407EmprNom = new String[] {""} ;
      T01EQ9_n407EmprNom = new boolean[] {false} ;
      T01EQ10_A396EmprCod = new String[] {""} ;
      T01EQ10_A6380Ft_procod = new String[] {""} ;
      T01EQ6_A6380Ft_procod = new String[] {""} ;
      T01EQ6_A6381Ft_ProDsc = new String[] {""} ;
      T01EQ6_n6381Ft_ProDsc = new boolean[] {false} ;
      T01EQ6_A6382Ft_ProULin = new short[1] ;
      T01EQ6_n6382Ft_ProULin = new boolean[] {false} ;
      T01EQ6_A396EmprCod = new String[] {""} ;
      T01EQ11_A396EmprCod = new String[] {""} ;
      T01EQ11_A6380Ft_procod = new String[] {""} ;
      T01EQ12_A396EmprCod = new String[] {""} ;
      T01EQ12_A6380Ft_procod = new String[] {""} ;
      T01EQ5_A6380Ft_procod = new String[] {""} ;
      T01EQ5_A6381Ft_ProDsc = new String[] {""} ;
      T01EQ5_n6381Ft_ProDsc = new boolean[] {false} ;
      T01EQ5_A6382Ft_ProULin = new short[1] ;
      T01EQ5_n6382Ft_ProULin = new boolean[] {false} ;
      T01EQ5_A396EmprCod = new String[] {""} ;
      T01EQ16_A407EmprNom = new String[] {""} ;
      T01EQ16_n407EmprNom = new boolean[] {false} ;
      T01EQ17_A396EmprCod = new String[] {""} ;
      T01EQ17_A6380Ft_procod = new String[] {""} ;
      T01EQ17_A6037Mq_Grupo = new byte[1] ;
      T01EQ18_A396EmprCod = new String[] {""} ;
      T01EQ18_A6380Ft_procod = new String[] {""} ;
      Z766ProForDsc = "" ;
      T01EQ19_A6380Ft_procod = new String[] {""} ;
      T01EQ19_A6383Ft_ProLin = new short[1] ;
      T01EQ19_A766ProForDsc = new String[] {""} ;
      T01EQ19_A396EmprCod = new String[] {""} ;
      T01EQ19_A764ProForCod = new String[] {""} ;
      T01EQ19_n764ProForCod = new boolean[] {false} ;
      T01EQ4_A766ProForDsc = new String[] {""} ;
      T01EQ20_A766ProForDsc = new String[] {""} ;
      T01EQ21_A396EmprCod = new String[] {""} ;
      T01EQ21_A6380Ft_procod = new String[] {""} ;
      T01EQ21_A6383Ft_ProLin = new short[1] ;
      T01EQ3_A6380Ft_procod = new String[] {""} ;
      T01EQ3_A6383Ft_ProLin = new short[1] ;
      T01EQ3_A396EmprCod = new String[] {""} ;
      T01EQ3_A764ProForCod = new String[] {""} ;
      T01EQ3_n764ProForCod = new boolean[] {false} ;
      T01EQ2_A6380Ft_procod = new String[] {""} ;
      T01EQ2_A6383Ft_ProLin = new short[1] ;
      T01EQ2_A396EmprCod = new String[] {""} ;
      T01EQ2_A764ProForCod = new String[] {""} ;
      T01EQ2_n764ProForCod = new boolean[] {false} ;
      T01EQ25_A766ProForDsc = new String[] {""} ;
      T01EQ26_A396EmprCod = new String[] {""} ;
      T01EQ26_A6380Ft_procod = new String[] {""} ;
      T01EQ26_A6383Ft_ProLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ6380Ft_procod = "" ;
      ZZ6381Ft_ProDsc = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tftpqs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tftpqs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tftpqs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tftpqs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tftpqs__default(),
         new Object[] {
             new Object[] {
            T01EQ2_A6380Ft_procod, T01EQ2_A6383Ft_ProLin, T01EQ2_A396EmprCod, T01EQ2_A764ProForCod, T01EQ2_n764ProForCod
            }
            , new Object[] {
            T01EQ3_A6380Ft_procod, T01EQ3_A6383Ft_ProLin, T01EQ3_A396EmprCod, T01EQ3_A764ProForCod, T01EQ3_n764ProForCod
            }
            , new Object[] {
            T01EQ4_A766ProForDsc
            }
            , new Object[] {
            T01EQ5_A6380Ft_procod, T01EQ5_A6381Ft_ProDsc, T01EQ5_n6381Ft_ProDsc, T01EQ5_A6382Ft_ProULin, T01EQ5_n6382Ft_ProULin, T01EQ5_A396EmprCod
            }
            , new Object[] {
            T01EQ6_A6380Ft_procod, T01EQ6_A6381Ft_ProDsc, T01EQ6_n6381Ft_ProDsc, T01EQ6_A6382Ft_ProULin, T01EQ6_n6382Ft_ProULin, T01EQ6_A396EmprCod
            }
            , new Object[] {
            T01EQ7_A407EmprNom, T01EQ7_n407EmprNom
            }
            , new Object[] {
            T01EQ8_A6380Ft_procod, T01EQ8_A6381Ft_ProDsc, T01EQ8_n6381Ft_ProDsc, T01EQ8_A407EmprNom, T01EQ8_n407EmprNom, T01EQ8_A6382Ft_ProULin, T01EQ8_n6382Ft_ProULin, T01EQ8_A396EmprCod
            }
            , new Object[] {
            T01EQ9_A407EmprNom, T01EQ9_n407EmprNom
            }
            , new Object[] {
            T01EQ10_A396EmprCod, T01EQ10_A6380Ft_procod
            }
            , new Object[] {
            T01EQ11_A396EmprCod, T01EQ11_A6380Ft_procod
            }
            , new Object[] {
            T01EQ12_A396EmprCod, T01EQ12_A6380Ft_procod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EQ16_A407EmprNom, T01EQ16_n407EmprNom
            }
            , new Object[] {
            T01EQ17_A396EmprCod, T01EQ17_A6380Ft_procod, T01EQ17_A6037Mq_Grupo
            }
            , new Object[] {
            T01EQ18_A396EmprCod, T01EQ18_A6380Ft_procod
            }
            , new Object[] {
            T01EQ19_A6380Ft_procod, T01EQ19_A6383Ft_ProLin, T01EQ19_A766ProForDsc, T01EQ19_A396EmprCod, T01EQ19_A764ProForCod, T01EQ19_n764ProForCod
            }
            , new Object[] {
            T01EQ20_A766ProForDsc
            }
            , new Object[] {
            T01EQ21_A396EmprCod, T01EQ21_A6380Ft_procod, T01EQ21_A6383Ft_ProLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EQ25_A766ProForDsc
            }
            , new Object[] {
            T01EQ26_A396EmprCod, T01EQ26_A6380Ft_procod, T01EQ26_A6383Ft_ProLin
            }
         }
      );
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
   private short Z6382Ft_ProULin ;
   private short Z6383Ft_ProLin ;
   private short nRcdDeleted_1552 ;
   private short nRcdExists_1552 ;
   private short nIsMod_1552 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6382Ft_ProULin ;
   private short nBlankRcdCount1552 ;
   private short RcdFound1552 ;
   private short nBlankRcdUsr1552 ;
   private short A6383Ft_ProLin ;
   private short RcdFound1551 ;
   private short nIsDirty_1551 ;
   private short nIsDirty_1552 ;
   private short ZZ6382Ft_ProULin ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtFt_procod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtFt_ProDsc_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFt_ProULin_Enabled ;
   private int edtavnRcdDeleted_1552_Enabled ;
   private int edtFt_ProLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
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
   private int defedtFt_ProLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtFt_ProULin_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtFt_ProDsc_Backcolor ;
   private int edtFt_procod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z6380Ft_procod ;
   private String Z6381Ft_ProDsc ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtFt_procod_Internalname ;
   private String A6380Ft_procod ;
   private String edtFt_procod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtFt_ProDsc_Internalname ;
   private String A6381Ft_ProDsc ;
   private String edtFt_ProDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtFt_ProULin_Internalname ;
   private String edtFt_ProULin_Jsonclick ;
   private String sMode1552 ;
   private String edtavnRcdDeleted_1552_Internalname ;
   private String edtFt_ProLin_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForDsc_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1551 ;
   private String GXCCtl ;
   private String A766ProForDsc ;
   private String Z407EmprNom ;
   private String Z766ProForDsc ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1552_Jsonclick ;
   private String edtFt_ProLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ6380Ft_procod ;
   private String ZZ6381Ft_ProDsc ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n764ProForCod ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n6381Ft_ProDsc ;
   private boolean n407EmprNom ;
   private boolean n6382Ft_ProULin ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01EQ8_A6380Ft_procod ;
   private String[] T01EQ8_A6381Ft_ProDsc ;
   private boolean[] T01EQ8_n6381Ft_ProDsc ;
   private String[] T01EQ8_A407EmprNom ;
   private boolean[] T01EQ8_n407EmprNom ;
   private short[] T01EQ8_A6382Ft_ProULin ;
   private boolean[] T01EQ8_n6382Ft_ProULin ;
   private String[] T01EQ8_A396EmprCod ;
   private String[] T01EQ7_A407EmprNom ;
   private boolean[] T01EQ7_n407EmprNom ;
   private String[] T01EQ9_A407EmprNom ;
   private boolean[] T01EQ9_n407EmprNom ;
   private String[] T01EQ10_A396EmprCod ;
   private String[] T01EQ10_A6380Ft_procod ;
   private String[] T01EQ6_A6380Ft_procod ;
   private String[] T01EQ6_A6381Ft_ProDsc ;
   private boolean[] T01EQ6_n6381Ft_ProDsc ;
   private short[] T01EQ6_A6382Ft_ProULin ;
   private boolean[] T01EQ6_n6382Ft_ProULin ;
   private String[] T01EQ6_A396EmprCod ;
   private String[] T01EQ11_A396EmprCod ;
   private String[] T01EQ11_A6380Ft_procod ;
   private String[] T01EQ12_A396EmprCod ;
   private String[] T01EQ12_A6380Ft_procod ;
   private String[] T01EQ5_A6380Ft_procod ;
   private String[] T01EQ5_A6381Ft_ProDsc ;
   private boolean[] T01EQ5_n6381Ft_ProDsc ;
   private short[] T01EQ5_A6382Ft_ProULin ;
   private boolean[] T01EQ5_n6382Ft_ProULin ;
   private String[] T01EQ5_A396EmprCod ;
   private String[] T01EQ16_A407EmprNom ;
   private boolean[] T01EQ16_n407EmprNom ;
   private String[] T01EQ17_A396EmprCod ;
   private String[] T01EQ17_A6380Ft_procod ;
   private byte[] T01EQ17_A6037Mq_Grupo ;
   private String[] T01EQ18_A396EmprCod ;
   private String[] T01EQ18_A6380Ft_procod ;
   private String[] T01EQ19_A6380Ft_procod ;
   private short[] T01EQ19_A6383Ft_ProLin ;
   private String[] T01EQ19_A766ProForDsc ;
   private String[] T01EQ19_A396EmprCod ;
   private String[] T01EQ19_A764ProForCod ;
   private boolean[] T01EQ19_n764ProForCod ;
   private String[] T01EQ4_A766ProForDsc ;
   private String[] T01EQ20_A766ProForDsc ;
   private String[] T01EQ21_A396EmprCod ;
   private String[] T01EQ21_A6380Ft_procod ;
   private short[] T01EQ21_A6383Ft_ProLin ;
   private String[] T01EQ3_A6380Ft_procod ;
   private short[] T01EQ3_A6383Ft_ProLin ;
   private String[] T01EQ3_A396EmprCod ;
   private String[] T01EQ3_A764ProForCod ;
   private boolean[] T01EQ3_n764ProForCod ;
   private String[] T01EQ2_A6380Ft_procod ;
   private short[] T01EQ2_A6383Ft_ProLin ;
   private String[] T01EQ2_A396EmprCod ;
   private String[] T01EQ2_A764ProForCod ;
   private boolean[] T01EQ2_n764ProForCod ;
   private String[] T01EQ25_A766ProForDsc ;
   private String[] T01EQ26_A396EmprCod ;
   private String[] T01EQ26_A6380Ft_procod ;
   private short[] T01EQ26_A6383Ft_ProLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tftpqs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tftpqs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EQ2", "SELECT Ft_procod, Ft_ProLin, EmprCod, ProForCod FROM TXPFTPQS1 WHERE EmprCod = ? AND Ft_procod = ? AND Ft_ProLin = ?  FOR UPDATE OF ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ3", "SELECT Ft_procod, Ft_ProLin, EmprCod, ProForCod FROM TXPFTPQS1 WHERE EmprCod = ? AND Ft_procod = ? AND Ft_ProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ4", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ5", "SELECT Ft_procod, Ft_ProDsc, Ft_ProULin, EmprCod FROM TXPFTPQS WHERE EmprCod = ? AND Ft_procod = ?  FOR UPDATE OF Ft_ProDsc, Ft_ProULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ6", "SELECT Ft_procod, Ft_ProDsc, Ft_ProULin, EmprCod FROM TXPFTPQS WHERE EmprCod = ? AND Ft_procod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Ft_procod, TM1.Ft_ProDsc, T2.EmprNom, TM1.Ft_ProULin, TM1.EmprCod FROM (TXPFTPQS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Ft_procod = ? ORDER BY TM1.EmprCod, TM1.Ft_procod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE EmprCod = ? AND Ft_procod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE ( EmprCod > ? or EmprCod = ? and Ft_procod > ?) ORDER BY EmprCod, Ft_procod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EQ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Ft_procod FROM TXPFTPQS WHERE ( EmprCod < ? or EmprCod = ? and Ft_procod < ?) ORDER BY EmprCod DESC, Ft_procod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EQ13", "INSERT INTO TXPFTPQS(Ft_procod, Ft_ProDsc, Ft_ProULin, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPFTPQS")
         ,new UpdateCursor("T01EQ14", "UPDATE TXPFTPQS SET Ft_ProDsc=?, Ft_ProULin=?  WHERE EmprCod = ? AND Ft_procod = ?", GX_NOMASK, "TXPFTPQS")
         ,new UpdateCursor("T01EQ15", "DELETE FROM TXPFTPQS  WHERE EmprCod = ? AND Ft_procod = ?", GX_NOMASK, "TXPFTPQS")
         ,new ForEachCursor("T01EQ16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ17", "SELECT * FROM (SELECT EmprCod, Ft_procod, Mq_Grupo FROM TXPFTPQSP WHERE EmprCod = ? AND Ft_procod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EQ18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Ft_procod FROM TXPFTPQS ORDER BY EmprCod, Ft_procod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ19", "SELECT T1.Ft_procod, T1.Ft_ProLin, T2.ProForDsc, T1.EmprCod, T1.ProForCod FROM (TXPFTPQS1 T1 LEFT JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.Ft_procod = ? and T1.Ft_ProLin = ? ORDER BY T1.EmprCod, T1.Ft_procod, T1.Ft_ProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ20", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ21", "SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND Ft_procod = ? AND Ft_ProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EQ22", "INSERT INTO TXPFTPQS1(Ft_procod, Ft_ProLin, EmprCod, ProForCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPFTPQS1")
         ,new UpdateCursor("T01EQ23", "UPDATE TXPFTPQS1 SET ProForCod=?  WHERE EmprCod = ? AND Ft_procod = ? AND Ft_ProLin = ?", GX_NOMASK, "TXPFTPQS1")
         ,new UpdateCursor("T01EQ24", "DELETE FROM TXPFTPQS1  WHERE EmprCod = ? AND Ft_procod = ? AND Ft_ProLin = ?", GX_NOMASK, "TXPFTPQS1")
         ,new ForEachCursor("T01EQ25", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EQ26", "SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? and Ft_procod = ? ORDER BY EmprCod, Ft_procod, Ft_ProLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

