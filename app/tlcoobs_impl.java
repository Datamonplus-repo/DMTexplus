package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlcoobs_impl extends GXDataArea
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
            A4052EstNumFor = (int)(GXutil.lval( httpContext.GetPar( "EstNumFor"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lineas Observaciones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEstNumCol_Internalname ;
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
      A4086EstObsUlt = (byte)(GXutil.lval( httpContext.GetPar( "EstObsUlt"))) ;
      n4086EstObsUlt = false ;
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

   public tlcoobs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlcoobs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlcoobs_impl.class ));
   }

   public tlcoobs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLcoobs.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero de formula Interno", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNumFor_Internalname, GXutil.ltrim( localUtil.ntoc( A4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstNumFor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4052EstNumFor), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNumFor_Jsonclick, 0, "", "", "", "", "", 1, edtEstNumFor_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Numero de color", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A4053EstNumCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4053EstNumCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4053EstNumCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNumCol_Jsonclick, 0, "", "", "", "", "", 1, edtEstNumCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea observaciones", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLcoobs.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstObsUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A4086EstObsUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstObsUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4086EstObsUlt), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4086EstObsUlt), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstObsUlt_Jsonclick, 0, "", "", "", "", "", 1, edtEstObsUlt_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLcoobs.htm");
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
         nBlankRcdCount1588 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1588 = (short)(1) ;
            scanStart1FV1588( ) ;
            while ( RcdFound1588 != 0 )
            {
               init_level_properties1588( ) ;
               getByPrimaryKey1FV1588( ) ;
               addRow1FV1588( ) ;
               scanNext1FV1588( ) ;
            }
            scanEnd1FV1588( ) ;
            nBlankRcdCount1588 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4086EstObsUlt = A4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         standaloneNotModal1FV1588( ) ;
         standaloneModal1FV1588( ) ;
         sMode1588 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1FV1588( ) ;
            edtavnRcdDeleted_1588_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1588_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1588_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1588_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtEstObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBSLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtEstobs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1588 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FV1588( ) ;
            }
            sendRow1FV1588( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1588 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4086EstObsUlt = B4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1588 = (short)(5) ;
         nRcdExists_1588 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FV1588( ) ;
            while ( RcdFound1588 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451588( ) ;
               init_level_properties1588( ) ;
               standaloneNotModal1FV1588( ) ;
               getByPrimaryKey1FV1588( ) ;
               standaloneModal1FV1588( ) ;
               addRow1FV1588( ) ;
               scanNext1FV1588( ) ;
            }
            scanEnd1FV1588( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1588 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451588( ) ;
      initAll1FV1588( ) ;
      init_level_properties1588( ) ;
      B4086EstObsUlt = A4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      nRcdExists_1588 = (short)(0) ;
      nIsMod_1588 = (short)(0) ;
      nRcdDeleted_1588 = (short)(0) ;
      nBlankRcdCount1588 = (short)(nBlankRcdUsr1588+nBlankRcdCount1588) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1588 > 0 )
      {
         standaloneNotModal1FV1588( ) ;
         standaloneModal1FV1588( ) ;
         addRow1FV1588( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstobs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1588 = (short)(nBlankRcdCount1588-1) ;
      }
      Gx_mode = sMode1588 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A4086EstObsUlt = B4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLcoobs.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLcoobs.htm");
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
      e111FV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4052EstNumFor = (int)(localUtil.ctol( httpContext.cgiGet( "Z4052EstNumFor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4053EstNumCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4053EstNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4086EstObsUlt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4086EstObsUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O4086EstObsUlt = (byte)(localUtil.ctol( httpContext.cgiGet( "O4086EstObsUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4052EstNumFor = (int)(localUtil.ctol( httpContext.cgiGet( edtEstNumFor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4053EstNumCol = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            }
            else
            {
               A4053EstNumCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            }
            A4086EstObsUlt = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4086EstObsUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
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
               A4052EstNumFor = (int)(GXutil.lval( httpContext.GetPar( "EstNumFor"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4052EstNumFor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4052EstNumFor), 8, 0));
               A4053EstNumCol = (byte)(GXutil.lval( httpContext.GetPar( "EstNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
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
                        e111FV2 ();
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
            initAll1FV1585( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1588_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1588_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1FV1585( ) ;
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

   public void confirm_1FV0( )
   {
      beforeValidate1FV1585( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FV1585( ) ;
         }
         else
         {
            checkExtendedTable1FV1585( ) ;
            if ( AnyError == 0 )
            {
               zm1FV1585( 7) ;
            }
            closeExtendedTableCursors1FV1585( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1585 = Gx_mode ;
         confirm_1FV1588( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1585 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1585 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FV0( ) ;
      }
   }

   public void confirm_1FV1588( )
   {
      s4086EstObsUlt = O4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1FV1588( ) ;
         if ( ( nRcdExists_1588 != 0 ) || ( nIsMod_1588 != 0 ) )
         {
            getKey1FV1588( ) ;
            if ( ( nRcdExists_1588 == 0 ) && ( nRcdDeleted_1588 == 0 ) )
            {
               if ( RcdFound1588 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FV1588( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FV1588( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FV1588( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4086EstObsUlt = A4086EstObsUlt ;
                     n4086EstObsUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "ESTNUMCOL");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstNumCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1588 != 0 )
               {
                  if ( nRcdDeleted_1588 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FV1588( ) ;
                     load1FV1588( ) ;
                     beforeValidate1FV1588( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FV1588( ) ;
                        O4086EstObsUlt = A4086EstObsUlt ;
                        n4086EstObsUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1588 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FV1588( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FV1588( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FV1588( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4086EstObsUlt = A4086EstObsUlt ;
                           n4086EstObsUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1588 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ESTNUMCOL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstNumCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1588_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4087EstObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstobs_Internalname, GXutil.rtrim( A4088Estobs)) ;
         httpContext.changePostValue( "ZT_"+"Z4087EstObsLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4087EstObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4088Estobs_"+sGXsfl_45_idx, GXutil.rtrim( Z4088Estobs)) ;
         httpContext.changePostValue( "nRcdDeleted_1588_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1588_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1588_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1588 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1588_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1588_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBSLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4086EstObsUlt = s4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FV0( )
   {
   }

   public void e111FV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tlcoobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      AV10Lit1 = httpContext.getMessage( "OBSERVACIONES COLOR", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tlcoobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlcoobs_impl.this.A396EmprCod = GXv_char2[0] ;
      tlcoobs_impl.this.AV11EmprNom = GXv_char3[0] ;
      tlcoobs_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1FV1585( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4086EstObsUlt = T01FV5_A4086EstObsUlt[0] ;
         }
         else
         {
            Z4086EstObsUlt = A4086EstObsUlt ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         Z4086EstObsUlt = A4086EstObsUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEstObsUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEstObsUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt_Enabled), 5, 0), true);
      /* Using cursor T01FV6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FV6_A407EmprNom[0] ;
      n407EmprNom = T01FV6_n407EmprNom[0] ;
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

   public void load1FV1585( )
   {
      /* Using cursor T01FV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1585 = (short)(1) ;
         A407EmprNom = T01FV7_A407EmprNom[0] ;
         n407EmprNom = T01FV7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4086EstObsUlt = T01FV7_A4086EstObsUlt[0] ;
         n4086EstObsUlt = T01FV7_n4086EstObsUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         zm1FV1585( -6) ;
      }
      pr_default.close(5);
      onLoadActions1FV1585( ) ;
   }

   public void onLoadActions1FV1585( )
   {
   }

   public void checkExtendedTable1FV1585( )
   {
      nIsDirty_1585 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FV1585( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FV1585( )
   {
      /* Using cursor T01FV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1585 = (short)(1) ;
      }
      else
      {
         RcdFound1585 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      if ( (pr_default.getStatus(3) != 101) && ( T01FV5_A4052EstNumFor[0] == A4052EstNumFor ) && ( GXutil.strcmp(T01FV5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FV1585( 6) ;
         RcdFound1585 = (short)(1) ;
         A4053EstNumCol = T01FV5_A4053EstNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
         A4086EstObsUlt = T01FV5_A4086EstObsUlt[0] ;
         n4086EstObsUlt = T01FV5_n4086EstObsUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         O4086EstObsUlt = A4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         sMode1585 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FV1585( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1585 = (short)(0) ;
            initializeNonKey1FV1585( ) ;
         }
         Gx_mode = sMode1585 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1585 = (short)(0) ;
         initializeNonKey1FV1585( ) ;
         sMode1585 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1585 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FV1585( ) ;
      if ( RcdFound1585 == 0 )
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
      RcdFound1585 = (short)(0) ;
      /* Using cursor T01FV9 */
      pr_default.execute(7, new Object[] {Byte.valueOf(A4053EstNumCol), A396EmprCod, Integer.valueOf(A4052EstNumFor)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01FV9_A4053EstNumCol[0] < A4053EstNumCol ) ) && ( GXutil.strcmp(T01FV9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FV9_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01FV9_A4053EstNumCol[0] > A4053EstNumCol ) ) && ( GXutil.strcmp(T01FV9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FV9_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            A4053EstNumCol = T01FV9_A4053EstNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            RcdFound1585 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1585 = (short)(0) ;
      /* Using cursor T01FV10 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A4053EstNumCol), A396EmprCod, Integer.valueOf(A4052EstNumFor)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01FV10_A4053EstNumCol[0] > A4053EstNumCol ) ) && ( GXutil.strcmp(T01FV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FV10_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01FV10_A4053EstNumCol[0] < A4053EstNumCol ) ) && ( GXutil.strcmp(T01FV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FV10_A4052EstNumFor[0] == A4052EstNumFor ) )
         {
            A4053EstNumCol = T01FV10_A4053EstNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
            RcdFound1585 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FV1585( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4086EstObsUlt = O4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         GX_FocusControl = edtEstNumCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FV1585( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1585 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
            {
               A4053EstNumCol = Z4053EstNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4086EstObsUlt = O4086EstObsUlt ;
               n4086EstObsUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4086EstObsUlt = O4086EstObsUlt ;
               n4086EstObsUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
               update1FV1585( ) ;
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4086EstObsUlt = O4086EstObsUlt ;
               n4086EstObsUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
               GX_FocusControl = edtEstNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FV1585( ) ;
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
                  A4086EstObsUlt = O4086EstObsUlt ;
                  n4086EstObsUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
                  GX_FocusControl = edtEstNumCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FV1585( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
      {
         A4053EstNumCol = Z4053EstNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4086EstObsUlt = O4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEstNumCol_Internalname ;
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
      getKey1FV1585( ) ;
      if ( RcdFound1585 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
         {
            A4053EstNumCol = Z4053EstNumCol ;
            httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4052EstNumFor != Z4052EstNumFor ) || ( A4053EstNumCol != Z4053EstNumCol ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tlcoobs");
   }

   public void insert_check( )
   {
      confirm_1FV0( ) ;
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
      if ( RcdFound1585 == 0 )
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
      scanStart1FV1585( ) ;
      if ( RcdFound1585 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FV1585( ) ;
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
      if ( RcdFound1585 == 0 )
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
      if ( RcdFound1585 == 0 )
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
      scanStart1FV1585( ) ;
      if ( RcdFound1585 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1585 != 0 )
         {
            scanNext1FV1585( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FV1585( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FV1585( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCopro"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4086EstObsUlt != T01FV4_A4086EstObsUlt[0] ) )
         {
            if ( Z4086EstObsUlt != T01FV4_A4086EstObsUlt[0] )
            {
               GXutil.writeLogln("tlcoobs:[seudo value changed for attri]"+"EstObsUlt");
               GXutil.writeLogRaw("Old: ",Z4086EstObsUlt);
               GXutil.writeLogRaw("Current: ",T01FV4_A4086EstObsUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCopro"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FV1585( )
   {
      beforeValidate1FV1585( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FV1585( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FV1585( 0) ;
         checkOptimisticConcurrency1FV1585( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FV1585( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FV1585( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FV11 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Boolean.valueOf(n4086EstObsUlt), Byte.valueOf(A4086EstObsUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
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
                        processLevel1FV1585( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FV0( ) ;
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
            load1FV1585( ) ;
         }
         endLevel1FV1585( ) ;
      }
      closeExtendedTableCursors1FV1585( ) ;
   }

   public void update1FV1585( )
   {
      beforeValidate1FV1585( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FV1585( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FV1585( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FV1585( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FV1585( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FV12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4086EstObsUlt), Byte.valueOf(A4086EstObsUlt), A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCopro"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FV1585( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FV1585( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FV0( ) ;
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
         endLevel1FV1585( ) ;
      }
      closeExtendedTableCursors1FV1585( ) ;
   }

   public void deferredUpdate1FV1585( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FV1585( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FV1585( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FV1585( ) ;
         afterConfirm1FV1585( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FV1585( ) ;
            if ( AnyError == 0 )
            {
               A4086EstObsUlt = O4086EstObsUlt ;
               n4086EstObsUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
               scanStart1FV1588( ) ;
               while ( RcdFound1588 != 0 )
               {
                  getByPrimaryKey1FV1588( ) ;
                  delete1FV1588( ) ;
                  scanNext1FV1588( ) ;
                  O4086EstObsUlt = A4086EstObsUlt ;
                  n4086EstObsUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
               }
               scanEnd1FV1588( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FV13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1585 == 0 )
                        {
                           initAll1FV1585( ) ;
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
                        resetCaption1FV0( ) ;
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
      sMode1585 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FV1585( ) ;
      Gx_mode = sMode1585 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FV1585( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01FV14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01FV15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01FV16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel1FV1588( )
   {
      s4086EstObsUlt = O4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1FV1588( ) ;
         if ( ( nRcdExists_1588 != 0 ) || ( nIsMod_1588 != 0 ) )
         {
            standaloneNotModal1FV1588( ) ;
            getKey1FV1588( ) ;
            if ( ( nRcdExists_1588 == 0 ) && ( nRcdDeleted_1588 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FV1588( ) ;
            }
            else
            {
               if ( RcdFound1588 != 0 )
               {
                  if ( ( nRcdDeleted_1588 != 0 ) && ( nRcdExists_1588 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FV1588( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1588 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FV1588( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1588 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ESTNUMCOL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstNumCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4086EstObsUlt = A4086EstObsUlt ;
            n4086EstObsUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1588_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4087EstObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstobs_Internalname, GXutil.rtrim( A4088Estobs)) ;
         httpContext.changePostValue( "ZT_"+"Z4087EstObsLin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z4087EstObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4088Estobs_"+sGXsfl_45_idx, GXutil.rtrim( Z4088Estobs)) ;
         httpContext.changePostValue( "nRcdDeleted_1588_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1588_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1588_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1588 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1588_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1588_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBSLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTOBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FV1588( ) ;
      if ( AnyError != 0 )
      {
         O4086EstObsUlt = s4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      }
      nRcdExists_1588 = (short)(0) ;
      nIsMod_1588 = (short)(0) ;
      nRcdDeleted_1588 = (short)(0) ;
   }

   public void processLevel1FV1585( )
   {
      /* Save parent mode. */
      sMode1585 = Gx_mode ;
      processNestedLevel1FV1588( ) ;
      if ( AnyError != 0 )
      {
         O4086EstObsUlt = s4086EstObsUlt ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1585 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FV17 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n4086EstObsUlt), Byte.valueOf(A4086EstObsUlt), A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCopro");
   }

   public void endLevel1FV1585( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1FV1585( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlcoobs");
         if ( AnyError == 0 )
         {
            confirmValues1FV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlcoobs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FV1585( )
   {
      /* Scan By routine */
      /* Using cursor T01FV18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor)});
      RcdFound1585 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1585 = (short)(1) ;
         A4053EstNumCol = T01FV18_A4053EstNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FV1585( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1585 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1585 = (short)(1) ;
         A4053EstNumCol = T01FV18_A4053EstNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
      }
   }

   public void scanEnd1FV1585( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1FV1585( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FV1585( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FV1585( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FV1585( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FV1585( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FV1585( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FV1585( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEstNumFor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNumFor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNumFor_Enabled), 5, 0), true);
      edtEstNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNumCol_Enabled), 5, 0), true);
      edtEstObsUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt_Enabled), 5, 0), true);
   }

   public void zm1FV1588( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4088Estobs = T01FV3_A4088Estobs[0] ;
         }
         else
         {
            Z4088Estobs = A4088Estobs ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         Z4087EstObsLin = A4087EstObsLin ;
         Z4088Estobs = A4088Estobs ;
      }
   }

   public void standaloneNotModal1FV1588( )
   {
      edtEstObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtEstObsUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt_Enabled), 5, 0), true);
      edtEstObsUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1FV1588( )
   {
      if ( isIns( )  )
      {
         A4086EstObsUlt = (byte)(O4086EstObsUlt+1) ;
         n4086EstObsUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4087EstObsLin = A4086EstObsUlt ;
      }
   }

   public void load1FV1588( )
   {
      /* Using cursor T01FV19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1588 = (short)(1) ;
         A4088Estobs = T01FV19_A4088Estobs[0] ;
         n4088Estobs = T01FV19_n4088Estobs[0] ;
         zm1FV1588( -8) ;
      }
      pr_default.close(17);
      onLoadActions1FV1588( ) ;
   }

   public void onLoadActions1FV1588( )
   {
   }

   public void checkExtendedTable1FV1588( )
   {
      nIsDirty_1588 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FV1588( ) ;
   }

   public void closeExtendedTableCursors1FV1588( )
   {
   }

   public void enableDisable1FV1588( )
   {
   }

   public void getKey1FV1588( )
   {
      /* Using cursor T01FV20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1588 = (short)(1) ;
      }
      else
      {
         RcdFound1588 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1FV1588( )
   {
      /* Using cursor T01FV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FV3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01FV3_A4052EstNumFor[0] == A4052EstNumFor ) )
      {
         zm1FV1588( 8) ;
         RcdFound1588 = (short)(1) ;
         initializeNonKey1FV1588( ) ;
         A4087EstObsLin = T01FV3_A4087EstObsLin[0] ;
         A4088Estobs = T01FV3_A4088Estobs[0] ;
         n4088Estobs = T01FV3_n4088Estobs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4052EstNumFor = A4052EstNumFor ;
         Z4053EstNumCol = A4053EstNumCol ;
         Z4087EstObsLin = A4087EstObsLin ;
         sMode1588 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FV1588( ) ;
         load1FV1588( ) ;
         Gx_mode = sMode1588 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1588 = (short)(0) ;
         initializeNonKey1FV1588( ) ;
         sMode1588 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FV1588( ) ;
         Gx_mode = sMode1588 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FV1588( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FV1588( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLcoobs"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4088Estobs, T01FV2_A4088Estobs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4088Estobs, T01FV2_A4088Estobs[0]) != 0 )
            {
               GXutil.writeLogln("tlcoobs:[seudo value changed for attri]"+"Estobs");
               GXutil.writeLogRaw("Old: ",Z4088Estobs);
               GXutil.writeLogRaw("Current: ",T01FV2_A4088Estobs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLcoobs"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FV1588( )
   {
      beforeValidate1FV1588( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FV1588( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FV1588( 0) ;
         checkOptimisticConcurrency1FV1588( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FV1588( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FV1588( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FV21 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin), Boolean.valueOf(n4088Estobs), A4088Estobs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLcoobs");
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
            load1FV1588( ) ;
         }
         endLevel1FV1588( ) ;
      }
      closeExtendedTableCursors1FV1588( ) ;
   }

   public void update1FV1588( )
   {
      beforeValidate1FV1588( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FV1588( ) ;
      }
      if ( ( nIsMod_1588 != 0 ) || ( nIsDirty_1588 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FV1588( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FV1588( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FV1588( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FV22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n4088Estobs), A4088Estobs, A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLcoobs");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLcoobs"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FV1588( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FV1588( ) ;
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
            endLevel1FV1588( ) ;
         }
      }
      closeExtendedTableCursors1FV1588( ) ;
   }

   public void deferredUpdate1FV1588( )
   {
   }

   public void delete1FV1588( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FV1588( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FV1588( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FV1588( ) ;
         afterConfirm1FV1588( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FV1588( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FV23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol), Byte.valueOf(A4087EstObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLcoobs");
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
      sMode1588 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FV1588( ) ;
      Gx_mode = sMode1588 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FV1588( )
   {
      standaloneModal1FV1588( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FV1588( )
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

   public void scanStart1FV1588( )
   {
      /* Scan By routine */
      /* Using cursor T01FV24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4052EstNumFor), Byte.valueOf(A4053EstNumCol)});
      RcdFound1588 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1588 = (short)(1) ;
         A4087EstObsLin = T01FV24_A4087EstObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FV1588( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1588 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1588 = (short)(1) ;
         A4087EstObsLin = T01FV24_A4087EstObsLin[0] ;
      }
   }

   public void scanEnd1FV1588( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1FV1588( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FV1588( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FV1588( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FV1588( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FV1588( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FV1588( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FV1588( )
   {
      edtEstObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtEstobs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstobs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstobs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1FV1588( )
   {
   }

   public void send_integrity_lvl_hashes1FV1585( )
   {
   }

   public void subsflControlProps_451588( )
   {
      edtavnRcdDeleted_1588_Internalname = "vNRCDDELETED_1588_"+sGXsfl_45_idx ;
      edtEstObsLin_Internalname = "ESTOBSLIN_"+sGXsfl_45_idx ;
      edtEstobs_Internalname = "ESTOBS_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451588( )
   {
      edtavnRcdDeleted_1588_Internalname = "vNRCDDELETED_1588_"+sGXsfl_45_fel_idx ;
      edtEstObsLin_Internalname = "ESTOBSLIN_"+sGXsfl_45_fel_idx ;
      edtEstobs_Internalname = "ESTOBS_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1FV1588( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451588( ) ;
      sendRow1FV1588( ) ;
   }

   public void sendRow1FV1588( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1588_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1588_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1588_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1588), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1588), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1588_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1588_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4087EstObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtEstObsLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4087EstObsLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4087EstObsLin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstObsLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1588_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstobs_Internalname,GXutil.rtrim( A4088Estobs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstobs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstobs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FV1588( ) ;
      GXCCtl = "Z4087EstObsLin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4087EstObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4088Estobs_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4088Estobs));
      GXCCtl = "nRcdDeleted_1588_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1588_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1588_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1588, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1588_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1588_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTOBSLIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTOBS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FV1588( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451588( ) ;
      edtavnRcdDeleted_1588_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1588_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBSLIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstobs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTOBS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1588_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1588_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1588");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1588_Internalname ;
         wbErr = true ;
         nRcdDeleted_1588 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1588 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1588_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4087EstObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4088Estobs = httpContext.cgiGet( edtEstobs_Internalname) ;
      n4088Estobs = false ;
      GXCCtl = "Z4087EstObsLin_" + sGXsfl_45_idx ;
      Z4087EstObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4088Estobs_" + sGXsfl_45_idx ;
      Z4088Estobs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1588_" + sGXsfl_45_idx ;
      nRcdDeleted_1588 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1588_" + sGXsfl_45_idx ;
      nRcdExists_1588 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1588_" + sGXsfl_45_idx ;
      nIsMod_1588 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstObsLin_Enabled = edtEstObsLin_Enabled ;
   }

   public void confirmValues1FV0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451588( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451588( ) ;
         httpContext.changePostValue( "Z4087EstObsLin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4087EstObsLin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4087EstObsLin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z4088Estobs_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z4088Estobs_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4088Estobs_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tlcoobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4052EstNumFor", GXutil.ltrim( localUtil.ntoc( Z4052EstNumFor, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4053EstNumCol", GXutil.ltrim( localUtil.ntoc( Z4053EstNumCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4086EstObsUlt", GXutil.ltrim( localUtil.ntoc( Z4086EstObsUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4086EstObsUlt", GXutil.ltrim( localUtil.ntoc( O4086EstObsUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tlcoobs", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4052EstNumFor,8,0))}, new String[] {"EmprCod","EstNumFor"})  ;
   }

   public String getPgmname( )
   {
      return "TLcoobs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lineas Observaciones", "") ;
   }

   public void initializeNonKey1FV1585( )
   {
      A4086EstObsUlt = (byte)(0) ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      O4086EstObsUlt = A4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
      Z4086EstObsUlt = (byte)(0) ;
   }

   public void initAll1FV1585( )
   {
      A4053EstNumCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4053EstNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4053EstNumCol), 2, 0));
      initializeNonKey1FV1585( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FV1588( )
   {
      A4088Estobs = "" ;
      n4088Estobs = false ;
      Z4088Estobs = "" ;
   }

   public void initAll1FV1588( )
   {
      A4087EstObsLin = (byte)(0) ;
      initializeNonKey1FV1588( ) ;
   }

   public void standaloneModalInsert1FV1588( )
   {
      A4086EstObsUlt = i4086EstObsUlt ;
      n4086EstObsUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4086EstObsUlt), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241572488", true, true);
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
      httpContext.AddJavascriptSource("tlcoobs.js", "?20268241572488", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1588( )
   {
      edtEstObsLin_Enabled = defedtEstObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstObsLin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1588, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1588_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4087EstObsLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4088Estobs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstobs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEstNumFor_Internalname = "ESTNUMFOR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEstNumCol_Internalname = "ESTNUMCOL" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEstObsUlt_Internalname = "ESTOBSULT" ;
      edtavnRcdDeleted_1588_Internalname = "vNRCDDELETED_1588" ;
      edtEstObsLin_Internalname = "ESTOBSLIN" ;
      edtEstobs_Internalname = "ESTOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Lineas Observaciones", "") );
      edtEstobs_Jsonclick = "" ;
      edtEstObsLin_Jsonclick = "" ;
      edtavnRcdDeleted_1588_Jsonclick = "" ;
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
      edtEstobs_Enabled = 1 ;
      edtEstObsLin_Enabled = 0 ;
      edtavnRcdDeleted_1588_Enabled = 1 ;
      edtEstObsUlt_Jsonclick = "" ;
      edtEstObsUlt_Backcolor = (int)(0xFFFFFF) ;
      edtEstObsUlt_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstNumCol_Jsonclick = "" ;
      edtEstNumCol_Backcolor = (int)(0xFFFFFF) ;
      edtEstNumCol_Enabled = 1 ;
      edtEstNumFor_Jsonclick = "" ;
      edtEstNumFor_Backcolor = (int)(0xFFFFFF) ;
      edtEstNumFor_Enabled = 0 ;
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
      subsflControlProps_451588( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FV1588( ) ;
         standaloneModal1FV1588( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FV1588( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451588( ) ;
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
      /* Using cursor T01FV25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FV25_A407EmprNom[0] ;
      n407EmprNom = T01FV25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
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

   public void valid_Estnumcol( )
   {
      n4086EstObsUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4086EstObsUlt", GXutil.ltrim( localUtil.ntoc( A4086EstObsUlt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4052EstNumFor", GXutil.ltrim( localUtil.ntoc( Z4052EstNumFor, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4053EstNumCol", GXutil.ltrim( localUtil.ntoc( Z4053EstNumCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4086EstObsUlt", GXutil.ltrim( localUtil.ntoc( Z4086EstObsUlt, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O4086EstObsUlt", GXutil.ltrim( localUtil.ntoc( O4086EstObsUlt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTNUMFOR","{handler:'valid_Estnumfor',iparms:[]");
      setEventMetadata("VALID_ESTNUMFOR",",oparms:[]}");
      setEventMetadata("VALID_ESTNUMCOL","{handler:'valid_Estnumcol',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4086EstObsUlt',fld:'ESTOBSULT',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4052EstNumFor',fld:'ESTNUMFOR',pic:'ZZZZZZZ9'},{av:'A4053EstNumCol',fld:'ESTNUMCOL',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTNUMCOL",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4086EstObsUlt',fld:'ESTOBSULT',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4052EstNumFor'},{av:'Z4053EstNumCol'},{av:'Z407EmprNom'},{av:'Z4086EstObsUlt'},{av:'O4086EstObsUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ESTOBSULT","{handler:'valid_Estobsult',iparms:[]");
      setEventMetadata("VALID_ESTOBSULT",",oparms:[]}");
      setEventMetadata("VALID_ESTOBSLIN","{handler:'valid_Estobslin',iparms:[]");
      setEventMetadata("VALID_ESTOBSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Estobs',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4088Estobs = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1588 = "" ;
      Gx_mode = "" ;
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
      sMode1585 = "" ;
      A4088Estobs = "" ;
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
      T01FV6_A407EmprNom = new String[] {""} ;
      T01FV6_n407EmprNom = new boolean[] {false} ;
      T01FV7_A4052EstNumFor = new int[1] ;
      T01FV7_A4053EstNumCol = new byte[1] ;
      T01FV7_A407EmprNom = new String[] {""} ;
      T01FV7_n407EmprNom = new boolean[] {false} ;
      T01FV7_A4086EstObsUlt = new byte[1] ;
      T01FV7_n4086EstObsUlt = new boolean[] {false} ;
      T01FV7_A396EmprCod = new String[] {""} ;
      T01FV8_A396EmprCod = new String[] {""} ;
      T01FV8_A4052EstNumFor = new int[1] ;
      T01FV8_A4053EstNumCol = new byte[1] ;
      T01FV5_A4052EstNumFor = new int[1] ;
      T01FV5_A4053EstNumCol = new byte[1] ;
      T01FV5_A4086EstObsUlt = new byte[1] ;
      T01FV5_n4086EstObsUlt = new boolean[] {false} ;
      T01FV5_A396EmprCod = new String[] {""} ;
      T01FV9_A396EmprCod = new String[] {""} ;
      T01FV9_A4052EstNumFor = new int[1] ;
      T01FV9_A4053EstNumCol = new byte[1] ;
      T01FV10_A396EmprCod = new String[] {""} ;
      T01FV10_A4052EstNumFor = new int[1] ;
      T01FV10_A4053EstNumCol = new byte[1] ;
      T01FV4_A4052EstNumFor = new int[1] ;
      T01FV4_A4053EstNumCol = new byte[1] ;
      T01FV4_A4086EstObsUlt = new byte[1] ;
      T01FV4_n4086EstObsUlt = new boolean[] {false} ;
      T01FV4_A396EmprCod = new String[] {""} ;
      T01FV14_A396EmprCod = new String[] {""} ;
      T01FV14_A4052EstNumFor = new int[1] ;
      T01FV14_A4053EstNumCol = new byte[1] ;
      T01FV14_A4090EstEspLin = new byte[1] ;
      T01FV15_A396EmprCod = new String[] {""} ;
      T01FV15_A4052EstNumFor = new int[1] ;
      T01FV15_A4053EstNumCol = new byte[1] ;
      T01FV15_A4084EstProLin = new byte[1] ;
      T01FV16_A396EmprCod = new String[] {""} ;
      T01FV16_A4052EstNumFor = new int[1] ;
      T01FV16_A4053EstNumCol = new byte[1] ;
      T01FV16_A4057EstNumLin = new byte[1] ;
      T01FV18_A396EmprCod = new String[] {""} ;
      T01FV18_A4052EstNumFor = new int[1] ;
      T01FV18_A4053EstNumCol = new byte[1] ;
      T01FV19_A396EmprCod = new String[] {""} ;
      T01FV19_A4052EstNumFor = new int[1] ;
      T01FV19_A4053EstNumCol = new byte[1] ;
      T01FV19_A4087EstObsLin = new byte[1] ;
      T01FV19_A4088Estobs = new String[] {""} ;
      T01FV19_n4088Estobs = new boolean[] {false} ;
      T01FV20_A396EmprCod = new String[] {""} ;
      T01FV20_A4052EstNumFor = new int[1] ;
      T01FV20_A4053EstNumCol = new byte[1] ;
      T01FV20_A4087EstObsLin = new byte[1] ;
      T01FV3_A396EmprCod = new String[] {""} ;
      T01FV3_A4052EstNumFor = new int[1] ;
      T01FV3_A4053EstNumCol = new byte[1] ;
      T01FV3_A4087EstObsLin = new byte[1] ;
      T01FV3_A4088Estobs = new String[] {""} ;
      T01FV3_n4088Estobs = new boolean[] {false} ;
      T01FV2_A396EmprCod = new String[] {""} ;
      T01FV2_A4052EstNumFor = new int[1] ;
      T01FV2_A4053EstNumCol = new byte[1] ;
      T01FV2_A4087EstObsLin = new byte[1] ;
      T01FV2_A4088Estobs = new String[] {""} ;
      T01FV2_n4088Estobs = new boolean[] {false} ;
      T01FV24_A396EmprCod = new String[] {""} ;
      T01FV24_A4052EstNumFor = new int[1] ;
      T01FV24_A4053EstNumCol = new byte[1] ;
      T01FV24_A4087EstObsLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FV25_A407EmprNom = new String[] {""} ;
      T01FV25_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tlcoobs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlcoobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlcoobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlcoobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlcoobs__default(),
         new Object[] {
             new Object[] {
            T01FV2_A396EmprCod, T01FV2_A4052EstNumFor, T01FV2_A4053EstNumCol, T01FV2_A4087EstObsLin, T01FV2_A4088Estobs, T01FV2_n4088Estobs
            }
            , new Object[] {
            T01FV3_A396EmprCod, T01FV3_A4052EstNumFor, T01FV3_A4053EstNumCol, T01FV3_A4087EstObsLin, T01FV3_A4088Estobs, T01FV3_n4088Estobs
            }
            , new Object[] {
            T01FV4_A4052EstNumFor, T01FV4_A4053EstNumCol, T01FV4_A4086EstObsUlt, T01FV4_n4086EstObsUlt, T01FV4_A396EmprCod
            }
            , new Object[] {
            T01FV5_A4052EstNumFor, T01FV5_A4053EstNumCol, T01FV5_A4086EstObsUlt, T01FV5_n4086EstObsUlt, T01FV5_A396EmprCod
            }
            , new Object[] {
            T01FV6_A407EmprNom, T01FV6_n407EmprNom
            }
            , new Object[] {
            T01FV7_A4052EstNumFor, T01FV7_A4053EstNumCol, T01FV7_A407EmprNom, T01FV7_n407EmprNom, T01FV7_A4086EstObsUlt, T01FV7_n4086EstObsUlt, T01FV7_A396EmprCod
            }
            , new Object[] {
            T01FV8_A396EmprCod, T01FV8_A4052EstNumFor, T01FV8_A4053EstNumCol
            }
            , new Object[] {
            T01FV9_A396EmprCod, T01FV9_A4052EstNumFor, T01FV9_A4053EstNumCol
            }
            , new Object[] {
            T01FV10_A396EmprCod, T01FV10_A4052EstNumFor, T01FV10_A4053EstNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FV14_A396EmprCod, T01FV14_A4052EstNumFor, T01FV14_A4053EstNumCol, T01FV14_A4090EstEspLin
            }
            , new Object[] {
            T01FV15_A396EmprCod, T01FV15_A4052EstNumFor, T01FV15_A4053EstNumCol, T01FV15_A4084EstProLin
            }
            , new Object[] {
            T01FV16_A396EmprCod, T01FV16_A4052EstNumFor, T01FV16_A4053EstNumCol, T01FV16_A4057EstNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01FV18_A396EmprCod, T01FV18_A4052EstNumFor, T01FV18_A4053EstNumCol
            }
            , new Object[] {
            T01FV19_A396EmprCod, T01FV19_A4052EstNumFor, T01FV19_A4053EstNumCol, T01FV19_A4087EstObsLin, T01FV19_A4088Estobs, T01FV19_n4088Estobs
            }
            , new Object[] {
            T01FV20_A396EmprCod, T01FV20_A4052EstNumFor, T01FV20_A4053EstNumCol, T01FV20_A4087EstObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FV24_A396EmprCod, T01FV24_A4052EstNumFor, T01FV24_A4053EstNumCol, T01FV24_A4087EstObsLin
            }
            , new Object[] {
            T01FV25_A407EmprNom, T01FV25_n407EmprNom
            }
         }
      );
      Z4052EstNumFor = 0 ;
      A4052EstNumFor = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z4053EstNumCol ;
   private byte Z4086EstObsUlt ;
   private byte O4086EstObsUlt ;
   private byte Z4087EstObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4086EstObsUlt ;
   private byte Gx_BScreen ;
   private byte A4053EstNumCol ;
   private byte B4086EstObsUlt ;
   private byte s4086EstObsUlt ;
   private byte A4087EstObsLin ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i4086EstObsUlt ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4053EstNumCol ;
   private byte ZZ4086EstObsUlt ;
   private byte ZO4086EstObsUlt ;
   private short nRcdDeleted_1588 ;
   private short nRcdExists_1588 ;
   private short nIsMod_1588 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1588 ;
   private short RcdFound1588 ;
   private short nBlankRcdUsr1588 ;
   private short RcdFound1585 ;
   private short nIsDirty_1585 ;
   private short nIsDirty_1588 ;
   private int wcpOA4052EstNumFor ;
   private int Z4052EstNumFor ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A4052EstNumFor ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEstNumFor_Enabled ;
   private int edtEstNumCol_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEstObsUlt_Enabled ;
   private int edtavnRcdDeleted_1588_Enabled ;
   private int edtEstObsLin_Enabled ;
   private int edtEstobs_Enabled ;
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
   private int defedtEstObsLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEstObsUlt_Backcolor ;
   private int edtEstNumCol_Backcolor ;
   private int edtEstNumFor_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4052EstNumFor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z4088Estobs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEstNumCol_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtEstNumFor_Internalname ;
   private String edtEstNumFor_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEstNumCol_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEstObsUlt_Internalname ;
   private String edtEstObsUlt_Jsonclick ;
   private String sMode1588 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1588_Internalname ;
   private String edtEstObsLin_Internalname ;
   private String edtEstobs_Internalname ;
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
   private String sMode1585 ;
   private String A4088Estobs ;
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
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1588_Jsonclick ;
   private String edtEstObsLin_Jsonclick ;
   private String edtEstobs_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4086EstObsUlt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n4088Estobs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FV6_A407EmprNom ;
   private boolean[] T01FV6_n407EmprNom ;
   private int[] T01FV7_A4052EstNumFor ;
   private byte[] T01FV7_A4053EstNumCol ;
   private String[] T01FV7_A407EmprNom ;
   private boolean[] T01FV7_n407EmprNom ;
   private byte[] T01FV7_A4086EstObsUlt ;
   private boolean[] T01FV7_n4086EstObsUlt ;
   private String[] T01FV7_A396EmprCod ;
   private String[] T01FV8_A396EmprCod ;
   private int[] T01FV8_A4052EstNumFor ;
   private byte[] T01FV8_A4053EstNumCol ;
   private int[] T01FV5_A4052EstNumFor ;
   private byte[] T01FV5_A4053EstNumCol ;
   private byte[] T01FV5_A4086EstObsUlt ;
   private boolean[] T01FV5_n4086EstObsUlt ;
   private String[] T01FV5_A396EmprCod ;
   private String[] T01FV9_A396EmprCod ;
   private int[] T01FV9_A4052EstNumFor ;
   private byte[] T01FV9_A4053EstNumCol ;
   private String[] T01FV10_A396EmprCod ;
   private int[] T01FV10_A4052EstNumFor ;
   private byte[] T01FV10_A4053EstNumCol ;
   private int[] T01FV4_A4052EstNumFor ;
   private byte[] T01FV4_A4053EstNumCol ;
   private byte[] T01FV4_A4086EstObsUlt ;
   private boolean[] T01FV4_n4086EstObsUlt ;
   private String[] T01FV4_A396EmprCod ;
   private String[] T01FV14_A396EmprCod ;
   private int[] T01FV14_A4052EstNumFor ;
   private byte[] T01FV14_A4053EstNumCol ;
   private byte[] T01FV14_A4090EstEspLin ;
   private String[] T01FV15_A396EmprCod ;
   private int[] T01FV15_A4052EstNumFor ;
   private byte[] T01FV15_A4053EstNumCol ;
   private byte[] T01FV15_A4084EstProLin ;
   private String[] T01FV16_A396EmprCod ;
   private int[] T01FV16_A4052EstNumFor ;
   private byte[] T01FV16_A4053EstNumCol ;
   private byte[] T01FV16_A4057EstNumLin ;
   private String[] T01FV18_A396EmprCod ;
   private int[] T01FV18_A4052EstNumFor ;
   private byte[] T01FV18_A4053EstNumCol ;
   private String[] T01FV19_A396EmprCod ;
   private int[] T01FV19_A4052EstNumFor ;
   private byte[] T01FV19_A4053EstNumCol ;
   private byte[] T01FV19_A4087EstObsLin ;
   private String[] T01FV19_A4088Estobs ;
   private boolean[] T01FV19_n4088Estobs ;
   private String[] T01FV20_A396EmprCod ;
   private int[] T01FV20_A4052EstNumFor ;
   private byte[] T01FV20_A4053EstNumCol ;
   private byte[] T01FV20_A4087EstObsLin ;
   private String[] T01FV3_A396EmprCod ;
   private int[] T01FV3_A4052EstNumFor ;
   private byte[] T01FV3_A4053EstNumCol ;
   private byte[] T01FV3_A4087EstObsLin ;
   private String[] T01FV3_A4088Estobs ;
   private boolean[] T01FV3_n4088Estobs ;
   private String[] T01FV2_A396EmprCod ;
   private int[] T01FV2_A4052EstNumFor ;
   private byte[] T01FV2_A4053EstNumCol ;
   private byte[] T01FV2_A4087EstObsLin ;
   private String[] T01FV2_A4088Estobs ;
   private boolean[] T01FV2_n4088Estobs ;
   private String[] T01FV24_A396EmprCod ;
   private int[] T01FV24_A4052EstNumFor ;
   private byte[] T01FV24_A4053EstNumCol ;
   private byte[] T01FV24_A4087EstObsLin ;
   private String[] T01FV25_A407EmprNom ;
   private boolean[] T01FV25_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlcoobs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlcoobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FV2", "SELECT EmprCod, EstNumFor, EstNumCol, EstObsLin, Estobs FROM TXPLcoobs WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstObsLin = ?  FOR UPDATE OF Estobs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV3", "SELECT EmprCod, EstNumFor, EstNumCol, EstObsLin, Estobs FROM TXPLcoobs WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV4", "SELECT EstNumFor, EstNumCol, EstObsUlt, EmprCod FROM TXPCCopro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?  FOR UPDATE OF EstObsUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV5", "SELECT EstNumFor, EstNumCol, EstObsUlt, EmprCod FROM TXPCCopro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV7", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstNumFor, TM1.EstNumCol, T2.EmprNom, TM1.EstObsUlt, TM1.EmprCod FROM (TXPCCopro TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.EstNumFor = ? and TM1.EstNumCol = ? ORDER BY TM1.EmprCod, TM1.EstNumFor, TM1.EstNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE ( EstNumCol > ?) and EmprCod = ? and EstNumFor = ? ORDER BY EmprCod, EstNumFor, EstNumCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FV10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE ( EstNumCol < ?) and EmprCod = ? and EstNumFor = ? ORDER BY EmprCod DESC, EstNumFor DESC, EstNumCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FV11", "INSERT INTO TXPCCopro(EstNumFor, EstNumCol, EstObsUlt, EmprCod, EstConsumo, EstNumLinu, EstTipCol, EstProUlt, EstEspUlt) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, 0)", GX_NOMASK, "TXPCCopro")
         ,new UpdateCursor("T01FV12", "UPDATE TXPCCopro SET EstObsUlt=?  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?", GX_NOMASK, "TXPCCopro")
         ,new UpdateCursor("T01FV13", "DELETE FROM TXPCCopro  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?", GX_NOMASK, "TXPCCopro")
         ,new ForEachCursor("T01FV14", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FV15", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FV16", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FV17", "UPDATE TXPCCopro SET EstObsUlt=?  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ?", GX_NOMASK, "TXPCCopro")
         ,new ForEachCursor("T01FV18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstNumFor, EstNumCol FROM TXPCCopro WHERE EmprCod = ? and EstNumFor = ? ORDER BY EmprCod, EstNumFor, EstNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV19", "SELECT EmprCod, EstNumFor, EstNumCol, EstObsLin, Estobs FROM TXPLcoobs WHERE EmprCod = ? and EstNumFor = ? and EstNumCol = ? and EstObsLin = ? ORDER BY EmprCod, EstNumFor, EstNumCol, EstObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV20", "SELECT EmprCod, EstNumFor, EstNumCol, EstObsLin FROM TXPLcoobs WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FV21", "INSERT INTO TXPLcoobs(EmprCod, EstNumFor, EstNumCol, EstObsLin, Estobs) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPLcoobs")
         ,new UpdateCursor("T01FV22", "UPDATE TXPLcoobs SET Estobs=?  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstObsLin = ?", GX_NOMASK, "TXPLcoobs")
         ,new UpdateCursor("T01FV23", "DELETE FROM TXPLcoobs  WHERE EmprCod = ? AND EstNumFor = ? AND EstNumCol = ? AND EstObsLin = ?", GX_NOMASK, "TXPLcoobs")
         ,new ForEachCursor("T01FV24", "SELECT EmprCod, EstNumFor, EstNumCol, EstObsLin FROM TXPLcoobs WHERE EmprCod = ? and EstNumFor = ? and EstNumCol = ? ORDER BY EmprCod, EstNumFor, EstNumCol, EstObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FV25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 10 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 15 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               return;
            case 20 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

