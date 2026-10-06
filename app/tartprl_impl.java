package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tartprl_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A758ProCod) ;
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
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCESOS", ""), (short)(0)) ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV17UsurCod = httpContext.GetPar( "UsurCod") ;
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

   public tartprl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tartprl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tartprl_impl.class ));
   }

   public tartprl_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkProProvi = UIFactory.getCheckbox(this);
      chkProAct = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TARTPRL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TARTPRL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TARTPRL.htm");
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
         nBlankRcdCount11 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_11 = (short)(1) ;
            scanStart1AA11( ) ;
            while ( RcdFound11 != 0 )
            {
               init_level_properties11( ) ;
               getByPrimaryKey1AA11( ) ;
               addRow1AA11( ) ;
               scanNext1AA11( ) ;
            }
            scanEnd1AA11( ) ;
            nBlankRcdCount11 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1AA11( ) ;
         standaloneModal1AA11( ) ;
         sMode11 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1AA11( ) ;
            edtavnRcdDeleted_11_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_11_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_11_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            chkProProvi.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROPROVI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkProProvi.getInternalname(), "Enabled", GXutil.ltrimstr( chkProProvi.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
            edtDscCFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSCCFA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDscCFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscCFa_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            chkProAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROACT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProAct.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
            edtProUserA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtProFecA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtProUserM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtProFecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_11 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AA11( ) ;
            }
            sendRow1AA11( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount11 = (short)(5) ;
         nRcdExists_11 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AA11( ) ;
            while ( RcdFound11 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5011( ) ;
               init_level_properties11( ) ;
               standaloneNotModal1AA11( ) ;
               getByPrimaryKey1AA11( ) ;
               standaloneModal1AA11( ) ;
               addRow1AA11( ) ;
               scanNext1AA11( ) ;
            }
            scanEnd1AA11( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode11 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_5011( ) ;
      initAll1AA11( ) ;
      init_level_properties11( ) ;
      nRcdExists_11 = (short)(0) ;
      nIsMod_11 = (short)(0) ;
      nRcdDeleted_11 = (short)(0) ;
      nBlankRcdCount11 = (short)(nBlankRcdUsr11+nBlankRcdCount11) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount11 > 0 )
      {
         standaloneNotModal1AA11( ) ;
         standaloneModal1AA11( ) ;
         addRow1AA11( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount11 = (short)(nBlankRcdCount11-1) ;
      }
      Gx_mode = sMode11 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TARTPRL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TARTPRL.htm");
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
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
         Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TARTPRL");
         A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
         n69ArtDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         forbiddenHiddens.add("ArtDsc", GXutil.rtrim( localUtil.format( A69ArtDsc, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tartprl:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
            initAll1AA10( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_11_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1AA10( ) ;
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

   public void confirm_1AA0( )
   {
      beforeValidate1AA10( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1AA10( ) ;
         }
         else
         {
            checkExtendedTable1AA10( ) ;
            if ( AnyError == 0 )
            {
               zm1AA10( 16) ;
               zm1AA10( 17) ;
            }
            closeExtendedTableCursors1AA10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_1AA11( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1AA0( ) ;
      }
   }

   public void confirm_1AA11( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1AA11( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            getKey1AA11( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               if ( RcdFound11 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AA11( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AA11( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1AA11( 19) ;
                     }
                     closeExtendedTableCursors1AA11( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound11 != 0 )
               {
                  if ( nRcdDeleted_11 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AA11( ) ;
                     load1AA11( ) ;
                     beforeValidate1AA11( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AA11( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_11 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AA11( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AA11( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1AA11( 19) ;
                           }
                           closeExtendedTableCursors1AA11( ) ;
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
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_11_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( chkProProvi.getInternalname(), ((GXutil.strcmp(A5289ProProvi, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtDscCFa_Internalname, GXutil.rtrim( A10026DscCFa)) ;
         httpContext.changePostValue( chkProAct.getInternalname(), ((GXutil.strcmp(A10412ProAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtProUserA_Internalname, GXutil.rtrim( A10553ProUserA)) ;
         httpContext.changePostValue( edtProFecA_Internalname, localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtProUserM_Internalname, GXutil.rtrim( A10555ProUserM)) ;
         httpContext.changePostValue( edtProFecM_Internalname, localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_50_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10412ProAct_"+sGXsfl_50_idx, GXutil.rtrim( Z10412ProAct)) ;
         httpContext.changePostValue( "ZT_"+"Z10553ProUserA_"+sGXsfl_50_idx, GXutil.rtrim( Z10553ProUserA)) ;
         httpContext.changePostValue( "ZT_"+"Z10554ProFecA_"+sGXsfl_50_idx, localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10555ProUserM_"+sGXsfl_50_idx, GXutil.rtrim( Z10555ProUserM)) ;
         httpContext.changePostValue( "ZT_"+"Z10556ProFecM_"+sGXsfl_50_idx, localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10026DscCFa_"+sGXsfl_50_idx, GXutil.rtrim( Z10026DscCFa)) ;
         httpContext.changePostValue( "T10412ProAct_"+sGXsfl_50_idx, GXutil.rtrim( O10412ProAct)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_11_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_11_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPROVI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProProvi.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSCCFA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDscCFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AA0( )
   {
   }

   public void zm1AA10( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T01AA6_A69ArtDsc[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      /* Using cursor T01AA7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AA7_A407EmprNom[0] ;
      n407EmprNom = T01AA7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01AA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AA8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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

   public void load1AA10( )
   {
      /* Using cursor T01AA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A279CliNom = T01AA9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T01AA9_A407EmprNom[0] ;
         n407EmprNom = T01AA9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A69ArtDsc = T01AA9_A69ArtDsc[0] ;
         n69ArtDsc = T01AA9_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         zm1AA10( -15) ;
      }
      pr_default.close(7);
      onLoadActions1AA10( ) ;
   }

   public void onLoadActions1AA10( )
   {
   }

   public void checkExtendedTable1AA10( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1AA10( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1AA10( )
   {
      /* Using cursor T01AA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01AA6_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01AA6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AA6_A252CliCod[0] == A252CliCod ) )
      {
         zm1AA10( 15) ;
         RcdFound10 = (short)(1) ;
         A69ArtDsc = T01AA6_A69ArtDsc[0] ;
         n69ArtDsc = T01AA6_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AA10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey1AA10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey1AA10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1AA10( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T01AA11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01AA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AA11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AA11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01AA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AA11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AA11_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T01AA12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01AA12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AA12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AA12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01AA12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01AA12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AA12_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AA10( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1AA10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
               update1AA10( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1AA10( ) ;
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
                  insert1AA10( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      getKey1AA10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tartprl");
   }

   public void insert_check( )
   {
      confirm_1AA0( ) ;
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
      if ( RcdFound10 == 0 )
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
      scanStart1AA10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AA10( ) ;
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
      if ( RcdFound10 == 0 )
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
      if ( RcdFound10 == 0 )
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
      scanStart1AA10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext1AA10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1AA10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AA10( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AA5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z69ArtDsc, T01AA5_A69ArtDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T01AA5_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T01AA5_A69ArtDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AA10( )
   {
      beforeValidate1AA10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AA10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AA10( 0) ;
         checkOptimisticConcurrency1AA10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AA10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AA10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AA13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
                        processLevel1AA10( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AA0( ) ;
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
            load1AA10( ) ;
         }
         endLevel1AA10( ) ;
      }
      closeExtendedTableCursors1AA10( ) ;
   }

   public void update1AA10( )
   {
      beforeValidate1AA10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AA10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AA10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AA10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AA10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AA14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AA10( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
                     tartprl_impl.this.A396EmprCod = GXv_char1[0] ;
                     tartprl_impl.this.A252CliCod = GXv_int2[0] ;
                     tartprl_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AA10( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AA0( ) ;
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
         endLevel1AA10( ) ;
      }
      closeExtendedTableCursors1AA10( ) ;
   }

   public void deferredUpdate1AA10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AA10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AA10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AA10( ) ;
         afterConfirm1AA10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AA10( ) ;
            if ( AnyError == 0 )
            {
               scanStart1AA11( ) ;
               while ( RcdFound11 != 0 )
               {
                  getByPrimaryKey1AA11( ) ;
                  delete1AA11( ) ;
                  scanNext1AA11( ) ;
               }
               scanEnd1AA11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AA15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound10 == 0 )
                        {
                           initAll1AA10( ) ;
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
                        resetCaption1AA0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AA10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AA10( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01AA16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01AA17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01AA18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01AA19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01AA20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01AA21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01AA22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01AA23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01AA24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01AA25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01AA26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01AA27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01AA28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01AA29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01AA30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01AA31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01AA32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01AA33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01AA34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01AA35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01AA36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01AA37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01AA38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01AA39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01AA40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01AA41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01AA42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01AA43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01AA44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01AA45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01AA46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01AA47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01AA48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01AA49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01AA50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01AA51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01AA52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01AA53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01AA54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01AA55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01AA56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01AA57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01AA58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01AA59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
      }
   }

   public void processNestedLevel1AA11( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1AA11( ) ;
         if ( ( nRcdExists_11 != 0 ) || ( nIsMod_11 != 0 ) )
         {
            standaloneNotModal1AA11( ) ;
            getKey1AA11( ) ;
            if ( ( nRcdExists_11 == 0 ) && ( nRcdDeleted_11 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AA11( ) ;
            }
            else
            {
               if ( RcdFound11 != 0 )
               {
                  if ( ( nRcdDeleted_11 != 0 ) && ( nRcdExists_11 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AA11( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_11 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AA11( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_11 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_11_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( chkProProvi.getInternalname(), ((GXutil.strcmp(A5289ProProvi, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtDscCFa_Internalname, GXutil.rtrim( A10026DscCFa)) ;
         httpContext.changePostValue( chkProAct.getInternalname(), ((GXutil.strcmp(A10412ProAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtProUserA_Internalname, GXutil.rtrim( A10553ProUserA)) ;
         httpContext.changePostValue( edtProFecA_Internalname, localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtProUserM_Internalname, GXutil.rtrim( A10555ProUserM)) ;
         httpContext.changePostValue( edtProFecM_Internalname, localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_50_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z10412ProAct_"+sGXsfl_50_idx, GXutil.rtrim( Z10412ProAct)) ;
         httpContext.changePostValue( "ZT_"+"Z10553ProUserA_"+sGXsfl_50_idx, GXutil.rtrim( Z10553ProUserA)) ;
         httpContext.changePostValue( "ZT_"+"Z10554ProFecA_"+sGXsfl_50_idx, localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10555ProUserM_"+sGXsfl_50_idx, GXutil.rtrim( Z10555ProUserM)) ;
         httpContext.changePostValue( "ZT_"+"Z10556ProFecM_"+sGXsfl_50_idx, localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10026DscCFa_"+sGXsfl_50_idx, GXutil.rtrim( Z10026DscCFa)) ;
         httpContext.changePostValue( "T10412ProAct_"+sGXsfl_50_idx, GXutil.rtrim( O10412ProAct)) ;
         httpContext.changePostValue( "nRcdDeleted_11_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_11_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_11_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_11 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_11_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_11_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROPROVI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProProvi.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DSCCFA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDscCFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROUSERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFECM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AA11( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_11 = (short)(0) ;
      nIsMod_11 = (short)(0) ;
      nRcdDeleted_11 = (short)(0) ;
   }

   public void processLevel1AA10( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevel1AA11( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1AA10( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1AA10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tartprl");
         if ( AnyError == 0 )
         {
            confirmValues1AA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tartprl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AA10( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A252CliCod = A252CliCod ;
      this.A65ArtCod = A65ArtCod ;
      /* Scan By routine */
      /* Using cursor T01AA60 */
      pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AA10( )
   {
      /* Scan next routine */
      pr_default.readNext(58);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(58) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
   }

   public void scanEnd1AA10( )
   {
      pr_default.close(58);
   }

   public void afterConfirm1AA10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AA10( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AA10( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AA10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AA10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AA10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AA10( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
   }

   public void zm1AA11( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10412ProAct = T01AA3_A10412ProAct[0] ;
            Z10553ProUserA = T01AA3_A10553ProUserA[0] ;
            Z10554ProFecA = T01AA3_A10554ProFecA[0] ;
            Z10555ProUserM = T01AA3_A10555ProUserM[0] ;
            Z10556ProFecM = T01AA3_A10556ProFecM[0] ;
            Z10026DscCFa = T01AA3_A10026DscCFa[0] ;
         }
         else
         {
            Z10412ProAct = A10412ProAct ;
            Z10553ProUserA = A10553ProUserA ;
            Z10554ProFecA = A10554ProFecA ;
            Z10555ProUserM = A10555ProUserM ;
            Z10556ProFecM = A10556ProFecM ;
            Z10026DscCFa = A10026DscCFa ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z10412ProAct = A10412ProAct ;
         Z10553ProUserA = A10553ProUserA ;
         Z10554ProFecA = A10554ProFecA ;
         Z10555ProUserM = A10555ProUserM ;
         Z10556ProFecM = A10556ProFecM ;
         Z10026DscCFa = A10026DscCFa ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z5289ProProvi = A5289ProProvi ;
      }
   }

   public void standaloneNotModal1AA11( )
   {
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void standaloneModal1AA11( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A10412ProAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A10412ProAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10553ProUserA)==0) && ( Gx_BScreen == 0 ) )
      {
         A10553ProUserA = AV17UsurCod ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10554ProFecA) && ( Gx_BScreen == 0 ) )
      {
         A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1AA11( )
   {
      /* Using cursor T01AA61 */
      pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(59) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A10412ProAct = T01AA61_A10412ProAct[0] ;
         A10553ProUserA = T01AA61_A10553ProUserA[0] ;
         A10554ProFecA = T01AA61_A10554ProFecA[0] ;
         A10555ProUserM = T01AA61_A10555ProUserM[0] ;
         A10556ProFecM = T01AA61_A10556ProFecM[0] ;
         A759ProDsc = T01AA61_A759ProDsc[0] ;
         A5289ProProvi = T01AA61_A5289ProProvi[0] ;
         A10026DscCFa = T01AA61_A10026DscCFa[0] ;
         zm1AA11( -18) ;
      }
      pr_default.close(59);
      onLoadActions1AA11( ) ;
   }

   public void onLoadActions1AA11( )
   {
   }

   public void checkExtendedTable1AA11( )
   {
      nIsDirty_11 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1AA11( ) ;
      /* Using cursor T01AA4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01AA4_A759ProDsc[0] ;
      A5289ProProvi = T01AA4_A5289ProProvi[0] ;
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A10412ProAct, "S") == 0 ) || ( GXutil.strcmp(A10412ProAct, "N") == 0 ) ) )
      {
         GXCCtl = "PROACT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Activo?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = chkProAct.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1AA11( )
   {
      pr_default.close(2);
   }

   public void enableDisable1AA11( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01AA62 */
      pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(60) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01AA62_A759ProDsc[0] ;
      A5289ProProvi = T01AA62_A5289ProProvi[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5289ProProvi))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(60) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(60);
   }

   public void getKey1AA11( )
   {
      /* Using cursor T01AA63 */
      pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(61);
   }

   public void getByPrimaryKey1AA11( )
   {
      /* Using cursor T01AA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(1) != 101) && ( T01AA3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01AA3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01AA3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1AA11( 18) ;
         RcdFound11 = (short)(1) ;
         initializeNonKey1AA11( ) ;
         A10412ProAct = T01AA3_A10412ProAct[0] ;
         A10553ProUserA = T01AA3_A10553ProUserA[0] ;
         A10554ProFecA = T01AA3_A10554ProFecA[0] ;
         A10555ProUserM = T01AA3_A10555ProUserM[0] ;
         A10556ProFecM = T01AA3_A10556ProFecM[0] ;
         A10026DscCFa = T01AA3_A10026DscCFa[0] ;
         A758ProCod = T01AA3_A758ProCod[0] ;
         n758ProCod = T01AA3_n758ProCod[0] ;
         O10412ProAct = A10412ProAct ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AA11( ) ;
         load1AA11( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey1AA11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AA11( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AA11( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AA11( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10412ProAct, T01AA2_A10412ProAct[0]) != 0 ) || ( GXutil.strcmp(Z10553ProUserA, T01AA2_A10553ProUserA[0]) != 0 ) || !( GXutil.dateCompare(Z10554ProFecA, T01AA2_A10554ProFecA[0]) ) || ( GXutil.strcmp(Z10555ProUserM, T01AA2_A10555ProUserM[0]) != 0 ) || !( GXutil.dateCompare(Z10556ProFecM, T01AA2_A10556ProFecM[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10026DscCFa, T01AA2_A10026DscCFa[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10412ProAct, T01AA2_A10412ProAct[0]) != 0 )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"ProAct");
               GXutil.writeLogRaw("Old: ",Z10412ProAct);
               GXutil.writeLogRaw("Current: ",T01AA2_A10412ProAct[0]);
            }
            if ( GXutil.strcmp(Z10553ProUserA, T01AA2_A10553ProUserA[0]) != 0 )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"ProUserA");
               GXutil.writeLogRaw("Old: ",Z10553ProUserA);
               GXutil.writeLogRaw("Current: ",T01AA2_A10553ProUserA[0]);
            }
            if ( !( GXutil.dateCompare(Z10554ProFecA, T01AA2_A10554ProFecA[0]) ) )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"ProFecA");
               GXutil.writeLogRaw("Old: ",Z10554ProFecA);
               GXutil.writeLogRaw("Current: ",T01AA2_A10554ProFecA[0]);
            }
            if ( GXutil.strcmp(Z10555ProUserM, T01AA2_A10555ProUserM[0]) != 0 )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"ProUserM");
               GXutil.writeLogRaw("Old: ",Z10555ProUserM);
               GXutil.writeLogRaw("Current: ",T01AA2_A10555ProUserM[0]);
            }
            if ( !( GXutil.dateCompare(Z10556ProFecM, T01AA2_A10556ProFecM[0]) ) )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"ProFecM");
               GXutil.writeLogRaw("Old: ",Z10556ProFecM);
               GXutil.writeLogRaw("Current: ",T01AA2_A10556ProFecM[0]);
            }
            if ( GXutil.strcmp(Z10026DscCFa, T01AA2_A10026DscCFa[0]) != 0 )
            {
               GXutil.writeLogln("tartprl:[seudo value changed for attri]"+"DscCFa");
               GXutil.writeLogRaw("Old: ",Z10026DscCFa);
               GXutil.writeLogRaw("Current: ",T01AA2_A10026DscCFa[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AA11( )
   {
      beforeValidate1AA11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AA11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AA11( 0) ;
         checkOptimisticConcurrency1AA11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AA11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AA11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AA64 */
                  pr_default.execute(62, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A10026DscCFa, A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                  if ( (pr_default.getStatus(62) == 1) )
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
            load1AA11( ) ;
         }
         endLevel1AA11( ) ;
      }
      closeExtendedTableCursors1AA11( ) ;
   }

   public void update1AA11( )
   {
      beforeValidate1AA11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AA11( ) ;
      }
      if ( ( nIsMod_11 != 0 ) || ( nIsDirty_11 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AA11( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AA11( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AA11( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AA65 */
                     pr_default.execute(63, new Object[] {A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A10026DscCFa, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                     if ( (pr_default.getStatus(63) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AA11( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int2[0] = A252CliCod ;
                        GXv_char1[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
                        tartprl_impl.this.A396EmprCod = GXv_char3[0] ;
                        tartprl_impl.this.A252CliCod = GXv_int2[0] ;
                        tartprl_impl.this.A65ArtCod = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AA11( ) ;
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
            endLevel1AA11( ) ;
         }
      }
      closeExtendedTableCursors1AA11( ) ;
   }

   public void deferredUpdate1AA11( )
   {
   }

   public void delete1AA11( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AA11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AA11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AA11( ) ;
         afterConfirm1AA11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AA11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AA66 */
               pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AA11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AA11( )
   {
      standaloneModal1AA11( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01AA67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T01AA67_A759ProDsc[0] ;
         A5289ProProvi = T01AA67_A5289ProProvi[0] ;
         pr_default.close(65);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01AA68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01AA69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPFMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01AA70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01AA71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos p/Modelo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01AA72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
      }
   }

   public void endLevel1AA11( )
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

   public void scanStart1AA11( )
   {
      /* Scan By routine */
      /* Using cursor T01AA73 */
      pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(71) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A758ProCod = T01AA73_A758ProCod[0] ;
         n758ProCod = T01AA73_n758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AA11( )
   {
      /* Scan next routine */
      pr_default.readNext(71);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(71) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A758ProCod = T01AA73_A758ProCod[0] ;
         n758ProCod = T01AA73_n758ProCod[0] ;
      }
   }

   public void scanEnd1AA11( )
   {
      pr_default.close(71);
   }

   public void afterConfirm1AA11( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( GXutil.strcmp(A10412ProAct, O10412ProAct) != 0 ) )
      {
         A10556ProFecM = GXutil.serverNow( context, remoteHandle, pr_default) ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A10412ProAct, O10412ProAct) != 0 ) )
      {
         A10555ProUserM = AV17UsurCod ;
      }
   }

   public void beforeInsert1AA11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AA11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AA11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AA11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AA11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AA11( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      chkProProvi.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProProvi.getInternalname(), "Enabled", GXutil.ltrimstr( chkProProvi.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
      edtDscCFa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscCFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscCFa_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      chkProAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProAct.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1AA11( )
   {
   }

   public void send_integrity_lvl_hashes1AA10( )
   {
   }

   public void subsflControlProps_5011( )
   {
      edtavnRcdDeleted_11_Internalname = "vNRCDDELETED_11_"+sGXsfl_50_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_50_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_50_idx ;
      chkProProvi.setInternalname( "PROPROVI_"+sGXsfl_50_idx );
      edtDscCFa_Internalname = "DSCCFA_"+sGXsfl_50_idx ;
      chkProAct.setInternalname( "PROACT_"+sGXsfl_50_idx );
      edtProUserA_Internalname = "PROUSERA_"+sGXsfl_50_idx ;
      edtProFecA_Internalname = "PROFECA_"+sGXsfl_50_idx ;
      edtProUserM_Internalname = "PROUSERM_"+sGXsfl_50_idx ;
      edtProFecM_Internalname = "PROFECM_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_5011( )
   {
      edtavnRcdDeleted_11_Internalname = "vNRCDDELETED_11_"+sGXsfl_50_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_50_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_50_fel_idx ;
      chkProProvi.setInternalname( "PROPROVI_"+sGXsfl_50_fel_idx );
      edtDscCFa_Internalname = "DSCCFA_"+sGXsfl_50_fel_idx ;
      chkProAct.setInternalname( "PROACT_"+sGXsfl_50_fel_idx );
      edtProUserA_Internalname = "PROUSERA_"+sGXsfl_50_fel_idx ;
      edtProFecA_Internalname = "PROFECA_"+sGXsfl_50_fel_idx ;
      edtProUserM_Internalname = "PROUSERM_"+sGXsfl_50_fel_idx ;
      edtProFecM_Internalname = "PROFECM_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1AA11( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5011( ) ;
      sendRow1AA11( ) ;
   }

   public void sendRow1AA11( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_11_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_11_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_11), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_11), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_11_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_11_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "PROPROVI_" + sGXsfl_50_idx ;
      chkProProvi.setName( GXCCtl );
      chkProProvi.setWebtags( "" );
      chkProProvi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProProvi.getInternalname(), "TitleCaption", chkProProvi.getCaption(), !bGXsfl_50_Refreshing);
      chkProProvi.setCheckedValue( "N" );
      A5289ProProvi = ((GXutil.strcmp(GXutil.rtrim( A5289ProProvi), "S")==0) ? "S" : "N") ;
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkProProvi.getInternalname(),A5289ProProvi,"","",Integer.valueOf(-1),Integer.valueOf(chkProProvi.getEnabled()),"S","",StyleString,ClassString,"","",""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDscCFa_Internalname,GXutil.rtrim( A10026DscCFa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDscCFa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDscCFa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_11_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "PROACT_" + sGXsfl_50_idx ;
      chkProAct.setName( GXCCtl );
      chkProAct.setWebtags( "" );
      chkProAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "TitleCaption", chkProAct.getCaption(), !bGXsfl_50_Refreshing);
      chkProAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A10412ProAct)==0) )
      {
         A10412ProAct = httpContext.getMessage( "S", "") ;
      }
      Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkProAct.getInternalname(),A10412ProAct,"","",Integer.valueOf(-1),Integer.valueOf(chkProAct.getEnabled()),"S","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(56, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,56);\""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProUserA_Internalname,GXutil.rtrim( A10553ProUserA),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProUserA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProUserA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFecA_Internalname,localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10554ProFecA, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFecA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFecA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProUserM_Internalname,GXutil.rtrim( A10555ProUserM),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProUserM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProUserM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFecM_Internalname,localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10556ProFecM, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFecM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProFecM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1AA11( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "Z10412ProAct_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10412ProAct));
      GXCCtl = "Z10553ProUserA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10553ProUserA));
      GXCCtl = "Z10554ProFecA_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10555ProUserM_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10555ProUserM));
      GXCCtl = "Z10556ProFecM_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10026DscCFa_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10026DscCFa));
      GXCCtl = "O10412ProAct_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O10412ProAct));
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_11_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_11_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_11, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_11_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_11_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPROVI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProProvi.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DSCCFA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDscCFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROUSERA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFECA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROUSERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFECM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1AA11( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5011( ) ;
      edtavnRcdDeleted_11_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_11_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkProProvi.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROPROVI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtDscCFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DSCCFA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkProAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PROACT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtProUserA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFecA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProUserM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROUSERM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProFecM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFECM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_11_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_11_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_11");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_11_Internalname ;
         wbErr = true ;
         nRcdDeleted_11 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_11 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_11_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      n758ProCod = false ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      A5289ProProvi = ((GXutil.strcmp(httpContext.cgiGet( chkProProvi.getInternalname()), "S")==0) ? "S" : "N") ;
      A10026DscCFa = httpContext.cgiGet( edtDscCFa_Internalname) ;
      A10412ProAct = ((GXutil.strcmp(httpContext.cgiGet( chkProAct.getInternalname()), "S")==0) ? "S" : "N") ;
      A10553ProUserA = httpContext.cgiGet( edtProUserA_Internalname) ;
      A10554ProFecA = localUtil.ctot( httpContext.cgiGet( edtProFecA_Internalname)) ;
      A10555ProUserM = httpContext.cgiGet( edtProUserM_Internalname) ;
      A10556ProFecM = localUtil.ctot( httpContext.cgiGet( edtProFecM_Internalname)) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_50_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10412ProAct_" + sGXsfl_50_idx ;
      Z10412ProAct = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10553ProUserA_" + sGXsfl_50_idx ;
      Z10553ProUserA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10554ProFecA_" + sGXsfl_50_idx ;
      Z10554ProFecA = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10555ProUserM_" + sGXsfl_50_idx ;
      Z10555ProUserM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10556ProFecM_" + sGXsfl_50_idx ;
      Z10556ProFecM = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10026DscCFa_" + sGXsfl_50_idx ;
      Z10026DscCFa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O10412ProAct_" + sGXsfl_50_idx ;
      O10412ProAct = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_11_" + sGXsfl_50_idx ;
      nRcdDeleted_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_11_" + sGXsfl_50_idx ;
      nRcdExists_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_11_" + sGXsfl_50_idx ;
      nIsMod_11 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProFecM_Enabled = edtProFecM_Enabled ;
      defedtProUserM_Enabled = edtProUserM_Enabled ;
      defedtProFecA_Enabled = edtProFecA_Enabled ;
      defedtProUserA_Enabled = edtProUserA_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValues1AA0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5011( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5011( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10412ProAct_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10412ProAct_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10412ProAct_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10553ProUserA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10553ProUserA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10553ProUserA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10554ProFecA_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10554ProFecA_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10554ProFecA_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10555ProUserM_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10555ProUserM_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10555ProUserM_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10556ProFecM_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10556ProFecM_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10556ProFecM_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10026DscCFa_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10026DscCFa_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10026DscCFa_"+sGXsfl_50_idx) ;
      }
      httpContext.changePostValue( "O10412ProAct", httpContext.cgiGet( "T10412ProAct")) ;
      httpContext.deletePostValue( "T10412ProAct") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tartprl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TARTPRL");
      forbiddenHiddens.add("ArtDsc", GXutil.rtrim( localUtil.format( A69ArtDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tartprl:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.tartprl", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TARTPRL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS", "") ;
   }

   public void initializeNonKey1AA10( )
   {
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      Z69ArtDsc = "" ;
   }

   public void initAll1AA10( )
   {
      initializeNonKey1AA10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1AA11( )
   {
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A759ProDsc = "" ;
      A5289ProProvi = "" ;
      A10026DscCFa = "" ;
      A10412ProAct = httpContext.getMessage( "S", "") ;
      A10553ProUserA = AV17UsurCod ;
      A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      O10412ProAct = A10412ProAct ;
      Z10412ProAct = "" ;
      Z10553ProUserA = "" ;
      Z10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Z10555ProUserM = "" ;
      Z10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      Z10026DscCFa = "" ;
   }

   public void initAll1AA11( )
   {
      A758ProCod = "" ;
      n758ProCod = false ;
      initializeNonKey1AA11( ) ;
   }

   public void standaloneModalInsert1AA11( )
   {
      A10412ProAct = i10412ProAct ;
      A10553ProUserA = i10553ProUserA ;
      A10554ProFecA = i10554ProFecA ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241562765", true, true);
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
      httpContext.AddJavascriptSource("tartprl.js", "?20268241562765", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties11( )
   {
      edtProFecM_Enabled = defedtProFecM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProUserM_Enabled = defedtProUserM_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProFecA_Enabled = defedtProFecA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProUserA_Enabled = defedtProUserA_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_11, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_11_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5289ProProvi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkProProvi.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10026DscCFa));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDscCFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10412ProAct));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkProAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10553ProUserA));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10555ProUserM));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProUserM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProFecM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtArtCod_Internalname = "ARTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtavnRcdDeleted_11_Internalname = "vNRCDDELETED_11" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      chkProProvi.setInternalname( "PROPROVI" );
      edtDscCFa_Internalname = "DSCCFA" ;
      chkProAct.setInternalname( "PROACT" );
      edtProUserA_Internalname = "PROUSERA" ;
      edtProFecA_Internalname = "PROFECA" ;
      edtProUserM_Internalname = "PROUSERM" ;
      edtProFecM_Internalname = "PROFECM" ;
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
      Form.setCaption( httpContext.getMessage( "PROCESOS", "") );
      edtProFecM_Jsonclick = "" ;
      edtProUserM_Jsonclick = "" ;
      edtProFecA_Jsonclick = "" ;
      edtProUserA_Jsonclick = "" ;
      chkProAct.setCaption( "" );
      edtDscCFa_Jsonclick = "" ;
      chkProProvi.setCaption( "" );
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtavnRcdDeleted_11_Jsonclick = "" ;
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
      edtProFecM_Enabled = 0 ;
      edtProUserM_Enabled = 0 ;
      edtProFecA_Enabled = 0 ;
      edtProUserA_Enabled = 0 ;
      chkProAct.setEnabled( 1 );
      edtDscCFa_Enabled = 1 ;
      chkProProvi.setEnabled( 0 );
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtavnRcdDeleted_11_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtArtDsc_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Backcolor = (int)(0xFFFFFF) ;
      edtArtCod_Enabled = 0 ;
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
      subsflControlProps_5011( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AA11( ) ;
         standaloneModal1AA11( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AA11( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5011( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "PROPROVI_" + sGXsfl_50_idx ;
      chkProProvi.setName( GXCCtl );
      chkProProvi.setWebtags( "" );
      chkProProvi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProProvi.getInternalname(), "TitleCaption", chkProProvi.getCaption(), !bGXsfl_50_Refreshing);
      chkProProvi.setCheckedValue( "N" );
      A5289ProProvi = ((GXutil.strcmp(GXutil.rtrim( A5289ProProvi), "S")==0) ? "S" : "N") ;
      GXCCtl = "PROACT_" + sGXsfl_50_idx ;
      chkProAct.setName( GXCCtl );
      chkProAct.setWebtags( "" );
      chkProAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "TitleCaption", chkProAct.getCaption(), !bGXsfl_50_Refreshing);
      chkProAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A10412ProAct)==0) )
      {
         A10412ProAct = httpContext.getMessage( "S", "") ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AA74 */
      pr_default.execute(72, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(72) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01AA74_A407EmprNom[0] ;
      n407EmprNom = T01AA74_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(72);
      /* Using cursor T01AA75 */
      pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(73) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01AA75_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(73);
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

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      n252CliCod = false ;
      n65ArtCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Procod( )
   {
      n758ProCod = false ;
      /* Using cursor T01AA67 */
      pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(65) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01AA67_A759ProDsc[0] ;
      A5289ProProvi = T01AA67_A5289ProProvi[0] ;
      pr_default.close(65);
      dynload_actions( ) ;
      A5289ProProvi = ((GXutil.strcmp(GXutil.rtrim( A5289ProProvi), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", GXutil.rtrim( A5289ProProvi));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z279CliNom'},{av:'Z407EmprNom'},{av:'Z69ArtDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'}]}");
      setEventMetadata("VALID_PROACT","{handler:'valid_Proact',iparms:[]");
      setEventMetadata("VALID_PROACT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Profecm',iparms:[]");
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
      pr_default.close(65);
      pr_default.close(73);
      pr_default.close(72);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Z758ProCod = "" ;
      Z10412ProAct = "" ;
      Z10553ProUserA = "" ;
      Z10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Z10555ProUserM = "" ;
      Z10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      Z10026DscCFa = "" ;
      O10412ProAct = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A65ArtCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      AV17UsurCod = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      A69ArtDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode11 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode10 = "" ;
      GXCCtl = "" ;
      A759ProDsc = "" ;
      A5289ProProvi = "" ;
      A10026DscCFa = "" ;
      A10412ProAct = "" ;
      A10553ProUserA = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      T10412ProAct = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01AA7_A407EmprNom = new String[] {""} ;
      T01AA7_n407EmprNom = new boolean[] {false} ;
      T01AA8_A279CliNom = new String[] {""} ;
      T01AA9_A65ArtCod = new String[] {""} ;
      T01AA9_n65ArtCod = new boolean[] {false} ;
      T01AA9_A279CliNom = new String[] {""} ;
      T01AA9_A407EmprNom = new String[] {""} ;
      T01AA9_n407EmprNom = new boolean[] {false} ;
      T01AA9_A69ArtDsc = new String[] {""} ;
      T01AA9_n69ArtDsc = new boolean[] {false} ;
      T01AA9_A396EmprCod = new String[] {""} ;
      T01AA9_A252CliCod = new int[1] ;
      T01AA9_n252CliCod = new boolean[] {false} ;
      T01AA10_A396EmprCod = new String[] {""} ;
      T01AA10_A252CliCod = new int[1] ;
      T01AA10_n252CliCod = new boolean[] {false} ;
      T01AA10_A65ArtCod = new String[] {""} ;
      T01AA10_n65ArtCod = new boolean[] {false} ;
      T01AA6_A65ArtCod = new String[] {""} ;
      T01AA6_n65ArtCod = new boolean[] {false} ;
      T01AA6_A69ArtDsc = new String[] {""} ;
      T01AA6_n69ArtDsc = new boolean[] {false} ;
      T01AA6_A396EmprCod = new String[] {""} ;
      T01AA6_A252CliCod = new int[1] ;
      T01AA6_n252CliCod = new boolean[] {false} ;
      T01AA11_A396EmprCod = new String[] {""} ;
      T01AA11_A252CliCod = new int[1] ;
      T01AA11_n252CliCod = new boolean[] {false} ;
      T01AA11_A65ArtCod = new String[] {""} ;
      T01AA11_n65ArtCod = new boolean[] {false} ;
      T01AA12_A396EmprCod = new String[] {""} ;
      T01AA12_A252CliCod = new int[1] ;
      T01AA12_n252CliCod = new boolean[] {false} ;
      T01AA12_A65ArtCod = new String[] {""} ;
      T01AA12_n65ArtCod = new boolean[] {false} ;
      T01AA5_A65ArtCod = new String[] {""} ;
      T01AA5_n65ArtCod = new boolean[] {false} ;
      T01AA5_A69ArtDsc = new String[] {""} ;
      T01AA5_n69ArtDsc = new boolean[] {false} ;
      T01AA5_A396EmprCod = new String[] {""} ;
      T01AA5_A252CliCod = new int[1] ;
      T01AA5_n252CliCod = new boolean[] {false} ;
      T01AA16_A396EmprCod = new String[] {""} ;
      T01AA16_A252CliCod = new int[1] ;
      T01AA16_n252CliCod = new boolean[] {false} ;
      T01AA16_A65ArtCod = new String[] {""} ;
      T01AA16_n65ArtCod = new boolean[] {false} ;
      T01AA16_A499GrpFamCod = new byte[1] ;
      T01AA17_A396EmprCod = new String[] {""} ;
      T01AA17_A252CliCod = new int[1] ;
      T01AA17_n252CliCod = new boolean[] {false} ;
      T01AA17_A12814ARTConID = new String[] {""} ;
      T01AA17_A65ArtCod = new String[] {""} ;
      T01AA17_n65ArtCod = new boolean[] {false} ;
      T01AA18_A396EmprCod = new String[] {""} ;
      T01AA18_A252CliCod = new int[1] ;
      T01AA18_n252CliCod = new boolean[] {false} ;
      T01AA18_A65ArtCod = new String[] {""} ;
      T01AA18_n65ArtCod = new boolean[] {false} ;
      T01AA18_A12363SocInt = new byte[1] ;
      T01AA19_A396EmprCod = new String[] {""} ;
      T01AA19_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA19_A5728JBCLLin = new short[1] ;
      T01AA20_A396EmprCod = new String[] {""} ;
      T01AA20_A252CliCod = new int[1] ;
      T01AA20_n252CliCod = new boolean[] {false} ;
      T01AA20_A5809MMezCod = new String[] {""} ;
      T01AA20_A65ArtCod = new String[] {""} ;
      T01AA20_n65ArtCod = new boolean[] {false} ;
      T01AA21_A396EmprCod = new String[] {""} ;
      T01AA21_A252CliCod = new int[1] ;
      T01AA21_n252CliCod = new boolean[] {false} ;
      T01AA21_A5234MezCod = new String[] {""} ;
      T01AA21_A5240MezLin = new byte[1] ;
      T01AA22_A396EmprCod = new String[] {""} ;
      T01AA22_A252CliCod = new int[1] ;
      T01AA22_n252CliCod = new boolean[] {false} ;
      T01AA22_A65ArtCod = new String[] {""} ;
      T01AA22_n65ArtCod = new boolean[] {false} ;
      T01AA22_A4116estreclim = new int[1] ;
      T01AA23_A396EmprCod = new String[] {""} ;
      T01AA23_A252CliCod = new int[1] ;
      T01AA23_n252CliCod = new boolean[] {false} ;
      T01AA23_A65ArtCod = new String[] {""} ;
      T01AA23_n65ArtCod = new boolean[] {false} ;
      T01AA23_A4061EstNomCol = new String[] {""} ;
      T01AA24_A396EmprCod = new String[] {""} ;
      T01AA24_A9705ErpNped = new String[] {""} ;
      T01AA24_A8652ErpLin = new short[1] ;
      T01AA25_A396EmprCod = new String[] {""} ;
      T01AA25_A252CliCod = new int[1] ;
      T01AA25_n252CliCod = new boolean[] {false} ;
      T01AA25_A65ArtCod = new String[] {""} ;
      T01AA25_n65ArtCod = new boolean[] {false} ;
      T01AA25_A7266CAAqP = new String[] {""} ;
      T01AA26_A396EmprCod = new String[] {""} ;
      T01AA26_A252CliCod = new int[1] ;
      T01AA26_n252CliCod = new boolean[] {false} ;
      T01AA26_A65ArtCod = new String[] {""} ;
      T01AA26_n65ArtCod = new boolean[] {false} ;
      T01AA26_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA27_A396EmprCod = new String[] {""} ;
      T01AA27_A252CliCod = new int[1] ;
      T01AA27_n252CliCod = new boolean[] {false} ;
      T01AA27_A65ArtCod = new String[] {""} ;
      T01AA27_n65ArtCod = new boolean[] {false} ;
      T01AA27_A10972Int_cod = new byte[1] ;
      T01AA28_A396EmprCod = new String[] {""} ;
      T01AA28_A252CliCod = new int[1] ;
      T01AA28_n252CliCod = new boolean[] {false} ;
      T01AA28_A65ArtCod = new String[] {""} ;
      T01AA28_n65ArtCod = new boolean[] {false} ;
      T01AA28_A10577Pg_Procod = new String[] {""} ;
      T01AA29_A396EmprCod = new String[] {""} ;
      T01AA29_A252CliCod = new int[1] ;
      T01AA29_n252CliCod = new boolean[] {false} ;
      T01AA29_A65ArtCod = new String[] {""} ;
      T01AA29_n65ArtCod = new boolean[] {false} ;
      T01AA29_A10272Hz_cod = new String[] {""} ;
      T01AA30_A396EmprCod = new String[] {""} ;
      T01AA30_A252CliCod = new int[1] ;
      T01AA30_n252CliCod = new boolean[] {false} ;
      T01AA30_A65ArtCod = new String[] {""} ;
      T01AA30_n65ArtCod = new boolean[] {false} ;
      T01AA30_A10041ArtSH = new String[] {""} ;
      T01AA31_A396EmprCod = new String[] {""} ;
      T01AA31_A252CliCod = new int[1] ;
      T01AA31_n252CliCod = new boolean[] {false} ;
      T01AA31_A65ArtCod = new String[] {""} ;
      T01AA31_n65ArtCod = new boolean[] {false} ;
      T01AA31_A8427TipoCt = new String[] {""} ;
      T01AA31_A8428CapMxMq = new int[1] ;
      T01AA32_A396EmprCod = new String[] {""} ;
      T01AA32_A252CliCod = new int[1] ;
      T01AA32_n252CliCod = new boolean[] {false} ;
      T01AA32_A65ArtCod = new String[] {""} ;
      T01AA32_n65ArtCod = new boolean[] {false} ;
      T01AA32_A8342CodPred = new short[1] ;
      T01AA33_A396EmprCod = new String[] {""} ;
      T01AA33_A252CliCod = new int[1] ;
      T01AA33_n252CliCod = new boolean[] {false} ;
      T01AA33_A65ArtCod = new String[] {""} ;
      T01AA33_n65ArtCod = new boolean[] {false} ;
      T01AA33_A8089ArtcodTj = new String[] {""} ;
      T01AA34_A396EmprCod = new String[] {""} ;
      T01AA34_A252CliCod = new int[1] ;
      T01AA34_n252CliCod = new boolean[] {false} ;
      T01AA34_A65ArtCod = new String[] {""} ;
      T01AA34_n65ArtCod = new boolean[] {false} ;
      T01AA34_A7956Mq_CodM = new String[] {""} ;
      T01AA35_A396EmprCod = new String[] {""} ;
      T01AA35_A252CliCod = new int[1] ;
      T01AA35_n252CliCod = new boolean[] {false} ;
      T01AA35_A65ArtCod = new String[] {""} ;
      T01AA35_n65ArtCod = new boolean[] {false} ;
      T01AA35_A7949Par_Art = new short[1] ;
      T01AA36_A396EmprCod = new String[] {""} ;
      T01AA36_A252CliCod = new int[1] ;
      T01AA36_n252CliCod = new boolean[] {false} ;
      T01AA36_A65ArtCod = new String[] {""} ;
      T01AA36_n65ArtCod = new boolean[] {false} ;
      T01AA36_A7135Lin_fast = new short[1] ;
      T01AA37_A396EmprCod = new String[] {""} ;
      T01AA37_A252CliCod = new int[1] ;
      T01AA37_n252CliCod = new boolean[] {false} ;
      T01AA37_A65ArtCod = new String[] {""} ;
      T01AA37_n65ArtCod = new boolean[] {false} ;
      T01AA37_A6954Mat_lin = new short[1] ;
      T01AA38_A396EmprCod = new String[] {""} ;
      T01AA38_A602MaqCod = new String[] {""} ;
      T01AA38_A6078MaqCliCod = new int[1] ;
      T01AA38_A6079MaqArtCod = new String[] {""} ;
      T01AA39_A396EmprCod = new String[] {""} ;
      T01AA39_A252CliCod = new int[1] ;
      T01AA39_n252CliCod = new boolean[] {false} ;
      T01AA39_A65ArtCod = new String[] {""} ;
      T01AA39_n65ArtCod = new boolean[] {false} ;
      T01AA39_A5382EstCatAny = new short[1] ;
      T01AA39_A5383EstCatSer = new String[] {""} ;
      T01AA39_A5384EstCatTip = new short[1] ;
      T01AA40_A396EmprCod = new String[] {""} ;
      T01AA40_A252CliCod = new int[1] ;
      T01AA40_n252CliCod = new boolean[] {false} ;
      T01AA40_A65ArtCod = new String[] {""} ;
      T01AA40_n65ArtCod = new boolean[] {false} ;
      T01AA40_A4658MdlCod = new String[] {""} ;
      T01AA41_A396EmprCod = new String[] {""} ;
      T01AA41_A252CliCod = new int[1] ;
      T01AA41_n252CliCod = new boolean[] {false} ;
      T01AA41_A4175WebEmpCod = new String[] {""} ;
      T01AA42_A396EmprCod = new String[] {""} ;
      T01AA42_A252CliCod = new int[1] ;
      T01AA42_n252CliCod = new boolean[] {false} ;
      T01AA42_A4079WEBDISCOD = new String[] {""} ;
      T01AA43_A396EmprCod = new String[] {""} ;
      T01AA43_A252CliCod = new int[1] ;
      T01AA43_n252CliCod = new boolean[] {false} ;
      T01AA43_A65ArtCod = new String[] {""} ;
      T01AA43_n65ArtCod = new boolean[] {false} ;
      T01AA43_A4058CCFColNom = new String[] {""} ;
      T01AA43_A4059CCFColNum = new int[1] ;
      T01AA44_A396EmprCod = new String[] {""} ;
      T01AA44_A252CliCod = new int[1] ;
      T01AA44_n252CliCod = new boolean[] {false} ;
      T01AA44_A65ArtCod = new String[] {""} ;
      T01AA44_n65ArtCod = new boolean[] {false} ;
      T01AA44_A1177Dibujo = new String[] {""} ;
      T01AA44_A1790DibIntCod = new int[1] ;
      T01AA45_A396EmprCod = new String[] {""} ;
      T01AA45_A252CliCod = new int[1] ;
      T01AA45_n252CliCod = new boolean[] {false} ;
      T01AA45_A65ArtCod = new String[] {""} ;
      T01AA45_n65ArtCod = new boolean[] {false} ;
      T01AA45_A1080LinPre = new byte[1] ;
      T01AA46_A396EmprCod = new String[] {""} ;
      T01AA46_A3814PePCod = new long[1] ;
      T01AA47_A396EmprCod = new String[] {""} ;
      T01AA47_A3413OpeManCod = new byte[1] ;
      T01AA47_A3430PreManNMt = new String[] {""} ;
      T01AA47_A252CliCod = new int[1] ;
      T01AA47_n252CliCod = new boolean[] {false} ;
      T01AA47_A65ArtCod = new String[] {""} ;
      T01AA47_n65ArtCod = new boolean[] {false} ;
      T01AA48_A396EmprCod = new String[] {""} ;
      T01AA48_A3415ParManNum = new int[1] ;
      T01AA49_A396EmprCod = new String[] {""} ;
      T01AA49_A3331LanBroCod = new byte[1] ;
      T01AA49_A3333LanBroLin = new short[1] ;
      T01AA50_A396EmprCod = new String[] {""} ;
      T01AA50_A252CliCod = new int[1] ;
      T01AA50_n252CliCod = new boolean[] {false} ;
      T01AA50_A65ArtCod = new String[] {""} ;
      T01AA50_n65ArtCod = new boolean[] {false} ;
      T01AA50_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AA51_A396EmprCod = new String[] {""} ;
      T01AA51_A252CliCod = new int[1] ;
      T01AA51_n252CliCod = new boolean[] {false} ;
      T01AA51_A65ArtCod = new String[] {""} ;
      T01AA51_n65ArtCod = new boolean[] {false} ;
      T01AA51_A3288CCalCod = new String[] {""} ;
      T01AA52_A396EmprCod = new String[] {""} ;
      T01AA52_A252CliCod = new int[1] ;
      T01AA52_n252CliCod = new boolean[] {false} ;
      T01AA52_A65ArtCod = new String[] {""} ;
      T01AA52_n65ArtCod = new boolean[] {false} ;
      T01AA52_A3033CCCod = new String[] {""} ;
      T01AA53_A396EmprCod = new String[] {""} ;
      T01AA53_A252CliCod = new int[1] ;
      T01AA53_n252CliCod = new boolean[] {false} ;
      T01AA53_A65ArtCod = new String[] {""} ;
      T01AA53_n65ArtCod = new boolean[] {false} ;
      T01AA53_A2937RecIntCod = new byte[1] ;
      T01AA54_A396EmprCod = new String[] {""} ;
      T01AA54_A252CliCod = new int[1] ;
      T01AA54_n252CliCod = new boolean[] {false} ;
      T01AA54_A65ArtCod = new String[] {""} ;
      T01AA54_n65ArtCod = new boolean[] {false} ;
      T01AA54_A2931Limite2 = new short[1] ;
      T01AA55_A396EmprCod = new String[] {""} ;
      T01AA55_A252CliCod = new int[1] ;
      T01AA55_n252CliCod = new boolean[] {false} ;
      T01AA55_A65ArtCod = new String[] {""} ;
      T01AA55_n65ArtCod = new boolean[] {false} ;
      T01AA55_A71ArtEstAny = new short[1] ;
      T01AA55_A2756ArtEstSer = new String[] {""} ;
      T01AA56_A396EmprCod = new String[] {""} ;
      T01AA56_A252CliCod = new int[1] ;
      T01AA56_n252CliCod = new boolean[] {false} ;
      T01AA56_A1504CliProCod = new String[] {""} ;
      T01AA56_A65ArtCod = new String[] {""} ;
      T01AA56_n65ArtCod = new boolean[] {false} ;
      T01AA57_A396EmprCod = new String[] {""} ;
      T01AA57_A252CliCod = new int[1] ;
      T01AA57_n252CliCod = new boolean[] {false} ;
      T01AA57_A65ArtCod = new String[] {""} ;
      T01AA57_n65ArtCod = new boolean[] {false} ;
      T01AA57_A598LinRec = new byte[1] ;
      T01AA58_A396EmprCod = new String[] {""} ;
      T01AA58_A252CliCod = new int[1] ;
      T01AA58_n252CliCod = new boolean[] {false} ;
      T01AA58_A65ArtCod = new String[] {""} ;
      T01AA58_n65ArtCod = new boolean[] {false} ;
      T01AA58_A831TipColCod = new byte[1] ;
      T01AA59_A396EmprCod = new String[] {""} ;
      T01AA59_A252CliCod = new int[1] ;
      T01AA59_n252CliCod = new boolean[] {false} ;
      T01AA59_A65ArtCod = new String[] {""} ;
      T01AA59_n65ArtCod = new boolean[] {false} ;
      T01AA59_A758ProCod = new String[] {""} ;
      T01AA59_n758ProCod = new boolean[] {false} ;
      T01AA59_A457FasCod = new String[] {""} ;
      T01AA60_A396EmprCod = new String[] {""} ;
      T01AA60_A252CliCod = new int[1] ;
      T01AA60_n252CliCod = new boolean[] {false} ;
      T01AA60_A65ArtCod = new String[] {""} ;
      T01AA60_n65ArtCod = new boolean[] {false} ;
      Z759ProDsc = "" ;
      Z5289ProProvi = "" ;
      T01AA61_A252CliCod = new int[1] ;
      T01AA61_n252CliCod = new boolean[] {false} ;
      T01AA61_A65ArtCod = new String[] {""} ;
      T01AA61_n65ArtCod = new boolean[] {false} ;
      T01AA61_A10412ProAct = new String[] {""} ;
      T01AA61_A10553ProUserA = new String[] {""} ;
      T01AA61_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA61_A10555ProUserM = new String[] {""} ;
      T01AA61_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA61_A759ProDsc = new String[] {""} ;
      T01AA61_A5289ProProvi = new String[] {""} ;
      T01AA61_A10026DscCFa = new String[] {""} ;
      T01AA61_A396EmprCod = new String[] {""} ;
      T01AA61_A758ProCod = new String[] {""} ;
      T01AA61_n758ProCod = new boolean[] {false} ;
      T01AA4_A759ProDsc = new String[] {""} ;
      T01AA4_A5289ProProvi = new String[] {""} ;
      T01AA62_A759ProDsc = new String[] {""} ;
      T01AA62_A5289ProProvi = new String[] {""} ;
      T01AA63_A396EmprCod = new String[] {""} ;
      T01AA63_A252CliCod = new int[1] ;
      T01AA63_n252CliCod = new boolean[] {false} ;
      T01AA63_A65ArtCod = new String[] {""} ;
      T01AA63_n65ArtCod = new boolean[] {false} ;
      T01AA63_A758ProCod = new String[] {""} ;
      T01AA63_n758ProCod = new boolean[] {false} ;
      T01AA3_A252CliCod = new int[1] ;
      T01AA3_n252CliCod = new boolean[] {false} ;
      T01AA3_A65ArtCod = new String[] {""} ;
      T01AA3_n65ArtCod = new boolean[] {false} ;
      T01AA3_A10412ProAct = new String[] {""} ;
      T01AA3_A10553ProUserA = new String[] {""} ;
      T01AA3_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA3_A10555ProUserM = new String[] {""} ;
      T01AA3_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA3_A10026DscCFa = new String[] {""} ;
      T01AA3_A396EmprCod = new String[] {""} ;
      T01AA3_A758ProCod = new String[] {""} ;
      T01AA3_n758ProCod = new boolean[] {false} ;
      T01AA2_A252CliCod = new int[1] ;
      T01AA2_n252CliCod = new boolean[] {false} ;
      T01AA2_A65ArtCod = new String[] {""} ;
      T01AA2_n65ArtCod = new boolean[] {false} ;
      T01AA2_A10412ProAct = new String[] {""} ;
      T01AA2_A10553ProUserA = new String[] {""} ;
      T01AA2_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA2_A10555ProUserM = new String[] {""} ;
      T01AA2_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T01AA2_A10026DscCFa = new String[] {""} ;
      T01AA2_A396EmprCod = new String[] {""} ;
      T01AA2_A758ProCod = new String[] {""} ;
      T01AA2_n758ProCod = new boolean[] {false} ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      T01AA67_A759ProDsc = new String[] {""} ;
      T01AA67_A5289ProProvi = new String[] {""} ;
      T01AA68_A396EmprCod = new String[] {""} ;
      T01AA68_A11604PArtId = new int[1] ;
      T01AA69_A396EmprCod = new String[] {""} ;
      T01AA69_A252CliCod = new int[1] ;
      T01AA69_n252CliCod = new boolean[] {false} ;
      T01AA69_A65ArtCod = new String[] {""} ;
      T01AA69_n65ArtCod = new boolean[] {false} ;
      T01AA69_A758ProCod = new String[] {""} ;
      T01AA69_n758ProCod = new boolean[] {false} ;
      T01AA69_A9836FasCodM = new String[] {""} ;
      T01AA70_A396EmprCod = new String[] {""} ;
      T01AA70_A252CliCod = new int[1] ;
      T01AA70_n252CliCod = new boolean[] {false} ;
      T01AA70_A65ArtCod = new String[] {""} ;
      T01AA70_n65ArtCod = new boolean[] {false} ;
      T01AA70_A758ProCod = new String[] {""} ;
      T01AA70_n758ProCod = new boolean[] {false} ;
      T01AA70_A6986NumLinPro = new short[1] ;
      T01AA71_A396EmprCod = new String[] {""} ;
      T01AA71_A252CliCod = new int[1] ;
      T01AA71_n252CliCod = new boolean[] {false} ;
      T01AA71_A65ArtCod = new String[] {""} ;
      T01AA71_n65ArtCod = new boolean[] {false} ;
      T01AA71_A4658MdlCod = new String[] {""} ;
      T01AA71_A758ProCod = new String[] {""} ;
      T01AA71_n758ProCod = new boolean[] {false} ;
      T01AA72_A396EmprCod = new String[] {""} ;
      T01AA72_A252CliCod = new int[1] ;
      T01AA72_n252CliCod = new boolean[] {false} ;
      T01AA72_A65ArtCod = new String[] {""} ;
      T01AA72_n65ArtCod = new boolean[] {false} ;
      T01AA72_A758ProCod = new String[] {""} ;
      T01AA72_n758ProCod = new boolean[] {false} ;
      T01AA72_A457FasCod = new String[] {""} ;
      T01AA73_A396EmprCod = new String[] {""} ;
      T01AA73_A252CliCod = new int[1] ;
      T01AA73_n252CliCod = new boolean[] {false} ;
      T01AA73_A65ArtCod = new String[] {""} ;
      T01AA73_n65ArtCod = new boolean[] {false} ;
      T01AA73_A758ProCod = new String[] {""} ;
      T01AA73_n758ProCod = new boolean[] {false} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10412ProAct = "" ;
      i10553ProUserA = "" ;
      i10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01AA74_A407EmprNom = new String[] {""} ;
      T01AA74_n407EmprNom = new boolean[] {false} ;
      T01AA75_A279CliNom = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ279CliNom = "" ;
      ZZ407EmprNom = "" ;
      ZZ69ArtDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tartprl__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tartprl__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tartprl__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tartprl__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tartprl__default(),
         new Object[] {
             new Object[] {
            T01AA2_A252CliCod, T01AA2_A65ArtCod, T01AA2_A10412ProAct, T01AA2_A10553ProUserA, T01AA2_A10554ProFecA, T01AA2_A10555ProUserM, T01AA2_A10556ProFecM, T01AA2_A10026DscCFa, T01AA2_A396EmprCod, T01AA2_A758ProCod
            }
            , new Object[] {
            T01AA3_A252CliCod, T01AA3_A65ArtCod, T01AA3_A10412ProAct, T01AA3_A10553ProUserA, T01AA3_A10554ProFecA, T01AA3_A10555ProUserM, T01AA3_A10556ProFecM, T01AA3_A10026DscCFa, T01AA3_A396EmprCod, T01AA3_A758ProCod
            }
            , new Object[] {
            T01AA4_A759ProDsc, T01AA4_A5289ProProvi
            }
            , new Object[] {
            T01AA5_A65ArtCod, T01AA5_A69ArtDsc, T01AA5_n69ArtDsc, T01AA5_A396EmprCod, T01AA5_A252CliCod
            }
            , new Object[] {
            T01AA6_A65ArtCod, T01AA6_A69ArtDsc, T01AA6_n69ArtDsc, T01AA6_A396EmprCod, T01AA6_A252CliCod
            }
            , new Object[] {
            T01AA7_A407EmprNom, T01AA7_n407EmprNom
            }
            , new Object[] {
            T01AA8_A279CliNom
            }
            , new Object[] {
            T01AA9_A65ArtCod, T01AA9_A279CliNom, T01AA9_A407EmprNom, T01AA9_n407EmprNom, T01AA9_A69ArtDsc, T01AA9_n69ArtDsc, T01AA9_A396EmprCod, T01AA9_A252CliCod
            }
            , new Object[] {
            T01AA10_A396EmprCod, T01AA10_A252CliCod, T01AA10_A65ArtCod
            }
            , new Object[] {
            T01AA11_A396EmprCod, T01AA11_A252CliCod, T01AA11_A65ArtCod
            }
            , new Object[] {
            T01AA12_A396EmprCod, T01AA12_A252CliCod, T01AA12_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AA16_A396EmprCod, T01AA16_A252CliCod, T01AA16_A65ArtCod, T01AA16_A499GrpFamCod
            }
            , new Object[] {
            T01AA17_A396EmprCod, T01AA17_A252CliCod, T01AA17_A12814ARTConID, T01AA17_A65ArtCod
            }
            , new Object[] {
            T01AA18_A396EmprCod, T01AA18_A252CliCod, T01AA18_A65ArtCod, T01AA18_A12363SocInt
            }
            , new Object[] {
            T01AA19_A396EmprCod, T01AA19_A4929Inc_Dia, T01AA19_A5728JBCLLin
            }
            , new Object[] {
            T01AA20_A396EmprCod, T01AA20_A252CliCod, T01AA20_A5809MMezCod, T01AA20_A65ArtCod
            }
            , new Object[] {
            T01AA21_A396EmprCod, T01AA21_A252CliCod, T01AA21_A5234MezCod, T01AA21_A5240MezLin
            }
            , new Object[] {
            T01AA22_A396EmprCod, T01AA22_A252CliCod, T01AA22_A65ArtCod, T01AA22_A4116estreclim
            }
            , new Object[] {
            T01AA23_A396EmprCod, T01AA23_A252CliCod, T01AA23_A65ArtCod, T01AA23_A4061EstNomCol
            }
            , new Object[] {
            T01AA24_A396EmprCod, T01AA24_A9705ErpNped, T01AA24_A8652ErpLin
            }
            , new Object[] {
            T01AA25_A396EmprCod, T01AA25_A252CliCod, T01AA25_A65ArtCod, T01AA25_A7266CAAqP
            }
            , new Object[] {
            T01AA26_A396EmprCod, T01AA26_A252CliCod, T01AA26_A65ArtCod, T01AA26_A11084H_DiaA
            }
            , new Object[] {
            T01AA27_A396EmprCod, T01AA27_A252CliCod, T01AA27_A65ArtCod, T01AA27_A10972Int_cod
            }
            , new Object[] {
            T01AA28_A396EmprCod, T01AA28_A252CliCod, T01AA28_A65ArtCod, T01AA28_A10577Pg_Procod
            }
            , new Object[] {
            T01AA29_A396EmprCod, T01AA29_A252CliCod, T01AA29_A65ArtCod, T01AA29_A10272Hz_cod
            }
            , new Object[] {
            T01AA30_A396EmprCod, T01AA30_A252CliCod, T01AA30_A65ArtCod, T01AA30_A10041ArtSH
            }
            , new Object[] {
            T01AA31_A396EmprCod, T01AA31_A252CliCod, T01AA31_A65ArtCod, T01AA31_A8427TipoCt, T01AA31_A8428CapMxMq
            }
            , new Object[] {
            T01AA32_A396EmprCod, T01AA32_A252CliCod, T01AA32_A65ArtCod, T01AA32_A8342CodPred
            }
            , new Object[] {
            T01AA33_A396EmprCod, T01AA33_A252CliCod, T01AA33_A65ArtCod, T01AA33_A8089ArtcodTj
            }
            , new Object[] {
            T01AA34_A396EmprCod, T01AA34_A252CliCod, T01AA34_A65ArtCod, T01AA34_A7956Mq_CodM
            }
            , new Object[] {
            T01AA35_A396EmprCod, T01AA35_A252CliCod, T01AA35_A65ArtCod, T01AA35_A7949Par_Art
            }
            , new Object[] {
            T01AA36_A396EmprCod, T01AA36_A252CliCod, T01AA36_A65ArtCod, T01AA36_A7135Lin_fast
            }
            , new Object[] {
            T01AA37_A396EmprCod, T01AA37_A252CliCod, T01AA37_A65ArtCod, T01AA37_A6954Mat_lin
            }
            , new Object[] {
            T01AA38_A396EmprCod, T01AA38_A602MaqCod, T01AA38_A6078MaqCliCod, T01AA38_A6079MaqArtCod
            }
            , new Object[] {
            T01AA39_A396EmprCod, T01AA39_A252CliCod, T01AA39_A65ArtCod, T01AA39_A5382EstCatAny, T01AA39_A5383EstCatSer, T01AA39_A5384EstCatTip
            }
            , new Object[] {
            T01AA40_A396EmprCod, T01AA40_A252CliCod, T01AA40_A65ArtCod, T01AA40_A4658MdlCod
            }
            , new Object[] {
            T01AA41_A396EmprCod, T01AA41_A252CliCod, T01AA41_A4175WebEmpCod
            }
            , new Object[] {
            T01AA42_A396EmprCod, T01AA42_A252CliCod, T01AA42_A4079WEBDISCOD
            }
            , new Object[] {
            T01AA43_A396EmprCod, T01AA43_A252CliCod, T01AA43_A65ArtCod, T01AA43_A4058CCFColNom, T01AA43_A4059CCFColNum
            }
            , new Object[] {
            T01AA44_A396EmprCod, T01AA44_A252CliCod, T01AA44_A65ArtCod, T01AA44_A1177Dibujo, T01AA44_A1790DibIntCod
            }
            , new Object[] {
            T01AA45_A396EmprCod, T01AA45_A252CliCod, T01AA45_A65ArtCod, T01AA45_A1080LinPre
            }
            , new Object[] {
            T01AA46_A396EmprCod, T01AA46_A3814PePCod
            }
            , new Object[] {
            T01AA47_A396EmprCod, T01AA47_A3413OpeManCod, T01AA47_A3430PreManNMt, T01AA47_A252CliCod, T01AA47_A65ArtCod
            }
            , new Object[] {
            T01AA48_A396EmprCod, T01AA48_A3415ParManNum
            }
            , new Object[] {
            T01AA49_A396EmprCod, T01AA49_A3331LanBroCod, T01AA49_A3333LanBroLin
            }
            , new Object[] {
            T01AA50_A396EmprCod, T01AA50_A252CliCod, T01AA50_A65ArtCod, T01AA50_A3319ArtCapKgs
            }
            , new Object[] {
            T01AA51_A396EmprCod, T01AA51_A252CliCod, T01AA51_A65ArtCod, T01AA51_A3288CCalCod
            }
            , new Object[] {
            T01AA52_A396EmprCod, T01AA52_A252CliCod, T01AA52_A65ArtCod, T01AA52_A3033CCCod
            }
            , new Object[] {
            T01AA53_A396EmprCod, T01AA53_A252CliCod, T01AA53_A65ArtCod, T01AA53_A2937RecIntCod
            }
            , new Object[] {
            T01AA54_A396EmprCod, T01AA54_A252CliCod, T01AA54_A65ArtCod, T01AA54_A2931Limite2
            }
            , new Object[] {
            T01AA55_A396EmprCod, T01AA55_A252CliCod, T01AA55_A65ArtCod, T01AA55_A71ArtEstAny, T01AA55_A2756ArtEstSer
            }
            , new Object[] {
            T01AA56_A396EmprCod, T01AA56_A252CliCod, T01AA56_A1504CliProCod, T01AA56_A65ArtCod
            }
            , new Object[] {
            T01AA57_A396EmprCod, T01AA57_A252CliCod, T01AA57_A65ArtCod, T01AA57_A598LinRec
            }
            , new Object[] {
            T01AA58_A396EmprCod, T01AA58_A252CliCod, T01AA58_A65ArtCod, T01AA58_A831TipColCod
            }
            , new Object[] {
            T01AA59_A396EmprCod, T01AA59_A252CliCod, T01AA59_A65ArtCod, T01AA59_A758ProCod, T01AA59_A457FasCod
            }
            , new Object[] {
            T01AA60_A396EmprCod, T01AA60_A252CliCod, T01AA60_A65ArtCod
            }
            , new Object[] {
            T01AA61_A252CliCod, T01AA61_A65ArtCod, T01AA61_A10412ProAct, T01AA61_A10553ProUserA, T01AA61_A10554ProFecA, T01AA61_A10555ProUserM, T01AA61_A10556ProFecM, T01AA61_A759ProDsc, T01AA61_A5289ProProvi, T01AA61_A10026DscCFa,
            T01AA61_A396EmprCod, T01AA61_A758ProCod
            }
            , new Object[] {
            T01AA62_A759ProDsc, T01AA62_A5289ProProvi
            }
            , new Object[] {
            T01AA63_A396EmprCod, T01AA63_A252CliCod, T01AA63_A65ArtCod, T01AA63_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AA67_A759ProDsc, T01AA67_A5289ProProvi
            }
            , new Object[] {
            T01AA68_A396EmprCod, T01AA68_A11604PArtId
            }
            , new Object[] {
            T01AA69_A396EmprCod, T01AA69_A252CliCod, T01AA69_A65ArtCod, T01AA69_A758ProCod, T01AA69_A9836FasCodM
            }
            , new Object[] {
            T01AA70_A396EmprCod, T01AA70_A252CliCod, T01AA70_A65ArtCod, T01AA70_A758ProCod, T01AA70_A6986NumLinPro
            }
            , new Object[] {
            T01AA71_A396EmprCod, T01AA71_A252CliCod, T01AA71_A65ArtCod, T01AA71_A4658MdlCod, T01AA71_A758ProCod
            }
            , new Object[] {
            T01AA72_A396EmprCod, T01AA72_A252CliCod, T01AA72_A65ArtCod, T01AA72_A758ProCod, T01AA72_A457FasCod
            }
            , new Object[] {
            T01AA73_A396EmprCod, T01AA73_A252CliCod, T01AA73_A65ArtCod, T01AA73_A758ProCod
            }
            , new Object[] {
            T01AA74_A407EmprNom, T01AA74_n407EmprNom
            }
            , new Object[] {
            T01AA75_A279CliNom
            }
         }
      );
      Z65ArtCod = "" ;
      n65ArtCod = false ;
      A65ArtCod = "" ;
      n65ArtCod = false ;
      Z252CliCod = 0 ;
      n252CliCod = false ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i10554ProFecA = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z10553ProUserA = "" ;
      A10553ProUserA = "" ;
      i10553ProUserA = "" ;
      Z10412ProAct = httpContext.getMessage( "S", "") ;
      O10412ProAct = httpContext.getMessage( "S", "") ;
      A10412ProAct = httpContext.getMessage( "S", "") ;
      T10412ProAct = httpContext.getMessage( "S", "") ;
      i10412ProAct = httpContext.getMessage( "S", "") ;
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
   private short nRcdDeleted_11 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount11 ;
   private short RcdFound11 ;
   private short nBlankRcdUsr11 ;
   private short RcdFound10 ;
   private short nIsDirty_10 ;
   private short nIsDirty_11 ;
   private int wcpOA252CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtArtCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtavnRcdDeleted_11_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtDscCFa_Enabled ;
   private int edtProUserA_Enabled ;
   private int edtProFecA_Enabled ;
   private int edtProUserM_Enabled ;
   private int edtProFecM_Enabled ;
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
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtProFecM_Enabled ;
   private int defedtProUserM_Enabled ;
   private int defedtProFecA_Enabled ;
   private int defedtProUserA_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtArtDsc_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z758ProCod ;
   private String Z10412ProAct ;
   private String Z10553ProUserA ;
   private String Z10555ProUserM ;
   private String Z10026DscCFa ;
   private String O10412ProAct ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_50_idx="0001" ;
   private String AV17UsurCod ;
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
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String sMode11 ;
   private String edtavnRcdDeleted_11_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProDsc_Internalname ;
   private String edtDscCFa_Internalname ;
   private String edtProUserA_Internalname ;
   private String edtProFecA_Internalname ;
   private String edtProUserM_Internalname ;
   private String edtProFecM_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode10 ;
   private String GXCCtl ;
   private String A759ProDsc ;
   private String A5289ProProvi ;
   private String A10026DscCFa ;
   private String A10412ProAct ;
   private String A10553ProUserA ;
   private String A10555ProUserM ;
   private String T10412ProAct ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z5289ProProvi ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_11_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtDscCFa_Jsonclick ;
   private String edtProUserA_Jsonclick ;
   private String edtProFecA_Jsonclick ;
   private String edtProUserM_Jsonclick ;
   private String edtProFecM_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10412ProAct ;
   private String i10553ProUserA ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ279CliNom ;
   private String ZZ407EmprNom ;
   private String ZZ69ArtDsc ;
   private java.util.Date Z10554ProFecA ;
   private java.util.Date Z10556ProFecM ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date i10554ProFecA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n758ProCod ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n69ArtDsc ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkProProvi ;
   private ICheckbox chkProAct ;
   private IDataStoreProvider pr_default ;
   private String[] T01AA7_A407EmprNom ;
   private boolean[] T01AA7_n407EmprNom ;
   private String[] T01AA8_A279CliNom ;
   private String[] T01AA9_A65ArtCod ;
   private boolean[] T01AA9_n65ArtCod ;
   private String[] T01AA9_A279CliNom ;
   private String[] T01AA9_A407EmprNom ;
   private boolean[] T01AA9_n407EmprNom ;
   private String[] T01AA9_A69ArtDsc ;
   private boolean[] T01AA9_n69ArtDsc ;
   private String[] T01AA9_A396EmprCod ;
   private int[] T01AA9_A252CliCod ;
   private boolean[] T01AA9_n252CliCod ;
   private String[] T01AA10_A396EmprCod ;
   private int[] T01AA10_A252CliCod ;
   private boolean[] T01AA10_n252CliCod ;
   private String[] T01AA10_A65ArtCod ;
   private boolean[] T01AA10_n65ArtCod ;
   private String[] T01AA6_A65ArtCod ;
   private boolean[] T01AA6_n65ArtCod ;
   private String[] T01AA6_A69ArtDsc ;
   private boolean[] T01AA6_n69ArtDsc ;
   private String[] T01AA6_A396EmprCod ;
   private int[] T01AA6_A252CliCod ;
   private boolean[] T01AA6_n252CliCod ;
   private String[] T01AA11_A396EmprCod ;
   private int[] T01AA11_A252CliCod ;
   private boolean[] T01AA11_n252CliCod ;
   private String[] T01AA11_A65ArtCod ;
   private boolean[] T01AA11_n65ArtCod ;
   private String[] T01AA12_A396EmprCod ;
   private int[] T01AA12_A252CliCod ;
   private boolean[] T01AA12_n252CliCod ;
   private String[] T01AA12_A65ArtCod ;
   private boolean[] T01AA12_n65ArtCod ;
   private String[] T01AA5_A65ArtCod ;
   private boolean[] T01AA5_n65ArtCod ;
   private String[] T01AA5_A69ArtDsc ;
   private boolean[] T01AA5_n69ArtDsc ;
   private String[] T01AA5_A396EmprCod ;
   private int[] T01AA5_A252CliCod ;
   private boolean[] T01AA5_n252CliCod ;
   private String[] T01AA16_A396EmprCod ;
   private int[] T01AA16_A252CliCod ;
   private boolean[] T01AA16_n252CliCod ;
   private String[] T01AA16_A65ArtCod ;
   private boolean[] T01AA16_n65ArtCod ;
   private byte[] T01AA16_A499GrpFamCod ;
   private String[] T01AA17_A396EmprCod ;
   private int[] T01AA17_A252CliCod ;
   private boolean[] T01AA17_n252CliCod ;
   private String[] T01AA17_A12814ARTConID ;
   private String[] T01AA17_A65ArtCod ;
   private boolean[] T01AA17_n65ArtCod ;
   private String[] T01AA18_A396EmprCod ;
   private int[] T01AA18_A252CliCod ;
   private boolean[] T01AA18_n252CliCod ;
   private String[] T01AA18_A65ArtCod ;
   private boolean[] T01AA18_n65ArtCod ;
   private byte[] T01AA18_A12363SocInt ;
   private String[] T01AA19_A396EmprCod ;
   private java.util.Date[] T01AA19_A4929Inc_Dia ;
   private short[] T01AA19_A5728JBCLLin ;
   private String[] T01AA20_A396EmprCod ;
   private int[] T01AA20_A252CliCod ;
   private boolean[] T01AA20_n252CliCod ;
   private String[] T01AA20_A5809MMezCod ;
   private String[] T01AA20_A65ArtCod ;
   private boolean[] T01AA20_n65ArtCod ;
   private String[] T01AA21_A396EmprCod ;
   private int[] T01AA21_A252CliCod ;
   private boolean[] T01AA21_n252CliCod ;
   private String[] T01AA21_A5234MezCod ;
   private byte[] T01AA21_A5240MezLin ;
   private String[] T01AA22_A396EmprCod ;
   private int[] T01AA22_A252CliCod ;
   private boolean[] T01AA22_n252CliCod ;
   private String[] T01AA22_A65ArtCod ;
   private boolean[] T01AA22_n65ArtCod ;
   private int[] T01AA22_A4116estreclim ;
   private String[] T01AA23_A396EmprCod ;
   private int[] T01AA23_A252CliCod ;
   private boolean[] T01AA23_n252CliCod ;
   private String[] T01AA23_A65ArtCod ;
   private boolean[] T01AA23_n65ArtCod ;
   private String[] T01AA23_A4061EstNomCol ;
   private String[] T01AA24_A396EmprCod ;
   private String[] T01AA24_A9705ErpNped ;
   private short[] T01AA24_A8652ErpLin ;
   private String[] T01AA25_A396EmprCod ;
   private int[] T01AA25_A252CliCod ;
   private boolean[] T01AA25_n252CliCod ;
   private String[] T01AA25_A65ArtCod ;
   private boolean[] T01AA25_n65ArtCod ;
   private String[] T01AA25_A7266CAAqP ;
   private String[] T01AA26_A396EmprCod ;
   private int[] T01AA26_A252CliCod ;
   private boolean[] T01AA26_n252CliCod ;
   private String[] T01AA26_A65ArtCod ;
   private boolean[] T01AA26_n65ArtCod ;
   private java.util.Date[] T01AA26_A11084H_DiaA ;
   private String[] T01AA27_A396EmprCod ;
   private int[] T01AA27_A252CliCod ;
   private boolean[] T01AA27_n252CliCod ;
   private String[] T01AA27_A65ArtCod ;
   private boolean[] T01AA27_n65ArtCod ;
   private byte[] T01AA27_A10972Int_cod ;
   private String[] T01AA28_A396EmprCod ;
   private int[] T01AA28_A252CliCod ;
   private boolean[] T01AA28_n252CliCod ;
   private String[] T01AA28_A65ArtCod ;
   private boolean[] T01AA28_n65ArtCod ;
   private String[] T01AA28_A10577Pg_Procod ;
   private String[] T01AA29_A396EmprCod ;
   private int[] T01AA29_A252CliCod ;
   private boolean[] T01AA29_n252CliCod ;
   private String[] T01AA29_A65ArtCod ;
   private boolean[] T01AA29_n65ArtCod ;
   private String[] T01AA29_A10272Hz_cod ;
   private String[] T01AA30_A396EmprCod ;
   private int[] T01AA30_A252CliCod ;
   private boolean[] T01AA30_n252CliCod ;
   private String[] T01AA30_A65ArtCod ;
   private boolean[] T01AA30_n65ArtCod ;
   private String[] T01AA30_A10041ArtSH ;
   private String[] T01AA31_A396EmprCod ;
   private int[] T01AA31_A252CliCod ;
   private boolean[] T01AA31_n252CliCod ;
   private String[] T01AA31_A65ArtCod ;
   private boolean[] T01AA31_n65ArtCod ;
   private String[] T01AA31_A8427TipoCt ;
   private int[] T01AA31_A8428CapMxMq ;
   private String[] T01AA32_A396EmprCod ;
   private int[] T01AA32_A252CliCod ;
   private boolean[] T01AA32_n252CliCod ;
   private String[] T01AA32_A65ArtCod ;
   private boolean[] T01AA32_n65ArtCod ;
   private short[] T01AA32_A8342CodPred ;
   private String[] T01AA33_A396EmprCod ;
   private int[] T01AA33_A252CliCod ;
   private boolean[] T01AA33_n252CliCod ;
   private String[] T01AA33_A65ArtCod ;
   private boolean[] T01AA33_n65ArtCod ;
   private String[] T01AA33_A8089ArtcodTj ;
   private String[] T01AA34_A396EmprCod ;
   private int[] T01AA34_A252CliCod ;
   private boolean[] T01AA34_n252CliCod ;
   private String[] T01AA34_A65ArtCod ;
   private boolean[] T01AA34_n65ArtCod ;
   private String[] T01AA34_A7956Mq_CodM ;
   private String[] T01AA35_A396EmprCod ;
   private int[] T01AA35_A252CliCod ;
   private boolean[] T01AA35_n252CliCod ;
   private String[] T01AA35_A65ArtCod ;
   private boolean[] T01AA35_n65ArtCod ;
   private short[] T01AA35_A7949Par_Art ;
   private String[] T01AA36_A396EmprCod ;
   private int[] T01AA36_A252CliCod ;
   private boolean[] T01AA36_n252CliCod ;
   private String[] T01AA36_A65ArtCod ;
   private boolean[] T01AA36_n65ArtCod ;
   private short[] T01AA36_A7135Lin_fast ;
   private String[] T01AA37_A396EmprCod ;
   private int[] T01AA37_A252CliCod ;
   private boolean[] T01AA37_n252CliCod ;
   private String[] T01AA37_A65ArtCod ;
   private boolean[] T01AA37_n65ArtCod ;
   private short[] T01AA37_A6954Mat_lin ;
   private String[] T01AA38_A396EmprCod ;
   private String[] T01AA38_A602MaqCod ;
   private int[] T01AA38_A6078MaqCliCod ;
   private String[] T01AA38_A6079MaqArtCod ;
   private String[] T01AA39_A396EmprCod ;
   private int[] T01AA39_A252CliCod ;
   private boolean[] T01AA39_n252CliCod ;
   private String[] T01AA39_A65ArtCod ;
   private boolean[] T01AA39_n65ArtCod ;
   private short[] T01AA39_A5382EstCatAny ;
   private String[] T01AA39_A5383EstCatSer ;
   private short[] T01AA39_A5384EstCatTip ;
   private String[] T01AA40_A396EmprCod ;
   private int[] T01AA40_A252CliCod ;
   private boolean[] T01AA40_n252CliCod ;
   private String[] T01AA40_A65ArtCod ;
   private boolean[] T01AA40_n65ArtCod ;
   private String[] T01AA40_A4658MdlCod ;
   private String[] T01AA41_A396EmprCod ;
   private int[] T01AA41_A252CliCod ;
   private boolean[] T01AA41_n252CliCod ;
   private String[] T01AA41_A4175WebEmpCod ;
   private String[] T01AA42_A396EmprCod ;
   private int[] T01AA42_A252CliCod ;
   private boolean[] T01AA42_n252CliCod ;
   private String[] T01AA42_A4079WEBDISCOD ;
   private String[] T01AA43_A396EmprCod ;
   private int[] T01AA43_A252CliCod ;
   private boolean[] T01AA43_n252CliCod ;
   private String[] T01AA43_A65ArtCod ;
   private boolean[] T01AA43_n65ArtCod ;
   private String[] T01AA43_A4058CCFColNom ;
   private int[] T01AA43_A4059CCFColNum ;
   private String[] T01AA44_A396EmprCod ;
   private int[] T01AA44_A252CliCod ;
   private boolean[] T01AA44_n252CliCod ;
   private String[] T01AA44_A65ArtCod ;
   private boolean[] T01AA44_n65ArtCod ;
   private String[] T01AA44_A1177Dibujo ;
   private int[] T01AA44_A1790DibIntCod ;
   private String[] T01AA45_A396EmprCod ;
   private int[] T01AA45_A252CliCod ;
   private boolean[] T01AA45_n252CliCod ;
   private String[] T01AA45_A65ArtCod ;
   private boolean[] T01AA45_n65ArtCod ;
   private byte[] T01AA45_A1080LinPre ;
   private String[] T01AA46_A396EmprCod ;
   private long[] T01AA46_A3814PePCod ;
   private String[] T01AA47_A396EmprCod ;
   private byte[] T01AA47_A3413OpeManCod ;
   private String[] T01AA47_A3430PreManNMt ;
   private int[] T01AA47_A252CliCod ;
   private boolean[] T01AA47_n252CliCod ;
   private String[] T01AA47_A65ArtCod ;
   private boolean[] T01AA47_n65ArtCod ;
   private String[] T01AA48_A396EmprCod ;
   private int[] T01AA48_A3415ParManNum ;
   private String[] T01AA49_A396EmprCod ;
   private byte[] T01AA49_A3331LanBroCod ;
   private short[] T01AA49_A3333LanBroLin ;
   private String[] T01AA50_A396EmprCod ;
   private int[] T01AA50_A252CliCod ;
   private boolean[] T01AA50_n252CliCod ;
   private String[] T01AA50_A65ArtCod ;
   private boolean[] T01AA50_n65ArtCod ;
   private java.math.BigDecimal[] T01AA50_A3319ArtCapKgs ;
   private String[] T01AA51_A396EmprCod ;
   private int[] T01AA51_A252CliCod ;
   private boolean[] T01AA51_n252CliCod ;
   private String[] T01AA51_A65ArtCod ;
   private boolean[] T01AA51_n65ArtCod ;
   private String[] T01AA51_A3288CCalCod ;
   private String[] T01AA52_A396EmprCod ;
   private int[] T01AA52_A252CliCod ;
   private boolean[] T01AA52_n252CliCod ;
   private String[] T01AA52_A65ArtCod ;
   private boolean[] T01AA52_n65ArtCod ;
   private String[] T01AA52_A3033CCCod ;
   private String[] T01AA53_A396EmprCod ;
   private int[] T01AA53_A252CliCod ;
   private boolean[] T01AA53_n252CliCod ;
   private String[] T01AA53_A65ArtCod ;
   private boolean[] T01AA53_n65ArtCod ;
   private byte[] T01AA53_A2937RecIntCod ;
   private String[] T01AA54_A396EmprCod ;
   private int[] T01AA54_A252CliCod ;
   private boolean[] T01AA54_n252CliCod ;
   private String[] T01AA54_A65ArtCod ;
   private boolean[] T01AA54_n65ArtCod ;
   private short[] T01AA54_A2931Limite2 ;
   private String[] T01AA55_A396EmprCod ;
   private int[] T01AA55_A252CliCod ;
   private boolean[] T01AA55_n252CliCod ;
   private String[] T01AA55_A65ArtCod ;
   private boolean[] T01AA55_n65ArtCod ;
   private short[] T01AA55_A71ArtEstAny ;
   private String[] T01AA55_A2756ArtEstSer ;
   private String[] T01AA56_A396EmprCod ;
   private int[] T01AA56_A252CliCod ;
   private boolean[] T01AA56_n252CliCod ;
   private String[] T01AA56_A1504CliProCod ;
   private String[] T01AA56_A65ArtCod ;
   private boolean[] T01AA56_n65ArtCod ;
   private String[] T01AA57_A396EmprCod ;
   private int[] T01AA57_A252CliCod ;
   private boolean[] T01AA57_n252CliCod ;
   private String[] T01AA57_A65ArtCod ;
   private boolean[] T01AA57_n65ArtCod ;
   private byte[] T01AA57_A598LinRec ;
   private String[] T01AA58_A396EmprCod ;
   private int[] T01AA58_A252CliCod ;
   private boolean[] T01AA58_n252CliCod ;
   private String[] T01AA58_A65ArtCod ;
   private boolean[] T01AA58_n65ArtCod ;
   private byte[] T01AA58_A831TipColCod ;
   private String[] T01AA59_A396EmprCod ;
   private int[] T01AA59_A252CliCod ;
   private boolean[] T01AA59_n252CliCod ;
   private String[] T01AA59_A65ArtCod ;
   private boolean[] T01AA59_n65ArtCod ;
   private String[] T01AA59_A758ProCod ;
   private boolean[] T01AA59_n758ProCod ;
   private String[] T01AA59_A457FasCod ;
   private String[] T01AA60_A396EmprCod ;
   private int[] T01AA60_A252CliCod ;
   private boolean[] T01AA60_n252CliCod ;
   private String[] T01AA60_A65ArtCod ;
   private boolean[] T01AA60_n65ArtCod ;
   private int[] T01AA61_A252CliCod ;
   private boolean[] T01AA61_n252CliCod ;
   private String[] T01AA61_A65ArtCod ;
   private boolean[] T01AA61_n65ArtCod ;
   private String[] T01AA61_A10412ProAct ;
   private String[] T01AA61_A10553ProUserA ;
   private java.util.Date[] T01AA61_A10554ProFecA ;
   private String[] T01AA61_A10555ProUserM ;
   private java.util.Date[] T01AA61_A10556ProFecM ;
   private String[] T01AA61_A759ProDsc ;
   private String[] T01AA61_A5289ProProvi ;
   private String[] T01AA61_A10026DscCFa ;
   private String[] T01AA61_A396EmprCod ;
   private String[] T01AA61_A758ProCod ;
   private boolean[] T01AA61_n758ProCod ;
   private String[] T01AA4_A759ProDsc ;
   private String[] T01AA4_A5289ProProvi ;
   private String[] T01AA62_A759ProDsc ;
   private String[] T01AA62_A5289ProProvi ;
   private String[] T01AA63_A396EmprCod ;
   private int[] T01AA63_A252CliCod ;
   private boolean[] T01AA63_n252CliCod ;
   private String[] T01AA63_A65ArtCod ;
   private boolean[] T01AA63_n65ArtCod ;
   private String[] T01AA63_A758ProCod ;
   private boolean[] T01AA63_n758ProCod ;
   private int[] T01AA3_A252CliCod ;
   private boolean[] T01AA3_n252CliCod ;
   private String[] T01AA3_A65ArtCod ;
   private boolean[] T01AA3_n65ArtCod ;
   private String[] T01AA3_A10412ProAct ;
   private String[] T01AA3_A10553ProUserA ;
   private java.util.Date[] T01AA3_A10554ProFecA ;
   private String[] T01AA3_A10555ProUserM ;
   private java.util.Date[] T01AA3_A10556ProFecM ;
   private String[] T01AA3_A10026DscCFa ;
   private String[] T01AA3_A396EmprCod ;
   private String[] T01AA3_A758ProCod ;
   private boolean[] T01AA3_n758ProCod ;
   private int[] T01AA2_A252CliCod ;
   private boolean[] T01AA2_n252CliCod ;
   private String[] T01AA2_A65ArtCod ;
   private boolean[] T01AA2_n65ArtCod ;
   private String[] T01AA2_A10412ProAct ;
   private String[] T01AA2_A10553ProUserA ;
   private java.util.Date[] T01AA2_A10554ProFecA ;
   private String[] T01AA2_A10555ProUserM ;
   private java.util.Date[] T01AA2_A10556ProFecM ;
   private String[] T01AA2_A10026DscCFa ;
   private String[] T01AA2_A396EmprCod ;
   private String[] T01AA2_A758ProCod ;
   private boolean[] T01AA2_n758ProCod ;
   private String[] T01AA67_A759ProDsc ;
   private String[] T01AA67_A5289ProProvi ;
   private String[] T01AA68_A396EmprCod ;
   private int[] T01AA68_A11604PArtId ;
   private String[] T01AA69_A396EmprCod ;
   private int[] T01AA69_A252CliCod ;
   private boolean[] T01AA69_n252CliCod ;
   private String[] T01AA69_A65ArtCod ;
   private boolean[] T01AA69_n65ArtCod ;
   private String[] T01AA69_A758ProCod ;
   private boolean[] T01AA69_n758ProCod ;
   private String[] T01AA69_A9836FasCodM ;
   private String[] T01AA70_A396EmprCod ;
   private int[] T01AA70_A252CliCod ;
   private boolean[] T01AA70_n252CliCod ;
   private String[] T01AA70_A65ArtCod ;
   private boolean[] T01AA70_n65ArtCod ;
   private String[] T01AA70_A758ProCod ;
   private boolean[] T01AA70_n758ProCod ;
   private short[] T01AA70_A6986NumLinPro ;
   private String[] T01AA71_A396EmprCod ;
   private int[] T01AA71_A252CliCod ;
   private boolean[] T01AA71_n252CliCod ;
   private String[] T01AA71_A65ArtCod ;
   private boolean[] T01AA71_n65ArtCod ;
   private String[] T01AA71_A4658MdlCod ;
   private String[] T01AA71_A758ProCod ;
   private boolean[] T01AA71_n758ProCod ;
   private String[] T01AA72_A396EmprCod ;
   private int[] T01AA72_A252CliCod ;
   private boolean[] T01AA72_n252CliCod ;
   private String[] T01AA72_A65ArtCod ;
   private boolean[] T01AA72_n65ArtCod ;
   private String[] T01AA72_A758ProCod ;
   private boolean[] T01AA72_n758ProCod ;
   private String[] T01AA72_A457FasCod ;
   private String[] T01AA73_A396EmprCod ;
   private int[] T01AA73_A252CliCod ;
   private boolean[] T01AA73_n252CliCod ;
   private String[] T01AA73_A65ArtCod ;
   private boolean[] T01AA73_n65ArtCod ;
   private String[] T01AA73_A758ProCod ;
   private boolean[] T01AA73_n758ProCod ;
   private String[] T01AA74_A407EmprNom ;
   private boolean[] T01AA74_n407EmprNom ;
   private String[] T01AA75_A279CliNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tartprl__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartprl__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartprl__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartprl__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tartprl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AA2", "SELECT CliCod, ArtCod, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, DscCFa, EmprCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?  FOR UPDATE OF ProAct, ProUserA, ProFecA, ProUserM, ProFecM, DscCFa NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA3", "SELECT CliCod, ArtCod, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, DscCFa, EmprCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA4", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA5", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA6", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA9", "SELECT /*+ FIRST_ROWS(1) */ TM1.ArtCod, T3.CliNom, T2.EmprNom, TM1.ArtDsc, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AA13", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01AA14", "UPDATE TXPARTICU SET ArtDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T01AA15", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T01AA16", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA17", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA18", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA19", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA20", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA21", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA24", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA26", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA27", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA30", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA31", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA33", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA34", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA35", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA36", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA37", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA38", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA39", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA40", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA41", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA42", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA43", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA44", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA45", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA46", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA47", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA48", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA49", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA50", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA51", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA52", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA53", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA54", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA55", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA56", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA57", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA58", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA59", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA60", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA61", "SELECT T1.CliCod, T1.ArtCod, T1.ProAct, T1.ProUserA, T1.ProFecA, T1.ProUserM, T1.ProFecM, T2.ProDsc, T2.ProProvi, T1.DscCFa, T1.EmprCod, T1.ProCod FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA62", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA63", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AA64", "INSERT INTO TXPARTLIN(CliCod, ArtCod, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, DscCFa, EmprCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T01AA65", "UPDATE TXPARTLIN SET ProAct=?, ProUserA=?, ProFecA=?, ProUserM=?, ProFecM=?, DscCFa=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T01AA66", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new ForEachCursor("T01AA67", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA68", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA69", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA70", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro FROM TXPPARART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA71", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA72", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AA73", "SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA74", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AA75", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 59 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 21 :
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 36 :
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
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 38 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 39 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 40 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 41 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 42 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 43 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 44 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 45 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 46 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 47 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 48 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 49 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 50 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 51 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 52 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 53 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 54 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 55 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 56 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 57 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 58 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 59 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
            case 61 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 62 :
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
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 1);
               stmt.setString(4, (String)parms[5], 10);
               stmt.setDateTime(5, (java.util.Date)parms[6], false);
               stmt.setString(6, (String)parms[7], 10);
               stmt.setDateTime(7, (java.util.Date)parms[8], false);
               stmt.setString(8, (String)parms[9], 30);
               stmt.setString(9, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 8);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 8);
               }
               return;
            case 64 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 65 :
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
            case 66 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 67 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 68 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 69 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 70 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 71 :
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
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 73 :
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
      }
   }

}

