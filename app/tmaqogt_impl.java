package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqogt_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11724ParEnlId = (short)(GXutil.lval( httpContext.GetPar( "ParEnlId"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A11724ParEnlId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11722ParMetId = (short)(GXutil.lval( httpContext.GetPar( "ParMetId"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A11722ParMetId) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAQUINAS ORGATEX", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqOgtId_Internalname ;
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

   public tmaqogt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqogt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqogt_impl.class ));
   }

   public tmaqogt_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAQOGT.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqOgtId_Internalname, GXutil.rtrim( A11726MaqOgtId), GXutil.rtrim( localUtil.format( A11726MaqOgtId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqOgtId_Jsonclick, 0, "", "", "", "", "", 1, edtMaqOgtId_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQOGT.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqOgtDsc_Internalname, GXutil.rtrim( A11727MaqOgtDsc), GXutil.rtrim( localUtil.format( A11727MaqOgtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqOgtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqOgtDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQOGT.htm");
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
         nBlankRcdCount1641 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1641 = (short)(1) ;
            scanStart1HG1641( ) ;
            while ( RcdFound1641 != 0 )
            {
               init_level_properties1641( ) ;
               getByPrimaryKey1HG1641( ) ;
               addRow1HG1641( ) ;
               scanNext1HG1641( ) ;
            }
            scanEnd1HG1641( ) ;
            nBlankRcdCount1641 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1HG1641( ) ;
         standaloneModal1HG1641( ) ;
         sMode1641 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1HG1641( ) ;
            edtavnRcdDeleted_1641_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1641_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1641_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1641_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParMetId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMETID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParMetId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParMetDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMETDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParMetDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParEnlId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARENLID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParEnlId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEnlId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtParEnlDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARENLDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParEnlDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEnlDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMaqoOgtVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQOOGTVAL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqoOgtVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqoOgtVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1641 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1HG1641( ) ;
            }
            sendRow1HG1641( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1641 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1641 = (short)(5) ;
         nRcdExists_1641 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1HG1641( ) ;
            while ( RcdFound1641 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401641( ) ;
               init_level_properties1641( ) ;
               standaloneNotModal1HG1641( ) ;
               getByPrimaryKey1HG1641( ) ;
               standaloneModal1HG1641( ) ;
               addRow1HG1641( ) ;
               scanNext1HG1641( ) ;
            }
            scanEnd1HG1641( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1641 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401641( ) ;
      initAll1HG1641( ) ;
      init_level_properties1641( ) ;
      nRcdExists_1641 = (short)(0) ;
      nIsMod_1641 = (short)(0) ;
      nRcdDeleted_1641 = (short)(0) ;
      nBlankRcdCount1641 = (short)(nBlankRcdUsr1641+nBlankRcdCount1641) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1641 > 0 )
      {
         standaloneNotModal1HG1641( ) ;
         standaloneModal1HG1641( ) ;
         addRow1HG1641( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtParMetId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1641 = (short)(nBlankRcdCount1641-1) ;
      }
      Gx_mode = sMode1641 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQOGT.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMAQOGT.htm");
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
      e111HG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11726MaqOgtId = httpContext.cgiGet( "Z11726MaqOgtId") ;
            Z11727MaqOgtDsc = httpContext.cgiGet( "Z11727MaqOgtDsc") ;
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
            A11726MaqOgtId = httpContext.cgiGet( edtMaqOgtId_Internalname) ;
            n11726MaqOgtId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
            A11727MaqOgtDsc = httpContext.cgiGet( edtMaqOgtDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", A11727MaqOgtDsc);
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
               A11726MaqOgtId = httpContext.GetPar( "MaqOgtId") ;
               n11726MaqOgtId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
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
                        e111HG2 ();
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
            initAll1HG1640( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1641_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1641_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1HG1640( ) ;
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

   public void confirm_1HG0( )
   {
      beforeValidate1HG1640( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1HG1640( ) ;
         }
         else
         {
            checkExtendedTable1HG1640( ) ;
            if ( AnyError == 0 )
            {
               zm1HG1640( 2) ;
            }
            closeExtendedTableCursors1HG1640( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1640 = Gx_mode ;
         confirm_1HG1641( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1640 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1640 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1HG0( ) ;
      }
   }

   public void confirm_1HG1641( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1HG1641( ) ;
         if ( ( nRcdExists_1641 != 0 ) || ( nIsMod_1641 != 0 ) )
         {
            getKey1HG1641( ) ;
            if ( ( nRcdExists_1641 == 0 ) && ( nRcdDeleted_1641 == 0 ) )
            {
               if ( RcdFound1641 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1HG1641( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1HG1641( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1HG1641( 4) ;
                        zm1HG1641( 5) ;
                     }
                     closeExtendedTableCursors1HG1641( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PARMETID_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParMetId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1641 != 0 )
               {
                  if ( nRcdDeleted_1641 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1HG1641( ) ;
                     load1HG1641( ) ;
                     beforeValidate1HG1641( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1HG1641( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1641 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1HG1641( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1HG1641( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1HG1641( 4) ;
                              zm1HG1641( 5) ;
                           }
                           closeExtendedTableCursors1HG1641( ) ;
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
                  if ( nRcdDeleted_1641 == 0 )
                  {
                     GXCCtl = "PARMETID_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParMetId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1641_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMetId_Internalname, GXutil.ltrim( localUtil.ntoc( A11722ParMetId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMetDsc_Internalname, GXutil.rtrim( A11723ParMetDsc)) ;
         httpContext.changePostValue( edtParEnlId_Internalname, GXutil.ltrim( localUtil.ntoc( A11724ParEnlId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParEnlDsc_Internalname, GXutil.rtrim( A11725ParEnlDsc)) ;
         httpContext.changePostValue( edtMaqoOgtVal_Internalname, GXutil.ltrim( localUtil.ntoc( A11728MaqoOgtVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11722ParMetId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11722ParMetId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11728MaqoOgtVal_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11728MaqoOgtVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11724ParEnlId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11724ParEnlId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1641_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1641_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1641_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1641 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1641_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1641_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMETID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMETDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARENLID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARENLDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQOOGTVAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqoOgtVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1HG0( )
   {
   }

   public void e111HG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmaqogt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tmaqogt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmaqogt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqogt_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqogt_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmaqogt_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1HG1640( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11727MaqOgtDsc = T01HG7_A11727MaqOgtDsc[0] ;
         }
         else
         {
            Z11727MaqOgtDsc = A11727MaqOgtDsc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11726MaqOgtId = A11726MaqOgtId ;
         Z11727MaqOgtDsc = A11727MaqOgtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TMAQOGT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01HG8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01HG8_A407EmprNom[0] ;
      n407EmprNom = T01HG8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
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

   public void load1HG1640( )
   {
      /* Using cursor T01HG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1640 = (short)(1) ;
         A407EmprNom = T01HG9_A407EmprNom[0] ;
         n407EmprNom = T01HG9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11727MaqOgtDsc = T01HG9_A11727MaqOgtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", A11727MaqOgtDsc);
         zm1HG1640( -1) ;
      }
      pr_default.close(7);
      onLoadActions1HG1640( ) ;
   }

   public void onLoadActions1HG1640( )
   {
   }

   public void checkExtendedTable1HG1640( )
   {
      nIsDirty_1640 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1HG1640( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1HG1640( )
   {
      /* Using cursor T01HG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1640 = (short)(1) ;
      }
      else
      {
         RcdFound1640 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01HG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01HG7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1HG1640( 1) ;
         RcdFound1640 = (short)(1) ;
         A11726MaqOgtId = T01HG7_A11726MaqOgtId[0] ;
         n11726MaqOgtId = T01HG7_n11726MaqOgtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
         A11727MaqOgtDsc = T01HG7_A11727MaqOgtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", A11727MaqOgtDsc);
         Z396EmprCod = A396EmprCod ;
         Z11726MaqOgtId = A11726MaqOgtId ;
         sMode1640 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1HG1640( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1640 = (short)(0) ;
            initializeNonKey1HG1640( ) ;
         }
         Gx_mode = sMode1640 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1640 = (short)(0) ;
         initializeNonKey1HG1640( ) ;
         sMode1640 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1640 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1HG1640( ) ;
      if ( RcdFound1640 == 0 )
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
      RcdFound1640 = (short)(0) ;
      /* Using cursor T01HG11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HG11_A11726MaqOgtId[0], A11726MaqOgtId) < 0 ) ) && ( GXutil.strcmp(T01HG11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01HG11_A11726MaqOgtId[0], A11726MaqOgtId) > 0 ) ) && ( GXutil.strcmp(T01HG11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11726MaqOgtId = T01HG11_A11726MaqOgtId[0] ;
            n11726MaqOgtId = T01HG11_n11726MaqOgtId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
            RcdFound1640 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1640 = (short)(0) ;
      /* Using cursor T01HG12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01HG12_A11726MaqOgtId[0], A11726MaqOgtId) > 0 ) ) && ( GXutil.strcmp(T01HG12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01HG12_A11726MaqOgtId[0], A11726MaqOgtId) < 0 ) ) && ( GXutil.strcmp(T01HG12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11726MaqOgtId = T01HG12_A11726MaqOgtId[0] ;
            n11726MaqOgtId = T01HG12_n11726MaqOgtId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
            RcdFound1640 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1HG1640( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqOgtId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1HG1640( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1640 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11726MaqOgtId, Z11726MaqOgtId) != 0 ) )
            {
               A11726MaqOgtId = Z11726MaqOgtId ;
               n11726MaqOgtId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqOgtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1HG1640( ) ;
               GX_FocusControl = edtMaqOgtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11726MaqOgtId, Z11726MaqOgtId) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqOgtId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1HG1640( ) ;
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
                  GX_FocusControl = edtMaqOgtId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1HG1640( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11726MaqOgtId, Z11726MaqOgtId) != 0 ) )
      {
         A11726MaqOgtId = Z11726MaqOgtId ;
         n11726MaqOgtId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqOgtId_Internalname ;
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
      getKey1HG1640( ) ;
      if ( RcdFound1640 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11726MaqOgtId, Z11726MaqOgtId) != 0 ) )
         {
            A11726MaqOgtId = Z11726MaqOgtId ;
            n11726MaqOgtId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11726MaqOgtId, Z11726MaqOgtId) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqogt");
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1HG0( ) ;
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
      if ( RcdFound1640 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1HG1640( ) ;
      if ( RcdFound1640 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HG1640( ) ;
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
      if ( RcdFound1640 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
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
      if ( RcdFound1640 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
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
      scanStart1HG1640( ) ;
      if ( RcdFound1640 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1640 != 0 )
         {
            scanNext1HG1640( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1HG1640( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1HG1640( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HG6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQOGT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z11727MaqOgtDsc, T01HG6_A11727MaqOgtDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11727MaqOgtDsc, T01HG6_A11727MaqOgtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqogt:[seudo value changed for attri]"+"MaqOgtDsc");
               GXutil.writeLogRaw("Old: ",Z11727MaqOgtDsc);
               GXutil.writeLogRaw("Current: ",T01HG6_A11727MaqOgtDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQOGT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HG1640( )
   {
      beforeValidate1HG1640( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HG1640( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HG1640( 0) ;
         checkOptimisticConcurrency1HG1640( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HG1640( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HG1640( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HG13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, A11727MaqOgtDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQOGT");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1HG1640( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1HG0( ) ;
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
            load1HG1640( ) ;
         }
         endLevel1HG1640( ) ;
      }
      closeExtendedTableCursors1HG1640( ) ;
   }

   public void update1HG1640( )
   {
      beforeValidate1HG1640( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HG1640( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HG1640( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HG1640( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1HG1640( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HG14 */
                  pr_default.execute(12, new Object[] {A11727MaqOgtDsc, A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQOGT");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQOGT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1HG1640( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1HG1640( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1HG0( ) ;
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
         endLevel1HG1640( ) ;
      }
      closeExtendedTableCursors1HG1640( ) ;
   }

   public void deferredUpdate1HG1640( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HG1640( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HG1640( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HG1640( ) ;
         afterConfirm1HG1640( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HG1640( ) ;
            if ( AnyError == 0 )
            {
               scanStart1HG1641( ) ;
               while ( RcdFound1641 != 0 )
               {
                  getByPrimaryKey1HG1641( ) ;
                  delete1HG1641( ) ;
                  scanNext1HG1641( ) ;
               }
               scanEnd1HG1641( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HG15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQOGT");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1640 == 0 )
                        {
                           initAll1HG1640( ) ;
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
                        resetCaption1HG0( ) ;
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
      sMode1640 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HG1640( ) ;
      Gx_mode = sMode1640 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HG1640( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01HG16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQUIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel1HG1641( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1HG1641( ) ;
         if ( ( nRcdExists_1641 != 0 ) || ( nIsMod_1641 != 0 ) )
         {
            standaloneNotModal1HG1641( ) ;
            getKey1HG1641( ) ;
            if ( ( nRcdExists_1641 == 0 ) && ( nRcdDeleted_1641 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1HG1641( ) ;
            }
            else
            {
               if ( RcdFound1641 != 0 )
               {
                  if ( ( nRcdDeleted_1641 != 0 ) && ( nRcdExists_1641 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1HG1641( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1641 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1HG1641( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1641 == 0 )
                  {
                     GXCCtl = "PARMETID_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParMetId_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1641_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMetId_Internalname, GXutil.ltrim( localUtil.ntoc( A11722ParMetId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParMetDsc_Internalname, GXutil.rtrim( A11723ParMetDsc)) ;
         httpContext.changePostValue( edtParEnlId_Internalname, GXutil.ltrim( localUtil.ntoc( A11724ParEnlId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParEnlDsc_Internalname, GXutil.rtrim( A11725ParEnlDsc)) ;
         httpContext.changePostValue( edtMaqoOgtVal_Internalname, GXutil.ltrim( localUtil.ntoc( A11728MaqoOgtVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11722ParMetId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11722ParMetId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11728MaqoOgtVal_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11728MaqoOgtVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11724ParEnlId_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z11724ParEnlId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1641_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1641_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1641_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1641 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1641_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1641_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMETID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARMETDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARENLID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARENLDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQOOGTVAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqoOgtVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1HG1641( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1641 = (short)(0) ;
      nIsMod_1641 = (short)(0) ;
      nRcdDeleted_1641 = (short)(0) ;
   }

   public void processLevel1HG1640( )
   {
      /* Save parent mode. */
      sMode1640 = Gx_mode ;
      processNestedLevel1HG1641( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1640 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1HG1640( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1HG1640( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqogt");
         if ( AnyError == 0 )
         {
            confirmValues1HG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqogt");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1HG1640( )
   {
      /* Scan By routine */
      /* Using cursor T01HG17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound1640 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1640 = (short)(1) ;
         A11726MaqOgtId = T01HG17_A11726MaqOgtId[0] ;
         n11726MaqOgtId = T01HG17_n11726MaqOgtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HG1640( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1640 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1640 = (short)(1) ;
         A11726MaqOgtId = T01HG17_A11726MaqOgtId[0] ;
         n11726MaqOgtId = T01HG17_n11726MaqOgtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
      }
   }

   public void scanEnd1HG1640( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1HG1640( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HG1640( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HG1640( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HG1640( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HG1640( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HG1640( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HG1640( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqOgtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqOgtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqOgtId_Enabled), 5, 0), true);
      edtMaqOgtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqOgtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqOgtDsc_Enabled), 5, 0), true);
   }

   public void zm1HG1641( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11728MaqoOgtVal = T01HG3_A11728MaqoOgtVal[0] ;
            Z11724ParEnlId = T01HG3_A11724ParEnlId[0] ;
         }
         else
         {
            Z11728MaqoOgtVal = A11728MaqoOgtVal ;
            Z11724ParEnlId = A11724ParEnlId ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z11726MaqOgtId = A11726MaqOgtId ;
         Z11728MaqoOgtVal = A11728MaqoOgtVal ;
         Z396EmprCod = A396EmprCod ;
         Z11722ParMetId = A11722ParMetId ;
         Z11724ParEnlId = A11724ParEnlId ;
         Z11723ParMetDsc = A11723ParMetDsc ;
         Z11725ParEnlDsc = A11725ParEnlDsc ;
      }
   }

   public void standaloneNotModal1HG1641( )
   {
   }

   public void standaloneModal1HG1641( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParMetId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParMetId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtParMetId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParMetId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1HG1641( )
   {
      /* Using cursor T01HG18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Short.valueOf(A11722ParMetId)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1641 = (short)(1) ;
         A11723ParMetDsc = T01HG18_A11723ParMetDsc[0] ;
         n11723ParMetDsc = T01HG18_n11723ParMetDsc[0] ;
         A11725ParEnlDsc = T01HG18_A11725ParEnlDsc[0] ;
         n11725ParEnlDsc = T01HG18_n11725ParEnlDsc[0] ;
         A11728MaqoOgtVal = T01HG18_A11728MaqoOgtVal[0] ;
         n11728MaqoOgtVal = T01HG18_n11728MaqoOgtVal[0] ;
         A11724ParEnlId = T01HG18_A11724ParEnlId[0] ;
         zm1HG1641( -3) ;
      }
      pr_default.close(16);
      onLoadActions1HG1641( ) ;
   }

   public void onLoadActions1HG1641( )
   {
   }

   public void checkExtendedTable1HG1641( )
   {
      nIsDirty_1641 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1HG1641( ) ;
      /* Using cursor T01HG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A11724ParEnlId)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PARENLID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAMPO ENLACE ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParEnlId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11725ParEnlDsc = T01HG5_A11725ParEnlDsc[0] ;
      n11725ParEnlDsc = T01HG5_n11725ParEnlDsc[0] ;
      pr_default.close(3);
      /* Using cursor T01HG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A11722ParMetId)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARMETID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARAMETROS ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMetId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11723ParMetDsc = T01HG4_A11723ParMetDsc[0] ;
      n11723ParMetDsc = T01HG4_n11723ParMetDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1HG1641( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable1HG1641( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         short A11724ParEnlId )
   {
      /* Using cursor T01HG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A11724ParEnlId)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "PARENLID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAMPO ENLACE ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParEnlId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11725ParEnlDsc = T01HG19_A11725ParEnlDsc[0] ;
      n11725ParEnlDsc = T01HG19_n11725ParEnlDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11725ParEnlDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_4( String A396EmprCod ,
                         short A11722ParMetId )
   {
      /* Using cursor T01HG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A11722ParMetId)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PARMETID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARAMETROS ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMetId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11723ParMetDsc = T01HG20_A11723ParMetDsc[0] ;
      n11723ParMetDsc = T01HG20_n11723ParMetDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11723ParMetDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1HG1641( )
   {
      /* Using cursor T01HG21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Short.valueOf(A11722ParMetId)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1641 = (short)(1) ;
      }
      else
      {
         RcdFound1641 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1HG1641( )
   {
      /* Using cursor T01HG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Short.valueOf(A11722ParMetId)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01HG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1HG1641( 3) ;
         RcdFound1641 = (short)(1) ;
         initializeNonKey1HG1641( ) ;
         A11728MaqoOgtVal = T01HG3_A11728MaqoOgtVal[0] ;
         n11728MaqoOgtVal = T01HG3_n11728MaqoOgtVal[0] ;
         A11722ParMetId = T01HG3_A11722ParMetId[0] ;
         A11724ParEnlId = T01HG3_A11724ParEnlId[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11726MaqOgtId = A11726MaqOgtId ;
         Z11722ParMetId = A11722ParMetId ;
         sMode1641 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HG1641( ) ;
         load1HG1641( ) ;
         Gx_mode = sMode1641 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1641 = (short)(0) ;
         initializeNonKey1HG1641( ) ;
         sMode1641 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1HG1641( ) ;
         Gx_mode = sMode1641 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1HG1641( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1HG1641( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01HG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Short.valueOf(A11722ParMetId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQOG1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11728MaqoOgtVal, T01HG2_A11728MaqoOgtVal[0]) != 0 ) || ( Z11724ParEnlId != T01HG2_A11724ParEnlId[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11728MaqoOgtVal, T01HG2_A11728MaqoOgtVal[0]) != 0 )
            {
               GXutil.writeLogln("tmaqogt:[seudo value changed for attri]"+"MaqoOgtVal");
               GXutil.writeLogRaw("Old: ",Z11728MaqoOgtVal);
               GXutil.writeLogRaw("Current: ",T01HG2_A11728MaqoOgtVal[0]);
            }
            if ( Z11724ParEnlId != T01HG2_A11724ParEnlId[0] )
            {
               GXutil.writeLogln("tmaqogt:[seudo value changed for attri]"+"ParEnlId");
               GXutil.writeLogRaw("Old: ",Z11724ParEnlId);
               GXutil.writeLogRaw("Current: ",T01HG2_A11724ParEnlId[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQOG1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1HG1641( )
   {
      beforeValidate1HG1641( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HG1641( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1HG1641( 0) ;
         checkOptimisticConcurrency1HG1641( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1HG1641( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1HG1641( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01HG22 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Boolean.valueOf(n11728MaqoOgtVal), A11728MaqoOgtVal, A396EmprCod, Short.valueOf(A11722ParMetId), Short.valueOf(A11724ParEnlId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQOG1");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1HG1641( ) ;
         }
         endLevel1HG1641( ) ;
      }
      closeExtendedTableCursors1HG1641( ) ;
   }

   public void update1HG1641( )
   {
      beforeValidate1HG1641( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1HG1641( ) ;
      }
      if ( ( nIsMod_1641 != 0 ) || ( nIsDirty_1641 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1HG1641( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1HG1641( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1HG1641( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01HG23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n11728MaqoOgtVal), A11728MaqoOgtVal, Short.valueOf(A11724ParEnlId), A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Short.valueOf(A11722ParMetId)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQOG1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQOG1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1HG1641( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1HG1641( ) ;
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
            endLevel1HG1641( ) ;
         }
      }
      closeExtendedTableCursors1HG1641( ) ;
   }

   public void deferredUpdate1HG1641( )
   {
   }

   public void delete1HG1641( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1HG1641( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1HG1641( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1HG1641( ) ;
         afterConfirm1HG1641( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1HG1641( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01HG24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId, Short.valueOf(A11722ParMetId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQOG1");
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
      sMode1641 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1HG1641( ) ;
      Gx_mode = sMode1641 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1HG1641( )
   {
      standaloneModal1HG1641( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01HG25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A11722ParMetId)});
         A11723ParMetDsc = T01HG25_A11723ParMetDsc[0] ;
         n11723ParMetDsc = T01HG25_n11723ParMetDsc[0] ;
         pr_default.close(23);
         /* Using cursor T01HG26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A11724ParEnlId)});
         A11725ParEnlDsc = T01HG26_A11725ParEnlDsc[0] ;
         n11725ParEnlDsc = T01HG26_n11725ParEnlDsc[0] ;
         pr_default.close(24);
      }
   }

   public void endLevel1HG1641( )
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

   public void scanStart1HG1641( )
   {
      /* Scan By routine */
      /* Using cursor T01HG27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n11726MaqOgtId), A11726MaqOgtId});
      RcdFound1641 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1641 = (short)(1) ;
         A11722ParMetId = T01HG27_A11722ParMetId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1HG1641( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1641 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1641 = (short)(1) ;
         A11722ParMetId = T01HG27_A11722ParMetId[0] ;
      }
   }

   public void scanEnd1HG1641( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1HG1641( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1HG1641( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1HG1641( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1HG1641( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1HG1641( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1HG1641( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1HG1641( )
   {
      edtParMetId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParMetId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParMetDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParMetDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParEnlId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEnlId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEnlId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtParEnlDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEnlDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEnlDsc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMaqoOgtVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqoOgtVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqoOgtVal_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1HG1641( )
   {
   }

   public void send_integrity_lvl_hashes1HG1640( )
   {
   }

   public void subsflControlProps_401641( )
   {
      edtavnRcdDeleted_1641_Internalname = "vNRCDDELETED_1641_"+sGXsfl_40_idx ;
      edtParMetId_Internalname = "PARMETID_"+sGXsfl_40_idx ;
      edtParMetDsc_Internalname = "PARMETDSC_"+sGXsfl_40_idx ;
      edtParEnlId_Internalname = "PARENLID_"+sGXsfl_40_idx ;
      edtParEnlDsc_Internalname = "PARENLDSC_"+sGXsfl_40_idx ;
      edtMaqoOgtVal_Internalname = "MAQOOGTVAL_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401641( )
   {
      edtavnRcdDeleted_1641_Internalname = "vNRCDDELETED_1641_"+sGXsfl_40_fel_idx ;
      edtParMetId_Internalname = "PARMETID_"+sGXsfl_40_fel_idx ;
      edtParMetDsc_Internalname = "PARMETDSC_"+sGXsfl_40_fel_idx ;
      edtParEnlId_Internalname = "PARENLID_"+sGXsfl_40_fel_idx ;
      edtParEnlDsc_Internalname = "PARENLDSC_"+sGXsfl_40_fel_idx ;
      edtMaqoOgtVal_Internalname = "MAQOOGTVAL_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1HG1641( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401641( ) ;
      sendRow1HG1641( ) ;
   }

   public void sendRow1HG1641( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1641_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1641_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1641_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1641), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1641), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1641_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1641_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1641_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParMetId_Internalname,GXutil.ltrim( localUtil.ntoc( A11722ParMetId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11722ParMetId), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParMetId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParMetId_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParMetDsc_Internalname,GXutil.rtrim( A11723ParMetDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParMetDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParMetDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1641_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParEnlId_Internalname,GXutil.ltrim( localUtil.ntoc( A11724ParEnlId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParEnlId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11724ParEnlId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11724ParEnlId), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParEnlId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParEnlId_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParEnlDsc_Internalname,GXutil.rtrim( A11725ParEnlDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParEnlDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtParEnlDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1641_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqoOgtVal_Internalname,GXutil.ltrim( localUtil.ntoc( A11728MaqoOgtVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqoOgtVal_Enabled!=0) ? localUtil.format( A11728MaqoOgtVal, "ZZZZZ9.99") : localUtil.format( A11728MaqoOgtVal, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqoOgtVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqoOgtVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1HG1641( ) ;
      GXCCtl = "Z11722ParMetId_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11722ParMetId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11728MaqoOgtVal_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11728MaqoOgtVal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11724ParEnlId_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11724ParEnlId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1641_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1641_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1641_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1641, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1641_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1641_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARMETID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARMETDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARENLID_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARENLDSC_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQOOGTVAL_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqoOgtVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1HG1641( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401641( ) ;
      edtavnRcdDeleted_1641_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1641_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParMetId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMETID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParMetDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARMETDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParEnlId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARENLID_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParEnlDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARENLDSC_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqoOgtVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQOOGTVAL_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1641_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1641_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1641");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1641_Internalname ;
         wbErr = true ;
         nRcdDeleted_1641 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1641 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1641_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParMetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParMetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARMETID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMetId_Internalname ;
         wbErr = true ;
         A11722ParMetId = (short)(0) ;
      }
      else
      {
         A11722ParMetId = (short)(localUtil.ctol( httpContext.cgiGet( edtParMetId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11723ParMetDsc = httpContext.cgiGet( edtParMetDsc_Internalname) ;
      n11723ParMetDsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParEnlId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParEnlId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARENLID_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParEnlId_Internalname ;
         wbErr = true ;
         A11724ParEnlId = (short)(0) ;
      }
      else
      {
         A11724ParEnlId = (short)(localUtil.ctol( httpContext.cgiGet( edtParEnlId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11725ParEnlDsc = httpContext.cgiGet( edtParEnlDsc_Internalname) ;
      n11725ParEnlDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqoOgtVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqoOgtVal_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQOOGTVAL_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqoOgtVal_Internalname ;
         wbErr = true ;
         A11728MaqoOgtVal = DecimalUtil.ZERO ;
         n11728MaqoOgtVal = false ;
      }
      else
      {
         A11728MaqoOgtVal = localUtil.ctond( httpContext.cgiGet( edtMaqoOgtVal_Internalname)) ;
         n11728MaqoOgtVal = false ;
      }
      GXCCtl = "Z11722ParMetId_" + sGXsfl_40_idx ;
      Z11722ParMetId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11728MaqoOgtVal_" + sGXsfl_40_idx ;
      Z11728MaqoOgtVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11724ParEnlId_" + sGXsfl_40_idx ;
      Z11724ParEnlId = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1641_" + sGXsfl_40_idx ;
      nRcdDeleted_1641 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1641_" + sGXsfl_40_idx ;
      nRcdExists_1641 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1641_" + sGXsfl_40_idx ;
      nIsMod_1641 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtParMetId_Enabled = edtParMetId_Enabled ;
   }

   public void confirmValues1HG0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401641( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401641( ) ;
         httpContext.changePostValue( "Z11722ParMetId_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11722ParMetId_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11722ParMetId_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11728MaqoOgtVal_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11728MaqoOgtVal_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11728MaqoOgtVal_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z11724ParEnlId_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z11724ParEnlId_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11724ParEnlId_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmaqogt", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11726MaqOgtId", GXutil.rtrim( Z11726MaqOgtId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11727MaqOgtDsc", GXutil.rtrim( Z11727MaqOgtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmaqogt", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQOGT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAQUINAS ORGATEX", "") ;
   }

   public void initializeNonKey1HG1640( )
   {
      A11727MaqOgtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", A11727MaqOgtDsc);
      Z11727MaqOgtDsc = "" ;
   }

   public void initAll1HG1640( )
   {
      A11726MaqOgtId = "" ;
      n11726MaqOgtId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11726MaqOgtId", A11726MaqOgtId);
      initializeNonKey1HG1640( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1HG1641( )
   {
      A11723ParMetDsc = "" ;
      n11723ParMetDsc = false ;
      A11724ParEnlId = (short)(0) ;
      A11725ParEnlDsc = "" ;
      n11725ParEnlDsc = false ;
      A11728MaqoOgtVal = DecimalUtil.ZERO ;
      n11728MaqoOgtVal = false ;
      Z11728MaqoOgtVal = DecimalUtil.ZERO ;
      Z11724ParEnlId = (short)(0) ;
   }

   public void initAll1HG1641( )
   {
      A11722ParMetId = (short)(0) ;
      initializeNonKey1HG1641( ) ;
   }

   public void standaloneModalInsert1HG1641( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824158331", true, true);
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
      httpContext.AddJavascriptSource("tmaqogt.js", "?2026824158331", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1641( )
   {
      edtParMetId_Enabled = defedtParMetId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParMetId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParMetId_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1641, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1641_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11722ParMetId, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11723ParMetDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParMetDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11724ParEnlId, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11725ParEnlDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParEnlDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11728MaqoOgtVal, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqoOgtVal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqOgtId_Internalname = "MAQOGTID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqOgtDsc_Internalname = "MAQOGTDSC" ;
      edtavnRcdDeleted_1641_Internalname = "vNRCDDELETED_1641" ;
      edtParMetId_Internalname = "PARMETID" ;
      edtParMetDsc_Internalname = "PARMETDSC" ;
      edtParEnlId_Internalname = "PARENLID" ;
      edtParEnlDsc_Internalname = "PARENLDSC" ;
      edtMaqoOgtVal_Internalname = "MAQOOGTVAL" ;
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
      Form.setCaption( httpContext.getMessage( "MAQUINAS ORGATEX", "") );
      edtMaqoOgtVal_Jsonclick = "" ;
      edtParEnlDsc_Jsonclick = "" ;
      edtParEnlId_Jsonclick = "" ;
      edtParMetDsc_Jsonclick = "" ;
      edtParMetId_Jsonclick = "" ;
      edtavnRcdDeleted_1641_Jsonclick = "" ;
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
      edtMaqoOgtVal_Enabled = 1 ;
      edtParEnlDsc_Enabled = 0 ;
      edtParEnlId_Enabled = 1 ;
      edtParMetDsc_Enabled = 0 ;
      edtParMetId_Enabled = 1 ;
      edtavnRcdDeleted_1641_Enabled = 1 ;
      edtMaqOgtDsc_Jsonclick = "" ;
      edtMaqOgtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqOgtDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqOgtId_Jsonclick = "" ;
      edtMaqOgtId_Backcolor = (int)(0xFFFFFF) ;
      edtMaqOgtId_Enabled = 1 ;
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
      subsflControlProps_401641( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1HG1641( ) ;
         standaloneModal1HG1641( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1HG1641( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401641( ) ;
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
      /* Using cursor T01HG28 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01HG28_A407EmprNom[0] ;
      n407EmprNom = T01HG28_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      GX_FocusControl = edtMaqOgtDsc_Internalname ;
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

   public void valid_Maqogtid( )
   {
      n11726MaqOgtId = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11727MaqOgtDsc", GXutil.rtrim( A11727MaqOgtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11726MaqOgtId", GXutil.rtrim( Z11726MaqOgtId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11727MaqOgtDsc", GXutil.rtrim( Z11727MaqOgtDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Parmetid( )
   {
      n11723ParMetDsc = false ;
      /* Using cursor T01HG25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A11722ParMetId)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARAMETROS ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARMETID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParMetId_Internalname ;
      }
      A11723ParMetDsc = T01HG25_A11723ParMetDsc[0] ;
      n11723ParMetDsc = T01HG25_n11723ParMetDsc[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11723ParMetDsc", GXutil.rtrim( A11723ParMetDsc));
   }

   public void valid_Parenlid( )
   {
      n11725ParEnlDsc = false ;
      /* Using cursor T01HG26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A11724ParEnlId)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CAMPO ENLACE ORGATEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARENLID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParEnlId_Internalname ;
      }
      A11725ParEnlDsc = T01HG26_A11725ParEnlDsc[0] ;
      n11725ParEnlDsc = T01HG26_n11725ParEnlDsc[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11725ParEnlDsc", GXutil.rtrim( A11725ParEnlDsc));
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
      setEventMetadata("VALID_MAQOGTID","{handler:'valid_Maqogtid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11726MaqOgtId',fld:'MAQOGTID',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQOGTID",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A11727MaqOgtDsc',fld:'MAQOGTDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11726MaqOgtId'},{av:'Z407EmprNom'},{av:'Z11727MaqOgtDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PARMETID","{handler:'valid_Parmetid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11722ParMetId',fld:'PARMETID',pic:'ZZZ9'},{av:'A11723ParMetDsc',fld:'PARMETDSC',pic:''}]");
      setEventMetadata("VALID_PARMETID",",oparms:[{av:'A11723ParMetDsc',fld:'PARMETDSC',pic:''}]}");
      setEventMetadata("VALID_PARENLID","{handler:'valid_Parenlid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11724ParEnlId',fld:'PARENLID',pic:'ZZZ9'},{av:'A11725ParEnlDsc',fld:'PARENLDSC',pic:''}]");
      setEventMetadata("VALID_PARENLID",",oparms:[{av:'A11725ParEnlDsc',fld:'PARENLDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Maqoogtval',iparms:[]");
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
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11726MaqOgtId = "" ;
      Z11727MaqOgtDsc = "" ;
      Z11728MaqoOgtVal = DecimalUtil.ZERO ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A11726MaqOgtId = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A11727MaqOgtDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1641 = "" ;
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
      sMode1640 = "" ;
      GXCCtl = "" ;
      A11723ParMetDsc = "" ;
      A11725ParEnlDsc = "" ;
      A11728MaqoOgtVal = DecimalUtil.ZERO ;
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
      T01HG8_A407EmprNom = new String[] {""} ;
      T01HG8_n407EmprNom = new boolean[] {false} ;
      T01HG9_A11726MaqOgtId = new String[] {""} ;
      T01HG9_n11726MaqOgtId = new boolean[] {false} ;
      T01HG9_A407EmprNom = new String[] {""} ;
      T01HG9_n407EmprNom = new boolean[] {false} ;
      T01HG9_A11727MaqOgtDsc = new String[] {""} ;
      T01HG9_A396EmprCod = new String[] {""} ;
      T01HG10_A396EmprCod = new String[] {""} ;
      T01HG10_A11726MaqOgtId = new String[] {""} ;
      T01HG10_n11726MaqOgtId = new boolean[] {false} ;
      T01HG7_A11726MaqOgtId = new String[] {""} ;
      T01HG7_n11726MaqOgtId = new boolean[] {false} ;
      T01HG7_A11727MaqOgtDsc = new String[] {""} ;
      T01HG7_A396EmprCod = new String[] {""} ;
      T01HG11_A396EmprCod = new String[] {""} ;
      T01HG11_A11726MaqOgtId = new String[] {""} ;
      T01HG11_n11726MaqOgtId = new boolean[] {false} ;
      T01HG12_A396EmprCod = new String[] {""} ;
      T01HG12_A11726MaqOgtId = new String[] {""} ;
      T01HG12_n11726MaqOgtId = new boolean[] {false} ;
      T01HG6_A11726MaqOgtId = new String[] {""} ;
      T01HG6_n11726MaqOgtId = new boolean[] {false} ;
      T01HG6_A11727MaqOgtDsc = new String[] {""} ;
      T01HG6_A396EmprCod = new String[] {""} ;
      T01HG16_A396EmprCod = new String[] {""} ;
      T01HG16_A602MaqCod = new String[] {""} ;
      T01HG17_A396EmprCod = new String[] {""} ;
      T01HG17_A11726MaqOgtId = new String[] {""} ;
      T01HG17_n11726MaqOgtId = new boolean[] {false} ;
      Z11723ParMetDsc = "" ;
      Z11725ParEnlDsc = "" ;
      T01HG18_A11726MaqOgtId = new String[] {""} ;
      T01HG18_n11726MaqOgtId = new boolean[] {false} ;
      T01HG18_A11723ParMetDsc = new String[] {""} ;
      T01HG18_n11723ParMetDsc = new boolean[] {false} ;
      T01HG18_A11725ParEnlDsc = new String[] {""} ;
      T01HG18_n11725ParEnlDsc = new boolean[] {false} ;
      T01HG18_A11728MaqoOgtVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HG18_n11728MaqoOgtVal = new boolean[] {false} ;
      T01HG18_A396EmprCod = new String[] {""} ;
      T01HG18_A11722ParMetId = new short[1] ;
      T01HG18_A11724ParEnlId = new short[1] ;
      T01HG5_A11725ParEnlDsc = new String[] {""} ;
      T01HG5_n11725ParEnlDsc = new boolean[] {false} ;
      T01HG4_A11723ParMetDsc = new String[] {""} ;
      T01HG4_n11723ParMetDsc = new boolean[] {false} ;
      T01HG19_A11725ParEnlDsc = new String[] {""} ;
      T01HG19_n11725ParEnlDsc = new boolean[] {false} ;
      T01HG20_A11723ParMetDsc = new String[] {""} ;
      T01HG20_n11723ParMetDsc = new boolean[] {false} ;
      T01HG21_A396EmprCod = new String[] {""} ;
      T01HG21_A11726MaqOgtId = new String[] {""} ;
      T01HG21_n11726MaqOgtId = new boolean[] {false} ;
      T01HG21_A11722ParMetId = new short[1] ;
      T01HG3_A11726MaqOgtId = new String[] {""} ;
      T01HG3_n11726MaqOgtId = new boolean[] {false} ;
      T01HG3_A11728MaqoOgtVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HG3_n11728MaqoOgtVal = new boolean[] {false} ;
      T01HG3_A396EmprCod = new String[] {""} ;
      T01HG3_A11722ParMetId = new short[1] ;
      T01HG3_A11724ParEnlId = new short[1] ;
      T01HG2_A11726MaqOgtId = new String[] {""} ;
      T01HG2_n11726MaqOgtId = new boolean[] {false} ;
      T01HG2_A11728MaqoOgtVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01HG2_n11728MaqoOgtVal = new boolean[] {false} ;
      T01HG2_A396EmprCod = new String[] {""} ;
      T01HG2_A11722ParMetId = new short[1] ;
      T01HG2_A11724ParEnlId = new short[1] ;
      T01HG25_A11723ParMetDsc = new String[] {""} ;
      T01HG25_n11723ParMetDsc = new boolean[] {false} ;
      T01HG26_A11725ParEnlDsc = new String[] {""} ;
      T01HG26_n11725ParEnlDsc = new boolean[] {false} ;
      T01HG27_A396EmprCod = new String[] {""} ;
      T01HG27_A11726MaqOgtId = new String[] {""} ;
      T01HG27_n11726MaqOgtId = new boolean[] {false} ;
      T01HG27_A11722ParMetId = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01HG28_A407EmprNom = new String[] {""} ;
      T01HG28_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ11726MaqOgtId = "" ;
      ZZ407EmprNom = "" ;
      ZZ11727MaqOgtDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqogt__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqogt__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqogt__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqogt__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqogt__default(),
         new Object[] {
             new Object[] {
            T01HG2_A11726MaqOgtId, T01HG2_A11728MaqoOgtVal, T01HG2_n11728MaqoOgtVal, T01HG2_A396EmprCod, T01HG2_A11722ParMetId, T01HG2_A11724ParEnlId
            }
            , new Object[] {
            T01HG3_A11726MaqOgtId, T01HG3_A11728MaqoOgtVal, T01HG3_n11728MaqoOgtVal, T01HG3_A396EmprCod, T01HG3_A11722ParMetId, T01HG3_A11724ParEnlId
            }
            , new Object[] {
            T01HG4_A11723ParMetDsc, T01HG4_n11723ParMetDsc
            }
            , new Object[] {
            T01HG5_A11725ParEnlDsc, T01HG5_n11725ParEnlDsc
            }
            , new Object[] {
            T01HG6_A11726MaqOgtId, T01HG6_A11727MaqOgtDsc, T01HG6_A396EmprCod
            }
            , new Object[] {
            T01HG7_A11726MaqOgtId, T01HG7_A11727MaqOgtDsc, T01HG7_A396EmprCod
            }
            , new Object[] {
            T01HG8_A407EmprNom, T01HG8_n407EmprNom
            }
            , new Object[] {
            T01HG9_A11726MaqOgtId, T01HG9_A407EmprNom, T01HG9_n407EmprNom, T01HG9_A11727MaqOgtDsc, T01HG9_A396EmprCod
            }
            , new Object[] {
            T01HG10_A396EmprCod, T01HG10_A11726MaqOgtId
            }
            , new Object[] {
            T01HG11_A396EmprCod, T01HG11_A11726MaqOgtId
            }
            , new Object[] {
            T01HG12_A396EmprCod, T01HG12_A11726MaqOgtId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HG16_A396EmprCod, T01HG16_A602MaqCod
            }
            , new Object[] {
            T01HG17_A396EmprCod, T01HG17_A11726MaqOgtId
            }
            , new Object[] {
            T01HG18_A11726MaqOgtId, T01HG18_A11723ParMetDsc, T01HG18_n11723ParMetDsc, T01HG18_A11725ParEnlDsc, T01HG18_n11725ParEnlDsc, T01HG18_A11728MaqoOgtVal, T01HG18_n11728MaqoOgtVal, T01HG18_A396EmprCod, T01HG18_A11722ParMetId, T01HG18_A11724ParEnlId
            }
            , new Object[] {
            T01HG19_A11725ParEnlDsc, T01HG19_n11725ParEnlDsc
            }
            , new Object[] {
            T01HG20_A11723ParMetDsc, T01HG20_n11723ParMetDsc
            }
            , new Object[] {
            T01HG21_A396EmprCod, T01HG21_A11726MaqOgtId, T01HG21_A11722ParMetId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01HG25_A11723ParMetDsc, T01HG25_n11723ParMetDsc
            }
            , new Object[] {
            T01HG26_A11725ParEnlDsc, T01HG26_n11725ParEnlDsc
            }
            , new Object[] {
            T01HG27_A396EmprCod, T01HG27_A11726MaqOgtId, T01HG27_A11722ParMetId
            }
            , new Object[] {
            T01HG28_A407EmprNom, T01HG28_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TMAQOGT" ;
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
   private short Z11722ParMetId ;
   private short Z11724ParEnlId ;
   private short nRcdDeleted_1641 ;
   private short nRcdExists_1641 ;
   private short nIsMod_1641 ;
   private short A11724ParEnlId ;
   private short A11722ParMetId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1641 ;
   private short RcdFound1641 ;
   private short nBlankRcdUsr1641 ;
   private short RcdFound1640 ;
   private short nIsDirty_1640 ;
   private short nIsDirty_1641 ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMaqOgtId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqOgtDsc_Enabled ;
   private int edtavnRcdDeleted_1641_Enabled ;
   private int edtParMetId_Enabled ;
   private int edtParMetDsc_Enabled ;
   private int edtParEnlId_Enabled ;
   private int edtParEnlDsc_Enabled ;
   private int edtMaqoOgtVal_Enabled ;
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
   private int defedtParMetId_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqOgtDsc_Backcolor ;
   private int edtMaqOgtId_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11728MaqoOgtVal ;
   private java.math.BigDecimal A11728MaqoOgtVal ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11726MaqOgtId ;
   private String Z11727MaqOgtDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqOgtId_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A11726MaqOgtId ;
   private String edtMaqOgtId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqOgtDsc_Internalname ;
   private String A11727MaqOgtDsc ;
   private String edtMaqOgtDsc_Jsonclick ;
   private String sMode1641 ;
   private String edtavnRcdDeleted_1641_Internalname ;
   private String edtParMetId_Internalname ;
   private String edtParMetDsc_Internalname ;
   private String edtParEnlId_Internalname ;
   private String edtParEnlDsc_Internalname ;
   private String edtMaqoOgtVal_Internalname ;
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
   private String sMode1640 ;
   private String GXCCtl ;
   private String A11723ParMetDsc ;
   private String A11725ParEnlDsc ;
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
   private String Z11723ParMetDsc ;
   private String Z11725ParEnlDsc ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1641_Jsonclick ;
   private String edtParMetId_Jsonclick ;
   private String edtParMetDsc_Jsonclick ;
   private String edtParEnlId_Jsonclick ;
   private String edtParEnlDsc_Jsonclick ;
   private String edtMaqoOgtVal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ11726MaqOgtId ;
   private String ZZ407EmprNom ;
   private String ZZ11727MaqOgtDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n11726MaqOgtId ;
   private boolean returnInSub ;
   private boolean n11723ParMetDsc ;
   private boolean n11725ParEnlDsc ;
   private boolean n11728MaqoOgtVal ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01HG8_A407EmprNom ;
   private boolean[] T01HG8_n407EmprNom ;
   private String[] T01HG9_A11726MaqOgtId ;
   private boolean[] T01HG9_n11726MaqOgtId ;
   private String[] T01HG9_A407EmprNom ;
   private boolean[] T01HG9_n407EmprNom ;
   private String[] T01HG9_A11727MaqOgtDsc ;
   private String[] T01HG9_A396EmprCod ;
   private String[] T01HG10_A396EmprCod ;
   private String[] T01HG10_A11726MaqOgtId ;
   private boolean[] T01HG10_n11726MaqOgtId ;
   private String[] T01HG7_A11726MaqOgtId ;
   private boolean[] T01HG7_n11726MaqOgtId ;
   private String[] T01HG7_A11727MaqOgtDsc ;
   private String[] T01HG7_A396EmprCod ;
   private String[] T01HG11_A396EmprCod ;
   private String[] T01HG11_A11726MaqOgtId ;
   private boolean[] T01HG11_n11726MaqOgtId ;
   private String[] T01HG12_A396EmprCod ;
   private String[] T01HG12_A11726MaqOgtId ;
   private boolean[] T01HG12_n11726MaqOgtId ;
   private String[] T01HG6_A11726MaqOgtId ;
   private boolean[] T01HG6_n11726MaqOgtId ;
   private String[] T01HG6_A11727MaqOgtDsc ;
   private String[] T01HG6_A396EmprCod ;
   private String[] T01HG16_A396EmprCod ;
   private String[] T01HG16_A602MaqCod ;
   private String[] T01HG17_A396EmprCod ;
   private String[] T01HG17_A11726MaqOgtId ;
   private boolean[] T01HG17_n11726MaqOgtId ;
   private String[] T01HG18_A11726MaqOgtId ;
   private boolean[] T01HG18_n11726MaqOgtId ;
   private String[] T01HG18_A11723ParMetDsc ;
   private boolean[] T01HG18_n11723ParMetDsc ;
   private String[] T01HG18_A11725ParEnlDsc ;
   private boolean[] T01HG18_n11725ParEnlDsc ;
   private java.math.BigDecimal[] T01HG18_A11728MaqoOgtVal ;
   private boolean[] T01HG18_n11728MaqoOgtVal ;
   private String[] T01HG18_A396EmprCod ;
   private short[] T01HG18_A11722ParMetId ;
   private short[] T01HG18_A11724ParEnlId ;
   private String[] T01HG5_A11725ParEnlDsc ;
   private boolean[] T01HG5_n11725ParEnlDsc ;
   private String[] T01HG4_A11723ParMetDsc ;
   private boolean[] T01HG4_n11723ParMetDsc ;
   private String[] T01HG19_A11725ParEnlDsc ;
   private boolean[] T01HG19_n11725ParEnlDsc ;
   private String[] T01HG20_A11723ParMetDsc ;
   private boolean[] T01HG20_n11723ParMetDsc ;
   private String[] T01HG21_A396EmprCod ;
   private String[] T01HG21_A11726MaqOgtId ;
   private boolean[] T01HG21_n11726MaqOgtId ;
   private short[] T01HG21_A11722ParMetId ;
   private String[] T01HG3_A11726MaqOgtId ;
   private boolean[] T01HG3_n11726MaqOgtId ;
   private java.math.BigDecimal[] T01HG3_A11728MaqoOgtVal ;
   private boolean[] T01HG3_n11728MaqoOgtVal ;
   private String[] T01HG3_A396EmprCod ;
   private short[] T01HG3_A11722ParMetId ;
   private short[] T01HG3_A11724ParEnlId ;
   private String[] T01HG2_A11726MaqOgtId ;
   private boolean[] T01HG2_n11726MaqOgtId ;
   private java.math.BigDecimal[] T01HG2_A11728MaqoOgtVal ;
   private boolean[] T01HG2_n11728MaqoOgtVal ;
   private String[] T01HG2_A396EmprCod ;
   private short[] T01HG2_A11722ParMetId ;
   private short[] T01HG2_A11724ParEnlId ;
   private String[] T01HG25_A11723ParMetDsc ;
   private boolean[] T01HG25_n11723ParMetDsc ;
   private String[] T01HG26_A11725ParEnlDsc ;
   private boolean[] T01HG26_n11725ParEnlDsc ;
   private String[] T01HG27_A396EmprCod ;
   private String[] T01HG27_A11726MaqOgtId ;
   private boolean[] T01HG27_n11726MaqOgtId ;
   private short[] T01HG27_A11722ParMetId ;
   private String[] T01HG28_A407EmprNom ;
   private boolean[] T01HG28_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqogt__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqogt__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqogt__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqogt__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqogt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01HG2", "SELECT MaqOgtId, MaqoOgtVal, EmprCod, ParMetId, ParEnlId FROM TXPMAQOG1 WHERE EmprCod = ? AND MaqOgtId = ? AND ParMetId = ?  FOR UPDATE OF MaqoOgtVal, ParEnlId NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG3", "SELECT MaqOgtId, MaqoOgtVal, EmprCod, ParMetId, ParEnlId FROM TXPMAQOG1 WHERE EmprCod = ? AND MaqOgtId = ? AND ParMetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG4", "SELECT ParMetDsc FROM TXPPARMET WHERE EmprCod = ? AND ParMetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG5", "SELECT ParEnlDsc FROM TXPPARENL WHERE EmprCod = ? AND ParEnlId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG6", "SELECT MaqOgtId, MaqOgtDsc, EmprCod FROM TXPMAQOGT WHERE EmprCod = ? AND MaqOgtId = ?  FOR UPDATE OF MaqOgtDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG7", "SELECT MaqOgtId, MaqOgtDsc, EmprCod FROM TXPMAQOGT WHERE EmprCod = ? AND MaqOgtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG9", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqOgtId, T2.EmprNom, TM1.MaqOgtDsc, TM1.EmprCod FROM (TXPMAQOGT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqOgtId = ? ORDER BY TM1.EmprCod, TM1.MaqOgtId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqOgtId FROM TXPMAQOGT WHERE EmprCod = ? AND MaqOgtId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqOgtId FROM TXPMAQOGT WHERE ( MaqOgtId > ?) and EmprCod = ? ORDER BY EmprCod, MaqOgtId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HG12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqOgtId FROM TXPMAQOGT WHERE ( MaqOgtId < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqOgtId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01HG13", "INSERT INTO TXPMAQOGT(MaqOgtId, MaqOgtDsc, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMAQOGT")
         ,new UpdateCursor("T01HG14", "UPDATE TXPMAQOGT SET MaqOgtDsc=?  WHERE EmprCod = ? AND MaqOgtId = ?", GX_NOMASK, "TXPMAQOGT")
         ,new UpdateCursor("T01HG15", "DELETE FROM TXPMAQOGT  WHERE EmprCod = ? AND MaqOgtId = ?", GX_NOMASK, "TXPMAQOGT")
         ,new ForEachCursor("T01HG16", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqOgtId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01HG17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqOgtId FROM TXPMAQOGT WHERE EmprCod = ? ORDER BY EmprCod, MaqOgtId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG18", "SELECT T1.MaqOgtId, T2.ParMetDsc, T3.ParEnlDsc, T1.MaqoOgtVal, T1.EmprCod, T1.ParMetId, T1.ParEnlId FROM ((TXPMAQOG1 T1 INNER JOIN TXPPARMET T2 ON T2.EmprCod = T1.EmprCod AND T2.ParMetId = T1.ParMetId) INNER JOIN TXPPARENL T3 ON T3.EmprCod = T1.EmprCod AND T3.ParEnlId = T1.ParEnlId) WHERE T1.EmprCod = ? and T1.MaqOgtId = ? and T1.ParMetId = ? ORDER BY T1.EmprCod, T1.MaqOgtId, T1.ParMetId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG19", "SELECT ParEnlDsc FROM TXPPARENL WHERE EmprCod = ? AND ParEnlId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG20", "SELECT ParMetDsc FROM TXPPARMET WHERE EmprCod = ? AND ParMetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG21", "SELECT EmprCod, MaqOgtId, ParMetId FROM TXPMAQOG1 WHERE EmprCod = ? AND MaqOgtId = ? AND ParMetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01HG22", "INSERT INTO TXPMAQOG1(MaqOgtId, MaqoOgtVal, EmprCod, ParMetId, ParEnlId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPMAQOG1")
         ,new UpdateCursor("T01HG23", "UPDATE TXPMAQOG1 SET MaqoOgtVal=?, ParEnlId=?  WHERE EmprCod = ? AND MaqOgtId = ? AND ParMetId = ?", GX_NOMASK, "TXPMAQOG1")
         ,new UpdateCursor("T01HG24", "DELETE FROM TXPMAQOG1  WHERE EmprCod = ? AND MaqOgtId = ? AND ParMetId = ?", GX_NOMASK, "TXPMAQOG1")
         ,new ForEachCursor("T01HG25", "SELECT ParMetDsc FROM TXPPARMET WHERE EmprCod = ? AND ParMetId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG26", "SELECT ParEnlDsc FROM TXPPARENL WHERE EmprCod = ? AND ParEnlId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG27", "SELECT EmprCod, MaqOgtId, ParMetId FROM TXPMAQOG1 WHERE EmprCod = ? and MaqOgtId = ? ORDER BY EmprCod, MaqOgtId, ParMetId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01HG28", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
               stmt.setString(2, (String)parms[2], 3);
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
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 60);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 60);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 20 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               stmt.setShort(5, ((Number) parms[6]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
      }
   }

}

