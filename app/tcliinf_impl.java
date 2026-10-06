package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcliinf_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INCREMENTOS CLIENTE", ""), (short)(0)) ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
      edtCliifLin_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Title", edtCliifLin_Title, !bGXsfl_45_Refreshing);
      edtCliifVal_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifVal_Internalname, "Title", edtCliifVal_Title, !bGXsfl_45_Refreshing);
      A5502CliifUl = (short)(GXutil.lval( httpContext.GetPar( "CliifUl"))) ;
      n5502CliifUl = false ;
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

   public tcliinf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcliinf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcliinf_impl.class ));
   }

   public tcliinf_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCLIINF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCLIINF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliifUl_Internalname, GXutil.ltrim( localUtil.ntoc( A5502CliifUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliifUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5502CliifUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5502CliifUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliifUl_Jsonclick, 0, "", "", "", "", "", 1, edtCliifUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIINF.htm");
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
         nBlankRcdCount810 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_810 = (short)(1) ;
            scanStartQH810( ) ;
            while ( RcdFound810 != 0 )
            {
               init_level_properties810( ) ;
               getByPrimaryKeyQH810( ) ;
               addRowQH810( ) ;
               scanNextQH810( ) ;
            }
            scanEndQH810( ) ;
            nBlankRcdCount810 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5502CliifUl = A5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
         standaloneNotModalQH810( ) ;
         standaloneModalQH810( ) ;
         sMode810 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRowQH810( ) ;
            edtavnRcdDeleted_810_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_810_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_810_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_810_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCliifLin_Title = httpContext.cgiGet( "CLIIFLIN_"+sGXsfl_45_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Title", edtCliifLin_Title, !bGXsfl_45_Refreshing);
            edtCliifLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIIFLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCliifVal_Title = httpContext.cgiGet( "CLIIFVAL_"+sGXsfl_45_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliifVal_Internalname, "Title", edtCliifVal_Title, !bGXsfl_45_Refreshing);
            edtCliifVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIIFVAL_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliifVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifVal_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtCliifPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIIFPOR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliifPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifPor_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_810 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalQH810( ) ;
            }
            sendRowQH810( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode810 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5502CliifUl = B5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount810 = (short)(5) ;
         nRcdExists_810 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartQH810( ) ;
            while ( RcdFound810 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_45810( ) ;
               init_level_properties810( ) ;
               standaloneNotModalQH810( ) ;
               getByPrimaryKeyQH810( ) ;
               standaloneModalQH810( ) ;
               addRowQH810( ) ;
               scanNextQH810( ) ;
            }
            scanEndQH810( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode810 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_45810( ) ;
      initAllQH810( ) ;
      init_level_properties810( ) ;
      B5502CliifUl = A5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      nRcdExists_810 = (short)(0) ;
      nIsMod_810 = (short)(0) ;
      nRcdDeleted_810 = (short)(0) ;
      nBlankRcdCount810 = (short)(nBlankRcdUsr810+nBlankRcdCount810) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount810 > 0 )
      {
         standaloneNotModalQH810( ) ;
         standaloneModalQH810( ) ;
         addRowQH810( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCliifLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount810 = (short)(nBlankRcdCount810-1) ;
      }
      Gx_mode = sMode810 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5502CliifUl = B5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIINF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCLIINF.htm");
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
      e11QH2 ();
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
            Z5502CliifUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z5502CliifUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5502CliifUl = (short)(localUtil.ctol( httpContext.cgiGet( "O5502CliifUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV18Lit6 = httpContext.cgiGet( "vLIT6") ;
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
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A5502CliifUl = (short)(localUtil.ctol( httpContext.cgiGet( edtCliifUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5502CliifUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
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
                        e11QH2 ();
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
            initAllQH21( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_810_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_810_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributesQH21( ) ;
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

   public void confirm_QH0( )
   {
      beforeValidateQH21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsQH21( ) ;
         }
         else
         {
            checkExtendedTableQH21( ) ;
            if ( AnyError == 0 )
            {
               zmQH21( 10) ;
            }
            closeExtendedTableCursorsQH21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_QH810( ) ;
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
         confirmValuesQH0( ) ;
      }
   }

   public void confirm_QH810( )
   {
      s5502CliifUl = O5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowQH810( ) ;
         if ( ( nRcdExists_810 != 0 ) || ( nIsMod_810 != 0 ) )
         {
            getKeyQH810( ) ;
            if ( ( nRcdExists_810 == 0 ) && ( nRcdDeleted_810 == 0 ) )
            {
               if ( RcdFound810 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateQH810( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableQH810( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsQH810( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5502CliifUl = A5502CliifUl ;
                     n5502CliifUl = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "CLIIFLIN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliifLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound810 != 0 )
               {
                  if ( nRcdDeleted_810 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyQH810( ) ;
                     loadQH810( ) ;
                     beforeValidateQH810( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsQH810( ) ;
                        O5502CliifUl = A5502CliifUl ;
                        n5502CliifUl = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_810 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateQH810( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableQH810( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsQH810( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5502CliifUl = A5502CliifUl ;
                           n5502CliifUl = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_810 == 0 )
                  {
                     GXCCtl = "CLIIFLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliifLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_810_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliifLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5503CliifLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliifVal_Internalname, GXutil.ltrim( localUtil.ntoc( A5504CliifVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliifPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5505CliifPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5503CliifLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5503CliifLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5504CliifVal_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5504CliifVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5505CliifPor_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5505CliifPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_810_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_810_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_810_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_810 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_810_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_810_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIIFLIN_"+sGXsfl_45_idx+"Title", GXutil.rtrim( edtCliifLin_Title)) ;
            httpContext.changePostValue( "CLIIFLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIIFVAL_"+sGXsfl_45_idx+"Title", GXutil.rtrim( edtCliifVal_Title)) ;
            httpContext.changePostValue( "CLIIFVAL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIIFPOR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5502CliifUl = s5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionQH0( )
   {
   }

   public void e11QH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1209_", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1200_", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      AV16Lit4 = GXutil.trim( AV16Lit4) + " " + GXutil.trim( AV17Lit5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "FUNOPE", ""), (byte)(99), GXv_char2) ;
      tcliinf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      edtCliifLin_Title = AV15Lit3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Title", edtCliifLin_Title, !bGXsfl_45_Refreshing);
      edtCliifVal_Title = AV16Lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifVal_Internalname, "Title", edtCliifVal_Title, !bGXsfl_45_Refreshing);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcliinf_impl.this.A396EmprCod = GXv_char2[0] ;
      tcliinf_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcliinf_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmQH21( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T00QH5_A279CliNom[0] ;
            Z5502CliifUl = T00QH5_A5502CliifUl[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z5502CliifUl = A5502CliifUl ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z5502CliifUl = A5502CliifUl ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliifUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifUl_Enabled), 5, 0), true);
      AV33Pgmname = "TCLIINF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliifUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifUl_Enabled), 5, 0), true);
      /* Using cursor T00QH6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00QH6_A407EmprNom[0] ;
      n407EmprNom = T00QH6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
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
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(AV18Lit6, 1, "");
         AnyError = (short)(1) ;
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
   }

   public void loadQH21( )
   {
      /* Using cursor T00QH7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A279CliNom = T00QH7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T00QH7_A407EmprNom[0] ;
         n407EmprNom = T00QH7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5502CliifUl = T00QH7_A5502CliifUl[0] ;
         n5502CliifUl = T00QH7_n5502CliifUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
         zmQH21( -9) ;
      }
      pr_default.close(5);
      onLoadActionsQH21( ) ;
   }

   public void onLoadActionsQH21( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTableQH21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void closeExtendedTableCursorsQH21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyQH21( )
   {
      /* Using cursor T00QH8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00QH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00QH5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmQH21( 9) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T00QH5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T00QH5_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A5502CliifUl = T00QH5_A5502CliifUl[0] ;
         n5502CliifUl = T00QH5_n5502CliifUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
         O5502CliifUl = A5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadQH21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKeyQH21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKeyQH21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyQH21( ) ;
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
      /* Using cursor T00QH9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00QH9_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T00QH9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00QH9_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T00QH9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00QH9_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T00QH10 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T00QH10_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T00QH10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T00QH10_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T00QH10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00QH10_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyQH21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5502CliifUl = O5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertQH21( ) ;
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
               A5502CliifUl = O5502CliifUl ;
               n5502CliifUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
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
               A5502CliifUl = O5502CliifUl ;
               n5502CliifUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
               updateQH21( ) ;
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
               A5502CliifUl = O5502CliifUl ;
               n5502CliifUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertQH21( ) ;
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
                  A5502CliifUl = O5502CliifUl ;
                  n5502CliifUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertQH21( ) ;
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
         A5502CliifUl = O5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
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
      getKeyQH21( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcliinf");
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_QH0( ) ;
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
      scanStartQH21( ) ;
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
      scanEndQH21( ) ;
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
      scanStartQH21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNextQH21( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndQH21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyQH21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00QH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z279CliNom, T00QH4_A279CliNom[0]) != 0 ) || ( Z5502CliifUl != T00QH4_A5502CliifUl[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T00QH4_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tcliinf:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T00QH4_A279CliNom[0]);
            }
            if ( Z5502CliifUl != T00QH4_A5502CliifUl[0] )
            {
               GXutil.writeLogln("tcliinf:[seudo value changed for attri]"+"CliifUl");
               GXutil.writeLogRaw("Old: ",Z5502CliifUl);
               GXutil.writeLogRaw("Current: ",T00QH4_A5502CliifUl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertQH21( )
   {
      beforeValidateQH21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQH21( ) ;
      }
      if ( AnyError == 0 )
      {
         zmQH21( 0) ;
         checkOptimisticConcurrencyQH21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQH21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertQH21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QH11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n5502CliifUl), Short.valueOf(A5502CliifUl), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevelQH21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionQH0( ) ;
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
            loadQH21( ) ;
         }
         endLevelQH21( ) ;
      }
      closeExtendedTableCursorsQH21( ) ;
   }

   public void updateQH21( )
   {
      beforeValidateQH21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQH21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQH21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQH21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateQH21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QH12 */
                  pr_default.execute(10, new Object[] {A279CliNom, Boolean.valueOf(n5502CliifUl), Short.valueOf(A5502CliifUl), A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateQH21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelQH21( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionQH0( ) ;
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
         endLevelQH21( ) ;
      }
      closeExtendedTableCursorsQH21( ) ;
   }

   public void deferredUpdateQH21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateQH21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQH21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsQH21( ) ;
         afterConfirmQH21( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteQH21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00QH13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
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
                        initAllQH21( ) ;
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
                     resetCaptionQH0( ) ;
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
      endLevelQH21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsQH21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
   }

   public void processNestedLevelQH810( )
   {
      s5502CliifUl = O5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowQH810( ) ;
         if ( ( nRcdExists_810 != 0 ) || ( nIsMod_810 != 0 ) )
         {
            standaloneNotModalQH810( ) ;
            getKeyQH810( ) ;
            if ( ( nRcdExists_810 == 0 ) && ( nRcdDeleted_810 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertQH810( ) ;
            }
            else
            {
               if ( RcdFound810 != 0 )
               {
                  if ( ( nRcdDeleted_810 != 0 ) && ( nRcdExists_810 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteQH810( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_810 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateQH810( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_810 == 0 )
                  {
                     GXCCtl = "CLIIFLIN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliifLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5502CliifUl = A5502CliifUl ;
            n5502CliifUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_810_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliifLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5503CliifLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliifVal_Internalname, GXutil.ltrim( localUtil.ntoc( A5504CliifVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliifPor_Internalname, GXutil.ltrim( localUtil.ntoc( A5505CliifPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5503CliifLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5503CliifLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5504CliifVal_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5504CliifVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5505CliifPor_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5505CliifPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_810_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_810_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_810_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_810 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_810_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_810_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIIFLIN_"+sGXsfl_45_idx+"Title", GXutil.rtrim( edtCliifLin_Title)) ;
            httpContext.changePostValue( "CLIIFLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIIFVAL_"+sGXsfl_45_idx+"Title", GXutil.rtrim( edtCliifVal_Title)) ;
            httpContext.changePostValue( "CLIIFVAL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIIFPOR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllQH810( ) ;
      if ( AnyError != 0 )
      {
         O5502CliifUl = s5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      }
      nRcdExists_810 = (short)(0) ;
      nIsMod_810 = (short)(0) ;
      nRcdDeleted_810 = (short)(0) ;
   }

   public void processLevelQH21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevelQH810( ) ;
      if ( AnyError != 0 )
      {
         O5502CliifUl = s5502CliifUl ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00QH14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n5502CliifUl), Short.valueOf(A5502CliifUl), A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevelQH21( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteQH21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcliinf");
         if ( AnyError == 0 )
         {
            confirmValuesQH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcliinf");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartQH21( )
   {
      /* Scan By routine */
      /* Using cursor T00QH15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T00QH15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextQH21( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T00QH15_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEndQH21( )
   {
      pr_default.close(13);
   }

   public void afterConfirmQH21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertQH21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateQH21( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteQH21( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteQH21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateQH21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesQH21( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliifUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifUl_Enabled), 5, 0), true);
   }

   public void zmQH810( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5504CliifVal = T00QH3_A5504CliifVal[0] ;
            Z5505CliifPor = T00QH3_A5505CliifPor[0] ;
         }
         else
         {
            Z5504CliifVal = A5504CliifVal ;
            Z5505CliifPor = A5505CliifPor ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z252CliCod = A252CliCod ;
         Z5503CliifLin = A5503CliifLin ;
         Z5504CliifVal = A5504CliifVal ;
         Z5505CliifPor = A5505CliifPor ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalQH810( )
   {
      edtCliifUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifUl_Enabled), 5, 0), true);
      edtCliifUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifUl_Enabled), 5, 0), true);
   }

   public void standaloneModalQH810( )
   {
      if ( isIns( )  )
      {
         A5502CliifUl = (short)(O5502CliifUl+1) ;
         n5502CliifUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5503CliifLin = A5502CliifUl ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCliifLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtCliifLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void loadQH810( )
   {
      /* Using cursor T00QH16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound810 = (short)(1) ;
         A5504CliifVal = T00QH16_A5504CliifVal[0] ;
         n5504CliifVal = T00QH16_n5504CliifVal[0] ;
         A5505CliifPor = T00QH16_A5505CliifPor[0] ;
         n5505CliifPor = T00QH16_n5505CliifPor[0] ;
         zmQH810( -11) ;
      }
      pr_default.close(14);
      onLoadActionsQH810( ) ;
   }

   public void onLoadActionsQH810( )
   {
   }

   public void checkExtendedTableQH810( )
   {
      nIsDirty_810 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalQH810( ) ;
   }

   public void closeExtendedTableCursorsQH810( )
   {
   }

   public void enableDisableQH810( )
   {
   }

   public void getKeyQH810( )
   {
      /* Using cursor T00QH17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound810 = (short)(1) ;
      }
      else
      {
         RcdFound810 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKeyQH810( )
   {
      /* Using cursor T00QH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00QH3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmQH810( 11) ;
         RcdFound810 = (short)(1) ;
         initializeNonKeyQH810( ) ;
         A5503CliifLin = T00QH3_A5503CliifLin[0] ;
         A5504CliifVal = T00QH3_A5504CliifVal[0] ;
         n5504CliifVal = T00QH3_n5504CliifVal[0] ;
         A5505CliifPor = T00QH3_A5505CliifPor[0] ;
         n5505CliifPor = T00QH3_n5505CliifPor[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z5503CliifLin = A5503CliifLin ;
         sMode810 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalQH810( ) ;
         loadQH810( ) ;
         Gx_mode = sMode810 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound810 = (short)(0) ;
         initializeNonKeyQH810( ) ;
         sMode810 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalQH810( ) ;
         Gx_mode = sMode810 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesQH810( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyQH810( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00QH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIINF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5504CliifVal, T00QH2_A5504CliifVal[0]) != 0 ) || ( DecimalUtil.compareTo(Z5505CliifPor, T00QH2_A5505CliifPor[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5504CliifVal, T00QH2_A5504CliifVal[0]) != 0 )
            {
               GXutil.writeLogln("tcliinf:[seudo value changed for attri]"+"CliifVal");
               GXutil.writeLogRaw("Old: ",Z5504CliifVal);
               GXutil.writeLogRaw("Current: ",T00QH2_A5504CliifVal[0]);
            }
            if ( DecimalUtil.compareTo(Z5505CliifPor, T00QH2_A5505CliifPor[0]) != 0 )
            {
               GXutil.writeLogln("tcliinf:[seudo value changed for attri]"+"CliifPor");
               GXutil.writeLogRaw("Old: ",Z5505CliifPor);
               GXutil.writeLogRaw("Current: ",T00QH2_A5505CliifPor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIINF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertQH810( )
   {
      beforeValidateQH810( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQH810( ) ;
      }
      if ( AnyError == 0 )
      {
         zmQH810( 0) ;
         checkOptimisticConcurrencyQH810( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmQH810( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertQH810( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00QH18 */
                  pr_default.execute(16, new Object[] {Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin), Boolean.valueOf(n5504CliifVal), A5504CliifVal, Boolean.valueOf(n5505CliifPor), A5505CliifPor, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIINF");
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
            loadQH810( ) ;
         }
         endLevelQH810( ) ;
      }
      closeExtendedTableCursorsQH810( ) ;
   }

   public void updateQH810( )
   {
      beforeValidateQH810( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableQH810( ) ;
      }
      if ( ( nIsMod_810 != 0 ) || ( nIsDirty_810 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyQH810( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmQH810( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateQH810( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00QH19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n5504CliifVal), A5504CliifVal, Boolean.valueOf(n5505CliifPor), A5505CliifPor, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIINF");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIINF"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateQH810( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyQH810( ) ;
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
            endLevelQH810( ) ;
         }
      }
      closeExtendedTableCursorsQH810( ) ;
   }

   public void deferredUpdateQH810( )
   {
   }

   public void deleteQH810( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateQH810( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyQH810( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsQH810( ) ;
         afterConfirmQH810( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteQH810( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00QH20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A5503CliifLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIINF");
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
      sMode810 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelQH810( ) ;
      Gx_mode = sMode810 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsQH810( )
   {
      standaloneModalQH810( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelQH810( )
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

   public void scanStartQH810( )
   {
      /* Scan By routine */
      /* Using cursor T00QH21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      RcdFound810 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound810 = (short)(1) ;
         A5503CliifLin = T00QH21_A5503CliifLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextQH810( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound810 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound810 = (short)(1) ;
         A5503CliifLin = T00QH21_A5503CliifLin[0] ;
      }
   }

   public void scanEndQH810( )
   {
      pr_default.close(19);
   }

   public void afterConfirmQH810( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertQH810( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateQH810( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteQH810( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteQH810( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateQH810( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesQH810( )
   {
      edtCliifLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCliifVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifVal_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtCliifPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifPor_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashesQH810( )
   {
   }

   public void send_integrity_lvl_hashesQH21( )
   {
   }

   public void subsflControlProps_45810( )
   {
      edtavnRcdDeleted_810_Internalname = "vNRCDDELETED_810_"+sGXsfl_45_idx ;
      edtCliifLin_Internalname = "CLIIFLIN_"+sGXsfl_45_idx ;
      edtCliifVal_Internalname = "CLIIFVAL_"+sGXsfl_45_idx ;
      edtCliifPor_Internalname = "CLIIFPOR_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_45810( )
   {
      edtavnRcdDeleted_810_Internalname = "vNRCDDELETED_810_"+sGXsfl_45_fel_idx ;
      edtCliifLin_Internalname = "CLIIFLIN_"+sGXsfl_45_fel_idx ;
      edtCliifVal_Internalname = "CLIIFVAL_"+sGXsfl_45_fel_idx ;
      edtCliifPor_Internalname = "CLIIFPOR_"+sGXsfl_45_fel_idx ;
   }

   public void addRowQH810( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45810( ) ;
      sendRowQH810( ) ;
   }

   public void sendRowQH810( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_810_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_810_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_810_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_810), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_810), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_810_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_810_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_810_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliifLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5503CliifLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5503CliifLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliifLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliifLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_810_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliifVal_Internalname,GXutil.ltrim( localUtil.ntoc( A5504CliifVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliifVal_Enabled!=0) ? localUtil.format( A5504CliifVal, "ZZZZZ9.99") : localUtil.format( A5504CliifVal, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliifVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliifVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_810_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliifPor_Internalname,GXutil.ltrim( localUtil.ntoc( A5505CliifPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliifPor_Enabled!=0) ? localUtil.format( A5505CliifPor, "ZZ9.99") : localUtil.format( A5505CliifPor, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliifPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCliifPor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesQH810( ) ;
      GXCCtl = "Z5503CliifLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5503CliifLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5504CliifVal_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5504CliifVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5505CliifPor_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5505CliifPor, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_810_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_810_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_810_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_810, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_810_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_810_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIIFLIN_"+sGXsfl_45_idx+"Title", GXutil.rtrim( edtCliifLin_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIIFLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIIFVAL_"+sGXsfl_45_idx+"Title", GXutil.rtrim( edtCliifVal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIIFVAL_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIIFPOR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowQH810( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45810( ) ;
      edtavnRcdDeleted_810_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_810_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliifLin_Title = httpContext.cgiGet( "CLIIFLIN_"+sGXsfl_45_idx+"Title") ;
      edtCliifLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIIFLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliifVal_Title = httpContext.cgiGet( "CLIIFVAL_"+sGXsfl_45_idx+"Title") ;
      edtCliifVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIIFVAL_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliifPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIIFPOR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_810_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_810_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_810");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_810_Internalname ;
         wbErr = true ;
         nRcdDeleted_810 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_810 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_810_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliifLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliifLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CLIIFLIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliifLin_Internalname ;
         wbErr = true ;
         A5503CliifLin = (short)(0) ;
      }
      else
      {
         A5503CliifLin = (short)(localUtil.ctol( httpContext.cgiGet( edtCliifLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCliifVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliifVal_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIIFVAL_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliifVal_Internalname ;
         wbErr = true ;
         A5504CliifVal = DecimalUtil.ZERO ;
         n5504CliifVal = false ;
      }
      else
      {
         A5504CliifVal = localUtil.ctond( httpContext.cgiGet( edtCliifVal_Internalname)) ;
         n5504CliifVal = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliifPor_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliifPor_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIIFPOR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliifPor_Internalname ;
         wbErr = true ;
         A5505CliifPor = DecimalUtil.ZERO ;
         n5505CliifPor = false ;
      }
      else
      {
         A5505CliifPor = localUtil.ctond( httpContext.cgiGet( edtCliifPor_Internalname)) ;
         n5505CliifPor = false ;
      }
      GXCCtl = "Z5503CliifLin_" + sGXsfl_45_idx ;
      Z5503CliifLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5504CliifVal_" + sGXsfl_45_idx ;
      Z5504CliifVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5505CliifPor_" + sGXsfl_45_idx ;
      Z5505CliifPor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_810_" + sGXsfl_45_idx ;
      nRcdDeleted_810 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_810_" + sGXsfl_45_idx ;
      nRcdExists_810 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_810_" + sGXsfl_45_idx ;
      nIsMod_810 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCliifLin_Enabled = edtCliifLin_Enabled ;
   }

   public void confirmValuesQH0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45810( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45810( ) ;
         httpContext.changePostValue( "Z5503CliifLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5503CliifLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5503CliifLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z5504CliifVal_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5504CliifVal_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5504CliifVal_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z5505CliifPor_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5505CliifPor_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5505CliifPor_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcliinf", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5502CliifUl", GXutil.ltrim( localUtil.ntoc( Z5502CliifUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5502CliifUl", GXutil.ltrim( localUtil.ntoc( O5502CliifUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT6", GXutil.rtrim( AV18Lit6));
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
      return formatLink("app.tcliinf", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCLIINF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INCREMENTOS CLIENTE", "") ;
   }

   public void initializeNonKeyQH21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A5502CliifUl = (short)(0) ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      O5502CliifUl = A5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
      Z279CliNom = "" ;
      Z5502CliifUl = (short)(0) ;
   }

   public void initAllQH21( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKeyQH21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyQH810( )
   {
      A5504CliifVal = DecimalUtil.ZERO ;
      n5504CliifVal = false ;
      A5505CliifPor = DecimalUtil.ZERO ;
      n5505CliifPor = false ;
      Z5504CliifVal = DecimalUtil.ZERO ;
      Z5505CliifPor = DecimalUtil.ZERO ;
   }

   public void initAllQH810( )
   {
      A5503CliifLin = (short)(0) ;
      initializeNonKeyQH810( ) ;
   }

   public void standaloneModalInsertQH810( )
   {
      A5502CliifUl = i5502CliifUl ;
      n5502CliifUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5502CliifUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241523782", true, true);
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
      httpContext.AddJavascriptSource("tcliinf.js", "?20268241523782", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties810( )
   {
      edtCliifLin_Enabled = defedtCliifLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliifLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliifLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_810, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_810_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5503CliifLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtCliifLin_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5504CliifVal, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtCliifVal_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5505CliifPor, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliifPor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliifUl_Internalname = "CLIIFUL" ;
      edtavnRcdDeleted_810_Internalname = "vNRCDDELETED_810" ;
      edtCliifLin_Internalname = "CLIIFLIN" ;
      edtCliifVal_Internalname = "CLIIFVAL" ;
      edtCliifPor_Internalname = "CLIIFPOR" ;
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
      Form.setCaption( httpContext.getMessage( "INCREMENTOS CLIENTE", "") );
      edtCliifPor_Jsonclick = "" ;
      edtCliifVal_Jsonclick = "" ;
      edtCliifLin_Jsonclick = "" ;
      edtavnRcdDeleted_810_Jsonclick = "" ;
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
      edtCliifPor_Enabled = 1 ;
      edtCliifVal_Enabled = 1 ;
      edtCliifLin_Enabled = 1 ;
      edtavnRcdDeleted_810_Enabled = 1 ;
      edtCliifUl_Jsonclick = "" ;
      edtCliifUl_Backcolor = (int)(0xFFFFFF) ;
      edtCliifUl_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 1 ;
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
      edtCliifVal_Title = httpContext.getMessage( "Valor Kgs", "") ;
      edtCliifLin_Title = httpContext.getMessage( "Numero Linea", "") ;
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
      subsflControlProps_45810( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalQH810( ) ;
         standaloneModalQH810( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowQH810( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45810( ) ;
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
      /* Using cursor T00QH22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00QH22_A407EmprNom[0] ;
      n407EmprNom = T00QH22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
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
      n5502CliifUl = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A5502CliifUl", GXutil.ltrim( localUtil.ntoc( A5502CliifUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5502CliifUl", GXutil.ltrim( localUtil.ntoc( Z5502CliifUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "O5502CliifUl", GXutil.ltrim( localUtil.ntoc( O5502CliifUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A5502CliifUl',fld:'CLIIFUL',pic:'ZZZ9'},{av:'edtCliifVal_Title',ctrl:'CLIIFVAL',prop:'Title'},{av:'edtCliifLin_Title',ctrl:'CLIIFLIN',prop:'Title'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV18Lit6',fld:'vLIT6',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A5502CliifUl',fld:'CLIIFUL',pic:'ZZZ9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z407EmprNom'},{av:'Z5502CliifUl'},{av:'ZV8UsurCod'},{av:'O5502CliifUl'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLIIFUL","{handler:'valid_Cliiful',iparms:[]");
      setEventMetadata("VALID_CLIIFUL",",oparms:[]}");
      setEventMetadata("VALID_CLIIFLIN","{handler:'valid_Cliiflin',iparms:[]");
      setEventMetadata("VALID_CLIIFLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cliifpor',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z5504CliifVal = DecimalUtil.ZERO ;
      Z5505CliifPor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode810 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      AV18Lit6 = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode21 = "" ;
      GXCCtl = "" ;
      A5504CliifVal = DecimalUtil.ZERO ;
      A5505CliifPor = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00QH6_A407EmprNom = new String[] {""} ;
      T00QH6_n407EmprNom = new boolean[] {false} ;
      T00QH7_A252CliCod = new int[1] ;
      T00QH7_A279CliNom = new String[] {""} ;
      T00QH7_A407EmprNom = new String[] {""} ;
      T00QH7_n407EmprNom = new boolean[] {false} ;
      T00QH7_A5502CliifUl = new short[1] ;
      T00QH7_n5502CliifUl = new boolean[] {false} ;
      T00QH7_A396EmprCod = new String[] {""} ;
      T00QH8_A396EmprCod = new String[] {""} ;
      T00QH8_A252CliCod = new int[1] ;
      T00QH5_A252CliCod = new int[1] ;
      T00QH5_A279CliNom = new String[] {""} ;
      T00QH5_A5502CliifUl = new short[1] ;
      T00QH5_n5502CliifUl = new boolean[] {false} ;
      T00QH5_A396EmprCod = new String[] {""} ;
      T00QH9_A396EmprCod = new String[] {""} ;
      T00QH9_A252CliCod = new int[1] ;
      T00QH10_A396EmprCod = new String[] {""} ;
      T00QH10_A252CliCod = new int[1] ;
      T00QH4_A252CliCod = new int[1] ;
      T00QH4_A279CliNom = new String[] {""} ;
      T00QH4_A5502CliifUl = new short[1] ;
      T00QH4_n5502CliifUl = new boolean[] {false} ;
      T00QH4_A396EmprCod = new String[] {""} ;
      T00QH15_A396EmprCod = new String[] {""} ;
      T00QH15_A252CliCod = new int[1] ;
      T00QH16_A252CliCod = new int[1] ;
      T00QH16_A5503CliifLin = new short[1] ;
      T00QH16_A5504CliifVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QH16_n5504CliifVal = new boolean[] {false} ;
      T00QH16_A5505CliifPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QH16_n5505CliifPor = new boolean[] {false} ;
      T00QH16_A396EmprCod = new String[] {""} ;
      T00QH17_A396EmprCod = new String[] {""} ;
      T00QH17_A252CliCod = new int[1] ;
      T00QH17_A5503CliifLin = new short[1] ;
      T00QH3_A252CliCod = new int[1] ;
      T00QH3_A5503CliifLin = new short[1] ;
      T00QH3_A5504CliifVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QH3_n5504CliifVal = new boolean[] {false} ;
      T00QH3_A5505CliifPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QH3_n5505CliifPor = new boolean[] {false} ;
      T00QH3_A396EmprCod = new String[] {""} ;
      T00QH2_A252CliCod = new int[1] ;
      T00QH2_A5503CliifLin = new short[1] ;
      T00QH2_A5504CliifVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QH2_n5504CliifVal = new boolean[] {false} ;
      T00QH2_A5505CliifPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00QH2_n5505CliifPor = new boolean[] {false} ;
      T00QH2_A396EmprCod = new String[] {""} ;
      T00QH21_A396EmprCod = new String[] {""} ;
      T00QH21_A252CliCod = new int[1] ;
      T00QH21_A5503CliifLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00QH22_A407EmprNom = new String[] {""} ;
      T00QH22_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ279CliNom = "" ;
      ZZ407EmprNom = "" ;
      ZZV8UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcliinf__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcliinf__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcliinf__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcliinf__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcliinf__default(),
         new Object[] {
             new Object[] {
            T00QH2_A252CliCod, T00QH2_A5503CliifLin, T00QH2_A5504CliifVal, T00QH2_n5504CliifVal, T00QH2_A5505CliifPor, T00QH2_n5505CliifPor, T00QH2_A396EmprCod
            }
            , new Object[] {
            T00QH3_A252CliCod, T00QH3_A5503CliifLin, T00QH3_A5504CliifVal, T00QH3_n5504CliifVal, T00QH3_A5505CliifPor, T00QH3_n5505CliifPor, T00QH3_A396EmprCod
            }
            , new Object[] {
            T00QH4_A252CliCod, T00QH4_A279CliNom, T00QH4_A5502CliifUl, T00QH4_n5502CliifUl, T00QH4_A396EmprCod
            }
            , new Object[] {
            T00QH5_A252CliCod, T00QH5_A279CliNom, T00QH5_A5502CliifUl, T00QH5_n5502CliifUl, T00QH5_A396EmprCod
            }
            , new Object[] {
            T00QH6_A407EmprNom, T00QH6_n407EmprNom
            }
            , new Object[] {
            T00QH7_A252CliCod, T00QH7_A279CliNom, T00QH7_A407EmprNom, T00QH7_n407EmprNom, T00QH7_A5502CliifUl, T00QH7_n5502CliifUl, T00QH7_A396EmprCod
            }
            , new Object[] {
            T00QH8_A396EmprCod, T00QH8_A252CliCod
            }
            , new Object[] {
            T00QH9_A396EmprCod, T00QH9_A252CliCod
            }
            , new Object[] {
            T00QH10_A396EmprCod, T00QH10_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00QH15_A396EmprCod, T00QH15_A252CliCod
            }
            , new Object[] {
            T00QH16_A252CliCod, T00QH16_A5503CliifLin, T00QH16_A5504CliifVal, T00QH16_n5504CliifVal, T00QH16_A5505CliifPor, T00QH16_n5505CliifPor, T00QH16_A396EmprCod
            }
            , new Object[] {
            T00QH17_A396EmprCod, T00QH17_A252CliCod, T00QH17_A5503CliifLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00QH21_A396EmprCod, T00QH21_A252CliCod, T00QH21_A5503CliifLin
            }
            , new Object[] {
            T00QH22_A407EmprNom, T00QH22_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TCLIINF" ;
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
   private short Z5502CliifUl ;
   private short O5502CliifUl ;
   private short Z5503CliifLin ;
   private short nRcdDeleted_810 ;
   private short nRcdExists_810 ;
   private short nIsMod_810 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5502CliifUl ;
   private short nBlankRcdCount810 ;
   private short RcdFound810 ;
   private short B5502CliifUl ;
   private short nBlankRcdUsr810 ;
   private short s5502CliifUl ;
   private short A5503CliifLin ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_810 ;
   private short i5502CliifUl ;
   private short ZZ5502CliifUl ;
   private short ZO5502CliifUl ;
   private int Z252CliCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliifUl_Enabled ;
   private int edtavnRcdDeleted_810_Enabled ;
   private int edtCliifLin_Enabled ;
   private int edtCliifVal_Enabled ;
   private int edtCliifPor_Enabled ;
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
   private int defedtCliifLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliifUl_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5504CliifVal ;
   private java.math.BigDecimal Z5505CliifPor ;
   private java.math.BigDecimal A5504CliifVal ;
   private java.math.BigDecimal A5505CliifPor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
   private String edtCliifLin_Title ;
   private String edtCliifLin_Internalname ;
   private String edtCliifVal_Title ;
   private String edtCliifVal_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliifUl_Internalname ;
   private String edtCliifUl_Jsonclick ;
   private String sMode810 ;
   private String edtavnRcdDeleted_810_Internalname ;
   private String edtCliifPor_Internalname ;
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
   private String AV8UsurCod ;
   private String AV18Lit6 ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode21 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_810_Jsonclick ;
   private String edtCliifLin_Jsonclick ;
   private String edtCliifVal_Jsonclick ;
   private String edtCliifPor_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ279CliNom ;
   private String ZZ407EmprNom ;
   private String ZZV8UsurCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n5502CliifUl ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n5504CliifVal ;
   private boolean n5505CliifPor ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00QH6_A407EmprNom ;
   private boolean[] T00QH6_n407EmprNom ;
   private int[] T00QH7_A252CliCod ;
   private String[] T00QH7_A279CliNom ;
   private String[] T00QH7_A407EmprNom ;
   private boolean[] T00QH7_n407EmprNom ;
   private short[] T00QH7_A5502CliifUl ;
   private boolean[] T00QH7_n5502CliifUl ;
   private String[] T00QH7_A396EmprCod ;
   private String[] T00QH8_A396EmprCod ;
   private int[] T00QH8_A252CliCod ;
   private int[] T00QH5_A252CliCod ;
   private String[] T00QH5_A279CliNom ;
   private short[] T00QH5_A5502CliifUl ;
   private boolean[] T00QH5_n5502CliifUl ;
   private String[] T00QH5_A396EmprCod ;
   private String[] T00QH9_A396EmprCod ;
   private int[] T00QH9_A252CliCod ;
   private String[] T00QH10_A396EmprCod ;
   private int[] T00QH10_A252CliCod ;
   private int[] T00QH4_A252CliCod ;
   private String[] T00QH4_A279CliNom ;
   private short[] T00QH4_A5502CliifUl ;
   private boolean[] T00QH4_n5502CliifUl ;
   private String[] T00QH4_A396EmprCod ;
   private String[] T00QH15_A396EmprCod ;
   private int[] T00QH15_A252CliCod ;
   private int[] T00QH16_A252CliCod ;
   private short[] T00QH16_A5503CliifLin ;
   private java.math.BigDecimal[] T00QH16_A5504CliifVal ;
   private boolean[] T00QH16_n5504CliifVal ;
   private java.math.BigDecimal[] T00QH16_A5505CliifPor ;
   private boolean[] T00QH16_n5505CliifPor ;
   private String[] T00QH16_A396EmprCod ;
   private String[] T00QH17_A396EmprCod ;
   private int[] T00QH17_A252CliCod ;
   private short[] T00QH17_A5503CliifLin ;
   private int[] T00QH3_A252CliCod ;
   private short[] T00QH3_A5503CliifLin ;
   private java.math.BigDecimal[] T00QH3_A5504CliifVal ;
   private boolean[] T00QH3_n5504CliifVal ;
   private java.math.BigDecimal[] T00QH3_A5505CliifPor ;
   private boolean[] T00QH3_n5505CliifPor ;
   private String[] T00QH3_A396EmprCod ;
   private int[] T00QH2_A252CliCod ;
   private short[] T00QH2_A5503CliifLin ;
   private java.math.BigDecimal[] T00QH2_A5504CliifVal ;
   private boolean[] T00QH2_n5504CliifVal ;
   private java.math.BigDecimal[] T00QH2_A5505CliifPor ;
   private boolean[] T00QH2_n5505CliifPor ;
   private String[] T00QH2_A396EmprCod ;
   private String[] T00QH21_A396EmprCod ;
   private int[] T00QH21_A252CliCod ;
   private short[] T00QH21_A5503CliifLin ;
   private String[] T00QH22_A407EmprNom ;
   private boolean[] T00QH22_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcliinf__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcliinf__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcliinf__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcliinf__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcliinf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00QH2", "SELECT CliCod, CliifLin, CliifVal, CliifPor, EmprCod FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ? AND CliifLin = ?  FOR UPDATE OF CliifVal, CliifPor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH3", "SELECT CliCod, CliifLin, CliifVal, CliifPor, EmprCod FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ? AND CliifLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH4", "SELECT CliCod, CliNom, CliifUl, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, CliifUl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH5", "SELECT CliCod, CliNom, CliifUl, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH7", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, TM1.CliNom, T2.EmprNom, TM1.CliifUl, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00QH10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00QH11", "INSERT INTO TXPCLIENT(CliCod, CliNom, CliifUl, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00QH12", "UPDATE TXPCLIENT SET CliNom=?, CliifUl=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00QH13", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00QH14", "UPDATE TXPCLIENT SET CliifUl=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T00QH15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH16", "SELECT CliCod, CliifLin, CliifVal, CliifPor, EmprCod FROM TXPCLIINF WHERE EmprCod = ? and CliCod = ? and CliifLin = ? ORDER BY EmprCod, CliCod, CliifLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH17", "SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ? AND CliifLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00QH18", "INSERT INTO TXPCLIINF(CliCod, CliifLin, CliifVal, CliifPor, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLIINF")
         ,new UpdateCursor("T00QH19", "UPDATE TXPCLIINF SET CliifVal=?, CliifPor=?  WHERE EmprCod = ? AND CliCod = ? AND CliifLin = ?", GX_NOMASK, "TXPCLIINF")
         ,new UpdateCursor("T00QH20", "DELETE FROM TXPCLIINF  WHERE EmprCod = ? AND CliCod = ? AND CliifLin = ?", GX_NOMASK, "TXPCLIINF")
         ,new ForEachCursor("T00QH21", "SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliifLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00QH22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 30);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
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
               stmt.setString(5, (String)parms[6], 3);
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

