package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplabal_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Balanceo de Líneas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPlaLinCod_Internalname ;
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

   public tplabal_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplabal_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplabal_impl.class ));
   }

   public tplabal_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPlaBal.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Línea de Acabado", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPlaLinCod_Internalname, GXutil.rtrim( A11697PlaLinCod), GXutil.rtrim( localUtil.format( A11697PlaLinCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPlaLinCod_Jsonclick, 0, "", "", "", "", "", 1, edtPlaLinCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Línea de Acabado", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPlaLinDsc_Internalname, A11690PlaLinDsc, GXutil.rtrim( localUtil.format( A11690PlaLinDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPlaLinDsc_Jsonclick, 0, "", "", "", "", "", 1, edtPlaLinDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Cond HDR", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPlaLinHDR_Internalname, A11691PlaLinHDR, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", (short)(0), 1, edtPlaLinHDR_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Cond Fase", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaBal.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPlaLinFas_Internalname, A11692PlaLinFas, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", (short)(0), 1, edtPlaLinFas_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPlaBal.htm");
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
         nBlankRcdCount1636 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1636 = (short)(1) ;
            scanStart1H61636( ) ;
            while ( RcdFound1636 != 0 )
            {
               init_level_properties1636( ) ;
               getByPrimaryKey1H61636( ) ;
               addRow1H61636( ) ;
               scanNext1H61636( ) ;
            }
            scanEnd1H61636( ) ;
            nBlankRcdCount1636 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1H61636( ) ;
         standaloneModal1H61636( ) ;
         sMode1636 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1H61636( ) ;
            edtavnRcdDeleted_1636_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1636_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1636_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1636_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPlaBalLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaBalLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPlaBalDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALDSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaBalDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPlaBalHDR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALHDR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaBalHDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalHDR_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPlaBalFas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALFAS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaBalFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalFas_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPlaBalMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALMAX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaBalMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalMax_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1636 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1H61636( ) ;
            }
            sendRow1H61636( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1636 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1636 = (short)(5) ;
         nRcdExists_1636 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1H61636( ) ;
            while ( RcdFound1636 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501636( ) ;
               init_level_properties1636( ) ;
               standaloneNotModal1H61636( ) ;
               getByPrimaryKey1H61636( ) ;
               standaloneModal1H61636( ) ;
               addRow1H61636( ) ;
               scanNext1H61636( ) ;
            }
            scanEnd1H61636( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1636 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501636( ) ;
      initAll1H61636( ) ;
      init_level_properties1636( ) ;
      nRcdExists_1636 = (short)(0) ;
      nIsMod_1636 = (short)(0) ;
      nRcdDeleted_1636 = (short)(0) ;
      nBlankRcdCount1636 = (short)(nBlankRcdUsr1636+nBlankRcdCount1636) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1636 > 0 )
      {
         standaloneNotModal1H61636( ) ;
         standaloneModal1H61636( ) ;
         addRow1H61636( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPlaBalLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1636 = (short)(nBlankRcdCount1636-1) ;
      }
      Gx_mode = sMode1636 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaBal.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPlaBal.htm");
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
      e111H62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11697PlaLinCod = httpContext.cgiGet( "Z11697PlaLinCod") ;
            Z11690PlaLinDsc = httpContext.cgiGet( "Z11690PlaLinDsc") ;
            Z11691PlaLinHDR = httpContext.cgiGet( "Z11691PlaLinHDR") ;
            Z11692PlaLinFas = httpContext.cgiGet( "Z11692PlaLinFas") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A11697PlaLinCod = httpContext.cgiGet( edtPlaLinCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
            A11690PlaLinDsc = httpContext.cgiGet( edtPlaLinDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11690PlaLinDsc", A11690PlaLinDsc);
            A11691PlaLinHDR = httpContext.cgiGet( edtPlaLinHDR_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11691PlaLinHDR", A11691PlaLinHDR);
            A11692PlaLinFas = httpContext.cgiGet( edtPlaLinFas_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11692PlaLinFas", A11692PlaLinFas);
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
               A11697PlaLinCod = httpContext.GetPar( "PlaLinCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
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
                        e111H62 ();
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
            initAll1H61635( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1636_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1636_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1H61635( ) ;
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

   public void confirm_1H60( )
   {
      beforeValidate1H61635( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1H61635( ) ;
         }
         else
         {
            checkExtendedTable1H61635( ) ;
            if ( AnyError == 0 )
            {
               zm1H61635( 2) ;
            }
            closeExtendedTableCursors1H61635( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1635 = Gx_mode ;
         confirm_1H61636( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1635 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1635 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1H60( ) ;
      }
   }

   public void confirm_1H61636( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1H61636( ) ;
         if ( ( nRcdExists_1636 != 0 ) || ( nIsMod_1636 != 0 ) )
         {
            getKey1H61636( ) ;
            if ( ( nRcdExists_1636 == 0 ) && ( nRcdDeleted_1636 == 0 ) )
            {
               if ( RcdFound1636 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1H61636( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1H61636( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1H61636( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PLABALLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPlaBalLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1636 != 0 )
               {
                  if ( nRcdDeleted_1636 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1H61636( ) ;
                     load1H61636( ) ;
                     beforeValidate1H61636( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1H61636( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1636 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1H61636( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1H61636( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1H61636( ) ;
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
                  if ( nRcdDeleted_1636 == 0 )
                  {
                     GXCCtl = "PLABALLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaBalLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1636_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaBalLin_Internalname, GXutil.ltrim( localUtil.ntoc( A11698PlaBalLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaBalDsc_Internalname, A11693PlaBalDsc) ;
         httpContext.changePostValue( edtPlaBalHDR_Internalname, A11694PlaBalHDR) ;
         httpContext.changePostValue( edtPlaBalFas_Internalname, A11695PlaBalFas) ;
         httpContext.changePostValue( edtPlaBalMax_Internalname, GXutil.ltrim( localUtil.ntoc( A11696PlaBalMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11698PlaBalLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11698PlaBalLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11693PlaBalDsc_"+sGXsfl_50_idx, Z11693PlaBalDsc) ;
         httpContext.changePostValue( "ZT_"+"Z11694PlaBalHDR_"+sGXsfl_50_idx, Z11694PlaBalHDR) ;
         httpContext.changePostValue( "ZT_"+"Z11695PlaBalFas_"+sGXsfl_50_idx, Z11695PlaBalFas) ;
         httpContext.changePostValue( "ZT_"+"Z11696PlaBalMax_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11696PlaBalMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1636_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1636_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1636_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1636 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1636_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1636_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALHDR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalHDR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALFAS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalFas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALMAX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1H60( )
   {
   }

   public void e111H62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tplabal_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tplabal_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tplabal_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tplabal_impl.this.A396EmprCod = GXv_char2[0] ;
      tplabal_impl.this.AV11EmprNom = GXv_char3[0] ;
      tplabal_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1H61635( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11690PlaLinDsc = T01H65_A11690PlaLinDsc[0] ;
            Z11691PlaLinHDR = T01H65_A11691PlaLinHDR[0] ;
            Z11692PlaLinFas = T01H65_A11692PlaLinFas[0] ;
         }
         else
         {
            Z11690PlaLinDsc = A11690PlaLinDsc ;
            Z11691PlaLinHDR = A11691PlaLinHDR ;
            Z11692PlaLinFas = A11692PlaLinFas ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11697PlaLinCod = A11697PlaLinCod ;
         Z11690PlaLinDsc = A11690PlaLinDsc ;
         Z11691PlaLinHDR = A11691PlaLinHDR ;
         Z11692PlaLinFas = A11692PlaLinFas ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TPlaBal" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01H66 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01H66_A407EmprNom[0] ;
      n407EmprNom = T01H66_n407EmprNom[0] ;
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

   public void load1H61635( )
   {
      /* Using cursor T01H67 */
      pr_default.execute(5, new Object[] {A396EmprCod, A11697PlaLinCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1635 = (short)(1) ;
         A407EmprNom = T01H67_A407EmprNom[0] ;
         n407EmprNom = T01H67_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11690PlaLinDsc = T01H67_A11690PlaLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11690PlaLinDsc", A11690PlaLinDsc);
         A11691PlaLinHDR = T01H67_A11691PlaLinHDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11691PlaLinHDR", A11691PlaLinHDR);
         A11692PlaLinFas = T01H67_A11692PlaLinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11692PlaLinFas", A11692PlaLinFas);
         zm1H61635( -1) ;
      }
      pr_default.close(5);
      onLoadActions1H61635( ) ;
   }

   public void onLoadActions1H61635( )
   {
   }

   public void checkExtendedTable1H61635( )
   {
      nIsDirty_1635 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1H61635( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1H61635( )
   {
      /* Using cursor T01H68 */
      pr_default.execute(6, new Object[] {A396EmprCod, A11697PlaLinCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1635 = (short)(1) ;
      }
      else
      {
         RcdFound1635 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01H65 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11697PlaLinCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01H65_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H61635( 1) ;
         RcdFound1635 = (short)(1) ;
         A11697PlaLinCod = T01H65_A11697PlaLinCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
         A11690PlaLinDsc = T01H65_A11690PlaLinDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11690PlaLinDsc", A11690PlaLinDsc);
         A11691PlaLinHDR = T01H65_A11691PlaLinHDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11691PlaLinHDR", A11691PlaLinHDR);
         A11692PlaLinFas = T01H65_A11692PlaLinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11692PlaLinFas", A11692PlaLinFas);
         Z396EmprCod = A396EmprCod ;
         Z11697PlaLinCod = A11697PlaLinCod ;
         sMode1635 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1H61635( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1635 = (short)(0) ;
            initializeNonKey1H61635( ) ;
         }
         Gx_mode = sMode1635 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1635 = (short)(0) ;
         initializeNonKey1H61635( ) ;
         sMode1635 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1635 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1H61635( ) ;
      if ( RcdFound1635 == 0 )
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
      RcdFound1635 = (short)(0) ;
      /* Using cursor T01H69 */
      pr_default.execute(7, new Object[] {A11697PlaLinCod, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01H69_A11697PlaLinCod[0], A11697PlaLinCod) < 0 ) ) && ( GXutil.strcmp(T01H69_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01H69_A11697PlaLinCod[0], A11697PlaLinCod) > 0 ) ) && ( GXutil.strcmp(T01H69_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11697PlaLinCod = T01H69_A11697PlaLinCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
            RcdFound1635 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1635 = (short)(0) ;
      /* Using cursor T01H610 */
      pr_default.execute(8, new Object[] {A11697PlaLinCod, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01H610_A11697PlaLinCod[0], A11697PlaLinCod) > 0 ) ) && ( GXutil.strcmp(T01H610_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01H610_A11697PlaLinCod[0], A11697PlaLinCod) < 0 ) ) && ( GXutil.strcmp(T01H610_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11697PlaLinCod = T01H610_A11697PlaLinCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
            RcdFound1635 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H61635( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPlaLinCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1H61635( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1635 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11697PlaLinCod, Z11697PlaLinCod) != 0 ) )
            {
               A11697PlaLinCod = Z11697PlaLinCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPlaLinCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1H61635( ) ;
               GX_FocusControl = edtPlaLinCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11697PlaLinCod, Z11697PlaLinCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPlaLinCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1H61635( ) ;
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
                  GX_FocusControl = edtPlaLinCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1H61635( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11697PlaLinCod, Z11697PlaLinCod) != 0 ) )
      {
         A11697PlaLinCod = Z11697PlaLinCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPlaLinCod_Internalname ;
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
      getKey1H61635( ) ;
      if ( RcdFound1635 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11697PlaLinCod, Z11697PlaLinCod) != 0 ) )
         {
            A11697PlaLinCod = Z11697PlaLinCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11697PlaLinCod, Z11697PlaLinCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplabal");
      GX_FocusControl = edtPlaLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1H60( ) ;
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
      if ( RcdFound1635 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPlaLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1H61635( ) ;
      if ( RcdFound1635 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPlaLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H61635( ) ;
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
      if ( RcdFound1635 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPlaLinDsc_Internalname ;
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
      if ( RcdFound1635 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPlaLinDsc_Internalname ;
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
      scanStart1H61635( ) ;
      if ( RcdFound1635 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1635 != 0 )
         {
            scanNext1H61635( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPlaLinDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H61635( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1H61635( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01H64 */
         pr_default.execute(2, new Object[] {A396EmprCod, A11697PlaLinCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaLin"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z11690PlaLinDsc, T01H64_A11690PlaLinDsc[0]) != 0 ) || ( GXutil.strcmp(Z11691PlaLinHDR, T01H64_A11691PlaLinHDR[0]) != 0 ) || ( GXutil.strcmp(Z11692PlaLinFas, T01H64_A11692PlaLinFas[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11690PlaLinDsc, T01H64_A11690PlaLinDsc[0]) != 0 )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaLinDsc");
               GXutil.writeLogRaw("Old: ",Z11690PlaLinDsc);
               GXutil.writeLogRaw("Current: ",T01H64_A11690PlaLinDsc[0]);
            }
            if ( GXutil.strcmp(Z11691PlaLinHDR, T01H64_A11691PlaLinHDR[0]) != 0 )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaLinHDR");
               GXutil.writeLogRaw("Old: ",Z11691PlaLinHDR);
               GXutil.writeLogRaw("Current: ",T01H64_A11691PlaLinHDR[0]);
            }
            if ( GXutil.strcmp(Z11692PlaLinFas, T01H64_A11692PlaLinFas[0]) != 0 )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaLinFas");
               GXutil.writeLogRaw("Old: ",Z11692PlaLinFas);
               GXutil.writeLogRaw("Current: ",T01H64_A11692PlaLinFas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPlaLin"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H61635( )
   {
      beforeValidate1H61635( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H61635( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H61635( 0) ;
         checkOptimisticConcurrency1H61635( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H61635( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H61635( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H611 */
                  pr_default.execute(9, new Object[] {A11697PlaLinCod, A11690PlaLinDsc, A11691PlaLinHDR, A11692PlaLinFas, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaLin");
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
                        processLevel1H61635( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1H60( ) ;
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
            load1H61635( ) ;
         }
         endLevel1H61635( ) ;
      }
      closeExtendedTableCursors1H61635( ) ;
   }

   public void update1H61635( )
   {
      beforeValidate1H61635( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H61635( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H61635( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H61635( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H61635( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H612 */
                  pr_default.execute(10, new Object[] {A11690PlaLinDsc, A11691PlaLinHDR, A11692PlaLinFas, A396EmprCod, A11697PlaLinCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaLin");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaLin"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H61635( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1H61635( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1H60( ) ;
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
         endLevel1H61635( ) ;
      }
      closeExtendedTableCursors1H61635( ) ;
   }

   public void deferredUpdate1H61635( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H61635( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H61635( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H61635( ) ;
         afterConfirm1H61635( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H61635( ) ;
            if ( AnyError == 0 )
            {
               scanStart1H61636( ) ;
               while ( RcdFound1636 != 0 )
               {
                  getByPrimaryKey1H61636( ) ;
                  delete1H61636( ) ;
                  scanNext1H61636( ) ;
               }
               scanEnd1H61636( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H613 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A11697PlaLinCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaLin");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1635 == 0 )
                        {
                           initAll1H61635( ) ;
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
                        resetCaption1H60( ) ;
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
      sMode1635 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H61635( ) ;
      Gx_mode = sMode1635 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H61635( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1H61636( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1H61636( ) ;
         if ( ( nRcdExists_1636 != 0 ) || ( nIsMod_1636 != 0 ) )
         {
            standaloneNotModal1H61636( ) ;
            getKey1H61636( ) ;
            if ( ( nRcdExists_1636 == 0 ) && ( nRcdDeleted_1636 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1H61636( ) ;
            }
            else
            {
               if ( RcdFound1636 != 0 )
               {
                  if ( ( nRcdDeleted_1636 != 0 ) && ( nRcdExists_1636 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1H61636( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1636 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1H61636( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1636 == 0 )
                  {
                     GXCCtl = "PLABALLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaBalLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1636_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaBalLin_Internalname, GXutil.ltrim( localUtil.ntoc( A11698PlaBalLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaBalDsc_Internalname, A11693PlaBalDsc) ;
         httpContext.changePostValue( edtPlaBalHDR_Internalname, A11694PlaBalHDR) ;
         httpContext.changePostValue( edtPlaBalFas_Internalname, A11695PlaBalFas) ;
         httpContext.changePostValue( edtPlaBalMax_Internalname, GXutil.ltrim( localUtil.ntoc( A11696PlaBalMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11698PlaBalLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11698PlaBalLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11693PlaBalDsc_"+sGXsfl_50_idx, Z11693PlaBalDsc) ;
         httpContext.changePostValue( "ZT_"+"Z11694PlaBalHDR_"+sGXsfl_50_idx, Z11694PlaBalHDR) ;
         httpContext.changePostValue( "ZT_"+"Z11695PlaBalFas_"+sGXsfl_50_idx, Z11695PlaBalFas) ;
         httpContext.changePostValue( "ZT_"+"Z11696PlaBalMax_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z11696PlaBalMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1636_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1636_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1636_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1636 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1636_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1636_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALHDR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalHDR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALFAS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalFas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLABALMAX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1H61636( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1636 = (short)(0) ;
      nIsMod_1636 = (short)(0) ;
      nRcdDeleted_1636 = (short)(0) ;
   }

   public void processLevel1H61635( )
   {
      /* Save parent mode. */
      sMode1635 = Gx_mode ;
      processNestedLevel1H61636( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1635 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1H61635( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H61635( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplabal");
         if ( AnyError == 0 )
         {
            confirmValues1H60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplabal");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H61635( )
   {
      /* Scan By routine */
      /* Using cursor T01H614 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound1635 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1635 = (short)(1) ;
         A11697PlaLinCod = T01H614_A11697PlaLinCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H61635( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1635 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1635 = (short)(1) ;
         A11697PlaLinCod = T01H614_A11697PlaLinCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
      }
   }

   public void scanEnd1H61635( )
   {
      pr_default.close(12);
   }

   public void afterConfirm1H61635( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H61635( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H61635( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H61635( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H61635( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H61635( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H61635( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPlaLinCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaLinCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaLinCod_Enabled), 5, 0), true);
      edtPlaLinDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaLinDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaLinDsc_Enabled), 5, 0), true);
      edtPlaLinHDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaLinHDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaLinHDR_Enabled), 5, 0), true);
      edtPlaLinFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaLinFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaLinFas_Enabled), 5, 0), true);
   }

   public void zm1H61636( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11693PlaBalDsc = T01H63_A11693PlaBalDsc[0] ;
            Z11694PlaBalHDR = T01H63_A11694PlaBalHDR[0] ;
            Z11695PlaBalFas = T01H63_A11695PlaBalFas[0] ;
            Z11696PlaBalMax = T01H63_A11696PlaBalMax[0] ;
         }
         else
         {
            Z11693PlaBalDsc = A11693PlaBalDsc ;
            Z11694PlaBalHDR = A11694PlaBalHDR ;
            Z11695PlaBalFas = A11695PlaBalFas ;
            Z11696PlaBalMax = A11696PlaBalMax ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z11697PlaLinCod = A11697PlaLinCod ;
         Z11698PlaBalLin = A11698PlaBalLin ;
         Z11693PlaBalDsc = A11693PlaBalDsc ;
         Z11694PlaBalHDR = A11694PlaBalHDR ;
         Z11695PlaBalFas = A11695PlaBalFas ;
         Z11696PlaBalMax = A11696PlaBalMax ;
      }
   }

   public void standaloneNotModal1H61636( )
   {
   }

   public void standaloneModal1H61636( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPlaBalLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaBalLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtPlaBalLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaBalLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1H61636( )
   {
      /* Using cursor T01H615 */
      pr_default.execute(13, new Object[] {A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1636 = (short)(1) ;
         A11693PlaBalDsc = T01H615_A11693PlaBalDsc[0] ;
         A11694PlaBalHDR = T01H615_A11694PlaBalHDR[0] ;
         A11695PlaBalFas = T01H615_A11695PlaBalFas[0] ;
         A11696PlaBalMax = T01H615_A11696PlaBalMax[0] ;
         zm1H61636( -3) ;
      }
      pr_default.close(13);
      onLoadActions1H61636( ) ;
   }

   public void onLoadActions1H61636( )
   {
   }

   public void checkExtendedTable1H61636( )
   {
      nIsDirty_1636 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1H61636( ) ;
   }

   public void closeExtendedTableCursors1H61636( )
   {
   }

   public void enableDisable1H61636( )
   {
   }

   public void getKey1H61636( )
   {
      /* Using cursor T01H616 */
      pr_default.execute(14, new Object[] {A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1636 = (short)(1) ;
      }
      else
      {
         RcdFound1636 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey1H61636( )
   {
      /* Using cursor T01H63 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01H63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H61636( 3) ;
         RcdFound1636 = (short)(1) ;
         initializeNonKey1H61636( ) ;
         A11698PlaBalLin = T01H63_A11698PlaBalLin[0] ;
         A11693PlaBalDsc = T01H63_A11693PlaBalDsc[0] ;
         A11694PlaBalHDR = T01H63_A11694PlaBalHDR[0] ;
         A11695PlaBalFas = T01H63_A11695PlaBalFas[0] ;
         A11696PlaBalMax = T01H63_A11696PlaBalMax[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11697PlaLinCod = A11697PlaLinCod ;
         Z11698PlaBalLin = A11698PlaBalLin ;
         sMode1636 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1H61636( ) ;
         load1H61636( ) ;
         Gx_mode = sMode1636 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1636 = (short)(0) ;
         initializeNonKey1H61636( ) ;
         sMode1636 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1H61636( ) ;
         Gx_mode = sMode1636 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1H61636( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1H61636( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01H62 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaBal"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11693PlaBalDsc, T01H62_A11693PlaBalDsc[0]) != 0 ) || ( GXutil.strcmp(Z11694PlaBalHDR, T01H62_A11694PlaBalHDR[0]) != 0 ) || ( GXutil.strcmp(Z11695PlaBalFas, T01H62_A11695PlaBalFas[0]) != 0 ) || ( Z11696PlaBalMax != T01H62_A11696PlaBalMax[0] ) )
         {
            if ( GXutil.strcmp(Z11693PlaBalDsc, T01H62_A11693PlaBalDsc[0]) != 0 )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaBalDsc");
               GXutil.writeLogRaw("Old: ",Z11693PlaBalDsc);
               GXutil.writeLogRaw("Current: ",T01H62_A11693PlaBalDsc[0]);
            }
            if ( GXutil.strcmp(Z11694PlaBalHDR, T01H62_A11694PlaBalHDR[0]) != 0 )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaBalHDR");
               GXutil.writeLogRaw("Old: ",Z11694PlaBalHDR);
               GXutil.writeLogRaw("Current: ",T01H62_A11694PlaBalHDR[0]);
            }
            if ( GXutil.strcmp(Z11695PlaBalFas, T01H62_A11695PlaBalFas[0]) != 0 )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaBalFas");
               GXutil.writeLogRaw("Old: ",Z11695PlaBalFas);
               GXutil.writeLogRaw("Current: ",T01H62_A11695PlaBalFas[0]);
            }
            if ( Z11696PlaBalMax != T01H62_A11696PlaBalMax[0] )
            {
               GXutil.writeLogln("tplabal:[seudo value changed for attri]"+"PlaBalMax");
               GXutil.writeLogRaw("Old: ",Z11696PlaBalMax);
               GXutil.writeLogRaw("Current: ",T01H62_A11696PlaBalMax[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPlaBal"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H61636( )
   {
      beforeValidate1H61636( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H61636( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H61636( 0) ;
         checkOptimisticConcurrency1H61636( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H61636( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H61636( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H617 */
                  pr_default.execute(15, new Object[] {A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin), A11693PlaBalDsc, A11694PlaBalHDR, A11695PlaBalFas, Integer.valueOf(A11696PlaBalMax)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaBal");
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
            load1H61636( ) ;
         }
         endLevel1H61636( ) ;
      }
      closeExtendedTableCursors1H61636( ) ;
   }

   public void update1H61636( )
   {
      beforeValidate1H61636( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H61636( ) ;
      }
      if ( ( nIsMod_1636 != 0 ) || ( nIsDirty_1636 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1H61636( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1H61636( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1H61636( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01H618 */
                     pr_default.execute(16, new Object[] {A11693PlaBalDsc, A11694PlaBalHDR, A11695PlaBalFas, Integer.valueOf(A11696PlaBalMax), A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaBal");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaBal"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1H61636( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1H61636( ) ;
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
            endLevel1H61636( ) ;
         }
      }
      closeExtendedTableCursors1H61636( ) ;
   }

   public void deferredUpdate1H61636( )
   {
   }

   public void delete1H61636( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H61636( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H61636( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H61636( ) ;
         afterConfirm1H61636( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H61636( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01H619 */
               pr_default.execute(17, new Object[] {A396EmprCod, A11697PlaLinCod, Short.valueOf(A11698PlaBalLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaBal");
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
      sMode1636 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H61636( ) ;
      Gx_mode = sMode1636 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H61636( )
   {
      standaloneModal1H61636( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1H61636( )
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

   public void scanStart1H61636( )
   {
      /* Scan By routine */
      /* Using cursor T01H620 */
      pr_default.execute(18, new Object[] {A396EmprCod, A11697PlaLinCod});
      RcdFound1636 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1636 = (short)(1) ;
         A11698PlaBalLin = T01H620_A11698PlaBalLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H61636( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1636 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1636 = (short)(1) ;
         A11698PlaBalLin = T01H620_A11698PlaBalLin[0] ;
      }
   }

   public void scanEnd1H61636( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1H61636( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H61636( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H61636( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H61636( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H61636( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H61636( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H61636( )
   {
      edtPlaBalLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaBalLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPlaBalDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaBalDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPlaBalHDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaBalHDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalHDR_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPlaBalFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaBalFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalFas_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPlaBalMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaBalMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalMax_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1H61636( )
   {
   }

   public void send_integrity_lvl_hashes1H61635( )
   {
   }

   public void subsflControlProps_501636( )
   {
      edtavnRcdDeleted_1636_Internalname = "vNRCDDELETED_1636_"+sGXsfl_50_idx ;
      edtPlaBalLin_Internalname = "PLABALLIN_"+sGXsfl_50_idx ;
      edtPlaBalDsc_Internalname = "PLABALDSC_"+sGXsfl_50_idx ;
      edtPlaBalHDR_Internalname = "PLABALHDR_"+sGXsfl_50_idx ;
      edtPlaBalFas_Internalname = "PLABALFAS_"+sGXsfl_50_idx ;
      edtPlaBalMax_Internalname = "PLABALMAX_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501636( )
   {
      edtavnRcdDeleted_1636_Internalname = "vNRCDDELETED_1636_"+sGXsfl_50_fel_idx ;
      edtPlaBalLin_Internalname = "PLABALLIN_"+sGXsfl_50_fel_idx ;
      edtPlaBalDsc_Internalname = "PLABALDSC_"+sGXsfl_50_fel_idx ;
      edtPlaBalHDR_Internalname = "PLABALHDR_"+sGXsfl_50_fel_idx ;
      edtPlaBalFas_Internalname = "PLABALFAS_"+sGXsfl_50_fel_idx ;
      edtPlaBalMax_Internalname = "PLABALMAX_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1H61636( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501636( ) ;
      sendRow1H61636( ) ;
   }

   public void sendRow1H61636( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1636_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1636_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1636_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1636), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1636), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1636_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1636_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1636_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaBalLin_Internalname,GXutil.ltrim( localUtil.ntoc( A11698PlaBalLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11698PlaBalLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaBalLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaBalLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1636_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaBalDsc_Internalname,A11693PlaBalDsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaBalDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaBalDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1636_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaBalHDR_Internalname,A11694PlaBalHDR,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaBalHDR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaBalHDR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1636_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaBalFas_Internalname,A11695PlaBalFas,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaBalFas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaBalFas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1636_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaBalMax_Internalname,GXutil.ltrim( localUtil.ntoc( A11696PlaBalMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaBalMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11696PlaBalMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11696PlaBalMax), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaBalMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaBalMax_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1H61636( ) ;
      GXCCtl = "Z11698PlaBalLin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11698PlaBalLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11693PlaBalDsc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11693PlaBalDsc);
      GXCCtl = "Z11694PlaBalHDR_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11694PlaBalHDR);
      GXCCtl = "Z11695PlaBalFas_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11695PlaBalFas);
      GXCCtl = "Z11696PlaBalMax_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11696PlaBalMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1636_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1636_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1636_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1636, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1636_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1636_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLABALLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLABALDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLABALHDR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalHDR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLABALFAS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalFas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLABALMAX_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1H61636( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501636( ) ;
      edtavnRcdDeleted_1636_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1636_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaBalLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaBalDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALDSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaBalHDR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALHDR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaBalFas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALFAS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaBalMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLABALMAX_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1636_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1636_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1636");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1636_Internalname ;
         wbErr = true ;
         nRcdDeleted_1636 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1636 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1636_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaBalLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaBalLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PLABALLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaBalLin_Internalname ;
         wbErr = true ;
         A11698PlaBalLin = (short)(0) ;
      }
      else
      {
         A11698PlaBalLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaBalLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11693PlaBalDsc = httpContext.cgiGet( edtPlaBalDsc_Internalname) ;
      A11694PlaBalHDR = httpContext.cgiGet( edtPlaBalHDR_Internalname) ;
      A11695PlaBalFas = httpContext.cgiGet( edtPlaBalFas_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaBalMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaBalMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "PLABALMAX_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaBalMax_Internalname ;
         wbErr = true ;
         A11696PlaBalMax = 0 ;
      }
      else
      {
         A11696PlaBalMax = (int)(localUtil.ctol( httpContext.cgiGet( edtPlaBalMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z11698PlaBalLin_" + sGXsfl_50_idx ;
      Z11698PlaBalLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11693PlaBalDsc_" + sGXsfl_50_idx ;
      Z11693PlaBalDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11694PlaBalHDR_" + sGXsfl_50_idx ;
      Z11694PlaBalHDR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11695PlaBalFas_" + sGXsfl_50_idx ;
      Z11695PlaBalFas = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11696PlaBalMax_" + sGXsfl_50_idx ;
      Z11696PlaBalMax = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1636_" + sGXsfl_50_idx ;
      nRcdDeleted_1636 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1636_" + sGXsfl_50_idx ;
      nRcdExists_1636 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1636_" + sGXsfl_50_idx ;
      nIsMod_1636 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPlaBalLin_Enabled = edtPlaBalLin_Enabled ;
   }

   public void confirmValues1H60( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501636( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501636( ) ;
         httpContext.changePostValue( "Z11698PlaBalLin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11698PlaBalLin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11698PlaBalLin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11693PlaBalDsc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11693PlaBalDsc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11693PlaBalDsc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11694PlaBalHDR_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11694PlaBalHDR_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11694PlaBalHDR_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11695PlaBalFas_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11695PlaBalFas_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11695PlaBalFas_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z11696PlaBalMax_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z11696PlaBalMax_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11696PlaBalMax_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplabal", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11697PlaLinCod", GXutil.rtrim( Z11697PlaLinCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11690PlaLinDsc", Z11690PlaLinDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11691PlaLinHDR", Z11691PlaLinHDR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11692PlaLinFas", Z11692PlaLinFas);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.tplabal", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPlaBal" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Balanceo de Líneas", "") ;
   }

   public void initializeNonKey1H61635( )
   {
      A11690PlaLinDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11690PlaLinDsc", A11690PlaLinDsc);
      A11691PlaLinHDR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11691PlaLinHDR", A11691PlaLinHDR);
      A11692PlaLinFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11692PlaLinFas", A11692PlaLinFas);
      Z11690PlaLinDsc = "" ;
      Z11691PlaLinHDR = "" ;
      Z11692PlaLinFas = "" ;
   }

   public void initAll1H61635( )
   {
      A11697PlaLinCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11697PlaLinCod", A11697PlaLinCod);
      initializeNonKey1H61635( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1H61636( )
   {
      A11693PlaBalDsc = "" ;
      A11694PlaBalHDR = "" ;
      A11695PlaBalFas = "" ;
      A11696PlaBalMax = 0 ;
      Z11693PlaBalDsc = "" ;
      Z11694PlaBalHDR = "" ;
      Z11695PlaBalFas = "" ;
      Z11696PlaBalMax = 0 ;
   }

   public void initAll1H61636( )
   {
      A11698PlaBalLin = (short)(0) ;
      initializeNonKey1H61636( ) ;
   }

   public void standaloneModalInsert1H61636( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241575680", true, true);
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
      httpContext.AddJavascriptSource("tplabal.js", "?20268241575681", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1636( )
   {
      edtPlaBalLin_Enabled = defedtPlaBalLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaBalLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaBalLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1636, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1636_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11698PlaBalLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11693PlaBalDsc);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11694PlaBalHDR);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalHDR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11695PlaBalFas);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalFas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11696PlaBalMax, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaBalMax_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPlaLinCod_Internalname = "PLALINCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPlaLinDsc_Internalname = "PLALINDSC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPlaLinHDR_Internalname = "PLALINHDR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPlaLinFas_Internalname = "PLALINFAS" ;
      edtavnRcdDeleted_1636_Internalname = "vNRCDDELETED_1636" ;
      edtPlaBalLin_Internalname = "PLABALLIN" ;
      edtPlaBalDsc_Internalname = "PLABALDSC" ;
      edtPlaBalHDR_Internalname = "PLABALHDR" ;
      edtPlaBalFas_Internalname = "PLABALFAS" ;
      edtPlaBalMax_Internalname = "PLABALMAX" ;
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
      Form.setCaption( httpContext.getMessage( "Balanceo de Líneas", "") );
      edtPlaBalMax_Jsonclick = "" ;
      edtPlaBalFas_Jsonclick = "" ;
      edtPlaBalHDR_Jsonclick = "" ;
      edtPlaBalDsc_Jsonclick = "" ;
      edtPlaBalLin_Jsonclick = "" ;
      edtavnRcdDeleted_1636_Jsonclick = "" ;
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
      edtPlaBalMax_Enabled = 1 ;
      edtPlaBalFas_Enabled = 1 ;
      edtPlaBalHDR_Enabled = 1 ;
      edtPlaBalDsc_Enabled = 1 ;
      edtPlaBalLin_Enabled = 1 ;
      edtavnRcdDeleted_1636_Enabled = 1 ;
      edtPlaLinFas_Backcolor = (int)(0xFFFFFF) ;
      edtPlaLinFas_Enabled = 1 ;
      edtPlaLinHDR_Backcolor = (int)(0xFFFFFF) ;
      edtPlaLinHDR_Enabled = 1 ;
      edtPlaLinDsc_Jsonclick = "" ;
      edtPlaLinDsc_Backcolor = (int)(0xFFFFFF) ;
      edtPlaLinDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPlaLinCod_Jsonclick = "" ;
      edtPlaLinCod_Backcolor = (int)(0xFFFFFF) ;
      edtPlaLinCod_Enabled = 1 ;
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
      subsflControlProps_501636( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1H61636( ) ;
         standaloneModal1H61636( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1H61636( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501636( ) ;
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
      /* Using cursor T01H621 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01H621_A407EmprNom[0] ;
      n407EmprNom = T01H621_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      GX_FocusControl = edtPlaLinDsc_Internalname ;
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

   public void valid_Plalincod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11690PlaLinDsc", A11690PlaLinDsc);
      httpContext.ajax_rsp_assign_attri("", false, "A11691PlaLinHDR", A11691PlaLinHDR);
      httpContext.ajax_rsp_assign_attri("", false, "A11692PlaLinFas", A11692PlaLinFas);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11697PlaLinCod", GXutil.rtrim( Z11697PlaLinCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11690PlaLinDsc", Z11690PlaLinDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11691PlaLinHDR", Z11691PlaLinHDR);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11692PlaLinFas", Z11692PlaLinFas);
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
      setEventMetadata("VALID_PLALINCOD","{handler:'valid_Plalincod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11697PlaLinCod',fld:'PLALINCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PLALINCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11690PlaLinDsc',fld:'PLALINDSC',pic:''},{av:'A11691PlaLinHDR',fld:'PLALINHDR',pic:''},{av:'A11692PlaLinFas',fld:'PLALINFAS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11697PlaLinCod'},{av:'Z407EmprNom'},{av:'Z11690PlaLinDsc'},{av:'Z11691PlaLinHDR'},{av:'Z11692PlaLinFas'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PLABALLIN","{handler:'valid_Plaballin',iparms:[]");
      setEventMetadata("VALID_PLABALLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Plabalmax',iparms:[]");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11697PlaLinCod = "" ;
      Z11690PlaLinDsc = "" ;
      Z11691PlaLinHDR = "" ;
      Z11692PlaLinFas = "" ;
      Z11693PlaBalDsc = "" ;
      Z11694PlaBalHDR = "" ;
      Z11695PlaBalFas = "" ;
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
      A11697PlaLinCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11690PlaLinDsc = "" ;
      lblTextblock5_Jsonclick = "" ;
      A11691PlaLinHDR = "" ;
      lblTextblock6_Jsonclick = "" ;
      A11692PlaLinFas = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1636 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1635 = "" ;
      GXCCtl = "" ;
      A11693PlaBalDsc = "" ;
      A11694PlaBalHDR = "" ;
      A11695PlaBalFas = "" ;
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
      T01H66_A407EmprNom = new String[] {""} ;
      T01H66_n407EmprNom = new boolean[] {false} ;
      T01H67_A11697PlaLinCod = new String[] {""} ;
      T01H67_A407EmprNom = new String[] {""} ;
      T01H67_n407EmprNom = new boolean[] {false} ;
      T01H67_A11690PlaLinDsc = new String[] {""} ;
      T01H67_A11691PlaLinHDR = new String[] {""} ;
      T01H67_A11692PlaLinFas = new String[] {""} ;
      T01H67_A396EmprCod = new String[] {""} ;
      T01H68_A396EmprCod = new String[] {""} ;
      T01H68_A11697PlaLinCod = new String[] {""} ;
      T01H65_A11697PlaLinCod = new String[] {""} ;
      T01H65_A11690PlaLinDsc = new String[] {""} ;
      T01H65_A11691PlaLinHDR = new String[] {""} ;
      T01H65_A11692PlaLinFas = new String[] {""} ;
      T01H65_A396EmprCod = new String[] {""} ;
      T01H69_A396EmprCod = new String[] {""} ;
      T01H69_A11697PlaLinCod = new String[] {""} ;
      T01H610_A396EmprCod = new String[] {""} ;
      T01H610_A11697PlaLinCod = new String[] {""} ;
      T01H64_A11697PlaLinCod = new String[] {""} ;
      T01H64_A11690PlaLinDsc = new String[] {""} ;
      T01H64_A11691PlaLinHDR = new String[] {""} ;
      T01H64_A11692PlaLinFas = new String[] {""} ;
      T01H64_A396EmprCod = new String[] {""} ;
      T01H614_A396EmprCod = new String[] {""} ;
      T01H614_A11697PlaLinCod = new String[] {""} ;
      T01H615_A396EmprCod = new String[] {""} ;
      T01H615_A11697PlaLinCod = new String[] {""} ;
      T01H615_A11698PlaBalLin = new short[1] ;
      T01H615_A11693PlaBalDsc = new String[] {""} ;
      T01H615_A11694PlaBalHDR = new String[] {""} ;
      T01H615_A11695PlaBalFas = new String[] {""} ;
      T01H615_A11696PlaBalMax = new int[1] ;
      T01H616_A396EmprCod = new String[] {""} ;
      T01H616_A11697PlaLinCod = new String[] {""} ;
      T01H616_A11698PlaBalLin = new short[1] ;
      T01H63_A396EmprCod = new String[] {""} ;
      T01H63_A11697PlaLinCod = new String[] {""} ;
      T01H63_A11698PlaBalLin = new short[1] ;
      T01H63_A11693PlaBalDsc = new String[] {""} ;
      T01H63_A11694PlaBalHDR = new String[] {""} ;
      T01H63_A11695PlaBalFas = new String[] {""} ;
      T01H63_A11696PlaBalMax = new int[1] ;
      T01H62_A396EmprCod = new String[] {""} ;
      T01H62_A11697PlaLinCod = new String[] {""} ;
      T01H62_A11698PlaBalLin = new short[1] ;
      T01H62_A11693PlaBalDsc = new String[] {""} ;
      T01H62_A11694PlaBalHDR = new String[] {""} ;
      T01H62_A11695PlaBalFas = new String[] {""} ;
      T01H62_A11696PlaBalMax = new int[1] ;
      T01H620_A396EmprCod = new String[] {""} ;
      T01H620_A11697PlaLinCod = new String[] {""} ;
      T01H620_A11698PlaBalLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01H621_A407EmprNom = new String[] {""} ;
      T01H621_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11697PlaLinCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ11690PlaLinDsc = "" ;
      ZZ11691PlaLinHDR = "" ;
      ZZ11692PlaLinFas = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplabal__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplabal__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplabal__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplabal__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplabal__default(),
         new Object[] {
             new Object[] {
            T01H62_A396EmprCod, T01H62_A11697PlaLinCod, T01H62_A11698PlaBalLin, T01H62_A11693PlaBalDsc, T01H62_A11694PlaBalHDR, T01H62_A11695PlaBalFas, T01H62_A11696PlaBalMax
            }
            , new Object[] {
            T01H63_A396EmprCod, T01H63_A11697PlaLinCod, T01H63_A11698PlaBalLin, T01H63_A11693PlaBalDsc, T01H63_A11694PlaBalHDR, T01H63_A11695PlaBalFas, T01H63_A11696PlaBalMax
            }
            , new Object[] {
            T01H64_A11697PlaLinCod, T01H64_A11690PlaLinDsc, T01H64_A11691PlaLinHDR, T01H64_A11692PlaLinFas, T01H64_A396EmprCod
            }
            , new Object[] {
            T01H65_A11697PlaLinCod, T01H65_A11690PlaLinDsc, T01H65_A11691PlaLinHDR, T01H65_A11692PlaLinFas, T01H65_A396EmprCod
            }
            , new Object[] {
            T01H66_A407EmprNom, T01H66_n407EmprNom
            }
            , new Object[] {
            T01H67_A11697PlaLinCod, T01H67_A407EmprNom, T01H67_n407EmprNom, T01H67_A11690PlaLinDsc, T01H67_A11691PlaLinHDR, T01H67_A11692PlaLinFas, T01H67_A396EmprCod
            }
            , new Object[] {
            T01H68_A396EmprCod, T01H68_A11697PlaLinCod
            }
            , new Object[] {
            T01H69_A396EmprCod, T01H69_A11697PlaLinCod
            }
            , new Object[] {
            T01H610_A396EmprCod, T01H610_A11697PlaLinCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H614_A396EmprCod, T01H614_A11697PlaLinCod
            }
            , new Object[] {
            T01H615_A396EmprCod, T01H615_A11697PlaLinCod, T01H615_A11698PlaBalLin, T01H615_A11693PlaBalDsc, T01H615_A11694PlaBalHDR, T01H615_A11695PlaBalFas, T01H615_A11696PlaBalMax
            }
            , new Object[] {
            T01H616_A396EmprCod, T01H616_A11697PlaLinCod, T01H616_A11698PlaBalLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H620_A396EmprCod, T01H620_A11697PlaLinCod, T01H620_A11698PlaBalLin
            }
            , new Object[] {
            T01H621_A407EmprNom, T01H621_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TPlaBal" ;
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
   private short Z11698PlaBalLin ;
   private short nRcdDeleted_1636 ;
   private short nRcdExists_1636 ;
   private short nIsMod_1636 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1636 ;
   private short RcdFound1636 ;
   private short nBlankRcdUsr1636 ;
   private short A11698PlaBalLin ;
   private short RcdFound1635 ;
   private short nIsDirty_1635 ;
   private short nIsDirty_1636 ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z11696PlaBalMax ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPlaLinCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPlaLinDsc_Enabled ;
   private int edtPlaLinHDR_Enabled ;
   private int edtPlaLinFas_Enabled ;
   private int edtavnRcdDeleted_1636_Enabled ;
   private int edtPlaBalLin_Enabled ;
   private int edtPlaBalDsc_Enabled ;
   private int edtPlaBalHDR_Enabled ;
   private int edtPlaBalFas_Enabled ;
   private int edtPlaBalMax_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A11696PlaBalMax ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPlaBalLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPlaLinFas_Backcolor ;
   private int edtPlaLinHDR_Backcolor ;
   private int edtPlaLinDsc_Backcolor ;
   private int edtPlaLinCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11697PlaLinCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPlaLinCod_Internalname ;
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
   private String A11697PlaLinCod ;
   private String edtPlaLinCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPlaLinDsc_Internalname ;
   private String edtPlaLinDsc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtPlaLinHDR_Internalname ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPlaLinFas_Internalname ;
   private String sMode1636 ;
   private String edtavnRcdDeleted_1636_Internalname ;
   private String edtPlaBalLin_Internalname ;
   private String edtPlaBalDsc_Internalname ;
   private String edtPlaBalHDR_Internalname ;
   private String edtPlaBalFas_Internalname ;
   private String edtPlaBalMax_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1635 ;
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
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1636_Jsonclick ;
   private String edtPlaBalLin_Jsonclick ;
   private String edtPlaBalDsc_Jsonclick ;
   private String edtPlaBalHDR_Jsonclick ;
   private String edtPlaBalFas_Jsonclick ;
   private String edtPlaBalMax_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ11697PlaLinCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String Z11690PlaLinDsc ;
   private String Z11691PlaLinHDR ;
   private String Z11692PlaLinFas ;
   private String Z11693PlaBalDsc ;
   private String Z11694PlaBalHDR ;
   private String Z11695PlaBalFas ;
   private String A11690PlaLinDsc ;
   private String A11691PlaLinHDR ;
   private String A11692PlaLinFas ;
   private String A11693PlaBalDsc ;
   private String A11694PlaBalHDR ;
   private String A11695PlaBalFas ;
   private String ZZ11690PlaLinDsc ;
   private String ZZ11691PlaLinHDR ;
   private String ZZ11692PlaLinFas ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01H66_A407EmprNom ;
   private boolean[] T01H66_n407EmprNom ;
   private String[] T01H67_A11697PlaLinCod ;
   private String[] T01H67_A407EmprNom ;
   private boolean[] T01H67_n407EmprNom ;
   private String[] T01H67_A11690PlaLinDsc ;
   private String[] T01H67_A11691PlaLinHDR ;
   private String[] T01H67_A11692PlaLinFas ;
   private String[] T01H67_A396EmprCod ;
   private String[] T01H68_A396EmprCod ;
   private String[] T01H68_A11697PlaLinCod ;
   private String[] T01H65_A11697PlaLinCod ;
   private String[] T01H65_A11690PlaLinDsc ;
   private String[] T01H65_A11691PlaLinHDR ;
   private String[] T01H65_A11692PlaLinFas ;
   private String[] T01H65_A396EmprCod ;
   private String[] T01H69_A396EmprCod ;
   private String[] T01H69_A11697PlaLinCod ;
   private String[] T01H610_A396EmprCod ;
   private String[] T01H610_A11697PlaLinCod ;
   private String[] T01H64_A11697PlaLinCod ;
   private String[] T01H64_A11690PlaLinDsc ;
   private String[] T01H64_A11691PlaLinHDR ;
   private String[] T01H64_A11692PlaLinFas ;
   private String[] T01H64_A396EmprCod ;
   private String[] T01H614_A396EmprCod ;
   private String[] T01H614_A11697PlaLinCod ;
   private String[] T01H615_A396EmprCod ;
   private String[] T01H615_A11697PlaLinCod ;
   private short[] T01H615_A11698PlaBalLin ;
   private String[] T01H615_A11693PlaBalDsc ;
   private String[] T01H615_A11694PlaBalHDR ;
   private String[] T01H615_A11695PlaBalFas ;
   private int[] T01H615_A11696PlaBalMax ;
   private String[] T01H616_A396EmprCod ;
   private String[] T01H616_A11697PlaLinCod ;
   private short[] T01H616_A11698PlaBalLin ;
   private String[] T01H63_A396EmprCod ;
   private String[] T01H63_A11697PlaLinCod ;
   private short[] T01H63_A11698PlaBalLin ;
   private String[] T01H63_A11693PlaBalDsc ;
   private String[] T01H63_A11694PlaBalHDR ;
   private String[] T01H63_A11695PlaBalFas ;
   private int[] T01H63_A11696PlaBalMax ;
   private String[] T01H62_A396EmprCod ;
   private String[] T01H62_A11697PlaLinCod ;
   private short[] T01H62_A11698PlaBalLin ;
   private String[] T01H62_A11693PlaBalDsc ;
   private String[] T01H62_A11694PlaBalHDR ;
   private String[] T01H62_A11695PlaBalFas ;
   private int[] T01H62_A11696PlaBalMax ;
   private String[] T01H620_A396EmprCod ;
   private String[] T01H620_A11697PlaLinCod ;
   private short[] T01H620_A11698PlaBalLin ;
   private String[] T01H621_A407EmprNom ;
   private boolean[] T01H621_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplabal__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplabal__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplabal__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplabal__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplabal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01H62", "SELECT EmprCod, PlaLinCod, PlaBalLin, PlaBalDsc, PlaBalHDR, PlaBalFas, PlaBalMax FROM TXPPlaBal WHERE EmprCod = ? AND PlaLinCod = ? AND PlaBalLin = ?  FOR UPDATE OF PlaBalDsc, PlaBalHDR, PlaBalFas, PlaBalMax NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H63", "SELECT EmprCod, PlaLinCod, PlaBalLin, PlaBalDsc, PlaBalHDR, PlaBalFas, PlaBalMax FROM TXPPlaBal WHERE EmprCod = ? AND PlaLinCod = ? AND PlaBalLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H64", "SELECT PlaLinCod, PlaLinDsc, PlaLinHDR, PlaLinFas, EmprCod FROM TXPPlaLin WHERE EmprCod = ? AND PlaLinCod = ?  FOR UPDATE OF PlaLinDsc, PlaLinHDR, PlaLinFas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H65", "SELECT PlaLinCod, PlaLinDsc, PlaLinHDR, PlaLinFas, EmprCod FROM TXPPlaLin WHERE EmprCod = ? AND PlaLinCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H66", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H67", "SELECT /*+ FIRST_ROWS(100) */ TM1.PlaLinCod, T2.EmprNom, TM1.PlaLinDsc, TM1.PlaLinHDR, TM1.PlaLinFas, TM1.EmprCod FROM (TXPPlaLin TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PlaLinCod = ? ORDER BY TM1.EmprCod, TM1.PlaLinCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H68", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PlaLinCod FROM TXPPlaLin WHERE EmprCod = ? AND PlaLinCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H69", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PlaLinCod FROM TXPPlaLin WHERE ( PlaLinCod > ?) and EmprCod = ? ORDER BY EmprCod, PlaLinCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H610", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PlaLinCod FROM TXPPlaLin WHERE ( PlaLinCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, PlaLinCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01H611", "INSERT INTO TXPPlaLin(PlaLinCod, PlaLinDsc, PlaLinHDR, PlaLinFas, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPlaLin")
         ,new UpdateCursor("T01H612", "UPDATE TXPPlaLin SET PlaLinDsc=?, PlaLinHDR=?, PlaLinFas=?  WHERE EmprCod = ? AND PlaLinCod = ?", GX_NOMASK, "TXPPlaLin")
         ,new UpdateCursor("T01H613", "DELETE FROM TXPPlaLin  WHERE EmprCod = ? AND PlaLinCod = ?", GX_NOMASK, "TXPPlaLin")
         ,new ForEachCursor("T01H614", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PlaLinCod FROM TXPPlaLin WHERE EmprCod = ? ORDER BY EmprCod, PlaLinCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H615", "SELECT EmprCod, PlaLinCod, PlaBalLin, PlaBalDsc, PlaBalHDR, PlaBalFas, PlaBalMax FROM TXPPlaBal WHERE EmprCod = ? and PlaLinCod = ? and PlaBalLin = ? ORDER BY EmprCod, PlaLinCod, PlaBalLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H616", "SELECT EmprCod, PlaLinCod, PlaBalLin FROM TXPPlaBal WHERE EmprCod = ? AND PlaLinCod = ? AND PlaBalLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01H617", "INSERT INTO TXPPlaBal(EmprCod, PlaLinCod, PlaBalLin, PlaBalDsc, PlaBalHDR, PlaBalFas, PlaBalMax) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPlaBal")
         ,new UpdateCursor("T01H618", "UPDATE TXPPlaBal SET PlaBalDsc=?, PlaBalHDR=?, PlaBalFas=?, PlaBalMax=?  WHERE EmprCod = ? AND PlaLinCod = ? AND PlaBalLin = ?", GX_NOMASK, "TXPPlaBal")
         ,new UpdateCursor("T01H619", "DELETE FROM TXPPlaBal  WHERE EmprCod = ? AND PlaLinCod = ? AND PlaBalLin = ?", GX_NOMASK, "TXPPlaBal")
         ,new ForEachCursor("T01H620", "SELECT EmprCod, PlaLinCod, PlaBalLin FROM TXPPlaBal WHERE EmprCod = ? and PlaLinCod = ? ORDER BY EmprCod, PlaLinCod, PlaBalLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H621", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setVarchar(2, (String)parms[1], 60, false);
               stmt.setVarchar(3, (String)parms[2], 2000, false);
               stmt.setVarchar(4, (String)parms[3], 2000, false);
               stmt.setString(5, (String)parms[4], 3);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 60, false);
               stmt.setVarchar(2, (String)parms[1], 2000, false);
               stmt.setVarchar(3, (String)parms[2], 2000, false);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 60, false);
               stmt.setVarchar(5, (String)parms[4], 2000, false);
               stmt.setVarchar(6, (String)parms[5], 2000, false);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60, false);
               stmt.setVarchar(2, (String)parms[1], 2000, false);
               stmt.setVarchar(3, (String)parms[2], 2000, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

