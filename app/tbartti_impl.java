package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbartti_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13905BarTraID = httpContext.GetPar( "BarTraID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A13905BarTraID) ;
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
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tratamientos", ""), (short)(0)) ;
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

   public tbartti_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbartti_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbartti_impl.class ));
   }

   public tbartti_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARTTI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARTTI.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
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
         nBlankRcdCount1877 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1877 = (short)(1) ;
            scanStart1RM1877( ) ;
            while ( RcdFound1877 != 0 )
            {
               init_level_properties1877( ) ;
               getByPrimaryKey1RM1877( ) ;
               addRow1RM1877( ) ;
               scanNext1RM1877( ) ;
            }
            scanEnd1RM1877( ) ;
            nBlankRcdCount1877 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1RM1877( ) ;
         standaloneModal1RM1877( ) ;
         sMode1877 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1RM1877( ) ;
            edtavnRcdDeleted_1877_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1877_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1877_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1877_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarTraID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRAID_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTraID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBarTraDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRADSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarTraDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1877 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RM1877( ) ;
            }
            sendRow1RM1877( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1877 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1877 = (short)(5) ;
         nRcdExists_1877 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1RM1877( ) ;
            while ( RcdFound1877 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451877( ) ;
               init_level_properties1877( ) ;
               standaloneNotModal1RM1877( ) ;
               getByPrimaryKey1RM1877( ) ;
               standaloneModal1RM1877( ) ;
               addRow1RM1877( ) ;
               scanNext1RM1877( ) ;
            }
            scanEnd1RM1877( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1877 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451877( ) ;
      initAll1RM1877( ) ;
      init_level_properties1877( ) ;
      nRcdExists_1877 = (short)(0) ;
      nIsMod_1877 = (short)(0) ;
      nRcdDeleted_1877 = (short)(0) ;
      nBlankRcdCount1877 = (short)(nBlankRcdUsr1877+nBlankRcdCount1877) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1877 > 0 )
      {
         standaloneNotModal1RM1877( ) ;
         standaloneModal1RM1877( ) ;
         addRow1RM1877( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarTraID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1877 = (short)(nBlankRcdCount1877-1) ;
      }
      Gx_mode = sMode1877 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARTTI.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARTTI.htm");
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         Z180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2759BarMaqGru = httpContext.cgiGet( "Z2759BarMaqGru") ;
         A180BarMaqCod = httpContext.cgiGet( "Z180BarMaqCod") ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A180BarMaqCod = httpContext.cgiGet( "BARMAQCOD") ;
         A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A365DisDes = httpContext.cgiGet( "DISDES") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         n396EmprCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TBARTTI");
         forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
         forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
         forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tbartti:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            n396EmprCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            n130BarCodPar = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
            initAll1RM12( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1877_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1877_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1RM12( ) ;
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

   public void confirm_1RM0( )
   {
      beforeValidate1RM12( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RM12( ) ;
         }
         else
         {
            checkExtendedTable1RM12( ) ;
            if ( AnyError == 0 )
            {
               zm1RM12( 3) ;
               zm1RM12( 4) ;
            }
            closeExtendedTableCursors1RM12( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode12 = Gx_mode ;
         confirm_1RM1877( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode12 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1RM0( ) ;
      }
   }

   public void confirm_1RM1877( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1RM1877( ) ;
         if ( ( nRcdExists_1877 != 0 ) || ( nIsMod_1877 != 0 ) )
         {
            getKey1RM1877( ) ;
            if ( ( nRcdExists_1877 == 0 ) && ( nRcdDeleted_1877 == 0 ) )
            {
               if ( RcdFound1877 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RM1877( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RM1877( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1RM1877( 6) ;
                     }
                     closeExtendedTableCursors1RM1877( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARTRAID_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarTraID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1877 != 0 )
               {
                  if ( nRcdDeleted_1877 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1RM1877( ) ;
                     load1RM1877( ) ;
                     beforeValidate1RM1877( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RM1877( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1877 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RM1877( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RM1877( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1RM1877( 6) ;
                           }
                           closeExtendedTableCursors1RM1877( ) ;
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
                  if ( nRcdDeleted_1877 == 0 )
                  {
                     GXCCtl = "BARTRAID_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarTraID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1877_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTraID_Internalname, GXutil.rtrim( A13905BarTraID)) ;
         httpContext.changePostValue( edtBarTraDsc_Internalname, GXutil.rtrim( A13906BarTraDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13905BarTraID_"+sGXsfl_45_idx, GXutil.rtrim( Z13905BarTraID)) ;
         httpContext.changePostValue( "nRcdDeleted_1877_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1877_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1877_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1877 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1877_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1877_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRAID_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRADSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RM0( )
   {
   }

   public void zm1RM12( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z361DisCod = T01RM6_A361DisCod[0] ;
            Z2759BarMaqGru = T01RM6_A2759BarMaqGru[0] ;
            Z180BarMaqCod = T01RM6_A180BarMaqCod[0] ;
            Z252CliCod = T01RM6_A252CliCod[0] ;
         }
         else
         {
            Z361DisCod = A361DisCod ;
            Z2759BarMaqGru = A2759BarMaqGru ;
            Z180BarMaqCod = A180BarMaqCod ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z361DisCod = A361DisCod ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z252CliCod = A252CliCod ;
         Z365DisDes = A365DisDes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01RM7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01RM7_A407EmprNom[0] ;
      n407EmprNom = T01RM7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
      /* Using cursor T01RM8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      A252CliCod = T01RM8_A252CliCod[0] ;
      n252CliCod = T01RM8_n252CliCod[0] ;
      A365DisDes = T01RM8_A365DisDes[0] ;
      pr_default.close(6);
      A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
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

   public void load1RM12( )
   {
      /* Using cursor T01RM9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A361DisCod = T01RM9_A361DisCod[0] ;
         A2759BarMaqGru = T01RM9_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01RM9_A180BarMaqCod[0] ;
         A407EmprNom = T01RM9_A407EmprNom[0] ;
         n407EmprNom = T01RM9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = T01RM9_A252CliCod[0] ;
         n252CliCod = T01RM9_n252CliCod[0] ;
         A252CliCod = T01RM9_A252CliCod[0] ;
         n252CliCod = T01RM9_n252CliCod[0] ;
         A365DisDes = T01RM9_A365DisDes[0] ;
         zm1RM12( -2) ;
      }
      pr_default.close(7);
      onLoadActions1RM12( ) ;
   }

   public void onLoadActions1RM12( )
   {
   }

   public void checkExtendedTable1RM12( )
   {
      nIsDirty_12 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1RM12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1RM12( )
   {
      /* Using cursor T01RM10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RM6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) && ( T01RM6_A129BarCod[0] == A129BarCod ) && ( T01RM6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01RM6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01RM6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1RM12( 2) ;
         RcdFound12 = (short)(1) ;
         A361DisCod = T01RM6_A361DisCod[0] ;
         A2759BarMaqGru = T01RM6_A2759BarMaqGru[0] ;
         A180BarMaqCod = T01RM6_A180BarMaqCod[0] ;
         A252CliCod = T01RM6_A252CliCod[0] ;
         n252CliCod = T01RM6_n252CliCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1RM12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey1RM12( ) ;
         }
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey1RM12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1RM12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T01RM11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01RM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RM11_A129BarCod[0] == A129BarCod ) && ( T01RM11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01RM11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01RM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RM11_A129BarCod[0] == A129BarCod ) && ( T01RM11_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01RM11_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T01RM12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01RM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RM12_A129BarCod[0] == A129BarCod ) && ( T01RM12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01RM12_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01RM12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RM12_A129BarCod[0] == A129BarCod ) && ( T01RM12_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01RM12_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RM12( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1RM12( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound12 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
               update1RM12( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1RM12( ) ;
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
                  insert1RM12( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      getKey1RM12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbartti");
   }

   public void insert_check( )
   {
      confirm_1RM0( ) ;
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
      if ( RcdFound12 == 0 )
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
      scanStart1RM12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1RM12( ) ;
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
      if ( RcdFound12 == 0 )
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
      if ( RcdFound12 == 0 )
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
      scanStart1RM12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext1RM12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1RM12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1RM12( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RM5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z361DisCod != T01RM5_A361DisCod[0] ) || ( GXutil.strcmp(Z2759BarMaqGru, T01RM5_A2759BarMaqGru[0]) != 0 ) || ( GXutil.strcmp(Z180BarMaqCod, T01RM5_A180BarMaqCod[0]) != 0 ) || ( Z252CliCod != T01RM5_A252CliCod[0] ) )
         {
            if ( Z361DisCod != T01RM5_A361DisCod[0] )
            {
               GXutil.writeLogln("tbartti:[seudo value changed for attri]"+"DisCod");
               GXutil.writeLogRaw("Old: ",Z361DisCod);
               GXutil.writeLogRaw("Current: ",T01RM5_A361DisCod[0]);
            }
            if ( GXutil.strcmp(Z2759BarMaqGru, T01RM5_A2759BarMaqGru[0]) != 0 )
            {
               GXutil.writeLogln("tbartti:[seudo value changed for attri]"+"BarMaqGru");
               GXutil.writeLogRaw("Old: ",Z2759BarMaqGru);
               GXutil.writeLogRaw("Current: ",T01RM5_A2759BarMaqGru[0]);
            }
            if ( GXutil.strcmp(Z180BarMaqCod, T01RM5_A180BarMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tbartti:[seudo value changed for attri]"+"BarMaqCod");
               GXutil.writeLogRaw("Old: ",Z180BarMaqCod);
               GXutil.writeLogRaw("Current: ",T01RM5_A180BarMaqCod[0]);
            }
            if ( Z252CliCod != T01RM5_A252CliCod[0] )
            {
               GXutil.writeLogln("tbartti:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01RM5_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARCAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RM12( )
   {
      beforeValidate1RM12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RM12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RM12( 0) ;
         checkOptimisticConcurrency1RM12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RM12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RM12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RM13 */
                  pr_default.execute(11, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A180BarMaqCod, Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RM12( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RM12( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RM0( ) ;
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
            load1RM12( ) ;
         }
         endLevel1RM12( ) ;
      }
      closeExtendedTableCursors1RM12( ) ;
   }

   public void update1RM12( )
   {
      beforeValidate1RM12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RM12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RM12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RM12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RM12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RM14 */
                  pr_default.execute(12, new Object[] {A365DisDes, Integer.valueOf(A361DisCod), A2759BarMaqGru, A180BarMaqCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARCAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RM12( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char1[0] = A396EmprCod ;
                     GXv_int2[0] = A129BarCod ;
                     GXv_int3[0] = A132BarCodReo ;
                     GXv_char4[0] = A130BarCodPar ;
                     new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
                     tbartti_impl.this.A396EmprCod = GXv_char1[0] ;
                     tbartti_impl.this.A129BarCod = GXv_int2[0] ;
                     tbartti_impl.this.A132BarCodReo = GXv_int3[0] ;
                     tbartti_impl.this.A130BarCodPar = GXv_char4[0] ;
                     updateTablesN11RM12( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RM12( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1RM0( ) ;
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
         endLevel1RM12( ) ;
      }
      closeExtendedTableCursors1RM12( ) ;
   }

   public void deferredUpdate1RM12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RM12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RM12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RM12( ) ;
         afterConfirm1RM12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RM12( ) ;
            if ( AnyError == 0 )
            {
               scanStart1RM1877( ) ;
               while ( RcdFound1877 != 0 )
               {
                  getByPrimaryKey1RM1877( ) ;
                  delete1RM1877( ) ;
                  scanNext1RM1877( ) ;
               }
               scanEnd1RM1877( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RM15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11RM12( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound12 == 0 )
                        {
                           initAll1RM12( ) ;
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
                        resetCaption1RM0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RM12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RM12( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01RM16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "M Recibido Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01RM17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cajas para Calipso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01RM18 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01RM19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01RM20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01RM21 */
         pr_default.execute(19, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01RM22 */
         pr_default.execute(20, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01RM23 */
         pr_default.execute(21, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01RM24 */
         pr_default.execute(22, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALJBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01RM25 */
         pr_default.execute(23, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01RM26 */
         pr_default.execute(24, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "tinagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01RM27 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "estagr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01RM28 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01RM29 */
         pr_default.execute(27, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01RM30 */
         pr_default.execute(28, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AUDITORIA PIEZAS HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01RM31 */
         pr_default.execute(29, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Ensayos de HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01RM32 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REFHDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01RM33 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ A SALIVA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01RM34 */
         pr_default.execute(32, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01RM35 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BarPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01RM36 */
         pr_default.execute(34, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01RM37 */
         pr_default.execute(35, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTSEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01RM38 */
         pr_default.execute(36, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Relación Lineas de Pedido/HDR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01RM39 */
         pr_default.execute(37, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Separación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01RM40 */
         pr_default.execute(38, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Orden de Grabado de Shablones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01RM41 */
         pr_default.execute(39, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRACA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01RM42 */
         pr_default.execute(40, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PalSalRx", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01RM43 */
         pr_default.execute(41, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01RM44 */
         pr_default.execute(42, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01RM45 */
         pr_default.execute(43, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOAMIZADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01RM46 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PEGADOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01RM47 */
         pr_default.execute(45, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01RM48 */
         pr_default.execute(46, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01RM49 */
         pr_default.execute(47, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01RM50 */
         pr_default.execute(48, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01RM51 */
         pr_default.execute(49, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01RM52 */
         pr_default.execute(50, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01RM53 */
         pr_default.execute(51, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01RM54 */
         pr_default.execute(52, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01RM55 */
         pr_default.execute(53, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01RM56 */
         pr_default.execute(54, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01RM57 */
         pr_default.execute(55, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01RM58 */
         pr_default.execute(56, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LREXHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01RM59 */
         pr_default.execute(57, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXMVH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01RM60 */
         pr_default.execute(58, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01RM61 */
         pr_default.execute(59, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPLATINLevel1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01RM62 */
         pr_default.execute(60, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01RM63 */
         pr_default.execute(61, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01RM64 */
         pr_default.execute(62, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01RM65 */
         pr_default.execute(63, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01RM66 */
         pr_default.execute(64, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01RM67 */
         pr_default.execute(65, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01RM68 */
         pr_default.execute(66, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01RM69 */
         pr_default.execute(67, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01RM70 */
         pr_default.execute(68, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01RM71 */
         pr_default.execute(69, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01RM72 */
         pr_default.execute(70, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01RM73 */
         pr_default.execute(71, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01RM74 */
         pr_default.execute(72, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01RM75 */
         pr_default.execute(73, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01RM76 */
         pr_default.execute(74, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01RM77 */
         pr_default.execute(75, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
      }
   }

   public void processNestedLevel1RM1877( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1RM1877( ) ;
         if ( ( nRcdExists_1877 != 0 ) || ( nIsMod_1877 != 0 ) )
         {
            standaloneNotModal1RM1877( ) ;
            getKey1RM1877( ) ;
            if ( ( nRcdExists_1877 == 0 ) && ( nRcdDeleted_1877 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RM1877( ) ;
            }
            else
            {
               if ( RcdFound1877 != 0 )
               {
                  if ( ( nRcdDeleted_1877 != 0 ) && ( nRcdExists_1877 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RM1877( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1877 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RM1877( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1877 == 0 )
                  {
                     GXCCtl = "BARTRAID_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarTraID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1877_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarTraID_Internalname, GXutil.rtrim( A13905BarTraID)) ;
         httpContext.changePostValue( edtBarTraDsc_Internalname, GXutil.rtrim( A13906BarTraDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z13905BarTraID_"+sGXsfl_45_idx, GXutil.rtrim( Z13905BarTraID)) ;
         httpContext.changePostValue( "nRcdDeleted_1877_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1877_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1877_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1877 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1877_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1877_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRAID_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARTRADSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RM1877( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1877 = (short)(0) ;
      nIsMod_1877 = (short)(0) ;
      nRcdDeleted_1877 = (short)(0) ;
   }

   public void processLevel1RM12( )
   {
      /* Save parent mode. */
      sMode12 = Gx_mode ;
      processNestedLevel1RM1877( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void updateTablesN11RM12( )
   {
      /* Using cursor T01RM78 */
      pr_default.execute(76, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
   }

   public void endLevel1RM12( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RM12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbartti");
         if ( AnyError == 0 )
         {
            confirmValues1RM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbartti");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RM12( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A129BarCod = A129BarCod ;
      this.A132BarCodReo = A132BarCodReo ;
      this.A130BarCodPar = A130BarCodPar ;
      /* Scan By routine */
      /* Using cursor T01RM79 */
      pr_default.execute(77, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RM12( )
   {
      /* Scan next routine */
      pr_default.readNext(77);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
   }

   public void scanEnd1RM12( )
   {
      pr_default.close(77);
   }

   public void afterConfirm1RM12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RM12( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RM12( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RM12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RM12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RM12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RM12( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
   }

   public void zm1RM1877( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -5 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z396EmprCod = A396EmprCod ;
         Z13905BarTraID = A13905BarTraID ;
         Z13906BarTraDsc = A13906BarTraDsc ;
      }
   }

   public void standaloneNotModal1RM1877( )
   {
   }

   public void standaloneModal1RM1877( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarTraID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarTraID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtBarTraID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarTraID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1RM1877( )
   {
      /* Using cursor T01RM80 */
      pr_default.execute(78, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A13905BarTraID});
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound1877 = (short)(1) ;
         A13906BarTraDsc = T01RM80_A13906BarTraDsc[0] ;
         n13906BarTraDsc = T01RM80_n13906BarTraDsc[0] ;
         zm1RM1877( -5) ;
      }
      pr_default.close(78);
      onLoadActions1RM1877( ) ;
   }

   public void onLoadActions1RM1877( )
   {
   }

   public void checkExtendedTable1RM1877( )
   {
      nIsDirty_1877 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1RM1877( ) ;
      /* Using cursor T01RM4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A13905BarTraID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "BARTRAID_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tratamientos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTraID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13906BarTraDsc = T01RM4_A13906BarTraDsc[0] ;
      n13906BarTraDsc = T01RM4_n13906BarTraDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1RM1877( )
   {
      pr_default.close(2);
   }

   public void enableDisable1RM1877( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A13905BarTraID )
   {
      /* Using cursor T01RM81 */
      pr_default.execute(79, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A13905BarTraID});
      if ( (pr_default.getStatus(79) == 101) )
      {
         GXCCtl = "BARTRAID_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tratamientos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTraID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13906BarTraDsc = T01RM81_A13906BarTraDsc[0] ;
      n13906BarTraDsc = T01RM81_n13906BarTraDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13906BarTraDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(79) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(79);
   }

   public void getKey1RM1877( )
   {
      /* Using cursor T01RM82 */
      pr_default.execute(80, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A13905BarTraID});
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound1877 = (short)(1) ;
      }
      else
      {
         RcdFound1877 = (short)(0) ;
      }
      pr_default.close(80);
   }

   public void getByPrimaryKey1RM1877( )
   {
      /* Using cursor T01RM3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A13905BarTraID});
      if ( (pr_default.getStatus(1) != 101) && ( T01RM3_A129BarCod[0] == A129BarCod ) && ( T01RM3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01RM3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T01RM3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1RM1877( 5) ;
         RcdFound1877 = (short)(1) ;
         initializeNonKey1RM1877( ) ;
         A13905BarTraID = T01RM3_A13905BarTraID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z13905BarTraID = A13905BarTraID ;
         sMode1877 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RM1877( ) ;
         load1RM1877( ) ;
         Gx_mode = sMode1877 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1877 = (short)(0) ;
         initializeNonKey1RM1877( ) ;
         sMode1877 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RM1877( ) ;
         Gx_mode = sMode1877 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RM1877( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RM1877( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RM2 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A13905BarTraID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARTTI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARTTI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RM1877( )
   {
      beforeValidate1RM1877( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RM1877( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RM1877( 0) ;
         checkOptimisticConcurrency1RM1877( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RM1877( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RM1877( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RM83 */
                  pr_default.execute(81, new Object[] {Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n396EmprCod), A396EmprCod, A13905BarTraID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTTI");
                  if ( (pr_default.getStatus(81) == 1) )
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
            load1RM1877( ) ;
         }
         endLevel1RM1877( ) ;
      }
      closeExtendedTableCursors1RM1877( ) ;
   }

   public void update1RM1877( )
   {
      beforeValidate1RM1877( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RM1877( ) ;
      }
      if ( ( nIsMod_1877 != 0 ) || ( nIsDirty_1877 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RM1877( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RM1877( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RM1877( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPBARTTI */
                     deferredUpdate1RM1877( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int3[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.txpbarcadupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1) ;
                        tbartti_impl.this.A396EmprCod = GXv_char4[0] ;
                        tbartti_impl.this.A129BarCod = GXv_int2[0] ;
                        tbartti_impl.this.A132BarCodReo = GXv_int3[0] ;
                        tbartti_impl.this.A130BarCodPar = GXv_char1[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RM1877( ) ;
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
            endLevel1RM1877( ) ;
         }
      }
      closeExtendedTableCursors1RM1877( ) ;
   }

   public void deferredUpdate1RM1877( )
   {
   }

   public void delete1RM1877( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RM1877( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RM1877( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RM1877( ) ;
         afterConfirm1RM1877( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RM1877( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RM84 */
               pr_default.execute(82, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A13905BarTraID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTTI");
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
      sMode1877 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RM1877( ) ;
      Gx_mode = sMode1877 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RM1877( )
   {
      standaloneModal1RM1877( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01RM85 */
         pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A13905BarTraID});
         A13906BarTraDsc = T01RM85_A13906BarTraDsc[0] ;
         n13906BarTraDsc = T01RM85_n13906BarTraDsc[0] ;
         pr_default.close(83);
      }
   }

   public void endLevel1RM1877( )
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

   public void scanStart1RM1877( )
   {
      /* Scan By routine */
      /* Using cursor T01RM86 */
      pr_default.execute(84, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      RcdFound1877 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound1877 = (short)(1) ;
         A13905BarTraID = T01RM86_A13905BarTraID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RM1877( )
   {
      /* Scan next routine */
      pr_default.readNext(84);
      RcdFound1877 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound1877 = (short)(1) ;
         A13905BarTraID = T01RM86_A13905BarTraID[0] ;
      }
   }

   public void scanEnd1RM1877( )
   {
      pr_default.close(84);
   }

   public void afterConfirm1RM1877( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RM1877( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RM1877( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RM1877( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RM1877( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RM1877( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RM1877( )
   {
      edtBarTraID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTraID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBarTraDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTraDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraDsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1RM1877( )
   {
   }

   public void send_integrity_lvl_hashes1RM12( )
   {
   }

   public void subsflControlProps_451877( )
   {
      edtavnRcdDeleted_1877_Internalname = "vNRCDDELETED_1877_"+sGXsfl_45_idx ;
      edtBarTraID_Internalname = "BARTRAID_"+sGXsfl_45_idx ;
      edtBarTraDsc_Internalname = "BARTRADSC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451877( )
   {
      edtavnRcdDeleted_1877_Internalname = "vNRCDDELETED_1877_"+sGXsfl_45_fel_idx ;
      edtBarTraID_Internalname = "BARTRAID_"+sGXsfl_45_fel_idx ;
      edtBarTraDsc_Internalname = "BARTRADSC_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1RM1877( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451877( ) ;
      sendRow1RM1877( ) ;
   }

   public void sendRow1RM1877( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1877_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1877_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1877_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1877), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1877), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1877_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1877_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1877_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTraID_Internalname,GXutil.rtrim( A13905BarTraID),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTraID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTraID_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTraDsc_Internalname,GXutil.rtrim( A13906BarTraDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTraDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarTraDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1RM1877( ) ;
      GXCCtl = "Z13905BarTraID_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13905BarTraID));
      GXCCtl = "nRcdDeleted_1877_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1877_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1877_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1877, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1877_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1877_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRAID_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTRADSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1RM1877( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451877( ) ;
      edtavnRcdDeleted_1877_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1877_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTraID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRAID_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarTraDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARTRADSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1877_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1877_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1877");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1877_Internalname ;
         wbErr = true ;
         nRcdDeleted_1877 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1877 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1877_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13905BarTraID = httpContext.cgiGet( edtBarTraID_Internalname) ;
      A13906BarTraDsc = httpContext.cgiGet( edtBarTraDsc_Internalname) ;
      n13906BarTraDsc = false ;
      GXCCtl = "Z13905BarTraID_" + sGXsfl_45_idx ;
      Z13905BarTraID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1877_" + sGXsfl_45_idx ;
      nRcdDeleted_1877 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1877_" + sGXsfl_45_idx ;
      nRcdExists_1877 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1877_" + sGXsfl_45_idx ;
      nIsMod_1877 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarTraID_Enabled = edtBarTraID_Enabled ;
   }

   public void confirmValues1RM0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451877( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451877( ) ;
         httpContext.changePostValue( "Z13905BarTraID_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13905BarTraID_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13905BarTraID_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbartti", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARTTI");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarMaqGru", GXutil.rtrim( localUtil.format( A2759BarMaqGru, "")));
      forbiddenHiddens.add("BarMaqCod", GXutil.rtrim( localUtil.format( A180BarMaqCod, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbartti:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
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
      return formatLink("app.tbartti", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TBARTTI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tratamientos", "") ;
   }

   public void initializeNonKey1RM12( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A2759BarMaqGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", A2759BarMaqGru);
      A180BarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      Z361DisCod = 0 ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1RM12( )
   {
      initializeNonKey1RM12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RM1877( )
   {
      A13906BarTraDsc = "" ;
      n13906BarTraDsc = false ;
   }

   public void initAll1RM1877( )
   {
      A13905BarTraID = "" ;
      initializeNonKey1RM1877( ) ;
   }

   public void standaloneModalInsert1RM1877( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415115699", true, true);
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
      httpContext.AddJavascriptSource("tbartti.js", "?202682415115699", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1877( )
   {
      edtBarTraID_Enabled = defedtBarTraID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTraID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTraID_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1877, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1877_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13905BarTraID));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13906BarTraDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarTraDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1877_Internalname = "vNRCDDELETED_1877" ;
      edtBarTraID_Internalname = "BARTRAID" ;
      edtBarTraDsc_Internalname = "BARTRADSC" ;
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
      Form.setCaption( httpContext.getMessage( "Tratamientos", "") );
      edtBarTraDsc_Jsonclick = "" ;
      edtBarTraID_Jsonclick = "" ;
      edtavnRcdDeleted_1877_Jsonclick = "" ;
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
      edtBarTraDsc_Enabled = 0 ;
      edtBarTraID_Enabled = 1 ;
      edtavnRcdDeleted_1877_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 0 ;
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
      subsflControlProps_451877( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RM1877( ) ;
         standaloneModal1RM1877( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RM1877( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451877( ) ;
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
      /* Using cursor T01RM87 */
      pr_default.execute(85, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(85) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01RM87_A407EmprNom[0] ;
      n407EmprNom = T01RM87_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(85);
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

   public void valid_Barcodpar( )
   {
      n396EmprCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2759BarMaqGru", GXutil.rtrim( A2759BarMaqGru));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", GXutil.rtrim( A180BarMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2759BarMaqGru", GXutil.rtrim( Z2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z180BarMaqCod", GXutil.rtrim( Z180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bartraid( )
   {
      n396EmprCod = false ;
      n13906BarTraDsc = false ;
      /* Using cursor T01RM85 */
      pr_default.execute(83, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod, A13905BarTraID});
      if ( (pr_default.getStatus(83) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tratamientos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARTRAID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarTraID_Internalname ;
      }
      A13906BarTraDsc = T01RM85_A13906BarTraDsc[0] ;
      n13906BarTraDsc = T01RM85_n13906BarTraDsc[0] ;
      pr_default.close(83);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13906BarTraDsc", GXutil.rtrim( A13906BarTraDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A2759BarMaqGru',fld:'BARMAQGRU',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z361DisCod'},{av:'Z2759BarMaqGru'},{av:'Z180BarMaqCod'},{av:'Z407EmprNom'},{av:'Z252CliCod'},{av:'Z365DisDes'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARTRAID","{handler:'valid_Bartraid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13905BarTraID',fld:'BARTRAID',pic:''},{av:'A13906BarTraDsc',fld:'BARTRADSC',pic:''}]");
      setEventMetadata("VALID_BARTRAID",",oparms:[{av:'A13906BarTraDsc',fld:'BARTRADSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Bartradsc',iparms:[]");
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
      pr_default.close(83);
      pr_default.close(85);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z2759BarMaqGru = "" ;
      Z180BarMaqCod = "" ;
      Z13905BarTraID = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13905BarTraID = "" ;
      A130BarCodPar = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1877 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A2759BarMaqGru = "" ;
      A180BarMaqCod = "" ;
      A365DisDes = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode12 = "" ;
      GXCCtl = "" ;
      A13906BarTraDsc = "" ;
      Z365DisDes = "" ;
      Z407EmprNom = "" ;
      T01RM7_A407EmprNom = new String[] {""} ;
      T01RM7_n407EmprNom = new boolean[] {false} ;
      T01RM8_A252CliCod = new int[1] ;
      T01RM8_n252CliCod = new boolean[] {false} ;
      T01RM8_A365DisDes = new String[] {""} ;
      T01RM9_A361DisCod = new int[1] ;
      T01RM9_A2759BarMaqGru = new String[] {""} ;
      T01RM9_A129BarCod = new int[1] ;
      T01RM9_n129BarCod = new boolean[] {false} ;
      T01RM9_A132BarCodReo = new byte[1] ;
      T01RM9_n132BarCodReo = new boolean[] {false} ;
      T01RM9_A130BarCodPar = new String[] {""} ;
      T01RM9_n130BarCodPar = new boolean[] {false} ;
      T01RM9_A180BarMaqCod = new String[] {""} ;
      T01RM9_A407EmprNom = new String[] {""} ;
      T01RM9_n407EmprNom = new boolean[] {false} ;
      T01RM9_A252CliCod = new int[1] ;
      T01RM9_n252CliCod = new boolean[] {false} ;
      T01RM9_A365DisDes = new String[] {""} ;
      T01RM9_A396EmprCod = new String[] {""} ;
      T01RM9_n396EmprCod = new boolean[] {false} ;
      T01RM10_A396EmprCod = new String[] {""} ;
      T01RM10_n396EmprCod = new boolean[] {false} ;
      T01RM10_A129BarCod = new int[1] ;
      T01RM10_n129BarCod = new boolean[] {false} ;
      T01RM10_A132BarCodReo = new byte[1] ;
      T01RM10_n132BarCodReo = new boolean[] {false} ;
      T01RM10_A130BarCodPar = new String[] {""} ;
      T01RM10_n130BarCodPar = new boolean[] {false} ;
      T01RM6_A361DisCod = new int[1] ;
      T01RM6_A2759BarMaqGru = new String[] {""} ;
      T01RM6_A129BarCod = new int[1] ;
      T01RM6_n129BarCod = new boolean[] {false} ;
      T01RM6_A132BarCodReo = new byte[1] ;
      T01RM6_n132BarCodReo = new boolean[] {false} ;
      T01RM6_A130BarCodPar = new String[] {""} ;
      T01RM6_n130BarCodPar = new boolean[] {false} ;
      T01RM6_A180BarMaqCod = new String[] {""} ;
      T01RM6_A396EmprCod = new String[] {""} ;
      T01RM6_n396EmprCod = new boolean[] {false} ;
      T01RM6_A252CliCod = new int[1] ;
      T01RM6_n252CliCod = new boolean[] {false} ;
      T01RM6_A365DisDes = new String[] {""} ;
      T01RM11_A396EmprCod = new String[] {""} ;
      T01RM11_n396EmprCod = new boolean[] {false} ;
      T01RM11_A129BarCod = new int[1] ;
      T01RM11_n129BarCod = new boolean[] {false} ;
      T01RM11_A132BarCodReo = new byte[1] ;
      T01RM11_n132BarCodReo = new boolean[] {false} ;
      T01RM11_A130BarCodPar = new String[] {""} ;
      T01RM11_n130BarCodPar = new boolean[] {false} ;
      T01RM12_A396EmprCod = new String[] {""} ;
      T01RM12_n396EmprCod = new boolean[] {false} ;
      T01RM12_A129BarCod = new int[1] ;
      T01RM12_n129BarCod = new boolean[] {false} ;
      T01RM12_A132BarCodReo = new byte[1] ;
      T01RM12_n132BarCodReo = new boolean[] {false} ;
      T01RM12_A130BarCodPar = new String[] {""} ;
      T01RM12_n130BarCodPar = new boolean[] {false} ;
      T01RM5_A361DisCod = new int[1] ;
      T01RM5_A2759BarMaqGru = new String[] {""} ;
      T01RM5_A129BarCod = new int[1] ;
      T01RM5_n129BarCod = new boolean[] {false} ;
      T01RM5_A132BarCodReo = new byte[1] ;
      T01RM5_n132BarCodReo = new boolean[] {false} ;
      T01RM5_A130BarCodPar = new String[] {""} ;
      T01RM5_n130BarCodPar = new boolean[] {false} ;
      T01RM5_A180BarMaqCod = new String[] {""} ;
      T01RM5_A396EmprCod = new String[] {""} ;
      T01RM5_n396EmprCod = new boolean[] {false} ;
      T01RM5_A252CliCod = new int[1] ;
      T01RM5_n252CliCod = new boolean[] {false} ;
      T01RM5_A365DisDes = new String[] {""} ;
      T01RM16_A14681MRPrId = new long[1] ;
      T01RM17_A5921XCjaDis = new String[] {""} ;
      T01RM17_A5922XCjaCod = new long[1] ;
      T01RM18_A396EmprCod = new String[] {""} ;
      T01RM18_n396EmprCod = new boolean[] {false} ;
      T01RM18_A129BarCod = new int[1] ;
      T01RM18_n129BarCod = new boolean[] {false} ;
      T01RM18_A132BarCodReo = new byte[1] ;
      T01RM18_n132BarCodReo = new boolean[] {false} ;
      T01RM18_A130BarCodPar = new String[] {""} ;
      T01RM18_n130BarCodPar = new boolean[] {false} ;
      T01RM18_A14152MEnvOrd = new short[1] ;
      T01RM19_A396EmprCod = new String[] {""} ;
      T01RM19_n396EmprCod = new boolean[] {false} ;
      T01RM19_A129BarCod = new int[1] ;
      T01RM19_n129BarCod = new boolean[] {false} ;
      T01RM19_A132BarCodReo = new byte[1] ;
      T01RM19_n132BarCodReo = new boolean[] {false} ;
      T01RM19_A130BarCodPar = new String[] {""} ;
      T01RM19_n130BarCodPar = new boolean[] {false} ;
      T01RM19_A13093BarDGLin = new byte[1] ;
      T01RM19_A13094BarDGDibCl = new String[] {""} ;
      T01RM19_A13095BarDGDibIn = new int[1] ;
      T01RM19_A13096BarDGComb = new String[] {""} ;
      T01RM19_A13097BarDGFOndo = new String[] {""} ;
      T01RM20_A396EmprCod = new String[] {""} ;
      T01RM20_n396EmprCod = new boolean[] {false} ;
      T01RM20_A11917Ebd_numero = new int[1] ;
      T01RM21_A396EmprCod = new String[] {""} ;
      T01RM21_n396EmprCod = new boolean[] {false} ;
      T01RM21_A11898Prd_numero = new int[1] ;
      T01RM22_A396EmprCod = new String[] {""} ;
      T01RM22_n396EmprCod = new boolean[] {false} ;
      T01RM22_A11849Cte_numero = new int[1] ;
      T01RM23_A396EmprCod = new String[] {""} ;
      T01RM23_n396EmprCod = new boolean[] {false} ;
      T01RM23_A11791Ap_numero = new int[1] ;
      T01RM24_A396EmprCod = new String[] {""} ;
      T01RM24_n396EmprCod = new boolean[] {false} ;
      T01RM24_A3985CalBarCod = new int[1] ;
      T01RM24_A3986CalBarCodR = new byte[1] ;
      T01RM24_A3987CalBarCodP = new String[] {""} ;
      T01RM25_A396EmprCod = new String[] {""} ;
      T01RM25_n396EmprCod = new boolean[] {false} ;
      T01RM25_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T01RM25_A652OpeCod = new int[1] ;
      T01RM26_A396EmprCod = new String[] {""} ;
      T01RM26_n396EmprCod = new boolean[] {false} ;
      T01RM26_A129BarCod = new int[1] ;
      T01RM26_n129BarCod = new boolean[] {false} ;
      T01RM26_A132BarCodReo = new byte[1] ;
      T01RM26_n132BarCodReo = new boolean[] {false} ;
      T01RM26_A130BarCodPar = new String[] {""} ;
      T01RM26_n130BarCodPar = new boolean[] {false} ;
      T01RM26_A4118tinagrcod = new int[1] ;
      T01RM26_A4119tinagrreo = new byte[1] ;
      T01RM26_A4120tinagrpar = new String[] {""} ;
      T01RM27_A396EmprCod = new String[] {""} ;
      T01RM27_n396EmprCod = new boolean[] {false} ;
      T01RM27_A129BarCod = new int[1] ;
      T01RM27_n129BarCod = new boolean[] {false} ;
      T01RM27_A132BarCodReo = new byte[1] ;
      T01RM27_n132BarCodReo = new boolean[] {false} ;
      T01RM27_A130BarCodPar = new String[] {""} ;
      T01RM27_n130BarCodPar = new boolean[] {false} ;
      T01RM27_A4080estagrcod = new int[1] ;
      T01RM27_A4081estagrreo = new byte[1] ;
      T01RM27_A4082estagrpar = new String[] {""} ;
      T01RM28_A396EmprCod = new String[] {""} ;
      T01RM28_n396EmprCod = new boolean[] {false} ;
      T01RM28_A129BarCod = new int[1] ;
      T01RM28_n129BarCod = new boolean[] {false} ;
      T01RM28_A132BarCodReo = new byte[1] ;
      T01RM28_n132BarCodReo = new boolean[] {false} ;
      T01RM28_A130BarCodPar = new String[] {""} ;
      T01RM28_n130BarCodPar = new boolean[] {false} ;
      T01RM28_A4075recestncol = new byte[1] ;
      T01RM28_A4076recestnpro = new byte[1] ;
      T01RM29_A396EmprCod = new String[] {""} ;
      T01RM29_n396EmprCod = new boolean[] {false} ;
      T01RM29_A602MaqCod = new String[] {""} ;
      T01RM29_A1142MaqFCod = new String[] {""} ;
      T01RM29_A3068PlaEtaOrd = new short[1] ;
      T01RM29_A3069PlaEtaOrdA = new byte[1] ;
      T01RM29_A129BarCod = new int[1] ;
      T01RM29_n129BarCod = new boolean[] {false} ;
      T01RM29_A132BarCodReo = new byte[1] ;
      T01RM29_n132BarCodReo = new boolean[] {false} ;
      T01RM29_A130BarCodPar = new String[] {""} ;
      T01RM29_n130BarCodPar = new boolean[] {false} ;
      T01RM30_A396EmprCod = new String[] {""} ;
      T01RM30_n396EmprCod = new boolean[] {false} ;
      T01RM30_A129BarCod = new int[1] ;
      T01RM30_n129BarCod = new boolean[] {false} ;
      T01RM30_A132BarCodReo = new byte[1] ;
      T01RM30_n132BarCodReo = new boolean[] {false} ;
      T01RM30_A130BarCodPar = new String[] {""} ;
      T01RM30_n130BarCodPar = new boolean[] {false} ;
      T01RM30_A4846BarAudLin = new short[1] ;
      T01RM31_A396EmprCod = new String[] {""} ;
      T01RM31_n396EmprCod = new boolean[] {false} ;
      T01RM31_A129BarCod = new int[1] ;
      T01RM31_n129BarCod = new boolean[] {false} ;
      T01RM31_A132BarCodReo = new byte[1] ;
      T01RM31_n132BarCodReo = new boolean[] {false} ;
      T01RM31_A130BarCodPar = new String[] {""} ;
      T01RM31_n130BarCodPar = new boolean[] {false} ;
      T01RM31_A3940BarEnsLin = new short[1] ;
      T01RM32_A396EmprCod = new String[] {""} ;
      T01RM32_n396EmprCod = new boolean[] {false} ;
      T01RM32_A129BarCod = new int[1] ;
      T01RM32_n129BarCod = new boolean[] {false} ;
      T01RM32_A132BarCodReo = new byte[1] ;
      T01RM32_n132BarCodReo = new boolean[] {false} ;
      T01RM32_A130BarCodPar = new String[] {""} ;
      T01RM32_n130BarCodPar = new boolean[] {false} ;
      T01RM32_A3384RefBarCod = new int[1] ;
      T01RM32_A3385RefBarReo = new byte[1] ;
      T01RM32_A3386RefBarPar = new String[] {""} ;
      T01RM33_A396EmprCod = new String[] {""} ;
      T01RM33_n396EmprCod = new boolean[] {false} ;
      T01RM33_A10914SolSalCod = new int[1] ;
      T01RM34_A396EmprCod = new String[] {""} ;
      T01RM34_n396EmprCod = new boolean[] {false} ;
      T01RM34_A10364Ph_numero = new int[1] ;
      T01RM35_A396EmprCod = new String[] {""} ;
      T01RM35_n396EmprCod = new boolean[] {false} ;
      T01RM35_A129BarCod = new int[1] ;
      T01RM35_n129BarCod = new boolean[] {false} ;
      T01RM35_A132BarCodReo = new byte[1] ;
      T01RM35_n132BarCodReo = new boolean[] {false} ;
      T01RM35_A130BarCodPar = new String[] {""} ;
      T01RM35_n130BarCodPar = new boolean[] {false} ;
      T01RM35_A10197ProEspCod = new String[] {""} ;
      T01RM36_A396EmprCod = new String[] {""} ;
      T01RM36_n396EmprCod = new boolean[] {false} ;
      T01RM36_A129BarCod = new int[1] ;
      T01RM36_n129BarCod = new boolean[] {false} ;
      T01RM36_A132BarCodReo = new byte[1] ;
      T01RM36_n132BarCodReo = new boolean[] {false} ;
      T01RM36_A130BarCodPar = new String[] {""} ;
      T01RM36_n130BarCodPar = new boolean[] {false} ;
      T01RM36_A5322Dp_Nrecep = new int[1] ;
      T01RM37_A396EmprCod = new String[] {""} ;
      T01RM37_n396EmprCod = new boolean[] {false} ;
      T01RM37_A129BarCod = new int[1] ;
      T01RM37_n129BarCod = new boolean[] {false} ;
      T01RM37_A132BarCodReo = new byte[1] ;
      T01RM37_n132BarCodReo = new boolean[] {false} ;
      T01RM37_A130BarCodPar = new String[] {""} ;
      T01RM37_n130BarCodPar = new boolean[] {false} ;
      T01RM37_A8569EntSecLn = new int[1] ;
      T01RM38_A396EmprCod = new String[] {""} ;
      T01RM38_n396EmprCod = new boolean[] {false} ;
      T01RM38_A7434PLLNro = new int[1] ;
      T01RM38_A7443LPLNro = new short[1] ;
      T01RM38_A7459CPLCom = new short[1] ;
      T01RM38_A129BarCod = new int[1] ;
      T01RM38_n129BarCod = new boolean[] {false} ;
      T01RM38_A132BarCodReo = new byte[1] ;
      T01RM38_n132BarCodReo = new boolean[] {false} ;
      T01RM38_A130BarCodPar = new String[] {""} ;
      T01RM38_n130BarCodPar = new boolean[] {false} ;
      T01RM39_A396EmprCod = new String[] {""} ;
      T01RM39_n396EmprCod = new boolean[] {false} ;
      T01RM39_A7145OSSCod = new int[1] ;
      T01RM40_A396EmprCod = new String[] {""} ;
      T01RM40_n396EmprCod = new boolean[] {false} ;
      T01RM40_A7049OGSCod = new int[1] ;
      T01RM41_A396EmprCod = new String[] {""} ;
      T01RM41_n396EmprCod = new boolean[] {false} ;
      T01RM41_A129BarCod = new int[1] ;
      T01RM41_n129BarCod = new boolean[] {false} ;
      T01RM41_A132BarCodReo = new byte[1] ;
      T01RM41_n132BarCodReo = new boolean[] {false} ;
      T01RM41_A130BarCodPar = new String[] {""} ;
      T01RM41_n130BarCodPar = new boolean[] {false} ;
      T01RM41_A6031Ac_Barcod = new int[1] ;
      T01RM41_A6032Ac_BarReo = new byte[1] ;
      T01RM41_A6033Ac_BarPar = new String[] {""} ;
      T01RM42_A396EmprCod = new String[] {""} ;
      T01RM42_n396EmprCod = new boolean[] {false} ;
      T01RM42_A129BarCod = new int[1] ;
      T01RM42_n129BarCod = new boolean[] {false} ;
      T01RM42_A132BarCodReo = new byte[1] ;
      T01RM42_n132BarCodReo = new boolean[] {false} ;
      T01RM42_A130BarCodPar = new String[] {""} ;
      T01RM42_n130BarCodPar = new boolean[] {false} ;
      T01RM42_A5908PartPal = new int[1] ;
      T01RM43_A396EmprCod = new String[] {""} ;
      T01RM43_n396EmprCod = new boolean[] {false} ;
      T01RM43_A129BarCod = new int[1] ;
      T01RM43_n129BarCod = new boolean[] {false} ;
      T01RM43_A132BarCodReo = new byte[1] ;
      T01RM43_n132BarCodReo = new boolean[] {false} ;
      T01RM43_A130BarCodPar = new String[] {""} ;
      T01RM43_n130BarCodPar = new boolean[] {false} ;
      T01RM43_A2524DisComLin = new byte[1] ;
      T01RM43_A1056DisComCod = new String[] {""} ;
      T01RM43_A1032FonCod = new String[] {""} ;
      T01RM44_A396EmprCod = new String[] {""} ;
      T01RM44_n396EmprCod = new boolean[] {false} ;
      T01RM44_A1736AlbExtCod = new long[1] ;
      T01RM44_A129BarCod = new int[1] ;
      T01RM44_n129BarCod = new boolean[] {false} ;
      T01RM44_A132BarCodReo = new byte[1] ;
      T01RM44_n132BarCodReo = new boolean[] {false} ;
      T01RM44_A130BarCodPar = new String[] {""} ;
      T01RM44_n130BarCodPar = new boolean[] {false} ;
      T01RM45_A396EmprCod = new String[] {""} ;
      T01RM45_n396EmprCod = new boolean[] {false} ;
      T01RM45_A129BarCod = new int[1] ;
      T01RM45_n129BarCod = new boolean[] {false} ;
      T01RM45_A132BarCodReo = new byte[1] ;
      T01RM45_n132BarCodReo = new boolean[] {false} ;
      T01RM45_A130BarCodPar = new String[] {""} ;
      T01RM45_n130BarCodPar = new boolean[] {false} ;
      T01RM45_A3753BarFoaCod = new int[1] ;
      T01RM45_A3754BarFoaReo = new byte[1] ;
      T01RM45_A3755BarFoaPar = new String[] {""} ;
      T01RM46_A396EmprCod = new String[] {""} ;
      T01RM46_n396EmprCod = new boolean[] {false} ;
      T01RM46_A129BarCod = new int[1] ;
      T01RM46_n129BarCod = new boolean[] {false} ;
      T01RM46_A132BarCodReo = new byte[1] ;
      T01RM46_n132BarCodReo = new boolean[] {false} ;
      T01RM46_A130BarCodPar = new String[] {""} ;
      T01RM46_n130BarCodPar = new boolean[] {false} ;
      T01RM46_A3747BarPegCod = new int[1] ;
      T01RM46_A3748BarPegReo = new byte[1] ;
      T01RM46_A3749BarPegPar = new String[] {""} ;
      T01RM47_A396EmprCod = new String[] {""} ;
      T01RM47_n396EmprCod = new boolean[] {false} ;
      T01RM47_A3253SolTraCod = new int[1] ;
      T01RM48_A396EmprCod = new String[] {""} ;
      T01RM48_n396EmprCod = new boolean[] {false} ;
      T01RM48_A3235SolSubCod = new int[1] ;
      T01RM49_A396EmprCod = new String[] {""} ;
      T01RM49_n396EmprCod = new boolean[] {false} ;
      T01RM49_A3218SolLuzCod = new int[1] ;
      T01RM50_A396EmprCod = new String[] {""} ;
      T01RM50_n396EmprCod = new boolean[] {false} ;
      T01RM50_A3196SolFriCod = new int[1] ;
      T01RM51_A396EmprCod = new String[] {""} ;
      T01RM51_n396EmprCod = new boolean[] {false} ;
      T01RM51_A3165SolPilCod = new int[1] ;
      T01RM52_A396EmprCod = new String[] {""} ;
      T01RM52_n396EmprCod = new boolean[] {false} ;
      T01RM52_A129BarCod = new int[1] ;
      T01RM52_n129BarCod = new boolean[] {false} ;
      T01RM52_A132BarCodReo = new byte[1] ;
      T01RM52_n132BarCodReo = new boolean[] {false} ;
      T01RM52_A130BarCodPar = new String[] {""} ;
      T01RM52_n130BarCodPar = new boolean[] {false} ;
      T01RM52_A2872HAnRLinMaq = new short[1] ;
      T01RM52_A2873HAnRLinPro = new byte[1] ;
      T01RM52_A2874HAnRLin = new short[1] ;
      T01RM52_A2875HAnNumAny = new byte[1] ;
      T01RM53_A396EmprCod = new String[] {""} ;
      T01RM53_n396EmprCod = new boolean[] {false} ;
      T01RM53_A2817PlaTer = new String[] {""} ;
      T01RM53_A2818PlaOrd = new short[1] ;
      T01RM54_A396EmprCod = new String[] {""} ;
      T01RM54_n396EmprCod = new boolean[] {false} ;
      T01RM54_A2809MetTerCod = new String[] {""} ;
      T01RM54_A129BarCod = new int[1] ;
      T01RM54_n129BarCod = new boolean[] {false} ;
      T01RM54_A132BarCodReo = new byte[1] ;
      T01RM54_n132BarCodReo = new boolean[] {false} ;
      T01RM54_A130BarCodPar = new String[] {""} ;
      T01RM54_n130BarCodPar = new boolean[] {false} ;
      T01RM55_A396EmprCod = new String[] {""} ;
      T01RM55_n396EmprCod = new boolean[] {false} ;
      T01RM55_A129BarCod = new int[1] ;
      T01RM55_n129BarCod = new boolean[] {false} ;
      T01RM55_A132BarCodReo = new byte[1] ;
      T01RM55_n132BarCodReo = new boolean[] {false} ;
      T01RM55_A130BarCodPar = new String[] {""} ;
      T01RM55_n130BarCodPar = new boolean[] {false} ;
      T01RM55_A2808RecLinMAL = new short[1] ;
      T01RM55_A1377RecNumAny = new byte[1] ;
      T01RM55_A719PrdNum = new String[] {""} ;
      T01RM56_A396EmprCod = new String[] {""} ;
      T01RM56_n396EmprCod = new boolean[] {false} ;
      T01RM56_A129BarCod = new int[1] ;
      T01RM56_n129BarCod = new boolean[] {false} ;
      T01RM56_A132BarCodReo = new byte[1] ;
      T01RM56_n132BarCodReo = new boolean[] {false} ;
      T01RM56_A130BarCodPar = new String[] {""} ;
      T01RM56_n130BarCodPar = new boolean[] {false} ;
      T01RM56_A2804RecLinMaq = new short[1] ;
      T01RM57_A396EmprCod = new String[] {""} ;
      T01RM57_n396EmprCod = new boolean[] {false} ;
      T01RM57_A2792TermiCod = new String[] {""} ;
      T01RM57_A129BarCod = new int[1] ;
      T01RM57_n129BarCod = new boolean[] {false} ;
      T01RM57_A132BarCodReo = new byte[1] ;
      T01RM57_n132BarCodReo = new boolean[] {false} ;
      T01RM57_A130BarCodPar = new String[] {""} ;
      T01RM57_n130BarCodPar = new boolean[] {false} ;
      T01RM58_A396EmprCod = new String[] {""} ;
      T01RM58_n396EmprCod = new boolean[] {false} ;
      T01RM58_A2248ManCod = new short[1] ;
      T01RM58_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01RM58_A2713RpExHdLi = new short[1] ;
      T01RM59_A396EmprCod = new String[] {""} ;
      T01RM59_n396EmprCod = new boolean[] {false} ;
      T01RM59_A2248ManCod = new short[1] ;
      T01RM59_A2689ExHdrFas = new String[] {""} ;
      T01RM59_A2692ExHdrLin = new int[1] ;
      T01RM60_A396EmprCod = new String[] {""} ;
      T01RM60_n396EmprCod = new boolean[] {false} ;
      T01RM60_A129BarCod = new int[1] ;
      T01RM60_n129BarCod = new boolean[] {false} ;
      T01RM60_A132BarCodReo = new byte[1] ;
      T01RM60_n132BarCodReo = new boolean[] {false} ;
      T01RM60_A130BarCodPar = new String[] {""} ;
      T01RM60_n130BarCodPar = new boolean[] {false} ;
      T01RM60_A2494BarDosPro = new String[] {""} ;
      T01RM60_A719PrdNum = new String[] {""} ;
      T01RM61_A396EmprCod = new String[] {""} ;
      T01RM61_n396EmprCod = new boolean[] {false} ;
      T01RM61_A602MaqCod = new String[] {""} ;
      T01RM61_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T01RM61_A129BarCod = new int[1] ;
      T01RM61_n129BarCod = new boolean[] {false} ;
      T01RM61_A132BarCodReo = new byte[1] ;
      T01RM61_n132BarCodReo = new boolean[] {false} ;
      T01RM61_A130BarCodPar = new String[] {""} ;
      T01RM61_n130BarCodPar = new boolean[] {false} ;
      T01RM62_A396EmprCod = new String[] {""} ;
      T01RM62_n396EmprCod = new boolean[] {false} ;
      T01RM62_A129BarCod = new int[1] ;
      T01RM62_n129BarCod = new boolean[] {false} ;
      T01RM62_A132BarCodReo = new byte[1] ;
      T01RM62_n132BarCodReo = new boolean[] {false} ;
      T01RM62_A130BarCodPar = new String[] {""} ;
      T01RM62_n130BarCodPar = new boolean[] {false} ;
      T01RM62_A2457BarObLin = new short[1] ;
      T01RM63_A396EmprCod = new String[] {""} ;
      T01RM63_n396EmprCod = new boolean[] {false} ;
      T01RM63_A129BarCod = new int[1] ;
      T01RM63_n129BarCod = new boolean[] {false} ;
      T01RM63_A132BarCodReo = new byte[1] ;
      T01RM63_n132BarCodReo = new boolean[] {false} ;
      T01RM63_A130BarCodPar = new String[] {""} ;
      T01RM63_n130BarCodPar = new boolean[] {false} ;
      T01RM63_A2444BarEnLin = new short[1] ;
      T01RM64_A396EmprCod = new String[] {""} ;
      T01RM64_n396EmprCod = new boolean[] {false} ;
      T01RM64_A2406ExhAlbCod = new int[1] ;
      T01RM64_A129BarCod = new int[1] ;
      T01RM64_n129BarCod = new boolean[] {false} ;
      T01RM64_A132BarCodReo = new byte[1] ;
      T01RM64_n132BarCodReo = new boolean[] {false} ;
      T01RM64_A130BarCodPar = new String[] {""} ;
      T01RM64_n130BarCodPar = new boolean[] {false} ;
      T01RM65_A396EmprCod = new String[] {""} ;
      T01RM65_n396EmprCod = new boolean[] {false} ;
      T01RM65_A2253SalExtAlb = new int[1] ;
      T01RM65_A129BarCod = new int[1] ;
      T01RM65_n129BarCod = new boolean[] {false} ;
      T01RM65_A132BarCodReo = new byte[1] ;
      T01RM65_n132BarCodReo = new boolean[] {false} ;
      T01RM65_A130BarCodPar = new String[] {""} ;
      T01RM65_n130BarCodPar = new boolean[] {false} ;
      T01RM66_A396EmprCod = new String[] {""} ;
      T01RM66_n396EmprCod = new boolean[] {false} ;
      T01RM66_A30AlbProCod = new long[1] ;
      T01RM66_A129BarCod = new int[1] ;
      T01RM66_n129BarCod = new boolean[] {false} ;
      T01RM66_A132BarCodReo = new byte[1] ;
      T01RM66_n132BarCodReo = new boolean[] {false} ;
      T01RM66_A130BarCodPar = new String[] {""} ;
      T01RM66_n130BarCodPar = new boolean[] {false} ;
      T01RM67_A396EmprCod = new String[] {""} ;
      T01RM67_n396EmprCod = new boolean[] {false} ;
      T01RM67_A1348SolColCod = new int[1] ;
      T01RM68_A396EmprCod = new String[] {""} ;
      T01RM68_n396EmprCod = new boolean[] {false} ;
      T01RM68_A1333EstDimCod = new int[1] ;
      T01RM69_A396EmprCod = new String[] {""} ;
      T01RM69_n396EmprCod = new boolean[] {false} ;
      T01RM69_A1314EnsLabCod = new int[1] ;
      T01RM70_A396EmprCod = new String[] {""} ;
      T01RM70_n396EmprCod = new boolean[] {false} ;
      T01RM70_A129BarCod = new int[1] ;
      T01RM70_n129BarCod = new boolean[] {false} ;
      T01RM70_A132BarCodReo = new byte[1] ;
      T01RM70_n132BarCodReo = new boolean[] {false} ;
      T01RM70_A130BarCodPar = new String[] {""} ;
      T01RM70_n130BarCodPar = new boolean[] {false} ;
      T01RM70_A906ObsReoLin = new byte[1] ;
      T01RM71_A396EmprCod = new String[] {""} ;
      T01RM71_n396EmprCod = new boolean[] {false} ;
      T01RM71_A859CumCodCont = new int[1] ;
      T01RM72_A396EmprCod = new String[] {""} ;
      T01RM72_n396EmprCod = new boolean[] {false} ;
      T01RM72_A602MaqCod = new String[] {""} ;
      T01RM72_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RM72_A561HisProLin = new int[1] ;
      T01RM73_A396EmprCod = new String[] {""} ;
      T01RM73_n396EmprCod = new boolean[] {false} ;
      T01RM73_A252CliCod = new int[1] ;
      T01RM73_n252CliCod = new boolean[] {false} ;
      T01RM73_A494ForSer = new String[] {""} ;
      T01RM73_A482ForColNom = new String[] {""} ;
      T01RM73_A483ForColNum = new int[1] ;
      T01RM73_A831TipColCod = new byte[1] ;
      T01RM74_A396EmprCod = new String[] {""} ;
      T01RM74_n396EmprCod = new boolean[] {false} ;
      T01RM74_A129BarCod = new int[1] ;
      T01RM74_n129BarCod = new boolean[] {false} ;
      T01RM74_A132BarCodReo = new byte[1] ;
      T01RM74_n132BarCodReo = new boolean[] {false} ;
      T01RM74_A130BarCodPar = new String[] {""} ;
      T01RM74_n130BarCodPar = new boolean[] {false} ;
      T01RM74_A200BarPieCod = new String[] {""} ;
      T01RM75_A396EmprCod = new String[] {""} ;
      T01RM75_n396EmprCod = new boolean[] {false} ;
      T01RM75_A129BarCod = new int[1] ;
      T01RM75_n129BarCod = new boolean[] {false} ;
      T01RM75_A132BarCodReo = new byte[1] ;
      T01RM75_n132BarCodReo = new boolean[] {false} ;
      T01RM75_A130BarCodPar = new String[] {""} ;
      T01RM75_n130BarCodPar = new boolean[] {false} ;
      T01RM75_A188BarNotLin = new byte[1] ;
      T01RM76_A396EmprCod = new String[] {""} ;
      T01RM76_n396EmprCod = new boolean[] {false} ;
      T01RM76_A129BarCod = new int[1] ;
      T01RM76_n129BarCod = new boolean[] {false} ;
      T01RM76_A132BarCodReo = new byte[1] ;
      T01RM76_n132BarCodReo = new boolean[] {false} ;
      T01RM76_A130BarCodPar = new String[] {""} ;
      T01RM76_n130BarCodPar = new boolean[] {false} ;
      T01RM76_A758ProCod = new String[] {""} ;
      T01RM77_A396EmprCod = new String[] {""} ;
      T01RM77_n396EmprCod = new boolean[] {false} ;
      T01RM77_A129BarCod = new int[1] ;
      T01RM77_n129BarCod = new boolean[] {false} ;
      T01RM77_A132BarCodReo = new byte[1] ;
      T01RM77_n132BarCodReo = new boolean[] {false} ;
      T01RM77_A130BarCodPar = new String[] {""} ;
      T01RM77_n130BarCodPar = new boolean[] {false} ;
      T01RM77_A119BarAgrCod = new int[1] ;
      T01RM77_A124BarAgrReo = new byte[1] ;
      T01RM77_A122BarAgrPar = new String[] {""} ;
      T01RM79_A396EmprCod = new String[] {""} ;
      T01RM79_n396EmprCod = new boolean[] {false} ;
      T01RM79_A129BarCod = new int[1] ;
      T01RM79_n129BarCod = new boolean[] {false} ;
      T01RM79_A132BarCodReo = new byte[1] ;
      T01RM79_n132BarCodReo = new boolean[] {false} ;
      T01RM79_A130BarCodPar = new String[] {""} ;
      T01RM79_n130BarCodPar = new boolean[] {false} ;
      Z13906BarTraDsc = "" ;
      T01RM80_A129BarCod = new int[1] ;
      T01RM80_n129BarCod = new boolean[] {false} ;
      T01RM80_A132BarCodReo = new byte[1] ;
      T01RM80_n132BarCodReo = new boolean[] {false} ;
      T01RM80_A130BarCodPar = new String[] {""} ;
      T01RM80_n130BarCodPar = new boolean[] {false} ;
      T01RM80_A13906BarTraDsc = new String[] {""} ;
      T01RM80_n13906BarTraDsc = new boolean[] {false} ;
      T01RM80_A396EmprCod = new String[] {""} ;
      T01RM80_n396EmprCod = new boolean[] {false} ;
      T01RM80_A13905BarTraID = new String[] {""} ;
      T01RM4_A13906BarTraDsc = new String[] {""} ;
      T01RM4_n13906BarTraDsc = new boolean[] {false} ;
      T01RM81_A13906BarTraDsc = new String[] {""} ;
      T01RM81_n13906BarTraDsc = new boolean[] {false} ;
      T01RM82_A396EmprCod = new String[] {""} ;
      T01RM82_n396EmprCod = new boolean[] {false} ;
      T01RM82_A129BarCod = new int[1] ;
      T01RM82_n129BarCod = new boolean[] {false} ;
      T01RM82_A132BarCodReo = new byte[1] ;
      T01RM82_n132BarCodReo = new boolean[] {false} ;
      T01RM82_A130BarCodPar = new String[] {""} ;
      T01RM82_n130BarCodPar = new boolean[] {false} ;
      T01RM82_A13905BarTraID = new String[] {""} ;
      T01RM3_A129BarCod = new int[1] ;
      T01RM3_n129BarCod = new boolean[] {false} ;
      T01RM3_A132BarCodReo = new byte[1] ;
      T01RM3_n132BarCodReo = new boolean[] {false} ;
      T01RM3_A130BarCodPar = new String[] {""} ;
      T01RM3_n130BarCodPar = new boolean[] {false} ;
      T01RM3_A396EmprCod = new String[] {""} ;
      T01RM3_n396EmprCod = new boolean[] {false} ;
      T01RM3_A13905BarTraID = new String[] {""} ;
      T01RM2_A129BarCod = new int[1] ;
      T01RM2_n129BarCod = new boolean[] {false} ;
      T01RM2_A132BarCodReo = new byte[1] ;
      T01RM2_n132BarCodReo = new boolean[] {false} ;
      T01RM2_A130BarCodPar = new String[] {""} ;
      T01RM2_n130BarCodPar = new boolean[] {false} ;
      T01RM2_A396EmprCod = new String[] {""} ;
      T01RM2_n396EmprCod = new boolean[] {false} ;
      T01RM2_A13905BarTraID = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      T01RM85_A13906BarTraDsc = new String[] {""} ;
      T01RM85_n13906BarTraDsc = new boolean[] {false} ;
      T01RM86_A396EmprCod = new String[] {""} ;
      T01RM86_n396EmprCod = new boolean[] {false} ;
      T01RM86_A129BarCod = new int[1] ;
      T01RM86_n129BarCod = new boolean[] {false} ;
      T01RM86_A132BarCodReo = new byte[1] ;
      T01RM86_n132BarCodReo = new boolean[] {false} ;
      T01RM86_A130BarCodPar = new String[] {""} ;
      T01RM86_n130BarCodPar = new boolean[] {false} ;
      T01RM86_A13905BarTraID = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01RM87_A407EmprNom = new String[] {""} ;
      T01RM87_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ2759BarMaqGru = "" ;
      ZZ180BarMaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ365DisDes = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbartti__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbartti__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbartti__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbartti__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbartti__default(),
         new Object[] {
             new Object[] {
            T01RM2_A129BarCod, T01RM2_A132BarCodReo, T01RM2_A130BarCodPar, T01RM2_A396EmprCod, T01RM2_A13905BarTraID
            }
            , new Object[] {
            T01RM3_A129BarCod, T01RM3_A132BarCodReo, T01RM3_A130BarCodPar, T01RM3_A396EmprCod, T01RM3_A13905BarTraID
            }
            , new Object[] {
            T01RM4_A13906BarTraDsc, T01RM4_n13906BarTraDsc
            }
            , new Object[] {
            T01RM5_A361DisCod, T01RM5_A2759BarMaqGru, T01RM5_A129BarCod, T01RM5_A132BarCodReo, T01RM5_A130BarCodPar, T01RM5_A180BarMaqCod, T01RM5_A396EmprCod, T01RM5_A252CliCod, T01RM5_n252CliCod, T01RM5_A365DisDes
            }
            , new Object[] {
            T01RM6_A361DisCod, T01RM6_A2759BarMaqGru, T01RM6_A129BarCod, T01RM6_A132BarCodReo, T01RM6_A130BarCodPar, T01RM6_A180BarMaqCod, T01RM6_A396EmprCod, T01RM6_A252CliCod, T01RM6_n252CliCod, T01RM6_A365DisDes
            }
            , new Object[] {
            T01RM7_A407EmprNom, T01RM7_n407EmprNom
            }
            , new Object[] {
            T01RM8_A252CliCod, T01RM8_A365DisDes
            }
            , new Object[] {
            T01RM9_A361DisCod, T01RM9_A2759BarMaqGru, T01RM9_A129BarCod, T01RM9_A132BarCodReo, T01RM9_A130BarCodPar, T01RM9_A180BarMaqCod, T01RM9_A407EmprNom, T01RM9_n407EmprNom, T01RM9_A252CliCod, T01RM9_n252CliCod,
            T01RM9_A365DisDes, T01RM9_A396EmprCod
            }
            , new Object[] {
            T01RM10_A396EmprCod, T01RM10_A129BarCod, T01RM10_A132BarCodReo, T01RM10_A130BarCodPar
            }
            , new Object[] {
            T01RM11_A396EmprCod, T01RM11_A129BarCod, T01RM11_A132BarCodReo, T01RM11_A130BarCodPar
            }
            , new Object[] {
            T01RM12_A396EmprCod, T01RM12_A129BarCod, T01RM12_A132BarCodReo, T01RM12_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RM16_A14681MRPrId
            }
            , new Object[] {
            T01RM17_A5921XCjaDis, T01RM17_A5922XCjaCod
            }
            , new Object[] {
            T01RM18_A396EmprCod, T01RM18_A129BarCod, T01RM18_A132BarCodReo, T01RM18_A130BarCodPar, T01RM18_A14152MEnvOrd
            }
            , new Object[] {
            T01RM19_A396EmprCod, T01RM19_A129BarCod, T01RM19_A132BarCodReo, T01RM19_A130BarCodPar, T01RM19_A13093BarDGLin, T01RM19_A13094BarDGDibCl, T01RM19_A13095BarDGDibIn, T01RM19_A13096BarDGComb, T01RM19_A13097BarDGFOndo
            }
            , new Object[] {
            T01RM20_A396EmprCod, T01RM20_A11917Ebd_numero
            }
            , new Object[] {
            T01RM21_A396EmprCod, T01RM21_A11898Prd_numero
            }
            , new Object[] {
            T01RM22_A396EmprCod, T01RM22_A11849Cte_numero
            }
            , new Object[] {
            T01RM23_A396EmprCod, T01RM23_A11791Ap_numero
            }
            , new Object[] {
            T01RM24_A396EmprCod, T01RM24_A3985CalBarCod, T01RM24_A3986CalBarCodR, T01RM24_A3987CalBarCodP
            }
            , new Object[] {
            T01RM25_A396EmprCod, T01RM25_A5294InPTime, T01RM25_A652OpeCod
            }
            , new Object[] {
            T01RM26_A396EmprCod, T01RM26_A129BarCod, T01RM26_A132BarCodReo, T01RM26_A130BarCodPar, T01RM26_A4118tinagrcod, T01RM26_A4119tinagrreo, T01RM26_A4120tinagrpar
            }
            , new Object[] {
            T01RM27_A396EmprCod, T01RM27_A129BarCod, T01RM27_A132BarCodReo, T01RM27_A130BarCodPar, T01RM27_A4080estagrcod, T01RM27_A4081estagrreo, T01RM27_A4082estagrpar
            }
            , new Object[] {
            T01RM28_A396EmprCod, T01RM28_A129BarCod, T01RM28_A132BarCodReo, T01RM28_A130BarCodPar, T01RM28_A4075recestncol, T01RM28_A4076recestnpro
            }
            , new Object[] {
            T01RM29_A396EmprCod, T01RM29_A602MaqCod, T01RM29_A1142MaqFCod, T01RM29_A3068PlaEtaOrd, T01RM29_A3069PlaEtaOrdA, T01RM29_A129BarCod, T01RM29_A132BarCodReo, T01RM29_A130BarCodPar
            }
            , new Object[] {
            T01RM30_A396EmprCod, T01RM30_A129BarCod, T01RM30_A132BarCodReo, T01RM30_A130BarCodPar, T01RM30_A4846BarAudLin
            }
            , new Object[] {
            T01RM31_A396EmprCod, T01RM31_A129BarCod, T01RM31_A132BarCodReo, T01RM31_A130BarCodPar, T01RM31_A3940BarEnsLin
            }
            , new Object[] {
            T01RM32_A396EmprCod, T01RM32_A129BarCod, T01RM32_A132BarCodReo, T01RM32_A130BarCodPar, T01RM32_A3384RefBarCod, T01RM32_A3385RefBarReo, T01RM32_A3386RefBarPar
            }
            , new Object[] {
            T01RM33_A396EmprCod, T01RM33_A10914SolSalCod
            }
            , new Object[] {
            T01RM34_A396EmprCod, T01RM34_A10364Ph_numero
            }
            , new Object[] {
            T01RM35_A396EmprCod, T01RM35_A129BarCod, T01RM35_A132BarCodReo, T01RM35_A130BarCodPar, T01RM35_A10197ProEspCod
            }
            , new Object[] {
            T01RM36_A396EmprCod, T01RM36_A129BarCod, T01RM36_A132BarCodReo, T01RM36_A130BarCodPar, T01RM36_A5322Dp_Nrecep
            }
            , new Object[] {
            T01RM37_A396EmprCod, T01RM37_A129BarCod, T01RM37_A132BarCodReo, T01RM37_A130BarCodPar, T01RM37_A8569EntSecLn
            }
            , new Object[] {
            T01RM38_A396EmprCod, T01RM38_A7434PLLNro, T01RM38_A7443LPLNro, T01RM38_A7459CPLCom, T01RM38_A129BarCod, T01RM38_A132BarCodReo, T01RM38_A130BarCodPar
            }
            , new Object[] {
            T01RM39_A396EmprCod, T01RM39_A7145OSSCod
            }
            , new Object[] {
            T01RM40_A396EmprCod, T01RM40_A7049OGSCod
            }
            , new Object[] {
            T01RM41_A396EmprCod, T01RM41_A129BarCod, T01RM41_A132BarCodReo, T01RM41_A130BarCodPar, T01RM41_A6031Ac_Barcod, T01RM41_A6032Ac_BarReo, T01RM41_A6033Ac_BarPar
            }
            , new Object[] {
            T01RM42_A396EmprCod, T01RM42_A129BarCod, T01RM42_A132BarCodReo, T01RM42_A130BarCodPar, T01RM42_A5908PartPal
            }
            , new Object[] {
            T01RM43_A396EmprCod, T01RM43_A129BarCod, T01RM43_A132BarCodReo, T01RM43_A130BarCodPar, T01RM43_A2524DisComLin, T01RM43_A1056DisComCod, T01RM43_A1032FonCod
            }
            , new Object[] {
            T01RM44_A396EmprCod, T01RM44_A1736AlbExtCod, T01RM44_A129BarCod, T01RM44_A132BarCodReo, T01RM44_A130BarCodPar
            }
            , new Object[] {
            T01RM45_A396EmprCod, T01RM45_A129BarCod, T01RM45_A132BarCodReo, T01RM45_A130BarCodPar, T01RM45_A3753BarFoaCod, T01RM45_A3754BarFoaReo, T01RM45_A3755BarFoaPar
            }
            , new Object[] {
            T01RM46_A396EmprCod, T01RM46_A129BarCod, T01RM46_A132BarCodReo, T01RM46_A130BarCodPar, T01RM46_A3747BarPegCod, T01RM46_A3748BarPegReo, T01RM46_A3749BarPegPar
            }
            , new Object[] {
            T01RM47_A396EmprCod, T01RM47_A3253SolTraCod
            }
            , new Object[] {
            T01RM48_A396EmprCod, T01RM48_A3235SolSubCod
            }
            , new Object[] {
            T01RM49_A396EmprCod, T01RM49_A3218SolLuzCod
            }
            , new Object[] {
            T01RM50_A396EmprCod, T01RM50_A3196SolFriCod
            }
            , new Object[] {
            T01RM51_A396EmprCod, T01RM51_A3165SolPilCod
            }
            , new Object[] {
            T01RM52_A396EmprCod, T01RM52_A129BarCod, T01RM52_A132BarCodReo, T01RM52_A130BarCodPar, T01RM52_A2872HAnRLinMaq, T01RM52_A2873HAnRLinPro, T01RM52_A2874HAnRLin, T01RM52_A2875HAnNumAny
            }
            , new Object[] {
            T01RM53_A396EmprCod, T01RM53_A2817PlaTer, T01RM53_A2818PlaOrd
            }
            , new Object[] {
            T01RM54_A396EmprCod, T01RM54_A2809MetTerCod, T01RM54_A129BarCod, T01RM54_A132BarCodReo, T01RM54_A130BarCodPar
            }
            , new Object[] {
            T01RM55_A396EmprCod, T01RM55_A129BarCod, T01RM55_A132BarCodReo, T01RM55_A130BarCodPar, T01RM55_A2808RecLinMAL, T01RM55_A1377RecNumAny, T01RM55_A719PrdNum
            }
            , new Object[] {
            T01RM56_A396EmprCod, T01RM56_A129BarCod, T01RM56_A132BarCodReo, T01RM56_A130BarCodPar, T01RM56_A2804RecLinMaq
            }
            , new Object[] {
            T01RM57_A396EmprCod, T01RM57_A2792TermiCod, T01RM57_A129BarCod, T01RM57_A132BarCodReo, T01RM57_A130BarCodPar
            }
            , new Object[] {
            T01RM58_A396EmprCod, T01RM58_A2248ManCod, T01RM58_A2711RpExHdFe, T01RM58_A2713RpExHdLi
            }
            , new Object[] {
            T01RM59_A396EmprCod, T01RM59_A2248ManCod, T01RM59_A2689ExHdrFas, T01RM59_A2692ExHdrLin
            }
            , new Object[] {
            T01RM60_A396EmprCod, T01RM60_A129BarCod, T01RM60_A132BarCodReo, T01RM60_A130BarCodPar, T01RM60_A2494BarDosPro, T01RM60_A719PrdNum
            }
            , new Object[] {
            T01RM61_A396EmprCod, T01RM61_A602MaqCod, T01RM61_A2461PlaFecTin, T01RM61_A129BarCod, T01RM61_A132BarCodReo, T01RM61_A130BarCodPar
            }
            , new Object[] {
            T01RM62_A396EmprCod, T01RM62_A129BarCod, T01RM62_A132BarCodReo, T01RM62_A130BarCodPar, T01RM62_A2457BarObLin
            }
            , new Object[] {
            T01RM63_A396EmprCod, T01RM63_A129BarCod, T01RM63_A132BarCodReo, T01RM63_A130BarCodPar, T01RM63_A2444BarEnLin
            }
            , new Object[] {
            T01RM64_A396EmprCod, T01RM64_A2406ExhAlbCod, T01RM64_A129BarCod, T01RM64_A132BarCodReo, T01RM64_A130BarCodPar
            }
            , new Object[] {
            T01RM65_A396EmprCod, T01RM65_A2253SalExtAlb, T01RM65_A129BarCod, T01RM65_A132BarCodReo, T01RM65_A130BarCodPar
            }
            , new Object[] {
            T01RM66_A396EmprCod, T01RM66_A30AlbProCod, T01RM66_A129BarCod, T01RM66_A132BarCodReo, T01RM66_A130BarCodPar
            }
            , new Object[] {
            T01RM67_A396EmprCod, T01RM67_A1348SolColCod
            }
            , new Object[] {
            T01RM68_A396EmprCod, T01RM68_A1333EstDimCod
            }
            , new Object[] {
            T01RM69_A396EmprCod, T01RM69_A1314EnsLabCod
            }
            , new Object[] {
            T01RM70_A396EmprCod, T01RM70_A129BarCod, T01RM70_A132BarCodReo, T01RM70_A130BarCodPar, T01RM70_A906ObsReoLin
            }
            , new Object[] {
            T01RM71_A396EmprCod, T01RM71_A859CumCodCont
            }
            , new Object[] {
            T01RM72_A396EmprCod, T01RM72_A602MaqCod, T01RM72_A558HisProFec, T01RM72_A561HisProLin
            }
            , new Object[] {
            T01RM73_A396EmprCod, T01RM73_A252CliCod, T01RM73_A494ForSer, T01RM73_A482ForColNom, T01RM73_A483ForColNum, T01RM73_A831TipColCod
            }
            , new Object[] {
            T01RM74_A396EmprCod, T01RM74_A129BarCod, T01RM74_A132BarCodReo, T01RM74_A130BarCodPar, T01RM74_A200BarPieCod
            }
            , new Object[] {
            T01RM75_A396EmprCod, T01RM75_A129BarCod, T01RM75_A132BarCodReo, T01RM75_A130BarCodPar, T01RM75_A188BarNotLin
            }
            , new Object[] {
            T01RM76_A396EmprCod, T01RM76_A129BarCod, T01RM76_A132BarCodReo, T01RM76_A130BarCodPar, T01RM76_A758ProCod
            }
            , new Object[] {
            T01RM77_A396EmprCod, T01RM77_A129BarCod, T01RM77_A132BarCodReo, T01RM77_A130BarCodPar, T01RM77_A119BarAgrCod, T01RM77_A124BarAgrReo, T01RM77_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01RM79_A396EmprCod, T01RM79_A129BarCod, T01RM79_A132BarCodReo, T01RM79_A130BarCodPar
            }
            , new Object[] {
            T01RM80_A129BarCod, T01RM80_A132BarCodReo, T01RM80_A130BarCodPar, T01RM80_A13906BarTraDsc, T01RM80_n13906BarTraDsc, T01RM80_A396EmprCod, T01RM80_A13905BarTraID
            }
            , new Object[] {
            T01RM81_A13906BarTraDsc, T01RM81_n13906BarTraDsc
            }
            , new Object[] {
            T01RM82_A396EmprCod, T01RM82_A129BarCod, T01RM82_A132BarCodReo, T01RM82_A130BarCodPar, T01RM82_A13905BarTraID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RM85_A13906BarTraDsc, T01RM85_n13906BarTraDsc
            }
            , new Object[] {
            T01RM86_A396EmprCod, T01RM86_A129BarCod, T01RM86_A132BarCodReo, T01RM86_A130BarCodPar, T01RM86_A13905BarTraID
            }
            , new Object[] {
            T01RM87_A407EmprNom, T01RM87_n407EmprNom
            }
         }
      );
      Z130BarCodPar = "" ;
      n130BarCodPar = false ;
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      Z132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      Z129BarCod = 0 ;
      n129BarCod = false ;
      A129BarCod = 0 ;
      n129BarCod = false ;
      Z396EmprCod = "" ;
      n396EmprCod = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte GXv_int3[] ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short nRcdDeleted_1877 ;
   private short nRcdExists_1877 ;
   private short nIsMod_1877 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1877 ;
   private short RcdFound1877 ;
   private short nBlankRcdUsr1877 ;
   private short RcdFound12 ;
   private short nIsDirty_12 ;
   private short nIsDirty_1877 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1877_Enabled ;
   private int edtBarTraID_Enabled ;
   private int edtBarTraDsc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GX_JID ;
   private int GXv_int2[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarTraID_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z2759BarMaqGru ;
   private String Z180BarMaqCod ;
   private String Z13905BarTraID ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A13905BarTraID ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1877 ;
   private String edtavnRcdDeleted_1877_Internalname ;
   private String edtBarTraID_Internalname ;
   private String edtBarTraDsc_Internalname ;
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
   private String A2759BarMaqGru ;
   private String A180BarMaqCod ;
   private String A365DisDes ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode12 ;
   private String GXCCtl ;
   private String A13906BarTraDsc ;
   private String Z365DisDes ;
   private String Z407EmprNom ;
   private String Z13906BarTraDsc ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1877_Jsonclick ;
   private String edtBarTraID_Jsonclick ;
   private String edtBarTraDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ2759BarMaqGru ;
   private String ZZ180BarMaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ365DisDes ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n396EmprCod ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean n13906BarTraDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RM7_A407EmprNom ;
   private boolean[] T01RM7_n407EmprNom ;
   private int[] T01RM8_A252CliCod ;
   private boolean[] T01RM8_n252CliCod ;
   private String[] T01RM8_A365DisDes ;
   private int[] T01RM9_A361DisCod ;
   private String[] T01RM9_A2759BarMaqGru ;
   private int[] T01RM9_A129BarCod ;
   private boolean[] T01RM9_n129BarCod ;
   private byte[] T01RM9_A132BarCodReo ;
   private boolean[] T01RM9_n132BarCodReo ;
   private String[] T01RM9_A130BarCodPar ;
   private boolean[] T01RM9_n130BarCodPar ;
   private String[] T01RM9_A180BarMaqCod ;
   private String[] T01RM9_A407EmprNom ;
   private boolean[] T01RM9_n407EmprNom ;
   private int[] T01RM9_A252CliCod ;
   private boolean[] T01RM9_n252CliCod ;
   private String[] T01RM9_A365DisDes ;
   private String[] T01RM9_A396EmprCod ;
   private boolean[] T01RM9_n396EmprCod ;
   private String[] T01RM10_A396EmprCod ;
   private boolean[] T01RM10_n396EmprCod ;
   private int[] T01RM10_A129BarCod ;
   private boolean[] T01RM10_n129BarCod ;
   private byte[] T01RM10_A132BarCodReo ;
   private boolean[] T01RM10_n132BarCodReo ;
   private String[] T01RM10_A130BarCodPar ;
   private boolean[] T01RM10_n130BarCodPar ;
   private int[] T01RM6_A361DisCod ;
   private String[] T01RM6_A2759BarMaqGru ;
   private int[] T01RM6_A129BarCod ;
   private boolean[] T01RM6_n129BarCod ;
   private byte[] T01RM6_A132BarCodReo ;
   private boolean[] T01RM6_n132BarCodReo ;
   private String[] T01RM6_A130BarCodPar ;
   private boolean[] T01RM6_n130BarCodPar ;
   private String[] T01RM6_A180BarMaqCod ;
   private String[] T01RM6_A396EmprCod ;
   private boolean[] T01RM6_n396EmprCod ;
   private int[] T01RM6_A252CliCod ;
   private boolean[] T01RM6_n252CliCod ;
   private String[] T01RM6_A365DisDes ;
   private String[] T01RM11_A396EmprCod ;
   private boolean[] T01RM11_n396EmprCod ;
   private int[] T01RM11_A129BarCod ;
   private boolean[] T01RM11_n129BarCod ;
   private byte[] T01RM11_A132BarCodReo ;
   private boolean[] T01RM11_n132BarCodReo ;
   private String[] T01RM11_A130BarCodPar ;
   private boolean[] T01RM11_n130BarCodPar ;
   private String[] T01RM12_A396EmprCod ;
   private boolean[] T01RM12_n396EmprCod ;
   private int[] T01RM12_A129BarCod ;
   private boolean[] T01RM12_n129BarCod ;
   private byte[] T01RM12_A132BarCodReo ;
   private boolean[] T01RM12_n132BarCodReo ;
   private String[] T01RM12_A130BarCodPar ;
   private boolean[] T01RM12_n130BarCodPar ;
   private int[] T01RM5_A361DisCod ;
   private String[] T01RM5_A2759BarMaqGru ;
   private int[] T01RM5_A129BarCod ;
   private boolean[] T01RM5_n129BarCod ;
   private byte[] T01RM5_A132BarCodReo ;
   private boolean[] T01RM5_n132BarCodReo ;
   private String[] T01RM5_A130BarCodPar ;
   private boolean[] T01RM5_n130BarCodPar ;
   private String[] T01RM5_A180BarMaqCod ;
   private String[] T01RM5_A396EmprCod ;
   private boolean[] T01RM5_n396EmprCod ;
   private int[] T01RM5_A252CliCod ;
   private boolean[] T01RM5_n252CliCod ;
   private String[] T01RM5_A365DisDes ;
   private long[] T01RM16_A14681MRPrId ;
   private String[] T01RM17_A5921XCjaDis ;
   private long[] T01RM17_A5922XCjaCod ;
   private String[] T01RM18_A396EmprCod ;
   private boolean[] T01RM18_n396EmprCod ;
   private int[] T01RM18_A129BarCod ;
   private boolean[] T01RM18_n129BarCod ;
   private byte[] T01RM18_A132BarCodReo ;
   private boolean[] T01RM18_n132BarCodReo ;
   private String[] T01RM18_A130BarCodPar ;
   private boolean[] T01RM18_n130BarCodPar ;
   private short[] T01RM18_A14152MEnvOrd ;
   private String[] T01RM19_A396EmprCod ;
   private boolean[] T01RM19_n396EmprCod ;
   private int[] T01RM19_A129BarCod ;
   private boolean[] T01RM19_n129BarCod ;
   private byte[] T01RM19_A132BarCodReo ;
   private boolean[] T01RM19_n132BarCodReo ;
   private String[] T01RM19_A130BarCodPar ;
   private boolean[] T01RM19_n130BarCodPar ;
   private byte[] T01RM19_A13093BarDGLin ;
   private String[] T01RM19_A13094BarDGDibCl ;
   private int[] T01RM19_A13095BarDGDibIn ;
   private String[] T01RM19_A13096BarDGComb ;
   private String[] T01RM19_A13097BarDGFOndo ;
   private String[] T01RM20_A396EmprCod ;
   private boolean[] T01RM20_n396EmprCod ;
   private int[] T01RM20_A11917Ebd_numero ;
   private String[] T01RM21_A396EmprCod ;
   private boolean[] T01RM21_n396EmprCod ;
   private int[] T01RM21_A11898Prd_numero ;
   private String[] T01RM22_A396EmprCod ;
   private boolean[] T01RM22_n396EmprCod ;
   private int[] T01RM22_A11849Cte_numero ;
   private String[] T01RM23_A396EmprCod ;
   private boolean[] T01RM23_n396EmprCod ;
   private int[] T01RM23_A11791Ap_numero ;
   private String[] T01RM24_A396EmprCod ;
   private boolean[] T01RM24_n396EmprCod ;
   private int[] T01RM24_A3985CalBarCod ;
   private byte[] T01RM24_A3986CalBarCodR ;
   private String[] T01RM24_A3987CalBarCodP ;
   private String[] T01RM25_A396EmprCod ;
   private boolean[] T01RM25_n396EmprCod ;
   private java.util.Date[] T01RM25_A5294InPTime ;
   private int[] T01RM25_A652OpeCod ;
   private String[] T01RM26_A396EmprCod ;
   private boolean[] T01RM26_n396EmprCod ;
   private int[] T01RM26_A129BarCod ;
   private boolean[] T01RM26_n129BarCod ;
   private byte[] T01RM26_A132BarCodReo ;
   private boolean[] T01RM26_n132BarCodReo ;
   private String[] T01RM26_A130BarCodPar ;
   private boolean[] T01RM26_n130BarCodPar ;
   private int[] T01RM26_A4118tinagrcod ;
   private byte[] T01RM26_A4119tinagrreo ;
   private String[] T01RM26_A4120tinagrpar ;
   private String[] T01RM27_A396EmprCod ;
   private boolean[] T01RM27_n396EmprCod ;
   private int[] T01RM27_A129BarCod ;
   private boolean[] T01RM27_n129BarCod ;
   private byte[] T01RM27_A132BarCodReo ;
   private boolean[] T01RM27_n132BarCodReo ;
   private String[] T01RM27_A130BarCodPar ;
   private boolean[] T01RM27_n130BarCodPar ;
   private int[] T01RM27_A4080estagrcod ;
   private byte[] T01RM27_A4081estagrreo ;
   private String[] T01RM27_A4082estagrpar ;
   private String[] T01RM28_A396EmprCod ;
   private boolean[] T01RM28_n396EmprCod ;
   private int[] T01RM28_A129BarCod ;
   private boolean[] T01RM28_n129BarCod ;
   private byte[] T01RM28_A132BarCodReo ;
   private boolean[] T01RM28_n132BarCodReo ;
   private String[] T01RM28_A130BarCodPar ;
   private boolean[] T01RM28_n130BarCodPar ;
   private byte[] T01RM28_A4075recestncol ;
   private byte[] T01RM28_A4076recestnpro ;
   private String[] T01RM29_A396EmprCod ;
   private boolean[] T01RM29_n396EmprCod ;
   private String[] T01RM29_A602MaqCod ;
   private String[] T01RM29_A1142MaqFCod ;
   private short[] T01RM29_A3068PlaEtaOrd ;
   private byte[] T01RM29_A3069PlaEtaOrdA ;
   private int[] T01RM29_A129BarCod ;
   private boolean[] T01RM29_n129BarCod ;
   private byte[] T01RM29_A132BarCodReo ;
   private boolean[] T01RM29_n132BarCodReo ;
   private String[] T01RM29_A130BarCodPar ;
   private boolean[] T01RM29_n130BarCodPar ;
   private String[] T01RM30_A396EmprCod ;
   private boolean[] T01RM30_n396EmprCod ;
   private int[] T01RM30_A129BarCod ;
   private boolean[] T01RM30_n129BarCod ;
   private byte[] T01RM30_A132BarCodReo ;
   private boolean[] T01RM30_n132BarCodReo ;
   private String[] T01RM30_A130BarCodPar ;
   private boolean[] T01RM30_n130BarCodPar ;
   private short[] T01RM30_A4846BarAudLin ;
   private String[] T01RM31_A396EmprCod ;
   private boolean[] T01RM31_n396EmprCod ;
   private int[] T01RM31_A129BarCod ;
   private boolean[] T01RM31_n129BarCod ;
   private byte[] T01RM31_A132BarCodReo ;
   private boolean[] T01RM31_n132BarCodReo ;
   private String[] T01RM31_A130BarCodPar ;
   private boolean[] T01RM31_n130BarCodPar ;
   private short[] T01RM31_A3940BarEnsLin ;
   private String[] T01RM32_A396EmprCod ;
   private boolean[] T01RM32_n396EmprCod ;
   private int[] T01RM32_A129BarCod ;
   private boolean[] T01RM32_n129BarCod ;
   private byte[] T01RM32_A132BarCodReo ;
   private boolean[] T01RM32_n132BarCodReo ;
   private String[] T01RM32_A130BarCodPar ;
   private boolean[] T01RM32_n130BarCodPar ;
   private int[] T01RM32_A3384RefBarCod ;
   private byte[] T01RM32_A3385RefBarReo ;
   private String[] T01RM32_A3386RefBarPar ;
   private String[] T01RM33_A396EmprCod ;
   private boolean[] T01RM33_n396EmprCod ;
   private int[] T01RM33_A10914SolSalCod ;
   private String[] T01RM34_A396EmprCod ;
   private boolean[] T01RM34_n396EmprCod ;
   private int[] T01RM34_A10364Ph_numero ;
   private String[] T01RM35_A396EmprCod ;
   private boolean[] T01RM35_n396EmprCod ;
   private int[] T01RM35_A129BarCod ;
   private boolean[] T01RM35_n129BarCod ;
   private byte[] T01RM35_A132BarCodReo ;
   private boolean[] T01RM35_n132BarCodReo ;
   private String[] T01RM35_A130BarCodPar ;
   private boolean[] T01RM35_n130BarCodPar ;
   private String[] T01RM35_A10197ProEspCod ;
   private String[] T01RM36_A396EmprCod ;
   private boolean[] T01RM36_n396EmprCod ;
   private int[] T01RM36_A129BarCod ;
   private boolean[] T01RM36_n129BarCod ;
   private byte[] T01RM36_A132BarCodReo ;
   private boolean[] T01RM36_n132BarCodReo ;
   private String[] T01RM36_A130BarCodPar ;
   private boolean[] T01RM36_n130BarCodPar ;
   private int[] T01RM36_A5322Dp_Nrecep ;
   private String[] T01RM37_A396EmprCod ;
   private boolean[] T01RM37_n396EmprCod ;
   private int[] T01RM37_A129BarCod ;
   private boolean[] T01RM37_n129BarCod ;
   private byte[] T01RM37_A132BarCodReo ;
   private boolean[] T01RM37_n132BarCodReo ;
   private String[] T01RM37_A130BarCodPar ;
   private boolean[] T01RM37_n130BarCodPar ;
   private int[] T01RM37_A8569EntSecLn ;
   private String[] T01RM38_A396EmprCod ;
   private boolean[] T01RM38_n396EmprCod ;
   private int[] T01RM38_A7434PLLNro ;
   private short[] T01RM38_A7443LPLNro ;
   private short[] T01RM38_A7459CPLCom ;
   private int[] T01RM38_A129BarCod ;
   private boolean[] T01RM38_n129BarCod ;
   private byte[] T01RM38_A132BarCodReo ;
   private boolean[] T01RM38_n132BarCodReo ;
   private String[] T01RM38_A130BarCodPar ;
   private boolean[] T01RM38_n130BarCodPar ;
   private String[] T01RM39_A396EmprCod ;
   private boolean[] T01RM39_n396EmprCod ;
   private int[] T01RM39_A7145OSSCod ;
   private String[] T01RM40_A396EmprCod ;
   private boolean[] T01RM40_n396EmprCod ;
   private int[] T01RM40_A7049OGSCod ;
   private String[] T01RM41_A396EmprCod ;
   private boolean[] T01RM41_n396EmprCod ;
   private int[] T01RM41_A129BarCod ;
   private boolean[] T01RM41_n129BarCod ;
   private byte[] T01RM41_A132BarCodReo ;
   private boolean[] T01RM41_n132BarCodReo ;
   private String[] T01RM41_A130BarCodPar ;
   private boolean[] T01RM41_n130BarCodPar ;
   private int[] T01RM41_A6031Ac_Barcod ;
   private byte[] T01RM41_A6032Ac_BarReo ;
   private String[] T01RM41_A6033Ac_BarPar ;
   private String[] T01RM42_A396EmprCod ;
   private boolean[] T01RM42_n396EmprCod ;
   private int[] T01RM42_A129BarCod ;
   private boolean[] T01RM42_n129BarCod ;
   private byte[] T01RM42_A132BarCodReo ;
   private boolean[] T01RM42_n132BarCodReo ;
   private String[] T01RM42_A130BarCodPar ;
   private boolean[] T01RM42_n130BarCodPar ;
   private int[] T01RM42_A5908PartPal ;
   private String[] T01RM43_A396EmprCod ;
   private boolean[] T01RM43_n396EmprCod ;
   private int[] T01RM43_A129BarCod ;
   private boolean[] T01RM43_n129BarCod ;
   private byte[] T01RM43_A132BarCodReo ;
   private boolean[] T01RM43_n132BarCodReo ;
   private String[] T01RM43_A130BarCodPar ;
   private boolean[] T01RM43_n130BarCodPar ;
   private byte[] T01RM43_A2524DisComLin ;
   private String[] T01RM43_A1056DisComCod ;
   private String[] T01RM43_A1032FonCod ;
   private String[] T01RM44_A396EmprCod ;
   private boolean[] T01RM44_n396EmprCod ;
   private long[] T01RM44_A1736AlbExtCod ;
   private int[] T01RM44_A129BarCod ;
   private boolean[] T01RM44_n129BarCod ;
   private byte[] T01RM44_A132BarCodReo ;
   private boolean[] T01RM44_n132BarCodReo ;
   private String[] T01RM44_A130BarCodPar ;
   private boolean[] T01RM44_n130BarCodPar ;
   private String[] T01RM45_A396EmprCod ;
   private boolean[] T01RM45_n396EmprCod ;
   private int[] T01RM45_A129BarCod ;
   private boolean[] T01RM45_n129BarCod ;
   private byte[] T01RM45_A132BarCodReo ;
   private boolean[] T01RM45_n132BarCodReo ;
   private String[] T01RM45_A130BarCodPar ;
   private boolean[] T01RM45_n130BarCodPar ;
   private int[] T01RM45_A3753BarFoaCod ;
   private byte[] T01RM45_A3754BarFoaReo ;
   private String[] T01RM45_A3755BarFoaPar ;
   private String[] T01RM46_A396EmprCod ;
   private boolean[] T01RM46_n396EmprCod ;
   private int[] T01RM46_A129BarCod ;
   private boolean[] T01RM46_n129BarCod ;
   private byte[] T01RM46_A132BarCodReo ;
   private boolean[] T01RM46_n132BarCodReo ;
   private String[] T01RM46_A130BarCodPar ;
   private boolean[] T01RM46_n130BarCodPar ;
   private int[] T01RM46_A3747BarPegCod ;
   private byte[] T01RM46_A3748BarPegReo ;
   private String[] T01RM46_A3749BarPegPar ;
   private String[] T01RM47_A396EmprCod ;
   private boolean[] T01RM47_n396EmprCod ;
   private int[] T01RM47_A3253SolTraCod ;
   private String[] T01RM48_A396EmprCod ;
   private boolean[] T01RM48_n396EmprCod ;
   private int[] T01RM48_A3235SolSubCod ;
   private String[] T01RM49_A396EmprCod ;
   private boolean[] T01RM49_n396EmprCod ;
   private int[] T01RM49_A3218SolLuzCod ;
   private String[] T01RM50_A396EmprCod ;
   private boolean[] T01RM50_n396EmprCod ;
   private int[] T01RM50_A3196SolFriCod ;
   private String[] T01RM51_A396EmprCod ;
   private boolean[] T01RM51_n396EmprCod ;
   private int[] T01RM51_A3165SolPilCod ;
   private String[] T01RM52_A396EmprCod ;
   private boolean[] T01RM52_n396EmprCod ;
   private int[] T01RM52_A129BarCod ;
   private boolean[] T01RM52_n129BarCod ;
   private byte[] T01RM52_A132BarCodReo ;
   private boolean[] T01RM52_n132BarCodReo ;
   private String[] T01RM52_A130BarCodPar ;
   private boolean[] T01RM52_n130BarCodPar ;
   private short[] T01RM52_A2872HAnRLinMaq ;
   private byte[] T01RM52_A2873HAnRLinPro ;
   private short[] T01RM52_A2874HAnRLin ;
   private byte[] T01RM52_A2875HAnNumAny ;
   private String[] T01RM53_A396EmprCod ;
   private boolean[] T01RM53_n396EmprCod ;
   private String[] T01RM53_A2817PlaTer ;
   private short[] T01RM53_A2818PlaOrd ;
   private String[] T01RM54_A396EmprCod ;
   private boolean[] T01RM54_n396EmprCod ;
   private String[] T01RM54_A2809MetTerCod ;
   private int[] T01RM54_A129BarCod ;
   private boolean[] T01RM54_n129BarCod ;
   private byte[] T01RM54_A132BarCodReo ;
   private boolean[] T01RM54_n132BarCodReo ;
   private String[] T01RM54_A130BarCodPar ;
   private boolean[] T01RM54_n130BarCodPar ;
   private String[] T01RM55_A396EmprCod ;
   private boolean[] T01RM55_n396EmprCod ;
   private int[] T01RM55_A129BarCod ;
   private boolean[] T01RM55_n129BarCod ;
   private byte[] T01RM55_A132BarCodReo ;
   private boolean[] T01RM55_n132BarCodReo ;
   private String[] T01RM55_A130BarCodPar ;
   private boolean[] T01RM55_n130BarCodPar ;
   private short[] T01RM55_A2808RecLinMAL ;
   private byte[] T01RM55_A1377RecNumAny ;
   private String[] T01RM55_A719PrdNum ;
   private String[] T01RM56_A396EmprCod ;
   private boolean[] T01RM56_n396EmprCod ;
   private int[] T01RM56_A129BarCod ;
   private boolean[] T01RM56_n129BarCod ;
   private byte[] T01RM56_A132BarCodReo ;
   private boolean[] T01RM56_n132BarCodReo ;
   private String[] T01RM56_A130BarCodPar ;
   private boolean[] T01RM56_n130BarCodPar ;
   private short[] T01RM56_A2804RecLinMaq ;
   private String[] T01RM57_A396EmprCod ;
   private boolean[] T01RM57_n396EmprCod ;
   private String[] T01RM57_A2792TermiCod ;
   private int[] T01RM57_A129BarCod ;
   private boolean[] T01RM57_n129BarCod ;
   private byte[] T01RM57_A132BarCodReo ;
   private boolean[] T01RM57_n132BarCodReo ;
   private String[] T01RM57_A130BarCodPar ;
   private boolean[] T01RM57_n130BarCodPar ;
   private String[] T01RM58_A396EmprCod ;
   private boolean[] T01RM58_n396EmprCod ;
   private short[] T01RM58_A2248ManCod ;
   private java.util.Date[] T01RM58_A2711RpExHdFe ;
   private short[] T01RM58_A2713RpExHdLi ;
   private String[] T01RM59_A396EmprCod ;
   private boolean[] T01RM59_n396EmprCod ;
   private short[] T01RM59_A2248ManCod ;
   private String[] T01RM59_A2689ExHdrFas ;
   private int[] T01RM59_A2692ExHdrLin ;
   private String[] T01RM60_A396EmprCod ;
   private boolean[] T01RM60_n396EmprCod ;
   private int[] T01RM60_A129BarCod ;
   private boolean[] T01RM60_n129BarCod ;
   private byte[] T01RM60_A132BarCodReo ;
   private boolean[] T01RM60_n132BarCodReo ;
   private String[] T01RM60_A130BarCodPar ;
   private boolean[] T01RM60_n130BarCodPar ;
   private String[] T01RM60_A2494BarDosPro ;
   private String[] T01RM60_A719PrdNum ;
   private String[] T01RM61_A396EmprCod ;
   private boolean[] T01RM61_n396EmprCod ;
   private String[] T01RM61_A602MaqCod ;
   private java.util.Date[] T01RM61_A2461PlaFecTin ;
   private int[] T01RM61_A129BarCod ;
   private boolean[] T01RM61_n129BarCod ;
   private byte[] T01RM61_A132BarCodReo ;
   private boolean[] T01RM61_n132BarCodReo ;
   private String[] T01RM61_A130BarCodPar ;
   private boolean[] T01RM61_n130BarCodPar ;
   private String[] T01RM62_A396EmprCod ;
   private boolean[] T01RM62_n396EmprCod ;
   private int[] T01RM62_A129BarCod ;
   private boolean[] T01RM62_n129BarCod ;
   private byte[] T01RM62_A132BarCodReo ;
   private boolean[] T01RM62_n132BarCodReo ;
   private String[] T01RM62_A130BarCodPar ;
   private boolean[] T01RM62_n130BarCodPar ;
   private short[] T01RM62_A2457BarObLin ;
   private String[] T01RM63_A396EmprCod ;
   private boolean[] T01RM63_n396EmprCod ;
   private int[] T01RM63_A129BarCod ;
   private boolean[] T01RM63_n129BarCod ;
   private byte[] T01RM63_A132BarCodReo ;
   private boolean[] T01RM63_n132BarCodReo ;
   private String[] T01RM63_A130BarCodPar ;
   private boolean[] T01RM63_n130BarCodPar ;
   private short[] T01RM63_A2444BarEnLin ;
   private String[] T01RM64_A396EmprCod ;
   private boolean[] T01RM64_n396EmprCod ;
   private int[] T01RM64_A2406ExhAlbCod ;
   private int[] T01RM64_A129BarCod ;
   private boolean[] T01RM64_n129BarCod ;
   private byte[] T01RM64_A132BarCodReo ;
   private boolean[] T01RM64_n132BarCodReo ;
   private String[] T01RM64_A130BarCodPar ;
   private boolean[] T01RM64_n130BarCodPar ;
   private String[] T01RM65_A396EmprCod ;
   private boolean[] T01RM65_n396EmprCod ;
   private int[] T01RM65_A2253SalExtAlb ;
   private int[] T01RM65_A129BarCod ;
   private boolean[] T01RM65_n129BarCod ;
   private byte[] T01RM65_A132BarCodReo ;
   private boolean[] T01RM65_n132BarCodReo ;
   private String[] T01RM65_A130BarCodPar ;
   private boolean[] T01RM65_n130BarCodPar ;
   private String[] T01RM66_A396EmprCod ;
   private boolean[] T01RM66_n396EmprCod ;
   private long[] T01RM66_A30AlbProCod ;
   private int[] T01RM66_A129BarCod ;
   private boolean[] T01RM66_n129BarCod ;
   private byte[] T01RM66_A132BarCodReo ;
   private boolean[] T01RM66_n132BarCodReo ;
   private String[] T01RM66_A130BarCodPar ;
   private boolean[] T01RM66_n130BarCodPar ;
   private String[] T01RM67_A396EmprCod ;
   private boolean[] T01RM67_n396EmprCod ;
   private int[] T01RM67_A1348SolColCod ;
   private String[] T01RM68_A396EmprCod ;
   private boolean[] T01RM68_n396EmprCod ;
   private int[] T01RM68_A1333EstDimCod ;
   private String[] T01RM69_A396EmprCod ;
   private boolean[] T01RM69_n396EmprCod ;
   private int[] T01RM69_A1314EnsLabCod ;
   private String[] T01RM70_A396EmprCod ;
   private boolean[] T01RM70_n396EmprCod ;
   private int[] T01RM70_A129BarCod ;
   private boolean[] T01RM70_n129BarCod ;
   private byte[] T01RM70_A132BarCodReo ;
   private boolean[] T01RM70_n132BarCodReo ;
   private String[] T01RM70_A130BarCodPar ;
   private boolean[] T01RM70_n130BarCodPar ;
   private byte[] T01RM70_A906ObsReoLin ;
   private String[] T01RM71_A396EmprCod ;
   private boolean[] T01RM71_n396EmprCod ;
   private int[] T01RM71_A859CumCodCont ;
   private String[] T01RM72_A396EmprCod ;
   private boolean[] T01RM72_n396EmprCod ;
   private String[] T01RM72_A602MaqCod ;
   private java.util.Date[] T01RM72_A558HisProFec ;
   private int[] T01RM72_A561HisProLin ;
   private String[] T01RM73_A396EmprCod ;
   private boolean[] T01RM73_n396EmprCod ;
   private int[] T01RM73_A252CliCod ;
   private boolean[] T01RM73_n252CliCod ;
   private String[] T01RM73_A494ForSer ;
   private String[] T01RM73_A482ForColNom ;
   private int[] T01RM73_A483ForColNum ;
   private byte[] T01RM73_A831TipColCod ;
   private String[] T01RM74_A396EmprCod ;
   private boolean[] T01RM74_n396EmprCod ;
   private int[] T01RM74_A129BarCod ;
   private boolean[] T01RM74_n129BarCod ;
   private byte[] T01RM74_A132BarCodReo ;
   private boolean[] T01RM74_n132BarCodReo ;
   private String[] T01RM74_A130BarCodPar ;
   private boolean[] T01RM74_n130BarCodPar ;
   private String[] T01RM74_A200BarPieCod ;
   private String[] T01RM75_A396EmprCod ;
   private boolean[] T01RM75_n396EmprCod ;
   private int[] T01RM75_A129BarCod ;
   private boolean[] T01RM75_n129BarCod ;
   private byte[] T01RM75_A132BarCodReo ;
   private boolean[] T01RM75_n132BarCodReo ;
   private String[] T01RM75_A130BarCodPar ;
   private boolean[] T01RM75_n130BarCodPar ;
   private byte[] T01RM75_A188BarNotLin ;
   private String[] T01RM76_A396EmprCod ;
   private boolean[] T01RM76_n396EmprCod ;
   private int[] T01RM76_A129BarCod ;
   private boolean[] T01RM76_n129BarCod ;
   private byte[] T01RM76_A132BarCodReo ;
   private boolean[] T01RM76_n132BarCodReo ;
   private String[] T01RM76_A130BarCodPar ;
   private boolean[] T01RM76_n130BarCodPar ;
   private String[] T01RM76_A758ProCod ;
   private String[] T01RM77_A396EmprCod ;
   private boolean[] T01RM77_n396EmprCod ;
   private int[] T01RM77_A129BarCod ;
   private boolean[] T01RM77_n129BarCod ;
   private byte[] T01RM77_A132BarCodReo ;
   private boolean[] T01RM77_n132BarCodReo ;
   private String[] T01RM77_A130BarCodPar ;
   private boolean[] T01RM77_n130BarCodPar ;
   private int[] T01RM77_A119BarAgrCod ;
   private byte[] T01RM77_A124BarAgrReo ;
   private String[] T01RM77_A122BarAgrPar ;
   private String[] T01RM79_A396EmprCod ;
   private boolean[] T01RM79_n396EmprCod ;
   private int[] T01RM79_A129BarCod ;
   private boolean[] T01RM79_n129BarCod ;
   private byte[] T01RM79_A132BarCodReo ;
   private boolean[] T01RM79_n132BarCodReo ;
   private String[] T01RM79_A130BarCodPar ;
   private boolean[] T01RM79_n130BarCodPar ;
   private int[] T01RM80_A129BarCod ;
   private boolean[] T01RM80_n129BarCod ;
   private byte[] T01RM80_A132BarCodReo ;
   private boolean[] T01RM80_n132BarCodReo ;
   private String[] T01RM80_A130BarCodPar ;
   private boolean[] T01RM80_n130BarCodPar ;
   private String[] T01RM80_A13906BarTraDsc ;
   private boolean[] T01RM80_n13906BarTraDsc ;
   private String[] T01RM80_A396EmprCod ;
   private boolean[] T01RM80_n396EmprCod ;
   private String[] T01RM80_A13905BarTraID ;
   private String[] T01RM4_A13906BarTraDsc ;
   private boolean[] T01RM4_n13906BarTraDsc ;
   private String[] T01RM81_A13906BarTraDsc ;
   private boolean[] T01RM81_n13906BarTraDsc ;
   private String[] T01RM82_A396EmprCod ;
   private boolean[] T01RM82_n396EmprCod ;
   private int[] T01RM82_A129BarCod ;
   private boolean[] T01RM82_n129BarCod ;
   private byte[] T01RM82_A132BarCodReo ;
   private boolean[] T01RM82_n132BarCodReo ;
   private String[] T01RM82_A130BarCodPar ;
   private boolean[] T01RM82_n130BarCodPar ;
   private String[] T01RM82_A13905BarTraID ;
   private int[] T01RM3_A129BarCod ;
   private boolean[] T01RM3_n129BarCod ;
   private byte[] T01RM3_A132BarCodReo ;
   private boolean[] T01RM3_n132BarCodReo ;
   private String[] T01RM3_A130BarCodPar ;
   private boolean[] T01RM3_n130BarCodPar ;
   private String[] T01RM3_A396EmprCod ;
   private boolean[] T01RM3_n396EmprCod ;
   private String[] T01RM3_A13905BarTraID ;
   private int[] T01RM2_A129BarCod ;
   private boolean[] T01RM2_n129BarCod ;
   private byte[] T01RM2_A132BarCodReo ;
   private boolean[] T01RM2_n132BarCodReo ;
   private String[] T01RM2_A130BarCodPar ;
   private boolean[] T01RM2_n130BarCodPar ;
   private String[] T01RM2_A396EmprCod ;
   private boolean[] T01RM2_n396EmprCod ;
   private String[] T01RM2_A13905BarTraID ;
   private String[] T01RM85_A13906BarTraDsc ;
   private boolean[] T01RM85_n13906BarTraDsc ;
   private String[] T01RM86_A396EmprCod ;
   private boolean[] T01RM86_n396EmprCod ;
   private int[] T01RM86_A129BarCod ;
   private boolean[] T01RM86_n129BarCod ;
   private byte[] T01RM86_A132BarCodReo ;
   private boolean[] T01RM86_n132BarCodReo ;
   private String[] T01RM86_A130BarCodPar ;
   private boolean[] T01RM86_n130BarCodPar ;
   private String[] T01RM86_A13905BarTraID ;
   private String[] T01RM87_A407EmprNom ;
   private boolean[] T01RM87_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbartti__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartti__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartti__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartti__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbartti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RM2", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarTraID = ?  FOR UPDATE OF BarCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RM3", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarTraID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RM4", "SELECT TRADsc AS BarTraDsc FROM TXPTRATIN WHERE EmprCod = ? AND TRAID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM5", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF DisCod, BarMaqGru, BarMaqCod, CliCod, DisDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM6", "SELECT DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM8", "SELECT CliCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM9", "SELECT /*+ FIRST_ROWS(1) */ TM1.DisCod, TM1.BarMaqGru, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarMaqCod, T2.EmprNom, TM1.CliCod, TM1.DisDes, TM1.EmprCod FROM (TXPBARCAD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RM13", "INSERT INTO TXPBARCAD(DisDes, DisCod, BarMaqGru, BarCod, BarCodReo, BarCodPar, BarMaqCod, EmprCod, CliCod, BarAgrEst, BarVolMaq, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01RM14", "UPDATE TXPBARCAD SET DisDes=?, DisCod=?, BarMaqGru=?, BarMaqCod=?, CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new UpdateCursor("T01RM15", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPBARCAD")
         ,new ForEachCursor("T01RM16", "SELECT * FROM (SELECT MRPrId FROM MRPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM17", "SELECT * FROM (SELECT XCjaDis, XCjaCod FROM TXPXCaCja WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDGLin, BarDGDibCl, BarDGDibIn, BarDGComb, BarDGFOndo FROM TXPDIGBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM20", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM21", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM22", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM23", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM24", "SELECT * FROM (SELECT EmprCod, CalBarCod, CalBarCodR, CalBarCodP FROM TXPCALJBP WHERE EmprCod = ? AND CalBarCod = ? AND CalBarCodR = ? AND CalBarCodP = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM25", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, tinagrcod, tinagrreo, tinagrpar FROM TXPtinagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, estagrcod, estagrreo, estagrpar FROM TXPestagr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM29", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAudLin FROM TXPBARAUD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnsLin FROM TXPBARENS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RefBarCod, RefBarReo, RefBarPar FROM TXPREFHDR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM33", "SELECT * FROM (SELECT EmprCod, SolSalCod FROM TXPSOLSAL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM34", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProEspCod FROM TXPBarPE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn FROM TXPENTSEC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM38", "SELECT * FROM (SELECT EmprCod, PLLNro, LPLNro, CPLCom, BarCod, BarCodReo, BarCodPar FROM TXPPLLBar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM39", "SELECT * FROM (SELECT EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM40", "SELECT * FROM (SELECT EmprCod, OGSCod FROM TXPShaGra WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM42", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, PartPal FROM TXPPalSal WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM43", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPBARCOM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM44", "SELECT * FROM (SELECT EmprCod, AlbExtCod, BarCod, BarCodReo, BarCodPar FROM TXPLALEXT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM45", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFoaCod, BarFoaReo, BarFoaPar FROM TXPBARFOA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM46", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPegCod, BarPegReo, BarPegPar FROM TXPBARPEG WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM47", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM48", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM49", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM50", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM51", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM52", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM53", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM54", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM55", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM56", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM57", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM58", "SELECT * FROM (SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM59", "SELECT * FROM (SELECT EmprCod, ManCod, ExHdrFas, ExHdrLin FROM TXPLEXMVH WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM60", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM61", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin, BarCod, BarCodReo, BarCodPar FROM TXPLPLATI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM64", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM65", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM66", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM67", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM68", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM69", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM70", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM71", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM72", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM73", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM74", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM75", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM76", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM77", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RM78", "UPDATE TXPINCPRO SET CliCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPINCPRO")
         ,new ForEachCursor("T01RM79", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RM80", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.TRADsc AS BarTraDsc, T1.EmprCod, T1.BarTraID AS BarTraID FROM (TXPBARTTI T1 INNER JOIN TXPTRATIN T2 ON T2.EmprCod = T1.EmprCod AND T2.TRAID = T1.BarTraID) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarTraID = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTraID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RM81", "SELECT TRADsc AS BarTraDsc FROM TXPTRATIN WHERE EmprCod = ? AND TRAID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RM82", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarTraID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RM83", "INSERT INTO TXPBARTTI(BarCod, BarCodReo, BarCodPar, EmprCod, BarTraID) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARTTI")
         ,new UpdateCursor("T01RM84", "DELETE FROM TXPBARTTI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarTraID = ?", GX_NOMASK, "TXPBARTTI")
         ,new ForEachCursor("T01RM85", "SELECT TRADsc AS BarTraDsc FROM TXPTRATIN WHERE EmprCod = ? AND TRAID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RM86", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RM87", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 78 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 4);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 85 :
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 4);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 4);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 4);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               stmt.setString(7, (String)parms[9], 6);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 1);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 34 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 40 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 49 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 52 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 54 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 55 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 56 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 59 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 61 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 62 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 63 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 66 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 68 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 69 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 70 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 71 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 72 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 73 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 74 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 76 :
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
                  stmt.setString(2, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               return;
            case 77 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 78 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 4);
               return;
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 4);
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 4);
               return;
            case 81 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 3);
               }
               stmt.setString(5, (String)parms[8], 4);
               return;
            case 82 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 4);
               return;
            case 83 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 4);
               return;
            case 84 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

