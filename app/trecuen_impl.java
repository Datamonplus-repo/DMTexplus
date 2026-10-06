package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trecuen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"DIFALMPOR") == 0 )
      {
         A809RecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTeo"), ".") ;
         A807RecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRea"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asadifalmpor2A98( A809RecExiTeo, A807RecExiRea) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECUENTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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

   public trecuen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trecuen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trecuen_impl.class ));
   }

   public trecuen_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRECUEN.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECUEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECUEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECUEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECUEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECUEN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount98 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_98 = (short)(1) ;
            scanStart2A98( ) ;
            while ( RcdFound98 != 0 )
            {
               init_level_properties98( ) ;
               getByPrimaryKey2A98( ) ;
               addRow2A98( ) ;
               scanNext2A98( ) ;
            }
            scanEnd2A98( ) ;
            nBlankRcdCount98 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal2A98( ) ;
         standaloneModal2A98( ) ;
         sMode98 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow2A98( ) ;
            edtavnRcdDeleted_98_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_98_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_98_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_98_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFEC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecExiTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXITEO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExiTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecExiRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXIREA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExiRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRea_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecExiTcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXITCC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecExiRcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXIRCC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExiRcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRcc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecPreRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPREREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPreRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecExiTAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXITAC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExiTAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTAc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecExiRAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXIRAC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExiRAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRAc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecUbic_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECUBIC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecUbic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUbic_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecMemCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMEMCANT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecMemCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMemCant_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLot_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRecEstInv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTINV_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecEstInv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstInv_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRechora_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECHORA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRechora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRechora_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_98 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal2A98( ) ;
            }
            sendRow2A98( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount98 = (short)(5) ;
         nRcdExists_98 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart2A98( ) ;
            while ( RcdFound98 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3598( ) ;
               init_level_properties98( ) ;
               standaloneNotModal2A98( ) ;
               getByPrimaryKey2A98( ) ;
               standaloneModal2A98( ) ;
               addRow2A98( ) ;
               scanNext2A98( ) ;
            }
            scanEnd2A98( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode98 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_3598( ) ;
      initAll2A98( ) ;
      init_level_properties98( ) ;
      nRcdExists_98 = (short)(0) ;
      nIsMod_98 = (short)(0) ;
      nRcdDeleted_98 = (short)(0) ;
      nBlankRcdCount98 = (short)(nBlankRcdUsr98+nBlankRcdCount98) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount98 > 0 )
      {
         standaloneNotModal2A98( ) ;
         standaloneModal2A98( ) ;
         addRow2A98( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRecFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount98 = (short)(nBlankRcdCount98-1) ;
      }
      Gx_mode = sMode98 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECUEN.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRECUEN.htm");
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
      e112A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14377DifAlmPor = localUtil.ctond( httpContext.cgiGet( "DIFALMPOR")) ;
            A14034DifAlmacen = localUtil.ctond( httpContext.cgiGet( "DIFALMACEN")) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
                        e112A2 ();
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
            initAll2A29( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_98_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_98_Enabled), 5, 0), !bGXsfl_35_Refreshing);
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
      disableAttributes2A29( ) ;
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

   public void confirm_2A0( )
   {
      beforeValidate2A29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2A29( ) ;
         }
         else
         {
            checkExtendedTable2A29( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors2A29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_2A98( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode29 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues2A0( ) ;
      }
   }

   public void confirm_2A98( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow2A98( ) ;
         if ( ( nRcdExists_98 != 0 ) || ( nIsMod_98 != 0 ) )
         {
            getKey2A98( ) ;
            if ( ( nRcdExists_98 == 0 ) && ( nRcdDeleted_98 == 0 ) )
            {
               if ( RcdFound98 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate2A98( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable2A98( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors2A98( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RECFEC_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRecFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound98 != 0 )
               {
                  if ( nRcdDeleted_98 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey2A98( ) ;
                     load2A98( ) ;
                     beforeValidate2A98( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls2A98( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_98 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate2A98( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable2A98( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors2A98( ) ;
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
                  if ( nRcdDeleted_98 == 0 )
                  {
                     GXCCtl = "RECFEC_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecFec_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_98_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecFec_Internalname, localUtil.format(A810RecFec, "99/99/99")) ;
         httpContext.changePostValue( edtRecExiTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiRea_Internalname, GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiTcc_Internalname, GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiRcc_Internalname, GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiTAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiRAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecUbic_Internalname, GXutil.rtrim( A11195RecUbic)) ;
         httpContext.changePostValue( edtRecMemCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLot_Internalname, GXutil.rtrim( A12285RecLot)) ;
         httpContext.changePostValue( edtRecEstInv_Internalname, GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRechora_Internalname, localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z810RecFec_"+sGXsfl_35_idx, localUtil.dtoc( Z810RecFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z809RecExiTeo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z807RecExiRea_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z808RecExiTcc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z806RecExiRcc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6573RecPreRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8668RecExiTAc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8669RecExiRAc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11195RecUbic_"+sGXsfl_35_idx, GXutil.rtrim( Z11195RecUbic)) ;
         httpContext.changePostValue( "ZT_"+"Z11624RecMemCant_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12285RecLot_"+sGXsfl_35_idx, GXutil.rtrim( Z12285RecLot)) ;
         httpContext.changePostValue( "ZT_"+"Z13416RecEstInv_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13455Rechora_"+sGXsfl_35_idx, localUtil.ttoc( Z13455Rechora, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_98_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_98_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_98_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_98 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_98_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_98_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFEC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXITEO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXIREA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXITCC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXIRCC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPREREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXITAC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXIRAC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECUBIC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUbic_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMEMCANT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMemCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTINV_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstInv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECHORA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRechora_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption2A0( )
   {
   }

   public void e112A2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm2A29( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T002A5_A718PrdNom[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load2A29( )
   {
      /* Using cursor T002A6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A718PrdNom = T002A6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         zm2A29( -3) ;
      }
      pr_default.close(4);
      onLoadActions2A29( ) ;
   }

   public void onLoadActions2A29( )
   {
   }

   public void checkExtendedTable2A29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors2A29( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2A29( )
   {
      /* Using cursor T002A7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002A5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm2A29( 3) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T002A5_A719PrdNum[0] ;
         n719PrdNum = T002A5_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T002A5_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A396EmprCod = T002A5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load2A29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey2A29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey2A29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey2A29( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T002A8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T002A8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002A8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002A8_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T002A8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002A8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002A8_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T002A8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T002A8_A719PrdNum[0] ;
            n719PrdNum = T002A8_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T002A9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T002A9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002A9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002A9_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T002A9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002A9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002A9_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T002A9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T002A9_A719PrdNum[0] ;
            n719PrdNum = T002A9_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2A29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2A29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update2A29( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2A29( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2A29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey2A29( ) ;
      if ( RcdFound29 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = Z719PrdNum ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trecuen");
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_2A0( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2A29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2A29( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      scanStart2A29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext2A29( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2A29( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency2A29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002A4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z718PrdNom, T002A4_A718PrdNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T002A4_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T002A4_A718PrdNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2A29( )
   {
      beforeValidate2A29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2A29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2A29( 0) ;
         checkOptimisticConcurrency2A29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2A29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2A29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002A10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel2A29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption2A0( ) ;
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
            load2A29( ) ;
         }
         endLevel2A29( ) ;
      }
      closeExtendedTableCursors2A29( ) ;
   }

   public void update2A29( )
   {
      beforeValidate2A29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2A29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2A29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2A29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2A29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002A11 */
                  pr_default.execute(9, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2A29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel2A29( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption2A0( ) ;
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
         endLevel2A29( ) ;
      }
      closeExtendedTableCursors2A29( ) ;
   }

   public void deferredUpdate2A29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2A29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2A29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2A29( ) ;
         afterConfirm2A29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2A29( ) ;
            if ( AnyError == 0 )
            {
               scanStart2A98( ) ;
               while ( RcdFound98 != 0 )
               {
                  getByPrimaryKey2A98( ) ;
                  delete2A98( ) ;
                  scanNext2A98( ) ;
               }
               scanEnd2A98( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002A12 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound29 == 0 )
                        {
                           initAll2A29( ) ;
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
                        resetCaption2A0( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2A29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2A29( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T002A13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T002A14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T002A15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T002A16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T002A17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T002A18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002A19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002A20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T002A21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T002A22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T002A23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T002A24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T002A25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T002A26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T002A27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T002A28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T002A29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T002A30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T002A31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T002A32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T002A33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T002A34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T002A35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T002A36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T002A37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T002A38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T002A39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T002A40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T002A41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T002A42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T002A43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T002A44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T002A45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T002A46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T002A47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T002A48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T002A49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T002A50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T002A51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T002A52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T002A53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T002A54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T002A55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T002A56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T002A57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T002A58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T002A59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T002A60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T002A61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T002A62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T002A63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T002A64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T002A65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T002A66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T002A67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T002A68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T002A69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T002A70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T002A71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T002A72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T002A73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T002A74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T002A75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T002A76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T002A77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T002A78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T002A79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T002A80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T002A81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T002A82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T002A83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T002A84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T002A85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
      }
   }

   public void processNestedLevel2A98( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow2A98( ) ;
         if ( ( nRcdExists_98 != 0 ) || ( nIsMod_98 != 0 ) )
         {
            standaloneNotModal2A98( ) ;
            getKey2A98( ) ;
            if ( ( nRcdExists_98 == 0 ) && ( nRcdDeleted_98 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert2A98( ) ;
            }
            else
            {
               if ( RcdFound98 != 0 )
               {
                  if ( ( nRcdDeleted_98 != 0 ) && ( nRcdExists_98 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete2A98( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_98 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update2A98( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_98 == 0 )
                  {
                     GXCCtl = "RECFEC_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecFec_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_98_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecFec_Internalname, localUtil.format(A810RecFec, "99/99/99")) ;
         httpContext.changePostValue( edtRecExiTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiRea_Internalname, GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiTcc_Internalname, GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiRcc_Internalname, GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPreRec_Internalname, GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiTAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExiRAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecUbic_Internalname, GXutil.rtrim( A11195RecUbic)) ;
         httpContext.changePostValue( edtRecMemCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLot_Internalname, GXutil.rtrim( A12285RecLot)) ;
         httpContext.changePostValue( edtRecEstInv_Internalname, GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRechora_Internalname, localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z810RecFec_"+sGXsfl_35_idx, localUtil.dtoc( Z810RecFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z809RecExiTeo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z807RecExiRea_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z808RecExiTcc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z806RecExiRcc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6573RecPreRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8668RecExiTAc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8669RecExiRAc_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11195RecUbic_"+sGXsfl_35_idx, GXutil.rtrim( Z11195RecUbic)) ;
         httpContext.changePostValue( "ZT_"+"Z11624RecMemCant_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12285RecLot_"+sGXsfl_35_idx, GXutil.rtrim( Z12285RecLot)) ;
         httpContext.changePostValue( "ZT_"+"Z13416RecEstInv_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13455Rechora_"+sGXsfl_35_idx, localUtil.ttoc( Z13455Rechora, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_98_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_98_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_98_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_98 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_98_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_98_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFEC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXITEO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXIREA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXITCC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXIRCC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPREREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXITAC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXIRAC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECUBIC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUbic_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMEMCANT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMemCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECESTINV_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstInv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECHORA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRechora_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll2A98( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_98 = (short)(0) ;
      nIsMod_98 = (short)(0) ;
      nRcdDeleted_98 = (short)(0) ;
   }

   public void processLevel2A29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel2A98( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel2A29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2A29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trecuen");
         if ( AnyError == 0 )
         {
            confirmValues2A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trecuen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2A29( )
   {
      /* Using cursor T002A86 */
      pr_default.execute(84);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T002A86_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T002A86_A719PrdNum[0] ;
         n719PrdNum = T002A86_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2A29( )
   {
      /* Scan next routine */
      pr_default.readNext(84);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T002A86_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T002A86_A719PrdNum[0] ;
         n719PrdNum = T002A86_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd2A29( )
   {
      pr_default.close(84);
   }

   public void afterConfirm2A29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2A29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2A29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2A29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2A29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2A29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2A29( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
   }

   public void zm2A98( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z809RecExiTeo = T002A3_A809RecExiTeo[0] ;
            Z807RecExiRea = T002A3_A807RecExiRea[0] ;
            Z808RecExiTcc = T002A3_A808RecExiTcc[0] ;
            Z806RecExiRcc = T002A3_A806RecExiRcc[0] ;
            Z6573RecPreRec = T002A3_A6573RecPreRec[0] ;
            Z8668RecExiTAc = T002A3_A8668RecExiTAc[0] ;
            Z8669RecExiRAc = T002A3_A8669RecExiRAc[0] ;
            Z11195RecUbic = T002A3_A11195RecUbic[0] ;
            Z11624RecMemCant = T002A3_A11624RecMemCant[0] ;
            Z12285RecLot = T002A3_A12285RecLot[0] ;
            Z13416RecEstInv = T002A3_A13416RecEstInv[0] ;
            Z13455Rechora = T002A3_A13455Rechora[0] ;
         }
         else
         {
            Z809RecExiTeo = A809RecExiTeo ;
            Z807RecExiRea = A807RecExiRea ;
            Z808RecExiTcc = A808RecExiTcc ;
            Z806RecExiRcc = A806RecExiRcc ;
            Z6573RecPreRec = A6573RecPreRec ;
            Z8668RecExiTAc = A8668RecExiTAc ;
            Z8669RecExiRAc = A8669RecExiRAc ;
            Z11195RecUbic = A11195RecUbic ;
            Z11624RecMemCant = A11624RecMemCant ;
            Z12285RecLot = A12285RecLot ;
            Z13416RecEstInv = A13416RecEstInv ;
            Z13455Rechora = A13455Rechora ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z719PrdNum = A719PrdNum ;
         Z810RecFec = A810RecFec ;
         Z809RecExiTeo = A809RecExiTeo ;
         Z807RecExiRea = A807RecExiRea ;
         Z808RecExiTcc = A808RecExiTcc ;
         Z806RecExiRcc = A806RecExiRcc ;
         Z6573RecPreRec = A6573RecPreRec ;
         Z8668RecExiTAc = A8668RecExiTAc ;
         Z8669RecExiRAc = A8669RecExiRAc ;
         Z11195RecUbic = A11195RecUbic ;
         Z11624RecMemCant = A11624RecMemCant ;
         Z12285RecLot = A12285RecLot ;
         Z13416RecEstInv = A13416RecEstInv ;
         Z13455Rechora = A13455Rechora ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal2A98( )
   {
   }

   public void standaloneModal2A98( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRecFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtRecFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load2A98( )
   {
      /* Using cursor T002A87 */
      pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A809RecExiTeo = T002A87_A809RecExiTeo[0] ;
         A807RecExiRea = T002A87_A807RecExiRea[0] ;
         A808RecExiTcc = T002A87_A808RecExiTcc[0] ;
         A806RecExiRcc = T002A87_A806RecExiRcc[0] ;
         A6573RecPreRec = T002A87_A6573RecPreRec[0] ;
         A8668RecExiTAc = T002A87_A8668RecExiTAc[0] ;
         A8669RecExiRAc = T002A87_A8669RecExiRAc[0] ;
         A11195RecUbic = T002A87_A11195RecUbic[0] ;
         A11624RecMemCant = T002A87_A11624RecMemCant[0] ;
         A12285RecLot = T002A87_A12285RecLot[0] ;
         A13416RecEstInv = T002A87_A13416RecEstInv[0] ;
         A13455Rechora = T002A87_A13455Rechora[0] ;
         zm2A98( -4) ;
      }
      pr_default.close(85);
      onLoadActions2A98( ) ;
   }

   public void onLoadActions2A98( )
   {
      GXt_decimal1 = A14377DifAlmPor ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
      trecuen_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A14377DifAlmPor = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14377DifAlmPor", GXutil.ltrimstr( A14377DifAlmPor, 7, 2));
      A14034DifAlmacen = (A809RecExiTeo.subtract(A807RecExiRea)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14034DifAlmacen", GXutil.ltrimstr( A14034DifAlmacen, 12, 4));
   }

   public void checkExtendedTable2A98( )
   {
      nIsDirty_98 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal2A98( ) ;
      nIsDirty_98 = (short)(1) ;
      GXt_decimal1 = A14377DifAlmPor ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
      trecuen_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A14377DifAlmPor = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14377DifAlmPor", GXutil.ltrimstr( A14377DifAlmPor, 7, 2));
      nIsDirty_98 = (short)(1) ;
      A14034DifAlmacen = (A809RecExiTeo.subtract(A807RecExiRea)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14034DifAlmacen", GXutil.ltrimstr( A14034DifAlmacen, 12, 4));
   }

   public void closeExtendedTableCursors2A98( )
   {
   }

   public void enableDisable2A98( )
   {
   }

   public void getKey2A98( )
   {
      /* Using cursor T002A88 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound98 = (short)(1) ;
      }
      else
      {
         RcdFound98 = (short)(0) ;
      }
      pr_default.close(86);
   }

   public void getByPrimaryKey2A98( )
   {
      /* Using cursor T002A3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2A98( 4) ;
         RcdFound98 = (short)(1) ;
         initializeNonKey2A98( ) ;
         A810RecFec = T002A3_A810RecFec[0] ;
         A809RecExiTeo = T002A3_A809RecExiTeo[0] ;
         A807RecExiRea = T002A3_A807RecExiRea[0] ;
         A808RecExiTcc = T002A3_A808RecExiTcc[0] ;
         A806RecExiRcc = T002A3_A806RecExiRcc[0] ;
         A6573RecPreRec = T002A3_A6573RecPreRec[0] ;
         A8668RecExiTAc = T002A3_A8668RecExiTAc[0] ;
         A8669RecExiRAc = T002A3_A8669RecExiRAc[0] ;
         A11195RecUbic = T002A3_A11195RecUbic[0] ;
         A11624RecMemCant = T002A3_A11624RecMemCant[0] ;
         A12285RecLot = T002A3_A12285RecLot[0] ;
         A13416RecEstInv = T002A3_A13416RecEstInv[0] ;
         A13455Rechora = T002A3_A13455Rechora[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z810RecFec = A810RecFec ;
         sMode98 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2A98( ) ;
         load2A98( ) ;
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound98 = (short)(0) ;
         initializeNonKey2A98( ) ;
         sMode98 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2A98( ) ;
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes2A98( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency2A98( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002A2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECUEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z809RecExiTeo, T002A2_A809RecExiTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z807RecExiRea, T002A2_A807RecExiRea[0]) != 0 ) || ( DecimalUtil.compareTo(Z808RecExiTcc, T002A2_A808RecExiTcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z806RecExiRcc, T002A2_A806RecExiRcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z6573RecPreRec, T002A2_A6573RecPreRec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8668RecExiTAc, T002A2_A8668RecExiTAc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8669RecExiRAc, T002A2_A8669RecExiRAc[0]) != 0 ) || ( GXutil.strcmp(Z11195RecUbic, T002A2_A11195RecUbic[0]) != 0 ) || ( Z11624RecMemCant != T002A2_A11624RecMemCant[0] ) || ( GXutil.strcmp(Z12285RecLot, T002A2_A12285RecLot[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13416RecEstInv != T002A2_A13416RecEstInv[0] ) || !( GXutil.dateCompare(Z13455Rechora, T002A2_A13455Rechora[0]) ) )
         {
            if ( DecimalUtil.compareTo(Z809RecExiTeo, T002A2_A809RecExiTeo[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecExiTeo");
               GXutil.writeLogRaw("Old: ",Z809RecExiTeo);
               GXutil.writeLogRaw("Current: ",T002A2_A809RecExiTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z807RecExiRea, T002A2_A807RecExiRea[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecExiRea");
               GXutil.writeLogRaw("Old: ",Z807RecExiRea);
               GXutil.writeLogRaw("Current: ",T002A2_A807RecExiRea[0]);
            }
            if ( DecimalUtil.compareTo(Z808RecExiTcc, T002A2_A808RecExiTcc[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecExiTcc");
               GXutil.writeLogRaw("Old: ",Z808RecExiTcc);
               GXutil.writeLogRaw("Current: ",T002A2_A808RecExiTcc[0]);
            }
            if ( DecimalUtil.compareTo(Z806RecExiRcc, T002A2_A806RecExiRcc[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecExiRcc");
               GXutil.writeLogRaw("Old: ",Z806RecExiRcc);
               GXutil.writeLogRaw("Current: ",T002A2_A806RecExiRcc[0]);
            }
            if ( DecimalUtil.compareTo(Z6573RecPreRec, T002A2_A6573RecPreRec[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecPreRec");
               GXutil.writeLogRaw("Old: ",Z6573RecPreRec);
               GXutil.writeLogRaw("Current: ",T002A2_A6573RecPreRec[0]);
            }
            if ( DecimalUtil.compareTo(Z8668RecExiTAc, T002A2_A8668RecExiTAc[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecExiTAc");
               GXutil.writeLogRaw("Old: ",Z8668RecExiTAc);
               GXutil.writeLogRaw("Current: ",T002A2_A8668RecExiTAc[0]);
            }
            if ( DecimalUtil.compareTo(Z8669RecExiRAc, T002A2_A8669RecExiRAc[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecExiRAc");
               GXutil.writeLogRaw("Old: ",Z8669RecExiRAc);
               GXutil.writeLogRaw("Current: ",T002A2_A8669RecExiRAc[0]);
            }
            if ( GXutil.strcmp(Z11195RecUbic, T002A2_A11195RecUbic[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecUbic");
               GXutil.writeLogRaw("Old: ",Z11195RecUbic);
               GXutil.writeLogRaw("Current: ",T002A2_A11195RecUbic[0]);
            }
            if ( Z11624RecMemCant != T002A2_A11624RecMemCant[0] )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecMemCant");
               GXutil.writeLogRaw("Old: ",Z11624RecMemCant);
               GXutil.writeLogRaw("Current: ",T002A2_A11624RecMemCant[0]);
            }
            if ( GXutil.strcmp(Z12285RecLot, T002A2_A12285RecLot[0]) != 0 )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecLot");
               GXutil.writeLogRaw("Old: ",Z12285RecLot);
               GXutil.writeLogRaw("Current: ",T002A2_A12285RecLot[0]);
            }
            if ( Z13416RecEstInv != T002A2_A13416RecEstInv[0] )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"RecEstInv");
               GXutil.writeLogRaw("Old: ",Z13416RecEstInv);
               GXutil.writeLogRaw("Current: ",T002A2_A13416RecEstInv[0]);
            }
            if ( !( GXutil.dateCompare(Z13455Rechora, T002A2_A13455Rechora[0]) ) )
            {
               GXutil.writeLogln("trecuen:[seudo value changed for attri]"+"Rechora");
               GXutil.writeLogRaw("Old: ",Z13455Rechora);
               GXutil.writeLogRaw("Current: ",T002A2_A13455Rechora[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECUEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2A98( )
   {
      beforeValidate2A98( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2A98( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2A98( 0) ;
         checkOptimisticConcurrency2A98( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2A98( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2A98( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002A89 */
                  pr_default.execute(87, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec, A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, A6573RecPreRec, A8668RecExiTAc, A8669RecExiRAc, A11195RecUbic, Byte.valueOf(A11624RecMemCant), A12285RecLot, Byte.valueOf(A13416RecEstInv), A13455Rechora, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                  if ( (pr_default.getStatus(87) == 1) )
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
            load2A98( ) ;
         }
         endLevel2A98( ) ;
      }
      closeExtendedTableCursors2A98( ) ;
   }

   public void update2A98( )
   {
      beforeValidate2A98( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2A98( ) ;
      }
      if ( ( nIsMod_98 != 0 ) || ( nIsDirty_98 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency2A98( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm2A98( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate2A98( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T002A90 */
                     pr_default.execute(88, new Object[] {A809RecExiTeo, A807RecExiRea, A808RecExiTcc, A806RecExiRcc, A6573RecPreRec, A8668RecExiTAc, A8669RecExiRAc, A11195RecUbic, Byte.valueOf(A11624RecMemCant), A12285RecLot, Byte.valueOf(A13416RecEstInv), A13455Rechora, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                     if ( (pr_default.getStatus(88) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECUEN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate2A98( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey2A98( ) ;
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
            endLevel2A98( ) ;
         }
      }
      closeExtendedTableCursors2A98( ) ;
   }

   public void deferredUpdate2A98( )
   {
   }

   public void delete2A98( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2A98( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2A98( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2A98( ) ;
         afterConfirm2A98( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2A98( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002A91 */
               pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
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
      sMode98 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2A98( ) ;
      Gx_mode = sMode98 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2A98( )
   {
      standaloneModal2A98( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_decimal1 = A14377DifAlmPor ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
         trecuen_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
         A14377DifAlmPor = GXt_decimal1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14377DifAlmPor", GXutil.ltrimstr( A14377DifAlmPor, 7, 2));
         A14034DifAlmacen = (A809RecExiTeo.subtract(A807RecExiRea)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14034DifAlmacen", GXutil.ltrimstr( A14034DifAlmacen, 12, 4));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002A92 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A810RecFec});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
      }
   }

   public void endLevel2A98( )
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

   public void scanStart2A98( )
   {
      /* Scan By routine */
      /* Using cursor T002A93 */
      pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound98 = (short)(0) ;
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A810RecFec = T002A93_A810RecFec[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2A98( )
   {
      /* Scan next routine */
      pr_default.readNext(91);
      RcdFound98 = (short)(0) ;
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A810RecFec = T002A93_A810RecFec[0] ;
      }
   }

   public void scanEnd2A98( )
   {
      pr_default.close(91);
   }

   public void afterConfirm2A98( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2A98( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2A98( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2A98( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2A98( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2A98( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2A98( )
   {
      edtRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecExiTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecExiRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRea_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecExiTcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecExiRcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRcc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecPreRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPreRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPreRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecExiTAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTAc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecExiRAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRAc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecUbic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUbic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUbic_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecMemCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMemCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMemCant_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLot_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRecEstInv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecEstInv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecEstInv_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRechora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRechora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRechora_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes2A98( )
   {
   }

   public void send_integrity_lvl_hashes2A29( )
   {
   }

   public void subsflControlProps_3598( )
   {
      edtavnRcdDeleted_98_Internalname = "vNRCDDELETED_98_"+sGXsfl_35_idx ;
      edtRecFec_Internalname = "RECFEC_"+sGXsfl_35_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_35_idx ;
      edtRecExiRea_Internalname = "RECEXIREA_"+sGXsfl_35_idx ;
      edtRecExiTcc_Internalname = "RECEXITCC_"+sGXsfl_35_idx ;
      edtRecExiRcc_Internalname = "RECEXIRCC_"+sGXsfl_35_idx ;
      edtRecPreRec_Internalname = "RECPREREC_"+sGXsfl_35_idx ;
      edtRecExiTAc_Internalname = "RECEXITAC_"+sGXsfl_35_idx ;
      edtRecExiRAc_Internalname = "RECEXIRAC_"+sGXsfl_35_idx ;
      edtRecUbic_Internalname = "RECUBIC_"+sGXsfl_35_idx ;
      edtRecMemCant_Internalname = "RECMEMCANT_"+sGXsfl_35_idx ;
      edtRecLot_Internalname = "RECLOT_"+sGXsfl_35_idx ;
      edtRecEstInv_Internalname = "RECESTINV_"+sGXsfl_35_idx ;
      edtRechora_Internalname = "RECHORA_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_3598( )
   {
      edtavnRcdDeleted_98_Internalname = "vNRCDDELETED_98_"+sGXsfl_35_fel_idx ;
      edtRecFec_Internalname = "RECFEC_"+sGXsfl_35_fel_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_35_fel_idx ;
      edtRecExiRea_Internalname = "RECEXIREA_"+sGXsfl_35_fel_idx ;
      edtRecExiTcc_Internalname = "RECEXITCC_"+sGXsfl_35_fel_idx ;
      edtRecExiRcc_Internalname = "RECEXIRCC_"+sGXsfl_35_fel_idx ;
      edtRecPreRec_Internalname = "RECPREREC_"+sGXsfl_35_fel_idx ;
      edtRecExiTAc_Internalname = "RECEXITAC_"+sGXsfl_35_fel_idx ;
      edtRecExiRAc_Internalname = "RECEXIRAC_"+sGXsfl_35_fel_idx ;
      edtRecUbic_Internalname = "RECUBIC_"+sGXsfl_35_fel_idx ;
      edtRecMemCant_Internalname = "RECMEMCANT_"+sGXsfl_35_fel_idx ;
      edtRecLot_Internalname = "RECLOT_"+sGXsfl_35_fel_idx ;
      edtRecEstInv_Internalname = "RECESTINV_"+sGXsfl_35_fel_idx ;
      edtRechora_Internalname = "RECHORA_"+sGXsfl_35_fel_idx ;
   }

   public void addRow2A98( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3598( ) ;
      sendRow2A98( ) ;
   }

   public void sendRow2A98( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_98_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_98_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_98), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_98), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_98_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_98_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFec_Internalname,localUtil.format(A810RecFec, "99/99/99"),localUtil.format( A810RecFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecFec_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExiTeo_Enabled!=0) ? localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999") : localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExiTeo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiRea_Internalname,GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExiRea_Enabled!=0) ? localUtil.format( A807RecExiRea, "ZZZZZZ9.9999") : localUtil.format( A807RecExiRea, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExiRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTcc_Internalname,GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExiTcc_Enabled!=0) ? localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999") : localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExiTcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiRcc_Internalname,GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExiRcc_Enabled!=0) ? localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999") : localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiRcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExiRcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPreRec_Internalname,GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecPreRec_Enabled!=0) ? localUtil.format( A6573RecPreRec, "ZZZZ9.99999") : localUtil.format( A6573RecPreRec, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPreRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecPreRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTAc_Internalname,GXutil.ltrim( localUtil.ntoc( A8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExiTAc_Enabled!=0) ? localUtil.format( A8668RecExiTAc, "ZZZZZZ9.9999") : localUtil.format( A8668RecExiTAc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExiTAc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiRAc_Internalname,GXutil.ltrim( localUtil.ntoc( A8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExiRAc_Enabled!=0) ? localUtil.format( A8669RecExiRAc, "ZZZZZZ9.9999") : localUtil.format( A8669RecExiRAc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiRAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExiRAc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecUbic_Internalname,GXutil.rtrim( A11195RecUbic),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecUbic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecUbic_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMemCant_Internalname,GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecMemCant_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11624RecMemCant), "9") : localUtil.format( DecimalUtil.doubleToDec(A11624RecMemCant), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecMemCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecMemCant_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLot_Internalname,GXutil.rtrim( A12285RecLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecLot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstInv_Internalname,GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecEstInv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13416RecEstInv), "9") : localUtil.format( DecimalUtil.doubleToDec(A13416RecEstInv), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecEstInv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecEstInv_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_98_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRechora_Internalname,localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13455Rechora, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRechora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRechora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes2A98( ) ;
      GXCCtl = "Z810RecFec_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z810RecFec, 0, "/"));
      GXCCtl = "Z809RecExiTeo_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z807RecExiRea_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z808RecExiTcc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z806RecExiRcc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6573RecPreRec_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8668RecExiTAc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8668RecExiTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8669RecExiRAc_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8669RecExiRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11195RecUbic_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11195RecUbic));
      GXCCtl = "Z11624RecMemCant_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12285RecLot_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12285RecLot));
      GXCCtl = "Z13416RecEstInv_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13455Rechora_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z13455Rechora, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_98_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_98_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_98_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_98, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_98_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_98_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFEC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITEO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIREA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITCC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIRCC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPREREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITAC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIRAC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECUBIC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUbic_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMEMCANT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMemCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECESTINV_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstInv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECHORA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRechora_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow2A98( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3598( ) ;
      edtavnRcdDeleted_98_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_98_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFEC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExiTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXITEO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExiRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXIREA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExiTcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXITCC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExiRcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXIRCC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPreRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPREREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExiTAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXITAC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExiRAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXIRAC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecUbic_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECUBIC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecMemCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMEMCANT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecEstInv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECESTINV_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRechora_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECHORA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_98_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_98_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_98");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_98_Internalname ;
         wbErr = true ;
         nRcdDeleted_98 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_98 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_98_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtRecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "RECFEC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecFec_Internalname ;
         wbErr = true ;
         A810RecFec = GXutil.nullDate() ;
      }
      else
      {
         A810RecFec = localUtil.ctod( httpContext.cgiGet( edtRecFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXITEO_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExiTeo_Internalname ;
         wbErr = true ;
         A809RecExiTeo = DecimalUtil.ZERO ;
      }
      else
      {
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXIREA_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExiRea_Internalname ;
         wbErr = true ;
         A807RecExiRea = DecimalUtil.ZERO ;
      }
      else
      {
         A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXITCC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExiTcc_Internalname ;
         wbErr = true ;
         A808RecExiTcc = DecimalUtil.ZERO ;
      }
      else
      {
         A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXIRCC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExiRcc_Internalname ;
         wbErr = true ;
         A806RecExiRcc = DecimalUtil.ZERO ;
      }
      else
      {
         A806RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "RECPREREC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPreRec_Internalname ;
         wbErr = true ;
         A6573RecPreRec = DecimalUtil.ZERO ;
      }
      else
      {
         A6573RecPreRec = localUtil.ctond( httpContext.cgiGet( edtRecPreRec_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTAc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXITAC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExiTAc_Internalname ;
         wbErr = true ;
         A8668RecExiTAc = DecimalUtil.ZERO ;
      }
      else
      {
         A8668RecExiTAc = localUtil.ctond( httpContext.cgiGet( edtRecExiTAc_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRAc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXIRAC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExiRAc_Internalname ;
         wbErr = true ;
         A8669RecExiRAc = DecimalUtil.ZERO ;
      }
      else
      {
         A8669RecExiRAc = localUtil.ctond( httpContext.cgiGet( edtRecExiRAc_Internalname)) ;
      }
      A11195RecUbic = httpContext.cgiGet( edtRecUbic_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "RECMEMCANT_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecMemCant_Internalname ;
         wbErr = true ;
         A11624RecMemCant = (byte)(0) ;
      }
      else
      {
         A11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12285RecLot = httpContext.cgiGet( edtRecLot_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "RECESTINV_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecEstInv_Internalname ;
         wbErr = true ;
         A13416RecEstInv = (byte)(0) ;
      }
      else
      {
         A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtRechora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "RECHORA_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRechora_Internalname ;
         wbErr = true ;
         A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A13455Rechora = localUtil.ctot( httpContext.cgiGet( edtRechora_Internalname)) ;
      }
      GXCCtl = "Z810RecFec_" + sGXsfl_35_idx ;
      Z810RecFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z809RecExiTeo_" + sGXsfl_35_idx ;
      Z809RecExiTeo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z807RecExiRea_" + sGXsfl_35_idx ;
      Z807RecExiRea = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z808RecExiTcc_" + sGXsfl_35_idx ;
      Z808RecExiTcc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z806RecExiRcc_" + sGXsfl_35_idx ;
      Z806RecExiRcc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6573RecPreRec_" + sGXsfl_35_idx ;
      Z6573RecPreRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8668RecExiTAc_" + sGXsfl_35_idx ;
      Z8668RecExiTAc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8669RecExiRAc_" + sGXsfl_35_idx ;
      Z8669RecExiRAc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11195RecUbic_" + sGXsfl_35_idx ;
      Z11195RecUbic = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11624RecMemCant_" + sGXsfl_35_idx ;
      Z11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12285RecLot_" + sGXsfl_35_idx ;
      Z12285RecLot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13416RecEstInv_" + sGXsfl_35_idx ;
      Z13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13455Rechora_" + sGXsfl_35_idx ;
      Z13455Rechora = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_98_" + sGXsfl_35_idx ;
      nRcdDeleted_98 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_98_" + sGXsfl_35_idx ;
      nRcdExists_98 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_98_" + sGXsfl_35_idx ;
      nIsMod_98 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRecFec_Enabled = edtRecFec_Enabled ;
   }

   public void confirmValues2A0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3598( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3598( ) ;
         httpContext.changePostValue( "Z810RecFec_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z810RecFec_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z810RecFec_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z809RecExiTeo_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z809RecExiTeo_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z809RecExiTeo_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z807RecExiRea_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z807RecExiRea_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z807RecExiRea_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z808RecExiTcc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z808RecExiTcc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z808RecExiTcc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z806RecExiRcc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z806RecExiRcc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z806RecExiRcc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z6573RecPreRec_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z6573RecPreRec_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6573RecPreRec_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z8668RecExiTAc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z8668RecExiTAc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8668RecExiTAc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z8669RecExiRAc_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z8669RecExiRAc_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8669RecExiRAc_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z11195RecUbic_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11195RecUbic_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11195RecUbic_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z11624RecMemCant_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11624RecMemCant_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11624RecMemCant_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12285RecLot_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12285RecLot_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12285RecLot_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z13416RecEstInv_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z13416RecEstInv_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13416RecEstInv_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z13455Rechora_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z13455Rechora_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13455Rechora_"+sGXsfl_35_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trecuen", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIFALMPOR", GXutil.ltrim( localUtil.ntoc( A14377DifAlmPor, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIFALMACEN", GXutil.ltrim( localUtil.ntoc( A14034DifAlmacen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.trecuen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TRECUEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECUENTOS", "") ;
   }

   public void initializeNonKey2A29( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      Z718PrdNom = "" ;
   }

   public void initAll2A29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey2A29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey2A98( )
   {
      A14034DifAlmacen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14034DifAlmacen", GXutil.ltrimstr( A14034DifAlmacen, 12, 4));
      A14377DifAlmPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14377DifAlmPor", GXutil.ltrimstr( A14377DifAlmPor, 7, 2));
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A8668RecExiTAc = DecimalUtil.ZERO ;
      A8669RecExiRAc = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A11624RecMemCant = (byte)(0) ;
      A12285RecLot = "" ;
      A13416RecEstInv = (byte)(0) ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      Z809RecExiTeo = DecimalUtil.ZERO ;
      Z807RecExiRea = DecimalUtil.ZERO ;
      Z808RecExiTcc = DecimalUtil.ZERO ;
      Z806RecExiRcc = DecimalUtil.ZERO ;
      Z6573RecPreRec = DecimalUtil.ZERO ;
      Z8668RecExiTAc = DecimalUtil.ZERO ;
      Z8669RecExiRAc = DecimalUtil.ZERO ;
      Z11195RecUbic = "" ;
      Z11624RecMemCant = (byte)(0) ;
      Z12285RecLot = "" ;
      Z13416RecEstInv = (byte)(0) ;
      Z13455Rechora = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll2A98( )
   {
      A810RecFec = GXutil.nullDate() ;
      initializeNonKey2A98( ) ;
   }

   public void standaloneModalInsert2A98( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016235451", true, true);
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
      httpContext.AddJavascriptSource("trecuen.js", "?202661016235451", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties98( )
   {
      edtRecFec_Enabled = defedtRecFec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_98, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_98_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A810RecFec, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8668RecExiTAc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiTAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8669RecExiRAc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExiRAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11195RecUbic));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUbic_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMemCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12285RecLot));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecEstInv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRechora_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdNum_Internalname = "PRDNUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtavnRcdDeleted_98_Internalname = "vNRCDDELETED_98" ;
      edtRecFec_Internalname = "RECFEC" ;
      edtRecExiTeo_Internalname = "RECEXITEO" ;
      edtRecExiRea_Internalname = "RECEXIREA" ;
      edtRecExiTcc_Internalname = "RECEXITCC" ;
      edtRecExiRcc_Internalname = "RECEXIRCC" ;
      edtRecPreRec_Internalname = "RECPREREC" ;
      edtRecExiTAc_Internalname = "RECEXITAC" ;
      edtRecExiRAc_Internalname = "RECEXIRAC" ;
      edtRecUbic_Internalname = "RECUBIC" ;
      edtRecMemCant_Internalname = "RECMEMCANT" ;
      edtRecLot_Internalname = "RECLOT" ;
      edtRecEstInv_Internalname = "RECESTINV" ;
      edtRechora_Internalname = "RECHORA" ;
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
      Form.setCaption( httpContext.getMessage( "RECUENTOS", "") );
      edtRechora_Jsonclick = "" ;
      edtRecEstInv_Jsonclick = "" ;
      edtRecLot_Jsonclick = "" ;
      edtRecMemCant_Jsonclick = "" ;
      edtRecUbic_Jsonclick = "" ;
      edtRecExiRAc_Jsonclick = "" ;
      edtRecExiTAc_Jsonclick = "" ;
      edtRecPreRec_Jsonclick = "" ;
      edtRecExiRcc_Jsonclick = "" ;
      edtRecExiTcc_Jsonclick = "" ;
      edtRecExiRea_Jsonclick = "" ;
      edtRecExiTeo_Jsonclick = "" ;
      edtRecFec_Jsonclick = "" ;
      edtavnRcdDeleted_98_Jsonclick = "" ;
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
      edtRechora_Enabled = 1 ;
      edtRecEstInv_Enabled = 1 ;
      edtRecLot_Enabled = 1 ;
      edtRecMemCant_Enabled = 1 ;
      edtRecUbic_Enabled = 1 ;
      edtRecExiRAc_Enabled = 1 ;
      edtRecExiTAc_Enabled = 1 ;
      edtRecPreRec_Enabled = 1 ;
      edtRecExiRcc_Enabled = 1 ;
      edtRecExiTcc_Enabled = 1 ;
      edtRecExiRea_Enabled = 1 ;
      edtRecExiTeo_Enabled = 1 ;
      edtRecFec_Enabled = 1 ;
      edtavnRcdDeleted_98_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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

   public void gx1asadifalmpor2A98( java.math.BigDecimal A809RecExiTeo ,
                                    java.math.BigDecimal A807RecExiRea )
   {
      GXt_decimal1 = A14377DifAlmPor ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
      trecuen_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A14377DifAlmPor = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14377DifAlmPor", GXutil.ltrimstr( A14377DifAlmPor, 7, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14377DifAlmPor, (byte)(7), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_3598( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal2A98( ) ;
         standaloneModal2A98( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow2A98( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3598( ) ;
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
      GX_FocusControl = edtPrdNom_Internalname ;
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

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Recexirea( )
   {
      GXt_decimal1 = A14377DifAlmPor ;
      GXv_decimal2[0] = GXt_decimal1 ;
      new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal2) ;
      trecuen_impl.this.GXt_decimal1 = GXv_decimal2[0] ;
      A14377DifAlmPor = GXt_decimal1 ;
      A14034DifAlmacen = (A809RecExiTeo.subtract(A807RecExiRea)) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14377DifAlmPor", GXutil.ltrim( localUtil.ntoc( A14377DifAlmPor, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14034DifAlmacen", GXutil.ltrim( localUtil.ntoc( A14034DifAlmacen, (byte)(12), (byte)(4), ".", "")));
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z718PrdNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECFEC","{handler:'valid_Recfec',iparms:[]");
      setEventMetadata("VALID_RECFEC",",oparms:[]}");
      setEventMetadata("VALID_RECEXITEO","{handler:'valid_Recexiteo',iparms:[]");
      setEventMetadata("VALID_RECEXITEO",",oparms:[]}");
      setEventMetadata("VALID_RECEXIREA","{handler:'valid_Recexirea',iparms:[{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999'},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A14377DifAlmPor',fld:'DIFALMPOR',pic:'ZZZ9.99'},{av:'A14034DifAlmacen',fld:'DIFALMACEN',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VALID_RECEXIREA",",oparms:[{av:'A14377DifAlmPor',fld:'DIFALMPOR',pic:'ZZZ9.99'},{av:'A14034DifAlmacen',fld:'DIFALMACEN',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("NULL","{handler:'valid_Rechora',iparms:[]");
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
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z810RecFec = GXutil.nullDate() ;
      Z809RecExiTeo = DecimalUtil.ZERO ;
      Z807RecExiRea = DecimalUtil.ZERO ;
      Z808RecExiTcc = DecimalUtil.ZERO ;
      Z806RecExiRcc = DecimalUtil.ZERO ;
      Z6573RecPreRec = DecimalUtil.ZERO ;
      Z8668RecExiTAc = DecimalUtil.ZERO ;
      Z8669RecExiRAc = DecimalUtil.ZERO ;
      Z11195RecUbic = "" ;
      Z12285RecLot = "" ;
      Z13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
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
      A719PrdNum = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A718PrdNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode98 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A14377DifAlmPor = DecimalUtil.ZERO ;
      A14034DifAlmacen = DecimalUtil.ZERO ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode29 = "" ;
      GXCCtl = "" ;
      A810RecFec = GXutil.nullDate() ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A8668RecExiTAc = DecimalUtil.ZERO ;
      A8669RecExiRAc = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      T002A6_A719PrdNum = new String[] {""} ;
      T002A6_n719PrdNum = new boolean[] {false} ;
      T002A6_A718PrdNom = new String[] {""} ;
      T002A6_A396EmprCod = new String[] {""} ;
      T002A7_A396EmprCod = new String[] {""} ;
      T002A7_A719PrdNum = new String[] {""} ;
      T002A7_n719PrdNum = new boolean[] {false} ;
      T002A5_A719PrdNum = new String[] {""} ;
      T002A5_n719PrdNum = new boolean[] {false} ;
      T002A5_A718PrdNom = new String[] {""} ;
      T002A5_A396EmprCod = new String[] {""} ;
      T002A8_A396EmprCod = new String[] {""} ;
      T002A8_A719PrdNum = new String[] {""} ;
      T002A8_n719PrdNum = new boolean[] {false} ;
      T002A9_A396EmprCod = new String[] {""} ;
      T002A9_A719PrdNum = new String[] {""} ;
      T002A9_n719PrdNum = new boolean[] {false} ;
      T002A4_A719PrdNum = new String[] {""} ;
      T002A4_n719PrdNum = new boolean[] {false} ;
      T002A4_A718PrdNom = new String[] {""} ;
      T002A4_A396EmprCod = new String[] {""} ;
      T002A13_A396EmprCod = new String[] {""} ;
      T002A13_A719PrdNum = new String[] {""} ;
      T002A13_n719PrdNum = new boolean[] {false} ;
      T002A13_A13217NormaID = new String[] {""} ;
      T002A14_A396EmprCod = new String[] {""} ;
      T002A14_A719PrdNum = new String[] {""} ;
      T002A14_n719PrdNum = new boolean[] {false} ;
      T002A14_A13586TheList = new String[] {""} ;
      T002A15_A396EmprCod = new String[] {""} ;
      T002A15_A5532Lb_numero = new int[1] ;
      T002A15_A5555Lb_opcion = new String[] {""} ;
      T002A15_A13460Lb_linCP = new short[1] ;
      T002A15_A13458Lb_TipCP = new String[] {""} ;
      T002A16_A396EmprCod = new String[] {""} ;
      T002A16_A13418AlbProID = new int[1] ;
      T002A16_A13442AlbProLine = new short[1] ;
      T002A17_A396EmprCod = new String[] {""} ;
      T002A17_A13324LDESID = new int[1] ;
      T002A17_A13333LDESNPeque = new String[] {""} ;
      T002A17_A13337LDESComb = new String[] {""} ;
      T002A17_A13339LDESFondo = new String[] {""} ;
      T002A17_A13342LDESLinea = new short[1] ;
      T002A18_A396EmprCod = new String[] {""} ;
      T002A18_A13312Lb_NLab = new int[1] ;
      T002A18_A13305Lb_IDVeces = new short[1] ;
      T002A18_A13306Lb_LinID = new short[1] ;
      T002A19_A396EmprCod = new String[] {""} ;
      T002A19_A12673LavMqId = new int[1] ;
      T002A19_A12692LavMqLnPq = new short[1] ;
      T002A19_A12681LavMqLn = new short[1] ;
      T002A20_A396EmprCod = new String[] {""} ;
      T002A20_A719PrdNum = new String[] {""} ;
      T002A20_n719PrdNum = new boolean[] {false} ;
      T002A20_A9713Tb1_Cod = new short[1] ;
      T002A21_A396EmprCod = new String[] {""} ;
      T002A21_A12236PrdNumD = new String[] {""} ;
      T002A21_A719PrdNum = new String[] {""} ;
      T002A21_n719PrdNum = new boolean[] {false} ;
      T002A22_A396EmprCod = new String[] {""} ;
      T002A22_A12225DocDisID = new long[1] ;
      T002A22_A12226LinDisID = new short[1] ;
      T002A23_A396EmprCod = new String[] {""} ;
      T002A23_A12225DocDisID = new long[1] ;
      T002A24_A396EmprCod = new String[] {""} ;
      T002A24_A12205OrdenCID = new long[1] ;
      T002A24_A12206OrdenCLnId = new short[1] ;
      T002A25_A396EmprCod = new String[] {""} ;
      T002A25_A719PrdNum = new String[] {""} ;
      T002A25_n719PrdNum = new boolean[] {false} ;
      T002A25_A11664LoteID = new String[] {""} ;
      T002A25_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A26_A396EmprCod = new String[] {""} ;
      T002A26_A4850DevComCod = new int[1] ;
      T002A26_A719PrdNum = new String[] {""} ;
      T002A26_n719PrdNum = new boolean[] {false} ;
      T002A27_A396EmprCod = new String[] {""} ;
      T002A27_A252CliCod = new int[1] ;
      T002A27_A494ForSer = new String[] {""} ;
      T002A27_A482ForColNom = new String[] {""} ;
      T002A27_A483ForColNum = new int[1] ;
      T002A27_A831TipColCod = new byte[1] ;
      T002A27_A3571EnsCod = new String[] {""} ;
      T002A27_A3582EnsLin = new short[1] ;
      T002A28_A396EmprCod = new String[] {""} ;
      T002A28_A129BarCod = new int[1] ;
      T002A28_A132BarCodReo = new byte[1] ;
      T002A28_A130BarCodPar = new String[] {""} ;
      T002A28_A4075recestncol = new byte[1] ;
      T002A28_A4076recestnpro = new byte[1] ;
      T002A28_A4108recestlin = new short[1] ;
      T002A29_A396EmprCod = new String[] {""} ;
      T002A29_A4052EstNumFor = new int[1] ;
      T002A29_A4053EstNumCol = new byte[1] ;
      T002A29_A4090EstEspLin = new byte[1] ;
      T002A30_A396EmprCod = new String[] {""} ;
      T002A30_A4052EstNumFor = new int[1] ;
      T002A30_A4053EstNumCol = new byte[1] ;
      T002A30_A4084EstProLin = new byte[1] ;
      T002A31_A396EmprCod = new String[] {""} ;
      T002A31_A11644TransferId = new long[1] ;
      T002A31_A11653TransferLn = new int[1] ;
      T002A32_A396EmprCod = new String[] {""} ;
      T002A32_A11634TaesId = new String[] {""} ;
      T002A32_A11637TaesLn = new short[1] ;
      T002A32_A11641TaesLnP = new short[1] ;
      T002A33_A396EmprCod = new String[] {""} ;
      T002A33_A719PrdNum = new String[] {""} ;
      T002A33_n719PrdNum = new boolean[] {false} ;
      T002A33_A11329H_stklin = new long[1] ;
      T002A34_A396EmprCod = new String[] {""} ;
      T002A34_A11270Pot_num = new int[1] ;
      T002A34_A11271Pot_lin = new short[1] ;
      T002A35_A396EmprCod = new String[] {""} ;
      T002A35_A719PrdNum = new String[] {""} ;
      T002A35_n719PrdNum = new boolean[] {false} ;
      T002A35_A11199PrdNcasC = new String[] {""} ;
      T002A36_A396EmprCod = new String[] {""} ;
      T002A36_A719PrdNum = new String[] {""} ;
      T002A36_n719PrdNum = new boolean[] {false} ;
      T002A36_A11197CFraseR = new String[] {""} ;
      T002A37_A396EmprCod = new String[] {""} ;
      T002A37_A10243Jt_codigo = new short[1] ;
      T002A37_A10246Jt_ord = new short[1] ;
      T002A38_A396EmprCod = new String[] {""} ;
      T002A38_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T002A38_A10238Bny_lin = new short[1] ;
      T002A39_A396EmprCod = new String[] {""} ;
      T002A39_A129BarCod = new int[1] ;
      T002A39_A132BarCodReo = new byte[1] ;
      T002A39_A130BarCodPar = new String[] {""} ;
      T002A39_A758ProCod = new String[] {""} ;
      T002A39_A194BarOrdLin = new short[1] ;
      T002A39_A719PrdNum = new String[] {""} ;
      T002A39_n719PrdNum = new boolean[] {false} ;
      T002A40_A396EmprCod = new String[] {""} ;
      T002A40_A719PrdNum = new String[] {""} ;
      T002A40_n719PrdNum = new boolean[] {false} ;
      T002A40_A9735Cod_Rgo = new String[] {""} ;
      T002A41_A396EmprCod = new String[] {""} ;
      T002A41_A719PrdNum = new String[] {""} ;
      T002A41_n719PrdNum = new boolean[] {false} ;
      T002A41_A9711Ct_codigo = new short[1] ;
      T002A42_A396EmprCod = new String[] {""} ;
      T002A42_A9652OeNum = new long[1] ;
      T002A42_A9653OeHdr = new int[1] ;
      T002A42_A9654OeHdrr = new byte[1] ;
      T002A42_A9655OeHdrp = new String[] {""} ;
      T002A42_A9656OeLinC = new byte[1] ;
      T002A42_A9657OeComb = new String[] {""} ;
      T002A42_A9658Oefondo = new String[] {""} ;
      T002A42_A9659OeMolCil = new byte[1] ;
      T002A42_A9686OePasLin = new short[1] ;
      T002A42_A9694OePasPLi = new short[1] ;
      T002A43_A396EmprCod = new String[] {""} ;
      T002A43_A9652OeNum = new long[1] ;
      T002A43_A9653OeHdr = new int[1] ;
      T002A43_A9654OeHdrr = new byte[1] ;
      T002A43_A9655OeHdrp = new String[] {""} ;
      T002A43_A9656OeLinC = new byte[1] ;
      T002A43_A9657OeComb = new String[] {""} ;
      T002A43_A9658Oefondo = new String[] {""} ;
      T002A43_A9659OeMolCil = new byte[1] ;
      T002A43_A9677OeMolLin = new byte[1] ;
      T002A44_A396EmprCod = new String[] {""} ;
      T002A44_A9578Pas_Num = new int[1] ;
      T002A44_A719PrdNum = new String[] {""} ;
      T002A44_n719PrdNum = new boolean[] {false} ;
      T002A45_A396EmprCod = new String[] {""} ;
      T002A45_A719PrdNum = new String[] {""} ;
      T002A45_n719PrdNum = new boolean[] {false} ;
      T002A45_A8908CC_AlmCod = new byte[1] ;
      T002A46_A396EmprCod = new String[] {""} ;
      T002A46_A719PrdNum = new String[] {""} ;
      T002A46_n719PrdNum = new boolean[] {false} ;
      T002A46_A8661Almc_Ln = new int[1] ;
      T002A47_A396EmprCod = new String[] {""} ;
      T002A47_A719PrdNum = new String[] {""} ;
      T002A47_n719PrdNum = new boolean[] {false} ;
      T002A47_A8648Mat_PrdN = new String[] {""} ;
      T002A48_A396EmprCod = new String[] {""} ;
      T002A48_A8585Pet_cod = new long[1] ;
      T002A48_A719PrdNum = new String[] {""} ;
      T002A48_n719PrdNum = new boolean[] {false} ;
      T002A49_A396EmprCod = new String[] {""} ;
      T002A49_A719PrdNum = new String[] {""} ;
      T002A49_n719PrdNum = new boolean[] {false} ;
      T002A49_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T002A50_A396EmprCod = new String[] {""} ;
      T002A50_A719PrdNum = new String[] {""} ;
      T002A50_n719PrdNum = new boolean[] {false} ;
      T002A50_A8366PrdAnyo = new short[1] ;
      T002A50_A8360PrdProv = new int[1] ;
      T002A51_A396EmprCod = new String[] {""} ;
      T002A51_A252CliCod = new int[1] ;
      T002A51_A494ForSer = new String[] {""} ;
      T002A51_A482ForColNom = new String[] {""} ;
      T002A51_A483ForColNum = new int[1] ;
      T002A51_A831TipColCod = new byte[1] ;
      T002A51_A7797Sim_lin = new short[1] ;
      T002A52_A396EmprCod = new String[] {""} ;
      T002A52_A7163Vir_Codigo = new int[1] ;
      T002A52_A719PrdNum = new String[] {""} ;
      T002A52_n719PrdNum = new boolean[] {false} ;
      T002A53_A396EmprCod = new String[] {""} ;
      T002A53_A6310Lb_TaAuxC = new String[] {""} ;
      T002A53_A6313lb_TaAuxL = new short[1] ;
      T002A53_A6378Lb_TauxLP = new short[1] ;
      T002A54_A396EmprCod = new String[] {""} ;
      T002A54_A6290PreCoNum = new int[1] ;
      T002A54_A719PrdNum = new String[] {""} ;
      T002A54_n719PrdNum = new boolean[] {false} ;
      T002A55_A396EmprCod = new String[] {""} ;
      T002A55_A719PrdNum = new String[] {""} ;
      T002A55_n719PrdNum = new boolean[] {false} ;
      T002A55_A6158PrdPrv = new int[1] ;
      T002A56_A396EmprCod = new String[] {""} ;
      T002A56_A719PrdNum = new String[] {""} ;
      T002A56_n719PrdNum = new boolean[] {false} ;
      T002A56_A5973PrdSusNum = new String[] {""} ;
      T002A57_A396EmprCod = new String[] {""} ;
      T002A57_A5612Lb_CodGru = new String[] {""} ;
      T002A57_A5615Lb_LinGru = new short[1] ;
      T002A58_A396EmprCod = new String[] {""} ;
      T002A58_A5532Lb_numero = new int[1] ;
      T002A58_A5555Lb_opcion = new String[] {""} ;
      T002A58_A5560Lb_LineaPr = new short[1] ;
      T002A59_A396EmprCod = new String[] {""} ;
      T002A59_A5532Lb_numero = new int[1] ;
      T002A59_A5555Lb_opcion = new String[] {""} ;
      T002A59_A5557Lb_LineaC = new short[1] ;
      T002A60_A396EmprCod = new String[] {""} ;
      T002A60_A5145SobCod = new int[1] ;
      T002A60_A719PrdNum = new String[] {""} ;
      T002A60_n719PrdNum = new boolean[] {false} ;
      T002A61_A396EmprCod = new String[] {""} ;
      T002A61_A4744RecPreCod = new int[1] ;
      T002A61_A4762RecPreLin = new short[1] ;
      T002A61_A4763RecPreNli = new short[1] ;
      T002A62_A396EmprCod = new String[] {""} ;
      T002A62_A4492HreBarCod = new int[1] ;
      T002A62_A4493HreBarReo = new byte[1] ;
      T002A62_A4494HreBarPar = new String[] {""} ;
      T002A62_A4495HreNumCie = new byte[1] ;
      T002A62_A4545HreLinMaq = new short[1] ;
      T002A62_A4550HreLinPro = new byte[1] ;
      T002A62_A4557HreRecLin = new short[1] ;
      T002A63_A396EmprCod = new String[] {""} ;
      T002A63_A4492HreBarCod = new int[1] ;
      T002A63_A4493HreBarReo = new byte[1] ;
      T002A63_A4494HreBarPar = new String[] {""} ;
      T002A63_A4495HreNumCie = new byte[1] ;
      T002A63_A4508HreLinMAL = new short[1] ;
      T002A63_A4509HreNumAny = new byte[1] ;
      T002A63_A719PrdNum = new String[] {""} ;
      T002A63_n719PrdNum = new boolean[] {false} ;
      T002A64_A396EmprCod = new String[] {""} ;
      T002A64_A252CliCod = new int[1] ;
      T002A64_A4415EstCol = new String[] {""} ;
      T002A64_A4416EstColLin = new short[1] ;
      T002A65_A396EmprCod = new String[] {""} ;
      T002A65_A129BarCod = new int[1] ;
      T002A65_A132BarCodReo = new byte[1] ;
      T002A65_A130BarCodPar = new String[] {""} ;
      T002A65_A2524DisComLin = new byte[1] ;
      T002A65_A1056DisComCod = new String[] {""} ;
      T002A65_A1032FonCod = new String[] {""} ;
      T002A65_A2124RecMolCod = new byte[1] ;
      T002A65_A2672RecPasLin = new short[1] ;
      T002A65_A2675RecPasPLi = new short[1] ;
      T002A66_A396EmprCod = new String[] {""} ;
      T002A66_A129BarCod = new int[1] ;
      T002A66_A132BarCodReo = new byte[1] ;
      T002A66_A130BarCodPar = new String[] {""} ;
      T002A66_A2524DisComLin = new byte[1] ;
      T002A66_A1056DisComCod = new String[] {""} ;
      T002A66_A1032FonCod = new String[] {""} ;
      T002A66_A2124RecMolCod = new byte[1] ;
      T002A66_A2126RecMolLin = new byte[1] ;
      T002A67_A396EmprCod = new String[] {""} ;
      T002A67_A2107PasCod = new String[] {""} ;
      T002A67_A719PrdNum = new String[] {""} ;
      T002A67_n719PrdNum = new boolean[] {false} ;
      T002A68_A396EmprCod = new String[] {""} ;
      T002A68_A2637HisEstHRu = new int[1] ;
      T002A68_A2636HisEstHRe = new byte[1] ;
      T002A68_A2635HisEstHPa = new String[] {""} ;
      T002A68_A2638HisEstLCo = new byte[1] ;
      T002A68_A2630HisEstCom = new String[] {""} ;
      T002A68_A2634HisEstFon = new String[] {""} ;
      T002A68_A719PrdNum = new String[] {""} ;
      T002A68_n719PrdNum = new boolean[] {false} ;
      T002A69_A396EmprCod = new String[] {""} ;
      T002A69_A252CliCod = new int[1] ;
      T002A69_A2141SerEst = new String[] {""} ;
      T002A69_A1013DibCli = new String[] {""} ;
      T002A69_A1014DibInt = new int[1] ;
      T002A69_A2074ColCom = new String[] {""} ;
      T002A69_A2078ColFon = new String[] {""} ;
      T002A69_A2098MolCod = new byte[1] ;
      T002A69_A2535ForPrdLin = new short[1] ;
      T002A70_A396EmprCod = new String[] {""} ;
      T002A70_A719PrdNum = new String[] {""} ;
      T002A70_n719PrdNum = new boolean[] {false} ;
      T002A70_A3342CCStkLin = new long[1] ;
      T002A71_A396EmprCod = new String[] {""} ;
      T002A71_A252CliCod = new int[1] ;
      T002A71_A2891HMaForSer = new String[] {""} ;
      T002A71_A2892HMaForCNom = new String[] {""} ;
      T002A71_A2893HMaForCNum = new int[1] ;
      T002A71_A2894HMaTipCCod = new byte[1] ;
      T002A71_A2895HMaForNumC = new int[1] ;
      T002A71_A2897HMaColLin = new short[1] ;
      T002A71_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A71_A2907HmaLin = new short[1] ;
      T002A72_A396EmprCod = new String[] {""} ;
      T002A72_A129BarCod = new int[1] ;
      T002A72_A132BarCodReo = new byte[1] ;
      T002A72_A130BarCodPar = new String[] {""} ;
      T002A72_A2808RecLinMAL = new short[1] ;
      T002A72_A1377RecNumAny = new byte[1] ;
      T002A72_A719PrdNum = new String[] {""} ;
      T002A72_n719PrdNum = new boolean[] {false} ;
      T002A73_A396EmprCod = new String[] {""} ;
      T002A73_A129BarCod = new int[1] ;
      T002A73_A132BarCodReo = new byte[1] ;
      T002A73_A130BarCodPar = new String[] {""} ;
      T002A73_A2804RecLinMaq = new short[1] ;
      T002A73_A1273RecLinPro = new byte[1] ;
      T002A73_A811RecLin = new short[1] ;
      T002A74_A396EmprCod = new String[] {""} ;
      T002A74_A129BarCod = new int[1] ;
      T002A74_A132BarCodReo = new byte[1] ;
      T002A74_A130BarCodPar = new String[] {""} ;
      T002A74_A2494BarDosPro = new String[] {""} ;
      T002A74_A719PrdNum = new String[] {""} ;
      T002A74_n719PrdNum = new boolean[] {false} ;
      T002A75_A396EmprCod = new String[] {""} ;
      T002A75_A1314EnsLabCod = new int[1] ;
      T002A75_A1317EnsLabLin = new short[1] ;
      T002A76_A396EmprCod = new String[] {""} ;
      T002A76_A910Workstat = new String[] {""} ;
      T002A76_A887EscMLin = new int[1] ;
      T002A77_A396EmprCod = new String[] {""} ;
      T002A77_A859CumCodCont = new int[1] ;
      T002A77_A719PrdNum = new String[] {""} ;
      T002A77_n719PrdNum = new boolean[] {false} ;
      T002A78_A396EmprCod = new String[] {""} ;
      T002A78_A719PrdNum = new String[] {""} ;
      T002A78_n719PrdNum = new boolean[] {false} ;
      T002A78_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A78_A8908CC_AlmCod = new byte[1] ;
      T002A79_A396EmprCod = new String[] {""} ;
      T002A79_A486ForNumCol = new int[1] ;
      T002A79_A715PrdLin = new short[1] ;
      T002A80_A396EmprCod = new String[] {""} ;
      T002A80_A719PrdNum = new String[] {""} ;
      T002A80_n719PrdNum = new boolean[] {false} ;
      T002A80_A681PrdAny = new short[1] ;
      T002A81_A396EmprCod = new String[] {""} ;
      T002A81_A719PrdNum = new String[] {""} ;
      T002A81_n719PrdNum = new boolean[] {false} ;
      T002A81_A688PrdComCod = new String[] {""} ;
      T002A82_A396EmprCod = new String[] {""} ;
      T002A82_A719PrdNum = new String[] {""} ;
      T002A82_n719PrdNum = new boolean[] {false} ;
      T002A82_A680PrdAltNum = new String[] {""} ;
      T002A83_A396EmprCod = new String[] {""} ;
      T002A83_A658PedCod = new int[1] ;
      T002A83_A719PrdNum = new String[] {""} ;
      T002A83_n719PrdNum = new boolean[] {false} ;
      T002A84_A396EmprCod = new String[] {""} ;
      T002A84_A486ForNumCol = new int[1] ;
      T002A84_A309ColLin = new short[1] ;
      T002A85_A396EmprCod = new String[] {""} ;
      T002A85_A719PrdNum = new String[] {""} ;
      T002A85_n719PrdNum = new boolean[] {false} ;
      T002A85_A647NumCon = new int[1] ;
      T002A86_A396EmprCod = new String[] {""} ;
      T002A86_A719PrdNum = new String[] {""} ;
      T002A86_n719PrdNum = new boolean[] {false} ;
      T002A87_A719PrdNum = new String[] {""} ;
      T002A87_n719PrdNum = new boolean[] {false} ;
      T002A87_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A87_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A87_A11195RecUbic = new String[] {""} ;
      T002A87_A11624RecMemCant = new byte[1] ;
      T002A87_A12285RecLot = new String[] {""} ;
      T002A87_A13416RecEstInv = new byte[1] ;
      T002A87_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      T002A87_A396EmprCod = new String[] {""} ;
      T002A88_A396EmprCod = new String[] {""} ;
      T002A88_A719PrdNum = new String[] {""} ;
      T002A88_n719PrdNum = new boolean[] {false} ;
      T002A88_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A3_A719PrdNum = new String[] {""} ;
      T002A3_n719PrdNum = new boolean[] {false} ;
      T002A3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A3_A11195RecUbic = new String[] {""} ;
      T002A3_A11624RecMemCant = new byte[1] ;
      T002A3_A12285RecLot = new String[] {""} ;
      T002A3_A13416RecEstInv = new byte[1] ;
      T002A3_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      T002A3_A396EmprCod = new String[] {""} ;
      T002A2_A719PrdNum = new String[] {""} ;
      T002A2_n719PrdNum = new boolean[] {false} ;
      T002A2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A8668RecExiTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A8669RecExiRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002A2_A11195RecUbic = new String[] {""} ;
      T002A2_A11624RecMemCant = new byte[1] ;
      T002A2_A12285RecLot = new String[] {""} ;
      T002A2_A13416RecEstInv = new byte[1] ;
      T002A2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      T002A2_A396EmprCod = new String[] {""} ;
      T002A92_A396EmprCod = new String[] {""} ;
      T002A92_A719PrdNum = new String[] {""} ;
      T002A92_n719PrdNum = new boolean[] {false} ;
      T002A92_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T002A92_A8908CC_AlmCod = new byte[1] ;
      T002A93_A396EmprCod = new String[] {""} ;
      T002A93_A719PrdNum = new String[] {""} ;
      T002A93_n719PrdNum = new boolean[] {false} ;
      T002A93_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ718PrdNom = "" ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      Z14377DifAlmPor = DecimalUtil.ZERO ;
      Z14034DifAlmacen = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trecuen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trecuen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trecuen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trecuen__default(),
         new Object[] {
             new Object[] {
            T002A2_A719PrdNum, T002A2_A810RecFec, T002A2_A809RecExiTeo, T002A2_A807RecExiRea, T002A2_A808RecExiTcc, T002A2_A806RecExiRcc, T002A2_A6573RecPreRec, T002A2_A8668RecExiTAc, T002A2_A8669RecExiRAc, T002A2_A11195RecUbic,
            T002A2_A11624RecMemCant, T002A2_A12285RecLot, T002A2_A13416RecEstInv, T002A2_A13455Rechora, T002A2_A396EmprCod
            }
            , new Object[] {
            T002A3_A719PrdNum, T002A3_A810RecFec, T002A3_A809RecExiTeo, T002A3_A807RecExiRea, T002A3_A808RecExiTcc, T002A3_A806RecExiRcc, T002A3_A6573RecPreRec, T002A3_A8668RecExiTAc, T002A3_A8669RecExiRAc, T002A3_A11195RecUbic,
            T002A3_A11624RecMemCant, T002A3_A12285RecLot, T002A3_A13416RecEstInv, T002A3_A13455Rechora, T002A3_A396EmprCod
            }
            , new Object[] {
            T002A4_A719PrdNum, T002A4_A718PrdNom, T002A4_A396EmprCod
            }
            , new Object[] {
            T002A5_A719PrdNum, T002A5_A718PrdNom, T002A5_A396EmprCod
            }
            , new Object[] {
            T002A6_A719PrdNum, T002A6_A718PrdNom, T002A6_A396EmprCod
            }
            , new Object[] {
            T002A7_A396EmprCod, T002A7_A719PrdNum
            }
            , new Object[] {
            T002A8_A396EmprCod, T002A8_A719PrdNum
            }
            , new Object[] {
            T002A9_A396EmprCod, T002A9_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002A13_A396EmprCod, T002A13_A719PrdNum, T002A13_A13217NormaID
            }
            , new Object[] {
            T002A14_A396EmprCod, T002A14_A719PrdNum, T002A14_A13586TheList
            }
            , new Object[] {
            T002A15_A396EmprCod, T002A15_A5532Lb_numero, T002A15_A5555Lb_opcion, T002A15_A13460Lb_linCP, T002A15_A13458Lb_TipCP
            }
            , new Object[] {
            T002A16_A396EmprCod, T002A16_A13418AlbProID, T002A16_A13442AlbProLine
            }
            , new Object[] {
            T002A17_A396EmprCod, T002A17_A13324LDESID, T002A17_A13333LDESNPeque, T002A17_A13337LDESComb, T002A17_A13339LDESFondo, T002A17_A13342LDESLinea
            }
            , new Object[] {
            T002A18_A396EmprCod, T002A18_A13312Lb_NLab, T002A18_A13305Lb_IDVeces, T002A18_A13306Lb_LinID
            }
            , new Object[] {
            T002A19_A396EmprCod, T002A19_A12673LavMqId, T002A19_A12692LavMqLnPq, T002A19_A12681LavMqLn
            }
            , new Object[] {
            T002A20_A396EmprCod, T002A20_A719PrdNum, T002A20_A9713Tb1_Cod
            }
            , new Object[] {
            T002A21_A396EmprCod, T002A21_A12236PrdNumD, T002A21_A719PrdNum
            }
            , new Object[] {
            T002A22_A396EmprCod, T002A22_A12225DocDisID, T002A22_A12226LinDisID
            }
            , new Object[] {
            T002A23_A396EmprCod, T002A23_A12225DocDisID
            }
            , new Object[] {
            T002A24_A396EmprCod, T002A24_A12205OrdenCID, T002A24_A12206OrdenCLnId
            }
            , new Object[] {
            T002A25_A396EmprCod, T002A25_A719PrdNum, T002A25_A11664LoteID, T002A25_A11665LoteFec
            }
            , new Object[] {
            T002A26_A396EmprCod, T002A26_A4850DevComCod, T002A26_A719PrdNum
            }
            , new Object[] {
            T002A27_A396EmprCod, T002A27_A252CliCod, T002A27_A494ForSer, T002A27_A482ForColNom, T002A27_A483ForColNum, T002A27_A831TipColCod, T002A27_A3571EnsCod, T002A27_A3582EnsLin
            }
            , new Object[] {
            T002A28_A396EmprCod, T002A28_A129BarCod, T002A28_A132BarCodReo, T002A28_A130BarCodPar, T002A28_A4075recestncol, T002A28_A4076recestnpro, T002A28_A4108recestlin
            }
            , new Object[] {
            T002A29_A396EmprCod, T002A29_A4052EstNumFor, T002A29_A4053EstNumCol, T002A29_A4090EstEspLin
            }
            , new Object[] {
            T002A30_A396EmprCod, T002A30_A4052EstNumFor, T002A30_A4053EstNumCol, T002A30_A4084EstProLin
            }
            , new Object[] {
            T002A31_A396EmprCod, T002A31_A11644TransferId, T002A31_A11653TransferLn
            }
            , new Object[] {
            T002A32_A396EmprCod, T002A32_A11634TaesId, T002A32_A11637TaesLn, T002A32_A11641TaesLnP
            }
            , new Object[] {
            T002A33_A396EmprCod, T002A33_A719PrdNum, T002A33_A11329H_stklin
            }
            , new Object[] {
            T002A34_A396EmprCod, T002A34_A11270Pot_num, T002A34_A11271Pot_lin
            }
            , new Object[] {
            T002A35_A396EmprCod, T002A35_A719PrdNum, T002A35_A11199PrdNcasC
            }
            , new Object[] {
            T002A36_A396EmprCod, T002A36_A719PrdNum, T002A36_A11197CFraseR
            }
            , new Object[] {
            T002A37_A396EmprCod, T002A37_A10243Jt_codigo, T002A37_A10246Jt_ord
            }
            , new Object[] {
            T002A38_A396EmprCod, T002A38_A10236Bny_dia, T002A38_A10238Bny_lin
            }
            , new Object[] {
            T002A39_A396EmprCod, T002A39_A129BarCod, T002A39_A132BarCodReo, T002A39_A130BarCodPar, T002A39_A758ProCod, T002A39_A194BarOrdLin, T002A39_A719PrdNum
            }
            , new Object[] {
            T002A40_A396EmprCod, T002A40_A719PrdNum, T002A40_A9735Cod_Rgo
            }
            , new Object[] {
            T002A41_A396EmprCod, T002A41_A719PrdNum, T002A41_A9711Ct_codigo
            }
            , new Object[] {
            T002A42_A396EmprCod, T002A42_A9652OeNum, T002A42_A9653OeHdr, T002A42_A9654OeHdrr, T002A42_A9655OeHdrp, T002A42_A9656OeLinC, T002A42_A9657OeComb, T002A42_A9658Oefondo, T002A42_A9659OeMolCil, T002A42_A9686OePasLin,
            T002A42_A9694OePasPLi
            }
            , new Object[] {
            T002A43_A396EmprCod, T002A43_A9652OeNum, T002A43_A9653OeHdr, T002A43_A9654OeHdrr, T002A43_A9655OeHdrp, T002A43_A9656OeLinC, T002A43_A9657OeComb, T002A43_A9658Oefondo, T002A43_A9659OeMolCil, T002A43_A9677OeMolLin
            }
            , new Object[] {
            T002A44_A396EmprCod, T002A44_A9578Pas_Num, T002A44_A719PrdNum
            }
            , new Object[] {
            T002A45_A396EmprCod, T002A45_A719PrdNum, T002A45_A8908CC_AlmCod
            }
            , new Object[] {
            T002A46_A396EmprCod, T002A46_A719PrdNum, T002A46_A8661Almc_Ln
            }
            , new Object[] {
            T002A47_A396EmprCod, T002A47_A719PrdNum, T002A47_A8648Mat_PrdN
            }
            , new Object[] {
            T002A48_A396EmprCod, T002A48_A8585Pet_cod, T002A48_A719PrdNum
            }
            , new Object[] {
            T002A49_A396EmprCod, T002A49_A719PrdNum, T002A49_A8577RecFecHr
            }
            , new Object[] {
            T002A50_A396EmprCod, T002A50_A719PrdNum, T002A50_A8366PrdAnyo, T002A50_A8360PrdProv
            }
            , new Object[] {
            T002A51_A396EmprCod, T002A51_A252CliCod, T002A51_A494ForSer, T002A51_A482ForColNom, T002A51_A483ForColNum, T002A51_A831TipColCod, T002A51_A7797Sim_lin
            }
            , new Object[] {
            T002A52_A396EmprCod, T002A52_A7163Vir_Codigo, T002A52_A719PrdNum
            }
            , new Object[] {
            T002A53_A396EmprCod, T002A53_A6310Lb_TaAuxC, T002A53_A6313lb_TaAuxL, T002A53_A6378Lb_TauxLP
            }
            , new Object[] {
            T002A54_A396EmprCod, T002A54_A6290PreCoNum, T002A54_A719PrdNum
            }
            , new Object[] {
            T002A55_A396EmprCod, T002A55_A719PrdNum, T002A55_A6158PrdPrv
            }
            , new Object[] {
            T002A56_A396EmprCod, T002A56_A719PrdNum, T002A56_A5973PrdSusNum
            }
            , new Object[] {
            T002A57_A396EmprCod, T002A57_A5612Lb_CodGru, T002A57_A5615Lb_LinGru
            }
            , new Object[] {
            T002A58_A396EmprCod, T002A58_A5532Lb_numero, T002A58_A5555Lb_opcion, T002A58_A5560Lb_LineaPr
            }
            , new Object[] {
            T002A59_A396EmprCod, T002A59_A5532Lb_numero, T002A59_A5555Lb_opcion, T002A59_A5557Lb_LineaC
            }
            , new Object[] {
            T002A60_A396EmprCod, T002A60_A5145SobCod, T002A60_A719PrdNum
            }
            , new Object[] {
            T002A61_A396EmprCod, T002A61_A4744RecPreCod, T002A61_A4762RecPreLin, T002A61_A4763RecPreNli
            }
            , new Object[] {
            T002A62_A396EmprCod, T002A62_A4492HreBarCod, T002A62_A4493HreBarReo, T002A62_A4494HreBarPar, T002A62_A4495HreNumCie, T002A62_A4545HreLinMaq, T002A62_A4550HreLinPro, T002A62_A4557HreRecLin
            }
            , new Object[] {
            T002A63_A396EmprCod, T002A63_A4492HreBarCod, T002A63_A4493HreBarReo, T002A63_A4494HreBarPar, T002A63_A4495HreNumCie, T002A63_A4508HreLinMAL, T002A63_A4509HreNumAny, T002A63_A719PrdNum
            }
            , new Object[] {
            T002A64_A396EmprCod, T002A64_A252CliCod, T002A64_A4415EstCol, T002A64_A4416EstColLin
            }
            , new Object[] {
            T002A65_A396EmprCod, T002A65_A129BarCod, T002A65_A132BarCodReo, T002A65_A130BarCodPar, T002A65_A2524DisComLin, T002A65_A1056DisComCod, T002A65_A1032FonCod, T002A65_A2124RecMolCod, T002A65_A2672RecPasLin, T002A65_A2675RecPasPLi
            }
            , new Object[] {
            T002A66_A396EmprCod, T002A66_A129BarCod, T002A66_A132BarCodReo, T002A66_A130BarCodPar, T002A66_A2524DisComLin, T002A66_A1056DisComCod, T002A66_A1032FonCod, T002A66_A2124RecMolCod, T002A66_A2126RecMolLin
            }
            , new Object[] {
            T002A67_A396EmprCod, T002A67_A2107PasCod, T002A67_A719PrdNum
            }
            , new Object[] {
            T002A68_A396EmprCod, T002A68_A2637HisEstHRu, T002A68_A2636HisEstHRe, T002A68_A2635HisEstHPa, T002A68_A2638HisEstLCo, T002A68_A2630HisEstCom, T002A68_A2634HisEstFon, T002A68_A719PrdNum
            }
            , new Object[] {
            T002A69_A396EmprCod, T002A69_A252CliCod, T002A69_A2141SerEst, T002A69_A1013DibCli, T002A69_A1014DibInt, T002A69_A2074ColCom, T002A69_A2078ColFon, T002A69_A2098MolCod, T002A69_A2535ForPrdLin
            }
            , new Object[] {
            T002A70_A396EmprCod, T002A70_A719PrdNum, T002A70_A3342CCStkLin
            }
            , new Object[] {
            T002A71_A396EmprCod, T002A71_A252CliCod, T002A71_A2891HMaForSer, T002A71_A2892HMaForCNom, T002A71_A2893HMaForCNum, T002A71_A2894HMaTipCCod, T002A71_A2895HMaForNumC, T002A71_A2897HMaColLin, T002A71_A2896HMaFec, T002A71_A2907HmaLin
            }
            , new Object[] {
            T002A72_A396EmprCod, T002A72_A129BarCod, T002A72_A132BarCodReo, T002A72_A130BarCodPar, T002A72_A2808RecLinMAL, T002A72_A1377RecNumAny, T002A72_A719PrdNum
            }
            , new Object[] {
            T002A73_A396EmprCod, T002A73_A129BarCod, T002A73_A132BarCodReo, T002A73_A130BarCodPar, T002A73_A2804RecLinMaq, T002A73_A1273RecLinPro, T002A73_A811RecLin
            }
            , new Object[] {
            T002A74_A396EmprCod, T002A74_A129BarCod, T002A74_A132BarCodReo, T002A74_A130BarCodPar, T002A74_A2494BarDosPro, T002A74_A719PrdNum
            }
            , new Object[] {
            T002A75_A396EmprCod, T002A75_A1314EnsLabCod, T002A75_A1317EnsLabLin
            }
            , new Object[] {
            T002A76_A396EmprCod, T002A76_A910Workstat, T002A76_A887EscMLin
            }
            , new Object[] {
            T002A77_A396EmprCod, T002A77_A859CumCodCont, T002A77_A719PrdNum
            }
            , new Object[] {
            T002A78_A396EmprCod, T002A78_A719PrdNum, T002A78_A810RecFec, T002A78_A8908CC_AlmCod
            }
            , new Object[] {
            T002A79_A396EmprCod, T002A79_A486ForNumCol, T002A79_A715PrdLin
            }
            , new Object[] {
            T002A80_A396EmprCod, T002A80_A719PrdNum, T002A80_A681PrdAny
            }
            , new Object[] {
            T002A81_A396EmprCod, T002A81_A719PrdNum, T002A81_A688PrdComCod
            }
            , new Object[] {
            T002A82_A396EmprCod, T002A82_A719PrdNum, T002A82_A680PrdAltNum
            }
            , new Object[] {
            T002A83_A396EmprCod, T002A83_A658PedCod, T002A83_A719PrdNum
            }
            , new Object[] {
            T002A84_A396EmprCod, T002A84_A486ForNumCol, T002A84_A309ColLin
            }
            , new Object[] {
            T002A85_A396EmprCod, T002A85_A719PrdNum, T002A85_A647NumCon
            }
            , new Object[] {
            T002A86_A396EmprCod, T002A86_A719PrdNum
            }
            , new Object[] {
            T002A87_A719PrdNum, T002A87_A810RecFec, T002A87_A809RecExiTeo, T002A87_A807RecExiRea, T002A87_A808RecExiTcc, T002A87_A806RecExiRcc, T002A87_A6573RecPreRec, T002A87_A8668RecExiTAc, T002A87_A8669RecExiRAc, T002A87_A11195RecUbic,
            T002A87_A11624RecMemCant, T002A87_A12285RecLot, T002A87_A13416RecEstInv, T002A87_A13455Rechora, T002A87_A396EmprCod
            }
            , new Object[] {
            T002A88_A396EmprCod, T002A88_A719PrdNum, T002A88_A810RecFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002A92_A396EmprCod, T002A92_A719PrdNum, T002A92_A810RecFec, T002A92_A8908CC_AlmCod
            }
            , new Object[] {
            T002A93_A396EmprCod, T002A93_A719PrdNum, T002A93_A810RecFec
            }
         }
      );
   }

   private byte Z11624RecMemCant ;
   private byte Z13416RecEstInv ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11624RecMemCant ;
   private byte A13416RecEstInv ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_98 ;
   private short nRcdExists_98 ;
   private short nIsMod_98 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount98 ;
   private short RcdFound98 ;
   private short nBlankRcdUsr98 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_98 ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtavnRcdDeleted_98_Enabled ;
   private int edtRecFec_Enabled ;
   private int edtRecExiTeo_Enabled ;
   private int edtRecExiRea_Enabled ;
   private int edtRecExiTcc_Enabled ;
   private int edtRecExiRcc_Enabled ;
   private int edtRecPreRec_Enabled ;
   private int edtRecExiTAc_Enabled ;
   private int edtRecExiRAc_Enabled ;
   private int edtRecUbic_Enabled ;
   private int edtRecMemCant_Enabled ;
   private int edtRecLot_Enabled ;
   private int edtRecEstInv_Enabled ;
   private int edtRechora_Enabled ;
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
   private int defedtRecFec_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z809RecExiTeo ;
   private java.math.BigDecimal Z807RecExiRea ;
   private java.math.BigDecimal Z808RecExiTcc ;
   private java.math.BigDecimal Z806RecExiRcc ;
   private java.math.BigDecimal Z6573RecPreRec ;
   private java.math.BigDecimal Z8668RecExiTAc ;
   private java.math.BigDecimal Z8669RecExiRAc ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A14377DifAlmPor ;
   private java.math.BigDecimal A14034DifAlmacen ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A8668RecExiTAc ;
   private java.math.BigDecimal A8669RecExiRAc ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private java.math.BigDecimal Z14377DifAlmPor ;
   private java.math.BigDecimal Z14034DifAlmacen ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z11195RecUbic ;
   private String Z12285RecLot ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_35_idx="0001" ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String sMode98 ;
   private String edtavnRcdDeleted_98_Internalname ;
   private String edtRecFec_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtRecExiRea_Internalname ;
   private String edtRecExiTcc_Internalname ;
   private String edtRecExiRcc_Internalname ;
   private String edtRecPreRec_Internalname ;
   private String edtRecExiTAc_Internalname ;
   private String edtRecExiRAc_Internalname ;
   private String edtRecUbic_Internalname ;
   private String edtRecMemCant_Internalname ;
   private String edtRecLot_Internalname ;
   private String edtRecEstInv_Internalname ;
   private String edtRechora_Internalname ;
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
   private String sMode29 ;
   private String GXCCtl ;
   private String A11195RecUbic ;
   private String A12285RecLot ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_98_Jsonclick ;
   private String edtRecFec_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtRecExiRea_Jsonclick ;
   private String edtRecExiTcc_Jsonclick ;
   private String edtRecExiRcc_Jsonclick ;
   private String edtRecPreRec_Jsonclick ;
   private String edtRecExiTAc_Jsonclick ;
   private String edtRecExiRAc_Jsonclick ;
   private String edtRecUbic_Jsonclick ;
   private String edtRecMemCant_Jsonclick ;
   private String edtRecLot_Jsonclick ;
   private String edtRecEstInv_Jsonclick ;
   private String edtRechora_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ718PrdNom ;
   private java.util.Date Z13455Rechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date Z810RecFec ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T002A6_A719PrdNum ;
   private boolean[] T002A6_n719PrdNum ;
   private String[] T002A6_A718PrdNom ;
   private String[] T002A6_A396EmprCod ;
   private String[] T002A7_A396EmprCod ;
   private String[] T002A7_A719PrdNum ;
   private boolean[] T002A7_n719PrdNum ;
   private String[] T002A5_A719PrdNum ;
   private boolean[] T002A5_n719PrdNum ;
   private String[] T002A5_A718PrdNom ;
   private String[] T002A5_A396EmprCod ;
   private String[] T002A8_A396EmprCod ;
   private String[] T002A8_A719PrdNum ;
   private boolean[] T002A8_n719PrdNum ;
   private String[] T002A9_A396EmprCod ;
   private String[] T002A9_A719PrdNum ;
   private boolean[] T002A9_n719PrdNum ;
   private String[] T002A4_A719PrdNum ;
   private boolean[] T002A4_n719PrdNum ;
   private String[] T002A4_A718PrdNom ;
   private String[] T002A4_A396EmprCod ;
   private String[] T002A13_A396EmprCod ;
   private String[] T002A13_A719PrdNum ;
   private boolean[] T002A13_n719PrdNum ;
   private String[] T002A13_A13217NormaID ;
   private String[] T002A14_A396EmprCod ;
   private String[] T002A14_A719PrdNum ;
   private boolean[] T002A14_n719PrdNum ;
   private String[] T002A14_A13586TheList ;
   private String[] T002A15_A396EmprCod ;
   private int[] T002A15_A5532Lb_numero ;
   private String[] T002A15_A5555Lb_opcion ;
   private short[] T002A15_A13460Lb_linCP ;
   private String[] T002A15_A13458Lb_TipCP ;
   private String[] T002A16_A396EmprCod ;
   private int[] T002A16_A13418AlbProID ;
   private short[] T002A16_A13442AlbProLine ;
   private String[] T002A17_A396EmprCod ;
   private int[] T002A17_A13324LDESID ;
   private String[] T002A17_A13333LDESNPeque ;
   private String[] T002A17_A13337LDESComb ;
   private String[] T002A17_A13339LDESFondo ;
   private short[] T002A17_A13342LDESLinea ;
   private String[] T002A18_A396EmprCod ;
   private int[] T002A18_A13312Lb_NLab ;
   private short[] T002A18_A13305Lb_IDVeces ;
   private short[] T002A18_A13306Lb_LinID ;
   private String[] T002A19_A396EmprCod ;
   private int[] T002A19_A12673LavMqId ;
   private short[] T002A19_A12692LavMqLnPq ;
   private short[] T002A19_A12681LavMqLn ;
   private String[] T002A20_A396EmprCod ;
   private String[] T002A20_A719PrdNum ;
   private boolean[] T002A20_n719PrdNum ;
   private short[] T002A20_A9713Tb1_Cod ;
   private String[] T002A21_A396EmprCod ;
   private String[] T002A21_A12236PrdNumD ;
   private String[] T002A21_A719PrdNum ;
   private boolean[] T002A21_n719PrdNum ;
   private String[] T002A22_A396EmprCod ;
   private long[] T002A22_A12225DocDisID ;
   private short[] T002A22_A12226LinDisID ;
   private String[] T002A23_A396EmprCod ;
   private long[] T002A23_A12225DocDisID ;
   private String[] T002A24_A396EmprCod ;
   private long[] T002A24_A12205OrdenCID ;
   private short[] T002A24_A12206OrdenCLnId ;
   private String[] T002A25_A396EmprCod ;
   private String[] T002A25_A719PrdNum ;
   private boolean[] T002A25_n719PrdNum ;
   private String[] T002A25_A11664LoteID ;
   private java.util.Date[] T002A25_A11665LoteFec ;
   private String[] T002A26_A396EmprCod ;
   private int[] T002A26_A4850DevComCod ;
   private String[] T002A26_A719PrdNum ;
   private boolean[] T002A26_n719PrdNum ;
   private String[] T002A27_A396EmprCod ;
   private int[] T002A27_A252CliCod ;
   private String[] T002A27_A494ForSer ;
   private String[] T002A27_A482ForColNom ;
   private int[] T002A27_A483ForColNum ;
   private byte[] T002A27_A831TipColCod ;
   private String[] T002A27_A3571EnsCod ;
   private short[] T002A27_A3582EnsLin ;
   private String[] T002A28_A396EmprCod ;
   private int[] T002A28_A129BarCod ;
   private byte[] T002A28_A132BarCodReo ;
   private String[] T002A28_A130BarCodPar ;
   private byte[] T002A28_A4075recestncol ;
   private byte[] T002A28_A4076recestnpro ;
   private short[] T002A28_A4108recestlin ;
   private String[] T002A29_A396EmprCod ;
   private int[] T002A29_A4052EstNumFor ;
   private byte[] T002A29_A4053EstNumCol ;
   private byte[] T002A29_A4090EstEspLin ;
   private String[] T002A30_A396EmprCod ;
   private int[] T002A30_A4052EstNumFor ;
   private byte[] T002A30_A4053EstNumCol ;
   private byte[] T002A30_A4084EstProLin ;
   private String[] T002A31_A396EmprCod ;
   private long[] T002A31_A11644TransferId ;
   private int[] T002A31_A11653TransferLn ;
   private String[] T002A32_A396EmprCod ;
   private String[] T002A32_A11634TaesId ;
   private short[] T002A32_A11637TaesLn ;
   private short[] T002A32_A11641TaesLnP ;
   private String[] T002A33_A396EmprCod ;
   private String[] T002A33_A719PrdNum ;
   private boolean[] T002A33_n719PrdNum ;
   private long[] T002A33_A11329H_stklin ;
   private String[] T002A34_A396EmprCod ;
   private int[] T002A34_A11270Pot_num ;
   private short[] T002A34_A11271Pot_lin ;
   private String[] T002A35_A396EmprCod ;
   private String[] T002A35_A719PrdNum ;
   private boolean[] T002A35_n719PrdNum ;
   private String[] T002A35_A11199PrdNcasC ;
   private String[] T002A36_A396EmprCod ;
   private String[] T002A36_A719PrdNum ;
   private boolean[] T002A36_n719PrdNum ;
   private String[] T002A36_A11197CFraseR ;
   private String[] T002A37_A396EmprCod ;
   private short[] T002A37_A10243Jt_codigo ;
   private short[] T002A37_A10246Jt_ord ;
   private String[] T002A38_A396EmprCod ;
   private java.util.Date[] T002A38_A10236Bny_dia ;
   private short[] T002A38_A10238Bny_lin ;
   private String[] T002A39_A396EmprCod ;
   private int[] T002A39_A129BarCod ;
   private byte[] T002A39_A132BarCodReo ;
   private String[] T002A39_A130BarCodPar ;
   private String[] T002A39_A758ProCod ;
   private short[] T002A39_A194BarOrdLin ;
   private String[] T002A39_A719PrdNum ;
   private boolean[] T002A39_n719PrdNum ;
   private String[] T002A40_A396EmprCod ;
   private String[] T002A40_A719PrdNum ;
   private boolean[] T002A40_n719PrdNum ;
   private String[] T002A40_A9735Cod_Rgo ;
   private String[] T002A41_A396EmprCod ;
   private String[] T002A41_A719PrdNum ;
   private boolean[] T002A41_n719PrdNum ;
   private short[] T002A41_A9711Ct_codigo ;
   private String[] T002A42_A396EmprCod ;
   private long[] T002A42_A9652OeNum ;
   private int[] T002A42_A9653OeHdr ;
   private byte[] T002A42_A9654OeHdrr ;
   private String[] T002A42_A9655OeHdrp ;
   private byte[] T002A42_A9656OeLinC ;
   private String[] T002A42_A9657OeComb ;
   private String[] T002A42_A9658Oefondo ;
   private byte[] T002A42_A9659OeMolCil ;
   private short[] T002A42_A9686OePasLin ;
   private short[] T002A42_A9694OePasPLi ;
   private String[] T002A43_A396EmprCod ;
   private long[] T002A43_A9652OeNum ;
   private int[] T002A43_A9653OeHdr ;
   private byte[] T002A43_A9654OeHdrr ;
   private String[] T002A43_A9655OeHdrp ;
   private byte[] T002A43_A9656OeLinC ;
   private String[] T002A43_A9657OeComb ;
   private String[] T002A43_A9658Oefondo ;
   private byte[] T002A43_A9659OeMolCil ;
   private byte[] T002A43_A9677OeMolLin ;
   private String[] T002A44_A396EmprCod ;
   private int[] T002A44_A9578Pas_Num ;
   private String[] T002A44_A719PrdNum ;
   private boolean[] T002A44_n719PrdNum ;
   private String[] T002A45_A396EmprCod ;
   private String[] T002A45_A719PrdNum ;
   private boolean[] T002A45_n719PrdNum ;
   private byte[] T002A45_A8908CC_AlmCod ;
   private String[] T002A46_A396EmprCod ;
   private String[] T002A46_A719PrdNum ;
   private boolean[] T002A46_n719PrdNum ;
   private int[] T002A46_A8661Almc_Ln ;
   private String[] T002A47_A396EmprCod ;
   private String[] T002A47_A719PrdNum ;
   private boolean[] T002A47_n719PrdNum ;
   private String[] T002A47_A8648Mat_PrdN ;
   private String[] T002A48_A396EmprCod ;
   private long[] T002A48_A8585Pet_cod ;
   private String[] T002A48_A719PrdNum ;
   private boolean[] T002A48_n719PrdNum ;
   private String[] T002A49_A396EmprCod ;
   private String[] T002A49_A719PrdNum ;
   private boolean[] T002A49_n719PrdNum ;
   private java.util.Date[] T002A49_A8577RecFecHr ;
   private String[] T002A50_A396EmprCod ;
   private String[] T002A50_A719PrdNum ;
   private boolean[] T002A50_n719PrdNum ;
   private short[] T002A50_A8366PrdAnyo ;
   private int[] T002A50_A8360PrdProv ;
   private String[] T002A51_A396EmprCod ;
   private int[] T002A51_A252CliCod ;
   private String[] T002A51_A494ForSer ;
   private String[] T002A51_A482ForColNom ;
   private int[] T002A51_A483ForColNum ;
   private byte[] T002A51_A831TipColCod ;
   private short[] T002A51_A7797Sim_lin ;
   private String[] T002A52_A396EmprCod ;
   private int[] T002A52_A7163Vir_Codigo ;
   private String[] T002A52_A719PrdNum ;
   private boolean[] T002A52_n719PrdNum ;
   private String[] T002A53_A396EmprCod ;
   private String[] T002A53_A6310Lb_TaAuxC ;
   private short[] T002A53_A6313lb_TaAuxL ;
   private short[] T002A53_A6378Lb_TauxLP ;
   private String[] T002A54_A396EmprCod ;
   private int[] T002A54_A6290PreCoNum ;
   private String[] T002A54_A719PrdNum ;
   private boolean[] T002A54_n719PrdNum ;
   private String[] T002A55_A396EmprCod ;
   private String[] T002A55_A719PrdNum ;
   private boolean[] T002A55_n719PrdNum ;
   private int[] T002A55_A6158PrdPrv ;
   private String[] T002A56_A396EmprCod ;
   private String[] T002A56_A719PrdNum ;
   private boolean[] T002A56_n719PrdNum ;
   private String[] T002A56_A5973PrdSusNum ;
   private String[] T002A57_A396EmprCod ;
   private String[] T002A57_A5612Lb_CodGru ;
   private short[] T002A57_A5615Lb_LinGru ;
   private String[] T002A58_A396EmprCod ;
   private int[] T002A58_A5532Lb_numero ;
   private String[] T002A58_A5555Lb_opcion ;
   private short[] T002A58_A5560Lb_LineaPr ;
   private String[] T002A59_A396EmprCod ;
   private int[] T002A59_A5532Lb_numero ;
   private String[] T002A59_A5555Lb_opcion ;
   private short[] T002A59_A5557Lb_LineaC ;
   private String[] T002A60_A396EmprCod ;
   private int[] T002A60_A5145SobCod ;
   private String[] T002A60_A719PrdNum ;
   private boolean[] T002A60_n719PrdNum ;
   private String[] T002A61_A396EmprCod ;
   private int[] T002A61_A4744RecPreCod ;
   private short[] T002A61_A4762RecPreLin ;
   private short[] T002A61_A4763RecPreNli ;
   private String[] T002A62_A396EmprCod ;
   private int[] T002A62_A4492HreBarCod ;
   private byte[] T002A62_A4493HreBarReo ;
   private String[] T002A62_A4494HreBarPar ;
   private byte[] T002A62_A4495HreNumCie ;
   private short[] T002A62_A4545HreLinMaq ;
   private byte[] T002A62_A4550HreLinPro ;
   private short[] T002A62_A4557HreRecLin ;
   private String[] T002A63_A396EmprCod ;
   private int[] T002A63_A4492HreBarCod ;
   private byte[] T002A63_A4493HreBarReo ;
   private String[] T002A63_A4494HreBarPar ;
   private byte[] T002A63_A4495HreNumCie ;
   private short[] T002A63_A4508HreLinMAL ;
   private byte[] T002A63_A4509HreNumAny ;
   private String[] T002A63_A719PrdNum ;
   private boolean[] T002A63_n719PrdNum ;
   private String[] T002A64_A396EmprCod ;
   private int[] T002A64_A252CliCod ;
   private String[] T002A64_A4415EstCol ;
   private short[] T002A64_A4416EstColLin ;
   private String[] T002A65_A396EmprCod ;
   private int[] T002A65_A129BarCod ;
   private byte[] T002A65_A132BarCodReo ;
   private String[] T002A65_A130BarCodPar ;
   private byte[] T002A65_A2524DisComLin ;
   private String[] T002A65_A1056DisComCod ;
   private String[] T002A65_A1032FonCod ;
   private byte[] T002A65_A2124RecMolCod ;
   private short[] T002A65_A2672RecPasLin ;
   private short[] T002A65_A2675RecPasPLi ;
   private String[] T002A66_A396EmprCod ;
   private int[] T002A66_A129BarCod ;
   private byte[] T002A66_A132BarCodReo ;
   private String[] T002A66_A130BarCodPar ;
   private byte[] T002A66_A2524DisComLin ;
   private String[] T002A66_A1056DisComCod ;
   private String[] T002A66_A1032FonCod ;
   private byte[] T002A66_A2124RecMolCod ;
   private byte[] T002A66_A2126RecMolLin ;
   private String[] T002A67_A396EmprCod ;
   private String[] T002A67_A2107PasCod ;
   private String[] T002A67_A719PrdNum ;
   private boolean[] T002A67_n719PrdNum ;
   private String[] T002A68_A396EmprCod ;
   private int[] T002A68_A2637HisEstHRu ;
   private byte[] T002A68_A2636HisEstHRe ;
   private String[] T002A68_A2635HisEstHPa ;
   private byte[] T002A68_A2638HisEstLCo ;
   private String[] T002A68_A2630HisEstCom ;
   private String[] T002A68_A2634HisEstFon ;
   private String[] T002A68_A719PrdNum ;
   private boolean[] T002A68_n719PrdNum ;
   private String[] T002A69_A396EmprCod ;
   private int[] T002A69_A252CliCod ;
   private String[] T002A69_A2141SerEst ;
   private String[] T002A69_A1013DibCli ;
   private int[] T002A69_A1014DibInt ;
   private String[] T002A69_A2074ColCom ;
   private String[] T002A69_A2078ColFon ;
   private byte[] T002A69_A2098MolCod ;
   private short[] T002A69_A2535ForPrdLin ;
   private String[] T002A70_A396EmprCod ;
   private String[] T002A70_A719PrdNum ;
   private boolean[] T002A70_n719PrdNum ;
   private long[] T002A70_A3342CCStkLin ;
   private String[] T002A71_A396EmprCod ;
   private int[] T002A71_A252CliCod ;
   private String[] T002A71_A2891HMaForSer ;
   private String[] T002A71_A2892HMaForCNom ;
   private int[] T002A71_A2893HMaForCNum ;
   private byte[] T002A71_A2894HMaTipCCod ;
   private int[] T002A71_A2895HMaForNumC ;
   private short[] T002A71_A2897HMaColLin ;
   private java.util.Date[] T002A71_A2896HMaFec ;
   private short[] T002A71_A2907HmaLin ;
   private String[] T002A72_A396EmprCod ;
   private int[] T002A72_A129BarCod ;
   private byte[] T002A72_A132BarCodReo ;
   private String[] T002A72_A130BarCodPar ;
   private short[] T002A72_A2808RecLinMAL ;
   private byte[] T002A72_A1377RecNumAny ;
   private String[] T002A72_A719PrdNum ;
   private boolean[] T002A72_n719PrdNum ;
   private String[] T002A73_A396EmprCod ;
   private int[] T002A73_A129BarCod ;
   private byte[] T002A73_A132BarCodReo ;
   private String[] T002A73_A130BarCodPar ;
   private short[] T002A73_A2804RecLinMaq ;
   private byte[] T002A73_A1273RecLinPro ;
   private short[] T002A73_A811RecLin ;
   private String[] T002A74_A396EmprCod ;
   private int[] T002A74_A129BarCod ;
   private byte[] T002A74_A132BarCodReo ;
   private String[] T002A74_A130BarCodPar ;
   private String[] T002A74_A2494BarDosPro ;
   private String[] T002A74_A719PrdNum ;
   private boolean[] T002A74_n719PrdNum ;
   private String[] T002A75_A396EmprCod ;
   private int[] T002A75_A1314EnsLabCod ;
   private short[] T002A75_A1317EnsLabLin ;
   private String[] T002A76_A396EmprCod ;
   private String[] T002A76_A910Workstat ;
   private int[] T002A76_A887EscMLin ;
   private String[] T002A77_A396EmprCod ;
   private int[] T002A77_A859CumCodCont ;
   private String[] T002A77_A719PrdNum ;
   private boolean[] T002A77_n719PrdNum ;
   private String[] T002A78_A396EmprCod ;
   private String[] T002A78_A719PrdNum ;
   private boolean[] T002A78_n719PrdNum ;
   private java.util.Date[] T002A78_A810RecFec ;
   private byte[] T002A78_A8908CC_AlmCod ;
   private String[] T002A79_A396EmprCod ;
   private int[] T002A79_A486ForNumCol ;
   private short[] T002A79_A715PrdLin ;
   private String[] T002A80_A396EmprCod ;
   private String[] T002A80_A719PrdNum ;
   private boolean[] T002A80_n719PrdNum ;
   private short[] T002A80_A681PrdAny ;
   private String[] T002A81_A396EmprCod ;
   private String[] T002A81_A719PrdNum ;
   private boolean[] T002A81_n719PrdNum ;
   private String[] T002A81_A688PrdComCod ;
   private String[] T002A82_A396EmprCod ;
   private String[] T002A82_A719PrdNum ;
   private boolean[] T002A82_n719PrdNum ;
   private String[] T002A82_A680PrdAltNum ;
   private String[] T002A83_A396EmprCod ;
   private int[] T002A83_A658PedCod ;
   private String[] T002A83_A719PrdNum ;
   private boolean[] T002A83_n719PrdNum ;
   private String[] T002A84_A396EmprCod ;
   private int[] T002A84_A486ForNumCol ;
   private short[] T002A84_A309ColLin ;
   private String[] T002A85_A396EmprCod ;
   private String[] T002A85_A719PrdNum ;
   private boolean[] T002A85_n719PrdNum ;
   private int[] T002A85_A647NumCon ;
   private String[] T002A86_A396EmprCod ;
   private String[] T002A86_A719PrdNum ;
   private boolean[] T002A86_n719PrdNum ;
   private String[] T002A87_A719PrdNum ;
   private boolean[] T002A87_n719PrdNum ;
   private java.util.Date[] T002A87_A810RecFec ;
   private java.math.BigDecimal[] T002A87_A809RecExiTeo ;
   private java.math.BigDecimal[] T002A87_A807RecExiRea ;
   private java.math.BigDecimal[] T002A87_A808RecExiTcc ;
   private java.math.BigDecimal[] T002A87_A806RecExiRcc ;
   private java.math.BigDecimal[] T002A87_A6573RecPreRec ;
   private java.math.BigDecimal[] T002A87_A8668RecExiTAc ;
   private java.math.BigDecimal[] T002A87_A8669RecExiRAc ;
   private String[] T002A87_A11195RecUbic ;
   private byte[] T002A87_A11624RecMemCant ;
   private String[] T002A87_A12285RecLot ;
   private byte[] T002A87_A13416RecEstInv ;
   private java.util.Date[] T002A87_A13455Rechora ;
   private String[] T002A87_A396EmprCod ;
   private String[] T002A88_A396EmprCod ;
   private String[] T002A88_A719PrdNum ;
   private boolean[] T002A88_n719PrdNum ;
   private java.util.Date[] T002A88_A810RecFec ;
   private String[] T002A3_A719PrdNum ;
   private boolean[] T002A3_n719PrdNum ;
   private java.util.Date[] T002A3_A810RecFec ;
   private java.math.BigDecimal[] T002A3_A809RecExiTeo ;
   private java.math.BigDecimal[] T002A3_A807RecExiRea ;
   private java.math.BigDecimal[] T002A3_A808RecExiTcc ;
   private java.math.BigDecimal[] T002A3_A806RecExiRcc ;
   private java.math.BigDecimal[] T002A3_A6573RecPreRec ;
   private java.math.BigDecimal[] T002A3_A8668RecExiTAc ;
   private java.math.BigDecimal[] T002A3_A8669RecExiRAc ;
   private String[] T002A3_A11195RecUbic ;
   private byte[] T002A3_A11624RecMemCant ;
   private String[] T002A3_A12285RecLot ;
   private byte[] T002A3_A13416RecEstInv ;
   private java.util.Date[] T002A3_A13455Rechora ;
   private String[] T002A3_A396EmprCod ;
   private String[] T002A2_A719PrdNum ;
   private boolean[] T002A2_n719PrdNum ;
   private java.util.Date[] T002A2_A810RecFec ;
   private java.math.BigDecimal[] T002A2_A809RecExiTeo ;
   private java.math.BigDecimal[] T002A2_A807RecExiRea ;
   private java.math.BigDecimal[] T002A2_A808RecExiTcc ;
   private java.math.BigDecimal[] T002A2_A806RecExiRcc ;
   private java.math.BigDecimal[] T002A2_A6573RecPreRec ;
   private java.math.BigDecimal[] T002A2_A8668RecExiTAc ;
   private java.math.BigDecimal[] T002A2_A8669RecExiRAc ;
   private String[] T002A2_A11195RecUbic ;
   private byte[] T002A2_A11624RecMemCant ;
   private String[] T002A2_A12285RecLot ;
   private byte[] T002A2_A13416RecEstInv ;
   private java.util.Date[] T002A2_A13455Rechora ;
   private String[] T002A2_A396EmprCod ;
   private String[] T002A92_A396EmprCod ;
   private String[] T002A92_A719PrdNum ;
   private boolean[] T002A92_n719PrdNum ;
   private java.util.Date[] T002A92_A810RecFec ;
   private byte[] T002A92_A8908CC_AlmCod ;
   private String[] T002A93_A396EmprCod ;
   private String[] T002A93_A719PrdNum ;
   private boolean[] T002A93_n719PrdNum ;
   private java.util.Date[] T002A93_A810RecFec ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trecuen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecuen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecuen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecuen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002A2", "SELECT PrdNum, RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?  FOR UPDATE OF RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A3", "SELECT PrdNum, RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A4", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A5", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A6", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, TM1.PrdNom, TM1.EmprCod FROM TXPPRODUC TM1 WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002A10", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T002A11", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T002A12", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T002A13", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A14", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A15", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A16", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A17", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A18", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A19", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A20", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A21", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A22", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A23", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A24", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A25", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A26", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A27", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A29", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A30", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A31", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A32", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A33", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A34", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A35", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A36", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A37", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A38", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A39", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A40", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A41", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A42", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A43", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A44", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A45", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A46", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A47", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A48", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A49", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A50", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A51", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A52", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A53", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A54", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A55", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A56", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A57", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A58", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A59", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A60", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A61", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A62", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A63", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A64", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A65", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A66", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A67", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A68", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A69", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A70", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A71", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A74", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A75", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A76", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A77", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A78", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec, CC_AlmCod FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A79", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A80", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A81", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A82", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A83", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A84", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A85", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A86", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A87", "SELECT PrdNum, RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002A88", "SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002A89", "INSERT INTO TXPRECUEN(PrdNum, RecFec, RecExiTeo, RecExiRea, RecExiTcc, RecExiRcc, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECUEN")
         ,new UpdateCursor("T002A90", "UPDATE TXPRECUEN SET RecExiTeo=?, RecExiRea=?, RecExiTcc=?, RecExiRcc=?, RecPreRec=?, RecExiTAc=?, RecExiRAc=?, RecUbic=?, RecMemCant=?, RecLot=?, RecEstInv=?, Rechora=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK, "TXPRECUEN")
         ,new UpdateCursor("T002A91", "DELETE FROM TXPRECUEN  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK, "TXPRECUEN")
         ,new ForEachCursor("T002A92", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec, CC_AlmCod FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002A93", "SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, RecFec ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               stmt.setDate(3, (java.util.Date)parms[3]);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 10 :
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
               return;
            case 19 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
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
            case 25 :
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
            case 26 :
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
            case 27 :
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
            case 28 :
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
            case 29 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
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
            case 62 :
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
            case 63 :
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
            case 64 :
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
            case 65 :
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setDate(2, (java.util.Date)parms[2]);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 4);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 4);
               stmt.setString(10, (String)parms[10], 20);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 26);
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setDateTime(14, (java.util.Date)parms[14], false);
               stmt.setString(15, (String)parms[15], 3);
               return;
            case 88 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 26);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setDateTime(12, (java.util.Date)parms[11], false);
               stmt.setString(13, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[14], 6);
               }
               stmt.setDate(15, (java.util.Date)parms[15]);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 91 :
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
      }
   }

}

