package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class teuro_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "PGMLIN") ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "PGMLIN") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "PGMLIN") ;
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
         AV7PGMLIN = (short)(GXutil.lval( gxfirstwebparm)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7PGMLIN), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "EURO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPGMLIN_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      A3932ULTLIN = (byte)(GXutil.lval( httpContext.GetPar( "ULTLIN"))) ;
      n3932ULTLIN = false ;
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

   public teuro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public teuro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( teuro_impl.class ));
   }

   public teuro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TEURO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "PGMLIN", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPGMLIN_Internalname, GXutil.ltrim( localUtil.ntoc( A3928PGMLIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPGMLIN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3928PGMLIN), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3928PGMLIN), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPGMLIN_Jsonclick, 0, "", "", "", "", "", 1, edtPGMLIN_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "PGMDSC", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPGMDSC_Internalname, GXutil.rtrim( A3929PGMDSC), GXutil.rtrim( localUtil.format( A3929PGMDSC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPGMDSC_Jsonclick, 0, "", "", "", "", "", 1, edtPGMDSC_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "PRGMCOD", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPRGMCOD_Internalname, GXutil.rtrim( A3933PRGMCOD), GXutil.rtrim( localUtil.format( A3933PRGMCOD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPRGMCOD_Jsonclick, 0, "", "", "", "", "", 1, edtPRGMCOD_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "TBLCNV", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTBLCNV_Internalname, GXutil.rtrim( A3931TBLCNV), GXutil.rtrim( localUtil.format( A3931TBLCNV, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBLCNV_Jsonclick, 0, "", "", "", "", "", 1, edtTBLCNV_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "TBLNOM", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTBLNOM_Internalname, GXutil.rtrim( A3930TBLNOM), GXutil.rtrim( localUtil.format( A3930TBLNOM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBLNOM_Jsonclick, 0, "", "", "", "", "", 1, edtTBLNOM_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "ULTLIN", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TEURO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtULTLIN_Internalname, GXutil.ltrim( localUtil.ntoc( A3932ULTLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtULTLIN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3932ULTLIN), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3932ULTLIN), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtULTLIN_Jsonclick, 0, "", "", "", "", "", 1, edtULTLIN_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TEURO.htm");
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
         nBlankRcdCount1591 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1591 = (short)(1) ;
            scanStart1FX1591( ) ;
            while ( RcdFound1591 != 0 )
            {
               init_level_properties1591( ) ;
               getByPrimaryKey1FX1591( ) ;
               addRow1FX1591( ) ;
               scanNext1FX1591( ) ;
            }
            scanEnd1FX1591( ) ;
            nBlankRcdCount1591 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3932ULTLIN = A3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         standaloneNotModal1FX1591( ) ;
         standaloneModal1FX1591( ) ;
         sMode1591 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1FX1591( ) ;
            edtavnRcdDeleted_1591_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1591_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1591_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1591_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtATRLIN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ATRLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtATRLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRLIN_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtATRCOD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ATRCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtATRCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRCOD_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1591 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FX1591( ) ;
            }
            sendRow1FX1591( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1591 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3932ULTLIN = B3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1591 = (short)(5) ;
         nRcdExists_1591 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FX1591( ) ;
            while ( RcdFound1591 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501591( ) ;
               init_level_properties1591( ) ;
               standaloneNotModal1FX1591( ) ;
               getByPrimaryKey1FX1591( ) ;
               standaloneModal1FX1591( ) ;
               addRow1FX1591( ) ;
               scanNext1FX1591( ) ;
            }
            scanEnd1FX1591( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1591 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501591( ) ;
      initAll1FX1591( ) ;
      init_level_properties1591( ) ;
      B3932ULTLIN = A3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      nRcdExists_1591 = (short)(0) ;
      nIsMod_1591 = (short)(0) ;
      nRcdDeleted_1591 = (short)(0) ;
      nBlankRcdCount1591 = (short)(nBlankRcdUsr1591+nBlankRcdCount1591) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1591 > 0 )
      {
         standaloneNotModal1FX1591( ) ;
         standaloneModal1FX1591( ) ;
         addRow1FX1591( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtATRLIN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1591 = (short)(nBlankRcdCount1591-1) ;
      }
      Gx_mode = sMode1591 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3932ULTLIN = B3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEURO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TEURO.htm");
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
         Z3928PGMLIN = (short)(localUtil.ctol( httpContext.cgiGet( "Z3928PGMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3929PGMDSC = httpContext.cgiGet( "Z3929PGMDSC") ;
         Z3933PRGMCOD = httpContext.cgiGet( "Z3933PRGMCOD") ;
         Z3931TBLCNV = httpContext.cgiGet( "Z3931TBLCNV") ;
         Z3930TBLNOM = httpContext.cgiGet( "Z3930TBLNOM") ;
         Z3932ULTLIN = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3932ULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O3932ULTLIN = (byte)(localUtil.ctol( httpContext.cgiGet( "O3932ULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPGMLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPGMLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PGMLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPGMLIN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3928PGMLIN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
         }
         else
         {
            A3928PGMLIN = (short)(localUtil.ctol( httpContext.cgiGet( edtPGMLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
         }
         A3929PGMDSC = httpContext.cgiGet( edtPGMDSC_Internalname) ;
         n3929PGMDSC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3929PGMDSC", A3929PGMDSC);
         A3933PRGMCOD = httpContext.cgiGet( edtPRGMCOD_Internalname) ;
         n3933PRGMCOD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3933PRGMCOD", A3933PRGMCOD);
         A3931TBLCNV = httpContext.cgiGet( edtTBLCNV_Internalname) ;
         n3931TBLCNV = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3931TBLCNV", A3931TBLCNV);
         A3930TBLNOM = httpContext.cgiGet( edtTBLNOM_Internalname) ;
         n3930TBLNOM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3930TBLNOM", A3930TBLNOM);
         A3932ULTLIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtULTLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
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
            A3928PGMLIN = (short)(GXutil.lval( httpContext.GetPar( "PGMLIN"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
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
            initAll1FX1590( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1591_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1591_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1FX1590( ) ;
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

   public void confirm_1FX0( )
   {
      beforeValidate1FX1590( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FX1590( ) ;
         }
         else
         {
            checkExtendedTable1FX1590( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1FX1590( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1590 = Gx_mode ;
         confirm_1FX1591( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1590 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1590 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FX0( ) ;
      }
   }

   public void confirm_1FX1591( )
   {
      s3932ULTLIN = O3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1FX1591( ) ;
         if ( ( nRcdExists_1591 != 0 ) || ( nIsMod_1591 != 0 ) )
         {
            getKey1FX1591( ) ;
            if ( ( nRcdExists_1591 == 0 ) && ( nRcdDeleted_1591 == 0 ) )
            {
               if ( RcdFound1591 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FX1591( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FX1591( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FX1591( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3932ULTLIN = A3932ULTLIN ;
                     n3932ULTLIN = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ATRLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtATRLIN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1591 != 0 )
               {
                  if ( nRcdDeleted_1591 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FX1591( ) ;
                     load1FX1591( ) ;
                     beforeValidate1FX1591( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FX1591( ) ;
                        O3932ULTLIN = A3932ULTLIN ;
                        n3932ULTLIN = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1591 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FX1591( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FX1591( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FX1591( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3932ULTLIN = A3932ULTLIN ;
                           n3932ULTLIN = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1591 == 0 )
                  {
                     GXCCtl = "ATRLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtATRLIN_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1591_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtATRLIN_Internalname, GXutil.ltrim( localUtil.ntoc( A3934ATRLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtATRCOD_Internalname, GXutil.rtrim( A3935ATRCOD)) ;
         httpContext.changePostValue( "ZT_"+"Z3934ATRLIN_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3934ATRLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3935ATRCOD_"+sGXsfl_50_idx, GXutil.rtrim( Z3935ATRCOD)) ;
         httpContext.changePostValue( "nRcdDeleted_1591_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1591_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1591_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1591 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1591_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1591_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ATRLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtATRLIN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ATRCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtATRCOD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3932ULTLIN = s3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FX0( )
   {
   }

   public void zm1FX1590( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3929PGMDSC = T01FX5_A3929PGMDSC[0] ;
            Z3933PRGMCOD = T01FX5_A3933PRGMCOD[0] ;
            Z3931TBLCNV = T01FX5_A3931TBLCNV[0] ;
            Z3930TBLNOM = T01FX5_A3930TBLNOM[0] ;
            Z3932ULTLIN = T01FX5_A3932ULTLIN[0] ;
         }
         else
         {
            Z3929PGMDSC = A3929PGMDSC ;
            Z3933PRGMCOD = A3933PRGMCOD ;
            Z3931TBLCNV = A3931TBLCNV ;
            Z3930TBLNOM = A3930TBLNOM ;
            Z3932ULTLIN = A3932ULTLIN ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z3928PGMLIN = A3928PGMLIN ;
         Z3929PGMDSC = A3929PGMDSC ;
         Z3933PRGMCOD = A3933PRGMCOD ;
         Z3931TBLCNV = A3931TBLCNV ;
         Z3930TBLNOM = A3930TBLNOM ;
         Z3932ULTLIN = A3932ULTLIN ;
      }
   }

   public void standaloneNotModal( )
   {
      edtULTLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtULTLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtULTLIN_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtULTLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtULTLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtULTLIN_Enabled), 5, 0), true);
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

   public void load1FX1590( )
   {
      /* Using cursor T01FX6 */
      pr_default.execute(4, new Object[] {Short.valueOf(A3928PGMLIN)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1590 = (short)(1) ;
         A3929PGMDSC = T01FX6_A3929PGMDSC[0] ;
         n3929PGMDSC = T01FX6_n3929PGMDSC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3929PGMDSC", A3929PGMDSC);
         A3933PRGMCOD = T01FX6_A3933PRGMCOD[0] ;
         n3933PRGMCOD = T01FX6_n3933PRGMCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3933PRGMCOD", A3933PRGMCOD);
         A3931TBLCNV = T01FX6_A3931TBLCNV[0] ;
         n3931TBLCNV = T01FX6_n3931TBLCNV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3931TBLCNV", A3931TBLCNV);
         A3930TBLNOM = T01FX6_A3930TBLNOM[0] ;
         n3930TBLNOM = T01FX6_n3930TBLNOM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3930TBLNOM", A3930TBLNOM);
         A3932ULTLIN = T01FX6_A3932ULTLIN[0] ;
         n3932ULTLIN = T01FX6_n3932ULTLIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         zm1FX1590( -5) ;
      }
      pr_default.close(4);
      onLoadActions1FX1590( ) ;
   }

   public void onLoadActions1FX1590( )
   {
   }

   public void checkExtendedTable1FX1590( )
   {
      nIsDirty_1590 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FX1590( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FX1590( )
   {
      /* Using cursor T01FX7 */
      pr_default.execute(5, new Object[] {Short.valueOf(A3928PGMLIN)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1590 = (short)(1) ;
      }
      else
      {
         RcdFound1590 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FX5 */
      pr_default.execute(3, new Object[] {Short.valueOf(A3928PGMLIN)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1FX1590( 5) ;
         RcdFound1590 = (short)(1) ;
         A3928PGMLIN = T01FX5_A3928PGMLIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
         A3929PGMDSC = T01FX5_A3929PGMDSC[0] ;
         n3929PGMDSC = T01FX5_n3929PGMDSC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3929PGMDSC", A3929PGMDSC);
         A3933PRGMCOD = T01FX5_A3933PRGMCOD[0] ;
         n3933PRGMCOD = T01FX5_n3933PRGMCOD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3933PRGMCOD", A3933PRGMCOD);
         A3931TBLCNV = T01FX5_A3931TBLCNV[0] ;
         n3931TBLCNV = T01FX5_n3931TBLCNV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3931TBLCNV", A3931TBLCNV);
         A3930TBLNOM = T01FX5_A3930TBLNOM[0] ;
         n3930TBLNOM = T01FX5_n3930TBLNOM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3930TBLNOM", A3930TBLNOM);
         A3932ULTLIN = T01FX5_A3932ULTLIN[0] ;
         n3932ULTLIN = T01FX5_n3932ULTLIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         O3932ULTLIN = A3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         Z3928PGMLIN = A3928PGMLIN ;
         sMode1590 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FX1590( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1590 = (short)(0) ;
            initializeNonKey1FX1590( ) ;
         }
         Gx_mode = sMode1590 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1590 = (short)(0) ;
         initializeNonKey1FX1590( ) ;
         sMode1590 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1590 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FX1590( ) ;
      if ( RcdFound1590 == 0 )
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
      RcdFound1590 = (short)(0) ;
      /* Using cursor T01FX8 */
      pr_default.execute(6, new Object[] {Short.valueOf(A3928PGMLIN)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01FX8_A3928PGMLIN[0] < A3928PGMLIN ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01FX8_A3928PGMLIN[0] > A3928PGMLIN ) ) )
         {
            A3928PGMLIN = T01FX8_A3928PGMLIN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
            RcdFound1590 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1590 = (short)(0) ;
      /* Using cursor T01FX9 */
      pr_default.execute(7, new Object[] {Short.valueOf(A3928PGMLIN)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01FX9_A3928PGMLIN[0] > A3928PGMLIN ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01FX9_A3928PGMLIN[0] < A3928PGMLIN ) ) )
         {
            A3928PGMLIN = T01FX9_A3928PGMLIN[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
            RcdFound1590 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FX1590( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3932ULTLIN = O3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         GX_FocusControl = edtPGMLIN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FX1590( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1590 == 1 )
         {
            if ( A3928PGMLIN != Z3928PGMLIN )
            {
               A3928PGMLIN = Z3928PGMLIN ;
               httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PGMLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPGMLIN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3932ULTLIN = O3932ULTLIN ;
               n3932ULTLIN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPGMLIN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3932ULTLIN = O3932ULTLIN ;
               n3932ULTLIN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
               update1FX1590( ) ;
               GX_FocusControl = edtPGMLIN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A3928PGMLIN != Z3928PGMLIN )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3932ULTLIN = O3932ULTLIN ;
               n3932ULTLIN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
               GX_FocusControl = edtPGMLIN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FX1590( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PGMLIN");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPGMLIN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A3932ULTLIN = O3932ULTLIN ;
                  n3932ULTLIN = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
                  GX_FocusControl = edtPGMLIN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FX1590( ) ;
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
      if ( A3928PGMLIN != Z3928PGMLIN )
      {
         A3928PGMLIN = Z3928PGMLIN ;
         httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PGMLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPGMLIN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3932ULTLIN = O3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPGMLIN_Internalname ;
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
      getKey1FX1590( ) ;
      if ( RcdFound1590 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "PGMLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPGMLIN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A3928PGMLIN != Z3928PGMLIN )
         {
            A3928PGMLIN = Z3928PGMLIN ;
            httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "PGMLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPGMLIN_Internalname ;
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
         if ( A3928PGMLIN != Z3928PGMLIN )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PGMLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPGMLIN_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "teuro");
      GX_FocusControl = edtPGMDSC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1FX0( ) ;
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
      if ( RcdFound1590 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "PGMLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPGMLIN_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPGMDSC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1FX1590( ) ;
      if ( RcdFound1590 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPGMDSC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FX1590( ) ;
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
      if ( RcdFound1590 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPGMDSC_Internalname ;
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
      if ( RcdFound1590 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPGMDSC_Internalname ;
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
      scanStart1FX1590( ) ;
      if ( RcdFound1590 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1590 != 0 )
         {
            scanNext1FX1590( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPGMDSC_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1FX1590( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FX1590( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FX4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A3928PGMLIN)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEURO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z3929PGMDSC, T01FX4_A3929PGMDSC[0]) != 0 ) || ( GXutil.strcmp(Z3933PRGMCOD, T01FX4_A3933PRGMCOD[0]) != 0 ) || ( GXutil.strcmp(Z3931TBLCNV, T01FX4_A3931TBLCNV[0]) != 0 ) || ( GXutil.strcmp(Z3930TBLNOM, T01FX4_A3930TBLNOM[0]) != 0 ) || ( Z3932ULTLIN != T01FX4_A3932ULTLIN[0] ) )
         {
            if ( GXutil.strcmp(Z3929PGMDSC, T01FX4_A3929PGMDSC[0]) != 0 )
            {
               GXutil.writeLogln("teuro:[seudo value changed for attri]"+"PGMDSC");
               GXutil.writeLogRaw("Old: ",Z3929PGMDSC);
               GXutil.writeLogRaw("Current: ",T01FX4_A3929PGMDSC[0]);
            }
            if ( GXutil.strcmp(Z3933PRGMCOD, T01FX4_A3933PRGMCOD[0]) != 0 )
            {
               GXutil.writeLogln("teuro:[seudo value changed for attri]"+"PRGMCOD");
               GXutil.writeLogRaw("Old: ",Z3933PRGMCOD);
               GXutil.writeLogRaw("Current: ",T01FX4_A3933PRGMCOD[0]);
            }
            if ( GXutil.strcmp(Z3931TBLCNV, T01FX4_A3931TBLCNV[0]) != 0 )
            {
               GXutil.writeLogln("teuro:[seudo value changed for attri]"+"TBLCNV");
               GXutil.writeLogRaw("Old: ",Z3931TBLCNV);
               GXutil.writeLogRaw("Current: ",T01FX4_A3931TBLCNV[0]);
            }
            if ( GXutil.strcmp(Z3930TBLNOM, T01FX4_A3930TBLNOM[0]) != 0 )
            {
               GXutil.writeLogln("teuro:[seudo value changed for attri]"+"TBLNOM");
               GXutil.writeLogRaw("Old: ",Z3930TBLNOM);
               GXutil.writeLogRaw("Current: ",T01FX4_A3930TBLNOM[0]);
            }
            if ( Z3932ULTLIN != T01FX4_A3932ULTLIN[0] )
            {
               GXutil.writeLogln("teuro:[seudo value changed for attri]"+"ULTLIN");
               GXutil.writeLogRaw("Old: ",Z3932ULTLIN);
               GXutil.writeLogRaw("Current: ",T01FX4_A3932ULTLIN[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCEURO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FX1590( )
   {
      beforeValidate1FX1590( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FX1590( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FX1590( 0) ;
         checkOptimisticConcurrency1FX1590( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FX1590( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FX1590( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FX10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A3928PGMLIN), Boolean.valueOf(n3929PGMDSC), A3929PGMDSC, Boolean.valueOf(n3933PRGMCOD), A3933PRGMCOD, Boolean.valueOf(n3931TBLCNV), A3931TBLCNV, Boolean.valueOf(n3930TBLNOM), A3930TBLNOM, Boolean.valueOf(n3932ULTLIN), Byte.valueOf(A3932ULTLIN)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEURO");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevel1FX1590( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FX0( ) ;
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
            load1FX1590( ) ;
         }
         endLevel1FX1590( ) ;
      }
      closeExtendedTableCursors1FX1590( ) ;
   }

   public void update1FX1590( )
   {
      beforeValidate1FX1590( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FX1590( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FX1590( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FX1590( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FX1590( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FX11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n3929PGMDSC), A3929PGMDSC, Boolean.valueOf(n3933PRGMCOD), A3933PRGMCOD, Boolean.valueOf(n3931TBLCNV), A3931TBLCNV, Boolean.valueOf(n3930TBLNOM), A3930TBLNOM, Boolean.valueOf(n3932ULTLIN), Byte.valueOf(A3932ULTLIN), Short.valueOf(A3928PGMLIN)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEURO");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEURO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1FX1590( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FX1590( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FX0( ) ;
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
         endLevel1FX1590( ) ;
      }
      closeExtendedTableCursors1FX1590( ) ;
   }

   public void deferredUpdate1FX1590( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FX1590( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FX1590( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FX1590( ) ;
         afterConfirm1FX1590( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FX1590( ) ;
            if ( AnyError == 0 )
            {
               A3932ULTLIN = O3932ULTLIN ;
               n3932ULTLIN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
               scanStart1FX1591( ) ;
               while ( RcdFound1591 != 0 )
               {
                  getByPrimaryKey1FX1591( ) ;
                  delete1FX1591( ) ;
                  scanNext1FX1591( ) ;
                  O3932ULTLIN = A3932ULTLIN ;
                  n3932ULTLIN = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
               }
               scanEnd1FX1591( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FX12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A3928PGMLIN)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEURO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1590 == 0 )
                        {
                           initAll1FX1590( ) ;
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
                        resetCaption1FX0( ) ;
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
      sMode1590 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FX1590( ) ;
      Gx_mode = sMode1590 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FX1590( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1FX1591( )
   {
      s3932ULTLIN = O3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1FX1591( ) ;
         if ( ( nRcdExists_1591 != 0 ) || ( nIsMod_1591 != 0 ) )
         {
            standaloneNotModal1FX1591( ) ;
            getKey1FX1591( ) ;
            if ( ( nRcdExists_1591 == 0 ) && ( nRcdDeleted_1591 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FX1591( ) ;
            }
            else
            {
               if ( RcdFound1591 != 0 )
               {
                  if ( ( nRcdDeleted_1591 != 0 ) && ( nRcdExists_1591 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FX1591( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1591 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FX1591( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1591 == 0 )
                  {
                     GXCCtl = "ATRLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtATRLIN_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3932ULTLIN = A3932ULTLIN ;
            n3932ULTLIN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1591_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtATRLIN_Internalname, GXutil.ltrim( localUtil.ntoc( A3934ATRLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtATRCOD_Internalname, GXutil.rtrim( A3935ATRCOD)) ;
         httpContext.changePostValue( "ZT_"+"Z3934ATRLIN_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z3934ATRLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3935ATRCOD_"+sGXsfl_50_idx, GXutil.rtrim( Z3935ATRCOD)) ;
         httpContext.changePostValue( "nRcdDeleted_1591_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1591_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1591_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1591 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1591_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1591_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ATRLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtATRLIN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ATRCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtATRCOD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FX1591( ) ;
      if ( AnyError != 0 )
      {
         O3932ULTLIN = s3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      }
      nRcdExists_1591 = (short)(0) ;
      nIsMod_1591 = (short)(0) ;
      nRcdDeleted_1591 = (short)(0) ;
   }

   public void processLevel1FX1590( )
   {
      /* Save parent mode. */
      sMode1590 = Gx_mode ;
      processNestedLevel1FX1591( ) ;
      if ( AnyError != 0 )
      {
         O3932ULTLIN = s3932ULTLIN ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1590 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01FX13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n3932ULTLIN), Byte.valueOf(A3932ULTLIN), Short.valueOf(A3928PGMLIN)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEURO");
   }

   public void endLevel1FX1590( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1FX1590( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "teuro");
         if ( AnyError == 0 )
         {
            confirmValues1FX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "teuro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FX1590( )
   {
      /* Scan By routine */
      /* Using cursor T01FX14 */
      pr_default.execute(12);
      RcdFound1590 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1590 = (short)(1) ;
         A3928PGMLIN = T01FX14_A3928PGMLIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FX1590( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1590 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1590 = (short)(1) ;
         A3928PGMLIN = T01FX14_A3928PGMLIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
      }
   }

   public void scanEnd1FX1590( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1FX1590( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FX1590( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FX1590( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FX1590( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FX1590( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FX1590( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FX1590( )
   {
      edtPGMLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPGMLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPGMLIN_Enabled), 5, 0), true);
      edtPGMDSC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPGMDSC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPGMDSC_Enabled), 5, 0), true);
      edtPRGMCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPRGMCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPRGMCOD_Enabled), 5, 0), true);
      edtTBLCNV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBLCNV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTBLCNV_Enabled), 5, 0), true);
      edtTBLNOM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBLNOM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTBLNOM_Enabled), 5, 0), true);
      edtULTLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtULTLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtULTLIN_Enabled), 5, 0), true);
   }

   public void zm1FX1591( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3935ATRCOD = T01FX3_A3935ATRCOD[0] ;
         }
         else
         {
            Z3935ATRCOD = A3935ATRCOD ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z3928PGMLIN = A3928PGMLIN ;
         Z3934ATRLIN = A3934ATRLIN ;
         Z3935ATRCOD = A3935ATRCOD ;
      }
   }

   public void standaloneNotModal1FX1591( )
   {
      edtULTLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtULTLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtULTLIN_Enabled), 5, 0), true);
      edtULTLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtULTLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtULTLIN_Enabled), 5, 0), true);
   }

   public void standaloneModal1FX1591( )
   {
      if ( isIns( )  )
      {
         A3932ULTLIN = (byte)(O3932ULTLIN+1) ;
         n3932ULTLIN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A3934ATRLIN = A3932ULTLIN ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtATRLIN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtATRLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRLIN_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtATRLIN_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtATRLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRLIN_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1FX1591( )
   {
      /* Using cursor T01FX15 */
      pr_default.execute(13, new Object[] {Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1591 = (short)(1) ;
         A3935ATRCOD = T01FX15_A3935ATRCOD[0] ;
         n3935ATRCOD = T01FX15_n3935ATRCOD[0] ;
         zm1FX1591( -6) ;
      }
      pr_default.close(13);
      onLoadActions1FX1591( ) ;
   }

   public void onLoadActions1FX1591( )
   {
   }

   public void checkExtendedTable1FX1591( )
   {
      nIsDirty_1591 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1FX1591( ) ;
   }

   public void closeExtendedTableCursors1FX1591( )
   {
   }

   public void enableDisable1FX1591( )
   {
   }

   public void getKey1FX1591( )
   {
      /* Using cursor T01FX16 */
      pr_default.execute(14, new Object[] {Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1591 = (short)(1) ;
      }
      else
      {
         RcdFound1591 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey1FX1591( )
   {
      /* Using cursor T01FX3 */
      pr_default.execute(1, new Object[] {Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1FX1591( 6) ;
         RcdFound1591 = (short)(1) ;
         initializeNonKey1FX1591( ) ;
         A3934ATRLIN = T01FX3_A3934ATRLIN[0] ;
         A3935ATRCOD = T01FX3_A3935ATRCOD[0] ;
         n3935ATRCOD = T01FX3_n3935ATRCOD[0] ;
         Z3928PGMLIN = A3928PGMLIN ;
         Z3934ATRLIN = A3934ATRLIN ;
         sMode1591 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FX1591( ) ;
         load1FX1591( ) ;
         Gx_mode = sMode1591 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1591 = (short)(0) ;
         initializeNonKey1FX1591( ) ;
         sMode1591 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FX1591( ) ;
         Gx_mode = sMode1591 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FX1591( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FX1591( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FX2 */
         pr_default.execute(0, new Object[] {Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEURO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3935ATRCOD, T01FX2_A3935ATRCOD[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3935ATRCOD, T01FX2_A3935ATRCOD[0]) != 0 )
            {
               GXutil.writeLogln("teuro:[seudo value changed for attri]"+"ATRCOD");
               GXutil.writeLogRaw("Old: ",Z3935ATRCOD);
               GXutil.writeLogRaw("Current: ",T01FX2_A3935ATRCOD[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLEURO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FX1591( )
   {
      beforeValidate1FX1591( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FX1591( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FX1591( 0) ;
         checkOptimisticConcurrency1FX1591( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FX1591( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FX1591( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FX17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN), Boolean.valueOf(n3935ATRCOD), A3935ATRCOD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEURO");
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
            load1FX1591( ) ;
         }
         endLevel1FX1591( ) ;
      }
      closeExtendedTableCursors1FX1591( ) ;
   }

   public void update1FX1591( )
   {
      beforeValidate1FX1591( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FX1591( ) ;
      }
      if ( ( nIsMod_1591 != 0 ) || ( nIsDirty_1591 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FX1591( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FX1591( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FX1591( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FX18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n3935ATRCOD), A3935ATRCOD, Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEURO");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLEURO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FX1591( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FX1591( ) ;
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
            endLevel1FX1591( ) ;
         }
      }
      closeExtendedTableCursors1FX1591( ) ;
   }

   public void deferredUpdate1FX1591( )
   {
   }

   public void delete1FX1591( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FX1591( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FX1591( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FX1591( ) ;
         afterConfirm1FX1591( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FX1591( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FX19 */
               pr_default.execute(17, new Object[] {Short.valueOf(A3928PGMLIN), Byte.valueOf(A3934ATRLIN)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEURO");
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
      sMode1591 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FX1591( ) ;
      Gx_mode = sMode1591 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FX1591( )
   {
      standaloneModal1FX1591( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FX1591( )
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

   public void scanStart1FX1591( )
   {
      /* Scan By routine */
      /* Using cursor T01FX20 */
      pr_default.execute(18, new Object[] {Short.valueOf(A3928PGMLIN)});
      RcdFound1591 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1591 = (short)(1) ;
         A3934ATRLIN = T01FX20_A3934ATRLIN[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FX1591( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1591 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1591 = (short)(1) ;
         A3934ATRLIN = T01FX20_A3934ATRLIN[0] ;
      }
   }

   public void scanEnd1FX1591( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1FX1591( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FX1591( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FX1591( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FX1591( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FX1591( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FX1591( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FX1591( )
   {
      edtATRLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtATRLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRLIN_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtATRCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtATRCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRCOD_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1FX1591( )
   {
   }

   public void send_integrity_lvl_hashes1FX1590( )
   {
   }

   public void subsflControlProps_501591( )
   {
      edtavnRcdDeleted_1591_Internalname = "vNRCDDELETED_1591_"+sGXsfl_50_idx ;
      edtATRLIN_Internalname = "ATRLIN_"+sGXsfl_50_idx ;
      edtATRCOD_Internalname = "ATRCOD_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501591( )
   {
      edtavnRcdDeleted_1591_Internalname = "vNRCDDELETED_1591_"+sGXsfl_50_fel_idx ;
      edtATRLIN_Internalname = "ATRLIN_"+sGXsfl_50_fel_idx ;
      edtATRCOD_Internalname = "ATRCOD_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1FX1591( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501591( ) ;
      sendRow1FX1591( ) ;
   }

   public void sendRow1FX1591( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1591_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1591_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1591_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1591), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1591), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1591_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1591_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1591_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtATRLIN_Internalname,GXutil.ltrim( localUtil.ntoc( A3934ATRLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3934ATRLIN), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtATRLIN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtATRLIN_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1591_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtATRCOD_Internalname,GXutil.rtrim( A3935ATRCOD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtATRCOD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtATRCOD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FX1591( ) ;
      GXCCtl = "Z3934ATRLIN_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3934ATRLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3935ATRCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3935ATRCOD));
      GXCCtl = "nRcdDeleted_1591_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1591_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1591_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1591, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPGMLIN_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV7PGMLIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1591_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1591_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ATRLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtATRLIN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ATRCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtATRCOD_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FX1591( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501591( ) ;
      edtavnRcdDeleted_1591_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1591_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtATRLIN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ATRLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtATRCOD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ATRCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1591_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1591_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1591");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1591_Internalname ;
         wbErr = true ;
         nRcdDeleted_1591 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1591 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1591_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtATRLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtATRLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ATRLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtATRLIN_Internalname ;
         wbErr = true ;
         A3934ATRLIN = (byte)(0) ;
      }
      else
      {
         A3934ATRLIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtATRLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3935ATRCOD = httpContext.cgiGet( edtATRCOD_Internalname) ;
      n3935ATRCOD = false ;
      GXCCtl = "Z3934ATRLIN_" + sGXsfl_50_idx ;
      Z3934ATRLIN = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3935ATRCOD_" + sGXsfl_50_idx ;
      Z3935ATRCOD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1591_" + sGXsfl_50_idx ;
      nRcdDeleted_1591 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1591_" + sGXsfl_50_idx ;
      nRcdExists_1591 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1591_" + sGXsfl_50_idx ;
      nIsMod_1591 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtATRLIN_Enabled = edtATRLIN_Enabled ;
   }

   public void confirmValues1FX0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501591( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501591( ) ;
         httpContext.changePostValue( "Z3934ATRLIN_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3934ATRLIN_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3934ATRLIN_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3935ATRCOD_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3935ATRCOD_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3935ATRCOD_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.teuro", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV7PGMLIN,4,0))}, new String[] {"PGMLIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3928PGMLIN", GXutil.ltrim( localUtil.ntoc( Z3928PGMLIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3929PGMDSC", GXutil.rtrim( Z3929PGMDSC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3933PRGMCOD", GXutil.rtrim( Z3933PRGMCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3931TBLCNV", GXutil.rtrim( Z3931TBLCNV));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3930TBLNOM", GXutil.rtrim( Z3930TBLNOM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3932ULTLIN", GXutil.ltrim( localUtil.ntoc( Z3932ULTLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3932ULTLIN", GXutil.ltrim( localUtil.ntoc( O3932ULTLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMLIN", GXutil.ltrim( localUtil.ntoc( AV7PGMLIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.teuro", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV7PGMLIN,4,0))}, new String[] {"PGMLIN"})  ;
   }

   public String getPgmname( )
   {
      return "TEURO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "EURO", "") ;
   }

   public void initializeNonKey1FX1590( )
   {
      A3929PGMDSC = "" ;
      n3929PGMDSC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3929PGMDSC", A3929PGMDSC);
      A3933PRGMCOD = "" ;
      n3933PRGMCOD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3933PRGMCOD", A3933PRGMCOD);
      A3931TBLCNV = "" ;
      n3931TBLCNV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3931TBLCNV", A3931TBLCNV);
      A3930TBLNOM = "" ;
      n3930TBLNOM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3930TBLNOM", A3930TBLNOM);
      A3932ULTLIN = (byte)(0) ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      O3932ULTLIN = A3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
      Z3929PGMDSC = "" ;
      Z3933PRGMCOD = "" ;
      Z3931TBLCNV = "" ;
      Z3930TBLNOM = "" ;
      Z3932ULTLIN = (byte)(0) ;
   }

   public void initAll1FX1590( )
   {
      A3928PGMLIN = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3928PGMLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3928PGMLIN), 4, 0));
      initializeNonKey1FX1590( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FX1591( )
   {
      A3935ATRCOD = "" ;
      n3935ATRCOD = false ;
      Z3935ATRCOD = "" ;
   }

   public void initAll1FX1591( )
   {
      A3934ATRLIN = (byte)(0) ;
      initializeNonKey1FX1591( ) ;
   }

   public void standaloneModalInsert1FX1591( )
   {
      A3932ULTLIN = i3932ULTLIN ;
      n3932ULTLIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3932ULTLIN), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026125193579", true, true);
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
      httpContext.AddJavascriptSource("teuro.js", "?2026125193579", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1591( )
   {
      edtATRLIN_Enabled = defedtATRLIN_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtATRLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtATRLIN_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1591, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1591_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3934ATRLIN, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtATRLIN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3935ATRCOD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtATRCOD_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPGMLIN_Internalname = "PGMLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtPGMDSC_Internalname = "PGMDSC" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPRGMCOD_Internalname = "PRGMCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTBLCNV_Internalname = "TBLCNV" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTBLNOM_Internalname = "TBLNOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtULTLIN_Internalname = "ULTLIN" ;
      edtavnRcdDeleted_1591_Internalname = "vNRCDDELETED_1591" ;
      edtATRLIN_Internalname = "ATRLIN" ;
      edtATRCOD_Internalname = "ATRCOD" ;
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
      Form.setCaption( httpContext.getMessage( "EURO", "") );
      edtATRCOD_Jsonclick = "" ;
      edtATRLIN_Jsonclick = "" ;
      edtavnRcdDeleted_1591_Jsonclick = "" ;
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
      edtATRCOD_Enabled = 1 ;
      edtATRLIN_Enabled = 1 ;
      edtavnRcdDeleted_1591_Enabled = 1 ;
      edtULTLIN_Jsonclick = "" ;
      edtULTLIN_Backcolor = (int)(0xFFFFFF) ;
      edtULTLIN_Enabled = 0 ;
      edtTBLNOM_Jsonclick = "" ;
      edtTBLNOM_Backcolor = (int)(0xFFFFFF) ;
      edtTBLNOM_Enabled = 1 ;
      edtTBLCNV_Jsonclick = "" ;
      edtTBLCNV_Backcolor = (int)(0xFFFFFF) ;
      edtTBLCNV_Enabled = 1 ;
      edtPRGMCOD_Jsonclick = "" ;
      edtPRGMCOD_Backcolor = (int)(0xFFFFFF) ;
      edtPRGMCOD_Enabled = 1 ;
      edtPGMDSC_Jsonclick = "" ;
      edtPGMDSC_Backcolor = (int)(0xFFFFFF) ;
      edtPGMDSC_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPGMLIN_Jsonclick = "" ;
      edtPGMLIN_Backcolor = (int)(0xFFFFFF) ;
      edtPGMLIN_Enabled = 1 ;
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
      subsflControlProps_501591( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FX1591( ) ;
         standaloneModal1FX1591( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FX1591( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501591( ) ;
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
      GX_FocusControl = edtPGMDSC_Internalname ;
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

   public void valid_Pgmlin( )
   {
      n3932ULTLIN = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3929PGMDSC", GXutil.rtrim( A3929PGMDSC));
      httpContext.ajax_rsp_assign_attri("", false, "A3933PRGMCOD", GXutil.rtrim( A3933PRGMCOD));
      httpContext.ajax_rsp_assign_attri("", false, "A3931TBLCNV", GXutil.rtrim( A3931TBLCNV));
      httpContext.ajax_rsp_assign_attri("", false, "A3930TBLNOM", GXutil.rtrim( A3930TBLNOM));
      httpContext.ajax_rsp_assign_attri("", false, "A3932ULTLIN", GXutil.ltrim( localUtil.ntoc( A3932ULTLIN, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3928PGMLIN", GXutil.ltrim( localUtil.ntoc( Z3928PGMLIN, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3929PGMDSC", GXutil.rtrim( Z3929PGMDSC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3933PRGMCOD", GXutil.rtrim( Z3933PRGMCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3931TBLCNV", GXutil.rtrim( Z3931TBLCNV));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3930TBLNOM", GXutil.rtrim( Z3930TBLNOM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3932ULTLIN", GXutil.ltrim( localUtil.ntoc( Z3932ULTLIN, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3932ULTLIN", GXutil.ltrim( localUtil.ntoc( O3932ULTLIN, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'AV7PGMLIN',fld:'vPGMLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_PGMLIN","{handler:'valid_Pgmlin',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3932ULTLIN',fld:'ULTLIN',pic:'Z9'},{av:'A3928PGMLIN',fld:'PGMLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PGMLIN",",oparms:[{av:'A3929PGMDSC',fld:'PGMDSC',pic:''},{av:'A3933PRGMCOD',fld:'PRGMCOD',pic:''},{av:'A3931TBLCNV',fld:'TBLCNV',pic:''},{av:'A3930TBLNOM',fld:'TBLNOM',pic:''},{av:'A3932ULTLIN',fld:'ULTLIN',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z3928PGMLIN'},{av:'Z3929PGMDSC'},{av:'Z3933PRGMCOD'},{av:'Z3931TBLCNV'},{av:'Z3930TBLNOM'},{av:'Z3932ULTLIN'},{av:'O3932ULTLIN'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ULTLIN","{handler:'valid_Ultlin',iparms:[]");
      setEventMetadata("VALID_ULTLIN",",oparms:[]}");
      setEventMetadata("VALID_ATRLIN","{handler:'valid_Atrlin',iparms:[]");
      setEventMetadata("VALID_ATRLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Atrcod',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z3929PGMDSC = "" ;
      Z3933PRGMCOD = "" ;
      Z3931TBLCNV = "" ;
      Z3930TBLNOM = "" ;
      Z3935ATRCOD = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A3929PGMDSC = "" ;
      lblTextblock3_Jsonclick = "" ;
      A3933PRGMCOD = "" ;
      lblTextblock4_Jsonclick = "" ;
      A3931TBLCNV = "" ;
      lblTextblock5_Jsonclick = "" ;
      A3930TBLNOM = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1591 = "" ;
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
      sMode1590 = "" ;
      GXCCtl = "" ;
      A3935ATRCOD = "" ;
      T01FX6_A3928PGMLIN = new short[1] ;
      T01FX6_A3929PGMDSC = new String[] {""} ;
      T01FX6_n3929PGMDSC = new boolean[] {false} ;
      T01FX6_A3933PRGMCOD = new String[] {""} ;
      T01FX6_n3933PRGMCOD = new boolean[] {false} ;
      T01FX6_A3931TBLCNV = new String[] {""} ;
      T01FX6_n3931TBLCNV = new boolean[] {false} ;
      T01FX6_A3930TBLNOM = new String[] {""} ;
      T01FX6_n3930TBLNOM = new boolean[] {false} ;
      T01FX6_A3932ULTLIN = new byte[1] ;
      T01FX6_n3932ULTLIN = new boolean[] {false} ;
      T01FX7_A3928PGMLIN = new short[1] ;
      T01FX5_A3928PGMLIN = new short[1] ;
      T01FX5_A3929PGMDSC = new String[] {""} ;
      T01FX5_n3929PGMDSC = new boolean[] {false} ;
      T01FX5_A3933PRGMCOD = new String[] {""} ;
      T01FX5_n3933PRGMCOD = new boolean[] {false} ;
      T01FX5_A3931TBLCNV = new String[] {""} ;
      T01FX5_n3931TBLCNV = new boolean[] {false} ;
      T01FX5_A3930TBLNOM = new String[] {""} ;
      T01FX5_n3930TBLNOM = new boolean[] {false} ;
      T01FX5_A3932ULTLIN = new byte[1] ;
      T01FX5_n3932ULTLIN = new boolean[] {false} ;
      T01FX8_A3928PGMLIN = new short[1] ;
      T01FX9_A3928PGMLIN = new short[1] ;
      T01FX4_A3928PGMLIN = new short[1] ;
      T01FX4_A3929PGMDSC = new String[] {""} ;
      T01FX4_n3929PGMDSC = new boolean[] {false} ;
      T01FX4_A3933PRGMCOD = new String[] {""} ;
      T01FX4_n3933PRGMCOD = new boolean[] {false} ;
      T01FX4_A3931TBLCNV = new String[] {""} ;
      T01FX4_n3931TBLCNV = new boolean[] {false} ;
      T01FX4_A3930TBLNOM = new String[] {""} ;
      T01FX4_n3930TBLNOM = new boolean[] {false} ;
      T01FX4_A3932ULTLIN = new byte[1] ;
      T01FX4_n3932ULTLIN = new boolean[] {false} ;
      T01FX14_A3928PGMLIN = new short[1] ;
      T01FX15_A3928PGMLIN = new short[1] ;
      T01FX15_A3934ATRLIN = new byte[1] ;
      T01FX15_A3935ATRCOD = new String[] {""} ;
      T01FX15_n3935ATRCOD = new boolean[] {false} ;
      T01FX16_A3928PGMLIN = new short[1] ;
      T01FX16_A3934ATRLIN = new byte[1] ;
      T01FX3_A3928PGMLIN = new short[1] ;
      T01FX3_A3934ATRLIN = new byte[1] ;
      T01FX3_A3935ATRCOD = new String[] {""} ;
      T01FX3_n3935ATRCOD = new boolean[] {false} ;
      T01FX2_A3928PGMLIN = new short[1] ;
      T01FX2_A3934ATRLIN = new byte[1] ;
      T01FX2_A3935ATRCOD = new String[] {""} ;
      T01FX2_n3935ATRCOD = new boolean[] {false} ;
      T01FX20_A3928PGMLIN = new short[1] ;
      T01FX20_A3934ATRLIN = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ3929PGMDSC = "" ;
      ZZ3933PRGMCOD = "" ;
      ZZ3931TBLCNV = "" ;
      ZZ3930TBLNOM = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.teuro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.teuro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.teuro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.teuro__default(),
         new Object[] {
             new Object[] {
            T01FX2_A3928PGMLIN, T01FX2_A3934ATRLIN, T01FX2_A3935ATRCOD, T01FX2_n3935ATRCOD
            }
            , new Object[] {
            T01FX3_A3928PGMLIN, T01FX3_A3934ATRLIN, T01FX3_A3935ATRCOD, T01FX3_n3935ATRCOD
            }
            , new Object[] {
            T01FX4_A3928PGMLIN, T01FX4_A3929PGMDSC, T01FX4_n3929PGMDSC, T01FX4_A3933PRGMCOD, T01FX4_n3933PRGMCOD, T01FX4_A3931TBLCNV, T01FX4_n3931TBLCNV, T01FX4_A3930TBLNOM, T01FX4_n3930TBLNOM, T01FX4_A3932ULTLIN,
            T01FX4_n3932ULTLIN
            }
            , new Object[] {
            T01FX5_A3928PGMLIN, T01FX5_A3929PGMDSC, T01FX5_n3929PGMDSC, T01FX5_A3933PRGMCOD, T01FX5_n3933PRGMCOD, T01FX5_A3931TBLCNV, T01FX5_n3931TBLCNV, T01FX5_A3930TBLNOM, T01FX5_n3930TBLNOM, T01FX5_A3932ULTLIN,
            T01FX5_n3932ULTLIN
            }
            , new Object[] {
            T01FX6_A3928PGMLIN, T01FX6_A3929PGMDSC, T01FX6_n3929PGMDSC, T01FX6_A3933PRGMCOD, T01FX6_n3933PRGMCOD, T01FX6_A3931TBLCNV, T01FX6_n3931TBLCNV, T01FX6_A3930TBLNOM, T01FX6_n3930TBLNOM, T01FX6_A3932ULTLIN,
            T01FX6_n3932ULTLIN
            }
            , new Object[] {
            T01FX7_A3928PGMLIN
            }
            , new Object[] {
            T01FX8_A3928PGMLIN
            }
            , new Object[] {
            T01FX9_A3928PGMLIN
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
            T01FX14_A3928PGMLIN
            }
            , new Object[] {
            T01FX15_A3928PGMLIN, T01FX15_A3934ATRLIN, T01FX15_A3935ATRCOD, T01FX15_n3935ATRCOD
            }
            , new Object[] {
            T01FX16_A3928PGMLIN, T01FX16_A3934ATRLIN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FX20_A3928PGMLIN, T01FX20_A3934ATRLIN
            }
         }
      );
   }

   private byte Z3932ULTLIN ;
   private byte O3932ULTLIN ;
   private byte Z3934ATRLIN ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3932ULTLIN ;
   private byte Gx_BScreen ;
   private byte B3932ULTLIN ;
   private byte s3932ULTLIN ;
   private byte A3934ATRLIN ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i3932ULTLIN ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ3932ULTLIN ;
   private byte ZO3932ULTLIN ;
   private short wcpOAV7PGMLIN ;
   private short Z3928PGMLIN ;
   private short nRcdDeleted_1591 ;
   private short nRcdExists_1591 ;
   private short nIsMod_1591 ;
   private short AV7PGMLIN ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3928PGMLIN ;
   private short nBlankRcdCount1591 ;
   private short RcdFound1591 ;
   private short nBlankRcdUsr1591 ;
   private short RcdFound1590 ;
   private short nIsDirty_1590 ;
   private short nIsDirty_1591 ;
   private short ZZ3928PGMLIN ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtPGMLIN_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPGMDSC_Enabled ;
   private int edtPRGMCOD_Enabled ;
   private int edtTBLCNV_Enabled ;
   private int edtTBLNOM_Enabled ;
   private int edtULTLIN_Enabled ;
   private int edtavnRcdDeleted_1591_Enabled ;
   private int edtATRLIN_Enabled ;
   private int edtATRCOD_Enabled ;
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
   private int defedtATRLIN_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtULTLIN_Backcolor ;
   private int edtTBLNOM_Backcolor ;
   private int edtTBLCNV_Backcolor ;
   private int edtPRGMCOD_Backcolor ;
   private int edtPGMDSC_Backcolor ;
   private int edtPGMLIN_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z3929PGMDSC ;
   private String Z3933PRGMCOD ;
   private String Z3931TBLCNV ;
   private String Z3930TBLNOM ;
   private String Z3935ATRCOD ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPGMLIN_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtPGMLIN_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtPGMDSC_Internalname ;
   private String A3929PGMDSC ;
   private String edtPGMDSC_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPRGMCOD_Internalname ;
   private String A3933PRGMCOD ;
   private String edtPRGMCOD_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTBLCNV_Internalname ;
   private String A3931TBLCNV ;
   private String edtTBLCNV_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTBLNOM_Internalname ;
   private String A3930TBLNOM ;
   private String edtTBLNOM_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtULTLIN_Internalname ;
   private String edtULTLIN_Jsonclick ;
   private String sMode1591 ;
   private String edtavnRcdDeleted_1591_Internalname ;
   private String edtATRLIN_Internalname ;
   private String edtATRCOD_Internalname ;
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
   private String sMode1590 ;
   private String GXCCtl ;
   private String A3935ATRCOD ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1591_Jsonclick ;
   private String edtATRLIN_Jsonclick ;
   private String edtATRCOD_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ3929PGMDSC ;
   private String ZZ3933PRGMCOD ;
   private String ZZ3931TBLCNV ;
   private String ZZ3930TBLNOM ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n3932ULTLIN ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n3929PGMDSC ;
   private boolean n3933PRGMCOD ;
   private boolean n3931TBLCNV ;
   private boolean n3930TBLNOM ;
   private boolean n3935ATRCOD ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private short[] T01FX6_A3928PGMLIN ;
   private String[] T01FX6_A3929PGMDSC ;
   private boolean[] T01FX6_n3929PGMDSC ;
   private String[] T01FX6_A3933PRGMCOD ;
   private boolean[] T01FX6_n3933PRGMCOD ;
   private String[] T01FX6_A3931TBLCNV ;
   private boolean[] T01FX6_n3931TBLCNV ;
   private String[] T01FX6_A3930TBLNOM ;
   private boolean[] T01FX6_n3930TBLNOM ;
   private byte[] T01FX6_A3932ULTLIN ;
   private boolean[] T01FX6_n3932ULTLIN ;
   private short[] T01FX7_A3928PGMLIN ;
   private short[] T01FX5_A3928PGMLIN ;
   private String[] T01FX5_A3929PGMDSC ;
   private boolean[] T01FX5_n3929PGMDSC ;
   private String[] T01FX5_A3933PRGMCOD ;
   private boolean[] T01FX5_n3933PRGMCOD ;
   private String[] T01FX5_A3931TBLCNV ;
   private boolean[] T01FX5_n3931TBLCNV ;
   private String[] T01FX5_A3930TBLNOM ;
   private boolean[] T01FX5_n3930TBLNOM ;
   private byte[] T01FX5_A3932ULTLIN ;
   private boolean[] T01FX5_n3932ULTLIN ;
   private short[] T01FX8_A3928PGMLIN ;
   private short[] T01FX9_A3928PGMLIN ;
   private short[] T01FX4_A3928PGMLIN ;
   private String[] T01FX4_A3929PGMDSC ;
   private boolean[] T01FX4_n3929PGMDSC ;
   private String[] T01FX4_A3933PRGMCOD ;
   private boolean[] T01FX4_n3933PRGMCOD ;
   private String[] T01FX4_A3931TBLCNV ;
   private boolean[] T01FX4_n3931TBLCNV ;
   private String[] T01FX4_A3930TBLNOM ;
   private boolean[] T01FX4_n3930TBLNOM ;
   private byte[] T01FX4_A3932ULTLIN ;
   private boolean[] T01FX4_n3932ULTLIN ;
   private short[] T01FX14_A3928PGMLIN ;
   private short[] T01FX15_A3928PGMLIN ;
   private byte[] T01FX15_A3934ATRLIN ;
   private String[] T01FX15_A3935ATRCOD ;
   private boolean[] T01FX15_n3935ATRCOD ;
   private short[] T01FX16_A3928PGMLIN ;
   private byte[] T01FX16_A3934ATRLIN ;
   private short[] T01FX3_A3928PGMLIN ;
   private byte[] T01FX3_A3934ATRLIN ;
   private String[] T01FX3_A3935ATRCOD ;
   private boolean[] T01FX3_n3935ATRCOD ;
   private short[] T01FX2_A3928PGMLIN ;
   private byte[] T01FX2_A3934ATRLIN ;
   private String[] T01FX2_A3935ATRCOD ;
   private boolean[] T01FX2_n3935ATRCOD ;
   private short[] T01FX20_A3928PGMLIN ;
   private byte[] T01FX20_A3934ATRLIN ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class teuro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class teuro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class teuro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class teuro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FX2", "SELECT PGMLIN, ATRLIN, ATRCOD FROM TXPLEURO WHERE PGMLIN = ? AND ATRLIN = ?  FOR UPDATE OF ATRCOD NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX3", "SELECT PGMLIN, ATRLIN, ATRCOD FROM TXPLEURO WHERE PGMLIN = ? AND ATRLIN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX4", "SELECT PGMLIN, PGMDSC, PRGMCOD, TBLCNV, TBLNOM, ULTLIN FROM TXPCEURO WHERE PGMLIN = ?  FOR UPDATE OF PGMDSC, PRGMCOD, TBLCNV, TBLNOM, ULTLIN NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX5", "SELECT PGMLIN, PGMDSC, PRGMCOD, TBLCNV, TBLNOM, ULTLIN FROM TXPCEURO WHERE PGMLIN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX6", "SELECT /*+ FIRST_ROWS(100) */ TM1.PGMLIN, TM1.PGMDSC, TM1.PRGMCOD, TM1.TBLCNV, TM1.TBLNOM, TM1.ULTLIN FROM TXPCEURO TM1 WHERE TM1.PGMLIN = ? ORDER BY TM1.PGMLIN ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX7", "SELECT /*+ FIRST_ROWS(1) */ PGMLIN FROM TXPCEURO WHERE PGMLIN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PGMLIN FROM TXPCEURO WHERE ( PGMLIN > ?) ORDER BY PGMLIN) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FX9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PGMLIN FROM TXPCEURO WHERE ( PGMLIN < ?) ORDER BY PGMLIN DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FX10", "INSERT INTO TXPCEURO(PGMLIN, PGMDSC, PRGMCOD, TBLCNV, TBLNOM, ULTLIN) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCEURO")
         ,new UpdateCursor("T01FX11", "UPDATE TXPCEURO SET PGMDSC=?, PRGMCOD=?, TBLCNV=?, TBLNOM=?, ULTLIN=?  WHERE PGMLIN = ?", GX_NOMASK, "TXPCEURO")
         ,new UpdateCursor("T01FX12", "DELETE FROM TXPCEURO  WHERE PGMLIN = ?", GX_NOMASK, "TXPCEURO")
         ,new UpdateCursor("T01FX13", "UPDATE TXPCEURO SET ULTLIN=?  WHERE PGMLIN = ?", GX_NOMASK, "TXPCEURO")
         ,new ForEachCursor("T01FX14", "SELECT /*+ FIRST_ROWS(100) */ PGMLIN FROM TXPCEURO ORDER BY PGMLIN ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX15", "SELECT PGMLIN, ATRLIN, ATRCOD FROM TXPLEURO WHERE PGMLIN = ? and ATRLIN = ? ORDER BY PGMLIN, ATRLIN ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FX16", "SELECT PGMLIN, ATRLIN FROM TXPLEURO WHERE PGMLIN = ? AND ATRLIN = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FX17", "INSERT INTO TXPLEURO(PGMLIN, ATRLIN, ATRCOD) VALUES(?, ?, ?)", GX_NOMASK, "TXPLEURO")
         ,new UpdateCursor("T01FX18", "UPDATE TXPLEURO SET ATRCOD=?  WHERE PGMLIN = ? AND ATRLIN = ?", GX_NOMASK, "TXPLEURO")
         ,new UpdateCursor("T01FX19", "DELETE FROM TXPLEURO  WHERE PGMLIN = ? AND ATRLIN = ?", GX_NOMASK, "TXPLEURO")
         ,new ForEachCursor("T01FX20", "SELECT PGMLIN, ATRLIN FROM TXPLEURO WHERE PGMLIN = ? ORDER BY PGMLIN, ATRLIN ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 40);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 8);
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
                  stmt.setString(4, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               stmt.setShort(6, ((Number) parms[10]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 12);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 12);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 17 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}

