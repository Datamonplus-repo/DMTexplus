package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqtmu_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tiempos Muertos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMaqCod_Internalname ;
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

   public tmaqtmu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqtmu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqtmu_impl.class ));
   }

   public tmaqtmu_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMAQTMU.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMAQTMU.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQTMU.htm");
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
         nBlankRcdCount1344 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1344 = (short)(1) ;
            scanStart16L1344( ) ;
            while ( RcdFound1344 != 0 )
            {
               init_level_properties1344( ) ;
               getByPrimaryKey16L1344( ) ;
               addRow16L1344( ) ;
               scanNext16L1344( ) ;
            }
            scanEnd16L1344( ) ;
            nBlankRcdCount1344 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal16L1344( ) ;
         standaloneModal16L1344( ) ;
         sMode1344 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow16L1344( ) ;
            edtavnRcdDeleted_1344_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1344_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1344_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1344_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMaqTMuIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTMUINI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuIni_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtMaqTMuDur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTMUDUR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuDur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuDur_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1344 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16L1344( ) ;
            }
            sendRow16L1344( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1344 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1344 = (short)(5) ;
         nRcdExists_1344 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16L1344( ) ;
            while ( RcdFound1344 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401344( ) ;
               init_level_properties1344( ) ;
               standaloneNotModal16L1344( ) ;
               getByPrimaryKey16L1344( ) ;
               standaloneModal16L1344( ) ;
               addRow16L1344( ) ;
               scanNext16L1344( ) ;
            }
            scanEnd16L1344( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1344 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401344( ) ;
      initAll16L1344( ) ;
      init_level_properties1344( ) ;
      nRcdExists_1344 = (short)(0) ;
      nIsMod_1344 = (short)(0) ;
      nRcdDeleted_1344 = (short)(0) ;
      nBlankRcdCount1344 = (short)(nBlankRcdUsr1344+nBlankRcdCount1344) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1344 > 0 )
      {
         standaloneNotModal16L1344( ) ;
         standaloneModal16L1344( ) ;
         addRow16L1344( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMaqTMuIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1344 = (short)(nBlankRcdCount1344-1) ;
      }
      Gx_mode = sMode1344 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQTMU.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TMAQTMU.htm");
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
      e1116L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z606MaqDsc = httpContext.cgiGet( "Z606MaqDsc") ;
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
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
                        e1116L2 ();
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
            initAll16L65( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1344_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1344_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes16L65( ) ;
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

   public void confirm_16L0( )
   {
      beforeValidate16L65( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16L65( ) ;
         }
         else
         {
            checkExtendedTable16L65( ) ;
            if ( AnyError == 0 )
            {
               zm16L65( 2) ;
            }
            closeExtendedTableCursors16L65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_16L1344( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues16L0( ) ;
      }
   }

   public void confirm_16L1344( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow16L1344( ) ;
         if ( ( nRcdExists_1344 != 0 ) || ( nIsMod_1344 != 0 ) )
         {
            getKey16L1344( ) ;
            if ( ( nRcdExists_1344 == 0 ) && ( nRcdDeleted_1344 == 0 ) )
            {
               if ( RcdFound1344 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16L1344( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16L1344( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors16L1344( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQTMUINI_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqTMuIni_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1344 != 0 )
               {
                  if ( nRcdDeleted_1344 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16L1344( ) ;
                     load16L1344( ) ;
                     beforeValidate16L1344( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16L1344( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1344 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16L1344( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16L1344( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors16L1344( ) ;
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
                  if ( nRcdDeleted_1344 == 0 )
                  {
                     GXCCtl = "MAQTMUINI_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqTMuIni_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1344_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTMuIni_Internalname, localUtil.ttoc( A74MaqTMuIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqTMuDur_Internalname, GXutil.ltrim( localUtil.ntoc( A75MaqTMuDur, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z74MaqTMuIni_"+sGXsfl_40_idx, localUtil.ttoc( Z74MaqTMuIni, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z75MaqTMuDur_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z75MaqTMuDur, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1344_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1344_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1344_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1344 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1344_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1344_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTMUINI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTMUDUR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuDur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16L0( )
   {
   }

   public void e1116L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmaqtmu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tmaqtmu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmaqtmu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqtmu_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqtmu_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmaqtmu_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm16L65( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z606MaqDsc = T016L5_A606MaqDsc[0] ;
         }
         else
         {
            Z606MaqDsc = A606MaqDsc ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z602MaqCod = A602MaqCod ;
         Z606MaqDsc = A606MaqDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TMAQTMU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T016L6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016L6_A407EmprNom[0] ;
      n407EmprNom = T016L6_n407EmprNom[0] ;
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

   public void load16L65( )
   {
      /* Using cursor T016L7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A407EmprNom = T016L7_A407EmprNom[0] ;
         n407EmprNom = T016L7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A606MaqDsc = T016L7_A606MaqDsc[0] ;
         n606MaqDsc = T016L7_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         zm16L65( -1) ;
      }
      pr_default.close(5);
      onLoadActions16L65( ) ;
   }

   public void onLoadActions16L65( )
   {
   }

   public void checkExtendedTable16L65( )
   {
      nIsDirty_65 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors16L65( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey16L65( )
   {
      /* Using cursor T016L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016L5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T016L5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16L65( 1) ;
         RcdFound65 = (short)(1) ;
         A602MaqCod = T016L5_A602MaqCod[0] ;
         n602MaqCod = T016L5_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = T016L5_A606MaqDsc[0] ;
         n606MaqDsc = T016L5_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load16L65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey16L65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey16L65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey16L65( ) ;
      if ( RcdFound65 == 0 )
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
      RcdFound65 = (short)(0) ;
      /* Using cursor T016L9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T016L9_A602MaqCod[0], A602MaqCod) < 0 ) ) && ( GXutil.strcmp(T016L9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T016L9_A602MaqCod[0], A602MaqCod) > 0 ) ) && ( GXutil.strcmp(T016L9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T016L9_A602MaqCod[0] ;
            n602MaqCod = T016L9_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T016L10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T016L10_A602MaqCod[0], A602MaqCod) > 0 ) ) && ( GXutil.strcmp(T016L10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T016L10_A602MaqCod[0], A602MaqCod) < 0 ) ) && ( GXutil.strcmp(T016L10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T016L10_A602MaqCod[0] ;
            n602MaqCod = T016L10_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16L65( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16L65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update16L65( ) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16L65( ) ;
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
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16L65( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
      {
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMaqCod_Internalname ;
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
      getKey16L65( ) ;
      if ( RcdFound65 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
         {
            A602MaqCod = Z602MaqCod ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqtmu");
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_16L0( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart16L65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16L65( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
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
      scanStart16L65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound65 != 0 )
         {
            scanNext16L65( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd16L65( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency16L65( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016L4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z606MaqDsc, T016L4_A606MaqDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z606MaqDsc, T016L4_A606MaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtmu:[seudo value changed for attri]"+"MaqDsc");
               GXutil.writeLogRaw("Old: ",Z606MaqDsc);
               GXutil.writeLogRaw("Current: ",T016L4_A606MaqDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQUIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16L65( )
   {
      beforeValidate16L65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16L65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16L65( 0) ;
         checkOptimisticConcurrency16L65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16L65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16L65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016L11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
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
                        processLevel16L65( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16L0( ) ;
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
            load16L65( ) ;
         }
         endLevel16L65( ) ;
      }
      closeExtendedTableCursors16L65( ) ;
   }

   public void update16L65( )
   {
      beforeValidate16L65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16L65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16L65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16L65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16L65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016L12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16L65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16L65( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption16L0( ) ;
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
         endLevel16L65( ) ;
      }
      closeExtendedTableCursors16L65( ) ;
   }

   public void deferredUpdate16L65( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16L65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16L65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16L65( ) ;
         afterConfirm16L65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16L65( ) ;
            if ( AnyError == 0 )
            {
               scanStart16L1344( ) ;
               while ( RcdFound1344 != 0 )
               {
                  getByPrimaryKey16L1344( ) ;
                  delete16L1344( ) ;
                  scanNext16L1344( ) ;
               }
               scanEnd16L1344( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016L13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound65 == 0 )
                        {
                           initAll16L65( ) ;
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
                        resetCaption16L0( ) ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16L65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16L65( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T016L14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Costes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T016L15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T016L16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T016L17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLNMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T016L18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T016L19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Recetas Lavados Maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T016L20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T016L21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T016L22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T016L23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T016L24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Uso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T016L25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T016L26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Documentos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T016L27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MQDDOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T016L28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATF1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T016L29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFABS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T016L30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MSolicitudes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T016L31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MPreventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T016L32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T016L33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T016L34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONVPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T016L35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T016L36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTNQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T016L37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARTM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T016L38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T016L39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQGR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T016L40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Líneas Costes Retroalimentados", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T016L41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PlaMaq", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T016L42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T016L43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T016L44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T016L45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T016L46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T016L47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T016L48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T016L49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPLATI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T016L50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQMAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T016L51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T016L52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T016L53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T016L54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMHPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T016L55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T016L56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T016L57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T016L58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T016L59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T016L60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T016L61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T016L62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
      }
   }

   public void processNestedLevel16L1344( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow16L1344( ) ;
         if ( ( nRcdExists_1344 != 0 ) || ( nIsMod_1344 != 0 ) )
         {
            standaloneNotModal16L1344( ) ;
            getKey16L1344( ) ;
            if ( ( nRcdExists_1344 == 0 ) && ( nRcdDeleted_1344 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16L1344( ) ;
            }
            else
            {
               if ( RcdFound1344 != 0 )
               {
                  if ( ( nRcdDeleted_1344 != 0 ) && ( nRcdExists_1344 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16L1344( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1344 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16L1344( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1344 == 0 )
                  {
                     GXCCtl = "MAQTMUINI_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqTMuIni_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1344_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqTMuIni_Internalname, localUtil.ttoc( A74MaqTMuIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtMaqTMuDur_Internalname, GXutil.ltrim( localUtil.ntoc( A75MaqTMuDur, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z74MaqTMuIni_"+sGXsfl_40_idx, localUtil.ttoc( Z74MaqTMuIni, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z75MaqTMuDur_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z75MaqTMuDur, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1344_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1344_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1344_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1344 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1344_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1344_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTMUINI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQTMUDUR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuDur_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16L1344( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1344 = (short)(0) ;
      nIsMod_1344 = (short)(0) ;
      nRcdDeleted_1344 = (short)(0) ;
   }

   public void processLevel16L65( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevel16L1344( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16L65( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16L65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqtmu");
         if ( AnyError == 0 )
         {
            confirmValues16L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqtmu");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16L65( )
   {
      /* Scan By routine */
      /* Using cursor T016L63 */
      pr_default.execute(61, new Object[] {A396EmprCod});
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A602MaqCod = T016L63_A602MaqCod[0] ;
         n602MaqCod = T016L63_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16L65( )
   {
      /* Scan next routine */
      pr_default.readNext(61);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A602MaqCod = T016L63_A602MaqCod[0] ;
         n602MaqCod = T016L63_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
   }

   public void scanEnd16L65( )
   {
      pr_default.close(61);
   }

   public void afterConfirm16L65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16L65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16L65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16L65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16L65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16L65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16L65( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
   }

   public void zm16L1344( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z75MaqTMuDur = T016L3_A75MaqTMuDur[0] ;
         }
         else
         {
            Z75MaqTMuDur = A75MaqTMuDur ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z602MaqCod = A602MaqCod ;
         Z74MaqTMuIni = A74MaqTMuIni ;
         Z75MaqTMuDur = A75MaqTMuDur ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal16L1344( )
   {
   }

   public void standaloneModal16L1344( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqTMuIni_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuIni_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtMaqTMuIni_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuIni_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load16L1344( )
   {
      /* Using cursor T016L64 */
      pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni});
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound1344 = (short)(1) ;
         A75MaqTMuDur = T016L64_A75MaqTMuDur[0] ;
         n75MaqTMuDur = T016L64_n75MaqTMuDur[0] ;
         zm16L1344( -3) ;
      }
      pr_default.close(62);
      onLoadActions16L1344( ) ;
   }

   public void onLoadActions16L1344( )
   {
   }

   public void checkExtendedTable16L1344( )
   {
      nIsDirty_1344 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16L1344( ) ;
   }

   public void closeExtendedTableCursors16L1344( )
   {
   }

   public void enableDisable16L1344( )
   {
   }

   public void getKey16L1344( )
   {
      /* Using cursor T016L65 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound1344 = (short)(1) ;
      }
      else
      {
         RcdFound1344 = (short)(0) ;
      }
      pr_default.close(63);
   }

   public void getByPrimaryKey16L1344( )
   {
      /* Using cursor T016L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016L3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16L1344( 3) ;
         RcdFound1344 = (short)(1) ;
         initializeNonKey16L1344( ) ;
         A74MaqTMuIni = T016L3_A74MaqTMuIni[0] ;
         A75MaqTMuDur = T016L3_A75MaqTMuDur[0] ;
         n75MaqTMuDur = T016L3_n75MaqTMuDur[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z74MaqTMuIni = A74MaqTMuIni ;
         sMode1344 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16L1344( ) ;
         load16L1344( ) ;
         Gx_mode = sMode1344 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1344 = (short)(0) ;
         initializeNonKey16L1344( ) ;
         sMode1344 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16L1344( ) ;
         Gx_mode = sMode1344 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16L1344( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16L1344( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z75MaqTMuDur, T016L2_A75MaqTMuDur[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z75MaqTMuDur, T016L2_A75MaqTMuDur[0]) != 0 )
            {
               GXutil.writeLogln("tmaqtmu:[seudo value changed for attri]"+"MaqTMuDur");
               GXutil.writeLogRaw("Old: ",Z75MaqTMuDur);
               GXutil.writeLogRaw("Current: ",T016L2_A75MaqTMuDur[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQTMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16L1344( )
   {
      beforeValidate16L1344( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16L1344( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16L1344( 0) ;
         checkOptimisticConcurrency16L1344( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16L1344( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16L1344( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016L66 */
                  pr_default.execute(64, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni, Boolean.valueOf(n75MaqTMuDur), A75MaqTMuDur, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTMU");
                  if ( (pr_default.getStatus(64) == 1) )
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
            load16L1344( ) ;
         }
         endLevel16L1344( ) ;
      }
      closeExtendedTableCursors16L1344( ) ;
   }

   public void update16L1344( )
   {
      beforeValidate16L1344( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16L1344( ) ;
      }
      if ( ( nIsMod_1344 != 0 ) || ( nIsDirty_1344 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16L1344( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16L1344( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16L1344( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016L67 */
                     pr_default.execute(65, new Object[] {Boolean.valueOf(n75MaqTMuDur), A75MaqTMuDur, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTMU");
                     if ( (pr_default.getStatus(65) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQTMU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16L1344( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16L1344( ) ;
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
            endLevel16L1344( ) ;
         }
      }
      closeExtendedTableCursors16L1344( ) ;
   }

   public void deferredUpdate16L1344( )
   {
   }

   public void delete16L1344( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16L1344( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16L1344( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16L1344( ) ;
         afterConfirm16L1344( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16L1344( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016L68 */
               pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A74MaqTMuIni});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQTMU");
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
      sMode1344 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16L1344( ) ;
      Gx_mode = sMode1344 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16L1344( )
   {
      standaloneModal16L1344( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel16L1344( )
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

   public void scanStart16L1344( )
   {
      /* Scan By routine */
      /* Using cursor T016L69 */
      pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      RcdFound1344 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1344 = (short)(1) ;
         A74MaqTMuIni = T016L69_A74MaqTMuIni[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16L1344( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound1344 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound1344 = (short)(1) ;
         A74MaqTMuIni = T016L69_A74MaqTMuIni[0] ;
      }
   }

   public void scanEnd16L1344( )
   {
      pr_default.close(67);
   }

   public void afterConfirm16L1344( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16L1344( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16L1344( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16L1344( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16L1344( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16L1344( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16L1344( )
   {
      edtMaqTMuIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuIni_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtMaqTMuDur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuDur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuDur_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes16L1344( )
   {
   }

   public void send_integrity_lvl_hashes16L65( )
   {
   }

   public void subsflControlProps_401344( )
   {
      edtavnRcdDeleted_1344_Internalname = "vNRCDDELETED_1344_"+sGXsfl_40_idx ;
      edtMaqTMuIni_Internalname = "MAQTMUINI_"+sGXsfl_40_idx ;
      edtMaqTMuDur_Internalname = "MAQTMUDUR_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401344( )
   {
      edtavnRcdDeleted_1344_Internalname = "vNRCDDELETED_1344_"+sGXsfl_40_fel_idx ;
      edtMaqTMuIni_Internalname = "MAQTMUINI_"+sGXsfl_40_fel_idx ;
      edtMaqTMuDur_Internalname = "MAQTMUDUR_"+sGXsfl_40_fel_idx ;
   }

   public void addRow16L1344( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401344( ) ;
      sendRow16L1344( ) ;
   }

   public void sendRow16L1344( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1344_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1344_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1344_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1344), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1344), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1344_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1344_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1344_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTMuIni_Internalname,localUtil.ttoc( A74MaqTMuIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A74MaqTMuIni, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTMuIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTMuIni_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1344_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTMuDur_Internalname,GXutil.ltrim( localUtil.ntoc( A75MaqTMuDur, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMaqTMuDur_Enabled!=0) ? localUtil.format( A75MaqTMuDur, "ZZZ9.99") : localUtil.format( A75MaqTMuDur, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTMuDur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqTMuDur_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes16L1344( ) ;
      GXCCtl = "Z74MaqTMuIni_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z74MaqTMuIni, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z75MaqTMuDur_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z75MaqTMuDur, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1344_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1344_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1344_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1344, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1344_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1344_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTMUINI_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTMUDUR_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuDur_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow16L1344( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401344( ) ;
      edtavnRcdDeleted_1344_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1344_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTMuIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTMUINI_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqTMuDur_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQTMUDUR_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1344_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1344_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1344");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1344_Internalname ;
         wbErr = true ;
         nRcdDeleted_1344 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1344 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1344_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMaqTMuIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MAQTMUINI_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTMuIni_Internalname ;
         wbErr = true ;
         A74MaqTMuIni = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A74MaqTMuIni = localUtil.ctot( httpContext.cgiGet( edtMaqTMuIni_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqTMuDur_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqTMuDur_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "MAQTMUDUR_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqTMuDur_Internalname ;
         wbErr = true ;
         A75MaqTMuDur = DecimalUtil.ZERO ;
         n75MaqTMuDur = false ;
      }
      else
      {
         A75MaqTMuDur = localUtil.ctond( httpContext.cgiGet( edtMaqTMuDur_Internalname)) ;
         n75MaqTMuDur = false ;
      }
      GXCCtl = "Z74MaqTMuIni_" + sGXsfl_40_idx ;
      Z74MaqTMuIni = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z75MaqTMuDur_" + sGXsfl_40_idx ;
      Z75MaqTMuDur = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1344_" + sGXsfl_40_idx ;
      nRcdDeleted_1344 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1344_" + sGXsfl_40_idx ;
      nRcdExists_1344 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1344_" + sGXsfl_40_idx ;
      nIsMod_1344 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqTMuIni_Enabled = edtMaqTMuIni_Enabled ;
   }

   public void confirmValues16L0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401344( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401344( ) ;
         httpContext.changePostValue( "Z74MaqTMuIni_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z74MaqTMuIni_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z74MaqTMuIni_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z75MaqTMuDur_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z75MaqTMuDur_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z75MaqTMuDur_"+sGXsfl_40_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmaqtmu", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
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
      return formatLink("app.tmaqtmu", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQTMU" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tiempos Muertos", "") ;
   }

   public void initializeNonKey16L65( )
   {
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      Z606MaqDsc = "" ;
   }

   public void initAll16L65( )
   {
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      initializeNonKey16L65( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16L1344( )
   {
      A75MaqTMuDur = DecimalUtil.ZERO ;
      n75MaqTMuDur = false ;
      Z75MaqTMuDur = DecimalUtil.ZERO ;
   }

   public void initAll16L1344( )
   {
      A74MaqTMuIni = GXutil.resetTime( GXutil.nullDate() );
      initializeNonKey16L1344( ) ;
   }

   public void standaloneModalInsert16L1344( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241545635", true, true);
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
      httpContext.AddJavascriptSource("tmaqtmu.js", "?20268241545635", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1344( )
   {
      edtMaqTMuIni_Enabled = defedtMaqTMuIni_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTMuIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTMuIni_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1344, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1344_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A74MaqTMuIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A75MaqTMuDur, (byte)(7), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqTMuDur_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtavnRcdDeleted_1344_Internalname = "vNRCDDELETED_1344" ;
      edtMaqTMuIni_Internalname = "MAQTMUINI" ;
      edtMaqTMuDur_Internalname = "MAQTMUDUR" ;
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
      Form.setCaption( httpContext.getMessage( "Tiempos Muertos", "") );
      edtMaqTMuDur_Jsonclick = "" ;
      edtMaqTMuIni_Jsonclick = "" ;
      edtavnRcdDeleted_1344_Jsonclick = "" ;
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
      edtMaqTMuDur_Enabled = 1 ;
      edtMaqTMuIni_Enabled = 1 ;
      edtavnRcdDeleted_1344_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      subsflControlProps_401344( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16L1344( ) ;
         standaloneModal16L1344( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16L1344( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401344( ) ;
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
      /* Using cursor T016L70 */
      pr_default.execute(68, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016L70_A407EmprNom[0] ;
      n407EmprNom = T016L70_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(68);
      GX_FocusControl = edtMaqDsc_Internalname ;
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

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
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
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z407EmprNom'},{av:'Z606MaqDsc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_MAQTMUINI","{handler:'valid_Maqtmuini',iparms:[]");
      setEventMetadata("VALID_MAQTMUINI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqtmudur',iparms:[]");
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
      pr_default.close(68);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z606MaqDsc = "" ;
      Z74MaqTMuIni = GXutil.resetTime( GXutil.nullDate() );
      Z75MaqTMuDur = DecimalUtil.ZERO ;
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
      A602MaqCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A606MaqDsc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1344 = "" ;
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
      sMode65 = "" ;
      GXCCtl = "" ;
      A74MaqTMuIni = GXutil.resetTime( GXutil.nullDate() );
      A75MaqTMuDur = DecimalUtil.ZERO ;
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
      T016L6_A407EmprNom = new String[] {""} ;
      T016L6_n407EmprNom = new boolean[] {false} ;
      T016L7_A602MaqCod = new String[] {""} ;
      T016L7_n602MaqCod = new boolean[] {false} ;
      T016L7_A407EmprNom = new String[] {""} ;
      T016L7_n407EmprNom = new boolean[] {false} ;
      T016L7_A606MaqDsc = new String[] {""} ;
      T016L7_n606MaqDsc = new boolean[] {false} ;
      T016L7_A396EmprCod = new String[] {""} ;
      T016L8_A396EmprCod = new String[] {""} ;
      T016L8_A602MaqCod = new String[] {""} ;
      T016L8_n602MaqCod = new boolean[] {false} ;
      T016L5_A602MaqCod = new String[] {""} ;
      T016L5_n602MaqCod = new boolean[] {false} ;
      T016L5_A606MaqDsc = new String[] {""} ;
      T016L5_n606MaqDsc = new boolean[] {false} ;
      T016L5_A396EmprCod = new String[] {""} ;
      T016L9_A396EmprCod = new String[] {""} ;
      T016L9_A602MaqCod = new String[] {""} ;
      T016L9_n602MaqCod = new boolean[] {false} ;
      T016L10_A396EmprCod = new String[] {""} ;
      T016L10_A602MaqCod = new String[] {""} ;
      T016L10_n602MaqCod = new boolean[] {false} ;
      T016L4_A602MaqCod = new String[] {""} ;
      T016L4_n602MaqCod = new boolean[] {false} ;
      T016L4_A606MaqDsc = new String[] {""} ;
      T016L4_n606MaqDsc = new boolean[] {false} ;
      T016L4_A396EmprCod = new String[] {""} ;
      T016L14_A396EmprCod = new String[] {""} ;
      T016L14_A602MaqCod = new String[] {""} ;
      T016L14_n602MaqCod = new boolean[] {false} ;
      T016L14_A14529MqCAnyo = new short[1] ;
      T016L14_A14530MqCMes = new byte[1] ;
      T016L15_A396EmprCod = new String[] {""} ;
      T016L15_A129BarCod = new int[1] ;
      T016L15_A132BarCodReo = new byte[1] ;
      T016L15_A130BarCodPar = new String[] {""} ;
      T016L15_A14152MEnvOrd = new short[1] ;
      T016L16_A396EmprCod = new String[] {""} ;
      T016L16_A13604RARID = new int[1] ;
      T016L16_A602MaqCod = new String[] {""} ;
      T016L16_n602MaqCod = new boolean[] {false} ;
      T016L17_A396EmprCod = new String[] {""} ;
      T016L17_A602MaqCod = new String[] {""} ;
      T016L17_n602MaqCod = new boolean[] {false} ;
      T016L17_A13193MaqHdr = new int[1] ;
      T016L17_A13194MaqHdrR = new byte[1] ;
      T016L17_A13195MaqHdrP = new String[] {""} ;
      T016L17_A13196MaqRecLinM = new short[1] ;
      T016L18_A396EmprCod = new String[] {""} ;
      T016L18_A13137NCHdr = new int[1] ;
      T016L18_A13138NCHdrr = new byte[1] ;
      T016L18_A13139NCHdrp = new String[] {""} ;
      T016L19_A396EmprCod = new String[] {""} ;
      T016L19_A12673LavMqId = new int[1] ;
      T016L20_A396EmprCod = new String[] {""} ;
      T016L20_A602MaqCod = new String[] {""} ;
      T016L20_n602MaqCod = new boolean[] {false} ;
      T016L20_A12444MaqAnyNP = new short[1] ;
      T016L20_A12445MaqMesNP = new byte[1] ;
      T016L21_A396EmprCod = new String[] {""} ;
      T016L21_A602MaqCod = new String[] {""} ;
      T016L21_n602MaqCod = new boolean[] {false} ;
      T016L21_A12434MaqAnyM = new short[1] ;
      T016L21_A12435MaqMesM = new byte[1] ;
      T016L22_A396EmprCod = new String[] {""} ;
      T016L22_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T016L22_A5728JBCLLin = new short[1] ;
      T016L23_A396EmprCod = new String[] {""} ;
      T016L23_A11604PArtId = new int[1] ;
      T016L24_A396EmprCod = new String[] {""} ;
      T016L24_A602MaqCod = new String[] {""} ;
      T016L24_n602MaqCod = new boolean[] {false} ;
      T016L24_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      T016L25_A396EmprCod = new String[] {""} ;
      T016L25_A602MaqCod = new String[] {""} ;
      T016L25_n602MaqCod = new boolean[] {false} ;
      T016L25_A11438MaqEquCod = new String[] {""} ;
      T016L25_A11439MaqSEqCod = new String[] {""} ;
      T016L25_A11440MaqPieCod = new String[] {""} ;
      T016L26_A396EmprCod = new String[] {""} ;
      T016L26_A602MaqCod = new String[] {""} ;
      T016L26_n602MaqCod = new boolean[] {false} ;
      T016L26_A11432MaqDocId = new short[1] ;
      T016L27_A396EmprCod = new String[] {""} ;
      T016L27_A602MaqCod = new String[] {""} ;
      T016L27_n602MaqCod = new boolean[] {false} ;
      T016L27_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T016L27_A10112Mq_Op = new int[1] ;
      T016L28_A396EmprCod = new String[] {""} ;
      T016L28_A252CliCod = new int[1] ;
      T016L28_A65ArtCod = new String[] {""} ;
      T016L28_A10041ArtSH = new String[] {""} ;
      T016L28_A10042ArtMqFa = new String[] {""} ;
      T016L29_A396EmprCod = new String[] {""} ;
      T016L29_A602MaqCod = new String[] {""} ;
      T016L29_n602MaqCod = new boolean[] {false} ;
      T016L29_A9725MaqFabC = new String[] {""} ;
      T016L30_A396EmprCod = new String[] {""} ;
      T016L30_A9428SMCod = new int[1] ;
      T016L31_A396EmprCod = new String[] {""} ;
      T016L31_A9429PMCod = new int[1] ;
      T016L32_A396EmprCod = new String[] {""} ;
      T016L32_A9425OMCod = new int[1] ;
      T016L33_A396EmprCod = new String[] {""} ;
      T016L33_A602MaqCod = new String[] {""} ;
      T016L33_n602MaqCod = new boolean[] {false} ;
      T016L33_A8008Maq_Prg = new String[] {""} ;
      T016L34_A396EmprCod = new String[] {""} ;
      T016L34_A602MaqCod = new String[] {""} ;
      T016L34_n602MaqCod = new boolean[] {false} ;
      T016L34_A6874CPROCORIG = new String[] {""} ;
      T016L35_A396EmprCod = new String[] {""} ;
      T016L35_A6319C_Barcod = new int[1] ;
      T016L35_A6320C_Barcodre = new byte[1] ;
      T016L35_A6321C_Barcodpa = new String[] {""} ;
      T016L35_A6322C_Reclinma = new short[1] ;
      T016L36_A396EmprCod = new String[] {""} ;
      T016L36_A602MaqCod = new String[] {""} ;
      T016L36_n602MaqCod = new boolean[] {false} ;
      T016L36_A6260MaqTqn = new byte[1] ;
      T016L37_A396EmprCod = new String[] {""} ;
      T016L37_A6188MaqTArt = new short[1] ;
      T016L37_A602MaqCod = new String[] {""} ;
      T016L37_n602MaqCod = new boolean[] {false} ;
      T016L38_A396EmprCod = new String[] {""} ;
      T016L38_A602MaqCod = new String[] {""} ;
      T016L38_n602MaqCod = new boolean[] {false} ;
      T016L38_A6078MaqCliCod = new int[1] ;
      T016L38_A6079MaqArtCod = new String[] {""} ;
      T016L39_A396EmprCod = new String[] {""} ;
      T016L39_A6037Mq_Grupo = new byte[1] ;
      T016L39_A602MaqCod = new String[] {""} ;
      T016L39_n602MaqCod = new boolean[] {false} ;
      T016L40_A396EmprCod = new String[] {""} ;
      T016L40_A6000CRCod = new String[] {""} ;
      T016L40_A6005CRLin = new short[1] ;
      T016L41_A396EmprCod = new String[] {""} ;
      T016L41_A602MaqCod = new String[] {""} ;
      T016L41_n602MaqCod = new boolean[] {false} ;
      T016L41_A5879PlaMTAOrd = new short[1] ;
      T016L42_A396EmprCod = new String[] {""} ;
      T016L42_A5603PrdNumM = new String[] {""} ;
      T016L42_A602MaqCod = new String[] {""} ;
      T016L42_n602MaqCod = new boolean[] {false} ;
      T016L43_A396EmprCod = new String[] {""} ;
      T016L43_A602MaqCod = new String[] {""} ;
      T016L43_n602MaqCod = new boolean[] {false} ;
      T016L43_A5525MaqPrdNum = new String[] {""} ;
      T016L44_A396EmprCod = new String[] {""} ;
      T016L44_A764ProForCod = new String[] {""} ;
      T016L44_A5191ProForLC = new short[1] ;
      T016L45_A396EmprCod = new String[] {""} ;
      T016L45_A4686MaqTipArt = new short[1] ;
      T016L45_A602MaqCod = new String[] {""} ;
      T016L45_n602MaqCod = new boolean[] {false} ;
      T016L46_A396EmprCod = new String[] {""} ;
      T016L46_A3331LanBroCod = new byte[1] ;
      T016L46_A3333LanBroLin = new short[1] ;
      T016L47_A396EmprCod = new String[] {""} ;
      T016L47_A602MaqCod = new String[] {""} ;
      T016L47_n602MaqCod = new boolean[] {false} ;
      T016L47_A3047LOParId = new String[] {""} ;
      T016L48_A396EmprCod = new String[] {""} ;
      T016L48_A129BarCod = new int[1] ;
      T016L48_A132BarCodReo = new byte[1] ;
      T016L48_A130BarCodPar = new String[] {""} ;
      T016L48_A2804RecLinMaq = new short[1] ;
      T016L49_A396EmprCod = new String[] {""} ;
      T016L49_A602MaqCod = new String[] {""} ;
      T016L49_n602MaqCod = new boolean[] {false} ;
      T016L49_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T016L50_A396EmprCod = new String[] {""} ;
      T016L50_A602MaqCod = new String[] {""} ;
      T016L50_n602MaqCod = new boolean[] {false} ;
      T016L50_A2019MaqMadLin = new short[1] ;
      T016L51_A396EmprCod = new String[] {""} ;
      T016L51_A602MaqCod = new String[] {""} ;
      T016L51_n602MaqCod = new boolean[] {false} ;
      T016L51_A2014MaqConLin = new short[1] ;
      T016L52_A396EmprCod = new String[] {""} ;
      T016L52_A1621CosTermCod = new String[] {""} ;
      T016L52_A1615CosLin = new int[1] ;
      T016L53_A396EmprCod = new String[] {""} ;
      T016L53_A602MaqCod = new String[] {""} ;
      T016L53_n602MaqCod = new boolean[] {false} ;
      T016L53_A1142MaqFCod = new String[] {""} ;
      T016L54_A396EmprCod = new String[] {""} ;
      T016L54_A602MaqCod = new String[] {""} ;
      T016L54_n602MaqCod = new boolean[] {false} ;
      T016L54_A634MhiMes = new byte[1] ;
      T016L54_A632MhiAny = new short[1] ;
      T016L55_A396EmprCod = new String[] {""} ;
      T016L55_A602MaqCod = new String[] {""} ;
      T016L55_n602MaqCod = new boolean[] {false} ;
      T016L55_A320DesTecLin = new byte[1] ;
      T016L56_A396EmprCod = new String[] {""} ;
      T016L56_A602MaqCod = new String[] {""} ;
      T016L56_n602MaqCod = new boolean[] {false} ;
      T016L56_A599MaqAny = new short[1] ;
      T016L56_A614MaqMes = new byte[1] ;
      T016L57_A396EmprCod = new String[] {""} ;
      T016L57_A539HisBarCod = new int[1] ;
      T016L57_A545HisCodReo = new byte[1] ;
      T016L57_A544HisCodPar = new String[] {""} ;
      T016L57_A833TipDefCod = new short[1] ;
      T016L58_A396EmprCod = new String[] {""} ;
      T016L58_A602MaqCod = new String[] {""} ;
      T016L58_n602MaqCod = new boolean[] {false} ;
      T016L58_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T016L59_A396EmprCod = new String[] {""} ;
      T016L59_A501GruMaqCod = new String[] {""} ;
      T016L59_A602MaqCod = new String[] {""} ;
      T016L59_n602MaqCod = new boolean[] {false} ;
      T016L60_A396EmprCod = new String[] {""} ;
      T016L60_A457FasCod = new String[] {""} ;
      T016L61_A396EmprCod = new String[] {""} ;
      T016L61_A361DisCod = new int[1] ;
      T016L62_A396EmprCod = new String[] {""} ;
      T016L62_A129BarCod = new int[1] ;
      T016L62_A132BarCodReo = new byte[1] ;
      T016L62_A130BarCodPar = new String[] {""} ;
      T016L62_A758ProCod = new String[] {""} ;
      T016L62_A194BarOrdLin = new short[1] ;
      T016L63_A396EmprCod = new String[] {""} ;
      T016L63_A602MaqCod = new String[] {""} ;
      T016L63_n602MaqCod = new boolean[] {false} ;
      T016L64_A602MaqCod = new String[] {""} ;
      T016L64_n602MaqCod = new boolean[] {false} ;
      T016L64_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T016L64_A75MaqTMuDur = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016L64_n75MaqTMuDur = new boolean[] {false} ;
      T016L64_A396EmprCod = new String[] {""} ;
      T016L65_A396EmprCod = new String[] {""} ;
      T016L65_A602MaqCod = new String[] {""} ;
      T016L65_n602MaqCod = new boolean[] {false} ;
      T016L65_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T016L3_A602MaqCod = new String[] {""} ;
      T016L3_n602MaqCod = new boolean[] {false} ;
      T016L3_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T016L3_A75MaqTMuDur = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016L3_n75MaqTMuDur = new boolean[] {false} ;
      T016L3_A396EmprCod = new String[] {""} ;
      T016L2_A602MaqCod = new String[] {""} ;
      T016L2_n602MaqCod = new boolean[] {false} ;
      T016L2_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T016L2_A75MaqTMuDur = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016L2_n75MaqTMuDur = new boolean[] {false} ;
      T016L2_A396EmprCod = new String[] {""} ;
      T016L69_A396EmprCod = new String[] {""} ;
      T016L69_A602MaqCod = new String[] {""} ;
      T016L69_n602MaqCod = new boolean[] {false} ;
      T016L69_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T016L70_A407EmprNom = new String[] {""} ;
      T016L70_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ606MaqDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqtmu__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqtmu__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqtmu__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqtmu__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqtmu__default(),
         new Object[] {
             new Object[] {
            T016L2_A602MaqCod, T016L2_A74MaqTMuIni, T016L2_A75MaqTMuDur, T016L2_n75MaqTMuDur, T016L2_A396EmprCod
            }
            , new Object[] {
            T016L3_A602MaqCod, T016L3_A74MaqTMuIni, T016L3_A75MaqTMuDur, T016L3_n75MaqTMuDur, T016L3_A396EmprCod
            }
            , new Object[] {
            T016L4_A602MaqCod, T016L4_A606MaqDsc, T016L4_n606MaqDsc, T016L4_A396EmprCod
            }
            , new Object[] {
            T016L5_A602MaqCod, T016L5_A606MaqDsc, T016L5_n606MaqDsc, T016L5_A396EmprCod
            }
            , new Object[] {
            T016L6_A407EmprNom, T016L6_n407EmprNom
            }
            , new Object[] {
            T016L7_A602MaqCod, T016L7_A407EmprNom, T016L7_n407EmprNom, T016L7_A606MaqDsc, T016L7_n606MaqDsc, T016L7_A396EmprCod
            }
            , new Object[] {
            T016L8_A396EmprCod, T016L8_A602MaqCod
            }
            , new Object[] {
            T016L9_A396EmprCod, T016L9_A602MaqCod
            }
            , new Object[] {
            T016L10_A396EmprCod, T016L10_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016L14_A396EmprCod, T016L14_A602MaqCod, T016L14_A14529MqCAnyo, T016L14_A14530MqCMes
            }
            , new Object[] {
            T016L15_A396EmprCod, T016L15_A129BarCod, T016L15_A132BarCodReo, T016L15_A130BarCodPar, T016L15_A14152MEnvOrd
            }
            , new Object[] {
            T016L16_A396EmprCod, T016L16_A13604RARID, T016L16_A602MaqCod
            }
            , new Object[] {
            T016L17_A396EmprCod, T016L17_A602MaqCod, T016L17_A13193MaqHdr, T016L17_A13194MaqHdrR, T016L17_A13195MaqHdrP, T016L17_A13196MaqRecLinM
            }
            , new Object[] {
            T016L18_A396EmprCod, T016L18_A13137NCHdr, T016L18_A13138NCHdrr, T016L18_A13139NCHdrp
            }
            , new Object[] {
            T016L19_A396EmprCod, T016L19_A12673LavMqId
            }
            , new Object[] {
            T016L20_A396EmprCod, T016L20_A602MaqCod, T016L20_A12444MaqAnyNP, T016L20_A12445MaqMesNP
            }
            , new Object[] {
            T016L21_A396EmprCod, T016L21_A602MaqCod, T016L21_A12434MaqAnyM, T016L21_A12435MaqMesM
            }
            , new Object[] {
            T016L22_A396EmprCod, T016L22_A4929Inc_Dia, T016L22_A5728JBCLLin
            }
            , new Object[] {
            T016L23_A396EmprCod, T016L23_A11604PArtId
            }
            , new Object[] {
            T016L24_A396EmprCod, T016L24_A602MaqCod, T016L24_A11445MaqFch
            }
            , new Object[] {
            T016L25_A396EmprCod, T016L25_A602MaqCod, T016L25_A11438MaqEquCod, T016L25_A11439MaqSEqCod, T016L25_A11440MaqPieCod
            }
            , new Object[] {
            T016L26_A396EmprCod, T016L26_A602MaqCod, T016L26_A11432MaqDocId
            }
            , new Object[] {
            T016L27_A396EmprCod, T016L27_A602MaqCod, T016L27_A10111Mq_Dia, T016L27_A10112Mq_Op
            }
            , new Object[] {
            T016L28_A396EmprCod, T016L28_A252CliCod, T016L28_A65ArtCod, T016L28_A10041ArtSH, T016L28_A10042ArtMqFa
            }
            , new Object[] {
            T016L29_A396EmprCod, T016L29_A602MaqCod, T016L29_A9725MaqFabC
            }
            , new Object[] {
            T016L30_A396EmprCod, T016L30_A9428SMCod
            }
            , new Object[] {
            T016L31_A396EmprCod, T016L31_A9429PMCod
            }
            , new Object[] {
            T016L32_A396EmprCod, T016L32_A9425OMCod
            }
            , new Object[] {
            T016L33_A396EmprCod, T016L33_A602MaqCod, T016L33_A8008Maq_Prg
            }
            , new Object[] {
            T016L34_A396EmprCod, T016L34_A602MaqCod, T016L34_A6874CPROCORIG
            }
            , new Object[] {
            T016L35_A396EmprCod, T016L35_A6319C_Barcod, T016L35_A6320C_Barcodre, T016L35_A6321C_Barcodpa, T016L35_A6322C_Reclinma
            }
            , new Object[] {
            T016L36_A396EmprCod, T016L36_A602MaqCod, T016L36_A6260MaqTqn
            }
            , new Object[] {
            T016L37_A396EmprCod, T016L37_A6188MaqTArt, T016L37_A602MaqCod
            }
            , new Object[] {
            T016L38_A396EmprCod, T016L38_A602MaqCod, T016L38_A6078MaqCliCod, T016L38_A6079MaqArtCod
            }
            , new Object[] {
            T016L39_A396EmprCod, T016L39_A6037Mq_Grupo, T016L39_A602MaqCod
            }
            , new Object[] {
            T016L40_A396EmprCod, T016L40_A6000CRCod, T016L40_A6005CRLin
            }
            , new Object[] {
            T016L41_A396EmprCod, T016L41_A602MaqCod, T016L41_A5879PlaMTAOrd
            }
            , new Object[] {
            T016L42_A396EmprCod, T016L42_A5603PrdNumM, T016L42_A602MaqCod
            }
            , new Object[] {
            T016L43_A396EmprCod, T016L43_A602MaqCod, T016L43_A5525MaqPrdNum
            }
            , new Object[] {
            T016L44_A396EmprCod, T016L44_A764ProForCod, T016L44_A5191ProForLC
            }
            , new Object[] {
            T016L45_A396EmprCod, T016L45_A4686MaqTipArt, T016L45_A602MaqCod
            }
            , new Object[] {
            T016L46_A396EmprCod, T016L46_A3331LanBroCod, T016L46_A3333LanBroLin
            }
            , new Object[] {
            T016L47_A396EmprCod, T016L47_A602MaqCod, T016L47_A3047LOParId
            }
            , new Object[] {
            T016L48_A396EmprCod, T016L48_A129BarCod, T016L48_A132BarCodReo, T016L48_A130BarCodPar, T016L48_A2804RecLinMaq
            }
            , new Object[] {
            T016L49_A396EmprCod, T016L49_A602MaqCod, T016L49_A2461PlaFecTin
            }
            , new Object[] {
            T016L50_A396EmprCod, T016L50_A602MaqCod, T016L50_A2019MaqMadLin
            }
            , new Object[] {
            T016L51_A396EmprCod, T016L51_A602MaqCod, T016L51_A2014MaqConLin
            }
            , new Object[] {
            T016L52_A396EmprCod, T016L52_A1621CosTermCod, T016L52_A1615CosLin
            }
            , new Object[] {
            T016L53_A396EmprCod, T016L53_A602MaqCod, T016L53_A1142MaqFCod
            }
            , new Object[] {
            T016L54_A396EmprCod, T016L54_A602MaqCod, T016L54_A634MhiMes, T016L54_A632MhiAny
            }
            , new Object[] {
            T016L55_A396EmprCod, T016L55_A602MaqCod, T016L55_A320DesTecLin
            }
            , new Object[] {
            T016L56_A396EmprCod, T016L56_A602MaqCod, T016L56_A599MaqAny, T016L56_A614MaqMes
            }
            , new Object[] {
            T016L57_A396EmprCod, T016L57_A539HisBarCod, T016L57_A545HisCodReo, T016L57_A544HisCodPar, T016L57_A833TipDefCod
            }
            , new Object[] {
            T016L58_A396EmprCod, T016L58_A602MaqCod, T016L58_A558HisProFec
            }
            , new Object[] {
            T016L59_A396EmprCod, T016L59_A501GruMaqCod, T016L59_A602MaqCod
            }
            , new Object[] {
            T016L60_A396EmprCod, T016L60_A457FasCod
            }
            , new Object[] {
            T016L61_A396EmprCod, T016L61_A361DisCod
            }
            , new Object[] {
            T016L62_A396EmprCod, T016L62_A129BarCod, T016L62_A132BarCodReo, T016L62_A130BarCodPar, T016L62_A758ProCod, T016L62_A194BarOrdLin
            }
            , new Object[] {
            T016L63_A396EmprCod, T016L63_A602MaqCod
            }
            , new Object[] {
            T016L64_A602MaqCod, T016L64_A74MaqTMuIni, T016L64_A75MaqTMuDur, T016L64_n75MaqTMuDur, T016L64_A396EmprCod
            }
            , new Object[] {
            T016L65_A396EmprCod, T016L65_A602MaqCod, T016L65_A74MaqTMuIni
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016L69_A396EmprCod, T016L69_A602MaqCod, T016L69_A74MaqTMuIni
            }
            , new Object[] {
            T016L70_A407EmprNom, T016L70_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TMAQTMU" ;
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
   private short nRcdDeleted_1344 ;
   private short nRcdExists_1344 ;
   private short nIsMod_1344 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1344 ;
   private short RcdFound1344 ;
   private short nBlankRcdUsr1344 ;
   private short RcdFound65 ;
   private short nIsDirty_65 ;
   private short nIsDirty_1344 ;
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
   private int edtMaqCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtavnRcdDeleted_1344_Enabled ;
   private int edtMaqTMuIni_Enabled ;
   private int edtMaqTMuDur_Enabled ;
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
   private int defedtMaqTMuIni_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z75MaqTMuDur ;
   private java.math.BigDecimal A75MaqTMuDur ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z606MaqDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMaqCod_Internalname ;
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
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String sMode1344 ;
   private String edtavnRcdDeleted_1344_Internalname ;
   private String edtMaqTMuIni_Internalname ;
   private String edtMaqTMuDur_Internalname ;
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
   private String sMode65 ;
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
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1344_Jsonclick ;
   private String edtMaqTMuIni_Jsonclick ;
   private String edtMaqTMuDur_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ407EmprNom ;
   private String ZZ606MaqDsc ;
   private java.util.Date Z74MaqTMuIni ;
   private java.util.Date A74MaqTMuIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private boolean n75MaqTMuDur ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T016L6_A407EmprNom ;
   private boolean[] T016L6_n407EmprNom ;
   private String[] T016L7_A602MaqCod ;
   private boolean[] T016L7_n602MaqCod ;
   private String[] T016L7_A407EmprNom ;
   private boolean[] T016L7_n407EmprNom ;
   private String[] T016L7_A606MaqDsc ;
   private boolean[] T016L7_n606MaqDsc ;
   private String[] T016L7_A396EmprCod ;
   private String[] T016L8_A396EmprCod ;
   private String[] T016L8_A602MaqCod ;
   private boolean[] T016L8_n602MaqCod ;
   private String[] T016L5_A602MaqCod ;
   private boolean[] T016L5_n602MaqCod ;
   private String[] T016L5_A606MaqDsc ;
   private boolean[] T016L5_n606MaqDsc ;
   private String[] T016L5_A396EmprCod ;
   private String[] T016L9_A396EmprCod ;
   private String[] T016L9_A602MaqCod ;
   private boolean[] T016L9_n602MaqCod ;
   private String[] T016L10_A396EmprCod ;
   private String[] T016L10_A602MaqCod ;
   private boolean[] T016L10_n602MaqCod ;
   private String[] T016L4_A602MaqCod ;
   private boolean[] T016L4_n602MaqCod ;
   private String[] T016L4_A606MaqDsc ;
   private boolean[] T016L4_n606MaqDsc ;
   private String[] T016L4_A396EmprCod ;
   private String[] T016L14_A396EmprCod ;
   private String[] T016L14_A602MaqCod ;
   private boolean[] T016L14_n602MaqCod ;
   private short[] T016L14_A14529MqCAnyo ;
   private byte[] T016L14_A14530MqCMes ;
   private String[] T016L15_A396EmprCod ;
   private int[] T016L15_A129BarCod ;
   private byte[] T016L15_A132BarCodReo ;
   private String[] T016L15_A130BarCodPar ;
   private short[] T016L15_A14152MEnvOrd ;
   private String[] T016L16_A396EmprCod ;
   private int[] T016L16_A13604RARID ;
   private String[] T016L16_A602MaqCod ;
   private boolean[] T016L16_n602MaqCod ;
   private String[] T016L17_A396EmprCod ;
   private String[] T016L17_A602MaqCod ;
   private boolean[] T016L17_n602MaqCod ;
   private int[] T016L17_A13193MaqHdr ;
   private byte[] T016L17_A13194MaqHdrR ;
   private String[] T016L17_A13195MaqHdrP ;
   private short[] T016L17_A13196MaqRecLinM ;
   private String[] T016L18_A396EmprCod ;
   private int[] T016L18_A13137NCHdr ;
   private byte[] T016L18_A13138NCHdrr ;
   private String[] T016L18_A13139NCHdrp ;
   private String[] T016L19_A396EmprCod ;
   private int[] T016L19_A12673LavMqId ;
   private String[] T016L20_A396EmprCod ;
   private String[] T016L20_A602MaqCod ;
   private boolean[] T016L20_n602MaqCod ;
   private short[] T016L20_A12444MaqAnyNP ;
   private byte[] T016L20_A12445MaqMesNP ;
   private String[] T016L21_A396EmprCod ;
   private String[] T016L21_A602MaqCod ;
   private boolean[] T016L21_n602MaqCod ;
   private short[] T016L21_A12434MaqAnyM ;
   private byte[] T016L21_A12435MaqMesM ;
   private String[] T016L22_A396EmprCod ;
   private java.util.Date[] T016L22_A4929Inc_Dia ;
   private short[] T016L22_A5728JBCLLin ;
   private String[] T016L23_A396EmprCod ;
   private int[] T016L23_A11604PArtId ;
   private String[] T016L24_A396EmprCod ;
   private String[] T016L24_A602MaqCod ;
   private boolean[] T016L24_n602MaqCod ;
   private java.util.Date[] T016L24_A11445MaqFch ;
   private String[] T016L25_A396EmprCod ;
   private String[] T016L25_A602MaqCod ;
   private boolean[] T016L25_n602MaqCod ;
   private String[] T016L25_A11438MaqEquCod ;
   private String[] T016L25_A11439MaqSEqCod ;
   private String[] T016L25_A11440MaqPieCod ;
   private String[] T016L26_A396EmprCod ;
   private String[] T016L26_A602MaqCod ;
   private boolean[] T016L26_n602MaqCod ;
   private short[] T016L26_A11432MaqDocId ;
   private String[] T016L27_A396EmprCod ;
   private String[] T016L27_A602MaqCod ;
   private boolean[] T016L27_n602MaqCod ;
   private java.util.Date[] T016L27_A10111Mq_Dia ;
   private int[] T016L27_A10112Mq_Op ;
   private String[] T016L28_A396EmprCod ;
   private int[] T016L28_A252CliCod ;
   private String[] T016L28_A65ArtCod ;
   private String[] T016L28_A10041ArtSH ;
   private String[] T016L28_A10042ArtMqFa ;
   private String[] T016L29_A396EmprCod ;
   private String[] T016L29_A602MaqCod ;
   private boolean[] T016L29_n602MaqCod ;
   private String[] T016L29_A9725MaqFabC ;
   private String[] T016L30_A396EmprCod ;
   private int[] T016L30_A9428SMCod ;
   private String[] T016L31_A396EmprCod ;
   private int[] T016L31_A9429PMCod ;
   private String[] T016L32_A396EmprCod ;
   private int[] T016L32_A9425OMCod ;
   private String[] T016L33_A396EmprCod ;
   private String[] T016L33_A602MaqCod ;
   private boolean[] T016L33_n602MaqCod ;
   private String[] T016L33_A8008Maq_Prg ;
   private String[] T016L34_A396EmprCod ;
   private String[] T016L34_A602MaqCod ;
   private boolean[] T016L34_n602MaqCod ;
   private String[] T016L34_A6874CPROCORIG ;
   private String[] T016L35_A396EmprCod ;
   private int[] T016L35_A6319C_Barcod ;
   private byte[] T016L35_A6320C_Barcodre ;
   private String[] T016L35_A6321C_Barcodpa ;
   private short[] T016L35_A6322C_Reclinma ;
   private String[] T016L36_A396EmprCod ;
   private String[] T016L36_A602MaqCod ;
   private boolean[] T016L36_n602MaqCod ;
   private byte[] T016L36_A6260MaqTqn ;
   private String[] T016L37_A396EmprCod ;
   private short[] T016L37_A6188MaqTArt ;
   private String[] T016L37_A602MaqCod ;
   private boolean[] T016L37_n602MaqCod ;
   private String[] T016L38_A396EmprCod ;
   private String[] T016L38_A602MaqCod ;
   private boolean[] T016L38_n602MaqCod ;
   private int[] T016L38_A6078MaqCliCod ;
   private String[] T016L38_A6079MaqArtCod ;
   private String[] T016L39_A396EmprCod ;
   private byte[] T016L39_A6037Mq_Grupo ;
   private String[] T016L39_A602MaqCod ;
   private boolean[] T016L39_n602MaqCod ;
   private String[] T016L40_A396EmprCod ;
   private String[] T016L40_A6000CRCod ;
   private short[] T016L40_A6005CRLin ;
   private String[] T016L41_A396EmprCod ;
   private String[] T016L41_A602MaqCod ;
   private boolean[] T016L41_n602MaqCod ;
   private short[] T016L41_A5879PlaMTAOrd ;
   private String[] T016L42_A396EmprCod ;
   private String[] T016L42_A5603PrdNumM ;
   private String[] T016L42_A602MaqCod ;
   private boolean[] T016L42_n602MaqCod ;
   private String[] T016L43_A396EmprCod ;
   private String[] T016L43_A602MaqCod ;
   private boolean[] T016L43_n602MaqCod ;
   private String[] T016L43_A5525MaqPrdNum ;
   private String[] T016L44_A396EmprCod ;
   private String[] T016L44_A764ProForCod ;
   private short[] T016L44_A5191ProForLC ;
   private String[] T016L45_A396EmprCod ;
   private short[] T016L45_A4686MaqTipArt ;
   private String[] T016L45_A602MaqCod ;
   private boolean[] T016L45_n602MaqCod ;
   private String[] T016L46_A396EmprCod ;
   private byte[] T016L46_A3331LanBroCod ;
   private short[] T016L46_A3333LanBroLin ;
   private String[] T016L47_A396EmprCod ;
   private String[] T016L47_A602MaqCod ;
   private boolean[] T016L47_n602MaqCod ;
   private String[] T016L47_A3047LOParId ;
   private String[] T016L48_A396EmprCod ;
   private int[] T016L48_A129BarCod ;
   private byte[] T016L48_A132BarCodReo ;
   private String[] T016L48_A130BarCodPar ;
   private short[] T016L48_A2804RecLinMaq ;
   private String[] T016L49_A396EmprCod ;
   private String[] T016L49_A602MaqCod ;
   private boolean[] T016L49_n602MaqCod ;
   private java.util.Date[] T016L49_A2461PlaFecTin ;
   private String[] T016L50_A396EmprCod ;
   private String[] T016L50_A602MaqCod ;
   private boolean[] T016L50_n602MaqCod ;
   private short[] T016L50_A2019MaqMadLin ;
   private String[] T016L51_A396EmprCod ;
   private String[] T016L51_A602MaqCod ;
   private boolean[] T016L51_n602MaqCod ;
   private short[] T016L51_A2014MaqConLin ;
   private String[] T016L52_A396EmprCod ;
   private String[] T016L52_A1621CosTermCod ;
   private int[] T016L52_A1615CosLin ;
   private String[] T016L53_A396EmprCod ;
   private String[] T016L53_A602MaqCod ;
   private boolean[] T016L53_n602MaqCod ;
   private String[] T016L53_A1142MaqFCod ;
   private String[] T016L54_A396EmprCod ;
   private String[] T016L54_A602MaqCod ;
   private boolean[] T016L54_n602MaqCod ;
   private byte[] T016L54_A634MhiMes ;
   private short[] T016L54_A632MhiAny ;
   private String[] T016L55_A396EmprCod ;
   private String[] T016L55_A602MaqCod ;
   private boolean[] T016L55_n602MaqCod ;
   private byte[] T016L55_A320DesTecLin ;
   private String[] T016L56_A396EmprCod ;
   private String[] T016L56_A602MaqCod ;
   private boolean[] T016L56_n602MaqCod ;
   private short[] T016L56_A599MaqAny ;
   private byte[] T016L56_A614MaqMes ;
   private String[] T016L57_A396EmprCod ;
   private int[] T016L57_A539HisBarCod ;
   private byte[] T016L57_A545HisCodReo ;
   private String[] T016L57_A544HisCodPar ;
   private short[] T016L57_A833TipDefCod ;
   private String[] T016L58_A396EmprCod ;
   private String[] T016L58_A602MaqCod ;
   private boolean[] T016L58_n602MaqCod ;
   private java.util.Date[] T016L58_A558HisProFec ;
   private String[] T016L59_A396EmprCod ;
   private String[] T016L59_A501GruMaqCod ;
   private String[] T016L59_A602MaqCod ;
   private boolean[] T016L59_n602MaqCod ;
   private String[] T016L60_A396EmprCod ;
   private String[] T016L60_A457FasCod ;
   private String[] T016L61_A396EmprCod ;
   private int[] T016L61_A361DisCod ;
   private String[] T016L62_A396EmprCod ;
   private int[] T016L62_A129BarCod ;
   private byte[] T016L62_A132BarCodReo ;
   private String[] T016L62_A130BarCodPar ;
   private String[] T016L62_A758ProCod ;
   private short[] T016L62_A194BarOrdLin ;
   private String[] T016L63_A396EmprCod ;
   private String[] T016L63_A602MaqCod ;
   private boolean[] T016L63_n602MaqCod ;
   private String[] T016L64_A602MaqCod ;
   private boolean[] T016L64_n602MaqCod ;
   private java.util.Date[] T016L64_A74MaqTMuIni ;
   private java.math.BigDecimal[] T016L64_A75MaqTMuDur ;
   private boolean[] T016L64_n75MaqTMuDur ;
   private String[] T016L64_A396EmprCod ;
   private String[] T016L65_A396EmprCod ;
   private String[] T016L65_A602MaqCod ;
   private boolean[] T016L65_n602MaqCod ;
   private java.util.Date[] T016L65_A74MaqTMuIni ;
   private String[] T016L3_A602MaqCod ;
   private boolean[] T016L3_n602MaqCod ;
   private java.util.Date[] T016L3_A74MaqTMuIni ;
   private java.math.BigDecimal[] T016L3_A75MaqTMuDur ;
   private boolean[] T016L3_n75MaqTMuDur ;
   private String[] T016L3_A396EmprCod ;
   private String[] T016L2_A602MaqCod ;
   private boolean[] T016L2_n602MaqCod ;
   private java.util.Date[] T016L2_A74MaqTMuIni ;
   private java.math.BigDecimal[] T016L2_A75MaqTMuDur ;
   private boolean[] T016L2_n75MaqTMuDur ;
   private String[] T016L2_A396EmprCod ;
   private String[] T016L69_A396EmprCod ;
   private String[] T016L69_A602MaqCod ;
   private boolean[] T016L69_n602MaqCod ;
   private java.util.Date[] T016L69_A74MaqTMuIni ;
   private String[] T016L70_A407EmprNom ;
   private boolean[] T016L70_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmaqtmu__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtmu__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtmu__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtmu__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqtmu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016L2", "SELECT MaqCod, MaqTMuIni, MaqTMuDur, EmprCod FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ? AND MaqTMuIni = ?  FOR UPDATE OF MaqTMuDur NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L3", "SELECT MaqCod, MaqTMuIni, MaqTMuDur, EmprCod FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ? AND MaqTMuIni = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L4", "SELECT MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ?  FOR UPDATE OF MaqDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L5", "SELECT MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L7", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqCod, T2.EmprNom, TM1.MaqDsc, TM1.EmprCod FROM (TXPMAQUIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( MaqCod > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( MaqCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016L11", "INSERT INTO TXPMAQUIN(MaqCod, MaqDsc, EmprCod, MaqCodFor, MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax, MaqChp, MaqTinTip, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFasUni, MaqConUlt, MaqMadUlt, MaqMicro, MaqVolRes, MaqVolTop, MaqCapac, MaqPri, MaqNhd, MaqNroTub, MaqRelBan, MaqTipMaq, TipMaqCod, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqCCoCod, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqPasw, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqUltDoc, MaqDTTipo, MaqDTMar, MaqDTMod, MaqDTRef, MaqDTSer, MaqDTFab, MaqDTOri, MaqDTAdqFc, MaqDTAdqFo, MaqDTPrv, MaqDTPrvDi, MaqDTAdqCo, MaqDTRepCo, MaqDTCar, MaqDTVolt, MaqDTReq, MaqDTMnt, MaqDTCal, MaqDTServ, MaqDTInv, MaqDTGarIn, MaqDTGarFi, MaqVolBal, MaqCosGen, MaqOgtId, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqDscLarg, MaqCuerdas, MaqGI, MaqAdCent, MaqAmort) VALUES(?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T016L12", "UPDATE TXPMAQUIN SET MaqDsc=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T016L13", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T016L14", "SELECT * FROM (SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND MEnvMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L16", "SELECT * FROM (SELECT EmprCod, RARID, MaqCod FROM TXPDSPRA3 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L17", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L18", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L19", "SELECT * FROM (SELECT EmprCod, LavMqId FROM TXPLAVMQ0 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L20", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L21", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L22", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L23", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L24", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L25", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L26", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L27", "SELECT * FROM (SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L28", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND ArtMqFa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L29", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFabC FROM TXPMAQFAB WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L30", "SELECT * FROM (SELECT EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L31", "SELECT * FROM (SELECT EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L32", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L33", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L34", "SELECT * FROM (SELECT EmprCod, MaqCod, CPROCORIG FROM TXPCONVPR WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L35", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L36", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L37", "SELECT * FROM (SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L38", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L39", "SELECT * FROM (SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L40", "SELECT * FROM (SELECT EmprCod, CRCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L41", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L42", "SELECT * FROM (SELECT EmprCod, PrdNumM, MaqCod FROM TXPPRDMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L43", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqPrdNum FROM TXPMAQPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L44", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L45", "SELECT * FROM (SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L46", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L47", "SELECT * FROM (SELECT EmprCod, MaqCod, LOParId FROM TXPLOMaqP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L48", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L49", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L50", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L51", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L52", "SELECT * FROM (SELECT EmprCod, CosTermCod, CosLin FROM TXPCOSTES WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L53", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L54", "SELECT * FROM (SELECT EmprCod, MaqCod, MhiMes, MhiAny FROM TXPCMHPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L55", "SELECT * FROM (SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L56", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L57", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L58", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L59", "SELECT * FROM (SELECT EmprCod, GruMaqCod, MaqCod FROM TXPGRULIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L60", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L61", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND MaqCodDis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND MaqCodBis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016L63", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L64", "SELECT MaqCod, MaqTMuIni, MaqTMuDur, EmprCod FROM TXPMAQTMU WHERE EmprCod = ? and MaqCod = ? and MaqTMuIni = ? ORDER BY EmprCod, MaqCod, MaqTMuIni ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L65", "SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ? AND MaqTMuIni = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016L66", "INSERT INTO TXPMAQTMU(MaqCod, MaqTMuIni, MaqTMuDur, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMAQTMU")
         ,new UpdateCursor("T016L67", "UPDATE TXPMAQTMU SET MaqTMuDur=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqTMuIni = ?", GX_NOMASK, "TXPMAQTMU")
         ,new UpdateCursor("T016L68", "DELETE FROM TXPMAQTMU  WHERE EmprCod = ? AND MaqCod = ? AND MaqTMuIni = ?", GX_NOMASK, "TXPMAQTMU")
         ,new ForEachCursor("T016L69", "SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, MaqTMuIni ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016L70", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 68 :
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
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
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
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
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
            case 8 :
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
            case 9 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 11 :
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
            case 12 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               return;
            case 17 :
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
            case 18 :
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
               return;
            case 20 :
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
            case 21 :
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
               return;
            case 23 :
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
            case 24 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
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
            case 28 :
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
            case 29 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               return;
            case 64 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setDateTime(2, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               stmt.setDateTime(4, (java.util.Date)parms[5], false);
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               return;
            case 67 :
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
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

