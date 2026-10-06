package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcostpt_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"SUP_SVALF") == 0 )
      {
         A7666Sup_TtRl = (byte)(GXutil.lval( httpContext.GetPar( "Sup_TtRl"))) ;
         n7666Sup_TtRl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7666Sup_TtRl", GXutil.str( A7666Sup_TtRl, 1, 0));
         A7667Sup_hd = (int)(GXutil.lval( httpContext.GetPar( "Sup_hd"))) ;
         n7667Sup_hd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7667Sup_hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7667Sup_hd), 8, 0));
         A7668Sup_hrp = (byte)(GXutil.lval( httpContext.GetPar( "Sup_hrp"))) ;
         n7668Sup_hrp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7668Sup_hrp", GXutil.str( A7668Sup_hrp, 1, 0));
         A7669Sup_hpp = httpContext.GetPar( "Sup_hpp") ;
         n7669Sup_hpp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7669Sup_hpp", A7669Sup_hpp);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7275Sup_Num = (int)(GXutil.lval( httpContext.GetPar( "Sup_Num"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7275Sup_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7275Sup_Num), 8, 0));
         A7342Sup_Lnf = (int)(GXutil.lval( httpContext.GetPar( "Sup_Lnf"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asasup_svalfZZ1036( A7666Sup_TtRl, A7667Sup_hd, A7668Sup_hrp, A7669Sup_hpp, A396EmprCod, A7275Sup_Num, A7342Sup_Lnf) ;
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
            A7275Sup_Num = (int)(GXutil.lval( httpContext.GetPar( "Sup_Num"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7275Sup_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7275Sup_Num), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "COSTO REAL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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

   public tcostpt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcostpt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcostpt_impl.class ));
   }

   public tcostpt_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCOSTPt.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTPt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTPt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTPt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCOSTPt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nª Simulacion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCOSTPt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSup_Num_Internalname, GXutil.ltrim( localUtil.ntoc( A7275Sup_Num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSup_Num_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7275Sup_Num), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7275Sup_Num), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSup_Num_Jsonclick, 0, "", "", "", "", "", 1, edtSup_Num_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1036 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1036 = (short)(1) ;
            scanStartZZ1036( ) ;
            while ( RcdFound1036 != 0 )
            {
               init_level_properties1036( ) ;
               getByPrimaryKeyZZ1036( ) ;
               addRowZZ1036( ) ;
               scanNextZZ1036( ) ;
            }
            scanEndZZ1036( ) ;
            nBlankRcdCount1036 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalZZ1036( ) ;
         standaloneModalZZ1036( ) ;
         sMode1036 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRowZZ1036( ) ;
            edtavnRcdDeleted_1036_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1036_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1036_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1036_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Lnf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_LNF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Lnf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Lnf_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Fasco_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_FASCO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasco_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Fasde_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_FASDE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasde_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Maq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_MAQ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Maq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Cmaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CMAQ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Cmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Cmaq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Tpp_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TPP_"+sGXsfl_35_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
            edtSup_Tpp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TPP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_TTF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TTF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_TTF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_TTF_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Vol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_VOL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Vol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Vol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Ch2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CH2O_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Ch2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Ch2o_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Tmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TMP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Tmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tmp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_CVapor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CVAPOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_CVapor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CVapor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Grupo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_GRUPO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Grupo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_TpU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TPU_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_TpU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_TpU_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Consum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CONSUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Consum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Consum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_SValF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SVALF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_SValF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_SValF_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Tog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TOG_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Tog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tog_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_UndMM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_UNDMM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_UndMM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_UndMM_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_CmaqC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CMAQC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_CmaqC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CmaqC_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Secc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SECC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Secc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Secc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Smod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SMOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Smod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Smod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Smoi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SMOI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Smoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Smoi_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Scif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SCIF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Scif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Scif_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_SProd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SPROD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_SProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_SProd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_CMOD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CMOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_CMOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CMOD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_TmpA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TMPA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_TmpA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_TmpA_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_H20n_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_H20N_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_H20n_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_H20n_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_H20r_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_H20R_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_H20r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_H20r_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Reuso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_REUSO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Reuso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Reuso_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_Ch2or_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CH2OR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Ch2or_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Ch2or_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_moiU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_MOIU_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_moiU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_moiU_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_cifU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CIFU_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_cifU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_cifU_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_CostL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_COSTL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_CostL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CostL_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_camt_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CAMT_"+sGXsfl_35_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
            edtSup_camt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CAMT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_usut_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_USUT_"+sGXsfl_35_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
            edtSup_usut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_USUT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_fecht_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_FECHT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_fecht_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_fecht_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtSup_SVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SVAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_SVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_SVal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1036 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalZZ1036( ) ;
            }
            sendRowZZ1036( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1036 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1036 = (short)(5) ;
         nRcdExists_1036 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartZZ1036( ) ;
            while ( RcdFound1036 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351036( ) ;
               init_level_properties1036( ) ;
               standaloneNotModalZZ1036( ) ;
               getByPrimaryKeyZZ1036( ) ;
               standaloneModalZZ1036( ) ;
               addRowZZ1036( ) ;
               scanNextZZ1036( ) ;
            }
            scanEndZZ1036( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1036 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351036( ) ;
      initAllZZ1036( ) ;
      init_level_properties1036( ) ;
      nRcdExists_1036 = (short)(0) ;
      nIsMod_1036 = (short)(0) ;
      nRcdDeleted_1036 = (short)(0) ;
      nBlankRcdCount1036 = (short)(nBlankRcdUsr1036+nBlankRcdCount1036) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1036 > 0 )
      {
         standaloneNotModalZZ1036( ) ;
         standaloneModalZZ1036( ) ;
         addRowZZ1036( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtSup_Lnf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1036 = (short)(nBlankRcdCount1036-1) ;
      }
      Gx_mode = sMode1036 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCOSTPt.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCOSTPt.htm");
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
      e11ZZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z7275Sup_Num = (int)(localUtil.ctol( httpContext.cgiGet( "Z7275Sup_Num"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A7666Sup_TtRl = (byte)(localUtil.ctol( httpContext.cgiGet( "SUP_TTRL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7667Sup_hd = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_HD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7668Sup_hrp = (byte)(localUtil.ctol( httpContext.cgiGet( "SUP_HRP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7669Sup_hpp = httpContext.cgiGet( "SUP_HPP") ;
            A7281Sup_Und = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_UND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7281Sup_Und = false ;
            A7286Sup_ConVap = localUtil.ctond( httpContext.cgiGet( "SUP_CONVAP")) ;
            n7286Sup_ConVap = false ;
            A7299Sup_cacpp = localUtil.ctond( httpContext.cgiGet( "SUP_CACPP")) ;
            n7299Sup_cacpp = false ;
            A8426Sup_conmq = localUtil.ctond( httpContext.cgiGet( "SUP_CONMQ")) ;
            n8426Sup_conmq = false ;
            A7612Sup_matipu = localUtil.ctond( httpContext.cgiGet( "SUP_MATIPU")) ;
            n7612Sup_matipu = false ;
            A8425Sup_TmpC = (short)(localUtil.ctol( httpContext.cgiGet( "SUP_TMPC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8425Sup_TmpC = false ;
            A11932Sup_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( "SUP_NH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11932Sup_Nh2o = false ;
            A7283Sup_PminOp = localUtil.ctond( httpContext.cgiGet( "SUP_PMINOP")) ;
            n7283Sup_PminOp = false ;
            AV40oLDTpp = localUtil.ctond( httpContext.cgiGet( "vOLDTPP")) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A7275Sup_Num = (int)(localUtil.ctol( httpContext.cgiGet( edtSup_Num_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7275Sup_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7275Sup_Num), 8, 0));
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
               A7275Sup_Num = (int)(GXutil.lval( httpContext.GetPar( "Sup_Num"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7275Sup_Num", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7275Sup_Num), 8, 0));
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
                        e11ZZ2 ();
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
            initAllZZ1035( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1036_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1036_Enabled), 5, 0), !bGXsfl_35_Refreshing);
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
      disableAttributesZZ1035( ) ;
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

   public void confirm_ZZ0( )
   {
      beforeValidateZZ1035( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsZZ1035( ) ;
         }
         else
         {
            checkExtendedTableZZ1035( ) ;
            if ( AnyError == 0 )
            {
               zmZZ1035( 27) ;
            }
            closeExtendedTableCursorsZZ1035( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1035 = Gx_mode ;
         confirm_ZZ1036( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1035 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1035 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesZZ0( ) ;
      }
   }

   public void confirm_ZZ1036( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRowZZ1036( ) ;
         if ( ( nRcdExists_1036 != 0 ) || ( nIsMod_1036 != 0 ) )
         {
            getKeyZZ1036( ) ;
            if ( ( nRcdExists_1036 == 0 ) && ( nRcdDeleted_1036 == 0 ) )
            {
               if ( RcdFound1036 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateZZ1036( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableZZ1036( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsZZ1036( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "SUP_LNF_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSup_Lnf_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1036 != 0 )
               {
                  if ( nRcdDeleted_1036 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyZZ1036( ) ;
                     loadZZ1036( ) ;
                     beforeValidateZZ1036( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsZZ1036( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1036 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateZZ1036( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableZZ1036( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsZZ1036( ) ;
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
                  if ( nRcdDeleted_1036 == 0 )
                  {
                     GXCCtl = "SUP_LNF_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSup_Lnf_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1036_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Lnf_Internalname, GXutil.ltrim( localUtil.ntoc( A7342Sup_Lnf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Fasco_Internalname, GXutil.rtrim( A7343Sup_Fasco)) ;
         httpContext.changePostValue( edtSup_Fasde_Internalname, GXutil.rtrim( A7344Sup_Fasde)) ;
         httpContext.changePostValue( edtSup_Maq_Internalname, GXutil.rtrim( A7345Sup_Maq)) ;
         httpContext.changePostValue( edtSup_Cmaq_Internalname, GXutil.ltrim( localUtil.ntoc( A7346Sup_Cmaq, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Tpp_Internalname, GXutil.ltrim( localUtil.ntoc( A7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_TTF_Internalname, GXutil.ltrim( localUtil.ntoc( A7348Sup_TTF, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Vol_Internalname, GXutil.ltrim( localUtil.ntoc( A7349Sup_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Ch2o_Internalname, GXutil.ltrim( localUtil.ntoc( A7350Sup_Ch2o, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Tmp_Internalname, GXutil.ltrim( localUtil.ntoc( A7351Sup_Tmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CVapor_Internalname, GXutil.ltrim( localUtil.ntoc( A7352Sup_CVapor, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Grupo_Internalname, GXutil.ltrim( localUtil.ntoc( A7353Sup_Grupo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_TpU_Internalname, GXutil.ltrim( localUtil.ntoc( A7354Sup_TpU, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Consum_Internalname, GXutil.ltrim( localUtil.ntoc( A7355Sup_Consum, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_SValF_Internalname, GXutil.ltrim( localUtil.ntoc( A7356Sup_SValF, (byte)(15), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Tog_Internalname, GXutil.ltrim( localUtil.ntoc( A7357Sup_Tog, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_UndMM_Internalname, GXutil.ltrim( localUtil.ntoc( A7358Sup_UndMM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CmaqC_Internalname, GXutil.ltrim( localUtil.ntoc( A7359Sup_CmaqC, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Secc_Internalname, GXutil.rtrim( A7605Sup_Secc)) ;
         httpContext.changePostValue( edtSup_Smod_Internalname, GXutil.ltrim( localUtil.ntoc( A7606Sup_Smod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Smoi_Internalname, GXutil.ltrim( localUtil.ntoc( A7607Sup_Smoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Scif_Internalname, GXutil.ltrim( localUtil.ntoc( A7608Sup_Scif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_SProd_Internalname, GXutil.ltrim( localUtil.ntoc( A7609Sup_SProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CMOD_Internalname, GXutil.ltrim( localUtil.ntoc( A7610Sup_CMOD, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_TmpA_Internalname, GXutil.ltrim( localUtil.ntoc( A7614Sup_TmpA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_H20n_Internalname, GXutil.ltrim( localUtil.ntoc( A7615Sup_H20n, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_H20r_Internalname, GXutil.ltrim( localUtil.ntoc( A7616Sup_H20r, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Reuso_Internalname, GXutil.rtrim( A7617Sup_Reuso)) ;
         httpContext.changePostValue( edtSup_Ch2or_Internalname, GXutil.ltrim( localUtil.ntoc( A7618Sup_Ch2or, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_moiU_Internalname, GXutil.ltrim( localUtil.ntoc( A7626Sup_moiU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_cifU_Internalname, GXutil.ltrim( localUtil.ntoc( A7627Sup_cifU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CostL_Internalname, GXutil.ltrim( localUtil.ntoc( A7629Sup_CostL, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_camt_Internalname, GXutil.ltrim( localUtil.ntoc( A7661Sup_camt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_usut_Internalname, GXutil.rtrim( A7664Sup_usut)) ;
         httpContext.changePostValue( edtSup_fecht_Internalname, localUtil.ttoc( A7665Sup_fecht, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtSup_SVal_Internalname, GXutil.ltrim( localUtil.ntoc( A7361Sup_SVal, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7342Sup_Lnf_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7342Sup_Lnf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7343Sup_Fasco_"+sGXsfl_35_idx, GXutil.rtrim( Z7343Sup_Fasco)) ;
         httpContext.changePostValue( "ZT_"+"Z7344Sup_Fasde_"+sGXsfl_35_idx, GXutil.rtrim( Z7344Sup_Fasde)) ;
         httpContext.changePostValue( "ZT_"+"Z7345Sup_Maq_"+sGXsfl_35_idx, GXutil.rtrim( Z7345Sup_Maq)) ;
         httpContext.changePostValue( "ZT_"+"Z7346Sup_Cmaq_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7346Sup_Cmaq, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7347Sup_Tpp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7349Sup_Vol_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7349Sup_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7351Sup_Tmp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7351Sup_Tmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7353Sup_Grupo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7353Sup_Grupo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7357Sup_Tog_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7357Sup_Tog, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7358Sup_UndMM_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7358Sup_UndMM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7605Sup_Secc_"+sGXsfl_35_idx, GXutil.rtrim( Z7605Sup_Secc)) ;
         httpContext.changePostValue( "ZT_"+"Z7606Sup_Smod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7606Sup_Smod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7607Sup_Smoi_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7607Sup_Smoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7608Sup_Scif_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7608Sup_Scif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7609Sup_SProd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7609Sup_SProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7614Sup_TmpA_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7614Sup_TmpA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7615Sup_H20n_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7615Sup_H20n, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7616Sup_H20r_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7616Sup_H20r, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7617Sup_Reuso_"+sGXsfl_35_idx, GXutil.rtrim( Z7617Sup_Reuso)) ;
         httpContext.changePostValue( "ZT_"+"Z7661Sup_camt_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7661Sup_camt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7664Sup_usut_"+sGXsfl_35_idx, GXutil.rtrim( Z7664Sup_usut)) ;
         httpContext.changePostValue( "ZT_"+"Z7665Sup_fecht_"+sGXsfl_35_idx, localUtil.ttoc( Z7665Sup_fecht, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7666Sup_TtRl_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7666Sup_TtRl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7667Sup_hd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7667Sup_hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7668Sup_hrp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7668Sup_hrp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7669Sup_hpp_"+sGXsfl_35_idx, GXutil.rtrim( Z7669Sup_hpp)) ;
         httpContext.changePostValue( "ZT_"+"Z8425Sup_TmpC_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z8425Sup_TmpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11932Sup_Nh2o_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11932Sup_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7347Sup_Tpp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1036_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1036_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1036_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1036 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1036_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1036_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_LNF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Lnf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_FASCO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasco_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_FASDE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasde_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_MAQ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Maq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CMAQ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Cmaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TPP_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TPP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TTF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TTF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_VOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Vol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CH2O_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TMP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CVAPOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CVapor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_GRUPO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Grupo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TPU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TpU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CONSUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Consum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SVALF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SValF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TOG_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_UNDMM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_UndMM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CMAQC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CmaqC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SECC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Secc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SMOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SMOI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smoi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SCIF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Scif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SPROD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SProd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CMOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CMOD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TMPA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TmpA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_H20N_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20n_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_H20R_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20r_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_REUSO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Reuso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CH2OR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2or_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_MOIU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_moiU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CIFU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_cifU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_COSTL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CostL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CAMT_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CAMT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_USUT_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_USUT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_FECHT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_fecht_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionZZ0( )
   {
   }

   public void e11ZZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcostpt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV41Pgmname, (byte)(99), GXv_char2) ;
      tcostpt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcostpt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcostpt_impl.this.A396EmprCod = GXv_char2[0] ;
      tcostpt_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcostpt_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmZZ1035( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -26 )
      {
         Z7275Sup_Num = A7275Sup_Num ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV41Pgmname = "TCOSTPt" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      /* Using cursor T00ZZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00ZZ6_A407EmprNom[0] ;
      n407EmprNom = T00ZZ6_n407EmprNom[0] ;
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

   public void loadZZ1035( )
   {
      /* Using cursor T00ZZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1035 = (short)(1) ;
         A407EmprNom = T00ZZ7_A407EmprNom[0] ;
         n407EmprNom = T00ZZ7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmZZ1035( -26) ;
      }
      pr_default.close(5);
      onLoadActionsZZ1035( ) ;
   }

   public void onLoadActionsZZ1035( )
   {
   }

   public void checkExtendedTableZZ1035( )
   {
      nIsDirty_1035 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsZZ1035( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyZZ1035( )
   {
      /* Using cursor T00ZZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1035 = (short)(1) ;
      }
      else
      {
         RcdFound1035 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00ZZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      if ( (pr_default.getStatus(3) != 101) && ( T00ZZ5_A7275Sup_Num[0] == A7275Sup_Num ) && ( GXutil.strcmp(T00ZZ5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmZZ1035( 26) ;
         RcdFound1035 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z7275Sup_Num = A7275Sup_Num ;
         sMode1035 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadZZ1035( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1035 = (short)(0) ;
            initializeNonKeyZZ1035( ) ;
         }
         Gx_mode = sMode1035 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1035 = (short)(0) ;
         initializeNonKeyZZ1035( ) ;
         sMode1035 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1035 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyZZ1035( ) ;
      if ( RcdFound1035 == 0 )
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
      RcdFound1035 = (short)(0) ;
      /* Using cursor T00ZZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00ZZ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00ZZ9_A7275Sup_Num[0] == A7275Sup_Num ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00ZZ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00ZZ9_A7275Sup_Num[0] == A7275Sup_Num ) )
         {
            RcdFound1035 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1035 = (short)(0) ;
      /* Using cursor T00ZZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00ZZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00ZZ10_A7275Sup_Num[0] == A7275Sup_Num ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T00ZZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00ZZ10_A7275Sup_Num[0] == A7275Sup_Num ) )
         {
            RcdFound1035 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyZZ1035( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insertZZ1035( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1035 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7275Sup_Num != Z7275Sup_Num ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateZZ1035( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7275Sup_Num != Z7275Sup_Num ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insertZZ1035( ) ;
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
                  insertZZ1035( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7275Sup_Num != Z7275Sup_Num ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
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
      getKeyZZ1035( ) ;
      if ( RcdFound1035 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7275Sup_Num != Z7275Sup_Num ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7275Sup_Num != Z7275Sup_Num ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcostpt");
   }

   public void insert_check( )
   {
      confirm_ZZ0( ) ;
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
      if ( RcdFound1035 == 0 )
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
      scanStartZZ1035( ) ;
      if ( RcdFound1035 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndZZ1035( ) ;
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
      if ( RcdFound1035 == 0 )
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
      if ( RcdFound1035 == 0 )
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
      scanStartZZ1035( ) ;
      if ( RcdFound1035 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1035 != 0 )
         {
            scanNextZZ1035( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndZZ1035( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyZZ1035( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00ZZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOST00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOST00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZZ1035( )
   {
      beforeValidateZZ1035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZZ1035( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZZ1035( 0) ;
         checkOptimisticConcurrencyZZ1035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZZ1035( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZZ1035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZZ11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A7275Sup_Num), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOST00");
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
                        processLevelZZ1035( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionZZ0( ) ;
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
            loadZZ1035( ) ;
         }
         endLevelZZ1035( ) ;
      }
      closeExtendedTableCursorsZZ1035( ) ;
   }

   public void updateZZ1035( )
   {
      beforeValidateZZ1035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZZ1035( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZZ1035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZZ1035( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateZZ1035( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCOST00 */
                  deferredUpdateZZ1035( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelZZ1035( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionZZ0( ) ;
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
         endLevelZZ1035( ) ;
      }
      closeExtendedTableCursorsZZ1035( ) ;
   }

   public void deferredUpdateZZ1035( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZZ1035( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZZ1035( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZZ1035( ) ;
         afterConfirmZZ1035( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZZ1035( ) ;
            if ( AnyError == 0 )
            {
               scanStartZZ1036( ) ;
               while ( RcdFound1036 != 0 )
               {
                  getByPrimaryKeyZZ1036( ) ;
                  deleteZZ1036( ) ;
                  scanNextZZ1036( ) ;
               }
               scanEndZZ1036( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZZ12 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOST00");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1035 == 0 )
                        {
                           initAllZZ1035( ) ;
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
                        resetCaptionZZ0( ) ;
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
      sMode1035 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelZZ1035( ) ;
      Gx_mode = sMode1035 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZZ1035( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00ZZ13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COST0p", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void processNestedLevelZZ1036( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRowZZ1036( ) ;
         if ( ( nRcdExists_1036 != 0 ) || ( nIsMod_1036 != 0 ) )
         {
            standaloneNotModalZZ1036( ) ;
            getKeyZZ1036( ) ;
            if ( ( nRcdExists_1036 == 0 ) && ( nRcdDeleted_1036 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertZZ1036( ) ;
            }
            else
            {
               if ( RcdFound1036 != 0 )
               {
                  if ( ( nRcdDeleted_1036 != 0 ) && ( nRcdExists_1036 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteZZ1036( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1036 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateZZ1036( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1036 == 0 )
                  {
                     GXCCtl = "SUP_LNF_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSup_Lnf_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1036_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Lnf_Internalname, GXutil.ltrim( localUtil.ntoc( A7342Sup_Lnf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Fasco_Internalname, GXutil.rtrim( A7343Sup_Fasco)) ;
         httpContext.changePostValue( edtSup_Fasde_Internalname, GXutil.rtrim( A7344Sup_Fasde)) ;
         httpContext.changePostValue( edtSup_Maq_Internalname, GXutil.rtrim( A7345Sup_Maq)) ;
         httpContext.changePostValue( edtSup_Cmaq_Internalname, GXutil.ltrim( localUtil.ntoc( A7346Sup_Cmaq, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Tpp_Internalname, GXutil.ltrim( localUtil.ntoc( A7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_TTF_Internalname, GXutil.ltrim( localUtil.ntoc( A7348Sup_TTF, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Vol_Internalname, GXutil.ltrim( localUtil.ntoc( A7349Sup_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Ch2o_Internalname, GXutil.ltrim( localUtil.ntoc( A7350Sup_Ch2o, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Tmp_Internalname, GXutil.ltrim( localUtil.ntoc( A7351Sup_Tmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CVapor_Internalname, GXutil.ltrim( localUtil.ntoc( A7352Sup_CVapor, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Grupo_Internalname, GXutil.ltrim( localUtil.ntoc( A7353Sup_Grupo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_TpU_Internalname, GXutil.ltrim( localUtil.ntoc( A7354Sup_TpU, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Consum_Internalname, GXutil.ltrim( localUtil.ntoc( A7355Sup_Consum, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_SValF_Internalname, GXutil.ltrim( localUtil.ntoc( A7356Sup_SValF, (byte)(15), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Tog_Internalname, GXutil.ltrim( localUtil.ntoc( A7357Sup_Tog, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_UndMM_Internalname, GXutil.ltrim( localUtil.ntoc( A7358Sup_UndMM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CmaqC_Internalname, GXutil.ltrim( localUtil.ntoc( A7359Sup_CmaqC, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Secc_Internalname, GXutil.rtrim( A7605Sup_Secc)) ;
         httpContext.changePostValue( edtSup_Smod_Internalname, GXutil.ltrim( localUtil.ntoc( A7606Sup_Smod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Smoi_Internalname, GXutil.ltrim( localUtil.ntoc( A7607Sup_Smoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Scif_Internalname, GXutil.ltrim( localUtil.ntoc( A7608Sup_Scif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_SProd_Internalname, GXutil.ltrim( localUtil.ntoc( A7609Sup_SProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CMOD_Internalname, GXutil.ltrim( localUtil.ntoc( A7610Sup_CMOD, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_TmpA_Internalname, GXutil.ltrim( localUtil.ntoc( A7614Sup_TmpA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_H20n_Internalname, GXutil.ltrim( localUtil.ntoc( A7615Sup_H20n, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_H20r_Internalname, GXutil.ltrim( localUtil.ntoc( A7616Sup_H20r, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_Reuso_Internalname, GXutil.rtrim( A7617Sup_Reuso)) ;
         httpContext.changePostValue( edtSup_Ch2or_Internalname, GXutil.ltrim( localUtil.ntoc( A7618Sup_Ch2or, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_moiU_Internalname, GXutil.ltrim( localUtil.ntoc( A7626Sup_moiU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_cifU_Internalname, GXutil.ltrim( localUtil.ntoc( A7627Sup_cifU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_CostL_Internalname, GXutil.ltrim( localUtil.ntoc( A7629Sup_CostL, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_camt_Internalname, GXutil.ltrim( localUtil.ntoc( A7661Sup_camt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtSup_usut_Internalname, GXutil.rtrim( A7664Sup_usut)) ;
         httpContext.changePostValue( edtSup_fecht_Internalname, localUtil.ttoc( A7665Sup_fecht, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtSup_SVal_Internalname, GXutil.ltrim( localUtil.ntoc( A7361Sup_SVal, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7342Sup_Lnf_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7342Sup_Lnf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7343Sup_Fasco_"+sGXsfl_35_idx, GXutil.rtrim( Z7343Sup_Fasco)) ;
         httpContext.changePostValue( "ZT_"+"Z7344Sup_Fasde_"+sGXsfl_35_idx, GXutil.rtrim( Z7344Sup_Fasde)) ;
         httpContext.changePostValue( "ZT_"+"Z7345Sup_Maq_"+sGXsfl_35_idx, GXutil.rtrim( Z7345Sup_Maq)) ;
         httpContext.changePostValue( "ZT_"+"Z7346Sup_Cmaq_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7346Sup_Cmaq, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7347Sup_Tpp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7349Sup_Vol_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7349Sup_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7351Sup_Tmp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7351Sup_Tmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7353Sup_Grupo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7353Sup_Grupo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7357Sup_Tog_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7357Sup_Tog, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7358Sup_UndMM_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7358Sup_UndMM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7605Sup_Secc_"+sGXsfl_35_idx, GXutil.rtrim( Z7605Sup_Secc)) ;
         httpContext.changePostValue( "ZT_"+"Z7606Sup_Smod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7606Sup_Smod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7607Sup_Smoi_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7607Sup_Smoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7608Sup_Scif_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7608Sup_Scif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7609Sup_SProd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7609Sup_SProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7614Sup_TmpA_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7614Sup_TmpA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7615Sup_H20n_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7615Sup_H20n, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7616Sup_H20r_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7616Sup_H20r, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7617Sup_Reuso_"+sGXsfl_35_idx, GXutil.rtrim( Z7617Sup_Reuso)) ;
         httpContext.changePostValue( "ZT_"+"Z7661Sup_camt_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7661Sup_camt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7664Sup_usut_"+sGXsfl_35_idx, GXutil.rtrim( Z7664Sup_usut)) ;
         httpContext.changePostValue( "ZT_"+"Z7665Sup_fecht_"+sGXsfl_35_idx, localUtil.ttoc( Z7665Sup_fecht, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z7666Sup_TtRl_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7666Sup_TtRl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7667Sup_hd_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7667Sup_hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7668Sup_hrp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z7668Sup_hrp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7669Sup_hpp_"+sGXsfl_35_idx, GXutil.rtrim( Z7669Sup_hpp)) ;
         httpContext.changePostValue( "ZT_"+"Z8425Sup_TmpC_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z8425Sup_TmpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11932Sup_Nh2o_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11932Sup_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T7347Sup_Tpp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1036_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1036_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1036_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1036 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1036_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1036_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_LNF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Lnf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_FASCO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasco_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_FASDE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasde_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_MAQ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Maq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CMAQ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Cmaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TPP_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TPP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TTF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TTF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_VOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Vol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CH2O_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TMP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CVAPOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CVapor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_GRUPO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Grupo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TPU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TpU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CONSUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Consum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SVALF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SValF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TOG_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_UNDMM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_UndMM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CMAQC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CmaqC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SECC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Secc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SMOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SMOI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smoi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SCIF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Scif_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SPROD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SProd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CMOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CMOD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_TMPA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TmpA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_H20N_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20n_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_H20R_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20r_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_REUSO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Reuso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CH2OR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2or_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_MOIU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_moiU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CIFU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_cifU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_COSTL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CostL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CAMT_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_CAMT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_USUT_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_USUT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_FECHT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_fecht_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUP_SVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllZZ1036( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1036 = (short)(0) ;
      nIsMod_1036 = (short)(0) ;
      nRcdDeleted_1036 = (short)(0) ;
   }

   public void processLevelZZ1035( )
   {
      /* Save parent mode. */
      sMode1035 = Gx_mode ;
      processNestedLevelZZ1036( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1035 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelZZ1035( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteZZ1035( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcostpt");
         if ( AnyError == 0 )
         {
            confirmValuesZZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcostpt");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartZZ1035( )
   {
      /* Scan By routine */
      /* Using cursor T00ZZ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      RcdFound1035 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1035 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZZ1035( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1035 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1035 = (short)(1) ;
      }
   }

   public void scanEndZZ1035( )
   {
      pr_default.close(12);
   }

   public void afterConfirmZZ1035( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertZZ1035( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZZ1035( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZZ1035( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZZ1035( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZZ1035( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZZ1035( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtSup_Num_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Num_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Num_Enabled), 5, 0), true);
   }

   public void zmZZ1036( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7343Sup_Fasco = T00ZZ3_A7343Sup_Fasco[0] ;
            Z7344Sup_Fasde = T00ZZ3_A7344Sup_Fasde[0] ;
            Z7345Sup_Maq = T00ZZ3_A7345Sup_Maq[0] ;
            Z7346Sup_Cmaq = T00ZZ3_A7346Sup_Cmaq[0] ;
            Z7347Sup_Tpp = T00ZZ3_A7347Sup_Tpp[0] ;
            Z7349Sup_Vol = T00ZZ3_A7349Sup_Vol[0] ;
            Z7351Sup_Tmp = T00ZZ3_A7351Sup_Tmp[0] ;
            Z7353Sup_Grupo = T00ZZ3_A7353Sup_Grupo[0] ;
            Z7357Sup_Tog = T00ZZ3_A7357Sup_Tog[0] ;
            Z7358Sup_UndMM = T00ZZ3_A7358Sup_UndMM[0] ;
            Z7605Sup_Secc = T00ZZ3_A7605Sup_Secc[0] ;
            Z7606Sup_Smod = T00ZZ3_A7606Sup_Smod[0] ;
            Z7607Sup_Smoi = T00ZZ3_A7607Sup_Smoi[0] ;
            Z7608Sup_Scif = T00ZZ3_A7608Sup_Scif[0] ;
            Z7609Sup_SProd = T00ZZ3_A7609Sup_SProd[0] ;
            Z7614Sup_TmpA = T00ZZ3_A7614Sup_TmpA[0] ;
            Z7615Sup_H20n = T00ZZ3_A7615Sup_H20n[0] ;
            Z7616Sup_H20r = T00ZZ3_A7616Sup_H20r[0] ;
            Z7617Sup_Reuso = T00ZZ3_A7617Sup_Reuso[0] ;
            Z7661Sup_camt = T00ZZ3_A7661Sup_camt[0] ;
            Z7664Sup_usut = T00ZZ3_A7664Sup_usut[0] ;
            Z7665Sup_fecht = T00ZZ3_A7665Sup_fecht[0] ;
            Z7666Sup_TtRl = T00ZZ3_A7666Sup_TtRl[0] ;
            Z7667Sup_hd = T00ZZ3_A7667Sup_hd[0] ;
            Z7668Sup_hrp = T00ZZ3_A7668Sup_hrp[0] ;
            Z7669Sup_hpp = T00ZZ3_A7669Sup_hpp[0] ;
            Z8425Sup_TmpC = T00ZZ3_A8425Sup_TmpC[0] ;
            Z11932Sup_Nh2o = T00ZZ3_A11932Sup_Nh2o[0] ;
         }
         else
         {
            Z7343Sup_Fasco = A7343Sup_Fasco ;
            Z7344Sup_Fasde = A7344Sup_Fasde ;
            Z7345Sup_Maq = A7345Sup_Maq ;
            Z7346Sup_Cmaq = A7346Sup_Cmaq ;
            Z7347Sup_Tpp = A7347Sup_Tpp ;
            Z7349Sup_Vol = A7349Sup_Vol ;
            Z7351Sup_Tmp = A7351Sup_Tmp ;
            Z7353Sup_Grupo = A7353Sup_Grupo ;
            Z7357Sup_Tog = A7357Sup_Tog ;
            Z7358Sup_UndMM = A7358Sup_UndMM ;
            Z7605Sup_Secc = A7605Sup_Secc ;
            Z7606Sup_Smod = A7606Sup_Smod ;
            Z7607Sup_Smoi = A7607Sup_Smoi ;
            Z7608Sup_Scif = A7608Sup_Scif ;
            Z7609Sup_SProd = A7609Sup_SProd ;
            Z7614Sup_TmpA = A7614Sup_TmpA ;
            Z7615Sup_H20n = A7615Sup_H20n ;
            Z7616Sup_H20r = A7616Sup_H20r ;
            Z7617Sup_Reuso = A7617Sup_Reuso ;
            Z7661Sup_camt = A7661Sup_camt ;
            Z7664Sup_usut = A7664Sup_usut ;
            Z7665Sup_fecht = A7665Sup_fecht ;
            Z7666Sup_TtRl = A7666Sup_TtRl ;
            Z7667Sup_hd = A7667Sup_hd ;
            Z7668Sup_hrp = A7668Sup_hrp ;
            Z7669Sup_hpp = A7669Sup_hpp ;
            Z8425Sup_TmpC = A8425Sup_TmpC ;
            Z11932Sup_Nh2o = A11932Sup_Nh2o ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z396EmprCod = A396EmprCod ;
         Z7275Sup_Num = A7275Sup_Num ;
         Z7342Sup_Lnf = A7342Sup_Lnf ;
         Z7343Sup_Fasco = A7343Sup_Fasco ;
         Z7344Sup_Fasde = A7344Sup_Fasde ;
         Z7345Sup_Maq = A7345Sup_Maq ;
         Z7346Sup_Cmaq = A7346Sup_Cmaq ;
         Z7347Sup_Tpp = A7347Sup_Tpp ;
         Z7349Sup_Vol = A7349Sup_Vol ;
         Z7351Sup_Tmp = A7351Sup_Tmp ;
         Z7353Sup_Grupo = A7353Sup_Grupo ;
         Z7357Sup_Tog = A7357Sup_Tog ;
         Z7358Sup_UndMM = A7358Sup_UndMM ;
         Z7605Sup_Secc = A7605Sup_Secc ;
         Z7606Sup_Smod = A7606Sup_Smod ;
         Z7607Sup_Smoi = A7607Sup_Smoi ;
         Z7608Sup_Scif = A7608Sup_Scif ;
         Z7609Sup_SProd = A7609Sup_SProd ;
         Z7614Sup_TmpA = A7614Sup_TmpA ;
         Z7615Sup_H20n = A7615Sup_H20n ;
         Z7616Sup_H20r = A7616Sup_H20r ;
         Z7617Sup_Reuso = A7617Sup_Reuso ;
         Z7661Sup_camt = A7661Sup_camt ;
         Z7664Sup_usut = A7664Sup_usut ;
         Z7665Sup_fecht = A7665Sup_fecht ;
         Z7666Sup_TtRl = A7666Sup_TtRl ;
         Z7667Sup_hd = A7667Sup_hd ;
         Z7668Sup_hrp = A7668Sup_hrp ;
         Z7669Sup_hpp = A7669Sup_hpp ;
         Z8425Sup_TmpC = A8425Sup_TmpC ;
         Z11932Sup_Nh2o = A11932Sup_Nh2o ;
      }
   }

   public void standaloneNotModalZZ1036( )
   {
      edtSup_Fasco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasco_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Fasde_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasde_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Maq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Cmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Cmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Cmaq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_CMOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_CMOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CMOD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Tmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tmp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_camt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_usut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void standaloneModalZZ1036( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSup_Lnf_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_Lnf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Lnf_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtSup_Lnf_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_Lnf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Lnf_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void loadZZ1036( )
   {
      /* Using cursor T00ZZ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1036 = (short)(1) ;
         A7343Sup_Fasco = T00ZZ15_A7343Sup_Fasco[0] ;
         n7343Sup_Fasco = T00ZZ15_n7343Sup_Fasco[0] ;
         A7344Sup_Fasde = T00ZZ15_A7344Sup_Fasde[0] ;
         n7344Sup_Fasde = T00ZZ15_n7344Sup_Fasde[0] ;
         A7345Sup_Maq = T00ZZ15_A7345Sup_Maq[0] ;
         n7345Sup_Maq = T00ZZ15_n7345Sup_Maq[0] ;
         A7346Sup_Cmaq = T00ZZ15_A7346Sup_Cmaq[0] ;
         n7346Sup_Cmaq = T00ZZ15_n7346Sup_Cmaq[0] ;
         A7347Sup_Tpp = T00ZZ15_A7347Sup_Tpp[0] ;
         n7347Sup_Tpp = T00ZZ15_n7347Sup_Tpp[0] ;
         A7349Sup_Vol = T00ZZ15_A7349Sup_Vol[0] ;
         n7349Sup_Vol = T00ZZ15_n7349Sup_Vol[0] ;
         A7351Sup_Tmp = T00ZZ15_A7351Sup_Tmp[0] ;
         n7351Sup_Tmp = T00ZZ15_n7351Sup_Tmp[0] ;
         A7353Sup_Grupo = T00ZZ15_A7353Sup_Grupo[0] ;
         n7353Sup_Grupo = T00ZZ15_n7353Sup_Grupo[0] ;
         A7357Sup_Tog = T00ZZ15_A7357Sup_Tog[0] ;
         n7357Sup_Tog = T00ZZ15_n7357Sup_Tog[0] ;
         A7358Sup_UndMM = T00ZZ15_A7358Sup_UndMM[0] ;
         n7358Sup_UndMM = T00ZZ15_n7358Sup_UndMM[0] ;
         A7605Sup_Secc = T00ZZ15_A7605Sup_Secc[0] ;
         n7605Sup_Secc = T00ZZ15_n7605Sup_Secc[0] ;
         A7606Sup_Smod = T00ZZ15_A7606Sup_Smod[0] ;
         n7606Sup_Smod = T00ZZ15_n7606Sup_Smod[0] ;
         A7607Sup_Smoi = T00ZZ15_A7607Sup_Smoi[0] ;
         n7607Sup_Smoi = T00ZZ15_n7607Sup_Smoi[0] ;
         A7608Sup_Scif = T00ZZ15_A7608Sup_Scif[0] ;
         n7608Sup_Scif = T00ZZ15_n7608Sup_Scif[0] ;
         A7609Sup_SProd = T00ZZ15_A7609Sup_SProd[0] ;
         n7609Sup_SProd = T00ZZ15_n7609Sup_SProd[0] ;
         A7614Sup_TmpA = T00ZZ15_A7614Sup_TmpA[0] ;
         n7614Sup_TmpA = T00ZZ15_n7614Sup_TmpA[0] ;
         A7615Sup_H20n = T00ZZ15_A7615Sup_H20n[0] ;
         n7615Sup_H20n = T00ZZ15_n7615Sup_H20n[0] ;
         A7616Sup_H20r = T00ZZ15_A7616Sup_H20r[0] ;
         n7616Sup_H20r = T00ZZ15_n7616Sup_H20r[0] ;
         A7617Sup_Reuso = T00ZZ15_A7617Sup_Reuso[0] ;
         n7617Sup_Reuso = T00ZZ15_n7617Sup_Reuso[0] ;
         A7661Sup_camt = T00ZZ15_A7661Sup_camt[0] ;
         n7661Sup_camt = T00ZZ15_n7661Sup_camt[0] ;
         A7664Sup_usut = T00ZZ15_A7664Sup_usut[0] ;
         n7664Sup_usut = T00ZZ15_n7664Sup_usut[0] ;
         A7665Sup_fecht = T00ZZ15_A7665Sup_fecht[0] ;
         n7665Sup_fecht = T00ZZ15_n7665Sup_fecht[0] ;
         A7666Sup_TtRl = T00ZZ15_A7666Sup_TtRl[0] ;
         n7666Sup_TtRl = T00ZZ15_n7666Sup_TtRl[0] ;
         A7667Sup_hd = T00ZZ15_A7667Sup_hd[0] ;
         n7667Sup_hd = T00ZZ15_n7667Sup_hd[0] ;
         A7668Sup_hrp = T00ZZ15_A7668Sup_hrp[0] ;
         n7668Sup_hrp = T00ZZ15_n7668Sup_hrp[0] ;
         A7669Sup_hpp = T00ZZ15_A7669Sup_hpp[0] ;
         n7669Sup_hpp = T00ZZ15_n7669Sup_hpp[0] ;
         A8425Sup_TmpC = T00ZZ15_A8425Sup_TmpC[0] ;
         n8425Sup_TmpC = T00ZZ15_n8425Sup_TmpC[0] ;
         A11932Sup_Nh2o = T00ZZ15_A11932Sup_Nh2o[0] ;
         n11932Sup_Nh2o = T00ZZ15_n11932Sup_Nh2o[0] ;
         zmZZ1036( -28) ;
      }
      pr_default.close(13);
      onLoadActionsZZ1036( ) ;
   }

   public void onLoadActionsZZ1036( )
   {
      if ( A7666Sup_TtRl == 0 )
      {
         GXt_decimal5 = A7356Sup_SValF ;
         GXv_decimal6[0] = GXt_decimal5 ;
         new app.ppsumit(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, GXv_decimal6) ;
         tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
         A7356Sup_SValF = GXt_decimal5 ;
      }
      else
      {
         if ( A7666Sup_TtRl == 1 )
         {
            GXt_decimal5 = A7356Sup_SValF ;
            GXv_decimal6[0] = GXt_decimal5 ;
            new app.ppsumfl(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, A7667Sup_hd, A7668Sup_hrp, A7669Sup_hpp, GXv_decimal6) ;
            tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
            A7356Sup_SValF = GXt_decimal5 ;
         }
         else
         {
            A7356Sup_SValF = DecimalUtil.doubleToDec(0) ;
         }
      }
      getSup_SVal( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf) ;
      A7361Sup_SVal = A7361Sup_SVal ;
      A7348Sup_TTF = A7347Sup_Tpp.multiply(A7346Sup_Cmaq) ;
      if ( A7358Sup_UndMM == 0 )
      {
         A7359Sup_CmaqC = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         if ( A7358Sup_UndMM > 0 )
         {
            A7359Sup_CmaqC = (A7346Sup_Cmaq.divide(DecimalUtil.doubleToDec(A7358Sup_UndMM), 18, java.math.RoundingMode.DOWN)).multiply(A7348Sup_TTF) ;
         }
         else
         {
            A7359Sup_CmaqC = DecimalUtil.doubleToDec(0) ;
         }
      }
      A7627Sup_cifU = (A7608Sup_Scif.multiply(A7347Sup_Tpp)) ;
      A7626Sup_moiU = (A7607Sup_Smoi.multiply(A7347Sup_Tpp)) ;
      A7354Sup_TpU = A7347Sup_Tpp.multiply(A7353Sup_Grupo) ;
      AV40oLDTpp = O7347Sup_Tpp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40oLDTpp", GXutil.ltrimstr( AV40oLDTpp, 7, 2));
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         A7661Sup_camt = (byte)(1) ;
         n7661Sup_camt = false ;
      }
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         A7664Sup_usut = AV8UsurCod ;
         n7664Sup_usut = false ;
      }
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         A7665Sup_fecht = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n7665Sup_fecht = false ;
      }
      if ( A7609Sup_SProd.doubleValue() == 0 )
      {
         A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         if ( A7609Sup_SProd.doubleValue() > 0 )
         {
            A7610Sup_CMOD = A7357Sup_Tog.multiply(A7606Sup_Smod).divide((A7609Sup_SProd.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_Tpp_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_camt_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_usut_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void checkExtendedTableZZ1036( )
   {
      nIsDirty_1036 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalZZ1036( ) ;
      if ( A7666Sup_TtRl == 0 )
      {
         nIsDirty_1036 = (short)(1) ;
         GXt_decimal5 = A7356Sup_SValF ;
         GXv_decimal6[0] = GXt_decimal5 ;
         new app.ppsumit(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, GXv_decimal6) ;
         tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
         A7356Sup_SValF = GXt_decimal5 ;
      }
      else
      {
         if ( A7666Sup_TtRl == 1 )
         {
            nIsDirty_1036 = (short)(1) ;
            GXt_decimal5 = A7356Sup_SValF ;
            GXv_decimal6[0] = GXt_decimal5 ;
            new app.ppsumfl(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, A7667Sup_hd, A7668Sup_hrp, A7669Sup_hpp, GXv_decimal6) ;
            tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
            A7356Sup_SValF = GXt_decimal5 ;
         }
         else
         {
            nIsDirty_1036 = (short)(1) ;
            A7356Sup_SValF = DecimalUtil.doubleToDec(0) ;
         }
      }
      getSup_SVal( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf) ;
      A7361Sup_SVal = A7361Sup_SVal ;
      nIsDirty_1036 = (short)(1) ;
      A7348Sup_TTF = A7347Sup_Tpp.multiply(A7346Sup_Cmaq) ;
      if ( A7358Sup_UndMM == 0 )
      {
         nIsDirty_1036 = (short)(1) ;
         A7359Sup_CmaqC = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         if ( A7358Sup_UndMM > 0 )
         {
            nIsDirty_1036 = (short)(1) ;
            A7359Sup_CmaqC = (A7346Sup_Cmaq.divide(DecimalUtil.doubleToDec(A7358Sup_UndMM), 18, java.math.RoundingMode.DOWN)).multiply(A7348Sup_TTF) ;
         }
         else
         {
            nIsDirty_1036 = (short)(1) ;
            A7359Sup_CmaqC = DecimalUtil.doubleToDec(0) ;
         }
      }
      nIsDirty_1036 = (short)(1) ;
      A7627Sup_cifU = (A7608Sup_Scif.multiply(A7347Sup_Tpp)) ;
      nIsDirty_1036 = (short)(1) ;
      A7626Sup_moiU = (A7607Sup_Smoi.multiply(A7347Sup_Tpp)) ;
      nIsDirty_1036 = (short)(1) ;
      A7354Sup_TpU = A7347Sup_Tpp.multiply(A7353Sup_Grupo) ;
      AV40oLDTpp = O7347Sup_Tpp ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40oLDTpp", GXutil.ltrimstr( AV40oLDTpp, 7, 2));
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         nIsDirty_1036 = (short)(1) ;
         A7661Sup_camt = (byte)(1) ;
         n7661Sup_camt = false ;
      }
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         nIsDirty_1036 = (short)(1) ;
         A7664Sup_usut = AV8UsurCod ;
         n7664Sup_usut = false ;
      }
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         nIsDirty_1036 = (short)(1) ;
         A7665Sup_fecht = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n7665Sup_fecht = false ;
      }
      if ( A7609Sup_SProd.doubleValue() == 0 )
      {
         nIsDirty_1036 = (short)(1) ;
         A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         if ( A7609Sup_SProd.doubleValue() > 0 )
         {
            nIsDirty_1036 = (short)(1) ;
            A7610Sup_CMOD = A7357Sup_Tog.multiply(A7606Sup_Smod).divide((A7609Sup_SProd.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            nIsDirty_1036 = (short)(1) ;
            A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_Tpp_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_camt_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_usut_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void closeExtendedTableCursorsZZ1036( )
   {
   }

   public void enableDisableZZ1036( )
   {
   }

   public void getKeyZZ1036( )
   {
      /* Using cursor T00ZZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1036 = (short)(1) ;
      }
      else
      {
         RcdFound1036 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKeyZZ1036( )
   {
      /* Using cursor T00ZZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00ZZ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00ZZ3_A7275Sup_Num[0] == A7275Sup_Num ) )
      {
         zmZZ1036( 28) ;
         RcdFound1036 = (short)(1) ;
         initializeNonKeyZZ1036( ) ;
         A7342Sup_Lnf = T00ZZ3_A7342Sup_Lnf[0] ;
         A7343Sup_Fasco = T00ZZ3_A7343Sup_Fasco[0] ;
         n7343Sup_Fasco = T00ZZ3_n7343Sup_Fasco[0] ;
         A7344Sup_Fasde = T00ZZ3_A7344Sup_Fasde[0] ;
         n7344Sup_Fasde = T00ZZ3_n7344Sup_Fasde[0] ;
         A7345Sup_Maq = T00ZZ3_A7345Sup_Maq[0] ;
         n7345Sup_Maq = T00ZZ3_n7345Sup_Maq[0] ;
         A7346Sup_Cmaq = T00ZZ3_A7346Sup_Cmaq[0] ;
         n7346Sup_Cmaq = T00ZZ3_n7346Sup_Cmaq[0] ;
         A7347Sup_Tpp = T00ZZ3_A7347Sup_Tpp[0] ;
         n7347Sup_Tpp = T00ZZ3_n7347Sup_Tpp[0] ;
         A7349Sup_Vol = T00ZZ3_A7349Sup_Vol[0] ;
         n7349Sup_Vol = T00ZZ3_n7349Sup_Vol[0] ;
         A7351Sup_Tmp = T00ZZ3_A7351Sup_Tmp[0] ;
         n7351Sup_Tmp = T00ZZ3_n7351Sup_Tmp[0] ;
         A7353Sup_Grupo = T00ZZ3_A7353Sup_Grupo[0] ;
         n7353Sup_Grupo = T00ZZ3_n7353Sup_Grupo[0] ;
         A7357Sup_Tog = T00ZZ3_A7357Sup_Tog[0] ;
         n7357Sup_Tog = T00ZZ3_n7357Sup_Tog[0] ;
         A7358Sup_UndMM = T00ZZ3_A7358Sup_UndMM[0] ;
         n7358Sup_UndMM = T00ZZ3_n7358Sup_UndMM[0] ;
         A7605Sup_Secc = T00ZZ3_A7605Sup_Secc[0] ;
         n7605Sup_Secc = T00ZZ3_n7605Sup_Secc[0] ;
         A7606Sup_Smod = T00ZZ3_A7606Sup_Smod[0] ;
         n7606Sup_Smod = T00ZZ3_n7606Sup_Smod[0] ;
         A7607Sup_Smoi = T00ZZ3_A7607Sup_Smoi[0] ;
         n7607Sup_Smoi = T00ZZ3_n7607Sup_Smoi[0] ;
         A7608Sup_Scif = T00ZZ3_A7608Sup_Scif[0] ;
         n7608Sup_Scif = T00ZZ3_n7608Sup_Scif[0] ;
         A7609Sup_SProd = T00ZZ3_A7609Sup_SProd[0] ;
         n7609Sup_SProd = T00ZZ3_n7609Sup_SProd[0] ;
         A7614Sup_TmpA = T00ZZ3_A7614Sup_TmpA[0] ;
         n7614Sup_TmpA = T00ZZ3_n7614Sup_TmpA[0] ;
         A7615Sup_H20n = T00ZZ3_A7615Sup_H20n[0] ;
         n7615Sup_H20n = T00ZZ3_n7615Sup_H20n[0] ;
         A7616Sup_H20r = T00ZZ3_A7616Sup_H20r[0] ;
         n7616Sup_H20r = T00ZZ3_n7616Sup_H20r[0] ;
         A7617Sup_Reuso = T00ZZ3_A7617Sup_Reuso[0] ;
         n7617Sup_Reuso = T00ZZ3_n7617Sup_Reuso[0] ;
         A7661Sup_camt = T00ZZ3_A7661Sup_camt[0] ;
         n7661Sup_camt = T00ZZ3_n7661Sup_camt[0] ;
         A7664Sup_usut = T00ZZ3_A7664Sup_usut[0] ;
         n7664Sup_usut = T00ZZ3_n7664Sup_usut[0] ;
         A7665Sup_fecht = T00ZZ3_A7665Sup_fecht[0] ;
         n7665Sup_fecht = T00ZZ3_n7665Sup_fecht[0] ;
         A7666Sup_TtRl = T00ZZ3_A7666Sup_TtRl[0] ;
         n7666Sup_TtRl = T00ZZ3_n7666Sup_TtRl[0] ;
         A7667Sup_hd = T00ZZ3_A7667Sup_hd[0] ;
         n7667Sup_hd = T00ZZ3_n7667Sup_hd[0] ;
         A7668Sup_hrp = T00ZZ3_A7668Sup_hrp[0] ;
         n7668Sup_hrp = T00ZZ3_n7668Sup_hrp[0] ;
         A7669Sup_hpp = T00ZZ3_A7669Sup_hpp[0] ;
         n7669Sup_hpp = T00ZZ3_n7669Sup_hpp[0] ;
         A8425Sup_TmpC = T00ZZ3_A8425Sup_TmpC[0] ;
         n8425Sup_TmpC = T00ZZ3_n8425Sup_TmpC[0] ;
         A11932Sup_Nh2o = T00ZZ3_A11932Sup_Nh2o[0] ;
         n11932Sup_Nh2o = T00ZZ3_n11932Sup_Nh2o[0] ;
         O7347Sup_Tpp = A7347Sup_Tpp ;
         n7347Sup_Tpp = false ;
         Z396EmprCod = A396EmprCod ;
         Z7275Sup_Num = A7275Sup_Num ;
         Z7342Sup_Lnf = A7342Sup_Lnf ;
         sMode1036 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalZZ1036( ) ;
         loadZZ1036( ) ;
         Gx_mode = sMode1036 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1036 = (short)(0) ;
         initializeNonKeyZZ1036( ) ;
         sMode1036 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalZZ1036( ) ;
         Gx_mode = sMode1036 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesZZ1036( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyZZ1036( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00ZZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOST01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7343Sup_Fasco, T00ZZ2_A7343Sup_Fasco[0]) != 0 ) || ( GXutil.strcmp(Z7344Sup_Fasde, T00ZZ2_A7344Sup_Fasde[0]) != 0 ) || ( GXutil.strcmp(Z7345Sup_Maq, T00ZZ2_A7345Sup_Maq[0]) != 0 ) || ( DecimalUtil.compareTo(Z7346Sup_Cmaq, T00ZZ2_A7346Sup_Cmaq[0]) != 0 ) || ( DecimalUtil.compareTo(Z7347Sup_Tpp, T00ZZ2_A7347Sup_Tpp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7349Sup_Vol != T00ZZ2_A7349Sup_Vol[0] ) || ( Z7351Sup_Tmp != T00ZZ2_A7351Sup_Tmp[0] ) || ( DecimalUtil.compareTo(Z7353Sup_Grupo, T00ZZ2_A7353Sup_Grupo[0]) != 0 ) || ( DecimalUtil.compareTo(Z7357Sup_Tog, T00ZZ2_A7357Sup_Tog[0]) != 0 ) || ( Z7358Sup_UndMM != T00ZZ2_A7358Sup_UndMM[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7605Sup_Secc, T00ZZ2_A7605Sup_Secc[0]) != 0 ) || ( DecimalUtil.compareTo(Z7606Sup_Smod, T00ZZ2_A7606Sup_Smod[0]) != 0 ) || ( DecimalUtil.compareTo(Z7607Sup_Smoi, T00ZZ2_A7607Sup_Smoi[0]) != 0 ) || ( DecimalUtil.compareTo(Z7608Sup_Scif, T00ZZ2_A7608Sup_Scif[0]) != 0 ) || ( DecimalUtil.compareTo(Z7609Sup_SProd, T00ZZ2_A7609Sup_SProd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7614Sup_TmpA != T00ZZ2_A7614Sup_TmpA[0] ) || ( DecimalUtil.compareTo(Z7615Sup_H20n, T00ZZ2_A7615Sup_H20n[0]) != 0 ) || ( DecimalUtil.compareTo(Z7616Sup_H20r, T00ZZ2_A7616Sup_H20r[0]) != 0 ) || ( GXutil.strcmp(Z7617Sup_Reuso, T00ZZ2_A7617Sup_Reuso[0]) != 0 ) || ( Z7661Sup_camt != T00ZZ2_A7661Sup_camt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7664Sup_usut, T00ZZ2_A7664Sup_usut[0]) != 0 ) || !( GXutil.dateCompare(Z7665Sup_fecht, T00ZZ2_A7665Sup_fecht[0]) ) || ( Z7666Sup_TtRl != T00ZZ2_A7666Sup_TtRl[0] ) || ( Z7667Sup_hd != T00ZZ2_A7667Sup_hd[0] ) || ( Z7668Sup_hrp != T00ZZ2_A7668Sup_hrp[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7669Sup_hpp, T00ZZ2_A7669Sup_hpp[0]) != 0 ) || ( Z8425Sup_TmpC != T00ZZ2_A8425Sup_TmpC[0] ) || ( Z11932Sup_Nh2o != T00ZZ2_A11932Sup_Nh2o[0] ) )
         {
            if ( GXutil.strcmp(Z7343Sup_Fasco, T00ZZ2_A7343Sup_Fasco[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Fasco");
               GXutil.writeLogRaw("Old: ",Z7343Sup_Fasco);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7343Sup_Fasco[0]);
            }
            if ( GXutil.strcmp(Z7344Sup_Fasde, T00ZZ2_A7344Sup_Fasde[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Fasde");
               GXutil.writeLogRaw("Old: ",Z7344Sup_Fasde);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7344Sup_Fasde[0]);
            }
            if ( GXutil.strcmp(Z7345Sup_Maq, T00ZZ2_A7345Sup_Maq[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Maq");
               GXutil.writeLogRaw("Old: ",Z7345Sup_Maq);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7345Sup_Maq[0]);
            }
            if ( DecimalUtil.compareTo(Z7346Sup_Cmaq, T00ZZ2_A7346Sup_Cmaq[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Cmaq");
               GXutil.writeLogRaw("Old: ",Z7346Sup_Cmaq);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7346Sup_Cmaq[0]);
            }
            if ( DecimalUtil.compareTo(Z7347Sup_Tpp, T00ZZ2_A7347Sup_Tpp[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Tpp");
               GXutil.writeLogRaw("Old: ",Z7347Sup_Tpp);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7347Sup_Tpp[0]);
            }
            if ( Z7349Sup_Vol != T00ZZ2_A7349Sup_Vol[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Vol");
               GXutil.writeLogRaw("Old: ",Z7349Sup_Vol);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7349Sup_Vol[0]);
            }
            if ( Z7351Sup_Tmp != T00ZZ2_A7351Sup_Tmp[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Tmp");
               GXutil.writeLogRaw("Old: ",Z7351Sup_Tmp);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7351Sup_Tmp[0]);
            }
            if ( DecimalUtil.compareTo(Z7353Sup_Grupo, T00ZZ2_A7353Sup_Grupo[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Grupo");
               GXutil.writeLogRaw("Old: ",Z7353Sup_Grupo);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7353Sup_Grupo[0]);
            }
            if ( DecimalUtil.compareTo(Z7357Sup_Tog, T00ZZ2_A7357Sup_Tog[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Tog");
               GXutil.writeLogRaw("Old: ",Z7357Sup_Tog);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7357Sup_Tog[0]);
            }
            if ( Z7358Sup_UndMM != T00ZZ2_A7358Sup_UndMM[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_UndMM");
               GXutil.writeLogRaw("Old: ",Z7358Sup_UndMM);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7358Sup_UndMM[0]);
            }
            if ( GXutil.strcmp(Z7605Sup_Secc, T00ZZ2_A7605Sup_Secc[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Secc");
               GXutil.writeLogRaw("Old: ",Z7605Sup_Secc);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7605Sup_Secc[0]);
            }
            if ( DecimalUtil.compareTo(Z7606Sup_Smod, T00ZZ2_A7606Sup_Smod[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Smod");
               GXutil.writeLogRaw("Old: ",Z7606Sup_Smod);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7606Sup_Smod[0]);
            }
            if ( DecimalUtil.compareTo(Z7607Sup_Smoi, T00ZZ2_A7607Sup_Smoi[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Smoi");
               GXutil.writeLogRaw("Old: ",Z7607Sup_Smoi);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7607Sup_Smoi[0]);
            }
            if ( DecimalUtil.compareTo(Z7608Sup_Scif, T00ZZ2_A7608Sup_Scif[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Scif");
               GXutil.writeLogRaw("Old: ",Z7608Sup_Scif);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7608Sup_Scif[0]);
            }
            if ( DecimalUtil.compareTo(Z7609Sup_SProd, T00ZZ2_A7609Sup_SProd[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_SProd");
               GXutil.writeLogRaw("Old: ",Z7609Sup_SProd);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7609Sup_SProd[0]);
            }
            if ( Z7614Sup_TmpA != T00ZZ2_A7614Sup_TmpA[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_TmpA");
               GXutil.writeLogRaw("Old: ",Z7614Sup_TmpA);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7614Sup_TmpA[0]);
            }
            if ( DecimalUtil.compareTo(Z7615Sup_H20n, T00ZZ2_A7615Sup_H20n[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_H20n");
               GXutil.writeLogRaw("Old: ",Z7615Sup_H20n);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7615Sup_H20n[0]);
            }
            if ( DecimalUtil.compareTo(Z7616Sup_H20r, T00ZZ2_A7616Sup_H20r[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_H20r");
               GXutil.writeLogRaw("Old: ",Z7616Sup_H20r);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7616Sup_H20r[0]);
            }
            if ( GXutil.strcmp(Z7617Sup_Reuso, T00ZZ2_A7617Sup_Reuso[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Reuso");
               GXutil.writeLogRaw("Old: ",Z7617Sup_Reuso);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7617Sup_Reuso[0]);
            }
            if ( Z7661Sup_camt != T00ZZ2_A7661Sup_camt[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_camt");
               GXutil.writeLogRaw("Old: ",Z7661Sup_camt);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7661Sup_camt[0]);
            }
            if ( GXutil.strcmp(Z7664Sup_usut, T00ZZ2_A7664Sup_usut[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_usut");
               GXutil.writeLogRaw("Old: ",Z7664Sup_usut);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7664Sup_usut[0]);
            }
            if ( !( GXutil.dateCompare(Z7665Sup_fecht, T00ZZ2_A7665Sup_fecht[0]) ) )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_fecht");
               GXutil.writeLogRaw("Old: ",Z7665Sup_fecht);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7665Sup_fecht[0]);
            }
            if ( Z7666Sup_TtRl != T00ZZ2_A7666Sup_TtRl[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_TtRl");
               GXutil.writeLogRaw("Old: ",Z7666Sup_TtRl);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7666Sup_TtRl[0]);
            }
            if ( Z7667Sup_hd != T00ZZ2_A7667Sup_hd[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_hd");
               GXutil.writeLogRaw("Old: ",Z7667Sup_hd);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7667Sup_hd[0]);
            }
            if ( Z7668Sup_hrp != T00ZZ2_A7668Sup_hrp[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_hrp");
               GXutil.writeLogRaw("Old: ",Z7668Sup_hrp);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7668Sup_hrp[0]);
            }
            if ( GXutil.strcmp(Z7669Sup_hpp, T00ZZ2_A7669Sup_hpp[0]) != 0 )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_hpp");
               GXutil.writeLogRaw("Old: ",Z7669Sup_hpp);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A7669Sup_hpp[0]);
            }
            if ( Z8425Sup_TmpC != T00ZZ2_A8425Sup_TmpC[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_TmpC");
               GXutil.writeLogRaw("Old: ",Z8425Sup_TmpC);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A8425Sup_TmpC[0]);
            }
            if ( Z11932Sup_Nh2o != T00ZZ2_A11932Sup_Nh2o[0] )
            {
               GXutil.writeLogln("tcostpt:[seudo value changed for attri]"+"Sup_Nh2o");
               GXutil.writeLogRaw("Old: ",Z11932Sup_Nh2o);
               GXutil.writeLogRaw("Current: ",T00ZZ2_A11932Sup_Nh2o[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCOST01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertZZ1036( )
   {
      beforeValidateZZ1036( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZZ1036( ) ;
      }
      if ( AnyError == 0 )
      {
         zmZZ1036( 0) ;
         checkOptimisticConcurrencyZZ1036( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmZZ1036( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertZZ1036( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00ZZ17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf), Boolean.valueOf(n7343Sup_Fasco), A7343Sup_Fasco, Boolean.valueOf(n7344Sup_Fasde), A7344Sup_Fasde, Boolean.valueOf(n7345Sup_Maq), A7345Sup_Maq, Boolean.valueOf(n7346Sup_Cmaq), A7346Sup_Cmaq, Boolean.valueOf(n7347Sup_Tpp), A7347Sup_Tpp, Boolean.valueOf(n7349Sup_Vol), Integer.valueOf(A7349Sup_Vol), Boolean.valueOf(n7351Sup_Tmp), Short.valueOf(A7351Sup_Tmp), Boolean.valueOf(n7353Sup_Grupo), A7353Sup_Grupo, Boolean.valueOf(n7357Sup_Tog), A7357Sup_Tog, Boolean.valueOf(n7358Sup_UndMM), Integer.valueOf(A7358Sup_UndMM), Boolean.valueOf(n7605Sup_Secc), A7605Sup_Secc, Boolean.valueOf(n7606Sup_Smod), A7606Sup_Smod, Boolean.valueOf(n7607Sup_Smoi), A7607Sup_Smoi, Boolean.valueOf(n7608Sup_Scif), A7608Sup_Scif, Boolean.valueOf(n7609Sup_SProd), A7609Sup_SProd, Boolean.valueOf(n7614Sup_TmpA), Short.valueOf(A7614Sup_TmpA), Boolean.valueOf(n7615Sup_H20n), A7615Sup_H20n, Boolean.valueOf(n7616Sup_H20r), A7616Sup_H20r, Boolean.valueOf(n7617Sup_Reuso), A7617Sup_Reuso, Boolean.valueOf(n7661Sup_camt), Byte.valueOf(A7661Sup_camt), Boolean.valueOf(n7664Sup_usut), A7664Sup_usut, Boolean.valueOf(n7665Sup_fecht), A7665Sup_fecht, Boolean.valueOf(n7666Sup_TtRl), Byte.valueOf(A7666Sup_TtRl), Boolean.valueOf(n7667Sup_hd), Integer.valueOf(A7667Sup_hd), Boolean.valueOf(n7668Sup_hrp), Byte.valueOf(A7668Sup_hrp), Boolean.valueOf(n7669Sup_hpp), A7669Sup_hpp, Boolean.valueOf(n8425Sup_TmpC), Short.valueOf(A8425Sup_TmpC), Boolean.valueOf(n11932Sup_Nh2o), Short.valueOf(A11932Sup_Nh2o)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOST01");
                  if ( (pr_default.getStatus(15) == 1) )
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
            loadZZ1036( ) ;
         }
         endLevelZZ1036( ) ;
      }
      closeExtendedTableCursorsZZ1036( ) ;
   }

   public void updateZZ1036( )
   {
      beforeValidateZZ1036( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableZZ1036( ) ;
      }
      if ( ( nIsMod_1036 != 0 ) || ( nIsDirty_1036 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyZZ1036( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmZZ1036( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateZZ1036( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00ZZ18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n7343Sup_Fasco), A7343Sup_Fasco, Boolean.valueOf(n7344Sup_Fasde), A7344Sup_Fasde, Boolean.valueOf(n7345Sup_Maq), A7345Sup_Maq, Boolean.valueOf(n7346Sup_Cmaq), A7346Sup_Cmaq, Boolean.valueOf(n7347Sup_Tpp), A7347Sup_Tpp, Boolean.valueOf(n7349Sup_Vol), Integer.valueOf(A7349Sup_Vol), Boolean.valueOf(n7351Sup_Tmp), Short.valueOf(A7351Sup_Tmp), Boolean.valueOf(n7353Sup_Grupo), A7353Sup_Grupo, Boolean.valueOf(n7357Sup_Tog), A7357Sup_Tog, Boolean.valueOf(n7358Sup_UndMM), Integer.valueOf(A7358Sup_UndMM), Boolean.valueOf(n7605Sup_Secc), A7605Sup_Secc, Boolean.valueOf(n7606Sup_Smod), A7606Sup_Smod, Boolean.valueOf(n7607Sup_Smoi), A7607Sup_Smoi, Boolean.valueOf(n7608Sup_Scif), A7608Sup_Scif, Boolean.valueOf(n7609Sup_SProd), A7609Sup_SProd, Boolean.valueOf(n7614Sup_TmpA), Short.valueOf(A7614Sup_TmpA), Boolean.valueOf(n7615Sup_H20n), A7615Sup_H20n, Boolean.valueOf(n7616Sup_H20r), A7616Sup_H20r, Boolean.valueOf(n7617Sup_Reuso), A7617Sup_Reuso, Boolean.valueOf(n7661Sup_camt), Byte.valueOf(A7661Sup_camt), Boolean.valueOf(n7664Sup_usut), A7664Sup_usut, Boolean.valueOf(n7665Sup_fecht), A7665Sup_fecht, Boolean.valueOf(n7666Sup_TtRl), Byte.valueOf(A7666Sup_TtRl), Boolean.valueOf(n7667Sup_hd), Integer.valueOf(A7667Sup_hd), Boolean.valueOf(n7668Sup_hrp), Byte.valueOf(A7668Sup_hrp), Boolean.valueOf(n7669Sup_hpp), A7669Sup_hpp, Boolean.valueOf(n8425Sup_TmpC), Short.valueOf(A8425Sup_TmpC), Boolean.valueOf(n11932Sup_Nh2o), Short.valueOf(A11932Sup_Nh2o), A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOST01");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCOST01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateZZ1036( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyZZ1036( ) ;
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
            endLevelZZ1036( ) ;
         }
      }
      closeExtendedTableCursorsZZ1036( ) ;
   }

   public void deferredUpdateZZ1036( )
   {
   }

   public void deleteZZ1036( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateZZ1036( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyZZ1036( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsZZ1036( ) ;
         afterConfirmZZ1036( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteZZ1036( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00ZZ19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCOST01");
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
      sMode1036 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelZZ1036( ) ;
      Gx_mode = sMode1036 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsZZ1036( )
   {
      standaloneModalZZ1036( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         getSup_SVal( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf) ;
         A7361Sup_SVal = A7361Sup_SVal ;
         AV40oLDTpp = O7347Sup_Tpp ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40oLDTpp", GXutil.ltrimstr( AV40oLDTpp, 7, 2));
         A7354Sup_TpU = A7347Sup_Tpp.multiply(A7353Sup_Grupo) ;
         A7626Sup_moiU = (A7607Sup_Smoi.multiply(A7347Sup_Tpp)) ;
         A7627Sup_cifU = (A7608Sup_Scif.multiply(A7347Sup_Tpp)) ;
         if ( A7609Sup_SProd.doubleValue() == 0 )
         {
            A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( A7609Sup_SProd.doubleValue() > 0 )
            {
               A7610Sup_CMOD = A7357Sup_Tog.multiply(A7606Sup_Smod).divide((A7609Sup_SProd.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               A7610Sup_CMOD = DecimalUtil.doubleToDec(0) ;
            }
         }
         A7348Sup_TTF = A7347Sup_Tpp.multiply(A7346Sup_Cmaq) ;
         if ( A7358Sup_UndMM == 0 )
         {
            A7359Sup_CmaqC = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( A7358Sup_UndMM > 0 )
            {
               A7359Sup_CmaqC = (A7346Sup_Cmaq.divide(DecimalUtil.doubleToDec(A7358Sup_UndMM), 18, java.math.RoundingMode.DOWN)).multiply(A7348Sup_TTF) ;
            }
            else
            {
               A7359Sup_CmaqC = DecimalUtil.doubleToDec(0) ;
            }
         }
         if ( A7661Sup_camt == 1 )
         {
            edtSup_Tpp_Forecolor = GXutil.getColor( 255, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
         }
         if ( A7661Sup_camt == 1 )
         {
            edtSup_camt_Forecolor = GXutil.getColor( 255, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
         }
         if ( A7661Sup_camt == 1 )
         {
            edtSup_usut_Forecolor = GXutil.getColor( 255, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
         }
         if ( A7666Sup_TtRl == 0 )
         {
            GXt_decimal5 = A7356Sup_SValF ;
            GXv_decimal6[0] = GXt_decimal5 ;
            new app.ppsumit(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, GXv_decimal6) ;
            tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
            A7356Sup_SValF = GXt_decimal5 ;
         }
         else
         {
            if ( A7666Sup_TtRl == 1 )
            {
               GXt_decimal5 = A7356Sup_SValF ;
               GXv_decimal6[0] = GXt_decimal5 ;
               new app.ppsumfl(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, A7667Sup_hd, A7668Sup_hrp, A7669Sup_hpp, GXv_decimal6) ;
               tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
               A7356Sup_SValF = GXt_decimal5 ;
            }
            else
            {
               A7356Sup_SValF = DecimalUtil.doubleToDec(0) ;
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00ZZ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COST0p", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevelZZ1036( )
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

   public void scanStartZZ1036( )
   {
      /* Scan By routine */
      /* Using cursor T00ZZ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num)});
      RcdFound1036 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1036 = (short)(1) ;
         A7342Sup_Lnf = T00ZZ21_A7342Sup_Lnf[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextZZ1036( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1036 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1036 = (short)(1) ;
         A7342Sup_Lnf = T00ZZ21_A7342Sup_Lnf[0] ;
      }
   }

   public void scanEndZZ1036( )
   {
      pr_default.close(19);
   }

   public void afterConfirmZZ1036( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertZZ1036( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateZZ1036( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteZZ1036( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteZZ1036( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateZZ1036( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesZZ1036( )
   {
      edtSup_Lnf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Lnf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Lnf_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Fasco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasco_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Fasde_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasde_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Maq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Cmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Cmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Cmaq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Tpp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_TTF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_TTF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_TTF_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Vol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Vol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Vol_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Ch2o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Ch2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Ch2o_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Tmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tmp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_CVapor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_CVapor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CVapor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Grupo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Grupo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Grupo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_TpU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_TpU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_TpU_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Consum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Consum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Consum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_SValF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_SValF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_SValF_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Tog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tog_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_UndMM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_UndMM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_UndMM_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_CmaqC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_CmaqC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CmaqC_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Secc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Secc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Secc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Smod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Smod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Smod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Smoi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Smoi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Smoi_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Scif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Scif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Scif_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_SProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_SProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_SProd_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_CMOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_CMOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CMOD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_TmpA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_TmpA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_TmpA_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_H20n_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_H20n_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_H20n_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_H20r_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_H20r_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_H20r_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Reuso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Reuso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Reuso_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Ch2or_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Ch2or_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Ch2or_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_moiU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_moiU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_moiU_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_cifU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_cifU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_cifU_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_CostL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_CostL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CostL_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_camt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_usut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_fecht_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_fecht_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_fecht_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_SVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_SVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_SVal_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashesZZ1036( )
   {
   }

   public void send_integrity_lvl_hashesZZ1035( )
   {
   }

   public void subsflControlProps_351036( )
   {
      edtavnRcdDeleted_1036_Internalname = "vNRCDDELETED_1036_"+sGXsfl_35_idx ;
      edtSup_Lnf_Internalname = "SUP_LNF_"+sGXsfl_35_idx ;
      edtSup_Fasco_Internalname = "SUP_FASCO_"+sGXsfl_35_idx ;
      edtSup_Fasde_Internalname = "SUP_FASDE_"+sGXsfl_35_idx ;
      edtSup_Maq_Internalname = "SUP_MAQ_"+sGXsfl_35_idx ;
      edtSup_Cmaq_Internalname = "SUP_CMAQ_"+sGXsfl_35_idx ;
      edtSup_Tpp_Internalname = "SUP_TPP_"+sGXsfl_35_idx ;
      edtSup_TTF_Internalname = "SUP_TTF_"+sGXsfl_35_idx ;
      edtSup_Vol_Internalname = "SUP_VOL_"+sGXsfl_35_idx ;
      edtSup_Ch2o_Internalname = "SUP_CH2O_"+sGXsfl_35_idx ;
      edtSup_Tmp_Internalname = "SUP_TMP_"+sGXsfl_35_idx ;
      edtSup_CVapor_Internalname = "SUP_CVAPOR_"+sGXsfl_35_idx ;
      edtSup_Grupo_Internalname = "SUP_GRUPO_"+sGXsfl_35_idx ;
      edtSup_TpU_Internalname = "SUP_TPU_"+sGXsfl_35_idx ;
      edtSup_Consum_Internalname = "SUP_CONSUM_"+sGXsfl_35_idx ;
      edtSup_SValF_Internalname = "SUP_SVALF_"+sGXsfl_35_idx ;
      edtSup_Tog_Internalname = "SUP_TOG_"+sGXsfl_35_idx ;
      edtSup_UndMM_Internalname = "SUP_UNDMM_"+sGXsfl_35_idx ;
      edtSup_CmaqC_Internalname = "SUP_CMAQC_"+sGXsfl_35_idx ;
      edtSup_Secc_Internalname = "SUP_SECC_"+sGXsfl_35_idx ;
      edtSup_Smod_Internalname = "SUP_SMOD_"+sGXsfl_35_idx ;
      edtSup_Smoi_Internalname = "SUP_SMOI_"+sGXsfl_35_idx ;
      edtSup_Scif_Internalname = "SUP_SCIF_"+sGXsfl_35_idx ;
      edtSup_SProd_Internalname = "SUP_SPROD_"+sGXsfl_35_idx ;
      edtSup_CMOD_Internalname = "SUP_CMOD_"+sGXsfl_35_idx ;
      edtSup_TmpA_Internalname = "SUP_TMPA_"+sGXsfl_35_idx ;
      edtSup_H20n_Internalname = "SUP_H20N_"+sGXsfl_35_idx ;
      edtSup_H20r_Internalname = "SUP_H20R_"+sGXsfl_35_idx ;
      edtSup_Reuso_Internalname = "SUP_REUSO_"+sGXsfl_35_idx ;
      edtSup_Ch2or_Internalname = "SUP_CH2OR_"+sGXsfl_35_idx ;
      edtSup_moiU_Internalname = "SUP_MOIU_"+sGXsfl_35_idx ;
      edtSup_cifU_Internalname = "SUP_CIFU_"+sGXsfl_35_idx ;
      edtSup_CostL_Internalname = "SUP_COSTL_"+sGXsfl_35_idx ;
      edtSup_camt_Internalname = "SUP_CAMT_"+sGXsfl_35_idx ;
      edtSup_usut_Internalname = "SUP_USUT_"+sGXsfl_35_idx ;
      edtSup_fecht_Internalname = "SUP_FECHT_"+sGXsfl_35_idx ;
      edtSup_SVal_Internalname = "SUP_SVAL_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351036( )
   {
      edtavnRcdDeleted_1036_Internalname = "vNRCDDELETED_1036_"+sGXsfl_35_fel_idx ;
      edtSup_Lnf_Internalname = "SUP_LNF_"+sGXsfl_35_fel_idx ;
      edtSup_Fasco_Internalname = "SUP_FASCO_"+sGXsfl_35_fel_idx ;
      edtSup_Fasde_Internalname = "SUP_FASDE_"+sGXsfl_35_fel_idx ;
      edtSup_Maq_Internalname = "SUP_MAQ_"+sGXsfl_35_fel_idx ;
      edtSup_Cmaq_Internalname = "SUP_CMAQ_"+sGXsfl_35_fel_idx ;
      edtSup_Tpp_Internalname = "SUP_TPP_"+sGXsfl_35_fel_idx ;
      edtSup_TTF_Internalname = "SUP_TTF_"+sGXsfl_35_fel_idx ;
      edtSup_Vol_Internalname = "SUP_VOL_"+sGXsfl_35_fel_idx ;
      edtSup_Ch2o_Internalname = "SUP_CH2O_"+sGXsfl_35_fel_idx ;
      edtSup_Tmp_Internalname = "SUP_TMP_"+sGXsfl_35_fel_idx ;
      edtSup_CVapor_Internalname = "SUP_CVAPOR_"+sGXsfl_35_fel_idx ;
      edtSup_Grupo_Internalname = "SUP_GRUPO_"+sGXsfl_35_fel_idx ;
      edtSup_TpU_Internalname = "SUP_TPU_"+sGXsfl_35_fel_idx ;
      edtSup_Consum_Internalname = "SUP_CONSUM_"+sGXsfl_35_fel_idx ;
      edtSup_SValF_Internalname = "SUP_SVALF_"+sGXsfl_35_fel_idx ;
      edtSup_Tog_Internalname = "SUP_TOG_"+sGXsfl_35_fel_idx ;
      edtSup_UndMM_Internalname = "SUP_UNDMM_"+sGXsfl_35_fel_idx ;
      edtSup_CmaqC_Internalname = "SUP_CMAQC_"+sGXsfl_35_fel_idx ;
      edtSup_Secc_Internalname = "SUP_SECC_"+sGXsfl_35_fel_idx ;
      edtSup_Smod_Internalname = "SUP_SMOD_"+sGXsfl_35_fel_idx ;
      edtSup_Smoi_Internalname = "SUP_SMOI_"+sGXsfl_35_fel_idx ;
      edtSup_Scif_Internalname = "SUP_SCIF_"+sGXsfl_35_fel_idx ;
      edtSup_SProd_Internalname = "SUP_SPROD_"+sGXsfl_35_fel_idx ;
      edtSup_CMOD_Internalname = "SUP_CMOD_"+sGXsfl_35_fel_idx ;
      edtSup_TmpA_Internalname = "SUP_TMPA_"+sGXsfl_35_fel_idx ;
      edtSup_H20n_Internalname = "SUP_H20N_"+sGXsfl_35_fel_idx ;
      edtSup_H20r_Internalname = "SUP_H20R_"+sGXsfl_35_fel_idx ;
      edtSup_Reuso_Internalname = "SUP_REUSO_"+sGXsfl_35_fel_idx ;
      edtSup_Ch2or_Internalname = "SUP_CH2OR_"+sGXsfl_35_fel_idx ;
      edtSup_moiU_Internalname = "SUP_MOIU_"+sGXsfl_35_fel_idx ;
      edtSup_cifU_Internalname = "SUP_CIFU_"+sGXsfl_35_fel_idx ;
      edtSup_CostL_Internalname = "SUP_COSTL_"+sGXsfl_35_fel_idx ;
      edtSup_camt_Internalname = "SUP_CAMT_"+sGXsfl_35_fel_idx ;
      edtSup_usut_Internalname = "SUP_USUT_"+sGXsfl_35_fel_idx ;
      edtSup_fecht_Internalname = "SUP_FECHT_"+sGXsfl_35_fel_idx ;
      edtSup_SVal_Internalname = "SUP_SVAL_"+sGXsfl_35_fel_idx ;
   }

   public void addRowZZ1036( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351036( ) ;
      sendRowZZ1036( ) ;
   }

   public void sendRowZZ1036( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1036_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1036_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1036), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1036), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1036_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1036_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Lnf_Internalname,GXutil.ltrim( localUtil.ntoc( A7342Sup_Lnf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7342Sup_Lnf), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Lnf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Lnf_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Fasco_Internalname,GXutil.rtrim( A7343Sup_Fasco),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Fasco_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Fasco_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Fasde_Internalname,GXutil.rtrim( A7344Sup_Fasde),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Fasde_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Fasde_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Maq_Internalname,GXutil.rtrim( A7345Sup_Maq),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Maq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Maq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Cmaq_Internalname,GXutil.ltrim( localUtil.ntoc( A7346Sup_Cmaq, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Cmaq_Enabled!=0) ? localUtil.format( A7346Sup_Cmaq, "ZZZZ9.9999") : localUtil.format( A7346Sup_Cmaq, "ZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Cmaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Cmaq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Tpp_Internalname,GXutil.ltrim( localUtil.ntoc( A7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Tpp_Enabled!=0) ? localUtil.format( A7347Sup_Tpp, "ZZZ9.99") : localUtil.format( A7347Sup_Tpp, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Tpp_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtSup_Tpp_Forecolor)+";",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Tpp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_TTF_Internalname,GXutil.ltrim( localUtil.ntoc( A7348Sup_TTF, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_TTF_Enabled!=0) ? localUtil.format( A7348Sup_TTF, "ZZZ9.999") : localUtil.format( A7348Sup_TTF, "ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_TTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_TTF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Vol_Internalname,GXutil.ltrim( localUtil.ntoc( A7349Sup_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Vol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7349Sup_Vol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7349Sup_Vol), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Vol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Vol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Ch2o_Internalname,GXutil.ltrim( localUtil.ntoc( A7350Sup_Ch2o, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Ch2o_Enabled!=0) ? localUtil.format( A7350Sup_Ch2o, "ZZZ9.999") : localUtil.format( A7350Sup_Ch2o, "ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Ch2o_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Ch2o_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Tmp_Internalname,GXutil.ltrim( localUtil.ntoc( A7351Sup_Tmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Tmp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7351Sup_Tmp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7351Sup_Tmp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Tmp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Tmp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_CVapor_Internalname,GXutil.ltrim( localUtil.ntoc( A7352Sup_CVapor, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_CVapor_Enabled!=0) ? localUtil.format( A7352Sup_CVapor, "ZZZ9.999") : localUtil.format( A7352Sup_CVapor, "ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_CVapor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_CVapor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Grupo_Internalname,GXutil.ltrim( localUtil.ntoc( A7353Sup_Grupo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Grupo_Enabled!=0) ? localUtil.format( A7353Sup_Grupo, "ZZZZZ9") : localUtil.format( A7353Sup_Grupo, "ZZZZZ9"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Grupo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Grupo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_TpU_Internalname,GXutil.ltrim( localUtil.ntoc( A7354Sup_TpU, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_TpU_Enabled!=0) ? localUtil.format( A7354Sup_TpU, "ZZZ9.999") : localUtil.format( A7354Sup_TpU, "ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_TpU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_TpU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Consum_Internalname,GXutil.ltrim( localUtil.ntoc( A7355Sup_Consum, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Consum_Enabled!=0) ? localUtil.format( A7355Sup_Consum, "ZZZ9.999") : localUtil.format( A7355Sup_Consum, "ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Consum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Consum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_SValF_Internalname,GXutil.ltrim( localUtil.ntoc( A7356Sup_SValF, (byte)(15), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_SValF_Enabled!=0) ? localUtil.format( A7356Sup_SValF, "ZZZ,ZZZ,ZZ9.999") : localUtil.format( A7356Sup_SValF, "ZZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_SValF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_SValF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Tog_Internalname,GXutil.ltrim( localUtil.ntoc( A7357Sup_Tog, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Tog_Enabled!=0) ? localUtil.format( A7357Sup_Tog, "ZZZ9.99") : localUtil.format( A7357Sup_Tog, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Tog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Tog_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_UndMM_Internalname,GXutil.ltrim( localUtil.ntoc( A7358Sup_UndMM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_UndMM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7358Sup_UndMM), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7358Sup_UndMM), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_UndMM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_UndMM_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_CmaqC_Internalname,GXutil.ltrim( localUtil.ntoc( A7359Sup_CmaqC, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_CmaqC_Enabled!=0) ? localUtil.format( A7359Sup_CmaqC, "ZZZZ9.9999") : localUtil.format( A7359Sup_CmaqC, "ZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_CmaqC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_CmaqC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Secc_Internalname,GXutil.rtrim( A7605Sup_Secc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Secc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Secc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Smod_Internalname,GXutil.ltrim( localUtil.ntoc( A7606Sup_Smod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Smod_Enabled!=0) ? localUtil.format( A7606Sup_Smod, "ZZ9.99") : localUtil.format( A7606Sup_Smod, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Smod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Smod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Smoi_Internalname,GXutil.ltrim( localUtil.ntoc( A7607Sup_Smoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Smoi_Enabled!=0) ? localUtil.format( A7607Sup_Smoi, "ZZ9.99") : localUtil.format( A7607Sup_Smoi, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Smoi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Smoi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Scif_Internalname,GXutil.ltrim( localUtil.ntoc( A7608Sup_Scif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Scif_Enabled!=0) ? localUtil.format( A7608Sup_Scif, "ZZ9.99") : localUtil.format( A7608Sup_Scif, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Scif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Scif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_SProd_Internalname,GXutil.ltrim( localUtil.ntoc( A7609Sup_SProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_SProd_Enabled!=0) ? localUtil.format( A7609Sup_SProd, "ZZ9.99") : localUtil.format( A7609Sup_SProd, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_SProd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_SProd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_CMOD_Internalname,GXutil.ltrim( localUtil.ntoc( A7610Sup_CMOD, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_CMOD_Enabled!=0) ? localUtil.format( A7610Sup_CMOD, "ZZZ,ZZ9.999") : localUtil.format( A7610Sup_CMOD, "ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_CMOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_CMOD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_TmpA_Internalname,GXutil.ltrim( localUtil.ntoc( A7614Sup_TmpA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_TmpA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7614Sup_TmpA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7614Sup_TmpA), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_TmpA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_TmpA_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_H20n_Internalname,GXutil.ltrim( localUtil.ntoc( A7615Sup_H20n, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_H20n_Enabled!=0) ? localUtil.format( A7615Sup_H20n, "ZZZZZZ9.999") : localUtil.format( A7615Sup_H20n, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_H20n_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_H20n_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_H20r_Internalname,GXutil.ltrim( localUtil.ntoc( A7616Sup_H20r, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_H20r_Enabled!=0) ? localUtil.format( A7616Sup_H20r, "ZZZZZZ9.999") : localUtil.format( A7616Sup_H20r, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_H20r_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_H20r_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Reuso_Internalname,GXutil.rtrim( A7617Sup_Reuso),GXutil.rtrim( localUtil.format( A7617Sup_Reuso, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Reuso_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Reuso_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_Ch2or_Internalname,GXutil.ltrim( localUtil.ntoc( A7618Sup_Ch2or, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_Ch2or_Enabled!=0) ? localUtil.format( A7618Sup_Ch2or, "ZZZ9.999") : localUtil.format( A7618Sup_Ch2or, "ZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_Ch2or_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_Ch2or_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_moiU_Internalname,GXutil.ltrim( localUtil.ntoc( A7626Sup_moiU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_moiU_Enabled!=0) ? localUtil.format( A7626Sup_moiU, "ZZZZ9.99") : localUtil.format( A7626Sup_moiU, "ZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_moiU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_moiU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_cifU_Internalname,GXutil.ltrim( localUtil.ntoc( A7627Sup_cifU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_cifU_Enabled!=0) ? localUtil.format( A7627Sup_cifU, "ZZZZ9.99") : localUtil.format( A7627Sup_cifU, "ZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_cifU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_cifU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_CostL_Internalname,GXutil.ltrim( localUtil.ntoc( A7629Sup_CostL, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_CostL_Enabled!=0) ? localUtil.format( A7629Sup_CostL, "ZZZZZZZZZ9.99") : localUtil.format( A7629Sup_CostL, "ZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_CostL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_CostL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_camt_Internalname,GXutil.ltrim( localUtil.ntoc( A7661Sup_camt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_camt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7661Sup_camt), "9") : localUtil.format( DecimalUtil.doubleToDec(A7661Sup_camt), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_camt_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtSup_camt_Forecolor)+";",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_camt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_usut_Internalname,GXutil.rtrim( A7664Sup_usut),GXutil.rtrim( localUtil.format( A7664Sup_usut, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_usut_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtSup_usut_Forecolor)+";",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_usut_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1036_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_fecht_Internalname,localUtil.ttoc( A7665Sup_fecht, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A7665Sup_fecht, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_fecht_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_fecht_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSup_SVal_Internalname,GXutil.ltrim( localUtil.ntoc( A7361Sup_SVal, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtSup_SVal_Enabled!=0) ? localUtil.format( A7361Sup_SVal, "Z,ZZZ,ZZ9.999") : localUtil.format( A7361Sup_SVal, "Z,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSup_SVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtSup_SVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesZZ1036( ) ;
      GXCCtl = "Z7342Sup_Lnf_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7342Sup_Lnf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7343Sup_Fasco_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7343Sup_Fasco));
      GXCCtl = "Z7344Sup_Fasde_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7344Sup_Fasde));
      GXCCtl = "Z7345Sup_Maq_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7345Sup_Maq));
      GXCCtl = "Z7346Sup_Cmaq_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7346Sup_Cmaq, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7347Sup_Tpp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7349Sup_Vol_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7349Sup_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7351Sup_Tmp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7351Sup_Tmp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7353Sup_Grupo_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7353Sup_Grupo, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7357Sup_Tog_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7357Sup_Tog, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7358Sup_UndMM_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7358Sup_UndMM, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7605Sup_Secc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7605Sup_Secc));
      GXCCtl = "Z7606Sup_Smod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7606Sup_Smod, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7607Sup_Smoi_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7607Sup_Smoi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7608Sup_Scif_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7608Sup_Scif, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7609Sup_SProd_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7609Sup_SProd, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7614Sup_TmpA_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7614Sup_TmpA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7615Sup_H20n_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7615Sup_H20n, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7616Sup_H20r_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7616Sup_H20r, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7617Sup_Reuso_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7617Sup_Reuso));
      GXCCtl = "Z7661Sup_camt_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7661Sup_camt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7664Sup_usut_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7664Sup_usut));
      GXCCtl = "Z7665Sup_fecht_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z7665Sup_fecht, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z7666Sup_TtRl_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7666Sup_TtRl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7667Sup_hd_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7667Sup_hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7668Sup_hrp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7668Sup_hrp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7669Sup_hpp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7669Sup_hpp));
      GXCCtl = "Z8425Sup_TmpC_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8425Sup_TmpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11932Sup_Nh2o_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11932Sup_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O7347Sup_Tpp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O7347Sup_Tpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1036_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1036_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1036_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1036, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1036_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1036_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_LNF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Lnf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_FASCO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasco_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_FASDE_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasde_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_MAQ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Maq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CMAQ_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Cmaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TPP_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TPP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TTF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TTF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_VOL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Vol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CH2O_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TMP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CVAPOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CVapor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_GRUPO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Grupo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TPU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TpU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CONSUM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Consum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SVALF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SValF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TOG_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tog_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_UNDMM_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_UndMM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CMAQC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CmaqC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SECC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Secc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SMOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SMOI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smoi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SCIF_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Scif_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SPROD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SProd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CMOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CMOD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TMPA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TmpA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_H20N_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20n_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_H20R_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20r_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_REUSO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Reuso_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CH2OR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2or_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_MOIU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_moiU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CIFU_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_cifU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_COSTL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CostL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CAMT_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CAMT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_USUT_"+sGXsfl_35_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_USUT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_FECHT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_fecht_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_SVAL_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowZZ1036( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351036( ) ;
      edtavnRcdDeleted_1036_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1036_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Lnf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_LNF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Fasco_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_FASCO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Fasde_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_FASDE_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Maq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_MAQ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Cmaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CMAQ_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Tpp_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TPP_"+sGXsfl_35_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Tpp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TPP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_TTF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TTF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Vol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_VOL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Ch2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CH2O_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Tmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TMP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_CVapor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CVAPOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Grupo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_GRUPO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_TpU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TPU_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Consum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CONSUM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_SValF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SVALF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Tog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TOG_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_UndMM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_UNDMM_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_CmaqC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CMAQC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Secc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SECC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Smod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SMOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Smoi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SMOI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Scif_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SCIF_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_SProd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SPROD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_CMOD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CMOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_TmpA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_TMPA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_H20n_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_H20N_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_H20r_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_H20R_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Reuso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_REUSO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_Ch2or_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CH2OR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_moiU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_MOIU_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_cifU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CIFU_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_CostL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_COSTL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_camt_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CAMT_"+sGXsfl_35_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_camt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_CAMT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_usut_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_USUT_"+sGXsfl_35_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_usut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_USUT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_fecht_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_FECHT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtSup_SVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUP_SVAL_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1036_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1036_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1036");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1036_Internalname ;
         wbErr = true ;
         nRcdDeleted_1036 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1036 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1036_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSup_Lnf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSup_Lnf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "SUP_LNF_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Lnf_Internalname ;
         wbErr = true ;
         A7342Sup_Lnf = 0 ;
      }
      else
      {
         A7342Sup_Lnf = (int)(localUtil.ctol( httpContext.cgiGet( edtSup_Lnf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7343Sup_Fasco = httpContext.cgiGet( edtSup_Fasco_Internalname) ;
      n7343Sup_Fasco = false ;
      A7344Sup_Fasde = httpContext.cgiGet( edtSup_Fasde_Internalname) ;
      n7344Sup_Fasde = false ;
      A7345Sup_Maq = httpContext.cgiGet( edtSup_Maq_Internalname) ;
      n7345Sup_Maq = false ;
      A7346Sup_Cmaq = localUtil.ctond( httpContext.cgiGet( edtSup_Cmaq_Internalname)) ;
      n7346Sup_Cmaq = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_Tpp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_Tpp_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_TPP_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Tpp_Internalname ;
         wbErr = true ;
         A7347Sup_Tpp = DecimalUtil.ZERO ;
         n7347Sup_Tpp = false ;
      }
      else
      {
         A7347Sup_Tpp = localUtil.ctond( httpContext.cgiGet( edtSup_Tpp_Internalname)) ;
         n7347Sup_Tpp = false ;
      }
      A7348Sup_TTF = localUtil.ctond( httpContext.cgiGet( edtSup_TTF_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSup_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSup_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "SUP_VOL_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Vol_Internalname ;
         wbErr = true ;
         A7349Sup_Vol = 0 ;
         n7349Sup_Vol = false ;
      }
      else
      {
         A7349Sup_Vol = (int)(localUtil.ctol( httpContext.cgiGet( edtSup_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7349Sup_Vol = false ;
      }
      A7350Sup_Ch2o = localUtil.ctond( httpContext.cgiGet( edtSup_Ch2o_Internalname)) ;
      A7351Sup_Tmp = (short)(localUtil.ctol( httpContext.cgiGet( edtSup_Tmp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7351Sup_Tmp = false ;
      A7352Sup_CVapor = localUtil.ctond( httpContext.cgiGet( edtSup_CVapor_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_Grupo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_Grupo_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_GRUPO_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Grupo_Internalname ;
         wbErr = true ;
         A7353Sup_Grupo = DecimalUtil.ZERO ;
         n7353Sup_Grupo = false ;
      }
      else
      {
         A7353Sup_Grupo = localUtil.ctond( httpContext.cgiGet( edtSup_Grupo_Internalname)) ;
         n7353Sup_Grupo = false ;
      }
      A7354Sup_TpU = localUtil.ctond( httpContext.cgiGet( edtSup_TpU_Internalname)) ;
      A7355Sup_Consum = localUtil.ctond( httpContext.cgiGet( edtSup_Consum_Internalname)) ;
      A7356Sup_SValF = localUtil.ctond( httpContext.cgiGet( edtSup_SValF_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_Tog_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_Tog_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_TOG_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Tog_Internalname ;
         wbErr = true ;
         A7357Sup_Tog = DecimalUtil.ZERO ;
         n7357Sup_Tog = false ;
      }
      else
      {
         A7357Sup_Tog = localUtil.ctond( httpContext.cgiGet( edtSup_Tog_Internalname)) ;
         n7357Sup_Tog = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSup_UndMM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSup_UndMM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "SUP_UNDMM_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_UndMM_Internalname ;
         wbErr = true ;
         A7358Sup_UndMM = 0 ;
         n7358Sup_UndMM = false ;
      }
      else
      {
         A7358Sup_UndMM = (int)(localUtil.ctol( httpContext.cgiGet( edtSup_UndMM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7358Sup_UndMM = false ;
      }
      A7359Sup_CmaqC = localUtil.ctond( httpContext.cgiGet( edtSup_CmaqC_Internalname)) ;
      A7605Sup_Secc = httpContext.cgiGet( edtSup_Secc_Internalname) ;
      n7605Sup_Secc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_Smod_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_Smod_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_SMOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Smod_Internalname ;
         wbErr = true ;
         A7606Sup_Smod = DecimalUtil.ZERO ;
         n7606Sup_Smod = false ;
      }
      else
      {
         A7606Sup_Smod = localUtil.ctond( httpContext.cgiGet( edtSup_Smod_Internalname)) ;
         n7606Sup_Smod = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_Smoi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_Smoi_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_SMOI_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Smoi_Internalname ;
         wbErr = true ;
         A7607Sup_Smoi = DecimalUtil.ZERO ;
         n7607Sup_Smoi = false ;
      }
      else
      {
         A7607Sup_Smoi = localUtil.ctond( httpContext.cgiGet( edtSup_Smoi_Internalname)) ;
         n7607Sup_Smoi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_Scif_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_Scif_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_SCIF_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_Scif_Internalname ;
         wbErr = true ;
         A7608Sup_Scif = DecimalUtil.ZERO ;
         n7608Sup_Scif = false ;
      }
      else
      {
         A7608Sup_Scif = localUtil.ctond( httpContext.cgiGet( edtSup_Scif_Internalname)) ;
         n7608Sup_Scif = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_SProd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_SProd_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "SUP_SPROD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_SProd_Internalname ;
         wbErr = true ;
         A7609Sup_SProd = DecimalUtil.ZERO ;
         n7609Sup_SProd = false ;
      }
      else
      {
         A7609Sup_SProd = localUtil.ctond( httpContext.cgiGet( edtSup_SProd_Internalname)) ;
         n7609Sup_SProd = false ;
      }
      A7610Sup_CMOD = localUtil.ctond( httpContext.cgiGet( edtSup_CMOD_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSup_TmpA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSup_TmpA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "SUP_TMPA_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_TmpA_Internalname ;
         wbErr = true ;
         A7614Sup_TmpA = (short)(0) ;
         n7614Sup_TmpA = false ;
      }
      else
      {
         A7614Sup_TmpA = (short)(localUtil.ctol( httpContext.cgiGet( edtSup_TmpA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7614Sup_TmpA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_H20n_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_H20n_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "SUP_H20N_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_H20n_Internalname ;
         wbErr = true ;
         A7615Sup_H20n = DecimalUtil.ZERO ;
         n7615Sup_H20n = false ;
      }
      else
      {
         A7615Sup_H20n = localUtil.ctond( httpContext.cgiGet( edtSup_H20n_Internalname)) ;
         n7615Sup_H20n = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtSup_H20r_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtSup_H20r_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "SUP_H20R_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_H20r_Internalname ;
         wbErr = true ;
         A7616Sup_H20r = DecimalUtil.ZERO ;
         n7616Sup_H20r = false ;
      }
      else
      {
         A7616Sup_H20r = localUtil.ctond( httpContext.cgiGet( edtSup_H20r_Internalname)) ;
         n7616Sup_H20r = false ;
      }
      A7617Sup_Reuso = GXutil.upper( httpContext.cgiGet( edtSup_Reuso_Internalname)) ;
      n7617Sup_Reuso = false ;
      A7618Sup_Ch2or = localUtil.ctond( httpContext.cgiGet( edtSup_Ch2or_Internalname)) ;
      A7626Sup_moiU = localUtil.ctond( httpContext.cgiGet( edtSup_moiU_Internalname)) ;
      A7627Sup_cifU = localUtil.ctond( httpContext.cgiGet( edtSup_cifU_Internalname)) ;
      A7629Sup_CostL = localUtil.ctond( httpContext.cgiGet( edtSup_CostL_Internalname)) ;
      A7661Sup_camt = (byte)(localUtil.ctol( httpContext.cgiGet( edtSup_camt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7661Sup_camt = false ;
      A7664Sup_usut = GXutil.upper( httpContext.cgiGet( edtSup_usut_Internalname)) ;
      n7664Sup_usut = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtSup_fecht_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "SUP_FECHT_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSup_fecht_Internalname ;
         wbErr = true ;
         A7665Sup_fecht = GXutil.resetTime( GXutil.nullDate() );
         n7665Sup_fecht = false ;
      }
      else
      {
         A7665Sup_fecht = localUtil.ctot( httpContext.cgiGet( edtSup_fecht_Internalname)) ;
         n7665Sup_fecht = false ;
      }
      A7361Sup_SVal = localUtil.ctond( httpContext.cgiGet( edtSup_SVal_Internalname)) ;
      GXCCtl = "Z7342Sup_Lnf_" + sGXsfl_35_idx ;
      Z7342Sup_Lnf = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7343Sup_Fasco_" + sGXsfl_35_idx ;
      Z7343Sup_Fasco = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7344Sup_Fasde_" + sGXsfl_35_idx ;
      Z7344Sup_Fasde = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7345Sup_Maq_" + sGXsfl_35_idx ;
      Z7345Sup_Maq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7346Sup_Cmaq_" + sGXsfl_35_idx ;
      Z7346Sup_Cmaq = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7347Sup_Tpp_" + sGXsfl_35_idx ;
      Z7347Sup_Tpp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7349Sup_Vol_" + sGXsfl_35_idx ;
      Z7349Sup_Vol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7351Sup_Tmp_" + sGXsfl_35_idx ;
      Z7351Sup_Tmp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7353Sup_Grupo_" + sGXsfl_35_idx ;
      Z7353Sup_Grupo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7357Sup_Tog_" + sGXsfl_35_idx ;
      Z7357Sup_Tog = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7358Sup_UndMM_" + sGXsfl_35_idx ;
      Z7358Sup_UndMM = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7605Sup_Secc_" + sGXsfl_35_idx ;
      Z7605Sup_Secc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7606Sup_Smod_" + sGXsfl_35_idx ;
      Z7606Sup_Smod = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7607Sup_Smoi_" + sGXsfl_35_idx ;
      Z7607Sup_Smoi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7608Sup_Scif_" + sGXsfl_35_idx ;
      Z7608Sup_Scif = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7609Sup_SProd_" + sGXsfl_35_idx ;
      Z7609Sup_SProd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7614Sup_TmpA_" + sGXsfl_35_idx ;
      Z7614Sup_TmpA = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7615Sup_H20n_" + sGXsfl_35_idx ;
      Z7615Sup_H20n = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7616Sup_H20r_" + sGXsfl_35_idx ;
      Z7616Sup_H20r = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7617Sup_Reuso_" + sGXsfl_35_idx ;
      Z7617Sup_Reuso = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7661Sup_camt_" + sGXsfl_35_idx ;
      Z7661Sup_camt = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7664Sup_usut_" + sGXsfl_35_idx ;
      Z7664Sup_usut = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7665Sup_fecht_" + sGXsfl_35_idx ;
      Z7665Sup_fecht = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z7666Sup_TtRl_" + sGXsfl_35_idx ;
      Z7666Sup_TtRl = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7667Sup_hd_" + sGXsfl_35_idx ;
      Z7667Sup_hd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7668Sup_hrp_" + sGXsfl_35_idx ;
      Z7668Sup_hrp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7669Sup_hpp_" + sGXsfl_35_idx ;
      Z7669Sup_hpp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8425Sup_TmpC_" + sGXsfl_35_idx ;
      Z8425Sup_TmpC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11932Sup_Nh2o_" + sGXsfl_35_idx ;
      Z11932Sup_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7666Sup_TtRl_" + sGXsfl_35_idx ;
      A7666Sup_TtRl = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7666Sup_TtRl = false ;
      GXCCtl = "Z7667Sup_hd_" + sGXsfl_35_idx ;
      A7667Sup_hd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7667Sup_hd = false ;
      GXCCtl = "Z7668Sup_hrp_" + sGXsfl_35_idx ;
      A7668Sup_hrp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n7668Sup_hrp = false ;
      GXCCtl = "Z7669Sup_hpp_" + sGXsfl_35_idx ;
      A7669Sup_hpp = httpContext.cgiGet( GXCCtl) ;
      n7669Sup_hpp = false ;
      GXCCtl = "Z8425Sup_TmpC_" + sGXsfl_35_idx ;
      A8425Sup_TmpC = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n8425Sup_TmpC = false ;
      GXCCtl = "Z11932Sup_Nh2o_" + sGXsfl_35_idx ;
      A11932Sup_Nh2o = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n11932Sup_Nh2o = false ;
      GXCCtl = "O7347Sup_Tpp_" + sGXsfl_35_idx ;
      O7347Sup_Tpp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1036_" + sGXsfl_35_idx ;
      nRcdDeleted_1036 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1036_" + sGXsfl_35_idx ;
      nRcdExists_1036 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1036_" + sGXsfl_35_idx ;
      nIsMod_1036 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSup_usut_Enabled = edtSup_usut_Enabled ;
      defedtSup_usut_Forecolor = edtSup_usut_Forecolor ;
      defedtSup_camt_Enabled = edtSup_camt_Enabled ;
      defedtSup_camt_Forecolor = edtSup_camt_Forecolor ;
      defedtSup_CMOD_Enabled = edtSup_CMOD_Enabled ;
      defedtSup_Tmp_Enabled = edtSup_Tmp_Enabled ;
      defedtSup_Tpp_Forecolor = edtSup_Tpp_Forecolor ;
      defedtSup_Cmaq_Enabled = edtSup_Cmaq_Enabled ;
      defedtSup_Maq_Enabled = edtSup_Maq_Enabled ;
      defedtSup_Fasde_Enabled = edtSup_Fasde_Enabled ;
      defedtSup_Fasco_Enabled = edtSup_Fasco_Enabled ;
      defedtSup_Lnf_Enabled = edtSup_Lnf_Enabled ;
   }

   public void confirmValuesZZ0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351036( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351036( ) ;
         httpContext.changePostValue( "Z7342Sup_Lnf_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7342Sup_Lnf_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7342Sup_Lnf_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7343Sup_Fasco_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7343Sup_Fasco_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7343Sup_Fasco_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7344Sup_Fasde_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7344Sup_Fasde_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7344Sup_Fasde_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7345Sup_Maq_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7345Sup_Maq_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7345Sup_Maq_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7346Sup_Cmaq_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7346Sup_Cmaq_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7346Sup_Cmaq_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7347Sup_Tpp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7347Sup_Tpp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7347Sup_Tpp_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7349Sup_Vol_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7349Sup_Vol_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7349Sup_Vol_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7351Sup_Tmp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7351Sup_Tmp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7351Sup_Tmp_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7353Sup_Grupo_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7353Sup_Grupo_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7353Sup_Grupo_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7357Sup_Tog_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7357Sup_Tog_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7357Sup_Tog_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7358Sup_UndMM_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7358Sup_UndMM_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7358Sup_UndMM_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7605Sup_Secc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7605Sup_Secc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7605Sup_Secc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7606Sup_Smod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7606Sup_Smod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7606Sup_Smod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7607Sup_Smoi_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7607Sup_Smoi_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7607Sup_Smoi_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7608Sup_Scif_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7608Sup_Scif_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7608Sup_Scif_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7609Sup_SProd_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7609Sup_SProd_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7609Sup_SProd_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7614Sup_TmpA_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7614Sup_TmpA_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7614Sup_TmpA_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7615Sup_H20n_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7615Sup_H20n_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7615Sup_H20n_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7616Sup_H20r_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7616Sup_H20r_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7616Sup_H20r_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7617Sup_Reuso_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7617Sup_Reuso_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7617Sup_Reuso_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7661Sup_camt_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7661Sup_camt_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7661Sup_camt_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7664Sup_usut_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7664Sup_usut_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7664Sup_usut_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7665Sup_fecht_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7665Sup_fecht_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7665Sup_fecht_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7666Sup_TtRl_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7666Sup_TtRl_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7666Sup_TtRl_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7667Sup_hd_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7667Sup_hd_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7667Sup_hd_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7668Sup_hrp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7668Sup_hrp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7668Sup_hrp_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z7669Sup_hpp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z7669Sup_hpp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7669Sup_hpp_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z8425Sup_TmpC_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z8425Sup_TmpC_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8425Sup_TmpC_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z11932Sup_Nh2o_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11932Sup_Nh2o_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11932Sup_Nh2o_"+sGXsfl_35_idx) ;
      }
      httpContext.changePostValue( "O7347Sup_Tpp", httpContext.cgiGet( "T7347Sup_Tpp")) ;
      httpContext.deletePostValue( "T7347Sup_Tpp") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcostpt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7275Sup_Num,8,0))}, new String[] {"EmprCod","Sup_Num"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7275Sup_Num", GXutil.ltrim( localUtil.ntoc( Z7275Sup_Num, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TTRL", GXutil.ltrim( localUtil.ntoc( A7666Sup_TtRl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_HD", GXutil.ltrim( localUtil.ntoc( A7667Sup_hd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_HRP", GXutil.ltrim( localUtil.ntoc( A7668Sup_hrp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_HPP", GXutil.rtrim( A7669Sup_hpp));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_UND", GXutil.ltrim( localUtil.ntoc( A7281Sup_Und, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CONVAP", GXutil.ltrim( localUtil.ntoc( A7286Sup_ConVap, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CACPP", GXutil.ltrim( localUtil.ntoc( A7299Sup_cacpp, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_CONMQ", GXutil.ltrim( localUtil.ntoc( A8426Sup_conmq, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_MATIPU", GXutil.ltrim( localUtil.ntoc( A7612Sup_matipu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_TMPC", GXutil.ltrim( localUtil.ntoc( A8425Sup_TmpC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_NH2O", GXutil.ltrim( localUtil.ntoc( A11932Sup_Nh2o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUP_PMINOP", GXutil.ltrim( localUtil.ntoc( A7283Sup_PminOp, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDTPP", GXutil.ltrim( localUtil.ntoc( AV40oLDTpp, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
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
      return formatLink("app.tcostpt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7275Sup_Num,8,0))}, new String[] {"EmprCod","Sup_Num"})  ;
   }

   public String getPgmname( )
   {
      return "TCOSTPt" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "COSTO REAL", "") ;
   }

   public void initializeNonKeyZZ1035( )
   {
   }

   public void initAllZZ1035( )
   {
      initializeNonKeyZZ1035( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyZZ1036( )
   {
      AV40oLDTpp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40oLDTpp", GXutil.ltrimstr( AV40oLDTpp, 7, 2));
      A7610Sup_CMOD = DecimalUtil.ZERO ;
      A7355Sup_Consum = DecimalUtil.ZERO ;
      A7350Sup_Ch2o = DecimalUtil.ZERO ;
      A7352Sup_CVapor = DecimalUtil.ZERO ;
      A7618Sup_Ch2or = DecimalUtil.ZERO ;
      A7629Sup_CostL = DecimalUtil.ZERO ;
      A7354Sup_TpU = DecimalUtil.ZERO ;
      A7626Sup_moiU = DecimalUtil.ZERO ;
      A7627Sup_cifU = DecimalUtil.ZERO ;
      A7348Sup_TTF = DecimalUtil.ZERO ;
      A7359Sup_CmaqC = DecimalUtil.ZERO ;
      A7356Sup_SValF = DecimalUtil.ZERO ;
      A7343Sup_Fasco = "" ;
      n7343Sup_Fasco = false ;
      A7344Sup_Fasde = "" ;
      n7344Sup_Fasde = false ;
      A7345Sup_Maq = "" ;
      n7345Sup_Maq = false ;
      A7346Sup_Cmaq = DecimalUtil.ZERO ;
      n7346Sup_Cmaq = false ;
      A7347Sup_Tpp = DecimalUtil.ZERO ;
      n7347Sup_Tpp = false ;
      A7349Sup_Vol = 0 ;
      n7349Sup_Vol = false ;
      A7351Sup_Tmp = (short)(0) ;
      n7351Sup_Tmp = false ;
      A7353Sup_Grupo = DecimalUtil.ZERO ;
      n7353Sup_Grupo = false ;
      A7357Sup_Tog = DecimalUtil.ZERO ;
      n7357Sup_Tog = false ;
      A7358Sup_UndMM = 0 ;
      n7358Sup_UndMM = false ;
      A7605Sup_Secc = "" ;
      n7605Sup_Secc = false ;
      A7606Sup_Smod = DecimalUtil.ZERO ;
      n7606Sup_Smod = false ;
      A7607Sup_Smoi = DecimalUtil.ZERO ;
      n7607Sup_Smoi = false ;
      A7608Sup_Scif = DecimalUtil.ZERO ;
      n7608Sup_Scif = false ;
      A7609Sup_SProd = DecimalUtil.ZERO ;
      n7609Sup_SProd = false ;
      A7614Sup_TmpA = (short)(0) ;
      n7614Sup_TmpA = false ;
      A7615Sup_H20n = DecimalUtil.ZERO ;
      n7615Sup_H20n = false ;
      A7616Sup_H20r = DecimalUtil.ZERO ;
      n7616Sup_H20r = false ;
      A7617Sup_Reuso = "" ;
      n7617Sup_Reuso = false ;
      A7661Sup_camt = (byte)(0) ;
      n7661Sup_camt = false ;
      A7664Sup_usut = "" ;
      n7664Sup_usut = false ;
      A7665Sup_fecht = GXutil.resetTime( GXutil.nullDate() );
      n7665Sup_fecht = false ;
      A7361Sup_SVal = DecimalUtil.ZERO ;
      A7666Sup_TtRl = (byte)(0) ;
      n7666Sup_TtRl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7666Sup_TtRl", GXutil.str( A7666Sup_TtRl, 1, 0));
      A7667Sup_hd = 0 ;
      n7667Sup_hd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7667Sup_hd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7667Sup_hd), 8, 0));
      A7668Sup_hrp = (byte)(0) ;
      n7668Sup_hrp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7668Sup_hrp", GXutil.str( A7668Sup_hrp, 1, 0));
      A7669Sup_hpp = "" ;
      n7669Sup_hpp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7669Sup_hpp", A7669Sup_hpp);
      A7281Sup_Und = 0 ;
      n7281Sup_Und = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7281Sup_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7281Sup_Und), 6, 0));
      A7286Sup_ConVap = DecimalUtil.ZERO ;
      n7286Sup_ConVap = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7286Sup_ConVap", GXutil.ltrimstr( A7286Sup_ConVap, 8, 3));
      A7299Sup_cacpp = DecimalUtil.ZERO ;
      n7299Sup_cacpp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7299Sup_cacpp", GXutil.ltrimstr( A7299Sup_cacpp, 6, 2));
      A8426Sup_conmq = DecimalUtil.ZERO ;
      n8426Sup_conmq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8426Sup_conmq", GXutil.ltrimstr( A8426Sup_conmq, 6, 2));
      A7612Sup_matipu = DecimalUtil.ZERO ;
      n7612Sup_matipu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7612Sup_matipu", GXutil.ltrimstr( A7612Sup_matipu, 6, 2));
      A8425Sup_TmpC = (short)(0) ;
      n8425Sup_TmpC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8425Sup_TmpC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8425Sup_TmpC), 4, 0));
      A11932Sup_Nh2o = (short)(0) ;
      n11932Sup_Nh2o = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11932Sup_Nh2o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11932Sup_Nh2o), 4, 0));
      A7283Sup_PminOp = DecimalUtil.ZERO ;
      n7283Sup_PminOp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7283Sup_PminOp", GXutil.ltrimstr( A7283Sup_PminOp, 12, 3));
      O7347Sup_Tpp = A7347Sup_Tpp ;
      n7347Sup_Tpp = false ;
      Z7343Sup_Fasco = "" ;
      Z7344Sup_Fasde = "" ;
      Z7345Sup_Maq = "" ;
      Z7346Sup_Cmaq = DecimalUtil.ZERO ;
      Z7347Sup_Tpp = DecimalUtil.ZERO ;
      Z7349Sup_Vol = 0 ;
      Z7351Sup_Tmp = (short)(0) ;
      Z7353Sup_Grupo = DecimalUtil.ZERO ;
      Z7357Sup_Tog = DecimalUtil.ZERO ;
      Z7358Sup_UndMM = 0 ;
      Z7605Sup_Secc = "" ;
      Z7606Sup_Smod = DecimalUtil.ZERO ;
      Z7607Sup_Smoi = DecimalUtil.ZERO ;
      Z7608Sup_Scif = DecimalUtil.ZERO ;
      Z7609Sup_SProd = DecimalUtil.ZERO ;
      Z7614Sup_TmpA = (short)(0) ;
      Z7615Sup_H20n = DecimalUtil.ZERO ;
      Z7616Sup_H20r = DecimalUtil.ZERO ;
      Z7617Sup_Reuso = "" ;
      Z7661Sup_camt = (byte)(0) ;
      Z7664Sup_usut = "" ;
      Z7665Sup_fecht = GXutil.resetTime( GXutil.nullDate() );
      Z7666Sup_TtRl = (byte)(0) ;
      Z7667Sup_hd = 0 ;
      Z7668Sup_hrp = (byte)(0) ;
      Z7669Sup_hpp = "" ;
      Z8425Sup_TmpC = (short)(0) ;
      Z11932Sup_Nh2o = (short)(0) ;
   }

   public void initAllZZ1036( )
   {
      A7342Sup_Lnf = 0 ;
      initializeNonKeyZZ1036( ) ;
   }

   public void standaloneModalInsertZZ1036( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241532835", true, true);
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
      httpContext.AddJavascriptSource("tcostpt.js", "?20268241532835", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1036( )
   {
      edtSup_usut_Enabled = defedtSup_usut_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_usut_Forecolor = defedtSup_usut_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      edtSup_camt_Enabled = defedtSup_camt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_camt_Forecolor = defedtSup_camt_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      edtSup_CMOD_Enabled = defedtSup_CMOD_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_CMOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_CMOD_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Tmp_Enabled = defedtSup_Tmp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tmp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Tpp_Forecolor = defedtSup_Tpp_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      edtSup_Cmaq_Enabled = defedtSup_Cmaq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Cmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Cmaq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Maq_Enabled = defedtSup_Maq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Maq_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Fasde_Enabled = defedtSup_Fasde_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasde_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasde_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Fasco_Enabled = defedtSup_Fasco_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Fasco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Fasco_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtSup_Lnf_Enabled = defedtSup_Lnf_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Lnf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Lnf_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1036, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1036_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7342Sup_Lnf, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Lnf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7343Sup_Fasco));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasco_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7344Sup_Fasde));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Fasde_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7345Sup_Maq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Maq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7346Sup_Cmaq, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Cmaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7347Sup_Tpp, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tpp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7348Sup_TTF, (byte)(8), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TTF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7349Sup_Vol, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Vol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7350Sup_Ch2o, (byte)(8), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7351Sup_Tmp, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7352Sup_CVapor, (byte)(8), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CVapor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7353Sup_Grupo, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Grupo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7354Sup_TpU, (byte)(8), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TpU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7355Sup_Consum, (byte)(8), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Consum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7356Sup_SValF, (byte)(15), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SValF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7357Sup_Tog, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Tog_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7358Sup_UndMM, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_UndMM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7359Sup_CmaqC, (byte)(10), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CmaqC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7605Sup_Secc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Secc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7606Sup_Smod, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7607Sup_Smoi, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Smoi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7608Sup_Scif, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Scif_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7609Sup_SProd, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SProd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7610Sup_CMOD, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CMOD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7614Sup_TmpA, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_TmpA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7615Sup_H20n, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20n_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7616Sup_H20r, (byte)(11), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_H20r_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7617Sup_Reuso));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Reuso_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7618Sup_Ch2or, (byte)(8), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_Ch2or_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7626Sup_moiU, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_moiU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7627Sup_cifU, (byte)(8), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_cifU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7629Sup_CostL, (byte)(13), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_CostL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7661Sup_camt, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_camt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7664Sup_usut));
      Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_usut_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A7665Sup_fecht, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_fecht_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7361Sup_SVal, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSup_SVal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtSup_Num_Internalname = "SUP_NUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1036_Internalname = "vNRCDDELETED_1036" ;
      edtSup_Lnf_Internalname = "SUP_LNF" ;
      edtSup_Fasco_Internalname = "SUP_FASCO" ;
      edtSup_Fasde_Internalname = "SUP_FASDE" ;
      edtSup_Maq_Internalname = "SUP_MAQ" ;
      edtSup_Cmaq_Internalname = "SUP_CMAQ" ;
      edtSup_Tpp_Internalname = "SUP_TPP" ;
      edtSup_TTF_Internalname = "SUP_TTF" ;
      edtSup_Vol_Internalname = "SUP_VOL" ;
      edtSup_Ch2o_Internalname = "SUP_CH2O" ;
      edtSup_Tmp_Internalname = "SUP_TMP" ;
      edtSup_CVapor_Internalname = "SUP_CVAPOR" ;
      edtSup_Grupo_Internalname = "SUP_GRUPO" ;
      edtSup_TpU_Internalname = "SUP_TPU" ;
      edtSup_Consum_Internalname = "SUP_CONSUM" ;
      edtSup_SValF_Internalname = "SUP_SVALF" ;
      edtSup_Tog_Internalname = "SUP_TOG" ;
      edtSup_UndMM_Internalname = "SUP_UNDMM" ;
      edtSup_CmaqC_Internalname = "SUP_CMAQC" ;
      edtSup_Secc_Internalname = "SUP_SECC" ;
      edtSup_Smod_Internalname = "SUP_SMOD" ;
      edtSup_Smoi_Internalname = "SUP_SMOI" ;
      edtSup_Scif_Internalname = "SUP_SCIF" ;
      edtSup_SProd_Internalname = "SUP_SPROD" ;
      edtSup_CMOD_Internalname = "SUP_CMOD" ;
      edtSup_TmpA_Internalname = "SUP_TMPA" ;
      edtSup_H20n_Internalname = "SUP_H20N" ;
      edtSup_H20r_Internalname = "SUP_H20R" ;
      edtSup_Reuso_Internalname = "SUP_REUSO" ;
      edtSup_Ch2or_Internalname = "SUP_CH2OR" ;
      edtSup_moiU_Internalname = "SUP_MOIU" ;
      edtSup_cifU_Internalname = "SUP_CIFU" ;
      edtSup_CostL_Internalname = "SUP_COSTL" ;
      edtSup_camt_Internalname = "SUP_CAMT" ;
      edtSup_usut_Internalname = "SUP_USUT" ;
      edtSup_fecht_Internalname = "SUP_FECHT" ;
      edtSup_SVal_Internalname = "SUP_SVAL" ;
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
      Form.setCaption( httpContext.getMessage( "COSTO REAL", "") );
      edtSup_SVal_Jsonclick = "" ;
      edtSup_fecht_Jsonclick = "" ;
      edtSup_usut_Jsonclick = "" ;
      edtSup_camt_Jsonclick = "" ;
      edtSup_CostL_Jsonclick = "" ;
      edtSup_cifU_Jsonclick = "" ;
      edtSup_moiU_Jsonclick = "" ;
      edtSup_Ch2or_Jsonclick = "" ;
      edtSup_Reuso_Jsonclick = "" ;
      edtSup_H20r_Jsonclick = "" ;
      edtSup_H20n_Jsonclick = "" ;
      edtSup_TmpA_Jsonclick = "" ;
      edtSup_CMOD_Jsonclick = "" ;
      edtSup_SProd_Jsonclick = "" ;
      edtSup_Scif_Jsonclick = "" ;
      edtSup_Smoi_Jsonclick = "" ;
      edtSup_Smod_Jsonclick = "" ;
      edtSup_Secc_Jsonclick = "" ;
      edtSup_CmaqC_Jsonclick = "" ;
      edtSup_UndMM_Jsonclick = "" ;
      edtSup_Tog_Jsonclick = "" ;
      edtSup_SValF_Jsonclick = "" ;
      edtSup_Consum_Jsonclick = "" ;
      edtSup_TpU_Jsonclick = "" ;
      edtSup_Grupo_Jsonclick = "" ;
      edtSup_CVapor_Jsonclick = "" ;
      edtSup_Tmp_Jsonclick = "" ;
      edtSup_Ch2o_Jsonclick = "" ;
      edtSup_Vol_Jsonclick = "" ;
      edtSup_TTF_Jsonclick = "" ;
      edtSup_Tpp_Jsonclick = "" ;
      edtSup_Cmaq_Jsonclick = "" ;
      edtSup_Maq_Jsonclick = "" ;
      edtSup_Fasde_Jsonclick = "" ;
      edtSup_Fasco_Jsonclick = "" ;
      edtSup_Lnf_Jsonclick = "" ;
      edtavnRcdDeleted_1036_Jsonclick = "" ;
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
      edtSup_SVal_Enabled = 0 ;
      edtSup_fecht_Enabled = 1 ;
      edtSup_usut_Enabled = 0 ;
      edtSup_usut_Forecolor = (int)(0x000000) ;
      edtSup_camt_Enabled = 0 ;
      edtSup_camt_Forecolor = (int)(0x000000) ;
      edtSup_CostL_Enabled = 0 ;
      edtSup_cifU_Enabled = 0 ;
      edtSup_moiU_Enabled = 0 ;
      edtSup_Ch2or_Enabled = 0 ;
      edtSup_Reuso_Enabled = 1 ;
      edtSup_H20r_Enabled = 1 ;
      edtSup_H20n_Enabled = 1 ;
      edtSup_TmpA_Enabled = 1 ;
      edtSup_CMOD_Enabled = 0 ;
      edtSup_SProd_Enabled = 1 ;
      edtSup_Scif_Enabled = 1 ;
      edtSup_Smoi_Enabled = 1 ;
      edtSup_Smod_Enabled = 1 ;
      edtSup_Secc_Enabled = 1 ;
      edtSup_CmaqC_Enabled = 0 ;
      edtSup_UndMM_Enabled = 1 ;
      edtSup_Tog_Enabled = 1 ;
      edtSup_SValF_Enabled = 0 ;
      edtSup_Consum_Enabled = 0 ;
      edtSup_TpU_Enabled = 0 ;
      edtSup_Grupo_Enabled = 1 ;
      edtSup_CVapor_Enabled = 0 ;
      edtSup_Tmp_Enabled = 0 ;
      edtSup_Ch2o_Enabled = 0 ;
      edtSup_Vol_Enabled = 1 ;
      edtSup_TTF_Enabled = 0 ;
      edtSup_Tpp_Enabled = 1 ;
      edtSup_Tpp_Forecolor = (int)(0x000000) ;
      edtSup_Cmaq_Enabled = 0 ;
      edtSup_Maq_Enabled = 0 ;
      edtSup_Fasde_Enabled = 0 ;
      edtSup_Fasco_Enabled = 0 ;
      edtSup_Lnf_Enabled = 1 ;
      edtavnRcdDeleted_1036_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtSup_Num_Jsonclick = "" ;
      edtSup_Num_Backcolor = (int)(0xFFFFFF) ;
      edtSup_Num_Enabled = 0 ;
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

   public void gx1asasup_svalfZZ1036( byte A7666Sup_TtRl ,
                                      int A7667Sup_hd ,
                                      byte A7668Sup_hrp ,
                                      String A7669Sup_hpp ,
                                      String A396EmprCod ,
                                      int A7275Sup_Num ,
                                      int A7342Sup_Lnf )
   {
      if ( A7666Sup_TtRl == 0 )
      {
         GXt_decimal5 = A7356Sup_SValF ;
         GXv_decimal6[0] = GXt_decimal5 ;
         new app.ppsumit(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, GXv_decimal6) ;
         tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
         A7356Sup_SValF = GXt_decimal5 ;
      }
      else
      {
         if ( A7666Sup_TtRl == 1 )
         {
            GXt_decimal5 = A7356Sup_SValF ;
            GXv_decimal6[0] = GXt_decimal5 ;
            new app.ppsumfl(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, A7667Sup_hd, A7668Sup_hrp, A7669Sup_hpp, GXv_decimal6) ;
            tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
            A7356Sup_SValF = GXt_decimal5 ;
         }
         else
         {
            A7356Sup_SValF = DecimalUtil.doubleToDec(0) ;
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7356Sup_SValF, (byte)(15), (byte)(3), ".", "")))+"\"") ;
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
      subsflControlProps_351036( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalZZ1036( ) ;
         standaloneModalZZ1036( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowZZ1036( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351036( ) ;
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
      /* Using cursor T00ZZ22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00ZZ22_A407EmprNom[0] ;
      n407EmprNom = T00ZZ22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
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

   public void getSup_SVal( String A396EmprCod ,
                            int A7275Sup_Num ,
                            int A7342Sup_Lnf )
   {
      /* Navigation */
      A7361Sup_SVal = DecimalUtil.ZERO ;
      /* Using cursor T00ZZ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A7275Sup_Num), Integer.valueOf(A7342Sup_Lnf)});
      while ( (pr_default.getStatus(21) != 101) && ( GXutil.strcmp(T00ZZ23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00ZZ23_A7275Sup_Num[0] == A7275Sup_Num ) && ( T00ZZ23_A7342Sup_Lnf[0] == A7342Sup_Lnf ) )
      {
         if ( GXutil.strcmp(GXutil.substring( T00ZZ23_A7363Sup_Prdc[0], 1, 3), "OTR") != 0 )
         {
            A7367Sup_Val = (T00ZZ23_A7365Sup_Cant[0].multiply(T00ZZ23_A7366Sup_Prec[0])) ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.substring( T00ZZ23_A7363Sup_Prdc[0], 1, 3), "OTR") == 0 )
            {
               A7367Sup_Val = (T00ZZ23_A7365Sup_Cant[0].multiply(T00ZZ23_A7366Sup_Prec[0])) ;
            }
            else
            {
               A7367Sup_Val = DecimalUtil.doubleToDec(0) ;
            }
         }
         A7361Sup_SVal = A7361Sup_SVal.add(A7367Sup_Val) ;
         pr_default.readNext(21);
      }
      pr_default.close(21);
   }

   public void valid_Sup_num( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7275Sup_Num", GXutil.ltrim( localUtil.ntoc( Z7275Sup_Num, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Sup_lnf( )
   {
      n7666Sup_TtRl = false ;
      n7667Sup_hd = false ;
      n7668Sup_hrp = false ;
      n7669Sup_hpp = false ;
      if ( A7666Sup_TtRl == 0 )
      {
         GXt_decimal5 = A7356Sup_SValF ;
         GXv_decimal6[0] = GXt_decimal5 ;
         new app.ppsumit(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, GXv_decimal6) ;
         tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
         A7356Sup_SValF = GXt_decimal5 ;
      }
      else
      {
         if ( A7666Sup_TtRl == 1 )
         {
            GXt_decimal5 = A7356Sup_SValF ;
            GXv_decimal6[0] = GXt_decimal5 ;
            new app.ppsumfl(remoteHandle, context).execute( A396EmprCod, A7275Sup_Num, A7342Sup_Lnf, A7667Sup_hd, A7668Sup_hrp, A7669Sup_hpp, GXv_decimal6) ;
            tcostpt_impl.this.GXt_decimal5 = GXv_decimal6[0] ;
            A7356Sup_SValF = GXt_decimal5 ;
         }
         else
         {
            A7356Sup_SValF = DecimalUtil.doubleToDec(0) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7356Sup_SValF", GXutil.ltrim( localUtil.ntoc( A7356Sup_SValF, (byte)(15), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7361Sup_SVal", GXutil.ltrim( localUtil.ntoc( A7361Sup_SVal, (byte)(13), (byte)(3), ".", "")));
   }

   public void valid_Sup_tpp( )
   {
      n7347Sup_Tpp = false ;
      n7346Sup_Cmaq = false ;
      n7661Sup_camt = false ;
      n7664Sup_usut = false ;
      n7665Sup_fecht = false ;
      A7348Sup_TTF = A7347Sup_Tpp.multiply(A7346Sup_Cmaq) ;
      AV40oLDTpp = O7347Sup_Tpp ;
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         A7661Sup_camt = (byte)(1) ;
         n7661Sup_camt = false ;
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_Tpp_Forecolor = GXutil.getColor( 255, 0, 0) ;
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_camt_Forecolor = GXutil.getColor( 255, 0, 0) ;
      }
      if ( A7661Sup_camt == 1 )
      {
         edtSup_usut_Forecolor = GXutil.getColor( 255, 0, 0) ;
      }
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         A7664Sup_usut = AV8UsurCod ;
         n7664Sup_usut = false ;
      }
      if ( DecimalUtil.compareTo(A7347Sup_Tpp, AV40oLDTpp) != 0 )
      {
         A7665Sup_fecht = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n7665Sup_fecht = false ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7348Sup_TTF", GXutil.ltrim( localUtil.ntoc( A7348Sup_TTF, (byte)(8), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40oLDTpp", GXutil.ltrim( localUtil.ntoc( AV40oLDTpp, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7661Sup_camt", GXutil.ltrim( localUtil.ntoc( A7661Sup_camt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtSup_Tpp_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_Tpp_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtSup_camt_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_camt_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtSup_usut_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSup_usut_Forecolor), 9, 0), !bGXsfl_35_Refreshing);
      httpContext.ajax_rsp_assign_attri("", false, "A7664Sup_usut", GXutil.rtrim( A7664Sup_usut));
      httpContext.ajax_rsp_assign_attri("", false, "A7665Sup_fecht", localUtil.ttoc( A7665Sup_fecht, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7275Sup_Num',fld:'SUP_NUM',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_SUP_NUM","{handler:'valid_Sup_num',iparms:[{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7275Sup_Num',fld:'SUP_NUM',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_SUP_NUM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z7275Sup_Num'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_SUP_LNF","{handler:'valid_Sup_lnf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7275Sup_Num',fld:'SUP_NUM',pic:'ZZZZZZZ9'},{av:'A7342Sup_Lnf',fld:'SUP_LNF',pic:'ZZZZZ9'},{av:'A7666Sup_TtRl',fld:'SUP_TTRL',pic:'9'},{av:'A7667Sup_hd',fld:'SUP_HD',pic:'ZZZZZZZ9'},{av:'A7668Sup_hrp',fld:'SUP_HRP',pic:'9'},{av:'A7669Sup_hpp',fld:'SUP_HPP',pic:''},{av:'A7356Sup_SValF',fld:'SUP_SVALF',pic:'ZZZ,ZZZ,ZZ9.999'},{av:'A7361Sup_SVal',fld:'SUP_SVAL',pic:'Z,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_SUP_LNF",",oparms:[{av:'A7356Sup_SValF',fld:'SUP_SVALF',pic:'ZZZ,ZZZ,ZZ9.999'},{av:'A7361Sup_SVal',fld:'SUP_SVAL',pic:'Z,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_SUP_CMAQ","{handler:'valid_Sup_cmaq',iparms:[]");
      setEventMetadata("VALID_SUP_CMAQ",",oparms:[]}");
      setEventMetadata("VALID_SUP_TPP","{handler:'valid_Sup_tpp',iparms:[{av:'O7347Sup_Tpp'},{av:'A7347Sup_Tpp',fld:'SUP_TPP',pic:'ZZZ9.99'},{av:'A7346Sup_Cmaq',fld:'SUP_CMAQ',pic:'ZZZZ9.9999'},{av:'AV40oLDTpp',fld:'vOLDTPP',pic:'ZZZ9.99'},{av:'A7661Sup_camt',fld:'SUP_CAMT',pic:'9'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'A7348Sup_TTF',fld:'SUP_TTF',pic:'ZZZ9.999'},{av:'A7664Sup_usut',fld:'SUP_USUT',pic:'@!'},{av:'A7665Sup_fecht',fld:'SUP_FECHT',pic:'99/99/99 99:99'}]");
      setEventMetadata("VALID_SUP_TPP",",oparms:[{av:'A7348Sup_TTF',fld:'SUP_TTF',pic:'ZZZ9.999'},{av:'AV40oLDTpp',fld:'vOLDTPP',pic:'ZZZ9.99'},{av:'A7661Sup_camt',fld:'SUP_CAMT',pic:'9'},{av:'edtSup_Tpp_Forecolor',ctrl:'SUP_TPP',prop:'Forecolor'},{av:'edtSup_camt_Forecolor',ctrl:'SUP_CAMT',prop:'Forecolor'},{av:'edtSup_usut_Forecolor',ctrl:'SUP_USUT',prop:'Forecolor'},{av:'A7664Sup_usut',fld:'SUP_USUT',pic:'@!'},{av:'A7665Sup_fecht',fld:'SUP_FECHT',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VALID_SUP_TTF","{handler:'valid_Sup_ttf',iparms:[]");
      setEventMetadata("VALID_SUP_TTF",",oparms:[]}");
      setEventMetadata("VALID_SUP_VOL","{handler:'valid_Sup_vol',iparms:[]");
      setEventMetadata("VALID_SUP_VOL",",oparms:[]}");
      setEventMetadata("VALID_SUP_CH2O","{handler:'valid_Sup_ch2o',iparms:[]");
      setEventMetadata("VALID_SUP_CH2O",",oparms:[]}");
      setEventMetadata("VALID_SUP_TMP","{handler:'valid_Sup_tmp',iparms:[]");
      setEventMetadata("VALID_SUP_TMP",",oparms:[]}");
      setEventMetadata("VALID_SUP_CVAPOR","{handler:'valid_Sup_cvapor',iparms:[]");
      setEventMetadata("VALID_SUP_CVAPOR",",oparms:[]}");
      setEventMetadata("VALID_SUP_GRUPO","{handler:'valid_Sup_grupo',iparms:[]");
      setEventMetadata("VALID_SUP_GRUPO",",oparms:[]}");
      setEventMetadata("VALID_SUP_TPU","{handler:'valid_Sup_tpu',iparms:[]");
      setEventMetadata("VALID_SUP_TPU",",oparms:[]}");
      setEventMetadata("VALID_SUP_TOG","{handler:'valid_Sup_tog',iparms:[]");
      setEventMetadata("VALID_SUP_TOG",",oparms:[]}");
      setEventMetadata("VALID_SUP_UNDMM","{handler:'valid_Sup_undmm',iparms:[]");
      setEventMetadata("VALID_SUP_UNDMM",",oparms:[]}");
      setEventMetadata("VALID_SUP_SMOD","{handler:'valid_Sup_smod',iparms:[]");
      setEventMetadata("VALID_SUP_SMOD",",oparms:[]}");
      setEventMetadata("VALID_SUP_SMOI","{handler:'valid_Sup_smoi',iparms:[]");
      setEventMetadata("VALID_SUP_SMOI",",oparms:[]}");
      setEventMetadata("VALID_SUP_SCIF","{handler:'valid_Sup_scif',iparms:[]");
      setEventMetadata("VALID_SUP_SCIF",",oparms:[]}");
      setEventMetadata("VALID_SUP_SPROD","{handler:'valid_Sup_sprod',iparms:[]");
      setEventMetadata("VALID_SUP_SPROD",",oparms:[]}");
      setEventMetadata("VALID_SUP_CMOD","{handler:'valid_Sup_cmod',iparms:[]");
      setEventMetadata("VALID_SUP_CMOD",",oparms:[]}");
      setEventMetadata("VALID_SUP_TMPA","{handler:'valid_Sup_tmpa',iparms:[]");
      setEventMetadata("VALID_SUP_TMPA",",oparms:[]}");
      setEventMetadata("VALID_SUP_H20N","{handler:'valid_Sup_h20n',iparms:[]");
      setEventMetadata("VALID_SUP_H20N",",oparms:[]}");
      setEventMetadata("VALID_SUP_H20R","{handler:'valid_Sup_h20r',iparms:[]");
      setEventMetadata("VALID_SUP_H20R",",oparms:[]}");
      setEventMetadata("VALID_SUP_REUSO","{handler:'valid_Sup_reuso',iparms:[]");
      setEventMetadata("VALID_SUP_REUSO",",oparms:[]}");
      setEventMetadata("VALID_SUP_MOIU","{handler:'valid_Sup_moiu',iparms:[]");
      setEventMetadata("VALID_SUP_MOIU",",oparms:[]}");
      setEventMetadata("VALID_SUP_CIFU","{handler:'valid_Sup_cifu',iparms:[]");
      setEventMetadata("VALID_SUP_CIFU",",oparms:[]}");
      setEventMetadata("VALID_SUP_CAMT","{handler:'valid_Sup_camt',iparms:[]");
      setEventMetadata("VALID_SUP_CAMT",",oparms:[]}");
      setEventMetadata("VALID_SUP_SVAL","{handler:'valid_Sup_sval',iparms:[]");
      setEventMetadata("VALID_SUP_SVAL",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z7343Sup_Fasco = "" ;
      Z7344Sup_Fasde = "" ;
      Z7345Sup_Maq = "" ;
      Z7346Sup_Cmaq = DecimalUtil.ZERO ;
      Z7347Sup_Tpp = DecimalUtil.ZERO ;
      Z7353Sup_Grupo = DecimalUtil.ZERO ;
      Z7357Sup_Tog = DecimalUtil.ZERO ;
      Z7605Sup_Secc = "" ;
      Z7606Sup_Smod = DecimalUtil.ZERO ;
      Z7607Sup_Smoi = DecimalUtil.ZERO ;
      Z7608Sup_Scif = DecimalUtil.ZERO ;
      Z7609Sup_SProd = DecimalUtil.ZERO ;
      Z7615Sup_H20n = DecimalUtil.ZERO ;
      Z7616Sup_H20r = DecimalUtil.ZERO ;
      Z7617Sup_Reuso = "" ;
      Z7664Sup_usut = "" ;
      Z7665Sup_fecht = GXutil.resetTime( GXutil.nullDate() );
      Z7669Sup_hpp = "" ;
      O7347Sup_Tpp = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A7669Sup_hpp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1036 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV41Pgmname = "" ;
      A7286Sup_ConVap = DecimalUtil.ZERO ;
      A7299Sup_cacpp = DecimalUtil.ZERO ;
      A8426Sup_conmq = DecimalUtil.ZERO ;
      A7612Sup_matipu = DecimalUtil.ZERO ;
      A7283Sup_PminOp = DecimalUtil.ZERO ;
      AV40oLDTpp = DecimalUtil.ZERO ;
      AV8UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1035 = "" ;
      GXCCtl = "" ;
      A7343Sup_Fasco = "" ;
      A7344Sup_Fasde = "" ;
      A7345Sup_Maq = "" ;
      A7346Sup_Cmaq = DecimalUtil.ZERO ;
      A7347Sup_Tpp = DecimalUtil.ZERO ;
      A7348Sup_TTF = DecimalUtil.ZERO ;
      A7350Sup_Ch2o = DecimalUtil.ZERO ;
      A7352Sup_CVapor = DecimalUtil.ZERO ;
      A7353Sup_Grupo = DecimalUtil.ZERO ;
      A7354Sup_TpU = DecimalUtil.ZERO ;
      A7355Sup_Consum = DecimalUtil.ZERO ;
      A7356Sup_SValF = DecimalUtil.ZERO ;
      A7357Sup_Tog = DecimalUtil.ZERO ;
      A7359Sup_CmaqC = DecimalUtil.ZERO ;
      A7605Sup_Secc = "" ;
      A7606Sup_Smod = DecimalUtil.ZERO ;
      A7607Sup_Smoi = DecimalUtil.ZERO ;
      A7608Sup_Scif = DecimalUtil.ZERO ;
      A7609Sup_SProd = DecimalUtil.ZERO ;
      A7610Sup_CMOD = DecimalUtil.ZERO ;
      A7615Sup_H20n = DecimalUtil.ZERO ;
      A7616Sup_H20r = DecimalUtil.ZERO ;
      A7617Sup_Reuso = "" ;
      A7618Sup_Ch2or = DecimalUtil.ZERO ;
      A7626Sup_moiU = DecimalUtil.ZERO ;
      A7627Sup_cifU = DecimalUtil.ZERO ;
      A7629Sup_CostL = DecimalUtil.ZERO ;
      A7664Sup_usut = "" ;
      A7665Sup_fecht = GXutil.resetTime( GXutil.nullDate() );
      A7361Sup_SVal = DecimalUtil.ZERO ;
      T7347Sup_Tpp = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00ZZ6_A407EmprNom = new String[] {""} ;
      T00ZZ6_n407EmprNom = new boolean[] {false} ;
      T00ZZ7_A7275Sup_Num = new int[1] ;
      T00ZZ7_A407EmprNom = new String[] {""} ;
      T00ZZ7_n407EmprNom = new boolean[] {false} ;
      T00ZZ7_A396EmprCod = new String[] {""} ;
      T00ZZ8_A396EmprCod = new String[] {""} ;
      T00ZZ8_A7275Sup_Num = new int[1] ;
      T00ZZ5_A7275Sup_Num = new int[1] ;
      T00ZZ5_A396EmprCod = new String[] {""} ;
      T00ZZ9_A396EmprCod = new String[] {""} ;
      T00ZZ9_A7275Sup_Num = new int[1] ;
      T00ZZ10_A396EmprCod = new String[] {""} ;
      T00ZZ10_A7275Sup_Num = new int[1] ;
      T00ZZ4_A7275Sup_Num = new int[1] ;
      T00ZZ4_A396EmprCod = new String[] {""} ;
      T00ZZ13_A396EmprCod = new String[] {""} ;
      T00ZZ13_A7275Sup_Num = new int[1] ;
      T00ZZ13_A7342Sup_Lnf = new int[1] ;
      T00ZZ13_A7362Sup_Lp = new short[1] ;
      T00ZZ14_A396EmprCod = new String[] {""} ;
      T00ZZ14_A7275Sup_Num = new int[1] ;
      T00ZZ15_A396EmprCod = new String[] {""} ;
      T00ZZ15_A7275Sup_Num = new int[1] ;
      T00ZZ15_A7342Sup_Lnf = new int[1] ;
      T00ZZ15_A7343Sup_Fasco = new String[] {""} ;
      T00ZZ15_n7343Sup_Fasco = new boolean[] {false} ;
      T00ZZ15_A7344Sup_Fasde = new String[] {""} ;
      T00ZZ15_n7344Sup_Fasde = new boolean[] {false} ;
      T00ZZ15_A7345Sup_Maq = new String[] {""} ;
      T00ZZ15_n7345Sup_Maq = new boolean[] {false} ;
      T00ZZ15_A7346Sup_Cmaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7346Sup_Cmaq = new boolean[] {false} ;
      T00ZZ15_A7347Sup_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7347Sup_Tpp = new boolean[] {false} ;
      T00ZZ15_A7349Sup_Vol = new int[1] ;
      T00ZZ15_n7349Sup_Vol = new boolean[] {false} ;
      T00ZZ15_A7351Sup_Tmp = new short[1] ;
      T00ZZ15_n7351Sup_Tmp = new boolean[] {false} ;
      T00ZZ15_A7353Sup_Grupo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7353Sup_Grupo = new boolean[] {false} ;
      T00ZZ15_A7357Sup_Tog = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7357Sup_Tog = new boolean[] {false} ;
      T00ZZ15_A7358Sup_UndMM = new int[1] ;
      T00ZZ15_n7358Sup_UndMM = new boolean[] {false} ;
      T00ZZ15_A7605Sup_Secc = new String[] {""} ;
      T00ZZ15_n7605Sup_Secc = new boolean[] {false} ;
      T00ZZ15_A7606Sup_Smod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7606Sup_Smod = new boolean[] {false} ;
      T00ZZ15_A7607Sup_Smoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7607Sup_Smoi = new boolean[] {false} ;
      T00ZZ15_A7608Sup_Scif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7608Sup_Scif = new boolean[] {false} ;
      T00ZZ15_A7609Sup_SProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7609Sup_SProd = new boolean[] {false} ;
      T00ZZ15_A7614Sup_TmpA = new short[1] ;
      T00ZZ15_n7614Sup_TmpA = new boolean[] {false} ;
      T00ZZ15_A7615Sup_H20n = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7615Sup_H20n = new boolean[] {false} ;
      T00ZZ15_A7616Sup_H20r = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ15_n7616Sup_H20r = new boolean[] {false} ;
      T00ZZ15_A7617Sup_Reuso = new String[] {""} ;
      T00ZZ15_n7617Sup_Reuso = new boolean[] {false} ;
      T00ZZ15_A7661Sup_camt = new byte[1] ;
      T00ZZ15_n7661Sup_camt = new boolean[] {false} ;
      T00ZZ15_A7664Sup_usut = new String[] {""} ;
      T00ZZ15_n7664Sup_usut = new boolean[] {false} ;
      T00ZZ15_A7665Sup_fecht = new java.util.Date[] {GXutil.nullDate()} ;
      T00ZZ15_n7665Sup_fecht = new boolean[] {false} ;
      T00ZZ15_A7666Sup_TtRl = new byte[1] ;
      T00ZZ15_n7666Sup_TtRl = new boolean[] {false} ;
      T00ZZ15_A7667Sup_hd = new int[1] ;
      T00ZZ15_n7667Sup_hd = new boolean[] {false} ;
      T00ZZ15_A7668Sup_hrp = new byte[1] ;
      T00ZZ15_n7668Sup_hrp = new boolean[] {false} ;
      T00ZZ15_A7669Sup_hpp = new String[] {""} ;
      T00ZZ15_n7669Sup_hpp = new boolean[] {false} ;
      T00ZZ15_A8425Sup_TmpC = new short[1] ;
      T00ZZ15_n8425Sup_TmpC = new boolean[] {false} ;
      T00ZZ15_A11932Sup_Nh2o = new short[1] ;
      T00ZZ15_n11932Sup_Nh2o = new boolean[] {false} ;
      T00ZZ16_A396EmprCod = new String[] {""} ;
      T00ZZ16_A7275Sup_Num = new int[1] ;
      T00ZZ16_A7342Sup_Lnf = new int[1] ;
      T00ZZ3_A396EmprCod = new String[] {""} ;
      T00ZZ3_A7275Sup_Num = new int[1] ;
      T00ZZ3_A7342Sup_Lnf = new int[1] ;
      T00ZZ3_A7343Sup_Fasco = new String[] {""} ;
      T00ZZ3_n7343Sup_Fasco = new boolean[] {false} ;
      T00ZZ3_A7344Sup_Fasde = new String[] {""} ;
      T00ZZ3_n7344Sup_Fasde = new boolean[] {false} ;
      T00ZZ3_A7345Sup_Maq = new String[] {""} ;
      T00ZZ3_n7345Sup_Maq = new boolean[] {false} ;
      T00ZZ3_A7346Sup_Cmaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7346Sup_Cmaq = new boolean[] {false} ;
      T00ZZ3_A7347Sup_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7347Sup_Tpp = new boolean[] {false} ;
      T00ZZ3_A7349Sup_Vol = new int[1] ;
      T00ZZ3_n7349Sup_Vol = new boolean[] {false} ;
      T00ZZ3_A7351Sup_Tmp = new short[1] ;
      T00ZZ3_n7351Sup_Tmp = new boolean[] {false} ;
      T00ZZ3_A7353Sup_Grupo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7353Sup_Grupo = new boolean[] {false} ;
      T00ZZ3_A7357Sup_Tog = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7357Sup_Tog = new boolean[] {false} ;
      T00ZZ3_A7358Sup_UndMM = new int[1] ;
      T00ZZ3_n7358Sup_UndMM = new boolean[] {false} ;
      T00ZZ3_A7605Sup_Secc = new String[] {""} ;
      T00ZZ3_n7605Sup_Secc = new boolean[] {false} ;
      T00ZZ3_A7606Sup_Smod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7606Sup_Smod = new boolean[] {false} ;
      T00ZZ3_A7607Sup_Smoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7607Sup_Smoi = new boolean[] {false} ;
      T00ZZ3_A7608Sup_Scif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7608Sup_Scif = new boolean[] {false} ;
      T00ZZ3_A7609Sup_SProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7609Sup_SProd = new boolean[] {false} ;
      T00ZZ3_A7614Sup_TmpA = new short[1] ;
      T00ZZ3_n7614Sup_TmpA = new boolean[] {false} ;
      T00ZZ3_A7615Sup_H20n = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7615Sup_H20n = new boolean[] {false} ;
      T00ZZ3_A7616Sup_H20r = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ3_n7616Sup_H20r = new boolean[] {false} ;
      T00ZZ3_A7617Sup_Reuso = new String[] {""} ;
      T00ZZ3_n7617Sup_Reuso = new boolean[] {false} ;
      T00ZZ3_A7661Sup_camt = new byte[1] ;
      T00ZZ3_n7661Sup_camt = new boolean[] {false} ;
      T00ZZ3_A7664Sup_usut = new String[] {""} ;
      T00ZZ3_n7664Sup_usut = new boolean[] {false} ;
      T00ZZ3_A7665Sup_fecht = new java.util.Date[] {GXutil.nullDate()} ;
      T00ZZ3_n7665Sup_fecht = new boolean[] {false} ;
      T00ZZ3_A7666Sup_TtRl = new byte[1] ;
      T00ZZ3_n7666Sup_TtRl = new boolean[] {false} ;
      T00ZZ3_A7667Sup_hd = new int[1] ;
      T00ZZ3_n7667Sup_hd = new boolean[] {false} ;
      T00ZZ3_A7668Sup_hrp = new byte[1] ;
      T00ZZ3_n7668Sup_hrp = new boolean[] {false} ;
      T00ZZ3_A7669Sup_hpp = new String[] {""} ;
      T00ZZ3_n7669Sup_hpp = new boolean[] {false} ;
      T00ZZ3_A8425Sup_TmpC = new short[1] ;
      T00ZZ3_n8425Sup_TmpC = new boolean[] {false} ;
      T00ZZ3_A11932Sup_Nh2o = new short[1] ;
      T00ZZ3_n11932Sup_Nh2o = new boolean[] {false} ;
      T00ZZ2_A396EmprCod = new String[] {""} ;
      T00ZZ2_A7275Sup_Num = new int[1] ;
      T00ZZ2_A7342Sup_Lnf = new int[1] ;
      T00ZZ2_A7343Sup_Fasco = new String[] {""} ;
      T00ZZ2_n7343Sup_Fasco = new boolean[] {false} ;
      T00ZZ2_A7344Sup_Fasde = new String[] {""} ;
      T00ZZ2_n7344Sup_Fasde = new boolean[] {false} ;
      T00ZZ2_A7345Sup_Maq = new String[] {""} ;
      T00ZZ2_n7345Sup_Maq = new boolean[] {false} ;
      T00ZZ2_A7346Sup_Cmaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7346Sup_Cmaq = new boolean[] {false} ;
      T00ZZ2_A7347Sup_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7347Sup_Tpp = new boolean[] {false} ;
      T00ZZ2_A7349Sup_Vol = new int[1] ;
      T00ZZ2_n7349Sup_Vol = new boolean[] {false} ;
      T00ZZ2_A7351Sup_Tmp = new short[1] ;
      T00ZZ2_n7351Sup_Tmp = new boolean[] {false} ;
      T00ZZ2_A7353Sup_Grupo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7353Sup_Grupo = new boolean[] {false} ;
      T00ZZ2_A7357Sup_Tog = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7357Sup_Tog = new boolean[] {false} ;
      T00ZZ2_A7358Sup_UndMM = new int[1] ;
      T00ZZ2_n7358Sup_UndMM = new boolean[] {false} ;
      T00ZZ2_A7605Sup_Secc = new String[] {""} ;
      T00ZZ2_n7605Sup_Secc = new boolean[] {false} ;
      T00ZZ2_A7606Sup_Smod = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7606Sup_Smod = new boolean[] {false} ;
      T00ZZ2_A7607Sup_Smoi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7607Sup_Smoi = new boolean[] {false} ;
      T00ZZ2_A7608Sup_Scif = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7608Sup_Scif = new boolean[] {false} ;
      T00ZZ2_A7609Sup_SProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7609Sup_SProd = new boolean[] {false} ;
      T00ZZ2_A7614Sup_TmpA = new short[1] ;
      T00ZZ2_n7614Sup_TmpA = new boolean[] {false} ;
      T00ZZ2_A7615Sup_H20n = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7615Sup_H20n = new boolean[] {false} ;
      T00ZZ2_A7616Sup_H20r = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ2_n7616Sup_H20r = new boolean[] {false} ;
      T00ZZ2_A7617Sup_Reuso = new String[] {""} ;
      T00ZZ2_n7617Sup_Reuso = new boolean[] {false} ;
      T00ZZ2_A7661Sup_camt = new byte[1] ;
      T00ZZ2_n7661Sup_camt = new boolean[] {false} ;
      T00ZZ2_A7664Sup_usut = new String[] {""} ;
      T00ZZ2_n7664Sup_usut = new boolean[] {false} ;
      T00ZZ2_A7665Sup_fecht = new java.util.Date[] {GXutil.nullDate()} ;
      T00ZZ2_n7665Sup_fecht = new boolean[] {false} ;
      T00ZZ2_A7666Sup_TtRl = new byte[1] ;
      T00ZZ2_n7666Sup_TtRl = new boolean[] {false} ;
      T00ZZ2_A7667Sup_hd = new int[1] ;
      T00ZZ2_n7667Sup_hd = new boolean[] {false} ;
      T00ZZ2_A7668Sup_hrp = new byte[1] ;
      T00ZZ2_n7668Sup_hrp = new boolean[] {false} ;
      T00ZZ2_A7669Sup_hpp = new String[] {""} ;
      T00ZZ2_n7669Sup_hpp = new boolean[] {false} ;
      T00ZZ2_A8425Sup_TmpC = new short[1] ;
      T00ZZ2_n8425Sup_TmpC = new boolean[] {false} ;
      T00ZZ2_A11932Sup_Nh2o = new short[1] ;
      T00ZZ2_n11932Sup_Nh2o = new boolean[] {false} ;
      T00ZZ20_A396EmprCod = new String[] {""} ;
      T00ZZ20_A7275Sup_Num = new int[1] ;
      T00ZZ20_A7342Sup_Lnf = new int[1] ;
      T00ZZ20_A7362Sup_Lp = new short[1] ;
      T00ZZ21_A396EmprCod = new String[] {""} ;
      T00ZZ21_A7275Sup_Num = new int[1] ;
      T00ZZ21_A7342Sup_Lnf = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00ZZ22_A407EmprNom = new String[] {""} ;
      T00ZZ22_n407EmprNom = new boolean[] {false} ;
      T00ZZ23_A396EmprCod = new String[] {""} ;
      T00ZZ23_A7275Sup_Num = new int[1] ;
      T00ZZ23_A7342Sup_Lnf = new int[1] ;
      T00ZZ23_A7362Sup_Lp = new short[1] ;
      T00ZZ23_A7363Sup_Prdc = new String[] {""} ;
      T00ZZ23_n7363Sup_Prdc = new boolean[] {false} ;
      T00ZZ23_A7366Sup_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ23_n7366Sup_Prec = new boolean[] {false} ;
      T00ZZ23_A7365Sup_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00ZZ23_n7365Sup_Cant = new boolean[] {false} ;
      A7367Sup_Val = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      GXt_decimal5 = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      Z7356Sup_SValF = DecimalUtil.ZERO ;
      Z7361Sup_SVal = DecimalUtil.ZERO ;
      Z7348Sup_TTF = DecimalUtil.ZERO ;
      ZV40oLDTpp = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcostpt__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcostpt__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcostpt__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcostpt__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcostpt__default(),
         new Object[] {
             new Object[] {
            T00ZZ2_A396EmprCod, T00ZZ2_A7275Sup_Num, T00ZZ2_A7342Sup_Lnf, T00ZZ2_A7343Sup_Fasco, T00ZZ2_n7343Sup_Fasco, T00ZZ2_A7344Sup_Fasde, T00ZZ2_n7344Sup_Fasde, T00ZZ2_A7345Sup_Maq, T00ZZ2_n7345Sup_Maq, T00ZZ2_A7346Sup_Cmaq,
            T00ZZ2_n7346Sup_Cmaq, T00ZZ2_A7347Sup_Tpp, T00ZZ2_n7347Sup_Tpp, T00ZZ2_A7349Sup_Vol, T00ZZ2_n7349Sup_Vol, T00ZZ2_A7351Sup_Tmp, T00ZZ2_n7351Sup_Tmp, T00ZZ2_A7353Sup_Grupo, T00ZZ2_n7353Sup_Grupo, T00ZZ2_A7357Sup_Tog,
            T00ZZ2_n7357Sup_Tog, T00ZZ2_A7358Sup_UndMM, T00ZZ2_n7358Sup_UndMM, T00ZZ2_A7605Sup_Secc, T00ZZ2_n7605Sup_Secc, T00ZZ2_A7606Sup_Smod, T00ZZ2_n7606Sup_Smod, T00ZZ2_A7607Sup_Smoi, T00ZZ2_n7607Sup_Smoi, T00ZZ2_A7608Sup_Scif,
            T00ZZ2_n7608Sup_Scif, T00ZZ2_A7609Sup_SProd, T00ZZ2_n7609Sup_SProd, T00ZZ2_A7614Sup_TmpA, T00ZZ2_n7614Sup_TmpA, T00ZZ2_A7615Sup_H20n, T00ZZ2_n7615Sup_H20n, T00ZZ2_A7616Sup_H20r, T00ZZ2_n7616Sup_H20r, T00ZZ2_A7617Sup_Reuso,
            T00ZZ2_n7617Sup_Reuso, T00ZZ2_A7661Sup_camt, T00ZZ2_n7661Sup_camt, T00ZZ2_A7664Sup_usut, T00ZZ2_n7664Sup_usut, T00ZZ2_A7665Sup_fecht, T00ZZ2_n7665Sup_fecht, T00ZZ2_A7666Sup_TtRl, T00ZZ2_n7666Sup_TtRl, T00ZZ2_A7667Sup_hd,
            T00ZZ2_n7667Sup_hd, T00ZZ2_A7668Sup_hrp, T00ZZ2_n7668Sup_hrp, T00ZZ2_A7669Sup_hpp, T00ZZ2_n7669Sup_hpp, T00ZZ2_A8425Sup_TmpC, T00ZZ2_n8425Sup_TmpC, T00ZZ2_A11932Sup_Nh2o, T00ZZ2_n11932Sup_Nh2o
            }
            , new Object[] {
            T00ZZ3_A396EmprCod, T00ZZ3_A7275Sup_Num, T00ZZ3_A7342Sup_Lnf, T00ZZ3_A7343Sup_Fasco, T00ZZ3_n7343Sup_Fasco, T00ZZ3_A7344Sup_Fasde, T00ZZ3_n7344Sup_Fasde, T00ZZ3_A7345Sup_Maq, T00ZZ3_n7345Sup_Maq, T00ZZ3_A7346Sup_Cmaq,
            T00ZZ3_n7346Sup_Cmaq, T00ZZ3_A7347Sup_Tpp, T00ZZ3_n7347Sup_Tpp, T00ZZ3_A7349Sup_Vol, T00ZZ3_n7349Sup_Vol, T00ZZ3_A7351Sup_Tmp, T00ZZ3_n7351Sup_Tmp, T00ZZ3_A7353Sup_Grupo, T00ZZ3_n7353Sup_Grupo, T00ZZ3_A7357Sup_Tog,
            T00ZZ3_n7357Sup_Tog, T00ZZ3_A7358Sup_UndMM, T00ZZ3_n7358Sup_UndMM, T00ZZ3_A7605Sup_Secc, T00ZZ3_n7605Sup_Secc, T00ZZ3_A7606Sup_Smod, T00ZZ3_n7606Sup_Smod, T00ZZ3_A7607Sup_Smoi, T00ZZ3_n7607Sup_Smoi, T00ZZ3_A7608Sup_Scif,
            T00ZZ3_n7608Sup_Scif, T00ZZ3_A7609Sup_SProd, T00ZZ3_n7609Sup_SProd, T00ZZ3_A7614Sup_TmpA, T00ZZ3_n7614Sup_TmpA, T00ZZ3_A7615Sup_H20n, T00ZZ3_n7615Sup_H20n, T00ZZ3_A7616Sup_H20r, T00ZZ3_n7616Sup_H20r, T00ZZ3_A7617Sup_Reuso,
            T00ZZ3_n7617Sup_Reuso, T00ZZ3_A7661Sup_camt, T00ZZ3_n7661Sup_camt, T00ZZ3_A7664Sup_usut, T00ZZ3_n7664Sup_usut, T00ZZ3_A7665Sup_fecht, T00ZZ3_n7665Sup_fecht, T00ZZ3_A7666Sup_TtRl, T00ZZ3_n7666Sup_TtRl, T00ZZ3_A7667Sup_hd,
            T00ZZ3_n7667Sup_hd, T00ZZ3_A7668Sup_hrp, T00ZZ3_n7668Sup_hrp, T00ZZ3_A7669Sup_hpp, T00ZZ3_n7669Sup_hpp, T00ZZ3_A8425Sup_TmpC, T00ZZ3_n8425Sup_TmpC, T00ZZ3_A11932Sup_Nh2o, T00ZZ3_n11932Sup_Nh2o
            }
            , new Object[] {
            T00ZZ4_A7275Sup_Num, T00ZZ4_A396EmprCod
            }
            , new Object[] {
            T00ZZ5_A7275Sup_Num, T00ZZ5_A396EmprCod
            }
            , new Object[] {
            T00ZZ6_A407EmprNom, T00ZZ6_n407EmprNom
            }
            , new Object[] {
            T00ZZ7_A7275Sup_Num, T00ZZ7_A407EmprNom, T00ZZ7_n407EmprNom, T00ZZ7_A396EmprCod
            }
            , new Object[] {
            T00ZZ8_A396EmprCod, T00ZZ8_A7275Sup_Num
            }
            , new Object[] {
            T00ZZ9_A396EmprCod, T00ZZ9_A7275Sup_Num
            }
            , new Object[] {
            T00ZZ10_A396EmprCod, T00ZZ10_A7275Sup_Num
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00ZZ13_A396EmprCod, T00ZZ13_A7275Sup_Num, T00ZZ13_A7342Sup_Lnf, T00ZZ13_A7362Sup_Lp
            }
            , new Object[] {
            T00ZZ14_A396EmprCod, T00ZZ14_A7275Sup_Num
            }
            , new Object[] {
            T00ZZ15_A396EmprCod, T00ZZ15_A7275Sup_Num, T00ZZ15_A7342Sup_Lnf, T00ZZ15_A7343Sup_Fasco, T00ZZ15_n7343Sup_Fasco, T00ZZ15_A7344Sup_Fasde, T00ZZ15_n7344Sup_Fasde, T00ZZ15_A7345Sup_Maq, T00ZZ15_n7345Sup_Maq, T00ZZ15_A7346Sup_Cmaq,
            T00ZZ15_n7346Sup_Cmaq, T00ZZ15_A7347Sup_Tpp, T00ZZ15_n7347Sup_Tpp, T00ZZ15_A7349Sup_Vol, T00ZZ15_n7349Sup_Vol, T00ZZ15_A7351Sup_Tmp, T00ZZ15_n7351Sup_Tmp, T00ZZ15_A7353Sup_Grupo, T00ZZ15_n7353Sup_Grupo, T00ZZ15_A7357Sup_Tog,
            T00ZZ15_n7357Sup_Tog, T00ZZ15_A7358Sup_UndMM, T00ZZ15_n7358Sup_UndMM, T00ZZ15_A7605Sup_Secc, T00ZZ15_n7605Sup_Secc, T00ZZ15_A7606Sup_Smod, T00ZZ15_n7606Sup_Smod, T00ZZ15_A7607Sup_Smoi, T00ZZ15_n7607Sup_Smoi, T00ZZ15_A7608Sup_Scif,
            T00ZZ15_n7608Sup_Scif, T00ZZ15_A7609Sup_SProd, T00ZZ15_n7609Sup_SProd, T00ZZ15_A7614Sup_TmpA, T00ZZ15_n7614Sup_TmpA, T00ZZ15_A7615Sup_H20n, T00ZZ15_n7615Sup_H20n, T00ZZ15_A7616Sup_H20r, T00ZZ15_n7616Sup_H20r, T00ZZ15_A7617Sup_Reuso,
            T00ZZ15_n7617Sup_Reuso, T00ZZ15_A7661Sup_camt, T00ZZ15_n7661Sup_camt, T00ZZ15_A7664Sup_usut, T00ZZ15_n7664Sup_usut, T00ZZ15_A7665Sup_fecht, T00ZZ15_n7665Sup_fecht, T00ZZ15_A7666Sup_TtRl, T00ZZ15_n7666Sup_TtRl, T00ZZ15_A7667Sup_hd,
            T00ZZ15_n7667Sup_hd, T00ZZ15_A7668Sup_hrp, T00ZZ15_n7668Sup_hrp, T00ZZ15_A7669Sup_hpp, T00ZZ15_n7669Sup_hpp, T00ZZ15_A8425Sup_TmpC, T00ZZ15_n8425Sup_TmpC, T00ZZ15_A11932Sup_Nh2o, T00ZZ15_n11932Sup_Nh2o
            }
            , new Object[] {
            T00ZZ16_A396EmprCod, T00ZZ16_A7275Sup_Num, T00ZZ16_A7342Sup_Lnf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00ZZ20_A396EmprCod, T00ZZ20_A7275Sup_Num, T00ZZ20_A7342Sup_Lnf, T00ZZ20_A7362Sup_Lp
            }
            , new Object[] {
            T00ZZ21_A396EmprCod, T00ZZ21_A7275Sup_Num, T00ZZ21_A7342Sup_Lnf
            }
            , new Object[] {
            T00ZZ22_A407EmprNom, T00ZZ22_n407EmprNom
            }
            , new Object[] {
            T00ZZ23_A396EmprCod, T00ZZ23_A7275Sup_Num, T00ZZ23_A7342Sup_Lnf, T00ZZ23_A7362Sup_Lp, T00ZZ23_A7363Sup_Prdc, T00ZZ23_n7363Sup_Prdc, T00ZZ23_A7366Sup_Prec, T00ZZ23_n7366Sup_Prec, T00ZZ23_A7365Sup_Cant, T00ZZ23_n7365Sup_Cant
            }
         }
      );
      Z7275Sup_Num = 0 ;
      A7275Sup_Num = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV41Pgmname = "TCOSTPt" ;
   }

   private byte Z7661Sup_camt ;
   private byte Z7666Sup_TtRl ;
   private byte Z7668Sup_hrp ;
   private byte GxWebError ;
   private byte A7666Sup_TtRl ;
   private byte A7668Sup_hrp ;
   private byte nKeyPressed ;
   private byte A7661Sup_camt ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z7351Sup_Tmp ;
   private short Z7614Sup_TmpA ;
   private short Z8425Sup_TmpC ;
   private short Z11932Sup_Nh2o ;
   private short nRcdDeleted_1036 ;
   private short nRcdExists_1036 ;
   private short nIsMod_1036 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1036 ;
   private short RcdFound1036 ;
   private short nBlankRcdUsr1036 ;
   private short A8425Sup_TmpC ;
   private short A11932Sup_Nh2o ;
   private short A7351Sup_Tmp ;
   private short A7614Sup_TmpA ;
   private short RcdFound1035 ;
   private short nIsDirty_1035 ;
   private short nIsDirty_1036 ;
   private int wcpOA7275Sup_Num ;
   private int Z7275Sup_Num ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z7342Sup_Lnf ;
   private int Z7349Sup_Vol ;
   private int Z7358Sup_UndMM ;
   private int Z7667Sup_hd ;
   private int A7667Sup_hd ;
   private int A7275Sup_Num ;
   private int A7342Sup_Lnf ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtSup_Num_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1036_Enabled ;
   private int edtSup_Lnf_Enabled ;
   private int edtSup_Fasco_Enabled ;
   private int edtSup_Fasde_Enabled ;
   private int edtSup_Maq_Enabled ;
   private int edtSup_Cmaq_Enabled ;
   private int edtSup_Tpp_Forecolor ;
   private int edtSup_Tpp_Enabled ;
   private int edtSup_TTF_Enabled ;
   private int edtSup_Vol_Enabled ;
   private int edtSup_Ch2o_Enabled ;
   private int edtSup_Tmp_Enabled ;
   private int edtSup_CVapor_Enabled ;
   private int edtSup_Grupo_Enabled ;
   private int edtSup_TpU_Enabled ;
   private int edtSup_Consum_Enabled ;
   private int edtSup_SValF_Enabled ;
   private int edtSup_Tog_Enabled ;
   private int edtSup_UndMM_Enabled ;
   private int edtSup_CmaqC_Enabled ;
   private int edtSup_Secc_Enabled ;
   private int edtSup_Smod_Enabled ;
   private int edtSup_Smoi_Enabled ;
   private int edtSup_Scif_Enabled ;
   private int edtSup_SProd_Enabled ;
   private int edtSup_CMOD_Enabled ;
   private int edtSup_TmpA_Enabled ;
   private int edtSup_H20n_Enabled ;
   private int edtSup_H20r_Enabled ;
   private int edtSup_Reuso_Enabled ;
   private int edtSup_Ch2or_Enabled ;
   private int edtSup_moiU_Enabled ;
   private int edtSup_cifU_Enabled ;
   private int edtSup_CostL_Enabled ;
   private int edtSup_camt_Forecolor ;
   private int edtSup_camt_Enabled ;
   private int edtSup_usut_Forecolor ;
   private int edtSup_usut_Enabled ;
   private int edtSup_fecht_Enabled ;
   private int edtSup_SVal_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A7281Sup_Und ;
   private int A7349Sup_Vol ;
   private int A7358Sup_UndMM ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtSup_usut_Enabled ;
   private int defedtSup_usut_Forecolor ;
   private int defedtSup_camt_Enabled ;
   private int defedtSup_camt_Forecolor ;
   private int defedtSup_CMOD_Enabled ;
   private int defedtSup_Tmp_Enabled ;
   private int defedtSup_Tpp_Forecolor ;
   private int defedtSup_Cmaq_Enabled ;
   private int defedtSup_Maq_Enabled ;
   private int defedtSup_Fasde_Enabled ;
   private int defedtSup_Fasco_Enabled ;
   private int defedtSup_Lnf_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtSup_Num_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ7275Sup_Num ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7346Sup_Cmaq ;
   private java.math.BigDecimal Z7347Sup_Tpp ;
   private java.math.BigDecimal Z7353Sup_Grupo ;
   private java.math.BigDecimal Z7357Sup_Tog ;
   private java.math.BigDecimal Z7606Sup_Smod ;
   private java.math.BigDecimal Z7607Sup_Smoi ;
   private java.math.BigDecimal Z7608Sup_Scif ;
   private java.math.BigDecimal Z7609Sup_SProd ;
   private java.math.BigDecimal Z7615Sup_H20n ;
   private java.math.BigDecimal Z7616Sup_H20r ;
   private java.math.BigDecimal O7347Sup_Tpp ;
   private java.math.BigDecimal A7286Sup_ConVap ;
   private java.math.BigDecimal A7299Sup_cacpp ;
   private java.math.BigDecimal A8426Sup_conmq ;
   private java.math.BigDecimal A7612Sup_matipu ;
   private java.math.BigDecimal A7283Sup_PminOp ;
   private java.math.BigDecimal AV40oLDTpp ;
   private java.math.BigDecimal A7346Sup_Cmaq ;
   private java.math.BigDecimal A7347Sup_Tpp ;
   private java.math.BigDecimal A7348Sup_TTF ;
   private java.math.BigDecimal A7350Sup_Ch2o ;
   private java.math.BigDecimal A7352Sup_CVapor ;
   private java.math.BigDecimal A7353Sup_Grupo ;
   private java.math.BigDecimal A7354Sup_TpU ;
   private java.math.BigDecimal A7355Sup_Consum ;
   private java.math.BigDecimal A7356Sup_SValF ;
   private java.math.BigDecimal A7357Sup_Tog ;
   private java.math.BigDecimal A7359Sup_CmaqC ;
   private java.math.BigDecimal A7606Sup_Smod ;
   private java.math.BigDecimal A7607Sup_Smoi ;
   private java.math.BigDecimal A7608Sup_Scif ;
   private java.math.BigDecimal A7609Sup_SProd ;
   private java.math.BigDecimal A7610Sup_CMOD ;
   private java.math.BigDecimal A7615Sup_H20n ;
   private java.math.BigDecimal A7616Sup_H20r ;
   private java.math.BigDecimal A7618Sup_Ch2or ;
   private java.math.BigDecimal A7626Sup_moiU ;
   private java.math.BigDecimal A7627Sup_cifU ;
   private java.math.BigDecimal A7629Sup_CostL ;
   private java.math.BigDecimal A7361Sup_SVal ;
   private java.math.BigDecimal T7347Sup_Tpp ;
   private java.math.BigDecimal A7367Sup_Val ;
   private java.math.BigDecimal GXt_decimal5 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal Z7356Sup_SValF ;
   private java.math.BigDecimal Z7361Sup_SVal ;
   private java.math.BigDecimal Z7348Sup_TTF ;
   private java.math.BigDecimal ZV40oLDTpp ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z7343Sup_Fasco ;
   private String Z7344Sup_Fasde ;
   private String Z7345Sup_Maq ;
   private String Z7605Sup_Secc ;
   private String Z7617Sup_Reuso ;
   private String Z7664Sup_usut ;
   private String Z7669Sup_hpp ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A7669Sup_hpp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_35_idx="0001" ;
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
   private String edtSup_Num_Internalname ;
   private String edtSup_Num_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1036 ;
   private String edtavnRcdDeleted_1036_Internalname ;
   private String edtSup_Lnf_Internalname ;
   private String edtSup_Fasco_Internalname ;
   private String edtSup_Fasde_Internalname ;
   private String edtSup_Maq_Internalname ;
   private String edtSup_Cmaq_Internalname ;
   private String edtSup_Tpp_Internalname ;
   private String edtSup_TTF_Internalname ;
   private String edtSup_Vol_Internalname ;
   private String edtSup_Ch2o_Internalname ;
   private String edtSup_Tmp_Internalname ;
   private String edtSup_CVapor_Internalname ;
   private String edtSup_Grupo_Internalname ;
   private String edtSup_TpU_Internalname ;
   private String edtSup_Consum_Internalname ;
   private String edtSup_SValF_Internalname ;
   private String edtSup_Tog_Internalname ;
   private String edtSup_UndMM_Internalname ;
   private String edtSup_CmaqC_Internalname ;
   private String edtSup_Secc_Internalname ;
   private String edtSup_Smod_Internalname ;
   private String edtSup_Smoi_Internalname ;
   private String edtSup_Scif_Internalname ;
   private String edtSup_SProd_Internalname ;
   private String edtSup_CMOD_Internalname ;
   private String edtSup_TmpA_Internalname ;
   private String edtSup_H20n_Internalname ;
   private String edtSup_H20r_Internalname ;
   private String edtSup_Reuso_Internalname ;
   private String edtSup_Ch2or_Internalname ;
   private String edtSup_moiU_Internalname ;
   private String edtSup_cifU_Internalname ;
   private String edtSup_CostL_Internalname ;
   private String edtSup_camt_Internalname ;
   private String edtSup_usut_Internalname ;
   private String edtSup_fecht_Internalname ;
   private String edtSup_SVal_Internalname ;
   private String GX_FocusControl ;
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
   private String AV41Pgmname ;
   private String AV8UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1035 ;
   private String GXCCtl ;
   private String A7343Sup_Fasco ;
   private String A7344Sup_Fasde ;
   private String A7345Sup_Maq ;
   private String A7605Sup_Secc ;
   private String A7617Sup_Reuso ;
   private String A7664Sup_usut ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1036_Jsonclick ;
   private String edtSup_Lnf_Jsonclick ;
   private String edtSup_Fasco_Jsonclick ;
   private String edtSup_Fasde_Jsonclick ;
   private String edtSup_Maq_Jsonclick ;
   private String edtSup_Cmaq_Jsonclick ;
   private String edtSup_Tpp_Jsonclick ;
   private String edtSup_TTF_Jsonclick ;
   private String edtSup_Vol_Jsonclick ;
   private String edtSup_Ch2o_Jsonclick ;
   private String edtSup_Tmp_Jsonclick ;
   private String edtSup_CVapor_Jsonclick ;
   private String edtSup_Grupo_Jsonclick ;
   private String edtSup_TpU_Jsonclick ;
   private String edtSup_Consum_Jsonclick ;
   private String edtSup_SValF_Jsonclick ;
   private String edtSup_Tog_Jsonclick ;
   private String edtSup_UndMM_Jsonclick ;
   private String edtSup_CmaqC_Jsonclick ;
   private String edtSup_Secc_Jsonclick ;
   private String edtSup_Smod_Jsonclick ;
   private String edtSup_Smoi_Jsonclick ;
   private String edtSup_Scif_Jsonclick ;
   private String edtSup_SProd_Jsonclick ;
   private String edtSup_CMOD_Jsonclick ;
   private String edtSup_TmpA_Jsonclick ;
   private String edtSup_H20n_Jsonclick ;
   private String edtSup_H20r_Jsonclick ;
   private String edtSup_Reuso_Jsonclick ;
   private String edtSup_Ch2or_Jsonclick ;
   private String edtSup_moiU_Jsonclick ;
   private String edtSup_cifU_Jsonclick ;
   private String edtSup_CostL_Jsonclick ;
   private String edtSup_camt_Jsonclick ;
   private String edtSup_usut_Jsonclick ;
   private String edtSup_fecht_Jsonclick ;
   private String edtSup_SVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z7665Sup_fecht ;
   private java.util.Date A7665Sup_fecht ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n7666Sup_TtRl ;
   private boolean n7667Sup_hd ;
   private boolean n7668Sup_hrp ;
   private boolean n7669Sup_hpp ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n7281Sup_Und ;
   private boolean n7286Sup_ConVap ;
   private boolean n7299Sup_cacpp ;
   private boolean n8426Sup_conmq ;
   private boolean n7612Sup_matipu ;
   private boolean n8425Sup_TmpC ;
   private boolean n11932Sup_Nh2o ;
   private boolean n7283Sup_PminOp ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n7343Sup_Fasco ;
   private boolean n7344Sup_Fasde ;
   private boolean n7345Sup_Maq ;
   private boolean n7346Sup_Cmaq ;
   private boolean n7347Sup_Tpp ;
   private boolean n7349Sup_Vol ;
   private boolean n7351Sup_Tmp ;
   private boolean n7353Sup_Grupo ;
   private boolean n7357Sup_Tog ;
   private boolean n7358Sup_UndMM ;
   private boolean n7605Sup_Secc ;
   private boolean n7606Sup_Smod ;
   private boolean n7607Sup_Smoi ;
   private boolean n7608Sup_Scif ;
   private boolean n7609Sup_SProd ;
   private boolean n7614Sup_TmpA ;
   private boolean n7615Sup_H20n ;
   private boolean n7616Sup_H20r ;
   private boolean n7617Sup_Reuso ;
   private boolean n7661Sup_camt ;
   private boolean n7664Sup_usut ;
   private boolean n7665Sup_fecht ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00ZZ6_A407EmprNom ;
   private boolean[] T00ZZ6_n407EmprNom ;
   private int[] T00ZZ7_A7275Sup_Num ;
   private String[] T00ZZ7_A407EmprNom ;
   private boolean[] T00ZZ7_n407EmprNom ;
   private String[] T00ZZ7_A396EmprCod ;
   private String[] T00ZZ8_A396EmprCod ;
   private int[] T00ZZ8_A7275Sup_Num ;
   private int[] T00ZZ5_A7275Sup_Num ;
   private String[] T00ZZ5_A396EmprCod ;
   private String[] T00ZZ9_A396EmprCod ;
   private int[] T00ZZ9_A7275Sup_Num ;
   private String[] T00ZZ10_A396EmprCod ;
   private int[] T00ZZ10_A7275Sup_Num ;
   private int[] T00ZZ4_A7275Sup_Num ;
   private String[] T00ZZ4_A396EmprCod ;
   private String[] T00ZZ13_A396EmprCod ;
   private int[] T00ZZ13_A7275Sup_Num ;
   private int[] T00ZZ13_A7342Sup_Lnf ;
   private short[] T00ZZ13_A7362Sup_Lp ;
   private String[] T00ZZ14_A396EmprCod ;
   private int[] T00ZZ14_A7275Sup_Num ;
   private String[] T00ZZ15_A396EmprCod ;
   private int[] T00ZZ15_A7275Sup_Num ;
   private int[] T00ZZ15_A7342Sup_Lnf ;
   private String[] T00ZZ15_A7343Sup_Fasco ;
   private boolean[] T00ZZ15_n7343Sup_Fasco ;
   private String[] T00ZZ15_A7344Sup_Fasde ;
   private boolean[] T00ZZ15_n7344Sup_Fasde ;
   private String[] T00ZZ15_A7345Sup_Maq ;
   private boolean[] T00ZZ15_n7345Sup_Maq ;
   private java.math.BigDecimal[] T00ZZ15_A7346Sup_Cmaq ;
   private boolean[] T00ZZ15_n7346Sup_Cmaq ;
   private java.math.BigDecimal[] T00ZZ15_A7347Sup_Tpp ;
   private boolean[] T00ZZ15_n7347Sup_Tpp ;
   private int[] T00ZZ15_A7349Sup_Vol ;
   private boolean[] T00ZZ15_n7349Sup_Vol ;
   private short[] T00ZZ15_A7351Sup_Tmp ;
   private boolean[] T00ZZ15_n7351Sup_Tmp ;
   private java.math.BigDecimal[] T00ZZ15_A7353Sup_Grupo ;
   private boolean[] T00ZZ15_n7353Sup_Grupo ;
   private java.math.BigDecimal[] T00ZZ15_A7357Sup_Tog ;
   private boolean[] T00ZZ15_n7357Sup_Tog ;
   private int[] T00ZZ15_A7358Sup_UndMM ;
   private boolean[] T00ZZ15_n7358Sup_UndMM ;
   private String[] T00ZZ15_A7605Sup_Secc ;
   private boolean[] T00ZZ15_n7605Sup_Secc ;
   private java.math.BigDecimal[] T00ZZ15_A7606Sup_Smod ;
   private boolean[] T00ZZ15_n7606Sup_Smod ;
   private java.math.BigDecimal[] T00ZZ15_A7607Sup_Smoi ;
   private boolean[] T00ZZ15_n7607Sup_Smoi ;
   private java.math.BigDecimal[] T00ZZ15_A7608Sup_Scif ;
   private boolean[] T00ZZ15_n7608Sup_Scif ;
   private java.math.BigDecimal[] T00ZZ15_A7609Sup_SProd ;
   private boolean[] T00ZZ15_n7609Sup_SProd ;
   private short[] T00ZZ15_A7614Sup_TmpA ;
   private boolean[] T00ZZ15_n7614Sup_TmpA ;
   private java.math.BigDecimal[] T00ZZ15_A7615Sup_H20n ;
   private boolean[] T00ZZ15_n7615Sup_H20n ;
   private java.math.BigDecimal[] T00ZZ15_A7616Sup_H20r ;
   private boolean[] T00ZZ15_n7616Sup_H20r ;
   private String[] T00ZZ15_A7617Sup_Reuso ;
   private boolean[] T00ZZ15_n7617Sup_Reuso ;
   private byte[] T00ZZ15_A7661Sup_camt ;
   private boolean[] T00ZZ15_n7661Sup_camt ;
   private String[] T00ZZ15_A7664Sup_usut ;
   private boolean[] T00ZZ15_n7664Sup_usut ;
   private java.util.Date[] T00ZZ15_A7665Sup_fecht ;
   private boolean[] T00ZZ15_n7665Sup_fecht ;
   private byte[] T00ZZ15_A7666Sup_TtRl ;
   private boolean[] T00ZZ15_n7666Sup_TtRl ;
   private int[] T00ZZ15_A7667Sup_hd ;
   private boolean[] T00ZZ15_n7667Sup_hd ;
   private byte[] T00ZZ15_A7668Sup_hrp ;
   private boolean[] T00ZZ15_n7668Sup_hrp ;
   private String[] T00ZZ15_A7669Sup_hpp ;
   private boolean[] T00ZZ15_n7669Sup_hpp ;
   private short[] T00ZZ15_A8425Sup_TmpC ;
   private boolean[] T00ZZ15_n8425Sup_TmpC ;
   private short[] T00ZZ15_A11932Sup_Nh2o ;
   private boolean[] T00ZZ15_n11932Sup_Nh2o ;
   private String[] T00ZZ16_A396EmprCod ;
   private int[] T00ZZ16_A7275Sup_Num ;
   private int[] T00ZZ16_A7342Sup_Lnf ;
   private String[] T00ZZ3_A396EmprCod ;
   private int[] T00ZZ3_A7275Sup_Num ;
   private int[] T00ZZ3_A7342Sup_Lnf ;
   private String[] T00ZZ3_A7343Sup_Fasco ;
   private boolean[] T00ZZ3_n7343Sup_Fasco ;
   private String[] T00ZZ3_A7344Sup_Fasde ;
   private boolean[] T00ZZ3_n7344Sup_Fasde ;
   private String[] T00ZZ3_A7345Sup_Maq ;
   private boolean[] T00ZZ3_n7345Sup_Maq ;
   private java.math.BigDecimal[] T00ZZ3_A7346Sup_Cmaq ;
   private boolean[] T00ZZ3_n7346Sup_Cmaq ;
   private java.math.BigDecimal[] T00ZZ3_A7347Sup_Tpp ;
   private boolean[] T00ZZ3_n7347Sup_Tpp ;
   private int[] T00ZZ3_A7349Sup_Vol ;
   private boolean[] T00ZZ3_n7349Sup_Vol ;
   private short[] T00ZZ3_A7351Sup_Tmp ;
   private boolean[] T00ZZ3_n7351Sup_Tmp ;
   private java.math.BigDecimal[] T00ZZ3_A7353Sup_Grupo ;
   private boolean[] T00ZZ3_n7353Sup_Grupo ;
   private java.math.BigDecimal[] T00ZZ3_A7357Sup_Tog ;
   private boolean[] T00ZZ3_n7357Sup_Tog ;
   private int[] T00ZZ3_A7358Sup_UndMM ;
   private boolean[] T00ZZ3_n7358Sup_UndMM ;
   private String[] T00ZZ3_A7605Sup_Secc ;
   private boolean[] T00ZZ3_n7605Sup_Secc ;
   private java.math.BigDecimal[] T00ZZ3_A7606Sup_Smod ;
   private boolean[] T00ZZ3_n7606Sup_Smod ;
   private java.math.BigDecimal[] T00ZZ3_A7607Sup_Smoi ;
   private boolean[] T00ZZ3_n7607Sup_Smoi ;
   private java.math.BigDecimal[] T00ZZ3_A7608Sup_Scif ;
   private boolean[] T00ZZ3_n7608Sup_Scif ;
   private java.math.BigDecimal[] T00ZZ3_A7609Sup_SProd ;
   private boolean[] T00ZZ3_n7609Sup_SProd ;
   private short[] T00ZZ3_A7614Sup_TmpA ;
   private boolean[] T00ZZ3_n7614Sup_TmpA ;
   private java.math.BigDecimal[] T00ZZ3_A7615Sup_H20n ;
   private boolean[] T00ZZ3_n7615Sup_H20n ;
   private java.math.BigDecimal[] T00ZZ3_A7616Sup_H20r ;
   private boolean[] T00ZZ3_n7616Sup_H20r ;
   private String[] T00ZZ3_A7617Sup_Reuso ;
   private boolean[] T00ZZ3_n7617Sup_Reuso ;
   private byte[] T00ZZ3_A7661Sup_camt ;
   private boolean[] T00ZZ3_n7661Sup_camt ;
   private String[] T00ZZ3_A7664Sup_usut ;
   private boolean[] T00ZZ3_n7664Sup_usut ;
   private java.util.Date[] T00ZZ3_A7665Sup_fecht ;
   private boolean[] T00ZZ3_n7665Sup_fecht ;
   private byte[] T00ZZ3_A7666Sup_TtRl ;
   private boolean[] T00ZZ3_n7666Sup_TtRl ;
   private int[] T00ZZ3_A7667Sup_hd ;
   private boolean[] T00ZZ3_n7667Sup_hd ;
   private byte[] T00ZZ3_A7668Sup_hrp ;
   private boolean[] T00ZZ3_n7668Sup_hrp ;
   private String[] T00ZZ3_A7669Sup_hpp ;
   private boolean[] T00ZZ3_n7669Sup_hpp ;
   private short[] T00ZZ3_A8425Sup_TmpC ;
   private boolean[] T00ZZ3_n8425Sup_TmpC ;
   private short[] T00ZZ3_A11932Sup_Nh2o ;
   private boolean[] T00ZZ3_n11932Sup_Nh2o ;
   private String[] T00ZZ2_A396EmprCod ;
   private int[] T00ZZ2_A7275Sup_Num ;
   private int[] T00ZZ2_A7342Sup_Lnf ;
   private String[] T00ZZ2_A7343Sup_Fasco ;
   private boolean[] T00ZZ2_n7343Sup_Fasco ;
   private String[] T00ZZ2_A7344Sup_Fasde ;
   private boolean[] T00ZZ2_n7344Sup_Fasde ;
   private String[] T00ZZ2_A7345Sup_Maq ;
   private boolean[] T00ZZ2_n7345Sup_Maq ;
   private java.math.BigDecimal[] T00ZZ2_A7346Sup_Cmaq ;
   private boolean[] T00ZZ2_n7346Sup_Cmaq ;
   private java.math.BigDecimal[] T00ZZ2_A7347Sup_Tpp ;
   private boolean[] T00ZZ2_n7347Sup_Tpp ;
   private int[] T00ZZ2_A7349Sup_Vol ;
   private boolean[] T00ZZ2_n7349Sup_Vol ;
   private short[] T00ZZ2_A7351Sup_Tmp ;
   private boolean[] T00ZZ2_n7351Sup_Tmp ;
   private java.math.BigDecimal[] T00ZZ2_A7353Sup_Grupo ;
   private boolean[] T00ZZ2_n7353Sup_Grupo ;
   private java.math.BigDecimal[] T00ZZ2_A7357Sup_Tog ;
   private boolean[] T00ZZ2_n7357Sup_Tog ;
   private int[] T00ZZ2_A7358Sup_UndMM ;
   private boolean[] T00ZZ2_n7358Sup_UndMM ;
   private String[] T00ZZ2_A7605Sup_Secc ;
   private boolean[] T00ZZ2_n7605Sup_Secc ;
   private java.math.BigDecimal[] T00ZZ2_A7606Sup_Smod ;
   private boolean[] T00ZZ2_n7606Sup_Smod ;
   private java.math.BigDecimal[] T00ZZ2_A7607Sup_Smoi ;
   private boolean[] T00ZZ2_n7607Sup_Smoi ;
   private java.math.BigDecimal[] T00ZZ2_A7608Sup_Scif ;
   private boolean[] T00ZZ2_n7608Sup_Scif ;
   private java.math.BigDecimal[] T00ZZ2_A7609Sup_SProd ;
   private boolean[] T00ZZ2_n7609Sup_SProd ;
   private short[] T00ZZ2_A7614Sup_TmpA ;
   private boolean[] T00ZZ2_n7614Sup_TmpA ;
   private java.math.BigDecimal[] T00ZZ2_A7615Sup_H20n ;
   private boolean[] T00ZZ2_n7615Sup_H20n ;
   private java.math.BigDecimal[] T00ZZ2_A7616Sup_H20r ;
   private boolean[] T00ZZ2_n7616Sup_H20r ;
   private String[] T00ZZ2_A7617Sup_Reuso ;
   private boolean[] T00ZZ2_n7617Sup_Reuso ;
   private byte[] T00ZZ2_A7661Sup_camt ;
   private boolean[] T00ZZ2_n7661Sup_camt ;
   private String[] T00ZZ2_A7664Sup_usut ;
   private boolean[] T00ZZ2_n7664Sup_usut ;
   private java.util.Date[] T00ZZ2_A7665Sup_fecht ;
   private boolean[] T00ZZ2_n7665Sup_fecht ;
   private byte[] T00ZZ2_A7666Sup_TtRl ;
   private boolean[] T00ZZ2_n7666Sup_TtRl ;
   private int[] T00ZZ2_A7667Sup_hd ;
   private boolean[] T00ZZ2_n7667Sup_hd ;
   private byte[] T00ZZ2_A7668Sup_hrp ;
   private boolean[] T00ZZ2_n7668Sup_hrp ;
   private String[] T00ZZ2_A7669Sup_hpp ;
   private boolean[] T00ZZ2_n7669Sup_hpp ;
   private short[] T00ZZ2_A8425Sup_TmpC ;
   private boolean[] T00ZZ2_n8425Sup_TmpC ;
   private short[] T00ZZ2_A11932Sup_Nh2o ;
   private boolean[] T00ZZ2_n11932Sup_Nh2o ;
   private String[] T00ZZ20_A396EmprCod ;
   private int[] T00ZZ20_A7275Sup_Num ;
   private int[] T00ZZ20_A7342Sup_Lnf ;
   private short[] T00ZZ20_A7362Sup_Lp ;
   private String[] T00ZZ21_A396EmprCod ;
   private int[] T00ZZ21_A7275Sup_Num ;
   private int[] T00ZZ21_A7342Sup_Lnf ;
   private String[] T00ZZ22_A407EmprNom ;
   private boolean[] T00ZZ22_n407EmprNom ;
   private String[] T00ZZ23_A396EmprCod ;
   private int[] T00ZZ23_A7275Sup_Num ;
   private int[] T00ZZ23_A7342Sup_Lnf ;
   private short[] T00ZZ23_A7362Sup_Lp ;
   private String[] T00ZZ23_A7363Sup_Prdc ;
   private boolean[] T00ZZ23_n7363Sup_Prdc ;
   private java.math.BigDecimal[] T00ZZ23_A7366Sup_Prec ;
   private boolean[] T00ZZ23_n7366Sup_Prec ;
   private java.math.BigDecimal[] T00ZZ23_A7365Sup_Cant ;
   private boolean[] T00ZZ23_n7365Sup_Cant ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcostpt__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostpt__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostpt__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostpt__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcostpt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00ZZ2", "SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Fasco, Sup_Fasde, Sup_Maq, Sup_Cmaq, Sup_Tpp, Sup_Vol, Sup_Tmp, Sup_Grupo, Sup_Tog, Sup_UndMM, Sup_Secc, Sup_Smod, Sup_Smoi, Sup_Scif, Sup_SProd, Sup_TmpA, Sup_H20n, Sup_H20r, Sup_Reuso, Sup_camt, Sup_usut, Sup_fecht, Sup_TtRl, Sup_hd, Sup_hrp, Sup_hpp, Sup_TmpC, Sup_Nh2o FROM TXPCOST01 WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ?  FOR UPDATE OF Sup_Fasco, Sup_Fasde, Sup_Maq, Sup_Cmaq, Sup_Tpp, Sup_Vol, Sup_Tmp, Sup_Grupo, Sup_Tog, Sup_UndMM, Sup_Secc, Sup_Smod, Sup_Smoi, Sup_Scif, Sup_SProd, Sup_TmpA, Sup_H20n, Sup_H20r, Sup_Reuso, Sup_camt, Sup_usut, Sup_fecht, Sup_TtRl, Sup_hd, Sup_hrp, Sup_hpp, Sup_TmpC, Sup_Nh2o NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZZ3", "SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Fasco, Sup_Fasde, Sup_Maq, Sup_Cmaq, Sup_Tpp, Sup_Vol, Sup_Tmp, Sup_Grupo, Sup_Tog, Sup_UndMM, Sup_Secc, Sup_Smod, Sup_Smoi, Sup_Scif, Sup_SProd, Sup_TmpA, Sup_H20n, Sup_H20r, Sup_Reuso, Sup_camt, Sup_usut, Sup_fecht, Sup_TtRl, Sup_hd, Sup_hrp, Sup_hpp, Sup_TmpC, Sup_Nh2o FROM TXPCOST01 WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZZ4", "SELECT Sup_Num, EmprCod FROM TXPCOST00 WHERE EmprCod = ? AND Sup_Num = ?  FOR UPDATE OF Sup_Num NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ5", "SELECT Sup_Num, EmprCod FROM TXPCOST00 WHERE EmprCod = ? AND Sup_Num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ7", "SELECT /*+ FIRST_ROWS(1) */ TM1.Sup_Num, T2.EmprNom, TM1.EmprCod FROM (TXPCOST00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Sup_Num = ? ORDER BY TM1.EmprCod, TM1.Sup_Num ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Sup_Num FROM TXPCOST00 WHERE EmprCod = ? AND Sup_Num = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Sup_Num FROM TXPCOST00 WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod, Sup_Num) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Sup_Num FROM TXPCOST00 WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod DESC, Sup_Num DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00ZZ11", "INSERT INTO TXPCOST00(Sup_Num, EmprCod, Sup_OpNit, Sup_Hdr, Sup_Hdrr, Sup_hdrp, Sup_Kgs, Sup_Und, Sup_UltL, Sup_PminOp, Sup_Produc, Sup_ValLtH, Sup_ConVap, Sup_KgsOp, Sup_UndOp, Sup_Fech, Sup_Usu, Sup_cacpp, Sup_cafop, Sup_moi, Sup_cif, Sup_trm, Sup_Artc, Sup_ArtD, Sup_Edp, Sup_Estil, Sup_Ref, Sup_Contr, Sup_EncCli, Sup_OpCli, Sup_Proc, Sup_PrecP0, Sup_PrecP1, Sup_PrecP2, Sup_PrecP3, Sup_PrecP4, Sup_PrecP5, Sup_PrecP6, Sup_PrecP7, Sup_PrecP8, Sup_PrecP9, Sup_St, Sup_usua, Sup_Feca, Sup_term, Sup_Pra0, Sup_Pra1, Sup_Pra2, Sup_Pra3, Sup_Pra4, Sup_Pra5, Sup_Pra6, Sup_Pra7, Sup_Pra8, Sup_Pra9, Sup_ValLHr, Sup_matipu, Sup_trnpu, Sup_STtRl, Sup_CteFij, Sup_conmq) VALUES(?, ?, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCOST00")
         ,new UpdateCursor("T00ZZ12", "DELETE FROM TXPCOST00  WHERE EmprCod = ? AND Sup_Num = ?", GX_NOMASK, "TXPCOST00")
         ,new ForEachCursor("T00ZZ13", "SELECT * FROM (SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Lp FROM TXPCOST0p WHERE EmprCod = ? AND Sup_Num = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Sup_Num FROM TXPCOST00 WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod, Sup_Num ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ15", "SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Fasco, Sup_Fasde, Sup_Maq, Sup_Cmaq, Sup_Tpp, Sup_Vol, Sup_Tmp, Sup_Grupo, Sup_Tog, Sup_UndMM, Sup_Secc, Sup_Smod, Sup_Smoi, Sup_Scif, Sup_SProd, Sup_TmpA, Sup_H20n, Sup_H20r, Sup_Reuso, Sup_camt, Sup_usut, Sup_fecht, Sup_TtRl, Sup_hd, Sup_hrp, Sup_hpp, Sup_TmpC, Sup_Nh2o FROM TXPCOST01 WHERE EmprCod = ? and Sup_Num = ? and Sup_Lnf = ? ORDER BY EmprCod, Sup_Num, Sup_Lnf ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZZ16", "SELECT EmprCod, Sup_Num, Sup_Lnf FROM TXPCOST01 WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00ZZ17", "INSERT INTO TXPCOST01(EmprCod, Sup_Num, Sup_Lnf, Sup_Fasco, Sup_Fasde, Sup_Maq, Sup_Cmaq, Sup_Tpp, Sup_Vol, Sup_Tmp, Sup_Grupo, Sup_Tog, Sup_UndMM, Sup_Secc, Sup_Smod, Sup_Smoi, Sup_Scif, Sup_SProd, Sup_TmpA, Sup_H20n, Sup_H20r, Sup_Reuso, Sup_camt, Sup_usut, Sup_fecht, Sup_TtRl, Sup_hd, Sup_hrp, Sup_hpp, Sup_TmpC, Sup_Nh2o, Sup_Ulp, Sup_Rent1, Sup_Rent2, Sup_Rent3, Sup_Rent4, Sup_Rent5, Sup_TrmL, Sup_PreExt, Sup_Val1M, Sup_Val2M, Sup_Val3M, Sup_val4M, Sup_Val5M) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCOST01")
         ,new UpdateCursor("T00ZZ18", "UPDATE TXPCOST01 SET Sup_Fasco=?, Sup_Fasde=?, Sup_Maq=?, Sup_Cmaq=?, Sup_Tpp=?, Sup_Vol=?, Sup_Tmp=?, Sup_Grupo=?, Sup_Tog=?, Sup_UndMM=?, Sup_Secc=?, Sup_Smod=?, Sup_Smoi=?, Sup_Scif=?, Sup_SProd=?, Sup_TmpA=?, Sup_H20n=?, Sup_H20r=?, Sup_Reuso=?, Sup_camt=?, Sup_usut=?, Sup_fecht=?, Sup_TtRl=?, Sup_hd=?, Sup_hrp=?, Sup_hpp=?, Sup_TmpC=?, Sup_Nh2o=?  WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ?", GX_NOMASK, "TXPCOST01")
         ,new UpdateCursor("T00ZZ19", "DELETE FROM TXPCOST01  WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ?", GX_NOMASK, "TXPCOST01")
         ,new ForEachCursor("T00ZZ20", "SELECT * FROM (SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Lp FROM TXPCOST0p WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00ZZ21", "SELECT EmprCod, Sup_Num, Sup_Lnf FROM TXPCOST01 WHERE EmprCod = ? and Sup_Num = ? ORDER BY EmprCod, Sup_Num, Sup_Lnf ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZZ22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00ZZ23", "SELECT EmprCod, Sup_Num, Sup_Lnf, Sup_Lp, Sup_Prdc, Sup_Prec, Sup_Cant FROM TXPCOST0p WHERE EmprCod = ? AND Sup_Num = ? AND Sup_Lnf = ? ORDER BY EmprCod, Sup_Num, Sup_Lnf ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(20,3);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(21,3);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(31);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 100);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[42]).byteValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 8);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[46], false);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[50]).intValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[52]).byteValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[58]).shortValue());
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 2);
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
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 8);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[49]).byteValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               stmt.setString(29, (String)parms[56], 3);
               stmt.setInt(30, ((Number) parms[57]).intValue());
               stmt.setInt(31, ((Number) parms[58]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

