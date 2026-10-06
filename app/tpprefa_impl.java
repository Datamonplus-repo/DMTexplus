package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpprefa_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A457FasCod) ;
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            AV40Modif = httpContext.GetPar( "Modif") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LLAMADA DESDE WKP", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliNom_Internalname ;
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
      edtFasCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Title", edtFasCod_Title, !bGXsfl_40_Refreshing);
      edtFasDsc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Title", edtFasDsc_Title, !bGXsfl_40_Refreshing);
      edtFasPreMtr_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Title", edtFasPreMtr_Title, !bGXsfl_40_Refreshing);
      edtFasPreKgm_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Title", edtFasPreKgm_Title, !bGXsfl_40_Refreshing);
      edtFasFacCod_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasFacCod_Internalname, "Title", edtFasFacCod_Title, !bGXsfl_40_Refreshing);
      edtFasSumTin_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSumTin_Internalname, "Title", edtFasSumTin_Title, !bGXsfl_40_Refreshing);
      edtFasPreFAc_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Title", edtFasPreFAc_Title, !bGXsfl_40_Refreshing);
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV28FlagEtal = (byte)(GXutil.lval( httpContext.GetPar( "FlagEtal"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV33InputFec = (byte)(GXutil.lval( httpContext.GetPar( "InputFec"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public tpprefa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpprefa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpprefa_impl.class ));
   }

   public tpprefa_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpPREFA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpPREFA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpPREFA.htm");
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
         nBlankRcdCount85 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_85 = (short)(1) ;
            scanStartZ485( ) ;
            while ( RcdFound85 != 0 )
            {
               init_level_properties85( ) ;
               getByPrimaryKeyZ485( ) ;
               addRowZ485( ) ;
               scanNextZ485( ) ;
            }
            scanEndZ485( ) ;
            nBlankRcdCount85 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalZ485( ) ;
         standaloneModalZ485( ) ;
         sMode85 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRowZ485( ) ;
            edtavnRcdDeleted_85_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_85_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_85_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_85_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasCod_Title = httpContext.cgiGet( "FASCOD_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Title", edtFasCod_Title, !bGXsfl_40_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasDsc_Title = httpContext.cgiGet( "FASDSC_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Title", edtFasDsc_Title, !bGXsfl_40_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasPreMtr_Title = httpContext.cgiGet( "FASPREMTR_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Title", edtFasPreMtr_Title, !bGXsfl_40_Refreshing);
            edtFasPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMTR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasPreKgm_Title = httpContext.cgiGet( "FASPREKGM_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Title", edtFasPreKgm_Title, !bGXsfl_40_Refreshing);
            edtFasPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasSumTin_Title = httpContext.cgiGet( "FASSUMTIN_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasSumTin_Internalname, "Title", edtFasSumTin_Title, !bGXsfl_40_Refreshing);
            edtFasSumTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASSUMTIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasSumTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasSumTin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasFacCod_Title = httpContext.cgiGet( "FASFACCOD_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasFacCod_Internalname, "Title", edtFasFacCod_Title, !bGXsfl_40_Refreshing);
            edtFasFacCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFACCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasFacCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasPreFAc_Title = httpContext.cgiGet( "FASPREFAC_"+sGXsfl_40_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Title", edtFasPreFAc_Title, !bGXsfl_40_Refreshing);
            edtFasPreFAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREFAC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasPreKAn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreKAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKAn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasPreMAn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreMAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMAn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtFasPreFAn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREFAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_85 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalZ485( ) ;
            }
            sendRowZ485( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount85 = (short)(5) ;
         nRcdExists_85 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartZ485( ) ;
            while ( RcdFound85 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_4085( ) ;
               init_level_properties85( ) ;
               standaloneNotModalZ485( ) ;
               getByPrimaryKeyZ485( ) ;
               standaloneModalZ485( ) ;
               addRowZ485( ) ;
               scanNextZ485( ) ;
            }
            scanEndZ485( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode85 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_4085( ) ;
      initAllZ485( ) ;
      init_level_properties85( ) ;
      nRcdExists_85 = (short)(0) ;
      nIsMod_85 = (short)(0) ;
      nRcdDeleted_85 = (short)(0) ;
      nBlankRcdCount85 = (short)(nBlankRcdUsr85+nBlankRcdCount85) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount85 > 0 )
      {
         standaloneNotModalZ485( ) ;
         standaloneModalZ485( ) ;
         addRowZ485( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount85 = (short)(nBlankRcdCount85-1) ;
      }
      Gx_mode = sMode85 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpPREFA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpPREFA.htm");
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
      e11Z42 ();
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
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
            AV28FlagEtal = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGETAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39Magosa = (byte)(localUtil.ctol( httpContext.cgiGet( "vMAGOSA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33InputFec = (byte)(localUtil.ctol( httpContext.cgiGet( "vINPUTFEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Modif = httpContext.cgiGet( "vMODIF") ;
            AV34TexKnit = (byte)(localUtil.ctol( httpContext.cgiGet( "vTEXKNIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
                        e11Z42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR LINEA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar Linea' */
                        e12Z42 ();
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
            initAllZ421( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_85_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_85_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributesZ421( ) ;
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

   public void confirm_Z40( )
   {
      beforeValidateZ421( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsZ421( ) ;
         }
         else
         {
            checkExtendedTableZ421( ) ;
            if ( AnyError == 0 )
            {
               zmZ421( 16) ;
            }
            closeExtendedTableCursorsZ421( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_Z485( ) ;
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
         confirmValuesZ40( ) ;
      }
   }

   public void confirm_Z485( )
   {
      sV40Modif = OV40Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRowZ485( ) ;
         if ( ( nRcdExists_85 != 0 ) || ( nIsMod_85 != 0 ) )
         {
            getKeyZ485( ) ;
            if ( ( nRcdExists_85 == 0 ) && ( nRcdDeleted_85 == 0 ) )
            {
               if ( RcdFound85 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateZ485( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableZ485( ) ;
                     if ( AnyError == 0 )
                     {
                        zmZ485( 18) ;
                     }
                     closeExtendedTableCursorsZ485( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     OV40Modif = AV40Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound85 != 0 )
               {
                  if ( nRcdDeleted_85 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyZ485( ) ;
                     loadZ485( ) ;
                     beforeValidateZ485( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsZ485( ) ;
                        OV40Modif = AV40Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_85 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateZ485( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableZ485( ) ;
                           if ( AnyError == 0 )
                           {
                              zmZ485( 18) ;
                           }
                           closeExtendedTableCursorsZ485( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           OV40Modif = AV40Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_85 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_85_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasDsc2_Internalname, GXutil.rtrim( A4642FasDsc2)) ;
         httpContext.changePostValue( edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasSumTin_Internalname, GXutil.rtrim( A470FasSumTin)) ;
         httpContext.changePostValue( edtFasFacCod_Internalname, GXutil.rtrim( A3615FasFacCod)) ;
         httpContext.changePostValue( edtFasPreFAc_Internalname, localUtil.format(A4385FasPreFAc, "99/99/99")) ;
         httpContext.changePostValue( edtFasPreKAn_Internalname, GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreMAn_Internalname, GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreFAn_Internalname, localUtil.format(A4388FasPreFAn, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_40_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z470FasSumTin_"+sGXsfl_40_idx, GXutil.rtrim( Z470FasSumTin)) ;
         httpContext.changePostValue( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_40_idx, localUtil.dtoc( Z4385FasPreFAc, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z467FasPreMtr_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z466FasPreKgm_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3615FasFacCod_"+sGXsfl_40_idx, GXutil.rtrim( Z3615FasFacCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_40_idx, localUtil.dtoc( Z4388FasPreFAn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z460FasDsc_"+sGXsfl_40_idx, GXutil.rtrim( Z460FasDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4642FasDsc2_"+sGXsfl_40_idx, GXutil.rtrim( Z4642FasDsc2)) ;
         httpContext.changePostValue( "T466FasPreKgm_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T467FasPreMtr_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_85_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_85_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_85_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4385FasPreFAc_"+sGXsfl_40_idx, localUtil.dtoc( A4385FasPreFAc, 0, "/")) ;
         if ( nIsMod_85 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_85_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_85_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasCod_Title)) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasDsc_Title)) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreMtr_Title)) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreKgm_Title)) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASSUMTIN_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasSumTin_Title)) ;
            httpContext.changePostValue( "FASSUMTIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasSumTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFACCOD_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasFacCod_Title)) ;
            httpContext.changePostValue( "FASFACCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREFAC_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreFAc_Title)) ;
            httpContext.changePostValue( "FASPREFAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKAn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMAn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREFAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      OV40Modif = sV40Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionZ40( )
   {
   }

   public void e11Z42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char1 = AV20Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1117_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit1", AV20Lit1);
      GXt_char1 = AV21Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit2", AV21Lit2);
      GXt_char1 = AV22Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN363_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char1 = AV24Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1518_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char1 = AV25Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1519_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      GXt_char1 = AV26Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN467_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char1 = AV27LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27LitFe", AV27LitFe);
      GXt_char1 = AV31Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
      tpprefa_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit8", AV31Lit8);
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpprefa_impl.this.A396EmprCod = GXv_char2[0] ;
      tpprefa_impl.this.AV16EmprNom = GXv_char3[0] ;
      tpprefa_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV28FlagEtal = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FlagEtal", GXutil.str( AV28FlagEtal, 1, 0));
      GXv_int5[0] = AV28FlagEtal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETAL", ""), GXv_int5) ;
      tpprefa_impl.this.AV28FlagEtal = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28FlagEtal", GXutil.str( AV28FlagEtal, 1, 0));
      AV30FlagTin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FlagTin", GXutil.str( AV30FlagTin, 1, 0));
      GXv_int5[0] = AV30FlagTin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTBO", ""), GXv_int5) ;
      tpprefa_impl.this.AV30FlagTin = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FlagTin", GXutil.str( AV30FlagTin, 1, 0));
      AV32FlagGua = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagGua", GXutil.str( AV32FlagGua, 1, 0));
      GXv_int5[0] = AV32FlagGua ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GUASCH", ""), GXv_int5) ;
      tpprefa_impl.this.AV32FlagGua = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagGua", GXutil.str( AV32FlagGua, 1, 0));
      GXv_int5[0] = AV36Calvet ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALVET", ""), GXv_int5) ;
      tpprefa_impl.this.AV36Calvet = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Calvet", GXutil.str( AV36Calvet, 1, 0));
      GXv_int5[0] = AV34TexKnit ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int5) ;
      tpprefa_impl.this.AV34TexKnit = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TexKnit", GXutil.str( AV34TexKnit, 1, 0));
      edtFasCod_Title = AV22Lit3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Title", edtFasCod_Title, !bGXsfl_40_Refreshing);
      edtFasDsc_Title = AV23Lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Title", edtFasDsc_Title, !bGXsfl_40_Refreshing);
      edtFasPreMtr_Title = AV24Lit5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Title", edtFasPreMtr_Title, !bGXsfl_40_Refreshing);
      edtFasPreKgm_Title = AV25Lit6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Title", edtFasPreKgm_Title, !bGXsfl_40_Refreshing);
      edtFasFacCod_Title = AV31Lit8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasFacCod_Internalname, "Title", edtFasFacCod_Title, !bGXsfl_40_Refreshing);
      edtFasSumTin_Title = AV26Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSumTin_Internalname, "Title", edtFasSumTin_Title, !bGXsfl_40_Refreshing);
      edtFasPreFAc_Title = AV27LitFe ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Title", edtFasPreFAc_Title, !bGXsfl_40_Refreshing);
      AV33InputFec = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33InputFec", GXutil.str( AV33InputFec, 1, 0));
      GXt_int6 = AV35Kohler ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int5) ;
      tpprefa_impl.this.GXt_int6 = GXv_int5[0] ;
      AV35Kohler = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Kohler", GXutil.str( AV35Kohler, 1, 0));
      GXt_int6 = AV37Staack ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int5) ;
      tpprefa_impl.this.GXt_int6 = GXv_int5[0] ;
      AV37Staack = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Staack", GXutil.str( AV37Staack, 1, 0));
      GXt_int6 = AV39Magosa ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int5) ;
      tpprefa_impl.this.GXt_int6 = GXv_int5[0] ;
      AV39Magosa = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Magosa", GXutil.str( AV39Magosa, 1, 0));
      GXt_int6 = AV41Tonali ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int5) ;
      tpprefa_impl.this.GXt_int6 = GXv_int5[0] ;
      AV41Tonali = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tonali", GXutil.str( AV41Tonali, 1, 0));
   }

   public void e12Z42( )
   {
      /* 'Eliminar Linea' Routine */
      returnInSub = false ;
      GXutil.Confirmed = true;
      if ( GXutil.Confirmed )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A252CliCod ;
         GXv_char3[0] = A457FasCod ;
         new app.pprefase(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3) ;
         tpprefa_impl.this.A396EmprCod = GXv_char4[0] ;
         tpprefa_impl.this.A252CliCod = GXv_int7[0] ;
         tpprefa_impl.this.A457FasCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No confirmado", ""));
      }
      /*  Sending Event outputs  */
   }

   public void zmZ421( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T00Z47_A279CliNom[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      /* Using cursor T00Z48 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00Z48_A407EmprNom[0] ;
      n407EmprNom = T00Z48_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente no existe", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar", ""), 1, "");
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void loadZ421( )
   {
      /* Using cursor T00Z49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A279CliNom = T00Z49_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T00Z49_A407EmprNom[0] ;
         n407EmprNom = T00Z49_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmZ421( -15) ;
      }
      pr_default.close(7);
      onLoadActionsZ421( ) ;
   }

   public void onLoadActionsZ421( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTableZ421( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void closeExtendedTableCursorsZ421( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyZ421( )
   {
      /* Using cursor T00Z410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
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
      /* Using cursor T00Z47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) != 101) && ( T00Z47_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00Z47_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmZ421( 15) ;
         RcdFound21 = (short)(1) ;
         A279CliNom = T00Z47_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadZ421( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKeyZ421( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKeyZ421( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyZ421( ) ;
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
      /* Using cursor T00Z411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00Z411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Z411_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T00Z411_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Z411_A252CliCod[0] == A252CliCod ) )
         {
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T00Z412 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00Z412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Z412_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T00Z412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00Z412_A252CliCod[0] == A252CliCod ) )
         {
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyZ421( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         AV40Modif = OV40Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
         GX_FocusControl = edtCliNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertZ421( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               AV40Modif = OV40Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               AV40Modif = OV40Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
               updateZ421( ) ;
               GX_FocusControl = edtCliNom_Internalname ;
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
               AV40Modif = OV40Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
               GX_FocusControl = edtCliNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertZ421( ) ;
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
                  AV40Modif = OV40Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
                  GX_FocusControl = edtCliNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertZ421( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV40Modif = OV40Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliNom_Internalname ;
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
      getKeyZ421( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpprefa");
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_Z40( ) ;
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
      scanStartZ421( ) ;
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
      scanEndZ421( ) ;
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
      scanStartZ421( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNextZ421( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndZ421( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyZ421( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00Z46 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z279CliNom, T00Z46_A279CliNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T00Z46_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T00Z46_A279CliNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZ421( )
   {
      beforeValidateZ421( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZ421( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZ421( 0) ;
         checkOptimisticConcurrencyZ421( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZ421( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZ421( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Z413 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, A396EmprCod});
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
                        processLevelZ421( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionZ40( ) ;
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
            loadZ421( ) ;
         }
         endLevelZ421( ) ;
      }
      closeExtendedTableCursorsZ421( ) ;
   }

   public void updateZ421( )
   {
      beforeValidateZ421( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZ421( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZ421( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZ421( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateZ421( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Z414 */
                  pr_default.execute(12, new Object[] {A279CliNom, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateZ421( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelZ421( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionZ40( ) ;
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
         endLevelZ421( ) ;
      }
      closeExtendedTableCursorsZ421( ) ;
   }

   public void deferredUpdateZ421( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZ421( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZ421( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZ421( ) ;
         afterConfirmZ421( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZ421( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00Z415 */
               pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
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
                        initAllZ421( ) ;
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
                     resetCaptionZ40( ) ;
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
      endLevelZ421( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZ421( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void processNestedLevelZ485( )
   {
      sV40Modif = OV40Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRowZ485( ) ;
         if ( ( nRcdExists_85 != 0 ) || ( nIsMod_85 != 0 ) )
         {
            standaloneNotModalZ485( ) ;
            getKeyZ485( ) ;
            if ( ( nRcdExists_85 == 0 ) && ( nRcdDeleted_85 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertZ485( ) ;
            }
            else
            {
               if ( RcdFound85 != 0 )
               {
                  if ( ( nRcdDeleted_85 != 0 ) && ( nRcdExists_85 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteZ485( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_85 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateZ485( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_85 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            OV40Modif = AV40Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
         }
         httpContext.changePostValue( edtavnRcdDeleted_85_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasDsc2_Internalname, GXutil.rtrim( A4642FasDsc2)) ;
         httpContext.changePostValue( edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasSumTin_Internalname, GXutil.rtrim( A470FasSumTin)) ;
         httpContext.changePostValue( edtFasFacCod_Internalname, GXutil.rtrim( A3615FasFacCod)) ;
         httpContext.changePostValue( edtFasPreFAc_Internalname, localUtil.format(A4385FasPreFAc, "99/99/99")) ;
         httpContext.changePostValue( edtFasPreKAn_Internalname, GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreMAn_Internalname, GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreFAn_Internalname, localUtil.format(A4388FasPreFAn, "99/99/99")) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_40_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z470FasSumTin_"+sGXsfl_40_idx, GXutil.rtrim( Z470FasSumTin)) ;
         httpContext.changePostValue( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_40_idx, localUtil.dtoc( Z4385FasPreFAc, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z467FasPreMtr_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z466FasPreKgm_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3615FasFacCod_"+sGXsfl_40_idx, GXutil.rtrim( Z3615FasFacCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_40_idx, localUtil.dtoc( Z4388FasPreFAn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z460FasDsc_"+sGXsfl_40_idx, GXutil.rtrim( Z460FasDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4642FasDsc2_"+sGXsfl_40_idx, GXutil.rtrim( Z4642FasDsc2)) ;
         httpContext.changePostValue( "T466FasPreKgm_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T467FasPreMtr_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( O467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_85_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_85_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_85_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N4385FasPreFAc_"+sGXsfl_40_idx, localUtil.dtoc( A4385FasPreFAc, 0, "/")) ;
         if ( nIsMod_85 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_85_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_85_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasCod_Title)) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasDsc_Title)) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreMtr_Title)) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreKgm_Title)) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASSUMTIN_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasSumTin_Title)) ;
            httpContext.changePostValue( "FASSUMTIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasSumTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFACCOD_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasFacCod_Title)) ;
            httpContext.changePostValue( "FASFACCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREFAC_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreFAc_Title)) ;
            httpContext.changePostValue( "FASPREFAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKAn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMAn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREFAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllZ485( ) ;
      if ( AnyError != 0 )
      {
         OV40Modif = sV40Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      }
      nRcdExists_85 = (short)(0) ;
      nIsMod_85 = (short)(0) ;
      nRcdDeleted_85 = (short)(0) ;
   }

   public void processLevelZ421( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevelZ485( ) ;
      if ( AnyError != 0 )
      {
         OV40Modif = sV40Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelZ421( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteZ421( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpprefa");
         if ( AnyError == 0 )
         {
            confirmValuesZ40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpprefa");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartZ421( )
   {
      /* Scan By routine */
      /* Using cursor T00Z416 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZ421( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
   }

   public void scanEndZ421( )
   {
      pr_default.close(14);
   }

   public void afterConfirmZ421( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertZ421( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZ421( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZ421( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZ421( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZ421( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZ421( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmZ485( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z470FasSumTin = T00Z43_A470FasSumTin[0] ;
            Z4385FasPreFAc = T00Z43_A4385FasPreFAc[0] ;
            Z467FasPreMtr = T00Z43_A467FasPreMtr[0] ;
            Z466FasPreKgm = T00Z43_A466FasPreKgm[0] ;
            Z3615FasFacCod = T00Z43_A3615FasFacCod[0] ;
            Z4386FasPreKAn = T00Z43_A4386FasPreKAn[0] ;
            Z4387FasPreMAn = T00Z43_A4387FasPreMAn[0] ;
            Z4388FasPreFAn = T00Z43_A4388FasPreFAn[0] ;
         }
         else
         {
            Z470FasSumTin = A470FasSumTin ;
            Z4385FasPreFAc = A4385FasPreFAc ;
            Z467FasPreMtr = A467FasPreMtr ;
            Z466FasPreKgm = A466FasPreKgm ;
            Z3615FasFacCod = A3615FasFacCod ;
            Z4386FasPreKAn = A4386FasPreKAn ;
            Z4387FasPreMAn = A4387FasPreMAn ;
            Z4388FasPreFAn = A4388FasPreFAn ;
         }
      }
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         Z460FasDsc = T00Z45_A460FasDsc[0] ;
         Z4642FasDsc2 = T00Z45_A4642FasDsc2[0] ;
      }
      if ( GX_JID == -17 )
      {
         Z252CliCod = A252CliCod ;
         Z470FasSumTin = A470FasSumTin ;
         Z4385FasPreFAc = A4385FasPreFAc ;
         Z467FasPreMtr = A467FasPreMtr ;
         Z466FasPreKgm = A466FasPreKgm ;
         Z3615FasFacCod = A3615FasFacCod ;
         Z4386FasPreKAn = A4386FasPreKAn ;
         Z4387FasPreMAn = A4387FasPreMAn ;
         Z4388FasPreFAn = A4388FasPreFAn ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z4642FasDsc2 = A4642FasDsc2 ;
      }
   }

   public void standaloneNotModalZ485( )
   {
      if ( AV33InputFec == 0 )
      {
         edtFasPreFAc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtFasPreFAc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void standaloneModalZ485( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4385FasPreFAc)) && ( Gx_BScreen == 0 ) )
      {
         A4385FasPreFAc = Gx_date ;
         n4385FasPreFAc = false ;
      }
      if ( ( AV28FlagEtal == 1 ) && isIns( )  )
      {
         A470FasSumTin = httpContext.getMessage( httpContext.getMessage( "F", ""), "") ;
         n470FasSumTin = false ;
      }
      else
      {
         if ( ( AV28FlagEtal == 0 ) && isIns( )  )
         {
            A470FasSumTin = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            n470FasSumTin = false ;
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void loadZ485( )
   {
      /* Using cursor T00Z417 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A470FasSumTin = T00Z417_A470FasSumTin[0] ;
         n470FasSumTin = T00Z417_n470FasSumTin[0] ;
         A460FasDsc = T00Z417_A460FasDsc[0] ;
         A4385FasPreFAc = T00Z417_A4385FasPreFAc[0] ;
         n4385FasPreFAc = T00Z417_n4385FasPreFAc[0] ;
         A4642FasDsc2 = T00Z417_A4642FasDsc2[0] ;
         n4642FasDsc2 = T00Z417_n4642FasDsc2[0] ;
         A467FasPreMtr = T00Z417_A467FasPreMtr[0] ;
         n467FasPreMtr = T00Z417_n467FasPreMtr[0] ;
         A466FasPreKgm = T00Z417_A466FasPreKgm[0] ;
         n466FasPreKgm = T00Z417_n466FasPreKgm[0] ;
         A3615FasFacCod = T00Z417_A3615FasFacCod[0] ;
         n3615FasFacCod = T00Z417_n3615FasFacCod[0] ;
         A4386FasPreKAn = T00Z417_A4386FasPreKAn[0] ;
         n4386FasPreKAn = T00Z417_n4386FasPreKAn[0] ;
         A4387FasPreMAn = T00Z417_A4387FasPreMAn[0] ;
         n4387FasPreMAn = T00Z417_n4387FasPreMAn[0] ;
         A4388FasPreFAn = T00Z417_A4388FasPreFAn[0] ;
         n4388FasPreFAn = T00Z417_n4388FasPreFAn[0] ;
         zmZ485( -17) ;
      }
      pr_default.close(15);
      onLoadActionsZ485( ) ;
   }

   public void onLoadActionsZ485( )
   {
      if ( AV39Magosa == 1 )
      {
         A460FasDsc = A4642FasDsc2 ;
      }
      if ( (IsModified == 1) && true /* Level */ )
      {
         AV40Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      }
   }

   public void checkExtendedTableZ485( )
   {
      nIsDirty_85 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalZ485( ) ;
      if ( ( AV28FlagEtal == 1 ) && ( ( GXutil.strcmp(A470FasSumTin, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A470FasSumTin, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         GXCCtl = "FASSUMTIN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo se admite F=Facturacion / P=Produccion", ""), 0, GXCCtl);
      }
      /* Using cursor T00Z45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00Z45_A460FasDsc[0] ;
      A4642FasDsc2 = T00Z45_A4642FasDsc2[0] ;
      n4642FasDsc2 = T00Z45_n4642FasDsc2[0] ;
      pr_default.close(3);
      if ( AV39Magosa == 1 )
      {
         nIsDirty_85 = (short)(1) ;
         A460FasDsc = A4642FasDsc2 ;
      }
      if ( (IsModified == 1) && true /* Level */ )
      {
         AV40Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      }
      if ( ( AV34TexKnit == 1 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "F", "")) < 0 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "FZZZZZZZZ", "")) > 0 ) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase no es de Facturación", ""), 0, GXCCtl);
      }
      if ( ! ( ( GXutil.strcmp(A470FasSumTin, "S") == 0 ) || ( GXutil.strcmp(A470FasSumTin, "N") == 0 ) || ( GXutil.strcmp(A470FasSumTin, "F") == 0 ) || ( GXutil.strcmp(A470FasSumTin, "P") == 0 ) ) )
      {
         GXCCtl = "FASSUMTIN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Suma fase tinte", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasSumTin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsZ485( )
   {
      pr_default.close(2);
   }

   public void enableDisableZ485( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00Z45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00Z45_A460FasDsc[0] ;
      A4642FasDsc2 = T00Z45_A4642FasDsc2[0] ;
      n4642FasDsc2 = T00Z45_n4642FasDsc2[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4642FasDsc2))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKeyZ485( )
   {
      /* Using cursor T00Z418 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound85 = (short)(1) ;
      }
      else
      {
         RcdFound85 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKeyZ485( )
   {
      /* Using cursor T00Z43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(1) != 101) && ( T00Z43_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00Z43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmZ485( 17) ;
         RcdFound85 = (short)(1) ;
         initializeNonKeyZ485( ) ;
         A470FasSumTin = T00Z43_A470FasSumTin[0] ;
         n470FasSumTin = T00Z43_n470FasSumTin[0] ;
         A4385FasPreFAc = T00Z43_A4385FasPreFAc[0] ;
         n4385FasPreFAc = T00Z43_n4385FasPreFAc[0] ;
         A467FasPreMtr = T00Z43_A467FasPreMtr[0] ;
         n467FasPreMtr = T00Z43_n467FasPreMtr[0] ;
         A466FasPreKgm = T00Z43_A466FasPreKgm[0] ;
         n466FasPreKgm = T00Z43_n466FasPreKgm[0] ;
         A3615FasFacCod = T00Z43_A3615FasFacCod[0] ;
         n3615FasFacCod = T00Z43_n3615FasFacCod[0] ;
         A4386FasPreKAn = T00Z43_A4386FasPreKAn[0] ;
         n4386FasPreKAn = T00Z43_n4386FasPreKAn[0] ;
         A4387FasPreMAn = T00Z43_A4387FasPreMAn[0] ;
         n4387FasPreMAn = T00Z43_n4387FasPreMAn[0] ;
         A4388FasPreFAn = T00Z43_A4388FasPreFAn[0] ;
         n4388FasPreFAn = T00Z43_n4388FasPreFAn[0] ;
         A457FasCod = T00Z43_A457FasCod[0] ;
         n457FasCod = T00Z43_n457FasCod[0] ;
         O466FasPreKgm = A466FasPreKgm ;
         n466FasPreKgm = false ;
         O467FasPreMtr = A467FasPreMtr ;
         n467FasPreMtr = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z457FasCod = A457FasCod ;
         sMode85 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalZ485( ) ;
         loadZ485( ) ;
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound85 = (short)(0) ;
         initializeNonKeyZ485( ) ;
         sMode85 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalZ485( ) ;
         Gx_mode = sMode85 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesZ485( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyZ485( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00Z42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z470FasSumTin, T00Z42_A470FasSumTin[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4385FasPreFAc), GXutil.resetTime(T00Z42_A4385FasPreFAc[0])) ) || ( DecimalUtil.compareTo(Z467FasPreMtr, T00Z42_A467FasPreMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z466FasPreKgm, T00Z42_A466FasPreKgm[0]) != 0 ) || ( GXutil.strcmp(Z3615FasFacCod, T00Z42_A3615FasFacCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4386FasPreKAn, T00Z42_A4386FasPreKAn[0]) != 0 ) || ( DecimalUtil.compareTo(Z4387FasPreMAn, T00Z42_A4387FasPreMAn[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4388FasPreFAn), GXutil.resetTime(T00Z42_A4388FasPreFAn[0])) ) )
         {
            if ( GXutil.strcmp(Z470FasSumTin, T00Z42_A470FasSumTin[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasSumTin");
               GXutil.writeLogRaw("Old: ",Z470FasSumTin);
               GXutil.writeLogRaw("Current: ",T00Z42_A470FasSumTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4385FasPreFAc), GXutil.resetTime(T00Z42_A4385FasPreFAc[0])) ) )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasPreFAc");
               GXutil.writeLogRaw("Old: ",Z4385FasPreFAc);
               GXutil.writeLogRaw("Current: ",T00Z42_A4385FasPreFAc[0]);
            }
            if ( DecimalUtil.compareTo(Z467FasPreMtr, T00Z42_A467FasPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasPreMtr");
               GXutil.writeLogRaw("Old: ",Z467FasPreMtr);
               GXutil.writeLogRaw("Current: ",T00Z42_A467FasPreMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z466FasPreKgm, T00Z42_A466FasPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasPreKgm");
               GXutil.writeLogRaw("Old: ",Z466FasPreKgm);
               GXutil.writeLogRaw("Current: ",T00Z42_A466FasPreKgm[0]);
            }
            if ( GXutil.strcmp(Z3615FasFacCod, T00Z42_A3615FasFacCod[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasFacCod");
               GXutil.writeLogRaw("Old: ",Z3615FasFacCod);
               GXutil.writeLogRaw("Current: ",T00Z42_A3615FasFacCod[0]);
            }
            if ( DecimalUtil.compareTo(Z4386FasPreKAn, T00Z42_A4386FasPreKAn[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasPreKAn");
               GXutil.writeLogRaw("Old: ",Z4386FasPreKAn);
               GXutil.writeLogRaw("Current: ",T00Z42_A4386FasPreKAn[0]);
            }
            if ( DecimalUtil.compareTo(Z4387FasPreMAn, T00Z42_A4387FasPreMAn[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasPreMAn");
               GXutil.writeLogRaw("Old: ",Z4387FasPreMAn);
               GXutil.writeLogRaw("Current: ",T00Z42_A4387FasPreMAn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4388FasPreFAn), GXutil.resetTime(T00Z42_A4388FasPreFAn[0])) ) )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasPreFAn");
               GXutil.writeLogRaw("Old: ",Z4388FasPreFAn);
               GXutil.writeLogRaw("Current: ",T00Z42_A4388FasPreFAn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPREFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T00Z419 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(17) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z460FasDsc, T00Z419_A460FasDsc[0]) != 0 ) || ( GXutil.strcmp(Z4642FasDsc2, T00Z419_A4642FasDsc2[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z460FasDsc, T00Z419_A460FasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasDsc");
               GXutil.writeLogRaw("Old: ",Z460FasDsc);
               GXutil.writeLogRaw("Current: ",T00Z419_A460FasDsc[0]);
            }
            if ( GXutil.strcmp(Z4642FasDsc2, T00Z419_A4642FasDsc2[0]) != 0 )
            {
               GXutil.writeLogln("tpprefa:[seudo value changed for attri]"+"FasDsc2");
               GXutil.writeLogRaw("Old: ",Z4642FasDsc2);
               GXutil.writeLogRaw("Current: ",T00Z419_A4642FasDsc2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZ485( )
   {
      beforeValidateZ485( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZ485( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZ485( 0) ;
         checkOptimisticConcurrencyZ485( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZ485( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZ485( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00Z420 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN1Z485( ) ;
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
            loadZ485( ) ;
         }
         endLevelZ485( ) ;
      }
      closeExtendedTableCursorsZ485( ) ;
   }

   public void updateZ485( )
   {
      beforeValidateZ485( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZ485( ) ;
      }
      if ( ( nIsMod_85 != 0 ) || ( nIsDirty_85 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyZ485( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmZ485( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateZ485( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00Z421 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n4388FasPreFAn), A4388FasPreFAn, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPREFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateZ485( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN1Z485( ) ;
                           getByPrimaryKeyZ485( ) ;
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
            endLevelZ485( ) ;
         }
      }
      closeExtendedTableCursorsZ485( ) ;
   }

   public void deferredUpdateZ485( )
   {
   }

   public void deleteZ485( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZ485( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZ485( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZ485( ) ;
         afterConfirmZ485( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZ485( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00Z422 */
               pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
               if ( AnyError == 0 )
               {
                  updateTablesN1Z485( ) ;
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
      sMode85 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelZ485( ) ;
      Gx_mode = sMode85 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZ485( )
   {
      standaloneModalZ485( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00Z423 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         Z460FasDsc = T00Z423_A460FasDsc[0] ;
         Z4642FasDsc2 = T00Z423_A4642FasDsc2[0] ;
         A460FasDsc = T00Z423_A460FasDsc[0] ;
         A4642FasDsc2 = T00Z423_A4642FasDsc2[0] ;
         n4642FasDsc2 = T00Z423_n4642FasDsc2[0] ;
         pr_default.close(21);
         if ( AV39Magosa == 1 )
         {
            A460FasDsc = A4642FasDsc2 ;
         }
         if ( (IsModified == 1) && true /* Level */ )
         {
            AV40Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00Z424 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Lin)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00Z425 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAB003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00Z426 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00Z427 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00Z428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASCLIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00Z429 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIMTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00Z430 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00Z431 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIFSD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00Z432 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cab Est Cliente-Fase(Servicios", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00Z433 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de Formulac. por Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00Z434 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00Z435 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00Z436 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00Z437 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRETIT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void updateTablesN1Z485( )
   {
      /* Using cursor T00Z438 */
      pr_default.execute(36, new Object[] {A460FasDsc, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
   }

   public void endLevelZ485( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(17);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartZ485( )
   {
      /* Scan By routine */
      /* Using cursor T00Z439 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound85 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A457FasCod = T00Z439_A457FasCod[0] ;
         n457FasCod = T00Z439_n457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZ485( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound85 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound85 = (short)(1) ;
         A457FasCod = T00Z439_A457FasCod[0] ;
         n457FasCod = T00Z439_n457FasCod[0] ;
      }
   }

   public void scanEndZ485( )
   {
      pr_default.close(37);
   }

   public void afterConfirmZ485( )
   {
      /* After Confirm Rules */
      if ( isUpd( )  && true /* After */ && ( ( DecimalUtil.compareTo(A467FasPreMtr, O467FasPreMtr) != 0 ) || ( DecimalUtil.compareTo(A466FasPreKgm, O466FasPreKgm) != 0 ) ) && ( AV33InputFec == 0 ) )
      {
         A4385FasPreFAc = Gx_date ;
         n4385FasPreFAc = false ;
      }
   }

   public void beforeInsertZ485( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZ485( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZ485( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZ485( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZ485( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZ485( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasSumTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasSumTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasSumTin_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasFacCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasPreFAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasPreKAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKAn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasPreMAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMAn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasPreFAn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAn_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashesZ485( )
   {
   }

   public void send_integrity_lvl_hashesZ421( )
   {
   }

   public void subsflControlProps_4085( )
   {
      edtavnRcdDeleted_85_Internalname = "vNRCDDELETED_85_"+sGXsfl_40_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_40_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_40_idx ;
      edtFasDsc2_Internalname = "FASDSC2_"+sGXsfl_40_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_40_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_40_idx ;
      edtFasSumTin_Internalname = "FASSUMTIN_"+sGXsfl_40_idx ;
      edtFasFacCod_Internalname = "FASFACCOD_"+sGXsfl_40_idx ;
      edtFasPreFAc_Internalname = "FASPREFAC_"+sGXsfl_40_idx ;
      edtFasPreKAn_Internalname = "FASPREKAN_"+sGXsfl_40_idx ;
      edtFasPreMAn_Internalname = "FASPREMAN_"+sGXsfl_40_idx ;
      edtFasPreFAn_Internalname = "FASPREFAN_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_4085( )
   {
      edtavnRcdDeleted_85_Internalname = "vNRCDDELETED_85_"+sGXsfl_40_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_40_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_40_fel_idx ;
      edtFasDsc2_Internalname = "FASDSC2_"+sGXsfl_40_fel_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_40_fel_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_40_fel_idx ;
      edtFasSumTin_Internalname = "FASSUMTIN_"+sGXsfl_40_fel_idx ;
      edtFasFacCod_Internalname = "FASFACCOD_"+sGXsfl_40_fel_idx ;
      edtFasPreFAc_Internalname = "FASPREFAC_"+sGXsfl_40_fel_idx ;
      edtFasPreKAn_Internalname = "FASPREKAN_"+sGXsfl_40_fel_idx ;
      edtFasPreMAn_Internalname = "FASPREMAN_"+sGXsfl_40_fel_idx ;
      edtFasPreFAn_Internalname = "FASPREFAN_"+sGXsfl_40_fel_idx ;
   }

   public void addRowZ485( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4085( ) ;
      sendRowZ485( ) ;
   }

   public void sendRowZ485( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_85_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_85_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_85), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_85), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_85_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_85_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc2_Internalname,GXutil.rtrim( A4642FasDsc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreMtr_Enabled!=0) ? localUtil.format( A467FasPreMtr, "ZZZZZZ9.999") : localUtil.format( A467FasPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreKgm_Enabled!=0) ? localUtil.format( A466FasPreKgm, "ZZZZZZ9.999") : localUtil.format( A466FasPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasSumTin_Internalname,GXutil.rtrim( A470FasSumTin),GXutil.rtrim( localUtil.format( A470FasSumTin, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasSumTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasSumTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasFacCod_Internalname,GXutil.rtrim( A3615FasFacCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasFacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasFacCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreFAc_Internalname,localUtil.format(A4385FasPreFAc, "99/99/99"),localUtil.format( A4385FasPreFAc, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreFAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreFAc_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreKAn_Internalname,GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreKAn_Enabled!=0) ? localUtil.format( A4386FasPreKAn, "ZZZZZZ9.99999") : localUtil.format( A4386FasPreKAn, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreKAn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreKAn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMAn_Internalname,GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreMAn_Enabled!=0) ? localUtil.format( A4387FasPreMAn, "ZZZZZZ9.99999") : localUtil.format( A4387FasPreMAn, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMAn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreMAn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_85_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreFAn_Internalname,localUtil.format(A4388FasPreFAn, "99/99/99"),localUtil.format( A4388FasPreFAn, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreFAn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreFAn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesZ485( ) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z470FasSumTin_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z470FasSumTin));
      GXCCtl = "Z4385FasPreFAc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4385FasPreFAc, 0, "/"));
      GXCCtl = "Z467FasPreMtr_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z466FasPreKgm_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3615FasFacCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3615FasFacCod));
      GXCCtl = "Z4386FasPreKAn_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4386FasPreKAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4387FasPreMAn_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4387FasPreMAn, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4388FasPreFAn_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z4388FasPreFAn, 0, "/"));
      GXCCtl = "Z460FasDsc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z460FasDsc));
      GXCCtl = "Z4642FasDsc2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4642FasDsc2));
      GXCCtl = "O466FasPreKgm_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O467FasPreMtr_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_85_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_85_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_85_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_85, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N4385FasPreFAc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A4385FasPreFAc, 0, "/"));
      GXCCtl = "vMODIF_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV40Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_85_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_85_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasDsc_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMTR_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreMtr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMTR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKGM_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreKgm_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKGM_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSUMTIN_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasSumTin_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSUMTIN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasSumTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFACCOD_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasFacCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFACCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREFAC_"+sGXsfl_40_idx+"Title", GXutil.rtrim( edtFasPreFAc_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREFAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKAn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMAn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREFAN_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowZ485( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4085( ) ;
      edtavnRcdDeleted_85_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_85_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Title = httpContext.cgiGet( "FASCOD_"+sGXsfl_40_idx+"Title") ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Title = httpContext.cgiGet( "FASDSC_"+sGXsfl_40_idx+"Title") ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreMtr_Title = httpContext.cgiGet( "FASPREMTR_"+sGXsfl_40_idx+"Title") ;
      edtFasPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMTR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreKgm_Title = httpContext.cgiGet( "FASPREKGM_"+sGXsfl_40_idx+"Title") ;
      edtFasPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGM_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasSumTin_Title = httpContext.cgiGet( "FASSUMTIN_"+sGXsfl_40_idx+"Title") ;
      edtFasSumTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASSUMTIN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasFacCod_Title = httpContext.cgiGet( "FASFACCOD_"+sGXsfl_40_idx+"Title") ;
      edtFasFacCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFACCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreFAc_Title = httpContext.cgiGet( "FASPREFAC_"+sGXsfl_40_idx+"Title") ;
      edtFasPreFAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREFAC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreKAn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreMAn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreFAn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREFAN_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_85_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_85_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_85");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_85_Internalname ;
         wbErr = true ;
         nRcdDeleted_85 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_85 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_85_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      n457FasCod = false ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A4642FasDsc2 = httpContext.cgiGet( edtFasDsc2_Internalname) ;
      n4642FasDsc2 = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREMTR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreMtr_Internalname ;
         wbErr = true ;
         A467FasPreMtr = DecimalUtil.ZERO ;
         n467FasPreMtr = false ;
      }
      else
      {
         A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
         n467FasPreMtr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREKGM_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreKgm_Internalname ;
         wbErr = true ;
         A466FasPreKgm = DecimalUtil.ZERO ;
         n466FasPreKgm = false ;
      }
      else
      {
         A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
         n466FasPreKgm = false ;
      }
      A470FasSumTin = GXutil.upper( httpContext.cgiGet( edtFasSumTin_Internalname)) ;
      n470FasSumTin = false ;
      A3615FasFacCod = httpContext.cgiGet( edtFasFacCod_Internalname) ;
      n3615FasFacCod = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtFasPreFAc_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "FASPREFAC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreFAc_Internalname ;
         wbErr = true ;
         A4385FasPreFAc = GXutil.nullDate() ;
         n4385FasPreFAc = false ;
      }
      else
      {
         A4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( edtFasPreFAc_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n4385FasPreFAc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreKAn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreKAn_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREKAN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreKAn_Internalname ;
         wbErr = true ;
         A4386FasPreKAn = DecimalUtil.ZERO ;
         n4386FasPreKAn = false ;
      }
      else
      {
         A4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( edtFasPreKAn_Internalname)) ;
         n4386FasPreKAn = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasPreMAn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasPreMAn_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FASPREMAN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreMAn_Internalname ;
         wbErr = true ;
         A4387FasPreMAn = DecimalUtil.ZERO ;
         n4387FasPreMAn = false ;
      }
      else
      {
         A4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( edtFasPreMAn_Internalname)) ;
         n4387FasPreMAn = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtFasPreFAn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "FASPREFAN_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasPreFAn_Internalname ;
         wbErr = true ;
         A4388FasPreFAn = GXutil.nullDate() ;
         n4388FasPreFAn = false ;
      }
      else
      {
         A4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( edtFasPreFAn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n4388FasPreFAn = false ;
      }
      GXCCtl = "Z457FasCod_" + sGXsfl_40_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z470FasSumTin_" + sGXsfl_40_idx ;
      Z470FasSumTin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4385FasPreFAc_" + sGXsfl_40_idx ;
      Z4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z467FasPreMtr_" + sGXsfl_40_idx ;
      Z467FasPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z466FasPreKgm_" + sGXsfl_40_idx ;
      Z466FasPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3615FasFacCod_" + sGXsfl_40_idx ;
      Z3615FasFacCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4386FasPreKAn_" + sGXsfl_40_idx ;
      Z4386FasPreKAn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4387FasPreMAn_" + sGXsfl_40_idx ;
      Z4387FasPreMAn = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4388FasPreFAn_" + sGXsfl_40_idx ;
      Z4388FasPreFAn = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z460FasDsc_" + sGXsfl_40_idx ;
      Z460FasDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4642FasDsc2_" + sGXsfl_40_idx ;
      Z4642FasDsc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O466FasPreKgm_" + sGXsfl_40_idx ;
      O466FasPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O467FasPreMtr_" + sGXsfl_40_idx ;
      O467FasPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_85_" + sGXsfl_40_idx ;
      nRcdDeleted_85 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_85_" + sGXsfl_40_idx ;
      nRcdExists_85 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_85_" + sGXsfl_40_idx ;
      nIsMod_85 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N4385FasPreFAc_" + sGXsfl_40_idx ;
      N4385FasPreFAc = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
   }

   public void assign_properties_default( )
   {
      defedtFasPreFAc_Enabled = edtFasPreFAc_Enabled ;
      defedtFasCod_Enabled = edtFasCod_Enabled ;
   }

   public void confirmValuesZ40( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_4085( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4085( ) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z470FasSumTin_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z470FasSumTin_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z470FasSumTin_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z4385FasPreFAc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4385FasPreFAc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z467FasPreMtr_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z467FasPreMtr_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z467FasPreMtr_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z466FasPreKgm_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z466FasPreKgm_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z466FasPreKgm_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z3615FasFacCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z3615FasFacCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3615FasFacCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z4386FasPreKAn_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4386FasPreKAn_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z4387FasPreMAn_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4387FasPreMAn_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z4388FasPreFAn_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4388FasPreFAn_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z460FasDsc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z460FasDsc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z460FasDsc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z4642FasDsc2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z4642FasDsc2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4642FasDsc2_"+sGXsfl_40_idx) ;
      }
      httpContext.changePostValue( "O466FasPreKgm", httpContext.cgiGet( "T466FasPreKgm")) ;
      httpContext.deletePostValue( "T466FasPreKgm") ;
      httpContext.changePostValue( "O467FasPreMtr", httpContext.cgiGet( "T467FasPreMtr")) ;
      httpContext.deletePostValue( "T467FasPreMtr") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpprefa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV40Modif))}, new String[] {"EmprCod","CliCod","Modif"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGETAL", GXutil.ltrim( localUtil.ntoc( AV28FlagEtal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAGOSA", GXutil.ltrim( localUtil.ntoc( AV39Magosa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINPUTFEC", GXutil.ltrim( localUtil.ntoc( AV33InputFec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV40Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXKNIT", GXutil.ltrim( localUtil.ntoc( AV34TexKnit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpprefa", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV40Modif))}, new String[] {"EmprCod","CliCod","Modif"})  ;
   }

   public String getPgmname( )
   {
      return "TpPREFA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LLAMADA DESDE WKP", "") ;
   }

   public void initializeNonKeyZ421( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      Z279CliNom = "" ;
   }

   public void initAllZ421( )
   {
      initializeNonKeyZ421( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyZ485( )
   {
      A470FasSumTin = "" ;
      n470FasSumTin = false ;
      A460FasDsc = "" ;
      A4642FasDsc2 = "" ;
      n4642FasDsc2 = false ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      n467FasPreMtr = false ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      n466FasPreKgm = false ;
      A3615FasFacCod = "" ;
      n3615FasFacCod = false ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      n4386FasPreKAn = false ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      n4387FasPreMAn = false ;
      A4388FasPreFAn = GXutil.nullDate() ;
      n4388FasPreFAn = false ;
      A4385FasPreFAc = Gx_date ;
      n4385FasPreFAc = false ;
      O466FasPreKgm = A466FasPreKgm ;
      n466FasPreKgm = false ;
      O467FasPreMtr = A467FasPreMtr ;
      n467FasPreMtr = false ;
      Z470FasSumTin = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z3615FasFacCod = "" ;
      Z4386FasPreKAn = DecimalUtil.ZERO ;
      Z4387FasPreMAn = DecimalUtil.ZERO ;
      Z4388FasPreFAn = GXutil.nullDate() ;
      Z460FasDsc = "" ;
      Z4642FasDsc2 = "" ;
   }

   public void initAllZ485( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      initializeNonKeyZ485( ) ;
   }

   public void standaloneModalInsertZ485( )
   {
      A4385FasPreFAc = i4385FasPreFAc ;
      n4385FasPreFAc = false ;
      A470FasSumTin = i470FasSumTin ;
      n470FasSumTin = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532615", true, true);
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
      httpContext.AddJavascriptSource("tpprefa.js", "?20268241532615", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties85( )
   {
      edtFasPreFAc_Enabled = defedtFasPreFAc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreFAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreFAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_85, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_85_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasDsc_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4642FasDsc2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasPreMtr_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasPreKgm_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A470FasSumTin));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasSumTin_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasSumTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3615FasFacCod));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasFacCod_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasFacCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A4385FasPreFAc, "99/99/99"));
      Grid1Column.AddObjectProperty("Title", GXutil.rtrim( edtFasPreFAc_Title));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4386FasPreKAn, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKAn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4387FasPreMAn, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMAn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A4388FasPreFAn, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreFAn_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavnRcdDeleted_85_Internalname = "vNRCDDELETED_85" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasDsc2_Internalname = "FASDSC2" ;
      edtFasPreMtr_Internalname = "FASPREMTR" ;
      edtFasPreKgm_Internalname = "FASPREKGM" ;
      edtFasSumTin_Internalname = "FASSUMTIN" ;
      edtFasFacCod_Internalname = "FASFACCOD" ;
      edtFasPreFAc_Internalname = "FASPREFAC" ;
      edtFasPreKAn_Internalname = "FASPREKAN" ;
      edtFasPreMAn_Internalname = "FASPREMAN" ;
      edtFasPreFAn_Internalname = "FASPREFAN" ;
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
      Form.setCaption( httpContext.getMessage( "LLAMADA DESDE WKP", "") );
      edtFasPreFAn_Jsonclick = "" ;
      edtFasPreMAn_Jsonclick = "" ;
      edtFasPreKAn_Jsonclick = "" ;
      edtFasPreFAc_Jsonclick = "" ;
      edtFasFacCod_Jsonclick = "" ;
      edtFasSumTin_Jsonclick = "" ;
      edtFasPreKgm_Jsonclick = "" ;
      edtFasPreMtr_Jsonclick = "" ;
      edtFasDsc2_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtavnRcdDeleted_85_Jsonclick = "" ;
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
      edtFasPreFAn_Enabled = 1 ;
      edtFasPreMAn_Enabled = 1 ;
      edtFasPreKAn_Enabled = 1 ;
      edtFasPreFAc_Enabled = 1 ;
      edtFasFacCod_Enabled = 1 ;
      edtFasSumTin_Enabled = 1 ;
      edtFasPreKgm_Enabled = 1 ;
      edtFasPreMtr_Enabled = 1 ;
      edtFasDsc2_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtavnRcdDeleted_85_Enabled = 1 ;
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
      edtCliCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 0 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      edtFasPreFAc_Title = httpContext.getMessage( "Fecha Precio Actual", "") ;
      edtFasSumTin_Title = httpContext.getMessage( "Suma fase tinte", "") ;
      edtFasFacCod_Title = httpContext.getMessage( "Codigo Factura", "") ;
      edtFasPreKgm_Title = httpContext.getMessage( "Precio Kilo Fase", "") ;
      edtFasPreMtr_Title = httpContext.getMessage( "Precio Metro Fase", "") ;
      edtFasDsc_Title = httpContext.getMessage( "Descripcion de Fase", "") ;
      edtFasCod_Title = httpContext.getMessage( "Codigo Fase", "") ;
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
      subsflControlProps_4085( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalZ485( ) ;
         standaloneModalZ485( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowZ485( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_4085( ) ;
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
      /* Using cursor T00Z440 */
      pr_default.execute(38, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00Z440_A407EmprNom[0] ;
      n407EmprNom = T00Z440_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(38);
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
      n252CliCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      n4642FasDsc2 = false ;
      /* Using cursor T00Z423 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      Z460FasDsc = T00Z423_A460FasDsc[0] ;
      Z4642FasDsc2 = T00Z423_A4642FasDsc2[0] ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T00Z423_A460FasDsc[0] ;
      A4642FasDsc2 = T00Z423_A4642FasDsc2[0] ;
      n4642FasDsc2 = T00Z423_n4642FasDsc2[0] ;
      pr_default.close(21);
      if ( AV39Magosa == 1 )
      {
         A460FasDsc = A4642FasDsc2 ;
      }
      if ( ( AV34TexKnit == 1 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "F", "")) < 0 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "FZZZZZZZZ", "")) > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase no es de Facturación", ""), 0, "FASCOD");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4642FasDsc2", GXutil.rtrim( A4642FasDsc2));
   }

   public void valid_Fasprefan( )
   {
      n457FasCod = false ;
      n467FasPreMtr = false ;
      n466FasPreKgm = false ;
      n470FasSumTin = false ;
      n3615FasFacCod = false ;
      n4385FasPreFAc = false ;
      n4386FasPreKAn = false ;
      n4387FasPreMAn = false ;
      n4388FasPreFAn = false ;
      if ( (IsModified == 1) && true /* Level */ )
      {
         AV40Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
      }
      O466FasPreKgm = A466FasPreKgm ;
      n466FasPreKgm = false ;
      O467FasPreMtr = A467FasPreMtr ;
      n467FasPreMtr = false ;
      OV40Modif = AV40Modif ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", GXutil.rtrim( AV40Modif));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV40Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'ELIMINAR LINEA'","{handler:'e12Z42',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("'ELIMINAR LINEA'",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_date',fld:'vTODAY',pic:''},{av:'edtFasPreFAc_Title',ctrl:'FASPREFAC',prop:'Title'},{av:'edtFasSumTin_Title',ctrl:'FASSUMTIN',prop:'Title'},{av:'edtFasFacCod_Title',ctrl:'FASFACCOD',prop:'Title'},{av:'edtFasPreKgm_Title',ctrl:'FASPREKGM',prop:'Title'},{av:'edtFasPreMtr_Title',ctrl:'FASPREMTR',prop:'Title'},{av:'edtFasDsc_Title',ctrl:'FASDSC',prop:'Title'},{av:'edtFasCod_Title',ctrl:'FASCOD',prop:'Title'},{av:'AV39Magosa',fld:'vMAGOSA',pic:'9'},{av:'AV33InputFec',fld:'vINPUTFEC',pic:'9'},{av:'AV34TexKnit',fld:'vTEXKNIT',pic:'9'},{av:'AV28FlagEtal',fld:'vFLAGETAL',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z279CliNom'},{av:'Z407EmprNom'},{av:'ZV17UsurCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A4642FasDsc2',fld:'FASDSC2',pic:''},{av:'AV39Magosa',fld:'vMAGOSA',pic:'9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV34TexKnit',fld:'vTEXKNIT',pic:'9'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4642FasDsc2',fld:'FASDSC2',pic:''}]}");
      setEventMetadata("VALID_FASDSC","{handler:'valid_Fasdsc',iparms:[]");
      setEventMetadata("VALID_FASDSC",",oparms:[]}");
      setEventMetadata("VALID_FASDSC2","{handler:'valid_Fasdsc2',iparms:[]");
      setEventMetadata("VALID_FASDSC2",",oparms:[]}");
      setEventMetadata("VALID_FASPREMTR","{handler:'valid_Faspremtr',iparms:[]");
      setEventMetadata("VALID_FASPREMTR",",oparms:[]}");
      setEventMetadata("VALID_FASPREKGM","{handler:'valid_Fasprekgm',iparms:[]");
      setEventMetadata("VALID_FASPREKGM",",oparms:[]}");
      setEventMetadata("VALID_FASSUMTIN","{handler:'valid_Fassumtin',iparms:[]");
      setEventMetadata("VALID_FASSUMTIN",",oparms:[]}");
      setEventMetadata("VALID_FASFACCOD","{handler:'valid_Fasfaccod',iparms:[]");
      setEventMetadata("VALID_FASFACCOD",",oparms:[]}");
      setEventMetadata("VALID_FASPREFAC","{handler:'valid_Fasprefac',iparms:[]");
      setEventMetadata("VALID_FASPREFAC",",oparms:[]}");
      setEventMetadata("VALID_FASPREKAN","{handler:'valid_Fasprekan',iparms:[]");
      setEventMetadata("VALID_FASPREKAN",",oparms:[]}");
      setEventMetadata("VALID_FASPREMAN","{handler:'valid_Faspreman',iparms:[]");
      setEventMetadata("VALID_FASPREMAN",",oparms:[]}");
      setEventMetadata("VALID_FASPREFAN","{handler:'valid_Fasprefan',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A470FasSumTin',fld:'FASSUMTIN',pic:'@!'},{av:'A3615FasFacCod',fld:'FASFACCOD',pic:''},{av:'A4385FasPreFAc',fld:'FASPREFAC',pic:''},{av:'A4386FasPreKAn',fld:'FASPREKAN',pic:'ZZZZZZ9.99999'},{av:'A4387FasPreMAn',fld:'FASPREMAN',pic:'ZZZZZZ9.99999'},{av:'A4388FasPreFAn',fld:'FASPREFAN',pic:''},{av:'AV40Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("VALID_FASPREFAN",",oparms:[{av:'AV40Modif',fld:'vMODIF',pic:''}]}");
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
      pr_default.close(21);
      pr_default.close(38);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV40Modif = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z457FasCod = "" ;
      Z470FasSumTin = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z3615FasFacCod = "" ;
      Z4386FasPreKAn = DecimalUtil.ZERO ;
      Z4387FasPreMAn = DecimalUtil.ZERO ;
      Z4388FasPreFAn = GXutil.nullDate() ;
      Z460FasDsc = "" ;
      Z4642FasDsc2 = "" ;
      O466FasPreKgm = DecimalUtil.ZERO ;
      O467FasPreMtr = DecimalUtil.ZERO ;
      N4385FasPreFAc = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      AV40Modif = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_date = GXutil.nullDate() ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode85 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode21 = "" ;
      sV40Modif = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A4642FasDsc2 = "" ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A470FasSumTin = "" ;
      A3615FasFacCod = "" ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      A4388FasPreFAn = GXutil.nullDate() ;
      T466FasPreKgm = DecimalUtil.ZERO ;
      T467FasPreMtr = DecimalUtil.ZERO ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27LitFe = "" ;
      AV31Lit8 = "" ;
      GXt_char1 = "" ;
      AV18Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_int5 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      T00Z48_A407EmprNom = new String[] {""} ;
      T00Z48_n407EmprNom = new boolean[] {false} ;
      T00Z49_A252CliCod = new int[1] ;
      T00Z49_n252CliCod = new boolean[] {false} ;
      T00Z49_A279CliNom = new String[] {""} ;
      T00Z49_A407EmprNom = new String[] {""} ;
      T00Z49_n407EmprNom = new boolean[] {false} ;
      T00Z49_A396EmprCod = new String[] {""} ;
      T00Z410_A396EmprCod = new String[] {""} ;
      T00Z410_A252CliCod = new int[1] ;
      T00Z410_n252CliCod = new boolean[] {false} ;
      T00Z47_A252CliCod = new int[1] ;
      T00Z47_n252CliCod = new boolean[] {false} ;
      T00Z47_A279CliNom = new String[] {""} ;
      T00Z47_A396EmprCod = new String[] {""} ;
      T00Z411_A396EmprCod = new String[] {""} ;
      T00Z411_A252CliCod = new int[1] ;
      T00Z411_n252CliCod = new boolean[] {false} ;
      T00Z412_A396EmprCod = new String[] {""} ;
      T00Z412_A252CliCod = new int[1] ;
      T00Z412_n252CliCod = new boolean[] {false} ;
      T00Z46_A252CliCod = new int[1] ;
      T00Z46_n252CliCod = new boolean[] {false} ;
      T00Z46_A279CliNom = new String[] {""} ;
      T00Z46_A396EmprCod = new String[] {""} ;
      T00Z416_A396EmprCod = new String[] {""} ;
      T00Z416_A252CliCod = new int[1] ;
      T00Z416_n252CliCod = new boolean[] {false} ;
      T00Z417_A252CliCod = new int[1] ;
      T00Z417_n252CliCod = new boolean[] {false} ;
      T00Z417_A470FasSumTin = new String[] {""} ;
      T00Z417_n470FasSumTin = new boolean[] {false} ;
      T00Z417_A460FasDsc = new String[] {""} ;
      T00Z417_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z417_n4385FasPreFAc = new boolean[] {false} ;
      T00Z417_A4642FasDsc2 = new String[] {""} ;
      T00Z417_n4642FasDsc2 = new boolean[] {false} ;
      T00Z417_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z417_n467FasPreMtr = new boolean[] {false} ;
      T00Z417_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z417_n466FasPreKgm = new boolean[] {false} ;
      T00Z417_A3615FasFacCod = new String[] {""} ;
      T00Z417_n3615FasFacCod = new boolean[] {false} ;
      T00Z417_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z417_n4386FasPreKAn = new boolean[] {false} ;
      T00Z417_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z417_n4387FasPreMAn = new boolean[] {false} ;
      T00Z417_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z417_n4388FasPreFAn = new boolean[] {false} ;
      T00Z417_A396EmprCod = new String[] {""} ;
      T00Z417_A457FasCod = new String[] {""} ;
      T00Z417_n457FasCod = new boolean[] {false} ;
      T00Z45_A460FasDsc = new String[] {""} ;
      T00Z45_A4642FasDsc2 = new String[] {""} ;
      T00Z45_n4642FasDsc2 = new boolean[] {false} ;
      T00Z418_A396EmprCod = new String[] {""} ;
      T00Z418_A252CliCod = new int[1] ;
      T00Z418_n252CliCod = new boolean[] {false} ;
      T00Z418_A457FasCod = new String[] {""} ;
      T00Z418_n457FasCod = new boolean[] {false} ;
      T00Z43_A252CliCod = new int[1] ;
      T00Z43_n252CliCod = new boolean[] {false} ;
      T00Z43_A470FasSumTin = new String[] {""} ;
      T00Z43_n470FasSumTin = new boolean[] {false} ;
      T00Z43_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z43_n4385FasPreFAc = new boolean[] {false} ;
      T00Z43_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z43_n467FasPreMtr = new boolean[] {false} ;
      T00Z43_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z43_n466FasPreKgm = new boolean[] {false} ;
      T00Z43_A3615FasFacCod = new String[] {""} ;
      T00Z43_n3615FasFacCod = new boolean[] {false} ;
      T00Z43_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z43_n4386FasPreKAn = new boolean[] {false} ;
      T00Z43_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z43_n4387FasPreMAn = new boolean[] {false} ;
      T00Z43_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z43_n4388FasPreFAn = new boolean[] {false} ;
      T00Z43_A396EmprCod = new String[] {""} ;
      T00Z43_A457FasCod = new String[] {""} ;
      T00Z43_n457FasCod = new boolean[] {false} ;
      T00Z42_A252CliCod = new int[1] ;
      T00Z42_n252CliCod = new boolean[] {false} ;
      T00Z42_A470FasSumTin = new String[] {""} ;
      T00Z42_n470FasSumTin = new boolean[] {false} ;
      T00Z42_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z42_n4385FasPreFAc = new boolean[] {false} ;
      T00Z42_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z42_n467FasPreMtr = new boolean[] {false} ;
      T00Z42_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z42_n466FasPreKgm = new boolean[] {false} ;
      T00Z42_A3615FasFacCod = new String[] {""} ;
      T00Z42_n3615FasFacCod = new boolean[] {false} ;
      T00Z42_A4386FasPreKAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z42_n4386FasPreKAn = new boolean[] {false} ;
      T00Z42_A4387FasPreMAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00Z42_n4387FasPreMAn = new boolean[] {false} ;
      T00Z42_A4388FasPreFAn = new java.util.Date[] {GXutil.nullDate()} ;
      T00Z42_n4388FasPreFAn = new boolean[] {false} ;
      T00Z42_A396EmprCod = new String[] {""} ;
      T00Z42_A457FasCod = new String[] {""} ;
      T00Z42_n457FasCod = new boolean[] {false} ;
      T00Z419_A460FasDsc = new String[] {""} ;
      T00Z419_A4642FasDsc2 = new String[] {""} ;
      T00Z419_n4642FasDsc2 = new boolean[] {false} ;
      T00Z423_A460FasDsc = new String[] {""} ;
      T00Z423_A4642FasDsc2 = new String[] {""} ;
      T00Z423_n4642FasDsc2 = new boolean[] {false} ;
      T00Z424_A396EmprCod = new String[] {""} ;
      T00Z424_A252CliCod = new int[1] ;
      T00Z424_n252CliCod = new boolean[] {false} ;
      T00Z424_A4589FFProCod = new String[] {""} ;
      T00Z424_A4591FFFasCod = new String[] {""} ;
      T00Z425_A396EmprCod = new String[] {""} ;
      T00Z425_A252CliCod = new int[1] ;
      T00Z425_n252CliCod = new boolean[] {false} ;
      T00Z425_A494ForSer = new String[] {""} ;
      T00Z425_A482ForColNom = new String[] {""} ;
      T00Z425_A483ForColNum = new int[1] ;
      T00Z425_A831TipColCod = new byte[1] ;
      T00Z425_A853For_ProC = new String[] {""} ;
      T00Z425_A1028For_Ord = new int[1] ;
      T00Z426_A396EmprCod = new String[] {""} ;
      T00Z426_A252CliCod = new int[1] ;
      T00Z426_n252CliCod = new boolean[] {false} ;
      T00Z426_A457FasCod = new String[] {""} ;
      T00Z426_n457FasCod = new boolean[] {false} ;
      T00Z426_A7727ArtAdiCod = new short[1] ;
      T00Z427_A396EmprCod = new String[] {""} ;
      T00Z427_A252CliCod = new int[1] ;
      T00Z427_n252CliCod = new boolean[] {false} ;
      T00Z427_A65ArtCod = new String[] {""} ;
      T00Z427_A7135Lin_fast = new short[1] ;
      T00Z428_A396EmprCod = new String[] {""} ;
      T00Z428_A252CliCod = new int[1] ;
      T00Z428_n252CliCod = new boolean[] {false} ;
      T00Z428_A6016FasExpLin = new short[1] ;
      T00Z429_A396EmprCod = new String[] {""} ;
      T00Z429_A966PartCod = new String[] {""} ;
      T00Z429_A252CliCod = new int[1] ;
      T00Z429_n252CliCod = new boolean[] {false} ;
      T00Z429_A5849UbiLin = new short[1] ;
      T00Z430_A396EmprCod = new String[] {""} ;
      T00Z430_A252CliCod = new int[1] ;
      T00Z430_n252CliCod = new boolean[] {false} ;
      T00Z430_A457FasCod = new String[] {""} ;
      T00Z430_n457FasCod = new boolean[] {false} ;
      T00Z430_A5515ClifsiLin = new short[1] ;
      T00Z431_A396EmprCod = new String[] {""} ;
      T00Z431_A252CliCod = new int[1] ;
      T00Z431_n252CliCod = new boolean[] {false} ;
      T00Z431_A457FasCod = new String[] {""} ;
      T00Z431_n457FasCod = new boolean[] {false} ;
      T00Z431_A5519ClifsdLin = new short[1] ;
      T00Z432_A396EmprCod = new String[] {""} ;
      T00Z432_A252CliCod = new int[1] ;
      T00Z432_n252CliCod = new boolean[] {false} ;
      T00Z432_A457FasCod = new String[] {""} ;
      T00Z432_n457FasCod = new boolean[] {false} ;
      T00Z432_A5310ClFsAny = new short[1] ;
      T00Z432_A5311ClFsSer = new String[] {""} ;
      T00Z433_A396EmprCod = new String[] {""} ;
      T00Z433_A252CliCod = new int[1] ;
      T00Z433_n252CliCod = new boolean[] {false} ;
      T00Z433_A65ArtCod = new String[] {""} ;
      T00Z433_A4658MdlCod = new String[] {""} ;
      T00Z433_A457FasCod = new String[] {""} ;
      T00Z433_n457FasCod = new boolean[] {false} ;
      T00Z434_A396EmprCod = new String[] {""} ;
      T00Z434_A252CliCod = new int[1] ;
      T00Z434_n252CliCod = new boolean[] {false} ;
      T00Z434_A65ArtCod = new String[] {""} ;
      T00Z434_A758ProCod = new String[] {""} ;
      T00Z434_A457FasCod = new String[] {""} ;
      T00Z434_n457FasCod = new boolean[] {false} ;
      T00Z435_A396EmprCod = new String[] {""} ;
      T00Z435_A2333ExtPdoAlb = new int[1] ;
      T00Z435_A2790ExtPdoLin = new short[1] ;
      T00Z436_A396EmprCod = new String[] {""} ;
      T00Z436_A252CliCod = new int[1] ;
      T00Z436_n252CliCod = new boolean[] {false} ;
      T00Z436_A457FasCod = new String[] {""} ;
      T00Z436_n457FasCod = new boolean[] {false} ;
      T00Z436_A2740PreExtSer = new String[] {""} ;
      T00Z436_A2427PreExtNMtr = new String[] {""} ;
      T00Z437_A396EmprCod = new String[] {""} ;
      T00Z437_A2730RecTipCo = new short[1] ;
      T00Z437_A252CliCod = new int[1] ;
      T00Z437_n252CliCod = new boolean[] {false} ;
      T00Z437_A2736RecLin2 = new short[1] ;
      T00Z439_A396EmprCod = new String[] {""} ;
      T00Z439_A252CliCod = new int[1] ;
      T00Z439_n252CliCod = new boolean[] {false} ;
      T00Z439_A457FasCod = new String[] {""} ;
      T00Z439_n457FasCod = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i4385FasPreFAc = GXutil.nullDate() ;
      i470FasSumTin = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00Z440_A407EmprNom = new String[] {""} ;
      T00Z440_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ279CliNom = "" ;
      ZZ407EmprNom = "" ;
      ZZV17UsurCod = "" ;
      ZV40Modif = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpprefa__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpprefa__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpprefa__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpprefa__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpprefa__default(),
         new Object[] {
             new Object[] {
            T00Z42_A252CliCod, T00Z42_A470FasSumTin, T00Z42_n470FasSumTin, T00Z42_A4385FasPreFAc, T00Z42_n4385FasPreFAc, T00Z42_A467FasPreMtr, T00Z42_n467FasPreMtr, T00Z42_A466FasPreKgm, T00Z42_n466FasPreKgm, T00Z42_A3615FasFacCod,
            T00Z42_n3615FasFacCod, T00Z42_A4386FasPreKAn, T00Z42_n4386FasPreKAn, T00Z42_A4387FasPreMAn, T00Z42_n4387FasPreMAn, T00Z42_A4388FasPreFAn, T00Z42_n4388FasPreFAn, T00Z42_A396EmprCod, T00Z42_A457FasCod
            }
            , new Object[] {
            T00Z43_A252CliCod, T00Z43_A470FasSumTin, T00Z43_n470FasSumTin, T00Z43_A4385FasPreFAc, T00Z43_n4385FasPreFAc, T00Z43_A467FasPreMtr, T00Z43_n467FasPreMtr, T00Z43_A466FasPreKgm, T00Z43_n466FasPreKgm, T00Z43_A3615FasFacCod,
            T00Z43_n3615FasFacCod, T00Z43_A4386FasPreKAn, T00Z43_n4386FasPreKAn, T00Z43_A4387FasPreMAn, T00Z43_n4387FasPreMAn, T00Z43_A4388FasPreFAn, T00Z43_n4388FasPreFAn, T00Z43_A396EmprCod, T00Z43_A457FasCod
            }
            , new Object[] {
            T00Z44_A460FasDsc, T00Z44_A4642FasDsc2, T00Z44_n4642FasDsc2
            }
            , new Object[] {
            T00Z45_A460FasDsc, T00Z45_A4642FasDsc2, T00Z45_n4642FasDsc2
            }
            , new Object[] {
            T00Z46_A252CliCod, T00Z46_A279CliNom, T00Z46_A396EmprCod
            }
            , new Object[] {
            T00Z47_A252CliCod, T00Z47_A279CliNom, T00Z47_A396EmprCod
            }
            , new Object[] {
            T00Z48_A407EmprNom, T00Z48_n407EmprNom
            }
            , new Object[] {
            T00Z49_A252CliCod, T00Z49_A279CliNom, T00Z49_A407EmprNom, T00Z49_n407EmprNom, T00Z49_A396EmprCod
            }
            , new Object[] {
            T00Z410_A396EmprCod, T00Z410_A252CliCod
            }
            , new Object[] {
            T00Z411_A396EmprCod, T00Z411_A252CliCod
            }
            , new Object[] {
            T00Z412_A396EmprCod, T00Z412_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00Z416_A396EmprCod, T00Z416_A252CliCod
            }
            , new Object[] {
            T00Z417_A252CliCod, T00Z417_A470FasSumTin, T00Z417_n470FasSumTin, T00Z417_A460FasDsc, T00Z417_A4385FasPreFAc, T00Z417_n4385FasPreFAc, T00Z417_A4642FasDsc2, T00Z417_n4642FasDsc2, T00Z417_A467FasPreMtr, T00Z417_n467FasPreMtr,
            T00Z417_A466FasPreKgm, T00Z417_n466FasPreKgm, T00Z417_A3615FasFacCod, T00Z417_n3615FasFacCod, T00Z417_A4386FasPreKAn, T00Z417_n4386FasPreKAn, T00Z417_A4387FasPreMAn, T00Z417_n4387FasPreMAn, T00Z417_A4388FasPreFAn, T00Z417_n4388FasPreFAn,
            T00Z417_A396EmprCod, T00Z417_A457FasCod
            }
            , new Object[] {
            T00Z418_A396EmprCod, T00Z418_A252CliCod, T00Z418_A457FasCod
            }
            , new Object[] {
            T00Z419_A460FasDsc, T00Z419_A4642FasDsc2, T00Z419_n4642FasDsc2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00Z423_A460FasDsc, T00Z423_A4642FasDsc2, T00Z423_n4642FasDsc2
            }
            , new Object[] {
            T00Z424_A396EmprCod, T00Z424_A252CliCod, T00Z424_A4589FFProCod, T00Z424_A4591FFFasCod
            }
            , new Object[] {
            T00Z425_A396EmprCod, T00Z425_A252CliCod, T00Z425_A494ForSer, T00Z425_A482ForColNom, T00Z425_A483ForColNum, T00Z425_A831TipColCod, T00Z425_A853For_ProC, T00Z425_A1028For_Ord
            }
            , new Object[] {
            T00Z426_A396EmprCod, T00Z426_A252CliCod, T00Z426_A457FasCod, T00Z426_A7727ArtAdiCod
            }
            , new Object[] {
            T00Z427_A396EmprCod, T00Z427_A252CliCod, T00Z427_A65ArtCod, T00Z427_A7135Lin_fast
            }
            , new Object[] {
            T00Z428_A396EmprCod, T00Z428_A252CliCod, T00Z428_A6016FasExpLin
            }
            , new Object[] {
            T00Z429_A396EmprCod, T00Z429_A966PartCod, T00Z429_A252CliCod, T00Z429_A5849UbiLin
            }
            , new Object[] {
            T00Z430_A396EmprCod, T00Z430_A252CliCod, T00Z430_A457FasCod, T00Z430_A5515ClifsiLin
            }
            , new Object[] {
            T00Z431_A396EmprCod, T00Z431_A252CliCod, T00Z431_A457FasCod, T00Z431_A5519ClifsdLin
            }
            , new Object[] {
            T00Z432_A396EmprCod, T00Z432_A252CliCod, T00Z432_A457FasCod, T00Z432_A5310ClFsAny, T00Z432_A5311ClFsSer
            }
            , new Object[] {
            T00Z433_A396EmprCod, T00Z433_A252CliCod, T00Z433_A65ArtCod, T00Z433_A4658MdlCod, T00Z433_A457FasCod
            }
            , new Object[] {
            T00Z434_A396EmprCod, T00Z434_A252CliCod, T00Z434_A65ArtCod, T00Z434_A758ProCod, T00Z434_A457FasCod
            }
            , new Object[] {
            T00Z435_A396EmprCod, T00Z435_A2333ExtPdoAlb, T00Z435_A2790ExtPdoLin
            }
            , new Object[] {
            T00Z436_A396EmprCod, T00Z436_A252CliCod, T00Z436_A457FasCod, T00Z436_A2740PreExtSer, T00Z436_A2427PreExtNMtr
            }
            , new Object[] {
            T00Z437_A396EmprCod, T00Z437_A2730RecTipCo, T00Z437_A252CliCod, T00Z437_A2736RecLin2
            }
            , new Object[] {
            }
            , new Object[] {
            T00Z439_A396EmprCod, T00Z439_A252CliCod, T00Z439_A457FasCod
            }
            , new Object[] {
            T00Z440_A407EmprNom, T00Z440_n407EmprNom
            }
         }
      );
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      N4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      A4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      i4385FasPreFAc = GXutil.nullDate() ;
      n4385FasPreFAc = false ;
      Gx_date = GXutil.today( ) ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV28FlagEtal ;
   private byte AV33InputFec ;
   private byte AV39Magosa ;
   private byte AV34TexKnit ;
   private byte AV30FlagTin ;
   private byte AV32FlagGua ;
   private byte AV36Calvet ;
   private byte AV35Kohler ;
   private byte AV37Staack ;
   private byte AV41Tonali ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_85 ;
   private short nRcdExists_85 ;
   private short nIsMod_85 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount85 ;
   private short RcdFound85 ;
   private short nBlankRcdUsr85 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_85 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
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
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_85_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasDsc2_Enabled ;
   private int edtFasPreMtr_Enabled ;
   private int edtFasPreKgm_Enabled ;
   private int edtFasSumTin_Enabled ;
   private int edtFasFacCod_Enabled ;
   private int edtFasPreFAc_Enabled ;
   private int edtFasPreKAn_Enabled ;
   private int edtFasPreMAn_Enabled ;
   private int edtFasPreFAn_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GXv_int7[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtFasPreFAc_Enabled ;
   private int defedtFasCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z467FasPreMtr ;
   private java.math.BigDecimal Z466FasPreKgm ;
   private java.math.BigDecimal Z4386FasPreKAn ;
   private java.math.BigDecimal Z4387FasPreMAn ;
   private java.math.BigDecimal O466FasPreKgm ;
   private java.math.BigDecimal O467FasPreMtr ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A4386FasPreKAn ;
   private java.math.BigDecimal A4387FasPreMAn ;
   private java.math.BigDecimal T466FasPreKgm ;
   private java.math.BigDecimal T467FasPreMtr ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV40Modif ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z457FasCod ;
   private String Z470FasSumTin ;
   private String Z3615FasFacCod ;
   private String Z460FasDsc ;
   private String Z4642FasDsc2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV40Modif ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliNom_Internalname ;
   private String sGXsfl_40_idx="0001" ;
   private String edtFasCod_Title ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Title ;
   private String edtFasDsc_Internalname ;
   private String edtFasPreMtr_Title ;
   private String edtFasPreMtr_Internalname ;
   private String edtFasPreKgm_Title ;
   private String edtFasPreKgm_Internalname ;
   private String edtFasFacCod_Title ;
   private String edtFasFacCod_Internalname ;
   private String edtFasSumTin_Title ;
   private String edtFasSumTin_Internalname ;
   private String edtFasPreFAc_Title ;
   private String edtFasPreFAc_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode85 ;
   private String edtavnRcdDeleted_85_Internalname ;
   private String edtFasDsc2_Internalname ;
   private String edtFasPreKAn_Internalname ;
   private String edtFasPreMAn_Internalname ;
   private String edtFasPreFAn_Internalname ;
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
   private String AV17UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode21 ;
   private String sV40Modif ;
   private String OV40Modif ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A4642FasDsc2 ;
   private String A470FasSumTin ;
   private String A3615FasFacCod ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27LitFe ;
   private String AV31Lit8 ;
   private String GXt_char1 ;
   private String AV18Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_85_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasDsc2_Jsonclick ;
   private String edtFasPreMtr_Jsonclick ;
   private String edtFasPreKgm_Jsonclick ;
   private String edtFasSumTin_Jsonclick ;
   private String edtFasFacCod_Jsonclick ;
   private String edtFasPreFAc_Jsonclick ;
   private String edtFasPreKAn_Jsonclick ;
   private String edtFasPreMAn_Jsonclick ;
   private String edtFasPreFAn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i470FasSumTin ;
   private String subGrid1_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ279CliNom ;
   private String ZZ407EmprNom ;
   private String ZZV17UsurCod ;
   private String ZV40Modif ;
   private java.util.Date Z4385FasPreFAc ;
   private java.util.Date Z4388FasPreFAn ;
   private java.util.Date N4385FasPreFAc ;
   private java.util.Date Gx_date ;
   private java.util.Date A4385FasPreFAc ;
   private java.util.Date A4388FasPreFAn ;
   private java.util.Date i4385FasPreFAc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n457FasCod ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n4385FasPreFAc ;
   private boolean n470FasSumTin ;
   private boolean n4642FasDsc2 ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private boolean n3615FasFacCod ;
   private boolean n4386FasPreKAn ;
   private boolean n4387FasPreMAn ;
   private boolean n4388FasPreFAn ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00Z48_A407EmprNom ;
   private boolean[] T00Z48_n407EmprNom ;
   private int[] T00Z49_A252CliCod ;
   private boolean[] T00Z49_n252CliCod ;
   private String[] T00Z49_A279CliNom ;
   private String[] T00Z49_A407EmprNom ;
   private boolean[] T00Z49_n407EmprNom ;
   private String[] T00Z49_A396EmprCod ;
   private String[] T00Z410_A396EmprCod ;
   private int[] T00Z410_A252CliCod ;
   private boolean[] T00Z410_n252CliCod ;
   private int[] T00Z47_A252CliCod ;
   private boolean[] T00Z47_n252CliCod ;
   private String[] T00Z47_A279CliNom ;
   private String[] T00Z47_A396EmprCod ;
   private String[] T00Z411_A396EmprCod ;
   private int[] T00Z411_A252CliCod ;
   private boolean[] T00Z411_n252CliCod ;
   private String[] T00Z412_A396EmprCod ;
   private int[] T00Z412_A252CliCod ;
   private boolean[] T00Z412_n252CliCod ;
   private int[] T00Z46_A252CliCod ;
   private boolean[] T00Z46_n252CliCod ;
   private String[] T00Z46_A279CliNom ;
   private String[] T00Z46_A396EmprCod ;
   private String[] T00Z416_A396EmprCod ;
   private int[] T00Z416_A252CliCod ;
   private boolean[] T00Z416_n252CliCod ;
   private int[] T00Z417_A252CliCod ;
   private boolean[] T00Z417_n252CliCod ;
   private String[] T00Z417_A470FasSumTin ;
   private boolean[] T00Z417_n470FasSumTin ;
   private String[] T00Z417_A460FasDsc ;
   private java.util.Date[] T00Z417_A4385FasPreFAc ;
   private boolean[] T00Z417_n4385FasPreFAc ;
   private String[] T00Z417_A4642FasDsc2 ;
   private boolean[] T00Z417_n4642FasDsc2 ;
   private java.math.BigDecimal[] T00Z417_A467FasPreMtr ;
   private boolean[] T00Z417_n467FasPreMtr ;
   private java.math.BigDecimal[] T00Z417_A466FasPreKgm ;
   private boolean[] T00Z417_n466FasPreKgm ;
   private String[] T00Z417_A3615FasFacCod ;
   private boolean[] T00Z417_n3615FasFacCod ;
   private java.math.BigDecimal[] T00Z417_A4386FasPreKAn ;
   private boolean[] T00Z417_n4386FasPreKAn ;
   private java.math.BigDecimal[] T00Z417_A4387FasPreMAn ;
   private boolean[] T00Z417_n4387FasPreMAn ;
   private java.util.Date[] T00Z417_A4388FasPreFAn ;
   private boolean[] T00Z417_n4388FasPreFAn ;
   private String[] T00Z417_A396EmprCod ;
   private String[] T00Z417_A457FasCod ;
   private boolean[] T00Z417_n457FasCod ;
   private String[] T00Z45_A460FasDsc ;
   private String[] T00Z45_A4642FasDsc2 ;
   private boolean[] T00Z45_n4642FasDsc2 ;
   private String[] T00Z418_A396EmprCod ;
   private int[] T00Z418_A252CliCod ;
   private boolean[] T00Z418_n252CliCod ;
   private String[] T00Z418_A457FasCod ;
   private boolean[] T00Z418_n457FasCod ;
   private int[] T00Z43_A252CliCod ;
   private boolean[] T00Z43_n252CliCod ;
   private String[] T00Z43_A470FasSumTin ;
   private boolean[] T00Z43_n470FasSumTin ;
   private java.util.Date[] T00Z43_A4385FasPreFAc ;
   private boolean[] T00Z43_n4385FasPreFAc ;
   private java.math.BigDecimal[] T00Z43_A467FasPreMtr ;
   private boolean[] T00Z43_n467FasPreMtr ;
   private java.math.BigDecimal[] T00Z43_A466FasPreKgm ;
   private boolean[] T00Z43_n466FasPreKgm ;
   private String[] T00Z43_A3615FasFacCod ;
   private boolean[] T00Z43_n3615FasFacCod ;
   private java.math.BigDecimal[] T00Z43_A4386FasPreKAn ;
   private boolean[] T00Z43_n4386FasPreKAn ;
   private java.math.BigDecimal[] T00Z43_A4387FasPreMAn ;
   private boolean[] T00Z43_n4387FasPreMAn ;
   private java.util.Date[] T00Z43_A4388FasPreFAn ;
   private boolean[] T00Z43_n4388FasPreFAn ;
   private String[] T00Z43_A396EmprCod ;
   private String[] T00Z43_A457FasCod ;
   private boolean[] T00Z43_n457FasCod ;
   private int[] T00Z42_A252CliCod ;
   private boolean[] T00Z42_n252CliCod ;
   private String[] T00Z42_A470FasSumTin ;
   private boolean[] T00Z42_n470FasSumTin ;
   private java.util.Date[] T00Z42_A4385FasPreFAc ;
   private boolean[] T00Z42_n4385FasPreFAc ;
   private java.math.BigDecimal[] T00Z42_A467FasPreMtr ;
   private boolean[] T00Z42_n467FasPreMtr ;
   private java.math.BigDecimal[] T00Z42_A466FasPreKgm ;
   private boolean[] T00Z42_n466FasPreKgm ;
   private String[] T00Z42_A3615FasFacCod ;
   private boolean[] T00Z42_n3615FasFacCod ;
   private java.math.BigDecimal[] T00Z42_A4386FasPreKAn ;
   private boolean[] T00Z42_n4386FasPreKAn ;
   private java.math.BigDecimal[] T00Z42_A4387FasPreMAn ;
   private boolean[] T00Z42_n4387FasPreMAn ;
   private java.util.Date[] T00Z42_A4388FasPreFAn ;
   private boolean[] T00Z42_n4388FasPreFAn ;
   private String[] T00Z42_A396EmprCod ;
   private String[] T00Z42_A457FasCod ;
   private boolean[] T00Z42_n457FasCod ;
   private String[] T00Z419_A460FasDsc ;
   private String[] T00Z419_A4642FasDsc2 ;
   private boolean[] T00Z419_n4642FasDsc2 ;
   private String[] T00Z423_A460FasDsc ;
   private String[] T00Z423_A4642FasDsc2 ;
   private boolean[] T00Z423_n4642FasDsc2 ;
   private String[] T00Z424_A396EmprCod ;
   private int[] T00Z424_A252CliCod ;
   private boolean[] T00Z424_n252CliCod ;
   private String[] T00Z424_A4589FFProCod ;
   private String[] T00Z424_A4591FFFasCod ;
   private String[] T00Z425_A396EmprCod ;
   private int[] T00Z425_A252CliCod ;
   private boolean[] T00Z425_n252CliCod ;
   private String[] T00Z425_A494ForSer ;
   private String[] T00Z425_A482ForColNom ;
   private int[] T00Z425_A483ForColNum ;
   private byte[] T00Z425_A831TipColCod ;
   private String[] T00Z425_A853For_ProC ;
   private int[] T00Z425_A1028For_Ord ;
   private String[] T00Z426_A396EmprCod ;
   private int[] T00Z426_A252CliCod ;
   private boolean[] T00Z426_n252CliCod ;
   private String[] T00Z426_A457FasCod ;
   private boolean[] T00Z426_n457FasCod ;
   private short[] T00Z426_A7727ArtAdiCod ;
   private String[] T00Z427_A396EmprCod ;
   private int[] T00Z427_A252CliCod ;
   private boolean[] T00Z427_n252CliCod ;
   private String[] T00Z427_A65ArtCod ;
   private short[] T00Z427_A7135Lin_fast ;
   private String[] T00Z428_A396EmprCod ;
   private int[] T00Z428_A252CliCod ;
   private boolean[] T00Z428_n252CliCod ;
   private short[] T00Z428_A6016FasExpLin ;
   private String[] T00Z429_A396EmprCod ;
   private String[] T00Z429_A966PartCod ;
   private int[] T00Z429_A252CliCod ;
   private boolean[] T00Z429_n252CliCod ;
   private short[] T00Z429_A5849UbiLin ;
   private String[] T00Z430_A396EmprCod ;
   private int[] T00Z430_A252CliCod ;
   private boolean[] T00Z430_n252CliCod ;
   private String[] T00Z430_A457FasCod ;
   private boolean[] T00Z430_n457FasCod ;
   private short[] T00Z430_A5515ClifsiLin ;
   private String[] T00Z431_A396EmprCod ;
   private int[] T00Z431_A252CliCod ;
   private boolean[] T00Z431_n252CliCod ;
   private String[] T00Z431_A457FasCod ;
   private boolean[] T00Z431_n457FasCod ;
   private short[] T00Z431_A5519ClifsdLin ;
   private String[] T00Z432_A396EmprCod ;
   private int[] T00Z432_A252CliCod ;
   private boolean[] T00Z432_n252CliCod ;
   private String[] T00Z432_A457FasCod ;
   private boolean[] T00Z432_n457FasCod ;
   private short[] T00Z432_A5310ClFsAny ;
   private String[] T00Z432_A5311ClFsSer ;
   private String[] T00Z433_A396EmprCod ;
   private int[] T00Z433_A252CliCod ;
   private boolean[] T00Z433_n252CliCod ;
   private String[] T00Z433_A65ArtCod ;
   private String[] T00Z433_A4658MdlCod ;
   private String[] T00Z433_A457FasCod ;
   private boolean[] T00Z433_n457FasCod ;
   private String[] T00Z434_A396EmprCod ;
   private int[] T00Z434_A252CliCod ;
   private boolean[] T00Z434_n252CliCod ;
   private String[] T00Z434_A65ArtCod ;
   private String[] T00Z434_A758ProCod ;
   private String[] T00Z434_A457FasCod ;
   private boolean[] T00Z434_n457FasCod ;
   private String[] T00Z435_A396EmprCod ;
   private int[] T00Z435_A2333ExtPdoAlb ;
   private short[] T00Z435_A2790ExtPdoLin ;
   private String[] T00Z436_A396EmprCod ;
   private int[] T00Z436_A252CliCod ;
   private boolean[] T00Z436_n252CliCod ;
   private String[] T00Z436_A457FasCod ;
   private boolean[] T00Z436_n457FasCod ;
   private String[] T00Z436_A2740PreExtSer ;
   private String[] T00Z436_A2427PreExtNMtr ;
   private String[] T00Z437_A396EmprCod ;
   private short[] T00Z437_A2730RecTipCo ;
   private int[] T00Z437_A252CliCod ;
   private boolean[] T00Z437_n252CliCod ;
   private short[] T00Z437_A2736RecLin2 ;
   private String[] T00Z439_A396EmprCod ;
   private int[] T00Z439_A252CliCod ;
   private boolean[] T00Z439_n252CliCod ;
   private String[] T00Z439_A457FasCod ;
   private boolean[] T00Z439_n457FasCod ;
   private String[] T00Z440_A407EmprNom ;
   private boolean[] T00Z440_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T00Z44_A460FasDsc ;
   private String[] T00Z44_A4642FasDsc2 ;
   private boolean[] T00Z44_n4642FasDsc2 ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpprefa__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpprefa__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpprefa__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpprefa__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpprefa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00Z42", "SELECT CliCod, FasSumTin, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, EmprCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?  FOR UPDATE OF FasSumTin, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z43", "SELECT CliCod, FasSumTin, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, EmprCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z44", "SELECT FasDsc, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ?  FOR UPDATE OF FasDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z45", "SELECT FasDsc, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z46", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z47", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z48", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z49", "SELECT /*+ FIRST_ROWS(1) */ TM1.CliCod, TM1.CliNom, T2.EmprNom, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z410", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00Z413", "INSERT INTO TXPCLIENT(CliCod, CliNom, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00Z414", "UPDATE TXPCLIENT SET CliNom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T00Z415", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T00Z416", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z417", "SELECT T1.CliCod, T1.FasSumTin, T2.FasDsc, T1.FasPreFAc, T2.FasDsc2, T1.FasPreMtr, T1.FasPreKgm, T1.FasFacCod, T1.FasPreKAn, T1.FasPreMAn, T1.FasPreFAn, T1.EmprCod, T1.FasCod FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z418", "SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z419", "SELECT FasDsc, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ?  FOR UPDATE OF FasDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00Z420", "INSERT INTO TXPPREFAS(CliCod, FasSumTin, FasPreFAc, FasPreMtr, FasPreKgm, FasFacCod, FasPreKAn, FasPreMAn, FasPreFAn, EmprCod, FasCod, ClifsdUl, ClifsiUl, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasKgsEnt, FasFactura) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', 0, ' ', ' ')", GX_NOMASK, "TXPPREFAS")
         ,new UpdateCursor("T00Z421", "UPDATE TXPPREFAS SET FasSumTin=?, FasPreFAc=?, FasPreMtr=?, FasPreKgm=?, FasFacCod=?, FasPreKAn=?, FasPreMAn=?, FasPreFAn=?  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK, "TXPPREFAS")
         ,new UpdateCursor("T00Z422", "DELETE FROM TXPPREFAS  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK, "TXPPREFAS")
         ,new ForEachCursor("T00Z423", "SELECT FasDsc, FasDsc2 FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z424", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod, FFFasCod FROM TXPFasFC2 WHERE EmprCod = ? AND CliCod = ? AND FFFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z425", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, For_ProC, For_Ord FROM TXPTAB001 WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z426", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ArtAdiCod FROM TXPARTPFA WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z427", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND FasCodt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z428", "SELECT * FROM (SELECT EmprCod, CliCod, FasExpLin FROM TXPFASCLI WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z429", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod, UbiLin FROM TXPUBIMTO WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z430", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClifsiLin FROM TXPCLIFS1 WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z431", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClifsdLin FROM TXPCLIFSD WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z432", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, ClFsAny, ClFsSer FROM TXPCLFSE WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z433", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod FROM TXPCForFa WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z434", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z435", "SELECT * FROM (SELECT EmprCod, ExtPdoAlb, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z436", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod, PreExtSer, PreExtNMtr FROM TXPPREEXT WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00Z437", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod, RecLin2 FROM TXPLRETIT WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00Z438", "UPDATE TXPFASPRO SET FasDsc=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T00Z439", "SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00Z440", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 3);
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((String[]) buf[21])[0] = rslt.getString(13, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
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
            case 8 :
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
            case 9 :
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
            case 10 :
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
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 13 :
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
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               stmt.setString(10, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 8);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               stmt.setString(9, (String)parms[16], 3);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 8);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 28);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
               }
               return;
            case 37 :
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
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

