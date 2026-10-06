package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpddctr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A4031CCTCod) ;
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
            A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
            n583IntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A584IntDsc = httpContext.GetPar( "IntDsc") ;
            n584IntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Periodicidad de Control Calidad", ""), (short)(0)) ;
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

   public tpddctr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpddctr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpddctr_impl.class ));
   }

   public tpddctr_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPddCtr.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPddCtr.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPddCtr.htm");
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
         nBlankRcdCount1733 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1733 = (short)(1) ;
            scanStart1KJ1733( ) ;
            while ( RcdFound1733 != 0 )
            {
               init_level_properties1733( ) ;
               getByPrimaryKey1KJ1733( ) ;
               addRow1KJ1733( ) ;
               scanNext1KJ1733( ) ;
            }
            scanEnd1KJ1733( ) ;
            nBlankRcdCount1733 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KJ1733( ) ;
         standaloneModal1KJ1733( ) ;
         sMode1733 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1KJ1733( ) ;
            edtavnRcdDeleted_1733_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1733_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1733_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1733_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtCCTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtCCTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtPddCtrV1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPddCtrV1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddCtrV1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtPddCtrV2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPddCtrV2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddCtrV2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtPddCtrV3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPddCtrV3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddCtrV3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtPddctrv4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV4_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPddctrv4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddctrv4_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1733 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KJ1733( ) ;
            }
            sendRow1KJ1733( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1733 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1733 = (short)(5) ;
         nRcdExists_1733 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KJ1733( ) ;
            while ( RcdFound1733 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401733( ) ;
               init_level_properties1733( ) ;
               standaloneNotModal1KJ1733( ) ;
               getByPrimaryKey1KJ1733( ) ;
               standaloneModal1KJ1733( ) ;
               addRow1KJ1733( ) ;
               scanNext1KJ1733( ) ;
            }
            scanEnd1KJ1733( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1733 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_401733( ) ;
         initAll1KJ1733( ) ;
         init_level_properties1733( ) ;
         nRcdExists_1733 = (short)(0) ;
         nIsMod_1733 = (short)(0) ;
         nRcdDeleted_1733 = (short)(0) ;
         nBlankRcdCount1733 = (short)(nBlankRcdUsr1733+nBlankRcdCount1733) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1733 > 0 )
         {
            standaloneNotModal1KJ1733( ) ;
            standaloneModal1KJ1733( ) ;
            addRow1KJ1733( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1733 = (short)(nBlankRcdCount1733-1) ;
         }
         Gx_mode = sMode1733 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPddCtr.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPddCtr.htm");
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
      e111KJ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n583IntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPddCtr");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpddctr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               n583IntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode64 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode64 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound64 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1KJ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                        e111KJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAll1KJ64( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1KJ64( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1733_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1733_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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

   public void confirm_1KJ0( )
   {
      beforeValidate1KJ64( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KJ64( ) ;
         }
         else
         {
            checkExtendedTable1KJ64( ) ;
            if ( AnyError == 0 )
            {
               zm1KJ64( 2) ;
            }
            closeExtendedTableCursors1KJ64( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode64 = Gx_mode ;
         confirm_1KJ1733( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode64 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KJ0( ) ;
      }
   }

   public void confirm_1KJ1733( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1KJ1733( ) ;
         if ( ( nRcdExists_1733 != 0 ) || ( nIsMod_1733 != 0 ) )
         {
            getKey1KJ1733( ) ;
            if ( ( nRcdExists_1733 == 0 ) && ( nRcdDeleted_1733 == 0 ) )
            {
               if ( RcdFound1733 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KJ1733( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KJ1733( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1KJ1733( 4) ;
                     }
                     closeExtendedTableCursors1KJ1733( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CCTCOD_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1733 != 0 )
               {
                  if ( nRcdDeleted_1733 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KJ1733( ) ;
                     load1KJ1733( ) ;
                     beforeValidate1KJ1733( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KJ1733( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1733 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KJ1733( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KJ1733( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1KJ1733( 4) ;
                           }
                           closeExtendedTableCursors1KJ1733( ) ;
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
                  if ( nRcdDeleted_1733 == 0 )
                  {
                     GXCCtl = "CCTCOD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1733_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc)) ;
         httpContext.changePostValue( edtPddCtrV1_Internalname, GXutil.ltrim( localUtil.ntoc( A12519PddCtrV1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPddCtrV2_Internalname, GXutil.ltrim( localUtil.ntoc( A12520PddCtrV2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPddCtrV3_Internalname, GXutil.ltrim( localUtil.ntoc( A12521PddCtrV3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPddctrv4_Internalname, GXutil.ltrim( localUtil.ntoc( A12522Pddctrv4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4031CCTCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12519PddCtrV1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12519PddCtrV1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12520PddCtrV2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12520PddCtrV2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12521PddCtrV3_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12521PddCtrV3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12522Pddctrv4_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12522Pddctrv4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1733_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1733_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1733_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1733 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1733_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1733_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV4_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddctrv4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KJ0( )
   {
   }

   public void e111KJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tpddctr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tpddctr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tpddctr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpddctr_impl.this.A396EmprCod = GXv_char2[0] ;
      tpddctr_impl.this.AV11EmprNom = GXv_char3[0] ;
      tpddctr_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KJ64( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z583IntCod = A583IntCod ;
         Z584IntDsc = A584IntDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TPddCtr" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01KJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KJ7_A407EmprNom[0] ;
      n407EmprNom = T01KJ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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

   public void load1KJ64( )
   {
      /* Using cursor T01KJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n584IntDsc), A584IntDsc});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A407EmprNom = T01KJ8_A407EmprNom[0] ;
         n407EmprNom = T01KJ8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1KJ64( -1) ;
      }
      pr_default.close(6);
      onLoadActions1KJ64( ) ;
   }

   public void onLoadActions1KJ64( )
   {
   }

   public void checkExtendedTable1KJ64( )
   {
      nIsDirty_64 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KJ64( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KJ64( )
   {
      /* Using cursor T01KJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
      else
      {
         RcdFound64 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T01KJ6_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T01KJ6_A584IntDsc[0], A584IntDsc) == 0 ) && ( GXutil.strcmp(T01KJ6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KJ64( 1) ;
         RcdFound64 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1KJ64( ) ;
         if ( AnyError == 1 )
         {
            RcdFound64 = (short)(0) ;
            initializeNonKey1KJ64( ) ;
         }
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound64 = (short)(0) ;
         initializeNonKey1KJ64( ) ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1KJ64( ) ;
      if ( RcdFound64 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T01KJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n584IntDsc), A584IntDsc});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01KJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KJ10_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T01KJ10_A584IntDsc[0], A584IntDsc) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01KJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KJ10_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T01KJ10_A584IntDsc[0], A584IntDsc) == 0 ) )
         {
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T01KJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n584IntDsc), A584IntDsc});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01KJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KJ11_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T01KJ11_A584IntDsc[0], A584IntDsc) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01KJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01KJ11_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T01KJ11_A584IntDsc[0], A584IntDsc) == 0 ) )
         {
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KJ64( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1KJ64( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound64 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
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
               /* Update record */
               update1KJ64( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
            {
               /* Insert record */
               insert1KJ64( ) ;
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
                  /* Insert record */
                  insert1KJ64( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
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
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1KJ64( ) ;
      if ( RcdFound64 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
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
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A583IntCod != Z583IntCod ) )
         {
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
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpddctr");
   }

   public void insert_check( )
   {
      confirm_1KJ0( ) ;
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

   public void checkOptimisticConcurrency1KJ64( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINTENS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINTENS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KJ64( )
   {
      beforeValidate1KJ64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KJ64( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KJ64( 0) ;
         checkOptimisticConcurrency1KJ64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KJ64( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KJ64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KJ12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n584IntDsc), A584IntDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTENS");
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
                        processLevel1KJ64( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load1KJ64( ) ;
         }
         endLevel1KJ64( ) ;
      }
      closeExtendedTableCursors1KJ64( ) ;
   }

   public void update1KJ64( )
   {
      beforeValidate1KJ64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KJ64( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KJ64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KJ64( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KJ64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KJ13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n584IntDsc), A584IntDsc, A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTENS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINTENS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KJ64( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KJ64( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel1KJ64( ) ;
      }
      closeExtendedTableCursors1KJ64( ) ;
   }

   public void deferredUpdate1KJ64( )
   {
   }

   public void delete( )
   {
      beforeValidate1KJ64( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KJ64( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KJ64( ) ;
         afterConfirm1KJ64( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KJ64( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KJ1733( ) ;
               while ( RcdFound1733 != 0 )
               {
                  getByPrimaryKey1KJ1733( ) ;
                  delete1KJ1733( ) ;
                  scanNext1KJ1733( ) ;
               }
               scanEnd1KJ1733( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KJ14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTENS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode64 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KJ64( ) ;
      Gx_mode = sMode64 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KJ64( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KJ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Intendidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01KJ16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01KJ17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01KJ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01KJ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01KJ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01KJ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01KJ22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01KJ23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01KJ24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevel1KJ1733( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1KJ1733( ) ;
         if ( ( nRcdExists_1733 != 0 ) || ( nIsMod_1733 != 0 ) )
         {
            standaloneNotModal1KJ1733( ) ;
            getKey1KJ1733( ) ;
            if ( ( nRcdExists_1733 == 0 ) && ( nRcdDeleted_1733 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KJ1733( ) ;
            }
            else
            {
               if ( RcdFound1733 != 0 )
               {
                  if ( ( nRcdDeleted_1733 != 0 ) && ( nRcdExists_1733 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KJ1733( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1733 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KJ1733( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1733 == 0 )
                  {
                     GXCCtl = "CCTCOD_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1733_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc)) ;
         httpContext.changePostValue( edtPddCtrV1_Internalname, GXutil.ltrim( localUtil.ntoc( A12519PddCtrV1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPddCtrV2_Internalname, GXutil.ltrim( localUtil.ntoc( A12520PddCtrV2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPddCtrV3_Internalname, GXutil.ltrim( localUtil.ntoc( A12521PddCtrV3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPddctrv4_Internalname, GXutil.ltrim( localUtil.ntoc( A12522Pddctrv4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4031CCTCod_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12519PddCtrV1_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12519PddCtrV1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12520PddCtrV2_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12520PddCtrV2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12521PddCtrV3_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12521PddCtrV3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12522Pddctrv4_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z12522Pddctrv4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1733_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1733_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1733_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1733 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1733_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1733_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CCTDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PDDCTRV4_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddctrv4_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KJ1733( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1733 = (short)(0) ;
      nIsMod_1733 = (short)(0) ;
      nRcdDeleted_1733 = (short)(0) ;
   }

   public void processLevel1KJ64( )
   {
      /* Save parent mode. */
      sMode64 = Gx_mode ;
      processNestedLevel1KJ1733( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode64 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KJ64( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KJ64( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpddctr");
         if ( AnyError == 0 )
         {
            confirmValues1KJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpddctr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KJ64( )
   {
      /* Scan By routine */
      /* Using cursor T01KJ25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n584IntDsc), A584IntDsc});
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KJ64( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
   }

   public void scanEnd1KJ64( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1KJ64( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KJ64( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KJ64( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KJ64( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KJ64( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KJ64( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KJ64( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
   }

   public void zm1KJ1733( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12519PddCtrV1 = T01KJ3_A12519PddCtrV1[0] ;
            Z12520PddCtrV2 = T01KJ3_A12520PddCtrV2[0] ;
            Z12521PddCtrV3 = T01KJ3_A12521PddCtrV3[0] ;
            Z12522Pddctrv4 = T01KJ3_A12522Pddctrv4[0] ;
         }
         else
         {
            Z12519PddCtrV1 = A12519PddCtrV1 ;
            Z12520PddCtrV2 = A12520PddCtrV2 ;
            Z12521PddCtrV3 = A12521PddCtrV3 ;
            Z12522Pddctrv4 = A12522Pddctrv4 ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z583IntCod = A583IntCod ;
         Z12519PddCtrV1 = A12519PddCtrV1 ;
         Z12520PddCtrV2 = A12520PddCtrV2 ;
         Z12521PddCtrV3 = A12521PddCtrV3 ;
         Z12522Pddctrv4 = A12522Pddctrv4 ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z4036CCTDsc = A4036CCTDsc ;
      }
   }

   public void standaloneNotModal1KJ1733( )
   {
   }

   public void standaloneModal1KJ1733( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1KJ1733( )
   {
      /* Using cursor T01KJ26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1733 = (short)(1) ;
         A4036CCTDsc = T01KJ26_A4036CCTDsc[0] ;
         A12519PddCtrV1 = T01KJ26_A12519PddCtrV1[0] ;
         n12519PddCtrV1 = T01KJ26_n12519PddCtrV1[0] ;
         A12520PddCtrV2 = T01KJ26_A12520PddCtrV2[0] ;
         n12520PddCtrV2 = T01KJ26_n12520PddCtrV2[0] ;
         A12521PddCtrV3 = T01KJ26_A12521PddCtrV3[0] ;
         n12521PddCtrV3 = T01KJ26_n12521PddCtrV3[0] ;
         A12522Pddctrv4 = T01KJ26_A12522Pddctrv4[0] ;
         n12522Pddctrv4 = T01KJ26_n12522Pddctrv4[0] ;
         zm1KJ1733( -3) ;
      }
      pr_default.close(24);
      onLoadActions1KJ1733( ) ;
   }

   public void onLoadActions1KJ1733( )
   {
   }

   public void checkExtendedTable1KJ1733( )
   {
      nIsDirty_1733 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KJ1733( ) ;
      /* Using cursor T01KJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CCTCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01KJ4_A4036CCTDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1KJ1733( )
   {
      pr_default.close(2);
   }

   public void enableDisable1KJ1733( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A4031CCTCod )
   {
      /* Using cursor T01KJ27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         GXCCtl = "CCTCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01KJ27_A4036CCTDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(25) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(25);
   }

   public void getKey1KJ1733( )
   {
      /* Using cursor T01KJ28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1733 = (short)(1) ;
      }
      else
      {
         RcdFound1733 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1KJ1733( )
   {
      /* Using cursor T01KJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(1) != 101) && ( T01KJ3_A583IntCod[0] == A583IntCod ) && ( GXutil.strcmp(T01KJ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KJ1733( 3) ;
         RcdFound1733 = (short)(1) ;
         initializeNonKey1KJ1733( ) ;
         A12519PddCtrV1 = T01KJ3_A12519PddCtrV1[0] ;
         n12519PddCtrV1 = T01KJ3_n12519PddCtrV1[0] ;
         A12520PddCtrV2 = T01KJ3_A12520PddCtrV2[0] ;
         n12520PddCtrV2 = T01KJ3_n12520PddCtrV2[0] ;
         A12521PddCtrV3 = T01KJ3_A12521PddCtrV3[0] ;
         n12521PddCtrV3 = T01KJ3_n12521PddCtrV3[0] ;
         A12522Pddctrv4 = T01KJ3_A12522Pddctrv4[0] ;
         n12522Pddctrv4 = T01KJ3_n12522Pddctrv4[0] ;
         A4031CCTCod = T01KJ3_A4031CCTCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z583IntCod = A583IntCod ;
         Z4031CCTCod = A4031CCTCod ;
         sMode1733 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1KJ1733( ) ;
         Gx_mode = sMode1733 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1733 = (short)(0) ;
         initializeNonKey1KJ1733( ) ;
         sMode1733 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KJ1733( ) ;
         Gx_mode = sMode1733 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KJ1733( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KJ1733( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPddCtr"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12519PddCtrV1, T01KJ2_A12519PddCtrV1[0]) != 0 ) || ( Z12520PddCtrV2 != T01KJ2_A12520PddCtrV2[0] ) || ( Z12521PddCtrV3 != T01KJ2_A12521PddCtrV3[0] ) || ( Z12522Pddctrv4 != T01KJ2_A12522Pddctrv4[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12519PddCtrV1, T01KJ2_A12519PddCtrV1[0]) != 0 )
            {
               GXutil.writeLogln("tpddctr:[seudo value changed for attri]"+"PddCtrV1");
               GXutil.writeLogRaw("Old: ",Z12519PddCtrV1);
               GXutil.writeLogRaw("Current: ",T01KJ2_A12519PddCtrV1[0]);
            }
            if ( Z12520PddCtrV2 != T01KJ2_A12520PddCtrV2[0] )
            {
               GXutil.writeLogln("tpddctr:[seudo value changed for attri]"+"PddCtrV2");
               GXutil.writeLogRaw("Old: ",Z12520PddCtrV2);
               GXutil.writeLogRaw("Current: ",T01KJ2_A12520PddCtrV2[0]);
            }
            if ( Z12521PddCtrV3 != T01KJ2_A12521PddCtrV3[0] )
            {
               GXutil.writeLogln("tpddctr:[seudo value changed for attri]"+"PddCtrV3");
               GXutil.writeLogRaw("Old: ",Z12521PddCtrV3);
               GXutil.writeLogRaw("Current: ",T01KJ2_A12521PddCtrV3[0]);
            }
            if ( Z12522Pddctrv4 != T01KJ2_A12522Pddctrv4[0] )
            {
               GXutil.writeLogln("tpddctr:[seudo value changed for attri]"+"Pddctrv4");
               GXutil.writeLogRaw("Old: ",Z12522Pddctrv4);
               GXutil.writeLogRaw("Current: ",T01KJ2_A12522Pddctrv4[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPddCtr"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KJ1733( )
   {
      beforeValidate1KJ1733( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KJ1733( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KJ1733( 0) ;
         checkOptimisticConcurrency1KJ1733( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KJ1733( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KJ1733( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KJ29 */
                  pr_default.execute(27, new Object[] {Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n12519PddCtrV1), A12519PddCtrV1, Boolean.valueOf(n12520PddCtrV2), Short.valueOf(A12520PddCtrV2), Boolean.valueOf(n12521PddCtrV3), Short.valueOf(A12521PddCtrV3), Boolean.valueOf(n12522Pddctrv4), Short.valueOf(A12522Pddctrv4), A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPddCtr");
                  if ( (pr_default.getStatus(27) == 1) )
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
            load1KJ1733( ) ;
         }
         endLevel1KJ1733( ) ;
      }
      closeExtendedTableCursors1KJ1733( ) ;
   }

   public void update1KJ1733( )
   {
      beforeValidate1KJ1733( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KJ1733( ) ;
      }
      if ( ( nIsMod_1733 != 0 ) || ( nIsDirty_1733 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KJ1733( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KJ1733( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KJ1733( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01KJ30 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n12519PddCtrV1), A12519PddCtrV1, Boolean.valueOf(n12520PddCtrV2), Short.valueOf(A12520PddCtrV2), Boolean.valueOf(n12521PddCtrV3), Short.valueOf(A12521PddCtrV3), Boolean.valueOf(n12522Pddctrv4), Short.valueOf(A12522Pddctrv4), A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Integer.valueOf(A4031CCTCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPddCtr");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPddCtr"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1KJ1733( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KJ1733( ) ;
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
            endLevel1KJ1733( ) ;
         }
      }
      closeExtendedTableCursors1KJ1733( ) ;
   }

   public void deferredUpdate1KJ1733( )
   {
   }

   public void delete1KJ1733( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KJ1733( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KJ1733( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KJ1733( ) ;
         afterConfirm1KJ1733( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KJ1733( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KJ31 */
               pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), Integer.valueOf(A4031CCTCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPddCtr");
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
      sMode1733 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KJ1733( ) ;
      Gx_mode = sMode1733 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KJ1733( )
   {
      standaloneModal1KJ1733( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KJ32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01KJ32_A4036CCTDsc[0] ;
         pr_default.close(30);
      }
   }

   public void endLevel1KJ1733( )
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

   public void scanStart1KJ1733( )
   {
      /* Scan By routine */
      /* Using cursor T01KJ33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      RcdFound1733 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1733 = (short)(1) ;
         A4031CCTCod = T01KJ33_A4031CCTCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KJ1733( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1733 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1733 = (short)(1) ;
         A4031CCTCod = T01KJ33_A4031CCTCod[0] ;
      }
   }

   public void scanEnd1KJ1733( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1KJ1733( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KJ1733( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KJ1733( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KJ1733( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KJ1733( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KJ1733( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KJ1733( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtPddCtrV1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPddCtrV1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddCtrV1_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtPddCtrV2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPddCtrV2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddCtrV2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtPddCtrV3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPddCtrV3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddCtrV3_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtPddctrv4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPddctrv4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPddctrv4_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1KJ1733( )
   {
   }

   public void send_integrity_lvl_hashes1KJ64( )
   {
   }

   public void subsflControlProps_401733( )
   {
      edtavnRcdDeleted_1733_Internalname = "vNRCDDELETED_1733_"+sGXsfl_40_idx ;
      edtCCTCod_Internalname = "CCTCOD_"+sGXsfl_40_idx ;
      edtCCTDsc_Internalname = "CCTDSC_"+sGXsfl_40_idx ;
      edtPddCtrV1_Internalname = "PDDCTRV1_"+sGXsfl_40_idx ;
      edtPddCtrV2_Internalname = "PDDCTRV2_"+sGXsfl_40_idx ;
      edtPddCtrV3_Internalname = "PDDCTRV3_"+sGXsfl_40_idx ;
      edtPddctrv4_Internalname = "PDDCTRV4_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401733( )
   {
      edtavnRcdDeleted_1733_Internalname = "vNRCDDELETED_1733_"+sGXsfl_40_fel_idx ;
      edtCCTCod_Internalname = "CCTCOD_"+sGXsfl_40_fel_idx ;
      edtCCTDsc_Internalname = "CCTDSC_"+sGXsfl_40_fel_idx ;
      edtPddCtrV1_Internalname = "PDDCTRV1_"+sGXsfl_40_fel_idx ;
      edtPddCtrV2_Internalname = "PDDCTRV2_"+sGXsfl_40_fel_idx ;
      edtPddCtrV3_Internalname = "PDDCTRV3_"+sGXsfl_40_fel_idx ;
      edtPddctrv4_Internalname = "PDDCTRV4_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1KJ1733( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401733( ) ;
      sendRow1KJ1733( ) ;
   }

   public void sendRow1KJ1733( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1733_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1733_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1733_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1733), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1733), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1733_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1733_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1733_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCTDsc_Internalname,GXutil.rtrim( A4036CCTDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCTDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCCTDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1733_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPddCtrV1_Internalname,GXutil.ltrim( localUtil.ntoc( A12519PddCtrV1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPddCtrV1_Enabled!=0) ? localUtil.format( A12519PddCtrV1, "ZZZZZZ9.99") : localUtil.format( A12519PddCtrV1, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPddCtrV1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPddCtrV1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1733_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPddCtrV2_Internalname,GXutil.ltrim( localUtil.ntoc( A12520PddCtrV2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPddCtrV2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12520PddCtrV2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12520PddCtrV2), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPddCtrV2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPddCtrV2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1733_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPddCtrV3_Internalname,GXutil.ltrim( localUtil.ntoc( A12521PddCtrV3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPddCtrV3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12521PddCtrV3), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12521PddCtrV3), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPddCtrV3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPddCtrV3_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1733_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPddctrv4_Internalname,GXutil.ltrim( localUtil.ntoc( A12522Pddctrv4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPddctrv4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12522Pddctrv4), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12522Pddctrv4), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPddctrv4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPddctrv4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1KJ1733( ) ;
      GXCCtl = "Z4031CCTCod_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12519PddCtrV1_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12519PddCtrV1, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12520PddCtrV2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12520PddCtrV2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12521PddCtrV3_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12521PddCtrV3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12522Pddctrv4_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12522Pddctrv4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1733_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1733_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1733_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1733, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1733_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1733_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTCOD_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PDDCTRV1_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PDDCTRV2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PDDCTRV3_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV3_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PDDCTRV4_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPddctrv4_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1KJ1733( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401733( ) ;
      edtavnRcdDeleted_1733_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1733_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTCOD_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCCTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CCTDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPddCtrV1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV1_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPddCtrV2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPddCtrV3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV3_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPddctrv4_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PDDCTRV4_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1733_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1733_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1733");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1733_Internalname ;
         wbErr = true ;
         nRcdDeleted_1733 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1733 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1733_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "CCTCOD_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         wbErr = true ;
         A4031CCTCod = 0 ;
      }
      else
      {
         A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPddCtrV1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPddCtrV1_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "PDDCTRV1_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPddCtrV1_Internalname ;
         wbErr = true ;
         A12519PddCtrV1 = DecimalUtil.ZERO ;
         n12519PddCtrV1 = false ;
      }
      else
      {
         A12519PddCtrV1 = localUtil.ctond( httpContext.cgiGet( edtPddCtrV1_Internalname)) ;
         n12519PddCtrV1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPddCtrV2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPddCtrV2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PDDCTRV2_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPddCtrV2_Internalname ;
         wbErr = true ;
         A12520PddCtrV2 = (short)(0) ;
         n12520PddCtrV2 = false ;
      }
      else
      {
         A12520PddCtrV2 = (short)(localUtil.ctol( httpContext.cgiGet( edtPddCtrV2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12520PddCtrV2 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPddCtrV3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPddCtrV3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PDDCTRV3_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPddCtrV3_Internalname ;
         wbErr = true ;
         A12521PddCtrV3 = (short)(0) ;
         n12521PddCtrV3 = false ;
      }
      else
      {
         A12521PddCtrV3 = (short)(localUtil.ctol( httpContext.cgiGet( edtPddCtrV3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12521PddCtrV3 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPddctrv4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPddctrv4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PDDCTRV4_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPddctrv4_Internalname ;
         wbErr = true ;
         A12522Pddctrv4 = (short)(0) ;
         n12522Pddctrv4 = false ;
      }
      else
      {
         A12522Pddctrv4 = (short)(localUtil.ctol( httpContext.cgiGet( edtPddctrv4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12522Pddctrv4 = false ;
      }
      GXCCtl = "Z4031CCTCod_" + sGXsfl_40_idx ;
      Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12519PddCtrV1_" + sGXsfl_40_idx ;
      Z12519PddCtrV1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12520PddCtrV2_" + sGXsfl_40_idx ;
      Z12520PddCtrV2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12521PddCtrV3_" + sGXsfl_40_idx ;
      Z12521PddCtrV3 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12522Pddctrv4_" + sGXsfl_40_idx ;
      Z12522Pddctrv4 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1733_" + sGXsfl_40_idx ;
      nRcdDeleted_1733 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1733_" + sGXsfl_40_idx ;
      nRcdExists_1733 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1733_" + sGXsfl_40_idx ;
      nIsMod_1733 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCCTCod_Enabled = edtCCTCod_Enabled ;
   }

   public void confirmValues1KJ0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401733( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401733( ) ;
         httpContext.changePostValue( "Z4031CCTCod_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z4031CCTCod_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4031CCTCod_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12519PddCtrV1_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12519PddCtrV1_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12519PddCtrV1_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12520PddCtrV2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12520PddCtrV2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12520PddCtrV2_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12521PddCtrV3_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12521PddCtrV3_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12521PddCtrV3_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z12522Pddctrv4_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z12522Pddctrv4_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12522Pddctrv4_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpddctr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A583IntCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A584IntDsc)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","IntCod","IntDsc","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPddCtr");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpddctr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tpddctr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A583IntCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A584IntDsc)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","IntCod","IntDsc","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TPddCtr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Periodicidad de Control Calidad", "") ;
   }

   public void initializeNonKey1KJ64( )
   {
   }

   public void initAll1KJ64( )
   {
      initializeNonKey1KJ64( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KJ1733( )
   {
      A4036CCTDsc = "" ;
      A12519PddCtrV1 = DecimalUtil.ZERO ;
      n12519PddCtrV1 = false ;
      A12520PddCtrV2 = (short)(0) ;
      n12520PddCtrV2 = false ;
      A12521PddCtrV3 = (short)(0) ;
      n12521PddCtrV3 = false ;
      A12522Pddctrv4 = (short)(0) ;
      n12522Pddctrv4 = false ;
      Z12519PddCtrV1 = DecimalUtil.ZERO ;
      Z12520PddCtrV2 = (short)(0) ;
      Z12521PddCtrV3 = (short)(0) ;
      Z12522Pddctrv4 = (short)(0) ;
   }

   public void initAll1KJ1733( )
   {
      A4031CCTCod = 0 ;
      initializeNonKey1KJ1733( ) ;
   }

   public void standaloneModalInsert1KJ1733( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584882", true, true);
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
      httpContext.AddJavascriptSource("tpddctr.js", "?20268241584882", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1733( )
   {
      edtCCTCod_Enabled = defedtCCTCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1733, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1733_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4036CCTDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCCTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12519PddCtrV1, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12520PddCtrV2, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12521PddCtrV3, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPddCtrV3_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12522Pddctrv4, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPddctrv4_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtIntCod_Internalname = "INTCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtIntDsc_Internalname = "INTDSC" ;
      edtavnRcdDeleted_1733_Internalname = "vNRCDDELETED_1733" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      edtPddCtrV1_Internalname = "PDDCTRV1" ;
      edtPddCtrV2_Internalname = "PDDCTRV2" ;
      edtPddCtrV3_Internalname = "PDDCTRV3" ;
      edtPddctrv4_Internalname = "PDDCTRV4" ;
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
      Form.setCaption( httpContext.getMessage( "Periodicidad de Control Calidad", "") );
      edtPddctrv4_Jsonclick = "" ;
      edtPddCtrV3_Jsonclick = "" ;
      edtPddCtrV2_Jsonclick = "" ;
      edtPddCtrV1_Jsonclick = "" ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTCod_Jsonclick = "" ;
      edtavnRcdDeleted_1733_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPddctrv4_Enabled = 1 ;
      edtPddCtrV3_Enabled = 1 ;
      edtPddCtrV2_Enabled = 1 ;
      edtPddCtrV1_Enabled = 1 ;
      edtCCTDsc_Enabled = 0 ;
      edtCCTCod_Enabled = 1 ;
      edtavnRcdDeleted_1733_Enabled = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIntDsc_Enabled = 0 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtIntCod_Enabled = 0 ;
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
      subsflControlProps_401733( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KJ1733( ) ;
         standaloneModal1KJ1733( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KJ1733( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401733( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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

   public void valid_Cctcod( )
   {
      /* Using cursor T01KJ32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
      }
      A4036CCTDsc = T01KJ32_A4036CCTDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[]");
      setEventMetadata("VALID_INTCOD",",oparms:[]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4036CCTDsc',fld:'CCTDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pddctrv4',iparms:[]");
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
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA584IntDsc = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z12519PddCtrV1 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A584IntDsc = "" ;
      Gx_mode = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1733 = "" ;
      GX_FocusControl = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode64 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4036CCTDsc = "" ;
      A12519PddCtrV1 = DecimalUtil.ZERO ;
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
      Z584IntDsc = "" ;
      Z407EmprNom = "" ;
      T01KJ7_A407EmprNom = new String[] {""} ;
      T01KJ7_n407EmprNom = new boolean[] {false} ;
      T01KJ8_A583IntCod = new byte[1] ;
      T01KJ8_n583IntCod = new boolean[] {false} ;
      T01KJ8_A584IntDsc = new String[] {""} ;
      T01KJ8_n584IntDsc = new boolean[] {false} ;
      T01KJ8_A407EmprNom = new String[] {""} ;
      T01KJ8_n407EmprNom = new boolean[] {false} ;
      T01KJ8_A396EmprCod = new String[] {""} ;
      T01KJ9_A396EmprCod = new String[] {""} ;
      T01KJ9_A583IntCod = new byte[1] ;
      T01KJ9_n583IntCod = new boolean[] {false} ;
      T01KJ6_A583IntCod = new byte[1] ;
      T01KJ6_n583IntCod = new boolean[] {false} ;
      T01KJ6_A584IntDsc = new String[] {""} ;
      T01KJ6_n584IntDsc = new boolean[] {false} ;
      T01KJ6_A396EmprCod = new String[] {""} ;
      T01KJ10_A396EmprCod = new String[] {""} ;
      T01KJ10_A583IntCod = new byte[1] ;
      T01KJ10_n583IntCod = new boolean[] {false} ;
      T01KJ10_A584IntDsc = new String[] {""} ;
      T01KJ10_n584IntDsc = new boolean[] {false} ;
      T01KJ11_A396EmprCod = new String[] {""} ;
      T01KJ11_A583IntCod = new byte[1] ;
      T01KJ11_n583IntCod = new boolean[] {false} ;
      T01KJ11_A584IntDsc = new String[] {""} ;
      T01KJ11_n584IntDsc = new boolean[] {false} ;
      T01KJ5_A583IntCod = new byte[1] ;
      T01KJ5_n583IntCod = new boolean[] {false} ;
      T01KJ5_A584IntDsc = new String[] {""} ;
      T01KJ5_n584IntDsc = new boolean[] {false} ;
      T01KJ5_A396EmprCod = new String[] {""} ;
      T01KJ15_A396EmprCod = new String[] {""} ;
      T01KJ15_A13183PLNColor = new byte[1] ;
      T01KJ15_A583IntCod = new byte[1] ;
      T01KJ15_n583IntCod = new boolean[] {false} ;
      T01KJ16_A396EmprCod = new String[] {""} ;
      T01KJ16_A252CliCod = new int[1] ;
      T01KJ16_A65ArtCod = new String[] {""} ;
      T01KJ16_A12363SocInt = new byte[1] ;
      T01KJ17_A396EmprCod = new String[] {""} ;
      T01KJ17_A829TipArtCod = new short[1] ;
      T01KJ17_A583IntCod = new byte[1] ;
      T01KJ17_n583IntCod = new boolean[] {false} ;
      T01KJ18_A396EmprCod = new String[] {""} ;
      T01KJ18_A252CliCod = new int[1] ;
      T01KJ18_A8521PreTAICod = new short[1] ;
      T01KJ18_A583IntCod = new byte[1] ;
      T01KJ18_n583IntCod = new boolean[] {false} ;
      T01KJ19_A396EmprCod = new String[] {""} ;
      T01KJ19_A5532Lb_numero = new int[1] ;
      T01KJ20_A396EmprCod = new String[] {""} ;
      T01KJ20_A252CliCod = new int[1] ;
      T01KJ20_A2141SerEst = new String[] {""} ;
      T01KJ20_A1013DibCli = new String[] {""} ;
      T01KJ20_A1014DibInt = new int[1] ;
      T01KJ20_A2074ColCom = new String[] {""} ;
      T01KJ20_A2078ColFon = new String[] {""} ;
      T01KJ21_A396EmprCod = new String[] {""} ;
      T01KJ21_A252CliCod = new int[1] ;
      T01KJ21_A1504CliProCod = new String[] {""} ;
      T01KJ21_A65ArtCod = new String[] {""} ;
      T01KJ21_A583IntCod = new byte[1] ;
      T01KJ21_n583IntCod = new boolean[] {false} ;
      T01KJ22_A396EmprCod = new String[] {""} ;
      T01KJ22_A30AlbProCod = new long[1] ;
      T01KJ22_A129BarCod = new int[1] ;
      T01KJ22_A132BarCodReo = new byte[1] ;
      T01KJ22_A130BarCodPar = new String[] {""} ;
      T01KJ23_A396EmprCod = new String[] {""} ;
      T01KJ23_A252CliCod = new int[1] ;
      T01KJ23_A65ArtCod = new String[] {""} ;
      T01KJ23_A831TipColCod = new byte[1] ;
      T01KJ23_A583IntCod = new byte[1] ;
      T01KJ23_n583IntCod = new boolean[] {false} ;
      T01KJ24_A396EmprCod = new String[] {""} ;
      T01KJ24_A252CliCod = new int[1] ;
      T01KJ24_A494ForSer = new String[] {""} ;
      T01KJ24_A482ForColNom = new String[] {""} ;
      T01KJ24_A483ForColNum = new int[1] ;
      T01KJ24_A831TipColCod = new byte[1] ;
      T01KJ25_A396EmprCod = new String[] {""} ;
      T01KJ25_A583IntCod = new byte[1] ;
      T01KJ25_n583IntCod = new boolean[] {false} ;
      Z4036CCTDsc = "" ;
      T01KJ26_A583IntCod = new byte[1] ;
      T01KJ26_n583IntCod = new boolean[] {false} ;
      T01KJ26_A4036CCTDsc = new String[] {""} ;
      T01KJ26_A12519PddCtrV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KJ26_n12519PddCtrV1 = new boolean[] {false} ;
      T01KJ26_A12520PddCtrV2 = new short[1] ;
      T01KJ26_n12520PddCtrV2 = new boolean[] {false} ;
      T01KJ26_A12521PddCtrV3 = new short[1] ;
      T01KJ26_n12521PddCtrV3 = new boolean[] {false} ;
      T01KJ26_A12522Pddctrv4 = new short[1] ;
      T01KJ26_n12522Pddctrv4 = new boolean[] {false} ;
      T01KJ26_A396EmprCod = new String[] {""} ;
      T01KJ26_A4031CCTCod = new int[1] ;
      T01KJ4_A4036CCTDsc = new String[] {""} ;
      T01KJ27_A4036CCTDsc = new String[] {""} ;
      T01KJ28_A396EmprCod = new String[] {""} ;
      T01KJ28_A583IntCod = new byte[1] ;
      T01KJ28_n583IntCod = new boolean[] {false} ;
      T01KJ28_A4031CCTCod = new int[1] ;
      T01KJ3_A583IntCod = new byte[1] ;
      T01KJ3_n583IntCod = new boolean[] {false} ;
      T01KJ3_A12519PddCtrV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KJ3_n12519PddCtrV1 = new boolean[] {false} ;
      T01KJ3_A12520PddCtrV2 = new short[1] ;
      T01KJ3_n12520PddCtrV2 = new boolean[] {false} ;
      T01KJ3_A12521PddCtrV3 = new short[1] ;
      T01KJ3_n12521PddCtrV3 = new boolean[] {false} ;
      T01KJ3_A12522Pddctrv4 = new short[1] ;
      T01KJ3_n12522Pddctrv4 = new boolean[] {false} ;
      T01KJ3_A396EmprCod = new String[] {""} ;
      T01KJ3_A4031CCTCod = new int[1] ;
      T01KJ2_A583IntCod = new byte[1] ;
      T01KJ2_n583IntCod = new boolean[] {false} ;
      T01KJ2_A12519PddCtrV1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KJ2_n12519PddCtrV1 = new boolean[] {false} ;
      T01KJ2_A12520PddCtrV2 = new short[1] ;
      T01KJ2_n12520PddCtrV2 = new boolean[] {false} ;
      T01KJ2_A12521PddCtrV3 = new short[1] ;
      T01KJ2_n12521PddCtrV3 = new boolean[] {false} ;
      T01KJ2_A12522Pddctrv4 = new short[1] ;
      T01KJ2_n12522Pddctrv4 = new boolean[] {false} ;
      T01KJ2_A396EmprCod = new String[] {""} ;
      T01KJ2_A4031CCTCod = new int[1] ;
      T01KJ32_A4036CCTDsc = new String[] {""} ;
      T01KJ33_A396EmprCod = new String[] {""} ;
      T01KJ33_A583IntCod = new byte[1] ;
      T01KJ33_n583IntCod = new boolean[] {false} ;
      T01KJ33_A4031CCTCod = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpddctr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpddctr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpddctr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpddctr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpddctr__default(),
         new Object[] {
             new Object[] {
            T01KJ2_A583IntCod, T01KJ2_A12519PddCtrV1, T01KJ2_n12519PddCtrV1, T01KJ2_A12520PddCtrV2, T01KJ2_n12520PddCtrV2, T01KJ2_A12521PddCtrV3, T01KJ2_n12521PddCtrV3, T01KJ2_A12522Pddctrv4, T01KJ2_n12522Pddctrv4, T01KJ2_A396EmprCod,
            T01KJ2_A4031CCTCod
            }
            , new Object[] {
            T01KJ3_A583IntCod, T01KJ3_A12519PddCtrV1, T01KJ3_n12519PddCtrV1, T01KJ3_A12520PddCtrV2, T01KJ3_n12520PddCtrV2, T01KJ3_A12521PddCtrV3, T01KJ3_n12521PddCtrV3, T01KJ3_A12522Pddctrv4, T01KJ3_n12522Pddctrv4, T01KJ3_A396EmprCod,
            T01KJ3_A4031CCTCod
            }
            , new Object[] {
            T01KJ4_A4036CCTDsc
            }
            , new Object[] {
            T01KJ5_A583IntCod, T01KJ5_A584IntDsc, T01KJ5_n584IntDsc, T01KJ5_A396EmprCod
            }
            , new Object[] {
            T01KJ6_A583IntCod, T01KJ6_A584IntDsc, T01KJ6_n584IntDsc, T01KJ6_A396EmprCod
            }
            , new Object[] {
            T01KJ7_A407EmprNom, T01KJ7_n407EmprNom
            }
            , new Object[] {
            T01KJ8_A583IntCod, T01KJ8_A584IntDsc, T01KJ8_n584IntDsc, T01KJ8_A407EmprNom, T01KJ8_n407EmprNom, T01KJ8_A396EmprCod
            }
            , new Object[] {
            T01KJ9_A396EmprCod, T01KJ9_A583IntCod
            }
            , new Object[] {
            T01KJ10_A396EmprCod, T01KJ10_A583IntCod, T01KJ10_A584IntDsc, T01KJ10_n584IntDsc
            }
            , new Object[] {
            T01KJ11_A396EmprCod, T01KJ11_A583IntCod, T01KJ11_A584IntDsc, T01KJ11_n584IntDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KJ15_A396EmprCod, T01KJ15_A13183PLNColor, T01KJ15_A583IntCod
            }
            , new Object[] {
            T01KJ16_A396EmprCod, T01KJ16_A252CliCod, T01KJ16_A65ArtCod, T01KJ16_A12363SocInt
            }
            , new Object[] {
            T01KJ17_A396EmprCod, T01KJ17_A829TipArtCod, T01KJ17_A583IntCod
            }
            , new Object[] {
            T01KJ18_A396EmprCod, T01KJ18_A252CliCod, T01KJ18_A8521PreTAICod, T01KJ18_A583IntCod
            }
            , new Object[] {
            T01KJ19_A396EmprCod, T01KJ19_A5532Lb_numero
            }
            , new Object[] {
            T01KJ20_A396EmprCod, T01KJ20_A252CliCod, T01KJ20_A2141SerEst, T01KJ20_A1013DibCli, T01KJ20_A1014DibInt, T01KJ20_A2074ColCom, T01KJ20_A2078ColFon
            }
            , new Object[] {
            T01KJ21_A396EmprCod, T01KJ21_A252CliCod, T01KJ21_A1504CliProCod, T01KJ21_A65ArtCod, T01KJ21_A583IntCod
            }
            , new Object[] {
            T01KJ22_A396EmprCod, T01KJ22_A30AlbProCod, T01KJ22_A129BarCod, T01KJ22_A132BarCodReo, T01KJ22_A130BarCodPar
            }
            , new Object[] {
            T01KJ23_A396EmprCod, T01KJ23_A252CliCod, T01KJ23_A65ArtCod, T01KJ23_A831TipColCod, T01KJ23_A583IntCod
            }
            , new Object[] {
            T01KJ24_A396EmprCod, T01KJ24_A252CliCod, T01KJ24_A494ForSer, T01KJ24_A482ForColNom, T01KJ24_A483ForColNum, T01KJ24_A831TipColCod
            }
            , new Object[] {
            T01KJ25_A396EmprCod, T01KJ25_A583IntCod
            }
            , new Object[] {
            T01KJ26_A583IntCod, T01KJ26_A4036CCTDsc, T01KJ26_A12519PddCtrV1, T01KJ26_n12519PddCtrV1, T01KJ26_A12520PddCtrV2, T01KJ26_n12520PddCtrV2, T01KJ26_A12521PddCtrV3, T01KJ26_n12521PddCtrV3, T01KJ26_A12522Pddctrv4, T01KJ26_n12522Pddctrv4,
            T01KJ26_A396EmprCod, T01KJ26_A4031CCTCod
            }
            , new Object[] {
            T01KJ27_A4036CCTDsc
            }
            , new Object[] {
            T01KJ28_A396EmprCod, T01KJ28_A583IntCod, T01KJ28_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KJ32_A4036CCTDsc
            }
            , new Object[] {
            T01KJ33_A396EmprCod, T01KJ33_A583IntCod, T01KJ33_A4031CCTCod
            }
         }
      );
      Z584IntDsc = "" ;
      n584IntDsc = false ;
      A584IntDsc = "" ;
      n584IntDsc = false ;
      Z583IntCod = (byte)(0) ;
      n583IntCod = false ;
      A583IntCod = (byte)(0) ;
      n583IntCod = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TPddCtr" ;
   }

   private byte wcpOA583IntCod ;
   private byte Z583IntCod ;
   private byte GxWebError ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z12520PddCtrV2 ;
   private short Z12521PddCtrV3 ;
   private short Z12522Pddctrv4 ;
   private short nRcdDeleted_1733 ;
   private short nRcdExists_1733 ;
   private short nIsMod_1733 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1733 ;
   private short RcdFound1733 ;
   private short nBlankRcdUsr1733 ;
   private short RcdFound64 ;
   private short A12520PddCtrV2 ;
   private short A12521PddCtrV3 ;
   private short A12522Pddctrv4 ;
   private short nIsDirty_64 ;
   private short nIsDirty_1733 ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int Z4031CCTCod ;
   private int A4031CCTCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtIntCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtavnRcdDeleted_1733_Enabled ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtPddCtrV1_Enabled ;
   private int edtPddCtrV2_Enabled ;
   private int edtPddCtrV3_Enabled ;
   private int edtPddctrv4_Enabled ;
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
   private int defedtCCTCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12519PddCtrV1 ;
   private java.math.BigDecimal A12519PddCtrV1 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA584IntDsc ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A584IntDsc ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String edtIntDsc_Jsonclick ;
   private String sMode1733 ;
   private String edtavnRcdDeleted_1733_Internalname ;
   private String edtCCTCod_Internalname ;
   private String edtCCTDsc_Internalname ;
   private String edtPddCtrV1_Internalname ;
   private String edtPddCtrV2_Internalname ;
   private String edtPddCtrV3_Internalname ;
   private String edtPddctrv4_Internalname ;
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
   private String AV33Pgmname ;
   private String hsh ;
   private String sMode64 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4036CCTDsc ;
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
   private String Z584IntDsc ;
   private String Z407EmprNom ;
   private String Z4036CCTDsc ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1733_Jsonclick ;
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Jsonclick ;
   private String edtPddCtrV1_Jsonclick ;
   private String edtPddCtrV2_Jsonclick ;
   private String edtPddCtrV3_Jsonclick ;
   private String edtPddctrv4_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n583IntCod ;
   private boolean n584IntDsc ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n12519PddCtrV1 ;
   private boolean n12520PddCtrV2 ;
   private boolean n12521PddCtrV3 ;
   private boolean n12522Pddctrv4 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01KJ7_A407EmprNom ;
   private boolean[] T01KJ7_n407EmprNom ;
   private byte[] T01KJ8_A583IntCod ;
   private boolean[] T01KJ8_n583IntCod ;
   private String[] T01KJ8_A584IntDsc ;
   private boolean[] T01KJ8_n584IntDsc ;
   private String[] T01KJ8_A407EmprNom ;
   private boolean[] T01KJ8_n407EmprNom ;
   private String[] T01KJ8_A396EmprCod ;
   private String[] T01KJ9_A396EmprCod ;
   private byte[] T01KJ9_A583IntCod ;
   private boolean[] T01KJ9_n583IntCod ;
   private byte[] T01KJ6_A583IntCod ;
   private boolean[] T01KJ6_n583IntCod ;
   private String[] T01KJ6_A584IntDsc ;
   private boolean[] T01KJ6_n584IntDsc ;
   private String[] T01KJ6_A396EmprCod ;
   private String[] T01KJ10_A396EmprCod ;
   private byte[] T01KJ10_A583IntCod ;
   private boolean[] T01KJ10_n583IntCod ;
   private String[] T01KJ10_A584IntDsc ;
   private boolean[] T01KJ10_n584IntDsc ;
   private String[] T01KJ11_A396EmprCod ;
   private byte[] T01KJ11_A583IntCod ;
   private boolean[] T01KJ11_n583IntCod ;
   private String[] T01KJ11_A584IntDsc ;
   private boolean[] T01KJ11_n584IntDsc ;
   private byte[] T01KJ5_A583IntCod ;
   private boolean[] T01KJ5_n583IntCod ;
   private String[] T01KJ5_A584IntDsc ;
   private boolean[] T01KJ5_n584IntDsc ;
   private String[] T01KJ5_A396EmprCod ;
   private String[] T01KJ15_A396EmprCod ;
   private byte[] T01KJ15_A13183PLNColor ;
   private byte[] T01KJ15_A583IntCod ;
   private boolean[] T01KJ15_n583IntCod ;
   private String[] T01KJ16_A396EmprCod ;
   private int[] T01KJ16_A252CliCod ;
   private String[] T01KJ16_A65ArtCod ;
   private byte[] T01KJ16_A12363SocInt ;
   private String[] T01KJ17_A396EmprCod ;
   private short[] T01KJ17_A829TipArtCod ;
   private byte[] T01KJ17_A583IntCod ;
   private boolean[] T01KJ17_n583IntCod ;
   private String[] T01KJ18_A396EmprCod ;
   private int[] T01KJ18_A252CliCod ;
   private short[] T01KJ18_A8521PreTAICod ;
   private byte[] T01KJ18_A583IntCod ;
   private boolean[] T01KJ18_n583IntCod ;
   private String[] T01KJ19_A396EmprCod ;
   private int[] T01KJ19_A5532Lb_numero ;
   private String[] T01KJ20_A396EmprCod ;
   private int[] T01KJ20_A252CliCod ;
   private String[] T01KJ20_A2141SerEst ;
   private String[] T01KJ20_A1013DibCli ;
   private int[] T01KJ20_A1014DibInt ;
   private String[] T01KJ20_A2074ColCom ;
   private String[] T01KJ20_A2078ColFon ;
   private String[] T01KJ21_A396EmprCod ;
   private int[] T01KJ21_A252CliCod ;
   private String[] T01KJ21_A1504CliProCod ;
   private String[] T01KJ21_A65ArtCod ;
   private byte[] T01KJ21_A583IntCod ;
   private boolean[] T01KJ21_n583IntCod ;
   private String[] T01KJ22_A396EmprCod ;
   private long[] T01KJ22_A30AlbProCod ;
   private int[] T01KJ22_A129BarCod ;
   private byte[] T01KJ22_A132BarCodReo ;
   private String[] T01KJ22_A130BarCodPar ;
   private String[] T01KJ23_A396EmprCod ;
   private int[] T01KJ23_A252CliCod ;
   private String[] T01KJ23_A65ArtCod ;
   private byte[] T01KJ23_A831TipColCod ;
   private byte[] T01KJ23_A583IntCod ;
   private boolean[] T01KJ23_n583IntCod ;
   private String[] T01KJ24_A396EmprCod ;
   private int[] T01KJ24_A252CliCod ;
   private String[] T01KJ24_A494ForSer ;
   private String[] T01KJ24_A482ForColNom ;
   private int[] T01KJ24_A483ForColNum ;
   private byte[] T01KJ24_A831TipColCod ;
   private String[] T01KJ25_A396EmprCod ;
   private byte[] T01KJ25_A583IntCod ;
   private boolean[] T01KJ25_n583IntCod ;
   private byte[] T01KJ26_A583IntCod ;
   private boolean[] T01KJ26_n583IntCod ;
   private String[] T01KJ26_A4036CCTDsc ;
   private java.math.BigDecimal[] T01KJ26_A12519PddCtrV1 ;
   private boolean[] T01KJ26_n12519PddCtrV1 ;
   private short[] T01KJ26_A12520PddCtrV2 ;
   private boolean[] T01KJ26_n12520PddCtrV2 ;
   private short[] T01KJ26_A12521PddCtrV3 ;
   private boolean[] T01KJ26_n12521PddCtrV3 ;
   private short[] T01KJ26_A12522Pddctrv4 ;
   private boolean[] T01KJ26_n12522Pddctrv4 ;
   private String[] T01KJ26_A396EmprCod ;
   private int[] T01KJ26_A4031CCTCod ;
   private String[] T01KJ4_A4036CCTDsc ;
   private String[] T01KJ27_A4036CCTDsc ;
   private String[] T01KJ28_A396EmprCod ;
   private byte[] T01KJ28_A583IntCod ;
   private boolean[] T01KJ28_n583IntCod ;
   private int[] T01KJ28_A4031CCTCod ;
   private byte[] T01KJ3_A583IntCod ;
   private boolean[] T01KJ3_n583IntCod ;
   private java.math.BigDecimal[] T01KJ3_A12519PddCtrV1 ;
   private boolean[] T01KJ3_n12519PddCtrV1 ;
   private short[] T01KJ3_A12520PddCtrV2 ;
   private boolean[] T01KJ3_n12520PddCtrV2 ;
   private short[] T01KJ3_A12521PddCtrV3 ;
   private boolean[] T01KJ3_n12521PddCtrV3 ;
   private short[] T01KJ3_A12522Pddctrv4 ;
   private boolean[] T01KJ3_n12522Pddctrv4 ;
   private String[] T01KJ3_A396EmprCod ;
   private int[] T01KJ3_A4031CCTCod ;
   private byte[] T01KJ2_A583IntCod ;
   private boolean[] T01KJ2_n583IntCod ;
   private java.math.BigDecimal[] T01KJ2_A12519PddCtrV1 ;
   private boolean[] T01KJ2_n12519PddCtrV1 ;
   private short[] T01KJ2_A12520PddCtrV2 ;
   private boolean[] T01KJ2_n12520PddCtrV2 ;
   private short[] T01KJ2_A12521PddCtrV3 ;
   private boolean[] T01KJ2_n12521PddCtrV3 ;
   private short[] T01KJ2_A12522Pddctrv4 ;
   private boolean[] T01KJ2_n12522Pddctrv4 ;
   private String[] T01KJ2_A396EmprCod ;
   private int[] T01KJ2_A4031CCTCod ;
   private String[] T01KJ32_A4036CCTDsc ;
   private String[] T01KJ33_A396EmprCod ;
   private byte[] T01KJ33_A583IntCod ;
   private boolean[] T01KJ33_n583IntCod ;
   private int[] T01KJ33_A4031CCTCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpddctr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpddctr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpddctr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpddctr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpddctr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KJ2", "SELECT IntCod, PddCtrV1, PddCtrV2, PddCtrV3, Pddctrv4, EmprCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND IntCod = ? AND CCTCod = ?  FOR UPDATE OF PddCtrV1, PddCtrV2, PddCtrV3, Pddctrv4 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KJ3", "SELECT IntCod, PddCtrV1, PddCtrV2, PddCtrV3, Pddctrv4, EmprCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND IntCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KJ4", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ5", "SELECT IntCod, IntDsc, EmprCod FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ?  FOR UPDATE OF IntDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ6", "SELECT IntCod, IntDsc, EmprCod FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ8", "SELECT /*+ FIRST_ROWS(1) */ TM1.IntCod, TM1.IntDsc, T2.EmprNom, TM1.EmprCod FROM (TXPINTENS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.IntCod = ? and TM1.IntDsc = ? ORDER BY TM1.EmprCod, TM1.IntCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, IntCod, IntDsc FROM TXPINTENS WHERE EmprCod = ? and IntCod = ? and IntDsc = ? ORDER BY EmprCod, IntCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, IntCod, IntDsc FROM TXPINTENS WHERE EmprCod = ? and IntCod = ? and IntDsc = ? ORDER BY EmprCod DESC, IntCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KJ12", "INSERT INTO TXPINTENS(IntCod, IntDsc, EmprCod, IntCodCtb, IntLabLi, IntLabLf, IntLava, IntPreMin, IntPreMax, IntOrder, IntAct) VALUES(?, ?, ?, 0, 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK, "TXPINTENS")
         ,new UpdateCursor("T01KJ13", "UPDATE TXPINTENS SET IntDsc=?  WHERE EmprCod = ? AND IntCod = ?", GX_NOMASK, "TXPINTENS")
         ,new UpdateCursor("T01KJ14", "DELETE FROM TXPINTENS  WHERE EmprCod = ? AND IntCod = ?", GX_NOMASK, "TXPINTENS")
         ,new ForEachCursor("T01KJ15", "SELECT * FROM (SELECT EmprCod, PLNColor, IntCod FROM TXPPLNCoI WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ16", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND SocInt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ17", "SELECT * FROM (SELECT EmprCod, TipArtCod, IntCod FROM TXPTARINT WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ18", "SELECT * FROM (SELECT EmprCod, CliCod, PreTAICod, IntCod FROM TXPPRETA1 WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ19", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ20", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ21", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod, IntCod FROM TXPLPREPR WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod FROM TXPPRETIN WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ24", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND IntCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ? and IntCod = ? and IntDsc = ? ORDER BY EmprCod, IntCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KJ26", "SELECT T1.IntCod, T2.CCTDsc, T1.PddCtrV1, T1.PddCtrV2, T1.PddCtrV3, T1.Pddctrv4, T1.EmprCod, T1.CCTCod FROM (TXPPddCtr T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) WHERE T1.EmprCod = ? and T1.IntCod = ? and T1.CCTCod = ? ORDER BY T1.EmprCod, T1.IntCod, T1.CCTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KJ27", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KJ28", "SELECT EmprCod, IntCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND IntCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KJ29", "INSERT INTO TXPPddCtr(IntCod, PddCtrV1, PddCtrV2, PddCtrV3, Pddctrv4, EmprCod, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPddCtr")
         ,new UpdateCursor("T01KJ30", "UPDATE TXPPddCtr SET PddCtrV1=?, PddCtrV2=?, PddCtrV3=?, Pddctrv4=?  WHERE EmprCod = ? AND IntCod = ? AND CCTCod = ?", GX_NOMASK, "TXPPddCtr")
         ,new UpdateCursor("T01KJ31", "DELETE FROM TXPPddCtr  WHERE EmprCod = ? AND IntCod = ? AND CCTCod = ?", GX_NOMASK, "TXPPddCtr")
         ,new ForEachCursor("T01KJ32", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KJ33", "SELECT EmprCod, IntCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? and IntCod = ? ORDER BY EmprCod, IntCod, CCTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((int[]) buf[10])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 24 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               stmt.setString(3, (String)parms[4], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               stmt.setInt(7, ((Number) parms[11]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
   }

}

