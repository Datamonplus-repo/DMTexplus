package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tgradop_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Grados Pilling", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtGradoID_Internalname ;
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
      A11871GradoUlt = (short)(GXutil.lval( httpContext.GetPar( "GradoUlt"))) ;
      n11871GradoUlt = false ;
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

   public tgradop_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tgradop_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgradop_impl.class ));
   }

   public tgradop_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TGRADOP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Grado ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGradoID_Internalname, GXutil.ltrim( localUtil.ntoc( A11873GradoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGradoID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11873GradoID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11873GradoID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGradoID_Jsonclick, 0, "", "", "", "", "", 1, edtGradoID_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Description", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGradoDc_Internalname, GXutil.rtrim( A11870GradoDc), GXutil.rtrim( localUtil.format( A11870GradoDc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGradoDc_Jsonclick, 0, "", "", "", "", "", 1, edtGradoDc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TGRADOP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGradoUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A11871GradoUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGradoUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11871GradoUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11871GradoUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGradoUlt_Jsonclick, 0, "", "", "", "", "", 1, edtGradoUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TGRADOP.htm");
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
         nBlankRcdCount1664 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1664 = (short)(1) ;
            scanStart1IG1664( ) ;
            while ( RcdFound1664 != 0 )
            {
               init_level_properties1664( ) ;
               getByPrimaryKey1IG1664( ) ;
               addRow1IG1664( ) ;
               scanNext1IG1664( ) ;
            }
            scanEnd1IG1664( ) ;
            nBlankRcdCount1664 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11871GradoUlt = A11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         standaloneNotModal1IG1664( ) ;
         standaloneModal1IG1664( ) ;
         sMode1664 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1IG1664( ) ;
            edtavnRcdDeleted_1664_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1664_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1664_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1664_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGradoLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRADOLN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGradoLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtGradoPts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRADOPTS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGradoPts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoPts_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1664 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1IG1664( ) ;
            }
            sendRow1IG1664( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1664 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11871GradoUlt = B11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1664 = (short)(5) ;
         nRcdExists_1664 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1IG1664( ) ;
            while ( RcdFound1664 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451664( ) ;
               init_level_properties1664( ) ;
               standaloneNotModal1IG1664( ) ;
               getByPrimaryKey1IG1664( ) ;
               standaloneModal1IG1664( ) ;
               addRow1IG1664( ) ;
               scanNext1IG1664( ) ;
            }
            scanEnd1IG1664( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1664 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451664( ) ;
      initAll1IG1664( ) ;
      init_level_properties1664( ) ;
      B11871GradoUlt = A11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      nRcdExists_1664 = (short)(0) ;
      nIsMod_1664 = (short)(0) ;
      nRcdDeleted_1664 = (short)(0) ;
      nBlankRcdCount1664 = (short)(nBlankRcdUsr1664+nBlankRcdCount1664) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1664 > 0 )
      {
         standaloneNotModal1IG1664( ) ;
         standaloneModal1IG1664( ) ;
         addRow1IG1664( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtGradoLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1664 = (short)(nBlankRcdCount1664-1) ;
      }
      Gx_mode = sMode1664 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11871GradoUlt = B11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TGRADOP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TGRADOP.htm");
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
      e111IG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11873GradoID = (short)(localUtil.ctol( httpContext.cgiGet( "Z11873GradoID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11870GradoDc = httpContext.cgiGet( "Z11870GradoDc") ;
            Z11871GradoUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z11871GradoUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11871GradoUlt = (short)(localUtil.ctol( httpContext.cgiGet( "O11871GradoUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGradoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGradoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRADOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGradoID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11873GradoID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
            }
            else
            {
               A11873GradoID = (short)(localUtil.ctol( httpContext.cgiGet( edtGradoID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
            }
            A11870GradoDc = httpContext.cgiGet( edtGradoDc_Internalname) ;
            n11870GradoDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11870GradoDc", A11870GradoDc);
            A11871GradoUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtGradoUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11871GradoUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
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
               A11873GradoID = (short)(GXutil.lval( httpContext.GetPar( "GradoID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
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
                        e111IG2 ();
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
            initAll1IG1663( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1664_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1664_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1IG1663( ) ;
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

   public void confirm_1IG0( )
   {
      beforeValidate1IG1663( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IG1663( ) ;
         }
         else
         {
            checkExtendedTable1IG1663( ) ;
            if ( AnyError == 0 )
            {
               zm1IG1663( 8) ;
            }
            closeExtendedTableCursors1IG1663( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1663 = Gx_mode ;
         confirm_1IG1664( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1663 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1663 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1IG0( ) ;
      }
   }

   public void confirm_1IG1664( )
   {
      s11871GradoUlt = O11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1IG1664( ) ;
         if ( ( nRcdExists_1664 != 0 ) || ( nIsMod_1664 != 0 ) )
         {
            getKey1IG1664( ) ;
            if ( ( nRcdExists_1664 == 0 ) && ( nRcdDeleted_1664 == 0 ) )
            {
               if ( RcdFound1664 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1IG1664( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1IG1664( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1IG1664( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11871GradoUlt = A11871GradoUlt ;
                     n11871GradoUlt = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "GRADOLN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGradoLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1664 != 0 )
               {
                  if ( nRcdDeleted_1664 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1IG1664( ) ;
                     load1IG1664( ) ;
                     beforeValidate1IG1664( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1IG1664( ) ;
                        O11871GradoUlt = A11871GradoUlt ;
                        n11871GradoUlt = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1664 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1IG1664( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1IG1664( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1IG1664( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11871GradoUlt = A11871GradoUlt ;
                           n11871GradoUlt = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1664 == 0 )
                  {
                     GXCCtl = "GRADOLN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGradoLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1664_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGradoLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11874GradoLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGradoPts_Internalname, GXutil.rtrim( A11872GradoPts)) ;
         httpContext.changePostValue( "ZT_"+"Z11874GradoLn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11874GradoLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11872GradoPts_"+sGXsfl_45_idx, GXutil.rtrim( Z11872GradoPts)) ;
         httpContext.changePostValue( "nRcdDeleted_1664_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1664_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1664_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1664 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1664_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1664_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRADOLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRADOPTS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoPts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11871GradoUlt = s11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1IG0( )
   {
   }

   public void e111IG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tgradop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tgradop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tgradop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tgradop_impl.this.A396EmprCod = GXv_char2[0] ;
      tgradop_impl.this.AV11EmprNom = GXv_char3[0] ;
      tgradop_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1IG1663( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11870GradoDc = T01IG5_A11870GradoDc[0] ;
            Z11871GradoUlt = T01IG5_A11871GradoUlt[0] ;
         }
         else
         {
            Z11870GradoDc = A11870GradoDc ;
            Z11871GradoUlt = A11871GradoUlt ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z11873GradoID = A11873GradoID ;
         Z11870GradoDc = A11870GradoDc ;
         Z11871GradoUlt = A11871GradoUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtGradoUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoUlt_Enabled), 5, 0), true);
      AV34Pgmname = "TGRADOP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtGradoUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoUlt_Enabled), 5, 0), true);
      /* Using cursor T01IG6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IG6_A407EmprNom[0] ;
      n407EmprNom = T01IG6_n407EmprNom[0] ;
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

   public void load1IG1663( )
   {
      /* Using cursor T01IG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1663 = (short)(1) ;
         A407EmprNom = T01IG7_A407EmprNom[0] ;
         n407EmprNom = T01IG7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11870GradoDc = T01IG7_A11870GradoDc[0] ;
         n11870GradoDc = T01IG7_n11870GradoDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11870GradoDc", A11870GradoDc);
         A11871GradoUlt = T01IG7_A11871GradoUlt[0] ;
         n11871GradoUlt = T01IG7_n11871GradoUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         zm1IG1663( -7) ;
      }
      pr_default.close(5);
      onLoadActions1IG1663( ) ;
   }

   public void onLoadActions1IG1663( )
   {
   }

   public void checkExtendedTable1IG1663( )
   {
      nIsDirty_1663 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( A11873GradoID == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo con valor 0.Valor no permitido", ""), 1, "GRADOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGradoID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1IG1663( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1IG1663( )
   {
      /* Using cursor T01IG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1663 = (short)(1) ;
      }
      else
      {
         RcdFound1663 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01IG5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IG1663( 7) ;
         RcdFound1663 = (short)(1) ;
         A11873GradoID = T01IG5_A11873GradoID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
         A11870GradoDc = T01IG5_A11870GradoDc[0] ;
         n11870GradoDc = T01IG5_n11870GradoDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11870GradoDc", A11870GradoDc);
         A11871GradoUlt = T01IG5_A11871GradoUlt[0] ;
         n11871GradoUlt = T01IG5_n11871GradoUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         O11871GradoUlt = A11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11873GradoID = A11873GradoID ;
         sMode1663 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IG1663( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1663 = (short)(0) ;
            initializeNonKey1IG1663( ) ;
         }
         Gx_mode = sMode1663 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1663 = (short)(0) ;
         initializeNonKey1IG1663( ) ;
         sMode1663 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1663 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1IG1663( ) ;
      if ( RcdFound1663 == 0 )
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
      RcdFound1663 = (short)(0) ;
      /* Using cursor T01IG9 */
      pr_default.execute(7, new Object[] {Short.valueOf(A11873GradoID), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T01IG9_A11873GradoID[0] < A11873GradoID ) ) && ( GXutil.strcmp(T01IG9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T01IG9_A11873GradoID[0] > A11873GradoID ) ) && ( GXutil.strcmp(T01IG9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11873GradoID = T01IG9_A11873GradoID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
            RcdFound1663 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1663 = (short)(0) ;
      /* Using cursor T01IG10 */
      pr_default.execute(8, new Object[] {Short.valueOf(A11873GradoID), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T01IG10_A11873GradoID[0] > A11873GradoID ) ) && ( GXutil.strcmp(T01IG10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T01IG10_A11873GradoID[0] < A11873GradoID ) ) && ( GXutil.strcmp(T01IG10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11873GradoID = T01IG10_A11873GradoID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
            RcdFound1663 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IG1663( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11871GradoUlt = O11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         GX_FocusControl = edtGradoID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IG1663( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1663 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11873GradoID != Z11873GradoID ) )
            {
               A11873GradoID = Z11873GradoID ;
               httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11871GradoUlt = O11871GradoUlt ;
               n11871GradoUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtGradoID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11871GradoUlt = O11871GradoUlt ;
               n11871GradoUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
               update1IG1663( ) ;
               GX_FocusControl = edtGradoID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11873GradoID != Z11873GradoID ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11871GradoUlt = O11871GradoUlt ;
               n11871GradoUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
               GX_FocusControl = edtGradoID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IG1663( ) ;
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
                  A11871GradoUlt = O11871GradoUlt ;
                  n11871GradoUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
                  GX_FocusControl = edtGradoID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1IG1663( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11873GradoID != Z11873GradoID ) )
      {
         A11873GradoID = Z11873GradoID ;
         httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11871GradoUlt = O11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtGradoID_Internalname ;
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
      getKey1IG1663( ) ;
      if ( RcdFound1663 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11873GradoID != Z11873GradoID ) )
         {
            A11873GradoID = Z11873GradoID ;
            httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11873GradoID != Z11873GradoID ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tgradop");
      GX_FocusControl = edtGradoDc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IG0( ) ;
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
      if ( RcdFound1663 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtGradoDc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1IG1663( ) ;
      if ( RcdFound1663 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGradoDc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IG1663( ) ;
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
      if ( RcdFound1663 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGradoDc_Internalname ;
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
      if ( RcdFound1663 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGradoDc_Internalname ;
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
      scanStart1IG1663( ) ;
      if ( RcdFound1663 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1663 != 0 )
         {
            scanNext1IG1663( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtGradoDc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IG1663( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IG1663( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRADOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z11870GradoDc, T01IG4_A11870GradoDc[0]) != 0 ) || ( Z11871GradoUlt != T01IG4_A11871GradoUlt[0] ) )
         {
            if ( GXutil.strcmp(Z11870GradoDc, T01IG4_A11870GradoDc[0]) != 0 )
            {
               GXutil.writeLogln("tgradop:[seudo value changed for attri]"+"GradoDc");
               GXutil.writeLogRaw("Old: ",Z11870GradoDc);
               GXutil.writeLogRaw("Current: ",T01IG4_A11870GradoDc[0]);
            }
            if ( Z11871GradoUlt != T01IG4_A11871GradoUlt[0] )
            {
               GXutil.writeLogln("tgradop:[seudo value changed for attri]"+"GradoUlt");
               GXutil.writeLogRaw("Old: ",Z11871GradoUlt);
               GXutil.writeLogRaw("Current: ",T01IG4_A11871GradoUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRADOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IG1663( )
   {
      beforeValidate1IG1663( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IG1663( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IG1663( 0) ;
         checkOptimisticConcurrency1IG1663( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IG1663( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IG1663( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IG11 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A11873GradoID), Boolean.valueOf(n11870GradoDc), A11870GradoDc, Boolean.valueOf(n11871GradoUlt), Short.valueOf(A11871GradoUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADOP");
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
                        processLevel1IG1663( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1IG0( ) ;
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
            load1IG1663( ) ;
         }
         endLevel1IG1663( ) ;
      }
      closeExtendedTableCursors1IG1663( ) ;
   }

   public void update1IG1663( )
   {
      beforeValidate1IG1663( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IG1663( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IG1663( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IG1663( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IG1663( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IG12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n11870GradoDc), A11870GradoDc, Boolean.valueOf(n11871GradoUlt), Short.valueOf(A11871GradoUlt), A396EmprCod, Short.valueOf(A11873GradoID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADOP");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRADOP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IG1663( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1IG1663( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1IG0( ) ;
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
         endLevel1IG1663( ) ;
      }
      closeExtendedTableCursors1IG1663( ) ;
   }

   public void deferredUpdate1IG1663( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IG1663( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IG1663( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IG1663( ) ;
         afterConfirm1IG1663( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IG1663( ) ;
            if ( AnyError == 0 )
            {
               A11871GradoUlt = O11871GradoUlt ;
               n11871GradoUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
               scanStart1IG1664( ) ;
               while ( RcdFound1664 != 0 )
               {
                  getByPrimaryKey1IG1664( ) ;
                  delete1IG1664( ) ;
                  scanNext1IG1664( ) ;
                  O11871GradoUlt = A11871GradoUlt ;
                  n11871GradoUlt = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
               }
               scanEnd1IG1664( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IG13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADOP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1663 == 0 )
                        {
                           initAll1IG1663( ) ;
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
                        resetCaption1IG0( ) ;
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
      sMode1663 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IG1663( ) ;
      Gx_mode = sMode1663 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IG1663( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1IG1664( )
   {
      s11871GradoUlt = O11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1IG1664( ) ;
         if ( ( nRcdExists_1664 != 0 ) || ( nIsMod_1664 != 0 ) )
         {
            standaloneNotModal1IG1664( ) ;
            getKey1IG1664( ) ;
            if ( ( nRcdExists_1664 == 0 ) && ( nRcdDeleted_1664 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1IG1664( ) ;
            }
            else
            {
               if ( RcdFound1664 != 0 )
               {
                  if ( ( nRcdDeleted_1664 != 0 ) && ( nRcdExists_1664 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1IG1664( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1664 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1IG1664( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1664 == 0 )
                  {
                     GXCCtl = "GRADOLN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGradoLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11871GradoUlt = A11871GradoUlt ;
            n11871GradoUlt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1664_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGradoLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11874GradoLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGradoPts_Internalname, GXutil.rtrim( A11872GradoPts)) ;
         httpContext.changePostValue( "ZT_"+"Z11874GradoLn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11874GradoLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11872GradoPts_"+sGXsfl_45_idx, GXutil.rtrim( Z11872GradoPts)) ;
         httpContext.changePostValue( "nRcdDeleted_1664_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1664_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1664_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1664 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1664_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1664_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRADOLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRADOPTS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoPts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1IG1664( ) ;
      if ( AnyError != 0 )
      {
         O11871GradoUlt = s11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      }
      nRcdExists_1664 = (short)(0) ;
      nIsMod_1664 = (short)(0) ;
      nRcdDeleted_1664 = (short)(0) ;
   }

   public void processLevel1IG1663( )
   {
      /* Save parent mode. */
      sMode1663 = Gx_mode ;
      processNestedLevel1IG1664( ) ;
      if ( AnyError != 0 )
      {
         O11871GradoUlt = s11871GradoUlt ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1663 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01IG14 */
      pr_default.execute(12, new Object[] {Boolean.valueOf(n11871GradoUlt), Short.valueOf(A11871GradoUlt), A396EmprCod, Short.valueOf(A11873GradoID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADOP");
   }

   public void endLevel1IG1663( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1IG1663( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tgradop");
         if ( AnyError == 0 )
         {
            confirmValues1IG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tgradop");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IG1663( )
   {
      /* Scan By routine */
      /* Using cursor T01IG15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1663 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1663 = (short)(1) ;
         A11873GradoID = T01IG15_A11873GradoID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IG1663( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1663 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1663 = (short)(1) ;
         A11873GradoID = T01IG15_A11873GradoID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
      }
   }

   public void scanEnd1IG1663( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1IG1663( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IG1663( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IG1663( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IG1663( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IG1663( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IG1663( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IG1663( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtGradoID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoID_Enabled), 5, 0), true);
      edtGradoDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoDc_Enabled), 5, 0), true);
      edtGradoUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoUlt_Enabled), 5, 0), true);
   }

   public void zm1IG1664( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11872GradoPts = T01IG3_A11872GradoPts[0] ;
         }
         else
         {
            Z11872GradoPts = A11872GradoPts ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z396EmprCod = A396EmprCod ;
         Z11873GradoID = A11873GradoID ;
         Z11874GradoLn = A11874GradoLn ;
         Z11872GradoPts = A11872GradoPts ;
      }
   }

   public void standaloneNotModal1IG1664( )
   {
      edtGradoUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoUlt_Enabled), 5, 0), true);
      edtGradoUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoUlt_Enabled), 5, 0), true);
   }

   public void standaloneModal1IG1664( )
   {
      if ( isIns( )  )
      {
         A11871GradoUlt = (short)(O11871GradoUlt+1) ;
         n11871GradoUlt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11874GradoLn = A11871GradoUlt ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGradoLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGradoLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtGradoLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGradoLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1IG1664( )
   {
      /* Using cursor T01IG16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1664 = (short)(1) ;
         A11872GradoPts = T01IG16_A11872GradoPts[0] ;
         n11872GradoPts = T01IG16_n11872GradoPts[0] ;
         zm1IG1664( -9) ;
      }
      pr_default.close(14);
      onLoadActions1IG1664( ) ;
   }

   public void onLoadActions1IG1664( )
   {
   }

   public void checkExtendedTable1IG1664( )
   {
      nIsDirty_1664 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1IG1664( ) ;
   }

   public void closeExtendedTableCursors1IG1664( )
   {
   }

   public void enableDisable1IG1664( )
   {
   }

   public void getKey1IG1664( )
   {
      /* Using cursor T01IG17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1664 = (short)(1) ;
      }
      else
      {
         RcdFound1664 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1IG1664( )
   {
      /* Using cursor T01IG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01IG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1IG1664( 9) ;
         RcdFound1664 = (short)(1) ;
         initializeNonKey1IG1664( ) ;
         A11874GradoLn = T01IG3_A11874GradoLn[0] ;
         A11872GradoPts = T01IG3_A11872GradoPts[0] ;
         n11872GradoPts = T01IG3_n11872GradoPts[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11873GradoID = A11873GradoID ;
         Z11874GradoLn = A11874GradoLn ;
         sMode1664 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IG1664( ) ;
         load1IG1664( ) ;
         Gx_mode = sMode1664 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1664 = (short)(0) ;
         initializeNonKey1IG1664( ) ;
         sMode1664 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IG1664( ) ;
         Gx_mode = sMode1664 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1IG1664( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1IG1664( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRADO1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11872GradoPts, T01IG2_A11872GradoPts[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11872GradoPts, T01IG2_A11872GradoPts[0]) != 0 )
            {
               GXutil.writeLogln("tgradop:[seudo value changed for attri]"+"GradoPts");
               GXutil.writeLogRaw("Old: ",Z11872GradoPts);
               GXutil.writeLogRaw("Current: ",T01IG2_A11872GradoPts[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRADO1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IG1664( )
   {
      beforeValidate1IG1664( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IG1664( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IG1664( 0) ;
         checkOptimisticConcurrency1IG1664( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IG1664( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IG1664( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IG18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn), Boolean.valueOf(n11872GradoPts), A11872GradoPts});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADO1");
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
            load1IG1664( ) ;
         }
         endLevel1IG1664( ) ;
      }
      closeExtendedTableCursors1IG1664( ) ;
   }

   public void update1IG1664( )
   {
      beforeValidate1IG1664( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IG1664( ) ;
      }
      if ( ( nIsMod_1664 != 0 ) || ( nIsDirty_1664 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1IG1664( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1IG1664( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1IG1664( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01IG19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n11872GradoPts), A11872GradoPts, A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADO1");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRADO1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1IG1664( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1IG1664( ) ;
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
            endLevel1IG1664( ) ;
         }
      }
      closeExtendedTableCursors1IG1664( ) ;
   }

   public void deferredUpdate1IG1664( )
   {
   }

   public void delete1IG1664( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IG1664( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IG1664( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IG1664( ) ;
         afterConfirm1IG1664( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IG1664( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IG20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID), Short.valueOf(A11874GradoLn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRADO1");
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
      sMode1664 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IG1664( ) ;
      Gx_mode = sMode1664 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IG1664( )
   {
      standaloneModal1IG1664( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1IG1664( )
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

   public void scanStart1IG1664( )
   {
      /* Scan By routine */
      /* Using cursor T01IG21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A11873GradoID)});
      RcdFound1664 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1664 = (short)(1) ;
         A11874GradoLn = T01IG21_A11874GradoLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IG1664( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1664 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1664 = (short)(1) ;
         A11874GradoLn = T01IG21_A11874GradoLn[0] ;
      }
   }

   public void scanEnd1IG1664( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1IG1664( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IG1664( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IG1664( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IG1664( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IG1664( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IG1664( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IG1664( )
   {
      edtGradoLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtGradoPts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoPts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoPts_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1IG1664( )
   {
   }

   public void send_integrity_lvl_hashes1IG1663( )
   {
   }

   public void subsflControlProps_451664( )
   {
      edtavnRcdDeleted_1664_Internalname = "vNRCDDELETED_1664_"+sGXsfl_45_idx ;
      edtGradoLn_Internalname = "GRADOLN_"+sGXsfl_45_idx ;
      edtGradoPts_Internalname = "GRADOPTS_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451664( )
   {
      edtavnRcdDeleted_1664_Internalname = "vNRCDDELETED_1664_"+sGXsfl_45_fel_idx ;
      edtGradoLn_Internalname = "GRADOLN_"+sGXsfl_45_fel_idx ;
      edtGradoPts_Internalname = "GRADOPTS_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1IG1664( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451664( ) ;
      sendRow1IG1664( ) ;
   }

   public void sendRow1IG1664( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1664_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1664_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1664_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1664), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1664), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1664_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1664_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1664_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGradoLn_Internalname,GXutil.ltrim( localUtil.ntoc( A11874GradoLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11874GradoLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGradoLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGradoLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1664_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGradoPts_Internalname,GXutil.rtrim( A11872GradoPts),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGradoPts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGradoPts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1IG1664( ) ;
      GXCCtl = "Z11874GradoLn_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11874GradoLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11872GradoPts_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11872GradoPts));
      GXCCtl = "nRcdDeleted_1664_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1664_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1664_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1664, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1664_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1664_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRADOLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRADOPTS_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoPts_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1IG1664( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451664( ) ;
      edtavnRcdDeleted_1664_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1664_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGradoLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRADOLN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGradoPts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRADOPTS_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1664_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1664_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1664");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1664_Internalname ;
         wbErr = true ;
         nRcdDeleted_1664 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1664 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1664_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGradoLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGradoLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GRADOLN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGradoLn_Internalname ;
         wbErr = true ;
         A11874GradoLn = (short)(0) ;
      }
      else
      {
         A11874GradoLn = (short)(localUtil.ctol( httpContext.cgiGet( edtGradoLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11872GradoPts = httpContext.cgiGet( edtGradoPts_Internalname) ;
      n11872GradoPts = false ;
      GXCCtl = "Z11874GradoLn_" + sGXsfl_45_idx ;
      Z11874GradoLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11872GradoPts_" + sGXsfl_45_idx ;
      Z11872GradoPts = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1664_" + sGXsfl_45_idx ;
      nRcdDeleted_1664 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1664_" + sGXsfl_45_idx ;
      nRcdExists_1664 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1664_" + sGXsfl_45_idx ;
      nIsMod_1664 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtGradoLn_Enabled = edtGradoLn_Enabled ;
   }

   public void confirmValues1IG0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451664( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451664( ) ;
         httpContext.changePostValue( "Z11874GradoLn_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11874GradoLn_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11874GradoLn_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z11872GradoPts_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11872GradoPts_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11872GradoPts_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tgradop", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11873GradoID", GXutil.ltrim( localUtil.ntoc( Z11873GradoID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11870GradoDc", GXutil.rtrim( Z11870GradoDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11871GradoUlt", GXutil.ltrim( localUtil.ntoc( Z11871GradoUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11871GradoUlt", GXutil.ltrim( localUtil.ntoc( O11871GradoUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.tgradop", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TGRADOP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Grados Pilling", "") ;
   }

   public void initializeNonKey1IG1663( )
   {
      A11870GradoDc = "" ;
      n11870GradoDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11870GradoDc", A11870GradoDc);
      A11871GradoUlt = (short)(0) ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      O11871GradoUlt = A11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
      Z11870GradoDc = "" ;
      Z11871GradoUlt = (short)(0) ;
   }

   public void initAll1IG1663( )
   {
      A11873GradoID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11873GradoID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11873GradoID), 4, 0));
      initializeNonKey1IG1663( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1IG1664( )
   {
      A11872GradoPts = "" ;
      n11872GradoPts = false ;
      Z11872GradoPts = "" ;
   }

   public void initAll1IG1664( )
   {
      A11874GradoLn = (short)(0) ;
      initializeNonKey1IG1664( ) ;
   }

   public void standaloneModalInsert1IG1664( )
   {
      A11871GradoUlt = i11871GradoUlt ;
      n11871GradoUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11871GradoUlt), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581913", true, true);
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
      httpContext.AddJavascriptSource("tgradop.js", "?20268241581913", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1664( )
   {
      edtGradoLn_Enabled = defedtGradoLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGradoLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGradoLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1664, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1664_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11874GradoLn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11872GradoPts));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGradoPts_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtGradoID_Internalname = "GRADOID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtGradoDc_Internalname = "GRADODC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtGradoUlt_Internalname = "GRADOULT" ;
      edtavnRcdDeleted_1664_Internalname = "vNRCDDELETED_1664" ;
      edtGradoLn_Internalname = "GRADOLN" ;
      edtGradoPts_Internalname = "GRADOPTS" ;
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
      Form.setCaption( httpContext.getMessage( "Grados Pilling", "") );
      edtGradoPts_Jsonclick = "" ;
      edtGradoLn_Jsonclick = "" ;
      edtavnRcdDeleted_1664_Jsonclick = "" ;
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
      edtGradoPts_Enabled = 1 ;
      edtGradoLn_Enabled = 1 ;
      edtavnRcdDeleted_1664_Enabled = 1 ;
      edtGradoUlt_Jsonclick = "" ;
      edtGradoUlt_Backcolor = (int)(0xFFFFFF) ;
      edtGradoUlt_Enabled = 0 ;
      edtGradoDc_Jsonclick = "" ;
      edtGradoDc_Backcolor = (int)(0xFFFFFF) ;
      edtGradoDc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtGradoID_Jsonclick = "" ;
      edtGradoID_Backcolor = (int)(0xFFFFFF) ;
      edtGradoID_Enabled = 1 ;
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
      subsflControlProps_451664( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1IG1664( ) ;
         standaloneModal1IG1664( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1IG1664( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451664( ) ;
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
      /* Using cursor T01IG22 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01IG22_A407EmprNom[0] ;
      n407EmprNom = T01IG22_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      GX_FocusControl = edtGradoDc_Internalname ;
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

   public void valid_Gradoid( )
   {
      n11871GradoUlt = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( A11873GradoID == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo con valor 0.Valor no permitido", ""), 1, "GRADOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGradoID_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11870GradoDc", GXutil.rtrim( A11870GradoDc));
      httpContext.ajax_rsp_assign_attri("", false, "A11871GradoUlt", GXutil.ltrim( localUtil.ntoc( A11871GradoUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11873GradoID", GXutil.ltrim( localUtil.ntoc( Z11873GradoID, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11870GradoDc", GXutil.rtrim( Z11870GradoDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11871GradoUlt", GXutil.ltrim( localUtil.ntoc( Z11871GradoUlt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O11871GradoUlt", GXutil.ltrim( localUtil.ntoc( O11871GradoUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_GRADOID","{handler:'valid_Gradoid',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11871GradoUlt',fld:'GRADOULT',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11873GradoID',fld:'GRADOID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_GRADOID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11870GradoDc',fld:'GRADODC',pic:''},{av:'A11871GradoUlt',fld:'GRADOULT',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11873GradoID'},{av:'Z407EmprNom'},{av:'Z11870GradoDc'},{av:'Z11871GradoUlt'},{av:'O11871GradoUlt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_GRADOULT","{handler:'valid_Gradoult',iparms:[]");
      setEventMetadata("VALID_GRADOULT",",oparms:[]}");
      setEventMetadata("VALID_GRADOLN","{handler:'valid_Gradoln',iparms:[]");
      setEventMetadata("VALID_GRADOLN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Gradopts',iparms:[]");
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
      Z11870GradoDc = "" ;
      Z11872GradoPts = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11870GradoDc = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1664 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1663 = "" ;
      GXCCtl = "" ;
      A11872GradoPts = "" ;
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
      T01IG6_A407EmprNom = new String[] {""} ;
      T01IG6_n407EmprNom = new boolean[] {false} ;
      T01IG7_A11873GradoID = new short[1] ;
      T01IG7_A407EmprNom = new String[] {""} ;
      T01IG7_n407EmprNom = new boolean[] {false} ;
      T01IG7_A11870GradoDc = new String[] {""} ;
      T01IG7_n11870GradoDc = new boolean[] {false} ;
      T01IG7_A11871GradoUlt = new short[1] ;
      T01IG7_n11871GradoUlt = new boolean[] {false} ;
      T01IG7_A396EmprCod = new String[] {""} ;
      T01IG8_A396EmprCod = new String[] {""} ;
      T01IG8_A11873GradoID = new short[1] ;
      T01IG5_A11873GradoID = new short[1] ;
      T01IG5_A11870GradoDc = new String[] {""} ;
      T01IG5_n11870GradoDc = new boolean[] {false} ;
      T01IG5_A11871GradoUlt = new short[1] ;
      T01IG5_n11871GradoUlt = new boolean[] {false} ;
      T01IG5_A396EmprCod = new String[] {""} ;
      T01IG9_A396EmprCod = new String[] {""} ;
      T01IG9_A11873GradoID = new short[1] ;
      T01IG10_A396EmprCod = new String[] {""} ;
      T01IG10_A11873GradoID = new short[1] ;
      T01IG4_A11873GradoID = new short[1] ;
      T01IG4_A11870GradoDc = new String[] {""} ;
      T01IG4_n11870GradoDc = new boolean[] {false} ;
      T01IG4_A11871GradoUlt = new short[1] ;
      T01IG4_n11871GradoUlt = new boolean[] {false} ;
      T01IG4_A396EmprCod = new String[] {""} ;
      T01IG15_A396EmprCod = new String[] {""} ;
      T01IG15_A11873GradoID = new short[1] ;
      T01IG16_A396EmprCod = new String[] {""} ;
      T01IG16_A11873GradoID = new short[1] ;
      T01IG16_A11874GradoLn = new short[1] ;
      T01IG16_A11872GradoPts = new String[] {""} ;
      T01IG16_n11872GradoPts = new boolean[] {false} ;
      T01IG17_A396EmprCod = new String[] {""} ;
      T01IG17_A11873GradoID = new short[1] ;
      T01IG17_A11874GradoLn = new short[1] ;
      T01IG3_A396EmprCod = new String[] {""} ;
      T01IG3_A11873GradoID = new short[1] ;
      T01IG3_A11874GradoLn = new short[1] ;
      T01IG3_A11872GradoPts = new String[] {""} ;
      T01IG3_n11872GradoPts = new boolean[] {false} ;
      T01IG2_A396EmprCod = new String[] {""} ;
      T01IG2_A11873GradoID = new short[1] ;
      T01IG2_A11874GradoLn = new short[1] ;
      T01IG2_A11872GradoPts = new String[] {""} ;
      T01IG2_n11872GradoPts = new boolean[] {false} ;
      T01IG21_A396EmprCod = new String[] {""} ;
      T01IG21_A11873GradoID = new short[1] ;
      T01IG21_A11874GradoLn = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01IG22_A407EmprNom = new String[] {""} ;
      T01IG22_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ11870GradoDc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tgradop__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tgradop__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tgradop__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tgradop__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tgradop__default(),
         new Object[] {
             new Object[] {
            T01IG2_A396EmprCod, T01IG2_A11873GradoID, T01IG2_A11874GradoLn, T01IG2_A11872GradoPts, T01IG2_n11872GradoPts
            }
            , new Object[] {
            T01IG3_A396EmprCod, T01IG3_A11873GradoID, T01IG3_A11874GradoLn, T01IG3_A11872GradoPts, T01IG3_n11872GradoPts
            }
            , new Object[] {
            T01IG4_A11873GradoID, T01IG4_A11870GradoDc, T01IG4_n11870GradoDc, T01IG4_A11871GradoUlt, T01IG4_n11871GradoUlt, T01IG4_A396EmprCod
            }
            , new Object[] {
            T01IG5_A11873GradoID, T01IG5_A11870GradoDc, T01IG5_n11870GradoDc, T01IG5_A11871GradoUlt, T01IG5_n11871GradoUlt, T01IG5_A396EmprCod
            }
            , new Object[] {
            T01IG6_A407EmprNom, T01IG6_n407EmprNom
            }
            , new Object[] {
            T01IG7_A11873GradoID, T01IG7_A407EmprNom, T01IG7_n407EmprNom, T01IG7_A11870GradoDc, T01IG7_n11870GradoDc, T01IG7_A11871GradoUlt, T01IG7_n11871GradoUlt, T01IG7_A396EmprCod
            }
            , new Object[] {
            T01IG8_A396EmprCod, T01IG8_A11873GradoID
            }
            , new Object[] {
            T01IG9_A396EmprCod, T01IG9_A11873GradoID
            }
            , new Object[] {
            T01IG10_A396EmprCod, T01IG10_A11873GradoID
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
            T01IG15_A396EmprCod, T01IG15_A11873GradoID
            }
            , new Object[] {
            T01IG16_A396EmprCod, T01IG16_A11873GradoID, T01IG16_A11874GradoLn, T01IG16_A11872GradoPts, T01IG16_n11872GradoPts
            }
            , new Object[] {
            T01IG17_A396EmprCod, T01IG17_A11873GradoID, T01IG17_A11874GradoLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IG21_A396EmprCod, T01IG21_A11873GradoID, T01IG21_A11874GradoLn
            }
            , new Object[] {
            T01IG22_A407EmprNom, T01IG22_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TGRADOP" ;
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
   private short Z11873GradoID ;
   private short Z11871GradoUlt ;
   private short O11871GradoUlt ;
   private short Z11874GradoLn ;
   private short nRcdDeleted_1664 ;
   private short nRcdExists_1664 ;
   private short nIsMod_1664 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11871GradoUlt ;
   private short A11873GradoID ;
   private short nBlankRcdCount1664 ;
   private short RcdFound1664 ;
   private short B11871GradoUlt ;
   private short nBlankRcdUsr1664 ;
   private short s11871GradoUlt ;
   private short A11874GradoLn ;
   private short RcdFound1663 ;
   private short nIsDirty_1663 ;
   private short nIsDirty_1664 ;
   private short i11871GradoUlt ;
   private short ZZ11873GradoID ;
   private short ZZ11871GradoUlt ;
   private short ZO11871GradoUlt ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtGradoID_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtGradoDc_Enabled ;
   private int edtGradoUlt_Enabled ;
   private int edtavnRcdDeleted_1664_Enabled ;
   private int edtGradoLn_Enabled ;
   private int edtGradoPts_Enabled ;
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
   private int defedtGradoLn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtGradoUlt_Backcolor ;
   private int edtGradoDc_Backcolor ;
   private int edtGradoID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11870GradoDc ;
   private String Z11872GradoPts ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtGradoID_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtGradoID_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtGradoDc_Internalname ;
   private String A11870GradoDc ;
   private String edtGradoDc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtGradoUlt_Internalname ;
   private String edtGradoUlt_Jsonclick ;
   private String sMode1664 ;
   private String edtavnRcdDeleted_1664_Internalname ;
   private String edtGradoLn_Internalname ;
   private String edtGradoPts_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1663 ;
   private String GXCCtl ;
   private String A11872GradoPts ;
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
   private String edtavnRcdDeleted_1664_Jsonclick ;
   private String edtGradoLn_Jsonclick ;
   private String edtGradoPts_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ11870GradoDc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11871GradoUlt ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11870GradoDc ;
   private boolean returnInSub ;
   private boolean n11872GradoPts ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01IG6_A407EmprNom ;
   private boolean[] T01IG6_n407EmprNom ;
   private short[] T01IG7_A11873GradoID ;
   private String[] T01IG7_A407EmprNom ;
   private boolean[] T01IG7_n407EmprNom ;
   private String[] T01IG7_A11870GradoDc ;
   private boolean[] T01IG7_n11870GradoDc ;
   private short[] T01IG7_A11871GradoUlt ;
   private boolean[] T01IG7_n11871GradoUlt ;
   private String[] T01IG7_A396EmprCod ;
   private String[] T01IG8_A396EmprCod ;
   private short[] T01IG8_A11873GradoID ;
   private short[] T01IG5_A11873GradoID ;
   private String[] T01IG5_A11870GradoDc ;
   private boolean[] T01IG5_n11870GradoDc ;
   private short[] T01IG5_A11871GradoUlt ;
   private boolean[] T01IG5_n11871GradoUlt ;
   private String[] T01IG5_A396EmprCod ;
   private String[] T01IG9_A396EmprCod ;
   private short[] T01IG9_A11873GradoID ;
   private String[] T01IG10_A396EmprCod ;
   private short[] T01IG10_A11873GradoID ;
   private short[] T01IG4_A11873GradoID ;
   private String[] T01IG4_A11870GradoDc ;
   private boolean[] T01IG4_n11870GradoDc ;
   private short[] T01IG4_A11871GradoUlt ;
   private boolean[] T01IG4_n11871GradoUlt ;
   private String[] T01IG4_A396EmprCod ;
   private String[] T01IG15_A396EmprCod ;
   private short[] T01IG15_A11873GradoID ;
   private String[] T01IG16_A396EmprCod ;
   private short[] T01IG16_A11873GradoID ;
   private short[] T01IG16_A11874GradoLn ;
   private String[] T01IG16_A11872GradoPts ;
   private boolean[] T01IG16_n11872GradoPts ;
   private String[] T01IG17_A396EmprCod ;
   private short[] T01IG17_A11873GradoID ;
   private short[] T01IG17_A11874GradoLn ;
   private String[] T01IG3_A396EmprCod ;
   private short[] T01IG3_A11873GradoID ;
   private short[] T01IG3_A11874GradoLn ;
   private String[] T01IG3_A11872GradoPts ;
   private boolean[] T01IG3_n11872GradoPts ;
   private String[] T01IG2_A396EmprCod ;
   private short[] T01IG2_A11873GradoID ;
   private short[] T01IG2_A11874GradoLn ;
   private String[] T01IG2_A11872GradoPts ;
   private boolean[] T01IG2_n11872GradoPts ;
   private String[] T01IG21_A396EmprCod ;
   private short[] T01IG21_A11873GradoID ;
   private short[] T01IG21_A11874GradoLn ;
   private String[] T01IG22_A407EmprNom ;
   private boolean[] T01IG22_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tgradop__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgradop__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgradop__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgradop__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgradop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IG2", "SELECT EmprCod, GradoID, GradoLn, GradoPts FROM TXPGRADO1 WHERE EmprCod = ? AND GradoID = ? AND GradoLn = ?  FOR UPDATE OF GradoPts NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG3", "SELECT EmprCod, GradoID, GradoLn, GradoPts FROM TXPGRADO1 WHERE EmprCod = ? AND GradoID = ? AND GradoLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG4", "SELECT GradoID, GradoDc, GradoUlt, EmprCod FROM TXPGRADOP WHERE EmprCod = ? AND GradoID = ?  FOR UPDATE OF GradoDc, GradoUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG5", "SELECT GradoID, GradoDc, GradoUlt, EmprCod FROM TXPGRADOP WHERE EmprCod = ? AND GradoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG7", "SELECT /*+ FIRST_ROWS(100) */ TM1.GradoID, T2.EmprNom, TM1.GradoDc, TM1.GradoUlt, TM1.EmprCod FROM (TXPGRADOP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.GradoID = ? ORDER BY TM1.EmprCod, TM1.GradoID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GradoID FROM TXPGRADOP WHERE EmprCod = ? AND GradoID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GradoID FROM TXPGRADOP WHERE ( GradoID > ?) and EmprCod = ? ORDER BY EmprCod, GradoID) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IG10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GradoID FROM TXPGRADOP WHERE ( GradoID < ?) and EmprCod = ? ORDER BY EmprCod DESC, GradoID DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IG11", "INSERT INTO TXPGRADOP(GradoID, GradoDc, GradoUlt, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPGRADOP")
         ,new UpdateCursor("T01IG12", "UPDATE TXPGRADOP SET GradoDc=?, GradoUlt=?  WHERE EmprCod = ? AND GradoID = ?", GX_NOMASK, "TXPGRADOP")
         ,new UpdateCursor("T01IG13", "DELETE FROM TXPGRADOP  WHERE EmprCod = ? AND GradoID = ?", GX_NOMASK, "TXPGRADOP")
         ,new UpdateCursor("T01IG14", "UPDATE TXPGRADOP SET GradoUlt=?  WHERE EmprCod = ? AND GradoID = ?", GX_NOMASK, "TXPGRADOP")
         ,new ForEachCursor("T01IG15", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GradoID FROM TXPGRADOP WHERE EmprCod = ? ORDER BY EmprCod, GradoID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG16", "SELECT EmprCod, GradoID, GradoLn, GradoPts FROM TXPGRADO1 WHERE EmprCod = ? and GradoID = ? and GradoLn = ? ORDER BY EmprCod, GradoID, GradoLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG17", "SELECT EmprCod, GradoID, GradoLn FROM TXPGRADO1 WHERE EmprCod = ? AND GradoID = ? AND GradoLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01IG18", "INSERT INTO TXPGRADO1(EmprCod, GradoID, GradoLn, GradoPts) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPGRADO1")
         ,new UpdateCursor("T01IG19", "UPDATE TXPGRADO1 SET GradoPts=?  WHERE EmprCod = ? AND GradoID = ? AND GradoLn = ?", GX_NOMASK, "TXPGRADO1")
         ,new UpdateCursor("T01IG20", "DELETE FROM TXPGRADO1  WHERE EmprCod = ? AND GradoID = ? AND GradoLn = ?", GX_NOMASK, "TXPGRADO1")
         ,new ForEachCursor("T01IG21", "SELECT EmprCod, GradoID, GradoLn FROM TXPGRADO1 WHERE EmprCod = ? and GradoID = ? ORDER BY EmprCod, GradoID, GradoLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IG22", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 60);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

