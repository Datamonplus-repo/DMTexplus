package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlpedco_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PIEZAS PEDIDO COMERCIAL", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtErpNped_Internalname ;
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

   public tlpedco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlpedco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlpedco_impl.class ));
   }

   public tlpedco_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TLPEDCO.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N pedido Interno ERP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpNped_Internalname, GXutil.rtrim( A9705ErpNped), GXutil.rtrim( localUtil.format( A9705ErpNped, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpNped_Jsonclick, 0, "", "", "", "", "", 1, edtErpNped_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Linea", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TLPEDCO.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtErpLin_Internalname, GXutil.ltrim( localUtil.ntoc( A8652ErpLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtErpLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8652ErpLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8652ErpLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtErpLin_Jsonclick, 0, "", "", "", "", "", 1, edtErpLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
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
         nBlankRcdCount1569 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1569 = (short)(1) ;
            scanStart1FG1569( ) ;
            while ( RcdFound1569 != 0 )
            {
               init_level_properties1569( ) ;
               getByPrimaryKey1FG1569( ) ;
               addRow1FG1569( ) ;
               scanNext1FG1569( ) ;
            }
            scanEnd1FG1569( ) ;
            nBlankRcdCount1569 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1FG1569( ) ;
         standaloneModal1FG1569( ) ;
         sMode1569 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow1FG1569( ) ;
            edtavnRcdDeleted_1569_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1569_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1569_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1569_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtErpCPza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPCPZA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtErpCPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCPza_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtErpCP2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPCP2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtErpCP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCP2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtErpKgsP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPKGSP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtErpKgsP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpKgsP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtErpMtsP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPMTSP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtErpMtsP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpMtsP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1569 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1FG1569( ) ;
            }
            sendRow1FG1569( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1569 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1569 = (short)(5) ;
         nRcdExists_1569 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1FG1569( ) ;
            while ( RcdFound1569 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401569( ) ;
               init_level_properties1569( ) ;
               standaloneNotModal1FG1569( ) ;
               getByPrimaryKey1FG1569( ) ;
               standaloneModal1FG1569( ) ;
               addRow1FG1569( ) ;
               scanNext1FG1569( ) ;
            }
            scanEnd1FG1569( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1569 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401569( ) ;
      initAll1FG1569( ) ;
      init_level_properties1569( ) ;
      nRcdExists_1569 = (short)(0) ;
      nIsMod_1569 = (short)(0) ;
      nRcdDeleted_1569 = (short)(0) ;
      nBlankRcdCount1569 = (short)(nBlankRcdUsr1569+nBlankRcdCount1569) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1569 > 0 )
      {
         standaloneNotModal1FG1569( ) ;
         standaloneModal1FG1569( ) ;
         addRow1FG1569( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtErpCPza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1569 = (short)(nBlankRcdCount1569-1) ;
      }
      Gx_mode = sMode1569 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TLPEDCO.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TLPEDCO.htm");
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
      e111FG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9705ErpNped = httpContext.cgiGet( "Z9705ErpNped") ;
            Z8652ErpLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z8652ErpLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9705ErpNped = httpContext.cgiGet( edtErpNped_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtErpLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtErpLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ERPLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtErpLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8652ErpLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            }
            else
            {
               A8652ErpLin = (short)(localUtil.ctol( httpContext.cgiGet( edtErpLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            }
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
               A9705ErpNped = httpContext.GetPar( "ErpNped") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
               A8652ErpLin = (short)(GXutil.lval( httpContext.GetPar( "ErpLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
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
                        e111FG2 ();
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
            initAll1FG1568( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1569_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1569_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes1FG1568( ) ;
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

   public void confirm_1FG0( )
   {
      beforeValidate1FG1568( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1FG1568( ) ;
         }
         else
         {
            checkExtendedTable1FG1568( ) ;
            if ( AnyError == 0 )
            {
               zm1FG1568( 2) ;
            }
            closeExtendedTableCursors1FG1568( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1568 = Gx_mode ;
         confirm_1FG1569( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1568 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1568 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1FG0( ) ;
      }
   }

   public void confirm_1FG1569( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1FG1569( ) ;
         if ( ( nRcdExists_1569 != 0 ) || ( nIsMod_1569 != 0 ) )
         {
            getKey1FG1569( ) ;
            if ( ( nRcdExists_1569 == 0 ) && ( nRcdDeleted_1569 == 0 ) )
            {
               if ( RcdFound1569 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1FG1569( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1FG1569( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1FG1569( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ERPCPZA_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtErpCPza_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1569 != 0 )
               {
                  if ( nRcdDeleted_1569 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1FG1569( ) ;
                     load1FG1569( ) ;
                     beforeValidate1FG1569( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1FG1569( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1569 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1FG1569( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1FG1569( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1FG1569( ) ;
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
                  if ( nRcdDeleted_1569 == 0 )
                  {
                     GXCCtl = "ERPCPZA_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtErpCPza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1569_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtErpCPza_Internalname, GXutil.rtrim( A6219ErpCPza)) ;
         httpContext.changePostValue( edtErpCP2_Internalname, GXutil.rtrim( A6218ErpCP2)) ;
         httpContext.changePostValue( edtErpKgsP_Internalname, GXutil.ltrim( localUtil.ntoc( A6171ErpKgsP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtErpMtsP_Internalname, GXutil.rtrim( A6009ErpMtsP)) ;
         httpContext.changePostValue( "ZT_"+"Z6219ErpCPza_"+sGXsfl_40_idx, GXutil.rtrim( Z6219ErpCPza)) ;
         httpContext.changePostValue( "ZT_"+"Z6218ErpCP2_"+sGXsfl_40_idx, GXutil.rtrim( Z6218ErpCP2)) ;
         httpContext.changePostValue( "ZT_"+"Z6171ErpKgsP_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6171ErpKgsP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6009ErpMtsP_"+sGXsfl_40_idx, GXutil.rtrim( Z6009ErpMtsP)) ;
         httpContext.changePostValue( "nRcdDeleted_1569_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1569_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1569_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1569 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1569_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1569_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPCPZA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCPza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPCP2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCP2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPKGSP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpKgsP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPMTSP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpMtsP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1FG0( )
   {
   }

   public void e111FG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tlpedco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tlpedco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tlpedco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlpedco_impl.this.A396EmprCod = GXv_char2[0] ;
      tlpedco_impl.this.AV11EmprNom = GXv_char3[0] ;
      tlpedco_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1FG1568( int GX_JID )
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
         Z9705ErpNped = A9705ErpNped ;
         Z8652ErpLin = A8652ErpLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TLPEDCO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01FG6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FG6_A407EmprNom[0] ;
      n407EmprNom = T01FG6_n407EmprNom[0] ;
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

   public void load1FG1568( )
   {
      /* Using cursor T01FG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1568 = (short)(1) ;
         A407EmprNom = T01FG7_A407EmprNom[0] ;
         n407EmprNom = T01FG7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1FG1568( -1) ;
      }
      pr_default.close(5);
      onLoadActions1FG1568( ) ;
   }

   public void onLoadActions1FG1568( )
   {
   }

   public void checkExtendedTable1FG1568( )
   {
      nIsDirty_1568 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1FG1568( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1FG1568( )
   {
      /* Using cursor T01FG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1568 = (short)(1) ;
      }
      else
      {
         RcdFound1568 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01FG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01FG5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FG1568( 1) ;
         RcdFound1568 = (short)(1) ;
         A9705ErpNped = T01FG5_A9705ErpNped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = T01FG5_A8652ErpLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z9705ErpNped = A9705ErpNped ;
         Z8652ErpLin = A8652ErpLin ;
         sMode1568 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1FG1568( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1568 = (short)(0) ;
            initializeNonKey1FG1568( ) ;
         }
         Gx_mode = sMode1568 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1568 = (short)(0) ;
         initializeNonKey1FG1568( ) ;
         sMode1568 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1568 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1FG1568( ) ;
      if ( RcdFound1568 == 0 )
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
      RcdFound1568 = (short)(0) ;
      /* Using cursor T01FG9 */
      pr_default.execute(7, new Object[] {A9705ErpNped, A9705ErpNped, Short.valueOf(A8652ErpLin), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01FG9_A9705ErpNped[0], A9705ErpNped) < 0 ) || ( GXutil.strcmp(T01FG9_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FG9_A8652ErpLin[0] < A8652ErpLin ) ) && ( GXutil.strcmp(T01FG9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01FG9_A9705ErpNped[0], A9705ErpNped) > 0 ) || ( GXutil.strcmp(T01FG9_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FG9_A8652ErpLin[0] > A8652ErpLin ) ) && ( GXutil.strcmp(T01FG9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9705ErpNped = T01FG9_A9705ErpNped[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            A8652ErpLin = T01FG9_A8652ErpLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            RcdFound1568 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1568 = (short)(0) ;
      /* Using cursor T01FG10 */
      pr_default.execute(8, new Object[] {A9705ErpNped, A9705ErpNped, Short.valueOf(A8652ErpLin), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01FG10_A9705ErpNped[0], A9705ErpNped) > 0 ) || ( GXutil.strcmp(T01FG10_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FG10_A8652ErpLin[0] > A8652ErpLin ) ) && ( GXutil.strcmp(T01FG10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01FG10_A9705ErpNped[0], A9705ErpNped) < 0 ) || ( GXutil.strcmp(T01FG10_A9705ErpNped[0], A9705ErpNped) == 0 ) && ( T01FG10_A8652ErpLin[0] < A8652ErpLin ) ) && ( GXutil.strcmp(T01FG10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9705ErpNped = T01FG10_A9705ErpNped[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            A8652ErpLin = T01FG10_A8652ErpLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
            RcdFound1568 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1FG1568( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtErpNped_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1FG1568( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1568 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
            {
               A9705ErpNped = Z9705ErpNped ;
               httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
               A8652ErpLin = Z8652ErpLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtErpNped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1FG1568( ) ;
               GX_FocusControl = edtErpNped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtErpNped_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1FG1568( ) ;
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
                  GX_FocusControl = edtErpNped_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1FG1568( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
      {
         A9705ErpNped = Z9705ErpNped ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = Z8652ErpLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtErpNped_Internalname ;
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
      getKey1FG1568( ) ;
      if ( RcdFound1568 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
         {
            A9705ErpNped = Z9705ErpNped ;
            httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
            A8652ErpLin = Z8652ErpLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A9705ErpNped, Z9705ErpNped) != 0 ) || ( A8652ErpLin != Z8652ErpLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tlpedco");
   }

   public void insert_check( )
   {
      confirm_1FG0( ) ;
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
      if ( RcdFound1568 == 0 )
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
      scanStart1FG1568( ) ;
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FG1568( ) ;
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
      if ( RcdFound1568 == 0 )
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
      if ( RcdFound1568 == 0 )
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
      scanStart1FG1568( ) ;
      if ( RcdFound1568 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1568 != 0 )
         {
            scanNext1FG1568( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1FG1568( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1FG1568( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPEDCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FG1568( )
   {
      beforeValidate1FG1568( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FG1568( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FG1568( 0) ;
         checkOptimisticConcurrency1FG1568( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FG1568( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FG1568( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FG11 */
                  pr_default.execute(9, new Object[] {A9705ErpNped, Short.valueOf(A8652ErpLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDCO");
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
                        processLevel1FG1568( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1FG0( ) ;
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
            load1FG1568( ) ;
         }
         endLevel1FG1568( ) ;
      }
      closeExtendedTableCursors1FG1568( ) ;
   }

   public void update1FG1568( )
   {
      beforeValidate1FG1568( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FG1568( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FG1568( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FG1568( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1FG1568( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCPEDCO */
                  deferredUpdate1FG1568( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1FG1568( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1FG0( ) ;
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
         endLevel1FG1568( ) ;
      }
      closeExtendedTableCursors1FG1568( ) ;
   }

   public void deferredUpdate1FG1568( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FG1568( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FG1568( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FG1568( ) ;
         afterConfirm1FG1568( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FG1568( ) ;
            if ( AnyError == 0 )
            {
               scanStart1FG1569( ) ;
               while ( RcdFound1569 != 0 )
               {
                  getByPrimaryKey1FG1569( ) ;
                  delete1FG1569( ) ;
                  scanNext1FG1569( ) ;
               }
               scanEnd1FG1569( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FG12 */
                  pr_default.execute(10, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDCO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1568 == 0 )
                        {
                           initAll1FG1568( ) ;
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
                        resetCaption1FG0( ) ;
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
      sMode1568 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FG1568( ) ;
      Gx_mode = sMode1568 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FG1568( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1FG1569( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow1FG1569( ) ;
         if ( ( nRcdExists_1569 != 0 ) || ( nIsMod_1569 != 0 ) )
         {
            standaloneNotModal1FG1569( ) ;
            getKey1FG1569( ) ;
            if ( ( nRcdExists_1569 == 0 ) && ( nRcdDeleted_1569 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1FG1569( ) ;
            }
            else
            {
               if ( RcdFound1569 != 0 )
               {
                  if ( ( nRcdDeleted_1569 != 0 ) && ( nRcdExists_1569 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1FG1569( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1569 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1FG1569( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1569 == 0 )
                  {
                     GXCCtl = "ERPCPZA_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtErpCPza_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1569_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtErpCPza_Internalname, GXutil.rtrim( A6219ErpCPza)) ;
         httpContext.changePostValue( edtErpCP2_Internalname, GXutil.rtrim( A6218ErpCP2)) ;
         httpContext.changePostValue( edtErpKgsP_Internalname, GXutil.ltrim( localUtil.ntoc( A6171ErpKgsP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtErpMtsP_Internalname, GXutil.rtrim( A6009ErpMtsP)) ;
         httpContext.changePostValue( "ZT_"+"Z6219ErpCPza_"+sGXsfl_40_idx, GXutil.rtrim( Z6219ErpCPza)) ;
         httpContext.changePostValue( "ZT_"+"Z6218ErpCP2_"+sGXsfl_40_idx, GXutil.rtrim( Z6218ErpCP2)) ;
         httpContext.changePostValue( "ZT_"+"Z6171ErpKgsP_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z6171ErpKgsP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6009ErpMtsP_"+sGXsfl_40_idx, GXutil.rtrim( Z6009ErpMtsP)) ;
         httpContext.changePostValue( "nRcdDeleted_1569_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1569_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1569_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1569 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1569_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1569_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPCPZA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCPza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPCP2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCP2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPKGSP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpKgsP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ERPMTSP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpMtsP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1FG1569( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1569 = (short)(0) ;
      nIsMod_1569 = (short)(0) ;
      nRcdDeleted_1569 = (short)(0) ;
   }

   public void processLevel1FG1568( )
   {
      /* Save parent mode. */
      sMode1568 = Gx_mode ;
      processNestedLevel1FG1569( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1568 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1FG1568( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1FG1568( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tlpedco");
         if ( AnyError == 0 )
         {
            confirmValues1FG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tlpedco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1FG1568( )
   {
      /* Scan By routine */
      /* Using cursor T01FG13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      RcdFound1568 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1568 = (short)(1) ;
         A9705ErpNped = T01FG13_A9705ErpNped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = T01FG13_A8652ErpLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FG1568( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1568 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1568 = (short)(1) ;
         A9705ErpNped = T01FG13_A9705ErpNped[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
         A8652ErpLin = T01FG13_A8652ErpLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
      }
   }

   public void scanEnd1FG1568( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1FG1568( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FG1568( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FG1568( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FG1568( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FG1568( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FG1568( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FG1568( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtErpNped_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpNped_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpNped_Enabled), 5, 0), true);
      edtErpLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpLin_Enabled), 5, 0), true);
   }

   public void zm1FG1569( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6218ErpCP2 = T01FG3_A6218ErpCP2[0] ;
            Z6171ErpKgsP = T01FG3_A6171ErpKgsP[0] ;
            Z6009ErpMtsP = T01FG3_A6009ErpMtsP[0] ;
         }
         else
         {
            Z6218ErpCP2 = A6218ErpCP2 ;
            Z6171ErpKgsP = A6171ErpKgsP ;
            Z6009ErpMtsP = A6009ErpMtsP ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z9705ErpNped = A9705ErpNped ;
         Z8652ErpLin = A8652ErpLin ;
         Z6219ErpCPza = A6219ErpCPza ;
         Z6218ErpCP2 = A6218ErpCP2 ;
         Z6171ErpKgsP = A6171ErpKgsP ;
         Z6009ErpMtsP = A6009ErpMtsP ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1FG1569( )
   {
   }

   public void standaloneModal1FG1569( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtErpCPza_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtErpCPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCPza_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtErpCPza_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtErpCPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCPza_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load1FG1569( )
   {
      /* Using cursor T01FG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1569 = (short)(1) ;
         A6218ErpCP2 = T01FG14_A6218ErpCP2[0] ;
         n6218ErpCP2 = T01FG14_n6218ErpCP2[0] ;
         A6171ErpKgsP = T01FG14_A6171ErpKgsP[0] ;
         n6171ErpKgsP = T01FG14_n6171ErpKgsP[0] ;
         A6009ErpMtsP = T01FG14_A6009ErpMtsP[0] ;
         n6009ErpMtsP = T01FG14_n6009ErpMtsP[0] ;
         zm1FG1569( -3) ;
      }
      pr_default.close(12);
      onLoadActions1FG1569( ) ;
   }

   public void onLoadActions1FG1569( )
   {
   }

   public void checkExtendedTable1FG1569( )
   {
      nIsDirty_1569 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1FG1569( ) ;
   }

   public void closeExtendedTableCursors1FG1569( )
   {
   }

   public void enableDisable1FG1569( )
   {
   }

   public void getKey1FG1569( )
   {
      /* Using cursor T01FG15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1569 = (short)(1) ;
      }
      else
      {
         RcdFound1569 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey1FG1569( )
   {
      /* Using cursor T01FG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01FG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1FG1569( 3) ;
         RcdFound1569 = (short)(1) ;
         initializeNonKey1FG1569( ) ;
         A6219ErpCPza = T01FG3_A6219ErpCPza[0] ;
         A6218ErpCP2 = T01FG3_A6218ErpCP2[0] ;
         n6218ErpCP2 = T01FG3_n6218ErpCP2[0] ;
         A6171ErpKgsP = T01FG3_A6171ErpKgsP[0] ;
         n6171ErpKgsP = T01FG3_n6171ErpKgsP[0] ;
         A6009ErpMtsP = T01FG3_A6009ErpMtsP[0] ;
         n6009ErpMtsP = T01FG3_n6009ErpMtsP[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9705ErpNped = A9705ErpNped ;
         Z8652ErpLin = A8652ErpLin ;
         Z6219ErpCPza = A6219ErpCPza ;
         sMode1569 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FG1569( ) ;
         load1FG1569( ) ;
         Gx_mode = sMode1569 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1569 = (short)(0) ;
         initializeNonKey1FG1569( ) ;
         sMode1569 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1FG1569( ) ;
         Gx_mode = sMode1569 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1FG1569( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1FG1569( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01FG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6218ErpCP2, T01FG2_A6218ErpCP2[0]) != 0 ) || ( DecimalUtil.compareTo(Z6171ErpKgsP, T01FG2_A6171ErpKgsP[0]) != 0 ) || ( GXutil.strcmp(Z6009ErpMtsP, T01FG2_A6009ErpMtsP[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6218ErpCP2, T01FG2_A6218ErpCP2[0]) != 0 )
            {
               GXutil.writeLogln("tlpedco:[seudo value changed for attri]"+"ErpCP2");
               GXutil.writeLogRaw("Old: ",Z6218ErpCP2);
               GXutil.writeLogRaw("Current: ",T01FG2_A6218ErpCP2[0]);
            }
            if ( DecimalUtil.compareTo(Z6171ErpKgsP, T01FG2_A6171ErpKgsP[0]) != 0 )
            {
               GXutil.writeLogln("tlpedco:[seudo value changed for attri]"+"ErpKgsP");
               GXutil.writeLogRaw("Old: ",Z6171ErpKgsP);
               GXutil.writeLogRaw("Current: ",T01FG2_A6171ErpKgsP[0]);
            }
            if ( GXutil.strcmp(Z6009ErpMtsP, T01FG2_A6009ErpMtsP[0]) != 0 )
            {
               GXutil.writeLogln("tlpedco:[seudo value changed for attri]"+"ErpMtsP");
               GXutil.writeLogRaw("Old: ",Z6009ErpMtsP);
               GXutil.writeLogRaw("Current: ",T01FG2_A6009ErpMtsP[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPEDCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1FG1569( )
   {
      beforeValidate1FG1569( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FG1569( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1FG1569( 0) ;
         checkOptimisticConcurrency1FG1569( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1FG1569( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1FG1569( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01FG16 */
                  pr_default.execute(14, new Object[] {A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza, Boolean.valueOf(n6218ErpCP2), A6218ErpCP2, Boolean.valueOf(n6171ErpKgsP), A6171ErpKgsP, Boolean.valueOf(n6009ErpMtsP), A6009ErpMtsP, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDCO");
                  if ( (pr_default.getStatus(14) == 1) )
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
            load1FG1569( ) ;
         }
         endLevel1FG1569( ) ;
      }
      closeExtendedTableCursors1FG1569( ) ;
   }

   public void update1FG1569( )
   {
      beforeValidate1FG1569( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1FG1569( ) ;
      }
      if ( ( nIsMod_1569 != 0 ) || ( nIsDirty_1569 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1FG1569( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1FG1569( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1FG1569( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01FG17 */
                     pr_default.execute(15, new Object[] {Boolean.valueOf(n6218ErpCP2), A6218ErpCP2, Boolean.valueOf(n6171ErpKgsP), A6171ErpKgsP, Boolean.valueOf(n6009ErpMtsP), A6009ErpMtsP, A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDCO");
                     if ( (pr_default.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1FG1569( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1FG1569( ) ;
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
            endLevel1FG1569( ) ;
         }
      }
      closeExtendedTableCursors1FG1569( ) ;
   }

   public void deferredUpdate1FG1569( )
   {
   }

   public void delete1FG1569( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1FG1569( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1FG1569( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1FG1569( ) ;
         afterConfirm1FG1569( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1FG1569( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01FG18 */
               pr_default.execute(16, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin), A6219ErpCPza});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDCO");
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
      sMode1569 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1FG1569( ) ;
      Gx_mode = sMode1569 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1FG1569( )
   {
      standaloneModal1FG1569( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1FG1569( )
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

   public void scanStart1FG1569( )
   {
      /* Scan By routine */
      /* Using cursor T01FG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A9705ErpNped, Short.valueOf(A8652ErpLin)});
      RcdFound1569 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1569 = (short)(1) ;
         A6219ErpCPza = T01FG19_A6219ErpCPza[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1FG1569( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1569 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1569 = (short)(1) ;
         A6219ErpCPza = T01FG19_A6219ErpCPza[0] ;
      }
   }

   public void scanEnd1FG1569( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1FG1569( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1FG1569( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1FG1569( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1FG1569( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1FG1569( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1FG1569( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1FG1569( )
   {
      edtErpCPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpCPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCPza_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtErpCP2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpCP2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCP2_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtErpKgsP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpKgsP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpKgsP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtErpMtsP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpMtsP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpMtsP_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes1FG1569( )
   {
   }

   public void send_integrity_lvl_hashes1FG1568( )
   {
   }

   public void subsflControlProps_401569( )
   {
      edtavnRcdDeleted_1569_Internalname = "vNRCDDELETED_1569_"+sGXsfl_40_idx ;
      edtErpCPza_Internalname = "ERPCPZA_"+sGXsfl_40_idx ;
      edtErpCP2_Internalname = "ERPCP2_"+sGXsfl_40_idx ;
      edtErpKgsP_Internalname = "ERPKGSP_"+sGXsfl_40_idx ;
      edtErpMtsP_Internalname = "ERPMTSP_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401569( )
   {
      edtavnRcdDeleted_1569_Internalname = "vNRCDDELETED_1569_"+sGXsfl_40_fel_idx ;
      edtErpCPza_Internalname = "ERPCPZA_"+sGXsfl_40_fel_idx ;
      edtErpCP2_Internalname = "ERPCP2_"+sGXsfl_40_fel_idx ;
      edtErpKgsP_Internalname = "ERPKGSP_"+sGXsfl_40_fel_idx ;
      edtErpMtsP_Internalname = "ERPMTSP_"+sGXsfl_40_fel_idx ;
   }

   public void addRow1FG1569( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401569( ) ;
      sendRow1FG1569( ) ;
   }

   public void sendRow1FG1569( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1569_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1569_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1569_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1569), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1569), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1569_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1569_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1569_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErpCPza_Internalname,GXutil.rtrim( A6219ErpCPza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtErpCPza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtErpCPza_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1569_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErpCP2_Internalname,GXutil.rtrim( A6218ErpCP2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtErpCP2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtErpCP2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1569_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErpKgsP_Internalname,GXutil.ltrim( localUtil.ntoc( A6171ErpKgsP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtErpKgsP_Enabled!=0) ? localUtil.format( A6171ErpKgsP, "ZZZZZ9.99") : localUtil.format( A6171ErpKgsP, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtErpKgsP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtErpKgsP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1569_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErpMtsP_Internalname,GXutil.rtrim( A6009ErpMtsP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtErpMtsP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtErpMtsP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1FG1569( ) ;
      GXCCtl = "Z6219ErpCPza_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6219ErpCPza));
      GXCCtl = "Z6218ErpCP2_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6218ErpCP2));
      GXCCtl = "Z6171ErpKgsP_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6171ErpKgsP, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6009ErpMtsP_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6009ErpMtsP));
      GXCCtl = "nRcdDeleted_1569_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1569_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1569_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1569, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1569_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1569_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ERPCPZA_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCPza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ERPCP2_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCP2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ERPKGSP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpKgsP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ERPMTSP_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtErpMtsP_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1FG1569( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401569( ) ;
      edtavnRcdDeleted_1569_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1569_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtErpCPza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPCPZA_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtErpCP2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPCP2_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtErpKgsP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPKGSP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtErpMtsP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ERPMTSP_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1569_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1569_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1569");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1569_Internalname ;
         wbErr = true ;
         nRcdDeleted_1569 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1569 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1569_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A6219ErpCPza = httpContext.cgiGet( edtErpCPza_Internalname) ;
      A6218ErpCP2 = httpContext.cgiGet( edtErpCP2_Internalname) ;
      n6218ErpCP2 = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtErpKgsP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtErpKgsP_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ERPKGSP_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtErpKgsP_Internalname ;
         wbErr = true ;
         A6171ErpKgsP = DecimalUtil.ZERO ;
         n6171ErpKgsP = false ;
      }
      else
      {
         A6171ErpKgsP = localUtil.ctond( httpContext.cgiGet( edtErpKgsP_Internalname)) ;
         n6171ErpKgsP = false ;
      }
      A6009ErpMtsP = httpContext.cgiGet( edtErpMtsP_Internalname) ;
      n6009ErpMtsP = false ;
      GXCCtl = "Z6219ErpCPza_" + sGXsfl_40_idx ;
      Z6219ErpCPza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6218ErpCP2_" + sGXsfl_40_idx ;
      Z6218ErpCP2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6171ErpKgsP_" + sGXsfl_40_idx ;
      Z6171ErpKgsP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6009ErpMtsP_" + sGXsfl_40_idx ;
      Z6009ErpMtsP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1569_" + sGXsfl_40_idx ;
      nRcdDeleted_1569 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1569_" + sGXsfl_40_idx ;
      nRcdExists_1569 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1569_" + sGXsfl_40_idx ;
      nIsMod_1569 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtErpCPza_Enabled = edtErpCPza_Enabled ;
   }

   public void confirmValues1FG0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401569( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401569( ) ;
         httpContext.changePostValue( "Z6219ErpCPza_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6219ErpCPza_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6219ErpCPza_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6218ErpCP2_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6218ErpCP2_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6218ErpCP2_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6171ErpKgsP_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6171ErpKgsP_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6171ErpKgsP_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z6009ErpMtsP_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z6009ErpMtsP_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6009ErpMtsP_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tlpedco", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9705ErpNped", GXutil.rtrim( Z9705ErpNped));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8652ErpLin", GXutil.ltrim( localUtil.ntoc( Z8652ErpLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.tlpedco", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TLPEDCO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PIEZAS PEDIDO COMERCIAL", "") ;
   }

   public void initializeNonKey1FG1568( )
   {
   }

   public void initAll1FG1568( )
   {
      A9705ErpNped = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9705ErpNped", A9705ErpNped);
      A8652ErpLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8652ErpLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8652ErpLin), 4, 0));
      initializeNonKey1FG1568( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1FG1569( )
   {
      A6218ErpCP2 = "" ;
      n6218ErpCP2 = false ;
      A6171ErpKgsP = DecimalUtil.ZERO ;
      n6171ErpKgsP = false ;
      A6009ErpMtsP = "" ;
      n6009ErpMtsP = false ;
      Z6218ErpCP2 = "" ;
      Z6171ErpKgsP = DecimalUtil.ZERO ;
      Z6009ErpMtsP = "" ;
   }

   public void initAll1FG1569( )
   {
      A6219ErpCPza = "" ;
      initializeNonKey1FG1569( ) ;
   }

   public void standaloneModalInsert1FG1569( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241571738", true, true);
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
      httpContext.AddJavascriptSource("tlpedco.js", "?20268241571738", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1569( )
   {
      edtErpCPza_Enabled = defedtErpCPza_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtErpCPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtErpCPza_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1569, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1569_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6219ErpCPza));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCPza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6218ErpCP2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtErpCP2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6171ErpKgsP, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtErpKgsP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6009ErpMtsP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtErpMtsP_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtErpNped_Internalname = "ERPNPED" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtErpLin_Internalname = "ERPLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1569_Internalname = "vNRCDDELETED_1569" ;
      edtErpCPza_Internalname = "ERPCPZA" ;
      edtErpCP2_Internalname = "ERPCP2" ;
      edtErpKgsP_Internalname = "ERPKGSP" ;
      edtErpMtsP_Internalname = "ERPMTSP" ;
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
      Form.setCaption( httpContext.getMessage( "PIEZAS PEDIDO COMERCIAL", "") );
      edtErpMtsP_Jsonclick = "" ;
      edtErpKgsP_Jsonclick = "" ;
      edtErpCP2_Jsonclick = "" ;
      edtErpCPza_Jsonclick = "" ;
      edtavnRcdDeleted_1569_Jsonclick = "" ;
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
      edtErpMtsP_Enabled = 1 ;
      edtErpKgsP_Enabled = 1 ;
      edtErpCP2_Enabled = 1 ;
      edtErpCPza_Enabled = 1 ;
      edtavnRcdDeleted_1569_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtErpLin_Jsonclick = "" ;
      edtErpLin_Backcolor = (int)(0xFFFFFF) ;
      edtErpLin_Enabled = 1 ;
      edtErpNped_Jsonclick = "" ;
      edtErpNped_Backcolor = (int)(0xFFFFFF) ;
      edtErpNped_Enabled = 1 ;
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
      subsflControlProps_401569( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1FG1569( ) ;
         standaloneModal1FG1569( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1FG1569( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401569( ) ;
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
      /* Using cursor T01FG20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01FG20_A407EmprNom[0] ;
      n407EmprNom = T01FG20_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(18);
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

   public void valid_Erplin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9705ErpNped", GXutil.rtrim( Z9705ErpNped));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8652ErpLin", GXutil.ltrim( localUtil.ntoc( Z8652ErpLin, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ERPNPED","{handler:'valid_Erpnped',iparms:[]");
      setEventMetadata("VALID_ERPNPED",",oparms:[]}");
      setEventMetadata("VALID_ERPLIN","{handler:'valid_Erplin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9705ErpNped',fld:'ERPNPED',pic:''},{av:'A8652ErpLin',fld:'ERPLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ERPLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9705ErpNped'},{av:'Z8652ErpLin'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ERPCPZA","{handler:'valid_Erpcpza',iparms:[]");
      setEventMetadata("VALID_ERPCPZA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Erpmtsp',iparms:[]");
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
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z9705ErpNped = "" ;
      Z6219ErpCPza = "" ;
      Z6218ErpCP2 = "" ;
      Z6171ErpKgsP = DecimalUtil.ZERO ;
      Z6009ErpMtsP = "" ;
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
      A9705ErpNped = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1569 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1568 = "" ;
      GXCCtl = "" ;
      A6219ErpCPza = "" ;
      A6218ErpCP2 = "" ;
      A6171ErpKgsP = DecimalUtil.ZERO ;
      A6009ErpMtsP = "" ;
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
      T01FG6_A407EmprNom = new String[] {""} ;
      T01FG6_n407EmprNom = new boolean[] {false} ;
      T01FG7_A9705ErpNped = new String[] {""} ;
      T01FG7_A8652ErpLin = new short[1] ;
      T01FG7_A407EmprNom = new String[] {""} ;
      T01FG7_n407EmprNom = new boolean[] {false} ;
      T01FG7_A396EmprCod = new String[] {""} ;
      T01FG8_A396EmprCod = new String[] {""} ;
      T01FG8_A9705ErpNped = new String[] {""} ;
      T01FG8_A8652ErpLin = new short[1] ;
      T01FG5_A9705ErpNped = new String[] {""} ;
      T01FG5_A8652ErpLin = new short[1] ;
      T01FG5_A396EmprCod = new String[] {""} ;
      T01FG9_A396EmprCod = new String[] {""} ;
      T01FG9_A9705ErpNped = new String[] {""} ;
      T01FG9_A8652ErpLin = new short[1] ;
      T01FG10_A396EmprCod = new String[] {""} ;
      T01FG10_A9705ErpNped = new String[] {""} ;
      T01FG10_A8652ErpLin = new short[1] ;
      T01FG4_A9705ErpNped = new String[] {""} ;
      T01FG4_A8652ErpLin = new short[1] ;
      T01FG4_A396EmprCod = new String[] {""} ;
      T01FG13_A396EmprCod = new String[] {""} ;
      T01FG13_A9705ErpNped = new String[] {""} ;
      T01FG13_A8652ErpLin = new short[1] ;
      T01FG14_A9705ErpNped = new String[] {""} ;
      T01FG14_A8652ErpLin = new short[1] ;
      T01FG14_A6219ErpCPza = new String[] {""} ;
      T01FG14_A6218ErpCP2 = new String[] {""} ;
      T01FG14_n6218ErpCP2 = new boolean[] {false} ;
      T01FG14_A6171ErpKgsP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FG14_n6171ErpKgsP = new boolean[] {false} ;
      T01FG14_A6009ErpMtsP = new String[] {""} ;
      T01FG14_n6009ErpMtsP = new boolean[] {false} ;
      T01FG14_A396EmprCod = new String[] {""} ;
      T01FG15_A396EmprCod = new String[] {""} ;
      T01FG15_A9705ErpNped = new String[] {""} ;
      T01FG15_A8652ErpLin = new short[1] ;
      T01FG15_A6219ErpCPza = new String[] {""} ;
      T01FG3_A9705ErpNped = new String[] {""} ;
      T01FG3_A8652ErpLin = new short[1] ;
      T01FG3_A6219ErpCPza = new String[] {""} ;
      T01FG3_A6218ErpCP2 = new String[] {""} ;
      T01FG3_n6218ErpCP2 = new boolean[] {false} ;
      T01FG3_A6171ErpKgsP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FG3_n6171ErpKgsP = new boolean[] {false} ;
      T01FG3_A6009ErpMtsP = new String[] {""} ;
      T01FG3_n6009ErpMtsP = new boolean[] {false} ;
      T01FG3_A396EmprCod = new String[] {""} ;
      T01FG2_A9705ErpNped = new String[] {""} ;
      T01FG2_A8652ErpLin = new short[1] ;
      T01FG2_A6219ErpCPza = new String[] {""} ;
      T01FG2_A6218ErpCP2 = new String[] {""} ;
      T01FG2_n6218ErpCP2 = new boolean[] {false} ;
      T01FG2_A6171ErpKgsP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01FG2_n6171ErpKgsP = new boolean[] {false} ;
      T01FG2_A6009ErpMtsP = new String[] {""} ;
      T01FG2_n6009ErpMtsP = new boolean[] {false} ;
      T01FG2_A396EmprCod = new String[] {""} ;
      T01FG19_A396EmprCod = new String[] {""} ;
      T01FG19_A9705ErpNped = new String[] {""} ;
      T01FG19_A8652ErpLin = new short[1] ;
      T01FG19_A6219ErpCPza = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01FG20_A407EmprNom = new String[] {""} ;
      T01FG20_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ9705ErpNped = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tlpedco__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tlpedco__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tlpedco__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tlpedco__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlpedco__default(),
         new Object[] {
             new Object[] {
            T01FG2_A9705ErpNped, T01FG2_A8652ErpLin, T01FG2_A6219ErpCPza, T01FG2_A6218ErpCP2, T01FG2_n6218ErpCP2, T01FG2_A6171ErpKgsP, T01FG2_n6171ErpKgsP, T01FG2_A6009ErpMtsP, T01FG2_n6009ErpMtsP, T01FG2_A396EmprCod
            }
            , new Object[] {
            T01FG3_A9705ErpNped, T01FG3_A8652ErpLin, T01FG3_A6219ErpCPza, T01FG3_A6218ErpCP2, T01FG3_n6218ErpCP2, T01FG3_A6171ErpKgsP, T01FG3_n6171ErpKgsP, T01FG3_A6009ErpMtsP, T01FG3_n6009ErpMtsP, T01FG3_A396EmprCod
            }
            , new Object[] {
            T01FG4_A9705ErpNped, T01FG4_A8652ErpLin, T01FG4_A396EmprCod
            }
            , new Object[] {
            T01FG5_A9705ErpNped, T01FG5_A8652ErpLin, T01FG5_A396EmprCod
            }
            , new Object[] {
            T01FG6_A407EmprNom, T01FG6_n407EmprNom
            }
            , new Object[] {
            T01FG7_A9705ErpNped, T01FG7_A8652ErpLin, T01FG7_A407EmprNom, T01FG7_n407EmprNom, T01FG7_A396EmprCod
            }
            , new Object[] {
            T01FG8_A396EmprCod, T01FG8_A9705ErpNped, T01FG8_A8652ErpLin
            }
            , new Object[] {
            T01FG9_A396EmprCod, T01FG9_A9705ErpNped, T01FG9_A8652ErpLin
            }
            , new Object[] {
            T01FG10_A396EmprCod, T01FG10_A9705ErpNped, T01FG10_A8652ErpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FG13_A396EmprCod, T01FG13_A9705ErpNped, T01FG13_A8652ErpLin
            }
            , new Object[] {
            T01FG14_A9705ErpNped, T01FG14_A8652ErpLin, T01FG14_A6219ErpCPza, T01FG14_A6218ErpCP2, T01FG14_n6218ErpCP2, T01FG14_A6171ErpKgsP, T01FG14_n6171ErpKgsP, T01FG14_A6009ErpMtsP, T01FG14_n6009ErpMtsP, T01FG14_A396EmprCod
            }
            , new Object[] {
            T01FG15_A396EmprCod, T01FG15_A9705ErpNped, T01FG15_A8652ErpLin, T01FG15_A6219ErpCPza
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01FG19_A396EmprCod, T01FG19_A9705ErpNped, T01FG19_A8652ErpLin, T01FG19_A6219ErpCPza
            }
            , new Object[] {
            T01FG20_A407EmprNom, T01FG20_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TLPEDCO" ;
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
   private short Z8652ErpLin ;
   private short nRcdDeleted_1569 ;
   private short nRcdExists_1569 ;
   private short nIsMod_1569 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8652ErpLin ;
   private short nBlankRcdCount1569 ;
   private short RcdFound1569 ;
   private short nBlankRcdUsr1569 ;
   private short RcdFound1568 ;
   private short nIsDirty_1568 ;
   private short nIsDirty_1569 ;
   private short ZZ8652ErpLin ;
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
   private int edtErpNped_Enabled ;
   private int edtErpLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1569_Enabled ;
   private int edtErpCPza_Enabled ;
   private int edtErpCP2_Enabled ;
   private int edtErpKgsP_Enabled ;
   private int edtErpMtsP_Enabled ;
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
   private int defedtErpCPza_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtErpLin_Backcolor ;
   private int edtErpNped_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6171ErpKgsP ;
   private java.math.BigDecimal A6171ErpKgsP ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z9705ErpNped ;
   private String Z6219ErpCPza ;
   private String Z6218ErpCP2 ;
   private String Z6009ErpMtsP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtErpNped_Internalname ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A9705ErpNped ;
   private String edtErpNped_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtErpLin_Internalname ;
   private String edtErpLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1569 ;
   private String edtavnRcdDeleted_1569_Internalname ;
   private String edtErpCPza_Internalname ;
   private String edtErpCP2_Internalname ;
   private String edtErpKgsP_Internalname ;
   private String edtErpMtsP_Internalname ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1568 ;
   private String GXCCtl ;
   private String A6219ErpCPza ;
   private String A6218ErpCP2 ;
   private String A6009ErpMtsP ;
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
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1569_Jsonclick ;
   private String edtErpCPza_Jsonclick ;
   private String edtErpCP2_Jsonclick ;
   private String edtErpKgsP_Jsonclick ;
   private String edtErpMtsP_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ9705ErpNped ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n6218ErpCP2 ;
   private boolean n6171ErpKgsP ;
   private boolean n6009ErpMtsP ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01FG6_A407EmprNom ;
   private boolean[] T01FG6_n407EmprNom ;
   private String[] T01FG7_A9705ErpNped ;
   private short[] T01FG7_A8652ErpLin ;
   private String[] T01FG7_A407EmprNom ;
   private boolean[] T01FG7_n407EmprNom ;
   private String[] T01FG7_A396EmprCod ;
   private String[] T01FG8_A396EmprCod ;
   private String[] T01FG8_A9705ErpNped ;
   private short[] T01FG8_A8652ErpLin ;
   private String[] T01FG5_A9705ErpNped ;
   private short[] T01FG5_A8652ErpLin ;
   private String[] T01FG5_A396EmprCod ;
   private String[] T01FG9_A396EmprCod ;
   private String[] T01FG9_A9705ErpNped ;
   private short[] T01FG9_A8652ErpLin ;
   private String[] T01FG10_A396EmprCod ;
   private String[] T01FG10_A9705ErpNped ;
   private short[] T01FG10_A8652ErpLin ;
   private String[] T01FG4_A9705ErpNped ;
   private short[] T01FG4_A8652ErpLin ;
   private String[] T01FG4_A396EmprCod ;
   private String[] T01FG13_A396EmprCod ;
   private String[] T01FG13_A9705ErpNped ;
   private short[] T01FG13_A8652ErpLin ;
   private String[] T01FG14_A9705ErpNped ;
   private short[] T01FG14_A8652ErpLin ;
   private String[] T01FG14_A6219ErpCPza ;
   private String[] T01FG14_A6218ErpCP2 ;
   private boolean[] T01FG14_n6218ErpCP2 ;
   private java.math.BigDecimal[] T01FG14_A6171ErpKgsP ;
   private boolean[] T01FG14_n6171ErpKgsP ;
   private String[] T01FG14_A6009ErpMtsP ;
   private boolean[] T01FG14_n6009ErpMtsP ;
   private String[] T01FG14_A396EmprCod ;
   private String[] T01FG15_A396EmprCod ;
   private String[] T01FG15_A9705ErpNped ;
   private short[] T01FG15_A8652ErpLin ;
   private String[] T01FG15_A6219ErpCPza ;
   private String[] T01FG3_A9705ErpNped ;
   private short[] T01FG3_A8652ErpLin ;
   private String[] T01FG3_A6219ErpCPza ;
   private String[] T01FG3_A6218ErpCP2 ;
   private boolean[] T01FG3_n6218ErpCP2 ;
   private java.math.BigDecimal[] T01FG3_A6171ErpKgsP ;
   private boolean[] T01FG3_n6171ErpKgsP ;
   private String[] T01FG3_A6009ErpMtsP ;
   private boolean[] T01FG3_n6009ErpMtsP ;
   private String[] T01FG3_A396EmprCod ;
   private String[] T01FG2_A9705ErpNped ;
   private short[] T01FG2_A8652ErpLin ;
   private String[] T01FG2_A6219ErpCPza ;
   private String[] T01FG2_A6218ErpCP2 ;
   private boolean[] T01FG2_n6218ErpCP2 ;
   private java.math.BigDecimal[] T01FG2_A6171ErpKgsP ;
   private boolean[] T01FG2_n6171ErpKgsP ;
   private String[] T01FG2_A6009ErpMtsP ;
   private boolean[] T01FG2_n6009ErpMtsP ;
   private String[] T01FG2_A396EmprCod ;
   private String[] T01FG19_A396EmprCod ;
   private String[] T01FG19_A9705ErpNped ;
   private short[] T01FG19_A8652ErpLin ;
   private String[] T01FG19_A6219ErpCPza ;
   private String[] T01FG20_A407EmprNom ;
   private boolean[] T01FG20_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tlpedco__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlpedco__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlpedco__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlpedco__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlpedco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01FG2", "SELECT ErpNped, ErpLin, ErpCPza, ErpCP2, ErpKgsP, ErpMtsP, EmprCod FROM TXPLPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? AND ErpCPza = ?  FOR UPDATE OF ErpCP2, ErpKgsP, ErpMtsP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG3", "SELECT ErpNped, ErpLin, ErpCPza, ErpCP2, ErpKgsP, ErpMtsP, EmprCod FROM TXPLPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? AND ErpCPza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG4", "SELECT ErpNped, ErpLin, EmprCod FROM TXPCPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ?  FOR UPDATE OF ErpNped NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG5", "SELECT ErpNped, ErpLin, EmprCod FROM TXPCPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ErpNped, TM1.ErpLin, T2.EmprNom, TM1.EmprCod FROM (TXPCPEDCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ErpNped = ? and TM1.ErpLin = ? ORDER BY TM1.EmprCod, TM1.ErpNped, TM1.ErpLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE ( ErpNped > ? or ErpNped = ? and ErpLin > ?) and EmprCod = ? ORDER BY EmprCod, ErpNped, ErpLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01FG10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE ( ErpNped < ? or ErpNped = ? and ErpLin < ?) and EmprCod = ? ORDER BY EmprCod DESC, ErpNped DESC, ErpLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01FG11", "INSERT INTO TXPCPEDCO(ErpNped, ErpLin, EmprCod, ErpPedCl, ErpFPC, ErpFPCm, ErpFEP, ErpOc, ErpPCl, ErpNPC, ErpPda, ErpLote, ErpKgs, ErpMts, ErpPzs, ErpTipo, ErpColNo, ErpColNu, ErpTc, ErpColNC, ErpColNuC, ErpDibCl, ErpDibInt, ErpEst, CliCod, ArtCod) VALUES(?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPCPEDCO")
         ,new UpdateCursor("T01FG12", "DELETE FROM TXPCPEDCO  WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ?", GX_NOMASK, "TXPCPEDCO")
         ,new ForEachCursor("T01FG13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? ORDER BY EmprCod, ErpNped, ErpLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG14", "SELECT ErpNped, ErpLin, ErpCPza, ErpCP2, ErpKgsP, ErpMtsP, EmprCod FROM TXPLPEDCO WHERE EmprCod = ? and ErpNped = ? and ErpLin = ? and ErpCPza = ? ORDER BY EmprCod, ErpNped, ErpLin, ErpCPza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG15", "SELECT EmprCod, ErpNped, ErpLin, ErpCPza FROM TXPLPEDCO WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? AND ErpCPza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01FG16", "INSERT INTO TXPLPEDCO(ErpNped, ErpLin, ErpCPza, ErpCP2, ErpKgsP, ErpMtsP, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPEDCO")
         ,new UpdateCursor("T01FG17", "UPDATE TXPLPEDCO SET ErpCP2=?, ErpKgsP=?, ErpMtsP=?  WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? AND ErpCPza = ?", GX_NOMASK, "TXPLPEDCO")
         ,new UpdateCursor("T01FG18", "DELETE FROM TXPLPEDCO  WHERE EmprCod = ? AND ErpNped = ? AND ErpLin = ? AND ErpCPza = ?", GX_NOMASK, "TXPLPEDCO")
         ,new ForEachCursor("T01FG19", "SELECT EmprCod, ErpNped, ErpLin, ErpCPza FROM TXPLPEDCO WHERE EmprCod = ? and ErpNped = ? and ErpLin = ? ORDER BY EmprCod, ErpNped, ErpLin, ErpCPza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01FG20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 18 :
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
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 9);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 15);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 9);
               }
               stmt.setString(7, (String)parms[9], 3);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 15);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 9);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 20);
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setString(7, (String)parms[9], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

