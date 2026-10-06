package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcestob_impl extends GXDataArea
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
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = httpContext.GetPar( "EstNomCol") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CESTOBS", ""), (short)(0)) ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A4072EstObsUlt2 = (byte)(GXutil.lval( httpContext.GetPar( "EstObsUlt2"))) ;
      n4072EstObsUlt2 = false ;
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

   public tcestob_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcestob_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcestob_impl.class ));
   }

   public tcestob_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCESTOB.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Articulo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNomCol_Internalname, GXutil.rtrim( A4061EstNomCol), GXutil.rtrim( localUtil.format( A4061EstNomCol, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNomCol_Jsonclick, 0, "", "", "", "", "", 1, edtEstNomCol_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima linea observaciones", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstObsUlt2_Internalname, GXutil.ltrim( localUtil.ntoc( A4072EstObsUlt2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstObsUlt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4072EstObsUlt2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4072EstObsUlt2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstObsUlt2_Jsonclick, 0, "", "", "", "", "", 1, edtEstObsUlt2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCESTOB.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCESTOB.htm");
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
         nBlankRcdCount1592 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1592 = (short)(1) ;
            scanStart1FZ1592( ) ;
            while ( RcdFound1592 != 0 )
            {
               init_level_properties1592( ) ;
               getByPrimaryKey1FZ1592( ) ;
               addRow1FZ1592( ) ;
               scanNext1FZ1592( ) ;
            }
            scanEnd1FZ1592( ) ;
            nBlankRcdCount1592 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4072EstObsUlt2 = A4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         standaloneNotModal1FZ1592( ) ;
         standaloneModal1FZ1592( ) ;
         sMode1592 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1FZ1592( ) ;
            edtavnRcdDeleted_1592_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1592_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1592_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1592_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtEstObsLin2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBSLIN2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtEstobs2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBS2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1592 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FZ1592( ) ;
            }
            sendRow1FZ1592( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4072EstObsUlt2 = B4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1592 = (short)(5) ;
         nRcdExists_1592 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FZ1592( ) ;
            while ( RcdFound1592 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551592( ) ;
               init_level_properties1592( ) ;
               standaloneNotModal1FZ1592( ) ;
               getByPrimaryKey1FZ1592( ) ;
               standaloneModal1FZ1592( ) ;
               addRow1FZ1592( ) ;
               scanNext1FZ1592( ) ;
            }
            scanEnd1FZ1592( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1592 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551592( ) ;
      initAll1FZ1592( ) ;
      init_level_properties1592( ) ;
      B4072EstObsUlt2 = A4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      nRcdExists_1592 = (short)(0) ;
      nIsMod_1592 = (short)(0) ;
      nRcdDeleted_1592 = (short)(0) ;
      nBlankRcdCount1592 = (short)(nBlankRcdUsr1592+nBlankRcdCount1592) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1592 > 0 )
      {
         standaloneNotModal1FZ1592( ) ;
         standaloneModal1FZ1592( ) ;
         addRow1FZ1592( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstobs2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1592 = (short)(nBlankRcdCount1592-1) ;
      }
      Gx_mode = sMode1592 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4072EstObsUlt2 = B4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCESTOB.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCESTOB.htm");
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
      e111FZ2 ();
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
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z4061EstNomCol = httpContext.cgiGet( "Z4061EstNomCol") ;
            Z4072EstObsUlt2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4072EstObsUlt2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O4072EstObsUlt2 = (byte)(localUtil.ctol( httpContext.cgiGet( "O4072EstObsUlt2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A4061EstNomCol = httpContext.cgiGet( edtEstNomCol_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
            A4072EstObsUlt2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsUlt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4072EstObsUlt2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A4061EstNomCol = httpContext.GetPar( "EstNomCol") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4061EstNomCol", A4061EstNomCol);
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
                        e111FZ2 ();
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
            initAll1FZ1570( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1592_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1592_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1FZ1570( ) ;
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

   public void confirm_1FZ0( )
   {
      beforeValidate1FZ1570( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FZ1570( ) ;
         }
         else
         {
            checkExtendedTable1FZ1570( ) ;
            if ( AnyError == 0 )
            {
               zm1FZ1570( 7) ;
               zm1FZ1570( 8) ;
               zm1FZ1570( 9) ;
            }
            closeExtendedTableCursors1FZ1570( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1570 = Gx_mode ;
         confirm_1FZ1592( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1570 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FZ0( ) ;
      }
   }

   public void confirm_1FZ1592( )
   {
      s4072EstObsUlt2 = O4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1FZ1592( ) ;
         if ( ( nRcdExists_1592 != 0 ) || ( nIsMod_1592 != 0 ) )
         {
            getKey1FZ1592( ) ;
            if ( ( nRcdExists_1592 == 0 ) && ( nRcdDeleted_1592 == 0 ) )
            {
               if ( RcdFound1592 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FZ1592( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FZ1592( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FZ1592( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4072EstObsUlt2 = A4072EstObsUlt2 ;
                     n4072EstObsUlt2 = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1592 != 0 )
               {
                  if ( nRcdDeleted_1592 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FZ1592( ) ;
                     load1FZ1592( ) ;
                     beforeValidate1FZ1592( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FZ1592( ) ;
                        O4072EstObsUlt2 = A4072EstObsUlt2 ;
                        n4072EstObsUlt2 = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1592 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FZ1592( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FZ1592( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FZ1592( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4072EstObsUlt2 = A4072EstObsUlt2 ;
                           n4072EstObsUlt2 = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1592 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1592_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstObsLin2_Internalname, GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstobs2_Internalname, GXutil.rtrim( A4074Estobs2)) ;
         httpContext.changePostValue( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4074Estobs2_"+sGXsfl_55_idx, GXutil.rtrim( Z4074Estobs2)) ;
         httpContext.changePostValue( "nRcdDeleted_1592_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1592_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1592_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1592 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1592_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBSLIN2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBS2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4072EstObsUlt2 = s4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FZ0( )
   {
   }

   public void e111FZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tcestob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      tcestob_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "OBSERVACIONES FORMULA", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      AV29station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29station", AV29station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV30emprnom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29station, GXv_char2, GXv_char3, GXv_char4) ;
      tcestob_impl.this.A396EmprCod = GXv_char2[0] ;
      tcestob_impl.this.AV30emprnom = GXv_char3[0] ;
      tcestob_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30emprnom", AV30emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_int5[0] = AV32contador ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "estnum", ""), GXv_int5) ;
      tcestob_impl.this.AV32contador = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32contador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32contador), 8, 0));
   }

   public void zm1FZ1570( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4072EstObsUlt2 = T01FZ5_A4072EstObsUlt2[0] ;
         }
         else
         {
            Z4072EstObsUlt2 = A4072EstObsUlt2 ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z4061EstNomCol = A4061EstNomCol ;
         Z4072EstObsUlt2 = A4072EstObsUlt2 ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEstObsUlt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt2_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEstObsUlt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt2_Enabled), 5, 0), true);
      /* Using cursor T01FZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FZ6_A407EmprNom[0] ;
      n407EmprNom = T01FZ6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01FZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FZ7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
      /* Using cursor T01FZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
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

   public void load1FZ1570( )
   {
      /* Using cursor T01FZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1570 = (short)(1) ;
         A4072EstObsUlt2 = T01FZ9_A4072EstObsUlt2[0] ;
         n4072EstObsUlt2 = T01FZ9_n4072EstObsUlt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         A407EmprNom = T01FZ9_A407EmprNom[0] ;
         n407EmprNom = T01FZ9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01FZ9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm1FZ1570( -6) ;
      }
      pr_default.close(7);
      onLoadActions1FZ1570( ) ;
   }

   public void onLoadActions1FZ1570( )
   {
   }

   public void checkExtendedTable1FZ1570( )
   {
      nIsDirty_1570 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FZ1570( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FZ1570( )
   {
      /* Using cursor T01FZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1570 = (short)(1) ;
      }
      else
      {
         RcdFound1570 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FZ5_A4061EstNomCol[0], A4061EstNomCol) == 0 ) && ( GXutil.strcmp(T01FZ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FZ5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FZ5_A65ArtCod[0], A65ArtCod) == 0 ) )
      {
         zm1FZ1570( 6) ;
         RcdFound1570 = (short)(1) ;
         A4072EstObsUlt2 = T01FZ5_A4072EstObsUlt2[0] ;
         n4072EstObsUlt2 = T01FZ5_n4072EstObsUlt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         O4072EstObsUlt2 = A4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FZ1570( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1570 = (short)(0) ;
            initializeNonKey1FZ1570( ) ;
         }
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1570 = (short)(0) ;
         initializeNonKey1FZ1570( ) ;
         sMode1570 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1570 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FZ1570( ) ;
      if ( RcdFound1570 == 0 )
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
      RcdFound1570 = (short)(0) ;
      /* Using cursor T01FZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01FZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FZ11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FZ11_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FZ11_A4061EstNomCol[0], A4061EstNomCol) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01FZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FZ11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FZ11_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FZ11_A4061EstNomCol[0], A4061EstNomCol) == 0 ) )
         {
            RcdFound1570 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1570 = (short)(0) ;
      /* Using cursor T01FZ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01FZ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FZ12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FZ12_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FZ12_A4061EstNomCol[0], A4061EstNomCol) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01FZ12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FZ12_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FZ12_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FZ12_A4061EstNomCol[0], A4061EstNomCol) == 0 ) )
         {
            RcdFound1570 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FZ1570( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4072EstObsUlt2 = O4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         insert1FZ1570( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1570 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4072EstObsUlt2 = O4072EstObsUlt2 ;
               n4072EstObsUlt2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4072EstObsUlt2 = O4072EstObsUlt2 ;
               n4072EstObsUlt2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
               update1FZ1570( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4072EstObsUlt2 = O4072EstObsUlt2 ;
               n4072EstObsUlt2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
               insert1FZ1570( ) ;
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
                  A4072EstObsUlt2 = O4072EstObsUlt2 ;
                  n4072EstObsUlt2 = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
                  insert1FZ1570( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4072EstObsUlt2 = O4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
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
      getKey1FZ1570( ) ;
      if ( RcdFound1570 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A4061EstNomCol, Z4061EstNomCol) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcestob");
   }

   public void insert_check( )
   {
      confirm_1FZ0( ) ;
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
      if ( RcdFound1570 == 0 )
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
      scanStart1FZ1570( ) ;
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FZ1570( ) ;
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
      if ( RcdFound1570 == 0 )
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
      if ( RcdFound1570 == 0 )
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
      scanStart1FZ1570( ) ;
      if ( RcdFound1570 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1570 != 0 )
         {
            scanNext1FZ1570( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FZ1570( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FZ1570( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4072EstObsUlt2 != T01FZ4_A4072EstObsUlt2[0] ) )
         {
            if ( Z4072EstObsUlt2 != T01FZ4_A4072EstObsUlt2[0] )
            {
               GXutil.writeLogln("tcestob:[seudo value changed for attri]"+"EstObsUlt2");
               GXutil.writeLogRaw("Old: ",Z4072EstObsUlt2);
               GXutil.writeLogRaw("Current: ",T01FZ4_A4072EstObsUlt2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESTAM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FZ1570( )
   {
      beforeValidate1FZ1570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FZ1570( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FZ1570( 0) ;
         checkOptimisticConcurrency1FZ1570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FZ1570( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FZ1570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FZ13 */
                  pr_default.execute(11, new Object[] {A4061EstNomCol, Boolean.valueOf(n4072EstObsUlt2), Byte.valueOf(A4072EstObsUlt2), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
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
                        processLevel1FZ1570( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FZ0( ) ;
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
            load1FZ1570( ) ;
         }
         endLevel1FZ1570( ) ;
      }
      closeExtendedTableCursors1FZ1570( ) ;
   }

   public void update1FZ1570( )
   {
      beforeValidate1FZ1570( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FZ1570( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FZ1570( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FZ1570( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FZ1570( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FZ14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4072EstObsUlt2), Byte.valueOf(A4072EstObsUlt2), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESTAM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FZ1570( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FZ1570( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FZ0( ) ;
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
         endLevel1FZ1570( ) ;
      }
      closeExtendedTableCursors1FZ1570( ) ;
   }

   public void deferredUpdate1FZ1570( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FZ1570( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FZ1570( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FZ1570( ) ;
         afterConfirm1FZ1570( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FZ1570( ) ;
            if ( AnyError == 0 )
            {
               A4072EstObsUlt2 = O4072EstObsUlt2 ;
               n4072EstObsUlt2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
               scanStart1FZ1592( ) ;
               while ( RcdFound1592 != 0 )
               {
                  getByPrimaryKey1FZ1592( ) ;
                  delete1FZ1592( ) ;
                  scanNext1FZ1592( ) ;
                  O4072EstObsUlt2 = A4072EstObsUlt2 ;
                  n4072EstObsUlt2 = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
               }
               scanEnd1FZ1592( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FZ15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1570 == 0 )
                        {
                           initAll1FZ1570( ) ;
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
                        resetCaption1FZ0( ) ;
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
      sMode1570 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FZ1570( ) ;
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FZ1570( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1FZ1592( )
   {
      s4072EstObsUlt2 = O4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1FZ1592( ) ;
         if ( ( nRcdExists_1592 != 0 ) || ( nIsMod_1592 != 0 ) )
         {
            standaloneNotModal1FZ1592( ) ;
            getKey1FZ1592( ) ;
            if ( ( nRcdExists_1592 == 0 ) && ( nRcdDeleted_1592 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FZ1592( ) ;
            }
            else
            {
               if ( RcdFound1592 != 0 )
               {
                  if ( ( nRcdDeleted_1592 != 0 ) && ( nRcdExists_1592 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FZ1592( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1592 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FZ1592( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1592 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O4072EstObsUlt2 = A4072EstObsUlt2 ;
            n4072EstObsUlt2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1592_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstObsLin2_Internalname, GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstobs2_Internalname, GXutil.rtrim( A4074Estobs2)) ;
         httpContext.changePostValue( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4074Estobs2_"+sGXsfl_55_idx, GXutil.rtrim( Z4074Estobs2)) ;
         httpContext.changePostValue( "nRcdDeleted_1592_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1592_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1592_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1592 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1592_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBSLIN2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBS2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FZ1592( ) ;
      if ( AnyError != 0 )
      {
         O4072EstObsUlt2 = s4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      }
      nRcdExists_1592 = (short)(0) ;
      nIsMod_1592 = (short)(0) ;
      nRcdDeleted_1592 = (short)(0) ;
   }

   public void processLevel1FZ1570( )
   {
      /* Save parent mode. */
      sMode1570 = Gx_mode ;
      processNestedLevel1FZ1592( ) ;
      if ( AnyError != 0 )
      {
         O4072EstObsUlt2 = s4072EstObsUlt2 ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1570 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FZ16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n4072EstObsUlt2), Byte.valueOf(A4072EstObsUlt2), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTAM");
   }

   public void endLevel1FZ1570( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1FZ1570( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcestob");
         if ( AnyError == 0 )
         {
            confirmValues1FZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcestob");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FZ1570( )
   {
      /* Scan By routine */
      /* Using cursor T01FZ17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1570 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FZ1570( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1570 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1570 = (short)(1) ;
      }
   }

   public void scanEnd1FZ1570( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1FZ1570( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FZ1570( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FZ1570( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FZ1570( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FZ1570( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FZ1570( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FZ1570( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtEstNomCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNomCol_Enabled), 5, 0), true);
      edtEstObsUlt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt2_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm1FZ1592( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4074Estobs2 = T01FZ3_A4074Estobs2[0] ;
         }
         else
         {
            Z4074Estobs2 = A4074Estobs2 ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z4073EstObsLin2 = A4073EstObsLin2 ;
         Z4074Estobs2 = A4074Estobs2 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1FZ1592( )
   {
      edtEstObsLin2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtEstObsUlt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt2_Enabled), 5, 0), true);
      edtEstObsUlt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt2_Enabled), 5, 0), true);
   }

   public void standaloneModal1FZ1592( )
   {
      if ( isIns( )  )
      {
         A4072EstObsUlt2 = (byte)(O4072EstObsUlt2+1) ;
         n4072EstObsUlt2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4073EstObsLin2 = A4072EstObsUlt2 ;
      }
   }

   public void load1FZ1592( )
   {
      /* Using cursor T01FZ18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A4074Estobs2 = T01FZ18_A4074Estobs2[0] ;
         n4074Estobs2 = T01FZ18_n4074Estobs2[0] ;
         zm1FZ1592( -10) ;
      }
      pr_default.close(16);
      onLoadActions1FZ1592( ) ;
   }

   public void onLoadActions1FZ1592( )
   {
   }

   public void checkExtendedTable1FZ1592( )
   {
      nIsDirty_1592 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FZ1592( ) ;
   }

   public void closeExtendedTableCursors1FZ1592( )
   {
   }

   public void enableDisable1FZ1592( )
   {
   }

   public void getKey1FZ1592( )
   {
      /* Using cursor T01FZ19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1592 = (short)(1) ;
      }
      else
      {
         RcdFound1592 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1FZ1592( )
   {
      /* Using cursor T01FZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
      if ( (pr_default.getStatus(1) != 101) && ( T01FZ3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01FZ3_A65ArtCod[0], A65ArtCod) == 0 ) && ( GXutil.strcmp(T01FZ3_A4061EstNomCol[0], A4061EstNomCol) == 0 ) && ( GXutil.strcmp(T01FZ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FZ1592( 10) ;
         RcdFound1592 = (short)(1) ;
         initializeNonKey1FZ1592( ) ;
         A4073EstObsLin2 = T01FZ3_A4073EstObsLin2[0] ;
         A4074Estobs2 = T01FZ3_A4074Estobs2[0] ;
         n4074Estobs2 = T01FZ3_n4074Estobs2[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z4061EstNomCol = A4061EstNomCol ;
         Z4073EstObsLin2 = A4073EstObsLin2 ;
         sMode1592 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FZ1592( ) ;
         load1FZ1592( ) ;
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1592 = (short)(0) ;
         initializeNonKey1FZ1592( ) ;
         sMode1592 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FZ1592( ) ;
         Gx_mode = sMode1592 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FZ1592( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FZ1592( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPObsest"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4074Estobs2, T01FZ2_A4074Estobs2[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4074Estobs2, T01FZ2_A4074Estobs2[0]) != 0 )
            {
               GXutil.writeLogln("tcestob:[seudo value changed for attri]"+"Estobs2");
               GXutil.writeLogRaw("Old: ",Z4074Estobs2);
               GXutil.writeLogRaw("Current: ",T01FZ2_A4074Estobs2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPObsest"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FZ1592( )
   {
      beforeValidate1FZ1592( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FZ1592( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FZ1592( 0) ;
         checkOptimisticConcurrency1FZ1592( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FZ1592( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FZ1592( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FZ20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2), Boolean.valueOf(n4074Estobs2), A4074Estobs2, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load1FZ1592( ) ;
         }
         endLevel1FZ1592( ) ;
      }
      closeExtendedTableCursors1FZ1592( ) ;
   }

   public void update1FZ1592( )
   {
      beforeValidate1FZ1592( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FZ1592( ) ;
      }
      if ( ( nIsMod_1592 != 0 ) || ( nIsDirty_1592 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FZ1592( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FZ1592( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FZ1592( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FZ21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n4074Estobs2), A4074Estobs2, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPObsest"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FZ1592( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FZ1592( ) ;
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
            endLevel1FZ1592( ) ;
         }
      }
      closeExtendedTableCursors1FZ1592( ) ;
   }

   public void deferredUpdate1FZ1592( )
   {
   }

   public void delete1FZ1592( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FZ1592( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FZ1592( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FZ1592( ) ;
         afterConfirm1FZ1592( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FZ1592( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FZ22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol, Byte.valueOf(A4073EstObsLin2)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPObsest");
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
      sMode1592 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FZ1592( ) ;
      Gx_mode = sMode1592 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FZ1592( )
   {
      standaloneModal1FZ1592( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FZ1592( )
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

   public void scanStart1FZ1592( )
   {
      /* Scan By routine */
      /* Using cursor T01FZ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4061EstNomCol});
      RcdFound1592 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A4073EstObsLin2 = T01FZ23_A4073EstObsLin2[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FZ1592( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1592 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1592 = (short)(1) ;
         A4073EstObsLin2 = T01FZ23_A4073EstObsLin2[0] ;
      }
   }

   public void scanEnd1FZ1592( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1FZ1592( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FZ1592( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FZ1592( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FZ1592( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FZ1592( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FZ1592( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FZ1592( )
   {
      edtEstObsLin2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtEstobs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstobs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1FZ1592( )
   {
   }

   public void send_integrity_lvl_hashes1FZ1570( )
   {
   }

   public void subsflControlProps_551592( )
   {
      edtavnRcdDeleted_1592_Internalname = "vNRCDDELETED_1592_"+sGXsfl_55_idx ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2_"+sGXsfl_55_idx ;
      edtEstobs2_Internalname = "ESTOBS2_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551592( )
   {
      edtavnRcdDeleted_1592_Internalname = "vNRCDDELETED_1592_"+sGXsfl_55_fel_idx ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2_"+sGXsfl_55_fel_idx ;
      edtEstobs2_Internalname = "ESTOBS2_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1FZ1592( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551592( ) ;
      sendRow1FZ1592( ) ;
   }

   public void sendRow1FZ1592( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1592_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1592_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1592_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1592), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1592), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1592_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1592_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstObsLin2_Internalname,GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstObsLin2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4073EstObsLin2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4073EstObsLin2), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstObsLin2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstObsLin2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1592_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstobs2_Internalname,GXutil.rtrim( A4074Estobs2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstobs2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstobs2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FZ1592( ) ;
      GXCCtl = "Z4073EstObsLin2_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4073EstObsLin2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4074Estobs2_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4074Estobs2));
      GXCCtl = "nRcdDeleted_1592_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1592_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1592_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1592, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1592_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTOBSLIN2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTOBS2_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FZ1592( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551592( ) ;
      edtavnRcdDeleted_1592_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1592_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstObsLin2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBSLIN2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstobs2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBS2_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1592_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1592_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1592");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1592_Internalname ;
         wbErr = true ;
         nRcdDeleted_1592 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1592 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1592_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4073EstObsLin2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsLin2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4074Estobs2 = httpContext.cgiGet( edtEstobs2_Internalname) ;
      n4074Estobs2 = false ;
      GXCCtl = "Z4073EstObsLin2_" + sGXsfl_55_idx ;
      Z4073EstObsLin2 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4074Estobs2_" + sGXsfl_55_idx ;
      Z4074Estobs2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1592_" + sGXsfl_55_idx ;
      nRcdDeleted_1592 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1592_" + sGXsfl_55_idx ;
      nRcdExists_1592 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1592_" + sGXsfl_55_idx ;
      nIsMod_1592 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstObsLin2_Enabled = edtEstObsLin2_Enabled ;
   }

   public void confirmValues1FZ0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551592( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551592( ) ;
         httpContext.changePostValue( "Z4073EstObsLin2_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4073EstObsLin2_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z4074Estobs2_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z4074Estobs2_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4074Estobs2_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcestob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A4061EstNomCol))}, new String[] {"EmprCod","CliCod","ArtCod","EstNomCol"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4061EstNomCol", GXutil.rtrim( Z4061EstNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( Z4072EstObsUlt2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( O4072EstObsUlt2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcestob", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A4061EstNomCol))}, new String[] {"EmprCod","CliCod","ArtCod","EstNomCol"})  ;
   }

   public String getPgmname( )
   {
      return "TCESTOB" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CESTOBS", "") ;
   }

   public void initializeNonKey1FZ1570( )
   {
      A4072EstObsUlt2 = (byte)(0) ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      O4072EstObsUlt2 = A4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
      Z4072EstObsUlt2 = (byte)(0) ;
   }

   public void initAll1FZ1570( )
   {
      initializeNonKey1FZ1570( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FZ1592( )
   {
      A4074Estobs2 = "" ;
      n4074Estobs2 = false ;
      Z4074Estobs2 = "" ;
   }

   public void initAll1FZ1592( )
   {
      A4073EstObsLin2 = (byte)(0) ;
      initializeNonKey1FZ1592( ) ;
   }

   public void standaloneModalInsert1FZ1592( )
   {
      A4072EstObsUlt2 = i4072EstObsUlt2 ;
      n4072EstObsUlt2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4072EstObsUlt2), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241573550", true, true);
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
      httpContext.AddJavascriptSource("tcestob.js", "?20268241573550", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1592( )
   {
      edtEstObsLin2_Enabled = defedtEstObsLin2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1592, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1592_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4073EstObsLin2, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4074Estobs2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstNomCol_Internalname = "ESTNOMCOL" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstObsUlt2_Internalname = "ESTOBSULT2" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtavnRcdDeleted_1592_Internalname = "vNRCDDELETED_1592" ;
      edtEstObsLin2_Internalname = "ESTOBSLIN2" ;
      edtEstobs2_Internalname = "ESTOBS2" ;
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
      Form.setCaption( httpContext.getMessage( "CESTOBS", "") );
      edtEstobs2_Jsonclick = "" ;
      edtEstObsLin2_Jsonclick = "" ;
      edtavnRcdDeleted_1592_Jsonclick = "" ;
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
      edtEstobs2_Enabled = 1 ;
      edtEstObsLin2_Enabled = 0 ;
      edtavnRcdDeleted_1592_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtEstObsUlt2_Jsonclick = "" ;
      edtEstObsUlt2_Backcolor = (int)(0xFFFFFF) ;
      edtEstObsUlt2_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstNomCol_Jsonclick = "" ;
      edtEstNomCol_Backcolor = (int)(0xFFFFFF) ;
      edtEstNomCol_Enabled = 0 ;
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
      subsflControlProps_551592( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FZ1592( ) ;
         standaloneModal1FZ1592( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FZ1592( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551592( ) ;
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
      /* Using cursor T01FZ24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FZ24_A407EmprNom[0] ;
      n407EmprNom = T01FZ24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(22);
      /* Using cursor T01FZ25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01FZ25_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(23);
      /* Using cursor T01FZ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(24);
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

   public void valid_Estnomcol( )
   {
      n4072EstObsUlt2 = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( A4072EstObsUlt2, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4061EstNomCol", GXutil.rtrim( Z4061EstNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( Z4072EstObsUlt2, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "O4072EstObsUlt2", GXutil.ltrim( localUtil.ntoc( O4072EstObsUlt2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTNOMCOL","{handler:'valid_Estnomcol',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4072EstObsUlt2',fld:'ESTOBSULT2',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A4061EstNomCol',fld:'ESTNOMCOL',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTNOMCOL",",oparms:[{av:'A4072EstObsUlt2',fld:'ESTOBSULT2',pic:'Z9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z65ArtCod'},{av:'Z4061EstNomCol'},{av:'Z4072EstObsUlt2'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'O4072EstObsUlt2'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTOBSULT2","{handler:'valid_Estobsult2',iparms:[]");
      setEventMetadata("VALID_ESTOBSULT2",",oparms:[]}");
      setEventMetadata("VALID_ESTOBSLIN2","{handler:'valid_Estobslin2',iparms:[]");
      setEventMetadata("VALID_ESTOBSLIN2",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Estobs2',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA65ArtCod = "" ;
      wcpOA4061EstNomCol = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z4061EstNomCol = "" ;
      Z4074Estobs2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4061EstNomCol = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A279CliNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1592 = "" ;
      Gx_mode = "" ;
      GX_FocusControl = "" ;
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
      sMode1570 = "" ;
      A4074Estobs2 = "" ;
      AV9LitFe = "" ;
      AV7Lit0 = "" ;
      GXt_char1 = "" ;
      AV10Lit1 = "" ;
      AV29station = "" ;
      GXv_char2 = new String[1] ;
      AV30emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01FZ6_A407EmprNom = new String[] {""} ;
      T01FZ6_n407EmprNom = new boolean[] {false} ;
      T01FZ7_A279CliNom = new String[] {""} ;
      T01FZ8_A396EmprCod = new String[] {""} ;
      T01FZ9_A4061EstNomCol = new String[] {""} ;
      T01FZ9_A4072EstObsUlt2 = new byte[1] ;
      T01FZ9_n4072EstObsUlt2 = new boolean[] {false} ;
      T01FZ9_A407EmprNom = new String[] {""} ;
      T01FZ9_n407EmprNom = new boolean[] {false} ;
      T01FZ9_A279CliNom = new String[] {""} ;
      T01FZ9_A396EmprCod = new String[] {""} ;
      T01FZ9_A252CliCod = new int[1] ;
      T01FZ9_A65ArtCod = new String[] {""} ;
      T01FZ10_A396EmprCod = new String[] {""} ;
      T01FZ10_A252CliCod = new int[1] ;
      T01FZ10_A65ArtCod = new String[] {""} ;
      T01FZ10_A4061EstNomCol = new String[] {""} ;
      T01FZ5_A4061EstNomCol = new String[] {""} ;
      T01FZ5_A4072EstObsUlt2 = new byte[1] ;
      T01FZ5_n4072EstObsUlt2 = new boolean[] {false} ;
      T01FZ5_A396EmprCod = new String[] {""} ;
      T01FZ5_A252CliCod = new int[1] ;
      T01FZ5_A65ArtCod = new String[] {""} ;
      T01FZ11_A396EmprCod = new String[] {""} ;
      T01FZ11_A252CliCod = new int[1] ;
      T01FZ11_A65ArtCod = new String[] {""} ;
      T01FZ11_A4061EstNomCol = new String[] {""} ;
      T01FZ12_A396EmprCod = new String[] {""} ;
      T01FZ12_A252CliCod = new int[1] ;
      T01FZ12_A65ArtCod = new String[] {""} ;
      T01FZ12_A4061EstNomCol = new String[] {""} ;
      T01FZ4_A4061EstNomCol = new String[] {""} ;
      T01FZ4_A4072EstObsUlt2 = new byte[1] ;
      T01FZ4_n4072EstObsUlt2 = new boolean[] {false} ;
      T01FZ4_A396EmprCod = new String[] {""} ;
      T01FZ4_A252CliCod = new int[1] ;
      T01FZ4_A65ArtCod = new String[] {""} ;
      T01FZ17_A396EmprCod = new String[] {""} ;
      T01FZ17_A252CliCod = new int[1] ;
      T01FZ17_A65ArtCod = new String[] {""} ;
      T01FZ17_A4061EstNomCol = new String[] {""} ;
      T01FZ18_A252CliCod = new int[1] ;
      T01FZ18_A65ArtCod = new String[] {""} ;
      T01FZ18_A4061EstNomCol = new String[] {""} ;
      T01FZ18_A4073EstObsLin2 = new byte[1] ;
      T01FZ18_A4074Estobs2 = new String[] {""} ;
      T01FZ18_n4074Estobs2 = new boolean[] {false} ;
      T01FZ18_A396EmprCod = new String[] {""} ;
      T01FZ19_A396EmprCod = new String[] {""} ;
      T01FZ19_A252CliCod = new int[1] ;
      T01FZ19_A65ArtCod = new String[] {""} ;
      T01FZ19_A4061EstNomCol = new String[] {""} ;
      T01FZ19_A4073EstObsLin2 = new byte[1] ;
      T01FZ3_A252CliCod = new int[1] ;
      T01FZ3_A65ArtCod = new String[] {""} ;
      T01FZ3_A4061EstNomCol = new String[] {""} ;
      T01FZ3_A4073EstObsLin2 = new byte[1] ;
      T01FZ3_A4074Estobs2 = new String[] {""} ;
      T01FZ3_n4074Estobs2 = new boolean[] {false} ;
      T01FZ3_A396EmprCod = new String[] {""} ;
      T01FZ2_A252CliCod = new int[1] ;
      T01FZ2_A65ArtCod = new String[] {""} ;
      T01FZ2_A4061EstNomCol = new String[] {""} ;
      T01FZ2_A4073EstObsLin2 = new byte[1] ;
      T01FZ2_A4074Estobs2 = new String[] {""} ;
      T01FZ2_n4074Estobs2 = new boolean[] {false} ;
      T01FZ2_A396EmprCod = new String[] {""} ;
      T01FZ23_A396EmprCod = new String[] {""} ;
      T01FZ23_A252CliCod = new int[1] ;
      T01FZ23_A65ArtCod = new String[] {""} ;
      T01FZ23_A4061EstNomCol = new String[] {""} ;
      T01FZ23_A4073EstObsLin2 = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FZ24_A407EmprNom = new String[] {""} ;
      T01FZ24_n407EmprNom = new boolean[] {false} ;
      T01FZ25_A279CliNom = new String[] {""} ;
      T01FZ26_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ65ArtCod = "" ;
      ZZ4061EstNomCol = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcestob__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcestob__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcestob__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcestob__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcestob__default(),
         new Object[] {
             new Object[] {
            T01FZ2_A252CliCod, T01FZ2_A65ArtCod, T01FZ2_A4061EstNomCol, T01FZ2_A4073EstObsLin2, T01FZ2_A4074Estobs2, T01FZ2_n4074Estobs2, T01FZ2_A396EmprCod
            }
            , new Object[] {
            T01FZ3_A252CliCod, T01FZ3_A65ArtCod, T01FZ3_A4061EstNomCol, T01FZ3_A4073EstObsLin2, T01FZ3_A4074Estobs2, T01FZ3_n4074Estobs2, T01FZ3_A396EmprCod
            }
            , new Object[] {
            T01FZ4_A4061EstNomCol, T01FZ4_A4072EstObsUlt2, T01FZ4_n4072EstObsUlt2, T01FZ4_A396EmprCod, T01FZ4_A252CliCod, T01FZ4_A65ArtCod
            }
            , new Object[] {
            T01FZ5_A4061EstNomCol, T01FZ5_A4072EstObsUlt2, T01FZ5_n4072EstObsUlt2, T01FZ5_A396EmprCod, T01FZ5_A252CliCod, T01FZ5_A65ArtCod
            }
            , new Object[] {
            T01FZ6_A407EmprNom, T01FZ6_n407EmprNom
            }
            , new Object[] {
            T01FZ7_A279CliNom
            }
            , new Object[] {
            T01FZ8_A396EmprCod
            }
            , new Object[] {
            T01FZ9_A4061EstNomCol, T01FZ9_A4072EstObsUlt2, T01FZ9_n4072EstObsUlt2, T01FZ9_A407EmprNom, T01FZ9_n407EmprNom, T01FZ9_A279CliNom, T01FZ9_A396EmprCod, T01FZ9_A252CliCod, T01FZ9_A65ArtCod
            }
            , new Object[] {
            T01FZ10_A396EmprCod, T01FZ10_A252CliCod, T01FZ10_A65ArtCod, T01FZ10_A4061EstNomCol
            }
            , new Object[] {
            T01FZ11_A396EmprCod, T01FZ11_A252CliCod, T01FZ11_A65ArtCod, T01FZ11_A4061EstNomCol
            }
            , new Object[] {
            T01FZ12_A396EmprCod, T01FZ12_A252CliCod, T01FZ12_A65ArtCod, T01FZ12_A4061EstNomCol
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
            T01FZ17_A396EmprCod, T01FZ17_A252CliCod, T01FZ17_A65ArtCod, T01FZ17_A4061EstNomCol
            }
            , new Object[] {
            T01FZ18_A252CliCod, T01FZ18_A65ArtCod, T01FZ18_A4061EstNomCol, T01FZ18_A4073EstObsLin2, T01FZ18_A4074Estobs2, T01FZ18_n4074Estobs2, T01FZ18_A396EmprCod
            }
            , new Object[] {
            T01FZ19_A396EmprCod, T01FZ19_A252CliCod, T01FZ19_A65ArtCod, T01FZ19_A4061EstNomCol, T01FZ19_A4073EstObsLin2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FZ23_A396EmprCod, T01FZ23_A252CliCod, T01FZ23_A65ArtCod, T01FZ23_A4061EstNomCol, T01FZ23_A4073EstObsLin2
            }
            , new Object[] {
            T01FZ24_A407EmprNom, T01FZ24_n407EmprNom
            }
            , new Object[] {
            T01FZ25_A279CliNom
            }
            , new Object[] {
            T01FZ26_A396EmprCod
            }
         }
      );
      Z4061EstNomCol = "" ;
      A4061EstNomCol = "" ;
      Z65ArtCod = "" ;
      A65ArtCod = "" ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z4072EstObsUlt2 ;
   private byte O4072EstObsUlt2 ;
   private byte Z4073EstObsLin2 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4072EstObsUlt2 ;
   private byte Gx_BScreen ;
   private byte B4072EstObsUlt2 ;
   private byte s4072EstObsUlt2 ;
   private byte A4073EstObsLin2 ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i4072EstObsUlt2 ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4072EstObsUlt2 ;
   private byte ZO4072EstObsUlt2 ;
   private short nRcdDeleted_1592 ;
   private short nRcdExists_1592 ;
   private short nIsMod_1592 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1592 ;
   private short RcdFound1592 ;
   private short nBlankRcdUsr1592 ;
   private short RcdFound1570 ;
   private short nIsDirty_1570 ;
   private short nIsDirty_1592 ;
   private int wcpOA252CliCod ;
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
   private int edtArtCod_Enabled ;
   private int edtEstNomCol_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEstObsUlt2_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtavnRcdDeleted_1592_Enabled ;
   private int edtEstObsLin2_Enabled ;
   private int edtEstobs2_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV32contador ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtEstObsLin2_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEstObsUlt2_Backcolor ;
   private int edtEstNomCol_Backcolor ;
   private int edtArtCod_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA65ArtCod ;
   private String wcpOA4061EstNomCol ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z4061EstNomCol ;
   private String Z4074Estobs2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4061EstNomCol ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstNomCol_Internalname ;
   private String edtEstNomCol_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstObsUlt2_Internalname ;
   private String edtEstObsUlt2_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String sMode1592 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1592_Internalname ;
   private String edtEstObsLin2_Internalname ;
   private String edtEstobs2_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1570 ;
   private String A4074Estobs2 ;
   private String AV9LitFe ;
   private String AV7Lit0 ;
   private String GXt_char1 ;
   private String AV10Lit1 ;
   private String AV29station ;
   private String GXv_char2[] ;
   private String AV30emprnom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1592_Jsonclick ;
   private String edtEstObsLin2_Jsonclick ;
   private String edtEstobs2_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ65ArtCod ;
   private String ZZ4061EstNomCol ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4072EstObsUlt2 ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n4074Estobs2 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FZ6_A407EmprNom ;
   private boolean[] T01FZ6_n407EmprNom ;
   private String[] T01FZ7_A279CliNom ;
   private String[] T01FZ8_A396EmprCod ;
   private String[] T01FZ9_A4061EstNomCol ;
   private byte[] T01FZ9_A4072EstObsUlt2 ;
   private boolean[] T01FZ9_n4072EstObsUlt2 ;
   private String[] T01FZ9_A407EmprNom ;
   private boolean[] T01FZ9_n407EmprNom ;
   private String[] T01FZ9_A279CliNom ;
   private String[] T01FZ9_A396EmprCod ;
   private int[] T01FZ9_A252CliCod ;
   private String[] T01FZ9_A65ArtCod ;
   private String[] T01FZ10_A396EmprCod ;
   private int[] T01FZ10_A252CliCod ;
   private String[] T01FZ10_A65ArtCod ;
   private String[] T01FZ10_A4061EstNomCol ;
   private String[] T01FZ5_A4061EstNomCol ;
   private byte[] T01FZ5_A4072EstObsUlt2 ;
   private boolean[] T01FZ5_n4072EstObsUlt2 ;
   private String[] T01FZ5_A396EmprCod ;
   private int[] T01FZ5_A252CliCod ;
   private String[] T01FZ5_A65ArtCod ;
   private String[] T01FZ11_A396EmprCod ;
   private int[] T01FZ11_A252CliCod ;
   private String[] T01FZ11_A65ArtCod ;
   private String[] T01FZ11_A4061EstNomCol ;
   private String[] T01FZ12_A396EmprCod ;
   private int[] T01FZ12_A252CliCod ;
   private String[] T01FZ12_A65ArtCod ;
   private String[] T01FZ12_A4061EstNomCol ;
   private String[] T01FZ4_A4061EstNomCol ;
   private byte[] T01FZ4_A4072EstObsUlt2 ;
   private boolean[] T01FZ4_n4072EstObsUlt2 ;
   private String[] T01FZ4_A396EmprCod ;
   private int[] T01FZ4_A252CliCod ;
   private String[] T01FZ4_A65ArtCod ;
   private String[] T01FZ17_A396EmprCod ;
   private int[] T01FZ17_A252CliCod ;
   private String[] T01FZ17_A65ArtCod ;
   private String[] T01FZ17_A4061EstNomCol ;
   private int[] T01FZ18_A252CliCod ;
   private String[] T01FZ18_A65ArtCod ;
   private String[] T01FZ18_A4061EstNomCol ;
   private byte[] T01FZ18_A4073EstObsLin2 ;
   private String[] T01FZ18_A4074Estobs2 ;
   private boolean[] T01FZ18_n4074Estobs2 ;
   private String[] T01FZ18_A396EmprCod ;
   private String[] T01FZ19_A396EmprCod ;
   private int[] T01FZ19_A252CliCod ;
   private String[] T01FZ19_A65ArtCod ;
   private String[] T01FZ19_A4061EstNomCol ;
   private byte[] T01FZ19_A4073EstObsLin2 ;
   private int[] T01FZ3_A252CliCod ;
   private String[] T01FZ3_A65ArtCod ;
   private String[] T01FZ3_A4061EstNomCol ;
   private byte[] T01FZ3_A4073EstObsLin2 ;
   private String[] T01FZ3_A4074Estobs2 ;
   private boolean[] T01FZ3_n4074Estobs2 ;
   private String[] T01FZ3_A396EmprCod ;
   private int[] T01FZ2_A252CliCod ;
   private String[] T01FZ2_A65ArtCod ;
   private String[] T01FZ2_A4061EstNomCol ;
   private byte[] T01FZ2_A4073EstObsLin2 ;
   private String[] T01FZ2_A4074Estobs2 ;
   private boolean[] T01FZ2_n4074Estobs2 ;
   private String[] T01FZ2_A396EmprCod ;
   private String[] T01FZ23_A396EmprCod ;
   private int[] T01FZ23_A252CliCod ;
   private String[] T01FZ23_A65ArtCod ;
   private String[] T01FZ23_A4061EstNomCol ;
   private byte[] T01FZ23_A4073EstObsLin2 ;
   private String[] T01FZ24_A407EmprNom ;
   private boolean[] T01FZ24_n407EmprNom ;
   private String[] T01FZ25_A279CliNom ;
   private String[] T01FZ26_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcestob__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestob__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestob__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestob__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcestob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FZ2", "SELECT CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?  FOR UPDATE OF Estobs2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FZ3", "SELECT CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FZ4", "SELECT EstNomCol, EstObsUlt2, EmprCod, CliCod, ArtCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?  FOR UPDATE OF EstObsUlt2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ5", "SELECT EstNomCol, EstObsUlt2, EmprCod, CliCod, ArtCod FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ8", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ9", "SELECT /*+ FIRST_ROWS(1) */ TM1.EstNomCol, TM1.EstObsUlt2, T2.EmprNom, T3.CliNom, TM1.EmprCod, TM1.CliCod, TM1.ArtCod FROM ((TXPCESTAM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.EstNomCol = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.EstNomCol ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, EstNomCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FZ13", "INSERT INTO TXPCESTAM(EstNomCol, EstObsUlt2, EmprCod, CliCod, ArtCod, EstPreKg, EstPreDef, EstAcab, EstCuba, EstSepara, EstFechaE, EstFechaU, EstBarCod, EstBarREo, EstBarPar, EstNumFor) VALUES(?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0)", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FZ14", "UPDATE TXPCESTAM SET EstObsUlt2=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FZ15", "DELETE FROM TXPCESTAM  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new UpdateCursor("T01FZ16", "UPDATE TXPCESTAM SET EstObsUlt2=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ?", GX_NOMASK, "TXPCESTAM")
         ,new ForEachCursor("T01FZ17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ18", "SELECT CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod FROM TXPObsest WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? and EstObsLin2 = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FZ19", "SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FZ20", "INSERT INTO TXPObsest(CliCod, ArtCod, EstNomCol, EstObsLin2, Estobs2, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPObsest")
         ,new UpdateCursor("T01FZ21", "UPDATE TXPObsest SET Estobs2=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?", GX_NOMASK, "TXPObsest")
         ,new UpdateCursor("T01FZ22", "DELETE FROM TXPObsest  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND EstNomCol = ? AND EstObsLin2 = ?", GX_NOMASK, "TXPObsest")
         ,new ForEachCursor("T01FZ23", "SELECT EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 FROM TXPObsest WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and EstNomCol = ? ORDER BY EmprCod, CliCod, ArtCod, EstNomCol, EstObsLin2 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FZ24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ25", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FZ26", "SELECT EmprCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 13);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 16);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               stmt.setString(6, (String)parms[6], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

