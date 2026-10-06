package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tptoscast_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Puntos Castigo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprNom_Internalname ;
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
      A12933PtosUltID = (short)(GXutil.lval( httpContext.GetPar( "PtosUltID"))) ;
      n12933PtosUltID = false ;
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

   public tptoscast_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tptoscast_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tptoscast_impl.class ));
   }

   public tptoscast_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPTOSCAST.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPTOSCAST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPTOSCAST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPTOSCAST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPTOSCAST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPtosUltID_Internalname, GXutil.ltrim( localUtil.ntoc( A12933PtosUltID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPtosUltID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12933PtosUltID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12933PtosUltID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPtosUltID_Jsonclick, 0, "", "", "", "", "", 1, edtPtosUltID_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPTOSCAST.htm");
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
         nBlankRcdCount1773 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1773 = (short)(1) ;
            scanStart1M01773( ) ;
            while ( RcdFound1773 != 0 )
            {
               init_level_properties1773( ) ;
               getByPrimaryKey1M01773( ) ;
               addRow1M01773( ) ;
               scanNext1M01773( ) ;
            }
            scanEnd1M01773( ) ;
            nBlankRcdCount1773 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12933PtosUltID = A12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         standaloneNotModal1M01773( ) ;
         standaloneModal1M01773( ) ;
         sMode1773 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1M01773( ) ;
            edtavnRcdDeleted_1773_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1773_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1773_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1773_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPtosID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSID_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPtosID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosID_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPtosVIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSVINI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPtosVIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosVIni_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPtosVFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSVFIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPtosVFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosVFin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPtosValor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSVALOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPtosValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosValor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1773 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1M01773( ) ;
            }
            sendRow1M01773( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1773 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12933PtosUltID = B12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1773 = (short)(5) ;
         nRcdExists_1773 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1M01773( ) ;
            while ( RcdFound1773 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351773( ) ;
               init_level_properties1773( ) ;
               standaloneNotModal1M01773( ) ;
               getByPrimaryKey1M01773( ) ;
               standaloneModal1M01773( ) ;
               addRow1M01773( ) ;
               scanNext1M01773( ) ;
            }
            scanEnd1M01773( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1773 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351773( ) ;
      initAll1M01773( ) ;
      init_level_properties1773( ) ;
      B12933PtosUltID = A12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      nRcdExists_1773 = (short)(0) ;
      nIsMod_1773 = (short)(0) ;
      nRcdDeleted_1773 = (short)(0) ;
      nBlankRcdCount1773 = (short)(nBlankRcdUsr1773+nBlankRcdCount1773) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1773 > 0 )
      {
         standaloneNotModal1M01773( ) ;
         standaloneModal1M01773( ) ;
         addRow1M01773( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPtosID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1773 = (short)(nBlankRcdCount1773-1) ;
      }
      Gx_mode = sMode1773 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12933PtosUltID = B12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPTOSCAST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPTOSCAST.htm");
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
      e111M02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            Z12933PtosUltID = (short)(localUtil.ctol( httpContext.cgiGet( "Z12933PtosUltID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O12933PtosUltID = (short)(localUtil.ctol( httpContext.cgiGet( "O12933PtosUltID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A12933PtosUltID = (short)(localUtil.ctol( httpContext.cgiGet( edtPtosUltID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12933PtosUltID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
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
                        e111M02 ();
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
            initAll1M027( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1773_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1773_Enabled), 5, 0), !bGXsfl_35_Refreshing);
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
      disableAttributes1M027( ) ;
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

   public void confirm_1M00( )
   {
      beforeValidate1M027( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1M027( ) ;
         }
         else
         {
            checkExtendedTable1M027( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1M027( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode27 = Gx_mode ;
         confirm_1M01773( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode27 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1M00( ) ;
      }
   }

   public void confirm_1M01773( )
   {
      s12933PtosUltID = O12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1M01773( ) ;
         if ( ( nRcdExists_1773 != 0 ) || ( nIsMod_1773 != 0 ) )
         {
            getKey1M01773( ) ;
            if ( ( nRcdExists_1773 == 0 ) && ( nRcdDeleted_1773 == 0 ) )
            {
               if ( RcdFound1773 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1M01773( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1M01773( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1M01773( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12933PtosUltID = A12933PtosUltID ;
                     n12933PtosUltID = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "PTOSID_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPtosID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1773 != 0 )
               {
                  if ( nRcdDeleted_1773 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1M01773( ) ;
                     load1M01773( ) ;
                     beforeValidate1M01773( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1M01773( ) ;
                        O12933PtosUltID = A12933PtosUltID ;
                        n12933PtosUltID = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1773 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1M01773( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1M01773( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1M01773( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12933PtosUltID = A12933PtosUltID ;
                           n12933PtosUltID = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1773 == 0 )
                  {
                     GXCCtl = "PTOSID_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPtosID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1773_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosID_Internalname, GXutil.ltrim( localUtil.ntoc( A12929PtosID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosVIni_Internalname, GXutil.ltrim( localUtil.ntoc( A12930PtosVIni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosVFin_Internalname, GXutil.ltrim( localUtil.ntoc( A12931PtosVFin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosValor_Internalname, GXutil.ltrim( localUtil.ntoc( A12932PtosValor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12929PtosID_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12929PtosID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12930PtosVIni_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12930PtosVIni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12931PtosVFin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12931PtosVFin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12932PtosValor_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12932PtosValor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1773_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1773_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1773_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1773 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1773_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1773_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSID_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSVINI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSVFIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSVALOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosValor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12933PtosUltID = s12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1M00( )
   {
   }

   public void e111M02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tptoscast_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tptoscast_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tptoscast_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tptoscast_impl.this.A396EmprCod = GXv_char2[0] ;
      tptoscast_impl.this.AV11EmprNom = GXv_char3[0] ;
      tptoscast_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1M027( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T01M05_A407EmprNom[0] ;
            Z12933PtosUltID = T01M05_A12933PtosUltID[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z12933PtosUltID = A12933PtosUltID ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z12933PtosUltID = A12933PtosUltID ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPtosUltID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosUltID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosUltID_Enabled), 5, 0), true);
      AV34Pgmname = "TPTOSCAST" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPtosUltID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosUltID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosUltID_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( ( isDlt( )  || isIns( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load1M027( )
   {
      /* Using cursor T01M06 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T01M06_A407EmprNom[0] ;
         n407EmprNom = T01M06_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12933PtosUltID = T01M06_A12933PtosUltID[0] ;
         n12933PtosUltID = T01M06_n12933PtosUltID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         zm1M027( -6) ;
      }
      pr_default.close(4);
      onLoadActions1M027( ) ;
   }

   public void onLoadActions1M027( )
   {
   }

   public void checkExtendedTable1M027( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1M027( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1M027( )
   {
      /* Using cursor T01M07 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01M05 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01M05_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1M027( 6) ;
         RcdFound27 = (short)(1) ;
         A407EmprNom = T01M05_A407EmprNom[0] ;
         n407EmprNom = T01M05_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12933PtosUltID = T01M05_A12933PtosUltID[0] ;
         n12933PtosUltID = T01M05_n12933PtosUltID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         O12933PtosUltID = A12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M027( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey1M027( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey1M027( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1M027( ) ;
      if ( RcdFound27 == 0 )
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
      RcdFound27 = (short)(0) ;
      /* Using cursor T01M08 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01M08_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01M08_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T01M09 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01M09_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01M09_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M027( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12933PtosUltID = O12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         GX_FocusControl = edtEmprNom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M027( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12933PtosUltID = O12933PtosUltID ;
               n12933PtosUltID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A12933PtosUltID = O12933PtosUltID ;
               n12933PtosUltID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
               update1M027( ) ;
               GX_FocusControl = edtEmprNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12933PtosUltID = O12933PtosUltID ;
               n12933PtosUltID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
               GX_FocusControl = edtEmprNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M027( ) ;
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
                  A12933PtosUltID = O12933PtosUltID ;
                  n12933PtosUltID = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
                  GX_FocusControl = edtEmprNom_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1M027( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12933PtosUltID = O12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprNom_Internalname ;
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
      getKey1M027( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
         if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tptoscast");
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1M00( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1M027( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M027( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
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
      scanStart1M027( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound27 != 0 )
         {
            scanNext1M027( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtEmprNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M027( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M027( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M04 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z407EmprNom, T01M04_A407EmprNom[0]) != 0 ) || ( Z12933PtosUltID != T01M04_A12933PtosUltID[0] ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T01M04_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("tptoscast:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T01M04_A407EmprNom[0]);
            }
            if ( Z12933PtosUltID != T01M04_A12933PtosUltID[0] )
            {
               GXutil.writeLogln("tptoscast:[seudo value changed for attri]"+"PtosUltID");
               GXutil.writeLogRaw("Old: ",Z12933PtosUltID);
               GXutil.writeLogRaw("Current: ",T01M04_A12933PtosUltID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M027( )
   {
      beforeValidate1M027( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M027( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M027( 0) ;
         checkOptimisticConcurrency1M027( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M027( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M027( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M010 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n12933PtosUltID), Short.valueOf(A12933PtosUltID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
                        processLevel1M027( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1M00( ) ;
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
            load1M027( ) ;
         }
         endLevel1M027( ) ;
      }
      closeExtendedTableCursors1M027( ) ;
   }

   public void update1M027( )
   {
      beforeValidate1M027( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M027( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M027( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M027( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M027( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M011 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n12933PtosUltID), Short.valueOf(A12933PtosUltID), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M027( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1M027( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1M00( ) ;
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
         endLevel1M027( ) ;
      }
      closeExtendedTableCursors1M027( ) ;
   }

   public void deferredUpdate1M027( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M027( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M027( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M027( ) ;
         afterConfirm1M027( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M027( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M012 */
               pr_default.execute(10, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound27 == 0 )
                     {
                        initAll1M027( ) ;
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
                     resetCaption1M00( ) ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M027( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M027( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01M013 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01M014 */
         pr_default.execute(12, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01M015 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01M016 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "SOLIDEZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01M017 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01M018 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01M019 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01M020 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01M021 */
         pr_default.execute(19, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01M022 */
         pr_default.execute(20, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01M023 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01M024 */
         pr_default.execute(22, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPRESENTANTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01M025 */
         pr_default.execute(23, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01M026 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maestro de Parametros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01M027 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Código de calidad", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01M028 */
         pr_default.execute(26, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01M029 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGKSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01M030 */
         pr_default.execute(28, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DKGSLA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01M031 */
         pr_default.execute(29, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01M032 */
         pr_default.execute(30, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01M033 */
         pr_default.execute(31, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01M034 */
         pr_default.execute(32, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01M035 */
         pr_default.execute(33, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01M036 */
         pr_default.execute(34, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01M037 */
         pr_default.execute(35, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISANY", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01M038 */
         pr_default.execute(36, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LBOTAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01M039 */
         pr_default.execute(37, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPBOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01M040 */
         pr_default.execute(38, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLAPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01M041 */
         pr_default.execute(39, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMETPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01M042 */
         pr_default.execute(40, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01M043 */
         pr_default.execute(41, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01M044 */
         pr_default.execute(42, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01M045 */
         pr_default.execute(43, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01M046 */
         pr_default.execute(44, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01M047 */
         pr_default.execute(45, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01M048 */
         pr_default.execute(46, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NUMTEX", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01M049 */
         pr_default.execute(47, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01M050 */
         pr_default.execute(48, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01M051 */
         pr_default.execute(49, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01M052 */
         pr_default.execute(50, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BAROBE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01M053 */
         pr_default.execute(51, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENVTER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01M054 */
         pr_default.execute(52, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01M055 */
         pr_default.execute(53, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01M056 */
         pr_default.execute(54, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01M057 */
         pr_default.execute(55, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01M058 */
         pr_default.execute(56, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01M059 */
         pr_default.execute(57, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01M060 */
         pr_default.execute(58, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01M061 */
         pr_default.execute(59, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01M062 */
         pr_default.execute(60, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MANUFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01M063 */
         pr_default.execute(61, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01M064 */
         pr_default.execute(62, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01M065 */
         pr_default.execute(63, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULEC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01M066 */
         pr_default.execute(64, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01M067 */
         pr_default.execute(65, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01M068 */
         pr_default.execute(66, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01M069 */
         pr_default.execute(67, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARLAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01M070 */
         pr_default.execute(68, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01M071 */
         pr_default.execute(69, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01M072 */
         pr_default.execute(70, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZONGEO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01M073 */
         pr_default.execute(71, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01M074 */
         pr_default.execute(72, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01M075 */
         pr_default.execute(73, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01M076 */
         pr_default.execute(74, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTMAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01M077 */
         pr_default.execute(75, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TUBOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01M078 */
         pr_default.execute(76, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01M079 */
         pr_default.execute(77, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMACRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01M080 */
         pr_default.execute(78, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DESTIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01M081 */
         pr_default.execute(79, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTRAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01M082 */
         pr_default.execute(80, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01M083 */
         pr_default.execute(81, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LECTOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01M084 */
         pr_default.execute(82, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TURNOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01M085 */
         pr_default.execute(83, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01M086 */
         pr_default.execute(84, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T01M087 */
         pr_default.execute(85, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T01M088 */
         pr_default.execute(86, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T01M089 */
         pr_default.execute(87, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T01M090 */
         pr_default.execute(88, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T01M091 */
         pr_default.execute(89, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T01M092 */
         pr_default.execute(90, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T01M093 */
         pr_default.execute(91, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UNMEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T01M094 */
         pr_default.execute(92, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TRANSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T01M095 */
         pr_default.execute(93, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPVAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T01M096 */
         pr_default.execute(94, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPUNI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T01M097 */
         pr_default.execute(95, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T01M098 */
         pr_default.execute(96, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T01M099 */
         pr_default.execute(97, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T01M0100 */
         pr_default.execute(98, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T01M0101 */
         pr_default.execute(99, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T01M0102 */
         pr_default.execute(100, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T01M0103 */
         pr_default.execute(101, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T01M0104 */
         pr_default.execute(102, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T01M0105 */
         pr_default.execute(103, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROCES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T01M0106 */
         pr_default.execute(104, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T01M0107 */
         pr_default.execute(105, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T01M0108 */
         pr_default.execute(106, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T01M0109 */
         pr_default.execute(107, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T01M0110 */
         pr_default.execute(108, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPERAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T01M0111 */
         pr_default.execute(109, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor T01M0112 */
         pr_default.execute(110, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATICE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor T01M0113 */
         pr_default.execute(111, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQUIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor T01M0114 */
         pr_default.execute(112, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INTENS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor T01M0115 */
         pr_default.execute(113, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor T01M0116 */
         pr_default.execute(114, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRUOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor T01M0117 */
         pr_default.execute(115, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor T01M0118 */
         pr_default.execute(116, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRUFAM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor T01M0119 */
         pr_default.execute(117, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor T01M0120 */
         pr_default.execute(118, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor T01M0121 */
         pr_default.execute(119, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
         /* Using cursor T01M0122 */
         pr_default.execute(120, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(120) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EMPLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(120);
         /* Using cursor T01M0123 */
         pr_default.execute(121, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(121) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(121);
         /* Using cursor T01M0124 */
         pr_default.execute(122, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(122) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(122);
         /* Using cursor T01M0125 */
         pr_default.execute(123, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(123) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(123);
         /* Using cursor T01M0126 */
         pr_default.execute(124, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(124) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(124);
         /* Using cursor T01M0127 */
         pr_default.execute(125, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(125) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(125);
         /* Using cursor T01M0128 */
         pr_default.execute(126, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(126) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(126);
         /* Using cursor T01M0129 */
         pr_default.execute(127, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(127) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(127);
         /* Using cursor T01M0130 */
         pr_default.execute(128, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(128) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CIETIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(128);
         /* Using cursor T01M0131 */
         pr_default.execute(129, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(129) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(129);
         /* Using cursor T01M0132 */
         pr_default.execute(130, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(130) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(130);
         /* Using cursor T01M0133 */
         pr_default.execute(131, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(131) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARAGR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(131);
         /* Using cursor T01M0134 */
         pr_default.execute(132, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(132) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(132);
         /* Using cursor T01M0135 */
         pr_default.execute(133, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(133) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(133);
      }
   }

   public void processNestedLevel1M01773( )
   {
      s12933PtosUltID = O12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1M01773( ) ;
         if ( ( nRcdExists_1773 != 0 ) || ( nIsMod_1773 != 0 ) )
         {
            standaloneNotModal1M01773( ) ;
            getKey1M01773( ) ;
            if ( ( nRcdExists_1773 == 0 ) && ( nRcdDeleted_1773 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1M01773( ) ;
            }
            else
            {
               if ( RcdFound1773 != 0 )
               {
                  if ( ( nRcdDeleted_1773 != 0 ) && ( nRcdExists_1773 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1M01773( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1773 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1M01773( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1773 == 0 )
                  {
                     GXCCtl = "PTOSID_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPtosID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12933PtosUltID = A12933PtosUltID ;
            n12933PtosUltID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1773_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosID_Internalname, GXutil.ltrim( localUtil.ntoc( A12929PtosID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosVIni_Internalname, GXutil.ltrim( localUtil.ntoc( A12930PtosVIni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosVFin_Internalname, GXutil.ltrim( localUtil.ntoc( A12931PtosVFin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPtosValor_Internalname, GXutil.ltrim( localUtil.ntoc( A12932PtosValor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12929PtosID_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12929PtosID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12930PtosVIni_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12930PtosVIni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12931PtosVFin_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12931PtosVFin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12932PtosValor_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z12932PtosValor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1773_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1773_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1773_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1773 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1773_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1773_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSID_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSVINI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSVFIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PTOSVALOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosValor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1M01773( ) ;
      if ( AnyError != 0 )
      {
         O12933PtosUltID = s12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      }
      nRcdExists_1773 = (short)(0) ;
      nIsMod_1773 = (short)(0) ;
      nRcdDeleted_1773 = (short)(0) ;
   }

   public void processLevel1M027( )
   {
      /* Save parent mode. */
      sMode27 = Gx_mode ;
      processNestedLevel1M01773( ) ;
      if ( AnyError != 0 )
      {
         O12933PtosUltID = s12933PtosUltID ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01M0136 */
      pr_default.execute(134, new Object[] {Boolean.valueOf(n12933PtosUltID), Short.valueOf(A12933PtosUltID), A396EmprCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
   }

   public void endLevel1M027( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1M027( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tptoscast");
         if ( AnyError == 0 )
         {
            confirmValues1M00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tptoscast");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M027( )
   {
      /* Scan By routine */
      /* Using cursor T01M0137 */
      pr_default.execute(135, new Object[] {A396EmprCod});
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(135) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M027( )
   {
      /* Scan next routine */
      pr_default.readNext(135);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(135) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
   }

   public void scanEnd1M027( )
   {
      pr_default.close(135);
   }

   public void afterConfirm1M027( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M027( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M027( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M027( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M027( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M027( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M027( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPtosUltID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosUltID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosUltID_Enabled), 5, 0), true);
   }

   public void zm1M01773( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12930PtosVIni = T01M03_A12930PtosVIni[0] ;
            Z12931PtosVFin = T01M03_A12931PtosVFin[0] ;
            Z12932PtosValor = T01M03_A12932PtosValor[0] ;
         }
         else
         {
            Z12930PtosVIni = A12930PtosVIni ;
            Z12931PtosVFin = A12931PtosVFin ;
            Z12932PtosValor = A12932PtosValor ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z396EmprCod = A396EmprCod ;
         Z12929PtosID = A12929PtosID ;
         Z12930PtosVIni = A12930PtosVIni ;
         Z12931PtosVFin = A12931PtosVFin ;
         Z12932PtosValor = A12932PtosValor ;
      }
   }

   public void standaloneNotModal1M01773( )
   {
      edtPtosUltID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosUltID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosUltID_Enabled), 5, 0), true);
      edtPtosUltID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosUltID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosUltID_Enabled), 5, 0), true);
   }

   public void standaloneModal1M01773( )
   {
      if ( isIns( )  )
      {
         A12933PtosUltID = (short)(O12933PtosUltID+1) ;
         n12933PtosUltID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A12929PtosID = A12933PtosUltID ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPtosID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPtosID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosID_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtPtosID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPtosID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosID_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1M01773( )
   {
      /* Using cursor T01M0138 */
      pr_default.execute(136, new Object[] {A396EmprCod, Short.valueOf(A12929PtosID)});
      if ( (pr_default.getStatus(136) != 101) )
      {
         RcdFound1773 = (short)(1) ;
         A12930PtosVIni = T01M0138_A12930PtosVIni[0] ;
         n12930PtosVIni = T01M0138_n12930PtosVIni[0] ;
         A12931PtosVFin = T01M0138_A12931PtosVFin[0] ;
         n12931PtosVFin = T01M0138_n12931PtosVFin[0] ;
         A12932PtosValor = T01M0138_A12932PtosValor[0] ;
         n12932PtosValor = T01M0138_n12932PtosValor[0] ;
         zm1M01773( -7) ;
      }
      pr_default.close(136);
      onLoadActions1M01773( ) ;
   }

   public void onLoadActions1M01773( )
   {
   }

   public void checkExtendedTable1M01773( )
   {
      nIsDirty_1773 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1M01773( ) ;
   }

   public void closeExtendedTableCursors1M01773( )
   {
   }

   public void enableDisable1M01773( )
   {
   }

   public void getKey1M01773( )
   {
      /* Using cursor T01M0139 */
      pr_default.execute(137, new Object[] {A396EmprCod, Short.valueOf(A12929PtosID)});
      if ( (pr_default.getStatus(137) != 101) )
      {
         RcdFound1773 = (short)(1) ;
      }
      else
      {
         RcdFound1773 = (short)(0) ;
      }
      pr_default.close(137);
   }

   public void getByPrimaryKey1M01773( )
   {
      /* Using cursor T01M03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A12929PtosID)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01M03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1M01773( 7) ;
         RcdFound1773 = (short)(1) ;
         initializeNonKey1M01773( ) ;
         A12929PtosID = T01M03_A12929PtosID[0] ;
         A12930PtosVIni = T01M03_A12930PtosVIni[0] ;
         n12930PtosVIni = T01M03_n12930PtosVIni[0] ;
         A12931PtosVFin = T01M03_A12931PtosVFin[0] ;
         n12931PtosVFin = T01M03_n12931PtosVFin[0] ;
         A12932PtosValor = T01M03_A12932PtosValor[0] ;
         n12932PtosValor = T01M03_n12932PtosValor[0] ;
         Z396EmprCod = A396EmprCod ;
         Z12929PtosID = A12929PtosID ;
         sMode1773 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M01773( ) ;
         load1M01773( ) ;
         Gx_mode = sMode1773 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1773 = (short)(0) ;
         initializeNonKey1M01773( ) ;
         sMode1773 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1M01773( ) ;
         Gx_mode = sMode1773 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1M01773( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1M01773( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01M02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A12929PtosID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPTOSCA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12930PtosVIni, T01M02_A12930PtosVIni[0]) != 0 ) || ( DecimalUtil.compareTo(Z12931PtosVFin, T01M02_A12931PtosVFin[0]) != 0 ) || ( Z12932PtosValor != T01M02_A12932PtosValor[0] ) )
         {
            if ( DecimalUtil.compareTo(Z12930PtosVIni, T01M02_A12930PtosVIni[0]) != 0 )
            {
               GXutil.writeLogln("tptoscast:[seudo value changed for attri]"+"PtosVIni");
               GXutil.writeLogRaw("Old: ",Z12930PtosVIni);
               GXutil.writeLogRaw("Current: ",T01M02_A12930PtosVIni[0]);
            }
            if ( DecimalUtil.compareTo(Z12931PtosVFin, T01M02_A12931PtosVFin[0]) != 0 )
            {
               GXutil.writeLogln("tptoscast:[seudo value changed for attri]"+"PtosVFin");
               GXutil.writeLogRaw("Old: ",Z12931PtosVFin);
               GXutil.writeLogRaw("Current: ",T01M02_A12931PtosVFin[0]);
            }
            if ( Z12932PtosValor != T01M02_A12932PtosValor[0] )
            {
               GXutil.writeLogln("tptoscast:[seudo value changed for attri]"+"PtosValor");
               GXutil.writeLogRaw("Old: ",Z12932PtosValor);
               GXutil.writeLogRaw("Current: ",T01M02_A12932PtosValor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPTOSCA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M01773( )
   {
      beforeValidate1M01773( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M01773( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M01773( 0) ;
         checkOptimisticConcurrency1M01773( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M01773( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M01773( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01M0140 */
                  pr_default.execute(138, new Object[] {A396EmprCod, Short.valueOf(A12929PtosID), Boolean.valueOf(n12930PtosVIni), A12930PtosVIni, Boolean.valueOf(n12931PtosVFin), A12931PtosVFin, Boolean.valueOf(n12932PtosValor), Short.valueOf(A12932PtosValor)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPTOSCA");
                  if ( (pr_default.getStatus(138) == 1) )
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
            load1M01773( ) ;
         }
         endLevel1M01773( ) ;
      }
      closeExtendedTableCursors1M01773( ) ;
   }

   public void update1M01773( )
   {
      beforeValidate1M01773( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M01773( ) ;
      }
      if ( ( nIsMod_1773 != 0 ) || ( nIsDirty_1773 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1M01773( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1M01773( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1M01773( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01M0141 */
                     pr_default.execute(139, new Object[] {Boolean.valueOf(n12930PtosVIni), A12930PtosVIni, Boolean.valueOf(n12931PtosVFin), A12931PtosVFin, Boolean.valueOf(n12932PtosValor), Short.valueOf(A12932PtosValor), A396EmprCod, Short.valueOf(A12929PtosID)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPTOSCA");
                     if ( (pr_default.getStatus(139) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPTOSCA"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1M01773( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1M01773( ) ;
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
            endLevel1M01773( ) ;
         }
      }
      closeExtendedTableCursors1M01773( ) ;
   }

   public void deferredUpdate1M01773( )
   {
   }

   public void delete1M01773( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M01773( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M01773( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M01773( ) ;
         afterConfirm1M01773( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M01773( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01M0142 */
               pr_default.execute(140, new Object[] {A396EmprCod, Short.valueOf(A12929PtosID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPTOSCA");
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
      sMode1773 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M01773( ) ;
      Gx_mode = sMode1773 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M01773( )
   {
      standaloneModal1M01773( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1M01773( )
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

   public void scanStart1M01773( )
   {
      /* Scan By routine */
      /* Using cursor T01M0143 */
      pr_default.execute(141, new Object[] {A396EmprCod});
      RcdFound1773 = (short)(0) ;
      if ( (pr_default.getStatus(141) != 101) )
      {
         RcdFound1773 = (short)(1) ;
         A12929PtosID = T01M0143_A12929PtosID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M01773( )
   {
      /* Scan next routine */
      pr_default.readNext(141);
      RcdFound1773 = (short)(0) ;
      if ( (pr_default.getStatus(141) != 101) )
      {
         RcdFound1773 = (short)(1) ;
         A12929PtosID = T01M0143_A12929PtosID[0] ;
      }
   }

   public void scanEnd1M01773( )
   {
      pr_default.close(141);
   }

   public void afterConfirm1M01773( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M01773( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M01773( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M01773( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M01773( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M01773( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M01773( )
   {
      edtPtosID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosID_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPtosVIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosVIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosVIni_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPtosVFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosVFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosVFin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPtosValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosValor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes1M01773( )
   {
   }

   public void send_integrity_lvl_hashes1M027( )
   {
   }

   public void subsflControlProps_351773( )
   {
      edtavnRcdDeleted_1773_Internalname = "vNRCDDELETED_1773_"+sGXsfl_35_idx ;
      edtPtosID_Internalname = "PTOSID_"+sGXsfl_35_idx ;
      edtPtosVIni_Internalname = "PTOSVINI_"+sGXsfl_35_idx ;
      edtPtosVFin_Internalname = "PTOSVFIN_"+sGXsfl_35_idx ;
      edtPtosValor_Internalname = "PTOSVALOR_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351773( )
   {
      edtavnRcdDeleted_1773_Internalname = "vNRCDDELETED_1773_"+sGXsfl_35_fel_idx ;
      edtPtosID_Internalname = "PTOSID_"+sGXsfl_35_fel_idx ;
      edtPtosVIni_Internalname = "PTOSVINI_"+sGXsfl_35_fel_idx ;
      edtPtosVFin_Internalname = "PTOSVFIN_"+sGXsfl_35_fel_idx ;
      edtPtosValor_Internalname = "PTOSVALOR_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1M01773( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351773( ) ;
      sendRow1M01773( ) ;
   }

   public void sendRow1M01773( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1773_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1773_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1773_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1773), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1773), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1773_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1773_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1773_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPtosID_Internalname,GXutil.ltrim( localUtil.ntoc( A12929PtosID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12929PtosID), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPtosID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPtosID_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1773_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPtosVIni_Internalname,GXutil.ltrim( localUtil.ntoc( A12930PtosVIni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPtosVIni_Enabled!=0) ? localUtil.format( A12930PtosVIni, "ZZZZZ9.99") : localUtil.format( A12930PtosVIni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPtosVIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPtosVIni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1773_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPtosVFin_Internalname,GXutil.ltrim( localUtil.ntoc( A12931PtosVFin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPtosVFin_Enabled!=0) ? localUtil.format( A12931PtosVFin, "ZZZZZ9.99") : localUtil.format( A12931PtosVFin, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPtosVFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPtosVFin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1773_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPtosValor_Internalname,GXutil.ltrim( localUtil.ntoc( A12932PtosValor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPtosValor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12932PtosValor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12932PtosValor), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPtosValor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPtosValor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1M01773( ) ;
      GXCCtl = "Z12929PtosID_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12929PtosID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12930PtosVIni_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12930PtosVIni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12931PtosVFin_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12931PtosVFin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12932PtosValor_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12932PtosValor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1773_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1773_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1773_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1773, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1773_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1773_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PTOSID_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PTOSVINI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PTOSVFIN_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PTOSVALOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosValor_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1M01773( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351773( ) ;
      edtavnRcdDeleted_1773_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1773_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPtosID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSID_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPtosVIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSVINI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPtosVFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSVFIN_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPtosValor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PTOSVALOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1773_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1773_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1773");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1773_Internalname ;
         wbErr = true ;
         nRcdDeleted_1773 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1773 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1773_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPtosID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPtosID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PTOSID_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPtosID_Internalname ;
         wbErr = true ;
         A12929PtosID = (short)(0) ;
      }
      else
      {
         A12929PtosID = (short)(localUtil.ctol( httpContext.cgiGet( edtPtosID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPtosVIni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPtosVIni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PTOSVINI_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPtosVIni_Internalname ;
         wbErr = true ;
         A12930PtosVIni = DecimalUtil.ZERO ;
         n12930PtosVIni = false ;
      }
      else
      {
         A12930PtosVIni = localUtil.ctond( httpContext.cgiGet( edtPtosVIni_Internalname)) ;
         n12930PtosVIni = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPtosVFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPtosVFin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PTOSVFIN_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPtosVFin_Internalname ;
         wbErr = true ;
         A12931PtosVFin = DecimalUtil.ZERO ;
         n12931PtosVFin = false ;
      }
      else
      {
         A12931PtosVFin = localUtil.ctond( httpContext.cgiGet( edtPtosVFin_Internalname)) ;
         n12931PtosVFin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPtosValor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPtosValor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PTOSVALOR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPtosValor_Internalname ;
         wbErr = true ;
         A12932PtosValor = (short)(0) ;
         n12932PtosValor = false ;
      }
      else
      {
         A12932PtosValor = (short)(localUtil.ctol( httpContext.cgiGet( edtPtosValor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12932PtosValor = false ;
      }
      GXCCtl = "Z12929PtosID_" + sGXsfl_35_idx ;
      Z12929PtosID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12930PtosVIni_" + sGXsfl_35_idx ;
      Z12930PtosVIni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12931PtosVFin_" + sGXsfl_35_idx ;
      Z12931PtosVFin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12932PtosValor_" + sGXsfl_35_idx ;
      Z12932PtosValor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1773_" + sGXsfl_35_idx ;
      nRcdDeleted_1773 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1773_" + sGXsfl_35_idx ;
      nRcdExists_1773 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1773_" + sGXsfl_35_idx ;
      nIsMod_1773 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPtosID_Enabled = edtPtosID_Enabled ;
   }

   public void confirmValues1M00( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351773( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351773( ) ;
         httpContext.changePostValue( "Z12929PtosID_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12929PtosID_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12929PtosID_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12930PtosVIni_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12930PtosVIni_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12930PtosVIni_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12931PtosVFin_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12931PtosVFin_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12931PtosVFin_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z12932PtosValor_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z12932PtosValor_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12932PtosValor_"+sGXsfl_35_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tptoscast", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12933PtosUltID", GXutil.ltrim( localUtil.ntoc( Z12933PtosUltID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O12933PtosUltID", GXutil.ltrim( localUtil.ntoc( O12933PtosUltID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tptoscast", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPTOSCAST" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Puntos Castigo", "") ;
   }

   public void initializeNonKey1M027( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A12933PtosUltID = (short)(0) ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      O12933PtosUltID = A12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
      Z407EmprNom = "" ;
      Z12933PtosUltID = (short)(0) ;
   }

   public void initAll1M027( )
   {
      initializeNonKey1M027( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1M01773( )
   {
      A12930PtosVIni = DecimalUtil.ZERO ;
      n12930PtosVIni = false ;
      A12931PtosVFin = DecimalUtil.ZERO ;
      n12931PtosVFin = false ;
      A12932PtosValor = (short)(0) ;
      n12932PtosValor = false ;
      Z12930PtosVIni = DecimalUtil.ZERO ;
      Z12931PtosVFin = DecimalUtil.ZERO ;
      Z12932PtosValor = (short)(0) ;
   }

   public void initAll1M01773( )
   {
      A12929PtosID = (short)(0) ;
      initializeNonKey1M01773( ) ;
   }

   public void standaloneModalInsert1M01773( )
   {
      A12933PtosUltID = i12933PtosUltID ;
      n12933PtosUltID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12933PtosUltID), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241595774", true, true);
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
      httpContext.AddJavascriptSource("tptoscast.js", "?20268241595775", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1773( )
   {
      edtPtosID_Enabled = defedtPtosID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPtosID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPtosID_Enabled), 5, 0), !bGXsfl_35_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1773, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1773_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12929PtosID, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12930PtosVIni, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12931PtosVFin, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosVFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12932PtosValor, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPtosValor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtPtosUltID_Internalname = "PTOSULTID" ;
      edtavnRcdDeleted_1773_Internalname = "vNRCDDELETED_1773" ;
      edtPtosID_Internalname = "PTOSID" ;
      edtPtosVIni_Internalname = "PTOSVINI" ;
      edtPtosVFin_Internalname = "PTOSVFIN" ;
      edtPtosValor_Internalname = "PTOSVALOR" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Puntos Castigo", "") );
      edtPtosValor_Jsonclick = "" ;
      edtPtosVFin_Jsonclick = "" ;
      edtPtosVIni_Jsonclick = "" ;
      edtPtosID_Jsonclick = "" ;
      edtavnRcdDeleted_1773_Jsonclick = "" ;
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
      edtPtosValor_Enabled = 1 ;
      edtPtosVFin_Enabled = 1 ;
      edtPtosVIni_Enabled = 1 ;
      edtPtosID_Enabled = 1 ;
      edtavnRcdDeleted_1773_Enabled = 1 ;
      edtPtosUltID_Jsonclick = "" ;
      edtPtosUltID_Backcolor = (int)(0xFFFFFF) ;
      edtPtosUltID_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      subsflControlProps_351773( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1M01773( ) ;
         standaloneModal1M01773( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1M01773( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351773( ) ;
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
      GX_FocusControl = edtEmprNom_Internalname ;
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
      n12933PtosUltID = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12933PtosUltID", GXutil.ltrim( localUtil.ntoc( A12933PtosUltID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12933PtosUltID", GXutil.ltrim( localUtil.ntoc( Z12933PtosUltID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O12933PtosUltID", GXutil.ltrim( localUtil.ntoc( O12933PtosUltID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A12933PtosUltID',fld:'PTOSULTID',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12933PtosUltID',fld:'PTOSULTID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z407EmprNom'},{av:'Z12933PtosUltID'},{av:'O12933PtosUltID'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PTOSULTID","{handler:'valid_Ptosultid',iparms:[]");
      setEventMetadata("VALID_PTOSULTID",",oparms:[]}");
      setEventMetadata("VALID_PTOSID","{handler:'valid_Ptosid',iparms:[]");
      setEventMetadata("VALID_PTOSID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ptosvalor',iparms:[]");
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
      Z407EmprNom = "" ;
      Z12930PtosVIni = DecimalUtil.ZERO ;
      Z12931PtosVFin = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1773 = "" ;
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
      sMode27 = "" ;
      GXCCtl = "" ;
      A12930PtosVIni = DecimalUtil.ZERO ;
      A12931PtosVFin = DecimalUtil.ZERO ;
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
      T01M06_A396EmprCod = new String[] {""} ;
      T01M06_A407EmprNom = new String[] {""} ;
      T01M06_n407EmprNom = new boolean[] {false} ;
      T01M06_A12933PtosUltID = new short[1] ;
      T01M06_n12933PtosUltID = new boolean[] {false} ;
      T01M07_A396EmprCod = new String[] {""} ;
      T01M05_A396EmprCod = new String[] {""} ;
      T01M05_A407EmprNom = new String[] {""} ;
      T01M05_n407EmprNom = new boolean[] {false} ;
      T01M05_A12933PtosUltID = new short[1] ;
      T01M05_n12933PtosUltID = new boolean[] {false} ;
      T01M08_A396EmprCod = new String[] {""} ;
      T01M09_A396EmprCod = new String[] {""} ;
      T01M04_A396EmprCod = new String[] {""} ;
      T01M04_A407EmprNom = new String[] {""} ;
      T01M04_n407EmprNom = new boolean[] {false} ;
      T01M04_A12933PtosUltID = new short[1] ;
      T01M04_n12933PtosUltID = new boolean[] {false} ;
      T01M013_A396EmprCod = new String[] {""} ;
      T01M013_A3331LanBroCod = new byte[1] ;
      T01M014_A396EmprCod = new String[] {""} ;
      T01M014_A252CliCod = new int[1] ;
      T01M014_n252CliCod = new boolean[] {false} ;
      T01M014_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M015_A396EmprCod = new String[] {""} ;
      T01M015_A252CliCod = new int[1] ;
      T01M015_n252CliCod = new boolean[] {false} ;
      T01M015_A65ArtCod = new String[] {""} ;
      T01M015_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M016_A396EmprCod = new String[] {""} ;
      T01M016_A3316CodSol = new short[1] ;
      T01M017_A396EmprCod = new String[] {""} ;
      T01M017_A3288CCalCod = new String[] {""} ;
      T01M018_A396EmprCod = new String[] {""} ;
      T01M018_A3253SolTraCod = new int[1] ;
      T01M018_A3269SolTraLin = new byte[1] ;
      T01M019_A396EmprCod = new String[] {""} ;
      T01M019_A3235SolSubCod = new int[1] ;
      T01M019_A3251SolSubLin = new byte[1] ;
      T01M020_A396EmprCod = new String[] {""} ;
      T01M020_A3218SolLuzCod = new int[1] ;
      T01M020_A3233SolLuzLin = new byte[1] ;
      T01M021_A396EmprCod = new String[] {""} ;
      T01M021_A3196SolFriCod = new int[1] ;
      T01M021_A3216SolFriLin = new byte[1] ;
      T01M022_A396EmprCod = new String[] {""} ;
      T01M022_A3165SolPilCod = new int[1] ;
      T01M022_A3185SolPilLin = new byte[1] ;
      T01M023_A396EmprCod = new String[] {""} ;
      T01M023_A3153CodCod = new String[] {""} ;
      T01M024_A396EmprCod = new String[] {""} ;
      T01M024_A3073RepCod = new String[] {""} ;
      T01M025_A396EmprCod = new String[] {""} ;
      T01M025_A3061Codia = new byte[1] ;
      T01M025_A3062CoMes = new byte[1] ;
      T01M025_A3063CoAny = new short[1] ;
      T01M026_A396EmprCod = new String[] {""} ;
      T01M026_A3047LOParId = new String[] {""} ;
      T01M027_A396EmprCod = new String[] {""} ;
      T01M027_A3033CCCod = new String[] {""} ;
      T01M028_A396EmprCod = new String[] {""} ;
      T01M028_A2971SabFacCod = new int[1] ;
      T01M029_A396EmprCod = new String[] {""} ;
      T01M029_A2954TiDia = new byte[1] ;
      T01M029_A2955TiMes = new byte[1] ;
      T01M029_A2956TiAny = new short[1] ;
      T01M030_A396EmprCod = new String[] {""} ;
      T01M030_A2942LzaDia = new byte[1] ;
      T01M030_A2943LzaMes = new byte[1] ;
      T01M030_A2944LzaAny = new short[1] ;
      T01M031_A396EmprCod = new String[] {""} ;
      T01M031_A252CliCod = new int[1] ;
      T01M031_n252CliCod = new boolean[] {false} ;
      T01M031_A65ArtCod = new String[] {""} ;
      T01M031_A2937RecIntCod = new byte[1] ;
      T01M032_A396EmprCod = new String[] {""} ;
      T01M032_A252CliCod = new int[1] ;
      T01M032_n252CliCod = new boolean[] {false} ;
      T01M032_A2933RecTipCon = new short[1] ;
      T01M033_A396EmprCod = new String[] {""} ;
      T01M033_A252CliCod = new int[1] ;
      T01M033_n252CliCod = new boolean[] {false} ;
      T01M033_A65ArtCod = new String[] {""} ;
      T01M033_A2931Limite2 = new short[1] ;
      T01M034_A396EmprCod = new String[] {""} ;
      T01M034_A252CliCod = new int[1] ;
      T01M034_n252CliCod = new boolean[] {false} ;
      T01M034_A2927RecProCod = new String[] {""} ;
      T01M035_A396EmprCod = new String[] {""} ;
      T01M035_A2921HisProTiCo = new String[] {""} ;
      T01M035_A2922HisProTiLP = new short[1] ;
      T01M035_A2913HisProTiFe = new java.util.Date[] {GXutil.nullDate()} ;
      T01M035_A2923HisProTiL = new short[1] ;
      T01M036_A396EmprCod = new String[] {""} ;
      T01M036_A252CliCod = new int[1] ;
      T01M036_n252CliCod = new boolean[] {false} ;
      T01M036_A2891HMaForSer = new String[] {""} ;
      T01M036_A2892HMaForCNom = new String[] {""} ;
      T01M036_A2893HMaForCNum = new int[1] ;
      T01M036_A2894HMaTipCCod = new byte[1] ;
      T01M036_A2895HMaForNumC = new int[1] ;
      T01M036_A2897HMaColLin = new short[1] ;
      T01M036_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01M036_A2907HmaLin = new short[1] ;
      T01M037_A396EmprCod = new String[] {""} ;
      T01M037_A129BarCod = new int[1] ;
      T01M037_n129BarCod = new boolean[] {false} ;
      T01M037_A132BarCodReo = new byte[1] ;
      T01M037_n132BarCodReo = new boolean[] {false} ;
      T01M037_A130BarCodPar = new String[] {""} ;
      T01M037_n130BarCodPar = new boolean[] {false} ;
      T01M037_A2872HAnRLinMaq = new short[1] ;
      T01M037_A2873HAnRLinPro = new byte[1] ;
      T01M037_A2874HAnRLin = new short[1] ;
      T01M037_A2875HAnNumAny = new byte[1] ;
      T01M038_A396EmprCod = new String[] {""} ;
      T01M038_A2855CodBota = new int[1] ;
      T01M038_A2859BotLin = new short[1] ;
      T01M039_A396EmprCod = new String[] {""} ;
      T01M039_A2853TipBotCod = new byte[1] ;
      T01M040_A396EmprCod = new String[] {""} ;
      T01M040_A2817PlaTer = new String[] {""} ;
      T01M040_A2818PlaOrd = new short[1] ;
      T01M041_A396EmprCod = new String[] {""} ;
      T01M041_A2809MetTerCod = new String[] {""} ;
      T01M041_A129BarCod = new int[1] ;
      T01M041_n129BarCod = new boolean[] {false} ;
      T01M041_A132BarCodReo = new byte[1] ;
      T01M041_n132BarCodReo = new boolean[] {false} ;
      T01M041_A130BarCodPar = new String[] {""} ;
      T01M041_n130BarCodPar = new boolean[] {false} ;
      T01M042_A396EmprCod = new String[] {""} ;
      T01M042_A129BarCod = new int[1] ;
      T01M042_n129BarCod = new boolean[] {false} ;
      T01M042_A132BarCodReo = new byte[1] ;
      T01M042_n132BarCodReo = new boolean[] {false} ;
      T01M042_A130BarCodPar = new String[] {""} ;
      T01M042_n130BarCodPar = new boolean[] {false} ;
      T01M042_A2808RecLinMAL = new short[1] ;
      T01M042_A1377RecNumAny = new byte[1] ;
      T01M042_A719PrdNum = new String[] {""} ;
      T01M043_A396EmprCod = new String[] {""} ;
      T01M043_A2792TermiCod = new String[] {""} ;
      T01M043_A129BarCod = new int[1] ;
      T01M043_n129BarCod = new boolean[] {false} ;
      T01M043_A132BarCodReo = new byte[1] ;
      T01M043_n132BarCodReo = new boolean[] {false} ;
      T01M043_A130BarCodPar = new String[] {""} ;
      T01M043_n130BarCodPar = new boolean[] {false} ;
      T01M044_A396EmprCod = new String[] {""} ;
      T01M044_A30AlbProCod = new long[1] ;
      T01M044_A129BarCod = new int[1] ;
      T01M044_n129BarCod = new boolean[] {false} ;
      T01M044_A132BarCodReo = new byte[1] ;
      T01M044_n132BarCodReo = new boolean[] {false} ;
      T01M044_A130BarCodPar = new String[] {""} ;
      T01M044_n130BarCodPar = new boolean[] {false} ;
      T01M044_A2764AlbHdrLin = new short[1] ;
      T01M045_A396EmprCod = new String[] {""} ;
      T01M045_A252CliCod = new int[1] ;
      T01M045_n252CliCod = new boolean[] {false} ;
      T01M045_A65ArtCod = new String[] {""} ;
      T01M045_A71ArtEstAny = new short[1] ;
      T01M045_A2756ArtEstSer = new String[] {""} ;
      T01M046_A396EmprCod = new String[] {""} ;
      T01M046_A252CliCod = new int[1] ;
      T01M046_n252CliCod = new boolean[] {false} ;
      T01M046_A425EstAny = new short[1] ;
      T01M046_A2755EstSerFac = new String[] {""} ;
      T01M047_A396EmprCod = new String[] {""} ;
      T01M047_A2730RecTipCo = new short[1] ;
      T01M047_A252CliCod = new int[1] ;
      T01M047_n252CliCod = new boolean[] {false} ;
      T01M048_A396EmprCod = new String[] {""} ;
      T01M048_A2707NumTexCod = new String[] {""} ;
      T01M049_A396EmprCod = new String[] {""} ;
      T01M049_A129BarCod = new int[1] ;
      T01M049_n129BarCod = new boolean[] {false} ;
      T01M049_A132BarCodReo = new byte[1] ;
      T01M049_n132BarCodReo = new boolean[] {false} ;
      T01M049_A130BarCodPar = new String[] {""} ;
      T01M049_n130BarCodPar = new boolean[] {false} ;
      T01M049_A2494BarDosPro = new String[] {""} ;
      T01M049_A719PrdNum = new String[] {""} ;
      T01M050_A396EmprCod = new String[] {""} ;
      T01M050_A658PedCod = new int[1] ;
      T01M050_A2501PedObsLin = new byte[1] ;
      T01M051_A396EmprCod = new String[] {""} ;
      T01M051_A129BarCod = new int[1] ;
      T01M051_n129BarCod = new boolean[] {false} ;
      T01M051_A132BarCodReo = new byte[1] ;
      T01M051_n132BarCodReo = new boolean[] {false} ;
      T01M051_A130BarCodPar = new String[] {""} ;
      T01M051_n130BarCodPar = new boolean[] {false} ;
      T01M051_A2457BarObLin = new short[1] ;
      T01M052_A396EmprCod = new String[] {""} ;
      T01M052_A129BarCod = new int[1] ;
      T01M052_n129BarCod = new boolean[] {false} ;
      T01M052_A132BarCodReo = new byte[1] ;
      T01M052_n132BarCodReo = new boolean[] {false} ;
      T01M052_A130BarCodPar = new String[] {""} ;
      T01M052_n130BarCodPar = new boolean[] {false} ;
      T01M052_A2444BarEnLin = new short[1] ;
      T01M053_A396EmprCod = new String[] {""} ;
      T01M053_A2429TerBarCod = new int[1] ;
      T01M053_A2431TerBarReo = new byte[1] ;
      T01M053_A2430TerBarPar = new String[] {""} ;
      T01M054_A396EmprCod = new String[] {""} ;
      T01M054_A2420OpeAntCod = new int[1] ;
      T01M055_A396EmprCod = new String[] {""} ;
      T01M055_A2406ExhAlbCod = new int[1] ;
      T01M055_A2416ExhObsLin = new short[1] ;
      T01M056_A396EmprCod = new String[] {""} ;
      T01M056_A2406ExhAlbCod = new int[1] ;
      T01M056_A129BarCod = new int[1] ;
      T01M056_n129BarCod = new boolean[] {false} ;
      T01M056_A132BarCodReo = new byte[1] ;
      T01M056_n132BarCodReo = new boolean[] {false} ;
      T01M056_A130BarCodPar = new String[] {""} ;
      T01M056_n130BarCodPar = new boolean[] {false} ;
      T01M057_A396EmprCod = new String[] {""} ;
      T01M057_A14AlbComCod = new int[1] ;
      T01M057_A2386AlbCObsLin = new byte[1] ;
      T01M058_A396EmprCod = new String[] {""} ;
      T01M058_A2382AbcTerCod = new String[] {""} ;
      T01M058_A2381AbcSec = new String[] {""} ;
      T01M058_A252CliCod = new int[1] ;
      T01M058_n252CliCod = new boolean[] {false} ;
      T01M059_A396EmprCod = new String[] {""} ;
      T01M059_A252CliCod = new int[1] ;
      T01M059_n252CliCod = new boolean[] {false} ;
      T01M059_A2308CliDesCod = new int[1] ;
      T01M060_A396EmprCod = new String[] {""} ;
      T01M060_A2268MovParCod = new String[] {""} ;
      T01M060_A252CliCod = new int[1] ;
      T01M060_n252CliCod = new boolean[] {false} ;
      T01M060_A2276MovParLin = new short[1] ;
      T01M061_A396EmprCod = new String[] {""} ;
      T01M061_A2253SalExtAlb = new int[1] ;
      T01M061_A129BarCod = new int[1] ;
      T01M061_n129BarCod = new boolean[] {false} ;
      T01M061_A132BarCodReo = new byte[1] ;
      T01M061_n132BarCodReo = new boolean[] {false} ;
      T01M061_A130BarCodPar = new String[] {""} ;
      T01M061_n130BarCodPar = new boolean[] {false} ;
      T01M062_A396EmprCod = new String[] {""} ;
      T01M062_A2248ManCod = new short[1] ;
      T01M063_A396EmprCod = new String[] {""} ;
      T01M063_A44AlbRecCod = new int[1] ;
      T01M063_A2159AlbRecPie = new String[] {""} ;
      T01M064_A396EmprCod = new String[] {""} ;
      T01M064_A44AlbRecCod = new int[1] ;
      T01M064_A2165HisEmpLin = new short[1] ;
      T01M065_A396EmprCod = new String[] {""} ;
      T01M065_A1794GruLecMaq = new String[] {""} ;
      T01M065_A1795GruOrd = new byte[1] ;
      T01M065_A1791GruBarCod = new int[1] ;
      T01M065_A1793GruBarReo = new byte[1] ;
      T01M065_A1792GruBarPar = new String[] {""} ;
      T01M066_A396EmprCod = new String[] {""} ;
      T01M066_A1664ParFasCod = new short[1] ;
      T01M067_A396EmprCod = new String[] {""} ;
      T01M067_A1514MacProCod = new String[] {""} ;
      T01M068_A396EmprCod = new String[] {""} ;
      T01M068_A252CliCod = new int[1] ;
      T01M068_n252CliCod = new boolean[] {false} ;
      T01M068_A1504CliProCod = new String[] {""} ;
      T01M068_A65ArtCod = new String[] {""} ;
      T01M069_A396EmprCod = new String[] {""} ;
      T01M069_A1438BarTerCod = new String[] {""} ;
      T01M069_A172BarLanLin = new short[1] ;
      T01M070_A396EmprCod = new String[] {""} ;
      T01M070_A1387AlbPrvCod = new int[1] ;
      T01M071_A396EmprCod = new String[] {""} ;
      T01M071_A44AlbRecCod = new int[1] ;
      T01M071_A1299AlbRLin = new byte[1] ;
      T01M072_A396EmprCod = new String[] {""} ;
      T01M072_A858ZonGeoCod = new short[1] ;
      T01M073_A396EmprCod = new String[] {""} ;
      T01M073_A1348SolColCod = new int[1] ;
      T01M073_A1351SolColLin = new byte[1] ;
      T01M074_A396EmprCod = new String[] {""} ;
      T01M074_A1333EstDimCod = new int[1] ;
      T01M074_A1339EstDimLin = new byte[1] ;
      T01M075_A396EmprCod = new String[] {""} ;
      T01M075_A1314EnsLabCod = new int[1] ;
      T01M076_A396EmprCod = new String[] {""} ;
      T01M076_A252CliCod = new int[1] ;
      T01M076_n252CliCod = new boolean[] {false} ;
      T01M076_A1213TalCod = new String[] {""} ;
      T01M076_A1293EntMarRef = new String[] {""} ;
      T01M077_A396EmprCod = new String[] {""} ;
      T01M077_A1206TubCod = new short[1] ;
      T01M078_A396EmprCod = new String[] {""} ;
      T01M078_A252CliCod = new int[1] ;
      T01M078_n252CliCod = new boolean[] {false} ;
      T01M078_A1213TalCod = new String[] {""} ;
      T01M078_A1217EntMalLin = new short[1] ;
      T01M079_A396EmprCod = new String[] {""} ;
      T01M079_A1199MacCod = new int[1] ;
      T01M080_A396EmprCod = new String[] {""} ;
      T01M080_A1209DesCod = new short[1] ;
      T01M081_A396EmprCod = new String[] {""} ;
      T01M081_A1211TipEntCod = new short[1] ;
      T01M082_A396EmprCod = new String[] {""} ;
      T01M082_A688PrdComCod = new String[] {""} ;
      T01M083_A396EmprCod = new String[] {""} ;
      T01M083_A1166LecMaqCod = new String[] {""} ;
      T01M084_A396EmprCod = new String[] {""} ;
      T01M084_A1161TurnCod = new byte[1] ;
      T01M085_A396EmprCod = new String[] {""} ;
      T01M085_A1146DisDisCod = new int[1] ;
      T01M085_A1139DisBarCod = new int[1] ;
      T01M085_A1140DisBarReo = new byte[1] ;
      T01M085_A1141DisBarPar = new String[] {""} ;
      T01M086_A396EmprCod = new String[] {""} ;
      T01M086_A996TipCon = new short[1] ;
      T01M087_A396EmprCod = new String[] {""} ;
      T01M087_A970ProceCod = new short[1] ;
      T01M088_A396EmprCod = new String[] {""} ;
      T01M088_A30AlbProCod = new long[1] ;
      T01M088_A915AlbPObsLin = new byte[1] ;
      T01M089_A396EmprCod = new String[] {""} ;
      T01M089_A910Workstat = new String[] {""} ;
      T01M090_A396EmprCod = new String[] {""} ;
      T01M090_A129BarCod = new int[1] ;
      T01M090_n129BarCod = new boolean[] {false} ;
      T01M090_A132BarCodReo = new byte[1] ;
      T01M090_n132BarCodReo = new boolean[] {false} ;
      T01M090_A130BarCodPar = new String[] {""} ;
      T01M090_n130BarCodPar = new boolean[] {false} ;
      T01M090_A906ObsReoLin = new byte[1] ;
      T01M091_A396EmprCod = new String[] {""} ;
      T01M091_A656ParCod = new short[1] ;
      T01M092_A396EmprCod = new String[] {""} ;
      T01M092_A859CumCodCont = new int[1] ;
      T01M093_A396EmprCod = new String[] {""} ;
      T01M093_A490ForPrdUMe = new byte[1] ;
      T01M094_A396EmprCod = new String[] {""} ;
      T01M094_A840TrnCod = new short[1] ;
      T01M095_A396EmprCod = new String[] {""} ;
      T01M095_A856ValCod = new byte[1] ;
      T01M096_A396EmprCod = new String[] {""} ;
      T01M096_A848UniCod = new byte[1] ;
      T01M097_A396EmprCod = new String[] {""} ;
      T01M097_A687PrdCod = new byte[1] ;
      T01M098_A396EmprCod = new String[] {""} ;
      T01M098_A835TipDtoCod = new byte[1] ;
      T01M099_A396EmprCod = new String[] {""} ;
      T01M099_A833TipDefCod = new short[1] ;
      T01M0100_A396EmprCod = new String[] {""} ;
      T01M0100_A831TipColCod = new byte[1] ;
      T01M0101_A396EmprCod = new String[] {""} ;
      T01M0101_A829TipArtCod = new short[1] ;
      T01M0102_A396EmprCod = new String[] {""} ;
      T01M0102_A719PrdNum = new String[] {""} ;
      T01M0102_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01M0103_A396EmprCod = new String[] {""} ;
      T01M0103_A252CliCod = new int[1] ;
      T01M0103_n252CliCod = new boolean[] {false} ;
      T01M0103_A65ArtCod = new String[] {""} ;
      T01M0103_A598LinRec = new byte[1] ;
      T01M0104_A396EmprCod = new String[] {""} ;
      T01M0104_A764ProForCod = new String[] {""} ;
      T01M0105_A396EmprCod = new String[] {""} ;
      T01M0105_A758ProCod = new String[] {""} ;
      T01M0106_A396EmprCod = new String[] {""} ;
      T01M0106_A252CliCod = new int[1] ;
      T01M0106_n252CliCod = new boolean[] {false} ;
      T01M0106_A457FasCod = new String[] {""} ;
      T01M0107_A396EmprCod = new String[] {""} ;
      T01M0107_A719PrdNum = new String[] {""} ;
      T01M0107_A681PrdAny = new short[1] ;
      T01M0108_A396EmprCod = new String[] {""} ;
      T01M0108_A719PrdNum = new String[] {""} ;
      T01M0108_A680PrdAltNum = new String[] {""} ;
      T01M0109_A396EmprCod = new String[] {""} ;
      T01M0109_A658PedCod = new int[1] ;
      T01M0109_A719PrdNum = new String[] {""} ;
      T01M0110_A396EmprCod = new String[] {""} ;
      T01M0110_A652OpeCod = new int[1] ;
      T01M0111_A396EmprCod = new String[] {""} ;
      T01M0111_A629MetCod = new byte[1] ;
      T01M0112_A396EmprCod = new String[] {""} ;
      T01M0112_A626MatCod = new short[1] ;
      T01M0113_A396EmprCod = new String[] {""} ;
      T01M0113_A602MaqCod = new String[] {""} ;
      T01M0114_A396EmprCod = new String[] {""} ;
      T01M0114_A583IntCod = new byte[1] ;
      T01M0115_A396EmprCod = new String[] {""} ;
      T01M0115_A506HbaBarCod = new int[1] ;
      T01M0115_A508HbaBarReo = new byte[1] ;
      T01M0115_A507HbaBarPar = new String[] {""} ;
      T01M0116_A396EmprCod = new String[] {""} ;
      T01M0116_A503GruOpeCod = new int[1] ;
      T01M0117_A396EmprCod = new String[] {""} ;
      T01M0117_A501GruMaqCod = new String[] {""} ;
      T01M0118_A396EmprCod = new String[] {""} ;
      T01M0118_A499GrpFamCod = new byte[1] ;
      T01M0119_A396EmprCod = new String[] {""} ;
      T01M0119_A497FpgCod = new String[] {""} ;
      T01M0120_A396EmprCod = new String[] {""} ;
      T01M0120_A457FasCod = new String[] {""} ;
      T01M0120_A463FasNumLin = new byte[1] ;
      T01M0121_A396EmprCod = new String[] {""} ;
      T01M0121_A430FacCod = new int[1] ;
      T01M0122_A396EmprCod = new String[] {""} ;
      T01M0122_A313ContCod = new String[] {""} ;
      T01M0123_A396EmprCod = new String[] {""} ;
      T01M0123_A361DisCod = new int[1] ;
      T01M0123_A376DisObsLin = new byte[1] ;
      T01M0124_A396EmprCod = new String[] {""} ;
      T01M0124_A361DisCod = new int[1] ;
      T01M0124_A44AlbRecCod = new int[1] ;
      T01M0125_A396EmprCod = new String[] {""} ;
      T01M0125_A486ForNumCol = new int[1] ;
      T01M0126_A396EmprCod = new String[] {""} ;
      T01M0126_A323DevGenCod = new int[1] ;
      T01M0127_A396EmprCod = new String[] {""} ;
      T01M0127_A719PrdNum = new String[] {""} ;
      T01M0127_A647NumCon = new int[1] ;
      T01M0128_A396EmprCod = new String[] {""} ;
      T01M0128_A252CliCod = new int[1] ;
      T01M0128_n252CliCod = new boolean[] {false} ;
      T01M0128_A287CliPagLin = new byte[1] ;
      T01M0129_A396EmprCod = new String[] {""} ;
      T01M0129_A252CliCod = new int[1] ;
      T01M0129_n252CliCod = new boolean[] {false} ;
      T01M0129_A266CliEnvLin = new byte[1] ;
      T01M0130_A396EmprCod = new String[] {""} ;
      T01M0130_A241CieBarCod = new int[1] ;
      T01M0130_A243CieBarReo = new byte[1] ;
      T01M0130_A242CieBarPar = new String[] {""} ;
      T01M0131_A396EmprCod = new String[] {""} ;
      T01M0131_A129BarCod = new int[1] ;
      T01M0131_n129BarCod = new boolean[] {false} ;
      T01M0131_A132BarCodReo = new byte[1] ;
      T01M0131_n132BarCodReo = new boolean[] {false} ;
      T01M0131_A130BarCodPar = new String[] {""} ;
      T01M0131_n130BarCodPar = new boolean[] {false} ;
      T01M0131_A200BarPieCod = new String[] {""} ;
      T01M0132_A396EmprCod = new String[] {""} ;
      T01M0132_A129BarCod = new int[1] ;
      T01M0132_n129BarCod = new boolean[] {false} ;
      T01M0132_A132BarCodReo = new byte[1] ;
      T01M0132_n132BarCodReo = new boolean[] {false} ;
      T01M0132_A130BarCodPar = new String[] {""} ;
      T01M0132_n130BarCodPar = new boolean[] {false} ;
      T01M0132_A188BarNotLin = new byte[1] ;
      T01M0133_A396EmprCod = new String[] {""} ;
      T01M0133_A129BarCod = new int[1] ;
      T01M0133_n129BarCod = new boolean[] {false} ;
      T01M0133_A132BarCodReo = new byte[1] ;
      T01M0133_n132BarCodReo = new boolean[] {false} ;
      T01M0133_A130BarCodPar = new String[] {""} ;
      T01M0133_n130BarCodPar = new boolean[] {false} ;
      T01M0133_A119BarAgrCod = new int[1] ;
      T01M0133_A124BarAgrReo = new byte[1] ;
      T01M0133_A122BarAgrPar = new String[] {""} ;
      T01M0134_A396EmprCod = new String[] {""} ;
      T01M0134_A30AlbProCod = new long[1] ;
      T01M0135_A396EmprCod = new String[] {""} ;
      T01M0135_A14AlbComCod = new int[1] ;
      T01M0135_A20AlbComLin = new short[1] ;
      T01M0137_A396EmprCod = new String[] {""} ;
      T01M0138_A396EmprCod = new String[] {""} ;
      T01M0138_A12929PtosID = new short[1] ;
      T01M0138_A12930PtosVIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M0138_n12930PtosVIni = new boolean[] {false} ;
      T01M0138_A12931PtosVFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M0138_n12931PtosVFin = new boolean[] {false} ;
      T01M0138_A12932PtosValor = new short[1] ;
      T01M0138_n12932PtosValor = new boolean[] {false} ;
      T01M0139_A396EmprCod = new String[] {""} ;
      T01M0139_A12929PtosID = new short[1] ;
      T01M03_A396EmprCod = new String[] {""} ;
      T01M03_A12929PtosID = new short[1] ;
      T01M03_A12930PtosVIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M03_n12930PtosVIni = new boolean[] {false} ;
      T01M03_A12931PtosVFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M03_n12931PtosVFin = new boolean[] {false} ;
      T01M03_A12932PtosValor = new short[1] ;
      T01M03_n12932PtosValor = new boolean[] {false} ;
      T01M02_A396EmprCod = new String[] {""} ;
      T01M02_A12929PtosID = new short[1] ;
      T01M02_A12930PtosVIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M02_n12930PtosVIni = new boolean[] {false} ;
      T01M02_A12931PtosVFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01M02_n12931PtosVFin = new boolean[] {false} ;
      T01M02_A12932PtosValor = new short[1] ;
      T01M02_n12932PtosValor = new boolean[] {false} ;
      T01M0143_A396EmprCod = new String[] {""} ;
      T01M0143_A12929PtosID = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tptoscast__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tptoscast__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tptoscast__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tptoscast__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tptoscast__default(),
         new Object[] {
             new Object[] {
            T01M02_A396EmprCod, T01M02_A12929PtosID, T01M02_A12930PtosVIni, T01M02_n12930PtosVIni, T01M02_A12931PtosVFin, T01M02_n12931PtosVFin, T01M02_A12932PtosValor, T01M02_n12932PtosValor
            }
            , new Object[] {
            T01M03_A396EmprCod, T01M03_A12929PtosID, T01M03_A12930PtosVIni, T01M03_n12930PtosVIni, T01M03_A12931PtosVFin, T01M03_n12931PtosVFin, T01M03_A12932PtosValor, T01M03_n12932PtosValor
            }
            , new Object[] {
            T01M04_A396EmprCod, T01M04_A407EmprNom, T01M04_n407EmprNom, T01M04_A12933PtosUltID, T01M04_n12933PtosUltID
            }
            , new Object[] {
            T01M05_A396EmprCod, T01M05_A407EmprNom, T01M05_n407EmprNom, T01M05_A12933PtosUltID, T01M05_n12933PtosUltID
            }
            , new Object[] {
            T01M06_A396EmprCod, T01M06_A407EmprNom, T01M06_n407EmprNom, T01M06_A12933PtosUltID, T01M06_n12933PtosUltID
            }
            , new Object[] {
            T01M07_A396EmprCod
            }
            , new Object[] {
            T01M08_A396EmprCod
            }
            , new Object[] {
            T01M09_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M013_A396EmprCod, T01M013_A3331LanBroCod
            }
            , new Object[] {
            T01M014_A396EmprCod, T01M014_A252CliCod, T01M014_A3320CliLimKgs
            }
            , new Object[] {
            T01M015_A396EmprCod, T01M015_A252CliCod, T01M015_A65ArtCod, T01M015_A3319ArtCapKgs
            }
            , new Object[] {
            T01M016_A396EmprCod, T01M016_A3316CodSol
            }
            , new Object[] {
            T01M017_A396EmprCod, T01M017_A3288CCalCod
            }
            , new Object[] {
            T01M018_A396EmprCod, T01M018_A3253SolTraCod, T01M018_A3269SolTraLin
            }
            , new Object[] {
            T01M019_A396EmprCod, T01M019_A3235SolSubCod, T01M019_A3251SolSubLin
            }
            , new Object[] {
            T01M020_A396EmprCod, T01M020_A3218SolLuzCod, T01M020_A3233SolLuzLin
            }
            , new Object[] {
            T01M021_A396EmprCod, T01M021_A3196SolFriCod, T01M021_A3216SolFriLin
            }
            , new Object[] {
            T01M022_A396EmprCod, T01M022_A3165SolPilCod, T01M022_A3185SolPilLin
            }
            , new Object[] {
            T01M023_A396EmprCod, T01M023_A3153CodCod
            }
            , new Object[] {
            T01M024_A396EmprCod, T01M024_A3073RepCod
            }
            , new Object[] {
            T01M025_A396EmprCod, T01M025_A3061Codia, T01M025_A3062CoMes, T01M025_A3063CoAny
            }
            , new Object[] {
            T01M026_A396EmprCod, T01M026_A3047LOParId
            }
            , new Object[] {
            T01M027_A396EmprCod, T01M027_A3033CCCod
            }
            , new Object[] {
            T01M028_A396EmprCod, T01M028_A2971SabFacCod
            }
            , new Object[] {
            T01M029_A396EmprCod, T01M029_A2954TiDia, T01M029_A2955TiMes, T01M029_A2956TiAny
            }
            , new Object[] {
            T01M030_A396EmprCod, T01M030_A2942LzaDia, T01M030_A2943LzaMes, T01M030_A2944LzaAny
            }
            , new Object[] {
            T01M031_A396EmprCod, T01M031_A252CliCod, T01M031_A65ArtCod, T01M031_A2937RecIntCod
            }
            , new Object[] {
            T01M032_A396EmprCod, T01M032_A252CliCod, T01M032_A2933RecTipCon
            }
            , new Object[] {
            T01M033_A396EmprCod, T01M033_A252CliCod, T01M033_A65ArtCod, T01M033_A2931Limite2
            }
            , new Object[] {
            T01M034_A396EmprCod, T01M034_A252CliCod, T01M034_A2927RecProCod
            }
            , new Object[] {
            T01M035_A396EmprCod, T01M035_A2921HisProTiCo, T01M035_A2922HisProTiLP, T01M035_A2913HisProTiFe, T01M035_A2923HisProTiL
            }
            , new Object[] {
            T01M036_A396EmprCod, T01M036_A252CliCod, T01M036_A2891HMaForSer, T01M036_A2892HMaForCNom, T01M036_A2893HMaForCNum, T01M036_A2894HMaTipCCod, T01M036_A2895HMaForNumC, T01M036_A2897HMaColLin, T01M036_A2896HMaFec, T01M036_A2907HmaLin
            }
            , new Object[] {
            T01M037_A396EmprCod, T01M037_A129BarCod, T01M037_A132BarCodReo, T01M037_A130BarCodPar, T01M037_A2872HAnRLinMaq, T01M037_A2873HAnRLinPro, T01M037_A2874HAnRLin, T01M037_A2875HAnNumAny
            }
            , new Object[] {
            T01M038_A396EmprCod, T01M038_A2855CodBota, T01M038_A2859BotLin
            }
            , new Object[] {
            T01M039_A396EmprCod, T01M039_A2853TipBotCod
            }
            , new Object[] {
            T01M040_A396EmprCod, T01M040_A2817PlaTer, T01M040_A2818PlaOrd
            }
            , new Object[] {
            T01M041_A396EmprCod, T01M041_A2809MetTerCod, T01M041_A129BarCod, T01M041_A132BarCodReo, T01M041_A130BarCodPar
            }
            , new Object[] {
            T01M042_A396EmprCod, T01M042_A129BarCod, T01M042_A132BarCodReo, T01M042_A130BarCodPar, T01M042_A2808RecLinMAL, T01M042_A1377RecNumAny, T01M042_A719PrdNum
            }
            , new Object[] {
            T01M043_A396EmprCod, T01M043_A2792TermiCod, T01M043_A129BarCod, T01M043_A132BarCodReo, T01M043_A130BarCodPar
            }
            , new Object[] {
            T01M044_A396EmprCod, T01M044_A30AlbProCod, T01M044_A129BarCod, T01M044_A132BarCodReo, T01M044_A130BarCodPar, T01M044_A2764AlbHdrLin
            }
            , new Object[] {
            T01M045_A396EmprCod, T01M045_A252CliCod, T01M045_A65ArtCod, T01M045_A71ArtEstAny, T01M045_A2756ArtEstSer
            }
            , new Object[] {
            T01M046_A396EmprCod, T01M046_A252CliCod, T01M046_A425EstAny, T01M046_A2755EstSerFac
            }
            , new Object[] {
            T01M047_A396EmprCod, T01M047_A2730RecTipCo, T01M047_A252CliCod
            }
            , new Object[] {
            T01M048_A396EmprCod, T01M048_A2707NumTexCod
            }
            , new Object[] {
            T01M049_A396EmprCod, T01M049_A129BarCod, T01M049_A132BarCodReo, T01M049_A130BarCodPar, T01M049_A2494BarDosPro, T01M049_A719PrdNum
            }
            , new Object[] {
            T01M050_A396EmprCod, T01M050_A658PedCod, T01M050_A2501PedObsLin
            }
            , new Object[] {
            T01M051_A396EmprCod, T01M051_A129BarCod, T01M051_A132BarCodReo, T01M051_A130BarCodPar, T01M051_A2457BarObLin
            }
            , new Object[] {
            T01M052_A396EmprCod, T01M052_A129BarCod, T01M052_A132BarCodReo, T01M052_A130BarCodPar, T01M052_A2444BarEnLin
            }
            , new Object[] {
            T01M053_A396EmprCod, T01M053_A2429TerBarCod, T01M053_A2431TerBarReo, T01M053_A2430TerBarPar
            }
            , new Object[] {
            T01M054_A396EmprCod, T01M054_A2420OpeAntCod
            }
            , new Object[] {
            T01M055_A396EmprCod, T01M055_A2406ExhAlbCod, T01M055_A2416ExhObsLin
            }
            , new Object[] {
            T01M056_A396EmprCod, T01M056_A2406ExhAlbCod, T01M056_A129BarCod, T01M056_A132BarCodReo, T01M056_A130BarCodPar
            }
            , new Object[] {
            T01M057_A396EmprCod, T01M057_A14AlbComCod, T01M057_A2386AlbCObsLin
            }
            , new Object[] {
            T01M058_A396EmprCod, T01M058_A2382AbcTerCod, T01M058_A2381AbcSec, T01M058_A252CliCod
            }
            , new Object[] {
            T01M059_A396EmprCod, T01M059_A252CliCod, T01M059_A2308CliDesCod
            }
            , new Object[] {
            T01M060_A396EmprCod, T01M060_A2268MovParCod, T01M060_A252CliCod, T01M060_A2276MovParLin
            }
            , new Object[] {
            T01M061_A396EmprCod, T01M061_A2253SalExtAlb, T01M061_A129BarCod, T01M061_A132BarCodReo, T01M061_A130BarCodPar
            }
            , new Object[] {
            T01M062_A396EmprCod, T01M062_A2248ManCod
            }
            , new Object[] {
            T01M063_A396EmprCod, T01M063_A44AlbRecCod, T01M063_A2159AlbRecPie
            }
            , new Object[] {
            T01M064_A396EmprCod, T01M064_A44AlbRecCod, T01M064_A2165HisEmpLin
            }
            , new Object[] {
            T01M065_A396EmprCod, T01M065_A1794GruLecMaq, T01M065_A1795GruOrd, T01M065_A1791GruBarCod, T01M065_A1793GruBarReo, T01M065_A1792GruBarPar
            }
            , new Object[] {
            T01M066_A396EmprCod, T01M066_A1664ParFasCod
            }
            , new Object[] {
            T01M067_A396EmprCod, T01M067_A1514MacProCod
            }
            , new Object[] {
            T01M068_A396EmprCod, T01M068_A252CliCod, T01M068_A1504CliProCod, T01M068_A65ArtCod
            }
            , new Object[] {
            T01M069_A396EmprCod, T01M069_A1438BarTerCod, T01M069_A172BarLanLin
            }
            , new Object[] {
            T01M070_A396EmprCod, T01M070_A1387AlbPrvCod
            }
            , new Object[] {
            T01M071_A396EmprCod, T01M071_A44AlbRecCod, T01M071_A1299AlbRLin
            }
            , new Object[] {
            T01M072_A396EmprCod, T01M072_A858ZonGeoCod
            }
            , new Object[] {
            T01M073_A396EmprCod, T01M073_A1348SolColCod, T01M073_A1351SolColLin
            }
            , new Object[] {
            T01M074_A396EmprCod, T01M074_A1333EstDimCod, T01M074_A1339EstDimLin
            }
            , new Object[] {
            T01M075_A396EmprCod, T01M075_A1314EnsLabCod
            }
            , new Object[] {
            T01M076_A396EmprCod, T01M076_A252CliCod, T01M076_A1213TalCod, T01M076_A1293EntMarRef
            }
            , new Object[] {
            T01M077_A396EmprCod, T01M077_A1206TubCod
            }
            , new Object[] {
            T01M078_A396EmprCod, T01M078_A252CliCod, T01M078_A1213TalCod, T01M078_A1217EntMalLin
            }
            , new Object[] {
            T01M079_A396EmprCod, T01M079_A1199MacCod
            }
            , new Object[] {
            T01M080_A396EmprCod, T01M080_A1209DesCod
            }
            , new Object[] {
            T01M081_A396EmprCod, T01M081_A1211TipEntCod
            }
            , new Object[] {
            T01M082_A396EmprCod, T01M082_A688PrdComCod
            }
            , new Object[] {
            T01M083_A396EmprCod, T01M083_A1166LecMaqCod
            }
            , new Object[] {
            T01M084_A396EmprCod, T01M084_A1161TurnCod
            }
            , new Object[] {
            T01M085_A396EmprCod, T01M085_A1146DisDisCod, T01M085_A1139DisBarCod, T01M085_A1140DisBarReo, T01M085_A1141DisBarPar
            }
            , new Object[] {
            T01M086_A396EmprCod, T01M086_A996TipCon
            }
            , new Object[] {
            T01M087_A396EmprCod, T01M087_A970ProceCod
            }
            , new Object[] {
            T01M088_A396EmprCod, T01M088_A30AlbProCod, T01M088_A915AlbPObsLin
            }
            , new Object[] {
            T01M089_A396EmprCod, T01M089_A910Workstat
            }
            , new Object[] {
            T01M090_A396EmprCod, T01M090_A129BarCod, T01M090_A132BarCodReo, T01M090_A130BarCodPar, T01M090_A906ObsReoLin
            }
            , new Object[] {
            T01M091_A396EmprCod, T01M091_A656ParCod
            }
            , new Object[] {
            T01M092_A396EmprCod, T01M092_A859CumCodCont
            }
            , new Object[] {
            T01M093_A396EmprCod, T01M093_A490ForPrdUMe
            }
            , new Object[] {
            T01M094_A396EmprCod, T01M094_A840TrnCod
            }
            , new Object[] {
            T01M095_A396EmprCod, T01M095_A856ValCod
            }
            , new Object[] {
            T01M096_A396EmprCod, T01M096_A848UniCod
            }
            , new Object[] {
            T01M097_A396EmprCod, T01M097_A687PrdCod
            }
            , new Object[] {
            T01M098_A396EmprCod, T01M098_A835TipDtoCod
            }
            , new Object[] {
            T01M099_A396EmprCod, T01M099_A833TipDefCod
            }
            , new Object[] {
            T01M0100_A396EmprCod, T01M0100_A831TipColCod
            }
            , new Object[] {
            T01M0101_A396EmprCod, T01M0101_A829TipArtCod
            }
            , new Object[] {
            T01M0102_A396EmprCod, T01M0102_A719PrdNum, T01M0102_A810RecFec
            }
            , new Object[] {
            T01M0103_A396EmprCod, T01M0103_A252CliCod, T01M0103_A65ArtCod, T01M0103_A598LinRec
            }
            , new Object[] {
            T01M0104_A396EmprCod, T01M0104_A764ProForCod
            }
            , new Object[] {
            T01M0105_A396EmprCod, T01M0105_A758ProCod
            }
            , new Object[] {
            T01M0106_A396EmprCod, T01M0106_A252CliCod, T01M0106_A457FasCod
            }
            , new Object[] {
            T01M0107_A396EmprCod, T01M0107_A719PrdNum, T01M0107_A681PrdAny
            }
            , new Object[] {
            T01M0108_A396EmprCod, T01M0108_A719PrdNum, T01M0108_A680PrdAltNum
            }
            , new Object[] {
            T01M0109_A396EmprCod, T01M0109_A658PedCod, T01M0109_A719PrdNum
            }
            , new Object[] {
            T01M0110_A396EmprCod, T01M0110_A652OpeCod
            }
            , new Object[] {
            T01M0111_A396EmprCod, T01M0111_A629MetCod
            }
            , new Object[] {
            T01M0112_A396EmprCod, T01M0112_A626MatCod
            }
            , new Object[] {
            T01M0113_A396EmprCod, T01M0113_A602MaqCod
            }
            , new Object[] {
            T01M0114_A396EmprCod, T01M0114_A583IntCod
            }
            , new Object[] {
            T01M0115_A396EmprCod, T01M0115_A506HbaBarCod, T01M0115_A508HbaBarReo, T01M0115_A507HbaBarPar
            }
            , new Object[] {
            T01M0116_A396EmprCod, T01M0116_A503GruOpeCod
            }
            , new Object[] {
            T01M0117_A396EmprCod, T01M0117_A501GruMaqCod
            }
            , new Object[] {
            T01M0118_A396EmprCod, T01M0118_A499GrpFamCod
            }
            , new Object[] {
            T01M0119_A396EmprCod, T01M0119_A497FpgCod
            }
            , new Object[] {
            T01M0120_A396EmprCod, T01M0120_A457FasCod, T01M0120_A463FasNumLin
            }
            , new Object[] {
            T01M0121_A396EmprCod, T01M0121_A430FacCod
            }
            , new Object[] {
            T01M0122_A396EmprCod, T01M0122_A313ContCod
            }
            , new Object[] {
            T01M0123_A396EmprCod, T01M0123_A361DisCod, T01M0123_A376DisObsLin
            }
            , new Object[] {
            T01M0124_A396EmprCod, T01M0124_A361DisCod, T01M0124_A44AlbRecCod
            }
            , new Object[] {
            T01M0125_A396EmprCod, T01M0125_A486ForNumCol
            }
            , new Object[] {
            T01M0126_A396EmprCod, T01M0126_A323DevGenCod
            }
            , new Object[] {
            T01M0127_A396EmprCod, T01M0127_A719PrdNum, T01M0127_A647NumCon
            }
            , new Object[] {
            T01M0128_A396EmprCod, T01M0128_A252CliCod, T01M0128_A287CliPagLin
            }
            , new Object[] {
            T01M0129_A396EmprCod, T01M0129_A252CliCod, T01M0129_A266CliEnvLin
            }
            , new Object[] {
            T01M0130_A396EmprCod, T01M0130_A241CieBarCod, T01M0130_A243CieBarReo, T01M0130_A242CieBarPar
            }
            , new Object[] {
            T01M0131_A396EmprCod, T01M0131_A129BarCod, T01M0131_A132BarCodReo, T01M0131_A130BarCodPar, T01M0131_A200BarPieCod
            }
            , new Object[] {
            T01M0132_A396EmprCod, T01M0132_A129BarCod, T01M0132_A132BarCodReo, T01M0132_A130BarCodPar, T01M0132_A188BarNotLin
            }
            , new Object[] {
            T01M0133_A396EmprCod, T01M0133_A129BarCod, T01M0133_A132BarCodReo, T01M0133_A130BarCodPar, T01M0133_A119BarAgrCod, T01M0133_A124BarAgrReo, T01M0133_A122BarAgrPar
            }
            , new Object[] {
            T01M0134_A396EmprCod, T01M0134_A30AlbProCod
            }
            , new Object[] {
            T01M0135_A396EmprCod, T01M0135_A14AlbComCod, T01M0135_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01M0137_A396EmprCod
            }
            , new Object[] {
            T01M0138_A396EmprCod, T01M0138_A12929PtosID, T01M0138_A12930PtosVIni, T01M0138_n12930PtosVIni, T01M0138_A12931PtosVFin, T01M0138_n12931PtosVFin, T01M0138_A12932PtosValor, T01M0138_n12932PtosValor
            }
            , new Object[] {
            T01M0139_A396EmprCod, T01M0139_A12929PtosID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01M0143_A396EmprCod, T01M0143_A12929PtosID
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TPTOSCAST" ;
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
   private short Z12933PtosUltID ;
   private short O12933PtosUltID ;
   private short Z12929PtosID ;
   private short Z12932PtosValor ;
   private short nRcdDeleted_1773 ;
   private short nRcdExists_1773 ;
   private short nIsMod_1773 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12933PtosUltID ;
   private short nBlankRcdCount1773 ;
   private short RcdFound1773 ;
   private short B12933PtosUltID ;
   private short nBlankRcdUsr1773 ;
   private short s12933PtosUltID ;
   private short A12929PtosID ;
   private short A12932PtosValor ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private short nIsDirty_1773 ;
   private short i12933PtosUltID ;
   private short ZZ12933PtosUltID ;
   private short ZO12933PtosUltID ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPtosUltID_Enabled ;
   private int edtavnRcdDeleted_1773_Enabled ;
   private int edtPtosID_Enabled ;
   private int edtPtosVIni_Enabled ;
   private int edtPtosVFin_Enabled ;
   private int edtPtosValor_Enabled ;
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
   private int defedtPtosID_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPtosUltID_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12930PtosVIni ;
   private java.math.BigDecimal Z12931PtosVFin ;
   private java.math.BigDecimal A12930PtosVIni ;
   private java.math.BigDecimal A12931PtosVFin ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprNom_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPtosUltID_Internalname ;
   private String edtPtosUltID_Jsonclick ;
   private String sMode1773 ;
   private String edtavnRcdDeleted_1773_Internalname ;
   private String edtPtosID_Internalname ;
   private String edtPtosVIni_Internalname ;
   private String edtPtosVFin_Internalname ;
   private String edtPtosValor_Internalname ;
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
   private String sMode27 ;
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
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1773_Jsonclick ;
   private String edtPtosID_Jsonclick ;
   private String edtPtosVIni_Jsonclick ;
   private String edtPtosVFin_Jsonclick ;
   private String edtPtosValor_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12933PtosUltID ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n12930PtosVIni ;
   private boolean n12931PtosVFin ;
   private boolean n12932PtosValor ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01M06_A396EmprCod ;
   private String[] T01M06_A407EmprNom ;
   private boolean[] T01M06_n407EmprNom ;
   private short[] T01M06_A12933PtosUltID ;
   private boolean[] T01M06_n12933PtosUltID ;
   private String[] T01M07_A396EmprCod ;
   private String[] T01M05_A396EmprCod ;
   private String[] T01M05_A407EmprNom ;
   private boolean[] T01M05_n407EmprNom ;
   private short[] T01M05_A12933PtosUltID ;
   private boolean[] T01M05_n12933PtosUltID ;
   private String[] T01M08_A396EmprCod ;
   private String[] T01M09_A396EmprCod ;
   private String[] T01M04_A396EmprCod ;
   private String[] T01M04_A407EmprNom ;
   private boolean[] T01M04_n407EmprNom ;
   private short[] T01M04_A12933PtosUltID ;
   private boolean[] T01M04_n12933PtosUltID ;
   private String[] T01M013_A396EmprCod ;
   private byte[] T01M013_A3331LanBroCod ;
   private String[] T01M014_A396EmprCod ;
   private int[] T01M014_A252CliCod ;
   private boolean[] T01M014_n252CliCod ;
   private java.math.BigDecimal[] T01M014_A3320CliLimKgs ;
   private String[] T01M015_A396EmprCod ;
   private int[] T01M015_A252CliCod ;
   private boolean[] T01M015_n252CliCod ;
   private String[] T01M015_A65ArtCod ;
   private java.math.BigDecimal[] T01M015_A3319ArtCapKgs ;
   private String[] T01M016_A396EmprCod ;
   private short[] T01M016_A3316CodSol ;
   private String[] T01M017_A396EmprCod ;
   private String[] T01M017_A3288CCalCod ;
   private String[] T01M018_A396EmprCod ;
   private int[] T01M018_A3253SolTraCod ;
   private byte[] T01M018_A3269SolTraLin ;
   private String[] T01M019_A396EmprCod ;
   private int[] T01M019_A3235SolSubCod ;
   private byte[] T01M019_A3251SolSubLin ;
   private String[] T01M020_A396EmprCod ;
   private int[] T01M020_A3218SolLuzCod ;
   private byte[] T01M020_A3233SolLuzLin ;
   private String[] T01M021_A396EmprCod ;
   private int[] T01M021_A3196SolFriCod ;
   private byte[] T01M021_A3216SolFriLin ;
   private String[] T01M022_A396EmprCod ;
   private int[] T01M022_A3165SolPilCod ;
   private byte[] T01M022_A3185SolPilLin ;
   private String[] T01M023_A396EmprCod ;
   private String[] T01M023_A3153CodCod ;
   private String[] T01M024_A396EmprCod ;
   private String[] T01M024_A3073RepCod ;
   private String[] T01M025_A396EmprCod ;
   private byte[] T01M025_A3061Codia ;
   private byte[] T01M025_A3062CoMes ;
   private short[] T01M025_A3063CoAny ;
   private String[] T01M026_A396EmprCod ;
   private String[] T01M026_A3047LOParId ;
   private String[] T01M027_A396EmprCod ;
   private String[] T01M027_A3033CCCod ;
   private String[] T01M028_A396EmprCod ;
   private int[] T01M028_A2971SabFacCod ;
   private String[] T01M029_A396EmprCod ;
   private byte[] T01M029_A2954TiDia ;
   private byte[] T01M029_A2955TiMes ;
   private short[] T01M029_A2956TiAny ;
   private String[] T01M030_A396EmprCod ;
   private byte[] T01M030_A2942LzaDia ;
   private byte[] T01M030_A2943LzaMes ;
   private short[] T01M030_A2944LzaAny ;
   private String[] T01M031_A396EmprCod ;
   private int[] T01M031_A252CliCod ;
   private boolean[] T01M031_n252CliCod ;
   private String[] T01M031_A65ArtCod ;
   private byte[] T01M031_A2937RecIntCod ;
   private String[] T01M032_A396EmprCod ;
   private int[] T01M032_A252CliCod ;
   private boolean[] T01M032_n252CliCod ;
   private short[] T01M032_A2933RecTipCon ;
   private String[] T01M033_A396EmprCod ;
   private int[] T01M033_A252CliCod ;
   private boolean[] T01M033_n252CliCod ;
   private String[] T01M033_A65ArtCod ;
   private short[] T01M033_A2931Limite2 ;
   private String[] T01M034_A396EmprCod ;
   private int[] T01M034_A252CliCod ;
   private boolean[] T01M034_n252CliCod ;
   private String[] T01M034_A2927RecProCod ;
   private String[] T01M035_A396EmprCod ;
   private String[] T01M035_A2921HisProTiCo ;
   private short[] T01M035_A2922HisProTiLP ;
   private java.util.Date[] T01M035_A2913HisProTiFe ;
   private short[] T01M035_A2923HisProTiL ;
   private String[] T01M036_A396EmprCod ;
   private int[] T01M036_A252CliCod ;
   private boolean[] T01M036_n252CliCod ;
   private String[] T01M036_A2891HMaForSer ;
   private String[] T01M036_A2892HMaForCNom ;
   private int[] T01M036_A2893HMaForCNum ;
   private byte[] T01M036_A2894HMaTipCCod ;
   private int[] T01M036_A2895HMaForNumC ;
   private short[] T01M036_A2897HMaColLin ;
   private java.util.Date[] T01M036_A2896HMaFec ;
   private short[] T01M036_A2907HmaLin ;
   private String[] T01M037_A396EmprCod ;
   private int[] T01M037_A129BarCod ;
   private boolean[] T01M037_n129BarCod ;
   private byte[] T01M037_A132BarCodReo ;
   private boolean[] T01M037_n132BarCodReo ;
   private String[] T01M037_A130BarCodPar ;
   private boolean[] T01M037_n130BarCodPar ;
   private short[] T01M037_A2872HAnRLinMaq ;
   private byte[] T01M037_A2873HAnRLinPro ;
   private short[] T01M037_A2874HAnRLin ;
   private byte[] T01M037_A2875HAnNumAny ;
   private String[] T01M038_A396EmprCod ;
   private int[] T01M038_A2855CodBota ;
   private short[] T01M038_A2859BotLin ;
   private String[] T01M039_A396EmprCod ;
   private byte[] T01M039_A2853TipBotCod ;
   private String[] T01M040_A396EmprCod ;
   private String[] T01M040_A2817PlaTer ;
   private short[] T01M040_A2818PlaOrd ;
   private String[] T01M041_A396EmprCod ;
   private String[] T01M041_A2809MetTerCod ;
   private int[] T01M041_A129BarCod ;
   private boolean[] T01M041_n129BarCod ;
   private byte[] T01M041_A132BarCodReo ;
   private boolean[] T01M041_n132BarCodReo ;
   private String[] T01M041_A130BarCodPar ;
   private boolean[] T01M041_n130BarCodPar ;
   private String[] T01M042_A396EmprCod ;
   private int[] T01M042_A129BarCod ;
   private boolean[] T01M042_n129BarCod ;
   private byte[] T01M042_A132BarCodReo ;
   private boolean[] T01M042_n132BarCodReo ;
   private String[] T01M042_A130BarCodPar ;
   private boolean[] T01M042_n130BarCodPar ;
   private short[] T01M042_A2808RecLinMAL ;
   private byte[] T01M042_A1377RecNumAny ;
   private String[] T01M042_A719PrdNum ;
   private String[] T01M043_A396EmprCod ;
   private String[] T01M043_A2792TermiCod ;
   private int[] T01M043_A129BarCod ;
   private boolean[] T01M043_n129BarCod ;
   private byte[] T01M043_A132BarCodReo ;
   private boolean[] T01M043_n132BarCodReo ;
   private String[] T01M043_A130BarCodPar ;
   private boolean[] T01M043_n130BarCodPar ;
   private String[] T01M044_A396EmprCod ;
   private long[] T01M044_A30AlbProCod ;
   private int[] T01M044_A129BarCod ;
   private boolean[] T01M044_n129BarCod ;
   private byte[] T01M044_A132BarCodReo ;
   private boolean[] T01M044_n132BarCodReo ;
   private String[] T01M044_A130BarCodPar ;
   private boolean[] T01M044_n130BarCodPar ;
   private short[] T01M044_A2764AlbHdrLin ;
   private String[] T01M045_A396EmprCod ;
   private int[] T01M045_A252CliCod ;
   private boolean[] T01M045_n252CliCod ;
   private String[] T01M045_A65ArtCod ;
   private short[] T01M045_A71ArtEstAny ;
   private String[] T01M045_A2756ArtEstSer ;
   private String[] T01M046_A396EmprCod ;
   private int[] T01M046_A252CliCod ;
   private boolean[] T01M046_n252CliCod ;
   private short[] T01M046_A425EstAny ;
   private String[] T01M046_A2755EstSerFac ;
   private String[] T01M047_A396EmprCod ;
   private short[] T01M047_A2730RecTipCo ;
   private int[] T01M047_A252CliCod ;
   private boolean[] T01M047_n252CliCod ;
   private String[] T01M048_A396EmprCod ;
   private String[] T01M048_A2707NumTexCod ;
   private String[] T01M049_A396EmprCod ;
   private int[] T01M049_A129BarCod ;
   private boolean[] T01M049_n129BarCod ;
   private byte[] T01M049_A132BarCodReo ;
   private boolean[] T01M049_n132BarCodReo ;
   private String[] T01M049_A130BarCodPar ;
   private boolean[] T01M049_n130BarCodPar ;
   private String[] T01M049_A2494BarDosPro ;
   private String[] T01M049_A719PrdNum ;
   private String[] T01M050_A396EmprCod ;
   private int[] T01M050_A658PedCod ;
   private byte[] T01M050_A2501PedObsLin ;
   private String[] T01M051_A396EmprCod ;
   private int[] T01M051_A129BarCod ;
   private boolean[] T01M051_n129BarCod ;
   private byte[] T01M051_A132BarCodReo ;
   private boolean[] T01M051_n132BarCodReo ;
   private String[] T01M051_A130BarCodPar ;
   private boolean[] T01M051_n130BarCodPar ;
   private short[] T01M051_A2457BarObLin ;
   private String[] T01M052_A396EmprCod ;
   private int[] T01M052_A129BarCod ;
   private boolean[] T01M052_n129BarCod ;
   private byte[] T01M052_A132BarCodReo ;
   private boolean[] T01M052_n132BarCodReo ;
   private String[] T01M052_A130BarCodPar ;
   private boolean[] T01M052_n130BarCodPar ;
   private short[] T01M052_A2444BarEnLin ;
   private String[] T01M053_A396EmprCod ;
   private int[] T01M053_A2429TerBarCod ;
   private byte[] T01M053_A2431TerBarReo ;
   private String[] T01M053_A2430TerBarPar ;
   private String[] T01M054_A396EmprCod ;
   private int[] T01M054_A2420OpeAntCod ;
   private String[] T01M055_A396EmprCod ;
   private int[] T01M055_A2406ExhAlbCod ;
   private short[] T01M055_A2416ExhObsLin ;
   private String[] T01M056_A396EmprCod ;
   private int[] T01M056_A2406ExhAlbCod ;
   private int[] T01M056_A129BarCod ;
   private boolean[] T01M056_n129BarCod ;
   private byte[] T01M056_A132BarCodReo ;
   private boolean[] T01M056_n132BarCodReo ;
   private String[] T01M056_A130BarCodPar ;
   private boolean[] T01M056_n130BarCodPar ;
   private String[] T01M057_A396EmprCod ;
   private int[] T01M057_A14AlbComCod ;
   private byte[] T01M057_A2386AlbCObsLin ;
   private String[] T01M058_A396EmprCod ;
   private String[] T01M058_A2382AbcTerCod ;
   private String[] T01M058_A2381AbcSec ;
   private int[] T01M058_A252CliCod ;
   private boolean[] T01M058_n252CliCod ;
   private String[] T01M059_A396EmprCod ;
   private int[] T01M059_A252CliCod ;
   private boolean[] T01M059_n252CliCod ;
   private int[] T01M059_A2308CliDesCod ;
   private String[] T01M060_A396EmprCod ;
   private String[] T01M060_A2268MovParCod ;
   private int[] T01M060_A252CliCod ;
   private boolean[] T01M060_n252CliCod ;
   private short[] T01M060_A2276MovParLin ;
   private String[] T01M061_A396EmprCod ;
   private int[] T01M061_A2253SalExtAlb ;
   private int[] T01M061_A129BarCod ;
   private boolean[] T01M061_n129BarCod ;
   private byte[] T01M061_A132BarCodReo ;
   private boolean[] T01M061_n132BarCodReo ;
   private String[] T01M061_A130BarCodPar ;
   private boolean[] T01M061_n130BarCodPar ;
   private String[] T01M062_A396EmprCod ;
   private short[] T01M062_A2248ManCod ;
   private String[] T01M063_A396EmprCod ;
   private int[] T01M063_A44AlbRecCod ;
   private String[] T01M063_A2159AlbRecPie ;
   private String[] T01M064_A396EmprCod ;
   private int[] T01M064_A44AlbRecCod ;
   private short[] T01M064_A2165HisEmpLin ;
   private String[] T01M065_A396EmprCod ;
   private String[] T01M065_A1794GruLecMaq ;
   private byte[] T01M065_A1795GruOrd ;
   private int[] T01M065_A1791GruBarCod ;
   private byte[] T01M065_A1793GruBarReo ;
   private String[] T01M065_A1792GruBarPar ;
   private String[] T01M066_A396EmprCod ;
   private short[] T01M066_A1664ParFasCod ;
   private String[] T01M067_A396EmprCod ;
   private String[] T01M067_A1514MacProCod ;
   private String[] T01M068_A396EmprCod ;
   private int[] T01M068_A252CliCod ;
   private boolean[] T01M068_n252CliCod ;
   private String[] T01M068_A1504CliProCod ;
   private String[] T01M068_A65ArtCod ;
   private String[] T01M069_A396EmprCod ;
   private String[] T01M069_A1438BarTerCod ;
   private short[] T01M069_A172BarLanLin ;
   private String[] T01M070_A396EmprCod ;
   private int[] T01M070_A1387AlbPrvCod ;
   private String[] T01M071_A396EmprCod ;
   private int[] T01M071_A44AlbRecCod ;
   private byte[] T01M071_A1299AlbRLin ;
   private String[] T01M072_A396EmprCod ;
   private short[] T01M072_A858ZonGeoCod ;
   private String[] T01M073_A396EmprCod ;
   private int[] T01M073_A1348SolColCod ;
   private byte[] T01M073_A1351SolColLin ;
   private String[] T01M074_A396EmprCod ;
   private int[] T01M074_A1333EstDimCod ;
   private byte[] T01M074_A1339EstDimLin ;
   private String[] T01M075_A396EmprCod ;
   private int[] T01M075_A1314EnsLabCod ;
   private String[] T01M076_A396EmprCod ;
   private int[] T01M076_A252CliCod ;
   private boolean[] T01M076_n252CliCod ;
   private String[] T01M076_A1213TalCod ;
   private String[] T01M076_A1293EntMarRef ;
   private String[] T01M077_A396EmprCod ;
   private short[] T01M077_A1206TubCod ;
   private String[] T01M078_A396EmprCod ;
   private int[] T01M078_A252CliCod ;
   private boolean[] T01M078_n252CliCod ;
   private String[] T01M078_A1213TalCod ;
   private short[] T01M078_A1217EntMalLin ;
   private String[] T01M079_A396EmprCod ;
   private int[] T01M079_A1199MacCod ;
   private String[] T01M080_A396EmprCod ;
   private short[] T01M080_A1209DesCod ;
   private String[] T01M081_A396EmprCod ;
   private short[] T01M081_A1211TipEntCod ;
   private String[] T01M082_A396EmprCod ;
   private String[] T01M082_A688PrdComCod ;
   private String[] T01M083_A396EmprCod ;
   private String[] T01M083_A1166LecMaqCod ;
   private String[] T01M084_A396EmprCod ;
   private byte[] T01M084_A1161TurnCod ;
   private String[] T01M085_A396EmprCod ;
   private int[] T01M085_A1146DisDisCod ;
   private int[] T01M085_A1139DisBarCod ;
   private byte[] T01M085_A1140DisBarReo ;
   private String[] T01M085_A1141DisBarPar ;
   private String[] T01M086_A396EmprCod ;
   private short[] T01M086_A996TipCon ;
   private String[] T01M087_A396EmprCod ;
   private short[] T01M087_A970ProceCod ;
   private String[] T01M088_A396EmprCod ;
   private long[] T01M088_A30AlbProCod ;
   private byte[] T01M088_A915AlbPObsLin ;
   private String[] T01M089_A396EmprCod ;
   private String[] T01M089_A910Workstat ;
   private String[] T01M090_A396EmprCod ;
   private int[] T01M090_A129BarCod ;
   private boolean[] T01M090_n129BarCod ;
   private byte[] T01M090_A132BarCodReo ;
   private boolean[] T01M090_n132BarCodReo ;
   private String[] T01M090_A130BarCodPar ;
   private boolean[] T01M090_n130BarCodPar ;
   private byte[] T01M090_A906ObsReoLin ;
   private String[] T01M091_A396EmprCod ;
   private short[] T01M091_A656ParCod ;
   private String[] T01M092_A396EmprCod ;
   private int[] T01M092_A859CumCodCont ;
   private String[] T01M093_A396EmprCod ;
   private byte[] T01M093_A490ForPrdUMe ;
   private String[] T01M094_A396EmprCod ;
   private short[] T01M094_A840TrnCod ;
   private String[] T01M095_A396EmprCod ;
   private byte[] T01M095_A856ValCod ;
   private String[] T01M096_A396EmprCod ;
   private byte[] T01M096_A848UniCod ;
   private String[] T01M097_A396EmprCod ;
   private byte[] T01M097_A687PrdCod ;
   private String[] T01M098_A396EmprCod ;
   private byte[] T01M098_A835TipDtoCod ;
   private String[] T01M099_A396EmprCod ;
   private short[] T01M099_A833TipDefCod ;
   private String[] T01M0100_A396EmprCod ;
   private byte[] T01M0100_A831TipColCod ;
   private String[] T01M0101_A396EmprCod ;
   private short[] T01M0101_A829TipArtCod ;
   private String[] T01M0102_A396EmprCod ;
   private String[] T01M0102_A719PrdNum ;
   private java.util.Date[] T01M0102_A810RecFec ;
   private String[] T01M0103_A396EmprCod ;
   private int[] T01M0103_A252CliCod ;
   private boolean[] T01M0103_n252CliCod ;
   private String[] T01M0103_A65ArtCod ;
   private byte[] T01M0103_A598LinRec ;
   private String[] T01M0104_A396EmprCod ;
   private String[] T01M0104_A764ProForCod ;
   private String[] T01M0105_A396EmprCod ;
   private String[] T01M0105_A758ProCod ;
   private String[] T01M0106_A396EmprCod ;
   private int[] T01M0106_A252CliCod ;
   private boolean[] T01M0106_n252CliCod ;
   private String[] T01M0106_A457FasCod ;
   private String[] T01M0107_A396EmprCod ;
   private String[] T01M0107_A719PrdNum ;
   private short[] T01M0107_A681PrdAny ;
   private String[] T01M0108_A396EmprCod ;
   private String[] T01M0108_A719PrdNum ;
   private String[] T01M0108_A680PrdAltNum ;
   private String[] T01M0109_A396EmprCod ;
   private int[] T01M0109_A658PedCod ;
   private String[] T01M0109_A719PrdNum ;
   private String[] T01M0110_A396EmprCod ;
   private int[] T01M0110_A652OpeCod ;
   private String[] T01M0111_A396EmprCod ;
   private byte[] T01M0111_A629MetCod ;
   private String[] T01M0112_A396EmprCod ;
   private short[] T01M0112_A626MatCod ;
   private String[] T01M0113_A396EmprCod ;
   private String[] T01M0113_A602MaqCod ;
   private String[] T01M0114_A396EmprCod ;
   private byte[] T01M0114_A583IntCod ;
   private String[] T01M0115_A396EmprCod ;
   private int[] T01M0115_A506HbaBarCod ;
   private byte[] T01M0115_A508HbaBarReo ;
   private String[] T01M0115_A507HbaBarPar ;
   private String[] T01M0116_A396EmprCod ;
   private int[] T01M0116_A503GruOpeCod ;
   private String[] T01M0117_A396EmprCod ;
   private String[] T01M0117_A501GruMaqCod ;
   private String[] T01M0118_A396EmprCod ;
   private byte[] T01M0118_A499GrpFamCod ;
   private String[] T01M0119_A396EmprCod ;
   private String[] T01M0119_A497FpgCod ;
   private String[] T01M0120_A396EmprCod ;
   private String[] T01M0120_A457FasCod ;
   private byte[] T01M0120_A463FasNumLin ;
   private String[] T01M0121_A396EmprCod ;
   private int[] T01M0121_A430FacCod ;
   private String[] T01M0122_A396EmprCod ;
   private String[] T01M0122_A313ContCod ;
   private String[] T01M0123_A396EmprCod ;
   private int[] T01M0123_A361DisCod ;
   private byte[] T01M0123_A376DisObsLin ;
   private String[] T01M0124_A396EmprCod ;
   private int[] T01M0124_A361DisCod ;
   private int[] T01M0124_A44AlbRecCod ;
   private String[] T01M0125_A396EmprCod ;
   private int[] T01M0125_A486ForNumCol ;
   private String[] T01M0126_A396EmprCod ;
   private int[] T01M0126_A323DevGenCod ;
   private String[] T01M0127_A396EmprCod ;
   private String[] T01M0127_A719PrdNum ;
   private int[] T01M0127_A647NumCon ;
   private String[] T01M0128_A396EmprCod ;
   private int[] T01M0128_A252CliCod ;
   private boolean[] T01M0128_n252CliCod ;
   private byte[] T01M0128_A287CliPagLin ;
   private String[] T01M0129_A396EmprCod ;
   private int[] T01M0129_A252CliCod ;
   private boolean[] T01M0129_n252CliCod ;
   private byte[] T01M0129_A266CliEnvLin ;
   private String[] T01M0130_A396EmprCod ;
   private int[] T01M0130_A241CieBarCod ;
   private byte[] T01M0130_A243CieBarReo ;
   private String[] T01M0130_A242CieBarPar ;
   private String[] T01M0131_A396EmprCod ;
   private int[] T01M0131_A129BarCod ;
   private boolean[] T01M0131_n129BarCod ;
   private byte[] T01M0131_A132BarCodReo ;
   private boolean[] T01M0131_n132BarCodReo ;
   private String[] T01M0131_A130BarCodPar ;
   private boolean[] T01M0131_n130BarCodPar ;
   private String[] T01M0131_A200BarPieCod ;
   private String[] T01M0132_A396EmprCod ;
   private int[] T01M0132_A129BarCod ;
   private boolean[] T01M0132_n129BarCod ;
   private byte[] T01M0132_A132BarCodReo ;
   private boolean[] T01M0132_n132BarCodReo ;
   private String[] T01M0132_A130BarCodPar ;
   private boolean[] T01M0132_n130BarCodPar ;
   private byte[] T01M0132_A188BarNotLin ;
   private String[] T01M0133_A396EmprCod ;
   private int[] T01M0133_A129BarCod ;
   private boolean[] T01M0133_n129BarCod ;
   private byte[] T01M0133_A132BarCodReo ;
   private boolean[] T01M0133_n132BarCodReo ;
   private String[] T01M0133_A130BarCodPar ;
   private boolean[] T01M0133_n130BarCodPar ;
   private int[] T01M0133_A119BarAgrCod ;
   private byte[] T01M0133_A124BarAgrReo ;
   private String[] T01M0133_A122BarAgrPar ;
   private String[] T01M0134_A396EmprCod ;
   private long[] T01M0134_A30AlbProCod ;
   private String[] T01M0135_A396EmprCod ;
   private int[] T01M0135_A14AlbComCod ;
   private short[] T01M0135_A20AlbComLin ;
   private String[] T01M0137_A396EmprCod ;
   private String[] T01M0138_A396EmprCod ;
   private short[] T01M0138_A12929PtosID ;
   private java.math.BigDecimal[] T01M0138_A12930PtosVIni ;
   private boolean[] T01M0138_n12930PtosVIni ;
   private java.math.BigDecimal[] T01M0138_A12931PtosVFin ;
   private boolean[] T01M0138_n12931PtosVFin ;
   private short[] T01M0138_A12932PtosValor ;
   private boolean[] T01M0138_n12932PtosValor ;
   private String[] T01M0139_A396EmprCod ;
   private short[] T01M0139_A12929PtosID ;
   private String[] T01M03_A396EmprCod ;
   private short[] T01M03_A12929PtosID ;
   private java.math.BigDecimal[] T01M03_A12930PtosVIni ;
   private boolean[] T01M03_n12930PtosVIni ;
   private java.math.BigDecimal[] T01M03_A12931PtosVFin ;
   private boolean[] T01M03_n12931PtosVFin ;
   private short[] T01M03_A12932PtosValor ;
   private boolean[] T01M03_n12932PtosValor ;
   private String[] T01M02_A396EmprCod ;
   private short[] T01M02_A12929PtosID ;
   private java.math.BigDecimal[] T01M02_A12930PtosVIni ;
   private boolean[] T01M02_n12930PtosVIni ;
   private java.math.BigDecimal[] T01M02_A12931PtosVFin ;
   private boolean[] T01M02_n12931PtosVFin ;
   private short[] T01M02_A12932PtosValor ;
   private boolean[] T01M02_n12932PtosValor ;
   private String[] T01M0143_A396EmprCod ;
   private short[] T01M0143_A12929PtosID ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tptoscast__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptoscast__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptoscast__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptoscast__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tptoscast__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01M02", "SELECT EmprCod, PtosID, PtosVIni, PtosVFin, PtosValor FROM TXPPTOSCA WHERE EmprCod = ? AND PtosID = ?  FOR UPDATE OF PtosVIni, PtosVFin, PtosValor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M03", "SELECT EmprCod, PtosID, PtosVIni, PtosVFin, PtosValor FROM TXPPTOSCA WHERE EmprCod = ? AND PtosID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M04", "SELECT EmprCod, EmprNom, PtosUltID FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, PtosUltID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M05", "SELECT EmprCod, EmprNom, PtosUltID FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M06", "SELECT /*+ FIRST_ROWS(1) */ TM1.EmprCod, TM1.EmprNom, TM1.PtosUltID FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M07", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M08", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M09", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M010", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, PtosUltID, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, EmpNumDec, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Colombia, Auc_ULin, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmpItm7, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T01M011", "UPDATE TXPEMPRES SET EmprNom=?, PtosUltID=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T01M012", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T01M013", "SELECT * FROM (SELECT EmprCod, LanBroCod FROM TXPLANBRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M014", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M015", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M016", "SELECT * FROM (SELECT EmprCod, CodSol FROM TXPSOLIDE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M017", "SELECT * FROM (SELECT EmprCod, CCalCod FROM TXPCONCAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M018", "SELECT * FROM (SELECT EmprCod, SolTraCod, SolTraLin FROM TXPLTRASP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M019", "SELECT * FROM (SELECT EmprCod, SolSubCod, SolSubLin FROM TXPLSUBLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M020", "SELECT * FROM (SELECT EmprCod, SolLuzCod, SolLuzLin FROM TXPLSOLLU WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M021", "SELECT * FROM (SELECT EmprCod, SolFriCod, SolFriLin FROM TXPLFRICC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M022", "SELECT * FROM (SELECT EmprCod, SolPilCod, SolPilLin FROM TXPLPILLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M023", "SELECT * FROM (SELECT EmprCod, CodCod FROM TXPCODFAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M024", "SELECT * FROM (SELECT EmprCod, RepCod FROM TXPREPRES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M025", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny FROM TXPCCOSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M026", "SELECT * FROM (SELECT EmprCod, LOParId FROM TXPLOPara WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M027", "SELECT * FROM (SELECT EmprCod, CCCod FROM TXPCCSer WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M028", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M029", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny FROM TXPCKGSTI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M030", "SELECT * FROM (SELECT EmprCod, LzaDia, LzaMes, LzaAny FROM TXPCKGSLA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M031", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M032", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M033", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M034", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M035", "SELECT * FROM (SELECT EmprCod, HisProTiCo, HisProTiLP, HisProTiFe, HisProTiL FROM TXPHISTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M036", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M037", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HAnRLinMaq, HAnRLinPro, HAnRLin, HAnNumAny FROM TXPHISANY WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M038", "SELECT * FROM (SELECT EmprCod, CodBota, BotLin FROM TXPLBOTAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M039", "SELECT * FROM (SELECT EmprCod, TipBotCod FROM TXPTIPBOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M040", "SELECT * FROM (SELECT EmprCod, PlaTer, PlaOrd FROM TXPPLAPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M041", "SELECT * FROM (SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar FROM TXPCMETPI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M042", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M043", "SELECT * FROM (SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar FROM TXPBARTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M044", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M045", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M046", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M047", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M048", "SELECT * FROM (SELECT EmprCod, NumTexCod FROM TXPNUMTEX WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M049", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M050", "SELECT * FROM (SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M051", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarObLin FROM TXPBAROBA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M052", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEnLin FROM TXPBAROBE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M053", "SELECT * FROM (SELECT EmprCod, TerBarCod, TerBarReo, TerBarPar FROM TXPENVTER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M054", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprOpe = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M055", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, ExhObsLin FROM TXPOEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M056", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M057", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M058", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M059", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M060", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod, MovParLin FROM TXPLMOVPD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M061", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M062", "SELECT * FROM (SELECT EmprCod, ManCod FROM TXPMANUFA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M063", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M064", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M065", "SELECT * FROM (SELECT EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar FROM TXPGRULEC WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M066", "SELECT * FROM (SELECT EmprCod, ParFasCod FROM TXPPARFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M067", "SELECT * FROM (SELECT EmprCod, MacProCod FROM TXPCMACPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M068", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M069", "SELECT * FROM (SELECT EmprCod, BarTerCod, BarLanLin FROM TXPBARLAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M070", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M071", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M072", "SELECT * FROM (SELECT EmprCod, ZonGeoCod FROM TXPZONGEO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M073", "SELECT * FROM (SELECT EmprCod, SolColCod, SolColLin FROM TXPLSOLCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M074", "SELECT * FROM (SELECT EmprCod, EstDimCod, EstDimLin FROM TXPLESDIM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M075", "SELECT * FROM (SELECT EmprCod, EnsLabCod FROM TXPCENLAB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M076", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMarRef FROM TXPENTMAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M077", "SELECT * FROM (SELECT EmprCod, TubCod FROM TXPTUBOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M078", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod, EntMalLin FROM TXPLENTMA WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M079", "SELECT * FROM (SELECT EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M080", "SELECT * FROM (SELECT EmprCod, DesCod FROM TXPDESTIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M081", "SELECT * FROM (SELECT EmprCod, TipEntCod FROM TXPENTRAD WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M082", "SELECT * FROM (SELECT EmprCod, PrdComCod FROM TXPCPRDCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M083", "SELECT * FROM (SELECT EmprCod, LecMaqCod FROM TXPLECTOR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M084", "SELECT * FROM (SELECT EmprCod, TurnCod FROM TXPTURNOS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M085", "SELECT * FROM (SELECT EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar FROM TXPDISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M086", "SELECT * FROM (SELECT EmprCod, TipCon FROM TXPTIPCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M087", "SELECT * FROM (SELECT EmprCod, ProceCod FROM TXPPROCED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M088", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M089", "SELECT * FROM (SELECT EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M090", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ObsReoLin FROM TXPOBSREO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M091", "SELECT * FROM (SELECT EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M092", "SELECT * FROM (SELECT EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M093", "SELECT * FROM (SELECT EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M094", "SELECT * FROM (SELECT EmprCod, TrnCod FROM TXPTRANSP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M095", "SELECT * FROM (SELECT EmprCod, ValCod FROM TXPTIPVAL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M096", "SELECT * FROM (SELECT EmprCod, UniCod FROM TXPTIPUNI WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M097", "SELECT * FROM (SELECT EmprCod, PrdCod FROM TXPTIPPRO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M098", "SELECT * FROM (SELECT EmprCod, TipDtoCod FROM TXPTIPDTO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M099", "SELECT * FROM (SELECT EmprCod, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0100", "SELECT * FROM (SELECT EmprCod, TipColCod FROM TXPTIPCOL WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0101", "SELECT * FROM (SELECT EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0102", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0103", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0104", "SELECT * FROM (SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0105", "SELECT * FROM (SELECT EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0106", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0107", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0108", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0109", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0110", "SELECT * FROM (SELECT EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0111", "SELECT * FROM (SELECT EmprCod, MetCod FROM TXPMETPED WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0112", "SELECT * FROM (SELECT EmprCod, MatCod FROM TXPMATICE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0113", "SELECT * FROM (SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0114", "SELECT * FROM (SELECT EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0115", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0116", "SELECT * FROM (SELECT EmprCod, GruOpeCod FROM TXPCGRUOP WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0117", "SELECT * FROM (SELECT EmprCod, GruMaqCod FROM TXPGRUMAQ WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0118", "SELECT * FROM (SELECT EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0119", "SELECT * FROM (SELECT EmprCod, FpgCod FROM TXPFORPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0120", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0121", "SELECT * FROM (SELECT EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0122", "SELECT * FROM (SELECT EmprCod, ContCod FROM TXPEMPLIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0123", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0124", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0125", "SELECT * FROM (SELECT EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0126", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0127", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0128", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0129", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0130", "SELECT * FROM (SELECT EmprCod, CieBarCod, CieBarReo, CieBarPar FROM TXPCIETIN WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0131", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0132", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin FROM TXPBARNOT WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0133", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0134", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0135", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01M0136", "UPDATE TXPEMPRES SET PtosUltID=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T01M0137", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01M0138", "SELECT EmprCod, PtosID, PtosVIni, PtosVFin, PtosValor FROM TXPPTOSCA WHERE EmprCod = ? and PtosID = ? ORDER BY EmprCod, PtosID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01M0139", "SELECT EmprCod, PtosID FROM TXPPTOSCA WHERE EmprCod = ? AND PtosID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01M0140", "INSERT INTO TXPPTOSCA(EmprCod, PtosID, PtosVIni, PtosVFin, PtosValor) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPTOSCA")
         ,new UpdateCursor("T01M0141", "UPDATE TXPPTOSCA SET PtosVIni=?, PtosVFin=?, PtosValor=?  WHERE EmprCod = ? AND PtosID = ?", GX_NOMASK, "TXPPTOSCA")
         ,new UpdateCursor("T01M0142", "DELETE FROM TXPPTOSCA  WHERE EmprCod = ? AND PtosID = ?", GX_NOMASK, "TXPPTOSCA")
         ,new ForEachCursor("T01M0143", "SELECT EmprCod, PtosID FROM TXPPTOSCA WHERE EmprCod = ? ORDER BY EmprCod, PtosID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 34 :
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
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 126 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 127 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 128 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 129 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 130 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 131 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 132 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 133 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 135 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 136 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 137 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 141 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
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
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 105 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 111 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 115 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 116 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 117 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 124 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 126 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 127 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 128 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 129 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 130 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 131 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 132 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 133 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 134 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 135 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 136 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 137 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 138 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               return;
            case 139 :
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
               stmt.setString(4, (String)parms[6], 3);
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               return;
            case 140 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 141 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

