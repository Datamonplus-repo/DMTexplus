package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrnmenus_impl extends GXDataArea
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
         A943GrpId = httpContext.GetPar( "GrpId") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A943GrpId) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MNUCAB", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMnuId_Internalname ;
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
      nRC_GXsfl_30 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_30"))) ;
      nGXsfl_30_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_30_idx"))) ;
      sGXsfl_30_idx = httpContext.GetPar( "sGXsfl_30_idx") ;
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

   public ttrnmenus_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrnmenus_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrnmenus_impl.class ));
   }

   public ttrnmenus_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrnMENUS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Identificacion del Menu", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnMENUS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuId_Internalname, GXutil.rtrim( A945MnuId), GXutil.rtrim( localUtil.format( A945MnuId, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuId_Jsonclick, 0, "", "", "", "", "", 1, edtMnuId_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Descripción del Menú", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrnMENUS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuTxt_Internalname, GXutil.rtrim( A951MnuTxt), GXutil.rtrim( localUtil.format( A951MnuTxt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuTxt_Jsonclick, 0, "", "", "", "", "", 1, edtMnuTxt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrnMENUS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol30( ) ;
      /* Save parent mode. */
      sMode125 = Gx_mode ;
      nGXsfl_30_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount125 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_125 = (short)(1) ;
            scanStart1J5125( ) ;
            while ( RcdFound125 != 0 )
            {
               init_level_properties125( ) ;
               getByPrimaryKey1J5125( ) ;
               addRow1J5125( ) ;
               scanNext1J5125( ) ;
            }
            scanEnd1J5125( ) ;
            nBlankRcdCount125 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J5125( ) ;
         standaloneModal1J5125( ) ;
         sMode125 = Gx_mode ;
         while ( nGXsfl_30_idx < nRC_GXsfl_30 )
         {
            bGXsfl_30_Refreshing = true ;
            readRow1J5125( ) ;
            edtMnuOp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUOP_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_30_Refreshing);
            edtMnuPgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGM_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), !bGXsfl_30_Refreshing);
            edtMnuPgmTpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTPO_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), !bGXsfl_30_Refreshing);
            edtMnuPgmTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTXT_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), !bGXsfl_30_Refreshing);
            if ( ( nRcdExists_125 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J5125( ) ;
            }
            sendRow1J5125( ) ;
            bGXsfl_30_Refreshing = false ;
         }
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount125 = (short)(5) ;
         nRcdExists_125 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J5125( ) ;
            while ( RcdFound125 != 0 )
            {
               sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_30125( ) ;
               init_level_properties125( ) ;
               standaloneNotModal1J5125( ) ;
               getByPrimaryKey1J5125( ) ;
               standaloneModal1J5125( ) ;
               addRow1J5125( ) ;
               scanNext1J5125( ) ;
            }
            scanEnd1J5125( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode125 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_30125( ) ;
      initAll1J5125( ) ;
      init_level_properties125( ) ;
      nRcdExists_125 = (short)(0) ;
      nIsMod_125 = (short)(0) ;
      nRcdDeleted_125 = (short)(0) ;
      nBlankRcdCount125 = (short)(nBlankRcdUsr125+nBlankRcdCount125) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount125 > 0 )
      {
         standaloneNotModal1J5125( ) ;
         standaloneModal1J5125( ) ;
         addRow1J5125( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMnuOp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount125 = (short)(nBlankRcdCount125-1) ;
      }
      Gx_mode = sMode125 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode125 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrnMENUS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrnMENUS.htm");
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
      e111J52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z945MnuId = httpContext.cgiGet( "Z945MnuId") ;
            Z951MnuTxt = httpContext.cgiGet( "Z951MnuTxt") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A945MnuId = GXutil.upper( httpContext.cgiGet( edtMnuId_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            A951MnuTxt = httpContext.cgiGet( edtMnuTxt_Internalname) ;
            n951MnuTxt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
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
               A945MnuId = httpContext.GetPar( "MnuId") ;
               httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
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
                        e111J52 ();
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
            initAll1J5124( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_126_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_126_Enabled), 5, 0), !bGXsfl_57_Refreshing);
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
      disableAttributes1J5124( ) ;
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

   public void confirm_1J50( )
   {
      beforeValidate1J5124( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1J5124( ) ;
         }
         else
         {
            checkExtendedTable1J5124( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1J5124( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode124 = Gx_mode ;
         confirm_1J5125( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode124 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode124 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1J50( ) ;
      }
   }

   public void confirm_1J5126( )
   {
      nGXsfl_57_idx = 0 ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         readRow1J5126( ) ;
         if ( ( nRcdExists_126 != 0 ) || ( nIsMod_126 != 0 ) )
         {
            getKey1J5126( ) ;
            if ( ( nRcdExists_126 == 0 ) && ( nRcdDeleted_126 == 0 ) )
            {
               if ( RcdFound126 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J5126( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J5126( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1J5126( 5) ;
                     }
                     closeExtendedTableCursors1J5126( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMnuOp_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound126 != 0 )
               {
                  if ( nRcdDeleted_126 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J5126( ) ;
                     load1J5126( ) ;
                     beforeValidate1J5126( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J5126( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_126 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J5126( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J5126( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1J5126( 5) ;
                           }
                           closeExtendedTableCursors1J5126( ) ;
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
                  if ( nRcdDeleted_126 == 0 )
                  {
                     GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMnuOp_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_126_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGrpId_Internalname, GXutil.rtrim( A943GrpId)) ;
         httpContext.changePostValue( edtGrpTxt_Internalname, GXutil.rtrim( A944GrpTxt)) ;
         httpContext.changePostValue( edtMnuPri_Internalname, GXutil.ltrim( localUtil.ntoc( A950MnuPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z943GrpId_"+sGXsfl_57_idx, GXutil.rtrim( Z943GrpId)) ;
         httpContext.changePostValue( "ZT_"+"Z950MnuPri_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( Z950MnuPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_126_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_126_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_126_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_126 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_126_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_126_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPID_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPTXT_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPRI_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1J5125( )
   {
      nGXsfl_30_idx = 0 ;
      while ( nGXsfl_30_idx < nRC_GXsfl_30 )
      {
         readRow1J5125( ) ;
         if ( ( nRcdExists_125 != 0 ) || ( nIsMod_125 != 0 ) )
         {
            getKey1J5125( ) ;
            if ( ( nRcdExists_125 == 0 ) && ( nRcdDeleted_125 == 0 ) )
            {
               if ( RcdFound125 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1J5125( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1J5125( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1J5125( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode125 = Gx_mode ;
                        confirm_1J5126( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode125 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode125 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMnuOp_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound125 != 0 )
               {
                  if ( nRcdDeleted_125 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1J5125( ) ;
                     load1J5125( ) ;
                     beforeValidate1J5125( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1J5125( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_125 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1J5125( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1J5125( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1J5125( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode125 = Gx_mode ;
                              confirm_1J5126( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode125 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode125 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_125 == 0 )
                  {
                     GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMnuOp_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMnuOp_Internalname, GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMnuPgm_Internalname, GXutil.rtrim( A947MnuPgm)) ;
         httpContext.changePostValue( edtMnuPgmTpo_Internalname, GXutil.rtrim( A948MnuPgmTpo)) ;
         httpContext.changePostValue( edtMnuPgmTxt_Internalname, GXutil.rtrim( A949MnuPgmTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z946MnuOp_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z947MnuPgm_"+sGXsfl_30_idx, GXutil.rtrim( Z947MnuPgm)) ;
         httpContext.changePostValue( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_30_idx, GXutil.rtrim( Z948MnuPgmTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_30_idx, GXutil.rtrim( Z949MnuPgmTxt)) ;
         httpContext.changePostValue( "nRC_GXsfl_57_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_125_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_125_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_125_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_125 != 0 )
         {
            httpContext.changePostValue( "MNUOP_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGM_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTPO_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTXT_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1J50( )
   {
   }

   public void e111J52( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void zm1J5124( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z951MnuTxt = T01J58_A951MnuTxt[0] ;
         }
         else
         {
            Z951MnuTxt = A951MnuTxt ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z945MnuId = A945MnuId ;
         Z951MnuTxt = A951MnuTxt ;
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

   public void load1J5124( )
   {
      /* Using cursor T01J59 */
      pr_default.execute(7, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound124 = (short)(1) ;
         A951MnuTxt = T01J59_A951MnuTxt[0] ;
         n951MnuTxt = T01J59_n951MnuTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         zm1J5124( -2) ;
      }
      pr_default.close(7);
      onLoadActions1J5124( ) ;
   }

   public void onLoadActions1J5124( )
   {
   }

   public void checkExtendedTable1J5124( )
   {
      nIsDirty_124 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1J5124( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1J5124( )
   {
      /* Using cursor T01J510 */
      pr_default.execute(8, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound124 = (short)(1) ;
      }
      else
      {
         RcdFound124 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01J58 */
      pr_default.execute(6, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1J5124( 2) ;
         RcdFound124 = (short)(1) ;
         A945MnuId = T01J58_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         A951MnuTxt = T01J58_A951MnuTxt[0] ;
         n951MnuTxt = T01J58_n951MnuTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         Z945MnuId = A945MnuId ;
         sMode124 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1J5124( ) ;
         if ( AnyError == 1 )
         {
            RcdFound124 = (short)(0) ;
            initializeNonKey1J5124( ) ;
         }
         Gx_mode = sMode124 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound124 = (short)(0) ;
         initializeNonKey1J5124( ) ;
         sMode124 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode124 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1J5124( ) ;
      if ( RcdFound124 == 0 )
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
      RcdFound124 = (short)(0) ;
      /* Using cursor T01J511 */
      pr_default.execute(9, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01J511_A945MnuId[0], A945MnuId) < 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01J511_A945MnuId[0], A945MnuId) > 0 ) ) )
         {
            A945MnuId = T01J511_A945MnuId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            RcdFound124 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound124 = (short)(0) ;
      /* Using cursor T01J512 */
      pr_default.execute(10, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01J512_A945MnuId[0], A945MnuId) > 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01J512_A945MnuId[0], A945MnuId) < 0 ) ) )
         {
            A945MnuId = T01J512_A945MnuId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            RcdFound124 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1J5124( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1J5124( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound124 == 1 )
         {
            if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
            {
               A945MnuId = Z945MnuId ;
               httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MNUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1J5124( ) ;
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMnuId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1J5124( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MNUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMnuId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtMnuId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1J5124( ) ;
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
      if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
      {
         A945MnuId = Z945MnuId ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMnuId_Internalname ;
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
      getKey1J5124( ) ;
      if ( RcdFound124 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "MNUID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMnuId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
         {
            A945MnuId = Z945MnuId ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "MNUID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMnuId_Internalname ;
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
         if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MNUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMnuId_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnmenus");
      GX_FocusControl = edtMnuTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1J50( ) ;
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
      if ( RcdFound124 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMnuTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1J5124( ) ;
      if ( RcdFound124 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J5124( ) ;
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
      if ( RcdFound124 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuTxt_Internalname ;
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
      if ( RcdFound124 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuTxt_Internalname ;
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
      scanStart1J5124( ) ;
      if ( RcdFound124 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound124 != 0 )
         {
            scanNext1J5124( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMnuTxt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1J5124( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1J5124( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J57 */
         pr_default.execute(5, new Object[] {A945MnuId});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUCAB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z951MnuTxt, T01J57_A951MnuTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z951MnuTxt, T01J57_A951MnuTxt[0]) != 0 )
            {
               GXutil.writeLogln("ttrnmenus:[seudo value changed for attri]"+"MnuTxt");
               GXutil.writeLogRaw("Old: ",Z951MnuTxt);
               GXutil.writeLogRaw("Current: ",T01J57_A951MnuTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMNUCAB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J5124( )
   {
      beforeValidate1J5124( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J5124( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J5124( 0) ;
         checkOptimisticConcurrency1J5124( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J5124( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J5124( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J513 */
                  pr_default.execute(11, new Object[] {A945MnuId, Boolean.valueOf(n951MnuTxt), A951MnuTxt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
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
                        processLevel1J5124( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1J50( ) ;
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
            load1J5124( ) ;
         }
         endLevel1J5124( ) ;
      }
      closeExtendedTableCursors1J5124( ) ;
   }

   public void update1J5124( )
   {
      beforeValidate1J5124( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J5124( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J5124( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J5124( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1J5124( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J514 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n951MnuTxt), A951MnuTxt, A945MnuId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUCAB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1J5124( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1J5124( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1J50( ) ;
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
         endLevel1J5124( ) ;
      }
      closeExtendedTableCursors1J5124( ) ;
   }

   public void deferredUpdate1J5124( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J5124( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J5124( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J5124( ) ;
         afterConfirm1J5124( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J5124( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J515 */
               pr_default.execute(13, new Object[] {A945MnuId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound124 == 0 )
                     {
                        initAll1J5124( ) ;
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
                     resetCaption1J50( ) ;
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
      sMode124 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J5124( ) ;
      Gx_mode = sMode124 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J5124( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01J516 */
         pr_default.execute(14, new Object[] {A945MnuId});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MNUOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel1J5125( )
   {
      nGXsfl_30_idx = 0 ;
      while ( nGXsfl_30_idx < nRC_GXsfl_30 )
      {
         readRow1J5125( ) ;
         if ( ( nRcdExists_125 != 0 ) || ( nIsMod_125 != 0 ) )
         {
            standaloneNotModal1J5125( ) ;
            getKey1J5125( ) ;
            if ( ( nRcdExists_125 == 0 ) && ( nRcdDeleted_125 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J5125( ) ;
            }
            else
            {
               if ( RcdFound125 != 0 )
               {
                  if ( ( nRcdDeleted_125 != 0 ) && ( nRcdExists_125 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J5125( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_125 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J5125( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_125 == 0 )
                  {
                     GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMnuOp_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMnuOp_Internalname, GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMnuPgm_Internalname, GXutil.rtrim( A947MnuPgm)) ;
         httpContext.changePostValue( edtMnuPgmTpo_Internalname, GXutil.rtrim( A948MnuPgmTpo)) ;
         httpContext.changePostValue( edtMnuPgmTxt_Internalname, GXutil.rtrim( A949MnuPgmTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z946MnuOp_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z947MnuPgm_"+sGXsfl_30_idx, GXutil.rtrim( Z947MnuPgm)) ;
         httpContext.changePostValue( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_30_idx, GXutil.rtrim( Z948MnuPgmTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_30_idx, GXutil.rtrim( Z949MnuPgmTxt)) ;
         httpContext.changePostValue( "nRC_GXsfl_57_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_125_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_125_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_125_"+sGXsfl_30_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_125 != 0 )
         {
            httpContext.changePostValue( "MNUOP_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGM_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTPO_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTXT_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J5125( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_125 = (short)(0) ;
      nIsMod_125 = (short)(0) ;
      nRcdDeleted_125 = (short)(0) ;
   }

   public void processLevel1J5124( )
   {
      /* Save parent mode. */
      sMode124 = Gx_mode ;
      processNestedLevel1J5125( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode124 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1J5124( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1J5124( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrnmenus");
         if ( AnyError == 0 )
         {
            confirmValues1J50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrnmenus");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J5124( )
   {
      /* Using cursor T01J517 */
      pr_default.execute(15);
      RcdFound124 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound124 = (short)(1) ;
         A945MnuId = T01J517_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J5124( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound124 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound124 = (short)(1) ;
         A945MnuId = T01J517_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      }
   }

   public void scanEnd1J5124( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1J5124( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J5124( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J5124( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J5124( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J5124( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J5124( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J5124( )
   {
      edtMnuId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuId_Enabled), 5, 0), true);
      edtMnuTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuTxt_Enabled), 5, 0), true);
   }

   public void zm1J5125( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z947MnuPgm = T01J56_A947MnuPgm[0] ;
            Z948MnuPgmTpo = T01J56_A948MnuPgmTpo[0] ;
            Z949MnuPgmTxt = T01J56_A949MnuPgmTxt[0] ;
         }
         else
         {
            Z947MnuPgm = A947MnuPgm ;
            Z948MnuPgmTpo = A948MnuPgmTpo ;
            Z949MnuPgmTxt = A949MnuPgmTxt ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         Z947MnuPgm = A947MnuPgm ;
         Z948MnuPgmTpo = A948MnuPgmTpo ;
         Z949MnuPgmTxt = A949MnuPgmTxt ;
      }
   }

   public void standaloneNotModal1J5125( )
   {
   }

   public void standaloneModal1J5125( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMnuOp_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      }
      else
      {
         edtMnuOp_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      }
   }

   public void load1J5125( )
   {
      /* Using cursor T01J518 */
      pr_default.execute(16, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A947MnuPgm = T01J518_A947MnuPgm[0] ;
         A948MnuPgmTpo = T01J518_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = T01J518_A949MnuPgmTxt[0] ;
         zm1J5125( -3) ;
      }
      pr_default.close(16);
      onLoadActions1J5125( ) ;
   }

   public void onLoadActions1J5125( )
   {
   }

   public void checkExtendedTable1J5125( )
   {
      nIsDirty_125 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J5125( ) ;
      if ( ! ( ( GXutil.strcmp(A948MnuPgmTpo, "S") == 0 ) || ( GXutil.strcmp(A948MnuPgmTpo, "N") == 0 ) ) )
      {
         GXCCtl = "MNUPGMTPO_" + sGXsfl_30_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Ind. de Requiere parámetro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuPgmTpo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1J5125( )
   {
   }

   public void enableDisable1J5125( )
   {
   }

   public void getKey1J5125( )
   {
      /* Using cursor T01J519 */
      pr_default.execute(17, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound125 = (short)(1) ;
      }
      else
      {
         RcdFound125 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1J5125( )
   {
      /* Using cursor T01J56 */
      pr_default.execute(4, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1J5125( 3) ;
         RcdFound125 = (short)(1) ;
         initializeNonKey1J5125( ) ;
         A946MnuOp = T01J56_A946MnuOp[0] ;
         A947MnuPgm = T01J56_A947MnuPgm[0] ;
         A948MnuPgmTpo = T01J56_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = T01J56_A949MnuPgmTxt[0] ;
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J5125( ) ;
         load1J5125( ) ;
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound125 = (short)(0) ;
         initializeNonKey1J5125( ) ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J5125( ) ;
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J5125( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency1J5125( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J55 */
         pr_default.execute(3, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z947MnuPgm, T01J55_A947MnuPgm[0]) != 0 ) || ( GXutil.strcmp(Z948MnuPgmTpo, T01J55_A948MnuPgmTpo[0]) != 0 ) || ( GXutil.strcmp(Z949MnuPgmTxt, T01J55_A949MnuPgmTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z947MnuPgm, T01J55_A947MnuPgm[0]) != 0 )
            {
               GXutil.writeLogln("ttrnmenus:[seudo value changed for attri]"+"MnuPgm");
               GXutil.writeLogRaw("Old: ",Z947MnuPgm);
               GXutil.writeLogRaw("Current: ",T01J55_A947MnuPgm[0]);
            }
            if ( GXutil.strcmp(Z948MnuPgmTpo, T01J55_A948MnuPgmTpo[0]) != 0 )
            {
               GXutil.writeLogln("ttrnmenus:[seudo value changed for attri]"+"MnuPgmTpo");
               GXutil.writeLogRaw("Old: ",Z948MnuPgmTpo);
               GXutil.writeLogRaw("Current: ",T01J55_A948MnuPgmTpo[0]);
            }
            if ( GXutil.strcmp(Z949MnuPgmTxt, T01J55_A949MnuPgmTxt[0]) != 0 )
            {
               GXutil.writeLogln("ttrnmenus:[seudo value changed for attri]"+"MnuPgmTxt");
               GXutil.writeLogRaw("Old: ",Z949MnuPgmTxt);
               GXutil.writeLogRaw("Current: ",T01J55_A949MnuPgmTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMNUOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J5125( )
   {
      beforeValidate1J5125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J5125( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J5125( 0) ;
         checkOptimisticConcurrency1J5125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J5125( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J5125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J520 */
                  pr_default.execute(18, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A947MnuPgm, A948MnuPgmTpo, A949MnuPgmTxt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevel1J5125( ) ;
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
            load1J5125( ) ;
         }
         endLevel1J5125( ) ;
      }
      closeExtendedTableCursors1J5125( ) ;
   }

   public void update1J5125( )
   {
      beforeValidate1J5125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J5125( ) ;
      }
      if ( ( nIsMod_125 != 0 ) || ( nIsDirty_125 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J5125( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J5125( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J5125( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J521 */
                     pr_default.execute(19, new Object[] {A947MnuPgm, A948MnuPgmTpo, A949MnuPgmTxt, A945MnuId, Byte.valueOf(A946MnuOp)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J5125( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1J5125( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1J5125( ) ;
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
            endLevel1J5125( ) ;
         }
      }
      closeExtendedTableCursors1J5125( ) ;
   }

   public void deferredUpdate1J5125( )
   {
   }

   public void delete1J5125( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J5125( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J5125( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J5125( ) ;
         afterConfirm1J5125( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J5125( ) ;
            if ( AnyError == 0 )
            {
               scanStart1J5126( ) ;
               while ( RcdFound126 != 0 )
               {
                  getByPrimaryKey1J5126( ) ;
                  delete1J5126( ) ;
                  scanNext1J5126( ) ;
               }
               scanEnd1J5126( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J522 */
                  pr_default.execute(20, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
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
      sMode125 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J5125( ) ;
      Gx_mode = sMode125 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J5125( )
   {
      standaloneModal1J5125( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1J5126( )
   {
      nGXsfl_57_idx = 0 ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         readRow1J5126( ) ;
         if ( ( nRcdExists_126 != 0 ) || ( nIsMod_126 != 0 ) )
         {
            standaloneNotModal1J5126( ) ;
            getKey1J5126( ) ;
            if ( ( nRcdExists_126 == 0 ) && ( nRcdDeleted_126 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1J5126( ) ;
            }
            else
            {
               if ( RcdFound126 != 0 )
               {
                  if ( ( nRcdDeleted_126 != 0 ) && ( nRcdExists_126 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1J5126( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_126 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1J5126( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_126 == 0 )
                  {
                     GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMnuOp_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_126_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGrpId_Internalname, GXutil.rtrim( A943GrpId)) ;
         httpContext.changePostValue( edtGrpTxt_Internalname, GXutil.rtrim( A944GrpTxt)) ;
         httpContext.changePostValue( edtMnuPri_Internalname, GXutil.ltrim( localUtil.ntoc( A950MnuPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z943GrpId_"+sGXsfl_57_idx, GXutil.rtrim( Z943GrpId)) ;
         httpContext.changePostValue( "ZT_"+"Z950MnuPri_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( Z950MnuPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_126_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_126_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_126_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_126 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_126_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_126_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPID_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRPTXT_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPRI_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1J5126( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_126 = (short)(0) ;
      nIsMod_126 = (short)(0) ;
      nRcdDeleted_126 = (short)(0) ;
   }

   public void processLevel1J5125( )
   {
      /* Save parent mode. */
      sMode125 = Gx_mode ;
      processNestedLevel1J5126( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode125 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1J5125( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1J5125( )
   {
      /* Scan By routine */
      /* Using cursor T01J523 */
      pr_default.execute(21, new Object[] {A945MnuId});
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A946MnuOp = T01J523_A946MnuOp[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J5125( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A946MnuOp = T01J523_A946MnuOp[0] ;
      }
   }

   public void scanEnd1J5125( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1J5125( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J5125( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J5125( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J5125( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J5125( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J5125( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J5125( )
   {
      edtMnuOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtMnuPgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtMnuPgmTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtMnuPgmTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), !bGXsfl_30_Refreshing);
   }

   public void zm1J5126( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z950MnuPri = T01J53_A950MnuPri[0] ;
         }
         else
         {
            Z950MnuPri = A950MnuPri ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         Z950MnuPri = A950MnuPri ;
         Z943GrpId = A943GrpId ;
         Z944GrpTxt = A944GrpTxt ;
      }
   }

   public void standaloneNotModal1J5126( )
   {
   }

   public void standaloneModal1J5126( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGrpId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      else
      {
         edtGrpId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
   }

   public void load1J5126( )
   {
      /* Using cursor T01J524 */
      pr_default.execute(22, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A943GrpId});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound126 = (short)(1) ;
         A944GrpTxt = T01J524_A944GrpTxt[0] ;
         n944GrpTxt = T01J524_n944GrpTxt[0] ;
         A950MnuPri = T01J524_A950MnuPri[0] ;
         zm1J5126( -4) ;
      }
      pr_default.close(22);
      onLoadActions1J5126( ) ;
   }

   public void onLoadActions1J5126( )
   {
   }

   public void checkExtendedTable1J5126( )
   {
      nIsDirty_126 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1J5126( ) ;
      /* Using cursor T01J54 */
      pr_default.execute(2, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "GRPID_" + sGXsfl_57_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A944GrpTxt = T01J54_A944GrpTxt[0] ;
      n944GrpTxt = T01J54_n944GrpTxt[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1J5126( )
   {
      pr_default.close(2);
   }

   public void enableDisable1J5126( )
   {
   }

   public void gxload_5( String A943GrpId )
   {
      /* Using cursor T01J525 */
      pr_default.execute(23, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(23) == 101) )
      {
         GXCCtl = "GRPID_" + sGXsfl_57_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A944GrpTxt = T01J525_A944GrpTxt[0] ;
      n944GrpTxt = T01J525_n944GrpTxt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A944GrpTxt))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey1J5126( )
   {
      /* Using cursor T01J526 */
      pr_default.execute(24, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A943GrpId});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound126 = (short)(1) ;
      }
      else
      {
         RcdFound126 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey1J5126( )
   {
      /* Using cursor T01J53 */
      pr_default.execute(1, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A943GrpId});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1J5126( 4) ;
         RcdFound126 = (short)(1) ;
         initializeNonKey1J5126( ) ;
         A950MnuPri = T01J53_A950MnuPri[0] ;
         A943GrpId = T01J53_A943GrpId[0] ;
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         Z943GrpId = A943GrpId ;
         sMode126 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J5126( ) ;
         load1J5126( ) ;
         Gx_mode = sMode126 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound126 = (short)(0) ;
         initializeNonKey1J5126( ) ;
         sMode126 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1J5126( ) ;
         Gx_mode = sMode126 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1J5126( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1J5126( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01J52 */
         pr_default.execute(0, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A943GrpId});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPCGRU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z950MnuPri != T01J52_A950MnuPri[0] ) )
         {
            if ( Z950MnuPri != T01J52_A950MnuPri[0] )
            {
               GXutil.writeLogln("ttrnmenus:[seudo value changed for attri]"+"MnuPri");
               GXutil.writeLogRaw("Old: ",Z950MnuPri);
               GXutil.writeLogRaw("Current: ",T01J52_A950MnuPri[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPCGRU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1J5126( )
   {
      beforeValidate1J5126( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J5126( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1J5126( 0) ;
         checkOptimisticConcurrency1J5126( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1J5126( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1J5126( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01J527 */
                  pr_default.execute(25, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), Byte.valueOf(A950MnuPri), A943GrpId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPCGRU");
                  if ( (pr_default.getStatus(25) == 1) )
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
            load1J5126( ) ;
         }
         endLevel1J5126( ) ;
      }
      closeExtendedTableCursors1J5126( ) ;
   }

   public void update1J5126( )
   {
      beforeValidate1J5126( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1J5126( ) ;
      }
      if ( ( nIsMod_126 != 0 ) || ( nIsDirty_126 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1J5126( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1J5126( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1J5126( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01J528 */
                     pr_default.execute(26, new Object[] {Byte.valueOf(A950MnuPri), A945MnuId, Byte.valueOf(A946MnuOp), A943GrpId});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPCGRU");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPCGRU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1J5126( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1J5126( ) ;
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
            endLevel1J5126( ) ;
         }
      }
      closeExtendedTableCursors1J5126( ) ;
   }

   public void deferredUpdate1J5126( )
   {
   }

   public void delete1J5126( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1J5126( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1J5126( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1J5126( ) ;
         afterConfirm1J5126( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1J5126( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01J529 */
               pr_default.execute(27, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A943GrpId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPCGRU");
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
      sMode126 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1J5126( ) ;
      Gx_mode = sMode126 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1J5126( )
   {
      standaloneModal1J5126( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01J530 */
         pr_default.execute(28, new Object[] {A943GrpId});
         A944GrpTxt = T01J530_A944GrpTxt[0] ;
         n944GrpTxt = T01J530_n944GrpTxt[0] ;
         pr_default.close(28);
      }
   }

   public void endLevel1J5126( )
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

   public void scanStart1J5126( )
   {
      /* Scan By routine */
      /* Using cursor T01J531 */
      pr_default.execute(29, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      RcdFound126 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound126 = (short)(1) ;
         A943GrpId = T01J531_A943GrpId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1J5126( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound126 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound126 = (short)(1) ;
         A943GrpId = T01J531_A943GrpId[0] ;
      }
   }

   public void scanEnd1J5126( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1J5126( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1J5126( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1J5126( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1J5126( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1J5126( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1J5126( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1J5126( )
   {
      edtGrpId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtGrpTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpTxt_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtMnuPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPri_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public void send_integrity_lvl_hashes1J5126( )
   {
   }

   public void send_integrity_lvl_hashes1J5125( )
   {
   }

   public void send_integrity_lvl_hashes1J5124( )
   {
   }

   public void subsflControlProps_30125( )
   {
      lblTextblock3_Internalname = "TEXTBLOCK3_"+sGXsfl_30_idx ;
      edtMnuOp_Internalname = "MNUOP_"+sGXsfl_30_idx ;
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_30_idx ;
      edtMnuPgm_Internalname = "MNUPGM_"+sGXsfl_30_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_30_idx ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO_"+sGXsfl_30_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_30_idx ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT_"+sGXsfl_30_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_30_idx ;
   }

   public void subsflControlProps_fel_30125( )
   {
      lblTextblock3_Internalname = "TEXTBLOCK3_"+sGXsfl_30_fel_idx ;
      edtMnuOp_Internalname = "MNUOP_"+sGXsfl_30_fel_idx ;
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_30_fel_idx ;
      edtMnuPgm_Internalname = "MNUPGM_"+sGXsfl_30_fel_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_30_fel_idx ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO_"+sGXsfl_30_fel_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_30_fel_idx ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT_"+sGXsfl_30_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_30_fel_idx ;
   }

   public void addRow1J5125( )
   {
      nRC_GXsfl_57 = 0 ;
      nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_30125( ) ;
      sendRow1J5125( ) ;
   }

   public void sendRow1J5125( )
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
         if ( ((int)((nGXsfl_30_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_30_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_30_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_30_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock3_Internalname,httpContext.getMessage( "Opción del Menú", ""),"","",lblTextblock3_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_30_idx + "',30)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuOp_Internalname,GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuOp_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMnuOp_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock4_Internalname,httpContext.getMessage( "Programa a llamar", ""),"","",lblTextblock4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_30_idx + "',30)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgm_Internalname,GXutil.rtrim( A947MnuPgm),GXutil.rtrim( localUtil.format( A947MnuPgm, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgm_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMnuPgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,httpContext.getMessage( "Ind. de Requiere parámetro", ""),"","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_30_idx + "',30)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmTpo_Internalname,GXutil.rtrim( A948MnuPgmTpo),GXutil.rtrim( localUtil.format( A948MnuPgmTpo, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmTpo_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMnuPgmTpo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock6_Internalname,httpContext.getMessage( "Descripción del Programa", ""),"","",lblTextblock6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_30_idx + "',30)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmTxt_Internalname,GXutil.rtrim( A949MnuPgmTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmTxt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMnuPgmTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
         nBlankRcdCount126 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_126 = (short)(1) ;
            scanStart1J5126( ) ;
            while ( RcdFound126 != 0 )
            {
               init_level_properties126( ) ;
               getByPrimaryKey1J5126( ) ;
               addRow1J5126( ) ;
               scanNext1J5126( ) ;
            }
            scanEnd1J5126( ) ;
            nBlankRcdCount126 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1J5126( ) ;
         standaloneModal1J5126( ) ;
         sMode126 = Gx_mode ;
         while ( nGXsfl_57_idx < nRC_GXsfl_57 )
         {
            bGXsfl_57_Refreshing = true ;
            readRow1J5126( ) ;
            edtavnRcdDeleted_126_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_126_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_126_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_126_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtGrpId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPID_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtGrpTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPTXT_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrpTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpTxt_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtMnuPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPRI_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPri_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            if ( ( nRcdExists_126 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1J5126( ) ;
            }
            sendRow1J5126( ) ;
            bGXsfl_57_Refreshing = false ;
         }
         Gx_mode = sMode126 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount126 = (short)(5) ;
         nRcdExists_126 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1J5126( ) ;
            while ( RcdFound126 != 0 )
            {
               sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx+1), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
               subsflControlProps_57126( ) ;
               init_level_properties126( ) ;
               standaloneNotModal1J5126( ) ;
               getByPrimaryKey1J5126( ) ;
               standaloneModal1J5126( ) ;
               addRow1J5126( ) ;
               scanNext1J5126( ) ;
            }
            scanEnd1J5126( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode126 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx+1), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
      subsflControlProps_57126( ) ;
      initAll1J5126( ) ;
      init_level_properties126( ) ;
      nRcdExists_126 = (short)(0) ;
      nIsMod_126 = (short)(0) ;
      nRcdDeleted_126 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 30 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_30_idx, ".")) == 0 ) )
      {
         nBlankRcdCount126 = (short)(nBlankRcdUsr126+nBlankRcdCount126) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount126 > 0 )
      {
         standaloneNotModal1J5126( ) ;
         standaloneModal1J5126( ) ;
         addRow1J5126( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtGrpId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount126 = (short)(nBlankRcdCount126-1) ;
      }
      Gx_mode = sMode126 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_30_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_30_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_30_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1J5125( ) ;
      GXCCtl = "Z946MnuOp_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z947MnuPgm_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z947MnuPgm));
      GXCCtl = "Z948MnuPgmTpo_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z948MnuPgmTpo));
      GXCCtl = "Z949MnuPgmTxt_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z949MnuPgmTxt));
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_57_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_125_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_125_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_125_" + sGXsfl_30_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUOP_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGM_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMTPO_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMTXT_"+sGXsfl_30_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_30_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1J5125( )
   {
      nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_30125( ) ;
      edtMnuOp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUOP_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGM_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgmTpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTPO_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgmTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTXT_"+sGXsfl_30_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MNUOP_" + sGXsfl_30_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuOp_Internalname ;
         wbErr = true ;
         A946MnuOp = (byte)(0) ;
      }
      else
      {
         A946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A947MnuPgm = GXutil.upper( httpContext.cgiGet( edtMnuPgm_Internalname)) ;
      A948MnuPgmTpo = GXutil.upper( httpContext.cgiGet( edtMnuPgmTpo_Internalname)) ;
      A949MnuPgmTxt = httpContext.cgiGet( edtMnuPgmTxt_Internalname) ;
      GXCCtl = "Z946MnuOp_" + sGXsfl_30_idx ;
      Z946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z947MnuPgm_" + sGXsfl_30_idx ;
      Z947MnuPgm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z948MnuPgmTpo_" + sGXsfl_30_idx ;
      Z948MnuPgmTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z949MnuPgmTxt_" + sGXsfl_30_idx ;
      Z949MnuPgmTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_30_idx ;
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_125_" + sGXsfl_30_idx ;
      nRcdDeleted_125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_125_" + sGXsfl_30_idx ;
      nRcdExists_125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_125_" + sGXsfl_30_idx ;
      nIsMod_125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_30_idx ;
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_57126( )
   {
      edtavnRcdDeleted_126_Internalname = "vNRCDDELETED_126_"+sGXsfl_57_idx ;
      edtGrpId_Internalname = "GRPID_"+sGXsfl_57_idx ;
      edtGrpTxt_Internalname = "GRPTXT_"+sGXsfl_57_idx ;
      edtMnuPri_Internalname = "MNUPRI_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_57126( )
   {
      edtavnRcdDeleted_126_Internalname = "vNRCDDELETED_126_"+sGXsfl_57_fel_idx ;
      edtGrpId_Internalname = "GRPID_"+sGXsfl_57_fel_idx ;
      edtGrpTxt_Internalname = "GRPTXT_"+sGXsfl_57_fel_idx ;
      edtMnuPri_Internalname = "MNUPRI_"+sGXsfl_57_fel_idx ;
   }

   public void addRow1J5126( )
   {
      nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
      subsflControlProps_57126( ) ;
      sendRow1J5126( ) ;
   }

   public void sendRow1J5126( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_126_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_126_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_126_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_126), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_126), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_126_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_126_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_126_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpId_Internalname,GXutil.rtrim( A943GrpId),GXutil.rtrim( localUtil.format( A943GrpId, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGrpId_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrpTxt_Internalname,GXutil.rtrim( A944GrpTxt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrpTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtGrpTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_126_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_125_" + sGXsfl_30_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPri_Internalname,GXutil.ltrim( localUtil.ntoc( A950MnuPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMnuPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A950MnuPri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A950MnuPri), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMnuPri_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1J5126( ) ;
      GXCCtl = "Z943GrpId_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z943GrpId));
      GXCCtl = "Z950MnuPri_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z950MnuPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_126_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_126_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_126_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_126, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_126_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_126_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPID_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRPTXT_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPRI_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPri_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1J5126( )
   {
      nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
      subsflControlProps_57126( ) ;
      edtavnRcdDeleted_126_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_126_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrpId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPID_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrpTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRPTXT_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPRI_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_126_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_126_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_126");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_126_Internalname ;
         wbErr = true ;
         nRcdDeleted_126 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_126 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_126_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A943GrpId = GXutil.upper( httpContext.cgiGet( edtGrpId_Internalname)) ;
      A944GrpTxt = httpContext.cgiGet( edtGrpTxt_Internalname) ;
      n944GrpTxt = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMnuPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMnuPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MNUPRI_" + sGXsfl_57_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuPri_Internalname ;
         wbErr = true ;
         A950MnuPri = (byte)(0) ;
      }
      else
      {
         A950MnuPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtMnuPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z943GrpId_" + sGXsfl_57_idx ;
      Z943GrpId = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z950MnuPri_" + sGXsfl_57_idx ;
      Z950MnuPri = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_126_" + sGXsfl_57_idx ;
      nRcdDeleted_126 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_126_" + sGXsfl_57_idx ;
      nRcdExists_126 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_126_" + sGXsfl_57_idx ;
      nIsMod_126 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtGrpId_Enabled = edtGrpId_Enabled ;
      defedtMnuOp_Enabled = edtMnuOp_Enabled ;
   }

   public void confirmValues1J50( )
   {
      nGXsfl_30_idx = 0 ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_30125( ) ;
      while ( nGXsfl_30_idx < nRC_GXsfl_30 )
      {
         nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_30125( ) ;
         httpContext.changePostValue( "Z946MnuOp_"+sGXsfl_30_idx, httpContext.cgiGet( "ZT_"+"Z946MnuOp_"+sGXsfl_30_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z946MnuOp_"+sGXsfl_30_idx) ;
         httpContext.changePostValue( "Z947MnuPgm_"+sGXsfl_30_idx, httpContext.cgiGet( "ZT_"+"Z947MnuPgm_"+sGXsfl_30_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z947MnuPgm_"+sGXsfl_30_idx) ;
         httpContext.changePostValue( "Z948MnuPgmTpo_"+sGXsfl_30_idx, httpContext.cgiGet( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_30_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_30_idx) ;
         httpContext.changePostValue( "Z949MnuPgmTxt_"+sGXsfl_30_idx, httpContext.cgiGet( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_30_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_30_idx) ;
      }
      nGXsfl_57_idx = 0 ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
      subsflControlProps_57126( ) ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
         subsflControlProps_57126( ) ;
         httpContext.changePostValue( "Z943GrpId_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z943GrpId_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z943GrpId_"+sGXsfl_57_idx) ;
         httpContext.changePostValue( "Z950MnuPri_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z950MnuPri_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z950MnuPri_"+sGXsfl_57_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrnmenus", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z945MnuId", GXutil.rtrim( Z945MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z951MnuTxt", GXutil.rtrim( Z951MnuTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_30", GXutil.ltrim( localUtil.ntoc( nGXsfl_30_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttrnmenus", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrnMENUS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MNUCAB", "") ;
   }

   public void initializeNonKey1J5124( )
   {
      A951MnuTxt = "" ;
      n951MnuTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
      Z951MnuTxt = "" ;
   }

   public void initAll1J5124( )
   {
      A945MnuId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      initializeNonKey1J5124( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1J5125( )
   {
      A947MnuPgm = "" ;
      A948MnuPgmTpo = "" ;
      A949MnuPgmTxt = "" ;
      Z947MnuPgm = "" ;
      Z948MnuPgmTpo = "" ;
      Z949MnuPgmTxt = "" ;
   }

   public void initAll1J5125( )
   {
      A946MnuOp = (byte)(0) ;
      initializeNonKey1J5125( ) ;
   }

   public void standaloneModalInsert1J5125( )
   {
   }

   public void initializeNonKey1J5126( )
   {
      A944GrpTxt = "" ;
      n944GrpTxt = false ;
      A950MnuPri = (byte)(0) ;
      Z950MnuPri = (byte)(0) ;
   }

   public void initAll1J5126( )
   {
      A943GrpId = "" ;
      initializeNonKey1J5126( ) ;
   }

   public void standaloneModalInsert1J5126( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026125195196", true, true);
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
      httpContext.AddJavascriptSource("ttrnmenus.js", "?2026125195197", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties125( )
   {
      edtMnuOp_Enabled = defedtMnuOp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_30_Refreshing);
   }

   public void init_level_properties126( )
   {
      edtGrpId_Enabled = defedtGrpId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpId_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public void startgridcontrol30( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock3_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A947MnuPgm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A948MnuPgmTpo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A949MnuPgmTxt));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_126, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_126_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A943GrpId));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A944GrpTxt));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrpTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A950MnuPri, (byte)(2), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPri_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMnuId_Internalname = "MNUID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtMnuTxt_Internalname = "MNUTXT" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMnuOp_Internalname = "MNUOP" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMnuPgm_Internalname = "MNUPGM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT" ;
      edtavnRcdDeleted_126_Internalname = "vNRCDDELETED_126" ;
      edtGrpId_Internalname = "GRPID" ;
      edtGrpTxt_Internalname = "GRPTXT" ;
      edtMnuPri_Internalname = "MNUPRI" ;
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
      lblTextblock6_Caption = httpContext.getMessage( "Descripción del Programa", "") ;
      lblTextblock5_Caption = httpContext.getMessage( "Ind. de Requiere parámetro", "") ;
      lblTextblock4_Caption = httpContext.getMessage( "Programa a llamar", "") ;
      lblTextblock3_Caption = httpContext.getMessage( "Opción del Menú", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MNUCAB", "") );
      edtMnuPri_Jsonclick = "" ;
      edtGrpTxt_Jsonclick = "" ;
      edtGrpId_Jsonclick = "" ;
      edtavnRcdDeleted_126_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtMnuPgmTxt_Jsonclick = "" ;
      edtMnuPgmTpo_Jsonclick = "" ;
      edtMnuPgm_Jsonclick = "" ;
      edtMnuOp_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtMnuPri_Enabled = 1 ;
      edtGrpTxt_Enabled = 0 ;
      edtGrpId_Enabled = 1 ;
      edtavnRcdDeleted_126_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMnuPgmTxt_Enabled = 1 ;
      edtMnuPgmTpo_Enabled = 1 ;
      edtMnuPgm_Enabled = 1 ;
      edtMnuOp_Enabled = 1 ;
      edtMnuTxt_Jsonclick = "" ;
      edtMnuTxt_Backcolor = (int)(0xFFFFFF) ;
      edtMnuTxt_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMnuId_Jsonclick = "" ;
      edtMnuId_Backcolor = (int)(0xFFFFFF) ;
      edtMnuId_Enabled = 1 ;
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
      subsflControlProps_30125( ) ;
      while ( nGXsfl_30_idx <= nRC_GXsfl_30 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J5125( ) ;
         standaloneModal1J5125( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J5125( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_30_idx = (int)(nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_30125( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_57126( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1J5125( ) ;
         standaloneModal1J5125( ) ;
         standaloneNotModal1J5126( ) ;
         standaloneModal1J5126( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1J5126( ) ;
         nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_30_idx ;
         subsflControlProps_57126( ) ;
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
      GX_FocusControl = edtMnuTxt_Internalname ;
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

   public void valid_Mnuid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", GXutil.rtrim( A951MnuTxt));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z945MnuId", GXutil.rtrim( Z945MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z951MnuTxt", GXutil.rtrim( Z951MnuTxt));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Grpid( )
   {
      n944GrpTxt = false ;
      /* Using cursor T01J530 */
      pr_default.execute(28, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpId_Internalname ;
      }
      A944GrpTxt = T01J530_A944GrpTxt[0] ;
      n944GrpTxt = T01J530_n944GrpTxt[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A944GrpTxt", GXutil.rtrim( A944GrpTxt));
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
      setEventMetadata("VALID_MNUID","{handler:'valid_Mnuid',iparms:[{av:'A945MnuId',fld:'MNUID',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MNUID",",oparms:[{av:'A951MnuTxt',fld:'MNUTXT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z945MnuId'},{av:'Z951MnuTxt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MNUOP","{handler:'valid_Mnuop',iparms:[]");
      setEventMetadata("VALID_MNUOP",",oparms:[]}");
      setEventMetadata("VALID_MNUPGMTPO","{handler:'valid_Mnupgmtpo',iparms:[]");
      setEventMetadata("VALID_MNUPGMTPO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mnupgmtxt',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_GRPID","{handler:'valid_Grpid',iparms:[{av:'A943GrpId',fld:'GRPID',pic:'@!'},{av:'A944GrpTxt',fld:'GRPTXT',pic:''}]");
      setEventMetadata("VALID_GRPID",",oparms:[{av:'A944GrpTxt',fld:'GRPTXT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mnupri',iparms:[]");
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
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z945MnuId = "" ;
      Z951MnuTxt = "" ;
      Z947MnuPgm = "" ;
      Z948MnuPgmTpo = "" ;
      Z949MnuPgmTxt = "" ;
      Z943GrpId = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A943GrpId = "" ;
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
      A945MnuId = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      A951MnuTxt = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode125 = "" ;
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
      sMode124 = "" ;
      GXCCtl = "" ;
      A944GrpTxt = "" ;
      A947MnuPgm = "" ;
      A948MnuPgmTpo = "" ;
      A949MnuPgmTxt = "" ;
      T01J59_A945MnuId = new String[] {""} ;
      T01J59_A951MnuTxt = new String[] {""} ;
      T01J59_n951MnuTxt = new boolean[] {false} ;
      T01J510_A945MnuId = new String[] {""} ;
      T01J58_A945MnuId = new String[] {""} ;
      T01J58_A951MnuTxt = new String[] {""} ;
      T01J58_n951MnuTxt = new boolean[] {false} ;
      T01J511_A945MnuId = new String[] {""} ;
      T01J512_A945MnuId = new String[] {""} ;
      T01J57_A945MnuId = new String[] {""} ;
      T01J57_A951MnuTxt = new String[] {""} ;
      T01J57_n951MnuTxt = new boolean[] {false} ;
      T01J516_A945MnuId = new String[] {""} ;
      T01J516_A946MnuOp = new byte[1] ;
      T01J517_A945MnuId = new String[] {""} ;
      T01J518_A945MnuId = new String[] {""} ;
      T01J518_A946MnuOp = new byte[1] ;
      T01J518_A947MnuPgm = new String[] {""} ;
      T01J518_A948MnuPgmTpo = new String[] {""} ;
      T01J518_A949MnuPgmTxt = new String[] {""} ;
      T01J519_A945MnuId = new String[] {""} ;
      T01J519_A946MnuOp = new byte[1] ;
      T01J56_A945MnuId = new String[] {""} ;
      T01J56_A946MnuOp = new byte[1] ;
      T01J56_A947MnuPgm = new String[] {""} ;
      T01J56_A948MnuPgmTpo = new String[] {""} ;
      T01J56_A949MnuPgmTxt = new String[] {""} ;
      T01J55_A945MnuId = new String[] {""} ;
      T01J55_A946MnuOp = new byte[1] ;
      T01J55_A947MnuPgm = new String[] {""} ;
      T01J55_A948MnuPgmTpo = new String[] {""} ;
      T01J55_A949MnuPgmTxt = new String[] {""} ;
      T01J523_A945MnuId = new String[] {""} ;
      T01J523_A946MnuOp = new byte[1] ;
      Z944GrpTxt = "" ;
      T01J524_A945MnuId = new String[] {""} ;
      T01J524_A946MnuOp = new byte[1] ;
      T01J524_A944GrpTxt = new String[] {""} ;
      T01J524_n944GrpTxt = new boolean[] {false} ;
      T01J524_A950MnuPri = new byte[1] ;
      T01J524_A943GrpId = new String[] {""} ;
      T01J54_A944GrpTxt = new String[] {""} ;
      T01J54_n944GrpTxt = new boolean[] {false} ;
      T01J525_A944GrpTxt = new String[] {""} ;
      T01J525_n944GrpTxt = new boolean[] {false} ;
      T01J526_A945MnuId = new String[] {""} ;
      T01J526_A946MnuOp = new byte[1] ;
      T01J526_A943GrpId = new String[] {""} ;
      T01J53_A945MnuId = new String[] {""} ;
      T01J53_A946MnuOp = new byte[1] ;
      T01J53_A950MnuPri = new byte[1] ;
      T01J53_A943GrpId = new String[] {""} ;
      sMode126 = "" ;
      T01J52_A945MnuId = new String[] {""} ;
      T01J52_A946MnuOp = new byte[1] ;
      T01J52_A950MnuPri = new byte[1] ;
      T01J52_A943GrpId = new String[] {""} ;
      T01J530_A944GrpTxt = new String[] {""} ;
      T01J530_n944GrpTxt = new boolean[] {false} ;
      T01J531_A945MnuId = new String[] {""} ;
      T01J531_A946MnuOp = new byte[1] ;
      T01J531_A943GrpId = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock3_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock4_Jsonclick = "" ;
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
      ZZ945MnuId = "" ;
      ZZ951MnuTxt = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrnmenus__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrnmenus__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrnmenus__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrnmenus__default(),
         new Object[] {
             new Object[] {
            T01J52_A945MnuId, T01J52_A946MnuOp, T01J52_A950MnuPri, T01J52_A943GrpId
            }
            , new Object[] {
            T01J53_A945MnuId, T01J53_A946MnuOp, T01J53_A950MnuPri, T01J53_A943GrpId
            }
            , new Object[] {
            T01J54_A944GrpTxt, T01J54_n944GrpTxt
            }
            , new Object[] {
            T01J55_A945MnuId, T01J55_A946MnuOp, T01J55_A947MnuPgm, T01J55_A948MnuPgmTpo, T01J55_A949MnuPgmTxt
            }
            , new Object[] {
            T01J56_A945MnuId, T01J56_A946MnuOp, T01J56_A947MnuPgm, T01J56_A948MnuPgmTpo, T01J56_A949MnuPgmTxt
            }
            , new Object[] {
            T01J57_A945MnuId, T01J57_A951MnuTxt, T01J57_n951MnuTxt
            }
            , new Object[] {
            T01J58_A945MnuId, T01J58_A951MnuTxt, T01J58_n951MnuTxt
            }
            , new Object[] {
            T01J59_A945MnuId, T01J59_A951MnuTxt, T01J59_n951MnuTxt
            }
            , new Object[] {
            T01J510_A945MnuId
            }
            , new Object[] {
            T01J511_A945MnuId
            }
            , new Object[] {
            T01J512_A945MnuId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J516_A945MnuId, T01J516_A946MnuOp
            }
            , new Object[] {
            T01J517_A945MnuId
            }
            , new Object[] {
            T01J518_A945MnuId, T01J518_A946MnuOp, T01J518_A947MnuPgm, T01J518_A948MnuPgmTpo, T01J518_A949MnuPgmTxt
            }
            , new Object[] {
            T01J519_A945MnuId, T01J519_A946MnuOp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J523_A945MnuId, T01J523_A946MnuOp
            }
            , new Object[] {
            T01J524_A945MnuId, T01J524_A946MnuOp, T01J524_A944GrpTxt, T01J524_n944GrpTxt, T01J524_A950MnuPri, T01J524_A943GrpId
            }
            , new Object[] {
            T01J525_A944GrpTxt, T01J525_n944GrpTxt
            }
            , new Object[] {
            T01J526_A945MnuId, T01J526_A946MnuOp, T01J526_A943GrpId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01J530_A944GrpTxt, T01J530_n944GrpTxt
            }
            , new Object[] {
            T01J531_A945MnuId, T01J531_A946MnuOp, T01J531_A943GrpId
            }
         }
      );
   }

   private byte Z946MnuOp ;
   private byte Z950MnuPri ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A950MnuPri ;
   private byte A946MnuOp ;
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
   private short nRcdDeleted_125 ;
   private short nRcdExists_125 ;
   private short nIsMod_125 ;
   private short nRcdDeleted_126 ;
   private short nRcdExists_126 ;
   private short nIsMod_126 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount125 ;
   private short RcdFound125 ;
   private short nBlankRcdUsr125 ;
   private short RcdFound126 ;
   private short RcdFound124 ;
   private short nIsDirty_124 ;
   private short nIsDirty_125 ;
   private short nIsDirty_126 ;
   private short nBlankRcdCount126 ;
   private short nBlankRcdUsr126 ;
   private short subGrid1_Borderwidth ;
   private int nRC_GXsfl_30 ;
   private int nGXsfl_30_idx=1 ;
   private int nRC_GXsfl_57 ;
   private int nGXsfl_57_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtMnuId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMnuTxt_Enabled ;
   private int edtMnuOp_Enabled ;
   private int edtMnuPgm_Enabled ;
   private int edtMnuPgmTpo_Enabled ;
   private int edtMnuPgmTxt_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_126_Enabled ;
   private int edtGrpId_Enabled ;
   private int edtGrpTxt_Enabled ;
   private int edtMnuPri_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtGrpId_Enabled ;
   private int defedtMnuOp_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtMnuTxt_Backcolor ;
   private int edtMnuId_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private String sPrefix ;
   private String Z945MnuId ;
   private String Z951MnuTxt ;
   private String Z947MnuPgm ;
   private String Z948MnuPgmTpo ;
   private String Z949MnuPgmTxt ;
   private String Z943GrpId ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A943GrpId ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMnuId_Internalname ;
   private String sGXsfl_30_idx="0001" ;
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
   private String A945MnuId ;
   private String edtMnuId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtMnuTxt_Internalname ;
   private String A951MnuTxt ;
   private String edtMnuTxt_Jsonclick ;
   private String sMode125 ;
   private String edtMnuOp_Internalname ;
   private String edtMnuPgm_Internalname ;
   private String edtMnuPgmTpo_Internalname ;
   private String edtMnuPgmTxt_Internalname ;
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
   private String edtavnRcdDeleted_126_Internalname ;
   private String sMode124 ;
   private String GXCCtl ;
   private String edtGrpId_Internalname ;
   private String edtGrpTxt_Internalname ;
   private String A944GrpTxt ;
   private String edtMnuPri_Internalname ;
   private String A947MnuPgm ;
   private String A948MnuPgmTpo ;
   private String A949MnuPgmTxt ;
   private String Z944GrpTxt ;
   private String sMode126 ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock6_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_30_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String ROClassString ;
   private String edtMnuOp_Jsonclick ;
   private String lblTextblock4_Jsonclick ;
   private String edtMnuPgm_Jsonclick ;
   private String lblTextblock5_Jsonclick ;
   private String edtMnuPgmTpo_Jsonclick ;
   private String lblTextblock6_Jsonclick ;
   private String edtMnuPgmTxt_Jsonclick ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_126_Jsonclick ;
   private String edtGrpId_Jsonclick ;
   private String edtGrpTxt_Jsonclick ;
   private String edtMnuPri_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock3_Caption ;
   private String lblTextblock4_Caption ;
   private String lblTextblock5_Caption ;
   private String lblTextblock6_Caption ;
   private String subGrid2_Header ;
   private String ZZ945MnuId ;
   private String ZZ951MnuTxt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_30_Refreshing=false ;
   private boolean n951MnuTxt ;
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n944GrpTxt ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01J59_A945MnuId ;
   private String[] T01J59_A951MnuTxt ;
   private boolean[] T01J59_n951MnuTxt ;
   private String[] T01J510_A945MnuId ;
   private String[] T01J58_A945MnuId ;
   private String[] T01J58_A951MnuTxt ;
   private boolean[] T01J58_n951MnuTxt ;
   private String[] T01J511_A945MnuId ;
   private String[] T01J512_A945MnuId ;
   private String[] T01J57_A945MnuId ;
   private String[] T01J57_A951MnuTxt ;
   private boolean[] T01J57_n951MnuTxt ;
   private String[] T01J516_A945MnuId ;
   private byte[] T01J516_A946MnuOp ;
   private String[] T01J517_A945MnuId ;
   private String[] T01J518_A945MnuId ;
   private byte[] T01J518_A946MnuOp ;
   private String[] T01J518_A947MnuPgm ;
   private String[] T01J518_A948MnuPgmTpo ;
   private String[] T01J518_A949MnuPgmTxt ;
   private String[] T01J519_A945MnuId ;
   private byte[] T01J519_A946MnuOp ;
   private String[] T01J56_A945MnuId ;
   private byte[] T01J56_A946MnuOp ;
   private String[] T01J56_A947MnuPgm ;
   private String[] T01J56_A948MnuPgmTpo ;
   private String[] T01J56_A949MnuPgmTxt ;
   private String[] T01J55_A945MnuId ;
   private byte[] T01J55_A946MnuOp ;
   private String[] T01J55_A947MnuPgm ;
   private String[] T01J55_A948MnuPgmTpo ;
   private String[] T01J55_A949MnuPgmTxt ;
   private String[] T01J523_A945MnuId ;
   private byte[] T01J523_A946MnuOp ;
   private String[] T01J524_A945MnuId ;
   private byte[] T01J524_A946MnuOp ;
   private String[] T01J524_A944GrpTxt ;
   private boolean[] T01J524_n944GrpTxt ;
   private byte[] T01J524_A950MnuPri ;
   private String[] T01J524_A943GrpId ;
   private String[] T01J54_A944GrpTxt ;
   private boolean[] T01J54_n944GrpTxt ;
   private String[] T01J525_A944GrpTxt ;
   private boolean[] T01J525_n944GrpTxt ;
   private String[] T01J526_A945MnuId ;
   private byte[] T01J526_A946MnuOp ;
   private String[] T01J526_A943GrpId ;
   private String[] T01J53_A945MnuId ;
   private byte[] T01J53_A946MnuOp ;
   private byte[] T01J53_A950MnuPri ;
   private String[] T01J53_A943GrpId ;
   private String[] T01J52_A945MnuId ;
   private byte[] T01J52_A946MnuOp ;
   private byte[] T01J52_A950MnuPri ;
   private String[] T01J52_A943GrpId ;
   private String[] T01J530_A944GrpTxt ;
   private boolean[] T01J530_n944GrpTxt ;
   private String[] T01J531_A945MnuId ;
   private byte[] T01J531_A946MnuOp ;
   private String[] T01J531_A943GrpId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrnmenus__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnmenus__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnmenus__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrnmenus__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01J52", "SELECT MnuId, MnuOp, MnuPri, GrpId FROM TXPOPCGRU WHERE MnuId = ? AND MnuOp = ? AND GrpId = ?  FOR UPDATE OF MnuPri NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J53", "SELECT MnuId, MnuOp, MnuPri, GrpId FROM TXPOPCGRU WHERE MnuId = ? AND MnuOp = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J54", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J55", "SELECT MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuPgmTxt FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ?  FOR UPDATE OF MnuPgm, MnuPgmTpo, MnuPgmTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J56", "SELECT MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuPgmTxt FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J57", "SELECT MnuId, MnuTxt FROM TXPMNUCAB WHERE MnuId = ?  FOR UPDATE OF MnuTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J58", "SELECT MnuId, MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J59", "SELECT /*+ FIRST_ROWS(100) */ TM1.MnuId, TM1.MnuTxt FROM TXPMNUCAB TM1 WHERE TM1.MnuId = ? ORDER BY TM1.MnuId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J510", "SELECT /*+ FIRST_ROWS(1) */ MnuId FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J511", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MnuId FROM TXPMNUCAB WHERE ( MnuId > ?) ORDER BY MnuId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MnuId FROM TXPMNUCAB WHERE ( MnuId < ?) ORDER BY MnuId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01J513", "INSERT INTO TXPMNUCAB(MnuId, MnuTxt) VALUES(?, ?)", GX_NOMASK, "TXPMNUCAB")
         ,new UpdateCursor("T01J514", "UPDATE TXPMNUCAB SET MnuTxt=?  WHERE MnuId = ?", GX_NOMASK, "TXPMNUCAB")
         ,new UpdateCursor("T01J515", "DELETE FROM TXPMNUCAB  WHERE MnuId = ?", GX_NOMASK, "TXPMNUCAB")
         ,new ForEachCursor("T01J516", "SELECT * FROM (SELECT MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01J517", "SELECT /*+ FIRST_ROWS(100) */ MnuId FROM TXPMNUCAB ORDER BY MnuId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J518", "SELECT MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuPgmTxt FROM TXPMNUOP WHERE MnuId = ? and MnuOp = ? ORDER BY MnuId, MnuOp ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J519", "SELECT MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J520", "INSERT INTO TXPMNUOP(MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuPgmTxt, MnuPgmWeb, MnuIcon, MnuSit) VALUES(?, ?, ?, ?, ?, ' ', ' ', ' ')", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("T01J521", "UPDATE TXPMNUOP SET MnuPgm=?, MnuPgmTpo=?, MnuPgmTxt=?  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("T01J522", "DELETE FROM TXPMNUOP  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new ForEachCursor("T01J523", "SELECT MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ? ORDER BY MnuId, MnuOp ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J524", "SELECT T1.MnuId, T1.MnuOp, T2.GrpTxt, T1.MnuPri, T1.GrpId FROM (TXPOPCGRU T1 INNER JOIN TXPGRUPOS T2 ON T2.GrpId = T1.GrpId) WHERE T1.MnuId = ? and T1.MnuOp = ? and T1.GrpId = ? ORDER BY T1.MnuId, T1.MnuOp, T1.GrpId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J525", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J526", "SELECT MnuId, MnuOp, GrpId FROM TXPOPCGRU WHERE MnuId = ? AND MnuOp = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01J527", "INSERT INTO TXPOPCGRU(MnuId, MnuOp, MnuPri, GrpId) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOPCGRU")
         ,new UpdateCursor("T01J528", "UPDATE TXPOPCGRU SET MnuPri=?  WHERE MnuId = ? AND MnuOp = ? AND GrpId = ?", GX_NOMASK, "TXPOPCGRU")
         ,new UpdateCursor("T01J529", "DELETE FROM TXPOPCGRU  WHERE MnuId = ? AND MnuOp = ? AND GrpId = ?", GX_NOMASK, "TXPOPCGRU")
         ,new ForEachCursor("T01J530", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01J531", "SELECT MnuId, MnuOp, GrpId FROM TXPOPCGRU WHERE MnuId = ? and MnuOp = ? ORDER BY MnuId, MnuOp, GrpId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 30);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 26 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

