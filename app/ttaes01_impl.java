package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttaes01_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11634TaesId = httpContext.GetPar( "TaesId") ;
         n11634TaesId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
         A11635TaesDc = httpContext.GetPar( "TaesDc") ;
         n11635TaesDc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
         A11637TaesLn = (short)(GXutil.lval( httpContext.GetPar( "TaesLn"))) ;
         A11638TaesVi = CommonUtil.decimalVal( httpContext.GetPar( "TaesVi"), ".") ;
         n11638TaesVi = false ;
         A11639TaesVf = CommonUtil.decimalVal( httpContext.GetPar( "TaesVf"), ".") ;
         n11639TaesVf = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_7_1EL1545( A396EmprCod, A11634TaesId, A11635TaesDc, A11637TaesLn, A11638TaesVi, A11639TaesVf) ;
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
            A11634TaesId = httpContext.GetPar( "TaesId") ;
            n11634TaesId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
            A11635TaesDc = httpContext.GetPar( "TaesDc") ;
            n11635TaesDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLAS DE DOSIFICACION Intervalos", ""), (short)(0)) ;
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
      A11636TaesUltLn = (short)(GXutil.lval( httpContext.GetPar( "TaesUltLn"))) ;
      n11636TaesUltLn = false ;
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

   public ttaes01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttaes01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttaes01_impl.class ));
   }

   public ttaes01_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTAES01.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesId_Internalname, GXutil.rtrim( A11634TaesId), GXutil.rtrim( localUtil.format( A11634TaesId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesId_Jsonclick, 0, "", "", "", "", "", 1, edtTaesId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesDc_Internalname, GXutil.rtrim( A11635TaesDc), GXutil.rtrim( localUtil.format( A11635TaesDc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesDc_Jsonclick, 0, "", "", "", "", "", 1, edtTaesDc_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTAES01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTaesUltLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11636TaesUltLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTaesUltLn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11636TaesUltLn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11636TaesUltLn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTaesUltLn_Jsonclick, 0, "", "", "", "", "", 1, edtTaesUltLn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTAES01.htm");
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
         nBlankRcdCount1545 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1545 = (short)(1) ;
            scanStart1EL1545( ) ;
            while ( RcdFound1545 != 0 )
            {
               init_level_properties1545( ) ;
               getByPrimaryKey1EL1545( ) ;
               addRow1EL1545( ) ;
               scanNext1EL1545( ) ;
            }
            scanEnd1EL1545( ) ;
            nBlankRcdCount1545 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11636TaesUltLn = A11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
         standaloneNotModal1EL1545( ) ;
         standaloneModal1EL1545( ) ;
         sMode1545 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1EL1545( ) ;
            edtavnRcdDeleted_1545_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1545_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1545_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1545_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTaesLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESLN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTaesVi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESVI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesVi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesVi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtTaesVf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESVF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesVf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesVf_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1545 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1EL1545( ) ;
            }
            sendRow1EL1545( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11636TaesUltLn = B11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1545 = (short)(5) ;
         nRcdExists_1545 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1EL1545( ) ;
            while ( RcdFound1545 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451545( ) ;
               init_level_properties1545( ) ;
               standaloneNotModal1EL1545( ) ;
               getByPrimaryKey1EL1545( ) ;
               standaloneModal1EL1545( ) ;
               addRow1EL1545( ) ;
               scanNext1EL1545( ) ;
            }
            scanEnd1EL1545( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1545 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451545( ) ;
      initAll1EL1545( ) ;
      init_level_properties1545( ) ;
      B11636TaesUltLn = A11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      nRcdExists_1545 = (short)(0) ;
      nIsMod_1545 = (short)(0) ;
      nRcdDeleted_1545 = (short)(0) ;
      nBlankRcdCount1545 = (short)(nBlankRcdUsr1545+nBlankRcdCount1545) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1545 > 0 )
      {
         standaloneNotModal1EL1545( ) ;
         standaloneModal1EL1545( ) ;
         addRow1EL1545( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTaesLn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1545 = (short)(nBlankRcdCount1545-1) ;
      }
      Gx_mode = sMode1545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11636TaesUltLn = B11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTAES01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTAES01.htm");
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
      e111EL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11634TaesId = httpContext.cgiGet( "Z11634TaesId") ;
            Z11636TaesUltLn = (short)(localUtil.ctol( httpContext.cgiGet( "Z11636TaesUltLn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11636TaesUltLn = (short)(localUtil.ctol( httpContext.cgiGet( "O11636TaesUltLn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11634TaesId = httpContext.cgiGet( edtTaesId_Internalname) ;
            n11634TaesId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
            A11635TaesDc = httpContext.cgiGet( edtTaesDc_Internalname) ;
            n11635TaesDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
            A11636TaesUltLn = (short)(localUtil.ctol( httpContext.cgiGet( edtTaesUltLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11636TaesUltLn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
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
               A11634TaesId = httpContext.GetPar( "TaesId") ;
               n11634TaesId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
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
                        e111EL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'TABLA PRODUCTOS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Tabla Productos' */
                        e121EL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'IMPRIMIR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Imprimir' */
                        e131EL2 ();
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
            initAll1EL1544( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1545_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1545_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1EL1544( ) ;
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

   public void confirm_1EL0( )
   {
      beforeValidate1EL1544( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1EL1544( ) ;
         }
         else
         {
            checkExtendedTable1EL1544( ) ;
            if ( AnyError == 0 )
            {
               zm1EL1544( 9) ;
            }
            closeExtendedTableCursors1EL1544( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1544 = Gx_mode ;
         confirm_1EL1545( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1544 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1544 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1EL0( ) ;
      }
   }

   public void confirm_1EL1545( )
   {
      s11636TaesUltLn = O11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1EL1545( ) ;
         if ( ( nRcdExists_1545 != 0 ) || ( nIsMod_1545 != 0 ) )
         {
            getKey1EL1545( ) ;
            if ( ( nRcdExists_1545 == 0 ) && ( nRcdDeleted_1545 == 0 ) )
            {
               if ( RcdFound1545 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1EL1545( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1EL1545( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1EL1545( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11636TaesUltLn = A11636TaesUltLn ;
                     n11636TaesUltLn = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "TAESLN_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTaesLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1545 != 0 )
               {
                  if ( nRcdDeleted_1545 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1EL1545( ) ;
                     load1EL1545( ) ;
                     beforeValidate1EL1545( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1EL1545( ) ;
                        O11636TaesUltLn = A11636TaesUltLn ;
                        n11636TaesUltLn = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1545 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1EL1545( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1EL1545( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1EL1545( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11636TaesUltLn = A11636TaesUltLn ;
                           n11636TaesUltLn = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1545 == 0 )
                  {
                     GXCCtl = "TAESLN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTaesLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1545_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesVi_Internalname, GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesVf_Internalname, GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11637TaesLn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11638TaesVi_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11639TaesVf_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1545_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1545_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1545_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1545 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1545_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1545_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESVI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESVF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11636TaesUltLn = s11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1EL0( )
   {
   }

   public void e111EL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttaes01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttaes01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttaes01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttaes01_impl.this.A396EmprCod = GXv_char2[0] ;
      ttaes01_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttaes01_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121EL2( )
   {
      /* 'Tabla Productos' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A11634TaesId ;
         GXv_char2[0] = A11635TaesDc ;
         GXv_int5[0] = A11637TaesLn ;
         GXv_decimal6[0] = A11638TaesVi ;
         GXv_decimal7[0] = A11639TaesVf ;
         new app.ptaes02(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5, GXv_decimal6, GXv_decimal7) ;
         ttaes01_impl.this.A396EmprCod = GXv_char4[0] ;
         ttaes01_impl.this.A11634TaesId = GXv_char3[0] ;
         ttaes01_impl.this.A11635TaesDc = GXv_char2[0] ;
         ttaes01_impl.this.A11637TaesLn = GXv_int5[0] ;
         ttaes01_impl.this.A11638TaesVi = GXv_decimal6[0] ;
         ttaes01_impl.this.A11639TaesVf = GXv_decimal7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
         httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
      }
      /*  Sending Event outputs  */
   }

   public void e131EL2( )
   {
      /* 'Imprimir' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A11634TaesId ;
      new app.rtaes10(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      ttaes01_impl.this.A396EmprCod = GXv_char4[0] ;
      ttaes01_impl.this.A11634TaesId = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
      /*  Sending Event outputs  */
   }

   public void zm1EL1544( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11636TaesUltLn = T01EL5_A11636TaesUltLn[0] ;
         }
         else
         {
            Z11636TaesUltLn = A11636TaesUltLn ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z11634TaesId = A11634TaesId ;
         Z11635TaesDc = A11635TaesDc ;
         Z11636TaesUltLn = A11636TaesUltLn ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtTaesUltLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLn_Enabled), 5, 0), true);
      AV33Pgmname = "TTAES01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtTaesUltLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLn_Enabled), 5, 0), true);
      /* Using cursor T01EL6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EL6_A407EmprNom[0] ;
      n407EmprNom = T01EL6_n407EmprNom[0] ;
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

   public void load1EL1544( )
   {
      /* Using cursor T01EL7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Boolean.valueOf(n11635TaesDc), A11635TaesDc});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1544 = (short)(1) ;
         A407EmprNom = T01EL7_A407EmprNom[0] ;
         n407EmprNom = T01EL7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11636TaesUltLn = T01EL7_A11636TaesUltLn[0] ;
         n11636TaesUltLn = T01EL7_n11636TaesUltLn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
         zm1EL1544( -8) ;
      }
      pr_default.close(5);
      onLoadActions1EL1544( ) ;
   }

   public void onLoadActions1EL1544( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTable1EL1544( )
   {
      nIsDirty_1544 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void closeExtendedTableCursors1EL1544( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1EL1544( )
   {
      /* Using cursor T01EL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1544 = (short)(1) ;
      }
      else
      {
         RcdFound1544 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01EL5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01EL5_A11634TaesId[0], A11634TaesId) == 0 ) && ( GXutil.strcmp(T01EL5_A11635TaesDc[0], A11635TaesDc) == 0 ) && ( GXutil.strcmp(T01EL5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1EL1544( 8) ;
         RcdFound1544 = (short)(1) ;
         A11636TaesUltLn = T01EL5_A11636TaesUltLn[0] ;
         n11636TaesUltLn = T01EL5_n11636TaesUltLn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
         O11636TaesUltLn = A11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         sMode1544 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1EL1544( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1544 = (short)(0) ;
            initializeNonKey1EL1544( ) ;
         }
         Gx_mode = sMode1544 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1544 = (short)(0) ;
         initializeNonKey1EL1544( ) ;
         sMode1544 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1544 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1EL1544( ) ;
      if ( RcdFound1544 == 0 )
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
      RcdFound1544 = (short)(0) ;
      /* Using cursor T01EL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Boolean.valueOf(n11635TaesDc), A11635TaesDc});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01EL9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EL9_A11634TaesId[0], A11634TaesId) == 0 ) && ( GXutil.strcmp(T01EL9_A11635TaesDc[0], A11635TaesDc) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01EL9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EL9_A11634TaesId[0], A11634TaesId) == 0 ) && ( GXutil.strcmp(T01EL9_A11635TaesDc[0], A11635TaesDc) == 0 ) )
         {
            RcdFound1544 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1544 = (short)(0) ;
      /* Using cursor T01EL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Boolean.valueOf(n11635TaesDc), A11635TaesDc});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01EL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EL10_A11634TaesId[0], A11634TaesId) == 0 ) && ( GXutil.strcmp(T01EL10_A11635TaesDc[0], A11635TaesDc) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01EL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EL10_A11634TaesId[0], A11634TaesId) == 0 ) && ( GXutil.strcmp(T01EL10_A11635TaesDc[0], A11635TaesDc) == 0 ) )
         {
            RcdFound1544 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1EL1544( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A11636TaesUltLn = O11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
         insert1EL1544( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1544 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A11636TaesUltLn = O11636TaesUltLn ;
               n11636TaesUltLn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A11636TaesUltLn = O11636TaesUltLn ;
               n11636TaesUltLn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
               update1EL1544( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A11636TaesUltLn = O11636TaesUltLn ;
               n11636TaesUltLn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
               insert1EL1544( ) ;
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
                  A11636TaesUltLn = O11636TaesUltLn ;
                  n11636TaesUltLn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
                  insert1EL1544( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A11636TaesUltLn = O11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
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
      getKey1EL1544( ) ;
      if ( RcdFound1544 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11634TaesId, Z11634TaesId) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttaes01");
   }

   public void insert_check( )
   {
      confirm_1EL0( ) ;
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
      if ( RcdFound1544 == 0 )
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
      scanStart1EL1544( ) ;
      if ( RcdFound1544 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EL1544( ) ;
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
      if ( RcdFound1544 == 0 )
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
      if ( RcdFound1544 == 0 )
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
      scanStart1EL1544( ) ;
      if ( RcdFound1544 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1544 != 0 )
         {
            scanNext1EL1544( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1EL1544( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1EL1544( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11636TaesUltLn != T01EL4_A11636TaesUltLn[0] ) )
         {
            if ( Z11636TaesUltLn != T01EL4_A11636TaesUltLn[0] )
            {
               GXutil.writeLogln("ttaes01:[seudo value changed for attri]"+"TaesUltLn");
               GXutil.writeLogRaw("Old: ",Z11636TaesUltLn);
               GXutil.writeLogRaw("Current: ",T01EL4_A11636TaesUltLn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTAES00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EL1544( )
   {
      beforeValidate1EL1544( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EL1544( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EL1544( 0) ;
         checkOptimisticConcurrency1EL1544( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EL1544( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EL1544( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EL11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n11634TaesId), A11634TaesId, Boolean.valueOf(n11635TaesDc), A11635TaesDc, Boolean.valueOf(n11636TaesUltLn), Short.valueOf(A11636TaesUltLn), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES00");
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
                        processLevel1EL1544( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1EL0( ) ;
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
            load1EL1544( ) ;
         }
         endLevel1EL1544( ) ;
      }
      closeExtendedTableCursors1EL1544( ) ;
   }

   public void update1EL1544( )
   {
      beforeValidate1EL1544( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EL1544( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EL1544( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EL1544( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1EL1544( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EL12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n11635TaesDc), A11635TaesDc, Boolean.valueOf(n11636TaesUltLn), Short.valueOf(A11636TaesUltLn), A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES00");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES00"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1EL1544( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1EL1544( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1EL0( ) ;
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
         endLevel1EL1544( ) ;
      }
      closeExtendedTableCursors1EL1544( ) ;
   }

   public void deferredUpdate1EL1544( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EL1544( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EL1544( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EL1544( ) ;
         afterConfirm1EL1544( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EL1544( ) ;
            if ( AnyError == 0 )
            {
               A11636TaesUltLn = O11636TaesUltLn ;
               n11636TaesUltLn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
               scanStart1EL1545( ) ;
               while ( RcdFound1545 != 0 )
               {
                  getByPrimaryKey1EL1545( ) ;
                  delete1EL1545( ) ;
                  scanNext1EL1545( ) ;
                  O11636TaesUltLn = A11636TaesUltLn ;
                  n11636TaesUltLn = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
               }
               scanEnd1EL1545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EL13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES00");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1544 == 0 )
                        {
                           initAll1EL1544( ) ;
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
                        resetCaption1EL0( ) ;
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
      sMode1544 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EL1544( ) ;
      Gx_mode = sMode1544 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EL1544( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV8UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01EL14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01EL15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUFAM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1EL1545( )
   {
      s11636TaesUltLn = O11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1EL1545( ) ;
         if ( ( nRcdExists_1545 != 0 ) || ( nIsMod_1545 != 0 ) )
         {
            standaloneNotModal1EL1545( ) ;
            getKey1EL1545( ) ;
            if ( ( nRcdExists_1545 == 0 ) && ( nRcdDeleted_1545 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1EL1545( ) ;
            }
            else
            {
               if ( RcdFound1545 != 0 )
               {
                  if ( ( nRcdDeleted_1545 != 0 ) && ( nRcdExists_1545 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1EL1545( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1545 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1EL1545( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1545 == 0 )
                  {
                     GXCCtl = "TAESLN_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTaesLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11636TaesUltLn = A11636TaesUltLn ;
            n11636TaesUltLn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1545_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesLn_Internalname, GXutil.ltrim( localUtil.ntoc( A11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesVi_Internalname, GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesVf_Internalname, GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11637TaesLn_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11638TaesVi_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11639TaesVf_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1545_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1545_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1545_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1545 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1545_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1545_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESVI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESVF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1EL1545( ) ;
      if ( AnyError != 0 )
      {
         O11636TaesUltLn = s11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      }
      nRcdExists_1545 = (short)(0) ;
      nIsMod_1545 = (short)(0) ;
      nRcdDeleted_1545 = (short)(0) ;
   }

   public void processLevel1EL1544( )
   {
      /* Save parent mode. */
      sMode1544 = Gx_mode ;
      processNestedLevel1EL1545( ) ;
      if ( AnyError != 0 )
      {
         O11636TaesUltLn = s11636TaesUltLn ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1544 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01EL16 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n11636TaesUltLn), Short.valueOf(A11636TaesUltLn), A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES00");
   }

   public void endLevel1EL1544( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1EL1544( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttaes01");
         if ( AnyError == 0 )
         {
            confirmValues1EL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttaes01");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1EL1544( )
   {
      /* Scan By routine */
      /* Using cursor T01EL17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Boolean.valueOf(n11635TaesDc), A11635TaesDc});
      RcdFound1544 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1544 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EL1544( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1544 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1544 = (short)(1) ;
      }
   }

   public void scanEnd1EL1544( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1EL1544( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EL1544( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EL1544( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EL1544( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EL1544( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EL1544( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EL1544( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTaesId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId_Enabled), 5, 0), true);
      edtTaesDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesDc_Enabled), 5, 0), true);
      edtTaesUltLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLn_Enabled), 5, 0), true);
   }

   public void zm1EL1545( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11638TaesVi = T01EL3_A11638TaesVi[0] ;
            Z11639TaesVf = T01EL3_A11639TaesVf[0] ;
         }
         else
         {
            Z11638TaesVi = A11638TaesVi ;
            Z11639TaesVf = A11639TaesVf ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         Z11637TaesLn = A11637TaesLn ;
         Z11638TaesVi = A11638TaesVi ;
         Z11639TaesVf = A11639TaesVf ;
      }
   }

   public void standaloneNotModal1EL1545( )
   {
      edtTaesUltLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLn_Enabled), 5, 0), true);
      edtTaesUltLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesUltLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesUltLn_Enabled), 5, 0), true);
   }

   public void standaloneModal1EL1545( )
   {
      if ( isIns( )  )
      {
         A11636TaesUltLn = (short)(O11636TaesUltLn+1) ;
         n11636TaesUltLn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11637TaesLn = A11636TaesUltLn ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTaesLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTaesLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtTaesLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTaesLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1EL1545( )
   {
      /* Using cursor T01EL18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1545 = (short)(1) ;
         A11638TaesVi = T01EL18_A11638TaesVi[0] ;
         n11638TaesVi = T01EL18_n11638TaesVi[0] ;
         A11639TaesVf = T01EL18_A11639TaesVf[0] ;
         n11639TaesVf = T01EL18_n11639TaesVf[0] ;
         zm1EL1545( -10) ;
      }
      pr_default.close(16);
      onLoadActions1EL1545( ) ;
   }

   public void onLoadActions1EL1545( )
   {
   }

   public void checkExtendedTable1EL1545( )
   {
      nIsDirty_1545 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1EL1545( ) ;
   }

   public void closeExtendedTableCursors1EL1545( )
   {
   }

   public void enableDisable1EL1545( )
   {
   }

   public void getKey1EL1545( )
   {
      /* Using cursor T01EL19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1545 = (short)(1) ;
      }
      else
      {
         RcdFound1545 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1EL1545( )
   {
      /* Using cursor T01EL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01EL3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01EL3_A11634TaesId[0], A11634TaesId) == 0 ) )
      {
         zm1EL1545( 10) ;
         RcdFound1545 = (short)(1) ;
         initializeNonKey1EL1545( ) ;
         A11637TaesLn = T01EL3_A11637TaesLn[0] ;
         A11638TaesVi = T01EL3_A11638TaesVi[0] ;
         n11638TaesVi = T01EL3_n11638TaesVi[0] ;
         A11639TaesVf = T01EL3_A11639TaesVf[0] ;
         n11639TaesVf = T01EL3_n11639TaesVf[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11634TaesId = A11634TaesId ;
         Z11637TaesLn = A11637TaesLn ;
         sMode1545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EL1545( ) ;
         load1EL1545( ) ;
         Gx_mode = sMode1545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1545 = (short)(0) ;
         initializeNonKey1EL1545( ) ;
         sMode1545 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1EL1545( ) ;
         Gx_mode = sMode1545 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1EL1545( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1EL1545( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01EL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11638TaesVi, T01EL2_A11638TaesVi[0]) != 0 ) || ( DecimalUtil.compareTo(Z11639TaesVf, T01EL2_A11639TaesVf[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z11638TaesVi, T01EL2_A11638TaesVi[0]) != 0 )
            {
               GXutil.writeLogln("ttaes01:[seudo value changed for attri]"+"TaesVi");
               GXutil.writeLogRaw("Old: ",Z11638TaesVi);
               GXutil.writeLogRaw("Current: ",T01EL2_A11638TaesVi[0]);
            }
            if ( DecimalUtil.compareTo(Z11639TaesVf, T01EL2_A11639TaesVf[0]) != 0 )
            {
               GXutil.writeLogln("ttaes01:[seudo value changed for attri]"+"TaesVf");
               GXutil.writeLogRaw("Old: ",Z11639TaesVf);
               GXutil.writeLogRaw("Current: ",T01EL2_A11639TaesVf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTAES01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1EL1545( )
   {
      beforeValidate1EL1545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EL1545( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1EL1545( 0) ;
         checkOptimisticConcurrency1EL1545( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1EL1545( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1EL1545( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01EL20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn), Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
                  if ( (pr_default.getStatus(18) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A11634TaesId ;
                        GXv_char2[0] = A11635TaesDc ;
                        GXv_int5[0] = A11637TaesLn ;
                        GXv_decimal7[0] = A11638TaesVi ;
                        GXv_decimal6[0] = A11639TaesVf ;
                        new app.ptaes02(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5, GXv_decimal7, GXv_decimal6) ;
                        ttaes01_impl.this.A396EmprCod = GXv_char4[0] ;
                        ttaes01_impl.this.A11634TaesId = GXv_char3[0] ;
                        ttaes01_impl.this.A11635TaesDc = GXv_char2[0] ;
                        ttaes01_impl.this.A11637TaesLn = GXv_int5[0] ;
                        ttaes01_impl.this.A11638TaesVi = GXv_decimal7[0] ;
                        ttaes01_impl.this.A11639TaesVf = GXv_decimal6[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
                        httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
                     }
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
            load1EL1545( ) ;
         }
         endLevel1EL1545( ) ;
      }
      closeExtendedTableCursors1EL1545( ) ;
   }

   public void update1EL1545( )
   {
      beforeValidate1EL1545( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1EL1545( ) ;
      }
      if ( ( nIsMod_1545 != 0 ) || ( nIsDirty_1545 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1EL1545( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1EL1545( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1EL1545( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01EL21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n11638TaesVi), A11638TaesVi, Boolean.valueOf(n11639TaesVf), A11639TaesVf, A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTAES01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1EL1545( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1EL1545( ) ;
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
            endLevel1EL1545( ) ;
         }
      }
      closeExtendedTableCursors1EL1545( ) ;
   }

   public void deferredUpdate1EL1545( )
   {
   }

   public void delete1EL1545( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1EL1545( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1EL1545( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1EL1545( ) ;
         afterConfirm1EL1545( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1EL1545( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01EL22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTAES01");
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
      sMode1545 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1EL1545( ) ;
      Gx_mode = sMode1545 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1EL1545( )
   {
      standaloneModal1EL1545( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01EL23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId, Short.valueOf(A11637TaesLn)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel1EL1545( )
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

   public void scanStart1EL1545( )
   {
      /* Scan By routine */
      /* Using cursor T01EL24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n11634TaesId), A11634TaesId});
      RcdFound1545 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1545 = (short)(1) ;
         A11637TaesLn = T01EL24_A11637TaesLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1EL1545( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1545 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1545 = (short)(1) ;
         A11637TaesLn = T01EL24_A11637TaesLn[0] ;
      }
   }

   public void scanEnd1EL1545( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1EL1545( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1EL1545( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1EL1545( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1EL1545( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1EL1545( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1EL1545( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1EL1545( )
   {
      edtTaesLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtTaesVi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesVi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesVi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtTaesVf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesVf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesVf_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1EL1545( )
   {
   }

   public void send_integrity_lvl_hashes1EL1544( )
   {
   }

   public void subsflControlProps_451545( )
   {
      edtavnRcdDeleted_1545_Internalname = "vNRCDDELETED_1545_"+sGXsfl_45_idx ;
      edtTaesLn_Internalname = "TAESLN_"+sGXsfl_45_idx ;
      edtTaesVi_Internalname = "TAESVI_"+sGXsfl_45_idx ;
      edtTaesVf_Internalname = "TAESVF_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451545( )
   {
      edtavnRcdDeleted_1545_Internalname = "vNRCDDELETED_1545_"+sGXsfl_45_fel_idx ;
      edtTaesLn_Internalname = "TAESLN_"+sGXsfl_45_fel_idx ;
      edtTaesVi_Internalname = "TAESVI_"+sGXsfl_45_fel_idx ;
      edtTaesVf_Internalname = "TAESVF_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1EL1545( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451545( ) ;
      sendRow1EL1545( ) ;
   }

   public void sendRow1EL1545( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1545_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1545_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1545_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1545), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1545), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1545_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1545_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1545_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesLn_Internalname,GXutil.ltrim( localUtil.ntoc( A11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11637TaesLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTaesLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1545_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesVi_Internalname,GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTaesVi_Enabled!=0) ? localUtil.format( A11638TaesVi, "ZZZZZ9.999") : localUtil.format( A11638TaesVi, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesVi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTaesVi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1545_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesVf_Internalname,GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTaesVf_Enabled!=0) ? localUtil.format( A11639TaesVf, "ZZZZZ9.999") : localUtil.format( A11639TaesVf, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesVf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTaesVf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1EL1545( ) ;
      GXCCtl = "Z11637TaesLn_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11637TaesLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11638TaesVi_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11638TaesVi, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11639TaesVf_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11639TaesVf, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1545_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1545_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1545_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1545, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1545_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1545_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESLN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESVI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESVF_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVf_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1EL1545( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451545( ) ;
      edtavnRcdDeleted_1545_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1545_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESLN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesVi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESVI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesVf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESVF_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1545_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1545_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1545");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1545_Internalname ;
         wbErr = true ;
         nRcdDeleted_1545 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1545 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1545_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTaesLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTaesLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TAESLN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTaesLn_Internalname ;
         wbErr = true ;
         A11637TaesLn = (short)(0) ;
      }
      else
      {
         A11637TaesLn = (short)(localUtil.ctol( httpContext.cgiGet( edtTaesLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTaesVi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTaesVi_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "TAESVI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTaesVi_Internalname ;
         wbErr = true ;
         A11638TaesVi = DecimalUtil.ZERO ;
         n11638TaesVi = false ;
      }
      else
      {
         A11638TaesVi = localUtil.ctond( httpContext.cgiGet( edtTaesVi_Internalname)) ;
         n11638TaesVi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTaesVf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTaesVf_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "TAESVF_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTaesVf_Internalname ;
         wbErr = true ;
         A11639TaesVf = DecimalUtil.ZERO ;
         n11639TaesVf = false ;
      }
      else
      {
         A11639TaesVf = localUtil.ctond( httpContext.cgiGet( edtTaesVf_Internalname)) ;
         n11639TaesVf = false ;
      }
      GXCCtl = "Z11637TaesLn_" + sGXsfl_45_idx ;
      Z11637TaesLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11638TaesVi_" + sGXsfl_45_idx ;
      Z11638TaesVi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11639TaesVf_" + sGXsfl_45_idx ;
      Z11639TaesVf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1545_" + sGXsfl_45_idx ;
      nRcdDeleted_1545 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1545_" + sGXsfl_45_idx ;
      nRcdExists_1545 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1545_" + sGXsfl_45_idx ;
      nIsMod_1545 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTaesLn_Enabled = edtTaesLn_Enabled ;
   }

   public void confirmValues1EL0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451545( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451545( ) ;
         httpContext.changePostValue( "Z11637TaesLn_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11637TaesLn_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11637TaesLn_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z11638TaesVi_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11638TaesVi_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11638TaesVi_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z11639TaesVf_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11639TaesVf_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11639TaesVf_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttaes01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A11634TaesId)),GXutil.URLEncode(GXutil.rtrim(A11635TaesDc))}, new String[] {"EmprCod","TaesId","TaesDc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11634TaesId", GXutil.rtrim( Z11634TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11636TaesUltLn", GXutil.ltrim( localUtil.ntoc( Z11636TaesUltLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11636TaesUltLn", GXutil.ltrim( localUtil.ntoc( O11636TaesUltLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
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
      return formatLink("app.ttaes01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A11634TaesId)),GXutil.URLEncode(GXutil.rtrim(A11635TaesDc))}, new String[] {"EmprCod","TaesId","TaesDc"})  ;
   }

   public String getPgmname( )
   {
      return "TTAES01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLAS DE DOSIFICACION Intervalos", "") ;
   }

   public void initializeNonKey1EL1544( )
   {
      A11636TaesUltLn = (short)(0) ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      O11636TaesUltLn = A11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
      Z11636TaesUltLn = (short)(0) ;
   }

   public void initAll1EL1544( )
   {
      initializeNonKey1EL1544( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1EL1545( )
   {
      A11638TaesVi = DecimalUtil.ZERO ;
      n11638TaesVi = false ;
      A11639TaesVf = DecimalUtil.ZERO ;
      n11639TaesVf = false ;
      Z11638TaesVi = DecimalUtil.ZERO ;
      Z11639TaesVf = DecimalUtil.ZERO ;
   }

   public void initAll1EL1545( )
   {
      A11637TaesLn = (short)(0) ;
      initializeNonKey1EL1545( ) ;
   }

   public void standaloneModalInsert1EL1545( )
   {
      A11636TaesUltLn = i11636TaesUltLn ;
      n11636TaesUltLn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11636TaesUltLn), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824156547", true, true);
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
      httpContext.AddJavascriptSource("ttaes01.js", "?2026824156547", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1545( )
   {
      edtTaesLn_Enabled = defedtTaesLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesLn_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1545, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1545_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11637TaesLn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesVf_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTaesId_Internalname = "TAESID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTaesDc_Internalname = "TAESDC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTaesUltLn_Internalname = "TAESULTLN" ;
      edtavnRcdDeleted_1545_Internalname = "vNRCDDELETED_1545" ;
      edtTaesLn_Internalname = "TAESLN" ;
      edtTaesVi_Internalname = "TAESVI" ;
      edtTaesVf_Internalname = "TAESVF" ;
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
      Form.setCaption( httpContext.getMessage( "TABLAS DE DOSIFICACION Intervalos", "") );
      edtTaesVf_Jsonclick = "" ;
      edtTaesVi_Jsonclick = "" ;
      edtTaesLn_Jsonclick = "" ;
      edtavnRcdDeleted_1545_Jsonclick = "" ;
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
      edtTaesVf_Enabled = 1 ;
      edtTaesVi_Enabled = 1 ;
      edtTaesLn_Enabled = 1 ;
      edtavnRcdDeleted_1545_Enabled = 1 ;
      edtTaesUltLn_Jsonclick = "" ;
      edtTaesUltLn_Backcolor = (int)(0xFFFFFF) ;
      edtTaesUltLn_Enabled = 0 ;
      edtTaesDc_Jsonclick = "" ;
      edtTaesDc_Backcolor = (int)(0xFFFFFF) ;
      edtTaesDc_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtTaesId_Jsonclick = "" ;
      edtTaesId_Backcolor = (int)(0xFFFFFF) ;
      edtTaesId_Enabled = 0 ;
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

   public void xc_7_1EL1545( String A396EmprCod ,
                             String A11634TaesId ,
                             String A11635TaesDc ,
                             short A11637TaesLn ,
                             java.math.BigDecimal A11638TaesVi ,
                             java.math.BigDecimal A11639TaesVf )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A11634TaesId ;
         GXv_char2[0] = A11635TaesDc ;
         GXv_int5[0] = A11637TaesLn ;
         GXv_decimal7[0] = A11638TaesVi ;
         GXv_decimal6[0] = A11639TaesVf ;
         new app.ptaes02(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5, GXv_decimal7, GXv_decimal6) ;
         A396EmprCod = GXv_char4[0] ;
         A11634TaesId = GXv_char3[0] ;
         A11635TaesDc = GXv_char2[0] ;
         A11637TaesLn = GXv_int5[0] ;
         A11638TaesVi = GXv_decimal7[0] ;
         A11639TaesVf = GXv_decimal6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11634TaesId", A11634TaesId);
         httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", A11635TaesDc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11634TaesId))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11635TaesDc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11637TaesLn, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11638TaesVi, (byte)(10), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11639TaesVf, (byte)(10), (byte)(3), ".", "")))+"\"") ;
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
      subsflControlProps_451545( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1EL1545( ) ;
         standaloneModal1EL1545( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1EL1545( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451545( ) ;
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
      /* Using cursor T01EL25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01EL25_A407EmprNom[0] ;
      n407EmprNom = T01EL25_n407EmprNom[0] ;
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

   public void valid_Taesid( )
   {
      n11636TaesUltLn = false ;
      n11635TaesDc = false ;
      n11634TaesId = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11636TaesUltLn", GXutil.ltrim( localUtil.ntoc( A11636TaesUltLn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11635TaesDc", GXutil.rtrim( A11635TaesDc));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11634TaesId", GXutil.rtrim( Z11634TaesId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11636TaesUltLn", GXutil.ltrim( localUtil.ntoc( Z11636TaesUltLn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11635TaesDc", GXutil.rtrim( Z11635TaesDc));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "O11636TaesUltLn", GXutil.ltrim( localUtil.ntoc( O11636TaesUltLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A11635TaesDc',fld:'TAESDC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'TABLA PRODUCTOS'","{handler:'e121EL2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A11635TaesDc',fld:'TAESDC',pic:''},{av:'A11637TaesLn',fld:'TAESLN',pic:'ZZZ9'},{av:'A11638TaesVi',fld:'TAESVI',pic:'ZZZZZ9.999'},{av:'A11639TaesVf',fld:'TAESVF',pic:'ZZZZZ9.999'}]");
      setEventMetadata("'TABLA PRODUCTOS'",",oparms:[{av:'A11639TaesVf',fld:'TAESVF',pic:'ZZZZZ9.999'},{av:'A11638TaesVi',fld:'TAESVI',pic:'ZZZZZ9.999'},{av:'A11637TaesLn',fld:'TAESLN',pic:'ZZZ9'},{av:'A11635TaesDc',fld:'TAESDC',pic:''},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'IMPRIMIR'","{handler:'e131EL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''}]");
      setEventMetadata("'IMPRIMIR'",",oparms:[{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TAESID","{handler:'valid_Taesid',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A11636TaesUltLn',fld:'TAESULTLN',pic:'ZZZ9'},{av:'A11635TaesDc',fld:'TAESDC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11634TaesId',fld:'TAESID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_TAESID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11636TaesUltLn',fld:'TAESULTLN',pic:'ZZZ9'},{av:'A11635TaesDc',fld:'TAESDC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11634TaesId'},{av:'Z407EmprNom'},{av:'Z11636TaesUltLn'},{av:'Z11635TaesDc'},{av:'ZV8UsurCod'},{av:'O11636TaesUltLn'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TAESDC","{handler:'valid_Taesdc',iparms:[]");
      setEventMetadata("VALID_TAESDC",",oparms:[]}");
      setEventMetadata("VALID_TAESULTLN","{handler:'valid_Taesultln',iparms:[]");
      setEventMetadata("VALID_TAESULTLN",",oparms:[]}");
      setEventMetadata("VALID_TAESLN","{handler:'valid_Taesln',iparms:[]");
      setEventMetadata("VALID_TAESLN",",oparms:[]}");
      setEventMetadata("VALID_TAESVI","{handler:'valid_Taesvi',iparms:[]");
      setEventMetadata("VALID_TAESVI",",oparms:[]}");
      setEventMetadata("VALID_TAESVF","{handler:'valid_Taesvf',iparms:[]");
      setEventMetadata("VALID_TAESVF",",oparms:[]}");
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
      wcpOA11634TaesId = "" ;
      wcpOA11635TaesDc = "" ;
      Z396EmprCod = "" ;
      Z11634TaesId = "" ;
      Z11638TaesVi = DecimalUtil.ZERO ;
      Z11639TaesVf = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A11634TaesId = "" ;
      A11635TaesDc = "" ;
      A11638TaesVi = DecimalUtil.ZERO ;
      A11639TaesVf = DecimalUtil.ZERO ;
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
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1545 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV8UsurCod = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1544 = "" ;
      GXCCtl = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      Z11635TaesDc = "" ;
      Z407EmprNom = "" ;
      T01EL6_A407EmprNom = new String[] {""} ;
      T01EL6_n407EmprNom = new boolean[] {false} ;
      T01EL7_A11634TaesId = new String[] {""} ;
      T01EL7_n11634TaesId = new boolean[] {false} ;
      T01EL7_A11635TaesDc = new String[] {""} ;
      T01EL7_n11635TaesDc = new boolean[] {false} ;
      T01EL7_A407EmprNom = new String[] {""} ;
      T01EL7_n407EmprNom = new boolean[] {false} ;
      T01EL7_A11636TaesUltLn = new short[1] ;
      T01EL7_n11636TaesUltLn = new boolean[] {false} ;
      T01EL7_A396EmprCod = new String[] {""} ;
      T01EL8_A396EmprCod = new String[] {""} ;
      T01EL8_A11634TaesId = new String[] {""} ;
      T01EL8_n11634TaesId = new boolean[] {false} ;
      T01EL5_A11634TaesId = new String[] {""} ;
      T01EL5_n11634TaesId = new boolean[] {false} ;
      T01EL5_A11635TaesDc = new String[] {""} ;
      T01EL5_n11635TaesDc = new boolean[] {false} ;
      T01EL5_A11636TaesUltLn = new short[1] ;
      T01EL5_n11636TaesUltLn = new boolean[] {false} ;
      T01EL5_A396EmprCod = new String[] {""} ;
      T01EL9_A396EmprCod = new String[] {""} ;
      T01EL9_A11634TaesId = new String[] {""} ;
      T01EL9_n11634TaesId = new boolean[] {false} ;
      T01EL9_A11635TaesDc = new String[] {""} ;
      T01EL9_n11635TaesDc = new boolean[] {false} ;
      T01EL10_A396EmprCod = new String[] {""} ;
      T01EL10_A11634TaesId = new String[] {""} ;
      T01EL10_n11634TaesId = new boolean[] {false} ;
      T01EL10_A11635TaesDc = new String[] {""} ;
      T01EL10_n11635TaesDc = new boolean[] {false} ;
      T01EL4_A11634TaesId = new String[] {""} ;
      T01EL4_n11634TaesId = new boolean[] {false} ;
      T01EL4_A11635TaesDc = new String[] {""} ;
      T01EL4_n11635TaesDc = new boolean[] {false} ;
      T01EL4_A11636TaesUltLn = new short[1] ;
      T01EL4_n11636TaesUltLn = new boolean[] {false} ;
      T01EL4_A396EmprCod = new String[] {""} ;
      T01EL14_A396EmprCod = new String[] {""} ;
      T01EL14_A11634TaesId = new String[] {""} ;
      T01EL14_n11634TaesId = new boolean[] {false} ;
      T01EL14_A11637TaesLn = new short[1] ;
      T01EL14_A11641TaesLnP = new short[1] ;
      T01EL15_A396EmprCod = new String[] {""} ;
      T01EL15_A499GrpFamCod = new byte[1] ;
      T01EL17_A396EmprCod = new String[] {""} ;
      T01EL17_A11634TaesId = new String[] {""} ;
      T01EL17_n11634TaesId = new boolean[] {false} ;
      T01EL18_A396EmprCod = new String[] {""} ;
      T01EL18_A11634TaesId = new String[] {""} ;
      T01EL18_n11634TaesId = new boolean[] {false} ;
      T01EL18_A11637TaesLn = new short[1] ;
      T01EL18_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EL18_n11638TaesVi = new boolean[] {false} ;
      T01EL18_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EL18_n11639TaesVf = new boolean[] {false} ;
      T01EL19_A396EmprCod = new String[] {""} ;
      T01EL19_A11634TaesId = new String[] {""} ;
      T01EL19_n11634TaesId = new boolean[] {false} ;
      T01EL19_A11637TaesLn = new short[1] ;
      T01EL3_A396EmprCod = new String[] {""} ;
      T01EL3_A11634TaesId = new String[] {""} ;
      T01EL3_n11634TaesId = new boolean[] {false} ;
      T01EL3_A11637TaesLn = new short[1] ;
      T01EL3_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EL3_n11638TaesVi = new boolean[] {false} ;
      T01EL3_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EL3_n11639TaesVf = new boolean[] {false} ;
      T01EL2_A396EmprCod = new String[] {""} ;
      T01EL2_A11634TaesId = new String[] {""} ;
      T01EL2_n11634TaesId = new boolean[] {false} ;
      T01EL2_A11637TaesLn = new short[1] ;
      T01EL2_A11638TaesVi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EL2_n11638TaesVi = new boolean[] {false} ;
      T01EL2_A11639TaesVf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01EL2_n11639TaesVf = new boolean[] {false} ;
      T01EL23_A396EmprCod = new String[] {""} ;
      T01EL23_A11634TaesId = new String[] {""} ;
      T01EL23_n11634TaesId = new boolean[] {false} ;
      T01EL23_A11637TaesLn = new short[1] ;
      T01EL23_A11641TaesLnP = new short[1] ;
      T01EL24_A396EmprCod = new String[] {""} ;
      T01EL24_A11634TaesId = new String[] {""} ;
      T01EL24_n11634TaesId = new boolean[] {false} ;
      T01EL24_A11637TaesLn = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      T01EL25_A407EmprNom = new String[] {""} ;
      T01EL25_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ11634TaesId = "" ;
      ZZ407EmprNom = "" ;
      ZZ11635TaesDc = "" ;
      ZZV8UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttaes01__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttaes01__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttaes01__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttaes01__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttaes01__default(),
         new Object[] {
             new Object[] {
            T01EL2_A396EmprCod, T01EL2_A11634TaesId, T01EL2_A11637TaesLn, T01EL2_A11638TaesVi, T01EL2_n11638TaesVi, T01EL2_A11639TaesVf, T01EL2_n11639TaesVf
            }
            , new Object[] {
            T01EL3_A396EmprCod, T01EL3_A11634TaesId, T01EL3_A11637TaesLn, T01EL3_A11638TaesVi, T01EL3_n11638TaesVi, T01EL3_A11639TaesVf, T01EL3_n11639TaesVf
            }
            , new Object[] {
            T01EL4_A11634TaesId, T01EL4_A11635TaesDc, T01EL4_n11635TaesDc, T01EL4_A11636TaesUltLn, T01EL4_n11636TaesUltLn, T01EL4_A396EmprCod
            }
            , new Object[] {
            T01EL5_A11634TaesId, T01EL5_A11635TaesDc, T01EL5_n11635TaesDc, T01EL5_A11636TaesUltLn, T01EL5_n11636TaesUltLn, T01EL5_A396EmprCod
            }
            , new Object[] {
            T01EL6_A407EmprNom, T01EL6_n407EmprNom
            }
            , new Object[] {
            T01EL7_A11634TaesId, T01EL7_A11635TaesDc, T01EL7_n11635TaesDc, T01EL7_A407EmprNom, T01EL7_n407EmprNom, T01EL7_A11636TaesUltLn, T01EL7_n11636TaesUltLn, T01EL7_A396EmprCod
            }
            , new Object[] {
            T01EL8_A396EmprCod, T01EL8_A11634TaesId
            }
            , new Object[] {
            T01EL9_A396EmprCod, T01EL9_A11634TaesId, T01EL9_A11635TaesDc, T01EL9_n11635TaesDc
            }
            , new Object[] {
            T01EL10_A396EmprCod, T01EL10_A11634TaesId, T01EL10_A11635TaesDc, T01EL10_n11635TaesDc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EL14_A396EmprCod, T01EL14_A11634TaesId, T01EL14_A11637TaesLn, T01EL14_A11641TaesLnP
            }
            , new Object[] {
            T01EL15_A396EmprCod, T01EL15_A499GrpFamCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01EL17_A396EmprCod, T01EL17_A11634TaesId
            }
            , new Object[] {
            T01EL18_A396EmprCod, T01EL18_A11634TaesId, T01EL18_A11637TaesLn, T01EL18_A11638TaesVi, T01EL18_n11638TaesVi, T01EL18_A11639TaesVf, T01EL18_n11639TaesVf
            }
            , new Object[] {
            T01EL19_A396EmprCod, T01EL19_A11634TaesId, T01EL19_A11637TaesLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01EL23_A396EmprCod, T01EL23_A11634TaesId, T01EL23_A11637TaesLn, T01EL23_A11641TaesLnP
            }
            , new Object[] {
            T01EL24_A396EmprCod, T01EL24_A11634TaesId, T01EL24_A11637TaesLn
            }
            , new Object[] {
            T01EL25_A407EmprNom, T01EL25_n407EmprNom
            }
         }
      );
      Z11635TaesDc = "" ;
      n11635TaesDc = false ;
      A11635TaesDc = "" ;
      n11635TaesDc = false ;
      Z11634TaesId = "" ;
      n11634TaesId = false ;
      A11634TaesId = "" ;
      n11634TaesId = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTAES01" ;
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
   private short Z11636TaesUltLn ;
   private short O11636TaesUltLn ;
   private short Z11637TaesLn ;
   private short nRcdDeleted_1545 ;
   private short nRcdExists_1545 ;
   private short nIsMod_1545 ;
   private short A11637TaesLn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11636TaesUltLn ;
   private short nBlankRcdCount1545 ;
   private short RcdFound1545 ;
   private short B11636TaesUltLn ;
   private short nBlankRcdUsr1545 ;
   private short s11636TaesUltLn ;
   private short RcdFound1544 ;
   private short nIsDirty_1544 ;
   private short nIsDirty_1545 ;
   private short i11636TaesUltLn ;
   private short GXv_int5[] ;
   private short ZZ11636TaesUltLn ;
   private short ZO11636TaesUltLn ;
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
   private int edtTaesId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTaesDc_Enabled ;
   private int edtTaesUltLn_Enabled ;
   private int edtavnRcdDeleted_1545_Enabled ;
   private int edtTaesLn_Enabled ;
   private int edtTaesVi_Enabled ;
   private int edtTaesVf_Enabled ;
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
   private int defedtTaesLn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtTaesUltLn_Backcolor ;
   private int edtTaesDc_Backcolor ;
   private int edtTaesId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11638TaesVi ;
   private java.math.BigDecimal Z11639TaesVf ;
   private java.math.BigDecimal A11638TaesVi ;
   private java.math.BigDecimal A11639TaesVf ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA11634TaesId ;
   private String wcpOA11635TaesDc ;
   private String Z396EmprCod ;
   private String Z11634TaesId ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A11634TaesId ;
   private String A11635TaesDc ;
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
   private String edtTaesId_Internalname ;
   private String edtTaesId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtTaesDc_Internalname ;
   private String edtTaesDc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTaesUltLn_Internalname ;
   private String edtTaesUltLn_Jsonclick ;
   private String sMode1545 ;
   private String edtavnRcdDeleted_1545_Internalname ;
   private String edtTaesLn_Internalname ;
   private String edtTaesVi_Internalname ;
   private String edtTaesVf_Internalname ;
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
   private String AV8UsurCod ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1544 ;
   private String GXCCtl ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String Z11635TaesDc ;
   private String Z407EmprNom ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1545_Jsonclick ;
   private String edtTaesLn_Jsonclick ;
   private String edtTaesVi_Jsonclick ;
   private String edtTaesVf_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ11634TaesId ;
   private String ZZ407EmprNom ;
   private String ZZ11635TaesDc ;
   private String ZZV8UsurCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11634TaesId ;
   private boolean n11635TaesDc ;
   private boolean n11638TaesVi ;
   private boolean n11639TaesVf ;
   private boolean wbErr ;
   private boolean n11636TaesUltLn ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01EL6_A407EmprNom ;
   private boolean[] T01EL6_n407EmprNom ;
   private String[] T01EL7_A11634TaesId ;
   private boolean[] T01EL7_n11634TaesId ;
   private String[] T01EL7_A11635TaesDc ;
   private boolean[] T01EL7_n11635TaesDc ;
   private String[] T01EL7_A407EmprNom ;
   private boolean[] T01EL7_n407EmprNom ;
   private short[] T01EL7_A11636TaesUltLn ;
   private boolean[] T01EL7_n11636TaesUltLn ;
   private String[] T01EL7_A396EmprCod ;
   private String[] T01EL8_A396EmprCod ;
   private String[] T01EL8_A11634TaesId ;
   private boolean[] T01EL8_n11634TaesId ;
   private String[] T01EL5_A11634TaesId ;
   private boolean[] T01EL5_n11634TaesId ;
   private String[] T01EL5_A11635TaesDc ;
   private boolean[] T01EL5_n11635TaesDc ;
   private short[] T01EL5_A11636TaesUltLn ;
   private boolean[] T01EL5_n11636TaesUltLn ;
   private String[] T01EL5_A396EmprCod ;
   private String[] T01EL9_A396EmprCod ;
   private String[] T01EL9_A11634TaesId ;
   private boolean[] T01EL9_n11634TaesId ;
   private String[] T01EL9_A11635TaesDc ;
   private boolean[] T01EL9_n11635TaesDc ;
   private String[] T01EL10_A396EmprCod ;
   private String[] T01EL10_A11634TaesId ;
   private boolean[] T01EL10_n11634TaesId ;
   private String[] T01EL10_A11635TaesDc ;
   private boolean[] T01EL10_n11635TaesDc ;
   private String[] T01EL4_A11634TaesId ;
   private boolean[] T01EL4_n11634TaesId ;
   private String[] T01EL4_A11635TaesDc ;
   private boolean[] T01EL4_n11635TaesDc ;
   private short[] T01EL4_A11636TaesUltLn ;
   private boolean[] T01EL4_n11636TaesUltLn ;
   private String[] T01EL4_A396EmprCod ;
   private String[] T01EL14_A396EmprCod ;
   private String[] T01EL14_A11634TaesId ;
   private boolean[] T01EL14_n11634TaesId ;
   private short[] T01EL14_A11637TaesLn ;
   private short[] T01EL14_A11641TaesLnP ;
   private String[] T01EL15_A396EmprCod ;
   private byte[] T01EL15_A499GrpFamCod ;
   private String[] T01EL17_A396EmprCod ;
   private String[] T01EL17_A11634TaesId ;
   private boolean[] T01EL17_n11634TaesId ;
   private String[] T01EL18_A396EmprCod ;
   private String[] T01EL18_A11634TaesId ;
   private boolean[] T01EL18_n11634TaesId ;
   private short[] T01EL18_A11637TaesLn ;
   private java.math.BigDecimal[] T01EL18_A11638TaesVi ;
   private boolean[] T01EL18_n11638TaesVi ;
   private java.math.BigDecimal[] T01EL18_A11639TaesVf ;
   private boolean[] T01EL18_n11639TaesVf ;
   private String[] T01EL19_A396EmprCod ;
   private String[] T01EL19_A11634TaesId ;
   private boolean[] T01EL19_n11634TaesId ;
   private short[] T01EL19_A11637TaesLn ;
   private String[] T01EL3_A396EmprCod ;
   private String[] T01EL3_A11634TaesId ;
   private boolean[] T01EL3_n11634TaesId ;
   private short[] T01EL3_A11637TaesLn ;
   private java.math.BigDecimal[] T01EL3_A11638TaesVi ;
   private boolean[] T01EL3_n11638TaesVi ;
   private java.math.BigDecimal[] T01EL3_A11639TaesVf ;
   private boolean[] T01EL3_n11639TaesVf ;
   private String[] T01EL2_A396EmprCod ;
   private String[] T01EL2_A11634TaesId ;
   private boolean[] T01EL2_n11634TaesId ;
   private short[] T01EL2_A11637TaesLn ;
   private java.math.BigDecimal[] T01EL2_A11638TaesVi ;
   private boolean[] T01EL2_n11638TaesVi ;
   private java.math.BigDecimal[] T01EL2_A11639TaesVf ;
   private boolean[] T01EL2_n11639TaesVf ;
   private String[] T01EL23_A396EmprCod ;
   private String[] T01EL23_A11634TaesId ;
   private boolean[] T01EL23_n11634TaesId ;
   private short[] T01EL23_A11637TaesLn ;
   private short[] T01EL23_A11641TaesLnP ;
   private String[] T01EL24_A396EmprCod ;
   private String[] T01EL24_A11634TaesId ;
   private boolean[] T01EL24_n11634TaesId ;
   private short[] T01EL24_A11637TaesLn ;
   private String[] T01EL25_A407EmprNom ;
   private boolean[] T01EL25_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttaes01__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes01__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes01__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes01__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttaes01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01EL2", "SELECT EmprCod, TaesId, TaesLn, TaesVi, TaesVf FROM TXPTAES01 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?  FOR UPDATE OF TaesVi, TaesVf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EL3", "SELECT EmprCod, TaesId, TaesLn, TaesVi, TaesVf FROM TXPTAES01 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EL4", "SELECT TaesId, TaesDc, TaesUltLn, EmprCod FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ?  FOR UPDATE OF TaesDc, TaesUltLn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL5", "SELECT TaesId, TaesDc, TaesUltLn, EmprCod FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL7", "SELECT /*+ FIRST_ROWS(1) */ TM1.TaesId, TM1.TaesDc, T2.EmprNom, TM1.TaesUltLn, TM1.EmprCod FROM (TXPTAES00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TaesId = ? and TM1.TaesDc = ? ORDER BY TM1.EmprCod, TM1.TaesId ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TaesId FROM TXPTAES00 WHERE EmprCod = ? AND TaesId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TaesId, TaesDc FROM TXPTAES00 WHERE EmprCod = ? and TaesId = ? and TaesDc = ? ORDER BY EmprCod, TaesId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TaesId, TaesDc FROM TXPTAES00 WHERE EmprCod = ? and TaesId = ? and TaesDc = ? ORDER BY EmprCod DESC, TaesId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EL11", "INSERT INTO TXPTAES00(TaesId, TaesDc, TaesUltLn, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPTAES00")
         ,new UpdateCursor("T01EL12", "UPDATE TXPTAES00 SET TaesDc=?, TaesUltLn=?  WHERE EmprCod = ? AND TaesId = ?", GX_NOMASK, "TXPTAES00")
         ,new UpdateCursor("T01EL13", "DELETE FROM TXPTAES00  WHERE EmprCod = ? AND TaesId = ?", GX_NOMASK, "TXPTAES00")
         ,new ForEachCursor("T01EL14", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND TaesId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL15", "SELECT * FROM (SELECT EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ? AND TaesId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01EL16", "UPDATE TXPTAES00 SET TaesUltLn=?  WHERE EmprCod = ? AND TaesId = ?", GX_NOMASK, "TXPTAES00")
         ,new ForEachCursor("T01EL17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TaesId FROM TXPTAES00 WHERE EmprCod = ? and TaesId = ? and TaesDc = ? ORDER BY EmprCod, TaesId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL18", "SELECT EmprCod, TaesId, TaesLn, TaesVi, TaesVf FROM TXPTAES01 WHERE EmprCod = ? and TaesId = ? and TaesLn = ? ORDER BY EmprCod, TaesId, TaesLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EL19", "SELECT EmprCod, TaesId, TaesLn FROM TXPTAES01 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01EL20", "INSERT INTO TXPTAES01(EmprCod, TaesId, TaesLn, TaesVi, TaesVf, TaesUltLnP) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPTAES01")
         ,new UpdateCursor("T01EL21", "UPDATE TXPTAES01 SET TaesVi=?, TaesVf=?  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?", GX_NOMASK, "TXPTAES01")
         ,new UpdateCursor("T01EL22", "DELETE FROM TXPTAES01  WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?", GX_NOMASK, "TXPTAES01")
         ,new ForEachCursor("T01EL23", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND TaesId = ? AND TaesLn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01EL24", "SELECT EmprCod, TaesId, TaesLn FROM TXPTAES01 WHERE EmprCod = ? and TaesId = ? ORDER BY EmprCod, TaesId, TaesLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01EL25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 80);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 80);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 80);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 80);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 80);
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
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 80);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 3);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 6);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

