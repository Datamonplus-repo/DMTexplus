package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinvprd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECUENTO PRODUCTOS II", ""), (short)(0)) ;
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

   public tinvprd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tinvprd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinvprd_impl.class ));
   }

   public tinvprd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TINVPRD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TINVPRD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TINVPRD.htm");
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
         nBlankRcdCount1177 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1177 = (short)(1) ;
            scanStart1221177( ) ;
            while ( RcdFound1177 != 0 )
            {
               init_level_properties1177( ) ;
               getByPrimaryKey1221177( ) ;
               addRow1221177( ) ;
               scanNext1221177( ) ;
            }
            scanEnd1221177( ) ;
            nBlankRcdCount1177 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1221177( ) ;
         standaloneModal1221177( ) ;
         sMode1177 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1221177( ) ;
            edtavnRcdDeleted_1177_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1177_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1177_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1177_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecFecHr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFECHR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecFecHr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecHr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecExTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXTEO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExTeo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecExRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXREA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExRea_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecExTcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXTCC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExTcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExTcc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecExRcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXRCC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExRcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExRcc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecPreInv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPREINV_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPreInv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPreInv_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecInvSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECINVST_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecInvSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecInvSt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecExTAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXTAC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExTAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExTAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecExRAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXRAC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecExRAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExRAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtRecLot2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOT2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLot2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLot2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1177 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1221177( ) ;
            }
            sendRow1221177( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1177 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1177 = (short)(5) ;
         nRcdExists_1177 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1221177( ) ;
            while ( RcdFound1177 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401177( ) ;
               init_level_properties1177( ) ;
               standaloneNotModal1221177( ) ;
               getByPrimaryKey1221177( ) ;
               standaloneModal1221177( ) ;
               addRow1221177( ) ;
               scanNext1221177( ) ;
            }
            scanEnd1221177( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1177 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401177( ) ;
      initAll1221177( ) ;
      init_level_properties1177( ) ;
      nRcdExists_1177 = (short)(0) ;
      nIsMod_1177 = (short)(0) ;
      nRcdDeleted_1177 = (short)(0) ;
      nBlankRcdCount1177 = (short)(nBlankRcdUsr1177+nBlankRcdCount1177) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1177 > 0 )
      {
         standaloneNotModal1221177( ) ;
         standaloneModal1221177( ) ;
         addRow1221177( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRecFecHr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1177 = (short)(nBlankRcdCount1177-1) ;
      }
      Gx_mode = sMode1177 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TINVPRD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TINVPRD.htm");
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
      e111222 ();
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
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
                        e111222 ();
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
            initAll12229( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1177_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1177_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes12229( ) ;
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

   public void confirm_1220( )
   {
      beforeValidate12229( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls12229( ) ;
         }
         else
         {
            checkExtendedTable12229( ) ;
            if ( AnyError == 0 )
            {
               zm12229( 2) ;
            }
            closeExtendedTableCursors12229( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1221177( ) ;
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
         confirmValues1220( ) ;
      }
   }

   public void confirm_1221177( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1221177( ) ;
         if ( ( nRcdExists_1177 != 0 ) || ( nIsMod_1177 != 0 ) )
         {
            getKey1221177( ) ;
            if ( ( nRcdExists_1177 == 0 ) && ( nRcdDeleted_1177 == 0 ) )
            {
               if ( RcdFound1177 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1221177( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1221177( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1221177( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "RECFECHR_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRecFecHr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1177 != 0 )
               {
                  if ( nRcdDeleted_1177 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1221177( ) ;
                     load1221177( ) ;
                     beforeValidate1221177( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1221177( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1177 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1221177( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1221177( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1221177( ) ;
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
                  if ( nRcdDeleted_1177 == 0 )
                  {
                     GXCCtl = "RECFECHR_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecFecHr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1177_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecFecHr_Internalname, localUtil.ttoc( A8577RecFecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtRecExTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A8578RecExTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExRea_Internalname, GXutil.ltrim( localUtil.ntoc( A8579RecExRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExTcc_Internalname, GXutil.ltrim( localUtil.ntoc( A8580RecExTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExRcc_Internalname, GXutil.ltrim( localUtil.ntoc( A8581RecExRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPreInv_Internalname, GXutil.ltrim( localUtil.ntoc( A8582RecPreInv, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecInvSt_Internalname, GXutil.ltrim( localUtil.ntoc( A8583RecInvSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExTAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8670RecExTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExRAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8671RecExRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLot2_Internalname, GXutil.rtrim( A12286RecLot2)) ;
         httpContext.changePostValue( "ZT_"+"Z8577RecFecHr_"+sGXsfl_40_idx, localUtil.ttoc( Z8577RecFecHr, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8578RecExTeo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8578RecExTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8579RecExRea_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8579RecExRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8580RecExTcc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8580RecExTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8581RecExRcc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8581RecExRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8582RecPreInv_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8582RecPreInv, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8583RecInvSt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8583RecInvSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8670RecExTAc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8670RecExTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8671RecExRAc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8671RecExRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12286RecLot2_"+sGXsfl_40_idx, GXutil.rtrim( Z12286RecLot2)) ;
         httpContext.changePostValue( "nRcdDeleted_1177_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1177_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1177_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1177 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1177_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1177_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFECHR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecHr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXTEO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXREA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXTCC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXRCC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPREINV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreInv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECINVST_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecInvSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXTAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXRAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOT2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1220( )
   {
   }

   public void e111222( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm12229( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T01225_A718PrdNom[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
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

   public void load12229( )
   {
      /* Using cursor T01227 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A718PrdNom = T01227_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A407EmprNom = T01227_A407EmprNom[0] ;
         n407EmprNom = T01227_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm12229( -1) ;
      }
      pr_default.close(5);
      onLoadActions12229( ) ;
   }

   public void onLoadActions12229( )
   {
   }

   public void checkExtendedTable12229( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01226 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01226_A407EmprNom[0] ;
      n407EmprNom = T01226_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors12229( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01228 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01228_A407EmprNom[0] ;
      n407EmprNom = T01228_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey12229( )
   {
      /* Using cursor T01229 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01225 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm12229( 1) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01225_A719PrdNum[0] ;
         n719PrdNum = T01225_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T01225_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A396EmprCod = T01225_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load12229( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey12229( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey12229( ) ;
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
      getKey12229( ) ;
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
      /* Using cursor T012210 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T012210_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T012210_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012210_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T012210_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T012210_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012210_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T012210_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T012210_A719PrdNum[0] ;
            n719PrdNum = T012210_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T012211 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T012211_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T012211_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012211_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T012211_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T012211_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T012211_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T012211_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T012211_A719PrdNum[0] ;
            n719PrdNum = T012211_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey12229( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert12229( ) ;
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
               update12229( ) ;
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
               insert12229( ) ;
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
                  insert12229( ) ;
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
      getKey12229( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tinvprd");
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1220( ) ;
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
      scanStart12229( ) ;
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
      scanEnd12229( ) ;
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
      scanStart12229( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext12229( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd12229( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency12229( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01224 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z718PrdNom, T01224_A718PrdNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01224_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01224_A718PrdNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert12229( )
   {
      beforeValidate12229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12229( ) ;
      }
      if ( AnyError == 0 )
      {
         zm12229( 0) ;
         checkOptimisticConcurrency12229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12229( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert12229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012212 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel12229( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1220( ) ;
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
            load12229( ) ;
         }
         endLevel12229( ) ;
      }
      closeExtendedTableCursors12229( ) ;
   }

   public void update12229( )
   {
      beforeValidate12229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable12229( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm12229( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate12229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012213 */
                  pr_default.execute(11, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate12229( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel12229( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1220( ) ;
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
         endLevel12229( ) ;
      }
      closeExtendedTableCursors12229( ) ;
   }

   public void deferredUpdate12229( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate12229( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency12229( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls12229( ) ;
         afterConfirm12229( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete12229( ) ;
            if ( AnyError == 0 )
            {
               scanStart1221177( ) ;
               while ( RcdFound1177 != 0 )
               {
                  getByPrimaryKey1221177( ) ;
                  delete1221177( ) ;
                  scanNext1221177( ) ;
               }
               scanEnd1221177( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012214 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
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
                           initAll12229( ) ;
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
                        resetCaption1220( ) ;
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
      endLevel12229( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls12229( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T012215 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T012215_A407EmprNom[0] ;
         n407EmprNom = T012215_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T012216 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T012217 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T012218 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T012219 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T012220 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T012221 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T012222 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T012223 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T012224 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T012225 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T012226 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T012227 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T012228 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T012229 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T012230 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T012231 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T012232 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T012233 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T012234 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T012235 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T012236 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T012237 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T012238 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T012239 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T012240 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T012241 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T012242 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T012243 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T012244 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T012245 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T012246 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T012247 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T012248 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T012249 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T012250 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T012251 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T012252 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T012253 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T012254 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T012255 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T012256 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T012257 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T012258 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T012259 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T012260 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T012261 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T012262 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T012263 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T012264 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T012265 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T012266 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T012267 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T012268 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T012269 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T012270 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T012271 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T012272 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T012273 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T012274 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T012275 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T012276 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T012277 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T012278 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T012279 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T012280 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T012281 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T012282 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T012283 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T012284 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T012285 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T012286 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T012287 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T012288 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
      }
   }

   public void processNestedLevel1221177( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1221177( ) ;
         if ( ( nRcdExists_1177 != 0 ) || ( nIsMod_1177 != 0 ) )
         {
            standaloneNotModal1221177( ) ;
            getKey1221177( ) ;
            if ( ( nRcdExists_1177 == 0 ) && ( nRcdDeleted_1177 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1221177( ) ;
            }
            else
            {
               if ( RcdFound1177 != 0 )
               {
                  if ( ( nRcdDeleted_1177 != 0 ) && ( nRcdExists_1177 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1221177( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1177 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1221177( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1177 == 0 )
                  {
                     GXCCtl = "RECFECHR_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecFecHr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1177_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecFecHr_Internalname, localUtil.ttoc( A8577RecFecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtRecExTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A8578RecExTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExRea_Internalname, GXutil.ltrim( localUtil.ntoc( A8579RecExRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExTcc_Internalname, GXutil.ltrim( localUtil.ntoc( A8580RecExTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExRcc_Internalname, GXutil.ltrim( localUtil.ntoc( A8581RecExRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPreInv_Internalname, GXutil.ltrim( localUtil.ntoc( A8582RecPreInv, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecInvSt_Internalname, GXutil.ltrim( localUtil.ntoc( A8583RecInvSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExTAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8670RecExTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecExRAc_Internalname, GXutil.ltrim( localUtil.ntoc( A8671RecExRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLot2_Internalname, GXutil.rtrim( A12286RecLot2)) ;
         httpContext.changePostValue( "ZT_"+"Z8577RecFecHr_"+sGXsfl_40_idx, localUtil.ttoc( Z8577RecFecHr, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8578RecExTeo_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8578RecExTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8579RecExRea_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8579RecExRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8580RecExTcc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8580RecExTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8581RecExRcc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8581RecExRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8582RecPreInv_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8582RecPreInv, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8583RecInvSt_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8583RecInvSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8670RecExTAc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8670RecExTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8671RecExRAc_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z8671RecExRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12286RecLot2_"+sGXsfl_40_idx, GXutil.rtrim( Z12286RecLot2)) ;
         httpContext.changePostValue( "nRcdDeleted_1177_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1177_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1177_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1177 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1177_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1177_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFECHR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecHr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXTEO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTeo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXREA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXTCC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXRCC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPREINV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreInv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECINVST_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecInvSt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXTAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECEXRAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRAc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOT2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1221177( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1177 = (short)(0) ;
      nIsMod_1177 = (short)(0) ;
      nRcdDeleted_1177 = (short)(0) ;
   }

   public void processLevel12229( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1221177( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel12229( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete12229( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tinvprd");
         if ( AnyError == 0 )
         {
            confirmValues1220( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tinvprd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart12229( )
   {
      /* Using cursor T012289 */
      pr_default.execute(87);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T012289_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T012289_A719PrdNum[0] ;
         n719PrdNum = T012289_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext12229( )
   {
      /* Scan next routine */
      pr_default.readNext(87);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(87) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T012289_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T012289_A719PrdNum[0] ;
         n719PrdNum = T012289_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd12229( )
   {
      pr_default.close(87);
   }

   public void afterConfirm12229( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert12229( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate12229( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete12229( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete12229( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate12229( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes12229( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1221177( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8578RecExTeo = T01223_A8578RecExTeo[0] ;
            Z8579RecExRea = T01223_A8579RecExRea[0] ;
            Z8580RecExTcc = T01223_A8580RecExTcc[0] ;
            Z8581RecExRcc = T01223_A8581RecExRcc[0] ;
            Z8582RecPreInv = T01223_A8582RecPreInv[0] ;
            Z8583RecInvSt = T01223_A8583RecInvSt[0] ;
            Z8670RecExTAc = T01223_A8670RecExTAc[0] ;
            Z8671RecExRAc = T01223_A8671RecExRAc[0] ;
            Z12286RecLot2 = T01223_A12286RecLot2[0] ;
         }
         else
         {
            Z8578RecExTeo = A8578RecExTeo ;
            Z8579RecExRea = A8579RecExRea ;
            Z8580RecExTcc = A8580RecExTcc ;
            Z8581RecExRcc = A8581RecExRcc ;
            Z8582RecPreInv = A8582RecPreInv ;
            Z8583RecInvSt = A8583RecInvSt ;
            Z8670RecExTAc = A8670RecExTAc ;
            Z8671RecExRAc = A8671RecExRAc ;
            Z12286RecLot2 = A12286RecLot2 ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z719PrdNum = A719PrdNum ;
         Z8577RecFecHr = A8577RecFecHr ;
         Z8578RecExTeo = A8578RecExTeo ;
         Z8579RecExRea = A8579RecExRea ;
         Z8580RecExTcc = A8580RecExTcc ;
         Z8581RecExRcc = A8581RecExRcc ;
         Z8582RecPreInv = A8582RecPreInv ;
         Z8583RecInvSt = A8583RecInvSt ;
         Z8670RecExTAc = A8670RecExTAc ;
         Z8671RecExRAc = A8671RecExRAc ;
         Z12286RecLot2 = A12286RecLot2 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1221177( )
   {
   }

   public void standaloneModal1221177( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRecFecHr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecFecHr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecHr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtRecFecHr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecFecHr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecHr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1221177( )
   {
      /* Using cursor T012290 */
      pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound1177 = (short)(1) ;
         A8578RecExTeo = T012290_A8578RecExTeo[0] ;
         n8578RecExTeo = T012290_n8578RecExTeo[0] ;
         A8579RecExRea = T012290_A8579RecExRea[0] ;
         n8579RecExRea = T012290_n8579RecExRea[0] ;
         A8580RecExTcc = T012290_A8580RecExTcc[0] ;
         n8580RecExTcc = T012290_n8580RecExTcc[0] ;
         A8581RecExRcc = T012290_A8581RecExRcc[0] ;
         n8581RecExRcc = T012290_n8581RecExRcc[0] ;
         A8582RecPreInv = T012290_A8582RecPreInv[0] ;
         n8582RecPreInv = T012290_n8582RecPreInv[0] ;
         A8583RecInvSt = T012290_A8583RecInvSt[0] ;
         n8583RecInvSt = T012290_n8583RecInvSt[0] ;
         A8670RecExTAc = T012290_A8670RecExTAc[0] ;
         n8670RecExTAc = T012290_n8670RecExTAc[0] ;
         A8671RecExRAc = T012290_A8671RecExRAc[0] ;
         n8671RecExRAc = T012290_n8671RecExRAc[0] ;
         A12286RecLot2 = T012290_A12286RecLot2[0] ;
         n12286RecLot2 = T012290_n12286RecLot2[0] ;
         zm1221177( -3) ;
      }
      pr_default.close(88);
      onLoadActions1221177( ) ;
   }

   public void onLoadActions1221177( )
   {
   }

   public void checkExtendedTable1221177( )
   {
      nIsDirty_1177 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1221177( ) ;
   }

   public void closeExtendedTableCursors1221177( )
   {
   }

   public void enableDisable1221177( )
   {
   }

   public void getKey1221177( )
   {
      /* Using cursor T012291 */
      pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound1177 = (short)(1) ;
      }
      else
      {
         RcdFound1177 = (short)(0) ;
      }
      pr_default.close(89);
   }

   public void getByPrimaryKey1221177( )
   {
      /* Using cursor T01223 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1221177( 3) ;
         RcdFound1177 = (short)(1) ;
         initializeNonKey1221177( ) ;
         A8577RecFecHr = T01223_A8577RecFecHr[0] ;
         A8578RecExTeo = T01223_A8578RecExTeo[0] ;
         n8578RecExTeo = T01223_n8578RecExTeo[0] ;
         A8579RecExRea = T01223_A8579RecExRea[0] ;
         n8579RecExRea = T01223_n8579RecExRea[0] ;
         A8580RecExTcc = T01223_A8580RecExTcc[0] ;
         n8580RecExTcc = T01223_n8580RecExTcc[0] ;
         A8581RecExRcc = T01223_A8581RecExRcc[0] ;
         n8581RecExRcc = T01223_n8581RecExRcc[0] ;
         A8582RecPreInv = T01223_A8582RecPreInv[0] ;
         n8582RecPreInv = T01223_n8582RecPreInv[0] ;
         A8583RecInvSt = T01223_A8583RecInvSt[0] ;
         n8583RecInvSt = T01223_n8583RecInvSt[0] ;
         A8670RecExTAc = T01223_A8670RecExTAc[0] ;
         n8670RecExTAc = T01223_n8670RecExTAc[0] ;
         A8671RecExRAc = T01223_A8671RecExRAc[0] ;
         n8671RecExRAc = T01223_n8671RecExRAc[0] ;
         A12286RecLot2 = T01223_A12286RecLot2[0] ;
         n12286RecLot2 = T01223_n12286RecLot2[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z8577RecFecHr = A8577RecFecHr ;
         sMode1177 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1221177( ) ;
         load1221177( ) ;
         Gx_mode = sMode1177 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1177 = (short)(0) ;
         initializeNonKey1221177( ) ;
         sMode1177 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1221177( ) ;
         Gx_mode = sMode1177 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1221177( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1221177( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01222 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINVPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8578RecExTeo, T01222_A8578RecExTeo[0]) != 0 ) || ( DecimalUtil.compareTo(Z8579RecExRea, T01222_A8579RecExRea[0]) != 0 ) || ( DecimalUtil.compareTo(Z8580RecExTcc, T01222_A8580RecExTcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8581RecExRcc, T01222_A8581RecExRcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8582RecPreInv, T01222_A8582RecPreInv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8583RecInvSt != T01222_A8583RecInvSt[0] ) || ( DecimalUtil.compareTo(Z8670RecExTAc, T01222_A8670RecExTAc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8671RecExRAc, T01222_A8671RecExRAc[0]) != 0 ) || ( GXutil.strcmp(Z12286RecLot2, T01222_A12286RecLot2[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8578RecExTeo, T01222_A8578RecExTeo[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecExTeo");
               GXutil.writeLogRaw("Old: ",Z8578RecExTeo);
               GXutil.writeLogRaw("Current: ",T01222_A8578RecExTeo[0]);
            }
            if ( DecimalUtil.compareTo(Z8579RecExRea, T01222_A8579RecExRea[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecExRea");
               GXutil.writeLogRaw("Old: ",Z8579RecExRea);
               GXutil.writeLogRaw("Current: ",T01222_A8579RecExRea[0]);
            }
            if ( DecimalUtil.compareTo(Z8580RecExTcc, T01222_A8580RecExTcc[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecExTcc");
               GXutil.writeLogRaw("Old: ",Z8580RecExTcc);
               GXutil.writeLogRaw("Current: ",T01222_A8580RecExTcc[0]);
            }
            if ( DecimalUtil.compareTo(Z8581RecExRcc, T01222_A8581RecExRcc[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecExRcc");
               GXutil.writeLogRaw("Old: ",Z8581RecExRcc);
               GXutil.writeLogRaw("Current: ",T01222_A8581RecExRcc[0]);
            }
            if ( DecimalUtil.compareTo(Z8582RecPreInv, T01222_A8582RecPreInv[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecPreInv");
               GXutil.writeLogRaw("Old: ",Z8582RecPreInv);
               GXutil.writeLogRaw("Current: ",T01222_A8582RecPreInv[0]);
            }
            if ( Z8583RecInvSt != T01222_A8583RecInvSt[0] )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecInvSt");
               GXutil.writeLogRaw("Old: ",Z8583RecInvSt);
               GXutil.writeLogRaw("Current: ",T01222_A8583RecInvSt[0]);
            }
            if ( DecimalUtil.compareTo(Z8670RecExTAc, T01222_A8670RecExTAc[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecExTAc");
               GXutil.writeLogRaw("Old: ",Z8670RecExTAc);
               GXutil.writeLogRaw("Current: ",T01222_A8670RecExTAc[0]);
            }
            if ( DecimalUtil.compareTo(Z8671RecExRAc, T01222_A8671RecExRAc[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecExRAc");
               GXutil.writeLogRaw("Old: ",Z8671RecExRAc);
               GXutil.writeLogRaw("Current: ",T01222_A8671RecExRAc[0]);
            }
            if ( GXutil.strcmp(Z12286RecLot2, T01222_A12286RecLot2[0]) != 0 )
            {
               GXutil.writeLogln("tinvprd:[seudo value changed for attri]"+"RecLot2");
               GXutil.writeLogRaw("Old: ",Z12286RecLot2);
               GXutil.writeLogRaw("Current: ",T01222_A12286RecLot2[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINVPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1221177( )
   {
      beforeValidate1221177( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1221177( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1221177( 0) ;
         checkOptimisticConcurrency1221177( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1221177( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1221177( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T012292 */
                  pr_default.execute(90, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr, Boolean.valueOf(n8578RecExTeo), A8578RecExTeo, Boolean.valueOf(n8579RecExRea), A8579RecExRea, Boolean.valueOf(n8580RecExTcc), A8580RecExTcc, Boolean.valueOf(n8581RecExRcc), A8581RecExRcc, Boolean.valueOf(n8582RecPreInv), A8582RecPreInv, Boolean.valueOf(n8583RecInvSt), Byte.valueOf(A8583RecInvSt), Boolean.valueOf(n8670RecExTAc), A8670RecExTAc, Boolean.valueOf(n8671RecExRAc), A8671RecExRAc, Boolean.valueOf(n12286RecLot2), A12286RecLot2, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
                  if ( (pr_default.getStatus(90) == 1) )
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
            load1221177( ) ;
         }
         endLevel1221177( ) ;
      }
      closeExtendedTableCursors1221177( ) ;
   }

   public void update1221177( )
   {
      beforeValidate1221177( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1221177( ) ;
      }
      if ( ( nIsMod_1177 != 0 ) || ( nIsDirty_1177 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1221177( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1221177( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1221177( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T012293 */
                     pr_default.execute(91, new Object[] {Boolean.valueOf(n8578RecExTeo), A8578RecExTeo, Boolean.valueOf(n8579RecExRea), A8579RecExRea, Boolean.valueOf(n8580RecExTcc), A8580RecExTcc, Boolean.valueOf(n8581RecExRcc), A8581RecExRcc, Boolean.valueOf(n8582RecPreInv), A8582RecPreInv, Boolean.valueOf(n8583RecInvSt), Byte.valueOf(A8583RecInvSt), Boolean.valueOf(n8670RecExTAc), A8670RecExTAc, Boolean.valueOf(n8671RecExRAc), A8671RecExRAc, Boolean.valueOf(n12286RecLot2), A12286RecLot2, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
                     if ( (pr_default.getStatus(91) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINVPRD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1221177( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1221177( ) ;
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
            endLevel1221177( ) ;
         }
      }
      closeExtendedTableCursors1221177( ) ;
   }

   public void deferredUpdate1221177( )
   {
   }

   public void delete1221177( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1221177( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1221177( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1221177( ) ;
         afterConfirm1221177( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1221177( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T012294 */
               pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINVPRD");
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
      sMode1177 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1221177( ) ;
      Gx_mode = sMode1177 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1221177( )
   {
      standaloneModal1221177( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T012295 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8577RecFecHr});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
      }
   }

   public void endLevel1221177( )
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

   public void scanStart1221177( )
   {
      /* Scan By routine */
      /* Using cursor T012296 */
      pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1177 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound1177 = (short)(1) ;
         A8577RecFecHr = T012296_A8577RecFecHr[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1221177( )
   {
      /* Scan next routine */
      pr_default.readNext(94);
      RcdFound1177 = (short)(0) ;
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound1177 = (short)(1) ;
         A8577RecFecHr = T012296_A8577RecFecHr[0] ;
      }
   }

   public void scanEnd1221177( )
   {
      pr_default.close(94);
   }

   public void afterConfirm1221177( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1221177( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1221177( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1221177( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1221177( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1221177( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1221177( )
   {
      edtRecFecHr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecHr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecHr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecExTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExTeo_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecExRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExRea_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecExTcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExTcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExTcc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecExRcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExRcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExRcc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecPreInv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPreInv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPreInv_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecInvSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecInvSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecInvSt_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecExTAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExTAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExTAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecExRAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExRAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExRAc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtRecLot2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLot2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLot2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1221177( )
   {
   }

   public void send_integrity_lvl_hashes12229( )
   {
   }

   public void subsflControlProps_401177( )
   {
      edtavnRcdDeleted_1177_Internalname = "vNRCDDELETED_1177_"+sGXsfl_40_idx ;
      edtRecFecHr_Internalname = "RECFECHR_"+sGXsfl_40_idx ;
      edtRecExTeo_Internalname = "RECEXTEO_"+sGXsfl_40_idx ;
      edtRecExRea_Internalname = "RECEXREA_"+sGXsfl_40_idx ;
      edtRecExTcc_Internalname = "RECEXTCC_"+sGXsfl_40_idx ;
      edtRecExRcc_Internalname = "RECEXRCC_"+sGXsfl_40_idx ;
      edtRecPreInv_Internalname = "RECPREINV_"+sGXsfl_40_idx ;
      edtRecInvSt_Internalname = "RECINVST_"+sGXsfl_40_idx ;
      edtRecExTAc_Internalname = "RECEXTAC_"+sGXsfl_40_idx ;
      edtRecExRAc_Internalname = "RECEXRAC_"+sGXsfl_40_idx ;
      edtRecLot2_Internalname = "RECLOT2_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401177( )
   {
      edtavnRcdDeleted_1177_Internalname = "vNRCDDELETED_1177_"+sGXsfl_40_fel_idx ;
      edtRecFecHr_Internalname = "RECFECHR_"+sGXsfl_40_fel_idx ;
      edtRecExTeo_Internalname = "RECEXTEO_"+sGXsfl_40_fel_idx ;
      edtRecExRea_Internalname = "RECEXREA_"+sGXsfl_40_fel_idx ;
      edtRecExTcc_Internalname = "RECEXTCC_"+sGXsfl_40_fel_idx ;
      edtRecExRcc_Internalname = "RECEXRCC_"+sGXsfl_40_fel_idx ;
      edtRecPreInv_Internalname = "RECPREINV_"+sGXsfl_40_fel_idx ;
      edtRecInvSt_Internalname = "RECINVST_"+sGXsfl_40_fel_idx ;
      edtRecExTAc_Internalname = "RECEXTAC_"+sGXsfl_40_fel_idx ;
      edtRecExRAc_Internalname = "RECEXRAC_"+sGXsfl_40_fel_idx ;
      edtRecLot2_Internalname = "RECLOT2_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1221177( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401177( ) ;
      sendRow1221177( ) ;
   }

   public void sendRow1221177( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1177_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1177_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1177), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1177), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1177_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1177_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecHr_Internalname,localUtil.ttoc( A8577RecFecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A8577RecFecHr, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFecHr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecFecHr_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A8578RecExTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExTeo_Enabled!=0) ? localUtil.format( A8578RecExTeo, "ZZZZZZ9.9999") : localUtil.format( A8578RecExTeo, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExTeo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExRea_Internalname,GXutil.ltrim( localUtil.ntoc( A8579RecExRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExRea_Enabled!=0) ? localUtil.format( A8579RecExRea, "ZZZZZZ9.9999") : localUtil.format( A8579RecExRea, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExTcc_Internalname,GXutil.ltrim( localUtil.ntoc( A8580RecExTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExTcc_Enabled!=0) ? localUtil.format( A8580RecExTcc, "ZZZZZZ9.9999") : localUtil.format( A8580RecExTcc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExTcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExTcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExRcc_Internalname,GXutil.ltrim( localUtil.ntoc( A8581RecExRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExRcc_Enabled!=0) ? localUtil.format( A8581RecExRcc, "ZZZZZZ9.9999") : localUtil.format( A8581RecExRcc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExRcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExRcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPreInv_Internalname,GXutil.ltrim( localUtil.ntoc( A8582RecPreInv, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecPreInv_Enabled!=0) ? localUtil.format( A8582RecPreInv, "ZZZZ9.99999") : localUtil.format( A8582RecPreInv, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPreInv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecPreInv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecInvSt_Internalname,GXutil.ltrim( localUtil.ntoc( A8583RecInvSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecInvSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8583RecInvSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A8583RecInvSt), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecInvSt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecInvSt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExTAc_Internalname,GXutil.ltrim( localUtil.ntoc( A8670RecExTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExTAc_Enabled!=0) ? localUtil.format( A8670RecExTAc, "ZZZZZZ9.9999") : localUtil.format( A8670RecExTAc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExTAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExTAc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExRAc_Internalname,GXutil.ltrim( localUtil.ntoc( A8671RecExRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecExRAc_Enabled!=0) ? localUtil.format( A8671RecExRAc, "ZZZZZZ9.9999") : localUtil.format( A8671RecExRAc, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExRAc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecExRAc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1177_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLot2_Internalname,GXutil.rtrim( A12286RecLot2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLot2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRecLot2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1221177( ) ;
      GXCCtl = "Z8577RecFecHr_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z8577RecFecHr, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z8578RecExTeo_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8578RecExTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8579RecExRea_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8579RecExRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8580RecExTcc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8580RecExTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8581RecExRcc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8581RecExRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8582RecPreInv_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8582RecPreInv, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8583RecInvSt_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8583RecInvSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8670RecExTAc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8670RecExTAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8671RecExRAc_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8671RecExRAc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12286RecLot2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12286RecLot2));
      GXCCtl = "nRcdDeleted_1177_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1177_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1177_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1177, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1177_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1177_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFECHR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecHr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXTEO_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXREA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXTCC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXRCC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPREINV_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreInv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECINVST_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecInvSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXTAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXRAC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOT2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1221177( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401177( ) ;
      edtavnRcdDeleted_1177_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1177_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecFecHr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFECHR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExTeo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXTEO_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXREA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExTcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXTCC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExRcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXRCC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPreInv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPREINV_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecInvSt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECINVST_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExTAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXTAC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecExRAc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECEXRAC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLot2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOT2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1177_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1177_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1177");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1177_Internalname ;
         wbErr = true ;
         nRcdDeleted_1177 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1177 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1177_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtRecFecHr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "RECFECHR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecFecHr_Internalname ;
         wbErr = true ;
         A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A8577RecFecHr = localUtil.ctot( httpContext.cgiGet( edtRecFecHr_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExTeo_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExTeo_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXTEO_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExTeo_Internalname ;
         wbErr = true ;
         A8578RecExTeo = DecimalUtil.ZERO ;
         n8578RecExTeo = false ;
      }
      else
      {
         A8578RecExTeo = localUtil.ctond( httpContext.cgiGet( edtRecExTeo_Internalname)) ;
         n8578RecExTeo = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExRea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExRea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXREA_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExRea_Internalname ;
         wbErr = true ;
         A8579RecExRea = DecimalUtil.ZERO ;
         n8579RecExRea = false ;
      }
      else
      {
         A8579RecExRea = localUtil.ctond( httpContext.cgiGet( edtRecExRea_Internalname)) ;
         n8579RecExRea = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExTcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExTcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXTCC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExTcc_Internalname ;
         wbErr = true ;
         A8580RecExTcc = DecimalUtil.ZERO ;
         n8580RecExTcc = false ;
      }
      else
      {
         A8580RecExTcc = localUtil.ctond( httpContext.cgiGet( edtRecExTcc_Internalname)) ;
         n8580RecExTcc = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExRcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExRcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXRCC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExRcc_Internalname ;
         wbErr = true ;
         A8581RecExRcc = DecimalUtil.ZERO ;
         n8581RecExRcc = false ;
      }
      else
      {
         A8581RecExRcc = localUtil.ctond( httpContext.cgiGet( edtRecExRcc_Internalname)) ;
         n8581RecExRcc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecPreInv_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecPreInv_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "RECPREINV_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPreInv_Internalname ;
         wbErr = true ;
         A8582RecPreInv = DecimalUtil.ZERO ;
         n8582RecPreInv = false ;
      }
      else
      {
         A8582RecPreInv = localUtil.ctond( httpContext.cgiGet( edtRecPreInv_Internalname)) ;
         n8582RecPreInv = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecInvSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecInvSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "RECINVST_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecInvSt_Internalname ;
         wbErr = true ;
         A8583RecInvSt = (byte)(0) ;
         n8583RecInvSt = false ;
      }
      else
      {
         A8583RecInvSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecInvSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8583RecInvSt = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExTAc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExTAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXTAC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExTAc_Internalname ;
         wbErr = true ;
         A8670RecExTAc = DecimalUtil.ZERO ;
         n8670RecExTAc = false ;
      }
      else
      {
         A8670RecExTAc = localUtil.ctond( httpContext.cgiGet( edtRecExTAc_Internalname)) ;
         n8670RecExTAc = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExRAc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExRAc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "RECEXRAC_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecExRAc_Internalname ;
         wbErr = true ;
         A8671RecExRAc = DecimalUtil.ZERO ;
         n8671RecExRAc = false ;
      }
      else
      {
         A8671RecExRAc = localUtil.ctond( httpContext.cgiGet( edtRecExRAc_Internalname)) ;
         n8671RecExRAc = false ;
      }
      A12286RecLot2 = httpContext.cgiGet( edtRecLot2_Internalname) ;
      n12286RecLot2 = false ;
      GXCCtl = "Z8577RecFecHr_" + sGXsfl_40_idx ;
      Z8577RecFecHr = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8578RecExTeo_" + sGXsfl_40_idx ;
      Z8578RecExTeo = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8579RecExRea_" + sGXsfl_40_idx ;
      Z8579RecExRea = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8580RecExTcc_" + sGXsfl_40_idx ;
      Z8580RecExTcc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8581RecExRcc_" + sGXsfl_40_idx ;
      Z8581RecExRcc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8582RecPreInv_" + sGXsfl_40_idx ;
      Z8582RecPreInv = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8583RecInvSt_" + sGXsfl_40_idx ;
      Z8583RecInvSt = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8670RecExTAc_" + sGXsfl_40_idx ;
      Z8670RecExTAc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8671RecExRAc_" + sGXsfl_40_idx ;
      Z8671RecExRAc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12286RecLot2_" + sGXsfl_40_idx ;
      Z12286RecLot2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1177_" + sGXsfl_40_idx ;
      nRcdDeleted_1177 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1177_" + sGXsfl_40_idx ;
      nRcdExists_1177 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1177_" + sGXsfl_40_idx ;
      nIsMod_1177 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRecFecHr_Enabled = edtRecFecHr_Enabled ;
   }

   public void confirmValues1220( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401177( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401177( ) ;
         httpContext.changePostValue( "Z8577RecFecHr_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8577RecFecHr_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8577RecFecHr_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8578RecExTeo_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8578RecExTeo_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8578RecExTeo_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8579RecExRea_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8579RecExRea_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8579RecExRea_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8580RecExTcc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8580RecExTcc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8580RecExTcc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8581RecExRcc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8581RecExRcc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8581RecExRcc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8582RecPreInv_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8582RecPreInv_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8582RecPreInv_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8583RecInvSt_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8583RecInvSt_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8583RecInvSt_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8670RecExTAc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8670RecExTAc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8670RecExTAc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z8671RecExRAc_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z8671RecExRAc_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8671RecExRAc_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12286RecLot2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12286RecLot2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12286RecLot2_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tinvprd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tinvprd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TINVPRD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECUENTO PRODUCTOS II", "") ;
   }

   public void initializeNonKey12229( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      Z718PrdNom = "" ;
   }

   public void initAll12229( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey12229( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1221177( )
   {
      A8578RecExTeo = DecimalUtil.ZERO ;
      n8578RecExTeo = false ;
      A8579RecExRea = DecimalUtil.ZERO ;
      n8579RecExRea = false ;
      A8580RecExTcc = DecimalUtil.ZERO ;
      n8580RecExTcc = false ;
      A8581RecExRcc = DecimalUtil.ZERO ;
      n8581RecExRcc = false ;
      A8582RecPreInv = DecimalUtil.ZERO ;
      n8582RecPreInv = false ;
      A8583RecInvSt = (byte)(0) ;
      n8583RecInvSt = false ;
      A8670RecExTAc = DecimalUtil.ZERO ;
      n8670RecExTAc = false ;
      A8671RecExRAc = DecimalUtil.ZERO ;
      n8671RecExRAc = false ;
      A12286RecLot2 = "" ;
      n12286RecLot2 = false ;
      Z8578RecExTeo = DecimalUtil.ZERO ;
      Z8579RecExRea = DecimalUtil.ZERO ;
      Z8580RecExTcc = DecimalUtil.ZERO ;
      Z8581RecExRcc = DecimalUtil.ZERO ;
      Z8582RecPreInv = DecimalUtil.ZERO ;
      Z8583RecInvSt = (byte)(0) ;
      Z8670RecExTAc = DecimalUtil.ZERO ;
      Z8671RecExRAc = DecimalUtil.ZERO ;
      Z12286RecLot2 = "" ;
   }

   public void initAll1221177( )
   {
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      initializeNonKey1221177( ) ;
   }

   public void standaloneModalInsert1221177( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154827", true, true);
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
      httpContext.AddJavascriptSource("tinvprd.js", "?2026824154827", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1177( )
   {
      edtRecFecHr_Enabled = defedtRecFecHr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecHr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecHr_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1177, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1177_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A8577RecFecHr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecHr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8578RecExTeo, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTeo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8579RecExRea, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8580RecExTcc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8581RecExRcc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8582RecPreInv, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPreInv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8583RecInvSt, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecInvSt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8670RecExTAc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExTAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8671RecExRAc, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecExRAc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12286RecLot2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLot2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1177_Internalname = "vNRCDDELETED_1177" ;
      edtRecFecHr_Internalname = "RECFECHR" ;
      edtRecExTeo_Internalname = "RECEXTEO" ;
      edtRecExRea_Internalname = "RECEXREA" ;
      edtRecExTcc_Internalname = "RECEXTCC" ;
      edtRecExRcc_Internalname = "RECEXRCC" ;
      edtRecPreInv_Internalname = "RECPREINV" ;
      edtRecInvSt_Internalname = "RECINVST" ;
      edtRecExTAc_Internalname = "RECEXTAC" ;
      edtRecExRAc_Internalname = "RECEXRAC" ;
      edtRecLot2_Internalname = "RECLOT2" ;
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
      Form.setCaption( httpContext.getMessage( "RECUENTO PRODUCTOS II", "") );
      edtRecLot2_Jsonclick = "" ;
      edtRecExRAc_Jsonclick = "" ;
      edtRecExTAc_Jsonclick = "" ;
      edtRecInvSt_Jsonclick = "" ;
      edtRecPreInv_Jsonclick = "" ;
      edtRecExRcc_Jsonclick = "" ;
      edtRecExTcc_Jsonclick = "" ;
      edtRecExRea_Jsonclick = "" ;
      edtRecExTeo_Jsonclick = "" ;
      edtRecFecHr_Jsonclick = "" ;
      edtavnRcdDeleted_1177_Jsonclick = "" ;
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
      edtRecLot2_Enabled = 1 ;
      edtRecExRAc_Enabled = 1 ;
      edtRecExTAc_Enabled = 1 ;
      edtRecInvSt_Enabled = 1 ;
      edtRecPreInv_Enabled = 1 ;
      edtRecExRcc_Enabled = 1 ;
      edtRecExTcc_Enabled = 1 ;
      edtRecExRea_Enabled = 1 ;
      edtRecExTeo_Enabled = 1 ;
      edtRecFecHr_Enabled = 1 ;
      edtavnRcdDeleted_1177_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_401177( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1221177( ) ;
         standaloneModal1221177( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1221177( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401177( ) ;
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
      /* Using cursor T012215 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T012215_A407EmprNom[0] ;
      n407EmprNom = T012215_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T012215 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T012215_A407EmprNom[0] ;
      n407EmprNom = T012215_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z718PrdNom'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECFECHR","{handler:'valid_Recfechr',iparms:[]");
      setEventMetadata("VALID_RECFECHR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Reclot2',iparms:[]");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      Z8578RecExTeo = DecimalUtil.ZERO ;
      Z8579RecExRea = DecimalUtil.ZERO ;
      Z8580RecExTcc = DecimalUtil.ZERO ;
      Z8581RecExRcc = DecimalUtil.ZERO ;
      Z8582RecPreInv = DecimalUtil.ZERO ;
      Z8670RecExTAc = DecimalUtil.ZERO ;
      Z8671RecExRAc = DecimalUtil.ZERO ;
      Z12286RecLot2 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      lblTextblock2_Jsonclick = "" ;
      A719PrdNum = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A718PrdNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1177 = "" ;
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
      sMode29 = "" ;
      GXCCtl = "" ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      A8578RecExTeo = DecimalUtil.ZERO ;
      A8579RecExRea = DecimalUtil.ZERO ;
      A8580RecExTcc = DecimalUtil.ZERO ;
      A8581RecExRcc = DecimalUtil.ZERO ;
      A8582RecPreInv = DecimalUtil.ZERO ;
      A8670RecExTAc = DecimalUtil.ZERO ;
      A8671RecExRAc = DecimalUtil.ZERO ;
      A12286RecLot2 = "" ;
      Z407EmprNom = "" ;
      T01227_A719PrdNum = new String[] {""} ;
      T01227_n719PrdNum = new boolean[] {false} ;
      T01227_A718PrdNom = new String[] {""} ;
      T01227_A407EmprNom = new String[] {""} ;
      T01227_n407EmprNom = new boolean[] {false} ;
      T01227_A396EmprCod = new String[] {""} ;
      T01226_A407EmprNom = new String[] {""} ;
      T01226_n407EmprNom = new boolean[] {false} ;
      T01228_A407EmprNom = new String[] {""} ;
      T01228_n407EmprNom = new boolean[] {false} ;
      T01229_A396EmprCod = new String[] {""} ;
      T01229_A719PrdNum = new String[] {""} ;
      T01229_n719PrdNum = new boolean[] {false} ;
      T01225_A719PrdNum = new String[] {""} ;
      T01225_n719PrdNum = new boolean[] {false} ;
      T01225_A718PrdNom = new String[] {""} ;
      T01225_A396EmprCod = new String[] {""} ;
      T012210_A396EmprCod = new String[] {""} ;
      T012210_A719PrdNum = new String[] {""} ;
      T012210_n719PrdNum = new boolean[] {false} ;
      T012211_A396EmprCod = new String[] {""} ;
      T012211_A719PrdNum = new String[] {""} ;
      T012211_n719PrdNum = new boolean[] {false} ;
      T01224_A719PrdNum = new String[] {""} ;
      T01224_n719PrdNum = new boolean[] {false} ;
      T01224_A718PrdNom = new String[] {""} ;
      T01224_A396EmprCod = new String[] {""} ;
      T012215_A407EmprNom = new String[] {""} ;
      T012215_n407EmprNom = new boolean[] {false} ;
      T012216_A396EmprCod = new String[] {""} ;
      T012216_A719PrdNum = new String[] {""} ;
      T012216_n719PrdNum = new boolean[] {false} ;
      T012216_A13217NormaID = new String[] {""} ;
      T012217_A396EmprCod = new String[] {""} ;
      T012217_A719PrdNum = new String[] {""} ;
      T012217_n719PrdNum = new boolean[] {false} ;
      T012217_A13586TheList = new String[] {""} ;
      T012218_A396EmprCod = new String[] {""} ;
      T012218_A5532Lb_numero = new int[1] ;
      T012218_A5555Lb_opcion = new String[] {""} ;
      T012218_A13460Lb_linCP = new short[1] ;
      T012218_A13458Lb_TipCP = new String[] {""} ;
      T012219_A396EmprCod = new String[] {""} ;
      T012219_A13418AlbProID = new int[1] ;
      T012219_A13442AlbProLine = new short[1] ;
      T012220_A396EmprCod = new String[] {""} ;
      T012220_A13324LDESID = new int[1] ;
      T012220_A13333LDESNPeque = new String[] {""} ;
      T012220_A13337LDESComb = new String[] {""} ;
      T012220_A13339LDESFondo = new String[] {""} ;
      T012220_A13342LDESLinea = new short[1] ;
      T012221_A396EmprCod = new String[] {""} ;
      T012221_A13312Lb_NLab = new int[1] ;
      T012221_A13305Lb_IDVeces = new short[1] ;
      T012221_A13306Lb_LinID = new short[1] ;
      T012222_A396EmprCod = new String[] {""} ;
      T012222_A12673LavMqId = new int[1] ;
      T012222_A12692LavMqLnPq = new short[1] ;
      T012222_A12681LavMqLn = new short[1] ;
      T012223_A396EmprCod = new String[] {""} ;
      T012223_A719PrdNum = new String[] {""} ;
      T012223_n719PrdNum = new boolean[] {false} ;
      T012223_A9713Tb1_Cod = new short[1] ;
      T012224_A396EmprCod = new String[] {""} ;
      T012224_A12236PrdNumD = new String[] {""} ;
      T012224_A719PrdNum = new String[] {""} ;
      T012224_n719PrdNum = new boolean[] {false} ;
      T012225_A396EmprCod = new String[] {""} ;
      T012225_A12225DocDisID = new long[1] ;
      T012225_A12226LinDisID = new short[1] ;
      T012226_A396EmprCod = new String[] {""} ;
      T012226_A12225DocDisID = new long[1] ;
      T012227_A396EmprCod = new String[] {""} ;
      T012227_A12205OrdenCID = new long[1] ;
      T012227_A12206OrdenCLnId = new short[1] ;
      T012228_A396EmprCod = new String[] {""} ;
      T012228_A719PrdNum = new String[] {""} ;
      T012228_n719PrdNum = new boolean[] {false} ;
      T012228_A11664LoteID = new String[] {""} ;
      T012228_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T012229_A396EmprCod = new String[] {""} ;
      T012229_A4850DevComCod = new int[1] ;
      T012229_A719PrdNum = new String[] {""} ;
      T012229_n719PrdNum = new boolean[] {false} ;
      T012230_A396EmprCod = new String[] {""} ;
      T012230_A252CliCod = new int[1] ;
      T012230_A494ForSer = new String[] {""} ;
      T012230_A482ForColNom = new String[] {""} ;
      T012230_A483ForColNum = new int[1] ;
      T012230_A831TipColCod = new byte[1] ;
      T012230_A3571EnsCod = new String[] {""} ;
      T012230_A3582EnsLin = new short[1] ;
      T012231_A396EmprCod = new String[] {""} ;
      T012231_A129BarCod = new int[1] ;
      T012231_A132BarCodReo = new byte[1] ;
      T012231_A130BarCodPar = new String[] {""} ;
      T012231_A4075recestncol = new byte[1] ;
      T012231_A4076recestnpro = new byte[1] ;
      T012231_A4108recestlin = new short[1] ;
      T012232_A396EmprCod = new String[] {""} ;
      T012232_A4052EstNumFor = new int[1] ;
      T012232_A4053EstNumCol = new byte[1] ;
      T012232_A4090EstEspLin = new byte[1] ;
      T012233_A396EmprCod = new String[] {""} ;
      T012233_A4052EstNumFor = new int[1] ;
      T012233_A4053EstNumCol = new byte[1] ;
      T012233_A4084EstProLin = new byte[1] ;
      T012234_A396EmprCod = new String[] {""} ;
      T012234_A11644TransferId = new long[1] ;
      T012234_A11653TransferLn = new int[1] ;
      T012235_A396EmprCod = new String[] {""} ;
      T012235_A11634TaesId = new String[] {""} ;
      T012235_A11637TaesLn = new short[1] ;
      T012235_A11641TaesLnP = new short[1] ;
      T012236_A396EmprCod = new String[] {""} ;
      T012236_A719PrdNum = new String[] {""} ;
      T012236_n719PrdNum = new boolean[] {false} ;
      T012236_A11329H_stklin = new long[1] ;
      T012237_A396EmprCod = new String[] {""} ;
      T012237_A11270Pot_num = new int[1] ;
      T012237_A11271Pot_lin = new short[1] ;
      T012238_A396EmprCod = new String[] {""} ;
      T012238_A719PrdNum = new String[] {""} ;
      T012238_n719PrdNum = new boolean[] {false} ;
      T012238_A11199PrdNcasC = new String[] {""} ;
      T012239_A396EmprCod = new String[] {""} ;
      T012239_A719PrdNum = new String[] {""} ;
      T012239_n719PrdNum = new boolean[] {false} ;
      T012239_A11197CFraseR = new String[] {""} ;
      T012240_A396EmprCod = new String[] {""} ;
      T012240_A10243Jt_codigo = new short[1] ;
      T012240_A10246Jt_ord = new short[1] ;
      T012241_A396EmprCod = new String[] {""} ;
      T012241_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T012241_A10238Bny_lin = new short[1] ;
      T012242_A396EmprCod = new String[] {""} ;
      T012242_A129BarCod = new int[1] ;
      T012242_A132BarCodReo = new byte[1] ;
      T012242_A130BarCodPar = new String[] {""} ;
      T012242_A758ProCod = new String[] {""} ;
      T012242_A194BarOrdLin = new short[1] ;
      T012242_A719PrdNum = new String[] {""} ;
      T012242_n719PrdNum = new boolean[] {false} ;
      T012243_A396EmprCod = new String[] {""} ;
      T012243_A719PrdNum = new String[] {""} ;
      T012243_n719PrdNum = new boolean[] {false} ;
      T012243_A9735Cod_Rgo = new String[] {""} ;
      T012244_A396EmprCod = new String[] {""} ;
      T012244_A719PrdNum = new String[] {""} ;
      T012244_n719PrdNum = new boolean[] {false} ;
      T012244_A9711Ct_codigo = new short[1] ;
      T012245_A396EmprCod = new String[] {""} ;
      T012245_A9652OeNum = new long[1] ;
      T012245_A9653OeHdr = new int[1] ;
      T012245_A9654OeHdrr = new byte[1] ;
      T012245_A9655OeHdrp = new String[] {""} ;
      T012245_A9656OeLinC = new byte[1] ;
      T012245_A9657OeComb = new String[] {""} ;
      T012245_A9658Oefondo = new String[] {""} ;
      T012245_A9659OeMolCil = new byte[1] ;
      T012245_A9686OePasLin = new short[1] ;
      T012245_A9694OePasPLi = new short[1] ;
      T012246_A396EmprCod = new String[] {""} ;
      T012246_A9652OeNum = new long[1] ;
      T012246_A9653OeHdr = new int[1] ;
      T012246_A9654OeHdrr = new byte[1] ;
      T012246_A9655OeHdrp = new String[] {""} ;
      T012246_A9656OeLinC = new byte[1] ;
      T012246_A9657OeComb = new String[] {""} ;
      T012246_A9658Oefondo = new String[] {""} ;
      T012246_A9659OeMolCil = new byte[1] ;
      T012246_A9677OeMolLin = new byte[1] ;
      T012247_A396EmprCod = new String[] {""} ;
      T012247_A9578Pas_Num = new int[1] ;
      T012247_A719PrdNum = new String[] {""} ;
      T012247_n719PrdNum = new boolean[] {false} ;
      T012248_A396EmprCod = new String[] {""} ;
      T012248_A719PrdNum = new String[] {""} ;
      T012248_n719PrdNum = new boolean[] {false} ;
      T012248_A8908CC_AlmCod = new byte[1] ;
      T012249_A396EmprCod = new String[] {""} ;
      T012249_A719PrdNum = new String[] {""} ;
      T012249_n719PrdNum = new boolean[] {false} ;
      T012249_A8661Almc_Ln = new int[1] ;
      T012250_A396EmprCod = new String[] {""} ;
      T012250_A719PrdNum = new String[] {""} ;
      T012250_n719PrdNum = new boolean[] {false} ;
      T012250_A8648Mat_PrdN = new String[] {""} ;
      T012251_A396EmprCod = new String[] {""} ;
      T012251_A8585Pet_cod = new long[1] ;
      T012251_A719PrdNum = new String[] {""} ;
      T012251_n719PrdNum = new boolean[] {false} ;
      T012252_A396EmprCod = new String[] {""} ;
      T012252_A719PrdNum = new String[] {""} ;
      T012252_n719PrdNum = new boolean[] {false} ;
      T012252_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T012252_A8908CC_AlmCod = new byte[1] ;
      T012253_A396EmprCod = new String[] {""} ;
      T012253_A719PrdNum = new String[] {""} ;
      T012253_n719PrdNum = new boolean[] {false} ;
      T012253_A8366PrdAnyo = new short[1] ;
      T012253_A8360PrdProv = new int[1] ;
      T012254_A396EmprCod = new String[] {""} ;
      T012254_A252CliCod = new int[1] ;
      T012254_A494ForSer = new String[] {""} ;
      T012254_A482ForColNom = new String[] {""} ;
      T012254_A483ForColNum = new int[1] ;
      T012254_A831TipColCod = new byte[1] ;
      T012254_A7797Sim_lin = new short[1] ;
      T012255_A396EmprCod = new String[] {""} ;
      T012255_A7163Vir_Codigo = new int[1] ;
      T012255_A719PrdNum = new String[] {""} ;
      T012255_n719PrdNum = new boolean[] {false} ;
      T012256_A396EmprCod = new String[] {""} ;
      T012256_A6310Lb_TaAuxC = new String[] {""} ;
      T012256_A6313lb_TaAuxL = new short[1] ;
      T012256_A6378Lb_TauxLP = new short[1] ;
      T012257_A396EmprCod = new String[] {""} ;
      T012257_A6290PreCoNum = new int[1] ;
      T012257_A719PrdNum = new String[] {""} ;
      T012257_n719PrdNum = new boolean[] {false} ;
      T012258_A396EmprCod = new String[] {""} ;
      T012258_A719PrdNum = new String[] {""} ;
      T012258_n719PrdNum = new boolean[] {false} ;
      T012258_A6158PrdPrv = new int[1] ;
      T012259_A396EmprCod = new String[] {""} ;
      T012259_A719PrdNum = new String[] {""} ;
      T012259_n719PrdNum = new boolean[] {false} ;
      T012259_A5973PrdSusNum = new String[] {""} ;
      T012260_A396EmprCod = new String[] {""} ;
      T012260_A5612Lb_CodGru = new String[] {""} ;
      T012260_A5615Lb_LinGru = new short[1] ;
      T012261_A396EmprCod = new String[] {""} ;
      T012261_A5532Lb_numero = new int[1] ;
      T012261_A5555Lb_opcion = new String[] {""} ;
      T012261_A5560Lb_LineaPr = new short[1] ;
      T012262_A396EmprCod = new String[] {""} ;
      T012262_A5532Lb_numero = new int[1] ;
      T012262_A5555Lb_opcion = new String[] {""} ;
      T012262_A5557Lb_LineaC = new short[1] ;
      T012263_A396EmprCod = new String[] {""} ;
      T012263_A5145SobCod = new int[1] ;
      T012263_A719PrdNum = new String[] {""} ;
      T012263_n719PrdNum = new boolean[] {false} ;
      T012264_A396EmprCod = new String[] {""} ;
      T012264_A4744RecPreCod = new int[1] ;
      T012264_A4762RecPreLin = new short[1] ;
      T012264_A4763RecPreNli = new short[1] ;
      T012265_A396EmprCod = new String[] {""} ;
      T012265_A4492HreBarCod = new int[1] ;
      T012265_A4493HreBarReo = new byte[1] ;
      T012265_A4494HreBarPar = new String[] {""} ;
      T012265_A4495HreNumCie = new byte[1] ;
      T012265_A4545HreLinMaq = new short[1] ;
      T012265_A4550HreLinPro = new byte[1] ;
      T012265_A4557HreRecLin = new short[1] ;
      T012266_A396EmprCod = new String[] {""} ;
      T012266_A4492HreBarCod = new int[1] ;
      T012266_A4493HreBarReo = new byte[1] ;
      T012266_A4494HreBarPar = new String[] {""} ;
      T012266_A4495HreNumCie = new byte[1] ;
      T012266_A4508HreLinMAL = new short[1] ;
      T012266_A4509HreNumAny = new byte[1] ;
      T012266_A719PrdNum = new String[] {""} ;
      T012266_n719PrdNum = new boolean[] {false} ;
      T012267_A396EmprCod = new String[] {""} ;
      T012267_A252CliCod = new int[1] ;
      T012267_A4415EstCol = new String[] {""} ;
      T012267_A4416EstColLin = new short[1] ;
      T012268_A396EmprCod = new String[] {""} ;
      T012268_A129BarCod = new int[1] ;
      T012268_A132BarCodReo = new byte[1] ;
      T012268_A130BarCodPar = new String[] {""} ;
      T012268_A2524DisComLin = new byte[1] ;
      T012268_A1056DisComCod = new String[] {""} ;
      T012268_A1032FonCod = new String[] {""} ;
      T012268_A2124RecMolCod = new byte[1] ;
      T012268_A2672RecPasLin = new short[1] ;
      T012268_A2675RecPasPLi = new short[1] ;
      T012269_A396EmprCod = new String[] {""} ;
      T012269_A129BarCod = new int[1] ;
      T012269_A132BarCodReo = new byte[1] ;
      T012269_A130BarCodPar = new String[] {""} ;
      T012269_A2524DisComLin = new byte[1] ;
      T012269_A1056DisComCod = new String[] {""} ;
      T012269_A1032FonCod = new String[] {""} ;
      T012269_A2124RecMolCod = new byte[1] ;
      T012269_A2126RecMolLin = new byte[1] ;
      T012270_A396EmprCod = new String[] {""} ;
      T012270_A2107PasCod = new String[] {""} ;
      T012270_A719PrdNum = new String[] {""} ;
      T012270_n719PrdNum = new boolean[] {false} ;
      T012271_A396EmprCod = new String[] {""} ;
      T012271_A2637HisEstHRu = new int[1] ;
      T012271_A2636HisEstHRe = new byte[1] ;
      T012271_A2635HisEstHPa = new String[] {""} ;
      T012271_A2638HisEstLCo = new byte[1] ;
      T012271_A2630HisEstCom = new String[] {""} ;
      T012271_A2634HisEstFon = new String[] {""} ;
      T012271_A719PrdNum = new String[] {""} ;
      T012271_n719PrdNum = new boolean[] {false} ;
      T012272_A396EmprCod = new String[] {""} ;
      T012272_A252CliCod = new int[1] ;
      T012272_A2141SerEst = new String[] {""} ;
      T012272_A1013DibCli = new String[] {""} ;
      T012272_A1014DibInt = new int[1] ;
      T012272_A2074ColCom = new String[] {""} ;
      T012272_A2078ColFon = new String[] {""} ;
      T012272_A2098MolCod = new byte[1] ;
      T012272_A2535ForPrdLin = new short[1] ;
      T012273_A396EmprCod = new String[] {""} ;
      T012273_A719PrdNum = new String[] {""} ;
      T012273_n719PrdNum = new boolean[] {false} ;
      T012273_A3342CCStkLin = new long[1] ;
      T012274_A396EmprCod = new String[] {""} ;
      T012274_A252CliCod = new int[1] ;
      T012274_A2891HMaForSer = new String[] {""} ;
      T012274_A2892HMaForCNom = new String[] {""} ;
      T012274_A2893HMaForCNum = new int[1] ;
      T012274_A2894HMaTipCCod = new byte[1] ;
      T012274_A2895HMaForNumC = new int[1] ;
      T012274_A2897HMaColLin = new short[1] ;
      T012274_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T012274_A2907HmaLin = new short[1] ;
      T012275_A396EmprCod = new String[] {""} ;
      T012275_A129BarCod = new int[1] ;
      T012275_A132BarCodReo = new byte[1] ;
      T012275_A130BarCodPar = new String[] {""} ;
      T012275_A2808RecLinMAL = new short[1] ;
      T012275_A1377RecNumAny = new byte[1] ;
      T012275_A719PrdNum = new String[] {""} ;
      T012275_n719PrdNum = new boolean[] {false} ;
      T012276_A396EmprCod = new String[] {""} ;
      T012276_A129BarCod = new int[1] ;
      T012276_A132BarCodReo = new byte[1] ;
      T012276_A130BarCodPar = new String[] {""} ;
      T012276_A2804RecLinMaq = new short[1] ;
      T012276_A1273RecLinPro = new byte[1] ;
      T012276_A811RecLin = new short[1] ;
      T012277_A396EmprCod = new String[] {""} ;
      T012277_A129BarCod = new int[1] ;
      T012277_A132BarCodReo = new byte[1] ;
      T012277_A130BarCodPar = new String[] {""} ;
      T012277_A2494BarDosPro = new String[] {""} ;
      T012277_A719PrdNum = new String[] {""} ;
      T012277_n719PrdNum = new boolean[] {false} ;
      T012278_A396EmprCod = new String[] {""} ;
      T012278_A1314EnsLabCod = new int[1] ;
      T012278_A1317EnsLabLin = new short[1] ;
      T012279_A396EmprCod = new String[] {""} ;
      T012279_A910Workstat = new String[] {""} ;
      T012279_A887EscMLin = new int[1] ;
      T012280_A396EmprCod = new String[] {""} ;
      T012280_A859CumCodCont = new int[1] ;
      T012280_A719PrdNum = new String[] {""} ;
      T012280_n719PrdNum = new boolean[] {false} ;
      T012281_A396EmprCod = new String[] {""} ;
      T012281_A719PrdNum = new String[] {""} ;
      T012281_n719PrdNum = new boolean[] {false} ;
      T012281_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T012282_A396EmprCod = new String[] {""} ;
      T012282_A486ForNumCol = new int[1] ;
      T012282_A715PrdLin = new short[1] ;
      T012283_A396EmprCod = new String[] {""} ;
      T012283_A719PrdNum = new String[] {""} ;
      T012283_n719PrdNum = new boolean[] {false} ;
      T012283_A681PrdAny = new short[1] ;
      T012284_A396EmprCod = new String[] {""} ;
      T012284_A719PrdNum = new String[] {""} ;
      T012284_n719PrdNum = new boolean[] {false} ;
      T012284_A688PrdComCod = new String[] {""} ;
      T012285_A396EmprCod = new String[] {""} ;
      T012285_A719PrdNum = new String[] {""} ;
      T012285_n719PrdNum = new boolean[] {false} ;
      T012285_A680PrdAltNum = new String[] {""} ;
      T012286_A396EmprCod = new String[] {""} ;
      T012286_A658PedCod = new int[1] ;
      T012286_A719PrdNum = new String[] {""} ;
      T012286_n719PrdNum = new boolean[] {false} ;
      T012287_A396EmprCod = new String[] {""} ;
      T012287_A486ForNumCol = new int[1] ;
      T012287_A309ColLin = new short[1] ;
      T012288_A396EmprCod = new String[] {""} ;
      T012288_A719PrdNum = new String[] {""} ;
      T012288_n719PrdNum = new boolean[] {false} ;
      T012288_A647NumCon = new int[1] ;
      T012289_A396EmprCod = new String[] {""} ;
      T012289_A719PrdNum = new String[] {""} ;
      T012289_n719PrdNum = new boolean[] {false} ;
      T012290_A719PrdNum = new String[] {""} ;
      T012290_n719PrdNum = new boolean[] {false} ;
      T012290_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T012290_A8578RecExTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8578RecExTeo = new boolean[] {false} ;
      T012290_A8579RecExRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8579RecExRea = new boolean[] {false} ;
      T012290_A8580RecExTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8580RecExTcc = new boolean[] {false} ;
      T012290_A8581RecExRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8581RecExRcc = new boolean[] {false} ;
      T012290_A8582RecPreInv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8582RecPreInv = new boolean[] {false} ;
      T012290_A8583RecInvSt = new byte[1] ;
      T012290_n8583RecInvSt = new boolean[] {false} ;
      T012290_A8670RecExTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8670RecExTAc = new boolean[] {false} ;
      T012290_A8671RecExRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T012290_n8671RecExRAc = new boolean[] {false} ;
      T012290_A12286RecLot2 = new String[] {""} ;
      T012290_n12286RecLot2 = new boolean[] {false} ;
      T012290_A396EmprCod = new String[] {""} ;
      T012291_A396EmprCod = new String[] {""} ;
      T012291_A719PrdNum = new String[] {""} ;
      T012291_n719PrdNum = new boolean[] {false} ;
      T012291_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01223_A719PrdNum = new String[] {""} ;
      T01223_n719PrdNum = new boolean[] {false} ;
      T01223_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01223_A8578RecExTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8578RecExTeo = new boolean[] {false} ;
      T01223_A8579RecExRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8579RecExRea = new boolean[] {false} ;
      T01223_A8580RecExTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8580RecExTcc = new boolean[] {false} ;
      T01223_A8581RecExRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8581RecExRcc = new boolean[] {false} ;
      T01223_A8582RecPreInv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8582RecPreInv = new boolean[] {false} ;
      T01223_A8583RecInvSt = new byte[1] ;
      T01223_n8583RecInvSt = new boolean[] {false} ;
      T01223_A8670RecExTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8670RecExTAc = new boolean[] {false} ;
      T01223_A8671RecExRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01223_n8671RecExRAc = new boolean[] {false} ;
      T01223_A12286RecLot2 = new String[] {""} ;
      T01223_n12286RecLot2 = new boolean[] {false} ;
      T01223_A396EmprCod = new String[] {""} ;
      T01222_A719PrdNum = new String[] {""} ;
      T01222_n719PrdNum = new boolean[] {false} ;
      T01222_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01222_A8578RecExTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8578RecExTeo = new boolean[] {false} ;
      T01222_A8579RecExRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8579RecExRea = new boolean[] {false} ;
      T01222_A8580RecExTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8580RecExTcc = new boolean[] {false} ;
      T01222_A8581RecExRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8581RecExRcc = new boolean[] {false} ;
      T01222_A8582RecPreInv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8582RecPreInv = new boolean[] {false} ;
      T01222_A8583RecInvSt = new byte[1] ;
      T01222_n8583RecInvSt = new boolean[] {false} ;
      T01222_A8670RecExTAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8670RecExTAc = new boolean[] {false} ;
      T01222_A8671RecExRAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01222_n8671RecExRAc = new boolean[] {false} ;
      T01222_A12286RecLot2 = new String[] {""} ;
      T01222_n12286RecLot2 = new boolean[] {false} ;
      T01222_A396EmprCod = new String[] {""} ;
      T012295_A396EmprCod = new String[] {""} ;
      T012295_A719PrdNum = new String[] {""} ;
      T012295_n719PrdNum = new boolean[] {false} ;
      T012295_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T012295_A8908CC_AlmCod = new byte[1] ;
      T012296_A396EmprCod = new String[] {""} ;
      T012296_A719PrdNum = new String[] {""} ;
      T012296_n719PrdNum = new boolean[] {false} ;
      T012296_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
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
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tinvprd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tinvprd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tinvprd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tinvprd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tinvprd__default(),
         new Object[] {
             new Object[] {
            T01222_A719PrdNum, T01222_A8577RecFecHr, T01222_A8578RecExTeo, T01222_n8578RecExTeo, T01222_A8579RecExRea, T01222_n8579RecExRea, T01222_A8580RecExTcc, T01222_n8580RecExTcc, T01222_A8581RecExRcc, T01222_n8581RecExRcc,
            T01222_A8582RecPreInv, T01222_n8582RecPreInv, T01222_A8583RecInvSt, T01222_n8583RecInvSt, T01222_A8670RecExTAc, T01222_n8670RecExTAc, T01222_A8671RecExRAc, T01222_n8671RecExRAc, T01222_A12286RecLot2, T01222_n12286RecLot2,
            T01222_A396EmprCod
            }
            , new Object[] {
            T01223_A719PrdNum, T01223_A8577RecFecHr, T01223_A8578RecExTeo, T01223_n8578RecExTeo, T01223_A8579RecExRea, T01223_n8579RecExRea, T01223_A8580RecExTcc, T01223_n8580RecExTcc, T01223_A8581RecExRcc, T01223_n8581RecExRcc,
            T01223_A8582RecPreInv, T01223_n8582RecPreInv, T01223_A8583RecInvSt, T01223_n8583RecInvSt, T01223_A8670RecExTAc, T01223_n8670RecExTAc, T01223_A8671RecExRAc, T01223_n8671RecExRAc, T01223_A12286RecLot2, T01223_n12286RecLot2,
            T01223_A396EmprCod
            }
            , new Object[] {
            T01224_A719PrdNum, T01224_A718PrdNom, T01224_A396EmprCod
            }
            , new Object[] {
            T01225_A719PrdNum, T01225_A718PrdNom, T01225_A396EmprCod
            }
            , new Object[] {
            T01226_A407EmprNom, T01226_n407EmprNom
            }
            , new Object[] {
            T01227_A719PrdNum, T01227_A718PrdNom, T01227_A407EmprNom, T01227_n407EmprNom, T01227_A396EmprCod
            }
            , new Object[] {
            T01228_A407EmprNom, T01228_n407EmprNom
            }
            , new Object[] {
            T01229_A396EmprCod, T01229_A719PrdNum
            }
            , new Object[] {
            T012210_A396EmprCod, T012210_A719PrdNum
            }
            , new Object[] {
            T012211_A396EmprCod, T012211_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012215_A407EmprNom, T012215_n407EmprNom
            }
            , new Object[] {
            T012216_A396EmprCod, T012216_A719PrdNum, T012216_A13217NormaID
            }
            , new Object[] {
            T012217_A396EmprCod, T012217_A719PrdNum, T012217_A13586TheList
            }
            , new Object[] {
            T012218_A396EmprCod, T012218_A5532Lb_numero, T012218_A5555Lb_opcion, T012218_A13460Lb_linCP, T012218_A13458Lb_TipCP
            }
            , new Object[] {
            T012219_A396EmprCod, T012219_A13418AlbProID, T012219_A13442AlbProLine
            }
            , new Object[] {
            T012220_A396EmprCod, T012220_A13324LDESID, T012220_A13333LDESNPeque, T012220_A13337LDESComb, T012220_A13339LDESFondo, T012220_A13342LDESLinea
            }
            , new Object[] {
            T012221_A396EmprCod, T012221_A13312Lb_NLab, T012221_A13305Lb_IDVeces, T012221_A13306Lb_LinID
            }
            , new Object[] {
            T012222_A396EmprCod, T012222_A12673LavMqId, T012222_A12692LavMqLnPq, T012222_A12681LavMqLn
            }
            , new Object[] {
            T012223_A396EmprCod, T012223_A719PrdNum, T012223_A9713Tb1_Cod
            }
            , new Object[] {
            T012224_A396EmprCod, T012224_A12236PrdNumD, T012224_A719PrdNum
            }
            , new Object[] {
            T012225_A396EmprCod, T012225_A12225DocDisID, T012225_A12226LinDisID
            }
            , new Object[] {
            T012226_A396EmprCod, T012226_A12225DocDisID
            }
            , new Object[] {
            T012227_A396EmprCod, T012227_A12205OrdenCID, T012227_A12206OrdenCLnId
            }
            , new Object[] {
            T012228_A396EmprCod, T012228_A719PrdNum, T012228_A11664LoteID, T012228_A11665LoteFec
            }
            , new Object[] {
            T012229_A396EmprCod, T012229_A4850DevComCod, T012229_A719PrdNum
            }
            , new Object[] {
            T012230_A396EmprCod, T012230_A252CliCod, T012230_A494ForSer, T012230_A482ForColNom, T012230_A483ForColNum, T012230_A831TipColCod, T012230_A3571EnsCod, T012230_A3582EnsLin
            }
            , new Object[] {
            T012231_A396EmprCod, T012231_A129BarCod, T012231_A132BarCodReo, T012231_A130BarCodPar, T012231_A4075recestncol, T012231_A4076recestnpro, T012231_A4108recestlin
            }
            , new Object[] {
            T012232_A396EmprCod, T012232_A4052EstNumFor, T012232_A4053EstNumCol, T012232_A4090EstEspLin
            }
            , new Object[] {
            T012233_A396EmprCod, T012233_A4052EstNumFor, T012233_A4053EstNumCol, T012233_A4084EstProLin
            }
            , new Object[] {
            T012234_A396EmprCod, T012234_A11644TransferId, T012234_A11653TransferLn
            }
            , new Object[] {
            T012235_A396EmprCod, T012235_A11634TaesId, T012235_A11637TaesLn, T012235_A11641TaesLnP
            }
            , new Object[] {
            T012236_A396EmprCod, T012236_A719PrdNum, T012236_A11329H_stklin
            }
            , new Object[] {
            T012237_A396EmprCod, T012237_A11270Pot_num, T012237_A11271Pot_lin
            }
            , new Object[] {
            T012238_A396EmprCod, T012238_A719PrdNum, T012238_A11199PrdNcasC
            }
            , new Object[] {
            T012239_A396EmprCod, T012239_A719PrdNum, T012239_A11197CFraseR
            }
            , new Object[] {
            T012240_A396EmprCod, T012240_A10243Jt_codigo, T012240_A10246Jt_ord
            }
            , new Object[] {
            T012241_A396EmprCod, T012241_A10236Bny_dia, T012241_A10238Bny_lin
            }
            , new Object[] {
            T012242_A396EmprCod, T012242_A129BarCod, T012242_A132BarCodReo, T012242_A130BarCodPar, T012242_A758ProCod, T012242_A194BarOrdLin, T012242_A719PrdNum
            }
            , new Object[] {
            T012243_A396EmprCod, T012243_A719PrdNum, T012243_A9735Cod_Rgo
            }
            , new Object[] {
            T012244_A396EmprCod, T012244_A719PrdNum, T012244_A9711Ct_codigo
            }
            , new Object[] {
            T012245_A396EmprCod, T012245_A9652OeNum, T012245_A9653OeHdr, T012245_A9654OeHdrr, T012245_A9655OeHdrp, T012245_A9656OeLinC, T012245_A9657OeComb, T012245_A9658Oefondo, T012245_A9659OeMolCil, T012245_A9686OePasLin,
            T012245_A9694OePasPLi
            }
            , new Object[] {
            T012246_A396EmprCod, T012246_A9652OeNum, T012246_A9653OeHdr, T012246_A9654OeHdrr, T012246_A9655OeHdrp, T012246_A9656OeLinC, T012246_A9657OeComb, T012246_A9658Oefondo, T012246_A9659OeMolCil, T012246_A9677OeMolLin
            }
            , new Object[] {
            T012247_A396EmprCod, T012247_A9578Pas_Num, T012247_A719PrdNum
            }
            , new Object[] {
            T012248_A396EmprCod, T012248_A719PrdNum, T012248_A8908CC_AlmCod
            }
            , new Object[] {
            T012249_A396EmprCod, T012249_A719PrdNum, T012249_A8661Almc_Ln
            }
            , new Object[] {
            T012250_A396EmprCod, T012250_A719PrdNum, T012250_A8648Mat_PrdN
            }
            , new Object[] {
            T012251_A396EmprCod, T012251_A8585Pet_cod, T012251_A719PrdNum
            }
            , new Object[] {
            T012252_A396EmprCod, T012252_A719PrdNum, T012252_A8577RecFecHr, T012252_A8908CC_AlmCod
            }
            , new Object[] {
            T012253_A396EmprCod, T012253_A719PrdNum, T012253_A8366PrdAnyo, T012253_A8360PrdProv
            }
            , new Object[] {
            T012254_A396EmprCod, T012254_A252CliCod, T012254_A494ForSer, T012254_A482ForColNom, T012254_A483ForColNum, T012254_A831TipColCod, T012254_A7797Sim_lin
            }
            , new Object[] {
            T012255_A396EmprCod, T012255_A7163Vir_Codigo, T012255_A719PrdNum
            }
            , new Object[] {
            T012256_A396EmprCod, T012256_A6310Lb_TaAuxC, T012256_A6313lb_TaAuxL, T012256_A6378Lb_TauxLP
            }
            , new Object[] {
            T012257_A396EmprCod, T012257_A6290PreCoNum, T012257_A719PrdNum
            }
            , new Object[] {
            T012258_A396EmprCod, T012258_A719PrdNum, T012258_A6158PrdPrv
            }
            , new Object[] {
            T012259_A396EmprCod, T012259_A719PrdNum, T012259_A5973PrdSusNum
            }
            , new Object[] {
            T012260_A396EmprCod, T012260_A5612Lb_CodGru, T012260_A5615Lb_LinGru
            }
            , new Object[] {
            T012261_A396EmprCod, T012261_A5532Lb_numero, T012261_A5555Lb_opcion, T012261_A5560Lb_LineaPr
            }
            , new Object[] {
            T012262_A396EmprCod, T012262_A5532Lb_numero, T012262_A5555Lb_opcion, T012262_A5557Lb_LineaC
            }
            , new Object[] {
            T012263_A396EmprCod, T012263_A5145SobCod, T012263_A719PrdNum
            }
            , new Object[] {
            T012264_A396EmprCod, T012264_A4744RecPreCod, T012264_A4762RecPreLin, T012264_A4763RecPreNli
            }
            , new Object[] {
            T012265_A396EmprCod, T012265_A4492HreBarCod, T012265_A4493HreBarReo, T012265_A4494HreBarPar, T012265_A4495HreNumCie, T012265_A4545HreLinMaq, T012265_A4550HreLinPro, T012265_A4557HreRecLin
            }
            , new Object[] {
            T012266_A396EmprCod, T012266_A4492HreBarCod, T012266_A4493HreBarReo, T012266_A4494HreBarPar, T012266_A4495HreNumCie, T012266_A4508HreLinMAL, T012266_A4509HreNumAny, T012266_A719PrdNum
            }
            , new Object[] {
            T012267_A396EmprCod, T012267_A252CliCod, T012267_A4415EstCol, T012267_A4416EstColLin
            }
            , new Object[] {
            T012268_A396EmprCod, T012268_A129BarCod, T012268_A132BarCodReo, T012268_A130BarCodPar, T012268_A2524DisComLin, T012268_A1056DisComCod, T012268_A1032FonCod, T012268_A2124RecMolCod, T012268_A2672RecPasLin, T012268_A2675RecPasPLi
            }
            , new Object[] {
            T012269_A396EmprCod, T012269_A129BarCod, T012269_A132BarCodReo, T012269_A130BarCodPar, T012269_A2524DisComLin, T012269_A1056DisComCod, T012269_A1032FonCod, T012269_A2124RecMolCod, T012269_A2126RecMolLin
            }
            , new Object[] {
            T012270_A396EmprCod, T012270_A2107PasCod, T012270_A719PrdNum
            }
            , new Object[] {
            T012271_A396EmprCod, T012271_A2637HisEstHRu, T012271_A2636HisEstHRe, T012271_A2635HisEstHPa, T012271_A2638HisEstLCo, T012271_A2630HisEstCom, T012271_A2634HisEstFon, T012271_A719PrdNum
            }
            , new Object[] {
            T012272_A396EmprCod, T012272_A252CliCod, T012272_A2141SerEst, T012272_A1013DibCli, T012272_A1014DibInt, T012272_A2074ColCom, T012272_A2078ColFon, T012272_A2098MolCod, T012272_A2535ForPrdLin
            }
            , new Object[] {
            T012273_A396EmprCod, T012273_A719PrdNum, T012273_A3342CCStkLin
            }
            , new Object[] {
            T012274_A396EmprCod, T012274_A252CliCod, T012274_A2891HMaForSer, T012274_A2892HMaForCNom, T012274_A2893HMaForCNum, T012274_A2894HMaTipCCod, T012274_A2895HMaForNumC, T012274_A2897HMaColLin, T012274_A2896HMaFec, T012274_A2907HmaLin
            }
            , new Object[] {
            T012275_A396EmprCod, T012275_A129BarCod, T012275_A132BarCodReo, T012275_A130BarCodPar, T012275_A2808RecLinMAL, T012275_A1377RecNumAny, T012275_A719PrdNum
            }
            , new Object[] {
            T012276_A396EmprCod, T012276_A129BarCod, T012276_A132BarCodReo, T012276_A130BarCodPar, T012276_A2804RecLinMaq, T012276_A1273RecLinPro, T012276_A811RecLin
            }
            , new Object[] {
            T012277_A396EmprCod, T012277_A129BarCod, T012277_A132BarCodReo, T012277_A130BarCodPar, T012277_A2494BarDosPro, T012277_A719PrdNum
            }
            , new Object[] {
            T012278_A396EmprCod, T012278_A1314EnsLabCod, T012278_A1317EnsLabLin
            }
            , new Object[] {
            T012279_A396EmprCod, T012279_A910Workstat, T012279_A887EscMLin
            }
            , new Object[] {
            T012280_A396EmprCod, T012280_A859CumCodCont, T012280_A719PrdNum
            }
            , new Object[] {
            T012281_A396EmprCod, T012281_A719PrdNum, T012281_A810RecFec
            }
            , new Object[] {
            T012282_A396EmprCod, T012282_A486ForNumCol, T012282_A715PrdLin
            }
            , new Object[] {
            T012283_A396EmprCod, T012283_A719PrdNum, T012283_A681PrdAny
            }
            , new Object[] {
            T012284_A396EmprCod, T012284_A719PrdNum, T012284_A688PrdComCod
            }
            , new Object[] {
            T012285_A396EmprCod, T012285_A719PrdNum, T012285_A680PrdAltNum
            }
            , new Object[] {
            T012286_A396EmprCod, T012286_A658PedCod, T012286_A719PrdNum
            }
            , new Object[] {
            T012287_A396EmprCod, T012287_A486ForNumCol, T012287_A309ColLin
            }
            , new Object[] {
            T012288_A396EmprCod, T012288_A719PrdNum, T012288_A647NumCon
            }
            , new Object[] {
            T012289_A396EmprCod, T012289_A719PrdNum
            }
            , new Object[] {
            T012290_A719PrdNum, T012290_A8577RecFecHr, T012290_A8578RecExTeo, T012290_n8578RecExTeo, T012290_A8579RecExRea, T012290_n8579RecExRea, T012290_A8580RecExTcc, T012290_n8580RecExTcc, T012290_A8581RecExRcc, T012290_n8581RecExRcc,
            T012290_A8582RecPreInv, T012290_n8582RecPreInv, T012290_A8583RecInvSt, T012290_n8583RecInvSt, T012290_A8670RecExTAc, T012290_n8670RecExTAc, T012290_A8671RecExRAc, T012290_n8671RecExRAc, T012290_A12286RecLot2, T012290_n12286RecLot2,
            T012290_A396EmprCod
            }
            , new Object[] {
            T012291_A396EmprCod, T012291_A719PrdNum, T012291_A8577RecFecHr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T012295_A396EmprCod, T012295_A719PrdNum, T012295_A8577RecFecHr, T012295_A8908CC_AlmCod
            }
            , new Object[] {
            T012296_A396EmprCod, T012296_A719PrdNum, T012296_A8577RecFecHr
            }
         }
      );
   }

   private byte Z8583RecInvSt ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8583RecInvSt ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1177 ;
   private short nRcdExists_1177 ;
   private short nIsMod_1177 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1177 ;
   private short RcdFound1177 ;
   private short nBlankRcdUsr1177 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_1177 ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
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
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1177_Enabled ;
   private int edtRecFecHr_Enabled ;
   private int edtRecExTeo_Enabled ;
   private int edtRecExRea_Enabled ;
   private int edtRecExTcc_Enabled ;
   private int edtRecExRcc_Enabled ;
   private int edtRecPreInv_Enabled ;
   private int edtRecInvSt_Enabled ;
   private int edtRecExTAc_Enabled ;
   private int edtRecExRAc_Enabled ;
   private int edtRecLot2_Enabled ;
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
   private int defedtRecFecHr_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8578RecExTeo ;
   private java.math.BigDecimal Z8579RecExRea ;
   private java.math.BigDecimal Z8580RecExTcc ;
   private java.math.BigDecimal Z8581RecExRcc ;
   private java.math.BigDecimal Z8582RecPreInv ;
   private java.math.BigDecimal Z8670RecExTAc ;
   private java.math.BigDecimal Z8671RecExRAc ;
   private java.math.BigDecimal A8578RecExTeo ;
   private java.math.BigDecimal A8579RecExRea ;
   private java.math.BigDecimal A8580RecExTcc ;
   private java.math.BigDecimal A8581RecExRcc ;
   private java.math.BigDecimal A8582RecPreInv ;
   private java.math.BigDecimal A8670RecExTAc ;
   private java.math.BigDecimal A8671RecExRAc ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z12286RecLot2 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1177 ;
   private String edtavnRcdDeleted_1177_Internalname ;
   private String edtRecFecHr_Internalname ;
   private String edtRecExTeo_Internalname ;
   private String edtRecExRea_Internalname ;
   private String edtRecExTcc_Internalname ;
   private String edtRecExRcc_Internalname ;
   private String edtRecPreInv_Internalname ;
   private String edtRecInvSt_Internalname ;
   private String edtRecExTAc_Internalname ;
   private String edtRecExRAc_Internalname ;
   private String edtRecLot2_Internalname ;
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
   private String A12286RecLot2 ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1177_Jsonclick ;
   private String edtRecFecHr_Jsonclick ;
   private String edtRecExTeo_Jsonclick ;
   private String edtRecExRea_Jsonclick ;
   private String edtRecExTcc_Jsonclick ;
   private String edtRecExRcc_Jsonclick ;
   private String edtRecPreInv_Jsonclick ;
   private String edtRecInvSt_Jsonclick ;
   private String edtRecExTAc_Jsonclick ;
   private String edtRecExRAc_Jsonclick ;
   private String edtRecLot2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ718PrdNom ;
   private String ZZ407EmprNom ;
   private java.util.Date Z8577RecFecHr ;
   private java.util.Date A8577RecFecHr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n719PrdNum ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n8578RecExTeo ;
   private boolean n8579RecExRea ;
   private boolean n8580RecExTcc ;
   private boolean n8581RecExRcc ;
   private boolean n8582RecPreInv ;
   private boolean n8583RecInvSt ;
   private boolean n8670RecExTAc ;
   private boolean n8671RecExRAc ;
   private boolean n12286RecLot2 ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01227_A719PrdNum ;
   private boolean[] T01227_n719PrdNum ;
   private String[] T01227_A718PrdNom ;
   private String[] T01227_A407EmprNom ;
   private boolean[] T01227_n407EmprNom ;
   private String[] T01227_A396EmprCod ;
   private String[] T01226_A407EmprNom ;
   private boolean[] T01226_n407EmprNom ;
   private String[] T01228_A407EmprNom ;
   private boolean[] T01228_n407EmprNom ;
   private String[] T01229_A396EmprCod ;
   private String[] T01229_A719PrdNum ;
   private boolean[] T01229_n719PrdNum ;
   private String[] T01225_A719PrdNum ;
   private boolean[] T01225_n719PrdNum ;
   private String[] T01225_A718PrdNom ;
   private String[] T01225_A396EmprCod ;
   private String[] T012210_A396EmprCod ;
   private String[] T012210_A719PrdNum ;
   private boolean[] T012210_n719PrdNum ;
   private String[] T012211_A396EmprCod ;
   private String[] T012211_A719PrdNum ;
   private boolean[] T012211_n719PrdNum ;
   private String[] T01224_A719PrdNum ;
   private boolean[] T01224_n719PrdNum ;
   private String[] T01224_A718PrdNom ;
   private String[] T01224_A396EmprCod ;
   private String[] T012215_A407EmprNom ;
   private boolean[] T012215_n407EmprNom ;
   private String[] T012216_A396EmprCod ;
   private String[] T012216_A719PrdNum ;
   private boolean[] T012216_n719PrdNum ;
   private String[] T012216_A13217NormaID ;
   private String[] T012217_A396EmprCod ;
   private String[] T012217_A719PrdNum ;
   private boolean[] T012217_n719PrdNum ;
   private String[] T012217_A13586TheList ;
   private String[] T012218_A396EmprCod ;
   private int[] T012218_A5532Lb_numero ;
   private String[] T012218_A5555Lb_opcion ;
   private short[] T012218_A13460Lb_linCP ;
   private String[] T012218_A13458Lb_TipCP ;
   private String[] T012219_A396EmprCod ;
   private int[] T012219_A13418AlbProID ;
   private short[] T012219_A13442AlbProLine ;
   private String[] T012220_A396EmprCod ;
   private int[] T012220_A13324LDESID ;
   private String[] T012220_A13333LDESNPeque ;
   private String[] T012220_A13337LDESComb ;
   private String[] T012220_A13339LDESFondo ;
   private short[] T012220_A13342LDESLinea ;
   private String[] T012221_A396EmprCod ;
   private int[] T012221_A13312Lb_NLab ;
   private short[] T012221_A13305Lb_IDVeces ;
   private short[] T012221_A13306Lb_LinID ;
   private String[] T012222_A396EmprCod ;
   private int[] T012222_A12673LavMqId ;
   private short[] T012222_A12692LavMqLnPq ;
   private short[] T012222_A12681LavMqLn ;
   private String[] T012223_A396EmprCod ;
   private String[] T012223_A719PrdNum ;
   private boolean[] T012223_n719PrdNum ;
   private short[] T012223_A9713Tb1_Cod ;
   private String[] T012224_A396EmprCod ;
   private String[] T012224_A12236PrdNumD ;
   private String[] T012224_A719PrdNum ;
   private boolean[] T012224_n719PrdNum ;
   private String[] T012225_A396EmprCod ;
   private long[] T012225_A12225DocDisID ;
   private short[] T012225_A12226LinDisID ;
   private String[] T012226_A396EmprCod ;
   private long[] T012226_A12225DocDisID ;
   private String[] T012227_A396EmprCod ;
   private long[] T012227_A12205OrdenCID ;
   private short[] T012227_A12206OrdenCLnId ;
   private String[] T012228_A396EmprCod ;
   private String[] T012228_A719PrdNum ;
   private boolean[] T012228_n719PrdNum ;
   private String[] T012228_A11664LoteID ;
   private java.util.Date[] T012228_A11665LoteFec ;
   private String[] T012229_A396EmprCod ;
   private int[] T012229_A4850DevComCod ;
   private String[] T012229_A719PrdNum ;
   private boolean[] T012229_n719PrdNum ;
   private String[] T012230_A396EmprCod ;
   private int[] T012230_A252CliCod ;
   private String[] T012230_A494ForSer ;
   private String[] T012230_A482ForColNom ;
   private int[] T012230_A483ForColNum ;
   private byte[] T012230_A831TipColCod ;
   private String[] T012230_A3571EnsCod ;
   private short[] T012230_A3582EnsLin ;
   private String[] T012231_A396EmprCod ;
   private int[] T012231_A129BarCod ;
   private byte[] T012231_A132BarCodReo ;
   private String[] T012231_A130BarCodPar ;
   private byte[] T012231_A4075recestncol ;
   private byte[] T012231_A4076recestnpro ;
   private short[] T012231_A4108recestlin ;
   private String[] T012232_A396EmprCod ;
   private int[] T012232_A4052EstNumFor ;
   private byte[] T012232_A4053EstNumCol ;
   private byte[] T012232_A4090EstEspLin ;
   private String[] T012233_A396EmprCod ;
   private int[] T012233_A4052EstNumFor ;
   private byte[] T012233_A4053EstNumCol ;
   private byte[] T012233_A4084EstProLin ;
   private String[] T012234_A396EmprCod ;
   private long[] T012234_A11644TransferId ;
   private int[] T012234_A11653TransferLn ;
   private String[] T012235_A396EmprCod ;
   private String[] T012235_A11634TaesId ;
   private short[] T012235_A11637TaesLn ;
   private short[] T012235_A11641TaesLnP ;
   private String[] T012236_A396EmprCod ;
   private String[] T012236_A719PrdNum ;
   private boolean[] T012236_n719PrdNum ;
   private long[] T012236_A11329H_stklin ;
   private String[] T012237_A396EmprCod ;
   private int[] T012237_A11270Pot_num ;
   private short[] T012237_A11271Pot_lin ;
   private String[] T012238_A396EmprCod ;
   private String[] T012238_A719PrdNum ;
   private boolean[] T012238_n719PrdNum ;
   private String[] T012238_A11199PrdNcasC ;
   private String[] T012239_A396EmprCod ;
   private String[] T012239_A719PrdNum ;
   private boolean[] T012239_n719PrdNum ;
   private String[] T012239_A11197CFraseR ;
   private String[] T012240_A396EmprCod ;
   private short[] T012240_A10243Jt_codigo ;
   private short[] T012240_A10246Jt_ord ;
   private String[] T012241_A396EmprCod ;
   private java.util.Date[] T012241_A10236Bny_dia ;
   private short[] T012241_A10238Bny_lin ;
   private String[] T012242_A396EmprCod ;
   private int[] T012242_A129BarCod ;
   private byte[] T012242_A132BarCodReo ;
   private String[] T012242_A130BarCodPar ;
   private String[] T012242_A758ProCod ;
   private short[] T012242_A194BarOrdLin ;
   private String[] T012242_A719PrdNum ;
   private boolean[] T012242_n719PrdNum ;
   private String[] T012243_A396EmprCod ;
   private String[] T012243_A719PrdNum ;
   private boolean[] T012243_n719PrdNum ;
   private String[] T012243_A9735Cod_Rgo ;
   private String[] T012244_A396EmprCod ;
   private String[] T012244_A719PrdNum ;
   private boolean[] T012244_n719PrdNum ;
   private short[] T012244_A9711Ct_codigo ;
   private String[] T012245_A396EmprCod ;
   private long[] T012245_A9652OeNum ;
   private int[] T012245_A9653OeHdr ;
   private byte[] T012245_A9654OeHdrr ;
   private String[] T012245_A9655OeHdrp ;
   private byte[] T012245_A9656OeLinC ;
   private String[] T012245_A9657OeComb ;
   private String[] T012245_A9658Oefondo ;
   private byte[] T012245_A9659OeMolCil ;
   private short[] T012245_A9686OePasLin ;
   private short[] T012245_A9694OePasPLi ;
   private String[] T012246_A396EmprCod ;
   private long[] T012246_A9652OeNum ;
   private int[] T012246_A9653OeHdr ;
   private byte[] T012246_A9654OeHdrr ;
   private String[] T012246_A9655OeHdrp ;
   private byte[] T012246_A9656OeLinC ;
   private String[] T012246_A9657OeComb ;
   private String[] T012246_A9658Oefondo ;
   private byte[] T012246_A9659OeMolCil ;
   private byte[] T012246_A9677OeMolLin ;
   private String[] T012247_A396EmprCod ;
   private int[] T012247_A9578Pas_Num ;
   private String[] T012247_A719PrdNum ;
   private boolean[] T012247_n719PrdNum ;
   private String[] T012248_A396EmprCod ;
   private String[] T012248_A719PrdNum ;
   private boolean[] T012248_n719PrdNum ;
   private byte[] T012248_A8908CC_AlmCod ;
   private String[] T012249_A396EmprCod ;
   private String[] T012249_A719PrdNum ;
   private boolean[] T012249_n719PrdNum ;
   private int[] T012249_A8661Almc_Ln ;
   private String[] T012250_A396EmprCod ;
   private String[] T012250_A719PrdNum ;
   private boolean[] T012250_n719PrdNum ;
   private String[] T012250_A8648Mat_PrdN ;
   private String[] T012251_A396EmprCod ;
   private long[] T012251_A8585Pet_cod ;
   private String[] T012251_A719PrdNum ;
   private boolean[] T012251_n719PrdNum ;
   private String[] T012252_A396EmprCod ;
   private String[] T012252_A719PrdNum ;
   private boolean[] T012252_n719PrdNum ;
   private java.util.Date[] T012252_A8577RecFecHr ;
   private byte[] T012252_A8908CC_AlmCod ;
   private String[] T012253_A396EmprCod ;
   private String[] T012253_A719PrdNum ;
   private boolean[] T012253_n719PrdNum ;
   private short[] T012253_A8366PrdAnyo ;
   private int[] T012253_A8360PrdProv ;
   private String[] T012254_A396EmprCod ;
   private int[] T012254_A252CliCod ;
   private String[] T012254_A494ForSer ;
   private String[] T012254_A482ForColNom ;
   private int[] T012254_A483ForColNum ;
   private byte[] T012254_A831TipColCod ;
   private short[] T012254_A7797Sim_lin ;
   private String[] T012255_A396EmprCod ;
   private int[] T012255_A7163Vir_Codigo ;
   private String[] T012255_A719PrdNum ;
   private boolean[] T012255_n719PrdNum ;
   private String[] T012256_A396EmprCod ;
   private String[] T012256_A6310Lb_TaAuxC ;
   private short[] T012256_A6313lb_TaAuxL ;
   private short[] T012256_A6378Lb_TauxLP ;
   private String[] T012257_A396EmprCod ;
   private int[] T012257_A6290PreCoNum ;
   private String[] T012257_A719PrdNum ;
   private boolean[] T012257_n719PrdNum ;
   private String[] T012258_A396EmprCod ;
   private String[] T012258_A719PrdNum ;
   private boolean[] T012258_n719PrdNum ;
   private int[] T012258_A6158PrdPrv ;
   private String[] T012259_A396EmprCod ;
   private String[] T012259_A719PrdNum ;
   private boolean[] T012259_n719PrdNum ;
   private String[] T012259_A5973PrdSusNum ;
   private String[] T012260_A396EmprCod ;
   private String[] T012260_A5612Lb_CodGru ;
   private short[] T012260_A5615Lb_LinGru ;
   private String[] T012261_A396EmprCod ;
   private int[] T012261_A5532Lb_numero ;
   private String[] T012261_A5555Lb_opcion ;
   private short[] T012261_A5560Lb_LineaPr ;
   private String[] T012262_A396EmprCod ;
   private int[] T012262_A5532Lb_numero ;
   private String[] T012262_A5555Lb_opcion ;
   private short[] T012262_A5557Lb_LineaC ;
   private String[] T012263_A396EmprCod ;
   private int[] T012263_A5145SobCod ;
   private String[] T012263_A719PrdNum ;
   private boolean[] T012263_n719PrdNum ;
   private String[] T012264_A396EmprCod ;
   private int[] T012264_A4744RecPreCod ;
   private short[] T012264_A4762RecPreLin ;
   private short[] T012264_A4763RecPreNli ;
   private String[] T012265_A396EmprCod ;
   private int[] T012265_A4492HreBarCod ;
   private byte[] T012265_A4493HreBarReo ;
   private String[] T012265_A4494HreBarPar ;
   private byte[] T012265_A4495HreNumCie ;
   private short[] T012265_A4545HreLinMaq ;
   private byte[] T012265_A4550HreLinPro ;
   private short[] T012265_A4557HreRecLin ;
   private String[] T012266_A396EmprCod ;
   private int[] T012266_A4492HreBarCod ;
   private byte[] T012266_A4493HreBarReo ;
   private String[] T012266_A4494HreBarPar ;
   private byte[] T012266_A4495HreNumCie ;
   private short[] T012266_A4508HreLinMAL ;
   private byte[] T012266_A4509HreNumAny ;
   private String[] T012266_A719PrdNum ;
   private boolean[] T012266_n719PrdNum ;
   private String[] T012267_A396EmprCod ;
   private int[] T012267_A252CliCod ;
   private String[] T012267_A4415EstCol ;
   private short[] T012267_A4416EstColLin ;
   private String[] T012268_A396EmprCod ;
   private int[] T012268_A129BarCod ;
   private byte[] T012268_A132BarCodReo ;
   private String[] T012268_A130BarCodPar ;
   private byte[] T012268_A2524DisComLin ;
   private String[] T012268_A1056DisComCod ;
   private String[] T012268_A1032FonCod ;
   private byte[] T012268_A2124RecMolCod ;
   private short[] T012268_A2672RecPasLin ;
   private short[] T012268_A2675RecPasPLi ;
   private String[] T012269_A396EmprCod ;
   private int[] T012269_A129BarCod ;
   private byte[] T012269_A132BarCodReo ;
   private String[] T012269_A130BarCodPar ;
   private byte[] T012269_A2524DisComLin ;
   private String[] T012269_A1056DisComCod ;
   private String[] T012269_A1032FonCod ;
   private byte[] T012269_A2124RecMolCod ;
   private byte[] T012269_A2126RecMolLin ;
   private String[] T012270_A396EmprCod ;
   private String[] T012270_A2107PasCod ;
   private String[] T012270_A719PrdNum ;
   private boolean[] T012270_n719PrdNum ;
   private String[] T012271_A396EmprCod ;
   private int[] T012271_A2637HisEstHRu ;
   private byte[] T012271_A2636HisEstHRe ;
   private String[] T012271_A2635HisEstHPa ;
   private byte[] T012271_A2638HisEstLCo ;
   private String[] T012271_A2630HisEstCom ;
   private String[] T012271_A2634HisEstFon ;
   private String[] T012271_A719PrdNum ;
   private boolean[] T012271_n719PrdNum ;
   private String[] T012272_A396EmprCod ;
   private int[] T012272_A252CliCod ;
   private String[] T012272_A2141SerEst ;
   private String[] T012272_A1013DibCli ;
   private int[] T012272_A1014DibInt ;
   private String[] T012272_A2074ColCom ;
   private String[] T012272_A2078ColFon ;
   private byte[] T012272_A2098MolCod ;
   private short[] T012272_A2535ForPrdLin ;
   private String[] T012273_A396EmprCod ;
   private String[] T012273_A719PrdNum ;
   private boolean[] T012273_n719PrdNum ;
   private long[] T012273_A3342CCStkLin ;
   private String[] T012274_A396EmprCod ;
   private int[] T012274_A252CliCod ;
   private String[] T012274_A2891HMaForSer ;
   private String[] T012274_A2892HMaForCNom ;
   private int[] T012274_A2893HMaForCNum ;
   private byte[] T012274_A2894HMaTipCCod ;
   private int[] T012274_A2895HMaForNumC ;
   private short[] T012274_A2897HMaColLin ;
   private java.util.Date[] T012274_A2896HMaFec ;
   private short[] T012274_A2907HmaLin ;
   private String[] T012275_A396EmprCod ;
   private int[] T012275_A129BarCod ;
   private byte[] T012275_A132BarCodReo ;
   private String[] T012275_A130BarCodPar ;
   private short[] T012275_A2808RecLinMAL ;
   private byte[] T012275_A1377RecNumAny ;
   private String[] T012275_A719PrdNum ;
   private boolean[] T012275_n719PrdNum ;
   private String[] T012276_A396EmprCod ;
   private int[] T012276_A129BarCod ;
   private byte[] T012276_A132BarCodReo ;
   private String[] T012276_A130BarCodPar ;
   private short[] T012276_A2804RecLinMaq ;
   private byte[] T012276_A1273RecLinPro ;
   private short[] T012276_A811RecLin ;
   private String[] T012277_A396EmprCod ;
   private int[] T012277_A129BarCod ;
   private byte[] T012277_A132BarCodReo ;
   private String[] T012277_A130BarCodPar ;
   private String[] T012277_A2494BarDosPro ;
   private String[] T012277_A719PrdNum ;
   private boolean[] T012277_n719PrdNum ;
   private String[] T012278_A396EmprCod ;
   private int[] T012278_A1314EnsLabCod ;
   private short[] T012278_A1317EnsLabLin ;
   private String[] T012279_A396EmprCod ;
   private String[] T012279_A910Workstat ;
   private int[] T012279_A887EscMLin ;
   private String[] T012280_A396EmprCod ;
   private int[] T012280_A859CumCodCont ;
   private String[] T012280_A719PrdNum ;
   private boolean[] T012280_n719PrdNum ;
   private String[] T012281_A396EmprCod ;
   private String[] T012281_A719PrdNum ;
   private boolean[] T012281_n719PrdNum ;
   private java.util.Date[] T012281_A810RecFec ;
   private String[] T012282_A396EmprCod ;
   private int[] T012282_A486ForNumCol ;
   private short[] T012282_A715PrdLin ;
   private String[] T012283_A396EmprCod ;
   private String[] T012283_A719PrdNum ;
   private boolean[] T012283_n719PrdNum ;
   private short[] T012283_A681PrdAny ;
   private String[] T012284_A396EmprCod ;
   private String[] T012284_A719PrdNum ;
   private boolean[] T012284_n719PrdNum ;
   private String[] T012284_A688PrdComCod ;
   private String[] T012285_A396EmprCod ;
   private String[] T012285_A719PrdNum ;
   private boolean[] T012285_n719PrdNum ;
   private String[] T012285_A680PrdAltNum ;
   private String[] T012286_A396EmprCod ;
   private int[] T012286_A658PedCod ;
   private String[] T012286_A719PrdNum ;
   private boolean[] T012286_n719PrdNum ;
   private String[] T012287_A396EmprCod ;
   private int[] T012287_A486ForNumCol ;
   private short[] T012287_A309ColLin ;
   private String[] T012288_A396EmprCod ;
   private String[] T012288_A719PrdNum ;
   private boolean[] T012288_n719PrdNum ;
   private int[] T012288_A647NumCon ;
   private String[] T012289_A396EmprCod ;
   private String[] T012289_A719PrdNum ;
   private boolean[] T012289_n719PrdNum ;
   private String[] T012290_A719PrdNum ;
   private boolean[] T012290_n719PrdNum ;
   private java.util.Date[] T012290_A8577RecFecHr ;
   private java.math.BigDecimal[] T012290_A8578RecExTeo ;
   private boolean[] T012290_n8578RecExTeo ;
   private java.math.BigDecimal[] T012290_A8579RecExRea ;
   private boolean[] T012290_n8579RecExRea ;
   private java.math.BigDecimal[] T012290_A8580RecExTcc ;
   private boolean[] T012290_n8580RecExTcc ;
   private java.math.BigDecimal[] T012290_A8581RecExRcc ;
   private boolean[] T012290_n8581RecExRcc ;
   private java.math.BigDecimal[] T012290_A8582RecPreInv ;
   private boolean[] T012290_n8582RecPreInv ;
   private byte[] T012290_A8583RecInvSt ;
   private boolean[] T012290_n8583RecInvSt ;
   private java.math.BigDecimal[] T012290_A8670RecExTAc ;
   private boolean[] T012290_n8670RecExTAc ;
   private java.math.BigDecimal[] T012290_A8671RecExRAc ;
   private boolean[] T012290_n8671RecExRAc ;
   private String[] T012290_A12286RecLot2 ;
   private boolean[] T012290_n12286RecLot2 ;
   private String[] T012290_A396EmprCod ;
   private String[] T012291_A396EmprCod ;
   private String[] T012291_A719PrdNum ;
   private boolean[] T012291_n719PrdNum ;
   private java.util.Date[] T012291_A8577RecFecHr ;
   private String[] T01223_A719PrdNum ;
   private boolean[] T01223_n719PrdNum ;
   private java.util.Date[] T01223_A8577RecFecHr ;
   private java.math.BigDecimal[] T01223_A8578RecExTeo ;
   private boolean[] T01223_n8578RecExTeo ;
   private java.math.BigDecimal[] T01223_A8579RecExRea ;
   private boolean[] T01223_n8579RecExRea ;
   private java.math.BigDecimal[] T01223_A8580RecExTcc ;
   private boolean[] T01223_n8580RecExTcc ;
   private java.math.BigDecimal[] T01223_A8581RecExRcc ;
   private boolean[] T01223_n8581RecExRcc ;
   private java.math.BigDecimal[] T01223_A8582RecPreInv ;
   private boolean[] T01223_n8582RecPreInv ;
   private byte[] T01223_A8583RecInvSt ;
   private boolean[] T01223_n8583RecInvSt ;
   private java.math.BigDecimal[] T01223_A8670RecExTAc ;
   private boolean[] T01223_n8670RecExTAc ;
   private java.math.BigDecimal[] T01223_A8671RecExRAc ;
   private boolean[] T01223_n8671RecExRAc ;
   private String[] T01223_A12286RecLot2 ;
   private boolean[] T01223_n12286RecLot2 ;
   private String[] T01223_A396EmprCod ;
   private String[] T01222_A719PrdNum ;
   private boolean[] T01222_n719PrdNum ;
   private java.util.Date[] T01222_A8577RecFecHr ;
   private java.math.BigDecimal[] T01222_A8578RecExTeo ;
   private boolean[] T01222_n8578RecExTeo ;
   private java.math.BigDecimal[] T01222_A8579RecExRea ;
   private boolean[] T01222_n8579RecExRea ;
   private java.math.BigDecimal[] T01222_A8580RecExTcc ;
   private boolean[] T01222_n8580RecExTcc ;
   private java.math.BigDecimal[] T01222_A8581RecExRcc ;
   private boolean[] T01222_n8581RecExRcc ;
   private java.math.BigDecimal[] T01222_A8582RecPreInv ;
   private boolean[] T01222_n8582RecPreInv ;
   private byte[] T01222_A8583RecInvSt ;
   private boolean[] T01222_n8583RecInvSt ;
   private java.math.BigDecimal[] T01222_A8670RecExTAc ;
   private boolean[] T01222_n8670RecExTAc ;
   private java.math.BigDecimal[] T01222_A8671RecExRAc ;
   private boolean[] T01222_n8671RecExRAc ;
   private String[] T01222_A12286RecLot2 ;
   private boolean[] T01222_n12286RecLot2 ;
   private String[] T01222_A396EmprCod ;
   private String[] T012295_A396EmprCod ;
   private String[] T012295_A719PrdNum ;
   private boolean[] T012295_n719PrdNum ;
   private java.util.Date[] T012295_A8577RecFecHr ;
   private byte[] T012295_A8908CC_AlmCod ;
   private String[] T012296_A396EmprCod ;
   private String[] T012296_A719PrdNum ;
   private boolean[] T012296_n719PrdNum ;
   private java.util.Date[] T012296_A8577RecFecHr ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tinvprd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinvprd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinvprd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinvprd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tinvprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01222", "SELECT PrdNum, RecFecHr, RecExTeo, RecExRea, RecExTcc, RecExRcc, RecPreInv, RecInvSt, RecExTAc, RecExRAc, RecLot2, EmprCod FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ?  FOR UPDATE OF RecExTeo, RecExRea, RecExTcc, RecExRcc, RecPreInv, RecInvSt, RecExTAc, RecExRAc, RecLot2 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01223", "SELECT PrdNum, RecFecHr, RecExTeo, RecExRea, RecExTcc, RecExRcc, RecPreInv, RecInvSt, RecExTAc, RecExRAc, RecLot2, EmprCod FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01224", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01225", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01226", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01227", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, TM1.PrdNom, T2.EmprNom, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01228", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01229", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012210", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012211", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T012212", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T012213", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T012214", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T012215", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012216", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012217", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012218", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012219", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012220", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012221", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012222", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012223", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012224", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012225", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012226", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012227", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012228", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012229", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012230", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012231", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012232", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012233", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012234", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012235", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012236", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012237", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012238", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012239", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012240", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012241", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012242", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012243", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012244", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012245", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012246", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012247", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012248", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012249", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012250", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012251", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012252", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr, CC_AlmCod FROM TXPINVALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012253", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012254", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012255", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012256", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012257", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012258", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012259", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012260", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012261", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012262", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012263", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012264", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012265", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012266", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012267", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012268", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012269", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012270", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012271", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012272", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012273", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012274", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012275", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012276", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012277", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012278", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012279", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012280", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012281", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012282", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012283", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012284", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012285", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012286", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012287", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012288", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012289", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012290", "SELECT PrdNum, RecFecHr, RecExTeo, RecExRea, RecExTcc, RecExRcc, RecPreInv, RecInvSt, RecExTAc, RecExRAc, RecLot2, EmprCod FROM TXPINVPRD WHERE EmprCod = ? and PrdNum = ? and RecFecHr = ? ORDER BY EmprCod, PrdNum, RecFecHr ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T012291", "SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T012292", "INSERT INTO TXPINVPRD(PrdNum, RecFecHr, RecExTeo, RecExRea, RecExTcc, RecExRcc, RecPreInv, RecInvSt, RecExTAc, RecExRAc, RecLot2, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINVPRD")
         ,new UpdateCursor("T012293", "UPDATE TXPINVPRD SET RecExTeo=?, RecExRea=?, RecExTcc=?, RecExRcc=?, RecPreInv=?, RecInvSt=?, RecExTAc=?, RecExRAc=?, RecLot2=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ?", GX_NOMASK, "TXPINVPRD")
         ,new UpdateCursor("T012294", "DELETE FROM TXPINVPRD  WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ?", GX_NOMASK, "TXPINVPRD")
         ,new ForEachCursor("T012295", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr, CC_AlmCod FROM TXPINVALM WHERE EmprCod = ? AND PrdNum = ? AND RecFecHr = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T012296", "SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, RecFecHr ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
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
            case 44 :
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
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 66 :
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
            case 67 :
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
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 70 :
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
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 72 :
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
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
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
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
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
            case 11 :
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
            case 84 :
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
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
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
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setDateTime(2, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 4);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 4);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 4);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 26);
               }
               stmt.setString(12, (String)parms[21], 3);
               return;
            case 91 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 4);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 26);
               }
               stmt.setString(10, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 6);
               }
               stmt.setDateTime(12, (java.util.Date)parms[21], false);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               return;
            case 94 :
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

