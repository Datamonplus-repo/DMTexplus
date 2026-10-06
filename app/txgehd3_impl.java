package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txgehd3_impl extends GXDataArea
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
            A4889XLinMan = (short)(GXutil.lval( httpContext.GetPar( "XLinMan"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4889XLinMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4889XLinMan), 4, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DISTRIBUCION POR PIEZAS", ""), (short)(0)) ;
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
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

   public txgehd3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txgehd3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txgehd3_impl.class ));
   }

   public txgehd3_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXGEHD3.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXGEHD3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Disposicion Interna", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4882XDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4882XDisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4882XDisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtXDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Numero Linea", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXGEHD3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXLinMan_Internalname, GXutil.ltrim( localUtil.ntoc( A4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXLinMan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4889XLinMan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4889XLinMan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXLinMan_Jsonclick, 0, "", "", "", "", "", 1, edtXLinMan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      /* Save parent mode. */
      sMode1282 = Gx_mode ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1282 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1282 = (short)(1) ;
            scanStart1561282( ) ;
            while ( RcdFound1282 != 0 )
            {
               init_level_properties1282( ) ;
               getByPrimaryKey1561282( ) ;
               addRow1561282( ) ;
               scanNext1561282( ) ;
            }
            scanEnd1561282( ) ;
            nBlankRcdCount1282 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1561282( ) ;
         standaloneModal1561282( ) ;
         sMode1282 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1561282( ) ;
            edtXNRecep_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNRECEP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNRecep_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1282 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1561282( ) ;
            }
            sendRow1561282( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1282 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1282 = (short)(5) ;
         nRcdExists_1282 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1561282( ) ;
            while ( RcdFound1282 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351282( ) ;
               init_level_properties1282( ) ;
               standaloneNotModal1561282( ) ;
               getByPrimaryKey1561282( ) ;
               standaloneModal1561282( ) ;
               addRow1561282( ) ;
               scanNext1561282( ) ;
            }
            scanEnd1561282( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1282 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351282( ) ;
      initAll1561282( ) ;
      init_level_properties1282( ) ;
      nRcdExists_1282 = (short)(0) ;
      nIsMod_1282 = (short)(0) ;
      nRcdDeleted_1282 = (short)(0) ;
      nBlankRcdCount1282 = (short)(nBlankRcdUsr1282+nBlankRcdCount1282) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1282 > 0 )
      {
         standaloneNotModal1561282( ) ;
         standaloneModal1561282( ) ;
         addRow1561282( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtXNRecep_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1282 = (short)(nBlankRcdCount1282-1) ;
      }
      Gx_mode = sMode1282 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1282 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXGEHD3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXGEHD3.htm");
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
      e111562 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4882XDisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4882XDisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4889XLinMan = (short)(localUtil.ctol( httpContext.cgiGet( "Z4889XLinMan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4882XDisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtXDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
            A4889XLinMan = (short)(localUtil.ctol( httpContext.cgiGet( edtXLinMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4889XLinMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4889XLinMan), 4, 0));
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
               A4882XDisCod = (int)(GXutil.lval( httpContext.GetPar( "XDisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4882XDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4882XDisCod), 8, 0));
               A4889XLinMan = (short)(GXutil.lval( httpContext.GetPar( "XLinMan"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4889XLinMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4889XLinMan), 4, 0));
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
                        e111562 ();
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
            initAll156722( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1283_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1283_Enabled), 5, 0), !bGXsfl_47_Refreshing);
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
      disableAttributes156722( ) ;
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

   public void confirm_1560( )
   {
      beforeValidate156722( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls156722( ) ;
         }
         else
         {
            checkExtendedTable156722( ) ;
            if ( AnyError == 0 )
            {
               zm156722( 2) ;
            }
            closeExtendedTableCursors156722( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode722 = Gx_mode ;
         confirm_1561282( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode722 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1560( ) ;
      }
   }

   public void confirm_1561283( )
   {
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRow1561283( ) ;
         if ( ( nRcdExists_1283 != 0 ) || ( nIsMod_1283 != 0 ) )
         {
            getKey1561283( ) ;
            if ( ( nRcdExists_1283 == 0 ) && ( nRcdDeleted_1283 == 0 ) )
            {
               if ( RcdFound1283 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1561283( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1561283( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1561283( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXNRecep_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1283 != 0 )
               {
                  if ( nRcdDeleted_1283 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1561283( ) ;
                     load1561283( ) ;
                     beforeValidate1561283( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1561283( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1283 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1561283( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1561283( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1561283( ) ;
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
                  if ( nRcdDeleted_1283 == 0 )
                  {
                     GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXNRecep_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1283_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNPieza_Internalname, GXutil.rtrim( A9782XNPieza)) ;
         httpContext.changePostValue( edtXKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A9784XKilos, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A9785XMetros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9782XNPieza_"+sGXsfl_47_idx, GXutil.rtrim( Z9782XNPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z9784XKilos_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z9784XKilos, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9785XMetros_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z9785XMetros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1283_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1283_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1283_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1283 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1283_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1283_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPIEZA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XKILOS_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XMETROS_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1561282( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1561282( ) ;
         if ( ( nRcdExists_1282 != 0 ) || ( nIsMod_1282 != 0 ) )
         {
            getKey1561282( ) ;
            if ( ( nRcdExists_1282 == 0 ) && ( nRcdDeleted_1282 == 0 ) )
            {
               if ( RcdFound1282 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1561282( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1561282( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1561282( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1282 = Gx_mode ;
                        confirm_1561283( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1282 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1282 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXNRecep_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1282 != 0 )
               {
                  if ( nRcdDeleted_1282 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1561282( ) ;
                     load1561282( ) ;
                     beforeValidate1561282( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1561282( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1282 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1561282( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1561282( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1561282( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1282 = Gx_mode ;
                              confirm_1561283( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1282 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1282 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1282 == 0 )
                  {
                     GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXNRecep_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtXNRecep_Internalname, GXutil.ltrim( localUtil.ntoc( A9783XNRecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9783XNRecep_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9783XNRecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_47_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_47, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1282_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1282_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1282_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1282 != 0 )
         {
            httpContext.changePostValue( "XNRECEP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNRecep_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1560( )
   {
   }

   public void e111562( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      txgehd3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      txgehd3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV30Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Station", AV30Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      txgehd3_impl.this.A396EmprCod = GXv_char2[0] ;
      txgehd3_impl.this.AV29EmprNom = GXv_char3[0] ;
      txgehd3_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprNom", AV29EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV10Lit1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV31Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN558_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit2", AV31Lit2);
      GXt_char1 = AV22Lit3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit3", AV22Lit3);
      GXt_char1 = AV23Lit4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      GXt_char1 = AV24Lit5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL022_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      GXt_char1 = AV25Lit6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV031_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      GXt_char1 = AV26Lit7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char1 = AV28Lit9 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit9", AV28Lit9);
      GXt_char1 = AV12Lit11 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Lit11", AV12Lit11);
      GXt_char1 = AV11Lit10 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Lit10", AV11Lit10);
      GXt_char1 = AV27Lit8 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit8", AV27Lit8);
      GXt_char1 = AV13Lit12 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV046_", ""), (byte)(99), GXv_char4) ;
      txgehd3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit12", AV13Lit12);
   }

   public void zm156722( int GX_JID )
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
         Z4889XLinMan = A4889XLinMan ;
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TXGEHD3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      /* Using cursor T01568 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "XGEHD1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "XDISCOD");
         AnyError = (short)(1) ;
      }
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

   public void load156722( )
   {
      /* Using cursor T01569 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound722 = (short)(1) ;
         zm156722( -1) ;
      }
      pr_default.close(7);
      onLoadActions156722( ) ;
   }

   public void onLoadActions156722( )
   {
   }

   public void checkExtendedTable156722( )
   {
      nIsDirty_722 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors156722( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey156722( )
   {
      /* Using cursor T015610 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound722 = (short)(1) ;
      }
      else
      {
         RcdFound722 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01567 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(5) != 101) && ( T01567_A4889XLinMan[0] == A4889XLinMan ) && ( GXutil.strcmp(T01567_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01567_A4882XDisCod[0] == A4882XDisCod ) )
      {
         zm156722( 1) ;
         RcdFound722 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         sMode722 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load156722( ) ;
         if ( AnyError == 1 )
         {
            RcdFound722 = (short)(0) ;
            initializeNonKey156722( ) ;
         }
         Gx_mode = sMode722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound722 = (short)(0) ;
         initializeNonKey156722( ) ;
         sMode722 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode722 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey156722( ) ;
      if ( RcdFound722 == 0 )
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
      RcdFound722 = (short)(0) ;
      /* Using cursor T015611 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015611_A4882XDisCod[0] == A4882XDisCod ) && ( T015611_A4889XLinMan[0] == A4889XLinMan ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T015611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015611_A4882XDisCod[0] == A4882XDisCod ) && ( T015611_A4889XLinMan[0] == A4889XLinMan ) )
         {
            RcdFound722 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound722 = (short)(0) ;
      /* Using cursor T015612 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015612_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015612_A4882XDisCod[0] == A4882XDisCod ) && ( T015612_A4889XLinMan[0] == A4889XLinMan ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T015612_A396EmprCod[0], A396EmprCod) == 0 ) && ( T015612_A4882XDisCod[0] == A4882XDisCod ) && ( T015612_A4889XLinMan[0] == A4889XLinMan ) )
         {
            RcdFound722 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey156722( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert156722( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound722 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) || ( A4889XLinMan != Z4889XLinMan ) )
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
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update156722( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) || ( A4889XLinMan != Z4889XLinMan ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert156722( ) ;
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
                  insert156722( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) || ( A4889XLinMan != Z4889XLinMan ) )
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
      getKey156722( ) ;
      if ( RcdFound722 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) || ( A4889XLinMan != Z4889XLinMan ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4882XDisCod != Z4882XDisCod ) || ( A4889XLinMan != Z4889XLinMan ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txgehd3");
   }

   public void insert_check( )
   {
      confirm_1560( ) ;
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
      if ( RcdFound722 == 0 )
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
      scanStart156722( ) ;
      if ( RcdFound722 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd156722( ) ;
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
      if ( RcdFound722 == 0 )
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
      if ( RcdFound722 == 0 )
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
      scanStart156722( ) ;
      if ( RcdFound722 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound722 != 0 )
         {
            scanNext156722( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd156722( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency156722( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01566 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXGEHD2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert156722( )
   {
      beforeValidate156722( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable156722( ) ;
      }
      if ( AnyError == 0 )
      {
         zm156722( 0) ;
         checkOptimisticConcurrency156722( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm156722( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert156722( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015613 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A4889XLinMan), A396EmprCod, Integer.valueOf(A4882XDisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD2");
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
                        processLevel156722( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1560( ) ;
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
            load156722( ) ;
         }
         endLevel156722( ) ;
      }
      closeExtendedTableCursors156722( ) ;
   }

   public void update156722( )
   {
      beforeValidate156722( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable156722( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency156722( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm156722( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate156722( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPXGEHD2 */
                  deferredUpdate156722( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel156722( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1560( ) ;
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
         endLevel156722( ) ;
      }
      closeExtendedTableCursors156722( ) ;
   }

   public void deferredUpdate156722( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate156722( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency156722( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls156722( ) ;
         afterConfirm156722( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete156722( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015614 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD2");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound722 == 0 )
                     {
                        initAll156722( ) ;
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
                     resetCaption1560( ) ;
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
      sMode722 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel156722( ) ;
      Gx_mode = sMode722 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls156722( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T015615 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "XGEHD3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1561282( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1561282( ) ;
         if ( ( nRcdExists_1282 != 0 ) || ( nIsMod_1282 != 0 ) )
         {
            standaloneNotModal1561282( ) ;
            getKey1561282( ) ;
            if ( ( nRcdExists_1282 == 0 ) && ( nRcdDeleted_1282 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1561282( ) ;
            }
            else
            {
               if ( RcdFound1282 != 0 )
               {
                  if ( ( nRcdDeleted_1282 != 0 ) && ( nRcdExists_1282 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1561282( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1282 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1561282( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1282 == 0 )
                  {
                     GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXNRecep_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtXNRecep_Internalname, GXutil.ltrim( localUtil.ntoc( A9783XNRecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9783XNRecep_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9783XNRecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_47_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_47, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1282_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1282_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1282_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1282 != 0 )
         {
            httpContext.changePostValue( "XNRECEP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNRecep_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1561282( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1282 = (short)(0) ;
      nIsMod_1282 = (short)(0) ;
      nRcdDeleted_1282 = (short)(0) ;
   }

   public void processLevel156722( )
   {
      /* Save parent mode. */
      sMode722 = Gx_mode ;
      processNestedLevel1561282( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode722 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel156722( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete156722( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txgehd3");
         if ( AnyError == 0 )
         {
            confirmValues1560( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txgehd3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart156722( )
   {
      /* Scan By routine */
      /* Using cursor T015616 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      RcdFound722 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound722 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext156722( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound722 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound722 = (short)(1) ;
      }
   }

   public void scanEnd156722( )
   {
      pr_default.close(14);
   }

   public void afterConfirm156722( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert156722( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate156722( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete156722( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete156722( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate156722( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes156722( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtXDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXDisCod_Enabled), 5, 0), true);
      edtXLinMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXLinMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXLinMan_Enabled), 5, 0), true);
   }

   public void zm1561282( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         Z9783XNRecep = A9783XNRecep ;
      }
   }

   public void standaloneNotModal1561282( )
   {
   }

   public void standaloneModal1561282( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtXNRecep_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNRecep_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtXNRecep_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNRecep_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1561282( )
   {
      /* Using cursor T015617 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1282 = (short)(1) ;
         zm1561282( -3) ;
      }
      pr_default.close(15);
      onLoadActions1561282( ) ;
   }

   public void onLoadActions1561282( )
   {
   }

   public void checkExtendedTable1561282( )
   {
      nIsDirty_1282 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1561282( ) ;
   }

   public void closeExtendedTableCursors1561282( )
   {
   }

   public void enableDisable1561282( )
   {
   }

   public void getKey1561282( )
   {
      /* Using cursor T015618 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1282 = (short)(1) ;
      }
      else
      {
         RcdFound1282 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey1561282( )
   {
      /* Using cursor T01565 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01565_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01565_A4882XDisCod[0] == A4882XDisCod ) && ( T01565_A4889XLinMan[0] == A4889XLinMan ) )
      {
         zm1561282( 3) ;
         RcdFound1282 = (short)(1) ;
         initializeNonKey1561282( ) ;
         A9783XNRecep = T01565_A9783XNRecep[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         Z9783XNRecep = A9783XNRecep ;
         sMode1282 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1561282( ) ;
         load1561282( ) ;
         Gx_mode = sMode1282 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1282 = (short)(0) ;
         initializeNonKey1561282( ) ;
         sMode1282 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1561282( ) ;
         Gx_mode = sMode1282 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1561282( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1561282( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01564 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXGEHD3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1561282( )
   {
      beforeValidate1561282( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1561282( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1561282( 0) ;
         checkOptimisticConcurrency1561282( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1561282( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1561282( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015619 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD3");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevel1561282( ) ;
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
            load1561282( ) ;
         }
         endLevel1561282( ) ;
      }
      closeExtendedTableCursors1561282( ) ;
   }

   public void update1561282( )
   {
      beforeValidate1561282( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1561282( ) ;
      }
      if ( ( nIsMod_1282 != 0 ) || ( nIsDirty_1282 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1561282( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1561282( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1561282( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPXGEHD3 */
                     deferredUpdate1561282( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1561282( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1561282( ) ;
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
            endLevel1561282( ) ;
         }
      }
      closeExtendedTableCursors1561282( ) ;
   }

   public void deferredUpdate1561282( )
   {
   }

   public void delete1561282( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1561282( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1561282( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1561282( ) ;
         afterConfirm1561282( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1561282( ) ;
            if ( AnyError == 0 )
            {
               scanStart1561283( ) ;
               while ( RcdFound1283 != 0 )
               {
                  getByPrimaryKey1561283( ) ;
                  delete1561283( ) ;
                  scanNext1561283( ) ;
               }
               scanEnd1561283( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015620 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD3");
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
      sMode1282 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1561282( ) ;
      Gx_mode = sMode1282 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1561282( )
   {
      standaloneModal1561282( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1561283( )
   {
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRow1561283( ) ;
         if ( ( nRcdExists_1283 != 0 ) || ( nIsMod_1283 != 0 ) )
         {
            standaloneNotModal1561283( ) ;
            getKey1561283( ) ;
            if ( ( nRcdExists_1283 == 0 ) && ( nRcdDeleted_1283 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1561283( ) ;
            }
            else
            {
               if ( RcdFound1283 != 0 )
               {
                  if ( ( nRcdDeleted_1283 != 0 ) && ( nRcdExists_1283 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1561283( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1283 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1561283( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1283 == 0 )
                  {
                     GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXNRecep_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1283_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXNPieza_Internalname, GXutil.rtrim( A9782XNPieza)) ;
         httpContext.changePostValue( edtXKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A9784XKilos, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A9785XMetros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9782XNPieza_"+sGXsfl_47_idx, GXutil.rtrim( Z9782XNPieza)) ;
         httpContext.changePostValue( "ZT_"+"Z9784XKilos_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z9784XKilos, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9785XMetros_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z9785XMetros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1283_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1283_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1283_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1283 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1283_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1283_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XNPIEZA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPieza_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XKILOS_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XMETROS_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1561283( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1283 = (short)(0) ;
      nIsMod_1283 = (short)(0) ;
      nRcdDeleted_1283 = (short)(0) ;
   }

   public void processLevel1561282( )
   {
      /* Save parent mode. */
      sMode1282 = Gx_mode ;
      processNestedLevel1561283( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1282 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1561282( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1561282( )
   {
      /* Scan By routine */
      /* Using cursor T015621 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan)});
      RcdFound1282 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1282 = (short)(1) ;
         A9783XNRecep = T015621_A9783XNRecep[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1561282( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1282 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1282 = (short)(1) ;
         A9783XNRecep = T015621_A9783XNRecep[0] ;
      }
   }

   public void scanEnd1561282( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1561282( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1561282( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1561282( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1561282( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1561282( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1561282( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1561282( )
   {
      edtXNRecep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNRecep_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void zm1561283( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9784XKilos = T01563_A9784XKilos[0] ;
            Z9785XMetros = T01563_A9785XMetros[0] ;
         }
         else
         {
            Z9784XKilos = A9784XKilos ;
            Z9785XMetros = A9785XMetros ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         Z9783XNRecep = A9783XNRecep ;
         Z9782XNPieza = A9782XNPieza ;
         Z9784XKilos = A9784XKilos ;
         Z9785XMetros = A9785XMetros ;
      }
   }

   public void standaloneNotModal1561283( )
   {
   }

   public void standaloneModal1561283( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtXNPieza_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPieza_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
      else
      {
         edtXNPieza_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPieza_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      }
   }

   public void load1561283( )
   {
      /* Using cursor T015622 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1283 = (short)(1) ;
         A9784XKilos = T015622_A9784XKilos[0] ;
         n9784XKilos = T015622_n9784XKilos[0] ;
         A9785XMetros = T015622_A9785XMetros[0] ;
         n9785XMetros = T015622_n9785XMetros[0] ;
         zm1561283( -4) ;
      }
      pr_default.close(20);
      onLoadActions1561283( ) ;
   }

   public void onLoadActions1561283( )
   {
   }

   public void checkExtendedTable1561283( )
   {
      nIsDirty_1283 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1561283( ) ;
   }

   public void closeExtendedTableCursors1561283( )
   {
   }

   public void enableDisable1561283( )
   {
   }

   public void getKey1561283( )
   {
      /* Using cursor T015623 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1283 = (short)(1) ;
      }
      else
      {
         RcdFound1283 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1561283( )
   {
      /* Using cursor T01563 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01563_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01563_A4882XDisCod[0] == A4882XDisCod ) && ( T01563_A4889XLinMan[0] == A4889XLinMan ) )
      {
         zm1561283( 4) ;
         RcdFound1283 = (short)(1) ;
         initializeNonKey1561283( ) ;
         A9782XNPieza = T01563_A9782XNPieza[0] ;
         A9784XKilos = T01563_A9784XKilos[0] ;
         n9784XKilos = T01563_n9784XKilos[0] ;
         A9785XMetros = T01563_A9785XMetros[0] ;
         n9785XMetros = T01563_n9785XMetros[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4882XDisCod = A4882XDisCod ;
         Z4889XLinMan = A4889XLinMan ;
         Z9783XNRecep = A9783XNRecep ;
         Z9782XNPieza = A9782XNPieza ;
         sMode1283 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1561283( ) ;
         load1561283( ) ;
         Gx_mode = sMode1283 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1283 = (short)(0) ;
         initializeNonKey1561283( ) ;
         sMode1283 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1561283( ) ;
         Gx_mode = sMode1283 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1561283( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1561283( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01562 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD4"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9784XKilos, T01562_A9784XKilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z9785XMetros, T01562_A9785XMetros[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9784XKilos, T01562_A9784XKilos[0]) != 0 )
            {
               GXutil.writeLogln("txgehd3:[seudo value changed for attri]"+"XKilos");
               GXutil.writeLogRaw("Old: ",Z9784XKilos);
               GXutil.writeLogRaw("Current: ",T01562_A9784XKilos[0]);
            }
            if ( DecimalUtil.compareTo(Z9785XMetros, T01562_A9785XMetros[0]) != 0 )
            {
               GXutil.writeLogln("txgehd3:[seudo value changed for attri]"+"XMetros");
               GXutil.writeLogRaw("Old: ",Z9785XMetros);
               GXutil.writeLogRaw("Current: ",T01562_A9785XMetros[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPXGEHD4"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1561283( )
   {
      beforeValidate1561283( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1561283( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1561283( 0) ;
         checkOptimisticConcurrency1561283( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1561283( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1561283( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T015624 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza, Boolean.valueOf(n9784XKilos), A9784XKilos, Boolean.valueOf(n9785XMetros), A9785XMetros});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD4");
                  if ( (pr_default.getStatus(22) == 1) )
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
            load1561283( ) ;
         }
         endLevel1561283( ) ;
      }
      closeExtendedTableCursors1561283( ) ;
   }

   public void update1561283( )
   {
      beforeValidate1561283( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1561283( ) ;
      }
      if ( ( nIsMod_1283 != 0 ) || ( nIsDirty_1283 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1561283( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1561283( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1561283( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T015625 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n9784XKilos), A9784XKilos, Boolean.valueOf(n9785XMetros), A9785XMetros, A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD4");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPXGEHD4"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1561283( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1561283( ) ;
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
            endLevel1561283( ) ;
         }
      }
      closeExtendedTableCursors1561283( ) ;
   }

   public void deferredUpdate1561283( )
   {
   }

   public void delete1561283( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1561283( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1561283( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1561283( ) ;
         afterConfirm1561283( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1561283( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T015626 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep), A9782XNPieza});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXGEHD4");
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
      sMode1283 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1561283( ) ;
      Gx_mode = sMode1283 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1561283( )
   {
      standaloneModal1561283( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1561283( )
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

   public void scanStart1561283( )
   {
      /* Scan By routine */
      /* Using cursor T015627 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod), Short.valueOf(A4889XLinMan), Integer.valueOf(A9783XNRecep)});
      RcdFound1283 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1283 = (short)(1) ;
         A9782XNPieza = T015627_A9782XNPieza[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1561283( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1283 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1283 = (short)(1) ;
         A9782XNPieza = T015627_A9782XNPieza[0] ;
      }
   }

   public void scanEnd1561283( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1561283( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1561283( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1561283( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1561283( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1561283( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1561283( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1561283( )
   {
      edtXNPieza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPieza_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtXKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXKilos_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtXMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXMetros_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void send_integrity_lvl_hashes1561283( )
   {
   }

   public void send_integrity_lvl_hashes1561282( )
   {
   }

   public void send_integrity_lvl_hashes156722( )
   {
   }

   public void subsflControlProps_351282( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_idx ;
      edtXNRecep_Internalname = "XNRECEP_"+sGXsfl_35_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351282( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_fel_idx ;
      edtXNRecep_Internalname = "XNRECEP_"+sGXsfl_35_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1561282( )
   {
      nRC_GXsfl_47 = 0 ;
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351282( ) ;
      sendRow1561282( ) ;
   }

   public void sendRow1561282( )
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
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock4_Internalname,httpContext.getMessage( "Recepcion", ""),"","",lblTextblock4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1282_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXNRecep_Internalname,GXutil.ltrim( localUtil.ntoc( A9783XNRecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9783XNRecep), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXNRecep_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtXNRecep_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
      startgridcontrol47( ) ;
      nGXsfl_47_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1283 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1283 = (short)(1) ;
            scanStart1561283( ) ;
            while ( RcdFound1283 != 0 )
            {
               init_level_properties1283( ) ;
               getByPrimaryKey1561283( ) ;
               addRow1561283( ) ;
               scanNext1561283( ) ;
            }
            scanEnd1561283( ) ;
            nBlankRcdCount1283 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1561283( ) ;
         standaloneModal1561283( ) ;
         sMode1283 = Gx_mode ;
         while ( nGXsfl_47_idx < nRC_GXsfl_47 )
         {
            bGXsfl_47_Refreshing = true ;
            readRow1561283( ) ;
            edtavnRcdDeleted_1283_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1283_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1283_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1283_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtXNPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNPIEZA_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPieza_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtXKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XKILOS_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXKilos_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtXMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XMETROS_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXMetros_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            if ( ( nRcdExists_1283 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1561283( ) ;
            }
            sendRow1561283( ) ;
            bGXsfl_47_Refreshing = false ;
         }
         Gx_mode = sMode1283 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1283 = (short)(5) ;
         nRcdExists_1283 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1561283( ) ;
            while ( RcdFound1283 != 0 )
            {
               sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
               subsflControlProps_471283( ) ;
               init_level_properties1283( ) ;
               standaloneNotModal1561283( ) ;
               getByPrimaryKey1561283( ) ;
               standaloneModal1561283( ) ;
               addRow1561283( ) ;
               scanNext1561283( ) ;
            }
            scanEnd1561283( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1283 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_471283( ) ;
      initAll1561283( ) ;
      init_level_properties1283( ) ;
      nRcdExists_1283 = (short)(0) ;
      nIsMod_1283 = (short)(0) ;
      nRcdDeleted_1283 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 35 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_35_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1283 = (short)(nBlankRcdUsr1283+nBlankRcdCount1283) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1283 > 0 )
      {
         standaloneNotModal1561283( ) ;
         standaloneModal1561283( ) ;
         addRow1561283( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtXNPieza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1283 = (short)(nBlankRcdCount1283-1) ;
      }
      Gx_mode = sMode1283 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      send_integrity_lvl_hashes1561282( ) ;
      GXCCtl = "Z9783XNRecep_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9783XNRecep, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_47_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_47_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1282_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1282_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1282_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1282, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNRECEP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNRecep_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void readRow1561282( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351282( ) ;
      edtXNRecep_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNRECEP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXNRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXNRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "XNRECEP_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXNRecep_Internalname ;
         wbErr = true ;
         A9783XNRecep = 0 ;
      }
      else
      {
         A9783XNRecep = (int)(localUtil.ctol( httpContext.cgiGet( edtXNRecep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z9783XNRecep_" + sGXsfl_35_idx ;
      Z9783XNRecep = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_47_" + sGXsfl_35_idx ;
      nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1282_" + sGXsfl_35_idx ;
      nRcdDeleted_1282 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1282_" + sGXsfl_35_idx ;
      nRcdExists_1282 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1282_" + sGXsfl_35_idx ;
      nIsMod_1282 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_47_" + sGXsfl_35_idx ;
      nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_471283( )
   {
      edtavnRcdDeleted_1283_Internalname = "vNRCDDELETED_1283_"+sGXsfl_47_idx ;
      edtXNPieza_Internalname = "XNPIEZA_"+sGXsfl_47_idx ;
      edtXKilos_Internalname = "XKILOS_"+sGXsfl_47_idx ;
      edtXMetros_Internalname = "XMETROS_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_471283( )
   {
      edtavnRcdDeleted_1283_Internalname = "vNRCDDELETED_1283_"+sGXsfl_47_fel_idx ;
      edtXNPieza_Internalname = "XNPIEZA_"+sGXsfl_47_fel_idx ;
      edtXKilos_Internalname = "XKILOS_"+sGXsfl_47_fel_idx ;
      edtXMetros_Internalname = "XMETROS_"+sGXsfl_47_fel_idx ;
   }

   public void addRow1561283( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_471283( ) ;
      sendRow1561283( ) ;
   }

   public void sendRow1561283( )
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
         if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1283_" + sGXsfl_47_idx + "',1);gx.fn.setControlValue('nIsMod_1282_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1283_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1283_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1283), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1283), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1283_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1283_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1283_" + sGXsfl_47_idx + "',1);gx.fn.setControlValue('nIsMod_1282_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXNPieza_Internalname,GXutil.rtrim( A9782XNPieza),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXNPieza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXNPieza_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1283_" + sGXsfl_47_idx + "',1);gx.fn.setControlValue('nIsMod_1282_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXKilos_Internalname,GXutil.ltrim( localUtil.ntoc( A9784XKilos, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXKilos_Enabled!=0) ? localUtil.format( A9784XKilos, "ZZZ9.99") : localUtil.format( A9784XKilos, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXKilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1283_" + sGXsfl_47_idx + "',1);gx.fn.setControlValue('nIsMod_1282_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A9785XMetros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXMetros_Enabled!=0) ? localUtil.format( A9785XMetros, "ZZZ9.99") : localUtil.format( A9785XMetros, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXMetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1561283( ) ;
      GXCCtl = "Z9782XNPieza_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9782XNPieza));
      GXCCtl = "Z9784XKilos_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9784XKilos, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9785XMetros_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9785XMetros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1283_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1283_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1283_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1283, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1283_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1283_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XNPIEZA_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XKILOS_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XMETROS_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1561283( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_471283( ) ;
      edtavnRcdDeleted_1283_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1283_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXNPieza_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XNPIEZA_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XKILOS_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XMETROS_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1283_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1283_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1283");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1283_Internalname ;
         wbErr = true ;
         nRcdDeleted_1283 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1283 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1283_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9782XNPieza = httpContext.cgiGet( edtXNPieza_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXKilos_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "XKILOS_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXKilos_Internalname ;
         wbErr = true ;
         A9784XKilos = DecimalUtil.ZERO ;
         n9784XKilos = false ;
      }
      else
      {
         A9784XKilos = localUtil.ctond( httpContext.cgiGet( edtXKilos_Internalname)) ;
         n9784XKilos = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXMetros_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "XMETROS_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXMetros_Internalname ;
         wbErr = true ;
         A9785XMetros = DecimalUtil.ZERO ;
         n9785XMetros = false ;
      }
      else
      {
         A9785XMetros = localUtil.ctond( httpContext.cgiGet( edtXMetros_Internalname)) ;
         n9785XMetros = false ;
      }
      GXCCtl = "Z9782XNPieza_" + sGXsfl_47_idx ;
      Z9782XNPieza = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9784XKilos_" + sGXsfl_47_idx ;
      Z9784XKilos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9785XMetros_" + sGXsfl_47_idx ;
      Z9785XMetros = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1283_" + sGXsfl_47_idx ;
      nRcdDeleted_1283 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1283_" + sGXsfl_47_idx ;
      nRcdExists_1283 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1283_" + sGXsfl_47_idx ;
      nIsMod_1283 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtXNPieza_Enabled = edtXNPieza_Enabled ;
      defedtXNRecep_Enabled = edtXNRecep_Enabled ;
   }

   public void confirmValues1560( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351282( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351282( ) ;
         httpContext.changePostValue( "Z9783XNRecep_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z9783XNRecep_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9783XNRecep_"+sGXsfl_35_idx) ;
      }
      nGXsfl_47_idx = 0 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_471283( ) ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_471283( ) ;
         httpContext.changePostValue( "Z9782XNPieza_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z9782XNPieza_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9782XNPieza_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z9784XKilos_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z9784XKilos_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9784XKilos_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z9785XMetros_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z9785XMetros_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9785XMetros_"+sGXsfl_47_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txgehd3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4882XDisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4889XLinMan,4,0))}, new String[] {"EmprCod","XDisCod","XLinMan"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4882XDisCod", GXutil.ltrim( localUtil.ntoc( Z4882XDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4889XLinMan", GXutil.ltrim( localUtil.ntoc( Z4889XLinMan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.txgehd3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4882XDisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4889XLinMan,4,0))}, new String[] {"EmprCod","XDisCod","XLinMan"})  ;
   }

   public String getPgmname( )
   {
      return "TXGEHD3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DISTRIBUCION POR PIEZAS", "") ;
   }

   public void initializeNonKey156722( )
   {
   }

   public void initAll156722( )
   {
      initializeNonKey156722( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1561282( )
   {
   }

   public void initAll1561282( )
   {
      A9783XNRecep = 0 ;
      initializeNonKey1561282( ) ;
   }

   public void standaloneModalInsert1561282( )
   {
   }

   public void initializeNonKey1561283( )
   {
      A9784XKilos = DecimalUtil.ZERO ;
      n9784XKilos = false ;
      A9785XMetros = DecimalUtil.ZERO ;
      n9785XMetros = false ;
      Z9784XKilos = DecimalUtil.ZERO ;
      Z9785XMetros = DecimalUtil.ZERO ;
   }

   public void initAll1561283( )
   {
      A9782XNPieza = "" ;
      initializeNonKey1561283( ) ;
   }

   public void standaloneModalInsert1561283( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016282756", true, true);
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
      httpContext.AddJavascriptSource("txgehd3.js", "?202661016282756", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1282( )
   {
      edtXNRecep_Enabled = defedtXNRecep_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNRecep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNRecep_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void init_level_properties1283( )
   {
      edtXNPieza_Enabled = defedtXNPieza_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXNPieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXNPieza_Enabled), 5, 0), !bGXsfl_47_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9783XNRecep, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXNRecep_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol47( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1283, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1283_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A9782XNPieza));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXNPieza_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9784XKilos, (byte)(7), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9785XMetros, (byte)(7), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtXDisCod_Internalname = "XDISCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXLinMan_Internalname = "XLINMAN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXNRecep_Internalname = "XNRECEP" ;
      edtavnRcdDeleted_1283_Internalname = "vNRCDDELETED_1283" ;
      edtXNPieza_Internalname = "XNPIEZA" ;
      edtXKilos_Internalname = "XKILOS" ;
      edtXMetros_Internalname = "XMETROS" ;
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
      lblTextblock4_Caption = httpContext.getMessage( "Recepcion", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "DISTRIBUCION POR PIEZAS", "") );
      edtXMetros_Jsonclick = "" ;
      edtXKilos_Jsonclick = "" ;
      edtXNPieza_Jsonclick = "" ;
      edtavnRcdDeleted_1283_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtXNRecep_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtXMetros_Enabled = 1 ;
      edtXKilos_Enabled = 1 ;
      edtXNPieza_Enabled = 1 ;
      edtavnRcdDeleted_1283_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXNRecep_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtXLinMan_Jsonclick = "" ;
      edtXLinMan_Backcolor = (int)(0xFFFFFF) ;
      edtXLinMan_Enabled = 0 ;
      edtXDisCod_Jsonclick = "" ;
      edtXDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtXDisCod_Enabled = 0 ;
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
      subsflControlProps_351282( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1561282( ) ;
         standaloneModal1561282( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1561282( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351282( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_471283( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1561282( ) ;
         standaloneModal1561282( ) ;
         standaloneNotModal1561283( ) ;
         standaloneModal1561283( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1561283( ) ;
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_471283( ) ;
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
      /* Using cursor T015628 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "XGEHD1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "XDISCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(26);
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

   public void valid_Xlinman( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4882XDisCod", GXutil.ltrim( localUtil.ntoc( Z4882XDisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4889XLinMan", GXutil.ltrim( localUtil.ntoc( Z4889XLinMan, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'},{av:'A4889XLinMan',fld:'XLINMAN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_XDISCOD","{handler:'valid_Xdiscod',iparms:[]");
      setEventMetadata("VALID_XDISCOD",",oparms:[]}");
      setEventMetadata("VALID_XLINMAN","{handler:'valid_Xlinman',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4882XDisCod',fld:'XDISCOD',pic:'ZZZZZZZ9'},{av:'A4889XLinMan',fld:'XLINMAN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_XLINMAN",",oparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4882XDisCod'},{av:'Z4889XLinMan'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_XNRECEP","{handler:'valid_Xnrecep',iparms:[]");
      setEventMetadata("VALID_XNRECEP",",oparms:[]}");
      setEventMetadata("VALID_XNPIEZA","{handler:'valid_Xnpieza',iparms:[]");
      setEventMetadata("VALID_XNPIEZA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Xmetros',iparms:[]");
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
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9782XNPieza = "" ;
      Z9784XKilos = DecimalUtil.ZERO ;
      Z9785XMetros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      lblTextblock3_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1282 = "" ;
      GX_FocusControl = "" ;
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
      sMode722 = "" ;
      GXCCtl = "" ;
      A9782XNPieza = "" ;
      A9784XKilos = DecimalUtil.ZERO ;
      A9785XMetros = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      AV30Station = "" ;
      GXv_char2 = new String[1] ;
      AV29EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      AV10Lit1 = "" ;
      AV31Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV28Lit9 = "" ;
      AV12Lit11 = "" ;
      AV11Lit10 = "" ;
      AV27Lit8 = "" ;
      AV13Lit12 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      T01568_A396EmprCod = new String[] {""} ;
      T01569_A4889XLinMan = new short[1] ;
      T01569_A396EmprCod = new String[] {""} ;
      T01569_A4882XDisCod = new int[1] ;
      T015610_A396EmprCod = new String[] {""} ;
      T015610_A4882XDisCod = new int[1] ;
      T015610_A4889XLinMan = new short[1] ;
      T01567_A4889XLinMan = new short[1] ;
      T01567_A396EmprCod = new String[] {""} ;
      T01567_A4882XDisCod = new int[1] ;
      T015611_A396EmprCod = new String[] {""} ;
      T015611_A4882XDisCod = new int[1] ;
      T015611_A4889XLinMan = new short[1] ;
      T015612_A396EmprCod = new String[] {""} ;
      T015612_A4882XDisCod = new int[1] ;
      T015612_A4889XLinMan = new short[1] ;
      T01566_A4889XLinMan = new short[1] ;
      T01566_A396EmprCod = new String[] {""} ;
      T01566_A4882XDisCod = new int[1] ;
      T015615_A396EmprCod = new String[] {""} ;
      T015615_A4882XDisCod = new int[1] ;
      T015615_A4889XLinMan = new short[1] ;
      T015615_A9783XNRecep = new int[1] ;
      T015616_A396EmprCod = new String[] {""} ;
      T015616_A4882XDisCod = new int[1] ;
      T015616_A4889XLinMan = new short[1] ;
      T015617_A396EmprCod = new String[] {""} ;
      T015617_A4882XDisCod = new int[1] ;
      T015617_A4889XLinMan = new short[1] ;
      T015617_A9783XNRecep = new int[1] ;
      T015618_A396EmprCod = new String[] {""} ;
      T015618_A4882XDisCod = new int[1] ;
      T015618_A4889XLinMan = new short[1] ;
      T015618_A9783XNRecep = new int[1] ;
      T01565_A396EmprCod = new String[] {""} ;
      T01565_A4882XDisCod = new int[1] ;
      T01565_A4889XLinMan = new short[1] ;
      T01565_A9783XNRecep = new int[1] ;
      T01564_A396EmprCod = new String[] {""} ;
      T01564_A4882XDisCod = new int[1] ;
      T01564_A4889XLinMan = new short[1] ;
      T01564_A9783XNRecep = new int[1] ;
      T015621_A396EmprCod = new String[] {""} ;
      T015621_A4882XDisCod = new int[1] ;
      T015621_A4889XLinMan = new short[1] ;
      T015621_A9783XNRecep = new int[1] ;
      T015622_A396EmprCod = new String[] {""} ;
      T015622_A4882XDisCod = new int[1] ;
      T015622_A4889XLinMan = new short[1] ;
      T015622_A9783XNRecep = new int[1] ;
      T015622_A9782XNPieza = new String[] {""} ;
      T015622_A9784XKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015622_n9784XKilos = new boolean[] {false} ;
      T015622_A9785XMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T015622_n9785XMetros = new boolean[] {false} ;
      T015623_A396EmprCod = new String[] {""} ;
      T015623_A4882XDisCod = new int[1] ;
      T015623_A4889XLinMan = new short[1] ;
      T015623_A9783XNRecep = new int[1] ;
      T015623_A9782XNPieza = new String[] {""} ;
      T01563_A396EmprCod = new String[] {""} ;
      T01563_A4882XDisCod = new int[1] ;
      T01563_A4889XLinMan = new short[1] ;
      T01563_A9783XNRecep = new int[1] ;
      T01563_A9782XNPieza = new String[] {""} ;
      T01563_A9784XKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01563_n9784XKilos = new boolean[] {false} ;
      T01563_A9785XMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01563_n9785XMetros = new boolean[] {false} ;
      sMode1283 = "" ;
      T01562_A396EmprCod = new String[] {""} ;
      T01562_A4882XDisCod = new int[1] ;
      T01562_A4889XLinMan = new short[1] ;
      T01562_A9783XNRecep = new int[1] ;
      T01562_A9782XNPieza = new String[] {""} ;
      T01562_A9784XKilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01562_n9784XKilos = new boolean[] {false} ;
      T01562_A9785XMetros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01562_n9785XMetros = new boolean[] {false} ;
      T015627_A396EmprCod = new String[] {""} ;
      T015627_A4882XDisCod = new int[1] ;
      T015627_A4889XLinMan = new short[1] ;
      T015627_A9783XNRecep = new int[1] ;
      T015627_A9782XNPieza = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock4_Jsonclick = "" ;
      ROClassString = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T015628_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txgehd3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txgehd3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txgehd3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txgehd3__default(),
         new Object[] {
             new Object[] {
            T01562_A396EmprCod, T01562_A4882XDisCod, T01562_A4889XLinMan, T01562_A9783XNRecep, T01562_A9782XNPieza, T01562_A9784XKilos, T01562_n9784XKilos, T01562_A9785XMetros, T01562_n9785XMetros
            }
            , new Object[] {
            T01563_A396EmprCod, T01563_A4882XDisCod, T01563_A4889XLinMan, T01563_A9783XNRecep, T01563_A9782XNPieza, T01563_A9784XKilos, T01563_n9784XKilos, T01563_A9785XMetros, T01563_n9785XMetros
            }
            , new Object[] {
            T01564_A396EmprCod, T01564_A4882XDisCod, T01564_A4889XLinMan, T01564_A9783XNRecep
            }
            , new Object[] {
            T01565_A396EmprCod, T01565_A4882XDisCod, T01565_A4889XLinMan, T01565_A9783XNRecep
            }
            , new Object[] {
            T01566_A4889XLinMan, T01566_A396EmprCod, T01566_A4882XDisCod
            }
            , new Object[] {
            T01567_A4889XLinMan, T01567_A396EmprCod, T01567_A4882XDisCod
            }
            , new Object[] {
            T01568_A396EmprCod
            }
            , new Object[] {
            T01569_A4889XLinMan, T01569_A396EmprCod, T01569_A4882XDisCod
            }
            , new Object[] {
            T015610_A396EmprCod, T015610_A4882XDisCod, T015610_A4889XLinMan
            }
            , new Object[] {
            T015611_A396EmprCod, T015611_A4882XDisCod, T015611_A4889XLinMan
            }
            , new Object[] {
            T015612_A396EmprCod, T015612_A4882XDisCod, T015612_A4889XLinMan
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015615_A396EmprCod, T015615_A4882XDisCod, T015615_A4889XLinMan, T015615_A9783XNRecep
            }
            , new Object[] {
            T015616_A396EmprCod, T015616_A4882XDisCod, T015616_A4889XLinMan
            }
            , new Object[] {
            T015617_A396EmprCod, T015617_A4882XDisCod, T015617_A4889XLinMan, T015617_A9783XNRecep
            }
            , new Object[] {
            T015618_A396EmprCod, T015618_A4882XDisCod, T015618_A4889XLinMan, T015618_A9783XNRecep
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015621_A396EmprCod, T015621_A4882XDisCod, T015621_A4889XLinMan, T015621_A9783XNRecep
            }
            , new Object[] {
            T015622_A396EmprCod, T015622_A4882XDisCod, T015622_A4889XLinMan, T015622_A9783XNRecep, T015622_A9782XNPieza, T015622_A9784XKilos, T015622_n9784XKilos, T015622_A9785XMetros, T015622_n9785XMetros
            }
            , new Object[] {
            T015623_A396EmprCod, T015623_A4882XDisCod, T015623_A4889XLinMan, T015623_A9783XNRecep, T015623_A9782XNPieza
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T015627_A396EmprCod, T015627_A4882XDisCod, T015627_A4889XLinMan, T015627_A9783XNRecep, T015627_A9782XNPieza
            }
            , new Object[] {
            T015628_A396EmprCod
            }
         }
      );
      Z4889XLinMan = (short)(0) ;
      A4889XLinMan = (short)(0) ;
      Z4882XDisCod = 0 ;
      A4882XDisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TXGEHD3" ;
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
   private short wcpOA4889XLinMan ;
   private short Z4889XLinMan ;
   private short nRcdDeleted_1282 ;
   private short nRcdExists_1282 ;
   private short nIsMod_1282 ;
   private short nRcdDeleted_1283 ;
   private short nRcdExists_1283 ;
   private short nIsMod_1283 ;
   private short A4889XLinMan ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1282 ;
   private short RcdFound1282 ;
   private short nBlankRcdUsr1282 ;
   private short RcdFound1283 ;
   private short RcdFound722 ;
   private short nIsDirty_722 ;
   private short nIsDirty_1282 ;
   private short nIsDirty_1283 ;
   private short nBlankRcdCount1283 ;
   private short nBlankRcdUsr1283 ;
   private short subGrid1_Borderwidth ;
   private short ZZ4889XLinMan ;
   private int wcpOA4882XDisCod ;
   private int Z4882XDisCod ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z9783XNRecep ;
   private int nRC_GXsfl_47 ;
   private int nGXsfl_47_idx=1 ;
   private int A4882XDisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtXDisCod_Enabled ;
   private int edtXLinMan_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXNRecep_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1283_Enabled ;
   private int edtXNPieza_Enabled ;
   private int edtXKilos_Enabled ;
   private int edtXMetros_Enabled ;
   private int A9783XNRecep ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtXNPieza_Enabled ;
   private int defedtXNRecep_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtXLinMan_Backcolor ;
   private int edtXDisCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4882XDisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z9784XKilos ;
   private java.math.BigDecimal Z9785XMetros ;
   private java.math.BigDecimal A9784XKilos ;
   private java.math.BigDecimal A9785XMetros ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z9782XNPieza ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_35_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_47_idx="0001" ;
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
   private String edtXDisCod_Internalname ;
   private String edtXDisCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXLinMan_Internalname ;
   private String edtXLinMan_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1282 ;
   private String edtXNRecep_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1283_Internalname ;
   private String sMode722 ;
   private String GXCCtl ;
   private String edtXNPieza_Internalname ;
   private String A9782XNPieza ;
   private String edtXKilos_Internalname ;
   private String edtXMetros_Internalname ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String AV30Station ;
   private String GXv_char2[] ;
   private String AV29EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String AV10Lit1 ;
   private String AV31Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV28Lit9 ;
   private String AV12Lit11 ;
   private String AV11Lit10 ;
   private String AV27Lit8 ;
   private String AV13Lit12 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sMode1283 ;
   private String lblTextblock4_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String ROClassString ;
   private String edtXNRecep_Jsonclick ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1283_Jsonclick ;
   private String edtXNPieza_Jsonclick ;
   private String edtXKilos_Jsonclick ;
   private String edtXMetros_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock4_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n9784XKilos ;
   private boolean n9785XMetros ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01568_A396EmprCod ;
   private short[] T01569_A4889XLinMan ;
   private String[] T01569_A396EmprCod ;
   private int[] T01569_A4882XDisCod ;
   private String[] T015610_A396EmprCod ;
   private int[] T015610_A4882XDisCod ;
   private short[] T015610_A4889XLinMan ;
   private short[] T01567_A4889XLinMan ;
   private String[] T01567_A396EmprCod ;
   private int[] T01567_A4882XDisCod ;
   private String[] T015611_A396EmprCod ;
   private int[] T015611_A4882XDisCod ;
   private short[] T015611_A4889XLinMan ;
   private String[] T015612_A396EmprCod ;
   private int[] T015612_A4882XDisCod ;
   private short[] T015612_A4889XLinMan ;
   private short[] T01566_A4889XLinMan ;
   private String[] T01566_A396EmprCod ;
   private int[] T01566_A4882XDisCod ;
   private String[] T015615_A396EmprCod ;
   private int[] T015615_A4882XDisCod ;
   private short[] T015615_A4889XLinMan ;
   private int[] T015615_A9783XNRecep ;
   private String[] T015616_A396EmprCod ;
   private int[] T015616_A4882XDisCod ;
   private short[] T015616_A4889XLinMan ;
   private String[] T015617_A396EmprCod ;
   private int[] T015617_A4882XDisCod ;
   private short[] T015617_A4889XLinMan ;
   private int[] T015617_A9783XNRecep ;
   private String[] T015618_A396EmprCod ;
   private int[] T015618_A4882XDisCod ;
   private short[] T015618_A4889XLinMan ;
   private int[] T015618_A9783XNRecep ;
   private String[] T01565_A396EmprCod ;
   private int[] T01565_A4882XDisCod ;
   private short[] T01565_A4889XLinMan ;
   private int[] T01565_A9783XNRecep ;
   private String[] T01564_A396EmprCod ;
   private int[] T01564_A4882XDisCod ;
   private short[] T01564_A4889XLinMan ;
   private int[] T01564_A9783XNRecep ;
   private String[] T015621_A396EmprCod ;
   private int[] T015621_A4882XDisCod ;
   private short[] T015621_A4889XLinMan ;
   private int[] T015621_A9783XNRecep ;
   private String[] T015622_A396EmprCod ;
   private int[] T015622_A4882XDisCod ;
   private short[] T015622_A4889XLinMan ;
   private int[] T015622_A9783XNRecep ;
   private String[] T015622_A9782XNPieza ;
   private java.math.BigDecimal[] T015622_A9784XKilos ;
   private boolean[] T015622_n9784XKilos ;
   private java.math.BigDecimal[] T015622_A9785XMetros ;
   private boolean[] T015622_n9785XMetros ;
   private String[] T015623_A396EmprCod ;
   private int[] T015623_A4882XDisCod ;
   private short[] T015623_A4889XLinMan ;
   private int[] T015623_A9783XNRecep ;
   private String[] T015623_A9782XNPieza ;
   private String[] T01563_A396EmprCod ;
   private int[] T01563_A4882XDisCod ;
   private short[] T01563_A4889XLinMan ;
   private int[] T01563_A9783XNRecep ;
   private String[] T01563_A9782XNPieza ;
   private java.math.BigDecimal[] T01563_A9784XKilos ;
   private boolean[] T01563_n9784XKilos ;
   private java.math.BigDecimal[] T01563_A9785XMetros ;
   private boolean[] T01563_n9785XMetros ;
   private String[] T01562_A396EmprCod ;
   private int[] T01562_A4882XDisCod ;
   private short[] T01562_A4889XLinMan ;
   private int[] T01562_A9783XNRecep ;
   private String[] T01562_A9782XNPieza ;
   private java.math.BigDecimal[] T01562_A9784XKilos ;
   private boolean[] T01562_n9784XKilos ;
   private java.math.BigDecimal[] T01562_A9785XMetros ;
   private boolean[] T01562_n9785XMetros ;
   private String[] T015627_A396EmprCod ;
   private int[] T015627_A4882XDisCod ;
   private short[] T015627_A4889XLinMan ;
   private int[] T015627_A9783XNRecep ;
   private String[] T015627_A9782XNPieza ;
   private String[] T015628_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txgehd3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txgehd3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01562", "SELECT EmprCod, XDisCod, XLinMan, XNRecep, XNPieza, XKilos, XMetros FROM TXPXGEHD4 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? AND XNPieza = ?  FOR UPDATE OF XKilos, XMetros NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01563", "SELECT EmprCod, XDisCod, XLinMan, XNRecep, XNPieza, XKilos, XMetros FROM TXPXGEHD4 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? AND XNPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01564", "SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01565", "SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01566", "SELECT XLinMan, EmprCod, XDisCod FROM TXPXGEHD2 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?  FOR UPDATE OF XLinMan NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01567", "SELECT XLinMan, EmprCod, XDisCod FROM TXPXGEHD2 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01568", "SELECT EmprCod FROM TXPXGEHD1 WHERE EmprCod = ? AND XDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01569", "SELECT /*+ FIRST_ROWS(1) */ TM1.XLinMan, TM1.EmprCod, TM1.XDisCod FROM TXPXGEHD2 TM1 WHERE TM1.EmprCod = ? and TM1.XDisCod = ? and TM1.XLinMan = ? ORDER BY TM1.EmprCod, TM1.XDisCod, TM1.XLinMan ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015610", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, XDisCod, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015611", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XDisCod, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? ORDER BY EmprCod, XDisCod, XLinMan) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015612", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, XDisCod, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? ORDER BY EmprCod DESC, XDisCod DESC, XLinMan DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T015613", "INSERT INTO TXPXGEHD2(XLinMan, EmprCod, XDisCod, XPdasNum, XCantPdas, XPzasPdas, XMaqPdas, XNEstilo, XNPda) VALUES(?, ?, ?, 0, 0, 0, ' ', ' ', ' ')", GX_NOMASK, "TXPXGEHD2")
         ,new UpdateCursor("T015614", "DELETE FROM TXPXGEHD2  WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?", GX_NOMASK, "TXPXGEHD2")
         ,new ForEachCursor("T015615", "SELECT * FROM (SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015616", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, XDisCod, XLinMan FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? ORDER BY EmprCod, XDisCod, XLinMan ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T015617", "SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? and XNRecep = ? ORDER BY EmprCod, XDisCod, XLinMan, XNRecep ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015618", "SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015619", "INSERT INTO TXPXGEHD3(EmprCod, XDisCod, XLinMan, XNRecep) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPXGEHD3")
         ,new UpdateCursor("T015620", "DELETE FROM TXPXGEHD3  WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ?", GX_NOMASK, "TXPXGEHD3")
         ,new ForEachCursor("T015621", "SELECT EmprCod, XDisCod, XLinMan, XNRecep FROM TXPXGEHD3 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? ORDER BY EmprCod, XDisCod, XLinMan, XNRecep ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015622", "SELECT EmprCod, XDisCod, XLinMan, XNRecep, XNPieza, XKilos, XMetros FROM TXPXGEHD4 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? and XNRecep = ? and XNPieza = ? ORDER BY EmprCod, XDisCod, XLinMan, XNRecep, XNPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015623", "SELECT EmprCod, XDisCod, XLinMan, XNRecep, XNPieza FROM TXPXGEHD4 WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? AND XNPieza = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T015624", "INSERT INTO TXPXGEHD4(EmprCod, XDisCod, XLinMan, XNRecep, XNPieza, XKilos, XMetros) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPXGEHD4")
         ,new UpdateCursor("T015625", "UPDATE TXPXGEHD4 SET XKilos=?, XMetros=?  WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? AND XNPieza = ?", GX_NOMASK, "TXPXGEHD4")
         ,new UpdateCursor("T015626", "DELETE FROM TXPXGEHD4  WHERE EmprCod = ? AND XDisCod = ? AND XLinMan = ? AND XNRecep = ? AND XNPieza = ?", GX_NOMASK, "TXPXGEHD4")
         ,new ForEachCursor("T015627", "SELECT EmprCod, XDisCod, XLinMan, XNRecep, XNPieza FROM TXPXGEHD4 WHERE EmprCod = ? and XDisCod = ? and XLinMan = ? and XNRecep = ? ORDER BY EmprCod, XDisCod, XLinMan, XNRecep, XNPieza ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T015628", "SELECT EmprCod FROM TXPXGEHD1 WHERE EmprCod = ? AND XDisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 26 :
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               return;
            case 23 :
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setString(7, (String)parms[8], 9);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

