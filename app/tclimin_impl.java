package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclimin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MINIMOS CLIENTE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A10054CliUltlk = (short)(GXutil.lval( httpContext.GetPar( "CliUltlk"))) ;
      n10054CliUltlk = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tclimin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclimin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclimin_impl.class ));
   }

   public tclimin_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLIMIN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kilos MINIMOS", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliKgsMn_Internalname, GXutil.ltrim( localUtil.ntoc( A10053CliKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliKgsMn_Enabled!=0) ? localUtil.format( A10053CliKgsMn, "ZZZZZ9.99") : localUtil.format( A10053CliKgsMn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliKgsMn_Jsonclick, 0, "", "", "", "", "", 1, edtCliKgsMn_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliUltlk_Internalname, GXutil.ltrim( localUtil.ntoc( A10054CliUltlk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliUltlk_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10054CliUltlk), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10054CliUltlk), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliUltlk_Jsonclick, 0, "", "", "", "", "", 1, edtCliUltlk_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "ColUL", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColUL_Internalname, GXutil.ltrim( localUtil.ntoc( A1699ColUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1699ColUL), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1699ColUL), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColUL_Jsonclick, 0, "", "", "", "", "", 1, edtColUL_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIMIN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1366 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1366 = (short)(1) ;
            scanStart16W1366( ) ;
            while ( RcdFound1366 != 0 )
            {
               init_level_properties1366( ) ;
               getByPrimaryKey16W1366( ) ;
               addRow16W1366( ) ;
               scanNext16W1366( ) ;
            }
            scanEnd16W1366( ) ;
            nBlankRcdCount1366 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B10054CliUltlk = A10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         standaloneNotModal16W1366( ) ;
         standaloneModal16W1366( ) ;
         sMode1366 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow16W1366( ) ;
            edtavnRcdDeleted_1366_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1366_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1366_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1366_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliLK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLILK_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliLK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliLK_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliKgi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIKGI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliKgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliKgf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIKGF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliKgf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCliKgP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIKGP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliKgP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgP_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1366 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16W1366( ) ;
            }
            sendRow16W1366( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1366 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10054CliUltlk = B10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1366 = (short)(5) ;
         nRcdExists_1366 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16W1366( ) ;
            while ( RcdFound1366 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551366( ) ;
               init_level_properties1366( ) ;
               standaloneNotModal16W1366( ) ;
               getByPrimaryKey16W1366( ) ;
               standaloneModal16W1366( ) ;
               addRow16W1366( ) ;
               scanNext16W1366( ) ;
            }
            scanEnd16W1366( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1366 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551366( ) ;
      initAll16W1366( ) ;
      init_level_properties1366( ) ;
      B10054CliUltlk = A10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      nRcdExists_1366 = (short)(0) ;
      nIsMod_1366 = (short)(0) ;
      nRcdDeleted_1366 = (short)(0) ;
      nBlankRcdCount1366 = (short)(nBlankRcdUsr1366+nBlankRcdCount1366) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1366 > 0 )
      {
         standaloneNotModal16W1366( ) ;
         standaloneModal16W1366( ) ;
         addRow16W1366( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCliKgi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1366 = (short)(nBlankRcdCount1366-1) ;
      }
      Gx_mode = sMode1366 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A10054CliUltlk = B10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIMIN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLIMIN.htm");
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
      e1116W2 ();
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
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z10053CliKgsMn = localUtil.ctond( httpContext.cgiGet( "Z10053CliKgsMn")) ;
            Z10054CliUltlk = (short)(localUtil.ctol( httpContext.cgiGet( "Z10054CliUltlk"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10054CliUltlk = (short)(localUtil.ctol( httpContext.cgiGet( "O10054CliUltlk"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliKgsMn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliKgsMn_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLIKGSMN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliKgsMn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10053CliKgsMn = DecimalUtil.ZERO ;
               n10053CliKgsMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10053CliKgsMn", GXutil.ltrimstr( A10053CliKgsMn, 9, 2));
            }
            else
            {
               A10053CliKgsMn = localUtil.ctond( httpContext.cgiGet( edtCliKgsMn_Internalname)) ;
               n10053CliKgsMn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10053CliKgsMn", GXutil.ltrimstr( A10053CliKgsMn, 9, 2));
            }
            A10054CliUltlk = (short)(localUtil.ctol( httpContext.cgiGet( edtCliUltlk_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10054CliUltlk = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
            A1699ColUL = (short)(localUtil.ctol( httpContext.cgiGet( edtColUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1699ColUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
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
                        e1116W2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216W2 ();
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
         /* Execute user event: After Trn */
         e1216W2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16W21( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1366_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1366_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes16W21( ) ;
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

   public void confirm_16W0( )
   {
      beforeValidate16W21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16W21( ) ;
         }
         else
         {
            checkExtendedTable16W21( ) ;
            if ( AnyError == 0 )
            {
               zm16W21( 13) ;
               zm16W21( 14) ;
            }
            closeExtendedTableCursors16W21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_16W1366( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode21 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues16W0( ) ;
      }
   }

   public void confirm_16W1366( )
   {
      s10054CliUltlk = O10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16W1366( ) ;
         if ( ( nRcdExists_1366 != 0 ) || ( nIsMod_1366 != 0 ) )
         {
            getKey16W1366( ) ;
            if ( ( nRcdExists_1366 == 0 ) && ( nRcdDeleted_1366 == 0 ) )
            {
               if ( RcdFound1366 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16W1366( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16W1366( ) ;
                     if ( AnyError == 0 )
                     {
                        zm16W1366( 18) ;
                     }
                     closeExtendedTableCursors16W1366( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O10054CliUltlk = A10054CliUltlk ;
                     n10054CliUltlk = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1366 != 0 )
               {
                  if ( nRcdDeleted_1366 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16W1366( ) ;
                     load16W1366( ) ;
                     beforeValidate16W1366( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16W1366( ) ;
                        O10054CliUltlk = A10054CliUltlk ;
                        n10054CliUltlk = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1366 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16W1366( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16W1366( ) ;
                           if ( AnyError == 0 )
                           {
                              zm16W1366( 18) ;
                           }
                           closeExtendedTableCursors16W1366( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O10054CliUltlk = A10054CliUltlk ;
                           n10054CliUltlk = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1366 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1366_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliLK_Internalname, GXutil.ltrim( localUtil.ntoc( A10055CliLK, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliKgi_Internalname, GXutil.ltrim( localUtil.ntoc( A10056CliKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliKgf_Internalname, GXutil.ltrim( localUtil.ntoc( A10057CliKgf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliKgP_Internalname, GXutil.ltrim( localUtil.ntoc( A10058CliKgP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10055CliLK_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10055CliLK, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10056CliKgi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10056CliKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10057CliKgf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10057CliKgf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10058CliKgP_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10058CliKgP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1366_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1366_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1366_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1366 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1366_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1366_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLILK_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliLK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIKGI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIKGF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIKGP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O10054CliUltlk = s10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      /* Start of After( level) rules */
      /* Using cursor T016W5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1699ColUL = T016W5_A1699ColUL[0] ;
         n1699ColUL = T016W5_n1699ColUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      else
      {
         A1699ColUL = (short)(0) ;
         n1699ColUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption16W0( )
   {
   }

   public void e1116W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tclimin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tclimin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tclimin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV14Lit2 = httpContext.getMessage( "Cliente", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      AV15Lit3 = httpContext.getMessage( "Kilos MINIMOS", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclimin_impl.this.A396EmprCod = GXv_char2[0] ;
      tclimin_impl.this.AV11EmprNom = GXv_char3[0] ;
      tclimin_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e1216W2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( A10053CliKgsMn.doubleValue() == 0 ) && ( A1699ColUL > 0 ) )
      {
         GX_FocusControl = edtCliKgsMn_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void zm16W21( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T016W7_A279CliNom[0] ;
            Z10053CliKgsMn = T016W7_A10053CliKgsMn[0] ;
            Z10054CliUltlk = T016W7_A10054CliUltlk[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z10053CliKgsMn = A10053CliKgsMn ;
            Z10054CliUltlk = A10054CliUltlk ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z10053CliKgsMn = A10053CliKgsMn ;
         Z10054CliUltlk = A10054CliUltlk ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z1699ColUL = A1699ColUL ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliUltlk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltlk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltlk_Enabled), 5, 0), true);
      AV33Pgmname = "TCLIMIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliUltlk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltlk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltlk_Enabled), 5, 0), true);
      /* Using cursor T016W8 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016W8_A407EmprNom[0] ;
      n407EmprNom = T016W8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO existe", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Función NO permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite borrado", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load16W21( )
   {
      /* Using cursor T016W10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T016W10_A407EmprNom[0] ;
         n407EmprNom = T016W10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T016W10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A10053CliKgsMn = T016W10_A10053CliKgsMn[0] ;
         n10053CliKgsMn = T016W10_n10053CliKgsMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10053CliKgsMn", GXutil.ltrimstr( A10053CliKgsMn, 9, 2));
         A10054CliUltlk = T016W10_A10054CliUltlk[0] ;
         n10054CliUltlk = T016W10_n10054CliUltlk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         A1699ColUL = T016W10_A1699ColUL[0] ;
         n1699ColUL = T016W10_n1699ColUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
         zm16W21( -12) ;
      }
      pr_default.close(6);
      onLoadActions16W21( ) ;
   }

   public void onLoadActions16W21( )
   {
   }

   public void checkExtendedTable16W21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T016W5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1699ColUL = T016W5_A1699ColUL[0] ;
         n1699ColUL = T016W5_n1699ColUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      else
      {
         nIsDirty_21 = (short)(1) ;
         A1699ColUL = (short)(0) ;
         n1699ColUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursors16W21( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T016W12 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1699ColUL = T016W12_A1699ColUL[0] ;
         n1699ColUL = T016W12_n1699ColUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      else
      {
         A1699ColUL = (short)(0) ;
         n1699ColUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1699ColUL, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey16W21( )
   {
      /* Using cursor T016W13 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016W7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T016W7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16W21( 12) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T016W7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T016W7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A10053CliKgsMn = T016W7_A10053CliKgsMn[0] ;
         n10053CliKgsMn = T016W7_n10053CliKgsMn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10053CliKgsMn", GXutil.ltrimstr( A10053CliKgsMn, 9, 2));
         A10054CliUltlk = T016W7_A10054CliUltlk[0] ;
         n10054CliUltlk = T016W7_n10054CliUltlk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         O10054CliUltlk = A10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16W21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey16W21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey16W21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16W21( ) ;
      if ( RcdFound21 == 0 )
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
      RcdFound21 = (short)(0) ;
      /* Using cursor T016W14 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T016W14_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T016W14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T016W14_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T016W14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T016W14_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T016W15 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T016W15_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T016W15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T016W15_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T016W15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T016W15_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16W21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A10054CliUltlk = O10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16W21( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A10054CliUltlk = O10054CliUltlk ;
               n10054CliUltlk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A10054CliUltlk = O10054CliUltlk ;
               n10054CliUltlk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
               update16W21( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A10054CliUltlk = O10054CliUltlk ;
               n10054CliUltlk = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16W21( ) ;
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
                  A10054CliUltlk = O10054CliUltlk ;
                  n10054CliUltlk = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16W21( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A10054CliUltlk = O10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey16W21( ) ;
      if ( RcdFound21 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tclimin");
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_16W0( ) ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart16W21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16W21( ) ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
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
      scanStart16W21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNext16W21( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16W21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16W21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016W6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T016W6_A279CliNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z10053CliKgsMn, T016W6_A10053CliKgsMn[0]) != 0 ) || ( Z10054CliUltlk != T016W6_A10054CliUltlk[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T016W6_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tclimin:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T016W6_A279CliNom[0]);
            }
            if ( DecimalUtil.compareTo(Z10053CliKgsMn, T016W6_A10053CliKgsMn[0]) != 0 )
            {
               GXutil.writeLogln("tclimin:[seudo value changed for attri]"+"CliKgsMn");
               GXutil.writeLogRaw("Old: ",Z10053CliKgsMn);
               GXutil.writeLogRaw("Current: ",T016W6_A10053CliKgsMn[0]);
            }
            if ( Z10054CliUltlk != T016W6_A10054CliUltlk[0] )
            {
               GXutil.writeLogln("tclimin:[seudo value changed for attri]"+"CliUltlk");
               GXutil.writeLogRaw("Old: ",Z10054CliUltlk);
               GXutil.writeLogRaw("Current: ",T016W6_A10054CliUltlk[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16W21( )
   {
      beforeValidate16W21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16W21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16W21( 0) ;
         checkOptimisticConcurrency16W21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16W21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16W21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016W16 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n10053CliKgsMn), A10053CliKgsMn, Boolean.valueOf(n10054CliUltlk), Short.valueOf(A10054CliUltlk), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        processLevel16W21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16W0( ) ;
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
            load16W21( ) ;
         }
         endLevel16W21( ) ;
      }
      closeExtendedTableCursors16W21( ) ;
   }

   public void update16W21( )
   {
      beforeValidate16W21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16W21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16W21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16W21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16W21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016W17 */
                  pr_default.execute(12, new Object[] {A279CliNom, Boolean.valueOf(n10053CliKgsMn), A10053CliKgsMn, Boolean.valueOf(n10054CliUltlk), Short.valueOf(A10054CliUltlk), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16W21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16W21( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16W0( ) ;
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
         endLevel16W21( ) ;
      }
      closeExtendedTableCursors16W21( ) ;
   }

   public void deferredUpdate16W21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16W21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16W21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16W21( ) ;
         afterConfirm16W21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16W21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016W18 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound21 == 0 )
                     {
                        initAll16W21( ) ;
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
                     resetCaption16W0( ) ;
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16W21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16W21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016W20 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            A1699ColUL = T016W20_A1699ColUL[0] ;
            n1699ColUL = T016W20_n1699ColUL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
         }
         else
         {
            A1699ColUL = (short)(0) ;
            n1699ColUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel16W1366( )
   {
      s10054CliUltlk = O10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow16W1366( ) ;
         if ( ( nRcdExists_1366 != 0 ) || ( nIsMod_1366 != 0 ) )
         {
            standaloneNotModal16W1366( ) ;
            getKey16W1366( ) ;
            if ( ( nRcdExists_1366 == 0 ) && ( nRcdDeleted_1366 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16W1366( ) ;
            }
            else
            {
               if ( RcdFound1366 != 0 )
               {
                  if ( ( nRcdDeleted_1366 != 0 ) && ( nRcdExists_1366 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16W1366( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1366 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16W1366( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1366 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O10054CliUltlk = A10054CliUltlk ;
            n10054CliUltlk = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1366_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliLK_Internalname, GXutil.ltrim( localUtil.ntoc( A10055CliLK, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliKgi_Internalname, GXutil.ltrim( localUtil.ntoc( A10056CliKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliKgf_Internalname, GXutil.ltrim( localUtil.ntoc( A10057CliKgf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliKgP_Internalname, GXutil.ltrim( localUtil.ntoc( A10058CliKgP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10055CliLK_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10055CliLK, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10056CliKgi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10056CliKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10057CliKgf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10057CliKgf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10058CliKgP_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z10058CliKgP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1366_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1366_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1366_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1366 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1366_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1366_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLILK_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliLK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIKGI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIKGF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIKGP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T016W20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A1699ColUL = T016W20_A1699ColUL[0] ;
         n1699ColUL = T016W20_n1699ColUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      else
      {
         A1699ColUL = (short)(0) ;
         n1699ColUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      /* End of After( level) rules */
      initAll16W1366( ) ;
      if ( AnyError != 0 )
      {
         O10054CliUltlk = s10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      }
      nRcdExists_1366 = (short)(0) ;
      nIsMod_1366 = (short)(0) ;
      nRcdDeleted_1366 = (short)(0) ;
   }

   public void processLevel16W21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel16W1366( ) ;
      if ( AnyError != 0 )
      {
         O10054CliUltlk = s10054CliUltlk ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T016W21 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n10054CliUltlk), Short.valueOf(A10054CliUltlk), A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevel16W21( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete16W21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclimin");
         if ( AnyError == 0 )
         {
            confirmValues16W0( ) ;
         }
         /* After transaction rules */
         if ( ( A10053CliKgsMn.doubleValue() == 0 ) && true /* After */ && ( A1699ColUL > 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos MINIMOS Obligatorio¡¡¡", ""), 1, "CLIKGSMN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliKgsMn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            return  ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclimin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16W21( )
   {
      /* Scan By routine */
      /* Using cursor T016W22 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T016W22_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16W21( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T016W22_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd16W21( )
   {
      pr_default.close(16);
   }

   public void afterConfirm16W21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16W21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16W21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16W21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16W21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16W21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16W21( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtCliKgsMn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliKgsMn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgsMn_Enabled), 5, 0), true);
      edtCliUltlk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltlk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltlk_Enabled), 5, 0), true);
      edtColUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColUL_Enabled), 5, 0), true);
   }

   public void zm16W1366( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10056CliKgi = T016W3_A10056CliKgi[0] ;
            Z10057CliKgf = T016W3_A10057CliKgf[0] ;
            Z10058CliKgP = T016W3_A10058CliKgP[0] ;
         }
         else
         {
            Z10056CliKgi = A10056CliKgi ;
            Z10057CliKgf = A10057CliKgf ;
            Z10058CliKgP = A10058CliKgP ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z252CliCod = A252CliCod ;
         Z10055CliLK = A10055CliLK ;
         Z10056CliKgi = A10056CliKgi ;
         Z10057CliKgf = A10057CliKgf ;
         Z10058CliKgP = A10058CliKgP ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal16W1366( )
   {
      edtCliLK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliLK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliLK_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliUltlk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltlk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltlk_Enabled), 5, 0), true);
      edtCliUltlk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliUltlk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliUltlk_Enabled), 5, 0), true);
   }

   public void standaloneModal16W1366( )
   {
      if ( isIns( )  )
      {
         A10054CliUltlk = (short)(O10054CliUltlk+1) ;
         n10054CliUltlk = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A10055CliLK = A10054CliUltlk ;
      }
   }

   public void load16W1366( )
   {
      /* Using cursor T016W23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1366 = (short)(1) ;
         A10056CliKgi = T016W23_A10056CliKgi[0] ;
         n10056CliKgi = T016W23_n10056CliKgi[0] ;
         A10057CliKgf = T016W23_A10057CliKgf[0] ;
         n10057CliKgf = T016W23_n10057CliKgf[0] ;
         A10058CliKgP = T016W23_A10058CliKgP[0] ;
         n10058CliKgP = T016W23_n10058CliKgP[0] ;
         zm16W1366( -15) ;
      }
      pr_default.close(17);
      onLoadActions16W1366( ) ;
   }

   public void onLoadActions16W1366( )
   {
   }

   public void checkExtendedTable16W1366( )
   {
      nIsDirty_1366 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal16W1366( ) ;
   }

   public void closeExtendedTableCursors16W1366( )
   {
   }

   public void enableDisable16W1366( )
   {
   }

   public void getKey16W1366( )
   {
      /* Using cursor T016W24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1366 = (short)(1) ;
      }
      else
      {
         RcdFound1366 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey16W1366( )
   {
      /* Using cursor T016W3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016W3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16W1366( 15) ;
         RcdFound1366 = (short)(1) ;
         initializeNonKey16W1366( ) ;
         A10055CliLK = T016W3_A10055CliLK[0] ;
         A10056CliKgi = T016W3_A10056CliKgi[0] ;
         n10056CliKgi = T016W3_n10056CliKgi[0] ;
         A10057CliKgf = T016W3_A10057CliKgf[0] ;
         n10057CliKgf = T016W3_n10057CliKgf[0] ;
         A10058CliKgP = T016W3_A10058CliKgP[0] ;
         n10058CliKgP = T016W3_n10058CliKgP[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z10055CliLK = A10055CliLK ;
         sMode1366 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16W1366( ) ;
         load16W1366( ) ;
         Gx_mode = sMode1366 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1366 = (short)(0) ;
         initializeNonKey16W1366( ) ;
         sMode1366 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16W1366( ) ;
         Gx_mode = sMode1366 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16W1366( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16W1366( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIMIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z10056CliKgi, T016W2_A10056CliKgi[0]) != 0 ) || ( DecimalUtil.compareTo(Z10057CliKgf, T016W2_A10057CliKgf[0]) != 0 ) || ( DecimalUtil.compareTo(Z10058CliKgP, T016W2_A10058CliKgP[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z10056CliKgi, T016W2_A10056CliKgi[0]) != 0 )
            {
               GXutil.writeLogln("tclimin:[seudo value changed for attri]"+"CliKgi");
               GXutil.writeLogRaw("Old: ",Z10056CliKgi);
               GXutil.writeLogRaw("Current: ",T016W2_A10056CliKgi[0]);
            }
            if ( DecimalUtil.compareTo(Z10057CliKgf, T016W2_A10057CliKgf[0]) != 0 )
            {
               GXutil.writeLogln("tclimin:[seudo value changed for attri]"+"CliKgf");
               GXutil.writeLogRaw("Old: ",Z10057CliKgf);
               GXutil.writeLogRaw("Current: ",T016W2_A10057CliKgf[0]);
            }
            if ( DecimalUtil.compareTo(Z10058CliKgP, T016W2_A10058CliKgP[0]) != 0 )
            {
               GXutil.writeLogln("tclimin:[seudo value changed for attri]"+"CliKgP");
               GXutil.writeLogRaw("Old: ",Z10058CliKgP);
               GXutil.writeLogRaw("Current: ",T016W2_A10058CliKgP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIMIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16W1366( )
   {
      beforeValidate16W1366( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16W1366( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16W1366( 0) ;
         checkOptimisticConcurrency16W1366( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16W1366( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16W1366( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016W25 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK), Boolean.valueOf(n10056CliKgi), A10056CliKgi, Boolean.valueOf(n10057CliKgf), A10057CliKgf, Boolean.valueOf(n10058CliKgP), A10058CliKgP, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMIN");
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
            load16W1366( ) ;
         }
         endLevel16W1366( ) ;
      }
      closeExtendedTableCursors16W1366( ) ;
   }

   public void update16W1366( )
   {
      beforeValidate16W1366( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16W1366( ) ;
      }
      if ( ( nIsMod_1366 != 0 ) || ( nIsDirty_1366 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16W1366( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16W1366( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16W1366( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016W26 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n10056CliKgi), A10056CliKgi, Boolean.valueOf(n10057CliKgf), A10057CliKgf, Boolean.valueOf(n10058CliKgP), A10058CliKgP, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMIN");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIMIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16W1366( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16W1366( ) ;
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
            endLevel16W1366( ) ;
         }
      }
      closeExtendedTableCursors16W1366( ) ;
   }

   public void deferredUpdate16W1366( )
   {
   }

   public void delete16W1366( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16W1366( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16W1366( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16W1366( ) ;
         afterConfirm16W1366( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16W1366( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016W27 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A10055CliLK)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMIN");
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
      sMode1366 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16W1366( ) ;
      Gx_mode = sMode1366 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16W1366( )
   {
      standaloneModal16W1366( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel16W1366( )
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

   public void scanStart16W1366( )
   {
      /* Scan By routine */
      /* Using cursor T016W28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      RcdFound1366 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1366 = (short)(1) ;
         A10055CliLK = T016W28_A10055CliLK[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16W1366( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1366 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1366 = (short)(1) ;
         A10055CliLK = T016W28_A10055CliLK[0] ;
      }
   }

   public void scanEnd16W1366( )
   {
      pr_default.close(22);
   }

   public void afterConfirm16W1366( )
   {
      /* After Confirm Rules */
      if ( ( A10057CliKgf.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "CLIKGF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Final = 0 ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliKgf_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert16W1366( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16W1366( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16W1366( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16W1366( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16W1366( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16W1366( )
   {
      edtCliLK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliLK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliLK_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliKgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliKgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliKgf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliKgf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCliKgP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliKgP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliKgP_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes16W1366( )
   {
   }

   public void send_integrity_lvl_hashes16W21( )
   {
   }

   public void subsflControlProps_551366( )
   {
      edtavnRcdDeleted_1366_Internalname = "vNRCDDELETED_1366_"+sGXsfl_55_idx ;
      edtCliLK_Internalname = "CLILK_"+sGXsfl_55_idx ;
      edtCliKgi_Internalname = "CLIKGI_"+sGXsfl_55_idx ;
      edtCliKgf_Internalname = "CLIKGF_"+sGXsfl_55_idx ;
      edtCliKgP_Internalname = "CLIKGP_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551366( )
   {
      edtavnRcdDeleted_1366_Internalname = "vNRCDDELETED_1366_"+sGXsfl_55_fel_idx ;
      edtCliLK_Internalname = "CLILK_"+sGXsfl_55_fel_idx ;
      edtCliKgi_Internalname = "CLIKGI_"+sGXsfl_55_fel_idx ;
      edtCliKgf_Internalname = "CLIKGF_"+sGXsfl_55_fel_idx ;
      edtCliKgP_Internalname = "CLIKGP_"+sGXsfl_55_fel_idx ;
   }

   public void addRow16W1366( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551366( ) ;
      sendRow16W1366( ) ;
   }

   public void sendRow16W1366( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1366_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1366_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1366_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1366), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1366), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1366_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1366_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliLK_Internalname,GXutil.ltrim( localUtil.ntoc( A10055CliLK, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliLK_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10055CliLK), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10055CliLK), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliLK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliLK_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1366_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliKgi_Internalname,GXutil.ltrim( localUtil.ntoc( A10056CliKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliKgi_Enabled!=0) ? localUtil.format( A10056CliKgi, "ZZZZZ9.99") : localUtil.format( A10056CliKgi, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliKgi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliKgi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1366_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliKgf_Internalname,GXutil.ltrim( localUtil.ntoc( A10057CliKgf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliKgf_Enabled!=0) ? localUtil.format( A10057CliKgf, "ZZZZZ9.99") : localUtil.format( A10057CliKgf, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliKgf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliKgf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1366_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliKgP_Internalname,GXutil.ltrim( localUtil.ntoc( A10058CliKgP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliKgP_Enabled!=0) ? localUtil.format( A10058CliKgP, "ZZ9.99") : localUtil.format( A10058CliKgP, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliKgP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliKgP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16W1366( ) ;
      GXCCtl = "Z10055CliLK_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10055CliLK, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10056CliKgi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10056CliKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10057CliKgf_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10057CliKgf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10058CliKgP_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10058CliKgP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1366_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1366_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1366_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1366, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1366_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1366_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLILK_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliLK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIKGI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIKGF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIKGP_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16W1366( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551366( ) ;
      edtavnRcdDeleted_1366_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1366_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliLK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLILK_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliKgi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIKGI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliKgf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIKGF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliKgP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIKGP_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1366_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1366_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1366");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1366_Internalname ;
         wbErr = true ;
         nRcdDeleted_1366 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1366 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1366_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10055CliLK = (short)(localUtil.ctol( httpContext.cgiGet( edtCliLK_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliKgi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliKgi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIKGI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliKgi_Internalname ;
         wbErr = true ;
         A10056CliKgi = DecimalUtil.ZERO ;
         n10056CliKgi = false ;
      }
      else
      {
         A10056CliKgi = localUtil.ctond( httpContext.cgiGet( edtCliKgi_Internalname)) ;
         n10056CliKgi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliKgf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliKgf_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIKGF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliKgf_Internalname ;
         wbErr = true ;
         A10057CliKgf = DecimalUtil.ZERO ;
         n10057CliKgf = false ;
      }
      else
      {
         A10057CliKgf = localUtil.ctond( httpContext.cgiGet( edtCliKgf_Internalname)) ;
         n10057CliKgf = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliKgP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliKgP_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIKGP_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliKgP_Internalname ;
         wbErr = true ;
         A10058CliKgP = DecimalUtil.ZERO ;
         n10058CliKgP = false ;
      }
      else
      {
         A10058CliKgP = localUtil.ctond( httpContext.cgiGet( edtCliKgP_Internalname)) ;
         n10058CliKgP = false ;
      }
      GXCCtl = "Z10055CliLK_" + sGXsfl_55_idx ;
      Z10055CliLK = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10056CliKgi_" + sGXsfl_55_idx ;
      Z10056CliKgi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10057CliKgf_" + sGXsfl_55_idx ;
      Z10057CliKgf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10058CliKgP_" + sGXsfl_55_idx ;
      Z10058CliKgP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1366_" + sGXsfl_55_idx ;
      nRcdDeleted_1366 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1366_" + sGXsfl_55_idx ;
      nRcdExists_1366 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1366_" + sGXsfl_55_idx ;
      nIsMod_1366 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCliLK_Enabled = edtCliLK_Enabled ;
   }

   public void confirmValues16W0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551366( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551366( ) ;
         httpContext.changePostValue( "Z10055CliLK_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10055CliLK_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10055CliLK_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10056CliKgi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10056CliKgi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10056CliKgi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10057CliKgf_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10057CliKgf_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10057CliKgf_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z10058CliKgP_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z10058CliKgP_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10058CliKgP_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tclimin", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10053CliKgsMn", GXutil.ltrim( localUtil.ntoc( Z10053CliKgsMn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10054CliUltlk", GXutil.ltrim( localUtil.ntoc( Z10054CliUltlk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10054CliUltlk", GXutil.ltrim( localUtil.ntoc( O10054CliUltlk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tclimin", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCLIMIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MINIMOS CLIENTE", "") ;
   }

   public void initializeNonKey16W21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A10053CliKgsMn = DecimalUtil.ZERO ;
      n10053CliKgsMn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10053CliKgsMn", GXutil.ltrimstr( A10053CliKgsMn, 9, 2));
      A10054CliUltlk = (short)(0) ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      A1699ColUL = (short)(0) ;
      n1699ColUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      O10054CliUltlk = A10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
      Z279CliNom = "" ;
      Z10053CliKgsMn = DecimalUtil.ZERO ;
      Z10054CliUltlk = (short)(0) ;
   }

   public void initAll16W21( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey16W21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16W1366( )
   {
      A10056CliKgi = DecimalUtil.ZERO ;
      n10056CliKgi = false ;
      A10057CliKgf = DecimalUtil.ZERO ;
      n10057CliKgf = false ;
      A10058CliKgP = DecimalUtil.ZERO ;
      n10058CliKgP = false ;
      Z10056CliKgi = DecimalUtil.ZERO ;
      Z10057CliKgf = DecimalUtil.ZERO ;
      Z10058CliKgP = DecimalUtil.ZERO ;
   }

   public void initAll16W1366( )
   {
      A10055CliLK = (short)(0) ;
      initializeNonKey16W1366( ) ;
   }

   public void standaloneModalInsert16W1366( )
   {
      A10054CliUltlk = i10054CliUltlk ;
      n10054CliUltlk = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10054CliUltlk), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824155515", true, true);
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
      httpContext.AddJavascriptSource("tclimin.js", "?2026824155516", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1366( )
   {
      edtCliLK_Enabled = defedtCliLK_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliLK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliLK_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1366, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1366_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10055CliLK, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliLK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10056CliKgi, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10057CliKgf, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10058CliKgP, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliKgP_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliKgsMn_Internalname = "CLIKGSMN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtCliUltlk_Internalname = "CLIULTLK" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtColUL_Internalname = "COLUL" ;
      edtavnRcdDeleted_1366_Internalname = "vNRCDDELETED_1366" ;
      edtCliLK_Internalname = "CLILK" ;
      edtCliKgi_Internalname = "CLIKGI" ;
      edtCliKgf_Internalname = "CLIKGF" ;
      edtCliKgP_Internalname = "CLIKGP" ;
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
      Form.setCaption( httpContext.getMessage( "MINIMOS CLIENTE", "") );
      edtCliKgP_Jsonclick = "" ;
      edtCliKgf_Jsonclick = "" ;
      edtCliKgi_Jsonclick = "" ;
      edtCliLK_Jsonclick = "" ;
      edtavnRcdDeleted_1366_Jsonclick = "" ;
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
      edtCliKgP_Enabled = 1 ;
      edtCliKgf_Enabled = 1 ;
      edtCliKgi_Enabled = 1 ;
      edtCliLK_Enabled = 0 ;
      edtavnRcdDeleted_1366_Enabled = 1 ;
      edtColUL_Jsonclick = "" ;
      edtColUL_Backcolor = (int)(0xFFFFFF) ;
      edtColUL_Enabled = 0 ;
      edtCliUltlk_Jsonclick = "" ;
      edtCliUltlk_Backcolor = (int)(0xFFFFFF) ;
      edtCliUltlk_Enabled = 0 ;
      edtCliKgsMn_Jsonclick = "" ;
      edtCliKgsMn_Backcolor = (int)(0xFFFFFF) ;
      edtCliKgsMn_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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
      subsflControlProps_551366( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16W1366( ) ;
         standaloneModal16W1366( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16W1366( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551366( ) ;
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
      /* Using cursor T016W29 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016W29_A407EmprNom[0] ;
      n407EmprNom = T016W29_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T016W20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A1699ColUL = T016W20_A1699ColUL[0] ;
         n1699ColUL = T016W20_n1699ColUL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      else
      {
         A1699ColUL = (short)(0) ;
         n1699ColUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1699ColUL), 3, 0));
      }
      pr_default.close(14);
      GX_FocusControl = edtCliNom_Internalname ;
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

   public void valid_Clicod( )
   {
      n10054CliUltlk = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T016W20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A1699ColUL = T016W20_A1699ColUL[0] ;
         n1699ColUL = T016W20_n1699ColUL[0] ;
      }
      else
      {
         A1699ColUL = (short)(0) ;
         n1699ColUL = false ;
      }
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10053CliKgsMn", GXutil.ltrim( localUtil.ntoc( A10053CliKgsMn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10054CliUltlk", GXutil.ltrim( localUtil.ntoc( A10054CliUltlk, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1699ColUL", GXutil.ltrim( localUtil.ntoc( A1699ColUL, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10053CliKgsMn", GXutil.ltrim( localUtil.ntoc( Z10053CliKgsMn, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10054CliUltlk", GXutil.ltrim( localUtil.ntoc( Z10054CliUltlk, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1699ColUL", GXutil.ltrim( localUtil.ntoc( Z1699ColUL, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O10054CliUltlk", GXutil.ltrim( localUtil.ntoc( O10054CliUltlk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("AFTER TRN","{handler:'e1216W2',iparms:[{av:'A10053CliKgsMn',fld:'CLIKGSMN',pic:'ZZZZZ9.99'},{av:'A1699ColUL',fld:'COLUL',pic:'ZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A10054CliUltlk',fld:'CLIULTLK',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10053CliKgsMn',fld:'CLIKGSMN',pic:'ZZZZZ9.99'},{av:'A10054CliUltlk',fld:'CLIULTLK',pic:'ZZZ9'},{av:'A1699ColUL',fld:'COLUL',pic:'ZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z10053CliKgsMn'},{av:'Z10054CliUltlk'},{av:'Z1699ColUL'},{av:'O10054CliUltlk'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLIKGSMN","{handler:'valid_Clikgsmn',iparms:[]");
      setEventMetadata("VALID_CLIKGSMN",",oparms:[]}");
      setEventMetadata("VALID_CLIULTLK","{handler:'valid_Cliultlk',iparms:[]");
      setEventMetadata("VALID_CLIULTLK",",oparms:[]}");
      setEventMetadata("VALID_COLUL","{handler:'valid_Colul',iparms:[]");
      setEventMetadata("VALID_COLUL",",oparms:[]}");
      setEventMetadata("VALID_CLILK","{handler:'valid_Clilk',iparms:[]");
      setEventMetadata("VALID_CLILK",",oparms:[]}");
      setEventMetadata("VALID_CLIKGF","{handler:'valid_Clikgf',iparms:[]");
      setEventMetadata("VALID_CLIKGF",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Clikgp',iparms:[]");
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
      Z279CliNom = "" ;
      Z10053CliKgsMn = DecimalUtil.ZERO ;
      Z10056CliKgi = DecimalUtil.ZERO ;
      Z10057CliKgf = DecimalUtil.ZERO ;
      Z10058CliKgP = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10053CliKgsMn = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1366 = "" ;
      Gx_mode = "" ;
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
      sMode21 = "" ;
      A10056CliKgi = DecimalUtil.ZERO ;
      A10057CliKgf = DecimalUtil.ZERO ;
      A10058CliKgP = DecimalUtil.ZERO ;
      T016W5_A1699ColUL = new short[1] ;
      T016W5_n1699ColUL = new boolean[] {false} ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T016W8_A407EmprNom = new String[] {""} ;
      T016W8_n407EmprNom = new boolean[] {false} ;
      T016W10_A252CliCod = new int[1] ;
      T016W10_A407EmprNom = new String[] {""} ;
      T016W10_n407EmprNom = new boolean[] {false} ;
      T016W10_A279CliNom = new String[] {""} ;
      T016W10_A10053CliKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W10_n10053CliKgsMn = new boolean[] {false} ;
      T016W10_A10054CliUltlk = new short[1] ;
      T016W10_n10054CliUltlk = new boolean[] {false} ;
      T016W10_A396EmprCod = new String[] {""} ;
      T016W10_A1699ColUL = new short[1] ;
      T016W10_n1699ColUL = new boolean[] {false} ;
      T016W12_A1699ColUL = new short[1] ;
      T016W12_n1699ColUL = new boolean[] {false} ;
      T016W13_A396EmprCod = new String[] {""} ;
      T016W13_A252CliCod = new int[1] ;
      T016W7_A252CliCod = new int[1] ;
      T016W7_A279CliNom = new String[] {""} ;
      T016W7_A10053CliKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W7_n10053CliKgsMn = new boolean[] {false} ;
      T016W7_A10054CliUltlk = new short[1] ;
      T016W7_n10054CliUltlk = new boolean[] {false} ;
      T016W7_A396EmprCod = new String[] {""} ;
      T016W14_A396EmprCod = new String[] {""} ;
      T016W14_A252CliCod = new int[1] ;
      T016W15_A396EmprCod = new String[] {""} ;
      T016W15_A252CliCod = new int[1] ;
      T016W6_A252CliCod = new int[1] ;
      T016W6_A279CliNom = new String[] {""} ;
      T016W6_A10053CliKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W6_n10053CliKgsMn = new boolean[] {false} ;
      T016W6_A10054CliUltlk = new short[1] ;
      T016W6_n10054CliUltlk = new boolean[] {false} ;
      T016W6_A396EmprCod = new String[] {""} ;
      T016W20_A1699ColUL = new short[1] ;
      T016W20_n1699ColUL = new boolean[] {false} ;
      T016W22_A396EmprCod = new String[] {""} ;
      T016W22_A252CliCod = new int[1] ;
      T016W23_A252CliCod = new int[1] ;
      T016W23_A10055CliLK = new short[1] ;
      T016W23_A10056CliKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W23_n10056CliKgi = new boolean[] {false} ;
      T016W23_A10057CliKgf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W23_n10057CliKgf = new boolean[] {false} ;
      T016W23_A10058CliKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W23_n10058CliKgP = new boolean[] {false} ;
      T016W23_A396EmprCod = new String[] {""} ;
      T016W24_A396EmprCod = new String[] {""} ;
      T016W24_A252CliCod = new int[1] ;
      T016W24_A10055CliLK = new short[1] ;
      T016W3_A252CliCod = new int[1] ;
      T016W3_A10055CliLK = new short[1] ;
      T016W3_A10056CliKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W3_n10056CliKgi = new boolean[] {false} ;
      T016W3_A10057CliKgf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W3_n10057CliKgf = new boolean[] {false} ;
      T016W3_A10058CliKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W3_n10058CliKgP = new boolean[] {false} ;
      T016W3_A396EmprCod = new String[] {""} ;
      T016W2_A252CliCod = new int[1] ;
      T016W2_A10055CliLK = new short[1] ;
      T016W2_A10056CliKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W2_n10056CliKgi = new boolean[] {false} ;
      T016W2_A10057CliKgf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W2_n10057CliKgf = new boolean[] {false} ;
      T016W2_A10058CliKgP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016W2_n10058CliKgP = new boolean[] {false} ;
      T016W2_A396EmprCod = new String[] {""} ;
      T016W28_A396EmprCod = new String[] {""} ;
      T016W28_A252CliCod = new int[1] ;
      T016W28_A10055CliLK = new short[1] ;
      GXCCtl = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016W29_A407EmprNom = new String[] {""} ;
      T016W29_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ10053CliKgsMn = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclimin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclimin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclimin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclimin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclimin__default(),
         new Object[] {
             new Object[] {
            T016W2_A252CliCod, T016W2_A10055CliLK, T016W2_A10056CliKgi, T016W2_n10056CliKgi, T016W2_A10057CliKgf, T016W2_n10057CliKgf, T016W2_A10058CliKgP, T016W2_n10058CliKgP, T016W2_A396EmprCod
            }
            , new Object[] {
            T016W3_A252CliCod, T016W3_A10055CliLK, T016W3_A10056CliKgi, T016W3_n10056CliKgi, T016W3_A10057CliKgf, T016W3_n10057CliKgf, T016W3_A10058CliKgP, T016W3_n10058CliKgP, T016W3_A396EmprCod
            }
            , new Object[] {
            T016W5_A1699ColUL, T016W5_n1699ColUL
            }
            , new Object[] {
            T016W6_A252CliCod, T016W6_A279CliNom, T016W6_A10053CliKgsMn, T016W6_n10053CliKgsMn, T016W6_A10054CliUltlk, T016W6_n10054CliUltlk, T016W6_A396EmprCod
            }
            , new Object[] {
            T016W7_A252CliCod, T016W7_A279CliNom, T016W7_A10053CliKgsMn, T016W7_n10053CliKgsMn, T016W7_A10054CliUltlk, T016W7_n10054CliUltlk, T016W7_A396EmprCod
            }
            , new Object[] {
            T016W8_A407EmprNom, T016W8_n407EmprNom
            }
            , new Object[] {
            T016W10_A252CliCod, T016W10_A407EmprNom, T016W10_n407EmprNom, T016W10_A279CliNom, T016W10_A10053CliKgsMn, T016W10_n10053CliKgsMn, T016W10_A10054CliUltlk, T016W10_n10054CliUltlk, T016W10_A396EmprCod, T016W10_A1699ColUL,
            T016W10_n1699ColUL
            }
            , new Object[] {
            T016W12_A1699ColUL, T016W12_n1699ColUL
            }
            , new Object[] {
            T016W13_A396EmprCod, T016W13_A252CliCod
            }
            , new Object[] {
            T016W14_A396EmprCod, T016W14_A252CliCod
            }
            , new Object[] {
            T016W15_A396EmprCod, T016W15_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016W20_A1699ColUL, T016W20_n1699ColUL
            }
            , new Object[] {
            }
            , new Object[] {
            T016W22_A396EmprCod, T016W22_A252CliCod
            }
            , new Object[] {
            T016W23_A252CliCod, T016W23_A10055CliLK, T016W23_A10056CliKgi, T016W23_n10056CliKgi, T016W23_A10057CliKgf, T016W23_n10057CliKgf, T016W23_A10058CliKgP, T016W23_n10058CliKgP, T016W23_A396EmprCod
            }
            , new Object[] {
            T016W24_A396EmprCod, T016W24_A252CliCod, T016W24_A10055CliLK
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016W28_A396EmprCod, T016W28_A252CliCod, T016W28_A10055CliLK
            }
            , new Object[] {
            T016W29_A407EmprNom, T016W29_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TCLIMIN" ;
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
   private short Z10054CliUltlk ;
   private short O10054CliUltlk ;
   private short Z10055CliLK ;
   private short nRcdDeleted_1366 ;
   private short nRcdExists_1366 ;
   private short nIsMod_1366 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10054CliUltlk ;
   private short A1699ColUL ;
   private short nBlankRcdCount1366 ;
   private short RcdFound1366 ;
   private short B10054CliUltlk ;
   private short nBlankRcdUsr1366 ;
   private short s10054CliUltlk ;
   private short A10055CliLK ;
   private short Z1699ColUL ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_1366 ;
   private short i10054CliUltlk ;
   private short ZZ10054CliUltlk ;
   private short ZZ1699ColUL ;
   private short ZO10054CliUltlk ;
   private int Z252CliCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtCliKgsMn_Enabled ;
   private int edtCliUltlk_Enabled ;
   private int edtColUL_Enabled ;
   private int edtavnRcdDeleted_1366_Enabled ;
   private int edtCliLK_Enabled ;
   private int edtCliKgi_Enabled ;
   private int edtCliKgf_Enabled ;
   private int edtCliKgP_Enabled ;
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
   private int defedtCliLK_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtColUL_Backcolor ;
   private int edtCliUltlk_Backcolor ;
   private int edtCliKgsMn_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10053CliKgsMn ;
   private java.math.BigDecimal Z10056CliKgi ;
   private java.math.BigDecimal Z10057CliKgf ;
   private java.math.BigDecimal Z10058CliKgP ;
   private java.math.BigDecimal A10053CliKgsMn ;
   private java.math.BigDecimal A10056CliKgi ;
   private java.math.BigDecimal A10057CliKgf ;
   private java.math.BigDecimal A10058CliKgP ;
   private java.math.BigDecimal ZZ10053CliKgsMn ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliKgsMn_Internalname ;
   private String edtCliKgsMn_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtCliUltlk_Internalname ;
   private String edtCliUltlk_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtColUL_Internalname ;
   private String edtColUL_Jsonclick ;
   private String sMode1366 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1366_Internalname ;
   private String edtCliLK_Internalname ;
   private String edtCliKgi_Internalname ;
   private String edtCliKgf_Internalname ;
   private String edtCliKgP_Internalname ;
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
   private String sMode21 ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String GXCCtl ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1366_Jsonclick ;
   private String edtCliLK_Jsonclick ;
   private String edtCliKgi_Jsonclick ;
   private String edtCliKgf_Jsonclick ;
   private String edtCliKgP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n10054CliUltlk ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10053CliKgsMn ;
   private boolean n1699ColUL ;
   private boolean returnInSub ;
   private boolean n10056CliKgi ;
   private boolean n10057CliKgf ;
   private boolean n10058CliKgP ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private short[] T016W5_A1699ColUL ;
   private boolean[] T016W5_n1699ColUL ;
   private String[] T016W8_A407EmprNom ;
   private boolean[] T016W8_n407EmprNom ;
   private int[] T016W10_A252CliCod ;
   private String[] T016W10_A407EmprNom ;
   private boolean[] T016W10_n407EmprNom ;
   private String[] T016W10_A279CliNom ;
   private java.math.BigDecimal[] T016W10_A10053CliKgsMn ;
   private boolean[] T016W10_n10053CliKgsMn ;
   private short[] T016W10_A10054CliUltlk ;
   private boolean[] T016W10_n10054CliUltlk ;
   private String[] T016W10_A396EmprCod ;
   private short[] T016W10_A1699ColUL ;
   private boolean[] T016W10_n1699ColUL ;
   private short[] T016W12_A1699ColUL ;
   private boolean[] T016W12_n1699ColUL ;
   private String[] T016W13_A396EmprCod ;
   private int[] T016W13_A252CliCod ;
   private int[] T016W7_A252CliCod ;
   private String[] T016W7_A279CliNom ;
   private java.math.BigDecimal[] T016W7_A10053CliKgsMn ;
   private boolean[] T016W7_n10053CliKgsMn ;
   private short[] T016W7_A10054CliUltlk ;
   private boolean[] T016W7_n10054CliUltlk ;
   private String[] T016W7_A396EmprCod ;
   private String[] T016W14_A396EmprCod ;
   private int[] T016W14_A252CliCod ;
   private String[] T016W15_A396EmprCod ;
   private int[] T016W15_A252CliCod ;
   private int[] T016W6_A252CliCod ;
   private String[] T016W6_A279CliNom ;
   private java.math.BigDecimal[] T016W6_A10053CliKgsMn ;
   private boolean[] T016W6_n10053CliKgsMn ;
   private short[] T016W6_A10054CliUltlk ;
   private boolean[] T016W6_n10054CliUltlk ;
   private String[] T016W6_A396EmprCod ;
   private short[] T016W20_A1699ColUL ;
   private boolean[] T016W20_n1699ColUL ;
   private String[] T016W22_A396EmprCod ;
   private int[] T016W22_A252CliCod ;
   private int[] T016W23_A252CliCod ;
   private short[] T016W23_A10055CliLK ;
   private java.math.BigDecimal[] T016W23_A10056CliKgi ;
   private boolean[] T016W23_n10056CliKgi ;
   private java.math.BigDecimal[] T016W23_A10057CliKgf ;
   private boolean[] T016W23_n10057CliKgf ;
   private java.math.BigDecimal[] T016W23_A10058CliKgP ;
   private boolean[] T016W23_n10058CliKgP ;
   private String[] T016W23_A396EmprCod ;
   private String[] T016W24_A396EmprCod ;
   private int[] T016W24_A252CliCod ;
   private short[] T016W24_A10055CliLK ;
   private int[] T016W3_A252CliCod ;
   private short[] T016W3_A10055CliLK ;
   private java.math.BigDecimal[] T016W3_A10056CliKgi ;
   private boolean[] T016W3_n10056CliKgi ;
   private java.math.BigDecimal[] T016W3_A10057CliKgf ;
   private boolean[] T016W3_n10057CliKgf ;
   private java.math.BigDecimal[] T016W3_A10058CliKgP ;
   private boolean[] T016W3_n10058CliKgP ;
   private String[] T016W3_A396EmprCod ;
   private int[] T016W2_A252CliCod ;
   private short[] T016W2_A10055CliLK ;
   private java.math.BigDecimal[] T016W2_A10056CliKgi ;
   private boolean[] T016W2_n10056CliKgi ;
   private java.math.BigDecimal[] T016W2_A10057CliKgf ;
   private boolean[] T016W2_n10057CliKgf ;
   private java.math.BigDecimal[] T016W2_A10058CliKgP ;
   private boolean[] T016W2_n10058CliKgP ;
   private String[] T016W2_A396EmprCod ;
   private String[] T016W28_A396EmprCod ;
   private int[] T016W28_A252CliCod ;
   private short[] T016W28_A10055CliLK ;
   private String[] T016W29_A407EmprNom ;
   private boolean[] T016W29_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tclimin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclimin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016W2", "SELECT CliCod, CliLK, CliKgi, CliKgf, CliKgP, EmprCod FROM TXPCLIMIN WHERE EmprCod = ? AND CliCod = ? AND CliLK = ?  FOR UPDATE OF CliKgi, CliKgf, CliKgP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W3", "SELECT CliCod, CliLK, CliKgi, CliKgf, CliKgP, EmprCod FROM TXPCLIMIN WHERE EmprCod = ? AND CliCod = ? AND CliLK = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W5", "SELECT COALESCE( T1.ColUL, 0) AS ColUL FROM (SELECT COUNT(*) AS ColUL, EmprCod, CliCod FROM TXPCLIMIN GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W6", "SELECT CliCod, CliNom, CliKgsMn, CliUltlk, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, CliKgsMn, CliUltlk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W7", "SELECT CliCod, CliNom, CliKgsMn, CliUltlk, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W10", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.CliKgsMn, TM1.CliUltlk, TM1.EmprCod, COALESCE( T3.ColUL, 0) AS ColUL FROM ((TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS ColUL, EmprCod, CliCod FROM TXPCLIMIN GROUP BY EmprCod, CliCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W12", "SELECT COALESCE( T1.ColUL, 0) AS ColUL FROM (SELECT COUNT(*) AS ColUL, EmprCod, CliCod FROM TXPCLIMIN GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016W15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016W16", "INSERT INTO TXPCLIENT(CliCod, CliNom, CliKgsMn, CliUltlk, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T016W17", "UPDATE TXPCLIENT SET CliNom=?, CliKgsMn=?, CliUltlk=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T016W18", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T016W20", "SELECT COALESCE( T1.ColUL, 0) AS ColUL FROM (SELECT COUNT(*) AS ColUL, EmprCod, CliCod FROM TXPCLIMIN GROUP BY EmprCod, CliCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016W21", "UPDATE TXPCLIENT SET CliUltlk=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T016W22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W23", "SELECT CliCod, CliLK, CliKgi, CliKgf, CliKgP, EmprCod FROM TXPCLIMIN WHERE EmprCod = ? and CliCod = ? and CliLK = ? ORDER BY EmprCod, CliCod, CliLK ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W24", "SELECT EmprCod, CliCod, CliLK FROM TXPCLIMIN WHERE EmprCod = ? AND CliCod = ? AND CliLK = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016W25", "INSERT INTO TXPCLIMIN(CliCod, CliLK, CliKgi, CliKgf, CliKgP, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLIMIN")
         ,new UpdateCursor("T016W26", "UPDATE TXPCLIMIN SET CliKgi=?, CliKgf=?, CliKgP=?  WHERE EmprCod = ? AND CliCod = ? AND CliLK = ?", GX_NOMASK, "TXPCLIMIN")
         ,new UpdateCursor("T016W27", "DELETE FROM TXPCLIMIN  WHERE EmprCod = ? AND CliCod = ? AND CliLK = ?", GX_NOMASK, "TXPCLIMIN")
         ,new ForEachCursor("T016W28", "SELECT EmprCod, CliCod, CliLK FROM TXPCLIMIN WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliLK ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016W29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 30);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
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
               stmt.setInt(5, ((Number) parms[6]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setString(6, (String)parms[8], 3);
               return;
            case 20 :
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
               return;
      }
   }

}

