package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talrpif_impl extends GXDataArea
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fibras de las Piezas", ""), (short)(0)) ;
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

   public talrpif_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talrpif_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talrpif_impl.class ));
   }

   public talrpif_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TAlrPiF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "AlbRecPie", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TAlrPiF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie), GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecPie_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecPie_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
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
         nBlankRcdCount1377 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1377 = (short)(1) ;
            scanStart1761377( ) ;
            while ( RcdFound1377 != 0 )
            {
               init_level_properties1377( ) ;
               getByPrimaryKey1761377( ) ;
               addRow1761377( ) ;
               scanNext1761377( ) ;
            }
            scanEnd1761377( ) ;
            nBlankRcdCount1377 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1761377( ) ;
         standaloneModal1761377( ) ;
         sMode1377 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1761377( ) ;
            edtavnRcdDeleted_1377_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1377_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1377_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1377_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBORD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibOrd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBPAR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibPar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBPRO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibPro_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibTit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBTIT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibTit_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibTpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBTPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibTpo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBCLA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibCla_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibCmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBCMP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibCmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibCmp_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibFil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBFIL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibFil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibFil_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtAlRFibObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBOBS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlRFibObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibObs_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1377 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1761377( ) ;
            }
            sendRow1761377( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1377 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1377 = (short)(5) ;
         nRcdExists_1377 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1761377( ) ;
            while ( RcdFound1377 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401377( ) ;
               init_level_properties1377( ) ;
               standaloneNotModal1761377( ) ;
               getByPrimaryKey1761377( ) ;
               standaloneModal1761377( ) ;
               addRow1761377( ) ;
               scanNext1761377( ) ;
            }
            scanEnd1761377( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1377 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401377( ) ;
      initAll1761377( ) ;
      init_level_properties1377( ) ;
      nRcdExists_1377 = (short)(0) ;
      nIsMod_1377 = (short)(0) ;
      nRcdDeleted_1377 = (short)(0) ;
      nBlankRcdCount1377 = (short)(nBlankRcdUsr1377+nBlankRcdCount1377) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1377 > 0 )
      {
         standaloneNotModal1761377( ) ;
         standaloneModal1761377( ) ;
         addRow1761377( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlRFibOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1377 = (short)(nBlankRcdCount1377-1) ;
      }
      Gx_mode = sMode1377 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAlrPiF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TAlrPiF.htm");
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
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2159AlbRecPie = httpContext.cgiGet( "Z2159AlbRecPie") ;
         Z4795AlRPieCal = httpContext.cgiGet( "Z4795AlRPieCal") ;
         A4795AlRPieCal = httpContext.cgiGet( "Z4795AlRPieCal") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TAlrPiF");
         forbiddenHiddens.add("AlRPieCal", GXutil.rtrim( localUtil.format( A4795AlRPieCal, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("talrpif:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
            httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
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
            initAll176299( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1377_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1377_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes176299( ) ;
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

   public void confirm_1760( )
   {
      beforeValidate176299( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls176299( ) ;
         }
         else
         {
            checkExtendedTable176299( ) ;
            if ( AnyError == 0 )
            {
               zm176299( 3) ;
               zm176299( 4) ;
            }
            closeExtendedTableCursors176299( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode299 = Gx_mode ;
         confirm_1761377( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode299 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1760( ) ;
      }
   }

   public void confirm_1761377( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1761377( ) ;
         if ( ( nRcdExists_1377 != 0 ) || ( nIsMod_1377 != 0 ) )
         {
            getKey1761377( ) ;
            if ( ( nRcdExists_1377 == 0 ) && ( nRcdDeleted_1377 == 0 ) )
            {
               if ( RcdFound1377 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1761377( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1761377( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1761377( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALRFIBORD_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlRFibOrd_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1377 != 0 )
               {
                  if ( nRcdDeleted_1377 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1761377( ) ;
                     load1761377( ) ;
                     beforeValidate1761377( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1761377( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1377 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1761377( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1761377( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1761377( ) ;
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
                  if ( nRcdDeleted_1377 == 0 )
                  {
                     GXCCtl = "ALRFIBORD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlRFibOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1377_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A10188AlRFibOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibPar_Internalname, GXutil.ltrim( localUtil.ntoc( A10189AlRFibPar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibPro_Internalname, GXutil.rtrim( A10190AlRFibPro)) ;
         httpContext.changePostValue( edtAlRFibTit_Internalname, GXutil.rtrim( A10191AlRFibTit)) ;
         httpContext.changePostValue( edtAlRFibTpo_Internalname, GXutil.rtrim( A10192AlRFibTpo)) ;
         httpContext.changePostValue( edtAlRFibCla_Internalname, GXutil.rtrim( A10193AlRFibCla)) ;
         httpContext.changePostValue( edtAlRFibCmp_Internalname, GXutil.rtrim( A10194AlRFibCmp)) ;
         httpContext.changePostValue( edtAlRFibFil_Internalname, GXutil.ltrim( localUtil.ntoc( A10195AlRFibFil, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibObs_Internalname, GXutil.rtrim( A10196AlRFibObs)) ;
         httpContext.changePostValue( "ZT_"+"Z10188AlRFibOrd_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10188AlRFibOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10189AlRFibPar_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10189AlRFibPar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10190AlRFibPro_"+sGXsfl_40_idx, GXutil.rtrim( Z10190AlRFibPro)) ;
         httpContext.changePostValue( "ZT_"+"Z10191AlRFibTit_"+sGXsfl_40_idx, GXutil.rtrim( Z10191AlRFibTit)) ;
         httpContext.changePostValue( "ZT_"+"Z10192AlRFibTpo_"+sGXsfl_40_idx, GXutil.rtrim( Z10192AlRFibTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z10193AlRFibCla_"+sGXsfl_40_idx, GXutil.rtrim( Z10193AlRFibCla)) ;
         httpContext.changePostValue( "ZT_"+"Z10194AlRFibCmp_"+sGXsfl_40_idx, GXutil.rtrim( Z10194AlRFibCmp)) ;
         httpContext.changePostValue( "ZT_"+"Z10195AlRFibFil_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10195AlRFibFil, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10196AlRFibObs_"+sGXsfl_40_idx, GXutil.rtrim( Z10196AlRFibObs)) ;
         httpContext.changePostValue( "nRcdDeleted_1377_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1377_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1377_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1377 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1377_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1377_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBORD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBPAR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBPRO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBTIT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBTPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBCLA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBCMP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBFIL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibFil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBOBS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1760( )
   {
   }

   public void zm176299( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4795AlRPieCal = T01765_A4795AlRPieCal[0] ;
         }
         else
         {
            Z4795AlRPieCal = A4795AlRPieCal ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01766 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01766_A407EmprNom[0] ;
      n407EmprNom = T01766_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01767 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
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
      GXt_char1 = A4795AlRPieCal ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A44AlbRecCod ;
      GXv_char4[0] = A2159AlbRecPie ;
      GXv_char5[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5) ;
      talrpif_impl.this.A396EmprCod = GXv_char2[0] ;
      talrpif_impl.this.A44AlbRecCod = GXv_int3[0] ;
      talrpif_impl.this.A2159AlbRecPie = GXv_char4[0] ;
      talrpif_impl.this.GXt_char1 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", A2159AlbRecPie);
      A4795AlRPieCal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
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

   public void load176299( )
   {
      /* Using cursor T01768 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T01768_A4795AlRPieCal[0] ;
         A407EmprNom = T01768_A407EmprNom[0] ;
         n407EmprNom = T01768_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm176299( -2) ;
      }
      pr_default.close(6);
      onLoadActions176299( ) ;
   }

   public void onLoadActions176299( )
   {
   }

   public void checkExtendedTable176299( )
   {
      nIsDirty_299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors176299( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey176299( )
   {
      /* Using cursor T01769 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      else
      {
         RcdFound299 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01765 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01765_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) && ( GXutil.strcmp(T01765_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01765_A44AlbRecCod[0] == A44AlbRecCod ) )
      {
         zm176299( 2) ;
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T01765_A4795AlRPieCal[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load176299( ) ;
         if ( AnyError == 1 )
         {
            RcdFound299 = (short)(0) ;
            initializeNonKey176299( ) ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound299 = (short)(0) ;
         initializeNonKey176299( ) ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey176299( ) ;
      if ( RcdFound299 == 0 )
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
      RcdFound299 = (short)(0) ;
      /* Using cursor T017610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T017610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017610_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T017610_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T017610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017610_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T017610_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) )
         {
            RcdFound299 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound299 = (short)(0) ;
      /* Using cursor T017611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017611_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T017611_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T017611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T017611_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T017611_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) )
         {
            RcdFound299 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey176299( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert176299( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound299 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
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
               update176299( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert176299( ) ;
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
                  insert176299( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
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
      getKey176299( ) ;
      if ( RcdFound299 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) || ( GXutil.strcmp(A2159AlbRecPie, Z2159AlbRecPie) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talrpif");
   }

   public void insert_check( )
   {
      confirm_1760( ) ;
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
      if ( RcdFound299 == 0 )
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
      scanStart176299( ) ;
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd176299( ) ;
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
      if ( RcdFound299 == 0 )
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
      if ( RcdFound299 == 0 )
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
      scanStart176299( ) ;
      if ( RcdFound299 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound299 != 0 )
         {
            scanNext176299( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd176299( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency176299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01764 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4795AlRPieCal, T01764_A4795AlRPieCal[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T01764_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T01764_A4795AlRPieCal[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert176299( )
   {
      beforeValidate176299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable176299( ) ;
      }
      if ( AnyError == 0 )
      {
         zm176299( 0) ;
         checkOptimisticConcurrency176299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm176299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert176299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017612 */
                  pr_default.execute(10, new Object[] {A4795AlRPieCal, A2159AlbRecPie, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
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
                        processLevel176299( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1760( ) ;
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
            load176299( ) ;
         }
         endLevel176299( ) ;
      }
      closeExtendedTableCursors176299( ) ;
   }

   public void update176299( )
   {
      beforeValidate176299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable176299( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency176299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm176299( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate176299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017613 */
                  pr_default.execute(11, new Object[] {A4795AlRPieCal, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate176299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel176299( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1760( ) ;
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
         endLevel176299( ) ;
      }
      closeExtendedTableCursors176299( ) ;
   }

   public void deferredUpdate176299( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate176299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency176299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls176299( ) ;
         afterConfirm176299( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete176299( ) ;
            if ( AnyError == 0 )
            {
               scanStart1761377( ) ;
               while ( RcdFound1377 != 0 )
               {
                  getByPrimaryKey1761377( ) ;
                  delete1761377( ) ;
                  scanNext1761377( ) ;
               }
               scanEnd1761377( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017614 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound299 == 0 )
                        {
                           initAll176299( ) ;
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
                        resetCaption1760( ) ;
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
      sMode299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel176299( ) ;
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls176299( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T017615 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HILZPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T017616 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPi1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T017617 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Historia de las Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T017618 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void processNestedLevel1761377( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1761377( ) ;
         if ( ( nRcdExists_1377 != 0 ) || ( nIsMod_1377 != 0 ) )
         {
            standaloneNotModal1761377( ) ;
            getKey1761377( ) ;
            if ( ( nRcdExists_1377 == 0 ) && ( nRcdDeleted_1377 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1761377( ) ;
            }
            else
            {
               if ( RcdFound1377 != 0 )
               {
                  if ( ( nRcdDeleted_1377 != 0 ) && ( nRcdExists_1377 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1761377( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1377 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1761377( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1377 == 0 )
                  {
                     GXCCtl = "ALRFIBORD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlRFibOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1377_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A10188AlRFibOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibPar_Internalname, GXutil.ltrim( localUtil.ntoc( A10189AlRFibPar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibPro_Internalname, GXutil.rtrim( A10190AlRFibPro)) ;
         httpContext.changePostValue( edtAlRFibTit_Internalname, GXutil.rtrim( A10191AlRFibTit)) ;
         httpContext.changePostValue( edtAlRFibTpo_Internalname, GXutil.rtrim( A10192AlRFibTpo)) ;
         httpContext.changePostValue( edtAlRFibCla_Internalname, GXutil.rtrim( A10193AlRFibCla)) ;
         httpContext.changePostValue( edtAlRFibCmp_Internalname, GXutil.rtrim( A10194AlRFibCmp)) ;
         httpContext.changePostValue( edtAlRFibFil_Internalname, GXutil.ltrim( localUtil.ntoc( A10195AlRFibFil, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlRFibObs_Internalname, GXutil.rtrim( A10196AlRFibObs)) ;
         httpContext.changePostValue( "ZT_"+"Z10188AlRFibOrd_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10188AlRFibOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10189AlRFibPar_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10189AlRFibPar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10190AlRFibPro_"+sGXsfl_40_idx, GXutil.rtrim( Z10190AlRFibPro)) ;
         httpContext.changePostValue( "ZT_"+"Z10191AlRFibTit_"+sGXsfl_40_idx, GXutil.rtrim( Z10191AlRFibTit)) ;
         httpContext.changePostValue( "ZT_"+"Z10192AlRFibTpo_"+sGXsfl_40_idx, GXutil.rtrim( Z10192AlRFibTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z10193AlRFibCla_"+sGXsfl_40_idx, GXutil.rtrim( Z10193AlRFibCla)) ;
         httpContext.changePostValue( "ZT_"+"Z10194AlRFibCmp_"+sGXsfl_40_idx, GXutil.rtrim( Z10194AlRFibCmp)) ;
         httpContext.changePostValue( "ZT_"+"Z10195AlRFibFil_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10195AlRFibFil, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10196AlRFibObs_"+sGXsfl_40_idx, GXutil.rtrim( Z10196AlRFibObs)) ;
         httpContext.changePostValue( "nRcdDeleted_1377_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1377_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1377_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1377 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1377_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1377_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBORD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBPAR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBPRO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBTIT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBTPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBCLA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBCMP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCmp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBFIL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibFil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRFIBOBS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1761377( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1377 = (short)(0) ;
      nIsMod_1377 = (short)(0) ;
      nRcdDeleted_1377 = (short)(0) ;
   }

   public void processLevel176299( )
   {
      /* Save parent mode. */
      sMode299 = Gx_mode ;
      processNestedLevel1761377( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel176299( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete176299( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talrpif");
         if ( AnyError == 0 )
         {
            confirmValues1760( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talrpif");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart176299( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A44AlbRecCod = A44AlbRecCod ;
      this.A2159AlbRecPie = A2159AlbRecPie ;
      /* Scan By routine */
      /* Using cursor T017619 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext176299( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
   }

   public void scanEnd176299( )
   {
      pr_default.close(17);
   }

   public void afterConfirm176299( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert176299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate176299( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete176299( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete176299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate176299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes176299( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), true);
   }

   public void zm1761377( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10189AlRFibPar = T01763_A10189AlRFibPar[0] ;
            Z10190AlRFibPro = T01763_A10190AlRFibPro[0] ;
            Z10191AlRFibTit = T01763_A10191AlRFibTit[0] ;
            Z10192AlRFibTpo = T01763_A10192AlRFibTpo[0] ;
            Z10193AlRFibCla = T01763_A10193AlRFibCla[0] ;
            Z10194AlRFibCmp = T01763_A10194AlRFibCmp[0] ;
            Z10195AlRFibFil = T01763_A10195AlRFibFil[0] ;
            Z10196AlRFibObs = T01763_A10196AlRFibObs[0] ;
         }
         else
         {
            Z10189AlRFibPar = A10189AlRFibPar ;
            Z10190AlRFibPro = A10190AlRFibPro ;
            Z10191AlRFibTit = A10191AlRFibTit ;
            Z10192AlRFibTpo = A10192AlRFibTpo ;
            Z10193AlRFibCla = A10193AlRFibCla ;
            Z10194AlRFibCmp = A10194AlRFibCmp ;
            Z10195AlRFibFil = A10195AlRFibFil ;
            Z10196AlRFibObs = A10196AlRFibObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z10188AlRFibOrd = A10188AlRFibOrd ;
         Z10189AlRFibPar = A10189AlRFibPar ;
         Z10190AlRFibPro = A10190AlRFibPro ;
         Z10191AlRFibTit = A10191AlRFibTit ;
         Z10192AlRFibTpo = A10192AlRFibTpo ;
         Z10193AlRFibCla = A10193AlRFibCla ;
         Z10194AlRFibCmp = A10194AlRFibCmp ;
         Z10195AlRFibFil = A10195AlRFibFil ;
         Z10196AlRFibObs = A10196AlRFibObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1761377( )
   {
   }

   public void standaloneModal1761377( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlRFibOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlRFibOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibOrd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtAlRFibOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlRFibOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibOrd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1761377( )
   {
      /* Using cursor T017620 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1377 = (short)(1) ;
         A10189AlRFibPar = T017620_A10189AlRFibPar[0] ;
         n10189AlRFibPar = T017620_n10189AlRFibPar[0] ;
         A10190AlRFibPro = T017620_A10190AlRFibPro[0] ;
         n10190AlRFibPro = T017620_n10190AlRFibPro[0] ;
         A10191AlRFibTit = T017620_A10191AlRFibTit[0] ;
         n10191AlRFibTit = T017620_n10191AlRFibTit[0] ;
         A10192AlRFibTpo = T017620_A10192AlRFibTpo[0] ;
         n10192AlRFibTpo = T017620_n10192AlRFibTpo[0] ;
         A10193AlRFibCla = T017620_A10193AlRFibCla[0] ;
         n10193AlRFibCla = T017620_n10193AlRFibCla[0] ;
         A10194AlRFibCmp = T017620_A10194AlRFibCmp[0] ;
         n10194AlRFibCmp = T017620_n10194AlRFibCmp[0] ;
         A10195AlRFibFil = T017620_A10195AlRFibFil[0] ;
         n10195AlRFibFil = T017620_n10195AlRFibFil[0] ;
         A10196AlRFibObs = T017620_A10196AlRFibObs[0] ;
         n10196AlRFibObs = T017620_n10196AlRFibObs[0] ;
         zm1761377( -5) ;
      }
      pr_default.close(18);
      onLoadActions1761377( ) ;
   }

   public void onLoadActions1761377( )
   {
   }

   public void checkExtendedTable1761377( )
   {
      nIsDirty_1377 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1761377( ) ;
   }

   public void closeExtendedTableCursors1761377( )
   {
   }

   public void enableDisable1761377( )
   {
   }

   public void getKey1761377( )
   {
      /* Using cursor T017621 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1377 = (short)(1) ;
      }
      else
      {
         RcdFound1377 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1761377( )
   {
      /* Using cursor T01763 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd)});
      if ( (pr_default.getStatus(1) != 101) && ( T01763_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01763_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) && ( GXutil.strcmp(T01763_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1761377( 5) ;
         RcdFound1377 = (short)(1) ;
         initializeNonKey1761377( ) ;
         A10188AlRFibOrd = T01763_A10188AlRFibOrd[0] ;
         A10189AlRFibPar = T01763_A10189AlRFibPar[0] ;
         n10189AlRFibPar = T01763_n10189AlRFibPar[0] ;
         A10190AlRFibPro = T01763_A10190AlRFibPro[0] ;
         n10190AlRFibPro = T01763_n10190AlRFibPro[0] ;
         A10191AlRFibTit = T01763_A10191AlRFibTit[0] ;
         n10191AlRFibTit = T01763_n10191AlRFibTit[0] ;
         A10192AlRFibTpo = T01763_A10192AlRFibTpo[0] ;
         n10192AlRFibTpo = T01763_n10192AlRFibTpo[0] ;
         A10193AlRFibCla = T01763_A10193AlRFibCla[0] ;
         n10193AlRFibCla = T01763_n10193AlRFibCla[0] ;
         A10194AlRFibCmp = T01763_A10194AlRFibCmp[0] ;
         n10194AlRFibCmp = T01763_n10194AlRFibCmp[0] ;
         A10195AlRFibFil = T01763_A10195AlRFibFil[0] ;
         n10195AlRFibFil = T01763_n10195AlRFibFil[0] ;
         A10196AlRFibObs = T01763_A10196AlRFibObs[0] ;
         n10196AlRFibObs = T01763_n10196AlRFibObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z10188AlRFibOrd = A10188AlRFibOrd ;
         sMode1377 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1761377( ) ;
         load1761377( ) ;
         Gx_mode = sMode1377 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1377 = (short)(0) ;
         initializeNonKey1761377( ) ;
         sMode1377 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1761377( ) ;
         Gx_mode = sMode1377 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1761377( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1761377( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01762 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAlrPiF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z10189AlRFibPar != T01762_A10189AlRFibPar[0] ) || ( GXutil.strcmp(Z10190AlRFibPro, T01762_A10190AlRFibPro[0]) != 0 ) || ( GXutil.strcmp(Z10191AlRFibTit, T01762_A10191AlRFibTit[0]) != 0 ) || ( GXutil.strcmp(Z10192AlRFibTpo, T01762_A10192AlRFibTpo[0]) != 0 ) || ( GXutil.strcmp(Z10193AlRFibCla, T01762_A10193AlRFibCla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10194AlRFibCmp, T01762_A10194AlRFibCmp[0]) != 0 ) || ( Z10195AlRFibFil != T01762_A10195AlRFibFil[0] ) || ( GXutil.strcmp(Z10196AlRFibObs, T01762_A10196AlRFibObs[0]) != 0 ) )
         {
            if ( Z10189AlRFibPar != T01762_A10189AlRFibPar[0] )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibPar");
               GXutil.writeLogRaw("Old: ",Z10189AlRFibPar);
               GXutil.writeLogRaw("Current: ",T01762_A10189AlRFibPar[0]);
            }
            if ( GXutil.strcmp(Z10190AlRFibPro, T01762_A10190AlRFibPro[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibPro");
               GXutil.writeLogRaw("Old: ",Z10190AlRFibPro);
               GXutil.writeLogRaw("Current: ",T01762_A10190AlRFibPro[0]);
            }
            if ( GXutil.strcmp(Z10191AlRFibTit, T01762_A10191AlRFibTit[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibTit");
               GXutil.writeLogRaw("Old: ",Z10191AlRFibTit);
               GXutil.writeLogRaw("Current: ",T01762_A10191AlRFibTit[0]);
            }
            if ( GXutil.strcmp(Z10192AlRFibTpo, T01762_A10192AlRFibTpo[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibTpo");
               GXutil.writeLogRaw("Old: ",Z10192AlRFibTpo);
               GXutil.writeLogRaw("Current: ",T01762_A10192AlRFibTpo[0]);
            }
            if ( GXutil.strcmp(Z10193AlRFibCla, T01762_A10193AlRFibCla[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibCla");
               GXutil.writeLogRaw("Old: ",Z10193AlRFibCla);
               GXutil.writeLogRaw("Current: ",T01762_A10193AlRFibCla[0]);
            }
            if ( GXutil.strcmp(Z10194AlRFibCmp, T01762_A10194AlRFibCmp[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibCmp");
               GXutil.writeLogRaw("Old: ",Z10194AlRFibCmp);
               GXutil.writeLogRaw("Current: ",T01762_A10194AlRFibCmp[0]);
            }
            if ( Z10195AlRFibFil != T01762_A10195AlRFibFil[0] )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibFil");
               GXutil.writeLogRaw("Old: ",Z10195AlRFibFil);
               GXutil.writeLogRaw("Current: ",T01762_A10195AlRFibFil[0]);
            }
            if ( GXutil.strcmp(Z10196AlRFibObs, T01762_A10196AlRFibObs[0]) != 0 )
            {
               GXutil.writeLogln("talrpif:[seudo value changed for attri]"+"AlRFibObs");
               GXutil.writeLogRaw("Old: ",Z10196AlRFibObs);
               GXutil.writeLogRaw("Current: ",T01762_A10196AlRFibObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPAlrPiF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1761377( )
   {
      beforeValidate1761377( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1761377( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1761377( 0) ;
         checkOptimisticConcurrency1761377( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1761377( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1761377( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017622 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd), Boolean.valueOf(n10189AlRFibPar), Long.valueOf(A10189AlRFibPar), Boolean.valueOf(n10190AlRFibPro), A10190AlRFibPro, Boolean.valueOf(n10191AlRFibTit), A10191AlRFibTit, Boolean.valueOf(n10192AlRFibTpo), A10192AlRFibTpo, Boolean.valueOf(n10193AlRFibCla), A10193AlRFibCla, Boolean.valueOf(n10194AlRFibCmp), A10194AlRFibCmp, Boolean.valueOf(n10195AlRFibFil), Integer.valueOf(A10195AlRFibFil), Boolean.valueOf(n10196AlRFibObs), A10196AlRFibObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlrPiF");
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
            load1761377( ) ;
         }
         endLevel1761377( ) ;
      }
      closeExtendedTableCursors1761377( ) ;
   }

   public void update1761377( )
   {
      beforeValidate1761377( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1761377( ) ;
      }
      if ( ( nIsMod_1377 != 0 ) || ( nIsDirty_1377 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1761377( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1761377( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1761377( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017623 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n10189AlRFibPar), Long.valueOf(A10189AlRFibPar), Boolean.valueOf(n10190AlRFibPro), A10190AlRFibPro, Boolean.valueOf(n10191AlRFibTit), A10191AlRFibTit, Boolean.valueOf(n10192AlRFibTpo), A10192AlRFibTpo, Boolean.valueOf(n10193AlRFibCla), A10193AlRFibCla, Boolean.valueOf(n10194AlRFibCmp), A10194AlRFibCmp, Boolean.valueOf(n10195AlRFibFil), Integer.valueOf(A10195AlRFibFil), Boolean.valueOf(n10196AlRFibObs), A10196AlRFibObs, A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlrPiF");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPAlrPiF"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1761377( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1761377( ) ;
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
            endLevel1761377( ) ;
         }
      }
      closeExtendedTableCursors1761377( ) ;
   }

   public void deferredUpdate1761377( )
   {
   }

   public void delete1761377( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1761377( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1761377( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1761377( ) ;
         afterConfirm1761377( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1761377( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017624 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Integer.valueOf(A10188AlRFibOrd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPAlrPiF");
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
      sMode1377 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1761377( ) ;
      Gx_mode = sMode1377 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1761377( )
   {
      standaloneModal1761377( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1761377( )
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

   public void scanStart1761377( )
   {
      /* Scan By routine */
      /* Using cursor T017625 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      RcdFound1377 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1377 = (short)(1) ;
         A10188AlRFibOrd = T017625_A10188AlRFibOrd[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1761377( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1377 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1377 = (short)(1) ;
         A10188AlRFibOrd = T017625_A10188AlRFibOrd[0] ;
      }
   }

   public void scanEnd1761377( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1761377( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1761377( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1761377( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1761377( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1761377( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1761377( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1761377( )
   {
      edtAlRFibOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibOrd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibPar_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibPro_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibTit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibTit_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibTpo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibCla_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibCmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibCmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibCmp_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibFil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibFil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibFil_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtAlRFibObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibObs_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1761377( )
   {
   }

   public void send_integrity_lvl_hashes176299( )
   {
   }

   public void subsflControlProps_401377( )
   {
      edtavnRcdDeleted_1377_Internalname = "vNRCDDELETED_1377_"+sGXsfl_40_idx ;
      edtAlRFibOrd_Internalname = "ALRFIBORD_"+sGXsfl_40_idx ;
      edtAlRFibPar_Internalname = "ALRFIBPAR_"+sGXsfl_40_idx ;
      edtAlRFibPro_Internalname = "ALRFIBPRO_"+sGXsfl_40_idx ;
      edtAlRFibTit_Internalname = "ALRFIBTIT_"+sGXsfl_40_idx ;
      edtAlRFibTpo_Internalname = "ALRFIBTPO_"+sGXsfl_40_idx ;
      edtAlRFibCla_Internalname = "ALRFIBCLA_"+sGXsfl_40_idx ;
      edtAlRFibCmp_Internalname = "ALRFIBCMP_"+sGXsfl_40_idx ;
      edtAlRFibFil_Internalname = "ALRFIBFIL_"+sGXsfl_40_idx ;
      edtAlRFibObs_Internalname = "ALRFIBOBS_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401377( )
   {
      edtavnRcdDeleted_1377_Internalname = "vNRCDDELETED_1377_"+sGXsfl_40_fel_idx ;
      edtAlRFibOrd_Internalname = "ALRFIBORD_"+sGXsfl_40_fel_idx ;
      edtAlRFibPar_Internalname = "ALRFIBPAR_"+sGXsfl_40_fel_idx ;
      edtAlRFibPro_Internalname = "ALRFIBPRO_"+sGXsfl_40_fel_idx ;
      edtAlRFibTit_Internalname = "ALRFIBTIT_"+sGXsfl_40_fel_idx ;
      edtAlRFibTpo_Internalname = "ALRFIBTPO_"+sGXsfl_40_fel_idx ;
      edtAlRFibCla_Internalname = "ALRFIBCLA_"+sGXsfl_40_fel_idx ;
      edtAlRFibCmp_Internalname = "ALRFIBCMP_"+sGXsfl_40_fel_idx ;
      edtAlRFibFil_Internalname = "ALRFIBFIL_"+sGXsfl_40_fel_idx ;
      edtAlRFibObs_Internalname = "ALRFIBOBS_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1761377( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401377( ) ;
      sendRow1761377( ) ;
   }

   public void sendRow1761377( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1377_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1377_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1377), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1377), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1377_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1377_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A10188AlRFibOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10188AlRFibOrd), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibPar_Internalname,GXutil.ltrim( localUtil.ntoc( A10189AlRFibPar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRFibPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10189AlRFibPar), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10189AlRFibPar), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibPro_Internalname,GXutil.rtrim( A10190AlRFibPro),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibTit_Internalname,GXutil.rtrim( A10191AlRFibTit),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibTit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibTit_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibTpo_Internalname,GXutil.rtrim( A10192AlRFibTpo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibTpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibTpo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibCla_Internalname,GXutil.rtrim( A10193AlRFibCla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibCmp_Internalname,GXutil.rtrim( A10194AlRFibCmp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibCmp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibCmp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibFil_Internalname,GXutil.ltrim( localUtil.ntoc( A10195AlRFibFil, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlRFibFil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10195AlRFibFil), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10195AlRFibFil), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibFil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibFil_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1377_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlRFibObs_Internalname,GXutil.rtrim( A10196AlRFibObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlRFibObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlRFibObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1761377( ) ;
      GXCCtl = "Z10188AlRFibOrd_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10188AlRFibOrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10189AlRFibPar_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10189AlRFibPar, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10190AlRFibPro_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10190AlRFibPro));
      GXCCtl = "Z10191AlRFibTit_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10191AlRFibTit));
      GXCCtl = "Z10192AlRFibTpo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10192AlRFibTpo));
      GXCCtl = "Z10193AlRFibCla_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10193AlRFibCla));
      GXCCtl = "Z10194AlRFibCmp_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10194AlRFibCmp));
      GXCCtl = "Z10195AlRFibFil_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10195AlRFibFil, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10196AlRFibObs_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10196AlRFibObs));
      GXCCtl = "nRcdDeleted_1377_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1377_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1377_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1377, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1377_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1377_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBORD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBPAR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBPRO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBTIT_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBTPO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBCLA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBCMP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBFIL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibFil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRFIBOBS_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1761377( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401377( ) ;
      edtavnRcdDeleted_1377_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1377_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBORD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBPAR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBPRO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibTit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBTIT_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibTpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBTPO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBCLA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibCmp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBCMP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibFil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBFIL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlRFibObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRFIBOBS_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1377_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1377_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1377");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1377_Internalname ;
         wbErr = true ;
         nRcdDeleted_1377 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1377 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1377_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlRFibOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlRFibOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ALRFIBORD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRFibOrd_Internalname ;
         wbErr = true ;
         A10188AlRFibOrd = 0 ;
      }
      else
      {
         A10188AlRFibOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRFibOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlRFibPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlRFibPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "ALRFIBPAR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRFibPar_Internalname ;
         wbErr = true ;
         A10189AlRFibPar = 0 ;
         n10189AlRFibPar = false ;
      }
      else
      {
         A10189AlRFibPar = localUtil.ctol( httpContext.cgiGet( edtAlRFibPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n10189AlRFibPar = false ;
      }
      A10190AlRFibPro = httpContext.cgiGet( edtAlRFibPro_Internalname) ;
      n10190AlRFibPro = false ;
      A10191AlRFibTit = httpContext.cgiGet( edtAlRFibTit_Internalname) ;
      n10191AlRFibTit = false ;
      A10192AlRFibTpo = httpContext.cgiGet( edtAlRFibTpo_Internalname) ;
      n10192AlRFibTpo = false ;
      A10193AlRFibCla = httpContext.cgiGet( edtAlRFibCla_Internalname) ;
      n10193AlRFibCla = false ;
      A10194AlRFibCmp = httpContext.cgiGet( edtAlRFibCmp_Internalname) ;
      n10194AlRFibCmp = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlRFibFil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlRFibFil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ALRFIBFIL_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlRFibFil_Internalname ;
         wbErr = true ;
         A10195AlRFibFil = 0 ;
         n10195AlRFibFil = false ;
      }
      else
      {
         A10195AlRFibFil = (int)(localUtil.ctol( httpContext.cgiGet( edtAlRFibFil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10195AlRFibFil = false ;
      }
      A10196AlRFibObs = httpContext.cgiGet( edtAlRFibObs_Internalname) ;
      n10196AlRFibObs = false ;
      GXCCtl = "Z10188AlRFibOrd_" + sGXsfl_40_idx ;
      Z10188AlRFibOrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10189AlRFibPar_" + sGXsfl_40_idx ;
      Z10189AlRFibPar = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z10190AlRFibPro_" + sGXsfl_40_idx ;
      Z10190AlRFibPro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10191AlRFibTit_" + sGXsfl_40_idx ;
      Z10191AlRFibTit = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10192AlRFibTpo_" + sGXsfl_40_idx ;
      Z10192AlRFibTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10193AlRFibCla_" + sGXsfl_40_idx ;
      Z10193AlRFibCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10194AlRFibCmp_" + sGXsfl_40_idx ;
      Z10194AlRFibCmp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10195AlRFibFil_" + sGXsfl_40_idx ;
      Z10195AlRFibFil = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10196AlRFibObs_" + sGXsfl_40_idx ;
      Z10196AlRFibObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1377_" + sGXsfl_40_idx ;
      nRcdDeleted_1377 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1377_" + sGXsfl_40_idx ;
      nRcdExists_1377 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1377_" + sGXsfl_40_idx ;
      nIsMod_1377 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlRFibOrd_Enabled = edtAlRFibOrd_Enabled ;
   }

   public void confirmValues1760( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401377( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401377( ) ;
         httpContext.changePostValue( "Z10188AlRFibOrd_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10188AlRFibOrd_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10188AlRFibOrd_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10189AlRFibPar_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10189AlRFibPar_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10189AlRFibPar_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10190AlRFibPro_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10190AlRFibPro_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10190AlRFibPro_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10191AlRFibTit_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10191AlRFibTit_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10191AlRFibTit_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10192AlRFibTpo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10192AlRFibTpo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10192AlRFibTpo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10193AlRFibCla_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10193AlRFibCla_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10193AlRFibCla_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10194AlRFibCmp_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10194AlRFibCmp_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10194AlRFibCmp_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10195AlRFibFil_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10195AlRFibFil_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10195AlRFibFil_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10196AlRFibObs_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10196AlRFibObs_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10196AlRFibObs_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talrpif", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A2159AlbRecPie))}, new String[] {"EmprCod","AlbRecCod","AlbRecPie"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TAlrPiF");
      forbiddenHiddens.add("AlRPieCal", GXutil.rtrim( localUtil.format( A4795AlRPieCal, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talrpif:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2159AlbRecPie", GXutil.rtrim( Z2159AlbRecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4795AlRPieCal", GXutil.rtrim( Z4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
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
      return formatLink("app.talrpif", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A2159AlbRecPie))}, new String[] {"EmprCod","AlbRecCod","AlbRecPie"})  ;
   }

   public String getPgmname( )
   {
      return "TAlrPiF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fibras de las Piezas", "") ;
   }

   public void initializeNonKey176299( )
   {
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      Z4795AlRPieCal = "" ;
   }

   public void initAll176299( )
   {
      initializeNonKey176299( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1761377( )
   {
      A10189AlRFibPar = 0 ;
      n10189AlRFibPar = false ;
      A10190AlRFibPro = "" ;
      n10190AlRFibPro = false ;
      A10191AlRFibTit = "" ;
      n10191AlRFibTit = false ;
      A10192AlRFibTpo = "" ;
      n10192AlRFibTpo = false ;
      A10193AlRFibCla = "" ;
      n10193AlRFibCla = false ;
      A10194AlRFibCmp = "" ;
      n10194AlRFibCmp = false ;
      A10195AlRFibFil = 0 ;
      n10195AlRFibFil = false ;
      A10196AlRFibObs = "" ;
      n10196AlRFibObs = false ;
      Z10189AlRFibPar = 0 ;
      Z10190AlRFibPro = "" ;
      Z10191AlRFibTit = "" ;
      Z10192AlRFibTpo = "" ;
      Z10193AlRFibCla = "" ;
      Z10194AlRFibCmp = "" ;
      Z10195AlRFibFil = 0 ;
      Z10196AlRFibObs = "" ;
   }

   public void initAll1761377( )
   {
      A10188AlRFibOrd = 0 ;
      initializeNonKey1761377( ) ;
   }

   public void standaloneModalInsert1761377( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241551041", true, true);
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
      httpContext.AddJavascriptSource("talrpif.js", "?20268241551041", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1377( )
   {
      edtAlRFibOrd_Enabled = defedtAlRFibOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlRFibOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlRFibOrd_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1377, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1377_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10188AlRFibOrd, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10189AlRFibPar, (byte)(10), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10190AlRFibPro));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10191AlRFibTit));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10192AlRFibTpo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibTpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10193AlRFibCla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10194AlRFibCmp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibCmp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10195AlRFibFil, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibFil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10196AlRFibObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlRFibObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1377_Internalname = "vNRCDDELETED_1377" ;
      edtAlRFibOrd_Internalname = "ALRFIBORD" ;
      edtAlRFibPar_Internalname = "ALRFIBPAR" ;
      edtAlRFibPro_Internalname = "ALRFIBPRO" ;
      edtAlRFibTit_Internalname = "ALRFIBTIT" ;
      edtAlRFibTpo_Internalname = "ALRFIBTPO" ;
      edtAlRFibCla_Internalname = "ALRFIBCLA" ;
      edtAlRFibCmp_Internalname = "ALRFIBCMP" ;
      edtAlRFibFil_Internalname = "ALRFIBFIL" ;
      edtAlRFibObs_Internalname = "ALRFIBOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Fibras de las Piezas", "") );
      edtAlRFibObs_Jsonclick = "" ;
      edtAlRFibFil_Jsonclick = "" ;
      edtAlRFibCmp_Jsonclick = "" ;
      edtAlRFibCla_Jsonclick = "" ;
      edtAlRFibTpo_Jsonclick = "" ;
      edtAlRFibTit_Jsonclick = "" ;
      edtAlRFibPro_Jsonclick = "" ;
      edtAlRFibPar_Jsonclick = "" ;
      edtAlRFibOrd_Jsonclick = "" ;
      edtavnRcdDeleted_1377_Jsonclick = "" ;
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
      edtAlRFibObs_Enabled = 1 ;
      edtAlRFibFil_Enabled = 1 ;
      edtAlRFibCmp_Enabled = 1 ;
      edtAlRFibCla_Enabled = 1 ;
      edtAlRFibTpo_Enabled = 1 ;
      edtAlRFibTit_Enabled = 1 ;
      edtAlRFibPro_Enabled = 1 ;
      edtAlRFibPar_Enabled = 1 ;
      edtAlRFibOrd_Enabled = 1 ;
      edtavnRcdDeleted_1377_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecPie_Jsonclick = "" ;
      edtAlbRecPie_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecPie_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 0 ;
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
      subsflControlProps_401377( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1761377( ) ;
         standaloneModal1761377( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1761377( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401377( ) ;
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
      /* Using cursor T017626 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017626_A407EmprNom[0] ;
      n407EmprNom = T017626_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      /* Using cursor T017627 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
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

   public void valid_Albrecpie( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2159AlbRecPie", GXutil.rtrim( Z2159AlbRecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4795AlRPieCal", GXutil.rtrim( Z4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z2159AlbRecPie'},{av:'Z4795AlRPieCal'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALRFIBORD","{handler:'valid_Alrfibord',iparms:[]");
      setEventMetadata("VALID_ALRFIBORD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Alrfibobs',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA2159AlbRecPie = "" ;
      Z396EmprCod = "" ;
      Z2159AlbRecPie = "" ;
      Z4795AlRPieCal = "" ;
      Z10190AlRFibPro = "" ;
      Z10191AlRFibTit = "" ;
      Z10192AlRFibTpo = "" ;
      Z10193AlRFibCla = "" ;
      Z10194AlRFibCmp = "" ;
      Z10196AlRFibObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A2159AlbRecPie = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1377 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A4795AlRPieCal = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode299 = "" ;
      GXCCtl = "" ;
      A10190AlRFibPro = "" ;
      A10191AlRFibTit = "" ;
      A10192AlRFibTpo = "" ;
      A10193AlRFibCla = "" ;
      A10194AlRFibCmp = "" ;
      A10196AlRFibObs = "" ;
      Z407EmprNom = "" ;
      T01766_A407EmprNom = new String[] {""} ;
      T01766_n407EmprNom = new boolean[] {false} ;
      T01767_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      T01768_A4795AlRPieCal = new String[] {""} ;
      T01768_A2159AlbRecPie = new String[] {""} ;
      T01768_A407EmprNom = new String[] {""} ;
      T01768_n407EmprNom = new boolean[] {false} ;
      T01768_A396EmprCod = new String[] {""} ;
      T01768_A44AlbRecCod = new int[1] ;
      T01769_A396EmprCod = new String[] {""} ;
      T01769_A44AlbRecCod = new int[1] ;
      T01769_A2159AlbRecPie = new String[] {""} ;
      T01765_A4795AlRPieCal = new String[] {""} ;
      T01765_A2159AlbRecPie = new String[] {""} ;
      T01765_A396EmprCod = new String[] {""} ;
      T01765_A44AlbRecCod = new int[1] ;
      T017610_A396EmprCod = new String[] {""} ;
      T017610_A44AlbRecCod = new int[1] ;
      T017610_A2159AlbRecPie = new String[] {""} ;
      T017611_A396EmprCod = new String[] {""} ;
      T017611_A44AlbRecCod = new int[1] ;
      T017611_A2159AlbRecPie = new String[] {""} ;
      T01764_A4795AlRPieCal = new String[] {""} ;
      T01764_A2159AlbRecPie = new String[] {""} ;
      T01764_A396EmprCod = new String[] {""} ;
      T01764_A44AlbRecCod = new int[1] ;
      T017615_A396EmprCod = new String[] {""} ;
      T017615_A44AlbRecCod = new int[1] ;
      T017615_A2159AlbRecPie = new String[] {""} ;
      T017615_A9568CodHilz = new String[] {""} ;
      T017616_A396EmprCod = new String[] {""} ;
      T017616_A44AlbRecCod = new int[1] ;
      T017616_A2159AlbRecPie = new String[] {""} ;
      T017616_A7697AlREtiTpo = new byte[1] ;
      T017617_A396EmprCod = new String[] {""} ;
      T017617_A44AlbRecCod = new int[1] ;
      T017617_A2159AlbRecPie = new String[] {""} ;
      T017617_A5262AlbRecEvt = new short[1] ;
      T017618_A396EmprCod = new String[] {""} ;
      T017618_A44AlbRecCod = new int[1] ;
      T017618_A2159AlbRecPie = new String[] {""} ;
      T017618_A4395AlRDefCod = new short[1] ;
      T017618_A4412AlRFasCod = new String[] {""} ;
      T017619_A396EmprCod = new String[] {""} ;
      T017619_A44AlbRecCod = new int[1] ;
      T017619_A2159AlbRecPie = new String[] {""} ;
      T017620_A44AlbRecCod = new int[1] ;
      T017620_A2159AlbRecPie = new String[] {""} ;
      T017620_A10188AlRFibOrd = new int[1] ;
      T017620_A10189AlRFibPar = new long[1] ;
      T017620_n10189AlRFibPar = new boolean[] {false} ;
      T017620_A10190AlRFibPro = new String[] {""} ;
      T017620_n10190AlRFibPro = new boolean[] {false} ;
      T017620_A10191AlRFibTit = new String[] {""} ;
      T017620_n10191AlRFibTit = new boolean[] {false} ;
      T017620_A10192AlRFibTpo = new String[] {""} ;
      T017620_n10192AlRFibTpo = new boolean[] {false} ;
      T017620_A10193AlRFibCla = new String[] {""} ;
      T017620_n10193AlRFibCla = new boolean[] {false} ;
      T017620_A10194AlRFibCmp = new String[] {""} ;
      T017620_n10194AlRFibCmp = new boolean[] {false} ;
      T017620_A10195AlRFibFil = new int[1] ;
      T017620_n10195AlRFibFil = new boolean[] {false} ;
      T017620_A10196AlRFibObs = new String[] {""} ;
      T017620_n10196AlRFibObs = new boolean[] {false} ;
      T017620_A396EmprCod = new String[] {""} ;
      T017621_A396EmprCod = new String[] {""} ;
      T017621_A44AlbRecCod = new int[1] ;
      T017621_A2159AlbRecPie = new String[] {""} ;
      T017621_A10188AlRFibOrd = new int[1] ;
      T01763_A44AlbRecCod = new int[1] ;
      T01763_A2159AlbRecPie = new String[] {""} ;
      T01763_A10188AlRFibOrd = new int[1] ;
      T01763_A10189AlRFibPar = new long[1] ;
      T01763_n10189AlRFibPar = new boolean[] {false} ;
      T01763_A10190AlRFibPro = new String[] {""} ;
      T01763_n10190AlRFibPro = new boolean[] {false} ;
      T01763_A10191AlRFibTit = new String[] {""} ;
      T01763_n10191AlRFibTit = new boolean[] {false} ;
      T01763_A10192AlRFibTpo = new String[] {""} ;
      T01763_n10192AlRFibTpo = new boolean[] {false} ;
      T01763_A10193AlRFibCla = new String[] {""} ;
      T01763_n10193AlRFibCla = new boolean[] {false} ;
      T01763_A10194AlRFibCmp = new String[] {""} ;
      T01763_n10194AlRFibCmp = new boolean[] {false} ;
      T01763_A10195AlRFibFil = new int[1] ;
      T01763_n10195AlRFibFil = new boolean[] {false} ;
      T01763_A10196AlRFibObs = new String[] {""} ;
      T01763_n10196AlRFibObs = new boolean[] {false} ;
      T01763_A396EmprCod = new String[] {""} ;
      T01762_A44AlbRecCod = new int[1] ;
      T01762_A2159AlbRecPie = new String[] {""} ;
      T01762_A10188AlRFibOrd = new int[1] ;
      T01762_A10189AlRFibPar = new long[1] ;
      T01762_n10189AlRFibPar = new boolean[] {false} ;
      T01762_A10190AlRFibPro = new String[] {""} ;
      T01762_n10190AlRFibPro = new boolean[] {false} ;
      T01762_A10191AlRFibTit = new String[] {""} ;
      T01762_n10191AlRFibTit = new boolean[] {false} ;
      T01762_A10192AlRFibTpo = new String[] {""} ;
      T01762_n10192AlRFibTpo = new boolean[] {false} ;
      T01762_A10193AlRFibCla = new String[] {""} ;
      T01762_n10193AlRFibCla = new boolean[] {false} ;
      T01762_A10194AlRFibCmp = new String[] {""} ;
      T01762_n10194AlRFibCmp = new boolean[] {false} ;
      T01762_A10195AlRFibFil = new int[1] ;
      T01762_n10195AlRFibFil = new boolean[] {false} ;
      T01762_A10196AlRFibObs = new String[] {""} ;
      T01762_n10196AlRFibObs = new boolean[] {false} ;
      T01762_A396EmprCod = new String[] {""} ;
      T017625_A396EmprCod = new String[] {""} ;
      T017625_A44AlbRecCod = new int[1] ;
      T017625_A2159AlbRecPie = new String[] {""} ;
      T017625_A10188AlRFibOrd = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017626_A407EmprNom = new String[] {""} ;
      T017626_n407EmprNom = new boolean[] {false} ;
      T017627_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ2159AlbRecPie = "" ;
      ZZ4795AlRPieCal = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talrpif__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talrpif__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talrpif__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talrpif__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talrpif__default(),
         new Object[] {
             new Object[] {
            T01762_A44AlbRecCod, T01762_A2159AlbRecPie, T01762_A10188AlRFibOrd, T01762_A10189AlRFibPar, T01762_n10189AlRFibPar, T01762_A10190AlRFibPro, T01762_n10190AlRFibPro, T01762_A10191AlRFibTit, T01762_n10191AlRFibTit, T01762_A10192AlRFibTpo,
            T01762_n10192AlRFibTpo, T01762_A10193AlRFibCla, T01762_n10193AlRFibCla, T01762_A10194AlRFibCmp, T01762_n10194AlRFibCmp, T01762_A10195AlRFibFil, T01762_n10195AlRFibFil, T01762_A10196AlRFibObs, T01762_n10196AlRFibObs, T01762_A396EmprCod
            }
            , new Object[] {
            T01763_A44AlbRecCod, T01763_A2159AlbRecPie, T01763_A10188AlRFibOrd, T01763_A10189AlRFibPar, T01763_n10189AlRFibPar, T01763_A10190AlRFibPro, T01763_n10190AlRFibPro, T01763_A10191AlRFibTit, T01763_n10191AlRFibTit, T01763_A10192AlRFibTpo,
            T01763_n10192AlRFibTpo, T01763_A10193AlRFibCla, T01763_n10193AlRFibCla, T01763_A10194AlRFibCmp, T01763_n10194AlRFibCmp, T01763_A10195AlRFibFil, T01763_n10195AlRFibFil, T01763_A10196AlRFibObs, T01763_n10196AlRFibObs, T01763_A396EmprCod
            }
            , new Object[] {
            T01764_A4795AlRPieCal, T01764_A2159AlbRecPie, T01764_A396EmprCod, T01764_A44AlbRecCod
            }
            , new Object[] {
            T01765_A4795AlRPieCal, T01765_A2159AlbRecPie, T01765_A396EmprCod, T01765_A44AlbRecCod
            }
            , new Object[] {
            T01766_A407EmprNom, T01766_n407EmprNom
            }
            , new Object[] {
            T01767_A396EmprCod
            }
            , new Object[] {
            T01768_A4795AlRPieCal, T01768_A2159AlbRecPie, T01768_A407EmprNom, T01768_n407EmprNom, T01768_A396EmprCod, T01768_A44AlbRecCod
            }
            , new Object[] {
            T01769_A396EmprCod, T01769_A44AlbRecCod, T01769_A2159AlbRecPie
            }
            , new Object[] {
            T017610_A396EmprCod, T017610_A44AlbRecCod, T017610_A2159AlbRecPie
            }
            , new Object[] {
            T017611_A396EmprCod, T017611_A44AlbRecCod, T017611_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017615_A396EmprCod, T017615_A44AlbRecCod, T017615_A2159AlbRecPie, T017615_A9568CodHilz
            }
            , new Object[] {
            T017616_A396EmprCod, T017616_A44AlbRecCod, T017616_A2159AlbRecPie, T017616_A7697AlREtiTpo
            }
            , new Object[] {
            T017617_A396EmprCod, T017617_A44AlbRecCod, T017617_A2159AlbRecPie, T017617_A5262AlbRecEvt
            }
            , new Object[] {
            T017618_A396EmprCod, T017618_A44AlbRecCod, T017618_A2159AlbRecPie, T017618_A4395AlRDefCod, T017618_A4412AlRFasCod
            }
            , new Object[] {
            T017619_A396EmprCod, T017619_A44AlbRecCod, T017619_A2159AlbRecPie
            }
            , new Object[] {
            T017620_A44AlbRecCod, T017620_A2159AlbRecPie, T017620_A10188AlRFibOrd, T017620_A10189AlRFibPar, T017620_n10189AlRFibPar, T017620_A10190AlRFibPro, T017620_n10190AlRFibPro, T017620_A10191AlRFibTit, T017620_n10191AlRFibTit, T017620_A10192AlRFibTpo,
            T017620_n10192AlRFibTpo, T017620_A10193AlRFibCla, T017620_n10193AlRFibCla, T017620_A10194AlRFibCmp, T017620_n10194AlRFibCmp, T017620_A10195AlRFibFil, T017620_n10195AlRFibFil, T017620_A10196AlRFibObs, T017620_n10196AlRFibObs, T017620_A396EmprCod
            }
            , new Object[] {
            T017621_A396EmprCod, T017621_A44AlbRecCod, T017621_A2159AlbRecPie, T017621_A10188AlRFibOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017625_A396EmprCod, T017625_A44AlbRecCod, T017625_A2159AlbRecPie, T017625_A10188AlRFibOrd
            }
            , new Object[] {
            T017626_A407EmprNom, T017626_n407EmprNom
            }
            , new Object[] {
            T017627_A396EmprCod
            }
         }
      );
      Z2159AlbRecPie = "" ;
      A2159AlbRecPie = "" ;
      Z44AlbRecCod = 0 ;
      A44AlbRecCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
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
   private short nRcdDeleted_1377 ;
   private short nRcdExists_1377 ;
   private short nIsMod_1377 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1377 ;
   private short RcdFound1377 ;
   private short nBlankRcdUsr1377 ;
   private short RcdFound299 ;
   private short nIsDirty_299 ;
   private short nIsDirty_1377 ;
   private int wcpOA44AlbRecCod ;
   private int Z44AlbRecCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z10188AlRFibOrd ;
   private int Z10195AlRFibFil ;
   private int A44AlbRecCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRecPie_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1377_Enabled ;
   private int edtAlRFibOrd_Enabled ;
   private int edtAlRFibPar_Enabled ;
   private int edtAlRFibPro_Enabled ;
   private int edtAlRFibTit_Enabled ;
   private int edtAlRFibTpo_Enabled ;
   private int edtAlRFibCla_Enabled ;
   private int edtAlRFibCmp_Enabled ;
   private int edtAlRFibFil_Enabled ;
   private int edtAlRFibObs_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10188AlRFibOrd ;
   private int A10195AlRFibFil ;
   private int GX_JID ;
   private int GXv_int3[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlRFibOrd_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAlbRecPie_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ44AlbRecCod ;
   private long Z10189AlRFibPar ;
   private long GRID1_nFirstRecordOnPage ;
   private long A10189AlRFibPar ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA2159AlbRecPie ;
   private String Z396EmprCod ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String Z10190AlRFibPro ;
   private String Z10191AlRFibTit ;
   private String Z10192AlRFibTpo ;
   private String Z10193AlRFibCla ;
   private String Z10194AlRFibCmp ;
   private String Z10196AlRFibObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecPie_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1377 ;
   private String edtavnRcdDeleted_1377_Internalname ;
   private String edtAlRFibOrd_Internalname ;
   private String edtAlRFibPar_Internalname ;
   private String edtAlRFibPro_Internalname ;
   private String edtAlRFibTit_Internalname ;
   private String edtAlRFibTpo_Internalname ;
   private String edtAlRFibCla_Internalname ;
   private String edtAlRFibCmp_Internalname ;
   private String edtAlRFibFil_Internalname ;
   private String edtAlRFibObs_Internalname ;
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
   private String A4795AlRPieCal ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode299 ;
   private String GXCCtl ;
   private String A10190AlRFibPro ;
   private String A10191AlRFibTit ;
   private String A10192AlRFibTpo ;
   private String A10193AlRFibCla ;
   private String A10194AlRFibCmp ;
   private String A10196AlRFibObs ;
   private String Z407EmprNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1377_Jsonclick ;
   private String edtAlRFibOrd_Jsonclick ;
   private String edtAlRFibPar_Jsonclick ;
   private String edtAlRFibPro_Jsonclick ;
   private String edtAlRFibTit_Jsonclick ;
   private String edtAlRFibTpo_Jsonclick ;
   private String edtAlRFibCla_Jsonclick ;
   private String edtAlRFibCmp_Jsonclick ;
   private String edtAlRFibFil_Jsonclick ;
   private String edtAlRFibObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2159AlbRecPie ;
   private String ZZ4795AlRPieCal ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10189AlRFibPar ;
   private boolean n10190AlRFibPro ;
   private boolean n10191AlRFibTit ;
   private boolean n10192AlRFibTpo ;
   private boolean n10193AlRFibCla ;
   private boolean n10194AlRFibCmp ;
   private boolean n10195AlRFibFil ;
   private boolean n10196AlRFibObs ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01766_A407EmprNom ;
   private boolean[] T01766_n407EmprNom ;
   private String[] T01767_A396EmprCod ;
   private String[] T01768_A4795AlRPieCal ;
   private String[] T01768_A2159AlbRecPie ;
   private String[] T01768_A407EmprNom ;
   private boolean[] T01768_n407EmprNom ;
   private String[] T01768_A396EmprCod ;
   private int[] T01768_A44AlbRecCod ;
   private String[] T01769_A396EmprCod ;
   private int[] T01769_A44AlbRecCod ;
   private String[] T01769_A2159AlbRecPie ;
   private String[] T01765_A4795AlRPieCal ;
   private String[] T01765_A2159AlbRecPie ;
   private String[] T01765_A396EmprCod ;
   private int[] T01765_A44AlbRecCod ;
   private String[] T017610_A396EmprCod ;
   private int[] T017610_A44AlbRecCod ;
   private String[] T017610_A2159AlbRecPie ;
   private String[] T017611_A396EmprCod ;
   private int[] T017611_A44AlbRecCod ;
   private String[] T017611_A2159AlbRecPie ;
   private String[] T01764_A4795AlRPieCal ;
   private String[] T01764_A2159AlbRecPie ;
   private String[] T01764_A396EmprCod ;
   private int[] T01764_A44AlbRecCod ;
   private String[] T017615_A396EmprCod ;
   private int[] T017615_A44AlbRecCod ;
   private String[] T017615_A2159AlbRecPie ;
   private String[] T017615_A9568CodHilz ;
   private String[] T017616_A396EmprCod ;
   private int[] T017616_A44AlbRecCod ;
   private String[] T017616_A2159AlbRecPie ;
   private byte[] T017616_A7697AlREtiTpo ;
   private String[] T017617_A396EmprCod ;
   private int[] T017617_A44AlbRecCod ;
   private String[] T017617_A2159AlbRecPie ;
   private short[] T017617_A5262AlbRecEvt ;
   private String[] T017618_A396EmprCod ;
   private int[] T017618_A44AlbRecCod ;
   private String[] T017618_A2159AlbRecPie ;
   private short[] T017618_A4395AlRDefCod ;
   private String[] T017618_A4412AlRFasCod ;
   private String[] T017619_A396EmprCod ;
   private int[] T017619_A44AlbRecCod ;
   private String[] T017619_A2159AlbRecPie ;
   private int[] T017620_A44AlbRecCod ;
   private String[] T017620_A2159AlbRecPie ;
   private int[] T017620_A10188AlRFibOrd ;
   private long[] T017620_A10189AlRFibPar ;
   private boolean[] T017620_n10189AlRFibPar ;
   private String[] T017620_A10190AlRFibPro ;
   private boolean[] T017620_n10190AlRFibPro ;
   private String[] T017620_A10191AlRFibTit ;
   private boolean[] T017620_n10191AlRFibTit ;
   private String[] T017620_A10192AlRFibTpo ;
   private boolean[] T017620_n10192AlRFibTpo ;
   private String[] T017620_A10193AlRFibCla ;
   private boolean[] T017620_n10193AlRFibCla ;
   private String[] T017620_A10194AlRFibCmp ;
   private boolean[] T017620_n10194AlRFibCmp ;
   private int[] T017620_A10195AlRFibFil ;
   private boolean[] T017620_n10195AlRFibFil ;
   private String[] T017620_A10196AlRFibObs ;
   private boolean[] T017620_n10196AlRFibObs ;
   private String[] T017620_A396EmprCod ;
   private String[] T017621_A396EmprCod ;
   private int[] T017621_A44AlbRecCod ;
   private String[] T017621_A2159AlbRecPie ;
   private int[] T017621_A10188AlRFibOrd ;
   private int[] T01763_A44AlbRecCod ;
   private String[] T01763_A2159AlbRecPie ;
   private int[] T01763_A10188AlRFibOrd ;
   private long[] T01763_A10189AlRFibPar ;
   private boolean[] T01763_n10189AlRFibPar ;
   private String[] T01763_A10190AlRFibPro ;
   private boolean[] T01763_n10190AlRFibPro ;
   private String[] T01763_A10191AlRFibTit ;
   private boolean[] T01763_n10191AlRFibTit ;
   private String[] T01763_A10192AlRFibTpo ;
   private boolean[] T01763_n10192AlRFibTpo ;
   private String[] T01763_A10193AlRFibCla ;
   private boolean[] T01763_n10193AlRFibCla ;
   private String[] T01763_A10194AlRFibCmp ;
   private boolean[] T01763_n10194AlRFibCmp ;
   private int[] T01763_A10195AlRFibFil ;
   private boolean[] T01763_n10195AlRFibFil ;
   private String[] T01763_A10196AlRFibObs ;
   private boolean[] T01763_n10196AlRFibObs ;
   private String[] T01763_A396EmprCod ;
   private int[] T01762_A44AlbRecCod ;
   private String[] T01762_A2159AlbRecPie ;
   private int[] T01762_A10188AlRFibOrd ;
   private long[] T01762_A10189AlRFibPar ;
   private boolean[] T01762_n10189AlRFibPar ;
   private String[] T01762_A10190AlRFibPro ;
   private boolean[] T01762_n10190AlRFibPro ;
   private String[] T01762_A10191AlRFibTit ;
   private boolean[] T01762_n10191AlRFibTit ;
   private String[] T01762_A10192AlRFibTpo ;
   private boolean[] T01762_n10192AlRFibTpo ;
   private String[] T01762_A10193AlRFibCla ;
   private boolean[] T01762_n10193AlRFibCla ;
   private String[] T01762_A10194AlRFibCmp ;
   private boolean[] T01762_n10194AlRFibCmp ;
   private int[] T01762_A10195AlRFibFil ;
   private boolean[] T01762_n10195AlRFibFil ;
   private String[] T01762_A10196AlRFibObs ;
   private boolean[] T01762_n10196AlRFibObs ;
   private String[] T01762_A396EmprCod ;
   private String[] T017625_A396EmprCod ;
   private int[] T017625_A44AlbRecCod ;
   private String[] T017625_A2159AlbRecPie ;
   private int[] T017625_A10188AlRFibOrd ;
   private String[] T017626_A407EmprNom ;
   private boolean[] T017626_n407EmprNom ;
   private String[] T017627_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talrpif__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpif__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpif__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpif__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talrpif__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01762", "SELECT AlbRecCod, AlbRecPie, AlRFibOrd, AlRFibPar, AlRFibPro, AlRFibTit, AlRFibTpo, AlRFibCla, AlRFibCmp, AlRFibFil, AlRFibObs, EmprCod FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRFibOrd = ?  FOR UPDATE OF AlRFibPar, AlRFibPro, AlRFibTit, AlRFibTpo, AlRFibCla, AlRFibCmp, AlRFibFil, AlRFibObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01763", "SELECT AlbRecCod, AlbRecPie, AlRFibOrd, AlRFibPar, AlRFibPro, AlRFibTit, AlRFibTpo, AlRFibCla, AlRFibCmp, AlRFibFil, AlRFibObs, EmprCod FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRFibOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01764", "SELECT AlRPieCal, AlbRecPie, EmprCod, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlRPieCal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01765", "SELECT AlRPieCal, AlbRecPie, EmprCod, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01766", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01767", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01768", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlRPieCal, TM1.AlbRecPie, T2.EmprNom, TM1.EmprCod, TM1.AlbRecCod FROM (TXPALBDET TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.AlbRecPie = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod, TM1.AlbRecPie ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01769", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017610", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017611", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod DESC, AlbRecCod DESC, AlbRecPie DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017612", "INSERT INTO TXPALBDET(AlRPieCal, AlbRecPie, EmprCod, AlbRecCod, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRPieDefC, AlRExp1, AlRExp2, AlbRecFec, AlbRecPar, AlbRecCue, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, AlbPCont) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T017613", "UPDATE TXPALBDET SET AlRPieCal=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T017614", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T017615", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, CodHilz FROM TXPHILZPZ WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017616", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlREtiTpo FROM TXPAlRPi1 WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017617", "SELECT * FROM (SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017618", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017619", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017620", "SELECT AlbRecCod, AlbRecPie, AlRFibOrd, AlRFibPar, AlRFibPro, AlRFibTit, AlRFibTpo, AlRFibCla, AlRFibCmp, AlRFibFil, AlRFibObs, EmprCod FROM TXPAlrPiF WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? and AlRFibOrd = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017621", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRFibOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017622", "INSERT INTO TXPAlrPiF(AlbRecCod, AlbRecPie, AlRFibOrd, AlRFibPar, AlRFibPro, AlRFibTit, AlRFibTpo, AlRFibCla, AlRFibCmp, AlRFibFil, AlRFibObs, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPAlrPiF")
         ,new UpdateCursor("T017623", "UPDATE TXPAlrPiF SET AlRFibPar=?, AlRFibPro=?, AlRFibTit=?, AlRFibTpo=?, AlRFibCla=?, AlRFibCmp=?, AlRFibFil=?, AlRFibObs=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRFibOrd = ?", GX_NOMASK, "TXPAlrPiF")
         ,new UpdateCursor("T017624", "DELETE FROM TXPAlrPiF  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? AND AlRFibOrd = ?", GX_NOMASK, "TXPAlrPiF")
         ,new ForEachCursor("T017625", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017626", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017627", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 60);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 60);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 60);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 9);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 9);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[4]).longValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 20);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 60);
               }
               stmt.setString(12, (String)parms[19], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 60);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 9);
               stmt.setInt(12, ((Number) parms[19]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

