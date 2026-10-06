package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordeindutexma_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A9430TMCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ordenes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOMCod_Internalname ;
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

   public tmordeindutexma_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordeindutexma_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordeindutexma_impl.class ));
   }

   public tmordeindutexma_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMOrdeIndutexma.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdeIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdeIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdeIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdeIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod de Orden de Mantto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMOrdeIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      /* Save parent mode. */
      sMode1530 = Gx_mode ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1530 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1530 = (short)(1) ;
            scanStart1KS1530( ) ;
            while ( RcdFound1530 != 0 )
            {
               init_level_properties1530( ) ;
               getByPrimaryKey1KS1530( ) ;
               addRow1KS1530( ) ;
               scanNext1KS1530( ) ;
            }
            scanEnd1KS1530( ) ;
            nBlankRcdCount1530 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KS1530( ) ;
         standaloneModal1KS1530( ) ;
         sMode1530 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1KS1530( ) ;
            edtTMCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtTMDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtTMTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMTXT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1530 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KS1530( ) ;
            }
            sendRow1KS1530( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1530 = (short)(5) ;
         nRcdExists_1530 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KS1530( ) ;
            while ( RcdFound1530 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351530( ) ;
               init_level_properties1530( ) ;
               standaloneNotModal1KS1530( ) ;
               getByPrimaryKey1KS1530( ) ;
               standaloneModal1KS1530( ) ;
               addRow1KS1530( ) ;
               scanNext1KS1530( ) ;
            }
            scanEnd1KS1530( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1530 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351530( ) ;
      initAll1KS1530( ) ;
      init_level_properties1530( ) ;
      nRcdExists_1530 = (short)(0) ;
      nIsMod_1530 = (short)(0) ;
      nRcdDeleted_1530 = (short)(0) ;
      nBlankRcdCount1530 = (short)(nBlankRcdUsr1530+nBlankRcdCount1530) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1530 > 0 )
      {
         standaloneNotModal1KS1530( ) ;
         standaloneModal1KS1530( ) ;
         addRow1KS1530( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1530 = (short)(nBlankRcdCount1530-1) ;
      }
      Gx_mode = sMode1530 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1530 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdeIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMOrdeIndutexma.htm");
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
      e111KS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9425OMCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            }
            else
            {
               A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            }
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
               A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
                        e111KS2 ();
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
            initAll1KS1232( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1736_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1736_Enabled), 5, 0), !bGXsfl_57_Refreshing);
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
      disableAttributes1KS1232( ) ;
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

   public void confirm_1KS0( )
   {
      beforeValidate1KS1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KS1232( ) ;
         }
         else
         {
            checkExtendedTable1KS1232( ) ;
            if ( AnyError == 0 )
            {
               zm1KS1232( 2) ;
            }
            closeExtendedTableCursors1KS1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_1KS1530( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1232 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KS0( ) ;
      }
   }

   public void confirm_1KS1736( )
   {
      nGXsfl_57_idx = 0 ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         readRow1KS1736( ) ;
         if ( ( nRcdExists_1736 != 0 ) || ( nIsMod_1736 != 0 ) )
         {
            getKey1KS1736( ) ;
            if ( ( nRcdExists_1736 == 0 ) && ( nRcdDeleted_1736 == 0 ) )
            {
               if ( RcdFound1736 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KS1736( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KS1736( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1KS1736( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1736 != 0 )
               {
                  if ( nRcdDeleted_1736 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KS1736( ) ;
                     load1KS1736( ) ;
                     beforeValidate1KS1736( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KS1736( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1736 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KS1736( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KS1736( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1KS1736( ) ;
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
                  if ( nRcdDeleted_1736 == 0 )
                  {
                     GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1736_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMOMMEquCo_Internalname, GXutil.rtrim( A12636TMOMMEquCo)) ;
         httpContext.changePostValue( edtTMOMMSEqCo_Internalname, GXutil.rtrim( A12637TMOMMSEqCo)) ;
         httpContext.changePostValue( edtTMOMMPieCo_Internalname, GXutil.rtrim( A12638TMOMMPieCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12636TMOMMEquCo_"+sGXsfl_57_idx, GXutil.rtrim( Z12636TMOMMEquCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12637TMOMMSEqCo_"+sGXsfl_57_idx, GXutil.rtrim( Z12637TMOMMSEqCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12638TMOMMPieCo_"+sGXsfl_57_idx, GXutil.rtrim( Z12638TMOMMPieCo)) ;
         httpContext.changePostValue( "nRcdDeleted_1736_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1736_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1736_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1736 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1736_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1736_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMOMMEQUCO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMEquCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMOMMSEQCO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMOMMPIECO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMPieCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1KS1530( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1KS1530( ) ;
         if ( ( nRcdExists_1530 != 0 ) || ( nIsMod_1530 != 0 ) )
         {
            getKey1KS1530( ) ;
            if ( ( nRcdExists_1530 == 0 ) && ( nRcdDeleted_1530 == 0 ) )
            {
               if ( RcdFound1530 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KS1530( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KS1530( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1KS1530( 4) ;
                     }
                     closeExtendedTableCursors1KS1530( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1530 = Gx_mode ;
                        confirm_1KS1736( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1530 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1530 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1530 != 0 )
               {
                  if ( nRcdDeleted_1530 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KS1530( ) ;
                     load1KS1530( ) ;
                     beforeValidate1KS1530( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KS1530( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1530 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KS1530( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KS1530( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1KS1530( 4) ;
                           }
                           closeExtendedTableCursors1KS1530( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1530 = Gx_mode ;
                              confirm_1KS1736( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1530 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1530 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1530 == 0 )
                  {
                     GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMDsc_Internalname, GXutil.rtrim( A9431TMDsc)) ;
         httpContext.changePostValue( edtTMTxt_Internalname, A9432TMTxt) ;
         httpContext.changePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_57_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1530_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1530_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1530_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1530 != 0 )
         {
            httpContext.changePostValue( "TMCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMTXT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KS0( )
   {
   }

   public void e111KS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmordeindutexma_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV21Pgmname, (byte)(99), GXv_char2) ;
      tmordeindutexma_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmordeindutexma_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordeindutexma_impl.this.A396EmprCod = GXv_char2[0] ;
      tmordeindutexma_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordeindutexma_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KS1232( int GX_JID )
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
         Z9425OMCod = A9425OMCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV21Pgmname = "TMOrdeIndutexma" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      /* Using cursor T01KS9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KS9_A407EmprNom[0] ;
      n407EmprNom = T01KS9_n407EmprNom[0] ;
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

   public void load1KS1232( )
   {
      /* Using cursor T01KS10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A407EmprNom = T01KS10_A407EmprNom[0] ;
         n407EmprNom = T01KS10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1KS1232( -1) ;
      }
      pr_default.close(8);
      onLoadActions1KS1232( ) ;
   }

   public void onLoadActions1KS1232( )
   {
   }

   public void checkExtendedTable1KS1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KS1232( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KS1232( )
   {
      /* Using cursor T01KS11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      else
      {
         RcdFound1232 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KS8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01KS8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KS1232( 1) ;
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T01KS8_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KS1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey1KS1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey1KS1232( ) ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1KS1232( ) ;
      if ( RcdFound1232 == 0 )
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
      RcdFound1232 = (short)(0) ;
      /* Using cursor T01KS12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01KS12_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T01KS12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01KS12_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T01KS12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9425OMCod = T01KS12_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T01KS13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01KS13_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T01KS13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01KS13_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T01KS13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9425OMCod = T01KS13_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KS1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KS1232( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1232 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               A9425OMCod = Z9425OMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KS1232( ) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KS1232( ) ;
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
                  GX_FocusControl = edtOMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KS1232( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
      {
         A9425OMCod = Z9425OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOMCod_Internalname ;
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
      getKey1KS1232( ) ;
      if ( RcdFound1232 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
         {
            A9425OMCod = Z9425OMCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordeindutexma");
   }

   public void insert_check( )
   {
      confirm_1KS0( ) ;
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
      if ( RcdFound1232 == 0 )
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
      scanStart1KS1232( ) ;
      if ( RcdFound1232 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1KS1232( ) ;
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
      if ( RcdFound1232 == 0 )
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
      if ( RcdFound1232 == 0 )
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
      scanStart1KS1232( ) ;
      if ( RcdFound1232 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1232 != 0 )
         {
            scanNext1KS1232( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1KS1232( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KS1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KS7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KS1232( )
   {
      beforeValidate1KS1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KS1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KS1232( 0) ;
         checkOptimisticConcurrency1KS1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KS1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KS1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KS14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
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
                        processLevel1KS1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KS0( ) ;
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
            load1KS1232( ) ;
         }
         endLevel1KS1232( ) ;
      }
      closeExtendedTableCursors1KS1232( ) ;
   }

   public void update1KS1232( )
   {
      beforeValidate1KS1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KS1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KS1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KS1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KS1232( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMORDEN */
                  deferredUpdate1KS1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KS1232( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KS0( ) ;
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
         endLevel1KS1232( ) ;
      }
      closeExtendedTableCursors1KS1232( ) ;
   }

   public void deferredUpdate1KS1232( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KS1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KS1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KS1232( ) ;
         afterConfirm1KS1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KS1232( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KS15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1232 == 0 )
                     {
                        initAll1KS1232( ) ;
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
                     resetCaption1KS0( ) ;
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
      sMode1232 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KS1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KS1232( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KS16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01KS17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01KS18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MO de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01KS19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel1KS1530( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1KS1530( ) ;
         if ( ( nRcdExists_1530 != 0 ) || ( nIsMod_1530 != 0 ) )
         {
            standaloneNotModal1KS1530( ) ;
            getKey1KS1530( ) ;
            if ( ( nRcdExists_1530 == 0 ) && ( nRcdDeleted_1530 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KS1530( ) ;
            }
            else
            {
               if ( RcdFound1530 != 0 )
               {
                  if ( ( nRcdDeleted_1530 != 0 ) && ( nRcdExists_1530 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KS1530( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1530 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KS1530( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1530 == 0 )
                  {
                     GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMDsc_Internalname, GXutil.rtrim( A9431TMDsc)) ;
         httpContext.changePostValue( edtTMTxt_Internalname, A9432TMTxt) ;
         httpContext.changePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_57_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1530_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1530_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1530_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1530 != 0 )
         {
            httpContext.changePostValue( "TMCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMTXT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KS1530( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1530 = (short)(0) ;
      nIsMod_1530 = (short)(0) ;
      nRcdDeleted_1530 = (short)(0) ;
   }

   public void processLevel1KS1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel1KS1530( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KS1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KS1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmordeindutexma");
         if ( AnyError == 0 )
         {
            confirmValues1KS0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordeindutexma");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KS1232( )
   {
      /* Scan By routine */
      /* Using cursor T01KS20 */
      pr_default.execute(18, new Object[] {A396EmprCod});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T01KS20_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KS1232( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T01KS20_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void scanEnd1KS1232( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1KS1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KS1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KS1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KS1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KS1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KS1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KS1232( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
   }

   public void zm1KS1530( int GX_JID )
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
         Z9425OMCod = A9425OMCod ;
         Z396EmprCod = A396EmprCod ;
         Z9430TMCod = A9430TMCod ;
         Z9431TMDsc = A9431TMDsc ;
         Z9432TMTxt = A9432TMTxt ;
      }
   }

   public void standaloneNotModal1KS1530( )
   {
   }

   public void standaloneModal1KS1530( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtTMCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1KS1530( )
   {
      /* Using cursor T01KS21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9431TMDsc = T01KS21_A9431TMDsc[0] ;
         n9431TMDsc = T01KS21_n9431TMDsc[0] ;
         A9432TMTxt = T01KS21_A9432TMTxt[0] ;
         n9432TMTxt = T01KS21_n9432TMTxt[0] ;
         zm1KS1530( -3) ;
      }
      pr_default.close(19);
      onLoadActions1KS1530( ) ;
   }

   public void onLoadActions1KS1530( )
   {
   }

   public void checkExtendedTable1KS1530( )
   {
      nIsDirty_1530 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KS1530( ) ;
      /* Using cursor T01KS6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9431TMDsc = T01KS6_A9431TMDsc[0] ;
      n9431TMDsc = T01KS6_n9431TMDsc[0] ;
      A9432TMTxt = T01KS6_A9432TMTxt[0] ;
      n9432TMTxt = T01KS6_n9432TMTxt[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1KS1530( )
   {
      pr_default.close(4);
   }

   public void enableDisable1KS1530( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A9430TMCod )
   {
      /* Using cursor T01KS22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9431TMDsc = T01KS22_A9431TMDsc[0] ;
      n9431TMDsc = T01KS22_n9431TMDsc[0] ;
      A9432TMTxt = T01KS22_A9432TMTxt[0] ;
      n9432TMTxt = T01KS22_n9432TMTxt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9431TMDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A9432TMTxt)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1KS1530( )
   {
      /* Using cursor T01KS23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1530 = (short)(1) ;
      }
      else
      {
         RcdFound1530 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1KS1530( )
   {
      /* Using cursor T01KS5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01KS5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KS1530( 3) ;
         RcdFound1530 = (short)(1) ;
         initializeNonKey1KS1530( ) ;
         A9430TMCod = T01KS5_A9430TMCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9430TMCod = A9430TMCod ;
         sMode1530 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KS1530( ) ;
         load1KS1530( ) ;
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1530 = (short)(0) ;
         initializeNonKey1KS1530( ) ;
         sMode1530 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KS1530( ) ;
         Gx_mode = sMode1530 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KS1530( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1KS1530( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KS4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrde2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrde2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KS1530( )
   {
      beforeValidate1KS1530( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KS1530( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KS1530( 0) ;
         checkOptimisticConcurrency1KS1530( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KS1530( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KS1530( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KS24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9430TMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
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
                        processLevel1KS1530( ) ;
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
            load1KS1530( ) ;
         }
         endLevel1KS1530( ) ;
      }
      closeExtendedTableCursors1KS1530( ) ;
   }

   public void update1KS1530( )
   {
      beforeValidate1KS1530( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KS1530( ) ;
      }
      if ( ( nIsMod_1530 != 0 ) || ( nIsDirty_1530 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KS1530( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KS1530( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KS1530( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMOrde2 */
                     deferredUpdate1KS1530( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1KS1530( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1KS1530( ) ;
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
            endLevel1KS1530( ) ;
         }
      }
      closeExtendedTableCursors1KS1530( ) ;
   }

   public void deferredUpdate1KS1530( )
   {
   }

   public void delete1KS1530( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KS1530( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KS1530( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KS1530( ) ;
         afterConfirm1KS1530( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KS1530( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KS1736( ) ;
               while ( RcdFound1736 != 0 )
               {
                  getByPrimaryKey1KS1736( ) ;
                  delete1KS1736( ) ;
                  scanNext1KS1736( ) ;
               }
               scanEnd1KS1736( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KS25 */
                  pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrde2");
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
      sMode1530 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KS1530( ) ;
      Gx_mode = sMode1530 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KS1530( )
   {
      standaloneModal1KS1530( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KS26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         A9431TMDsc = T01KS26_A9431TMDsc[0] ;
         n9431TMDsc = T01KS26_n9431TMDsc[0] ;
         A9432TMTxt = T01KS26_A9432TMTxt[0] ;
         n9432TMTxt = T01KS26_n9432TMTxt[0] ;
         pr_default.close(24);
      }
   }

   public void processNestedLevel1KS1736( )
   {
      nGXsfl_57_idx = 0 ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         readRow1KS1736( ) ;
         if ( ( nRcdExists_1736 != 0 ) || ( nIsMod_1736 != 0 ) )
         {
            standaloneNotModal1KS1736( ) ;
            getKey1KS1736( ) ;
            if ( ( nRcdExists_1736 == 0 ) && ( nRcdDeleted_1736 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KS1736( ) ;
            }
            else
            {
               if ( RcdFound1736 != 0 )
               {
                  if ( ( nRcdDeleted_1736 != 0 ) && ( nRcdExists_1736 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KS1736( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1736 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KS1736( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1736 == 0 )
                  {
                     GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1736_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMOMMEquCo_Internalname, GXutil.rtrim( A12636TMOMMEquCo)) ;
         httpContext.changePostValue( edtTMOMMSEqCo_Internalname, GXutil.rtrim( A12637TMOMMSEqCo)) ;
         httpContext.changePostValue( edtTMOMMPieCo_Internalname, GXutil.rtrim( A12638TMOMMPieCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12636TMOMMEquCo_"+sGXsfl_57_idx, GXutil.rtrim( Z12636TMOMMEquCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12637TMOMMSEqCo_"+sGXsfl_57_idx, GXutil.rtrim( Z12637TMOMMSEqCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12638TMOMMPieCo_"+sGXsfl_57_idx, GXutil.rtrim( Z12638TMOMMPieCo)) ;
         httpContext.changePostValue( "nRcdDeleted_1736_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1736_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1736_"+sGXsfl_57_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1736 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1736_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1736_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMOMMEQUCO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMEquCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMOMMSEQCO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMOMMPIECO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMPieCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KS1736( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1736 = (short)(0) ;
      nIsMod_1736 = (short)(0) ;
      nRcdDeleted_1736 = (short)(0) ;
   }

   public void processLevel1KS1530( )
   {
      /* Save parent mode. */
      sMode1530 = Gx_mode ;
      processNestedLevel1KS1736( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1530 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KS1530( )
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

   public void scanStart1KS1530( )
   {
      /* Scan By routine */
      /* Using cursor T01KS27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1530 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9430TMCod = T01KS27_A9430TMCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KS1530( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1530 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1530 = (short)(1) ;
         A9430TMCod = T01KS27_A9430TMCod[0] ;
      }
   }

   public void scanEnd1KS1530( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1KS1530( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KS1530( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KS1530( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KS1530( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KS1530( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KS1530( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KS1530( )
   {
      edtTMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtTMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtTMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void zm1KS1736( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -5 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9430TMCod = A9430TMCod ;
         Z12636TMOMMEquCo = A12636TMOMMEquCo ;
         Z12637TMOMMSEqCo = A12637TMOMMSEqCo ;
         Z12638TMOMMPieCo = A12638TMOMMPieCo ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1KS1736( )
   {
   }

   public void standaloneModal1KS1736( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMOMMEquCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMOMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMEquCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      else
      {
         edtTMOMMEquCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMOMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMEquCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMOMMSEqCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMOMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMSEqCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      else
      {
         edtTMOMMSEqCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMOMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMSEqCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMOMMPieCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMOMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMPieCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
      else
      {
         edtTMOMMPieCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMOMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMPieCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      }
   }

   public void load1KS1736( )
   {
      /* Using cursor T01KS28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1736 = (short)(1) ;
         zm1KS1736( -5) ;
      }
      pr_default.close(26);
      onLoadActions1KS1736( ) ;
   }

   public void onLoadActions1KS1736( )
   {
   }

   public void checkExtendedTable1KS1736( )
   {
      nIsDirty_1736 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KS1736( ) ;
   }

   public void closeExtendedTableCursors1KS1736( )
   {
   }

   public void enableDisable1KS1736( )
   {
   }

   public void getKey1KS1736( )
   {
      /* Using cursor T01KS29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1736 = (short)(1) ;
      }
      else
      {
         RcdFound1736 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey1KS1736( )
   {
      /* Using cursor T01KS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01KS3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KS1736( 5) ;
         RcdFound1736 = (short)(1) ;
         initializeNonKey1KS1736( ) ;
         A12636TMOMMEquCo = T01KS3_A12636TMOMMEquCo[0] ;
         A12637TMOMMSEqCo = T01KS3_A12637TMOMMSEqCo[0] ;
         A12638TMOMMPieCo = T01KS3_A12638TMOMMPieCo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9430TMCod = A9430TMCod ;
         Z12636TMOMMEquCo = A12636TMOMMEquCo ;
         Z12637TMOMMSEqCo = A12637TMOMMSEqCo ;
         Z12638TMOMMPieCo = A12638TMOMMPieCo ;
         sMode1736 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KS1736( ) ;
         load1KS1736( ) ;
         Gx_mode = sMode1736 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1736 = (short)(0) ;
         initializeNonKey1KS1736( ) ;
         sMode1736 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KS1736( ) ;
         Gx_mode = sMode1736 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KS1736( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KS1736( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrdeI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrdeI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KS1736( )
   {
      beforeValidate1KS1736( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KS1736( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KS1736( 0) ;
         checkOptimisticConcurrency1KS1736( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KS1736( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KS1736( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KS30 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrdeI");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load1KS1736( ) ;
         }
         endLevel1KS1736( ) ;
      }
      closeExtendedTableCursors1KS1736( ) ;
   }

   public void update1KS1736( )
   {
      beforeValidate1KS1736( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KS1736( ) ;
      }
      if ( ( nIsMod_1736 != 0 ) || ( nIsDirty_1736 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KS1736( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KS1736( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KS1736( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMOrdeI */
                     deferredUpdate1KS1736( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KS1736( ) ;
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
            endLevel1KS1736( ) ;
         }
      }
      closeExtendedTableCursors1KS1736( ) ;
   }

   public void deferredUpdate1KS1736( )
   {
   }

   public void delete1KS1736( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KS1736( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KS1736( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KS1736( ) ;
         afterConfirm1KS1736( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KS1736( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KS31 */
               pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod), A12636TMOMMEquCo, A12637TMOMMSEqCo, A12638TMOMMPieCo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrdeI");
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
      sMode1736 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KS1736( ) ;
      Gx_mode = sMode1736 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KS1736( )
   {
      standaloneModal1KS1736( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KS1736( )
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

   public void scanStart1KS1736( )
   {
      /* Scan By routine */
      /* Using cursor T01KS32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
      RcdFound1736 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1736 = (short)(1) ;
         A12636TMOMMEquCo = T01KS32_A12636TMOMMEquCo[0] ;
         A12637TMOMMSEqCo = T01KS32_A12637TMOMMSEqCo[0] ;
         A12638TMOMMPieCo = T01KS32_A12638TMOMMPieCo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KS1736( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1736 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1736 = (short)(1) ;
         A12636TMOMMEquCo = T01KS32_A12636TMOMMEquCo[0] ;
         A12637TMOMMSEqCo = T01KS32_A12637TMOMMSEqCo[0] ;
         A12638TMOMMPieCo = T01KS32_A12638TMOMMPieCo[0] ;
      }
   }

   public void scanEnd1KS1736( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1KS1736( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KS1736( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KS1736( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KS1736( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KS1736( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KS1736( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KS1736( )
   {
      edtTMOMMEquCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMOMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMEquCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtTMOMMSEqCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMOMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMSEqCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtTMOMMPieCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMOMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMPieCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public void send_integrity_lvl_hashes1KS1736( )
   {
   }

   public void send_integrity_lvl_hashes1KS1530( )
   {
   }

   public void send_integrity_lvl_hashes1KS1232( )
   {
   }

   public void subsflControlProps_351530( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_idx ;
      edtTMCod_Internalname = "TMCOD_"+sGXsfl_35_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_idx ;
      edtTMDsc_Internalname = "TMDSC_"+sGXsfl_35_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_35_idx ;
      edtTMTxt_Internalname = "TMTXT_"+sGXsfl_35_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351530( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_fel_idx ;
      edtTMCod_Internalname = "TMCOD_"+sGXsfl_35_fel_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_fel_idx ;
      edtTMDsc_Internalname = "TMDSC_"+sGXsfl_35_fel_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_35_fel_idx ;
      edtTMTxt_Internalname = "TMTXT_"+sGXsfl_35_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1KS1530( )
   {
      nRC_GXsfl_57 = 0 ;
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351530( ) ;
      sendRow1KS1530( ) ;
   }

   public void sendRow1KS1530( )
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
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock4_Internalname,httpContext.getMessage( "Cod de Tarea de Mantto", ""),"","",lblTextblock4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTMCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,httpContext.getMessage( "Desc Tarea Mantenimiento", ""),"","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMDsc_Internalname,GXutil.rtrim( A9431TMDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTMDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock6_Internalname,httpContext.getMessage( "Texto", ""),"","",lblTextblock6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Multiple line edit */
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtTMTxt_Internalname,A9432TMTxt,"","",Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(edtTMTxt_Enabled),Integer.valueOf(0),Integer.valueOf(80),"chr",Integer.valueOf(10),"row",Integer.valueOf(0),StyleString,ClassString,"","","2000",Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(-1),Boolean.valueOf(true),"","'"+""+"'"+",false,"+"'"+""+"'",Integer.valueOf(0)});
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
         nBlankRcdCount1736 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1736 = (short)(1) ;
            scanStart1KS1736( ) ;
            while ( RcdFound1736 != 0 )
            {
               init_level_properties1736( ) ;
               getByPrimaryKey1KS1736( ) ;
               addRow1KS1736( ) ;
               scanNext1KS1736( ) ;
            }
            scanEnd1KS1736( ) ;
            nBlankRcdCount1736 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KS1736( ) ;
         standaloneModal1KS1736( ) ;
         sMode1736 = Gx_mode ;
         while ( nGXsfl_57_idx < nRC_GXsfl_57 )
         {
            bGXsfl_57_Refreshing = true ;
            readRow1KS1736( ) ;
            edtavnRcdDeleted_1736_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1736_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1736_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1736_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtTMOMMEquCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMOMMEQUCO_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMOMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMEquCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtTMOMMSEqCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMOMMSEQCO_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMOMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMSEqCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            edtTMOMMPieCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMOMMPIECO_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMOMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMPieCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
            if ( ( nRcdExists_1736 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KS1736( ) ;
            }
            sendRow1KS1736( ) ;
            bGXsfl_57_Refreshing = false ;
         }
         Gx_mode = sMode1736 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1736 = (short)(5) ;
         nRcdExists_1736 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KS1736( ) ;
            while ( RcdFound1736 != 0 )
            {
               sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
               subsflControlProps_571736( ) ;
               init_level_properties1736( ) ;
               standaloneNotModal1KS1736( ) ;
               getByPrimaryKey1KS1736( ) ;
               standaloneModal1KS1736( ) ;
               addRow1KS1736( ) ;
               scanNext1KS1736( ) ;
            }
            scanEnd1KS1736( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1736 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571736( ) ;
      initAll1KS1736( ) ;
      init_level_properties1736( ) ;
      nRcdExists_1736 = (short)(0) ;
      nIsMod_1736 = (short)(0) ;
      nRcdDeleted_1736 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 35 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_35_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1736 = (short)(nBlankRcdUsr1736+nBlankRcdCount1736) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1736 > 0 )
      {
         standaloneNotModal1KS1736( ) ;
         standaloneModal1KS1736( ) ;
         addRow1KS1736( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTMOMMEquCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1736 = (short)(nBlankRcdCount1736-1) ;
      }
      Gx_mode = sMode1736 ;
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
      send_integrity_lvl_hashes1KS1530( ) ;
      GXCCtl = "Z9430TMCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_57_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1530_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1530_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1530_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1530, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMTXT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void readRow1KS1530( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351530( ) ;
      edtTMCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMTXT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "TMCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         wbErr = true ;
         A9430TMCod = 0 ;
      }
      else
      {
         A9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9431TMDsc = httpContext.cgiGet( edtTMDsc_Internalname) ;
      n9431TMDsc = false ;
      A9432TMTxt = httpContext.cgiGet( edtTMTxt_Internalname) ;
      n9432TMTxt = false ;
      GXCCtl = "Z9430TMCod_" + sGXsfl_35_idx ;
      Z9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_35_idx ;
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1530_" + sGXsfl_35_idx ;
      nRcdDeleted_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1530_" + sGXsfl_35_idx ;
      nRcdExists_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1530_" + sGXsfl_35_idx ;
      nIsMod_1530 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_57_" + sGXsfl_35_idx ;
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_571736( )
   {
      edtavnRcdDeleted_1736_Internalname = "vNRCDDELETED_1736_"+sGXsfl_57_idx ;
      edtTMOMMEquCo_Internalname = "TMOMMEQUCO_"+sGXsfl_57_idx ;
      edtTMOMMSEqCo_Internalname = "TMOMMSEQCO_"+sGXsfl_57_idx ;
      edtTMOMMPieCo_Internalname = "TMOMMPIECO_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_571736( )
   {
      edtavnRcdDeleted_1736_Internalname = "vNRCDDELETED_1736_"+sGXsfl_57_fel_idx ;
      edtTMOMMEquCo_Internalname = "TMOMMEQUCO_"+sGXsfl_57_fel_idx ;
      edtTMOMMSEqCo_Internalname = "TMOMMSEQCO_"+sGXsfl_57_fel_idx ;
      edtTMOMMPieCo_Internalname = "TMOMMPIECO_"+sGXsfl_57_fel_idx ;
   }

   public void addRow1KS1736( )
   {
      nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571736( ) ;
      sendRow1KS1736( ) ;
   }

   public void sendRow1KS1736( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1736_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1736_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1736_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1736), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1736), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1736_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1736_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1736_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMOMMEquCo_Internalname,GXutil.rtrim( A12636TMOMMEquCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMOMMEquCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTMOMMEquCo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1736_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMOMMSEqCo_Internalname,GXutil.rtrim( A12637TMOMMSEqCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMOMMSEqCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTMOMMSEqCo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1736_" + sGXsfl_57_idx + "',1);gx.fn.setControlValue('nIsMod_1530_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_57_idx + "',57)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMOMMPieCo_Internalname,GXutil.rtrim( A12638TMOMMPieCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMOMMPieCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTMOMMPieCo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1KS1736( ) ;
      GXCCtl = "Z12636TMOMMEquCo_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12636TMOMMEquCo));
      GXCCtl = "Z12637TMOMMSEqCo_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12637TMOMMSEqCo));
      GXCCtl = "Z12638TMOMMPieCo_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12638TMOMMPieCo));
      GXCCtl = "nRcdDeleted_1736_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1736_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1736_" + sGXsfl_57_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1736, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1736_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1736_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMOMMEQUCO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMEquCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMOMMSEQCO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMOMMPIECO_"+sGXsfl_57_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMPieCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1KS1736( )
   {
      nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571736( ) ;
      edtavnRcdDeleted_1736_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1736_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMOMMEquCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMOMMEQUCO_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMOMMSEqCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMOMMSEQCO_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMOMMPieCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMOMMPIECO_"+sGXsfl_57_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1736_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1736_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1736");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1736_Internalname ;
         wbErr = true ;
         nRcdDeleted_1736 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1736 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1736_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12636TMOMMEquCo = httpContext.cgiGet( edtTMOMMEquCo_Internalname) ;
      A12637TMOMMSEqCo = httpContext.cgiGet( edtTMOMMSEqCo_Internalname) ;
      A12638TMOMMPieCo = httpContext.cgiGet( edtTMOMMPieCo_Internalname) ;
      GXCCtl = "Z12636TMOMMEquCo_" + sGXsfl_57_idx ;
      Z12636TMOMMEquCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12637TMOMMSEqCo_" + sGXsfl_57_idx ;
      Z12637TMOMMSEqCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12638TMOMMPieCo_" + sGXsfl_57_idx ;
      Z12638TMOMMPieCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1736_" + sGXsfl_57_idx ;
      nRcdDeleted_1736 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1736_" + sGXsfl_57_idx ;
      nRcdExists_1736 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1736_" + sGXsfl_57_idx ;
      nIsMod_1736 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTMOMMPieCo_Enabled = edtTMOMMPieCo_Enabled ;
      defedtTMOMMSEqCo_Enabled = edtTMOMMSEqCo_Enabled ;
      defedtTMOMMEquCo_Enabled = edtTMOMMEquCo_Enabled ;
      defedtTMCod_Enabled = edtTMCod_Enabled ;
   }

   public void confirmValues1KS0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351530( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351530( ) ;
         httpContext.changePostValue( "Z9430TMCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z9430TMCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9430TMCod_"+sGXsfl_35_idx) ;
      }
      nGXsfl_57_idx = 0 ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_571736( ) ;
      while ( nGXsfl_57_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_571736( ) ;
         httpContext.changePostValue( "Z12636TMOMMEquCo_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z12636TMOMMEquCo_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12636TMOMMEquCo_"+sGXsfl_57_idx) ;
         httpContext.changePostValue( "Z12637TMOMMSEqCo_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z12637TMOMMSEqCo_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12637TMOMMSEqCo_"+sGXsfl_57_idx) ;
         httpContext.changePostValue( "Z12638TMOMMPieCo_"+sGXsfl_57_idx, httpContext.cgiGet( "ZT_"+"Z12638TMOMMPieCo_"+sGXsfl_57_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12638TMOMMPieCo_"+sGXsfl_57_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmordeindutexma", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
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
      return formatLink("app.tmordeindutexma", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMOrdeIndutexma" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ordenes de Mantenimiento", "") ;
   }

   public void initializeNonKey1KS1232( )
   {
   }

   public void initAll1KS1232( )
   {
      A9425OMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      initializeNonKey1KS1232( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KS1530( )
   {
      A9431TMDsc = "" ;
      n9431TMDsc = false ;
      A9432TMTxt = "" ;
      n9432TMTxt = false ;
   }

   public void initAll1KS1530( )
   {
      A9430TMCod = 0 ;
      initializeNonKey1KS1530( ) ;
   }

   public void standaloneModalInsert1KS1530( )
   {
   }

   public void initializeNonKey1KS1736( )
   {
   }

   public void initAll1KS1736( )
   {
      A12636TMOMMEquCo = "" ;
      A12637TMOMMSEqCo = "" ;
      A12638TMOMMPieCo = "" ;
      initializeNonKey1KS1736( ) ;
   }

   public void standaloneModalInsert1KS1736( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251953623", true, true);
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
      httpContext.AddJavascriptSource("tmordeindutexma.js", "?20261251953623", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1530( )
   {
      edtTMCod_Enabled = defedtTMCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void init_level_properties1736( )
   {
      edtTMOMMPieCo_Enabled = defedtTMOMMPieCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMOMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMPieCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtTMOMMSEqCo_Enabled = defedtTMOMMSEqCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMOMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMSEqCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtTMOMMEquCo_Enabled = defedtTMOMMEquCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMOMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMOMMEquCo_Enabled), 5, 0), !bGXsfl_57_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9431TMDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", A9432TMTxt);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1736, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1736_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12636TMOMMEquCo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMEquCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12637TMOMMSEqCo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12638TMOMMPieCo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMOMMPieCo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtOMCod_Internalname = "OMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtTMCod_Internalname = "TMCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTMDsc_Internalname = "TMDSC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtTMTxt_Internalname = "TMTXT" ;
      edtavnRcdDeleted_1736_Internalname = "vNRCDDELETED_1736" ;
      edtTMOMMEquCo_Internalname = "TMOMMEQUCO" ;
      edtTMOMMSEqCo_Internalname = "TMOMMSEQCO" ;
      edtTMOMMPieCo_Internalname = "TMOMMPIECO" ;
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
      lblTextblock6_Caption = httpContext.getMessage( "Texto", "") ;
      lblTextblock5_Caption = httpContext.getMessage( "Desc Tarea Mantenimiento", "") ;
      lblTextblock4_Caption = httpContext.getMessage( "Cod de Tarea de Mantto", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Ordenes de Mantenimiento", "") );
      edtTMOMMPieCo_Jsonclick = "" ;
      edtTMOMMSEqCo_Jsonclick = "" ;
      edtTMOMMEquCo_Jsonclick = "" ;
      edtavnRcdDeleted_1736_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtTMDsc_Jsonclick = "" ;
      edtTMCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtTMOMMPieCo_Enabled = 1 ;
      edtTMOMMSEqCo_Enabled = 1 ;
      edtTMOMMEquCo_Enabled = 1 ;
      edtavnRcdDeleted_1736_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTMTxt_Enabled = 0 ;
      edtTMDsc_Enabled = 0 ;
      edtTMCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOMCod_Jsonclick = "" ;
      edtOMCod_Backcolor = (int)(0xFFFFFF) ;
      edtOMCod_Enabled = 1 ;
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
      subsflControlProps_351530( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KS1530( ) ;
         standaloneModal1KS1530( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KS1530( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351530( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_571736( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KS1530( ) ;
         standaloneModal1KS1530( ) ;
         standaloneNotModal1KS1736( ) ;
         standaloneModal1KS1736( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KS1736( ) ;
         nGXsfl_57_idx = (int)(nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_571736( ) ;
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
      /* Using cursor T01KS33 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KS33_A407EmprNom[0] ;
      n407EmprNom = T01KS33_n407EmprNom[0] ;
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

   public void valid_Omcod( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Tmcod( )
   {
      n9431TMDsc = false ;
      n9432TMTxt = false ;
      /* Using cursor T01KS26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tareas de Mantenimiento - MTareas", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
      }
      A9431TMDsc = T01KS26_A9431TMDsc[0] ;
      n9431TMDsc = T01KS26_n9431TMDsc[0] ;
      A9432TMTxt = T01KS26_A9432TMTxt[0] ;
      n9432TMTxt = T01KS26_n9432TMTxt[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", GXutil.rtrim( A9431TMDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
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
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_OMCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9425OMCod'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_TMCOD","{handler:'valid_Tmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9430TMCod',fld:'TMCOD',pic:'ZZZZZZZ9'},{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'A9432TMTxt',fld:'TMTXT',pic:''}]");
      setEventMetadata("VALID_TMCOD",",oparms:[{av:'A9431TMDsc',fld:'TMDSC',pic:''},{av:'A9432TMTxt',fld:'TMTXT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Tmtxt',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_TMOMMEQUCO","{handler:'valid_Tmommequco',iparms:[]");
      setEventMetadata("VALID_TMOMMEQUCO",",oparms:[]}");
      setEventMetadata("VALID_TMOMMSEQCO","{handler:'valid_Tmommseqco',iparms:[]");
      setEventMetadata("VALID_TMOMMSEQCO",",oparms:[]}");
      setEventMetadata("VALID_TMOMMPIECO","{handler:'valid_Tmommpieco',iparms:[]");
      setEventMetadata("VALID_TMOMMPIECO",",oparms:[]}");
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
      pr_default.close(24);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12636TMOMMEquCo = "" ;
      Z12637TMOMMSEqCo = "" ;
      Z12638TMOMMPieCo = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1530 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV21Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1232 = "" ;
      GXCCtl = "" ;
      A12636TMOMMEquCo = "" ;
      A12637TMOMMSEqCo = "" ;
      A12638TMOMMPieCo = "" ;
      A9431TMDsc = "" ;
      A9432TMTxt = "" ;
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
      T01KS9_A407EmprNom = new String[] {""} ;
      T01KS9_n407EmprNom = new boolean[] {false} ;
      T01KS10_A9425OMCod = new int[1] ;
      T01KS10_A407EmprNom = new String[] {""} ;
      T01KS10_n407EmprNom = new boolean[] {false} ;
      T01KS10_A396EmprCod = new String[] {""} ;
      T01KS11_A396EmprCod = new String[] {""} ;
      T01KS11_A9425OMCod = new int[1] ;
      T01KS8_A9425OMCod = new int[1] ;
      T01KS8_A396EmprCod = new String[] {""} ;
      T01KS12_A396EmprCod = new String[] {""} ;
      T01KS12_A9425OMCod = new int[1] ;
      T01KS13_A396EmprCod = new String[] {""} ;
      T01KS13_A9425OMCod = new int[1] ;
      T01KS7_A9425OMCod = new int[1] ;
      T01KS7_A396EmprCod = new String[] {""} ;
      T01KS16_A396EmprCod = new String[] {""} ;
      T01KS16_A9425OMCod = new int[1] ;
      T01KS16_A11446OMMEquCod = new String[] {""} ;
      T01KS16_A11447OMMSEqCod = new String[] {""} ;
      T01KS16_A11448OMMPieCod = new String[] {""} ;
      T01KS17_A396EmprCod = new String[] {""} ;
      T01KS17_A9425OMCod = new int[1] ;
      T01KS17_A9430TMCod = new int[1] ;
      T01KS18_A396EmprCod = new String[] {""} ;
      T01KS18_A9425OMCod = new int[1] ;
      T01KS18_A9455OMOpeCod = new int[1] ;
      T01KS18_A9458OMMTpo = new String[] {""} ;
      T01KS19_A396EmprCod = new String[] {""} ;
      T01KS19_A9425OMCod = new int[1] ;
      T01KS19_A9446OMRepCod = new int[1] ;
      T01KS19_A9449OMRTpo = new String[] {""} ;
      T01KS20_A396EmprCod = new String[] {""} ;
      T01KS20_A9425OMCod = new int[1] ;
      Z9431TMDsc = "" ;
      Z9432TMTxt = "" ;
      T01KS21_A9425OMCod = new int[1] ;
      T01KS21_A9431TMDsc = new String[] {""} ;
      T01KS21_n9431TMDsc = new boolean[] {false} ;
      T01KS21_A9432TMTxt = new String[] {""} ;
      T01KS21_n9432TMTxt = new boolean[] {false} ;
      T01KS21_A396EmprCod = new String[] {""} ;
      T01KS21_A9430TMCod = new int[1] ;
      T01KS6_A9431TMDsc = new String[] {""} ;
      T01KS6_n9431TMDsc = new boolean[] {false} ;
      T01KS6_A9432TMTxt = new String[] {""} ;
      T01KS6_n9432TMTxt = new boolean[] {false} ;
      T01KS22_A9431TMDsc = new String[] {""} ;
      T01KS22_n9431TMDsc = new boolean[] {false} ;
      T01KS22_A9432TMTxt = new String[] {""} ;
      T01KS22_n9432TMTxt = new boolean[] {false} ;
      T01KS23_A396EmprCod = new String[] {""} ;
      T01KS23_A9425OMCod = new int[1] ;
      T01KS23_A9430TMCod = new int[1] ;
      T01KS5_A9425OMCod = new int[1] ;
      T01KS5_A396EmprCod = new String[] {""} ;
      T01KS5_A9430TMCod = new int[1] ;
      T01KS4_A9425OMCod = new int[1] ;
      T01KS4_A396EmprCod = new String[] {""} ;
      T01KS4_A9430TMCod = new int[1] ;
      T01KS26_A9431TMDsc = new String[] {""} ;
      T01KS26_n9431TMDsc = new boolean[] {false} ;
      T01KS26_A9432TMTxt = new String[] {""} ;
      T01KS26_n9432TMTxt = new boolean[] {false} ;
      T01KS27_A396EmprCod = new String[] {""} ;
      T01KS27_A9425OMCod = new int[1] ;
      T01KS27_A9430TMCod = new int[1] ;
      T01KS28_A9425OMCod = new int[1] ;
      T01KS28_A9430TMCod = new int[1] ;
      T01KS28_A12636TMOMMEquCo = new String[] {""} ;
      T01KS28_A12637TMOMMSEqCo = new String[] {""} ;
      T01KS28_A12638TMOMMPieCo = new String[] {""} ;
      T01KS28_A396EmprCod = new String[] {""} ;
      T01KS29_A396EmprCod = new String[] {""} ;
      T01KS29_A9425OMCod = new int[1] ;
      T01KS29_A9430TMCod = new int[1] ;
      T01KS29_A12636TMOMMEquCo = new String[] {""} ;
      T01KS29_A12637TMOMMSEqCo = new String[] {""} ;
      T01KS29_A12638TMOMMPieCo = new String[] {""} ;
      T01KS3_A9425OMCod = new int[1] ;
      T01KS3_A9430TMCod = new int[1] ;
      T01KS3_A12636TMOMMEquCo = new String[] {""} ;
      T01KS3_A12637TMOMMSEqCo = new String[] {""} ;
      T01KS3_A12638TMOMMPieCo = new String[] {""} ;
      T01KS3_A396EmprCod = new String[] {""} ;
      sMode1736 = "" ;
      T01KS2_A9425OMCod = new int[1] ;
      T01KS2_A9430TMCod = new int[1] ;
      T01KS2_A12636TMOMMEquCo = new String[] {""} ;
      T01KS2_A12637TMOMMSEqCo = new String[] {""} ;
      T01KS2_A12638TMOMMPieCo = new String[] {""} ;
      T01KS2_A396EmprCod = new String[] {""} ;
      T01KS32_A396EmprCod = new String[] {""} ;
      T01KS32_A9425OMCod = new int[1] ;
      T01KS32_A9430TMCod = new int[1] ;
      T01KS32_A12636TMOMMEquCo = new String[] {""} ;
      T01KS32_A12637TMOMMSEqCo = new String[] {""} ;
      T01KS32_A12638TMOMMPieCo = new String[] {""} ;
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
      T01KS33_A407EmprNom = new String[] {""} ;
      T01KS33_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmordeindutexma__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmordeindutexma__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmordeindutexma__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordeindutexma__default(),
         new Object[] {
             new Object[] {
            T01KS2_A9425OMCod, T01KS2_A9430TMCod, T01KS2_A12636TMOMMEquCo, T01KS2_A12637TMOMMSEqCo, T01KS2_A12638TMOMMPieCo, T01KS2_A396EmprCod
            }
            , new Object[] {
            T01KS3_A9425OMCod, T01KS3_A9430TMCod, T01KS3_A12636TMOMMEquCo, T01KS3_A12637TMOMMSEqCo, T01KS3_A12638TMOMMPieCo, T01KS3_A396EmprCod
            }
            , new Object[] {
            T01KS4_A9425OMCod, T01KS4_A396EmprCod, T01KS4_A9430TMCod
            }
            , new Object[] {
            T01KS5_A9425OMCod, T01KS5_A396EmprCod, T01KS5_A9430TMCod
            }
            , new Object[] {
            T01KS6_A9431TMDsc, T01KS6_n9431TMDsc, T01KS6_A9432TMTxt, T01KS6_n9432TMTxt
            }
            , new Object[] {
            T01KS7_A9425OMCod, T01KS7_A396EmprCod
            }
            , new Object[] {
            T01KS8_A9425OMCod, T01KS8_A396EmprCod
            }
            , new Object[] {
            T01KS9_A407EmprNom, T01KS9_n407EmprNom
            }
            , new Object[] {
            T01KS10_A9425OMCod, T01KS10_A407EmprNom, T01KS10_n407EmprNom, T01KS10_A396EmprCod
            }
            , new Object[] {
            T01KS11_A396EmprCod, T01KS11_A9425OMCod
            }
            , new Object[] {
            T01KS12_A396EmprCod, T01KS12_A9425OMCod
            }
            , new Object[] {
            T01KS13_A396EmprCod, T01KS13_A9425OMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KS16_A396EmprCod, T01KS16_A9425OMCod, T01KS16_A11446OMMEquCod, T01KS16_A11447OMMSEqCod, T01KS16_A11448OMMPieCod
            }
            , new Object[] {
            T01KS17_A396EmprCod, T01KS17_A9425OMCod, T01KS17_A9430TMCod
            }
            , new Object[] {
            T01KS18_A396EmprCod, T01KS18_A9425OMCod, T01KS18_A9455OMOpeCod, T01KS18_A9458OMMTpo
            }
            , new Object[] {
            T01KS19_A396EmprCod, T01KS19_A9425OMCod, T01KS19_A9446OMRepCod, T01KS19_A9449OMRTpo
            }
            , new Object[] {
            T01KS20_A396EmprCod, T01KS20_A9425OMCod
            }
            , new Object[] {
            T01KS21_A9425OMCod, T01KS21_A9431TMDsc, T01KS21_n9431TMDsc, T01KS21_A9432TMTxt, T01KS21_n9432TMTxt, T01KS21_A396EmprCod, T01KS21_A9430TMCod
            }
            , new Object[] {
            T01KS22_A9431TMDsc, T01KS22_n9431TMDsc, T01KS22_A9432TMTxt, T01KS22_n9432TMTxt
            }
            , new Object[] {
            T01KS23_A396EmprCod, T01KS23_A9425OMCod, T01KS23_A9430TMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KS26_A9431TMDsc, T01KS26_n9431TMDsc, T01KS26_A9432TMTxt, T01KS26_n9432TMTxt
            }
            , new Object[] {
            T01KS27_A396EmprCod, T01KS27_A9425OMCod, T01KS27_A9430TMCod
            }
            , new Object[] {
            T01KS28_A9425OMCod, T01KS28_A9430TMCod, T01KS28_A12636TMOMMEquCo, T01KS28_A12637TMOMMSEqCo, T01KS28_A12638TMOMMPieCo, T01KS28_A396EmprCod
            }
            , new Object[] {
            T01KS29_A396EmprCod, T01KS29_A9425OMCod, T01KS29_A9430TMCod, T01KS29_A12636TMOMMEquCo, T01KS29_A12637TMOMMSEqCo, T01KS29_A12638TMOMMPieCo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KS32_A396EmprCod, T01KS32_A9425OMCod, T01KS32_A9430TMCod, T01KS32_A12636TMOMMEquCo, T01KS32_A12637TMOMMSEqCo, T01KS32_A12638TMOMMPieCo
            }
            , new Object[] {
            T01KS33_A407EmprNom, T01KS33_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "TMOrdeIndutexma" ;
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
   private short nRcdDeleted_1530 ;
   private short nRcdExists_1530 ;
   private short nIsMod_1530 ;
   private short nRcdDeleted_1736 ;
   private short nRcdExists_1736 ;
   private short nIsMod_1736 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1530 ;
   private short RcdFound1530 ;
   private short nBlankRcdUsr1530 ;
   private short RcdFound1736 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1530 ;
   private short nIsDirty_1736 ;
   private short nBlankRcdCount1736 ;
   private short nBlankRcdUsr1736 ;
   private short subGrid1_Borderwidth ;
   private int Z9425OMCod ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z9430TMCod ;
   private int nRC_GXsfl_57 ;
   private int nGXsfl_57_idx=1 ;
   private int A9430TMCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A9425OMCod ;
   private int edtOMCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtTMCod_Enabled ;
   private int edtTMDsc_Enabled ;
   private int edtTMTxt_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1736_Enabled ;
   private int edtTMOMMEquCo_Enabled ;
   private int edtTMOMMSEqCo_Enabled ;
   private int edtTMOMMPieCo_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtTMOMMPieCo_Enabled ;
   private int defedtTMOMMSEqCo_Enabled ;
   private int defedtTMOMMEquCo_Enabled ;
   private int defedtTMCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtOMCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ9425OMCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12636TMOMMEquCo ;
   private String Z12637TMOMMSEqCo ;
   private String Z12638TMOMMPieCo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOMCod_Internalname ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtOMCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1530 ;
   private String edtTMCod_Internalname ;
   private String edtTMDsc_Internalname ;
   private String edtTMTxt_Internalname ;
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
   private String AV21Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1736_Internalname ;
   private String sMode1232 ;
   private String GXCCtl ;
   private String edtTMOMMEquCo_Internalname ;
   private String A12636TMOMMEquCo ;
   private String edtTMOMMSEqCo_Internalname ;
   private String A12637TMOMMSEqCo ;
   private String edtTMOMMPieCo_Internalname ;
   private String A12638TMOMMPieCo ;
   private String A9431TMDsc ;
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
   private String Z9431TMDsc ;
   private String sMode1736 ;
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
   private String edtTMCod_Jsonclick ;
   private String lblTextblock5_Jsonclick ;
   private String edtTMDsc_Jsonclick ;
   private String lblTextblock6_Jsonclick ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1736_Jsonclick ;
   private String edtTMOMMEquCo_Jsonclick ;
   private String edtTMOMMSEqCo_Jsonclick ;
   private String edtTMOMMPieCo_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock4_Caption ;
   private String lblTextblock5_Caption ;
   private String lblTextblock6_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n9431TMDsc ;
   private boolean n9432TMTxt ;
   private String A9432TMTxt ;
   private String Z9432TMTxt ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01KS9_A407EmprNom ;
   private boolean[] T01KS9_n407EmprNom ;
   private int[] T01KS10_A9425OMCod ;
   private String[] T01KS10_A407EmprNom ;
   private boolean[] T01KS10_n407EmprNom ;
   private String[] T01KS10_A396EmprCod ;
   private String[] T01KS11_A396EmprCod ;
   private int[] T01KS11_A9425OMCod ;
   private int[] T01KS8_A9425OMCod ;
   private String[] T01KS8_A396EmprCod ;
   private String[] T01KS12_A396EmprCod ;
   private int[] T01KS12_A9425OMCod ;
   private String[] T01KS13_A396EmprCod ;
   private int[] T01KS13_A9425OMCod ;
   private int[] T01KS7_A9425OMCod ;
   private String[] T01KS7_A396EmprCod ;
   private String[] T01KS16_A396EmprCod ;
   private int[] T01KS16_A9425OMCod ;
   private String[] T01KS16_A11446OMMEquCod ;
   private String[] T01KS16_A11447OMMSEqCod ;
   private String[] T01KS16_A11448OMMPieCod ;
   private String[] T01KS17_A396EmprCod ;
   private int[] T01KS17_A9425OMCod ;
   private int[] T01KS17_A9430TMCod ;
   private String[] T01KS18_A396EmprCod ;
   private int[] T01KS18_A9425OMCod ;
   private int[] T01KS18_A9455OMOpeCod ;
   private String[] T01KS18_A9458OMMTpo ;
   private String[] T01KS19_A396EmprCod ;
   private int[] T01KS19_A9425OMCod ;
   private int[] T01KS19_A9446OMRepCod ;
   private String[] T01KS19_A9449OMRTpo ;
   private String[] T01KS20_A396EmprCod ;
   private int[] T01KS20_A9425OMCod ;
   private int[] T01KS21_A9425OMCod ;
   private String[] T01KS21_A9431TMDsc ;
   private boolean[] T01KS21_n9431TMDsc ;
   private String[] T01KS21_A9432TMTxt ;
   private boolean[] T01KS21_n9432TMTxt ;
   private String[] T01KS21_A396EmprCod ;
   private int[] T01KS21_A9430TMCod ;
   private String[] T01KS6_A9431TMDsc ;
   private boolean[] T01KS6_n9431TMDsc ;
   private String[] T01KS6_A9432TMTxt ;
   private boolean[] T01KS6_n9432TMTxt ;
   private String[] T01KS22_A9431TMDsc ;
   private boolean[] T01KS22_n9431TMDsc ;
   private String[] T01KS22_A9432TMTxt ;
   private boolean[] T01KS22_n9432TMTxt ;
   private String[] T01KS23_A396EmprCod ;
   private int[] T01KS23_A9425OMCod ;
   private int[] T01KS23_A9430TMCod ;
   private int[] T01KS5_A9425OMCod ;
   private String[] T01KS5_A396EmprCod ;
   private int[] T01KS5_A9430TMCod ;
   private int[] T01KS4_A9425OMCod ;
   private String[] T01KS4_A396EmprCod ;
   private int[] T01KS4_A9430TMCod ;
   private String[] T01KS26_A9431TMDsc ;
   private boolean[] T01KS26_n9431TMDsc ;
   private String[] T01KS26_A9432TMTxt ;
   private boolean[] T01KS26_n9432TMTxt ;
   private String[] T01KS27_A396EmprCod ;
   private int[] T01KS27_A9425OMCod ;
   private int[] T01KS27_A9430TMCod ;
   private int[] T01KS28_A9425OMCod ;
   private int[] T01KS28_A9430TMCod ;
   private String[] T01KS28_A12636TMOMMEquCo ;
   private String[] T01KS28_A12637TMOMMSEqCo ;
   private String[] T01KS28_A12638TMOMMPieCo ;
   private String[] T01KS28_A396EmprCod ;
   private String[] T01KS29_A396EmprCod ;
   private int[] T01KS29_A9425OMCod ;
   private int[] T01KS29_A9430TMCod ;
   private String[] T01KS29_A12636TMOMMEquCo ;
   private String[] T01KS29_A12637TMOMMSEqCo ;
   private String[] T01KS29_A12638TMOMMPieCo ;
   private int[] T01KS3_A9425OMCod ;
   private int[] T01KS3_A9430TMCod ;
   private String[] T01KS3_A12636TMOMMEquCo ;
   private String[] T01KS3_A12637TMOMMSEqCo ;
   private String[] T01KS3_A12638TMOMMPieCo ;
   private String[] T01KS3_A396EmprCod ;
   private int[] T01KS2_A9425OMCod ;
   private int[] T01KS2_A9430TMCod ;
   private String[] T01KS2_A12636TMOMMEquCo ;
   private String[] T01KS2_A12637TMOMMSEqCo ;
   private String[] T01KS2_A12638TMOMMPieCo ;
   private String[] T01KS2_A396EmprCod ;
   private String[] T01KS32_A396EmprCod ;
   private int[] T01KS32_A9425OMCod ;
   private int[] T01KS32_A9430TMCod ;
   private String[] T01KS32_A12636TMOMMEquCo ;
   private String[] T01KS32_A12637TMOMMSEqCo ;
   private String[] T01KS32_A12638TMOMMPieCo ;
   private String[] T01KS33_A407EmprNom ;
   private boolean[] T01KS33_n407EmprNom ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmordeindutexma__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordeindutexma__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordeindutexma__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordeindutexma__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KS2", "SELECT OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo, EmprCod FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? AND TMOMMEquCo = ? AND TMOMMSEqCo = ? AND TMOMMPieCo = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS3", "SELECT OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo, EmprCod FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? AND TMOMMEquCo = ? AND TMOMMSEqCo = ? AND TMOMMPieCo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS4", "SELECT OMCod, EmprCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS5", "SELECT OMCod, EmprCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS6", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS7", "SELECT OMCod, EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS8", "SELECT OMCod, EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS10", "SELECT /*+ FIRST_ROWS(100) */ TM1.OMCod, T2.EmprNom, TM1.EmprCod FROM (TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( OMCod > ?) and EmprCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KS13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( OMCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KS14", "INSERT INTO TXPMORDEN(OMCod, EmprCod, OMMaqCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMEst, OMNot) VALUES(?, ?, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T01KS15", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T01KS16", "SELECT * FROM (SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KS17", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KS18", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KS19", "SELECT * FROM (SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KS20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS21", "SELECT T1.OMCod, T2.TMDsc, T2.TMTxt, T1.EmprCod, T1.TMCod FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.TMCod = ? ORDER BY T1.EmprCod, T1.OMCod, T1.TMCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS22", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS23", "SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KS24", "INSERT INTO TXPMOrde2(OMCod, EmprCod, TMCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMOrde2")
         ,new UpdateCursor("T01KS25", "DELETE FROM TXPMOrde2  WHERE EmprCod = ? AND OMCod = ? AND TMCod = ?", GX_NOMASK, "TXPMOrde2")
         ,new ForEachCursor("T01KS26", "SELECT TMDsc, TMTxt FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS27", "SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? and OMCod = ? ORDER BY EmprCod, OMCod, TMCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS28", "SELECT OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo, EmprCod FROM TXPMOrdeI WHERE EmprCod = ? and OMCod = ? and TMCod = ? and TMOMMEquCo = ? and TMOMMSEqCo = ? and TMOMMPieCo = ? ORDER BY EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS29", "SELECT EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo FROM TXPMOrdeI WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? AND TMOMMEquCo = ? AND TMOMMSEqCo = ? AND TMOMMPieCo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KS30", "INSERT INTO TXPMOrdeI(OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrdeI")
         ,new UpdateCursor("T01KS31", "DELETE FROM TXPMOrdeI  WHERE EmprCod = ? AND OMCod = ? AND TMCod = ? AND TMOMMEquCo = ? AND TMOMMSEqCo = ? AND TMOMMPieCo = ?", GX_NOMASK, "TXPMOrdeI")
         ,new ForEachCursor("T01KS32", "SELECT EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo FROM TXPMOrdeI WHERE EmprCod = ? and OMCod = ? and TMCod = ? ORDER BY EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KS33", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

