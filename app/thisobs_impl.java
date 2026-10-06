package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thisobs_impl extends GXDataArea
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
            A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO OBSERVACIONES RECETA", ""), (short)(0)) ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
      A11321HreUltObs = (short)(GXutil.lval( httpContext.GetPar( "HreUltObs"))) ;
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

   public thisobs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thisobs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thisobs_impl.class ));
   }

   public thisobs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISOBS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Linea Maquina. Hist.Receta", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinMaq_Jsonclick, 0, "", "", "", "", "", 1, edtHreLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Ultima Linea Obs", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreUltObs_Internalname, GXutil.ltrim( localUtil.ntoc( A11321HreUltObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreUltObs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11321HreUltObs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11321HreUltObs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreUltObs_Jsonclick, 0, "", "", "", "", "", 1, edtHreUltObs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISOBS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1511 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1511 = (short)(1) ;
            scanStart1BO1511( ) ;
            while ( RcdFound1511 != 0 )
            {
               init_level_properties1511( ) ;
               getByPrimaryKey1BO1511( ) ;
               addRow1BO1511( ) ;
               scanNext1BO1511( ) ;
            }
            scanEnd1BO1511( ) ;
            nBlankRcdCount1511 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11321HreUltObs = A11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
         standaloneNotModal1BO1511( ) ;
         standaloneModal1BO1511( ) ;
         sMode1511 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRow1BO1511( ) ;
            edtavnRcdDeleted_1511_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1511_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1511_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1511_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHreLinObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHreTxtObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETXTOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTxtObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_1511 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BO1511( ) ;
            }
            sendRow1BO1511( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode1511 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11321HreUltObs = B11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1511 = (short)(5) ;
         nRcdExists_1511 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BO1511( ) ;
            while ( RcdFound1511 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_601511( ) ;
               init_level_properties1511( ) ;
               standaloneNotModal1BO1511( ) ;
               getByPrimaryKey1BO1511( ) ;
               standaloneModal1BO1511( ) ;
               addRow1BO1511( ) ;
               scanNext1BO1511( ) ;
            }
            scanEnd1BO1511( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1511 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_601511( ) ;
      initAll1BO1511( ) ;
      init_level_properties1511( ) ;
      B11321HreUltObs = A11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      nRcdExists_1511 = (short)(0) ;
      nIsMod_1511 = (short)(0) ;
      nRcdDeleted_1511 = (short)(0) ;
      nBlankRcdCount1511 = (short)(nBlankRcdUsr1511+nBlankRcdCount1511) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1511 > 0 )
      {
         standaloneNotModal1BO1511( ) ;
         standaloneModal1BO1511( ) ;
         addRow1BO1511( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHreLinObs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1511 = (short)(nBlankRcdCount1511-1) ;
      }
      Gx_mode = sMode1511 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11321HreUltObs = B11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISOBS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISOBS.htm");
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
      e111BO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4492HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4493HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4494HreBarPar = httpContext.cgiGet( "Z4494HreBarPar") ;
            Z4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4495HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z4545HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11321HreUltObs = (short)(localUtil.ctol( httpContext.cgiGet( "Z11321HreUltObs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11321HreUltObs = (short)(localUtil.ctol( httpContext.cgiGet( "O11321HreUltObs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            A11321HreUltObs = (short)(localUtil.ctol( httpContext.cgiGet( edtHreUltObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
            if ( isUpd( )  )
            {
               forbiddenHiddens2.add("HreTxtObs", GXutil.rtrim( localUtil.format( A11323HreTxtObs, "")));
            }
            hsh2 = httpContext.cgiGet( "hsh2") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens2.toString(), hsh2, GXKey) )
            {
               GXutil.writeLogError("thisobs:[ CondSecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens2.toJSonString());
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
               A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
               A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
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
                        e111BO2 ();
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
            initAll1BO678( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1511_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1511_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributes1BO678( ) ;
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

   public void confirm_1BO0( )
   {
      beforeValidate1BO678( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BO678( ) ;
         }
         else
         {
            checkExtendedTable1BO678( ) ;
            if ( AnyError == 0 )
            {
               zm1BO678( 10) ;
               zm1BO678( 11) ;
            }
            closeExtendedTableCursors1BO678( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode678 = Gx_mode ;
         confirm_1BO1511( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode678 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BO0( ) ;
      }
   }

   public void confirm_1BO1511( )
   {
      s11321HreUltObs = O11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1BO1511( ) ;
         if ( ( nRcdExists_1511 != 0 ) || ( nIsMod_1511 != 0 ) )
         {
            getKey1BO1511( ) ;
            if ( ( nRcdExists_1511 == 0 ) && ( nRcdDeleted_1511 == 0 ) )
            {
               if ( RcdFound1511 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BO1511( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BO1511( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BO1511( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11321HreUltObs = A11321HreUltObs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "HRELINOBS_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHreLinObs_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1511 != 0 )
               {
                  if ( nRcdDeleted_1511 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BO1511( ) ;
                     load1BO1511( ) ;
                     beforeValidate1BO1511( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BO1511( ) ;
                        O11321HreUltObs = A11321HreUltObs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1511 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BO1511( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BO1511( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BO1511( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11321HreUltObs = A11321HreUltObs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1511 == 0 )
                  {
                     GXCCtl = "HRELINOBS_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreLinObs_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1511_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLinObs_Internalname, GXutil.ltrim( localUtil.ntoc( A11322HreLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTxtObs_Internalname, GXutil.rtrim( A11323HreTxtObs)) ;
         httpContext.changePostValue( "ZT_"+"Z11322HreLinObs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11322HreLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11323HreTxtObs_"+sGXsfl_60_idx, GXutil.rtrim( Z11323HreTxtObs)) ;
         httpContext.changePostValue( "nRcdDeleted_1511_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1511_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1511_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1511 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1511_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1511_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELINOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETXTOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTxtObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11321HreUltObs = s11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BO0( )
   {
   }

   public void e111BO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thisobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      thisobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thisobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thisobs_impl.this.A396EmprCod = GXv_char2[0] ;
      thisobs_impl.this.AV11EmprNom = GXv_char3[0] ;
      thisobs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1BO678( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11321HreUltObs = T01BO5_A11321HreUltObs[0] ;
         }
         else
         {
            Z11321HreUltObs = A11321HreUltObs ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z11321HreUltObs = A11321HreUltObs ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtHreUltObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUltObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUltObs_Enabled), 5, 0), true);
      AV33Pgmname = "THISOBS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtHreUltObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUltObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUltObs_Enabled), 5, 0), true);
      /* Using cursor T01BO6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BO6_A407EmprNom[0] ;
      n407EmprNom = T01BO6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01BO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
      }
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

   public void load1BO678( )
   {
      /* Using cursor T01BO8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A407EmprNom = T01BO8_A407EmprNom[0] ;
         n407EmprNom = T01BO8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11321HreUltObs = T01BO8_A11321HreUltObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
         zm1BO678( -9) ;
      }
      pr_default.close(6);
      onLoadActions1BO678( ) ;
   }

   public void onLoadActions1BO678( )
   {
   }

   public void checkExtendedTable1BO678( )
   {
      nIsDirty_678 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1BO678( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1BO678( )
   {
      /* Using cursor T01BO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
      else
      {
         RcdFound678 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(3) != 101) && ( T01BO5_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( GXutil.strcmp(T01BO5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BO5_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01BO5_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T01BO5_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01BO5_A4495HreNumCie[0] == A4495HreNumCie ) )
      {
         zm1BO678( 9) ;
         RcdFound678 = (short)(1) ;
         A11321HreUltObs = T01BO5_A11321HreUltObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
         O11321HreUltObs = A11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BO678( ) ;
         if ( AnyError == 1 )
         {
            RcdFound678 = (short)(0) ;
            initializeNonKey1BO678( ) ;
         }
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound678 = (short)(0) ;
         initializeNonKey1BO678( ) ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1BO678( ) ;
      if ( RcdFound678 == 0 )
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
      RcdFound678 = (short)(0) ;
      /* Using cursor T01BO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01BO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BO10_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01BO10_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T01BO10_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01BO10_A4495HreNumCie[0] == A4495HreNumCie ) && ( T01BO10_A4545HreLinMaq[0] == A4545HreLinMaq ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01BO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BO10_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01BO10_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T01BO10_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01BO10_A4495HreNumCie[0] == A4495HreNumCie ) && ( T01BO10_A4545HreLinMaq[0] == A4545HreLinMaq ) )
         {
            RcdFound678 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound678 = (short)(0) ;
      /* Using cursor T01BO11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01BO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BO11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01BO11_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T01BO11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01BO11_A4495HreNumCie[0] == A4495HreNumCie ) && ( T01BO11_A4545HreLinMaq[0] == A4545HreLinMaq ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01BO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01BO11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01BO11_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T01BO11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01BO11_A4495HreNumCie[0] == A4495HreNumCie ) && ( T01BO11_A4545HreLinMaq[0] == A4545HreLinMaq ) )
         {
            RcdFound678 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BO678( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11321HreUltObs = O11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
         insert1BO678( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound678 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11321HreUltObs = O11321HreUltObs ;
               httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11321HreUltObs = O11321HreUltObs ;
               httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
               update1BO678( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11321HreUltObs = O11321HreUltObs ;
               httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
               insert1BO678( ) ;
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
                  A11321HreUltObs = O11321HreUltObs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
                  insert1BO678( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11321HreUltObs = O11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
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
      getKey1BO678( ) ;
      if ( RcdFound678 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thisobs");
   }

   public void insert_check( )
   {
      confirm_1BO0( ) ;
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
      if ( RcdFound678 == 0 )
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
      scanStart1BO678( ) ;
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BO678( ) ;
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
      if ( RcdFound678 == 0 )
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
      if ( RcdFound678 == 0 )
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
      scanStart1BO678( ) ;
      if ( RcdFound678 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound678 != 0 )
         {
            scanNext1BO678( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BO678( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BO678( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11321HreUltObs != T01BO4_A11321HreUltObs[0] ) )
         {
            if ( Z11321HreUltObs != T01BO4_A11321HreUltObs[0] )
            {
               GXutil.writeLogln("thisobs:[seudo value changed for attri]"+"HreUltObs");
               GXutil.writeLogRaw("Old: ",Z11321HreUltObs);
               GXutil.writeLogRaw("Current: ",T01BO4_A11321HreUltObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BO678( )
   {
      beforeValidate1BO678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BO678( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BO678( 0) ;
         checkOptimisticConcurrency1BO678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BO678( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BO678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BO12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A4545HreLinMaq), Short.valueOf(A11321HreUltObs), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1BO678( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BO0( ) ;
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
            load1BO678( ) ;
         }
         endLevel1BO678( ) ;
      }
      closeExtendedTableCursors1BO678( ) ;
   }

   public void update1BO678( )
   {
      beforeValidate1BO678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BO678( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BO678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BO678( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BO678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BO13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A11321HreUltObs), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1BO678( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BO678( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BO0( ) ;
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
         endLevel1BO678( ) ;
      }
      closeExtendedTableCursors1BO678( ) ;
   }

   public void deferredUpdate1BO678( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BO678( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BO678( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BO678( ) ;
         afterConfirm1BO678( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BO678( ) ;
            if ( AnyError == 0 )
            {
               A11321HreUltObs = O11321HreUltObs ;
               httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
               scanStart1BO1511( ) ;
               while ( RcdFound1511 != 0 )
               {
                  getByPrimaryKey1BO1511( ) ;
                  delete1BO1511( ) ;
                  scanNext1BO1511( ) ;
                  O11321HreUltObs = A11321HreUltObs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
               }
               scanEnd1BO1511( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BO14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound678 == 0 )
                        {
                           initAll1BO678( ) ;
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
                        resetCaption1BO0( ) ;
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
      sMode678 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BO678( ) ;
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BO678( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01BO15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01BO16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01BO17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1BO1511( )
   {
      s11321HreUltObs = O11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRow1BO1511( ) ;
         if ( ( nRcdExists_1511 != 0 ) || ( nIsMod_1511 != 0 ) )
         {
            standaloneNotModal1BO1511( ) ;
            getKey1BO1511( ) ;
            if ( ( nRcdExists_1511 == 0 ) && ( nRcdDeleted_1511 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BO1511( ) ;
            }
            else
            {
               if ( RcdFound1511 != 0 )
               {
                  if ( ( nRcdDeleted_1511 != 0 ) && ( nRcdExists_1511 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BO1511( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1511 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BO1511( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1511 == 0 )
                  {
                     GXCCtl = "HRELINOBS_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreLinObs_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11321HreUltObs = A11321HreUltObs ;
            httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1511_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLinObs_Internalname, GXutil.ltrim( localUtil.ntoc( A11322HreLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTxtObs_Internalname, GXutil.rtrim( A11323HreTxtObs)) ;
         httpContext.changePostValue( "ZT_"+"Z11322HreLinObs_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z11322HreLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11323HreTxtObs_"+sGXsfl_60_idx, GXutil.rtrim( Z11323HreTxtObs)) ;
         httpContext.changePostValue( "nRcdDeleted_1511_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1511_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1511_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1511 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1511_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1511_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELINOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETXTOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTxtObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BO1511( ) ;
      if ( AnyError != 0 )
      {
         O11321HreUltObs = s11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      }
      nRcdExists_1511 = (short)(0) ;
      nIsMod_1511 = (short)(0) ;
      nRcdDeleted_1511 = (short)(0) ;
   }

   public void processLevel1BO678( )
   {
      /* Save parent mode. */
      sMode678 = Gx_mode ;
      processNestedLevel1BO1511( ) ;
      if ( AnyError != 0 )
      {
         O11321HreUltObs = s11321HreUltObs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01BO18 */
      pr_default.execute(16, new Object[] {Short.valueOf(A11321HreUltObs), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
   }

   public void endLevel1BO678( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1BO678( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thisobs");
         if ( AnyError == 0 )
         {
            confirmValues1BO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thisobs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BO678( )
   {
      /* Scan By routine */
      /* Using cursor T01BO19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BO678( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
   }

   public void scanEnd1BO678( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1BO678( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BO678( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BO678( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BO678( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BO678( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BO678( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BO678( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHreBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarCod_Enabled), 5, 0), true);
      edtHreBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarReo_Enabled), 5, 0), true);
      edtHreBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPar_Enabled), 5, 0), true);
      edtHreNumCie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumCie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Enabled), 5, 0), true);
      edtHreLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), true);
      edtHreUltObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUltObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUltObs_Enabled), 5, 0), true);
   }

   public void zm1BO1511( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11323HreTxtObs = T01BO3_A11323HreTxtObs[0] ;
         }
         else
         {
            Z11323HreTxtObs = A11323HreTxtObs ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z11322HreLinObs = A11322HreLinObs ;
         Z11323HreTxtObs = A11323HreTxtObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1BO1511( )
   {
      edtHreUltObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUltObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUltObs_Enabled), 5, 0), true);
      edtHreUltObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUltObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUltObs_Enabled), 5, 0), true);
   }

   public void standaloneModal1BO1511( )
   {
      if ( isUpd( )  )
      {
         edtHreTxtObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTxtObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHreTxtObs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTxtObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar o modificar.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A11321HreUltObs = (short)(O11321HreUltObs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11322HreLinObs = A11321HreUltObs ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreLinObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHreLinObs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void load1BO1511( )
   {
      /* Using cursor T01BO20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1511 = (short)(1) ;
         A11323HreTxtObs = T01BO20_A11323HreTxtObs[0] ;
         n11323HreTxtObs = T01BO20_n11323HreTxtObs[0] ;
         zm1BO1511( -12) ;
      }
      pr_default.close(18);
      onLoadActions1BO1511( ) ;
   }

   public void onLoadActions1BO1511( )
   {
   }

   public void checkExtendedTable1BO1511( )
   {
      nIsDirty_1511 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1BO1511( ) ;
   }

   public void closeExtendedTableCursors1BO1511( )
   {
   }

   public void enableDisable1BO1511( )
   {
   }

   public void getKey1BO1511( )
   {
      /* Using cursor T01BO21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1511 = (short)(1) ;
      }
      else
      {
         RcdFound1511 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1BO1511( )
   {
      /* Using cursor T01BO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs)});
      if ( (pr_default.getStatus(1) != 101) && ( T01BO3_A4492HreBarCod[0] == A4492HreBarCod ) && ( T01BO3_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T01BO3_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T01BO3_A4495HreNumCie[0] == A4495HreNumCie ) && ( T01BO3_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( GXutil.strcmp(T01BO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BO1511( 12) ;
         RcdFound1511 = (short)(1) ;
         initializeNonKey1BO1511( ) ;
         A11322HreLinObs = T01BO3_A11322HreLinObs[0] ;
         A11323HreTxtObs = T01BO3_A11323HreTxtObs[0] ;
         n11323HreTxtObs = T01BO3_n11323HreTxtObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z11322HreLinObs = A11322HreLinObs ;
         sMode1511 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BO1511( ) ;
         load1BO1511( ) ;
         Gx_mode = sMode1511 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1511 = (short)(0) ;
         initializeNonKey1BO1511( ) ;
         sMode1511 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BO1511( ) ;
         Gx_mode = sMode1511 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BO1511( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BO1511( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11323HreTxtObs, T01BO2_A11323HreTxtObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11323HreTxtObs, T01BO2_A11323HreTxtObs[0]) != 0 )
            {
               GXutil.writeLogln("thisobs:[seudo value changed for attri]"+"HreTxtObs");
               GXutil.writeLogRaw("Old: ",Z11323HreTxtObs);
               GXutil.writeLogRaw("Current: ",T01BO2_A11323HreTxtObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BO1511( )
   {
      beforeValidate1BO1511( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BO1511( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BO1511( 0) ;
         checkOptimisticConcurrency1BO1511( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BO1511( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BO1511( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BO22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs), Boolean.valueOf(n11323HreTxtObs), A11323HreTxtObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISOBS");
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
            load1BO1511( ) ;
         }
         endLevel1BO1511( ) ;
      }
      closeExtendedTableCursors1BO1511( ) ;
   }

   public void update1BO1511( )
   {
      beforeValidate1BO1511( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BO1511( ) ;
      }
      if ( ( nIsMod_1511 != 0 ) || ( nIsDirty_1511 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BO1511( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BO1511( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BO1511( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BO23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n11323HreTxtObs), A11323HreTxtObs, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISOBS");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISOBS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BO1511( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BO1511( ) ;
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
            endLevel1BO1511( ) ;
         }
      }
      closeExtendedTableCursors1BO1511( ) ;
   }

   public void deferredUpdate1BO1511( )
   {
   }

   public void delete1BO1511( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BO1511( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BO1511( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BO1511( ) ;
         afterConfirm1BO1511( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BO1511( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BO24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISOBS");
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
      sMode1511 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BO1511( ) ;
      Gx_mode = sMode1511 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BO1511( )
   {
      standaloneModal1BO1511( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BO1511( )
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

   public void scanStart1BO1511( )
   {
      /* Scan By routine */
      /* Using cursor T01BO25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      RcdFound1511 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1511 = (short)(1) ;
         A11322HreLinObs = T01BO25_A11322HreLinObs[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BO1511( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1511 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1511 = (short)(1) ;
         A11322HreLinObs = T01BO25_A11322HreLinObs[0] ;
      }
   }

   public void scanEnd1BO1511( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1BO1511( )
   {
      /* After Confirm Rules */
      if ( ( isDlt( )  || isUpd( )  ) && true /* After */ && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar o modificar.", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1BO1511( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BO1511( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BO1511( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BO1511( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BO1511( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BO1511( )
   {
      edtHreLinObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHreTxtObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTxtObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashes1BO1511( )
   {
   }

   public void send_integrity_lvl_hashes1BO678( )
   {
   }

   public void subsflControlProps_601511( )
   {
      edtavnRcdDeleted_1511_Internalname = "vNRCDDELETED_1511_"+sGXsfl_60_idx ;
      edtHreLinObs_Internalname = "HRELINOBS_"+sGXsfl_60_idx ;
      edtHreTxtObs_Internalname = "HRETXTOBS_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_601511( )
   {
      edtavnRcdDeleted_1511_Internalname = "vNRCDDELETED_1511_"+sGXsfl_60_fel_idx ;
      edtHreLinObs_Internalname = "HRELINOBS_"+sGXsfl_60_fel_idx ;
      edtHreTxtObs_Internalname = "HRETXTOBS_"+sGXsfl_60_fel_idx ;
   }

   public void addRow1BO1511( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601511( ) ;
      sendRow1BO1511( ) ;
   }

   public void sendRow1BO1511( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1511_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1511_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1511_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1511), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1511), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1511_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1511_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1511_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinObs_Internalname,GXutil.ltrim( localUtil.ntoc( A11322HreLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11322HreLinObs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLinObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreLinObs_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1511_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTxtObs_Internalname,GXutil.rtrim( A11323HreTxtObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreTxtObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreTxtObs_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BO1511( ) ;
      GXCCtl = "Z11322HreLinObs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11322HreLinObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11323HreTxtObs_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11323HreTxtObs));
      GXCCtl = "nRcdDeleted_1511_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1511_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1511_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1511, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1511_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1511_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELINOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRETXTOBS_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTxtObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BO1511( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601511( ) ;
      edtavnRcdDeleted_1511_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1511_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreLinObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreTxtObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETXTOBS_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1511_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1511_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1511");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1511_Internalname ;
         wbErr = true ;
         nRcdDeleted_1511 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1511 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1511_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRELINOBS_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreLinObs_Internalname ;
         wbErr = true ;
         A11322HreLinObs = (short)(0) ;
      }
      else
      {
         A11322HreLinObs = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinObs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11323HreTxtObs = httpContext.cgiGet( edtHreTxtObs_Internalname) ;
      n11323HreTxtObs = false ;
      GXCCtl = "Z11322HreLinObs_" + sGXsfl_60_idx ;
      Z11322HreLinObs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11323HreTxtObs_" + sGXsfl_60_idx ;
      Z11323HreTxtObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1511_" + sGXsfl_60_idx ;
      nRcdDeleted_1511 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1511_" + sGXsfl_60_idx ;
      nRcdExists_1511 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1511_" + sGXsfl_60_idx ;
      nIsMod_1511 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHreTxtObs_Enabled = edtHreTxtObs_Enabled ;
      defedtHreLinObs_Enabled = edtHreLinObs_Enabled ;
   }

   public void confirmValues1BO0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_601511( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601511( ) ;
         httpContext.changePostValue( "Z11322HreLinObs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11322HreLinObs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11322HreLinObs_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z11323HreTxtObs_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z11323HreTxtObs_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11323HreTxtObs_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thisobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4545HreLinMaq,4,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq"}) +"\">") ;
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
      forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
      if ( isUpd( )  )
      {
         forbiddenHiddens2.add("HreTxtObs", GXutil.rtrim( localUtil.format( A11323HreTxtObs, "")));
      }
      app.GxWebStd.gx_hidden_field( httpContext, "hsh2", httpContext.getEncryptedSignature( forbiddenHiddens2.toString(), GXKey));
      GXutil.writeLogInfo("thisobs:[ SendCondSecurityCheck value for]"+forbiddenHiddens2.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11321HreUltObs", GXutil.ltrim( localUtil.ntoc( Z11321HreUltObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11321HreUltObs", GXutil.ltrim( localUtil.ntoc( O11321HreUltObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thisobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4545HreLinMaq,4,0))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq"})  ;
   }

   public String getPgmname( )
   {
      return "THISOBS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO OBSERVACIONES RECETA", "") ;
   }

   public void initializeNonKey1BO678( )
   {
      A11321HreUltObs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      O11321HreUltObs = A11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
      Z11321HreUltObs = (short)(0) ;
   }

   public void initAll1BO678( )
   {
      initializeNonKey1BO678( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BO1511( )
   {
      A11323HreTxtObs = "" ;
      n11323HreTxtObs = false ;
      Z11323HreTxtObs = "" ;
   }

   public void initAll1BO1511( )
   {
      A11322HreLinObs = (short)(0) ;
      initializeNonKey1BO1511( ) ;
   }

   public void standaloneModalInsert1BO1511( )
   {
      A11321HreUltObs = i11321HreUltObs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11321HreUltObs), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564743", true, true);
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
      httpContext.AddJavascriptSource("thisobs.js", "?20268241564744", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1511( )
   {
      edtHreTxtObs_Enabled = defedtHreTxtObs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTxtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTxtObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHreLinObs_Enabled = defedtHreLinObs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinObs_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1511, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1511_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11322HreLinObs, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11323HreTxtObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTxtObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHreBarCod_Internalname = "HREBARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHreLinMaq_Internalname = "HRELINMAQ" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtHreUltObs_Internalname = "HREULTOBS" ;
      edtavnRcdDeleted_1511_Internalname = "vNRCDDELETED_1511" ;
      edtHreLinObs_Internalname = "HRELINOBS" ;
      edtHreTxtObs_Internalname = "HRETXTOBS" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO OBSERVACIONES RECETA", "") );
      edtHreTxtObs_Jsonclick = "" ;
      edtHreLinObs_Jsonclick = "" ;
      edtavnRcdDeleted_1511_Jsonclick = "" ;
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
      edtHreTxtObs_Enabled = 1 ;
      edtHreLinObs_Enabled = 1 ;
      edtavnRcdDeleted_1511_Enabled = 1 ;
      edtHreUltObs_Jsonclick = "" ;
      edtHreUltObs_Backcolor = (int)(0xFFFFFF) ;
      edtHreUltObs_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreLinMaq_Backcolor = (int)(0xFFFFFF) ;
      edtHreLinMaq_Enabled = 0 ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreNumCie_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumCie_Enabled = 0 ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarPar_Enabled = 0 ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarReo_Enabled = 0 ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarCod_Enabled = 0 ;
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
      subsflControlProps_601511( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BO1511( ) ;
         standaloneModal1BO1511( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BO1511( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_601511( ) ;
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
      /* Using cursor T01BO26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BO26_A407EmprNom[0] ;
      n407EmprNom = T01BO26_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T01BO27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
      }
      pr_default.close(25);
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

   public void valid_Hrelinmaq( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11321HreUltObs", GXutil.ltrim( localUtil.ntoc( A11321HreUltObs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11321HreUltObs", GXutil.ltrim( localUtil.ntoc( Z11321HreUltObs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O11321HreUltObs", GXutil.ltrim( localUtil.ntoc( O11321HreUltObs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HRELINMAQ","{handler:'valid_Hrelinmaq',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11321HreUltObs',fld:'HREULTOBS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HRELINMAQ",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11321HreUltObs',fld:'HREULTOBS',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4545HreLinMaq'},{av:'Z407EmprNom'},{av:'Z11321HreUltObs'},{av:'O11321HreUltObs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HREULTOBS","{handler:'valid_Hreultobs',iparms:[]");
      setEventMetadata("VALID_HREULTOBS",",oparms:[]}");
      setEventMetadata("VALID_HRELINOBS","{handler:'valid_Hrelinobs',iparms:[]");
      setEventMetadata("VALID_HRELINOBS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hretxtobs',iparms:[]");
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
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA4494HreBarPar = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z11323HreTxtObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1511 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      forbiddenHiddens2 = new com.genexus.util.GXProperties();
      A11323HreTxtObs = "" ;
      hsh2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode678 = "" ;
      GXCCtl = "" ;
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
      T01BO6_A407EmprNom = new String[] {""} ;
      T01BO6_n407EmprNom = new boolean[] {false} ;
      T01BO7_A396EmprCod = new String[] {""} ;
      T01BO8_A4545HreLinMaq = new short[1] ;
      T01BO8_A407EmprNom = new String[] {""} ;
      T01BO8_n407EmprNom = new boolean[] {false} ;
      T01BO8_A11321HreUltObs = new short[1] ;
      T01BO8_A396EmprCod = new String[] {""} ;
      T01BO8_A4492HreBarCod = new int[1] ;
      T01BO8_A4493HreBarReo = new byte[1] ;
      T01BO8_A4494HreBarPar = new String[] {""} ;
      T01BO8_A4495HreNumCie = new byte[1] ;
      T01BO9_A396EmprCod = new String[] {""} ;
      T01BO9_A4492HreBarCod = new int[1] ;
      T01BO9_A4493HreBarReo = new byte[1] ;
      T01BO9_A4494HreBarPar = new String[] {""} ;
      T01BO9_A4495HreNumCie = new byte[1] ;
      T01BO9_A4545HreLinMaq = new short[1] ;
      T01BO5_A4545HreLinMaq = new short[1] ;
      T01BO5_A11321HreUltObs = new short[1] ;
      T01BO5_A396EmprCod = new String[] {""} ;
      T01BO5_A4492HreBarCod = new int[1] ;
      T01BO5_A4493HreBarReo = new byte[1] ;
      T01BO5_A4494HreBarPar = new String[] {""} ;
      T01BO5_A4495HreNumCie = new byte[1] ;
      T01BO10_A396EmprCod = new String[] {""} ;
      T01BO10_A4492HreBarCod = new int[1] ;
      T01BO10_A4493HreBarReo = new byte[1] ;
      T01BO10_A4494HreBarPar = new String[] {""} ;
      T01BO10_A4495HreNumCie = new byte[1] ;
      T01BO10_A4545HreLinMaq = new short[1] ;
      T01BO11_A396EmprCod = new String[] {""} ;
      T01BO11_A4492HreBarCod = new int[1] ;
      T01BO11_A4493HreBarReo = new byte[1] ;
      T01BO11_A4494HreBarPar = new String[] {""} ;
      T01BO11_A4495HreNumCie = new byte[1] ;
      T01BO11_A4545HreLinMaq = new short[1] ;
      T01BO4_A4545HreLinMaq = new short[1] ;
      T01BO4_A11321HreUltObs = new short[1] ;
      T01BO4_A396EmprCod = new String[] {""} ;
      T01BO4_A4492HreBarCod = new int[1] ;
      T01BO4_A4493HreBarReo = new byte[1] ;
      T01BO4_A4494HreBarPar = new String[] {""} ;
      T01BO4_A4495HreNumCie = new byte[1] ;
      T01BO15_A396EmprCod = new String[] {""} ;
      T01BO15_A4492HreBarCod = new int[1] ;
      T01BO15_A4493HreBarReo = new byte[1] ;
      T01BO15_A4494HreBarPar = new String[] {""} ;
      T01BO15_A4495HreNumCie = new byte[1] ;
      T01BO15_A4545HreLinMaq = new short[1] ;
      T01BO15_A14278HreNormId = new String[] {""} ;
      T01BO16_A396EmprCod = new String[] {""} ;
      T01BO16_A4492HreBarCod = new int[1] ;
      T01BO16_A4493HreBarReo = new byte[1] ;
      T01BO16_A4494HreBarPar = new String[] {""} ;
      T01BO16_A4495HreNumCie = new byte[1] ;
      T01BO16_A4545HreLinMaq = new short[1] ;
      T01BO16_A14282HreTraID = new String[] {""} ;
      T01BO17_A396EmprCod = new String[] {""} ;
      T01BO17_A4492HreBarCod = new int[1] ;
      T01BO17_A4493HreBarReo = new byte[1] ;
      T01BO17_A4494HreBarPar = new String[] {""} ;
      T01BO17_A4495HreNumCie = new byte[1] ;
      T01BO17_A4545HreLinMaq = new short[1] ;
      T01BO17_A4550HreLinPro = new byte[1] ;
      T01BO19_A396EmprCod = new String[] {""} ;
      T01BO19_A4492HreBarCod = new int[1] ;
      T01BO19_A4493HreBarReo = new byte[1] ;
      T01BO19_A4494HreBarPar = new String[] {""} ;
      T01BO19_A4495HreNumCie = new byte[1] ;
      T01BO19_A4545HreLinMaq = new short[1] ;
      T01BO20_A4492HreBarCod = new int[1] ;
      T01BO20_A4493HreBarReo = new byte[1] ;
      T01BO20_A4494HreBarPar = new String[] {""} ;
      T01BO20_A4495HreNumCie = new byte[1] ;
      T01BO20_A4545HreLinMaq = new short[1] ;
      T01BO20_A11322HreLinObs = new short[1] ;
      T01BO20_A11323HreTxtObs = new String[] {""} ;
      T01BO20_n11323HreTxtObs = new boolean[] {false} ;
      T01BO20_A396EmprCod = new String[] {""} ;
      T01BO21_A396EmprCod = new String[] {""} ;
      T01BO21_A4492HreBarCod = new int[1] ;
      T01BO21_A4493HreBarReo = new byte[1] ;
      T01BO21_A4494HreBarPar = new String[] {""} ;
      T01BO21_A4495HreNumCie = new byte[1] ;
      T01BO21_A4545HreLinMaq = new short[1] ;
      T01BO21_A11322HreLinObs = new short[1] ;
      T01BO3_A4492HreBarCod = new int[1] ;
      T01BO3_A4493HreBarReo = new byte[1] ;
      T01BO3_A4494HreBarPar = new String[] {""} ;
      T01BO3_A4495HreNumCie = new byte[1] ;
      T01BO3_A4545HreLinMaq = new short[1] ;
      T01BO3_A11322HreLinObs = new short[1] ;
      T01BO3_A11323HreTxtObs = new String[] {""} ;
      T01BO3_n11323HreTxtObs = new boolean[] {false} ;
      T01BO3_A396EmprCod = new String[] {""} ;
      T01BO2_A4492HreBarCod = new int[1] ;
      T01BO2_A4493HreBarReo = new byte[1] ;
      T01BO2_A4494HreBarPar = new String[] {""} ;
      T01BO2_A4495HreNumCie = new byte[1] ;
      T01BO2_A4545HreLinMaq = new short[1] ;
      T01BO2_A11322HreLinObs = new short[1] ;
      T01BO2_A11323HreTxtObs = new String[] {""} ;
      T01BO2_n11323HreTxtObs = new boolean[] {false} ;
      T01BO2_A396EmprCod = new String[] {""} ;
      T01BO25_A396EmprCod = new String[] {""} ;
      T01BO25_A4492HreBarCod = new int[1] ;
      T01BO25_A4493HreBarReo = new byte[1] ;
      T01BO25_A4494HreBarPar = new String[] {""} ;
      T01BO25_A4495HreNumCie = new byte[1] ;
      T01BO25_A4545HreLinMaq = new short[1] ;
      T01BO25_A11322HreLinObs = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01BO26_A407EmprNom = new String[] {""} ;
      T01BO26_n407EmprNom = new boolean[] {false} ;
      T01BO27_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thisobs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thisobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thisobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thisobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thisobs__default(),
         new Object[] {
             new Object[] {
            T01BO2_A4492HreBarCod, T01BO2_A4493HreBarReo, T01BO2_A4494HreBarPar, T01BO2_A4495HreNumCie, T01BO2_A4545HreLinMaq, T01BO2_A11322HreLinObs, T01BO2_A11323HreTxtObs, T01BO2_n11323HreTxtObs, T01BO2_A396EmprCod
            }
            , new Object[] {
            T01BO3_A4492HreBarCod, T01BO3_A4493HreBarReo, T01BO3_A4494HreBarPar, T01BO3_A4495HreNumCie, T01BO3_A4545HreLinMaq, T01BO3_A11322HreLinObs, T01BO3_A11323HreTxtObs, T01BO3_n11323HreTxtObs, T01BO3_A396EmprCod
            }
            , new Object[] {
            T01BO4_A4545HreLinMaq, T01BO4_A11321HreUltObs, T01BO4_A396EmprCod, T01BO4_A4492HreBarCod, T01BO4_A4493HreBarReo, T01BO4_A4494HreBarPar, T01BO4_A4495HreNumCie
            }
            , new Object[] {
            T01BO5_A4545HreLinMaq, T01BO5_A11321HreUltObs, T01BO5_A396EmprCod, T01BO5_A4492HreBarCod, T01BO5_A4493HreBarReo, T01BO5_A4494HreBarPar, T01BO5_A4495HreNumCie
            }
            , new Object[] {
            T01BO6_A407EmprNom, T01BO6_n407EmprNom
            }
            , new Object[] {
            T01BO7_A396EmprCod
            }
            , new Object[] {
            T01BO8_A4545HreLinMaq, T01BO8_A407EmprNom, T01BO8_n407EmprNom, T01BO8_A11321HreUltObs, T01BO8_A396EmprCod, T01BO8_A4492HreBarCod, T01BO8_A4493HreBarReo, T01BO8_A4494HreBarPar, T01BO8_A4495HreNumCie
            }
            , new Object[] {
            T01BO9_A396EmprCod, T01BO9_A4492HreBarCod, T01BO9_A4493HreBarReo, T01BO9_A4494HreBarPar, T01BO9_A4495HreNumCie, T01BO9_A4545HreLinMaq
            }
            , new Object[] {
            T01BO10_A396EmprCod, T01BO10_A4492HreBarCod, T01BO10_A4493HreBarReo, T01BO10_A4494HreBarPar, T01BO10_A4495HreNumCie, T01BO10_A4545HreLinMaq
            }
            , new Object[] {
            T01BO11_A396EmprCod, T01BO11_A4492HreBarCod, T01BO11_A4493HreBarReo, T01BO11_A4494HreBarPar, T01BO11_A4495HreNumCie, T01BO11_A4545HreLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BO15_A396EmprCod, T01BO15_A4492HreBarCod, T01BO15_A4493HreBarReo, T01BO15_A4494HreBarPar, T01BO15_A4495HreNumCie, T01BO15_A4545HreLinMaq, T01BO15_A14278HreNormId
            }
            , new Object[] {
            T01BO16_A396EmprCod, T01BO16_A4492HreBarCod, T01BO16_A4493HreBarReo, T01BO16_A4494HreBarPar, T01BO16_A4495HreNumCie, T01BO16_A4545HreLinMaq, T01BO16_A14282HreTraID
            }
            , new Object[] {
            T01BO17_A396EmprCod, T01BO17_A4492HreBarCod, T01BO17_A4493HreBarReo, T01BO17_A4494HreBarPar, T01BO17_A4495HreNumCie, T01BO17_A4545HreLinMaq, T01BO17_A4550HreLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            T01BO19_A396EmprCod, T01BO19_A4492HreBarCod, T01BO19_A4493HreBarReo, T01BO19_A4494HreBarPar, T01BO19_A4495HreNumCie, T01BO19_A4545HreLinMaq
            }
            , new Object[] {
            T01BO20_A4492HreBarCod, T01BO20_A4493HreBarReo, T01BO20_A4494HreBarPar, T01BO20_A4495HreNumCie, T01BO20_A4545HreLinMaq, T01BO20_A11322HreLinObs, T01BO20_A11323HreTxtObs, T01BO20_n11323HreTxtObs, T01BO20_A396EmprCod
            }
            , new Object[] {
            T01BO21_A396EmprCod, T01BO21_A4492HreBarCod, T01BO21_A4493HreBarReo, T01BO21_A4494HreBarPar, T01BO21_A4495HreNumCie, T01BO21_A4545HreLinMaq, T01BO21_A11322HreLinObs
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BO25_A396EmprCod, T01BO25_A4492HreBarCod, T01BO25_A4493HreBarReo, T01BO25_A4494HreBarPar, T01BO25_A4495HreNumCie, T01BO25_A4545HreLinMaq, T01BO25_A11322HreLinObs
            }
            , new Object[] {
            T01BO26_A407EmprNom, T01BO26_n407EmprNom
            }
            , new Object[] {
            T01BO27_A396EmprCod
            }
         }
      );
      Z4545HreLinMaq = (short)(0) ;
      A4545HreLinMaq = (short)(0) ;
      Z4495HreNumCie = (byte)(0) ;
      A4495HreNumCie = (byte)(0) ;
      Z4494HreBarPar = "" ;
      A4494HreBarPar = "" ;
      Z4493HreBarReo = (byte)(0) ;
      A4493HreBarReo = (byte)(0) ;
      Z4492HreBarCod = 0 ;
      A4492HreBarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "THISOBS" ;
   }

   private byte wcpOA4493HreBarReo ;
   private byte wcpOA4495HreNumCie ;
   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private short wcpOA4545HreLinMaq ;
   private short Z4545HreLinMaq ;
   private short Z11321HreUltObs ;
   private short O11321HreUltObs ;
   private short Z11322HreLinObs ;
   private short nRcdDeleted_1511 ;
   private short nRcdExists_1511 ;
   private short nIsMod_1511 ;
   private short A4545HreLinMaq ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11321HreUltObs ;
   private short nBlankRcdCount1511 ;
   private short RcdFound1511 ;
   private short B11321HreUltObs ;
   private short nBlankRcdUsr1511 ;
   private short s11321HreUltObs ;
   private short A11322HreLinObs ;
   private short RcdFound678 ;
   private short nIsDirty_678 ;
   private short nIsDirty_1511 ;
   private short i11321HreUltObs ;
   private short ZZ4545HreLinMaq ;
   private short ZZ11321HreUltObs ;
   private short ZO11321HreUltObs ;
   private int wcpOA4492HreBarCod ;
   private int Z4492HreBarCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int A4492HreBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtHreBarCod_Enabled ;
   private int edtHreBarReo_Enabled ;
   private int edtHreBarPar_Enabled ;
   private int edtHreNumCie_Enabled ;
   private int edtHreLinMaq_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtHreUltObs_Enabled ;
   private int edtavnRcdDeleted_1511_Enabled ;
   private int edtHreLinObs_Enabled ;
   private int edtHreTxtObs_Enabled ;
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
   private int defedtHreTxtObs_Enabled ;
   private int defedtHreLinObs_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtHreUltObs_Backcolor ;
   private int edtHreLinMaq_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4492HreBarCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA4494HreBarPar ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z11323HreTxtObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtHreBarCod_Internalname ;
   private String edtHreBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHreBarReo_Internalname ;
   private String edtHreBarReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHreBarPar_Internalname ;
   private String edtHreBarPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreLinMaq_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtHreUltObs_Internalname ;
   private String edtHreUltObs_Jsonclick ;
   private String sMode1511 ;
   private String edtavnRcdDeleted_1511_Internalname ;
   private String edtHreLinObs_Internalname ;
   private String edtHreTxtObs_Internalname ;
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
   private String AV33Pgmname ;
   private String A11323HreTxtObs ;
   private String hsh2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode678 ;
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
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1511_Jsonclick ;
   private String edtHreLinObs_Jsonclick ;
   private String edtHreTxtObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n11323HreTxtObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens2 ;
   private IDataStoreProvider pr_default ;
   private String[] T01BO6_A407EmprNom ;
   private boolean[] T01BO6_n407EmprNom ;
   private String[] T01BO7_A396EmprCod ;
   private short[] T01BO8_A4545HreLinMaq ;
   private String[] T01BO8_A407EmprNom ;
   private boolean[] T01BO8_n407EmprNom ;
   private short[] T01BO8_A11321HreUltObs ;
   private String[] T01BO8_A396EmprCod ;
   private int[] T01BO8_A4492HreBarCod ;
   private byte[] T01BO8_A4493HreBarReo ;
   private String[] T01BO8_A4494HreBarPar ;
   private byte[] T01BO8_A4495HreNumCie ;
   private String[] T01BO9_A396EmprCod ;
   private int[] T01BO9_A4492HreBarCod ;
   private byte[] T01BO9_A4493HreBarReo ;
   private String[] T01BO9_A4494HreBarPar ;
   private byte[] T01BO9_A4495HreNumCie ;
   private short[] T01BO9_A4545HreLinMaq ;
   private short[] T01BO5_A4545HreLinMaq ;
   private short[] T01BO5_A11321HreUltObs ;
   private String[] T01BO5_A396EmprCod ;
   private int[] T01BO5_A4492HreBarCod ;
   private byte[] T01BO5_A4493HreBarReo ;
   private String[] T01BO5_A4494HreBarPar ;
   private byte[] T01BO5_A4495HreNumCie ;
   private String[] T01BO10_A396EmprCod ;
   private int[] T01BO10_A4492HreBarCod ;
   private byte[] T01BO10_A4493HreBarReo ;
   private String[] T01BO10_A4494HreBarPar ;
   private byte[] T01BO10_A4495HreNumCie ;
   private short[] T01BO10_A4545HreLinMaq ;
   private String[] T01BO11_A396EmprCod ;
   private int[] T01BO11_A4492HreBarCod ;
   private byte[] T01BO11_A4493HreBarReo ;
   private String[] T01BO11_A4494HreBarPar ;
   private byte[] T01BO11_A4495HreNumCie ;
   private short[] T01BO11_A4545HreLinMaq ;
   private short[] T01BO4_A4545HreLinMaq ;
   private short[] T01BO4_A11321HreUltObs ;
   private String[] T01BO4_A396EmprCod ;
   private int[] T01BO4_A4492HreBarCod ;
   private byte[] T01BO4_A4493HreBarReo ;
   private String[] T01BO4_A4494HreBarPar ;
   private byte[] T01BO4_A4495HreNumCie ;
   private String[] T01BO15_A396EmprCod ;
   private int[] T01BO15_A4492HreBarCod ;
   private byte[] T01BO15_A4493HreBarReo ;
   private String[] T01BO15_A4494HreBarPar ;
   private byte[] T01BO15_A4495HreNumCie ;
   private short[] T01BO15_A4545HreLinMaq ;
   private String[] T01BO15_A14278HreNormId ;
   private String[] T01BO16_A396EmprCod ;
   private int[] T01BO16_A4492HreBarCod ;
   private byte[] T01BO16_A4493HreBarReo ;
   private String[] T01BO16_A4494HreBarPar ;
   private byte[] T01BO16_A4495HreNumCie ;
   private short[] T01BO16_A4545HreLinMaq ;
   private String[] T01BO16_A14282HreTraID ;
   private String[] T01BO17_A396EmprCod ;
   private int[] T01BO17_A4492HreBarCod ;
   private byte[] T01BO17_A4493HreBarReo ;
   private String[] T01BO17_A4494HreBarPar ;
   private byte[] T01BO17_A4495HreNumCie ;
   private short[] T01BO17_A4545HreLinMaq ;
   private byte[] T01BO17_A4550HreLinPro ;
   private String[] T01BO19_A396EmprCod ;
   private int[] T01BO19_A4492HreBarCod ;
   private byte[] T01BO19_A4493HreBarReo ;
   private String[] T01BO19_A4494HreBarPar ;
   private byte[] T01BO19_A4495HreNumCie ;
   private short[] T01BO19_A4545HreLinMaq ;
   private int[] T01BO20_A4492HreBarCod ;
   private byte[] T01BO20_A4493HreBarReo ;
   private String[] T01BO20_A4494HreBarPar ;
   private byte[] T01BO20_A4495HreNumCie ;
   private short[] T01BO20_A4545HreLinMaq ;
   private short[] T01BO20_A11322HreLinObs ;
   private String[] T01BO20_A11323HreTxtObs ;
   private boolean[] T01BO20_n11323HreTxtObs ;
   private String[] T01BO20_A396EmprCod ;
   private String[] T01BO21_A396EmprCod ;
   private int[] T01BO21_A4492HreBarCod ;
   private byte[] T01BO21_A4493HreBarReo ;
   private String[] T01BO21_A4494HreBarPar ;
   private byte[] T01BO21_A4495HreNumCie ;
   private short[] T01BO21_A4545HreLinMaq ;
   private short[] T01BO21_A11322HreLinObs ;
   private int[] T01BO3_A4492HreBarCod ;
   private byte[] T01BO3_A4493HreBarReo ;
   private String[] T01BO3_A4494HreBarPar ;
   private byte[] T01BO3_A4495HreNumCie ;
   private short[] T01BO3_A4545HreLinMaq ;
   private short[] T01BO3_A11322HreLinObs ;
   private String[] T01BO3_A11323HreTxtObs ;
   private boolean[] T01BO3_n11323HreTxtObs ;
   private String[] T01BO3_A396EmprCod ;
   private int[] T01BO2_A4492HreBarCod ;
   private byte[] T01BO2_A4493HreBarReo ;
   private String[] T01BO2_A4494HreBarPar ;
   private byte[] T01BO2_A4495HreNumCie ;
   private short[] T01BO2_A4545HreLinMaq ;
   private short[] T01BO2_A11322HreLinObs ;
   private String[] T01BO2_A11323HreTxtObs ;
   private boolean[] T01BO2_n11323HreTxtObs ;
   private String[] T01BO2_A396EmprCod ;
   private String[] T01BO25_A396EmprCod ;
   private int[] T01BO25_A4492HreBarCod ;
   private byte[] T01BO25_A4493HreBarReo ;
   private String[] T01BO25_A4494HreBarPar ;
   private byte[] T01BO25_A4495HreNumCie ;
   private short[] T01BO25_A4545HreLinMaq ;
   private short[] T01BO25_A11322HreLinObs ;
   private String[] T01BO26_A407EmprNom ;
   private boolean[] T01BO26_n407EmprNom ;
   private String[] T01BO27_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thisobs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BO2", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs, HreTxtObs, EmprCod FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinObs = ?  FOR UPDATE OF HreTxtObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BO3", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs, HreTxtObs, EmprCod FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinObs = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BO4", "SELECT HreLinMaq, HreUltObs, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?  FOR UPDATE OF HreUltObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO5", "SELECT HreLinMaq, HreUltObs, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO7", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO8", "SELECT /*+ FIRST_ROWS(1) */ TM1.HreLinMaq, T2.EmprNom, TM1.HreUltObs, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM (TXPHISREM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreLinMaq = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreLinMaq ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreLinMaq DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BO12", "INSERT INTO TXPHISREM(HreLinMaq, HreUltObs, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqCod, HreVolPrd, HreFacAbs, HreULinPro, HreFecPes, HreMaqPes, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreNumInt, HreDti, HreDtf, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T01BO13", "UPDATE TXPHISREM SET HreUltObs=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T01BO14", "DELETE FROM TXPHISREM  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new ForEachCursor("T01BO15", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO16", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreTraID FROM TXPHISRE3 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO17", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BO18", "UPDATE TXPHISREM SET HreUltObs=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new ForEachCursor("T01BO19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BO20", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs, HreTxtObs, EmprCod FROM TXPHISOBS WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinObs = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BO21", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinObs = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BO22", "INSERT INTO TXPHISOBS(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs, HreTxtObs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISOBS")
         ,new UpdateCursor("T01BO23", "UPDATE TXPHISOBS SET HreTxtObs=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinObs = ?", GX_NOMASK, "TXPHISOBS")
         ,new UpdateCursor("T01BO24", "DELETE FROM TXPHISOBS  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinObs = ?", GX_NOMASK, "TXPHISOBS")
         ,new ForEachCursor("T01BO25", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs FROM TXPHISOBS WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BO26", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BO27", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 60);
               }
               stmt.setString(8, (String)parms[8], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

