package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tregc00_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A457FasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MASTER DE TIPOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRegc_c1_Internalname ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_57 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_57"))) ;
      nGXsfl_57_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_57_idx"))) ;
      sGXsfl_57_idx = httpContext.GetPar( "sGXsfl_57_idx") ;
      A11275Regc_U1 = (short)(GXutil.lval( httpContext.GetPar( "Regc_U1"))) ;
      n11275Regc_U1 = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tregc00_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tregc00_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tregc00_impl.class ));
   }

   public tregc00_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TREGC00.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREGC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRegc_c1_Internalname, GXutil.rtrim( A11278Regc_c1), GXutil.rtrim( localUtil.format( A11278Regc_c1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRegc_c1_Jsonclick, 0, "", "", "", "", "", 1, edtRegc_c1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TREGC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TREGC00.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      /* Save parent mode. */
      sMode1505 = Gx_mode ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1505 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1505 = (short)(1) ;
            scanStart1BG1505( ) ;
            while ( RcdFound1505 != 0 )
            {
               init_level_properties1505( ) ;
               getByPrimaryKey1BG1505( ) ;
               addRow1BG1505( ) ;
               scanNext1BG1505( ) ;
            }
            scanEnd1BG1505( ) ;
            nBlankRcdCount1505 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1BG1505( ) ;
         standaloneModal1BG1505( ) ;
         sMode1505 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1BG1505( ) ;
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtRegc_U1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGC_U1_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRegc_U1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_U1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1505 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BG1505( ) ;
            }
            sendRow1BG1505( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1505 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1505 = (short)(5) ;
         nRcdExists_1505 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BG1505( ) ;
            while ( RcdFound1505 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351505( ) ;
               init_level_properties1505( ) ;
               standaloneNotModal1BG1505( ) ;
               getByPrimaryKey1BG1505( ) ;
               standaloneModal1BG1505( ) ;
               addRow1BG1505( ) ;
               scanNext1BG1505( ) ;
            }
            scanEnd1BG1505( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1505 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351505( ) ;
      initAll1BG1505( ) ;
      init_level_properties1505( ) ;
      nRcdExists_1505 = (short)(0) ;
      nIsMod_1505 = (short)(0) ;
      nRcdDeleted_1505 = (short)(0) ;
      nBlankRcdCount1505 = (short)(nBlankRcdUsr1505+nBlankRcdCount1505) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1505 > 0 )
      {
         standaloneNotModal1BG1505( ) ;
         standaloneModal1BG1505( ) ;
         addRow1BG1505( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1505 = (short)(nBlankRcdCount1505-1) ;
      }
      Gx_mode = sMode1505 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1505 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TREGC00.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TREGC00.htm");
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
      e111BG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11278Regc_c1 = httpContext.cgiGet( "Z11278Regc_c1") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A11278Regc_c1 = httpContext.cgiGet( edtRegc_c1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A11278Regc_c1 = httpContext.GetPar( "Regc_c1") ;
               httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
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
                        e111BG2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'COPIAR DATOS FASE ANTERIOR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Copiar Datos Fase Anterior' */
                        e121BG2 ();
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
            initAll1BG1503( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1504_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1504_Enabled), 5, 0), !bGXsfl_57_Refreshing);
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
      disableAttributes1BG1503( ) ;
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

   public void confirm_1BG0( )
   {
      beforeValidate1BG1503( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1BG1503( ) ;
         }
         else
         {
            checkExtendedTable1BG1503( ) ;
            if ( AnyError == 0 )
            {
               zm1BG1503( 8) ;
            }
            closeExtendedTableCursors1BG1503( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1503 = Gx_mode ;
         confirm_1BG1505( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1503 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1503 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1BG0( ) ;
      }
   }

   public void confirm_1BG1504( )
   {
      s11275Regc_U1 = O11275Regc_U1 ;
      n11275Regc_U1 = false ;
      nGXsfl_57_idx = 0 ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         readRow1BG1504( ) ;
         if ( ( nRcdExists_1504 != 0 ) || ( nIsMod_1504 != 0 ) )
         {
            getKey1BG1504( ) ;
            if ( ( nRcdExists_1504 == 0 ) && ( nRcdDeleted_1504 == 0 ) )
            {
               if ( RcdFound1504 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BG1504( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BG1504( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1BG1504( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O11275Regc_U1 = A11275Regc_U1 ;
                     n11275Regc_U1 = false ;
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1504 != 0 )
               {
                  if ( nRcdDeleted_1504 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BG1504( ) ;
                     load1BG1504( ) ;
                     beforeValidate1BG1504( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BG1504( ) ;
                        O11275Regc_U1 = A11275Regc_U1 ;
                        n11275Regc_U1 = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1504 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BG1504( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BG1504( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1BG1504( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O11275Regc_U1 = A11275Regc_U1 ;
                           n11275Regc_U1 = false ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1504 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1504_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRegc_L1_Internalname, GXutil.ltrim( localUtil.ntoc( A11276Regc_L1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRegc_d1_Internalname, GXutil.rtrim( A11277Regc_d1)) ;
         httpContext.changePostValue( "ZT_"+"Z11276Regc_L1_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( Z11276Regc_L1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11277Regc_d1_"+sGXsfl_57_idx, GXutil.rtrim( Z11277Regc_d1)) ;
         httpContext.changePostValue( "nRcdDeleted_1504_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1504_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1504_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1504 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1504_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1504_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGC_L1_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_L1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGC_D1_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_d1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O11275Regc_U1 = s11275Regc_U1 ;
      n11275Regc_U1 = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1BG1505( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1BG1505( ) ;
         if ( ( nRcdExists_1505 != 0 ) || ( nIsMod_1505 != 0 ) )
         {
            getKey1BG1505( ) ;
            if ( ( nRcdExists_1505 == 0 ) && ( nRcdDeleted_1505 == 0 ) )
            {
               if ( RcdFound1505 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1BG1505( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1BG1505( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1BG1505( 10) ;
                     }
                     closeExtendedTableCursors1BG1505( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1505 = Gx_mode ;
                        confirm_1BG1504( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1505 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1505 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1505 != 0 )
               {
                  if ( nRcdDeleted_1505 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1BG1505( ) ;
                     load1BG1505( ) ;
                     beforeValidate1BG1505( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1BG1505( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1505 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1BG1505( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1BG1505( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1BG1505( 10) ;
                           }
                           closeExtendedTableCursors1BG1505( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1505 = Gx_mode ;
                              confirm_1BG1504( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1505 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1505 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1505 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtRegc_U1_Internalname, GXutil.ltrim( localUtil.ntoc( A11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_35_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11275Regc_U1_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11275Regc_U1_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_57_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1505_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1505_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1505_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1505 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGC_U1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_U1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1BG0( )
   {
   }

   public void e111BG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tregc00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tregc00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tregc00_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tregc00_impl.this.A396EmprCod = GXv_char2[0] ;
      tregc00_impl.this.AV11EmprNom = GXv_char3[0] ;
      tregc00_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121BG2( )
   {
      /* 'Copiar Datos Fase Anterior' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A457FasCod, " ") != 0 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A11278Regc_c1 ;
         GXv_char2[0] = A457FasCod ;
         new app.pregc00(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tregc00_impl.this.A396EmprCod = GXv_char4[0] ;
         tregc00_impl.this.A11278Regc_c1 = GXv_char3[0] ;
         tregc00_impl.this.A457FasCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void zm1BG1503( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -7 )
      {
         Z11278Regc_c1 = A11278Regc_c1 ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TREGC00" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01BG9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BG9_A407EmprNom[0] ;
      n407EmprNom = T01BG9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(7);
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

   public void load1BG1503( )
   {
      /* Using cursor T01BG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A11278Regc_c1});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1503 = (short)(1) ;
         A407EmprNom = T01BG10_A407EmprNom[0] ;
         n407EmprNom = T01BG10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1BG1503( -7) ;
      }
      pr_default.close(8);
      onLoadActions1BG1503( ) ;
   }

   public void onLoadActions1BG1503( )
   {
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void checkExtendedTable1BG1503( )
   {
      nIsDirty_1503 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV8UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      }
   }

   public void closeExtendedTableCursors1BG1503( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1BG1503( )
   {
      /* Using cursor T01BG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A11278Regc_c1});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1503 = (short)(1) ;
      }
      else
      {
         RcdFound1503 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01BG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A11278Regc_c1});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01BG8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BG1503( 7) ;
         RcdFound1503 = (short)(1) ;
         A11278Regc_c1 = T01BG8_A11278Regc_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
         Z396EmprCod = A396EmprCod ;
         Z11278Regc_c1 = A11278Regc_c1 ;
         sMode1503 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1BG1503( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1503 = (short)(0) ;
            initializeNonKey1BG1503( ) ;
         }
         Gx_mode = sMode1503 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1503 = (short)(0) ;
         initializeNonKey1BG1503( ) ;
         sMode1503 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1503 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1BG1503( ) ;
      if ( RcdFound1503 == 0 )
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
      RcdFound1503 = (short)(0) ;
      /* Using cursor T01BG12 */
      pr_default.execute(10, new Object[] {A11278Regc_c1, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01BG12_A11278Regc_c1[0], A11278Regc_c1) < 0 ) ) && ( GXutil.strcmp(T01BG12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01BG12_A11278Regc_c1[0], A11278Regc_c1) > 0 ) ) && ( GXutil.strcmp(T01BG12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11278Regc_c1 = T01BG12_A11278Regc_c1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
            RcdFound1503 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1503 = (short)(0) ;
      /* Using cursor T01BG13 */
      pr_default.execute(11, new Object[] {A11278Regc_c1, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01BG13_A11278Regc_c1[0], A11278Regc_c1) > 0 ) ) && ( GXutil.strcmp(T01BG13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01BG13_A11278Regc_c1[0], A11278Regc_c1) < 0 ) ) && ( GXutil.strcmp(T01BG13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11278Regc_c1 = T01BG13_A11278Regc_c1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
            RcdFound1503 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1BG1503( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRegc_c1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1BG1503( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1503 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11278Regc_c1, Z11278Regc_c1) != 0 ) )
            {
               A11278Regc_c1 = Z11278Regc_c1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRegc_c1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1BG1503( ) ;
               GX_FocusControl = edtRegc_c1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11278Regc_c1, Z11278Regc_c1) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRegc_c1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1BG1503( ) ;
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
                  GX_FocusControl = edtRegc_c1_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1BG1503( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11278Regc_c1, Z11278Regc_c1) != 0 ) )
      {
         A11278Regc_c1 = Z11278Regc_c1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRegc_c1_Internalname ;
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
      getKey1BG1503( ) ;
      if ( RcdFound1503 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11278Regc_c1, Z11278Regc_c1) != 0 ) )
         {
            A11278Regc_c1 = Z11278Regc_c1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A11278Regc_c1, Z11278Regc_c1) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tregc00");
   }

   public void insert_check( )
   {
      confirm_1BG0( ) ;
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
      if ( RcdFound1503 == 0 )
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
      scanStart1BG1503( ) ;
      if ( RcdFound1503 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BG1503( ) ;
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
      if ( RcdFound1503 == 0 )
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
      if ( RcdFound1503 == 0 )
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
      scanStart1BG1503( ) ;
      if ( RcdFound1503 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1503 != 0 )
         {
            scanNext1BG1503( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1BG1503( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1BG1503( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BG7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A11278Regc_c1});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGC00"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPREGC00"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BG1503( )
   {
      beforeValidate1BG1503( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BG1503( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BG1503( 0) ;
         checkOptimisticConcurrency1BG1503( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BG1503( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BG1503( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BG14 */
                  pr_default.execute(12, new Object[] {A11278Regc_c1, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC00");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1BG1503( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1BG0( ) ;
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
            load1BG1503( ) ;
         }
         endLevel1BG1503( ) ;
      }
      closeExtendedTableCursors1BG1503( ) ;
   }

   public void update1BG1503( )
   {
      beforeValidate1BG1503( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BG1503( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BG1503( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BG1503( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1BG1503( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPREGC00 */
                  deferredUpdate1BG1503( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1BG1503( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1BG0( ) ;
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
         endLevel1BG1503( ) ;
      }
      closeExtendedTableCursors1BG1503( ) ;
   }

   public void deferredUpdate1BG1503( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BG1503( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BG1503( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BG1503( ) ;
         afterConfirm1BG1503( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BG1503( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BG15 */
               pr_default.execute(13, new Object[] {A396EmprCod, A11278Regc_c1});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC00");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1503 == 0 )
                     {
                        initAll1BG1503( ) ;
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
                     resetCaption1BG0( ) ;
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
      sMode1503 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BG1503( ) ;
      Gx_mode = sMode1503 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BG1503( )
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
         /* Using cursor T01BG16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A11278Regc_c1});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel1BG1505( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1BG1505( ) ;
         if ( ( nRcdExists_1505 != 0 ) || ( nIsMod_1505 != 0 ) )
         {
            standaloneNotModal1BG1505( ) ;
            getKey1BG1505( ) ;
            if ( ( nRcdExists_1505 == 0 ) && ( nRcdDeleted_1505 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BG1505( ) ;
            }
            else
            {
               if ( RcdFound1505 != 0 )
               {
                  if ( ( nRcdDeleted_1505 != 0 ) && ( nRcdExists_1505 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BG1505( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1505 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BG1505( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1505 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtRegc_U1_Internalname, GXutil.ltrim( localUtil.ntoc( A11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_35_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z11275Regc_U1_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11275Regc_U1_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_57_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1505_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1505_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1505_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1505 != 0 )
         {
            httpContext.changePostValue( "FASCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGC_U1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_U1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BG1505( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1505 = (short)(0) ;
      nIsMod_1505 = (short)(0) ;
      nRcdDeleted_1505 = (short)(0) ;
   }

   public void processLevel1BG1503( )
   {
      /* Save parent mode. */
      sMode1503 = Gx_mode ;
      processNestedLevel1BG1505( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1503 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1BG1503( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1BG1503( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tregc00");
         if ( AnyError == 0 )
         {
            confirmValues1BG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tregc00");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BG1503( )
   {
      /* Scan By routine */
      /* Using cursor T01BG17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      RcdFound1503 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1503 = (short)(1) ;
         A11278Regc_c1 = T01BG17_A11278Regc_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BG1503( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1503 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1503 = (short)(1) ;
         A11278Regc_c1 = T01BG17_A11278Regc_c1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
      }
   }

   public void scanEnd1BG1503( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1BG1503( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A11278Regc_c1, " ") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO valido", ""), 1, "REGC_C1");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegc_c1_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1BG1503( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BG1503( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BG1503( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BG1503( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BG1503( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BG1503( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtRegc_c1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_c1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_c1_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm1BG1505( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11275Regc_U1 = T01BG5_A11275Regc_U1[0] ;
         }
         else
         {
            Z11275Regc_U1 = A11275Regc_U1 ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z11278Regc_c1 = A11278Regc_c1 ;
         Z11275Regc_U1 = A11275Regc_U1 ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal1BG1505( )
   {
      edtRegc_U1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_U1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_U1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void standaloneModal1BG1505( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1BG1505( )
   {
      /* Using cursor T01BG18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1505 = (short)(1) ;
         A460FasDsc = T01BG18_A460FasDsc[0] ;
         A11275Regc_U1 = T01BG18_A11275Regc_U1[0] ;
         n11275Regc_U1 = T01BG18_n11275Regc_U1[0] ;
         zm1BG1505( -9) ;
      }
      pr_default.close(16);
      onLoadActions1BG1505( ) ;
   }

   public void onLoadActions1BG1505( )
   {
   }

   public void checkExtendedTable1BG1505( )
   {
      nIsDirty_1505 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1BG1505( ) ;
      /* Using cursor T01BG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01BG6_A460FasDsc[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1BG1505( )
   {
      pr_default.close(4);
   }

   public void enableDisable1BG1505( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01BG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01BG19_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1BG1505( )
   {
      /* Using cursor T01BG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1505 = (short)(1) ;
      }
      else
      {
         RcdFound1505 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1BG1505( )
   {
      /* Using cursor T01BG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01BG5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BG1505( 9) ;
         RcdFound1505 = (short)(1) ;
         initializeNonKey1BG1505( ) ;
         A11275Regc_U1 = T01BG5_A11275Regc_U1[0] ;
         n11275Regc_U1 = T01BG5_n11275Regc_U1[0] ;
         A457FasCod = T01BG5_A457FasCod[0] ;
         O11275Regc_U1 = A11275Regc_U1 ;
         n11275Regc_U1 = false ;
         Z396EmprCod = A396EmprCod ;
         Z11278Regc_c1 = A11278Regc_c1 ;
         Z457FasCod = A457FasCod ;
         sMode1505 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BG1505( ) ;
         load1BG1505( ) ;
         Gx_mode = sMode1505 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1505 = (short)(0) ;
         initializeNonKey1BG1505( ) ;
         sMode1505 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BG1505( ) ;
         Gx_mode = sMode1505 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BG1505( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1BG1505( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGC02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z11275Regc_U1 != T01BG4_A11275Regc_U1[0] ) )
         {
            if ( Z11275Regc_U1 != T01BG4_A11275Regc_U1[0] )
            {
               GXutil.writeLogln("tregc00:[seudo value changed for attri]"+"Regc_U1");
               GXutil.writeLogRaw("Old: ",Z11275Regc_U1);
               GXutil.writeLogRaw("Current: ",T01BG4_A11275Regc_U1[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPREGC02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BG1505( )
   {
      beforeValidate1BG1505( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BG1505( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BG1505( 0) ;
         checkOptimisticConcurrency1BG1505( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BG1505( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BG1505( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BG21 */
                  pr_default.execute(19, new Object[] {A11278Regc_c1, Boolean.valueOf(n11275Regc_U1), Short.valueOf(A11275Regc_U1), A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC02");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel1BG1505( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1BG1505( ) ;
         }
         endLevel1BG1505( ) ;
      }
      closeExtendedTableCursors1BG1505( ) ;
   }

   public void update1BG1505( )
   {
      beforeValidate1BG1505( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BG1505( ) ;
      }
      if ( ( nIsMod_1505 != 0 ) || ( nIsDirty_1505 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BG1505( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BG1505( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BG1505( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BG22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n11275Regc_U1), Short.valueOf(A11275Regc_U1), A396EmprCod, A11278Regc_c1, A457FasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC02");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGC02"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BG1505( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1BG1505( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1BG1505( ) ;
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
            endLevel1BG1505( ) ;
         }
      }
      closeExtendedTableCursors1BG1505( ) ;
   }

   public void deferredUpdate1BG1505( )
   {
   }

   public void delete1BG1505( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BG1505( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BG1505( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BG1505( ) ;
         afterConfirm1BG1505( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BG1505( ) ;
            if ( AnyError == 0 )
            {
               A11275Regc_U1 = O11275Regc_U1 ;
               n11275Regc_U1 = false ;
               scanStart1BG1504( ) ;
               while ( RcdFound1504 != 0 )
               {
                  getByPrimaryKey1BG1504( ) ;
                  delete1BG1504( ) ;
                  scanNext1BG1504( ) ;
                  O11275Regc_U1 = A11275Regc_U1 ;
                  n11275Regc_U1 = false ;
               }
               scanEnd1BG1504( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BG23 */
                  pr_default.execute(21, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC02");
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
      }
      sMode1505 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BG1505( ) ;
      Gx_mode = sMode1505 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BG1505( )
   {
      standaloneModal1BG1505( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01BG24 */
         pr_default.execute(22, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01BG24_A460FasDsc[0] ;
         pr_default.close(22);
      }
   }

   public void processNestedLevel1BG1504( )
   {
      s11275Regc_U1 = O11275Regc_U1 ;
      n11275Regc_U1 = false ;
      nGXsfl_57_idx = 0 ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         readRow1BG1504( ) ;
         if ( ( nRcdExists_1504 != 0 ) || ( nIsMod_1504 != 0 ) )
         {
            standaloneNotModal1BG1504( ) ;
            getKey1BG1504( ) ;
            if ( ( nRcdExists_1504 == 0 ) && ( nRcdDeleted_1504 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1BG1504( ) ;
            }
            else
            {
               if ( RcdFound1504 != 0 )
               {
                  if ( ( nRcdDeleted_1504 != 0 ) && ( nRcdExists_1504 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1BG1504( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1504 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1BG1504( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1504 == 0 )
                  {
                     GXCCtl = "FASCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O11275Regc_U1 = A11275Regc_U1 ;
            n11275Regc_U1 = false ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_1504_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRegc_L1_Internalname, GXutil.ltrim( localUtil.ntoc( A11276Regc_L1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRegc_d1_Internalname, GXutil.rtrim( A11277Regc_d1)) ;
         httpContext.changePostValue( "ZT_"+"Z11276Regc_L1_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( Z11276Regc_L1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11277Regc_d1_"+sGXsfl_57_idx, GXutil.rtrim( Z11277Regc_d1)) ;
         httpContext.changePostValue( "nRcdDeleted_1504_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1504_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1504_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1504 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1504_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1504_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGC_L1_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_L1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "REGC_D1_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_d1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1BG1504( ) ;
      if ( AnyError != 0 )
      {
         O11275Regc_U1 = s11275Regc_U1 ;
         n11275Regc_U1 = false ;
      }
      nRcdExists_1504 = (short)(0) ;
      nIsMod_1504 = (short)(0) ;
      nRcdDeleted_1504 = (short)(0) ;
   }

   public void processLevel1BG1505( )
   {
      /* Save parent mode. */
      sMode1505 = Gx_mode ;
      processNestedLevel1BG1504( ) ;
      if ( AnyError != 0 )
      {
         O11275Regc_U1 = s11275Regc_U1 ;
         n11275Regc_U1 = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1505 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01BG25 */
      pr_default.execute(23, new Object[] {Boolean.valueOf(n11275Regc_U1), Short.valueOf(A11275Regc_U1), A396EmprCod, A11278Regc_c1, A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC02");
   }

   public void endLevel1BG1505( )
   {
      pr_default.close(2);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1BG1505( )
   {
      /* Scan By routine */
      /* Using cursor T01BG26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A11278Regc_c1});
      RcdFound1505 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1505 = (short)(1) ;
         A457FasCod = T01BG26_A457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BG1505( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1505 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1505 = (short)(1) ;
         A457FasCod = T01BG26_A457FasCod[0] ;
      }
   }

   public void scanEnd1BG1505( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1BG1505( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BG1505( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BG1505( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BG1505( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BG1505( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BG1505( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BG1505( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtRegc_U1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_U1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_U1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void zm1BG1504( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11277Regc_d1 = T01BG3_A11277Regc_d1[0] ;
         }
         else
         {
            Z11277Regc_d1 = A11277Regc_d1 ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z11278Regc_c1 = A11278Regc_c1 ;
         Z457FasCod = A457FasCod ;
         Z11276Regc_L1 = A11276Regc_L1 ;
         Z11277Regc_d1 = A11277Regc_d1 ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1BG1504( )
   {
      edtRegc_U1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_U1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_U1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void standaloneModal1BG1504( )
   {
      if ( isIns( )  )
      {
         A11275Regc_U1 = (short)(O11275Regc_U1+1) ;
         n11275Regc_U1 = false ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A11276Regc_L1 = A11275Regc_U1 ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRegc_L1_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRegc_L1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_L1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      else
      {
         edtRegc_L1_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRegc_L1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_L1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
   }

   public void load1BG1504( )
   {
      /* Using cursor T01BG27 */
      pr_default.execute(25, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1504 = (short)(1) ;
         A11277Regc_d1 = T01BG27_A11277Regc_d1[0] ;
         n11277Regc_d1 = T01BG27_n11277Regc_d1[0] ;
         zm1BG1504( -11) ;
      }
      pr_default.close(25);
      onLoadActions1BG1504( ) ;
   }

   public void onLoadActions1BG1504( )
   {
   }

   public void checkExtendedTable1BG1504( )
   {
      nIsDirty_1504 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1BG1504( ) ;
   }

   public void closeExtendedTableCursors1BG1504( )
   {
   }

   public void enableDisable1BG1504( )
   {
   }

   public void getKey1BG1504( )
   {
      /* Using cursor T01BG28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1504 = (short)(1) ;
      }
      else
      {
         RcdFound1504 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKey1BG1504( )
   {
      /* Using cursor T01BG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01BG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1BG1504( 11) ;
         RcdFound1504 = (short)(1) ;
         initializeNonKey1BG1504( ) ;
         A11276Regc_L1 = T01BG3_A11276Regc_L1[0] ;
         A11277Regc_d1 = T01BG3_A11277Regc_d1[0] ;
         n11277Regc_d1 = T01BG3_n11277Regc_d1[0] ;
         Z396EmprCod = A396EmprCod ;
         Z11278Regc_c1 = A11278Regc_c1 ;
         Z457FasCod = A457FasCod ;
         Z11276Regc_L1 = A11276Regc_L1 ;
         sMode1504 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BG1504( ) ;
         load1BG1504( ) ;
         Gx_mode = sMode1504 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1504 = (short)(0) ;
         initializeNonKey1BG1504( ) ;
         sMode1504 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1BG1504( ) ;
         Gx_mode = sMode1504 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1BG1504( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1BG1504( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01BG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGC01"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11277Regc_d1, T01BG2_A11277Regc_d1[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11277Regc_d1, T01BG2_A11277Regc_d1[0]) != 0 )
            {
               GXutil.writeLogln("tregc00:[seudo value changed for attri]"+"Regc_d1");
               GXutil.writeLogRaw("Old: ",Z11277Regc_d1);
               GXutil.writeLogRaw("Current: ",T01BG2_A11277Regc_d1[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPREGC01"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1BG1504( )
   {
      beforeValidate1BG1504( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BG1504( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1BG1504( 0) ;
         checkOptimisticConcurrency1BG1504( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1BG1504( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1BG1504( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01BG29 */
                  pr_default.execute(27, new Object[] {A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1), Boolean.valueOf(n11277Regc_d1), A11277Regc_d1, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC01");
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
            load1BG1504( ) ;
         }
         endLevel1BG1504( ) ;
      }
      closeExtendedTableCursors1BG1504( ) ;
   }

   public void update1BG1504( )
   {
      beforeValidate1BG1504( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1BG1504( ) ;
      }
      if ( ( nIsMod_1504 != 0 ) || ( nIsDirty_1504 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1BG1504( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1BG1504( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1BG1504( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01BG30 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n11277Regc_d1), A11277Regc_d1, A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC01");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPREGC01"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1BG1504( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1BG1504( ) ;
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
            endLevel1BG1504( ) ;
         }
      }
      closeExtendedTableCursors1BG1504( ) ;
   }

   public void deferredUpdate1BG1504( )
   {
   }

   public void delete1BG1504( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1BG1504( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1BG1504( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1BG1504( ) ;
         afterConfirm1BG1504( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1BG1504( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01BG31 */
               pr_default.execute(29, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod, Short.valueOf(A11276Regc_L1)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPREGC01");
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
      sMode1504 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1BG1504( ) ;
      Gx_mode = sMode1504 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1BG1504( )
   {
      standaloneModal1BG1504( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1BG1504( )
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

   public void scanStart1BG1504( )
   {
      /* Scan By routine */
      /* Using cursor T01BG32 */
      pr_default.execute(30, new Object[] {A396EmprCod, A11278Regc_c1, A457FasCod});
      RcdFound1504 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1504 = (short)(1) ;
         A11276Regc_L1 = T01BG32_A11276Regc_L1[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1BG1504( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1504 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1504 = (short)(1) ;
         A11276Regc_L1 = T01BG32_A11276Regc_L1[0] ;
      }
   }

   public void scanEnd1BG1504( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1BG1504( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1BG1504( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1BG1504( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1BG1504( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1BG1504( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1BG1504( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1BG1504( )
   {
      edtRegc_L1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_L1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_L1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtRegc_d1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_d1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_d1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public void send_integrity_lvl_hashes1BG1504( )
   {
   }

   public void send_integrity_lvl_hashes1BG1505( )
   {
   }

   public void send_integrity_lvl_hashes1BG1503( )
   {
   }

   public void subsflControlProps_351505( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_35_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_35_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_35_idx ;
      edtRegc_U1_Internalname = "REGC_U1_"+sGXsfl_35_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351505( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_35_fel_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_35_fel_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_35_fel_idx ;
      edtRegc_U1_Internalname = "REGC_U1_"+sGXsfl_35_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1BG1505( )
   {
      nRC_GXsfl_57 = 0 ;
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351505( ) ;
      sendRow1BG1505( ) ;
   }

   public void sendRow1BG1505( )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_35_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_35_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_35_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock4_Internalname,httpContext.getMessage( "Codigo Fase", ""),"","",lblTextblock4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1505_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,httpContext.getMessage( "Descripcion de Fase", ""),"","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(28),"chr",Integer.valueOf(1),"row",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock6_Internalname,httpContext.getMessage( "Ultima Linea", ""),"","",lblTextblock6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegc_U1_Internalname,GXutil.ltrim( localUtil.ntoc( A11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRegc_U1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11275Regc_U1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11275Regc_U1), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegc_U1_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtRegc_U1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol57( ) ;
      nGXsfl_57_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1504 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1504 = (short)(1) ;
            scanStart1BG1504( ) ;
            while ( RcdFound1504 != 0 )
            {
               init_level_properties1504( ) ;
               getByPrimaryKey1BG1504( ) ;
               addRow1BG1504( ) ;
               scanNext1BG1504( ) ;
            }
            scanEnd1BG1504( ) ;
            nBlankRcdCount1504 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B11275Regc_U1 = A11275Regc_U1 ;
         n11275Regc_U1 = false ;
         standaloneNotModal1BG1504( ) ;
         standaloneModal1BG1504( ) ;
         sMode1504 = Gx_mode ;
         while ( nGXsfl_57_idx < nRC_GXsfl_57 )
         {
            bGXsfl_57_Refreshing = true ;
            readRow1BG1504( ) ;
            edtavnRcdDeleted_1504_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1504_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1504_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1504_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtRegc_L1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGC_L1_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRegc_L1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_L1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtRegc_d1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGC_D1_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRegc_d1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_d1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            if ( ( nRcdExists_1504 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1BG1504( ) ;
            }
            sendRow1BG1504( ) ;
            bGXsfl_57_Refreshing = false ;
         }
         Gx_mode = sMode1504 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A11275Regc_U1 = B11275Regc_U1 ;
         n11275Regc_U1 = false ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1504 = (short)(5) ;
         nRcdExists_1504 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1BG1504( ) ;
            while ( RcdFound1504 != 0 )
            {
               sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
               subsflControlProps_571504( ) ;
               init_level_properties1504( ) ;
               standaloneNotModal1BG1504( ) ;
               getByPrimaryKey1BG1504( ) ;
               standaloneModal1BG1504( ) ;
               addRow1BG1504( ) ;
               scanNext1BG1504( ) ;
            }
            scanEnd1BG1504( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1504 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571504( ) ;
      initAll1BG1504( ) ;
      init_level_properties1504( ) ;
      B11275Regc_U1 = A11275Regc_U1 ;
      n11275Regc_U1 = false ;
      nRcdExists_1504 = (short)(0) ;
      nIsMod_1504 = (short)(0) ;
      nRcdDeleted_1504 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 35 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_35_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1504 = (short)(nBlankRcdUsr1504+nBlankRcdCount1504) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1504 > 0 )
      {
         standaloneNotModal1BG1504( ) ;
         standaloneModal1BG1504( ) ;
         addRow1BG1504( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtRegc_L1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1504 = (short)(nBlankRcdCount1504-1) ;
      }
      Gx_mode = sMode1504 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A11275Regc_U1 = B11275Regc_U1 ;
      n11275Regc_U1 = false ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_35_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_35_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_35_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1BG1505( ) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z11275Regc_U1_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11275Regc_U1_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11275Regc_U1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_57_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1505_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1505_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1505_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1505, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REGC_U1_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_U1_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_35_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1BG1505( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351505( ) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRegc_U1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGC_U1_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A11275Regc_U1 = (short)(localUtil.ctol( httpContext.cgiGet( edtRegc_U1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n11275Regc_U1 = false ;
      GXCCtl = "Z457FasCod_" + sGXsfl_35_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11275Regc_U1_" + sGXsfl_35_idx ;
      Z11275Regc_U1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O11275Regc_U1_" + sGXsfl_35_idx ;
      O11275Regc_U1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_35_idx ;
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1505_" + sGXsfl_35_idx ;
      nRcdDeleted_1505 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1505_" + sGXsfl_35_idx ;
      nRcdExists_1505 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1505_" + sGXsfl_35_idx ;
      nIsMod_1505 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_35_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_35_idx ;
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_571504( )
   {
      edtavnRcdDeleted_1504_Internalname = "vNRCDDELETED_1504_"+sGXsfl_57_idx ;
      edtRegc_L1_Internalname = "REGC_L1_"+sGXsfl_57_idx ;
      edtRegc_d1_Internalname = "REGC_D1_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_571504( )
   {
      edtavnRcdDeleted_1504_Internalname = "vNRCDDELETED_1504_"+sGXsfl_57_fel_idx ;
      edtRegc_L1_Internalname = "REGC_L1_"+sGXsfl_57_fel_idx ;
      edtRegc_d1_Internalname = "REGC_D1_"+sGXsfl_57_fel_idx ;
   }

   public void addRow1BG1504( )
   {
      nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571504( ) ;
      sendRow1BG1504( ) ;
   }

   public void sendRow1BG1504( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_57_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1504_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1505_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1504_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1504_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1504), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1504), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1504_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1504_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1504_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1505_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegc_L1_Internalname,GXutil.ltrim( localUtil.ntoc( A11276Regc_L1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11276Regc_L1), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegc_L1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRegc_L1_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1504_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1505_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegc_d1_Internalname,GXutil.rtrim( A11277Regc_d1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegc_d1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtRegc_d1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1BG1504( ) ;
      GXCCtl = "Z11276Regc_L1_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11276Regc_L1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11277Regc_d1_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11277Regc_d1));
      GXCCtl = "nRcdDeleted_1504_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1504_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1504_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1504, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1504_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1504_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REGC_L1_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_L1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "REGC_D1_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_d1_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1BG1504( )
   {
      nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571504( ) ;
      edtavnRcdDeleted_1504_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1504_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRegc_L1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGC_L1_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRegc_d1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "REGC_D1_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1504_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1504_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1504");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1504_Internalname ;
         wbErr = true ;
         nRcdDeleted_1504 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1504 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1504_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRegc_L1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRegc_L1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "REGC_L1_" + sGXsfl_57_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRegc_L1_Internalname ;
         wbErr = true ;
         A11276Regc_L1 = (short)(0) ;
      }
      else
      {
         A11276Regc_L1 = (short)(localUtil.ctol( httpContext.cgiGet( edtRegc_L1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11277Regc_d1 = httpContext.cgiGet( edtRegc_d1_Internalname) ;
      n11277Regc_d1 = false ;
      GXCCtl = "Z11276Regc_L1_" + sGXsfl_57_idx ;
      Z11276Regc_L1 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11277Regc_d1_" + sGXsfl_57_idx ;
      Z11277Regc_d1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1504_" + sGXsfl_57_idx ;
      nRcdDeleted_1504 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1504_" + sGXsfl_57_idx ;
      nRcdExists_1504 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1504_" + sGXsfl_57_idx ;
      nIsMod_1504 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtRegc_L1_Enabled = edtRegc_L1_Enabled ;
      defedtRegc_U1_Enabled = edtRegc_U1_Enabled ;
      defedtFasCod_Enabled = edtFasCod_Enabled ;
   }

   public void confirmValues1BG0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351505( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351505( ) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z11275Regc_U1_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z11275Regc_U1_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11275Regc_U1_"+sGXsfl_35_idx) ;
      }
      nGXsfl_57_idx = 0 ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571504( ) ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_571504( ) ;
         httpContext.changePostValue( "Z11276Regc_L1_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z11276Regc_L1_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11276Regc_L1_"+sGXsfl_57_idx) ;
         httpContext.changePostValue( "Z11277Regc_d1_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z11277Regc_d1_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11277Regc_d1_"+sGXsfl_57_idx) ;
      }
      httpContext.changePostValue( "O11275Regc_U1", httpContext.cgiGet( "T11275Regc_U1")) ;
      httpContext.deletePostValue( "T11275Regc_U1") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tregc00", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11278Regc_c1", GXutil.rtrim( Z11278Regc_c1));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tregc00", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TREGC00" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MASTER DE TIPOS", "") ;
   }

   public void initializeNonKey1BG1503( )
   {
   }

   public void initAll1BG1503( )
   {
      A11278Regc_c1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11278Regc_c1", A11278Regc_c1);
      initializeNonKey1BG1503( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1BG1505( )
   {
      A460FasDsc = "" ;
      A11275Regc_U1 = (short)(0) ;
      n11275Regc_U1 = false ;
      O11275Regc_U1 = A11275Regc_U1 ;
      n11275Regc_U1 = false ;
      Z11275Regc_U1 = (short)(0) ;
   }

   public void initAll1BG1505( )
   {
      A457FasCod = "" ;
      initializeNonKey1BG1505( ) ;
   }

   public void standaloneModalInsert1BG1505( )
   {
   }

   public void initializeNonKey1BG1504( )
   {
      A11277Regc_d1 = "" ;
      n11277Regc_d1 = false ;
      Z11277Regc_d1 = "" ;
   }

   public void initAll1BG1504( )
   {
      A11276Regc_L1 = (short)(0) ;
      initializeNonKey1BG1504( ) ;
   }

   public void standaloneModalInsert1BG1504( )
   {
      A11275Regc_U1 = i11275Regc_U1 ;
      n11275Regc_U1 = false ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564243", true, true);
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
      httpContext.AddJavascriptSource("tregc00.js", "?20268241564243", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1505( )
   {
      edtRegc_U1_Enabled = defedtRegc_U1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_U1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_U1_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void init_level_properties1504( )
   {
      edtRegc_L1_Enabled = defedtRegc_L1_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRegc_L1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRegc_L1_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public void startgridcontrol35( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock4_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock5_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock6_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11275Regc_U1, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_U1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol57( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1504, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1504_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11276Regc_L1, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_L1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A11277Regc_d1));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRegc_d1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtRegc_c1_Internalname = "REGC_C1" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtFasCod_Internalname = "FASCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtFasDsc_Internalname = "FASDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRegc_U1_Internalname = "REGC_U1" ;
      edtavnRcdDeleted_1504_Internalname = "vNRCDDELETED_1504" ;
      edtRegc_L1_Internalname = "REGC_L1" ;
      edtRegc_d1_Internalname = "REGC_D1" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock6_Caption = httpContext.getMessage( "Ultima Linea", "") ;
      lblTextblock5_Caption = httpContext.getMessage( "Descripcion de Fase", "") ;
      lblTextblock4_Caption = httpContext.getMessage( "Codigo Fase", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MASTER DE TIPOS", "") );
      edtRegc_d1_Jsonclick = "" ;
      edtRegc_L1_Jsonclick = "" ;
      edtavnRcdDeleted_1504_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtRegc_U1_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtRegc_d1_Enabled = 1 ;
      edtRegc_L1_Enabled = 1 ;
      edtavnRcdDeleted_1504_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtRegc_U1_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRegc_c1_Jsonclick = "" ;
      edtRegc_c1_Backcolor = (int)(0xFFFFFF) ;
      edtRegc_c1_Enabled = 1 ;
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
      subsflControlProps_351505( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BG1505( ) ;
         standaloneModal1BG1505( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BG1505( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351505( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_571504( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1BG1505( ) ;
         standaloneModal1BG1505( ) ;
         standaloneNotModal1BG1504( ) ;
         standaloneModal1BG1504( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1BG1504( ) ;
         nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_571504( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T01BG33 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01BG33_A407EmprNom[0] ;
      n407EmprNom = T01BG33_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(31);
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

   public void valid_Regc_c1( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", GXutil.rtrim( AV8UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11278Regc_c1", GXutil.rtrim( Z11278Regc_c1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV8UsurCod", GXutil.rtrim( ZV8UsurCod));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      /* Using cursor T01BG24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01BG24_A460FasDsc[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
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
      setEventMetadata("'COPIAR DATOS FASE ANTERIOR'","{handler:'e121BG2',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11278Regc_c1',fld:'REGC_C1',pic:''}]");
      setEventMetadata("'COPIAR DATOS FASE ANTERIOR'",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A11278Regc_c1',fld:'REGC_C1',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_REGC_C1","{handler:'valid_Regc_c1',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11278Regc_c1',fld:'REGC_C1',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''}]");
      setEventMetadata("VALID_REGC_C1",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z11278Regc_c1'},{av:'Z407EmprNom'},{av:'ZV8UsurCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_REGC_U1","{handler:'valid_Regc_u1',iparms:[]");
      setEventMetadata("VALID_REGC_U1",",oparms:[]}");
      setEventMetadata("VALID_REGC_L1","{handler:'valid_Regc_l1',iparms:[]");
      setEventMetadata("VALID_REGC_L1",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Regc_d1',iparms:[]");
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
      pr_default.close(22);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z11278Regc_c1 = "" ;
      Z457FasCod = "" ;
      Z11277Regc_d1 = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
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
      A11278Regc_c1 = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1505 = "" ;
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
      sMode1503 = "" ;
      GXCCtl = "" ;
      A11277Regc_d1 = "" ;
      A460FasDsc = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      T01BG9_A407EmprNom = new String[] {""} ;
      T01BG9_n407EmprNom = new boolean[] {false} ;
      T01BG10_A11278Regc_c1 = new String[] {""} ;
      T01BG10_A407EmprNom = new String[] {""} ;
      T01BG10_n407EmprNom = new boolean[] {false} ;
      T01BG10_A396EmprCod = new String[] {""} ;
      T01BG11_A396EmprCod = new String[] {""} ;
      T01BG11_A11278Regc_c1 = new String[] {""} ;
      T01BG8_A11278Regc_c1 = new String[] {""} ;
      T01BG8_A396EmprCod = new String[] {""} ;
      T01BG12_A396EmprCod = new String[] {""} ;
      T01BG12_A11278Regc_c1 = new String[] {""} ;
      T01BG13_A396EmprCod = new String[] {""} ;
      T01BG13_A11278Regc_c1 = new String[] {""} ;
      T01BG7_A11278Regc_c1 = new String[] {""} ;
      T01BG7_A396EmprCod = new String[] {""} ;
      T01BG16_A396EmprCod = new String[] {""} ;
      T01BG16_A11278Regc_c1 = new String[] {""} ;
      T01BG16_A457FasCod = new String[] {""} ;
      T01BG17_A396EmprCod = new String[] {""} ;
      T01BG17_A11278Regc_c1 = new String[] {""} ;
      Z460FasDsc = "" ;
      T01BG18_A11278Regc_c1 = new String[] {""} ;
      T01BG18_A460FasDsc = new String[] {""} ;
      T01BG18_A11275Regc_U1 = new short[1] ;
      T01BG18_n11275Regc_U1 = new boolean[] {false} ;
      T01BG18_A396EmprCod = new String[] {""} ;
      T01BG18_A457FasCod = new String[] {""} ;
      T01BG6_A460FasDsc = new String[] {""} ;
      T01BG19_A460FasDsc = new String[] {""} ;
      T01BG20_A396EmprCod = new String[] {""} ;
      T01BG20_A11278Regc_c1 = new String[] {""} ;
      T01BG20_A457FasCod = new String[] {""} ;
      T01BG5_A11278Regc_c1 = new String[] {""} ;
      T01BG5_A11275Regc_U1 = new short[1] ;
      T01BG5_n11275Regc_U1 = new boolean[] {false} ;
      T01BG5_A396EmprCod = new String[] {""} ;
      T01BG5_A457FasCod = new String[] {""} ;
      T01BG4_A11278Regc_c1 = new String[] {""} ;
      T01BG4_A11275Regc_U1 = new short[1] ;
      T01BG4_n11275Regc_U1 = new boolean[] {false} ;
      T01BG4_A396EmprCod = new String[] {""} ;
      T01BG4_A457FasCod = new String[] {""} ;
      T01BG24_A460FasDsc = new String[] {""} ;
      T01BG26_A396EmprCod = new String[] {""} ;
      T01BG26_A11278Regc_c1 = new String[] {""} ;
      T01BG26_A457FasCod = new String[] {""} ;
      T01BG27_A11278Regc_c1 = new String[] {""} ;
      T01BG27_A457FasCod = new String[] {""} ;
      T01BG27_A11276Regc_L1 = new short[1] ;
      T01BG27_A11277Regc_d1 = new String[] {""} ;
      T01BG27_n11277Regc_d1 = new boolean[] {false} ;
      T01BG27_A396EmprCod = new String[] {""} ;
      T01BG28_A396EmprCod = new String[] {""} ;
      T01BG28_A11278Regc_c1 = new String[] {""} ;
      T01BG28_A457FasCod = new String[] {""} ;
      T01BG28_A11276Regc_L1 = new short[1] ;
      T01BG3_A11278Regc_c1 = new String[] {""} ;
      T01BG3_A457FasCod = new String[] {""} ;
      T01BG3_A11276Regc_L1 = new short[1] ;
      T01BG3_A11277Regc_d1 = new String[] {""} ;
      T01BG3_n11277Regc_d1 = new boolean[] {false} ;
      T01BG3_A396EmprCod = new String[] {""} ;
      sMode1504 = "" ;
      T01BG2_A11278Regc_c1 = new String[] {""} ;
      T01BG2_A457FasCod = new String[] {""} ;
      T01BG2_A11276Regc_L1 = new short[1] ;
      T01BG2_A11277Regc_d1 = new String[] {""} ;
      T01BG2_n11277Regc_d1 = new boolean[] {false} ;
      T01BG2_A396EmprCod = new String[] {""} ;
      T01BG32_A396EmprCod = new String[] {""} ;
      T01BG32_A11278Regc_c1 = new String[] {""} ;
      T01BG32_A457FasCod = new String[] {""} ;
      T01BG32_A11276Regc_L1 = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock4_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01BG33_A407EmprNom = new String[] {""} ;
      T01BG33_n407EmprNom = new boolean[] {false} ;
      ZV8UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ11278Regc_c1 = "" ;
      ZZ407EmprNom = "" ;
      ZZV8UsurCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tregc00__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tregc00__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tregc00__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tregc00__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tregc00__default(),
         new Object[] {
             new Object[] {
            T01BG2_A11278Regc_c1, T01BG2_A457FasCod, T01BG2_A11276Regc_L1, T01BG2_A11277Regc_d1, T01BG2_n11277Regc_d1, T01BG2_A396EmprCod
            }
            , new Object[] {
            T01BG3_A11278Regc_c1, T01BG3_A457FasCod, T01BG3_A11276Regc_L1, T01BG3_A11277Regc_d1, T01BG3_n11277Regc_d1, T01BG3_A396EmprCod
            }
            , new Object[] {
            T01BG4_A11278Regc_c1, T01BG4_A11275Regc_U1, T01BG4_n11275Regc_U1, T01BG4_A396EmprCod, T01BG4_A457FasCod
            }
            , new Object[] {
            T01BG5_A11278Regc_c1, T01BG5_A11275Regc_U1, T01BG5_n11275Regc_U1, T01BG5_A396EmprCod, T01BG5_A457FasCod
            }
            , new Object[] {
            T01BG6_A460FasDsc
            }
            , new Object[] {
            T01BG7_A11278Regc_c1, T01BG7_A396EmprCod
            }
            , new Object[] {
            T01BG8_A11278Regc_c1, T01BG8_A396EmprCod
            }
            , new Object[] {
            T01BG9_A407EmprNom, T01BG9_n407EmprNom
            }
            , new Object[] {
            T01BG10_A11278Regc_c1, T01BG10_A407EmprNom, T01BG10_n407EmprNom, T01BG10_A396EmprCod
            }
            , new Object[] {
            T01BG11_A396EmprCod, T01BG11_A11278Regc_c1
            }
            , new Object[] {
            T01BG12_A396EmprCod, T01BG12_A11278Regc_c1
            }
            , new Object[] {
            T01BG13_A396EmprCod, T01BG13_A11278Regc_c1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BG16_A396EmprCod, T01BG16_A11278Regc_c1, T01BG16_A457FasCod
            }
            , new Object[] {
            T01BG17_A396EmprCod, T01BG17_A11278Regc_c1
            }
            , new Object[] {
            T01BG18_A11278Regc_c1, T01BG18_A460FasDsc, T01BG18_A11275Regc_U1, T01BG18_n11275Regc_U1, T01BG18_A396EmprCod, T01BG18_A457FasCod
            }
            , new Object[] {
            T01BG19_A460FasDsc
            }
            , new Object[] {
            T01BG20_A396EmprCod, T01BG20_A11278Regc_c1, T01BG20_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BG24_A460FasDsc
            }
            , new Object[] {
            }
            , new Object[] {
            T01BG26_A396EmprCod, T01BG26_A11278Regc_c1, T01BG26_A457FasCod
            }
            , new Object[] {
            T01BG27_A11278Regc_c1, T01BG27_A457FasCod, T01BG27_A11276Regc_L1, T01BG27_A11277Regc_d1, T01BG27_n11277Regc_d1, T01BG27_A396EmprCod
            }
            , new Object[] {
            T01BG28_A396EmprCod, T01BG28_A11278Regc_c1, T01BG28_A457FasCod, T01BG28_A11276Regc_L1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01BG32_A396EmprCod, T01BG32_A11278Regc_c1, T01BG32_A457FasCod, T01BG32_A11276Regc_L1
            }
            , new Object[] {
            T01BG33_A407EmprNom, T01BG33_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TREGC00" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private short Z11275Regc_U1 ;
   private short O11275Regc_U1 ;
   private short nRcdDeleted_1505 ;
   private short nRcdExists_1505 ;
   private short nIsMod_1505 ;
   private short Z11276Regc_L1 ;
   private short nRcdDeleted_1504 ;
   private short nRcdExists_1504 ;
   private short nIsMod_1504 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11275Regc_U1 ;
   private short nBlankRcdCount1505 ;
   private short RcdFound1505 ;
   private short nBlankRcdUsr1505 ;
   private short s11275Regc_U1 ;
   private short RcdFound1504 ;
   private short A11276Regc_L1 ;
   private short T11275Regc_U1 ;
   private short RcdFound1503 ;
   private short nIsDirty_1503 ;
   private short nIsDirty_1505 ;
   private short nIsDirty_1504 ;
   private short nBlankRcdCount1504 ;
   private short B11275Regc_U1 ;
   private short nBlankRcdUsr1504 ;
   private short i11275Regc_U1 ;
   private short subGrid1_Borderwidth ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int nRC_GXsfl_57 ;
   private int nGXsfl_57_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtRegc_c1_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtRegc_U1_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1504_Enabled ;
   private int edtRegc_L1_Enabled ;
   private int edtRegc_d1_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtRegc_L1_Enabled ;
   private int defedtRegc_U1_Enabled ;
   private int defedtFasCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtRegc_c1_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z11278Regc_c1 ;
   private String Z457FasCod ;
   private String Z11277Regc_d1 ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRegc_c1_Internalname ;
   private String sGXsfl_35_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_57_idx="0001" ;
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
   private String A11278Regc_c1 ;
   private String edtRegc_c1_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1505 ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtRegc_U1_Internalname ;
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
   private String edtavnRcdDeleted_1504_Internalname ;
   private String sMode1503 ;
   private String GXCCtl ;
   private String edtRegc_L1_Internalname ;
   private String edtRegc_d1_Internalname ;
   private String A11277Regc_d1 ;
   private String A460FasDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String sMode1504 ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock6_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String ROClassString ;
   private String edtFasCod_Jsonclick ;
   private String lblTextblock5_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String lblTextblock6_Jsonclick ;
   private String edtRegc_U1_Jsonclick ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1504_Jsonclick ;
   private String edtRegc_L1_Jsonclick ;
   private String edtRegc_d1_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock4_Caption ;
   private String lblTextblock5_Caption ;
   private String lblTextblock6_Caption ;
   private String subGrid2_Header ;
   private String ZV8UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ11278Regc_c1 ;
   private String ZZ407EmprNom ;
   private String ZZV8UsurCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n11275Regc_U1 ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n11277Regc_d1 ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01BG9_A407EmprNom ;
   private boolean[] T01BG9_n407EmprNom ;
   private String[] T01BG10_A11278Regc_c1 ;
   private String[] T01BG10_A407EmprNom ;
   private boolean[] T01BG10_n407EmprNom ;
   private String[] T01BG10_A396EmprCod ;
   private String[] T01BG11_A396EmprCod ;
   private String[] T01BG11_A11278Regc_c1 ;
   private String[] T01BG8_A11278Regc_c1 ;
   private String[] T01BG8_A396EmprCod ;
   private String[] T01BG12_A396EmprCod ;
   private String[] T01BG12_A11278Regc_c1 ;
   private String[] T01BG13_A396EmprCod ;
   private String[] T01BG13_A11278Regc_c1 ;
   private String[] T01BG7_A11278Regc_c1 ;
   private String[] T01BG7_A396EmprCod ;
   private String[] T01BG16_A396EmprCod ;
   private String[] T01BG16_A11278Regc_c1 ;
   private String[] T01BG16_A457FasCod ;
   private String[] T01BG17_A396EmprCod ;
   private String[] T01BG17_A11278Regc_c1 ;
   private String[] T01BG18_A11278Regc_c1 ;
   private String[] T01BG18_A460FasDsc ;
   private short[] T01BG18_A11275Regc_U1 ;
   private boolean[] T01BG18_n11275Regc_U1 ;
   private String[] T01BG18_A396EmprCod ;
   private String[] T01BG18_A457FasCod ;
   private String[] T01BG6_A460FasDsc ;
   private String[] T01BG19_A460FasDsc ;
   private String[] T01BG20_A396EmprCod ;
   private String[] T01BG20_A11278Regc_c1 ;
   private String[] T01BG20_A457FasCod ;
   private String[] T01BG5_A11278Regc_c1 ;
   private short[] T01BG5_A11275Regc_U1 ;
   private boolean[] T01BG5_n11275Regc_U1 ;
   private String[] T01BG5_A396EmprCod ;
   private String[] T01BG5_A457FasCod ;
   private String[] T01BG4_A11278Regc_c1 ;
   private short[] T01BG4_A11275Regc_U1 ;
   private boolean[] T01BG4_n11275Regc_U1 ;
   private String[] T01BG4_A396EmprCod ;
   private String[] T01BG4_A457FasCod ;
   private String[] T01BG24_A460FasDsc ;
   private String[] T01BG26_A396EmprCod ;
   private String[] T01BG26_A11278Regc_c1 ;
   private String[] T01BG26_A457FasCod ;
   private String[] T01BG27_A11278Regc_c1 ;
   private String[] T01BG27_A457FasCod ;
   private short[] T01BG27_A11276Regc_L1 ;
   private String[] T01BG27_A11277Regc_d1 ;
   private boolean[] T01BG27_n11277Regc_d1 ;
   private String[] T01BG27_A396EmprCod ;
   private String[] T01BG28_A396EmprCod ;
   private String[] T01BG28_A11278Regc_c1 ;
   private String[] T01BG28_A457FasCod ;
   private short[] T01BG28_A11276Regc_L1 ;
   private String[] T01BG3_A11278Regc_c1 ;
   private String[] T01BG3_A457FasCod ;
   private short[] T01BG3_A11276Regc_L1 ;
   private String[] T01BG3_A11277Regc_d1 ;
   private boolean[] T01BG3_n11277Regc_d1 ;
   private String[] T01BG3_A396EmprCod ;
   private String[] T01BG2_A11278Regc_c1 ;
   private String[] T01BG2_A457FasCod ;
   private short[] T01BG2_A11276Regc_L1 ;
   private String[] T01BG2_A11277Regc_d1 ;
   private boolean[] T01BG2_n11277Regc_d1 ;
   private String[] T01BG2_A396EmprCod ;
   private String[] T01BG32_A396EmprCod ;
   private String[] T01BG32_A11278Regc_c1 ;
   private String[] T01BG32_A457FasCod ;
   private short[] T01BG32_A11276Regc_L1 ;
   private String[] T01BG33_A407EmprNom ;
   private boolean[] T01BG33_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tregc00__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregc00__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregc00__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregc00__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tregc00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01BG2", "SELECT Regc_c1, FasCod, Regc_L1, Regc_d1, EmprCod FROM TXPREGC01 WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? AND Regc_L1 = ?  FOR UPDATE OF Regc_d1 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG3", "SELECT Regc_c1, FasCod, Regc_L1, Regc_d1, EmprCod FROM TXPREGC01 WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? AND Regc_L1 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG4", "SELECT Regc_c1, Regc_U1, EmprCod, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ?  FOR UPDATE OF Regc_U1 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG5", "SELECT Regc_c1, Regc_U1, EmprCod, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG6", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG7", "SELECT Regc_c1, EmprCod FROM TXPREGC00 WHERE EmprCod = ? AND Regc_c1 = ?  FOR UPDATE OF Regc_c1 NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG8", "SELECT Regc_c1, EmprCod FROM TXPREGC00 WHERE EmprCod = ? AND Regc_c1 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG10", "SELECT /*+ FIRST_ROWS(100) */ TM1.Regc_c1, T2.EmprNom, TM1.EmprCod FROM (TXPREGC00 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Regc_c1 = ? ORDER BY TM1.EmprCod, TM1.Regc_c1 ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Regc_c1 FROM TXPREGC00 WHERE EmprCod = ? AND Regc_c1 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Regc_c1 FROM TXPREGC00 WHERE ( Regc_c1 > ?) and EmprCod = ? ORDER BY EmprCod, Regc_c1) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BG13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Regc_c1 FROM TXPREGC00 WHERE ( Regc_c1 < ?) and EmprCod = ? ORDER BY EmprCod DESC, Regc_c1 DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01BG14", "INSERT INTO TXPREGC00(Regc_c1, EmprCod) VALUES(?, ?)", GX_NOMASK, "TXPREGC00")
         ,new UpdateCursor("T01BG15", "DELETE FROM TXPREGC00  WHERE EmprCod = ? AND Regc_c1 = ?", GX_NOMASK, "TXPREGC00")
         ,new ForEachCursor("T01BG16", "SELECT * FROM (SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND Regc_c1 = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01BG17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Regc_c1 FROM TXPREGC00 WHERE EmprCod = ? ORDER BY EmprCod, Regc_c1 ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG18", "SELECT T1.Regc_c1, T2.FasDsc, T1.Regc_U1, T1.EmprCod, T1.FasCod FROM (TXPREGC02 T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.Regc_c1 = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.Regc_c1, T1.FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG19", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG20", "SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BG21", "INSERT INTO TXPREGC02(Regc_c1, Regc_U1, EmprCod, FasCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPREGC02")
         ,new UpdateCursor("T01BG22", "UPDATE TXPREGC02 SET Regc_U1=?  WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ?", GX_NOMASK, "TXPREGC02")
         ,new UpdateCursor("T01BG23", "DELETE FROM TXPREGC02  WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ?", GX_NOMASK, "TXPREGC02")
         ,new ForEachCursor("T01BG24", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BG25", "UPDATE TXPREGC02 SET Regc_U1=?  WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ?", GX_NOMASK, "TXPREGC02")
         ,new ForEachCursor("T01BG26", "SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? and Regc_c1 = ? ORDER BY EmprCod, Regc_c1, FasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG27", "SELECT Regc_c1, FasCod, Regc_L1, Regc_d1, EmprCod FROM TXPREGC01 WHERE EmprCod = ? and Regc_c1 = ? and FasCod = ? and Regc_L1 = ? ORDER BY EmprCod, Regc_c1, FasCod, Regc_L1 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG28", "SELECT EmprCod, Regc_c1, FasCod, Regc_L1 FROM TXPREGC01 WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? AND Regc_L1 = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01BG29", "INSERT INTO TXPREGC01(Regc_c1, FasCod, Regc_L1, Regc_d1, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPREGC01")
         ,new UpdateCursor("T01BG30", "UPDATE TXPREGC01 SET Regc_d1=?  WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? AND Regc_L1 = ?", GX_NOMASK, "TXPREGC01")
         ,new UpdateCursor("T01BG31", "DELETE FROM TXPREGC01  WHERE EmprCod = ? AND Regc_c1 = ? AND FasCod = ? AND Regc_L1 = ?", GX_NOMASK, "TXPREGC01")
         ,new ForEachCursor("T01BG32", "SELECT EmprCod, Regc_c1, FasCod, Regc_L1 FROM TXPREGC01 WHERE EmprCod = ? and Regc_c1 = ? and FasCod = ? ORDER BY EmprCod, Regc_c1, FasCod, Regc_L1 ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01BG33", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 40);
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 8);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

