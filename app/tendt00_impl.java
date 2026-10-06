package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tendt00_impl extends GXDataArea
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
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A719PrdNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Importacion Productos DATACOLOR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_NLab_Internalname ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_67 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_67"))) ;
      nGXsfl_67_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_67_idx"))) ;
      sGXsfl_67_idx = httpContext.GetPar( "sGXsfl_67_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tendt00_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tendt00_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tendt00_impl.class ));
   }

   public tendt00_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TENDT00.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_NLab_Internalname, GXutil.ltrim( localUtil.ntoc( A13312Lb_NLab, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_NLab_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13312Lb_NLab), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13312Lb_NLab), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_NLab_Jsonclick, 0, "", "", "", "", "", 1, edtLb_NLab_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UltIDVe_Internalname, GXutil.ltrim( localUtil.ntoc( A13304Lb_UltIDVe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_UltIDVe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UltIDVe_Jsonclick, 0, "", "", "", "", "", 1, edtLb_UltIDVe_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TENDT00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      /* Save parent mode. */
      sMode1821 = Gx_mode ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1821 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1821 = (short)(1) ;
            scanStart1NP1821( ) ;
            while ( RcdFound1821 != 0 )
            {
               init_level_properties1821( ) ;
               getByPrimaryKey1NP1821( ) ;
               addRow1NP1821( ) ;
               scanNext1NP1821( ) ;
            }
            scanEnd1NP1821( ) ;
            nBlankRcdCount1821 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NP1821( ) ;
         standaloneModal1NP1821( ) ;
         sMode1821 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1NP1821( ) ;
            edtLb_IDVeces_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_IDVECES_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_IDVeces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_IDVeces_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtLb_status_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_STATUS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_status_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_status_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtLb_fecDTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FECDTC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_fecDTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fecDTC_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtLb_UltLinI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_ULTLINI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_UltLinI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltLinI_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1821 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NP1821( ) ;
            }
            sendRow1NP1821( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1821 = (short)(5) ;
         nRcdExists_1821 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NP1821( ) ;
            while ( RcdFound1821 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401821( ) ;
               init_level_properties1821( ) ;
               standaloneNotModal1NP1821( ) ;
               getByPrimaryKey1NP1821( ) ;
               standaloneModal1NP1821( ) ;
               addRow1NP1821( ) ;
               scanNext1NP1821( ) ;
            }
            scanEnd1NP1821( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1821 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401821( ) ;
      initAll1NP1821( ) ;
      init_level_properties1821( ) ;
      nRcdExists_1821 = (short)(0) ;
      nIsMod_1821 = (short)(0) ;
      nRcdDeleted_1821 = (short)(0) ;
      nBlankRcdCount1821 = (short)(nBlankRcdUsr1821+nBlankRcdCount1821) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1821 > 0 )
      {
         standaloneNotModal1NP1821( ) ;
         standaloneModal1NP1821( ) ;
         addRow1NP1821( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLb_IDVeces_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1821 = (short)(nBlankRcdCount1821-1) ;
      }
      Gx_mode = sMode1821 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1821 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TENDT00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TENDT00.htm");
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
      e111NP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13312Lb_NLab = (int)(localUtil.ctol( httpContext.cgiGet( "Z13312Lb_NLab"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13304Lb_UltIDVe = (short)(localUtil.ctol( httpContext.cgiGet( "Z13304Lb_UltIDVe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NLab_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_NLab_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_NLAB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_NLab_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13312Lb_NLab = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
            }
            else
            {
               A13312Lb_NLab = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_NLab_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UltIDVe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UltIDVe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_ULTIDVE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_UltIDVe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13304Lb_UltIDVe = (short)(0) ;
               n13304Lb_UltIDVe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13304Lb_UltIDVe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), 4, 0));
            }
            else
            {
               A13304Lb_UltIDVe = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_UltIDVe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13304Lb_UltIDVe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13304Lb_UltIDVe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A13312Lb_NLab = (int)(GXutil.lval( httpContext.GetPar( "Lb_NLab"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
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
                        e111NP2 ();
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
            initAll1NP1820( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1822_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1822_Enabled), 5, 0), !bGXsfl_67_Refreshing);
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
      disableAttributes1NP1820( ) ;
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

   public void confirm_1NP0( )
   {
      beforeValidate1NP1820( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NP1820( ) ;
         }
         else
         {
            checkExtendedTable1NP1820( ) ;
            if ( AnyError == 0 )
            {
               zm1NP1820( 2) ;
            }
            closeExtendedTableCursors1NP1820( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1820 = Gx_mode ;
         confirm_1NP1821( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1820 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1NP0( ) ;
      }
   }

   public void confirm_1NP1822( )
   {
      nGXsfl_67_idx = 0 ;
      while ( nGXsfl_67_idx < nRC_GXsfl_67 )
      {
         readRow1NP1822( ) ;
         if ( ( nRcdExists_1822 != 0 ) || ( nIsMod_1822 != 0 ) )
         {
            getKey1NP1822( ) ;
            if ( ( nRcdExists_1822 == 0 ) && ( nRcdDeleted_1822 == 0 ) )
            {
               if ( RcdFound1822 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NP1822( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NP1822( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1NP1822( 5) ;
                     }
                     closeExtendedTableCursors1NP1822( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_IDVeces_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1822 != 0 )
               {
                  if ( nRcdDeleted_1822 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NP1822( ) ;
                     load1NP1822( ) ;
                     beforeValidate1NP1822( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NP1822( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1822 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NP1822( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NP1822( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1NP1822( 5) ;
                           }
                           closeExtendedTableCursors1NP1822( ) ;
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
                  if ( nRcdDeleted_1822 == 0 )
                  {
                     GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_IDVeces_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1822_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_LinID_Internalname, GXutil.ltrim( localUtil.ntoc( A13306Lb_LinID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLb_DTCCant_Internalname, GXutil.ltrim( localUtil.ntoc( A13307Lb_DTCCant, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNumDTC_Internalname, GXutil.rtrim( A13308PrdNumDTC)) ;
         httpContext.changePostValue( "ZT_"+"Z13306Lb_LinID_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z13306Lb_LinID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13307Lb_DTCCant_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z13307Lb_DTCCant, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13308PrdNumDTC_"+sGXsfl_67_idx, GXutil.rtrim( Z13308PrdNumDTC)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_67_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1822_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1822_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1822_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1822 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1822_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1822_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_LINID_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_DTCCANT_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_DTCCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUMDTC_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumDTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1NP1821( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1NP1821( ) ;
         if ( ( nRcdExists_1821 != 0 ) || ( nIsMod_1821 != 0 ) )
         {
            getKey1NP1821( ) ;
            if ( ( nRcdExists_1821 == 0 ) && ( nRcdDeleted_1821 == 0 ) )
            {
               if ( RcdFound1821 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NP1821( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NP1821( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1NP1821( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1821 = Gx_mode ;
                        confirm_1NP1822( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1821 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1821 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_IDVeces_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1821 != 0 )
               {
                  if ( nRcdDeleted_1821 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NP1821( ) ;
                     load1NP1821( ) ;
                     beforeValidate1NP1821( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NP1821( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1821 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NP1821( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NP1821( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1NP1821( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1821 = Gx_mode ;
                              confirm_1NP1822( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1821 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1821 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1821 == 0 )
                  {
                     GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_IDVeces_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_IDVeces_Internalname, GXutil.ltrim( localUtil.ntoc( A13305Lb_IDVeces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_status_Internalname, GXutil.ltrim( localUtil.ntoc( A13309Lb_status, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_fecDTC_Internalname, localUtil.ttoc( A13310Lb_fecDTC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtLb_UltLinI_Internalname, GXutil.ltrim( localUtil.ntoc( A13311Lb_UltLinI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13305Lb_IDVeces_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13305Lb_IDVeces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13309Lb_status_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13309Lb_status, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13310Lb_fecDTC_"+sGXsfl_40_idx, localUtil.ttoc( Z13310Lb_fecDTC, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13311Lb_UltLinI_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13311Lb_UltLinI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_67_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1821_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1821_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1821_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1821 != 0 )
         {
            httpContext.changePostValue( "LB_IDVECES_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_IDVeces_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_STATUS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_status_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FECDTC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fecDTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_ULTLINI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_UltLinI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NP0( )
   {
   }

   public void e111NP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tendt00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tendt00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tendt00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tendt00_impl.this.A396EmprCod = GXv_char2[0] ;
      tendt00_impl.this.AV11EmprNom = GXv_char3[0] ;
      tendt00_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1NP1820( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13304Lb_UltIDVe = T01NP8_A13304Lb_UltIDVe[0] ;
         }
         else
         {
            Z13304Lb_UltIDVe = A13304Lb_UltIDVe ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z13312Lb_NLab = A13312Lb_NLab ;
         Z13304Lb_UltIDVe = A13304Lb_UltIDVe ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TENDT00" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01NP9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NP9_A407EmprNom[0] ;
      n407EmprNom = T01NP9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
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

   public void load1NP1820( )
   {
      /* Using cursor T01NP10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1820 = (short)(1) ;
         A407EmprNom = T01NP10_A407EmprNom[0] ;
         n407EmprNom = T01NP10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13304Lb_UltIDVe = T01NP10_A13304Lb_UltIDVe[0] ;
         n13304Lb_UltIDVe = T01NP10_n13304Lb_UltIDVe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13304Lb_UltIDVe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), 4, 0));
         zm1NP1820( -1) ;
      }
      pr_default.close(8);
      onLoadActions1NP1820( ) ;
   }

   public void onLoadActions1NP1820( )
   {
   }

   public void checkExtendedTable1NP1820( )
   {
      nIsDirty_1820 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1NP1820( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NP1820( )
   {
      /* Using cursor T01NP11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1820 = (short)(1) ;
      }
      else
      {
         RcdFound1820 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01NP8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NP1820( 1) ;
         RcdFound1820 = (short)(1) ;
         A13312Lb_NLab = T01NP8_A13312Lb_NLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
         A13304Lb_UltIDVe = T01NP8_A13304Lb_UltIDVe[0] ;
         n13304Lb_UltIDVe = T01NP8_n13304Lb_UltIDVe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13304Lb_UltIDVe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z13312Lb_NLab = A13312Lb_NLab ;
         sMode1820 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1NP1820( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1820 = (short)(0) ;
            initializeNonKey1NP1820( ) ;
         }
         Gx_mode = sMode1820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1820 = (short)(0) ;
         initializeNonKey1NP1820( ) ;
         sMode1820 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1NP1820( ) ;
      if ( RcdFound1820 == 0 )
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
      RcdFound1820 = (short)(0) ;
      /* Using cursor T01NP12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A13312Lb_NLab), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01NP12_A13312Lb_NLab[0] < A13312Lb_NLab ) ) && ( GXutil.strcmp(T01NP12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01NP12_A13312Lb_NLab[0] > A13312Lb_NLab ) ) && ( GXutil.strcmp(T01NP12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13312Lb_NLab = T01NP12_A13312Lb_NLab[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
            RcdFound1820 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1820 = (short)(0) ;
      /* Using cursor T01NP13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A13312Lb_NLab), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01NP13_A13312Lb_NLab[0] > A13312Lb_NLab ) ) && ( GXutil.strcmp(T01NP13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01NP13_A13312Lb_NLab[0] < A13312Lb_NLab ) ) && ( GXutil.strcmp(T01NP13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13312Lb_NLab = T01NP13_A13312Lb_NLab[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
            RcdFound1820 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NP1820( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLb_NLab_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NP1820( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1820 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13312Lb_NLab != Z13312Lb_NLab ) )
            {
               A13312Lb_NLab = Z13312Lb_NLab ;
               httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_NLab_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1NP1820( ) ;
               GX_FocusControl = edtLb_NLab_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13312Lb_NLab != Z13312Lb_NLab ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtLb_NLab_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NP1820( ) ;
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
                  GX_FocusControl = edtLb_NLab_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NP1820( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13312Lb_NLab != Z13312Lb_NLab ) )
      {
         A13312Lb_NLab = Z13312Lb_NLab ;
         httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_NLab_Internalname ;
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
      getKey1NP1820( ) ;
      if ( RcdFound1820 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13312Lb_NLab != Z13312Lb_NLab ) )
         {
            A13312Lb_NLab = Z13312Lb_NLab ;
            httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13312Lb_NLab != Z13312Lb_NLab ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tendt00");
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1NP0( ) ;
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
      if ( RcdFound1820 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1NP1820( ) ;
      if ( RcdFound1820 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NP1820( ) ;
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
      if ( RcdFound1820 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
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
      if ( RcdFound1820 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
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
      scanStart1NP1820( ) ;
      if ( RcdFound1820 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1820 != 0 )
         {
            scanNext1NP1820( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NP1820( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1NP1820( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NP7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENDT00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z13304Lb_UltIDVe != T01NP7_A13304Lb_UltIDVe[0] ) )
         {
            if ( Z13304Lb_UltIDVe != T01NP7_A13304Lb_UltIDVe[0] )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"Lb_UltIDVe");
               GXutil.writeLogRaw("Old: ",Z13304Lb_UltIDVe);
               GXutil.writeLogRaw("Current: ",T01NP7_A13304Lb_UltIDVe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENDT00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NP1820( )
   {
      beforeValidate1NP1820( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NP1820( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NP1820( 0) ;
         checkOptimisticConcurrency1NP1820( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NP1820( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NP1820( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NP14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A13312Lb_NLab), Boolean.valueOf(n13304Lb_UltIDVe), Short.valueOf(A13304Lb_UltIDVe), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT00");
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
                        processLevel1NP1820( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NP0( ) ;
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
            load1NP1820( ) ;
         }
         endLevel1NP1820( ) ;
      }
      closeExtendedTableCursors1NP1820( ) ;
   }

   public void update1NP1820( )
   {
      beforeValidate1NP1820( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NP1820( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NP1820( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NP1820( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NP1820( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NP15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n13304Lb_UltIDVe), Short.valueOf(A13304Lb_UltIDVe), A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT00");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENDT00"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NP1820( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NP1820( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1NP0( ) ;
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
         endLevel1NP1820( ) ;
      }
      closeExtendedTableCursors1NP1820( ) ;
   }

   public void deferredUpdate1NP1820( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NP1820( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NP1820( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NP1820( ) ;
         afterConfirm1NP1820( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NP1820( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NP16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT00");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1820 == 0 )
                     {
                        initAll1NP1820( ) ;
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
                     resetCaption1NP0( ) ;
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
      sMode1820 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NP1820( ) ;
      Gx_mode = sMode1820 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NP1820( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NP17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1NP1821( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1NP1821( ) ;
         if ( ( nRcdExists_1821 != 0 ) || ( nIsMod_1821 != 0 ) )
         {
            standaloneNotModal1NP1821( ) ;
            getKey1NP1821( ) ;
            if ( ( nRcdExists_1821 == 0 ) && ( nRcdDeleted_1821 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NP1821( ) ;
            }
            else
            {
               if ( RcdFound1821 != 0 )
               {
                  if ( ( nRcdDeleted_1821 != 0 ) && ( nRcdExists_1821 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NP1821( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1821 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NP1821( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1821 == 0 )
                  {
                     GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_IDVeces_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_IDVeces_Internalname, GXutil.ltrim( localUtil.ntoc( A13305Lb_IDVeces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_status_Internalname, GXutil.ltrim( localUtil.ntoc( A13309Lb_status, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_fecDTC_Internalname, localUtil.ttoc( A13310Lb_fecDTC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtLb_UltLinI_Internalname, GXutil.ltrim( localUtil.ntoc( A13311Lb_UltLinI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13305Lb_IDVeces_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13305Lb_IDVeces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13309Lb_status_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13309Lb_status, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13310Lb_fecDTC_"+sGXsfl_40_idx, localUtil.ttoc( Z13310Lb_fecDTC, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13311Lb_UltLinI_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z13311Lb_UltLinI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_67_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1821_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1821_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1821_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1821 != 0 )
         {
            httpContext.changePostValue( "LB_IDVECES_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_IDVeces_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_STATUS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_status_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_FECDTC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fecDTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_ULTLINI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_UltLinI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NP1821( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1821 = (short)(0) ;
      nIsMod_1821 = (short)(0) ;
      nRcdDeleted_1821 = (short)(0) ;
   }

   public void processLevel1NP1820( )
   {
      /* Save parent mode. */
      sMode1820 = Gx_mode ;
      processNestedLevel1NP1821( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1820 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NP1820( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NP1820( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tendt00");
         if ( AnyError == 0 )
         {
            confirmValues1NP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tendt00");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NP1820( )
   {
      /* Scan By routine */
      /* Using cursor T01NP18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1820 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1820 = (short)(1) ;
         A13312Lb_NLab = T01NP18_A13312Lb_NLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NP1820( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1820 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1820 = (short)(1) ;
         A13312Lb_NLab = T01NP18_A13312Lb_NLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
      }
   }

   public void scanEnd1NP1820( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1NP1820( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NP1820( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NP1820( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NP1820( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NP1820( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NP1820( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NP1820( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLb_NLab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_NLab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_NLab_Enabled), 5, 0), true);
      edtLb_UltIDVe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltIDVe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltIDVe_Enabled), 5, 0), true);
   }

   public void zm1NP1821( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13309Lb_status = T01NP6_A13309Lb_status[0] ;
            Z13310Lb_fecDTC = T01NP6_A13310Lb_fecDTC[0] ;
            Z13311Lb_UltLinI = T01NP6_A13311Lb_UltLinI[0] ;
         }
         else
         {
            Z13309Lb_status = A13309Lb_status ;
            Z13310Lb_fecDTC = A13310Lb_fecDTC ;
            Z13311Lb_UltLinI = A13311Lb_UltLinI ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z13312Lb_NLab = A13312Lb_NLab ;
         Z13305Lb_IDVeces = A13305Lb_IDVeces ;
         Z13309Lb_status = A13309Lb_status ;
         Z13310Lb_fecDTC = A13310Lb_fecDTC ;
         Z13311Lb_UltLinI = A13311Lb_UltLinI ;
      }
   }

   public void standaloneNotModal1NP1821( )
   {
   }

   public void standaloneModal1NP1821( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_IDVeces_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_IDVeces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_IDVeces_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtLb_IDVeces_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_IDVeces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_IDVeces_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1NP1821( )
   {
      /* Using cursor T01NP19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1821 = (short)(1) ;
         A13309Lb_status = T01NP19_A13309Lb_status[0] ;
         n13309Lb_status = T01NP19_n13309Lb_status[0] ;
         A13310Lb_fecDTC = T01NP19_A13310Lb_fecDTC[0] ;
         n13310Lb_fecDTC = T01NP19_n13310Lb_fecDTC[0] ;
         A13311Lb_UltLinI = T01NP19_A13311Lb_UltLinI[0] ;
         n13311Lb_UltLinI = T01NP19_n13311Lb_UltLinI[0] ;
         zm1NP1821( -3) ;
      }
      pr_default.close(17);
      onLoadActions1NP1821( ) ;
   }

   public void onLoadActions1NP1821( )
   {
   }

   public void checkExtendedTable1NP1821( )
   {
      nIsDirty_1821 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NP1821( ) ;
   }

   public void closeExtendedTableCursors1NP1821( )
   {
   }

   public void enableDisable1NP1821( )
   {
   }

   public void getKey1NP1821( )
   {
      /* Using cursor T01NP20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1821 = (short)(1) ;
      }
      else
      {
         RcdFound1821 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1NP1821( )
   {
      /* Using cursor T01NP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01NP6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NP1821( 3) ;
         RcdFound1821 = (short)(1) ;
         initializeNonKey1NP1821( ) ;
         A13305Lb_IDVeces = T01NP6_A13305Lb_IDVeces[0] ;
         A13309Lb_status = T01NP6_A13309Lb_status[0] ;
         n13309Lb_status = T01NP6_n13309Lb_status[0] ;
         A13310Lb_fecDTC = T01NP6_A13310Lb_fecDTC[0] ;
         n13310Lb_fecDTC = T01NP6_n13310Lb_fecDTC[0] ;
         A13311Lb_UltLinI = T01NP6_A13311Lb_UltLinI[0] ;
         n13311Lb_UltLinI = T01NP6_n13311Lb_UltLinI[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13312Lb_NLab = A13312Lb_NLab ;
         Z13305Lb_IDVeces = A13305Lb_IDVeces ;
         sMode1821 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NP1821( ) ;
         load1NP1821( ) ;
         Gx_mode = sMode1821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1821 = (short)(0) ;
         initializeNonKey1NP1821( ) ;
         sMode1821 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NP1821( ) ;
         Gx_mode = sMode1821 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NP1821( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1NP1821( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENDT01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z13309Lb_status != T01NP5_A13309Lb_status[0] ) || !( GXutil.dateCompare(Z13310Lb_fecDTC, T01NP5_A13310Lb_fecDTC[0]) ) || ( Z13311Lb_UltLinI != T01NP5_A13311Lb_UltLinI[0] ) )
         {
            if ( Z13309Lb_status != T01NP5_A13309Lb_status[0] )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"Lb_status");
               GXutil.writeLogRaw("Old: ",Z13309Lb_status);
               GXutil.writeLogRaw("Current: ",T01NP5_A13309Lb_status[0]);
            }
            if ( !( GXutil.dateCompare(Z13310Lb_fecDTC, T01NP5_A13310Lb_fecDTC[0]) ) )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"Lb_fecDTC");
               GXutil.writeLogRaw("Old: ",Z13310Lb_fecDTC);
               GXutil.writeLogRaw("Current: ",T01NP5_A13310Lb_fecDTC[0]);
            }
            if ( Z13311Lb_UltLinI != T01NP5_A13311Lb_UltLinI[0] )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"Lb_UltLinI");
               GXutil.writeLogRaw("Old: ",Z13311Lb_UltLinI);
               GXutil.writeLogRaw("Current: ",T01NP5_A13311Lb_UltLinI[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENDT01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NP1821( )
   {
      beforeValidate1NP1821( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NP1821( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NP1821( 0) ;
         checkOptimisticConcurrency1NP1821( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NP1821( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NP1821( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NP21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Boolean.valueOf(n13309Lb_status), Byte.valueOf(A13309Lb_status), Boolean.valueOf(n13310Lb_fecDTC), A13310Lb_fecDTC, Boolean.valueOf(n13311Lb_UltLinI), Short.valueOf(A13311Lb_UltLinI)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT01");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel1NP1821( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1NP1821( ) ;
         }
         endLevel1NP1821( ) ;
      }
      closeExtendedTableCursors1NP1821( ) ;
   }

   public void update1NP1821( )
   {
      beforeValidate1NP1821( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NP1821( ) ;
      }
      if ( ( nIsMod_1821 != 0 ) || ( nIsDirty_1821 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NP1821( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NP1821( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NP1821( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NP22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n13309Lb_status), Byte.valueOf(A13309Lb_status), Boolean.valueOf(n13310Lb_fecDTC), A13310Lb_fecDTC, Boolean.valueOf(n13311Lb_UltLinI), Short.valueOf(A13311Lb_UltLinI), A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT01");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENDT01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NP1821( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1NP1821( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1NP1821( ) ;
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
            endLevel1NP1821( ) ;
         }
      }
      closeExtendedTableCursors1NP1821( ) ;
   }

   public void deferredUpdate1NP1821( )
   {
   }

   public void delete1NP1821( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NP1821( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NP1821( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NP1821( ) ;
         afterConfirm1NP1821( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NP1821( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NP1822( ) ;
               while ( RcdFound1822 != 0 )
               {
                  getByPrimaryKey1NP1822( ) ;
                  delete1NP1822( ) ;
                  scanNext1NP1822( ) ;
               }
               scanEnd1NP1822( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NP23 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT01");
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
      }
      sMode1821 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NP1821( ) ;
      Gx_mode = sMode1821 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NP1821( )
   {
      standaloneModal1NP1821( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1NP1822( )
   {
      nGXsfl_67_idx = 0 ;
      while ( nGXsfl_67_idx < nRC_GXsfl_67 )
      {
         readRow1NP1822( ) ;
         if ( ( nRcdExists_1822 != 0 ) || ( nIsMod_1822 != 0 ) )
         {
            standaloneNotModal1NP1822( ) ;
            getKey1NP1822( ) ;
            if ( ( nRcdExists_1822 == 0 ) && ( nRcdDeleted_1822 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NP1822( ) ;
            }
            else
            {
               if ( RcdFound1822 != 0 )
               {
                  if ( ( nRcdDeleted_1822 != 0 ) && ( nRcdExists_1822 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NP1822( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1822 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NP1822( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1822 == 0 )
                  {
                     GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_IDVeces_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1822_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLb_LinID_Internalname, GXutil.ltrim( localUtil.ntoc( A13306Lb_LinID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtLb_DTCCant_Internalname, GXutil.ltrim( localUtil.ntoc( A13307Lb_DTCCant, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNumDTC_Internalname, GXutil.rtrim( A13308PrdNumDTC)) ;
         httpContext.changePostValue( "ZT_"+"Z13306Lb_LinID_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z13306Lb_LinID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13307Lb_DTCCant_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( Z13307Lb_DTCCant, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13308PrdNumDTC_"+sGXsfl_67_idx, GXutil.rtrim( Z13308PrdNumDTC)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_67_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_1822_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1822_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1822_"+sGXsfl_67_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1822 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1822_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1822_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_LINID_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LB_DTCCANT_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_DTCCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUMDTC_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumDTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NP1822( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1822 = (short)(0) ;
      nIsMod_1822 = (short)(0) ;
      nRcdDeleted_1822 = (short)(0) ;
   }

   public void processLevel1NP1821( )
   {
      /* Save parent mode. */
      sMode1821 = Gx_mode ;
      processNestedLevel1NP1822( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1821 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NP1821( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NP1821( )
   {
      /* Scan By routine */
      /* Using cursor T01NP24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab)});
      RcdFound1821 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1821 = (short)(1) ;
         A13305Lb_IDVeces = T01NP24_A13305Lb_IDVeces[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NP1821( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1821 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1821 = (short)(1) ;
         A13305Lb_IDVeces = T01NP24_A13305Lb_IDVeces[0] ;
      }
   }

   public void scanEnd1NP1821( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1NP1821( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NP1821( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NP1821( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NP1821( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NP1821( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NP1821( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NP1821( )
   {
      edtLb_IDVeces_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_IDVeces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_IDVeces_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtLb_status_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_status_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_status_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtLb_fecDTC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fecDTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fecDTC_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtLb_UltLinI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltLinI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltLinI_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void zm1NP1822( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13307Lb_DTCCant = T01NP3_A13307Lb_DTCCant[0] ;
            Z13308PrdNumDTC = T01NP3_A13308PrdNumDTC[0] ;
            Z719PrdNum = T01NP3_A719PrdNum[0] ;
         }
         else
         {
            Z13307Lb_DTCCant = A13307Lb_DTCCant ;
            Z13308PrdNumDTC = A13308PrdNumDTC ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z13312Lb_NLab = A13312Lb_NLab ;
         Z13305Lb_IDVeces = A13305Lb_IDVeces ;
         Z13306Lb_LinID = A13306Lb_LinID ;
         Z13307Lb_DTCCant = A13307Lb_DTCCant ;
         Z13308PrdNumDTC = A13308PrdNumDTC ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
      }
   }

   public void standaloneNotModal1NP1822( )
   {
   }

   public void standaloneModal1NP1822( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_LinID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LinID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinID_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      }
      else
      {
         edtLb_LinID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LinID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinID_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      }
   }

   public void load1NP1822( )
   {
      /* Using cursor T01NP25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1822 = (short)(1) ;
         A13307Lb_DTCCant = T01NP25_A13307Lb_DTCCant[0] ;
         n13307Lb_DTCCant = T01NP25_n13307Lb_DTCCant[0] ;
         A13308PrdNumDTC = T01NP25_A13308PrdNumDTC[0] ;
         n13308PrdNumDTC = T01NP25_n13308PrdNumDTC[0] ;
         A719PrdNum = T01NP25_A719PrdNum[0] ;
         n719PrdNum = T01NP25_n719PrdNum[0] ;
         zm1NP1822( -4) ;
      }
      pr_default.close(23);
      onLoadActions1NP1822( ) ;
   }

   public void onLoadActions1NP1822( )
   {
   }

   public void checkExtendedTable1NP1822( )
   {
      nIsDirty_1822 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1NP1822( ) ;
      /* Using cursor T01NP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1NP1822( )
   {
      pr_default.close(2);
   }

   public void enableDisable1NP1822( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01NP26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(24) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(24);
   }

   public void getKey1NP1822( )
   {
      /* Using cursor T01NP27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1822 = (short)(1) ;
      }
      else
      {
         RcdFound1822 = (short)(0) ;
      }
      pr_default.close(25);
   }

   public void getByPrimaryKey1NP1822( )
   {
      /* Using cursor T01NP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01NP3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NP1822( 4) ;
         RcdFound1822 = (short)(1) ;
         initializeNonKey1NP1822( ) ;
         A13306Lb_LinID = T01NP3_A13306Lb_LinID[0] ;
         A13307Lb_DTCCant = T01NP3_A13307Lb_DTCCant[0] ;
         n13307Lb_DTCCant = T01NP3_n13307Lb_DTCCant[0] ;
         A13308PrdNumDTC = T01NP3_A13308PrdNumDTC[0] ;
         n13308PrdNumDTC = T01NP3_n13308PrdNumDTC[0] ;
         A719PrdNum = T01NP3_A719PrdNum[0] ;
         n719PrdNum = T01NP3_n719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13312Lb_NLab = A13312Lb_NLab ;
         Z13305Lb_IDVeces = A13305Lb_IDVeces ;
         Z13306Lb_LinID = A13306Lb_LinID ;
         sMode1822 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NP1822( ) ;
         load1NP1822( ) ;
         Gx_mode = sMode1822 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1822 = (short)(0) ;
         initializeNonKey1NP1822( ) ;
         sMode1822 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NP1822( ) ;
         Gx_mode = sMode1822 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NP1822( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NP1822( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENDT02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13307Lb_DTCCant, T01NP2_A13307Lb_DTCCant[0]) != 0 ) || ( GXutil.strcmp(Z13308PrdNumDTC, T01NP2_A13308PrdNumDTC[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01NP2_A719PrdNum[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13307Lb_DTCCant, T01NP2_A13307Lb_DTCCant[0]) != 0 )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"Lb_DTCCant");
               GXutil.writeLogRaw("Old: ",Z13307Lb_DTCCant);
               GXutil.writeLogRaw("Current: ",T01NP2_A13307Lb_DTCCant[0]);
            }
            if ( GXutil.strcmp(Z13308PrdNumDTC, T01NP2_A13308PrdNumDTC[0]) != 0 )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"PrdNumDTC");
               GXutil.writeLogRaw("Old: ",Z13308PrdNumDTC);
               GXutil.writeLogRaw("Current: ",T01NP2_A13308PrdNumDTC[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01NP2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("tendt00:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01NP2_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENDT02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NP1822( )
   {
      beforeValidate1NP1822( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NP1822( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NP1822( 0) ;
         checkOptimisticConcurrency1NP1822( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NP1822( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NP1822( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NP28 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID), Boolean.valueOf(n13307Lb_DTCCant), A13307Lb_DTCCant, Boolean.valueOf(n13308PrdNumDTC), A13308PrdNumDTC, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT02");
                  if ( (pr_default.getStatus(26) == 1) )
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
            load1NP1822( ) ;
         }
         endLevel1NP1822( ) ;
      }
      closeExtendedTableCursors1NP1822( ) ;
   }

   public void update1NP1822( )
   {
      beforeValidate1NP1822( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NP1822( ) ;
      }
      if ( ( nIsMod_1822 != 0 ) || ( nIsDirty_1822 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NP1822( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NP1822( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NP1822( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NP29 */
                     pr_default.execute(27, new Object[] {Boolean.valueOf(n13307Lb_DTCCant), A13307Lb_DTCCant, Boolean.valueOf(n13308PrdNumDTC), A13308PrdNumDTC, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT02");
                     if ( (pr_default.getStatus(27) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENDT02"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NP1822( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NP1822( ) ;
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
            endLevel1NP1822( ) ;
         }
      }
      closeExtendedTableCursors1NP1822( ) ;
   }

   public void deferredUpdate1NP1822( )
   {
   }

   public void delete1NP1822( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NP1822( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NP1822( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NP1822( ) ;
         afterConfirm1NP1822( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NP1822( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NP30 */
               pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces), Short.valueOf(A13306Lb_LinID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENDT02");
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
      sMode1822 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NP1822( ) ;
      Gx_mode = sMode1822 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NP1822( )
   {
      standaloneModal1NP1822( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1NP1822( )
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

   public void scanStart1NP1822( )
   {
      /* Scan By routine */
      /* Using cursor T01NP31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A13312Lb_NLab), Short.valueOf(A13305Lb_IDVeces)});
      RcdFound1822 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1822 = (short)(1) ;
         A13306Lb_LinID = T01NP31_A13306Lb_LinID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NP1822( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound1822 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1822 = (short)(1) ;
         A13306Lb_LinID = T01NP31_A13306Lb_LinID[0] ;
      }
   }

   public void scanEnd1NP1822( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1NP1822( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NP1822( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NP1822( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NP1822( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NP1822( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NP1822( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NP1822( )
   {
      edtLb_LinID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LinID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinID_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtLb_DTCCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_DTCCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_DTCCant_Enabled), 5, 0), !bGXsfl_67_Refreshing);
      edtPrdNumDTC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumDTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumDTC_Enabled), 5, 0), !bGXsfl_67_Refreshing);
   }

   public void send_integrity_lvl_hashes1NP1822( )
   {
   }

   public void send_integrity_lvl_hashes1NP1821( )
   {
   }

   public void send_integrity_lvl_hashes1NP1820( )
   {
   }

   public void subsflControlProps_401821( )
   {
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_40_idx ;
      edtLb_IDVeces_Internalname = "LB_IDVECES_"+sGXsfl_40_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_40_idx ;
      edtLb_status_Internalname = "LB_STATUS_"+sGXsfl_40_idx ;
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_40_idx ;
      edtLb_fecDTC_Internalname = "LB_FECDTC_"+sGXsfl_40_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_40_idx ;
      edtLb_UltLinI_Internalname = "LB_ULTLINI_"+sGXsfl_40_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401821( )
   {
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_40_fel_idx ;
      edtLb_IDVeces_Internalname = "LB_IDVECES_"+sGXsfl_40_fel_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_40_fel_idx ;
      edtLb_status_Internalname = "LB_STATUS_"+sGXsfl_40_fel_idx ;
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_40_fel_idx ;
      edtLb_fecDTC_Internalname = "LB_FECDTC_"+sGXsfl_40_fel_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_40_fel_idx ;
      edtLb_UltLinI_Internalname = "LB_ULTLINI_"+sGXsfl_40_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1NP1821( )
   {
      nRC_GXsfl_67 = 0 ;
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401821( ) ;
      sendRow1NP1821( ) ;
   }

   public void sendRow1NP1821( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_40_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_40_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_40_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,httpContext.getMessage( "Lb_ IDVeces", ""),"","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_IDVeces_Internalname,GXutil.ltrim( localUtil.ntoc( A13305Lb_IDVeces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13305Lb_IDVeces), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_IDVeces_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLb_IDVeces_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock6_Internalname,httpContext.getMessage( "Status", ""),"","",lblTextblock6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_status_Internalname,GXutil.ltrim( localUtil.ntoc( A13309Lb_status, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_status_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13309Lb_status), "9") : localUtil.format( DecimalUtil.doubleToDec(A13309Lb_status), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_status_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLb_status_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock7_Internalname,httpContext.getMessage( "Data Importacion de DATACOLOR", ""),"","",lblTextblock7_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_fecDTC_Internalname,localUtil.ttoc( A13310Lb_fecDTC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13310Lb_fecDTC, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_fecDTC_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLb_fecDTC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(14),"chr",Integer.valueOf(1),"row",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock8_Internalname,httpContext.getMessage( "Ultima Linea", ""),"","",lblTextblock8_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_UltLinI_Internalname,GXutil.ltrim( localUtil.ntoc( A13311Lb_UltLinI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_UltLinI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13311Lb_UltLinI), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13311Lb_UltLinI), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_UltLinI_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtLb_UltLinI_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol67( ) ;
      nGXsfl_67_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1822 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1822 = (short)(1) ;
            scanStart1NP1822( ) ;
            while ( RcdFound1822 != 0 )
            {
               init_level_properties1822( ) ;
               getByPrimaryKey1NP1822( ) ;
               addRow1NP1822( ) ;
               scanNext1NP1822( ) ;
            }
            scanEnd1NP1822( ) ;
            nBlankRcdCount1822 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NP1822( ) ;
         standaloneModal1NP1822( ) ;
         sMode1822 = Gx_mode ;
         while ( nGXsfl_67_idx < nRC_GXsfl_67 )
         {
            bGXsfl_67_Refreshing = true ;
            readRow1NP1822( ) ;
            edtavnRcdDeleted_1822_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1822_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1822_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1822_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtLb_LinID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINID_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_LinID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinID_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtLb_DTCCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_DTCCANT_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_DTCCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_DTCCant_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            edtPrdNumDTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUMDTC_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNumDTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumDTC_Enabled), 5, 0), !bGXsfl_67_Refreshing);
            if ( ( nRcdExists_1822 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NP1822( ) ;
            }
            sendRow1NP1822( ) ;
            bGXsfl_67_Refreshing = false ;
         }
         Gx_mode = sMode1822 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1822 = (short)(5) ;
         nRcdExists_1822 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NP1822( ) ;
            while ( RcdFound1822 != 0 )
            {
               sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx+1), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
               subsflControlProps_671822( ) ;
               init_level_properties1822( ) ;
               standaloneNotModal1NP1822( ) ;
               getByPrimaryKey1NP1822( ) ;
               standaloneModal1NP1822( ) ;
               addRow1NP1822( ) ;
               scanNext1NP1822( ) ;
            }
            scanEnd1NP1822( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1822 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx+1), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
      subsflControlProps_671822( ) ;
      initAll1NP1822( ) ;
      init_level_properties1822( ) ;
      nRcdExists_1822 = (short)(0) ;
      nIsMod_1822 = (short)(0) ;
      nRcdDeleted_1822 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 40 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_40_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1822 = (short)(nBlankRcdUsr1822+nBlankRcdCount1822) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1822 > 0 )
      {
         standaloneNotModal1NP1822( ) ;
         standaloneModal1NP1822( ) ;
         addRow1NP1822( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLb_LinID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1822 = (short)(nBlankRcdCount1822-1) ;
      }
      Gx_mode = sMode1822 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_40_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_40_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_40_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1NP1821( ) ;
      GXCCtl = "Z13305Lb_IDVeces_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13305Lb_IDVeces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13309Lb_status_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13309Lb_status, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13310Lb_fecDTC_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z13310Lb_fecDTC, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z13311Lb_UltLinI_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13311Lb_UltLinI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_67_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_67_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1821_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1821_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1821_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1821, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_IDVECES_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_IDVeces_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_STATUS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_status_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_FECDTC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fecDTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_ULTLINI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_UltLinI_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_40_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1NP1821( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401821( ) ;
      edtLb_IDVeces_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_IDVECES_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_status_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_STATUS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_fecDTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_FECDTC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_UltLinI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_ULTLINI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_IDVeces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_IDVeces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_IDVECES_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_IDVeces_Internalname ;
         wbErr = true ;
         A13305Lb_IDVeces = (short)(0) ;
      }
      else
      {
         A13305Lb_IDVeces = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_IDVeces_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_status_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_status_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "LB_STATUS_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_status_Internalname ;
         wbErr = true ;
         A13309Lb_status = (byte)(0) ;
         n13309Lb_status = false ;
      }
      else
      {
         A13309Lb_status = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_status_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13309Lb_status = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtLb_fecDTC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "LB_FECDTC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_fecDTC_Internalname ;
         wbErr = true ;
         A13310Lb_fecDTC = GXutil.resetTime( GXutil.nullDate() );
         n13310Lb_fecDTC = false ;
      }
      else
      {
         A13310Lb_fecDTC = localUtil.ctot( httpContext.cgiGet( edtLb_fecDTC_Internalname)) ;
         n13310Lb_fecDTC = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UltLinI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_UltLinI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_ULTLINI_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_UltLinI_Internalname ;
         wbErr = true ;
         A13311Lb_UltLinI = (short)(0) ;
         n13311Lb_UltLinI = false ;
      }
      else
      {
         A13311Lb_UltLinI = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_UltLinI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13311Lb_UltLinI = false ;
      }
      GXCCtl = "Z13305Lb_IDVeces_" + sGXsfl_40_idx ;
      Z13305Lb_IDVeces = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13309Lb_status_" + sGXsfl_40_idx ;
      Z13309Lb_status = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13310Lb_fecDTC_" + sGXsfl_40_idx ;
      Z13310Lb_fecDTC = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13311Lb_UltLinI_" + sGXsfl_40_idx ;
      Z13311Lb_UltLinI = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_67_" + sGXsfl_40_idx ;
      nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1821_" + sGXsfl_40_idx ;
      nRcdDeleted_1821 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1821_" + sGXsfl_40_idx ;
      nRcdExists_1821 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1821_" + sGXsfl_40_idx ;
      nIsMod_1821 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_67_" + sGXsfl_40_idx ;
      nRC_GXsfl_67 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_671822( )
   {
      edtavnRcdDeleted_1822_Internalname = "vNRCDDELETED_1822_"+sGXsfl_67_idx ;
      edtLb_LinID_Internalname = "LB_LINID_"+sGXsfl_67_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_67_idx ;
      edtLb_DTCCant_Internalname = "LB_DTCCANT_"+sGXsfl_67_idx ;
      edtPrdNumDTC_Internalname = "PRDNUMDTC_"+sGXsfl_67_idx ;
   }

   public void subsflControlProps_fel_671822( )
   {
      edtavnRcdDeleted_1822_Internalname = "vNRCDDELETED_1822_"+sGXsfl_67_fel_idx ;
      edtLb_LinID_Internalname = "LB_LINID_"+sGXsfl_67_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_67_fel_idx ;
      edtLb_DTCCant_Internalname = "LB_DTCCANT_"+sGXsfl_67_fel_idx ;
      edtPrdNumDTC_Internalname = "PRDNUMDTC_"+sGXsfl_67_fel_idx ;
   }

   public void addRow1NP1822( )
   {
      nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
      subsflControlProps_671822( ) ;
      sendRow1NP1822( ) ;
   }

   public void sendRow1NP1822( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_67_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1822_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1822_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1822_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1822), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1822), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1822_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1822_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1822_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LinID_Internalname,GXutil.ltrim( localUtil.ntoc( A13306Lb_LinID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13306Lb_LinID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_LinID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_LinID_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1822_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1822_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_DTCCant_Internalname,GXutil.ltrim( localUtil.ntoc( A13307Lb_DTCCant, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLb_DTCCant_Enabled!=0) ? localUtil.format( A13307Lb_DTCCant, "ZZZZ9.99999") : localUtil.format( A13307Lb_DTCCant, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_DTCCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLb_DTCCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1822_" + sGXsfl_67_idx + "',1);gx.fn.setControlValue('nIsMod_1821_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_67_idx + "',67)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNumDTC_Internalname,GXutil.rtrim( A13308PrdNumDTC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNumDTC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNumDTC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(67),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1NP1822( ) ;
      GXCCtl = "Z13306Lb_LinID_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13306Lb_LinID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13307Lb_DTCCant_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13307Lb_DTCCant, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13308PrdNumDTC_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13308PrdNumDTC));
      GXCCtl = "Z719PrdNum_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_1822_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1822_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1822_" + sGXsfl_67_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1822, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1822_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1822_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_LINID_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_DTCCANT_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_DTCCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUMDTC_"+sGXsfl_67_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumDTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1NP1822( )
   {
      nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
      subsflControlProps_671822( ) ;
      edtavnRcdDeleted_1822_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1822_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_LinID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINID_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLb_DTCCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_DTCCANT_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNumDTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUMDTC_"+sGXsfl_67_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1822_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1822_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1822");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1822_Internalname ;
         wbErr = true ;
         nRcdDeleted_1822 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1822 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1822_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LinID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LinID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_LINID_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_LinID_Internalname ;
         wbErr = true ;
         A13306Lb_LinID = (short)(0) ;
      }
      else
      {
         A13306Lb_LinID = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LinID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLb_DTCCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLb_DTCCant_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "LB_DTCCANT_" + sGXsfl_67_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_DTCCant_Internalname ;
         wbErr = true ;
         A13307Lb_DTCCant = DecimalUtil.ZERO ;
         n13307Lb_DTCCant = false ;
      }
      else
      {
         A13307Lb_DTCCant = localUtil.ctond( httpContext.cgiGet( edtLb_DTCCant_Internalname)) ;
         n13307Lb_DTCCant = false ;
      }
      A13308PrdNumDTC = httpContext.cgiGet( edtPrdNumDTC_Internalname) ;
      n13308PrdNumDTC = false ;
      GXCCtl = "Z13306Lb_LinID_" + sGXsfl_67_idx ;
      Z13306Lb_LinID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13307Lb_DTCCant_" + sGXsfl_67_idx ;
      Z13307Lb_DTCCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13308PrdNumDTC_" + sGXsfl_67_idx ;
      Z13308PrdNumDTC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_67_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1822_" + sGXsfl_67_idx ;
      nRcdDeleted_1822 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1822_" + sGXsfl_67_idx ;
      nRcdExists_1822 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1822_" + sGXsfl_67_idx ;
      nIsMod_1822 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_LinID_Enabled = edtLb_LinID_Enabled ;
      defedtLb_IDVeces_Enabled = edtLb_IDVeces_Enabled ;
   }

   public void confirmValues1NP0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401821( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401821( ) ;
         httpContext.changePostValue( "Z13305Lb_IDVeces_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13305Lb_IDVeces_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13305Lb_IDVeces_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z13309Lb_status_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13309Lb_status_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13309Lb_status_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z13310Lb_fecDTC_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13310Lb_fecDTC_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13310Lb_fecDTC_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z13311Lb_UltLinI_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z13311Lb_UltLinI_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13311Lb_UltLinI_"+sGXsfl_40_idx) ;
      }
      nGXsfl_67_idx = 0 ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
      subsflControlProps_671822( ) ;
      while ( nGXsfl_67_idx < nRC_GXsfl_67 )
      {
         nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
         subsflControlProps_671822( ) ;
         httpContext.changePostValue( "Z13306Lb_LinID_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z13306Lb_LinID_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13306Lb_LinID_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z13307Lb_DTCCant_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z13307Lb_DTCCant_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13307Lb_DTCCant_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z13308PrdNumDTC_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z13308PrdNumDTC_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13308PrdNumDTC_"+sGXsfl_67_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_67_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_67_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_67_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tendt00", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13312Lb_NLab", GXutil.ltrim( localUtil.ntoc( Z13312Lb_NLab, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13304Lb_UltIDVe", GXutil.ltrim( localUtil.ntoc( Z13304Lb_UltIDVe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tendt00", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TENDT00" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Importacion Productos DATACOLOR", "") ;
   }

   public void initializeNonKey1NP1820( )
   {
      A13304Lb_UltIDVe = (short)(0) ;
      n13304Lb_UltIDVe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13304Lb_UltIDVe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13304Lb_UltIDVe), 4, 0));
      Z13304Lb_UltIDVe = (short)(0) ;
   }

   public void initAll1NP1820( )
   {
      A13312Lb_NLab = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13312Lb_NLab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13312Lb_NLab), 8, 0));
      initializeNonKey1NP1820( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NP1821( )
   {
      A13309Lb_status = (byte)(0) ;
      n13309Lb_status = false ;
      A13310Lb_fecDTC = GXutil.resetTime( GXutil.nullDate() );
      n13310Lb_fecDTC = false ;
      A13311Lb_UltLinI = (short)(0) ;
      n13311Lb_UltLinI = false ;
      Z13309Lb_status = (byte)(0) ;
      Z13310Lb_fecDTC = GXutil.resetTime( GXutil.nullDate() );
      Z13311Lb_UltLinI = (short)(0) ;
   }

   public void initAll1NP1821( )
   {
      A13305Lb_IDVeces = (short)(0) ;
      initializeNonKey1NP1821( ) ;
   }

   public void standaloneModalInsert1NP1821( )
   {
   }

   public void initializeNonKey1NP1822( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A13307Lb_DTCCant = DecimalUtil.ZERO ;
      n13307Lb_DTCCant = false ;
      A13308PrdNumDTC = "" ;
      n13308PrdNumDTC = false ;
      Z13307Lb_DTCCant = DecimalUtil.ZERO ;
      Z13308PrdNumDTC = "" ;
      Z719PrdNum = "" ;
   }

   public void initAll1NP1822( )
   {
      A13306Lb_LinID = (short)(0) ;
      initializeNonKey1NP1822( ) ;
   }

   public void standaloneModalInsert1NP1822( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415102130", true, true);
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
      httpContext.AddJavascriptSource("tendt00.js", "?202682415102130", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1821( )
   {
      edtLb_IDVeces_Enabled = defedtLb_IDVeces_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_IDVeces_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_IDVeces_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void init_level_properties1822( )
   {
      edtLb_LinID_Enabled = defedtLb_LinID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LinID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinID_Enabled), 5, 0), !bGXsfl_67_Refreshing);
   }

   public void startgridcontrol40( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock5_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13305Lb_IDVeces, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_IDVeces_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock6_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13309Lb_status, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_status_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock7_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A13310Lb_fecDTC, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_fecDTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock4_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13311Lb_UltLinI, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_UltLinI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol67( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1822, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1822_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13306Lb_LinID, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13307Lb_DTCCant, (byte)(11), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_DTCCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A13308PrdNumDTC));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNumDTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtLb_NLab_Internalname = "LB_NLAB" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtLb_UltIDVe_Internalname = "LB_ULTIDVE" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtLb_IDVeces_Internalname = "LB_IDVECES" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtLb_status_Internalname = "LB_STATUS" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtLb_fecDTC_Internalname = "LB_FECDTC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtLb_UltLinI_Internalname = "LB_ULTLINI" ;
      edtavnRcdDeleted_1822_Internalname = "vNRCDDELETED_1822" ;
      edtLb_LinID_Internalname = "LB_LINID" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtLb_DTCCant_Internalname = "LB_DTCCANT" ;
      edtPrdNumDTC_Internalname = "PRDNUMDTC" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock4_Caption = httpContext.getMessage( "Ultima Linea", "") ;
      lblTextblock7_Caption = httpContext.getMessage( "Data Importacion de DATACOLOR", "") ;
      lblTextblock6_Caption = httpContext.getMessage( "Status", "") ;
      lblTextblock5_Caption = httpContext.getMessage( "Lb_ IDVeces", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Importacion Productos DATACOLOR", "") );
      edtPrdNumDTC_Jsonclick = "" ;
      edtLb_DTCCant_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtLb_LinID_Jsonclick = "" ;
      edtavnRcdDeleted_1822_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtLb_UltLinI_Jsonclick = "" ;
      edtLb_fecDTC_Jsonclick = "" ;
      edtLb_status_Jsonclick = "" ;
      edtLb_IDVeces_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtPrdNumDTC_Enabled = 1 ;
      edtLb_DTCCant_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtLb_LinID_Enabled = 1 ;
      edtavnRcdDeleted_1822_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtLb_UltLinI_Enabled = 1 ;
      edtLb_fecDTC_Enabled = 1 ;
      edtLb_status_Enabled = 1 ;
      edtLb_IDVeces_Enabled = 1 ;
      edtLb_UltIDVe_Jsonclick = "" ;
      edtLb_UltIDVe_Backcolor = (int)(0xFFFFFF) ;
      edtLb_UltIDVe_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLb_NLab_Jsonclick = "" ;
      edtLb_NLab_Backcolor = (int)(0xFFFFFF) ;
      edtLb_NLab_Enabled = 1 ;
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
      subsflControlProps_401821( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NP1821( ) ;
         standaloneModal1NP1821( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NP1821( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401821( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_671822( ) ;
      while ( nGXsfl_67_idx <= nRC_GXsfl_67 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NP1821( ) ;
         standaloneModal1NP1821( ) ;
         standaloneNotModal1NP1822( ) ;
         standaloneModal1NP1822( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NP1822( ) ;
         nGXsfl_67_idx = (int)(nGXsfl_67_idx+1) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_67_idx), 4, 0), (short)(4), "0") + sGXsfl_40_idx ;
         subsflControlProps_671822( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T01NP32 */
      pr_default.execute(30, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NP32_A407EmprNom[0] ;
      n407EmprNom = T01NP32_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(30);
      GX_FocusControl = edtLb_UltIDVe_Internalname ;
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

   public void valid_Lb_nlab( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13304Lb_UltIDVe", GXutil.ltrim( localUtil.ntoc( A13304Lb_UltIDVe, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13312Lb_NLab", GXutil.ltrim( localUtil.ntoc( Z13312Lb_NLab, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13304Lb_UltIDVe", GXutil.ltrim( localUtil.ntoc( Z13304Lb_UltIDVe, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01NP33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_LB_NLAB","{handler:'valid_Lb_nlab',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13312Lb_NLab',fld:'LB_NLAB',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LB_NLAB",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13304Lb_UltIDVe',fld:'LB_ULTIDVE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13312Lb_NLab'},{av:'Z407EmprNom'},{av:'Z13304Lb_UltIDVe'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LB_IDVECES","{handler:'valid_Lb_idveces',iparms:[]");
      setEventMetadata("VALID_LB_IDVECES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lb_ultlini',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_LB_LINID","{handler:'valid_Lb_linid',iparms:[]");
      setEventMetadata("VALID_LB_LINID",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prdnumdtc',iparms:[]");
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
      pr_default.close(31);
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13310Lb_fecDTC = GXutil.resetTime( GXutil.nullDate() );
      Z13307Lb_DTCCant = DecimalUtil.ZERO ;
      Z13308PrdNumDTC = "" ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1821 = "" ;
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
      sMode1820 = "" ;
      GXCCtl = "" ;
      A13307Lb_DTCCant = DecimalUtil.ZERO ;
      A13308PrdNumDTC = "" ;
      A13310Lb_fecDTC = GXutil.resetTime( GXutil.nullDate() );
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
      T01NP9_A407EmprNom = new String[] {""} ;
      T01NP9_n407EmprNom = new boolean[] {false} ;
      T01NP10_A13312Lb_NLab = new int[1] ;
      T01NP10_A407EmprNom = new String[] {""} ;
      T01NP10_n407EmprNom = new boolean[] {false} ;
      T01NP10_A13304Lb_UltIDVe = new short[1] ;
      T01NP10_n13304Lb_UltIDVe = new boolean[] {false} ;
      T01NP10_A396EmprCod = new String[] {""} ;
      T01NP11_A396EmprCod = new String[] {""} ;
      T01NP11_A13312Lb_NLab = new int[1] ;
      T01NP8_A13312Lb_NLab = new int[1] ;
      T01NP8_A13304Lb_UltIDVe = new short[1] ;
      T01NP8_n13304Lb_UltIDVe = new boolean[] {false} ;
      T01NP8_A396EmprCod = new String[] {""} ;
      T01NP12_A396EmprCod = new String[] {""} ;
      T01NP12_A13312Lb_NLab = new int[1] ;
      T01NP13_A396EmprCod = new String[] {""} ;
      T01NP13_A13312Lb_NLab = new int[1] ;
      T01NP7_A13312Lb_NLab = new int[1] ;
      T01NP7_A13304Lb_UltIDVe = new short[1] ;
      T01NP7_n13304Lb_UltIDVe = new boolean[] {false} ;
      T01NP7_A396EmprCod = new String[] {""} ;
      T01NP17_A396EmprCod = new String[] {""} ;
      T01NP17_A13312Lb_NLab = new int[1] ;
      T01NP17_A13305Lb_IDVeces = new short[1] ;
      T01NP18_A396EmprCod = new String[] {""} ;
      T01NP18_A13312Lb_NLab = new int[1] ;
      T01NP19_A396EmprCod = new String[] {""} ;
      T01NP19_A13312Lb_NLab = new int[1] ;
      T01NP19_A13305Lb_IDVeces = new short[1] ;
      T01NP19_A13309Lb_status = new byte[1] ;
      T01NP19_n13309Lb_status = new boolean[] {false} ;
      T01NP19_A13310Lb_fecDTC = new java.util.Date[] {GXutil.nullDate()} ;
      T01NP19_n13310Lb_fecDTC = new boolean[] {false} ;
      T01NP19_A13311Lb_UltLinI = new short[1] ;
      T01NP19_n13311Lb_UltLinI = new boolean[] {false} ;
      T01NP20_A396EmprCod = new String[] {""} ;
      T01NP20_A13312Lb_NLab = new int[1] ;
      T01NP20_A13305Lb_IDVeces = new short[1] ;
      T01NP6_A396EmprCod = new String[] {""} ;
      T01NP6_A13312Lb_NLab = new int[1] ;
      T01NP6_A13305Lb_IDVeces = new short[1] ;
      T01NP6_A13309Lb_status = new byte[1] ;
      T01NP6_n13309Lb_status = new boolean[] {false} ;
      T01NP6_A13310Lb_fecDTC = new java.util.Date[] {GXutil.nullDate()} ;
      T01NP6_n13310Lb_fecDTC = new boolean[] {false} ;
      T01NP6_A13311Lb_UltLinI = new short[1] ;
      T01NP6_n13311Lb_UltLinI = new boolean[] {false} ;
      T01NP5_A396EmprCod = new String[] {""} ;
      T01NP5_A13312Lb_NLab = new int[1] ;
      T01NP5_A13305Lb_IDVeces = new short[1] ;
      T01NP5_A13309Lb_status = new byte[1] ;
      T01NP5_n13309Lb_status = new boolean[] {false} ;
      T01NP5_A13310Lb_fecDTC = new java.util.Date[] {GXutil.nullDate()} ;
      T01NP5_n13310Lb_fecDTC = new boolean[] {false} ;
      T01NP5_A13311Lb_UltLinI = new short[1] ;
      T01NP5_n13311Lb_UltLinI = new boolean[] {false} ;
      T01NP24_A396EmprCod = new String[] {""} ;
      T01NP24_A13312Lb_NLab = new int[1] ;
      T01NP24_A13305Lb_IDVeces = new short[1] ;
      T01NP25_A13312Lb_NLab = new int[1] ;
      T01NP25_A13305Lb_IDVeces = new short[1] ;
      T01NP25_A13306Lb_LinID = new short[1] ;
      T01NP25_A13307Lb_DTCCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NP25_n13307Lb_DTCCant = new boolean[] {false} ;
      T01NP25_A13308PrdNumDTC = new String[] {""} ;
      T01NP25_n13308PrdNumDTC = new boolean[] {false} ;
      T01NP25_A396EmprCod = new String[] {""} ;
      T01NP25_A719PrdNum = new String[] {""} ;
      T01NP25_n719PrdNum = new boolean[] {false} ;
      T01NP4_A396EmprCod = new String[] {""} ;
      T01NP26_A396EmprCod = new String[] {""} ;
      T01NP27_A396EmprCod = new String[] {""} ;
      T01NP27_A13312Lb_NLab = new int[1] ;
      T01NP27_A13305Lb_IDVeces = new short[1] ;
      T01NP27_A13306Lb_LinID = new short[1] ;
      T01NP3_A13312Lb_NLab = new int[1] ;
      T01NP3_A13305Lb_IDVeces = new short[1] ;
      T01NP3_A13306Lb_LinID = new short[1] ;
      T01NP3_A13307Lb_DTCCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NP3_n13307Lb_DTCCant = new boolean[] {false} ;
      T01NP3_A13308PrdNumDTC = new String[] {""} ;
      T01NP3_n13308PrdNumDTC = new boolean[] {false} ;
      T01NP3_A396EmprCod = new String[] {""} ;
      T01NP3_A719PrdNum = new String[] {""} ;
      T01NP3_n719PrdNum = new boolean[] {false} ;
      sMode1822 = "" ;
      T01NP2_A13312Lb_NLab = new int[1] ;
      T01NP2_A13305Lb_IDVeces = new short[1] ;
      T01NP2_A13306Lb_LinID = new short[1] ;
      T01NP2_A13307Lb_DTCCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01NP2_n13307Lb_DTCCant = new boolean[] {false} ;
      T01NP2_A13308PrdNumDTC = new String[] {""} ;
      T01NP2_n13308PrdNumDTC = new boolean[] {false} ;
      T01NP2_A396EmprCod = new String[] {""} ;
      T01NP2_A719PrdNum = new String[] {""} ;
      T01NP2_n719PrdNum = new boolean[] {false} ;
      T01NP31_A396EmprCod = new String[] {""} ;
      T01NP31_A13312Lb_NLab = new int[1] ;
      T01NP31_A13305Lb_IDVeces = new short[1] ;
      T01NP31_A13306Lb_LinID = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock5_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01NP32_A407EmprNom = new String[] {""} ;
      T01NP32_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      T01NP33_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tendt00__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tendt00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tendt00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tendt00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tendt00__default(),
         new Object[] {
             new Object[] {
            T01NP2_A13312Lb_NLab, T01NP2_A13305Lb_IDVeces, T01NP2_A13306Lb_LinID, T01NP2_A13307Lb_DTCCant, T01NP2_n13307Lb_DTCCant, T01NP2_A13308PrdNumDTC, T01NP2_n13308PrdNumDTC, T01NP2_A396EmprCod, T01NP2_A719PrdNum, T01NP2_n719PrdNum
            }
            , new Object[] {
            T01NP3_A13312Lb_NLab, T01NP3_A13305Lb_IDVeces, T01NP3_A13306Lb_LinID, T01NP3_A13307Lb_DTCCant, T01NP3_n13307Lb_DTCCant, T01NP3_A13308PrdNumDTC, T01NP3_n13308PrdNumDTC, T01NP3_A396EmprCod, T01NP3_A719PrdNum, T01NP3_n719PrdNum
            }
            , new Object[] {
            T01NP4_A396EmprCod
            }
            , new Object[] {
            T01NP5_A396EmprCod, T01NP5_A13312Lb_NLab, T01NP5_A13305Lb_IDVeces, T01NP5_A13309Lb_status, T01NP5_n13309Lb_status, T01NP5_A13310Lb_fecDTC, T01NP5_n13310Lb_fecDTC, T01NP5_A13311Lb_UltLinI, T01NP5_n13311Lb_UltLinI
            }
            , new Object[] {
            T01NP6_A396EmprCod, T01NP6_A13312Lb_NLab, T01NP6_A13305Lb_IDVeces, T01NP6_A13309Lb_status, T01NP6_n13309Lb_status, T01NP6_A13310Lb_fecDTC, T01NP6_n13310Lb_fecDTC, T01NP6_A13311Lb_UltLinI, T01NP6_n13311Lb_UltLinI
            }
            , new Object[] {
            T01NP7_A13312Lb_NLab, T01NP7_A13304Lb_UltIDVe, T01NP7_n13304Lb_UltIDVe, T01NP7_A396EmprCod
            }
            , new Object[] {
            T01NP8_A13312Lb_NLab, T01NP8_A13304Lb_UltIDVe, T01NP8_n13304Lb_UltIDVe, T01NP8_A396EmprCod
            }
            , new Object[] {
            T01NP9_A407EmprNom, T01NP9_n407EmprNom
            }
            , new Object[] {
            T01NP10_A13312Lb_NLab, T01NP10_A407EmprNom, T01NP10_n407EmprNom, T01NP10_A13304Lb_UltIDVe, T01NP10_n13304Lb_UltIDVe, T01NP10_A396EmprCod
            }
            , new Object[] {
            T01NP11_A396EmprCod, T01NP11_A13312Lb_NLab
            }
            , new Object[] {
            T01NP12_A396EmprCod, T01NP12_A13312Lb_NLab
            }
            , new Object[] {
            T01NP13_A396EmprCod, T01NP13_A13312Lb_NLab
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NP17_A396EmprCod, T01NP17_A13312Lb_NLab, T01NP17_A13305Lb_IDVeces
            }
            , new Object[] {
            T01NP18_A396EmprCod, T01NP18_A13312Lb_NLab
            }
            , new Object[] {
            T01NP19_A396EmprCod, T01NP19_A13312Lb_NLab, T01NP19_A13305Lb_IDVeces, T01NP19_A13309Lb_status, T01NP19_n13309Lb_status, T01NP19_A13310Lb_fecDTC, T01NP19_n13310Lb_fecDTC, T01NP19_A13311Lb_UltLinI, T01NP19_n13311Lb_UltLinI
            }
            , new Object[] {
            T01NP20_A396EmprCod, T01NP20_A13312Lb_NLab, T01NP20_A13305Lb_IDVeces
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NP24_A396EmprCod, T01NP24_A13312Lb_NLab, T01NP24_A13305Lb_IDVeces
            }
            , new Object[] {
            T01NP25_A13312Lb_NLab, T01NP25_A13305Lb_IDVeces, T01NP25_A13306Lb_LinID, T01NP25_A13307Lb_DTCCant, T01NP25_n13307Lb_DTCCant, T01NP25_A13308PrdNumDTC, T01NP25_n13308PrdNumDTC, T01NP25_A396EmprCod, T01NP25_A719PrdNum, T01NP25_n719PrdNum
            }
            , new Object[] {
            T01NP26_A396EmprCod
            }
            , new Object[] {
            T01NP27_A396EmprCod, T01NP27_A13312Lb_NLab, T01NP27_A13305Lb_IDVeces, T01NP27_A13306Lb_LinID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NP31_A396EmprCod, T01NP31_A13312Lb_NLab, T01NP31_A13305Lb_IDVeces, T01NP31_A13306Lb_LinID
            }
            , new Object[] {
            T01NP32_A407EmprNom, T01NP32_n407EmprNom
            }
            , new Object[] {
            T01NP33_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TENDT00" ;
   }

   private byte Z13309Lb_status ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A13309Lb_status ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short Z13304Lb_UltIDVe ;
   private short Z13305Lb_IDVeces ;
   private short Z13311Lb_UltLinI ;
   private short nRcdDeleted_1821 ;
   private short nRcdExists_1821 ;
   private short nIsMod_1821 ;
   private short Z13306Lb_LinID ;
   private short nRcdDeleted_1822 ;
   private short nRcdExists_1822 ;
   private short nIsMod_1822 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13304Lb_UltIDVe ;
   private short nBlankRcdCount1821 ;
   private short RcdFound1821 ;
   private short nBlankRcdUsr1821 ;
   private short RcdFound1822 ;
   private short A13306Lb_LinID ;
   private short A13305Lb_IDVeces ;
   private short A13311Lb_UltLinI ;
   private short RcdFound1820 ;
   private short nIsDirty_1820 ;
   private short nIsDirty_1821 ;
   private short nIsDirty_1822 ;
   private short nBlankRcdCount1822 ;
   private short nBlankRcdUsr1822 ;
   private short subGrid1_Borderwidth ;
   private short ZZ13304Lb_UltIDVe ;
   private int Z13312Lb_NLab ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int nRC_GXsfl_67 ;
   private int nGXsfl_67_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A13312Lb_NLab ;
   private int edtLb_NLab_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtLb_UltIDVe_Enabled ;
   private int edtLb_IDVeces_Enabled ;
   private int edtLb_status_Enabled ;
   private int edtLb_fecDTC_Enabled ;
   private int edtLb_UltLinI_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1822_Enabled ;
   private int edtLb_LinID_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtLb_DTCCant_Enabled ;
   private int edtPrdNumDTC_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtLb_LinID_Enabled ;
   private int defedtLb_IDVeces_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtLb_UltIDVe_Backcolor ;
   private int edtLb_NLab_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13312Lb_NLab ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z13307Lb_DTCCant ;
   private java.math.BigDecimal A13307Lb_DTCCant ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13308PrdNumDTC ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_NLab_Internalname ;
   private String sGXsfl_40_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_67_idx="0001" ;
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
   private String edtLb_NLab_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtLb_UltIDVe_Internalname ;
   private String edtLb_UltIDVe_Jsonclick ;
   private String sMode1821 ;
   private String edtLb_IDVeces_Internalname ;
   private String edtLb_status_Internalname ;
   private String edtLb_fecDTC_Internalname ;
   private String edtLb_UltLinI_Internalname ;
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
   private String edtavnRcdDeleted_1822_Internalname ;
   private String sMode1820 ;
   private String GXCCtl ;
   private String edtLb_LinID_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtLb_DTCCant_Internalname ;
   private String edtPrdNumDTC_Internalname ;
   private String A13308PrdNumDTC ;
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
   private String sMode1822 ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock8_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String ROClassString ;
   private String edtLb_IDVeces_Jsonclick ;
   private String lblTextblock6_Jsonclick ;
   private String edtLb_status_Jsonclick ;
   private String lblTextblock7_Jsonclick ;
   private String edtLb_fecDTC_Jsonclick ;
   private String lblTextblock8_Jsonclick ;
   private String edtLb_UltLinI_Jsonclick ;
   private String sGXsfl_67_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1822_Jsonclick ;
   private String edtLb_LinID_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtLb_DTCCant_Jsonclick ;
   private String edtPrdNumDTC_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock5_Caption ;
   private String lblTextblock6_Caption ;
   private String lblTextblock7_Caption ;
   private String lblTextblock4_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z13310Lb_fecDTC ;
   private java.util.Date A13310Lb_fecDTC ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13304Lb_UltIDVe ;
   private boolean bGXsfl_67_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n13309Lb_status ;
   private boolean n13310Lb_fecDTC ;
   private boolean n13311Lb_UltLinI ;
   private boolean n13307Lb_DTCCant ;
   private boolean n13308PrdNumDTC ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01NP9_A407EmprNom ;
   private boolean[] T01NP9_n407EmprNom ;
   private int[] T01NP10_A13312Lb_NLab ;
   private String[] T01NP10_A407EmprNom ;
   private boolean[] T01NP10_n407EmprNom ;
   private short[] T01NP10_A13304Lb_UltIDVe ;
   private boolean[] T01NP10_n13304Lb_UltIDVe ;
   private String[] T01NP10_A396EmprCod ;
   private String[] T01NP11_A396EmprCod ;
   private int[] T01NP11_A13312Lb_NLab ;
   private int[] T01NP8_A13312Lb_NLab ;
   private short[] T01NP8_A13304Lb_UltIDVe ;
   private boolean[] T01NP8_n13304Lb_UltIDVe ;
   private String[] T01NP8_A396EmprCod ;
   private String[] T01NP12_A396EmprCod ;
   private int[] T01NP12_A13312Lb_NLab ;
   private String[] T01NP13_A396EmprCod ;
   private int[] T01NP13_A13312Lb_NLab ;
   private int[] T01NP7_A13312Lb_NLab ;
   private short[] T01NP7_A13304Lb_UltIDVe ;
   private boolean[] T01NP7_n13304Lb_UltIDVe ;
   private String[] T01NP7_A396EmprCod ;
   private String[] T01NP17_A396EmprCod ;
   private int[] T01NP17_A13312Lb_NLab ;
   private short[] T01NP17_A13305Lb_IDVeces ;
   private String[] T01NP18_A396EmprCod ;
   private int[] T01NP18_A13312Lb_NLab ;
   private String[] T01NP19_A396EmprCod ;
   private int[] T01NP19_A13312Lb_NLab ;
   private short[] T01NP19_A13305Lb_IDVeces ;
   private byte[] T01NP19_A13309Lb_status ;
   private boolean[] T01NP19_n13309Lb_status ;
   private java.util.Date[] T01NP19_A13310Lb_fecDTC ;
   private boolean[] T01NP19_n13310Lb_fecDTC ;
   private short[] T01NP19_A13311Lb_UltLinI ;
   private boolean[] T01NP19_n13311Lb_UltLinI ;
   private String[] T01NP20_A396EmprCod ;
   private int[] T01NP20_A13312Lb_NLab ;
   private short[] T01NP20_A13305Lb_IDVeces ;
   private String[] T01NP6_A396EmprCod ;
   private int[] T01NP6_A13312Lb_NLab ;
   private short[] T01NP6_A13305Lb_IDVeces ;
   private byte[] T01NP6_A13309Lb_status ;
   private boolean[] T01NP6_n13309Lb_status ;
   private java.util.Date[] T01NP6_A13310Lb_fecDTC ;
   private boolean[] T01NP6_n13310Lb_fecDTC ;
   private short[] T01NP6_A13311Lb_UltLinI ;
   private boolean[] T01NP6_n13311Lb_UltLinI ;
   private String[] T01NP5_A396EmprCod ;
   private int[] T01NP5_A13312Lb_NLab ;
   private short[] T01NP5_A13305Lb_IDVeces ;
   private byte[] T01NP5_A13309Lb_status ;
   private boolean[] T01NP5_n13309Lb_status ;
   private java.util.Date[] T01NP5_A13310Lb_fecDTC ;
   private boolean[] T01NP5_n13310Lb_fecDTC ;
   private short[] T01NP5_A13311Lb_UltLinI ;
   private boolean[] T01NP5_n13311Lb_UltLinI ;
   private String[] T01NP24_A396EmprCod ;
   private int[] T01NP24_A13312Lb_NLab ;
   private short[] T01NP24_A13305Lb_IDVeces ;
   private int[] T01NP25_A13312Lb_NLab ;
   private short[] T01NP25_A13305Lb_IDVeces ;
   private short[] T01NP25_A13306Lb_LinID ;
   private java.math.BigDecimal[] T01NP25_A13307Lb_DTCCant ;
   private boolean[] T01NP25_n13307Lb_DTCCant ;
   private String[] T01NP25_A13308PrdNumDTC ;
   private boolean[] T01NP25_n13308PrdNumDTC ;
   private String[] T01NP25_A396EmprCod ;
   private String[] T01NP25_A719PrdNum ;
   private boolean[] T01NP25_n719PrdNum ;
   private String[] T01NP4_A396EmprCod ;
   private String[] T01NP26_A396EmprCod ;
   private String[] T01NP27_A396EmprCod ;
   private int[] T01NP27_A13312Lb_NLab ;
   private short[] T01NP27_A13305Lb_IDVeces ;
   private short[] T01NP27_A13306Lb_LinID ;
   private int[] T01NP3_A13312Lb_NLab ;
   private short[] T01NP3_A13305Lb_IDVeces ;
   private short[] T01NP3_A13306Lb_LinID ;
   private java.math.BigDecimal[] T01NP3_A13307Lb_DTCCant ;
   private boolean[] T01NP3_n13307Lb_DTCCant ;
   private String[] T01NP3_A13308PrdNumDTC ;
   private boolean[] T01NP3_n13308PrdNumDTC ;
   private String[] T01NP3_A396EmprCod ;
   private String[] T01NP3_A719PrdNum ;
   private boolean[] T01NP3_n719PrdNum ;
   private int[] T01NP2_A13312Lb_NLab ;
   private short[] T01NP2_A13305Lb_IDVeces ;
   private short[] T01NP2_A13306Lb_LinID ;
   private java.math.BigDecimal[] T01NP2_A13307Lb_DTCCant ;
   private boolean[] T01NP2_n13307Lb_DTCCant ;
   private String[] T01NP2_A13308PrdNumDTC ;
   private boolean[] T01NP2_n13308PrdNumDTC ;
   private String[] T01NP2_A396EmprCod ;
   private String[] T01NP2_A719PrdNum ;
   private boolean[] T01NP2_n719PrdNum ;
   private String[] T01NP31_A396EmprCod ;
   private int[] T01NP31_A13312Lb_NLab ;
   private short[] T01NP31_A13305Lb_IDVeces ;
   private short[] T01NP31_A13306Lb_LinID ;
   private String[] T01NP32_A407EmprNom ;
   private boolean[] T01NP32_n407EmprNom ;
   private String[] T01NP33_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tendt00__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tendt00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tendt00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tendt00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tendt00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NP2", "SELECT Lb_NLab, Lb_IDVeces, Lb_LinID, Lb_DTCCant, PrdNumDTC, EmprCod, PrdNum FROM TXPENDT02 WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? AND Lb_LinID = ?  FOR UPDATE OF Lb_DTCCant, PrdNumDTC, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP3", "SELECT Lb_NLab, Lb_IDVeces, Lb_LinID, Lb_DTCCant, PrdNumDTC, EmprCod, PrdNum FROM TXPENDT02 WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? AND Lb_LinID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP4", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP5", "SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_status, Lb_fecDTC, Lb_UltLinI FROM TXPENDT01 WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ?  FOR UPDATE OF Lb_status, Lb_fecDTC, Lb_UltLinI NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP6", "SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_status, Lb_fecDTC, Lb_UltLinI FROM TXPENDT01 WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP7", "SELECT Lb_NLab, Lb_UltIDVe, EmprCod FROM TXPENDT00 WHERE EmprCod = ? AND Lb_NLab = ?  FOR UPDATE OF Lb_UltIDVe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP8", "SELECT Lb_NLab, Lb_UltIDVe, EmprCod FROM TXPENDT00 WHERE EmprCod = ? AND Lb_NLab = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP10", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_NLab, T2.EmprNom, TM1.Lb_UltIDVe, TM1.EmprCod FROM (TXPENDT00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Lb_NLab = ? ORDER BY TM1.EmprCod, TM1.Lb_NLab ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_NLab FROM TXPENDT00 WHERE EmprCod = ? AND Lb_NLab = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_NLab FROM TXPENDT00 WHERE ( Lb_NLab > ?) and EmprCod = ? ORDER BY EmprCod, Lb_NLab) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NP13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_NLab FROM TXPENDT00 WHERE ( Lb_NLab < ?) and EmprCod = ? ORDER BY EmprCod DESC, Lb_NLab DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NP14", "INSERT INTO TXPENDT00(Lb_NLab, Lb_UltIDVe, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPENDT00")
         ,new UpdateCursor("T01NP15", "UPDATE TXPENDT00 SET Lb_UltIDVe=?  WHERE EmprCod = ? AND Lb_NLab = ?", GX_NOMASK, "TXPENDT00")
         ,new UpdateCursor("T01NP16", "DELETE FROM TXPENDT00  WHERE EmprCod = ? AND Lb_NLab = ?", GX_NOMASK, "TXPENDT00")
         ,new ForEachCursor("T01NP17", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces FROM TXPENDT01 WHERE EmprCod = ? AND Lb_NLab = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NP18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_NLab FROM TXPENDT00 WHERE EmprCod = ? ORDER BY EmprCod, Lb_NLab ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP19", "SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_status, Lb_fecDTC, Lb_UltLinI FROM TXPENDT01 WHERE EmprCod = ? and Lb_NLab = ? and Lb_IDVeces = ? ORDER BY EmprCod, Lb_NLab, Lb_IDVeces ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP20", "SELECT EmprCod, Lb_NLab, Lb_IDVeces FROM TXPENDT01 WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NP21", "INSERT INTO TXPENDT01(EmprCod, Lb_NLab, Lb_IDVeces, Lb_status, Lb_fecDTC, Lb_UltLinI) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENDT01")
         ,new UpdateCursor("T01NP22", "UPDATE TXPENDT01 SET Lb_status=?, Lb_fecDTC=?, Lb_UltLinI=?  WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ?", GX_NOMASK, "TXPENDT01")
         ,new UpdateCursor("T01NP23", "DELETE FROM TXPENDT01  WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ?", GX_NOMASK, "TXPENDT01")
         ,new ForEachCursor("T01NP24", "SELECT EmprCod, Lb_NLab, Lb_IDVeces FROM TXPENDT01 WHERE EmprCod = ? and Lb_NLab = ? ORDER BY EmprCod, Lb_NLab, Lb_IDVeces ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP25", "SELECT Lb_NLab, Lb_IDVeces, Lb_LinID, Lb_DTCCant, PrdNumDTC, EmprCod, PrdNum FROM TXPENDT02 WHERE EmprCod = ? and Lb_NLab = ? and Lb_IDVeces = ? and Lb_LinID = ? ORDER BY EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP26", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP27", "SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? AND Lb_LinID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NP28", "INSERT INTO TXPENDT02(Lb_NLab, Lb_IDVeces, Lb_LinID, Lb_DTCCant, PrdNumDTC, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENDT02")
         ,new UpdateCursor("T01NP29", "UPDATE TXPENDT02 SET Lb_DTCCant=?, PrdNumDTC=?, PrdNum=?  WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? AND Lb_LinID = ?", GX_NOMASK, "TXPENDT02")
         ,new UpdateCursor("T01NP30", "DELETE FROM TXPENDT02  WHERE EmprCod = ? AND Lb_NLab = ? AND Lb_IDVeces = ? AND Lb_LinID = ?", GX_NOMASK, "TXPENDT02")
         ,new ForEachCursor("T01NP31", "SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? and Lb_NLab = ? and Lb_IDVeces = ? ORDER BY EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP32", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NP33", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
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
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 20);
               }
               stmt.setString(6, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 6);
               }
               return;
            case 27 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               return;
            case 31 :
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
      }
   }

}

