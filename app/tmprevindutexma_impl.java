package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmprevindutexma_impl extends GXDataArea
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
         A9479PMTCod = (int)(GXutil.lval( httpContext.GetPar( "PMTCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A9479PMTCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MPrev Indutexma", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPMCod_Internalname ;
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
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

   public tmprevindutexma_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmprevindutexma_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmprevindutexma_impl.class ));
   }

   public tmprevindutexma_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMPrevIndutexma.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPrevIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMPrevIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPrevIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMPrevIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Cod de Preventivo de Mantto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMPrevIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPMCod_Jsonclick, 0, "", "", "", "", "", 1, edtPMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      /* Save parent mode. */
      sMode1533 = Gx_mode ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1533 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1533 = (short)(1) ;
            scanStart1KU1533( ) ;
            while ( RcdFound1533 != 0 )
            {
               init_level_properties1533( ) ;
               getByPrimaryKey1KU1533( ) ;
               addRow1KU1533( ) ;
               scanNext1KU1533( ) ;
            }
            scanEnd1KU1533( ) ;
            nBlankRcdCount1533 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KU1533( ) ;
         standaloneModal1KU1533( ) ;
         sMode1533 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1KU1533( ) ;
            edtPMTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtPMTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPMTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_1533 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KU1533( ) ;
            }
            sendRow1KU1533( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode1533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1533 = (short)(5) ;
         nRcdExists_1533 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KU1533( ) ;
            while ( RcdFound1533 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_351533( ) ;
               init_level_properties1533( ) ;
               standaloneNotModal1KU1533( ) ;
               getByPrimaryKey1KU1533( ) ;
               standaloneModal1KU1533( ) ;
               addRow1KU1533( ) ;
               scanNext1KU1533( ) ;
            }
            scanEnd1KU1533( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1533 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_351533( ) ;
      initAll1KU1533( ) ;
      init_level_properties1533( ) ;
      nRcdExists_1533 = (short)(0) ;
      nIsMod_1533 = (short)(0) ;
      nRcdDeleted_1533 = (short)(0) ;
      nBlankRcdCount1533 = (short)(nBlankRcdUsr1533+nBlankRcdCount1533) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1533 > 0 )
      {
         standaloneNotModal1KU1533( ) ;
         standaloneModal1KU1533( ) ;
         addRow1KU1533( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPMTCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1533 = (short)(nBlankRcdCount1533-1) ;
      }
      Gx_mode = sMode1533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode1533 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMPrevIndutexma.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMPrevIndutexma.htm");
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
      e111KU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9429PMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9429PMCod = 0 ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            }
            else
            {
               A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
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
               A9429PMCod = (int)(GXutil.lval( httpContext.GetPar( "PMCod"))) ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
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
                        e111KU2 ();
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
            initAll1KU1236( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1737_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1737_Enabled), 5, 0), !bGXsfl_52_Refreshing);
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
      disableAttributes1KU1236( ) ;
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

   public void confirm_1KU0( )
   {
      beforeValidate1KU1236( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KU1236( ) ;
         }
         else
         {
            checkExtendedTable1KU1236( ) ;
            if ( AnyError == 0 )
            {
               zm1KU1236( 2) ;
            }
            closeExtendedTableCursors1KU1236( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1236 = Gx_mode ;
         confirm_1KU1533( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1236 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1KU0( ) ;
      }
   }

   public void confirm_1KU1737( )
   {
      nGXsfl_52_idx = 0 ;
      while ( nGXsfl_52_idx < nRC_GXsfl_52 )
      {
         readRow1KU1737( ) ;
         if ( ( nRcdExists_1737 != 0 ) || ( nIsMod_1737 != 0 ) )
         {
            getKey1KU1737( ) ;
            if ( ( nRcdExists_1737 == 0 ) && ( nRcdDeleted_1737 == 0 ) )
            {
               if ( RcdFound1737 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KU1737( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KU1737( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1KU1737( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1737 != 0 )
               {
                  if ( nRcdDeleted_1737 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KU1737( ) ;
                     load1KU1737( ) ;
                     beforeValidate1KU1737( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KU1737( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1737 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KU1737( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KU1737( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1KU1737( ) ;
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
                  if ( nRcdDeleted_1737 == 0 )
                  {
                     GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1737_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMPMMEquCo_Internalname, GXutil.rtrim( A12644TMPMMEquCo)) ;
         httpContext.changePostValue( edtTMPMMSEqCo_Internalname, GXutil.rtrim( A12645TMPMMSEqCo)) ;
         httpContext.changePostValue( edtTMPMMPieCo_Internalname, GXutil.rtrim( A12646TMPMMPieCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12644TMPMMEquCo_"+sGXsfl_52_idx, GXutil.rtrim( Z12644TMPMMEquCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12645TMPMMSEqCo_"+sGXsfl_52_idx, GXutil.rtrim( Z12645TMPMMSEqCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12646TMPMMPieCo_"+sGXsfl_52_idx, GXutil.rtrim( Z12646TMPMMPieCo)) ;
         httpContext.changePostValue( "nRcdDeleted_1737_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1737_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1737_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1737 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1737_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1737_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMPMMEQUCO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMEquCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMPMMSEQCO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMPMMPIECO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMPieCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1KU1533( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1KU1533( ) ;
         if ( ( nRcdExists_1533 != 0 ) || ( nIsMod_1533 != 0 ) )
         {
            getKey1KU1533( ) ;
            if ( ( nRcdExists_1533 == 0 ) && ( nRcdDeleted_1533 == 0 ) )
            {
               if ( RcdFound1533 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KU1533( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KU1533( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1KU1533( 4) ;
                     }
                     closeExtendedTableCursors1KU1533( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode1533 = Gx_mode ;
                        confirm_1KU1737( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode1533 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode1533 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPMTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1533 != 0 )
               {
                  if ( nRcdDeleted_1533 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KU1533( ) ;
                     load1KU1533( ) ;
                     beforeValidate1KU1533( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KU1533( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KU1533( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KU1533( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1KU1533( 4) ;
                           }
                           closeExtendedTableCursors1KU1533( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode1533 = Gx_mode ;
                              confirm_1KU1737( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode1533 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode1533 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1533 == 0 )
                  {
                     GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMTDsc_Internalname, GXutil.rtrim( A9480PMTDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9479PMTCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_52_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1533_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1533_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1533_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1533 != 0 )
         {
            httpContext.changePostValue( "PMTCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMTDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KU0( )
   {
   }

   public void e111KU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmprevindutexma_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV21Pgmname, (byte)(99), GXv_char2) ;
      tmprevindutexma_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmprevindutexma_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmprevindutexma_impl.this.A396EmprCod = GXv_char2[0] ;
      tmprevindutexma_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmprevindutexma_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KU1236( int GX_JID )
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
         Z9429PMCod = A9429PMCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV21Pgmname = "TMPrevIndutexma" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      /* Using cursor T01KU9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KU9_A407EmprNom[0] ;
      n407EmprNom = T01KU9_n407EmprNom[0] ;
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

   public void load1KU1236( )
   {
      /* Using cursor T01KU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1236 = (short)(1) ;
         A407EmprNom = T01KU10_A407EmprNom[0] ;
         n407EmprNom = T01KU10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1KU1236( -1) ;
      }
      pr_default.close(8);
      onLoadActions1KU1236( ) ;
   }

   public void onLoadActions1KU1236( )
   {
   }

   public void checkExtendedTable1KU1236( )
   {
      nIsDirty_1236 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KU1236( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KU1236( )
   {
      /* Using cursor T01KU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1236 = (short)(1) ;
      }
      else
      {
         RcdFound1236 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01KU8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KU1236( 1) ;
         RcdFound1236 = (short)(1) ;
         A9429PMCod = T01KU8_A9429PMCod[0] ;
         n9429PMCod = T01KU8_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         sMode1236 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KU1236( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1236 = (short)(0) ;
            initializeNonKey1KU1236( ) ;
         }
         Gx_mode = sMode1236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1236 = (short)(0) ;
         initializeNonKey1KU1236( ) ;
         sMode1236 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1236 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1KU1236( ) ;
      if ( RcdFound1236 == 0 )
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
      RcdFound1236 = (short)(0) ;
      /* Using cursor T01KU12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01KU12_A9429PMCod[0] < A9429PMCod ) ) && ( GXutil.strcmp(T01KU12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01KU12_A9429PMCod[0] > A9429PMCod ) ) && ( GXutil.strcmp(T01KU12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9429PMCod = T01KU12_A9429PMCod[0] ;
            n9429PMCod = T01KU12_n9429PMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            RcdFound1236 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1236 = (short)(0) ;
      /* Using cursor T01KU13 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01KU13_A9429PMCod[0] > A9429PMCod ) ) && ( GXutil.strcmp(T01KU13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01KU13_A9429PMCod[0] < A9429PMCod ) ) && ( GXutil.strcmp(T01KU13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9429PMCod = T01KU13_A9429PMCod[0] ;
            n9429PMCod = T01KU13_n9429PMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
            RcdFound1236 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KU1236( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KU1236( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1236 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
            {
               A9429PMCod = Z9429PMCod ;
               n9429PMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KU1236( ) ;
               GX_FocusControl = edtPMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KU1236( ) ;
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
                  GX_FocusControl = edtPMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KU1236( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
      {
         A9429PMCod = Z9429PMCod ;
         n9429PMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPMCod_Internalname ;
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
      getKey1KU1236( ) ;
      if ( RcdFound1236 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
         {
            A9429PMCod = Z9429PMCod ;
            n9429PMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9429PMCod != Z9429PMCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmprevindutexma");
   }

   public void insert_check( )
   {
      confirm_1KU0( ) ;
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
      if ( RcdFound1236 == 0 )
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
      scanStart1KU1236( ) ;
      if ( RcdFound1236 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1KU1236( ) ;
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
      if ( RcdFound1236 == 0 )
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
      if ( RcdFound1236 == 0 )
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
      scanStart1KU1236( ) ;
      if ( RcdFound1236 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1236 != 0 )
         {
            scanNext1KU1236( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1KU1236( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KU1236( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KU7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPREVE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPREVE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KU1236( )
   {
      beforeValidate1KU1236( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KU1236( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KU1236( 0) ;
         checkOptimisticConcurrency1KU1236( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KU1236( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KU1236( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KU14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
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
                        processLevel1KU1236( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KU0( ) ;
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
            load1KU1236( ) ;
         }
         endLevel1KU1236( ) ;
      }
      closeExtendedTableCursors1KU1236( ) ;
   }

   public void update1KU1236( )
   {
      beforeValidate1KU1236( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KU1236( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KU1236( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KU1236( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KU1236( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMPREVE */
                  deferredUpdate1KU1236( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KU1236( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1KU0( ) ;
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
         endLevel1KU1236( ) ;
      }
      closeExtendedTableCursors1KU1236( ) ;
   }

   public void deferredUpdate1KU1236( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KU1236( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KU1236( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KU1236( ) ;
         afterConfirm1KU1236( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KU1236( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KU15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPREVE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1236 == 0 )
                     {
                        initAll1KU1236( ) ;
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
                     resetCaption1KU0( ) ;
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
      sMode1236 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KU1236( ) ;
      Gx_mode = sMode1236 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KU1236( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KU16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01KU17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01KU18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Responsables", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01KU19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Repuestos Preventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01KU20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1KU1533( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1KU1533( ) ;
         if ( ( nRcdExists_1533 != 0 ) || ( nIsMod_1533 != 0 ) )
         {
            standaloneNotModal1KU1533( ) ;
            getKey1KU1533( ) ;
            if ( ( nRcdExists_1533 == 0 ) && ( nRcdDeleted_1533 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KU1533( ) ;
            }
            else
            {
               if ( RcdFound1533 != 0 )
               {
                  if ( ( nRcdDeleted_1533 != 0 ) && ( nRcdExists_1533 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KU1533( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KU1533( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1533 == 0 )
                  {
                     GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPMTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPMTDsc_Internalname, GXutil.rtrim( A9480PMTDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z9479PMTCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_52_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1533_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1533_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1533_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1533 != 0 )
         {
            httpContext.changePostValue( "PMTCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PMTDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KU1533( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1533 = (short)(0) ;
      nIsMod_1533 = (short)(0) ;
      nRcdDeleted_1533 = (short)(0) ;
   }

   public void processLevel1KU1236( )
   {
      /* Save parent mode. */
      sMode1236 = Gx_mode ;
      processNestedLevel1KU1533( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1236 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KU1236( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KU1236( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmprevindutexma");
         if ( AnyError == 0 )
         {
            confirmValues1KU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmprevindutexma");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KU1236( )
   {
      /* Scan By routine */
      /* Using cursor T01KU21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      RcdFound1236 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1236 = (short)(1) ;
         A9429PMCod = T01KU21_A9429PMCod[0] ;
         n9429PMCod = T01KU21_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KU1236( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1236 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1236 = (short)(1) ;
         A9429PMCod = T01KU21_A9429PMCod[0] ;
         n9429PMCod = T01KU21_n9429PMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      }
   }

   public void scanEnd1KU1236( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1KU1236( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KU1236( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KU1236( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KU1236( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KU1236( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KU1236( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KU1236( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Enabled), 5, 0), true);
   }

   public void zm1KU1533( int GX_JID )
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
         Z9429PMCod = A9429PMCod ;
         Z396EmprCod = A396EmprCod ;
         Z9479PMTCod = A9479PMTCod ;
         Z9480PMTDsc = A9480PMTDsc ;
      }
   }

   public void standaloneNotModal1KU1533( )
   {
   }

   public void standaloneModal1KU1533( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPMTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtPMTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void load1KU1533( )
   {
      /* Using cursor T01KU22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1533 = (short)(1) ;
         A9480PMTDsc = T01KU22_A9480PMTDsc[0] ;
         n9480PMTDsc = T01KU22_n9480PMTDsc[0] ;
         zm1KU1533( -3) ;
      }
      pr_default.close(20);
      onLoadActions1KU1533( ) ;
   }

   public void onLoadActions1KU1533( )
   {
   }

   public void checkExtendedTable1KU1533( )
   {
      nIsDirty_1533 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KU1533( ) ;
      /* Using cursor T01KU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPTar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9480PMTDsc = T01KU6_A9480PMTDsc[0] ;
      n9480PMTDsc = T01KU6_n9480PMTDsc[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1KU1533( )
   {
      pr_default.close(4);
   }

   public void enableDisable1KU1533( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A9479PMTCod )
   {
      /* Using cursor T01KU23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPTar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9480PMTDsc = T01KU23_A9480PMTDsc[0] ;
      n9480PMTDsc = T01KU23_n9480PMTDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9480PMTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey1KU1533( )
   {
      /* Using cursor T01KU24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1533 = (short)(1) ;
      }
      else
      {
         RcdFound1533 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1KU1533( )
   {
      /* Using cursor T01KU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01KU5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KU1533( 3) ;
         RcdFound1533 = (short)(1) ;
         initializeNonKey1KU1533( ) ;
         A9479PMTCod = T01KU5_A9479PMTCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         Z9479PMTCod = A9479PMTCod ;
         sMode1533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KU1533( ) ;
         load1KU1533( ) ;
         Gx_mode = sMode1533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1533 = (short)(0) ;
         initializeNonKey1KU1533( ) ;
         sMode1533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KU1533( ) ;
         Gx_mode = sMode1533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KU1533( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1KU1533( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPrev3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPrev3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KU1533( )
   {
      beforeValidate1KU1533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KU1533( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KU1533( 0) ;
         checkOptimisticConcurrency1KU1533( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KU1533( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KU1533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KU25 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), A396EmprCod, Integer.valueOf(A9479PMTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev3");
                  if ( (pr_default.getStatus(23) == 1) )
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
                        processLevel1KU1533( ) ;
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
            load1KU1533( ) ;
         }
         endLevel1KU1533( ) ;
      }
      closeExtendedTableCursors1KU1533( ) ;
   }

   public void update1KU1533( )
   {
      beforeValidate1KU1533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KU1533( ) ;
      }
      if ( ( nIsMod_1533 != 0 ) || ( nIsDirty_1533 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KU1533( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KU1533( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KU1533( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMPrev3 */
                     deferredUpdate1KU1533( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1KU1533( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1KU1533( ) ;
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
            endLevel1KU1533( ) ;
         }
      }
      closeExtendedTableCursors1KU1533( ) ;
   }

   public void deferredUpdate1KU1533( )
   {
   }

   public void delete1KU1533( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KU1533( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KU1533( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KU1533( ) ;
         afterConfirm1KU1533( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KU1533( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KU1737( ) ;
               while ( RcdFound1737 != 0 )
               {
                  getByPrimaryKey1KU1737( ) ;
                  delete1KU1737( ) ;
                  scanNext1KU1737( ) ;
               }
               scanEnd1KU1737( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KU26 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrev3");
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
      sMode1533 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KU1533( ) ;
      Gx_mode = sMode1533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KU1533( )
   {
      standaloneModal1KU1533( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KU27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
         A9480PMTDsc = T01KU27_A9480PMTDsc[0] ;
         n9480PMTDsc = T01KU27_n9480PMTDsc[0] ;
         pr_default.close(25);
      }
   }

   public void processNestedLevel1KU1737( )
   {
      nGXsfl_52_idx = 0 ;
      while ( nGXsfl_52_idx < nRC_GXsfl_52 )
      {
         readRow1KU1737( ) ;
         if ( ( nRcdExists_1737 != 0 ) || ( nIsMod_1737 != 0 ) )
         {
            standaloneNotModal1KU1737( ) ;
            getKey1KU1737( ) ;
            if ( ( nRcdExists_1737 == 0 ) && ( nRcdDeleted_1737 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KU1737( ) ;
            }
            else
            {
               if ( RcdFound1737 != 0 )
               {
                  if ( ( nRcdDeleted_1737 != 0 ) && ( nRcdExists_1737 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KU1737( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1737 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KU1737( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1737 == 0 )
                  {
                     GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPMTCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1737_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMPMMEquCo_Internalname, GXutil.rtrim( A12644TMPMMEquCo)) ;
         httpContext.changePostValue( edtTMPMMSEqCo_Internalname, GXutil.rtrim( A12645TMPMMSEqCo)) ;
         httpContext.changePostValue( edtTMPMMPieCo_Internalname, GXutil.rtrim( A12646TMPMMPieCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12644TMPMMEquCo_"+sGXsfl_52_idx, GXutil.rtrim( Z12644TMPMMEquCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12645TMPMMSEqCo_"+sGXsfl_52_idx, GXutil.rtrim( Z12645TMPMMSEqCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12646TMPMMPieCo_"+sGXsfl_52_idx, GXutil.rtrim( Z12646TMPMMPieCo)) ;
         httpContext.changePostValue( "nRcdDeleted_1737_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1737_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1737_"+sGXsfl_52_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1737 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1737_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1737_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMPMMEQUCO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMEquCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMPMMSEQCO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMPMMPIECO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMPieCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KU1737( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1737 = (short)(0) ;
      nIsMod_1737 = (short)(0) ;
      nRcdDeleted_1737 = (short)(0) ;
   }

   public void processLevel1KU1533( )
   {
      /* Save parent mode. */
      sMode1533 = Gx_mode ;
      processNestedLevel1KU1737( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KU1533( )
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

   public void scanStart1KU1533( )
   {
      /* Scan By routine */
      /* Using cursor T01KU28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod)});
      RcdFound1533 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1533 = (short)(1) ;
         A9479PMTCod = T01KU28_A9479PMTCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KU1533( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1533 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1533 = (short)(1) ;
         A9479PMTCod = T01KU28_A9479PMTCod[0] ;
      }
   }

   public void scanEnd1KU1533( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1KU1533( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KU1533( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KU1533( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KU1533( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KU1533( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KU1533( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KU1533( )
   {
      edtPMTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtPMTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTDsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void zm1KU1737( int GX_JID )
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
         Z9429PMCod = A9429PMCod ;
         Z9479PMTCod = A9479PMTCod ;
         Z12644TMPMMEquCo = A12644TMPMMEquCo ;
         Z12645TMPMMSEqCo = A12645TMPMMSEqCo ;
         Z12646TMPMMPieCo = A12646TMPMMPieCo ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1KU1737( )
   {
   }

   public void standaloneModal1KU1737( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMPMMEquCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMPMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMEquCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
      else
      {
         edtTMPMMEquCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMPMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMEquCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMPMMSEqCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMPMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMSEqCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
      else
      {
         edtTMPMMSEqCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMPMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMSEqCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMPMMPieCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMPMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMPieCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
      else
      {
         edtTMPMMPieCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMPMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMPieCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      }
   }

   public void load1KU1737( )
   {
      /* Using cursor T01KU29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod), A12644TMPMMEquCo, A12645TMPMMSEqCo, A12646TMPMMPieCo});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1737 = (short)(1) ;
         zm1KU1737( -5) ;
      }
      pr_default.close(27);
      onLoadActions1KU1737( ) ;
   }

   public void onLoadActions1KU1737( )
   {
   }

   public void checkExtendedTable1KU1737( )
   {
      nIsDirty_1737 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KU1737( ) ;
   }

   public void closeExtendedTableCursors1KU1737( )
   {
   }

   public void enableDisable1KU1737( )
   {
   }

   public void getKey1KU1737( )
   {
      /* Using cursor T01KU30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod), A12644TMPMMEquCo, A12645TMPMMSEqCo, A12646TMPMMPieCo});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1737 = (short)(1) ;
      }
      else
      {
         RcdFound1737 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey1KU1737( )
   {
      /* Using cursor T01KU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod), A12644TMPMMEquCo, A12645TMPMMSEqCo, A12646TMPMMPieCo});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01KU3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KU1737( 5) ;
         RcdFound1737 = (short)(1) ;
         initializeNonKey1KU1737( ) ;
         A12644TMPMMEquCo = T01KU3_A12644TMPMMEquCo[0] ;
         A12645TMPMMSEqCo = T01KU3_A12645TMPMMSEqCo[0] ;
         A12646TMPMMPieCo = T01KU3_A12646TMPMMPieCo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9429PMCod = A9429PMCod ;
         Z9479PMTCod = A9479PMTCod ;
         Z12644TMPMMEquCo = A12644TMPMMEquCo ;
         Z12645TMPMMSEqCo = A12645TMPMMSEqCo ;
         Z12646TMPMMPieCo = A12646TMPMMPieCo ;
         sMode1737 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KU1737( ) ;
         load1KU1737( ) ;
         Gx_mode = sMode1737 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1737 = (short)(0) ;
         initializeNonKey1KU1737( ) ;
         sMode1737 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KU1737( ) ;
         Gx_mode = sMode1737 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KU1737( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KU1737( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod), A12644TMPMMEquCo, A12645TMPMMSEqCo, A12646TMPMMPieCo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPrevI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPrevI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KU1737( )
   {
      beforeValidate1KU1737( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KU1737( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KU1737( 0) ;
         checkOptimisticConcurrency1KU1737( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KU1737( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KU1737( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KU31 */
                  pr_default.execute(29, new Object[] {Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod), A12644TMPMMEquCo, A12645TMPMMSEqCo, A12646TMPMMPieCo, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrevI");
                  if ( (pr_default.getStatus(29) == 1) )
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
            load1KU1737( ) ;
         }
         endLevel1KU1737( ) ;
      }
      closeExtendedTableCursors1KU1737( ) ;
   }

   public void update1KU1737( )
   {
      beforeValidate1KU1737( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KU1737( ) ;
      }
      if ( ( nIsMod_1737 != 0 ) || ( nIsDirty_1737 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KU1737( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KU1737( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KU1737( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMPrevI */
                     deferredUpdate1KU1737( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KU1737( ) ;
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
            endLevel1KU1737( ) ;
         }
      }
      closeExtendedTableCursors1KU1737( ) ;
   }

   public void deferredUpdate1KU1737( )
   {
   }

   public void delete1KU1737( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KU1737( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KU1737( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KU1737( ) ;
         afterConfirm1KU1737( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KU1737( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KU32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod), A12644TMPMMEquCo, A12645TMPMMSEqCo, A12646TMPMMPieCo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPrevI");
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
      sMode1737 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KU1737( ) ;
      Gx_mode = sMode1737 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KU1737( )
   {
      standaloneModal1KU1737( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KU1737( )
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

   public void scanStart1KU1737( )
   {
      /* Scan By routine */
      /* Using cursor T01KU33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n9429PMCod), Integer.valueOf(A9429PMCod), Integer.valueOf(A9479PMTCod)});
      RcdFound1737 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1737 = (short)(1) ;
         A12644TMPMMEquCo = T01KU33_A12644TMPMMEquCo[0] ;
         A12645TMPMMSEqCo = T01KU33_A12645TMPMMSEqCo[0] ;
         A12646TMPMMPieCo = T01KU33_A12646TMPMMPieCo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KU1737( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound1737 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound1737 = (short)(1) ;
         A12644TMPMMEquCo = T01KU33_A12644TMPMMEquCo[0] ;
         A12645TMPMMSEqCo = T01KU33_A12645TMPMMSEqCo[0] ;
         A12646TMPMMPieCo = T01KU33_A12646TMPMMPieCo[0] ;
      }
   }

   public void scanEnd1KU1737( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1KU1737( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KU1737( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KU1737( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KU1737( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KU1737( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KU1737( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KU1737( )
   {
      edtTMPMMEquCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMPMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMEquCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtTMPMMSEqCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMPMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMSEqCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtTMPMMPieCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMPMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMPieCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
   }

   public void send_integrity_lvl_hashes1KU1737( )
   {
   }

   public void send_integrity_lvl_hashes1KU1533( )
   {
   }

   public void send_integrity_lvl_hashes1KU1236( )
   {
   }

   public void subsflControlProps_351533( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_idx ;
      edtPMTCod_Internalname = "PMTCOD_"+sGXsfl_35_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_idx ;
      edtPMTDsc_Internalname = "PMTDSC_"+sGXsfl_35_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_351533( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_fel_idx ;
      edtPMTCod_Internalname = "PMTCOD_"+sGXsfl_35_fel_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_fel_idx ;
      edtPMTDsc_Internalname = "PMTDSC_"+sGXsfl_35_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1KU1533( )
   {
      nRC_GXsfl_52 = 0 ;
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351533( ) ;
      sendRow1KU1533( ) ;
   }

   public void sendRow1KU1533( )
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
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock4_Internalname,httpContext.getMessage( "Tarea", ""),"","",lblTextblock4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1533_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9479PMTCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtPMTCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,httpContext.getMessage( "Desc. Tarea en Mant Preventivo", ""),"","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTDsc_Internalname,GXutil.rtrim( A9480PMTDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTDsc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtPMTDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
      startgridcontrol52( ) ;
      nGXsfl_52_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1737 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1737 = (short)(1) ;
            scanStart1KU1737( ) ;
            while ( RcdFound1737 != 0 )
            {
               init_level_properties1737( ) ;
               getByPrimaryKey1KU1737( ) ;
               addRow1KU1737( ) ;
               scanNext1KU1737( ) ;
            }
            scanEnd1KU1737( ) ;
            nBlankRcdCount1737 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KU1737( ) ;
         standaloneModal1KU1737( ) ;
         sMode1737 = Gx_mode ;
         while ( nGXsfl_52_idx < nRC_GXsfl_52 )
         {
            bGXsfl_52_Refreshing = true ;
            readRow1KU1737( ) ;
            edtavnRcdDeleted_1737_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1737_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1737_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1737_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtTMPMMEquCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMPMMEQUCO_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMPMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMEquCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtTMPMMSEqCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMPMMSEQCO_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMPMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMSEqCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            edtTMPMMPieCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMPMMPIECO_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMPMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMPieCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
            if ( ( nRcdExists_1737 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KU1737( ) ;
            }
            sendRow1KU1737( ) ;
            bGXsfl_52_Refreshing = false ;
         }
         Gx_mode = sMode1737 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1737 = (short)(5) ;
         nRcdExists_1737 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KU1737( ) ;
            while ( RcdFound1737 != 0 )
            {
               sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
               subsflControlProps_521737( ) ;
               init_level_properties1737( ) ;
               standaloneNotModal1KU1737( ) ;
               getByPrimaryKey1KU1737( ) ;
               standaloneModal1KU1737( ) ;
               addRow1KU1737( ) ;
               scanNext1KU1737( ) ;
            }
            scanEnd1KU1737( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1737 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_521737( ) ;
      initAll1KU1737( ) ;
      init_level_properties1737( ) ;
      nRcdExists_1737 = (short)(0) ;
      nIsMod_1737 = (short)(0) ;
      nRcdDeleted_1737 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 35 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_35_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1737 = (short)(nBlankRcdUsr1737+nBlankRcdCount1737) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1737 > 0 )
      {
         standaloneNotModal1KU1737( ) ;
         standaloneModal1KU1737( ) ;
         addRow1KU1737( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtTMPMMEquCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1737 = (short)(nBlankRcdCount1737-1) ;
      }
      Gx_mode = sMode1737 ;
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
      send_integrity_lvl_hashes1KU1533( ) ;
      GXCCtl = "Z9479PMTCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9479PMTCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_52_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_52_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1533_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1533_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1533_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMTDSC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void readRow1KU1533( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351533( ) ;
      edtPMTCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPMTDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PMTDSC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPMTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPMTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "PMTCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
         wbErr = true ;
         A9479PMTCod = 0 ;
      }
      else
      {
         A9479PMTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A9480PMTDsc = httpContext.cgiGet( edtPMTDsc_Internalname) ;
      n9480PMTDsc = false ;
      GXCCtl = "Z9479PMTCod_" + sGXsfl_35_idx ;
      Z9479PMTCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_52_" + sGXsfl_35_idx ;
      nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1533_" + sGXsfl_35_idx ;
      nRcdDeleted_1533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1533_" + sGXsfl_35_idx ;
      nRcdExists_1533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1533_" + sGXsfl_35_idx ;
      nIsMod_1533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_52_" + sGXsfl_35_idx ;
      nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_521737( )
   {
      edtavnRcdDeleted_1737_Internalname = "vNRCDDELETED_1737_"+sGXsfl_52_idx ;
      edtTMPMMEquCo_Internalname = "TMPMMEQUCO_"+sGXsfl_52_idx ;
      edtTMPMMSEqCo_Internalname = "TMPMMSEQCO_"+sGXsfl_52_idx ;
      edtTMPMMPieCo_Internalname = "TMPMMPIECO_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_521737( )
   {
      edtavnRcdDeleted_1737_Internalname = "vNRCDDELETED_1737_"+sGXsfl_52_fel_idx ;
      edtTMPMMEquCo_Internalname = "TMPMMEQUCO_"+sGXsfl_52_fel_idx ;
      edtTMPMMSEqCo_Internalname = "TMPMMSEQCO_"+sGXsfl_52_fel_idx ;
      edtTMPMMPieCo_Internalname = "TMPMMPIECO_"+sGXsfl_52_fel_idx ;
   }

   public void addRow1KU1737( )
   {
      nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_521737( ) ;
      sendRow1KU1737( ) ;
   }

   public void sendRow1KU1737( )
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
         if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1737_" + sGXsfl_52_idx + "',1);gx.fn.setControlValue('nIsMod_1533_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1737_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1737_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1737), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1737), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1737_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1737_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1737_" + sGXsfl_52_idx + "',1);gx.fn.setControlValue('nIsMod_1533_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMPMMEquCo_Internalname,GXutil.rtrim( A12644TMPMMEquCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMPMMEquCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTMPMMEquCo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1737_" + sGXsfl_52_idx + "',1);gx.fn.setControlValue('nIsMod_1533_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMPMMSEqCo_Internalname,GXutil.rtrim( A12645TMPMMSEqCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMPMMSEqCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTMPMMSEqCo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1737_" + sGXsfl_52_idx + "',1);gx.fn.setControlValue('nIsMod_1533_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_52_idx + "',52)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMPMMPieCo_Internalname,GXutil.rtrim( A12646TMPMMPieCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMPMMPieCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTMPMMPieCo_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1KU1737( ) ;
      GXCCtl = "Z12644TMPMMEquCo_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12644TMPMMEquCo));
      GXCCtl = "Z12645TMPMMSEqCo_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12645TMPMMSEqCo));
      GXCCtl = "Z12646TMPMMPieCo_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12646TMPMMPieCo));
      GXCCtl = "nRcdDeleted_1737_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1737_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1737_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1737, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1737_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1737_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMPMMEQUCO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMEquCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMPMMSEQCO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMPMMPIECO_"+sGXsfl_52_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMPieCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1KU1737( )
   {
      nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_521737( ) ;
      edtavnRcdDeleted_1737_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1737_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMPMMEquCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMPMMEQUCO_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMPMMSEqCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMPMMSEQCO_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMPMMPieCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMPMMPIECO_"+sGXsfl_52_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1737_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1737_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1737");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1737_Internalname ;
         wbErr = true ;
         nRcdDeleted_1737 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1737 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1737_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12644TMPMMEquCo = httpContext.cgiGet( edtTMPMMEquCo_Internalname) ;
      A12645TMPMMSEqCo = httpContext.cgiGet( edtTMPMMSEqCo_Internalname) ;
      A12646TMPMMPieCo = httpContext.cgiGet( edtTMPMMPieCo_Internalname) ;
      GXCCtl = "Z12644TMPMMEquCo_" + sGXsfl_52_idx ;
      Z12644TMPMMEquCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12645TMPMMSEqCo_" + sGXsfl_52_idx ;
      Z12645TMPMMSEqCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12646TMPMMPieCo_" + sGXsfl_52_idx ;
      Z12646TMPMMPieCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1737_" + sGXsfl_52_idx ;
      nRcdDeleted_1737 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1737_" + sGXsfl_52_idx ;
      nRcdExists_1737 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1737_" + sGXsfl_52_idx ;
      nIsMod_1737 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTMPMMPieCo_Enabled = edtTMPMMPieCo_Enabled ;
      defedtTMPMMSEqCo_Enabled = edtTMPMMSEqCo_Enabled ;
      defedtTMPMMEquCo_Enabled = edtTMPMMEquCo_Enabled ;
      defedtPMTCod_Enabled = edtPMTCod_Enabled ;
   }

   public void confirmValues1KU0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_351533( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351533( ) ;
         httpContext.changePostValue( "Z9479PMTCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z9479PMTCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9479PMTCod_"+sGXsfl_35_idx) ;
      }
      nGXsfl_52_idx = 0 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_521737( ) ;
      while ( nGXsfl_52_idx < nRC_GXsfl_52 )
      {
         nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_521737( ) ;
         httpContext.changePostValue( "Z12644TMPMMEquCo_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z12644TMPMMEquCo_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12644TMPMMEquCo_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z12645TMPMMSEqCo_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z12645TMPMMSEqCo_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12645TMPMMSEqCo_"+sGXsfl_52_idx) ;
         httpContext.changePostValue( "Z12646TMPMMPieCo_"+sGXsfl_52_idx, httpContext.cgiGet( "ZT_"+"Z12646TMPMMPieCo_"+sGXsfl_52_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12646TMPMMPieCo_"+sGXsfl_52_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmprevindutexma", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z9429PMCod", GXutil.ltrim( localUtil.ntoc( Z9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmprevindutexma", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMPrevIndutexma" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MPrev Indutexma", "") ;
   }

   public void initializeNonKey1KU1236( )
   {
   }

   public void initAll1KU1236( )
   {
      A9429PMCod = 0 ;
      n9429PMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9429PMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9429PMCod), 8, 0));
      initializeNonKey1KU1236( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KU1533( )
   {
      A9480PMTDsc = "" ;
      n9480PMTDsc = false ;
   }

   public void initAll1KU1533( )
   {
      A9479PMTCod = 0 ;
      initializeNonKey1KU1533( ) ;
   }

   public void standaloneModalInsert1KU1533( )
   {
   }

   public void initializeNonKey1KU1737( )
   {
   }

   public void initAll1KU1737( )
   {
      A12644TMPMMEquCo = "" ;
      A12645TMPMMSEqCo = "" ;
      A12646TMPMMPieCo = "" ;
      initializeNonKey1KU1737( ) ;
   }

   public void standaloneModalInsert1KU1737( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251954932", true, true);
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
      httpContext.AddJavascriptSource("tmprevindutexma.js", "?20261251954932", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1533( )
   {
      edtPMTCod_Enabled = defedtPMTCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void init_level_properties1737( )
   {
      edtTMPMMPieCo_Enabled = defedtTMPMMPieCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMPMMPieCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMPieCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtTMPMMSEqCo_Enabled = defedtTMPMMSEqCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMPMMSEqCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMSEqCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtTMPMMEquCo_Enabled = defedtTMPMMEquCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMPMMEquCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMPMMEquCo_Enabled), 5, 0), !bGXsfl_52_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9479PMTCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9480PMTDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPMTDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol52( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1737, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1737_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12644TMPMMEquCo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMEquCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12645TMPMMSEqCo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMSEqCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A12646TMPMMPieCo));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMPMMPieCo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPMCod_Internalname = "PMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPMTCod_Internalname = "PMTCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtPMTDsc_Internalname = "PMTDSC" ;
      edtavnRcdDeleted_1737_Internalname = "vNRCDDELETED_1737" ;
      edtTMPMMEquCo_Internalname = "TMPMMEQUCO" ;
      edtTMPMMSEqCo_Internalname = "TMPMMSEQCO" ;
      edtTMPMMPieCo_Internalname = "TMPMMPIECO" ;
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
      lblTextblock5_Caption = httpContext.getMessage( "Desc. Tarea en Mant Preventivo", "") ;
      lblTextblock4_Caption = httpContext.getMessage( "Tarea", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MPrev Indutexma", "") );
      edtTMPMMPieCo_Jsonclick = "" ;
      edtTMPMMSEqCo_Jsonclick = "" ;
      edtTMPMMEquCo_Jsonclick = "" ;
      edtavnRcdDeleted_1737_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtPMTDsc_Jsonclick = "" ;
      edtPMTCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtTMPMMPieCo_Enabled = 1 ;
      edtTMPMMSEqCo_Enabled = 1 ;
      edtTMPMMEquCo_Enabled = 1 ;
      edtavnRcdDeleted_1737_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPMTDsc_Enabled = 0 ;
      edtPMTCod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPMCod_Jsonclick = "" ;
      edtPMCod_Backcolor = (int)(0xFFFFFF) ;
      edtPMCod_Enabled = 1 ;
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
      subsflControlProps_351533( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KU1533( ) ;
         standaloneModal1KU1533( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KU1533( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_351533( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_521737( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KU1533( ) ;
         standaloneModal1KU1533( ) ;
         standaloneNotModal1KU1737( ) ;
         standaloneModal1KU1737( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KU1737( ) ;
         nGXsfl_52_idx = (int)(nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_521737( ) ;
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
      /* Using cursor T01KU34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KU34_A407EmprNom[0] ;
      n407EmprNom = T01KU34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(32);
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

   public void valid_Pmcod( )
   {
      n9429PMCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9429PMCod", GXutil.ltrim( localUtil.ntoc( Z9429PMCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Pmtcod( )
   {
      n9480PMTDsc = false ;
      /* Using cursor T01KU27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9479PMTCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MPTar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PMTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPMTCod_Internalname ;
      }
      A9480PMTDsc = T01KU27_A9480PMTDsc[0] ;
      n9480PMTDsc = T01KU27_n9480PMTDsc[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9480PMTDsc", GXutil.rtrim( A9480PMTDsc));
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
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PMCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z9429PMCod'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PMTCOD","{handler:'valid_Pmtcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9479PMTCod',fld:'PMTCOD',pic:'ZZZZZZZ9'},{av:'A9480PMTDsc',fld:'PMTDSC',pic:''}]");
      setEventMetadata("VALID_PMTCOD",",oparms:[{av:'A9480PMTDsc',fld:'PMTDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pmtdsc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_TMPMMEQUCO","{handler:'valid_Tmpmmequco',iparms:[]");
      setEventMetadata("VALID_TMPMMEQUCO",",oparms:[]}");
      setEventMetadata("VALID_TMPMMSEQCO","{handler:'valid_Tmpmmseqco',iparms:[]");
      setEventMetadata("VALID_TMPMMSEQCO",",oparms:[]}");
      setEventMetadata("VALID_TMPMMPIECO","{handler:'valid_Tmpmmpieco',iparms:[]");
      setEventMetadata("VALID_TMPMMPIECO",",oparms:[]}");
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
      pr_default.close(25);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12644TMPMMEquCo = "" ;
      Z12645TMPMMSEqCo = "" ;
      Z12646TMPMMPieCo = "" ;
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
      sMode1533 = "" ;
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
      sMode1236 = "" ;
      GXCCtl = "" ;
      A12644TMPMMEquCo = "" ;
      A12645TMPMMSEqCo = "" ;
      A12646TMPMMPieCo = "" ;
      A9480PMTDsc = "" ;
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
      T01KU9_A407EmprNom = new String[] {""} ;
      T01KU9_n407EmprNom = new boolean[] {false} ;
      T01KU10_A9429PMCod = new int[1] ;
      T01KU10_n9429PMCod = new boolean[] {false} ;
      T01KU10_A407EmprNom = new String[] {""} ;
      T01KU10_n407EmprNom = new boolean[] {false} ;
      T01KU10_A396EmprCod = new String[] {""} ;
      T01KU11_A396EmprCod = new String[] {""} ;
      T01KU11_A9429PMCod = new int[1] ;
      T01KU11_n9429PMCod = new boolean[] {false} ;
      T01KU8_A9429PMCod = new int[1] ;
      T01KU8_n9429PMCod = new boolean[] {false} ;
      T01KU8_A396EmprCod = new String[] {""} ;
      T01KU12_A396EmprCod = new String[] {""} ;
      T01KU12_A9429PMCod = new int[1] ;
      T01KU12_n9429PMCod = new boolean[] {false} ;
      T01KU13_A396EmprCod = new String[] {""} ;
      T01KU13_A9429PMCod = new int[1] ;
      T01KU13_n9429PMCod = new boolean[] {false} ;
      T01KU7_A9429PMCod = new int[1] ;
      T01KU7_n9429PMCod = new boolean[] {false} ;
      T01KU7_A396EmprCod = new String[] {""} ;
      T01KU16_A396EmprCod = new String[] {""} ;
      T01KU16_A9429PMCod = new int[1] ;
      T01KU16_n9429PMCod = new boolean[] {false} ;
      T01KU16_A9479PMTCod = new int[1] ;
      T01KU17_A396EmprCod = new String[] {""} ;
      T01KU17_A9429PMCod = new int[1] ;
      T01KU17_n9429PMCod = new boolean[] {false} ;
      T01KU17_A11450PMMEquCod = new String[] {""} ;
      T01KU17_A11451PMMSEqCod = new String[] {""} ;
      T01KU17_A11452PMMPieCod = new String[] {""} ;
      T01KU18_A396EmprCod = new String[] {""} ;
      T01KU18_A9429PMCod = new int[1] ;
      T01KU18_n9429PMCod = new boolean[] {false} ;
      T01KU18_A9481PMOpeRes = new int[1] ;
      T01KU19_A396EmprCod = new String[] {""} ;
      T01KU19_A9429PMCod = new int[1] ;
      T01KU19_n9429PMCod = new boolean[] {false} ;
      T01KU19_A9489PMRepCod = new int[1] ;
      T01KU20_A396EmprCod = new String[] {""} ;
      T01KU20_A9425OMCod = new int[1] ;
      T01KU21_A396EmprCod = new String[] {""} ;
      T01KU21_A9429PMCod = new int[1] ;
      T01KU21_n9429PMCod = new boolean[] {false} ;
      Z9480PMTDsc = "" ;
      T01KU22_A9429PMCod = new int[1] ;
      T01KU22_n9429PMCod = new boolean[] {false} ;
      T01KU22_A9480PMTDsc = new String[] {""} ;
      T01KU22_n9480PMTDsc = new boolean[] {false} ;
      T01KU22_A396EmprCod = new String[] {""} ;
      T01KU22_A9479PMTCod = new int[1] ;
      T01KU6_A9480PMTDsc = new String[] {""} ;
      T01KU6_n9480PMTDsc = new boolean[] {false} ;
      T01KU23_A9480PMTDsc = new String[] {""} ;
      T01KU23_n9480PMTDsc = new boolean[] {false} ;
      T01KU24_A396EmprCod = new String[] {""} ;
      T01KU24_A9429PMCod = new int[1] ;
      T01KU24_n9429PMCod = new boolean[] {false} ;
      T01KU24_A9479PMTCod = new int[1] ;
      T01KU5_A9429PMCod = new int[1] ;
      T01KU5_n9429PMCod = new boolean[] {false} ;
      T01KU5_A396EmprCod = new String[] {""} ;
      T01KU5_A9479PMTCod = new int[1] ;
      T01KU4_A9429PMCod = new int[1] ;
      T01KU4_n9429PMCod = new boolean[] {false} ;
      T01KU4_A396EmprCod = new String[] {""} ;
      T01KU4_A9479PMTCod = new int[1] ;
      T01KU27_A9480PMTDsc = new String[] {""} ;
      T01KU27_n9480PMTDsc = new boolean[] {false} ;
      T01KU28_A396EmprCod = new String[] {""} ;
      T01KU28_A9429PMCod = new int[1] ;
      T01KU28_n9429PMCod = new boolean[] {false} ;
      T01KU28_A9479PMTCod = new int[1] ;
      T01KU29_A9429PMCod = new int[1] ;
      T01KU29_n9429PMCod = new boolean[] {false} ;
      T01KU29_A9479PMTCod = new int[1] ;
      T01KU29_A12644TMPMMEquCo = new String[] {""} ;
      T01KU29_A12645TMPMMSEqCo = new String[] {""} ;
      T01KU29_A12646TMPMMPieCo = new String[] {""} ;
      T01KU29_A396EmprCod = new String[] {""} ;
      T01KU30_A396EmprCod = new String[] {""} ;
      T01KU30_A9429PMCod = new int[1] ;
      T01KU30_n9429PMCod = new boolean[] {false} ;
      T01KU30_A9479PMTCod = new int[1] ;
      T01KU30_A12644TMPMMEquCo = new String[] {""} ;
      T01KU30_A12645TMPMMSEqCo = new String[] {""} ;
      T01KU30_A12646TMPMMPieCo = new String[] {""} ;
      T01KU3_A9429PMCod = new int[1] ;
      T01KU3_n9429PMCod = new boolean[] {false} ;
      T01KU3_A9479PMTCod = new int[1] ;
      T01KU3_A12644TMPMMEquCo = new String[] {""} ;
      T01KU3_A12645TMPMMSEqCo = new String[] {""} ;
      T01KU3_A12646TMPMMPieCo = new String[] {""} ;
      T01KU3_A396EmprCod = new String[] {""} ;
      sMode1737 = "" ;
      T01KU2_A9429PMCod = new int[1] ;
      T01KU2_n9429PMCod = new boolean[] {false} ;
      T01KU2_A9479PMTCod = new int[1] ;
      T01KU2_A12644TMPMMEquCo = new String[] {""} ;
      T01KU2_A12645TMPMMSEqCo = new String[] {""} ;
      T01KU2_A12646TMPMMPieCo = new String[] {""} ;
      T01KU2_A396EmprCod = new String[] {""} ;
      T01KU33_A396EmprCod = new String[] {""} ;
      T01KU33_A9429PMCod = new int[1] ;
      T01KU33_n9429PMCod = new boolean[] {false} ;
      T01KU33_A9479PMTCod = new int[1] ;
      T01KU33_A12644TMPMMEquCo = new String[] {""} ;
      T01KU33_A12645TMPMMSEqCo = new String[] {""} ;
      T01KU33_A12646TMPMMPieCo = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock4_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock5_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01KU34_A407EmprNom = new String[] {""} ;
      T01KU34_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmprevindutexma__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmprevindutexma__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmprevindutexma__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmprevindutexma__default(),
         new Object[] {
             new Object[] {
            T01KU2_A9429PMCod, T01KU2_A9479PMTCod, T01KU2_A12644TMPMMEquCo, T01KU2_A12645TMPMMSEqCo, T01KU2_A12646TMPMMPieCo, T01KU2_A396EmprCod
            }
            , new Object[] {
            T01KU3_A9429PMCod, T01KU3_A9479PMTCod, T01KU3_A12644TMPMMEquCo, T01KU3_A12645TMPMMSEqCo, T01KU3_A12646TMPMMPieCo, T01KU3_A396EmprCod
            }
            , new Object[] {
            T01KU4_A9429PMCod, T01KU4_A396EmprCod, T01KU4_A9479PMTCod
            }
            , new Object[] {
            T01KU5_A9429PMCod, T01KU5_A396EmprCod, T01KU5_A9479PMTCod
            }
            , new Object[] {
            T01KU6_A9480PMTDsc, T01KU6_n9480PMTDsc
            }
            , new Object[] {
            T01KU7_A9429PMCod, T01KU7_A396EmprCod
            }
            , new Object[] {
            T01KU8_A9429PMCod, T01KU8_A396EmprCod
            }
            , new Object[] {
            T01KU9_A407EmprNom, T01KU9_n407EmprNom
            }
            , new Object[] {
            T01KU10_A9429PMCod, T01KU10_A407EmprNom, T01KU10_n407EmprNom, T01KU10_A396EmprCod
            }
            , new Object[] {
            T01KU11_A396EmprCod, T01KU11_A9429PMCod
            }
            , new Object[] {
            T01KU12_A396EmprCod, T01KU12_A9429PMCod
            }
            , new Object[] {
            T01KU13_A396EmprCod, T01KU13_A9429PMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KU16_A396EmprCod, T01KU16_A9429PMCod, T01KU16_A9479PMTCod
            }
            , new Object[] {
            T01KU17_A396EmprCod, T01KU17_A9429PMCod, T01KU17_A11450PMMEquCod, T01KU17_A11451PMMSEqCod, T01KU17_A11452PMMPieCod
            }
            , new Object[] {
            T01KU18_A396EmprCod, T01KU18_A9429PMCod, T01KU18_A9481PMOpeRes
            }
            , new Object[] {
            T01KU19_A396EmprCod, T01KU19_A9429PMCod, T01KU19_A9489PMRepCod
            }
            , new Object[] {
            T01KU20_A396EmprCod, T01KU20_A9425OMCod
            }
            , new Object[] {
            T01KU21_A396EmprCod, T01KU21_A9429PMCod
            }
            , new Object[] {
            T01KU22_A9429PMCod, T01KU22_A9480PMTDsc, T01KU22_n9480PMTDsc, T01KU22_A396EmprCod, T01KU22_A9479PMTCod
            }
            , new Object[] {
            T01KU23_A9480PMTDsc, T01KU23_n9480PMTDsc
            }
            , new Object[] {
            T01KU24_A396EmprCod, T01KU24_A9429PMCod, T01KU24_A9479PMTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KU27_A9480PMTDsc, T01KU27_n9480PMTDsc
            }
            , new Object[] {
            T01KU28_A396EmprCod, T01KU28_A9429PMCod, T01KU28_A9479PMTCod
            }
            , new Object[] {
            T01KU29_A9429PMCod, T01KU29_A9479PMTCod, T01KU29_A12644TMPMMEquCo, T01KU29_A12645TMPMMSEqCo, T01KU29_A12646TMPMMPieCo, T01KU29_A396EmprCod
            }
            , new Object[] {
            T01KU30_A396EmprCod, T01KU30_A9429PMCod, T01KU30_A9479PMTCod, T01KU30_A12644TMPMMEquCo, T01KU30_A12645TMPMMSEqCo, T01KU30_A12646TMPMMPieCo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KU33_A396EmprCod, T01KU33_A9429PMCod, T01KU33_A9479PMTCod, T01KU33_A12644TMPMMEquCo, T01KU33_A12645TMPMMSEqCo, T01KU33_A12646TMPMMPieCo
            }
            , new Object[] {
            T01KU34_A407EmprNom, T01KU34_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "TMPrevIndutexma" ;
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
   private short nRcdDeleted_1533 ;
   private short nRcdExists_1533 ;
   private short nIsMod_1533 ;
   private short nRcdDeleted_1737 ;
   private short nRcdExists_1737 ;
   private short nIsMod_1737 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1533 ;
   private short RcdFound1533 ;
   private short nBlankRcdUsr1533 ;
   private short RcdFound1737 ;
   private short RcdFound1236 ;
   private short nIsDirty_1236 ;
   private short nIsDirty_1533 ;
   private short nIsDirty_1737 ;
   private short nBlankRcdCount1737 ;
   private short nBlankRcdUsr1737 ;
   private short subGrid1_Borderwidth ;
   private int Z9429PMCod ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z9479PMTCod ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int A9479PMTCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A9429PMCod ;
   private int edtPMCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPMTCod_Enabled ;
   private int edtPMTDsc_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1737_Enabled ;
   private int edtTMPMMEquCo_Enabled ;
   private int edtTMPMMSEqCo_Enabled ;
   private int edtTMPMMPieCo_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtTMPMMPieCo_Enabled ;
   private int defedtTMPMMSEqCo_Enabled ;
   private int defedtTMPMMEquCo_Enabled ;
   private int defedtPMTCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtPMCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ9429PMCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12644TMPMMEquCo ;
   private String Z12645TMPMMSEqCo ;
   private String Z12646TMPMMPieCo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPMCod_Internalname ;
   private String sGXsfl_35_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_52_idx="0001" ;
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
   private String edtPMCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1533 ;
   private String edtPMTCod_Internalname ;
   private String edtPMTDsc_Internalname ;
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
   private String edtavnRcdDeleted_1737_Internalname ;
   private String sMode1236 ;
   private String GXCCtl ;
   private String edtTMPMMEquCo_Internalname ;
   private String A12644TMPMMEquCo ;
   private String edtTMPMMSEqCo_Internalname ;
   private String A12645TMPMMSEqCo ;
   private String edtTMPMMPieCo_Internalname ;
   private String A12646TMPMMPieCo ;
   private String A9480PMTDsc ;
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
   private String Z9480PMTDsc ;
   private String sMode1737 ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock5_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String ROClassString ;
   private String edtPMTCod_Jsonclick ;
   private String lblTextblock5_Jsonclick ;
   private String edtPMTDsc_Jsonclick ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1737_Jsonclick ;
   private String edtTMPMMEquCo_Jsonclick ;
   private String edtTMPMMSEqCo_Jsonclick ;
   private String edtTMPMMPieCo_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock4_Caption ;
   private String lblTextblock5_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n9429PMCod ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n9480PMTDsc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01KU9_A407EmprNom ;
   private boolean[] T01KU9_n407EmprNom ;
   private int[] T01KU10_A9429PMCod ;
   private boolean[] T01KU10_n9429PMCod ;
   private String[] T01KU10_A407EmprNom ;
   private boolean[] T01KU10_n407EmprNom ;
   private String[] T01KU10_A396EmprCod ;
   private String[] T01KU11_A396EmprCod ;
   private int[] T01KU11_A9429PMCod ;
   private boolean[] T01KU11_n9429PMCod ;
   private int[] T01KU8_A9429PMCod ;
   private boolean[] T01KU8_n9429PMCod ;
   private String[] T01KU8_A396EmprCod ;
   private String[] T01KU12_A396EmprCod ;
   private int[] T01KU12_A9429PMCod ;
   private boolean[] T01KU12_n9429PMCod ;
   private String[] T01KU13_A396EmprCod ;
   private int[] T01KU13_A9429PMCod ;
   private boolean[] T01KU13_n9429PMCod ;
   private int[] T01KU7_A9429PMCod ;
   private boolean[] T01KU7_n9429PMCod ;
   private String[] T01KU7_A396EmprCod ;
   private String[] T01KU16_A396EmprCod ;
   private int[] T01KU16_A9429PMCod ;
   private boolean[] T01KU16_n9429PMCod ;
   private int[] T01KU16_A9479PMTCod ;
   private String[] T01KU17_A396EmprCod ;
   private int[] T01KU17_A9429PMCod ;
   private boolean[] T01KU17_n9429PMCod ;
   private String[] T01KU17_A11450PMMEquCod ;
   private String[] T01KU17_A11451PMMSEqCod ;
   private String[] T01KU17_A11452PMMPieCod ;
   private String[] T01KU18_A396EmprCod ;
   private int[] T01KU18_A9429PMCod ;
   private boolean[] T01KU18_n9429PMCod ;
   private int[] T01KU18_A9481PMOpeRes ;
   private String[] T01KU19_A396EmprCod ;
   private int[] T01KU19_A9429PMCod ;
   private boolean[] T01KU19_n9429PMCod ;
   private int[] T01KU19_A9489PMRepCod ;
   private String[] T01KU20_A396EmprCod ;
   private int[] T01KU20_A9425OMCod ;
   private String[] T01KU21_A396EmprCod ;
   private int[] T01KU21_A9429PMCod ;
   private boolean[] T01KU21_n9429PMCod ;
   private int[] T01KU22_A9429PMCod ;
   private boolean[] T01KU22_n9429PMCod ;
   private String[] T01KU22_A9480PMTDsc ;
   private boolean[] T01KU22_n9480PMTDsc ;
   private String[] T01KU22_A396EmprCod ;
   private int[] T01KU22_A9479PMTCod ;
   private String[] T01KU6_A9480PMTDsc ;
   private boolean[] T01KU6_n9480PMTDsc ;
   private String[] T01KU23_A9480PMTDsc ;
   private boolean[] T01KU23_n9480PMTDsc ;
   private String[] T01KU24_A396EmprCod ;
   private int[] T01KU24_A9429PMCod ;
   private boolean[] T01KU24_n9429PMCod ;
   private int[] T01KU24_A9479PMTCod ;
   private int[] T01KU5_A9429PMCod ;
   private boolean[] T01KU5_n9429PMCod ;
   private String[] T01KU5_A396EmprCod ;
   private int[] T01KU5_A9479PMTCod ;
   private int[] T01KU4_A9429PMCod ;
   private boolean[] T01KU4_n9429PMCod ;
   private String[] T01KU4_A396EmprCod ;
   private int[] T01KU4_A9479PMTCod ;
   private String[] T01KU27_A9480PMTDsc ;
   private boolean[] T01KU27_n9480PMTDsc ;
   private String[] T01KU28_A396EmprCod ;
   private int[] T01KU28_A9429PMCod ;
   private boolean[] T01KU28_n9429PMCod ;
   private int[] T01KU28_A9479PMTCod ;
   private int[] T01KU29_A9429PMCod ;
   private boolean[] T01KU29_n9429PMCod ;
   private int[] T01KU29_A9479PMTCod ;
   private String[] T01KU29_A12644TMPMMEquCo ;
   private String[] T01KU29_A12645TMPMMSEqCo ;
   private String[] T01KU29_A12646TMPMMPieCo ;
   private String[] T01KU29_A396EmprCod ;
   private String[] T01KU30_A396EmprCod ;
   private int[] T01KU30_A9429PMCod ;
   private boolean[] T01KU30_n9429PMCod ;
   private int[] T01KU30_A9479PMTCod ;
   private String[] T01KU30_A12644TMPMMEquCo ;
   private String[] T01KU30_A12645TMPMMSEqCo ;
   private String[] T01KU30_A12646TMPMMPieCo ;
   private int[] T01KU3_A9429PMCod ;
   private boolean[] T01KU3_n9429PMCod ;
   private int[] T01KU3_A9479PMTCod ;
   private String[] T01KU3_A12644TMPMMEquCo ;
   private String[] T01KU3_A12645TMPMMSEqCo ;
   private String[] T01KU3_A12646TMPMMPieCo ;
   private String[] T01KU3_A396EmprCod ;
   private int[] T01KU2_A9429PMCod ;
   private boolean[] T01KU2_n9429PMCod ;
   private int[] T01KU2_A9479PMTCod ;
   private String[] T01KU2_A12644TMPMMEquCo ;
   private String[] T01KU2_A12645TMPMMSEqCo ;
   private String[] T01KU2_A12646TMPMMPieCo ;
   private String[] T01KU2_A396EmprCod ;
   private String[] T01KU33_A396EmprCod ;
   private int[] T01KU33_A9429PMCod ;
   private boolean[] T01KU33_n9429PMCod ;
   private int[] T01KU33_A9479PMTCod ;
   private String[] T01KU33_A12644TMPMMEquCo ;
   private String[] T01KU33_A12645TMPMMSEqCo ;
   private String[] T01KU33_A12646TMPMMPieCo ;
   private String[] T01KU34_A407EmprNom ;
   private boolean[] T01KU34_n407EmprNom ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmprevindutexma__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmprevindutexma__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmprevindutexma__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmprevindutexma__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KU2", "SELECT PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo, EmprCod FROM TXPMPrevI WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? AND TMPMMEquCo = ? AND TMPMMSEqCo = ? AND TMPMMPieCo = ?  FOR UPDATE OF PMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU3", "SELECT PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo, EmprCod FROM TXPMPrevI WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? AND TMPMMEquCo = ? AND TMPMMSEqCo = ? AND TMPMMPieCo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU4", "SELECT PMCod, EmprCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ?  FOR UPDATE OF PMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU5", "SELECT PMCod, EmprCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU6", "SELECT TMDsc AS PMTDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU7", "SELECT PMCod, EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ?  FOR UPDATE OF PMCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU8", "SELECT PMCod, EmprCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU10", "SELECT /*+ FIRST_ROWS(100) */ TM1.PMCod, T2.EmprNom, TM1.EmprCod FROM (TXPMPREVE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PMCod = ? ORDER BY TM1.EmprCod, TM1.PMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PMCod FROM TXPMPREVE WHERE ( PMCod > ?) and EmprCod = ? ORDER BY EmprCod, PMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KU13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PMCod FROM TXPMPREVE WHERE ( PMCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, PMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KU14", "INSERT INTO TXPMPREVE(PMCod, EmprCod, PMDsc, PMFchCre, PMUsuCre, PMMaqCod, PMEst, PMTxt, PMIni, PMFin, PMUlt, PMDias, PMOrd, PMUso, PMTie, PMPla, PMUsoMts, PMDiasPavi, PMTipoID, PMTieMto) VALUES(?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPMPREVE")
         ,new UpdateCursor("T01KU15", "DELETE FROM TXPMPREVE  WHERE EmprCod = ? AND PMCod = ?", GX_NOMASK, "TXPMPREVE")
         ,new ForEachCursor("T01KU16", "SELECT * FROM (SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KU17", "SELECT * FROM (SELECT EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod FROM TXPMPrev2 WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KU18", "SELECT * FROM (SELECT EmprCod, PMCod, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KU19", "SELECT * FROM (SELECT EmprCod, PMCod, PMRepCod FROM TXPMPreRe WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KU20", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND PMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KU21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? ORDER BY EmprCod, PMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU22", "SELECT T1.PMCod, T2.TMDsc AS PMTDsc, T1.EmprCod, T1.PMTCod AS PMTCod FROM (TXPMPrev3 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.PMTCod) WHERE T1.EmprCod = ? and T1.PMCod = ? and T1.PMTCod = ? ORDER BY T1.EmprCod, T1.PMCod, T1.PMTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU23", "SELECT TMDsc AS PMTDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU24", "SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KU25", "INSERT INTO TXPMPrev3(PMCod, EmprCod, PMTCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMPrev3")
         ,new UpdateCursor("T01KU26", "DELETE FROM TXPMPrev3  WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ?", GX_NOMASK, "TXPMPrev3")
         ,new ForEachCursor("T01KU27", "SELECT TMDsc AS PMTDsc FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU28", "SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod, PMTCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU29", "SELECT PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo, EmprCod FROM TXPMPrevI WHERE EmprCod = ? and PMCod = ? and PMTCod = ? and TMPMMEquCo = ? and TMPMMSEqCo = ? and TMPMMPieCo = ? ORDER BY EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU30", "SELECT EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo FROM TXPMPrevI WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? AND TMPMMEquCo = ? AND TMPMMSEqCo = ? AND TMPMMPieCo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KU31", "INSERT INTO TXPMPrevI(PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMPrevI")
         ,new UpdateCursor("T01KU32", "DELETE FROM TXPMPrevI  WHERE EmprCod = ? AND PMCod = ? AND PMTCod = ? AND TMPMMEquCo = ? AND TMPMMSEqCo = ? AND TMPMMPieCo = ?", GX_NOMASK, "TXPMPrevI")
         ,new ForEachCursor("T01KU33", "SELECT EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo FROM TXPMPrevI WHERE EmprCod = ? and PMCod = ? and PMTCod = ? ORDER BY EmprCod, PMCod, PMTCod, TMPMMEquCo, TMPMMSEqCo, TMPMMPieCo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KU34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 32 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               stmt.setString(6, (String)parms[6], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               stmt.setString(6, (String)parms[6], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               stmt.setString(6, (String)parms[6], 10);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               stmt.setString(6, (String)parms[6], 10);
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 10);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               stmt.setString(6, (String)parms[6], 3);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 10);
               stmt.setString(6, (String)parms[6], 10);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

