package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tldes03_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_1NV1825( ) ;
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
            A13324LDESID = (int)(GXutil.lval( httpContext.GetPar( "LDESID"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            A13333LDESNPeque = httpContext.GetPar( "LDESNPeque") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13333LDESNPeque", A13333LDESNPeque);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lab DIP Estampacion (Combinaciones)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLDESDPeque_Internalname ;
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

   public tldes03_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tldes03_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tldes03_impl.class ));
   }

   public tldes03_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLDES03.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESID_Internalname, GXutil.ltrim( localUtil.ntoc( A13324LDESID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLDESID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13324LDESID), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13324LDESID), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESID_Jsonclick, 0, "", "", "", "", "", 1, edtLDESID_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "N Peque", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESNPeque_Internalname, GXutil.rtrim( A13333LDESNPeque), GXutil.rtrim( localUtil.format( A13333LDESNPeque, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESNPeque_Jsonclick, 0, "", "", "", "", "", 1, edtLDESNPeque_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Descripcion del Peque", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLDES03.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLDESDPeque_Internalname, GXutil.rtrim( A13334LDESDPeque), GXutil.rtrim( localUtil.format( A13334LDESDPeque, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLDESDPeque_Jsonclick, 0, "", "", "", "", "", 1, edtLDESDPeque_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLDES03.htm");
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
         nBlankRcdCount1825 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1825 = (short)(1) ;
            scanStart1NV1825( ) ;
            while ( RcdFound1825 != 0 )
            {
               init_level_properties1825( ) ;
               getByPrimaryKey1NV1825( ) ;
               addRow1NV1825( ) ;
               scanNext1NV1825( ) ;
            }
            scanEnd1NV1825( ) ;
            nBlankRcdCount1825 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1NV1825( ) ;
         standaloneModal1NV1825( ) ;
         sMode1825 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1NV1825( ) ;
            edtavnRcdDeleted_1825_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1825_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1825_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1825_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtLDESComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtLDESComdD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMDD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESComdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComdD_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtLDESFondo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFONDO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtLDESEstCb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESESTCB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESEstCb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESEstCb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtLDESUltLP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTLP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtLDESUltP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1825 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1NV1825( ) ;
            }
            sendRow1NV1825( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1825 = (short)(5) ;
         nRcdExists_1825 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1NV1825( ) ;
            while ( RcdFound1825 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451825( ) ;
               init_level_properties1825( ) ;
               standaloneNotModal1NV1825( ) ;
               getByPrimaryKey1NV1825( ) ;
               standaloneModal1NV1825( ) ;
               addRow1NV1825( ) ;
               scanNext1NV1825( ) ;
            }
            scanEnd1NV1825( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1825 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451825( ) ;
      initAll1NV1825( ) ;
      init_level_properties1825( ) ;
      nRcdExists_1825 = (short)(0) ;
      nIsMod_1825 = (short)(0) ;
      nRcdDeleted_1825 = (short)(0) ;
      nBlankRcdCount1825 = (short)(nBlankRcdUsr1825+nBlankRcdCount1825) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1825 > 0 )
      {
         standaloneNotModal1NV1825( ) ;
         standaloneModal1NV1825( ) ;
         addRow1NV1825( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtLDESComb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1825 = (short)(nBlankRcdCount1825-1) ;
      }
      Gx_mode = sMode1825 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLDES03.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLDES03.htm");
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
      e111NV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13324LDESID = (int)(localUtil.ctol( httpContext.cgiGet( "Z13324LDESID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13333LDESNPeque = httpContext.cgiGet( "Z13333LDESNPeque") ;
            Z13334LDESDPeque = httpContext.cgiGet( "Z13334LDESDPeque") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV36Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A13324LDESID = (int)(localUtil.ctol( httpContext.cgiGet( edtLDESID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
            A13333LDESNPeque = httpContext.cgiGet( edtLDESNPeque_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13333LDESNPeque", A13333LDESNPeque);
            A13334LDESDPeque = httpContext.cgiGet( edtLDESDPeque_Internalname) ;
            n13334LDESDPeque = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13334LDESDPeque", A13334LDESDPeque);
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
               A13324LDESID = (int)(GXutil.lval( httpContext.GetPar( "LDESID"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13324LDESID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13324LDESID), 8, 0));
               A13333LDESNPeque = httpContext.GetPar( "LDESNPeque") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13333LDESNPeque", A13333LDESNPeque);
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
                        e111NV2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'MODIFICAR COMBINACION (PRODUCTOS,PASTA)'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Modificar Combinacion (Productos,Pasta)' */
                        e121NV2 ();
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
            initAll1NV1824( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1825_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1825_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1NV1824( ) ;
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

   public void confirm_1NV0( )
   {
      beforeValidate1NV1824( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NV1824( ) ;
         }
         else
         {
            checkExtendedTable1NV1824( ) ;
            if ( AnyError == 0 )
            {
               zm1NV1824( 8) ;
               zm1NV1824( 9) ;
            }
            closeExtendedTableCursors1NV1824( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1824 = Gx_mode ;
         confirm_1NV1825( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1824 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1824 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1NV0( ) ;
      }
   }

   public void confirm_1NV1825( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1NV1825( ) ;
         if ( ( nRcdExists_1825 != 0 ) || ( nIsMod_1825 != 0 ) )
         {
            getKey1NV1825( ) ;
            if ( ( nRcdExists_1825 == 0 ) && ( nRcdDeleted_1825 == 0 ) )
            {
               if ( RcdFound1825 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1NV1825( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1NV1825( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1NV1825( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LDESCOMB_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLDESComb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1825 != 0 )
               {
                  if ( nRcdDeleted_1825 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1NV1825( ) ;
                     load1NV1825( ) ;
                     beforeValidate1NV1825( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1NV1825( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1825 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1NV1825( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1NV1825( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1NV1825( ) ;
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
                  if ( nRcdDeleted_1825 == 0 )
                  {
                     GXCCtl = "LDESCOMB_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESComb_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1825_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESComb_Internalname, GXutil.rtrim( A13337LDESComb)) ;
         httpContext.changePostValue( edtLDESComdD_Internalname, GXutil.rtrim( A13338LDESComdD)) ;
         httpContext.changePostValue( edtLDESFondo_Internalname, GXutil.rtrim( A13339LDESFondo)) ;
         httpContext.changePostValue( edtLDESEstCb_Internalname, GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUltLP_Internalname, GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13337LDESComb_"+sGXsfl_45_idx, GXutil.rtrim( Z13337LDESComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13339LDESFondo_"+sGXsfl_45_idx, GXutil.rtrim( Z13339LDESFondo)) ;
         httpContext.changePostValue( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13338LDESComdD_"+sGXsfl_45_idx, GXutil.rtrim( Z13338LDESComdD)) ;
         httpContext.changePostValue( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13346LDESUltP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1825_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1825_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1825_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1825 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1825_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1825_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOMB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOMDD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFONDO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESESTCB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTLP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1NV0( )
   {
   }

   public void e111NV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tldes03_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV36Pgmname, (byte)(99), GXv_char2) ;
      tldes03_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tldes03_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tldes03_impl.this.A396EmprCod = GXv_char2[0] ;
      tldes03_impl.this.AV11EmprNom = GXv_char3[0] ;
      tldes03_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121NV2( )
   {
      /* 'Modificar Combinacion (Productos,Pasta)' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         callWebObject(formatLink("app.tldes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque)),GXutil.URLEncode(GXutil.rtrim(A13337LDESComb)),GXutil.URLEncode(GXutil.rtrim(A13339LDESFondo))}, new String[] {"EmprCod","LDESID","LDESNPeque","LDESComb","LDESFondo"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm1NV1824( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13334LDESDPeque = T01NV5_A13334LDESDPeque[0] ;
         }
         else
         {
            Z13334LDESDPeque = A13334LDESDPeque ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13334LDESDPeque = A13334LDESDPeque ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV36Pgmname = "TLDES03" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01NV6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NV6_A407EmprNom[0] ;
      n407EmprNom = T01NV6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01NV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Lab DIP Estampacion", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LDESID");
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

   public void load1NV1824( )
   {
      /* Using cursor T01NV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1824 = (short)(1) ;
         A407EmprNom = T01NV8_A407EmprNom[0] ;
         n407EmprNom = T01NV8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A13334LDESDPeque = T01NV8_A13334LDESDPeque[0] ;
         n13334LDESDPeque = T01NV8_n13334LDESDPeque[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13334LDESDPeque", A13334LDESDPeque);
         zm1NV1824( -7) ;
      }
      pr_default.close(6);
      onLoadActions1NV1824( ) ;
   }

   public void onLoadActions1NV1824( )
   {
   }

   public void checkExtendedTable1NV1824( )
   {
      nIsDirty_1824 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1NV1824( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NV1824( )
   {
      /* Using cursor T01NV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1824 = (short)(1) ;
      }
      else
      {
         RcdFound1824 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01NV5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01NV5_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NV5_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NV5_A13324LDESID[0] == A13324LDESID ) )
      {
         zm1NV1824( 7) ;
         RcdFound1824 = (short)(1) ;
         A13334LDESDPeque = T01NV5_A13334LDESDPeque[0] ;
         n13334LDESDPeque = T01NV5_n13334LDESDPeque[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13334LDESDPeque", A13334LDESDPeque);
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         sMode1824 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1NV1824( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1824 = (short)(0) ;
            initializeNonKey1NV1824( ) ;
         }
         Gx_mode = sMode1824 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1824 = (short)(0) ;
         initializeNonKey1NV1824( ) ;
         sMode1824 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1824 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1NV1824( ) ;
      if ( RcdFound1824 == 0 )
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
      RcdFound1824 = (short)(0) ;
      /* Using cursor T01NV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01NV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NV10_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NV10_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01NV10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NV10_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NV10_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) )
         {
            RcdFound1824 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1824 = (short)(0) ;
      /* Using cursor T01NV11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01NV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NV11_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NV11_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01NV11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01NV11_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NV11_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) )
         {
            RcdFound1824 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NV1824( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtLDESDPeque_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1NV1824( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1824 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) )
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
               GX_FocusControl = edtLDESDPeque_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1NV1824( ) ;
               GX_FocusControl = edtLDESDPeque_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtLDESDPeque_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1NV1824( ) ;
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
                  GX_FocusControl = edtLDESDPeque_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1NV1824( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) )
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
         GX_FocusControl = edtLDESDPeque_Internalname ;
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
      getKey1NV1824( ) ;
      if ( RcdFound1824 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13324LDESID != Z13324LDESID ) || ( GXutil.strcmp(A13333LDESNPeque, Z13333LDESNPeque) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tldes03");
      GX_FocusControl = edtLDESDPeque_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1NV0( ) ;
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
      if ( RcdFound1824 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtLDESDPeque_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1NV1824( ) ;
      if ( RcdFound1824 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLDESDPeque_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NV1824( ) ;
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
      if ( RcdFound1824 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLDESDPeque_Internalname ;
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
      if ( RcdFound1824 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLDESDPeque_Internalname ;
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
      scanStart1NV1824( ) ;
      if ( RcdFound1824 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1824 != 0 )
         {
            scanNext1NV1824( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLDESDPeque_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1NV1824( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1NV1824( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NV4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z13334LDESDPeque, T01NV4_A13334LDESDPeque[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13334LDESDPeque, T01NV4_A13334LDESDPeque[0]) != 0 )
            {
               GXutil.writeLogln("tldes03:[seudo value changed for attri]"+"LDESDPeque");
               GXutil.writeLogRaw("Old: ",Z13334LDESDPeque);
               GXutil.writeLogRaw("Current: ",T01NV4_A13334LDESDPeque[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NV1824( )
   {
      beforeValidate1NV1824( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NV1824( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NV1824( 0) ;
         checkOptimisticConcurrency1NV1824( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NV1824( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NV1824( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NV12 */
                  pr_default.execute(10, new Object[] {A13333LDESNPeque, Boolean.valueOf(n13334LDESDPeque), A13334LDESDPeque, A396EmprCod, Integer.valueOf(A13324LDESID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
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
                        processLevel1NV1824( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1NV0( ) ;
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
            load1NV1824( ) ;
         }
         endLevel1NV1824( ) ;
      }
      closeExtendedTableCursors1NV1824( ) ;
   }

   public void update1NV1824( )
   {
      beforeValidate1NV1824( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NV1824( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NV1824( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NV1824( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NV1824( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NV13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n13334LDESDPeque), A13334LDESDPeque, A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES01"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NV1824( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1NV1824( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1NV0( ) ;
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
         endLevel1NV1824( ) ;
      }
      closeExtendedTableCursors1NV1824( ) ;
   }

   public void deferredUpdate1NV1824( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NV1824( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NV1824( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NV1824( ) ;
         afterConfirm1NV1824( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NV1824( ) ;
            if ( AnyError == 0 )
            {
               scanStart1NV1825( ) ;
               while ( RcdFound1825 != 0 )
               {
                  getByPrimaryKey1NV1825( ) ;
                  delete1NV1825( ) ;
                  scanNext1NV1825( ) ;
               }
               scanEnd1NV1825( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NV14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES01");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1824 == 0 )
                        {
                           initAll1NV1824( ) ;
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
                        resetCaption1NV0( ) ;
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
      sMode1824 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NV1824( ) ;
      Gx_mode = sMode1824 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NV1824( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NV15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1NV1825( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1NV1825( ) ;
         if ( ( nRcdExists_1825 != 0 ) || ( nIsMod_1825 != 0 ) )
         {
            standaloneNotModal1NV1825( ) ;
            getKey1NV1825( ) ;
            if ( ( nRcdExists_1825 == 0 ) && ( nRcdDeleted_1825 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1NV1825( ) ;
            }
            else
            {
               if ( RcdFound1825 != 0 )
               {
                  if ( ( nRcdDeleted_1825 != 0 ) && ( nRcdExists_1825 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1NV1825( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1825 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1NV1825( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1825 == 0 )
                  {
                     GXCCtl = "LDESCOMB_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLDESComb_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1825_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESComb_Internalname, GXutil.rtrim( A13337LDESComb)) ;
         httpContext.changePostValue( edtLDESComdD_Internalname, GXutil.rtrim( A13338LDESComdD)) ;
         httpContext.changePostValue( edtLDESFondo_Internalname, GXutil.rtrim( A13339LDESFondo)) ;
         httpContext.changePostValue( edtLDESEstCb_Internalname, GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUltLP_Internalname, GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLDESUltP_Internalname, GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13337LDESComb_"+sGXsfl_45_idx, GXutil.rtrim( Z13337LDESComb)) ;
         httpContext.changePostValue( "ZT_"+"Z13339LDESFondo_"+sGXsfl_45_idx, GXutil.rtrim( Z13339LDESFondo)) ;
         httpContext.changePostValue( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13338LDESComdD_"+sGXsfl_45_idx, GXutil.rtrim( Z13338LDESComdD)) ;
         httpContext.changePostValue( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13346LDESUltP_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1825_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1825_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1825_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1825 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1825_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1825_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOMB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESCOMDD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESFONDO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESESTCB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTLP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LDESULTP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1NV1825( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1825 = (short)(0) ;
      nIsMod_1825 = (short)(0) ;
      nRcdDeleted_1825 = (short)(0) ;
   }

   public void processLevel1NV1824( )
   {
      /* Save parent mode. */
      sMode1824 = Gx_mode ;
      processNestedLevel1NV1825( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1824 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1NV1824( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NV1824( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tldes03");
         if ( AnyError == 0 )
         {
            confirmValues1NV0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tldes03");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1NV1824( )
   {
      /* Scan By routine */
      /* Using cursor T01NV16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      RcdFound1824 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1824 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NV1824( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1824 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1824 = (short)(1) ;
      }
   }

   public void scanEnd1NV1824( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1NV1824( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NV1824( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NV1824( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NV1824( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NV1824( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NV1824( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NV1824( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLDESID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESID_Enabled), 5, 0), true);
      edtLDESNPeque_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESNPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESNPeque_Enabled), 5, 0), true);
      edtLDESDPeque_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESDPeque_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESDPeque_Enabled), 5, 0), true);
   }

   public void zm1NV1825( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13386LDESEstCb = T01NV3_A13386LDESEstCb[0] ;
            Z13338LDESComdD = T01NV3_A13338LDESComdD[0] ;
            Z13345LDESUltLP = T01NV3_A13345LDESUltLP[0] ;
            Z13346LDESUltP = T01NV3_A13346LDESUltP[0] ;
         }
         else
         {
            Z13386LDESEstCb = A13386LDESEstCb ;
            Z13338LDESComdD = A13338LDESComdD ;
            Z13345LDESUltLP = A13345LDESUltLP ;
            Z13346LDESUltP = A13346LDESUltP ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         Z13386LDESEstCb = A13386LDESEstCb ;
         Z13338LDESComdD = A13338LDESComdD ;
         Z13345LDESUltLP = A13345LDESUltLP ;
         Z13346LDESUltP = A13346LDESUltP ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1NV1825( )
   {
   }

   public void standaloneModal1NV1825( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A13337LDESComb)==0) && ( Gx_BScreen == 0 ) )
      {
         A13337LDESComb = E13337LDESComb ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A13339LDESFondo)==0) && ( Gx_BScreen == 0 ) )
      {
         A13339LDESFondo = E13339LDESFondo ;
      }
      if ( isIns( )  && (0==A13386LDESEstCb) && ( Gx_BScreen == 0 ) )
      {
         A13386LDESEstCb = (byte)(0) ;
         n13386LDESEstCb = false ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESComb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtLDESComb_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLDESFondo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtLDESFondo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1NV1825( )
   {
      /* Using cursor T01NV17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A13386LDESEstCb = T01NV17_A13386LDESEstCb[0] ;
         n13386LDESEstCb = T01NV17_n13386LDESEstCb[0] ;
         A13338LDESComdD = T01NV17_A13338LDESComdD[0] ;
         n13338LDESComdD = T01NV17_n13338LDESComdD[0] ;
         A13345LDESUltLP = T01NV17_A13345LDESUltLP[0] ;
         n13345LDESUltLP = T01NV17_n13345LDESUltLP[0] ;
         A13346LDESUltP = T01NV17_A13346LDESUltP[0] ;
         n13346LDESUltP = T01NV17_n13346LDESUltP[0] ;
         zm1NV1825( -10) ;
      }
      pr_default.close(15);
      onLoadActions1NV1825( ) ;
   }

   public void onLoadActions1NV1825( )
   {
   }

   public void checkExtendedTable1NV1825( )
   {
      nIsDirty_1825 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1NV1825( ) ;
      if ( (GXutil.strcmp("", A13337LDESComb)==0) && true /* Level */ && true /* After */ )
      {
         GXCCtl = "LDESCOMB_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Combinacion Invalida", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESComb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A13339LDESFondo)==0) && true /* Level */ && true /* After */ )
      {
         GXCCtl = "LDESFONDO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fondo Invalido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESFondo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1NV1825( )
   {
   }

   public void enableDisable1NV1825( )
   {
   }

   public void getKey1NV1825( )
   {
      /* Using cursor T01NV18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1825 = (short)(1) ;
      }
      else
      {
         RcdFound1825 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1NV1825( )
   {
      /* Using cursor T01NV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
      if ( (pr_default.getStatus(1) != 101) && ( T01NV3_A13324LDESID[0] == A13324LDESID ) && ( GXutil.strcmp(T01NV3_A13333LDESNPeque[0], A13333LDESNPeque) == 0 ) && ( GXutil.strcmp(T01NV3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NV1825( 10) ;
         RcdFound1825 = (short)(1) ;
         initializeNonKey1NV1825( ) ;
         A13337LDESComb = T01NV3_A13337LDESComb[0] ;
         A13339LDESFondo = T01NV3_A13339LDESFondo[0] ;
         A13386LDESEstCb = T01NV3_A13386LDESEstCb[0] ;
         n13386LDESEstCb = T01NV3_n13386LDESEstCb[0] ;
         A13338LDESComdD = T01NV3_A13338LDESComdD[0] ;
         n13338LDESComdD = T01NV3_n13338LDESComdD[0] ;
         A13345LDESUltLP = T01NV3_A13345LDESUltLP[0] ;
         n13345LDESUltLP = T01NV3_n13345LDESUltLP[0] ;
         A13346LDESUltP = T01NV3_A13346LDESUltP[0] ;
         n13346LDESUltP = T01NV3_n13346LDESUltP[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13324LDESID = A13324LDESID ;
         Z13333LDESNPeque = A13333LDESNPeque ;
         Z13337LDESComb = A13337LDESComb ;
         Z13339LDESFondo = A13339LDESFondo ;
         sMode1825 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NV1825( ) ;
         load1NV1825( ) ;
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1825 = (short)(0) ;
         initializeNonKey1NV1825( ) ;
         sMode1825 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1NV1825( ) ;
         Gx_mode = sMode1825 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1NV1825( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1NV1825( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01NV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z13386LDESEstCb != T01NV2_A13386LDESEstCb[0] ) || ( GXutil.strcmp(Z13338LDESComdD, T01NV2_A13338LDESComdD[0]) != 0 ) || ( Z13345LDESUltLP != T01NV2_A13345LDESUltLP[0] ) || ( Z13346LDESUltP != T01NV2_A13346LDESUltP[0] ) )
         {
            if ( Z13386LDESEstCb != T01NV2_A13386LDESEstCb[0] )
            {
               GXutil.writeLogln("tldes03:[seudo value changed for attri]"+"LDESEstCb");
               GXutil.writeLogRaw("Old: ",Z13386LDESEstCb);
               GXutil.writeLogRaw("Current: ",T01NV2_A13386LDESEstCb[0]);
            }
            if ( GXutil.strcmp(Z13338LDESComdD, T01NV2_A13338LDESComdD[0]) != 0 )
            {
               GXutil.writeLogln("tldes03:[seudo value changed for attri]"+"LDESComdD");
               GXutil.writeLogRaw("Old: ",Z13338LDESComdD);
               GXutil.writeLogRaw("Current: ",T01NV2_A13338LDESComdD[0]);
            }
            if ( Z13345LDESUltLP != T01NV2_A13345LDESUltLP[0] )
            {
               GXutil.writeLogln("tldes03:[seudo value changed for attri]"+"LDESUltLP");
               GXutil.writeLogRaw("Old: ",Z13345LDESUltLP);
               GXutil.writeLogRaw("Current: ",T01NV2_A13345LDESUltLP[0]);
            }
            if ( Z13346LDESUltP != T01NV2_A13346LDESUltP[0] )
            {
               GXutil.writeLogln("tldes03:[seudo value changed for attri]"+"LDESUltP");
               GXutil.writeLogRaw("Old: ",Z13346LDESUltP);
               GXutil.writeLogRaw("Current: ",T01NV2_A13346LDESUltP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDES02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NV1825( )
   {
      beforeValidate1NV1825( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NV1825( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NV1825( 0) ;
         checkOptimisticConcurrency1NV1825( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NV1825( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NV1825( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01NV19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo, Boolean.valueOf(n13386LDESEstCb), Byte.valueOf(A13386LDESEstCb), Boolean.valueOf(n13338LDESComdD), A13338LDESComdD, Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                  if ( (pr_default.getStatus(17) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && ( true /* After */ || true /* After */ ) )
                     {
                        httpContext.wjLoc = formatLink("app.tldes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque)),GXutil.URLEncode(GXutil.rtrim(A13337LDESComb)),GXutil.URLEncode(GXutil.rtrim(A13339LDESFondo))}, new String[] {"EmprCod","LDESID","LDESNPeque","LDESComb","LDESFondo"})  ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        E13339LDESFondo = A13339LDESFondo ;
                        E13337LDESComb = A13337LDESComb ;
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
            load1NV1825( ) ;
         }
         endLevel1NV1825( ) ;
      }
      closeExtendedTableCursors1NV1825( ) ;
   }

   public void update1NV1825( )
   {
      beforeValidate1NV1825( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NV1825( ) ;
      }
      if ( ( nIsMod_1825 != 0 ) || ( nIsDirty_1825 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1NV1825( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1NV1825( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1NV1825( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01NV20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n13386LDESEstCb), Byte.valueOf(A13386LDESEstCb), Boolean.valueOf(n13338LDESComdD), A13338LDESComdD, Boolean.valueOf(n13345LDESUltLP), Short.valueOf(A13345LDESUltLP), Boolean.valueOf(n13346LDESUltP), Short.valueOf(A13346LDESUltP), A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDES02"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1NV1825( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* Level */ && ( true /* After */ || true /* After */ ) )
                        {
                           httpContext.wjLoc = formatLink("app.tldes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque)),GXutil.URLEncode(GXutil.rtrim(A13337LDESComb)),GXutil.URLEncode(GXutil.rtrim(A13339LDESFondo))}, new String[] {"EmprCod","LDESID","LDESNPeque","LDESComb","LDESFondo"})  ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1NV1825( ) ;
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
            endLevel1NV1825( ) ;
         }
      }
      closeExtendedTableCursors1NV1825( ) ;
   }

   public void deferredUpdate1NV1825( )
   {
   }

   public void delete1NV1825( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1NV1825( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NV1825( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NV1825( ) ;
         afterConfirm1NV1825( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NV1825( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01NV21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDES02");
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
      sMode1825 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1NV1825( ) ;
      Gx_mode = sMode1825 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1NV1825( )
   {
      standaloneModal1NV1825( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01NV22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01NV23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque, A13337LDESComb, A13339LDESFondo});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void endLevel1NV1825( )
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

   public void scanStart1NV1825( )
   {
      /* Scan By routine */
      /* Using cursor T01NV24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID), A13333LDESNPeque});
      RcdFound1825 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A13337LDESComb = T01NV24_A13337LDESComb[0] ;
         A13339LDESFondo = T01NV24_A13339LDESFondo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1NV1825( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1825 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1825 = (short)(1) ;
         A13337LDESComb = T01NV24_A13337LDESComb[0] ;
         A13339LDESFondo = T01NV24_A13339LDESFondo[0] ;
      }
   }

   public void scanEnd1NV1825( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1NV1825( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NV1825( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NV1825( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NV1825( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NV1825( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NV1825( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NV1825( )
   {
      edtLDESComb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtLDESComdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComdD_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtLDESFondo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtLDESEstCb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESEstCb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESEstCb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtLDESUltLP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltLP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltLP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtLDESUltP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESUltP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESUltP_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1NV1825( )
   {
   }

   public void send_integrity_lvl_hashes1NV1824( )
   {
   }

   public void subsflControlProps_451825( )
   {
      edtavnRcdDeleted_1825_Internalname = "vNRCDDELETED_1825_"+sGXsfl_45_idx ;
      edtLDESComb_Internalname = "LDESCOMB_"+sGXsfl_45_idx ;
      edtLDESComdD_Internalname = "LDESCOMDD_"+sGXsfl_45_idx ;
      edtLDESFondo_Internalname = "LDESFONDO_"+sGXsfl_45_idx ;
      edtLDESEstCb_Internalname = "LDESESTCB_"+sGXsfl_45_idx ;
      edtLDESUltLP_Internalname = "LDESULTLP_"+sGXsfl_45_idx ;
      edtLDESUltP_Internalname = "LDESULTP_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451825( )
   {
      edtavnRcdDeleted_1825_Internalname = "vNRCDDELETED_1825_"+sGXsfl_45_fel_idx ;
      edtLDESComb_Internalname = "LDESCOMB_"+sGXsfl_45_fel_idx ;
      edtLDESComdD_Internalname = "LDESCOMDD_"+sGXsfl_45_fel_idx ;
      edtLDESFondo_Internalname = "LDESFONDO_"+sGXsfl_45_fel_idx ;
      edtLDESEstCb_Internalname = "LDESESTCB_"+sGXsfl_45_fel_idx ;
      edtLDESUltLP_Internalname = "LDESULTLP_"+sGXsfl_45_fel_idx ;
      edtLDESUltP_Internalname = "LDESULTP_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1NV1825( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451825( ) ;
      sendRow1NV1825( ) ;
   }

   public void sendRow1NV1825( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1825_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1825_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1825), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1825), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1825_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1825_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESComb_Internalname,GXutil.rtrim( A13337LDESComb),GXutil.rtrim( localUtil.format( A13337LDESComb, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESComb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESComb_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESComdD_Internalname,GXutil.rtrim( A13338LDESComdD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESComdD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESComdD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESFondo_Internalname,GXutil.rtrim( A13339LDESFondo),GXutil.rtrim( localUtil.format( A13339LDESFondo, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESFondo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESFondo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESEstCb_Internalname,GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESEstCb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13386LDESEstCb), "9") : localUtil.format( DecimalUtil.doubleToDec(A13386LDESEstCb), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESEstCb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESEstCb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESUltLP_Internalname,GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESUltLP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13345LDESUltLP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13345LDESUltLP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESUltLP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESUltLP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1825_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLDESUltP_Internalname,GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLDESUltP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13346LDESUltP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13346LDESUltP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLDESUltP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtLDESUltP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1NV1825( ) ;
      GXCCtl = "Z13337LDESComb_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13337LDESComb));
      GXCCtl = "Z13339LDESFondo_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13339LDESFondo));
      GXCCtl = "Z13386LDESEstCb_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13386LDESEstCb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13338LDESComdD_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13338LDESComdD));
      GXCCtl = "Z13345LDESUltLP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13345LDESUltLP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13346LDESUltP_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13346LDESUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1825_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1825_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1825_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1825, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1825_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1825_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCOMB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESCOMDD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESFONDO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESESTCB_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESULTLP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LDESULTP_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1NV1825( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451825( ) ;
      edtavnRcdDeleted_1825_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1825_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESComb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESComdD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESCOMDD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESFondo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESFONDO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESEstCb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESESTCB_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESUltLP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTLP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLDESUltP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LDESULTP_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1825_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1825_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1825");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1825_Internalname ;
         wbErr = true ;
         nRcdDeleted_1825 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1825 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1825_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13337LDESComb = GXutil.upper( httpContext.cgiGet( edtLDESComb_Internalname)) ;
      A13338LDESComdD = httpContext.cgiGet( edtLDESComdD_Internalname) ;
      n13338LDESComdD = false ;
      A13339LDESFondo = GXutil.upper( httpContext.cgiGet( edtLDESFondo_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESEstCb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESEstCb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "LDESESTCB_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESEstCb_Internalname ;
         wbErr = true ;
         A13386LDESEstCb = (byte)(0) ;
         n13386LDESEstCb = false ;
      }
      else
      {
         A13386LDESEstCb = (byte)(localUtil.ctol( httpContext.cgiGet( edtLDESEstCb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13386LDESEstCb = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LDESULTLP_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESUltLP_Internalname ;
         wbErr = true ;
         A13345LDESUltLP = (short)(0) ;
         n13345LDESUltLP = false ;
      }
      else
      {
         A13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESUltLP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13345LDESUltLP = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LDESULTP_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESUltP_Internalname ;
         wbErr = true ;
         A13346LDESUltP = (short)(0) ;
         n13346LDESUltP = false ;
      }
      else
      {
         A13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( edtLDESUltP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13346LDESUltP = false ;
      }
      GXCCtl = "Z13337LDESComb_" + sGXsfl_45_idx ;
      Z13337LDESComb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13339LDESFondo_" + sGXsfl_45_idx ;
      Z13339LDESFondo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13386LDESEstCb_" + sGXsfl_45_idx ;
      Z13386LDESEstCb = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13338LDESComdD_" + sGXsfl_45_idx ;
      Z13338LDESComdD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13345LDESUltLP_" + sGXsfl_45_idx ;
      Z13345LDESUltLP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13346LDESUltP_" + sGXsfl_45_idx ;
      Z13346LDESUltP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1825_" + sGXsfl_45_idx ;
      nRcdDeleted_1825 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1825_" + sGXsfl_45_idx ;
      nRcdExists_1825 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1825_" + sGXsfl_45_idx ;
      nIsMod_1825 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLDESFondo_Enabled = edtLDESFondo_Enabled ;
      defedtLDESComb_Enabled = edtLDESComb_Enabled ;
   }

   public void confirmValues1NV0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451825( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451825( ) ;
         httpContext.changePostValue( "Z13337LDESComb_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13337LDESComb_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13337LDESComb_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13339LDESFondo_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13339LDESFondo_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13339LDESFondo_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13386LDESEstCb_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13386LDESEstCb_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13338LDESComdD_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13338LDESComdD_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13338LDESComdD_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13345LDESUltLP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13345LDESUltLP_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13346LDESUltP_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13346LDESUltP_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13346LDESUltP_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tldes03", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque))}, new String[] {"EmprCod","LDESID","LDESNPeque"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13324LDESID", GXutil.ltrim( localUtil.ntoc( Z13324LDESID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13333LDESNPeque", GXutil.rtrim( Z13333LDESNPeque));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13334LDESDPeque", GXutil.rtrim( Z13334LDESDPeque));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV36Pgmname));
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
      return formatLink("app.tldes03", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque))}, new String[] {"EmprCod","LDESID","LDESNPeque"})  ;
   }

   public String getPgmname( )
   {
      return "TLDES03" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lab DIP Estampacion (Combinaciones)", "") ;
   }

   public void initializeNonKey1NV1824( )
   {
      A13334LDESDPeque = "" ;
      n13334LDESDPeque = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13334LDESDPeque", A13334LDESDPeque);
      Z13334LDESDPeque = "" ;
   }

   public void initAll1NV1824( )
   {
      initializeNonKey1NV1824( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1NV1825( )
   {
      A13338LDESComdD = "" ;
      n13338LDESComdD = false ;
      A13345LDESUltLP = (short)(0) ;
      n13345LDESUltLP = false ;
      A13346LDESUltP = (short)(0) ;
      n13346LDESUltP = false ;
      A13386LDESEstCb = (byte)(0) ;
      n13386LDESEstCb = false ;
      Z13386LDESEstCb = (byte)(0) ;
      Z13338LDESComdD = "" ;
      Z13345LDESUltLP = (short)(0) ;
      Z13346LDESUltP = (short)(0) ;
   }

   public void initAll1NV1825( )
   {
      A13337LDESComb = E13337LDESComb ;
      A13339LDESFondo = E13339LDESFondo ;
      initializeNonKey1NV1825( ) ;
   }

   public void standaloneModalInsert1NV1825( )
   {
      A13386LDESEstCb = i13386LDESEstCb ;
      n13386LDESEstCb = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415102596", true, true);
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
      httpContext.AddJavascriptSource("tldes03.js", "?202682415102596", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1825( )
   {
      edtLDESFondo_Enabled = defedtLDESFondo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESFondo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESFondo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtLDESComb_Enabled = defedtLDESComb_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLDESComb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLDESComb_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1825, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1825_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13337LDESComb));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13338LDESComdD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESComdD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13339LDESFondo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESFondo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13386LDESEstCb, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESEstCb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13345LDESUltLP, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltLP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13346LDESUltP, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLDESUltP_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtLDESID_Internalname = "LDESID" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtLDESNPeque_Internalname = "LDESNPEQUE" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtLDESDPeque_Internalname = "LDESDPEQUE" ;
      edtavnRcdDeleted_1825_Internalname = "vNRCDDELETED_1825" ;
      edtLDESComb_Internalname = "LDESCOMB" ;
      edtLDESComdD_Internalname = "LDESCOMDD" ;
      edtLDESFondo_Internalname = "LDESFONDO" ;
      edtLDESEstCb_Internalname = "LDESESTCB" ;
      edtLDESUltLP_Internalname = "LDESULTLP" ;
      edtLDESUltP_Internalname = "LDESULTP" ;
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
      Form.setCaption( httpContext.getMessage( "Lab DIP Estampacion (Combinaciones)", "") );
      edtLDESUltP_Jsonclick = "" ;
      edtLDESUltLP_Jsonclick = "" ;
      edtLDESEstCb_Jsonclick = "" ;
      edtLDESFondo_Jsonclick = "" ;
      edtLDESComdD_Jsonclick = "" ;
      edtLDESComb_Jsonclick = "" ;
      edtavnRcdDeleted_1825_Jsonclick = "" ;
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
      edtLDESUltP_Enabled = 1 ;
      edtLDESUltLP_Enabled = 1 ;
      edtLDESEstCb_Enabled = 1 ;
      edtLDESFondo_Enabled = 1 ;
      edtLDESComdD_Enabled = 1 ;
      edtLDESComb_Enabled = 1 ;
      edtavnRcdDeleted_1825_Enabled = 1 ;
      edtLDESDPeque_Jsonclick = "" ;
      edtLDESDPeque_Backcolor = (int)(0xFFFFFF) ;
      edtLDESDPeque_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtLDESNPeque_Jsonclick = "" ;
      edtLDESNPeque_Backcolor = (int)(0xFFFFFF) ;
      edtLDESNPeque_Enabled = 0 ;
      edtLDESID_Jsonclick = "" ;
      edtLDESID_Backcolor = (int)(0xFFFFFF) ;
      edtLDESID_Enabled = 0 ;
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

   public void xc_6_1NV1825( )
   {
      if ( true /* Level */ && ( true /* After */ || true /* After */ ) )
      {
         httpContext.wjLoc = formatLink("app.tldes02", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13324LDESID,8,0)),GXutil.URLEncode(GXutil.rtrim(A13333LDESNPeque)),GXutil.URLEncode(GXutil.rtrim(A13337LDESComb)),GXutil.URLEncode(GXutil.rtrim(A13339LDESFondo))}, new String[] {"EmprCod","LDESID","LDESNPeque","LDESComb","LDESFondo"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
      subsflControlProps_451825( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1NV1825( ) ;
         standaloneModal1NV1825( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1NV1825( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451825( ) ;
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
      /* Using cursor T01NV25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01NV25_A407EmprNom[0] ;
      n407EmprNom = T01NV25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T01NV26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Lab DIP Estampacion", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LDESID");
         AnyError = (short)(1) ;
      }
      pr_default.close(24);
      GX_FocusControl = edtLDESDPeque_Internalname ;
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

   public void valid_Ldesnpeque( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13334LDESDPeque", GXutil.rtrim( A13334LDESDPeque));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13324LDESID", GXutil.ltrim( localUtil.ntoc( Z13324LDESID, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13333LDESNPeque", GXutil.rtrim( Z13333LDESNPeque));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13334LDESDPeque", GXutil.rtrim( Z13334LDESDPeque));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Ldescomb( )
   {
      if ( (GXutil.strcmp("", A13337LDESComb)==0) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Combinacion Invalida", ""), 1, "LDESCOMB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESComb_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Ldesfondo( )
   {
      if ( (GXutil.strcmp("", A13339LDESFondo)==0) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fondo Invalido", ""), 1, "LDESFONDO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLDESFondo_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'A13333LDESNPeque',fld:'LDESNPEQUE',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'MODIFICAR COMBINACION (PRODUCTOS,PASTA)'","{handler:'e121NV2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'A13333LDESNPeque',fld:'LDESNPEQUE',pic:''},{av:'A13337LDESComb',fld:'LDESCOMB',pic:'@!'},{av:'A13339LDESFondo',fld:'LDESFONDO',pic:'@!'}]");
      setEventMetadata("'MODIFICAR COMBINACION (PRODUCTOS,PASTA)'",",oparms:[{av:'A13339LDESFondo',fld:'LDESFONDO',pic:'@!'},{av:'A13337LDESComb',fld:'LDESCOMB',pic:'@!'},{av:'A13333LDESNPeque',fld:'LDESNPEQUE',pic:''},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LDESID","{handler:'valid_Ldesid',iparms:[]");
      setEventMetadata("VALID_LDESID",",oparms:[]}");
      setEventMetadata("VALID_LDESNPEQUE","{handler:'valid_Ldesnpeque',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13324LDESID',fld:'LDESID',pic:'ZZZZZZZ9'},{av:'A13333LDESNPeque',fld:'LDESNPEQUE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LDESNPEQUE",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13334LDESDPeque',fld:'LDESDPEQUE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13324LDESID'},{av:'Z13333LDESNPeque'},{av:'Z407EmprNom'},{av:'Z13334LDESDPeque'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_LDESCOMB","{handler:'valid_Ldescomb',iparms:[{av:'A13337LDESComb',fld:'LDESCOMB',pic:'@!'}]");
      setEventMetadata("VALID_LDESCOMB",",oparms:[]}");
      setEventMetadata("VALID_LDESFONDO","{handler:'valid_Ldesfondo',iparms:[{av:'A13339LDESFondo',fld:'LDESFONDO',pic:'@!'}]");
      setEventMetadata("VALID_LDESFONDO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ldesultp',iparms:[]");
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
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E13339LDESFondo = "" ;
      E13337LDESComb = "" ;
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA13333LDESNPeque = "" ;
      Z396EmprCod = "" ;
      Z13333LDESNPeque = "" ;
      Z13334LDESDPeque = "" ;
      Z13337LDESComb = "" ;
      Z13339LDESFondo = "" ;
      Z13338LDESComdD = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13333LDESNPeque = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A13334LDESDPeque = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1825 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV36Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1824 = "" ;
      GXCCtl = "" ;
      A13337LDESComb = "" ;
      A13338LDESComdD = "" ;
      A13339LDESFondo = "" ;
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
      T01NV6_A407EmprNom = new String[] {""} ;
      T01NV6_n407EmprNom = new boolean[] {false} ;
      T01NV7_A396EmprCod = new String[] {""} ;
      T01NV8_A13333LDESNPeque = new String[] {""} ;
      T01NV8_A407EmprNom = new String[] {""} ;
      T01NV8_n407EmprNom = new boolean[] {false} ;
      T01NV8_A13334LDESDPeque = new String[] {""} ;
      T01NV8_n13334LDESDPeque = new boolean[] {false} ;
      T01NV8_A396EmprCod = new String[] {""} ;
      T01NV8_A13324LDESID = new int[1] ;
      T01NV9_A396EmprCod = new String[] {""} ;
      T01NV9_A13324LDESID = new int[1] ;
      T01NV9_A13333LDESNPeque = new String[] {""} ;
      T01NV5_A13333LDESNPeque = new String[] {""} ;
      T01NV5_A13334LDESDPeque = new String[] {""} ;
      T01NV5_n13334LDESDPeque = new boolean[] {false} ;
      T01NV5_A396EmprCod = new String[] {""} ;
      T01NV5_A13324LDESID = new int[1] ;
      T01NV10_A396EmprCod = new String[] {""} ;
      T01NV10_A13324LDESID = new int[1] ;
      T01NV10_A13333LDESNPeque = new String[] {""} ;
      T01NV11_A396EmprCod = new String[] {""} ;
      T01NV11_A13324LDESID = new int[1] ;
      T01NV11_A13333LDESNPeque = new String[] {""} ;
      T01NV4_A13333LDESNPeque = new String[] {""} ;
      T01NV4_A13334LDESDPeque = new String[] {""} ;
      T01NV4_n13334LDESDPeque = new boolean[] {false} ;
      T01NV4_A396EmprCod = new String[] {""} ;
      T01NV4_A13324LDESID = new int[1] ;
      T01NV15_A396EmprCod = new String[] {""} ;
      T01NV15_A13324LDESID = new int[1] ;
      T01NV15_A13333LDESNPeque = new String[] {""} ;
      T01NV15_A13337LDESComb = new String[] {""} ;
      T01NV15_A13339LDESFondo = new String[] {""} ;
      T01NV15_A13340LDESLinP = new short[1] ;
      T01NV16_A396EmprCod = new String[] {""} ;
      T01NV16_A13324LDESID = new int[1] ;
      T01NV16_A13333LDESNPeque = new String[] {""} ;
      E13337LDESComb = "" ;
      E13339LDESFondo = "" ;
      T01NV17_A13324LDESID = new int[1] ;
      T01NV17_A13333LDESNPeque = new String[] {""} ;
      T01NV17_A13337LDESComb = new String[] {""} ;
      T01NV17_A13339LDESFondo = new String[] {""} ;
      T01NV17_A13386LDESEstCb = new byte[1] ;
      T01NV17_n13386LDESEstCb = new boolean[] {false} ;
      T01NV17_A13338LDESComdD = new String[] {""} ;
      T01NV17_n13338LDESComdD = new boolean[] {false} ;
      T01NV17_A13345LDESUltLP = new short[1] ;
      T01NV17_n13345LDESUltLP = new boolean[] {false} ;
      T01NV17_A13346LDESUltP = new short[1] ;
      T01NV17_n13346LDESUltP = new boolean[] {false} ;
      T01NV17_A396EmprCod = new String[] {""} ;
      T01NV18_A396EmprCod = new String[] {""} ;
      T01NV18_A13324LDESID = new int[1] ;
      T01NV18_A13333LDESNPeque = new String[] {""} ;
      T01NV18_A13337LDESComb = new String[] {""} ;
      T01NV18_A13339LDESFondo = new String[] {""} ;
      T01NV3_A13324LDESID = new int[1] ;
      T01NV3_A13333LDESNPeque = new String[] {""} ;
      T01NV3_A13337LDESComb = new String[] {""} ;
      T01NV3_A13339LDESFondo = new String[] {""} ;
      T01NV3_A13386LDESEstCb = new byte[1] ;
      T01NV3_n13386LDESEstCb = new boolean[] {false} ;
      T01NV3_A13338LDESComdD = new String[] {""} ;
      T01NV3_n13338LDESComdD = new boolean[] {false} ;
      T01NV3_A13345LDESUltLP = new short[1] ;
      T01NV3_n13345LDESUltLP = new boolean[] {false} ;
      T01NV3_A13346LDESUltP = new short[1] ;
      T01NV3_n13346LDESUltP = new boolean[] {false} ;
      T01NV3_A396EmprCod = new String[] {""} ;
      T01NV2_A13324LDESID = new int[1] ;
      T01NV2_A13333LDESNPeque = new String[] {""} ;
      T01NV2_A13337LDESComb = new String[] {""} ;
      T01NV2_A13339LDESFondo = new String[] {""} ;
      T01NV2_A13386LDESEstCb = new byte[1] ;
      T01NV2_n13386LDESEstCb = new boolean[] {false} ;
      T01NV2_A13338LDESComdD = new String[] {""} ;
      T01NV2_n13338LDESComdD = new boolean[] {false} ;
      T01NV2_A13345LDESUltLP = new short[1] ;
      T01NV2_n13345LDESUltLP = new boolean[] {false} ;
      T01NV2_A13346LDESUltP = new short[1] ;
      T01NV2_n13346LDESUltP = new boolean[] {false} ;
      T01NV2_A396EmprCod = new String[] {""} ;
      T01NV22_A396EmprCod = new String[] {""} ;
      T01NV22_A13324LDESID = new int[1] ;
      T01NV22_A13333LDESNPeque = new String[] {""} ;
      T01NV22_A13337LDESComb = new String[] {""} ;
      T01NV22_A13339LDESFondo = new String[] {""} ;
      T01NV22_A13342LDESLinea = new short[1] ;
      T01NV23_A396EmprCod = new String[] {""} ;
      T01NV23_A13324LDESID = new int[1] ;
      T01NV23_A13333LDESNPeque = new String[] {""} ;
      T01NV23_A13337LDESComb = new String[] {""} ;
      T01NV23_A13339LDESFondo = new String[] {""} ;
      T01NV23_A13340LDESLinP = new short[1] ;
      T01NV24_A396EmprCod = new String[] {""} ;
      T01NV24_A13324LDESID = new int[1] ;
      T01NV24_A13333LDESNPeque = new String[] {""} ;
      T01NV24_A13337LDESComb = new String[] {""} ;
      T01NV24_A13339LDESFondo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01NV25_A407EmprNom = new String[] {""} ;
      T01NV25_n407EmprNom = new boolean[] {false} ;
      T01NV26_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ13333LDESNPeque = "" ;
      ZZ407EmprNom = "" ;
      ZZ13334LDESDPeque = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tldes03__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tldes03__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tldes03__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tldes03__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tldes03__default(),
         new Object[] {
             new Object[] {
            T01NV2_A13324LDESID, T01NV2_A13333LDESNPeque, T01NV2_A13337LDESComb, T01NV2_A13339LDESFondo, T01NV2_A13386LDESEstCb, T01NV2_n13386LDESEstCb, T01NV2_A13338LDESComdD, T01NV2_n13338LDESComdD, T01NV2_A13345LDESUltLP, T01NV2_n13345LDESUltLP,
            T01NV2_A13346LDESUltP, T01NV2_n13346LDESUltP, T01NV2_A396EmprCod
            }
            , new Object[] {
            T01NV3_A13324LDESID, T01NV3_A13333LDESNPeque, T01NV3_A13337LDESComb, T01NV3_A13339LDESFondo, T01NV3_A13386LDESEstCb, T01NV3_n13386LDESEstCb, T01NV3_A13338LDESComdD, T01NV3_n13338LDESComdD, T01NV3_A13345LDESUltLP, T01NV3_n13345LDESUltLP,
            T01NV3_A13346LDESUltP, T01NV3_n13346LDESUltP, T01NV3_A396EmprCod
            }
            , new Object[] {
            T01NV4_A13333LDESNPeque, T01NV4_A13334LDESDPeque, T01NV4_n13334LDESDPeque, T01NV4_A396EmprCod, T01NV4_A13324LDESID
            }
            , new Object[] {
            T01NV5_A13333LDESNPeque, T01NV5_A13334LDESDPeque, T01NV5_n13334LDESDPeque, T01NV5_A396EmprCod, T01NV5_A13324LDESID
            }
            , new Object[] {
            T01NV6_A407EmprNom, T01NV6_n407EmprNom
            }
            , new Object[] {
            T01NV7_A396EmprCod
            }
            , new Object[] {
            T01NV8_A13333LDESNPeque, T01NV8_A407EmprNom, T01NV8_n407EmprNom, T01NV8_A13334LDESDPeque, T01NV8_n13334LDESDPeque, T01NV8_A396EmprCod, T01NV8_A13324LDESID
            }
            , new Object[] {
            T01NV9_A396EmprCod, T01NV9_A13324LDESID, T01NV9_A13333LDESNPeque
            }
            , new Object[] {
            T01NV10_A396EmprCod, T01NV10_A13324LDESID, T01NV10_A13333LDESNPeque
            }
            , new Object[] {
            T01NV11_A396EmprCod, T01NV11_A13324LDESID, T01NV11_A13333LDESNPeque
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NV15_A396EmprCod, T01NV15_A13324LDESID, T01NV15_A13333LDESNPeque, T01NV15_A13337LDESComb, T01NV15_A13339LDESFondo, T01NV15_A13340LDESLinP
            }
            , new Object[] {
            T01NV16_A396EmprCod, T01NV16_A13324LDESID, T01NV16_A13333LDESNPeque
            }
            , new Object[] {
            T01NV17_A13324LDESID, T01NV17_A13333LDESNPeque, T01NV17_A13337LDESComb, T01NV17_A13339LDESFondo, T01NV17_A13386LDESEstCb, T01NV17_n13386LDESEstCb, T01NV17_A13338LDESComdD, T01NV17_n13338LDESComdD, T01NV17_A13345LDESUltLP, T01NV17_n13345LDESUltLP,
            T01NV17_A13346LDESUltP, T01NV17_n13346LDESUltP, T01NV17_A396EmprCod
            }
            , new Object[] {
            T01NV18_A396EmprCod, T01NV18_A13324LDESID, T01NV18_A13333LDESNPeque, T01NV18_A13337LDESComb, T01NV18_A13339LDESFondo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01NV22_A396EmprCod, T01NV22_A13324LDESID, T01NV22_A13333LDESNPeque, T01NV22_A13337LDESComb, T01NV22_A13339LDESFondo, T01NV22_A13342LDESLinea
            }
            , new Object[] {
            T01NV23_A396EmprCod, T01NV23_A13324LDESID, T01NV23_A13333LDESNPeque, T01NV23_A13337LDESComb, T01NV23_A13339LDESFondo, T01NV23_A13340LDESLinP
            }
            , new Object[] {
            T01NV24_A396EmprCod, T01NV24_A13324LDESID, T01NV24_A13333LDESNPeque, T01NV24_A13337LDESComb, T01NV24_A13339LDESFondo
            }
            , new Object[] {
            T01NV25_A407EmprNom, T01NV25_n407EmprNom
            }
            , new Object[] {
            T01NV26_A396EmprCod
            }
         }
      );
      Z13333LDESNPeque = "" ;
      A13333LDESNPeque = "" ;
      Z13324LDESID = 0 ;
      A13324LDESID = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV36Pgmname = "TLDES03" ;
      Z13386LDESEstCb = (byte)(0) ;
      n13386LDESEstCb = false ;
      A13386LDESEstCb = (byte)(0) ;
      n13386LDESEstCb = false ;
      i13386LDESEstCb = (byte)(0) ;
      n13386LDESEstCb = false ;
      Z13339LDESFondo = "" ;
      A13339LDESFondo = "" ;
      E13339LDESFondo = "" ;
      Z13337LDESComb = "" ;
      A13337LDESComb = "" ;
      E13337LDESComb = "" ;
   }

   private byte Z13386LDESEstCb ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A13386LDESEstCb ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i13386LDESEstCb ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z13345LDESUltLP ;
   private short Z13346LDESUltP ;
   private short nRcdDeleted_1825 ;
   private short nRcdExists_1825 ;
   private short nIsMod_1825 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1825 ;
   private short RcdFound1825 ;
   private short nBlankRcdUsr1825 ;
   private short A13345LDESUltLP ;
   private short A13346LDESUltP ;
   private short RcdFound1824 ;
   private short nIsDirty_1824 ;
   private short nIsDirty_1825 ;
   private int wcpOA13324LDESID ;
   private int Z13324LDESID ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int A13324LDESID ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtLDESID_Enabled ;
   private int edtLDESNPeque_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtLDESDPeque_Enabled ;
   private int edtavnRcdDeleted_1825_Enabled ;
   private int edtLDESComb_Enabled ;
   private int edtLDESComdD_Enabled ;
   private int edtLDESFondo_Enabled ;
   private int edtLDESEstCb_Enabled ;
   private int edtLDESUltLP_Enabled ;
   private int edtLDESUltP_Enabled ;
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
   private int defedtLDESFondo_Enabled ;
   private int defedtLDESComb_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtLDESDPeque_Backcolor ;
   private int edtLDESNPeque_Backcolor ;
   private int edtLDESID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13324LDESID ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA13333LDESNPeque ;
   private String Z396EmprCod ;
   private String Z13333LDESNPeque ;
   private String Z13334LDESDPeque ;
   private String Z13337LDESComb ;
   private String Z13339LDESFondo ;
   private String Z13338LDESComdD ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A13333LDESNPeque ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLDESDPeque_Internalname ;
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
   private String edtLDESID_Internalname ;
   private String edtLDESID_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtLDESNPeque_Internalname ;
   private String edtLDESNPeque_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String A13334LDESDPeque ;
   private String edtLDESDPeque_Jsonclick ;
   private String sMode1825 ;
   private String edtavnRcdDeleted_1825_Internalname ;
   private String edtLDESComb_Internalname ;
   private String edtLDESComdD_Internalname ;
   private String edtLDESFondo_Internalname ;
   private String edtLDESEstCb_Internalname ;
   private String edtLDESUltLP_Internalname ;
   private String edtLDESUltP_Internalname ;
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
   private String AV36Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1824 ;
   private String GXCCtl ;
   private String A13337LDESComb ;
   private String A13338LDESComdD ;
   private String A13339LDESFondo ;
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
   private String E13337LDESComb ;
   private String E13339LDESFondo ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1825_Jsonclick ;
   private String edtLDESComb_Jsonclick ;
   private String edtLDESComdD_Jsonclick ;
   private String edtLDESFondo_Jsonclick ;
   private String edtLDESEstCb_Jsonclick ;
   private String edtLDESUltLP_Jsonclick ;
   private String edtLDESUltP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ13333LDESNPeque ;
   private String ZZ407EmprNom ;
   private String ZZ13334LDESDPeque ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13334LDESDPeque ;
   private boolean returnInSub ;
   private boolean n13386LDESEstCb ;
   private boolean n13338LDESComdD ;
   private boolean n13345LDESUltLP ;
   private boolean n13346LDESUltP ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01NV6_A407EmprNom ;
   private boolean[] T01NV6_n407EmprNom ;
   private String[] T01NV7_A396EmprCod ;
   private String[] T01NV8_A13333LDESNPeque ;
   private String[] T01NV8_A407EmprNom ;
   private boolean[] T01NV8_n407EmprNom ;
   private String[] T01NV8_A13334LDESDPeque ;
   private boolean[] T01NV8_n13334LDESDPeque ;
   private String[] T01NV8_A396EmprCod ;
   private int[] T01NV8_A13324LDESID ;
   private String[] T01NV9_A396EmprCod ;
   private int[] T01NV9_A13324LDESID ;
   private String[] T01NV9_A13333LDESNPeque ;
   private String[] T01NV5_A13333LDESNPeque ;
   private String[] T01NV5_A13334LDESDPeque ;
   private boolean[] T01NV5_n13334LDESDPeque ;
   private String[] T01NV5_A396EmprCod ;
   private int[] T01NV5_A13324LDESID ;
   private String[] T01NV10_A396EmprCod ;
   private int[] T01NV10_A13324LDESID ;
   private String[] T01NV10_A13333LDESNPeque ;
   private String[] T01NV11_A396EmprCod ;
   private int[] T01NV11_A13324LDESID ;
   private String[] T01NV11_A13333LDESNPeque ;
   private String[] T01NV4_A13333LDESNPeque ;
   private String[] T01NV4_A13334LDESDPeque ;
   private boolean[] T01NV4_n13334LDESDPeque ;
   private String[] T01NV4_A396EmprCod ;
   private int[] T01NV4_A13324LDESID ;
   private String[] T01NV15_A396EmprCod ;
   private int[] T01NV15_A13324LDESID ;
   private String[] T01NV15_A13333LDESNPeque ;
   private String[] T01NV15_A13337LDESComb ;
   private String[] T01NV15_A13339LDESFondo ;
   private short[] T01NV15_A13340LDESLinP ;
   private String[] T01NV16_A396EmprCod ;
   private int[] T01NV16_A13324LDESID ;
   private String[] T01NV16_A13333LDESNPeque ;
   private int[] T01NV17_A13324LDESID ;
   private String[] T01NV17_A13333LDESNPeque ;
   private String[] T01NV17_A13337LDESComb ;
   private String[] T01NV17_A13339LDESFondo ;
   private byte[] T01NV17_A13386LDESEstCb ;
   private boolean[] T01NV17_n13386LDESEstCb ;
   private String[] T01NV17_A13338LDESComdD ;
   private boolean[] T01NV17_n13338LDESComdD ;
   private short[] T01NV17_A13345LDESUltLP ;
   private boolean[] T01NV17_n13345LDESUltLP ;
   private short[] T01NV17_A13346LDESUltP ;
   private boolean[] T01NV17_n13346LDESUltP ;
   private String[] T01NV17_A396EmprCod ;
   private String[] T01NV18_A396EmprCod ;
   private int[] T01NV18_A13324LDESID ;
   private String[] T01NV18_A13333LDESNPeque ;
   private String[] T01NV18_A13337LDESComb ;
   private String[] T01NV18_A13339LDESFondo ;
   private int[] T01NV3_A13324LDESID ;
   private String[] T01NV3_A13333LDESNPeque ;
   private String[] T01NV3_A13337LDESComb ;
   private String[] T01NV3_A13339LDESFondo ;
   private byte[] T01NV3_A13386LDESEstCb ;
   private boolean[] T01NV3_n13386LDESEstCb ;
   private String[] T01NV3_A13338LDESComdD ;
   private boolean[] T01NV3_n13338LDESComdD ;
   private short[] T01NV3_A13345LDESUltLP ;
   private boolean[] T01NV3_n13345LDESUltLP ;
   private short[] T01NV3_A13346LDESUltP ;
   private boolean[] T01NV3_n13346LDESUltP ;
   private String[] T01NV3_A396EmprCod ;
   private int[] T01NV2_A13324LDESID ;
   private String[] T01NV2_A13333LDESNPeque ;
   private String[] T01NV2_A13337LDESComb ;
   private String[] T01NV2_A13339LDESFondo ;
   private byte[] T01NV2_A13386LDESEstCb ;
   private boolean[] T01NV2_n13386LDESEstCb ;
   private String[] T01NV2_A13338LDESComdD ;
   private boolean[] T01NV2_n13338LDESComdD ;
   private short[] T01NV2_A13345LDESUltLP ;
   private boolean[] T01NV2_n13345LDESUltLP ;
   private short[] T01NV2_A13346LDESUltP ;
   private boolean[] T01NV2_n13346LDESUltP ;
   private String[] T01NV2_A396EmprCod ;
   private String[] T01NV22_A396EmprCod ;
   private int[] T01NV22_A13324LDESID ;
   private String[] T01NV22_A13333LDESNPeque ;
   private String[] T01NV22_A13337LDESComb ;
   private String[] T01NV22_A13339LDESFondo ;
   private short[] T01NV22_A13342LDESLinea ;
   private String[] T01NV23_A396EmprCod ;
   private int[] T01NV23_A13324LDESID ;
   private String[] T01NV23_A13333LDESNPeque ;
   private String[] T01NV23_A13337LDESComb ;
   private String[] T01NV23_A13339LDESFondo ;
   private short[] T01NV23_A13340LDESLinP ;
   private String[] T01NV24_A396EmprCod ;
   private int[] T01NV24_A13324LDESID ;
   private String[] T01NV24_A13333LDESNPeque ;
   private String[] T01NV24_A13337LDESComb ;
   private String[] T01NV24_A13339LDESFondo ;
   private String[] T01NV25_A407EmprNom ;
   private boolean[] T01NV25_n407EmprNom ;
   private String[] T01NV26_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tldes03__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes03__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes03__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes03__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tldes03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01NV2", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESEstCb, LDESComdD, LDESUltLP, LDESUltP, EmprCod FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?  FOR UPDATE OF LDESEstCb, LDESComdD, LDESUltLP, LDESUltP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NV3", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESEstCb, LDESComdD, LDESUltLP, LDESUltP, EmprCod FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NV4", "SELECT LDESNPeque, LDESDPeque, EmprCod, LDESID FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?  FOR UPDATE OF LDESDPeque NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV5", "SELECT LDESNPeque, LDESDPeque, EmprCod, LDESID FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV7", "SELECT EmprCod FROM TXPLDES00 WHERE EmprCod = ? AND LDESID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV8", "SELECT /*+ FIRST_ROWS(1) */ TM1.LDESNPeque, T2.EmprNom, TM1.LDESDPeque, TM1.EmprCod, TM1.LDESID FROM (TXPLDES01 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.LDESID = ? and TM1.LDESNPeque = ? ORDER BY TM1.EmprCod, TM1.LDESID, TM1.LDESNPeque ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? ORDER BY EmprCod, LDESID, LDESNPeque) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? ORDER BY EmprCod DESC, LDESID DESC, LDESNPeque DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01NV12", "INSERT INTO TXPLDES01(LDESNPeque, LDESDPeque, EmprCod, LDESID, LDESMedida, LDESMalla, LDESCob) VALUES(?, ?, ?, ?, ' ', ' ', 0)", GX_NOMASK, "TXPLDES01")
         ,new UpdateCursor("T01NV13", "UPDATE TXPLDES01 SET LDESDPeque=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?", GX_NOMASK, "TXPLDES01")
         ,new UpdateCursor("T01NV14", "DELETE FROM TXPLDES01  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?", GX_NOMASK, "TXPLDES01")
         ,new ForEachCursor("T01NV15", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, LDESID, LDESNPeque FROM TXPLDES01 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? ORDER BY EmprCod, LDESID, LDESNPeque ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV17", "SELECT LDESID, LDESNPeque, LDESComb, LDESFondo, LDESEstCb, LDESComdD, LDESUltLP, LDESUltP, EmprCod FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? and LDESComb = ? and LDESFondo = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NV18", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01NV19", "INSERT INTO TXPLDES02(LDESID, LDESNPeque, LDESComb, LDESFondo, LDESEstCb, LDESComdD, LDESUltLP, LDESUltP, EmprCod, LDESFecEnv, LDESFecRep) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NV20", "UPDATE TXPLDES02 SET LDESEstCb=?, LDESComdD=?, LDESUltLP=?, LDESUltP=?  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new UpdateCursor("T01NV21", "DELETE FROM TXPLDES02  WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?", GX_NOMASK, "TXPLDES02")
         ,new ForEachCursor("T01NV22", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV23", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinP FROM TXPLDES03 WHERE EmprCod = ? AND LDESID = ? AND LDESNPeque = ? AND LDESComb = ? AND LDESFondo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01NV24", "SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo FROM TXPLDES02 WHERE EmprCod = ? and LDESID = ? and LDESNPeque = ? ORDER BY EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NV25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01NV26", "SELECT EmprCod FROM TXPLDES00 WHERE EmprCod = ? AND LDESID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
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
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
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
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 12);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 12);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               stmt.setString(9, (String)parms[12], 3);
               return;
            case 18 :
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
                  stmt.setString(2, (String)parms[3], 40);
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
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 12);
               stmt.setString(8, (String)parms[11], 12);
               stmt.setString(9, (String)parms[12], 12);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 12);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

